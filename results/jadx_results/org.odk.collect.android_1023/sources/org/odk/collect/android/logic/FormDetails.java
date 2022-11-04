package org.odk.collect.android.logic;

import java.io.Serializable;
/* loaded from: classes.dex */
public class FormDetails implements Serializable {
    private static final long serialVersionUID = 1;
    public final String downloadUrl;
    public final String errorStr;
    public final String formID;
    public final String formName;
    public final String formVersion;
    public final String manifestUrl;

    public FormDetails(String error) {
        this.manifestUrl = null;
        this.downloadUrl = null;
        this.formName = null;
        this.formID = null;
        this.formVersion = null;
        this.errorStr = error;
    }

    public FormDetails(String name, String url, String manifest, String id, String version) {
        this.manifestUrl = manifest;
        this.downloadUrl = url;
        this.formName = name;
        this.formID = id;
        this.formVersion = version;
        this.errorStr = null;
    }
}
