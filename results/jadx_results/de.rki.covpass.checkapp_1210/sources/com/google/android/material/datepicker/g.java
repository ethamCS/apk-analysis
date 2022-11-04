package com.google.android.material.datepicker;

import android.annotation.SuppressLint;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;
/* loaded from: classes.dex */
class g extends BaseAdapter {

    /* renamed from: x */
    private static final int f7133x;

    /* renamed from: c */
    private final Calendar f7134c;

    /* renamed from: d */
    private final int f7135d;

    /* renamed from: q */
    private final int f7136q;

    static {
        f7133x = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public g() {
        Calendar k10 = s.k();
        this.f7134c = k10;
        this.f7135d = k10.getMaximum(7);
        this.f7136q = k10.getFirstDayOfWeek();
    }

    private int b(int i10) {
        int i11 = i10 + this.f7136q;
        int i12 = this.f7135d;
        return i11 > i12 ? i11 - i12 : i11;
    }

    /* renamed from: a */
    public Integer getItem(int i10) {
        if (i10 >= this.f7135d) {
            return null;
        }
        return Integer.valueOf(b(i10));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f7135d;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(b5.h.n_res_0x7f0c005a, viewGroup, false);
        }
        this.f7134c.set(7, b(i10));
        textView.setText(this.f7134c.getDisplayName(7, f7133x, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(b5.j.n_res_0x7f100160), this.f7134c.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
