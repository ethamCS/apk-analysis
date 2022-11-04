package com.google.android.material.appbar;

import android.view.View;
import androidx.core.view.y;
/* loaded from: classes.dex */
class d {

    /* renamed from: a */
    private final View f6858a;

    /* renamed from: b */
    private int f6859b;

    /* renamed from: c */
    private int f6860c;

    /* renamed from: d */
    private int f6861d;

    /* renamed from: e */
    private int f6862e;

    /* renamed from: f */
    private boolean f6863f = true;

    /* renamed from: g */
    private boolean f6864g = true;

    public d(View view) {
        this.f6858a = view;
    }

    public void a() {
        View view = this.f6858a;
        y.Z(view, this.f6861d - (view.getTop() - this.f6859b));
        View view2 = this.f6858a;
        y.Y(view2, this.f6862e - (view2.getLeft() - this.f6860c));
    }

    public int b() {
        return this.f6861d;
    }

    public void c() {
        this.f6859b = this.f6858a.getTop();
        this.f6860c = this.f6858a.getLeft();
    }

    public boolean d(int i10) {
        if (!this.f6864g || this.f6862e == i10) {
            return false;
        }
        this.f6862e = i10;
        a();
        return true;
    }

    public boolean e(int i10) {
        if (!this.f6863f || this.f6861d == i10) {
            return false;
        }
        this.f6861d = i10;
        a();
        return true;
    }
}
