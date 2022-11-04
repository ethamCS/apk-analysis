package org.odk.collect.android.tasks;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.javarosa.xform.parse.XFormParser;
import org.javarosa.xform.util.XFormAnswerDataSerializer;
import org.kxml2.kdom.Element;
import org.odk.collect.android.R;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.listeners.FormDownloaderListener;
import org.odk.collect.android.logic.FormDetails;
import org.odk.collect.android.provider.FormsProviderAPI;
import org.odk.collect.android.utilities.DocumentFetchResult;
import org.odk.collect.android.utilities.FileUtils;
import org.odk.collect.android.utilities.WebUtils;
import org.opendatakit.httpclientandroidlib.HttpResponse;
import org.opendatakit.httpclientandroidlib.client.HttpClient;
import org.opendatakit.httpclientandroidlib.client.methods.HttpGet;
import org.opendatakit.httpclientandroidlib.protocol.HttpContext;
/* loaded from: classes.dex */
public class DownloadFormsTask extends AsyncTask<ArrayList<FormDetails>, String, HashMap<FormDetails, String>> {
    private static final String MD5_COLON_PREFIX = "md5:";
    private static final String NAMESPACE_OPENROSA_ORG_XFORMS_XFORMS_MANIFEST = "http://openrosa.org/xforms/xformsManifest";
    private static final String t = "DownloadFormsTask";
    private FormDownloaderListener mStateListener;

    private boolean isXformsManifestNamespacedElement(Element e) {
        return e.getNamespace().equalsIgnoreCase(NAMESPACE_OPENROSA_ORG_XFORMS_XFORMS_MANIFEST);
    }

    public HashMap<FormDetails, String> doInBackground(ArrayList<FormDetails>... values) {
        Uri uri;
        String error;
        ArrayList<FormDetails> toDownload = values[0];
        int total = toDownload.size();
        int count = 1;
        Collect.getInstance().getActivityLogger().logAction(this, "downloadForms", String.valueOf(total));
        HashMap<FormDetails, String> result = new HashMap<>();
        for (int i = 0; i < total; i++) {
            FormDetails fd = toDownload.get(i);
            publishProgress(fd.formName, Integer.valueOf(count).toString(), Integer.valueOf(total).toString());
            String message = "";
            try {
                File dl = downloadXform(fd.formName, fd.downloadUrl);
                String[] projection = {"_id", FormsProviderAPI.FormsColumns.FORM_FILE_PATH};
                String[] selectionArgs = {dl.getAbsolutePath()};
                Cursor alreadyExists = Collect.getInstance().getContentResolver().query(FormsProviderAPI.FormsColumns.CONTENT_URI, projection, "formFilePath=?", selectionArgs, null);
                if (alreadyExists.getCount() <= 0) {
                    ContentValues v = new ContentValues();
                    v.put(FormsProviderAPI.FormsColumns.FORM_FILE_PATH, dl.getAbsolutePath());
                    HashMap<String, String> formInfo = FileUtils.parseXML(dl);
                    v.put("displayName", formInfo.get(FileUtils.TITLE));
                    v.put("jrVersion", formInfo.get("version"));
                    v.put("jrFormId", formInfo.get(FileUtils.FORMID));
                    v.put("submissionUri", formInfo.get(FileUtils.SUBMISSIONURI));
                    v.put("base64RsaPublicKey", formInfo.get("base64RsaPublicKey"));
                    uri = Collect.getInstance().getContentResolver().insert(FormsProviderAPI.FormsColumns.CONTENT_URI, v);
                    Collect.getInstance().getActivityLogger().logAction(this, "insert", dl.getAbsolutePath());
                } else {
                    alreadyExists.moveToFirst();
                    uri = Uri.withAppendedPath(FormsProviderAPI.FormsColumns.CONTENT_URI, alreadyExists.getString(alreadyExists.getColumnIndex("_id")));
                    Collect.getInstance().getActivityLogger().logAction(this, "refresh", dl.getAbsolutePath());
                }
                if (alreadyExists != null) {
                    alreadyExists.close();
                }
                if (fd.manifestUrl != null) {
                    String formMediaPath = null;
                    Cursor c = Collect.getInstance().getContentResolver().query(uri, null, null, null, null);
                    if (c.getCount() > 0) {
                        c.moveToFirst();
                        formMediaPath = c.getString(c.getColumnIndex(FormsProviderAPI.FormsColumns.FORM_MEDIA_PATH));
                    }
                    if (c != null) {
                        c.close();
                    }
                    if (formMediaPath != null && (error = downloadManifestAndMediaFiles(formMediaPath, fd, count, total)) != null) {
                        message = message + error;
                    }
                } else {
                    Log.i(t, "No Manifest for: " + fd.formName);
                }
            } catch (SocketTimeoutException se) {
                se.printStackTrace();
                message = message + se.getMessage();
            } catch (Exception e) {
                e.printStackTrace();
                message = e.getCause() != null ? message + e.getCause().getMessage() : message + e.getMessage();
            }
            count++;
            if (message.equalsIgnoreCase("")) {
                message = Collect.getInstance().getString(R.string.success);
            }
            result.put(fd, message);
        }
        return result;
    }

    private File downloadXform(String formName, String url) throws Exception {
        String rootName = formName.replaceAll("[^\\p{L}\\p{Digit}]", XFormAnswerDataSerializer.DELIMITER).replaceAll("\\p{javaWhitespace}+", XFormAnswerDataSerializer.DELIMITER).trim();
        String path = Collect.FORMS_PATH + File.separator + rootName + ".xml";
        int i = 2;
        File f = new File(path);
        while (f.exists()) {
            String path2 = Collect.FORMS_PATH + File.separator + rootName + "_" + i + ".xml";
            f = new File(path2);
            i++;
        }
        downloadFile(f, url);
        String[] projection = {FormsProviderAPI.FormsColumns.FORM_FILE_PATH};
        String[] selectionArgs = {FileUtils.getMd5Hash(f)};
        Cursor c = null;
        try {
            c = Collect.getInstance().getContentResolver().query(FormsProviderAPI.FormsColumns.CONTENT_URI, projection, "md5Hash=?", selectionArgs, null);
            if (c.getCount() > 0) {
                c.moveToFirst();
                f.delete();
                f = new File(c.getString(c.getColumnIndex(FormsProviderAPI.FormsColumns.FORM_FILE_PATH)));
            }
            return f;
        } finally {
            if (c != null) {
                c.close();
            }
        }
    }

    private void downloadFile(File f, String downloadUrl) throws Exception {
        HttpResponse response;
        int statusCode;
        OutputStream os;
        try {
            URL url = new URL(downloadUrl);
            URI uri = url.toURI();
            boolean success = false;
            int attemptCount = 0;
            while (!success) {
                attemptCount++;
                if (attemptCount <= 2) {
                    HttpContext localContext = Collect.getInstance().getHttpContext();
                    HttpClient httpclient = WebUtils.createHttpClient(WebUtils.CONNECTION_TIMEOUT);
                    HttpGet req = WebUtils.createOpenRosaHttpGet(uri);
                    try {
                        response = httpclient.execute(req, localContext);
                        statusCode = response.getStatusLine().getStatusCode();
                    } catch (Exception e) {
                        Log.e(t, e.toString());
                        e.printStackTrace();
                        if (attemptCount == 2) {
                            throw e;
                        }
                    }
                    if (statusCode != 200) {
                        WebUtils.discardEntityBytes(response);
                        if (statusCode == 401) {
                            Collect.getInstance().getCookieStore().clear();
                        }
                        String errMsg = Collect.getInstance().getString(R.string.file_fetch_failed, new Object[]{downloadUrl, response.getStatusLine().getReasonPhrase(), Integer.valueOf(statusCode)});
                        Log.e(t, errMsg);
                        throw new Exception(errMsg);
                    }
                    InputStream is = null;
                    OutputStream os2 = null;
                    try {
                        is = response.getEntity().getContent();
                        os = new FileOutputStream(f);
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        byte[] buf = new byte[1024];
                        while (true) {
                            int len = is.read(buf);
                            if (len <= 0) {
                                break;
                            }
                            os.write(buf, 0, len);
                        }
                        os.flush();
                        success = true;
                        if (os != null) {
                            try {
                                os.close();
                            } catch (Exception e2) {
                            }
                        }
                        if (is != null) {
                            do {
                            } while (is.skip(1024L) == 1024);
                            try {
                                is.close();
                            } catch (Exception e3) {
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        os2 = os;
                        if (os2 != null) {
                            try {
                                os2.close();
                            } catch (Exception e4) {
                            }
                        }
                        if (is != null) {
                            do {
                            } while (is.skip(1024L) == 1024);
                            try {
                                is.close();
                            } catch (Exception e5) {
                            }
                        }
                        throw th;
                    }
                } else {
                    return;
                }
            }
        } catch (MalformedURLException e6) {
            e6.printStackTrace();
            throw e6;
        } catch (URISyntaxException e7) {
            e7.printStackTrace();
            throw e7;
        }
    }

    /* loaded from: classes.dex */
    public static class MediaFile {
        final String downloadUrl;
        final String filename;
        final String hash;

        MediaFile(String filename, String hash, String downloadUrl) {
            this.filename = filename;
            this.hash = hash;
            this.downloadUrl = downloadUrl;
        }
    }

    private String downloadManifestAndMediaFiles(String mediaPath, FormDetails fd, int count, int total) {
        if (fd.manifestUrl == null) {
            return null;
        }
        publishProgress(Collect.getInstance().getString(R.string.fetching_manifest, new Object[]{fd.formName}), Integer.valueOf(count).toString(), Integer.valueOf(total).toString());
        List<MediaFile> files = new ArrayList<>();
        HttpContext localContext = Collect.getInstance().getHttpContext();
        HttpClient httpclient = WebUtils.createHttpClient(WebUtils.CONNECTION_TIMEOUT);
        DocumentFetchResult result = WebUtils.getXmlDocument(fd.manifestUrl, localContext, httpclient);
        if (result.errorMessage != null) {
            return result.errorMessage;
        }
        String errMessage = Collect.getInstance().getString(R.string.access_error, new Object[]{fd.manifestUrl});
        if (!result.isOpenRosaResponse) {
            String errMessage2 = errMessage + Collect.getInstance().getString(R.string.manifest_server_error);
            Log.e(t, errMessage2);
            return errMessage2;
        }
        Element manifestElement = result.doc.getRootElement();
        if (!manifestElement.getName().equals("manifest")) {
            String errMessage3 = errMessage + Collect.getInstance().getString(R.string.root_element_error, new Object[]{manifestElement.getName()});
            Log.e(t, errMessage3);
            return errMessage3;
        }
        String namespace = manifestElement.getNamespace();
        if (!isXformsManifestNamespacedElement(manifestElement)) {
            String errMessage4 = errMessage + Collect.getInstance().getString(R.string.root_namespace_error, new Object[]{namespace});
            Log.e(t, errMessage4);
            return errMessage4;
        }
        int nElements = manifestElement.getChildCount();
        for (int i = 0; i < nElements; i++) {
            if (manifestElement.getType(i) == 2) {
                Element mediaFileElement = manifestElement.getElement(i);
                if (isXformsManifestNamespacedElement(mediaFileElement)) {
                    String name = mediaFileElement.getName();
                    if (name.equalsIgnoreCase("mediaFile")) {
                        String filename = null;
                        String hash = null;
                        String downloadUrl = null;
                        int childCount = mediaFileElement.getChildCount();
                        for (int j = 0; j < childCount; j++) {
                            if (mediaFileElement.getType(j) == 2) {
                                Element child = mediaFileElement.getElement(j);
                                if (isXformsManifestNamespacedElement(child)) {
                                    String tag = child.getName();
                                    if (tag.equals("filename")) {
                                        filename = XFormParser.getXMLText(child, true);
                                        if (filename != null && filename.length() == 0) {
                                            filename = null;
                                        }
                                    } else if (tag.equals("hash")) {
                                        hash = XFormParser.getXMLText(child, true);
                                        if (hash != null && hash.length() == 0) {
                                            hash = null;
                                        }
                                    } else if (tag.equals("downloadUrl") && (downloadUrl = XFormParser.getXMLText(child, true)) != null && downloadUrl.length() == 0) {
                                        downloadUrl = null;
                                    }
                                }
                            }
                        }
                        if (filename == null || downloadUrl == null || hash == null) {
                            String errMessage5 = errMessage + Collect.getInstance().getString(R.string.manifest_tag_error, new Object[]{Integer.toString(i)});
                            Log.e(t, errMessage5);
                            return errMessage5;
                        }
                        files.add(new MediaFile(filename, hash, downloadUrl));
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        Log.i(t, "Downloading " + files.size() + " media files.");
        int mediaCount = 0;
        if (files.size() > 0) {
            FileUtils.createFolder(mediaPath);
            File mediaDir = new File(mediaPath);
            for (MediaFile toDownload : files) {
                if (isCancelled()) {
                    return "cancelled";
                }
                mediaCount++;
                publishProgress(Collect.getInstance().getString(R.string.form_download_progress, new Object[]{fd.formName, Integer.valueOf(mediaCount), Integer.valueOf(files.size())}), Integer.valueOf(count).toString(), Integer.valueOf(total).toString());
                try {
                    File mediaFile = new File(mediaDir, toDownload.filename);
                    if (!mediaFile.exists()) {
                        downloadFile(mediaFile, toDownload.downloadUrl);
                    } else {
                        String currentFileHash = FileUtils.getMd5Hash(mediaFile);
                        String downloadFileHash = toDownload.hash.substring(MD5_COLON_PREFIX.length());
                        if (!currentFileHash.contentEquals(downloadFileHash)) {
                            mediaFile.delete();
                            downloadFile(mediaFile, toDownload.downloadUrl);
                        } else {
                            Log.i(t, "Skipping media file fetch -- file hashes identical: " + mediaFile.getAbsolutePath());
                        }
                    }
                } catch (Exception e) {
                    return e.getLocalizedMessage();
                }
            }
        }
        return null;
    }

    public void onPostExecute(HashMap<FormDetails, String> value) {
        synchronized (this) {
            if (this.mStateListener != null) {
                this.mStateListener.formsDownloadingComplete(value);
            }
        }
    }

    public void onProgressUpdate(String... values) {
        synchronized (this) {
            if (this.mStateListener != null) {
                this.mStateListener.progressUpdate(values[0], Integer.valueOf(values[1]).intValue(), Integer.valueOf(values[2]).intValue());
            }
        }
    }

    public void setDownloaderListener(FormDownloaderListener sl) {
        synchronized (this) {
            this.mStateListener = sl;
        }
    }
}
