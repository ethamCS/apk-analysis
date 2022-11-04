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
class f extends BaseAdapter {
    private static final int e;

    /* renamed from: b */
    private final Calendar f1455b;

    /* renamed from: c */
    private final int f1456c;
    private final int d;

    static {
        e = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public f() {
        Calendar d = o.d();
        this.f1455b = d;
        this.f1456c = d.getMaximum(7);
        this.d = this.f1455b.getFirstDayOfWeek();
    }

    private int a(int i) {
        int i2 = i + this.d;
        int i3 = this.f1456c;
        return i2 > i3 ? i2 - i3 : i2;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f1456c;
    }

    @Override // android.widget.Adapter
    public Integer getItem(int i) {
        if (i >= this.f1456c) {
            return null;
        }
        return Integer.valueOf(a(i));
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
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(b.a.a.a.h.mtrl_calendar_day_of_week, viewGroup, false);
        }
        this.f1455b.set(7, a(i));
        textView.setText(this.f1455b.getDisplayName(7, e, Locale.getDefault()));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(b.a.a.a.j.mtrl_picker_day_of_week_column_header), this.f1455b.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }
}
