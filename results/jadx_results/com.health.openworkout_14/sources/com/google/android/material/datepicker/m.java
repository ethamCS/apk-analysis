package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
/* loaded from: classes.dex */
public class m extends BaseAdapter {

    /* renamed from: f */
    static final int f3089f = s.l().getMaximum(4);

    /* renamed from: b */
    final l f3090b;

    /* renamed from: c */
    final d<?> f3091c;

    /* renamed from: d */
    c f3092d;

    /* renamed from: e */
    final a f3093e;

    public m(l lVar, d<?> dVar, a aVar) {
        this.f3090b = lVar;
        this.f3091c = dVar;
        this.f3093e = aVar;
    }

    private void e(Context context) {
        if (this.f3092d == null) {
            this.f3092d = new c(context);
        }
    }

    public int a(int i) {
        return b() + (i - 1);
    }

    public int b() {
        return this.f3090b.n();
    }

    /* renamed from: c */
    public Long getItem(int i) {
        if (i < this.f3090b.n() || i > h()) {
            return null;
        }
        return Long.valueOf(this.f3090b.o(i(i)));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.e(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = d.a.a.a.h.i_res_0x7f0c0048
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.b()
            int r7 = r6 - r7
            r8 = 1
            if (r7 < 0) goto L5e
            com.google.android.material.datepicker.l r2 = r5.f3090b
            int r3 = r2.f3087g
            if (r7 < r3) goto L2e
            goto L5e
        L2e:
            int r7 = r7 + r8
            r0.setTag(r2)
            java.lang.String r2 = java.lang.String.valueOf(r7)
            r0.setText(r2)
            com.google.android.material.datepicker.l r2 = r5.f3090b
            long r2 = r2.o(r7)
            com.google.android.material.datepicker.l r7 = r5.f3090b
            int r7 = r7.f3085e
            com.google.android.material.datepicker.l r4 = com.google.android.material.datepicker.l.m()
            int r4 = r4.f3085e
            if (r7 != r4) goto L50
            java.lang.String r7 = com.google.android.material.datepicker.e.a(r2)
            goto L54
        L50:
            java.lang.String r7 = com.google.android.material.datepicker.e.c(r2)
        L54:
            r0.setContentDescription(r7)
            r0.setVisibility(r1)
            r0.setEnabled(r8)
            goto L66
        L5e:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L66:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L6d
            return r0
        L6d:
            com.google.android.material.datepicker.a r7 = r5.f3093e
            com.google.android.material.datepicker.a$c r7 = r7.o()
            long r2 = r6.longValue()
            boolean r7 = r7.g(r2)
            if (r7 == 0) goto Lcc
            r0.setEnabled(r8)
            com.google.android.material.datepicker.d<?> r7 = r5.f3091c
            java.util.Collection r7 = r7.l()
            java.util.Iterator r7 = r7.iterator()
        L8a:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lb2
            java.lang.Object r8 = r7.next()
            java.lang.Long r8 = (java.lang.Long) r8
            long r1 = r8.longValue()
            long r3 = r6.longValue()
            long r3 = com.google.android.material.datepicker.s.a(r3)
            long r1 = com.google.android.material.datepicker.s.a(r1)
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 != 0) goto L8a
            com.google.android.material.datepicker.c r6 = r5.f3092d
            com.google.android.material.datepicker.b r6 = r6.f3047b
        Lae:
            r6.d(r0)
            return r0
        Lb2:
            java.util.Calendar r7 = com.google.android.material.datepicker.s.j()
            long r7 = r7.getTimeInMillis()
            long r1 = r6.longValue()
            int r6 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r6 != 0) goto Lc7
            com.google.android.material.datepicker.c r6 = r5.f3092d
            com.google.android.material.datepicker.b r6 = r6.f3048c
            goto Lae
        Lc7:
            com.google.android.material.datepicker.c r6 = r5.f3092d
            com.google.android.material.datepicker.b r6 = r6.f3046a
            goto Lae
        Lcc:
            r0.setEnabled(r1)
            com.google.android.material.datepicker.c r6 = r5.f3092d
            com.google.android.material.datepicker.b r6 = r6.f3052g
            goto Lae
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.m.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    public boolean f(int i) {
        return i % this.f3090b.f3086f == 0;
    }

    public boolean g(int i) {
        return (i + 1) % this.f3090b.f3086f == 0;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f3090b.f3087g + b();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.f3090b.f3086f;
    }

    public int h() {
        return (this.f3090b.n() + this.f3090b.f3087g) - 1;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    int i(int i) {
        return (i - this.f3090b.n()) + 1;
    }

    public boolean j(int i) {
        return i >= b() && i <= h();
    }
}
