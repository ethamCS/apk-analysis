package org.odk.collect.android.tasks;

import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import android.util.Log;
import java.util.HashMap;
import org.javarosa.xform.parse.XFormParser;
import org.kxml2.kdom.Element;
import org.odk.collect.android.R;
import org.odk.collect.android.application.Collect;
import org.odk.collect.android.listeners.FormListDownloaderListener;
import org.odk.collect.android.logic.FormDetails;
import org.odk.collect.android.preferences.PreferencesActivity;
import org.odk.collect.android.utilities.DocumentFetchResult;
import org.odk.collect.android.utilities.WebUtils;
import org.opendatakit.httpclientandroidlib.client.HttpClient;
import org.opendatakit.httpclientandroidlib.protocol.HttpContext;
/* loaded from: classes.dex */
public class DownloadFormListTask extends AsyncTask<Void, String, HashMap<String, FormDetails>> {
    public static final String DL_AUTH_REQUIRED = "dlauthrequired";
    public static final String DL_ERROR_MSG = "dlerrormessage";
    private static final String NAMESPACE_OPENROSA_ORG_XFORMS_XFORMS_LIST = "http://openrosa.org/xforms/xformsList";
    private static final String t = "DownloadFormsTask";
    private FormListDownloaderListener mStateListener;

    private boolean isXformsListNamespacedElement(Element e) {
        return e.getNamespace().equalsIgnoreCase(NAMESPACE_OPENROSA_ORG_XFORMS_XFORMS_LIST);
    }

    public HashMap<String, FormDetails> doInBackground(Void... values) {
        SharedPreferences settings = PreferenceManager.getDefaultSharedPreferences(Collect.getInstance().getBaseContext());
        String downloadListUrl = settings.getString(PreferencesActivity.KEY_SERVER_URL, Collect.getInstance().getString(R.string.default_server_url));
        String downloadPath = settings.getString(PreferencesActivity.KEY_FORMLIST_URL, "/formlist");
        String downloadListUrl2 = downloadListUrl + downloadPath;
        Collect.getInstance().getActivityLogger().logAction(this, "formList", downloadListUrl2);
        HashMap<String, FormDetails> formList = new HashMap<>();
        HttpContext localContext = Collect.getInstance().getHttpContext();
        HttpClient httpclient = WebUtils.createHttpClient(WebUtils.CONNECTION_TIMEOUT);
        DocumentFetchResult result = WebUtils.getXmlDocument(downloadListUrl2, localContext, httpclient);
        if (result.errorMessage != null) {
            if (result.responseCode == 401) {
                formList.put(DL_AUTH_REQUIRED, new FormDetails(result.errorMessage));
            } else {
                formList.put(DL_ERROR_MSG, new FormDetails(result.errorMessage));
            }
        } else if (result.isOpenRosaResponse) {
            Element xformsElement = result.doc.getRootElement();
            if (!xformsElement.getName().equals("xforms")) {
                String error = "root element is not <xforms> : " + xformsElement.getName();
                Log.e(t, "Parsing OpenRosa reply -- " + error);
                formList.put(DL_ERROR_MSG, new FormDetails(Collect.getInstance().getString(R.string.parse_openrosa_formlist_failed, new Object[]{error})));
            } else {
                String namespace = xformsElement.getNamespace();
                if (!isXformsListNamespacedElement(xformsElement)) {
                    String error2 = "root element namespace is incorrect:" + namespace;
                    Log.e(t, "Parsing OpenRosa reply -- " + error2);
                    formList.put(DL_ERROR_MSG, new FormDetails(Collect.getInstance().getString(R.string.parse_openrosa_formlist_failed, new Object[]{error2})));
                } else {
                    int nElements = xformsElement.getChildCount();
                    for (int i = 0; i < nElements; i++) {
                        if (xformsElement.getType(i) == 2) {
                            Element xformElement = xformsElement.getElement(i);
                            if (isXformsListNamespacedElement(xformElement)) {
                                String name = xformElement.getName();
                                if (name.equalsIgnoreCase("xform")) {
                                    String formId = null;
                                    String formName = null;
                                    String version = null;
                                    String majorMinorVersion = null;
                                    String downloadUrl = null;
                                    String manifestUrl = null;
                                    int fieldCount = xformElement.getChildCount();
                                    for (int j = 0; j < fieldCount; j++) {
                                        if (xformElement.getType(j) == 2) {
                                            Element child = xformElement.getElement(j);
                                            if (isXformsListNamespacedElement(child)) {
                                                String tag = child.getName();
                                                if (tag.equals("formID")) {
                                                    formId = XFormParser.getXMLText(child, true);
                                                    if (formId != null && formId.length() == 0) {
                                                        formId = null;
                                                    }
                                                } else if (tag.equals("name")) {
                                                    formName = XFormParser.getXMLText(child, true);
                                                    if (formName != null && formName.length() == 0) {
                                                        formName = null;
                                                    }
                                                } else if (tag.equals("version")) {
                                                    version = XFormParser.getXMLText(child, true);
                                                    if (version != null && version.length() == 0) {
                                                        version = null;
                                                    }
                                                } else if (tag.equals("majorMinorVersion")) {
                                                    majorMinorVersion = XFormParser.getXMLText(child, true);
                                                    if (majorMinorVersion != null && majorMinorVersion.length() == 0) {
                                                        majorMinorVersion = null;
                                                    }
                                                } else if (tag.equals("descriptionText")) {
                                                    String description = XFormParser.getXMLText(child, true);
                                                    if (description != null && description.length() == 0) {
                                                    }
                                                } else if (tag.equals("downloadUrl")) {
                                                    downloadUrl = XFormParser.getXMLText(child, true);
                                                    if (downloadUrl != null && downloadUrl.length() == 0) {
                                                        downloadUrl = null;
                                                    }
                                                } else if (tag.equals("manifestUrl") && (manifestUrl = XFormParser.getXMLText(child, true)) != null && manifestUrl.length() == 0) {
                                                    manifestUrl = null;
                                                }
                                            }
                                        }
                                    }
                                    if (formId == null || downloadUrl == null || formName == null) {
                                        String error3 = "Forms list entry " + Integer.toString(i) + " is missing one or more tags: formId, name, or downloadUrl";
                                        Log.e(t, "Parsing OpenRosa reply -- " + error3);
                                        formList.clear();
                                        formList.put(DL_ERROR_MSG, new FormDetails(Collect.getInstance().getString(R.string.parse_openrosa_formlist_failed, new Object[]{error3})));
                                        break;
                                    }
                                    formList.put(formId, new FormDetails(formName, downloadUrl, manifestUrl, formId, version != null ? version : majorMinorVersion));
                                } else {
                                    continue;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
            }
        } else {
            Element formsElement = result.doc.getRootElement();
            int formsCount = formsElement.getChildCount();
            String formId2 = null;
            for (int i2 = 0; i2 < formsCount; i2++) {
                if (formsElement.getType(i2) == 2) {
                    Element child2 = formsElement.getElement(i2);
                    String tag2 = child2.getName();
                    if (tag2.equals("formID") && (formId2 = XFormParser.getXMLText(child2, true)) != null && formId2.length() == 0) {
                        formId2 = null;
                    }
                    if (!tag2.equalsIgnoreCase("form")) {
                        continue;
                    } else {
                        String formName2 = XFormParser.getXMLText(child2, true);
                        if (formName2 != null && formName2.length() == 0) {
                            formName2 = null;
                        }
                        String downloadUrl2 = child2.getAttributeValue(null, "url").trim();
                        if (downloadUrl2 != null && downloadUrl2.length() == 0) {
                            downloadUrl2 = null;
                        }
                        if (downloadUrl2 == null || formName2 == null) {
                            String error4 = "Forms list entry " + Integer.toString(i2) + " is missing form name or url attribute";
                            Log.e(t, "Parsing OpenRosa reply -- " + error4);
                            formList.clear();
                            formList.put(DL_ERROR_MSG, new FormDetails(Collect.getInstance().getString(R.string.parse_legacy_formlist_failed, new Object[]{error4})));
                            break;
                        }
                        formList.put(formName2, new FormDetails(formName2, downloadUrl2, null, formId2, null));
                        formId2 = null;
                    }
                }
            }
        }
        return formList;
    }

    public void onPostExecute(HashMap<String, FormDetails> value) {
        synchronized (this) {
            if (this.mStateListener != null) {
                this.mStateListener.formListDownloadingComplete(value);
            }
        }
    }

    public void setDownloaderListener(FormListDownloaderListener sl) {
        synchronized (this) {
            this.mStateListener = sl;
        }
    }
}
