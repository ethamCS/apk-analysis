package org.odk.collect.android.tasks;

import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import org.odk.collect.android.R;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.listeners.InstanceUploaderListener;
import org.odk.collect.android.logic.PropertyManager;
import org.odk.collect.android.preferences.PreferencesActivity;
import org.odk.collect.android.provider.InstanceProviderAPI;
import org.odk.collect.android.utilities.WebUtils;
import org.opendatakit.httpclientandroidlib.client.HttpClient;
import org.opendatakit.httpclientandroidlib.protocol.HttpContext;
/* loaded from: classes.dex */
public class InstanceUploaderTask extends AsyncTask<Long, Integer, HashMap<String, String>> {
    private static final int CONNECTION_TIMEOUT = 60000;
    private static final String fail = "Error: ";
    private static final String t = "InstanceUploaderTask";
    private Uri mAuthRequestingServer;
    HashMap<String, String> mResults;
    private InstanceUploaderListener mStateListener;

    /* JADX WARN: Code restructure failed: missing block: B:112:0x06a1, code lost:
        if (r31 != 200) goto L143;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x06a3, code lost:
        r41.mResults.put(r43, "Error: Network login failure? Again?");
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x06b4, code lost:
        r9.put(org.odk.collect.android.provider.InstanceProviderAPI.InstanceColumns.STATUS, org.odk.collect.android.provider.InstanceProviderAPI.STATUS_SUBMISSION_FAILED);
        org.odk.collect.android.application.Collect.getInstance().getContentResolver().update(r45, r9, null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x06d6, code lost:
        r37 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x0926, code lost:
        if (r31 != 401) goto L148;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0928, code lost:
        org.odk.collect.android.application.Collect.getInstance().getCookieStore().clear();
        r41.mResults.put(r43, org.odk.collect.android.tasks.InstanceUploaderTask.fail + r30.getStatusLine().getReasonPhrase() + " (" + r31 + ") at " + r42);
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x09cb, code lost:
        r41.mResults.put(r43, org.odk.collect.android.tasks.InstanceUploaderTask.fail + r30.getStatusLine().getReasonPhrase() + " (" + r31 + ") at " + r42);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean uploadOneSubmission(java.lang.String r42, java.lang.String r43, java.lang.String r44, android.net.Uri r45, org.opendatakit.httpclientandroidlib.client.HttpClient r46, org.opendatakit.httpclientandroidlib.protocol.HttpContext r47, java.util.Map<android.net.Uri, android.net.Uri> r48) {
        /*
            Method dump skipped, instructions count: 2643
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: org.odk.collect.android.tasks.InstanceUploaderTask.uploadOneSubmission(java.lang.String, java.lang.String, java.lang.String, android.net.Uri, org.opendatakit.httpclientandroidlib.client.HttpClient, org.opendatakit.httpclientandroidlib.protocol.HttpContext, java.util.Map):boolean");
    }

    public HashMap<String, String> doInBackground(Long... values) {
        this.mResults = new HashMap<>();
        this.mAuthRequestingServer = null;
        String selection = "_id=?";
        String[] selectionArgs = new String[values.length];
        for (int i = 0; i < values.length; i++) {
            if (i != values.length - 1) {
                selection = selection + " or _id=?";
            }
            selectionArgs[i] = values[i].toString();
        }
        String deviceId = new PropertyManager(Collect.getInstance().getApplicationContext()).getSingularProperty(PropertyManager.OR_DEVICE_ID_PROPERTY);
        HttpContext localContext = Collect.getInstance().getHttpContext();
        HttpClient httpclient = WebUtils.createHttpClient(60000);
        Map<Uri, Uri> uriRemap = new HashMap<>();
        Cursor c = null;
        try {
            c = Collect.getInstance().getContentResolver().query(InstanceProviderAPI.InstanceColumns.CONTENT_URI, null, selection, selectionArgs, null);
            if (c.getCount() > 0) {
                c.moveToPosition(-1);
                while (c.moveToNext()) {
                    if (isCancelled()) {
                        HashMap<String, String> hashMap = this.mResults;
                    }
                    publishProgress(Integer.valueOf(c.getPosition() + 1), Integer.valueOf(c.getCount()));
                    String instance = c.getString(c.getColumnIndex(InstanceProviderAPI.InstanceColumns.INSTANCE_FILE_PATH));
                    String id = c.getString(c.getColumnIndex("_id"));
                    Uri toUpdate = Uri.withAppendedPath(InstanceProviderAPI.InstanceColumns.CONTENT_URI, id);
                    int subIdx = c.getColumnIndex("submissionUri");
                    String urlString = c.isNull(subIdx) ? null : c.getString(subIdx);
                    if (urlString == null) {
                        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(Collect.getInstance());
                        String urlString2 = settings.getString(PreferencesActivity.KEY_SERVER_URL, Collect.getInstance().getString(R.string.default_server_url));
                        if (urlString2.charAt(urlString2.length() - 1) == '/') {
                            urlString2 = urlString2.substring(0, urlString2.length() - 1);
                        }
                        String submissionUrl = settings.getString(PreferencesActivity.KEY_SUBMISSION_URL, "/submission");
                        if (submissionUrl.charAt(0) != '/') {
                            submissionUrl = "/" + submissionUrl;
                        }
                        urlString = urlString2 + submissionUrl;
                    }
                    try {
                        urlString = urlString + "?deviceID=" + URLEncoder.encode(deviceId, "UTF-8");
                    } catch (UnsupportedEncodingException e) {
                    }
                    if (!uploadOneSubmission(urlString, id, instance, toUpdate, httpclient, localContext, uriRemap)) {
                        if (c == null) {
                            return null;
                        }
                        c.close();
                        return null;
                    }
                }
            }
            if (c != null) {
                c.close();
            }
            return this.mResults;
        } finally {
            if (c != null) {
                c.close();
            }
        }
    }

    public void onPostExecute(HashMap<String, String> value) {
        synchronized (this) {
            if (this.mStateListener != null) {
                if (this.mAuthRequestingServer != null) {
                    this.mStateListener.authRequest(this.mAuthRequestingServer, this.mResults);
                } else {
                    this.mStateListener.uploadingComplete(value);
                }
            }
        }
    }

    public void onProgressUpdate(Integer... values) {
        synchronized (this) {
            if (this.mStateListener != null) {
                this.mStateListener.progressUpdate(values[0].intValue(), values[1].intValue());
            }
        }
    }

    public void setUploaderListener(InstanceUploaderListener sl) {
        synchronized (this) {
            this.mStateListener = sl;
        }
    }
}
