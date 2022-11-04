package com.google.android.material.appbar;

import android.view.View;
import b.g.l.t;
/* loaded from: classes.dex */
class d {

    /* renamed from: a */
    private final View f2925a;

    /* renamed from: b */
    private int f2926b;

    /* renamed from: c */
    private int f2927c;

    /* renamed from: d */
    private int f2928d;

    /* renamed from: e */
    private int f2929e;

    /* renamed from: f */
    private boolean f2930f = true;

    /* renamed from: g */
    private boolean f2931g = true;

    public d(View view) {
        this.f2925a = view;
    }

    public void a() {
        View view = this.f2925a;
        t.U(view, this.f2928d - (view.getTop() - this.f2926b));
        View view2 = this.f2925a;
        t.T(view2, this.f2929e - (view2.getLeft() - this.f2927c));
    }

    public int b() {
        return this.f2928d;
    }

    public void c() {
        this.f2926b = this.f2925a.getTop();
        this.f2927c = this.f2925a.getLeft();
    }

    public boolean d(int i) {
        if (!this.f2931g || this.f2929e == i) {
            return false;
        }
        this.f2929e = i;
        a();
        return true;
    }

    public boolean e(int i) {
        if (!this.f2930f || this.f2928d == i) {
            return false;
        }
        this.f2928d = i;
        a();
        return true;
    }
}
