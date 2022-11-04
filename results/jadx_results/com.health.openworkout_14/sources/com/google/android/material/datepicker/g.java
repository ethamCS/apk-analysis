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

    /* renamed from: e */
    private static final int f3055e;

    /* renamed from: b */
    private final Calendar f3056b;

    /* renamed from: c */
    private final int f3057c;

    /* renamed from: d */
    private final int f3058d;

    static {
        f3055e = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public g() {
        Calendar l = s.l();
        this.f3056b = l;
        this.f3057c = l.getMaximum(7);
        this.f3058d = l.getFirstDayOfWeek();
    }

    private int b(int i) {
        int i2 = i + this.f3058d;
        int i3 = this.f3057c;
        return i2 > i3 ? i2 - i3 : i2;
    }

    /* renamed from: a */
    public Integer getItem(int i) {
        if (i >= this.f3057c) {
            return null;
        }
        return Integer.valueOf(b(i));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f3057c;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return 0L;
    }

    @Override // android.widget.Adapter
    @SuppressLint({"WrongConstant"})
    public View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(d.a.a.a.h.j_res_0x7f0c0049, viewGroup, false);
        }
        this.f3056b.set(7, b(i));
        textView.setText(this.f3056b.getDisplayName(7, f3055e, Locale.getDefault()));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(d.a.a.a.i.i_res_0x7f1000a4), this.f3056b.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
