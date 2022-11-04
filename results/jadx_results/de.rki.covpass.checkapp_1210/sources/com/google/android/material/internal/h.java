package com.google.android.material.internal;

import android.widget.Checkable;
import com.google.android.material.internal.h;
/* loaded from: classes.dex */
public interface h<T extends h<T>> extends Checkable {

    /* loaded from: classes.dex */
    public interface a<C> {
        void a(C c10, boolean z10);
    }

    int getId();

    void setInternalOnCheckedChangeListener(a<T> aVar);
}
