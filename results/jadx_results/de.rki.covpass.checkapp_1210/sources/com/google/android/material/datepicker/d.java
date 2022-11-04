package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Collection;
/* loaded from: classes.dex */
public interface d<S> extends Parcelable {
    String g(Context context);

    int h(Context context);

    Collection<androidx.core.util.d<Long, Long>> j();

    boolean r();

    Collection<Long> s();

    S t();

    void v(long j10);

    View x(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, a aVar, o<S> oVar);
}
