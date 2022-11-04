package org.odk.collect.android.utilities;

import org.kxml2.kdom.Document;
/* loaded from: classes.dex */
public class DocumentFetchResult {
    public final Document doc;
    public final String errorMessage;
    public final boolean isOpenRosaResponse;
    public final int responseCode;

    public DocumentFetchResult(String msg, int response) {
        this.responseCode = response;
        this.errorMessage = msg;
        this.doc = null;
        this.isOpenRosaResponse = false;
    }

    public DocumentFetchResult(Document doc, boolean isOpenRosaResponse) {
        this.responseCode = 0;
        this.errorMessage = null;
        this.doc = doc;
        this.isOpenRosaResponse = isOpenRosaResponse;
    }
}
