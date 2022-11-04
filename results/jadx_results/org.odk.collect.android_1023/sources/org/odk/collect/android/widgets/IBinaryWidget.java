package org.odk.collect.android.widgets;
/* loaded from: classes.dex */
public interface IBinaryWidget {
    void cancelWaitingForBinaryData();

    boolean isWaitingForBinaryData();

    void setBinaryData(Object obj);
}
