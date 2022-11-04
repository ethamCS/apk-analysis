package org.odk.collect.android.listeners;

import android.net.Uri;
import java.util.HashMap;
/* loaded from: classes.dex */
public interface InstanceUploaderListener {
    void authRequest(Uri uri, HashMap<String, String> hashMap);

    void progressUpdate(int i, int i2);

    void uploadingComplete(HashMap<String, String> hashMap);
}
