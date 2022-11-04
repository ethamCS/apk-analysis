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
    S b();

    String d(Context context);

    int e(Context context);

    Collection<b.g.k.d<Long, Long>> f();

    boolean h();

    void i(long j);

    View j(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, a aVar, o<S> oVar);

    Collection<Long> l();
}
