package com.google.android.material.appbar;

import a.g.l.u;
import android.view.View;
/* loaded from: classes.dex */
class d {

    /* renamed from: a */
    private final View f1386a;

    /* renamed from: b */
    private int f1387b;

    /* renamed from: c */
    private int f1388c;
    private int d;
    private int e;
    private boolean f = true;
    private boolean g = true;

    public d(View view) {
        this.f1386a = view;
    }

    public void a() {
        View view = this.f1386a;
        u.e(view, this.d - (view.getTop() - this.f1387b));
        View view2 = this.f1386a;
        u.d(view2, this.e - (view2.getLeft() - this.f1388c));
    }

    public boolean a(int i) {
        if (!this.g || this.e == i) {
            return false;
        }
        this.e = i;
        a();
        return true;
    }

    public int b() {
        return this.d;
    }

    public boolean b(int i) {
        if (!this.f || this.d == i) {
            return false;
        }
        this.d = i;
        a();
        return true;
    }

    public void c() {
        this.f1387b = this.f1386a.getTop();
        this.f1388c = this.f1386a.getLeft();
    }
}
