package org.odk.collect.android.listeners;

import java.util.HashMap;
import org.odk.collect.android.logic.FormDetails;
/* loaded from: classes.dex */
public interface FormDownloaderListener {
    void formsDownloadingComplete(HashMap<FormDetails, String> hashMap);

    void progressUpdate(String str, int i, int i2);
}
