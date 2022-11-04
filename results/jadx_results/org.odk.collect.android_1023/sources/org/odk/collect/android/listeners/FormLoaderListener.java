package org.odk.collect.android.listeners;

import org.odk.collect.android.tasks.FormLoaderTask;
/* loaded from: classes.dex */
public interface FormLoaderListener {
    void loadingComplete(FormLoaderTask formLoaderTask);

    void loadingError(String str);
}
