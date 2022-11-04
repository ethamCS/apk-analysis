package org.odk.collect.android.listeners;

import java.util.HashMap;
import org.odk.collect.android.logic.FormDetails;
/* loaded from: classes.dex */
public interface FormListDownloaderListener {
    void formListDownloadingComplete(HashMap<String, FormDetails> hashMap);
}
