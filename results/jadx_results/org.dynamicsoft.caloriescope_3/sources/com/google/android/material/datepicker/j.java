package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
/* loaded from: classes.dex */
class j extends BaseAdapter {
    static final int f = o.d().getMaximum(4);

    /* renamed from: b */
    final i f1475b;

    /* renamed from: c */
    final d<?> f1476c;
    c d;
    final a e;

    public j(i iVar, d<?> dVar, a aVar) {
        this.f1475b = iVar;
        this.f1476c = dVar;
        this.e = aVar;
    }

    private void a(Context context) {
        if (this.d == null) {
            this.d = new c(context);
        }
    }

    public int a() {
        return this.f1475b.d();
    }

    public int a(int i) {
        return a() + (i - 1);
    }

    public int b() {
        return (this.f1475b.d() + this.f1475b.g) - 1;
    }

    public boolean b(int i) {
        return i % this.f1475b.f == 0;
    }

    public boolean c(int i) {
        return (i + 1) % this.f1475b.f == 0;
    }

    int d(int i) {
        return (i - this.f1475b.d()) + 1;
    }

    public boolean e(int i) {
        return i >= a() && i <= b();
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f1475b.g + a();
    }

    @Override // android.widget.Adapter
    public Long getItem(int i) {
        if (i < this.f1475b.d() || i > b()) {
            return null;
        }
        return Long.valueOf(this.f1475b.a(d(i)));
    }

    @Override // android.widget.Adapter
    public long getItemId(int i) {
        return i / this.f1475b.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006d  */
    @Override // android.widget.Adapter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.widget.TextView getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            android.content.Context r0 = r8.getContext()
            r5.a(r0)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L1e
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = b.a.a.a.h.mtrl_calendar_day
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.a()
            int r7 = r6 - r7
            r8 = 1
            if (r7 < 0) goto L5e
            com.google.android.material.datepicker.i r2 = r5.f1475b
            int r3 = r2.g
            if (r7 < r3) goto L2e
            goto L5e
        L2e:
            int r7 = r7 + r8
            r0.setTag(r2)
            java.lang.String r2 = java.lang.String.valueOf(r7)
            r0.setText(r2)
            com.google.android.material.datepicker.i r2 = r5.f1475b
            long r2 = r2.a(r7)
            com.google.android.material.datepicker.i r7 = r5.f1475b
            int r7 = r7.e
            com.google.android.material.datepicker.i r4 = com.google.android.material.datepicker.i.g()
            int r4 = r4.e
            if (r7 != r4) goto L50
            java.lang.String r7 = com.google.android.material.datepicker.e.a(r2)
            goto L54
        L50:
            java.lang.String r7 = com.google.android.material.datepicker.e.b(r2)
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
            com.google.android.material.datepicker.a r7 = r5.e
            com.google.android.material.datepicker.a$b r7 = r7.d()
            long r2 = r6.longValue()
            boolean r7 = r7.b(r2)
            if (r7 == 0) goto Lcc
            r0.setEnabled(r8)
            com.google.android.material.datepicker.d<?> r7 = r5.f1476c
            java.util.Collection r7 = r7.c()
            java.util.Iterator r7 = r7.iterator()
        L8a:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto Lb2
            java.lang.Object r8 = r7.next()
            java.lang.Long r8 = (java.lang.Long) r8
            long r1 = r8.longValue()
            long r3 = r6.longValue()
            long r3 = com.google.android.material.datepicker.o.a(r3)
            long r1 = com.google.android.material.datepicker.o.a(r1)
            int r8 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r8 != 0) goto L8a
            com.google.android.material.datepicker.c r6 = r5.d
            com.google.android.material.datepicker.b r6 = r6.f1453b
        Lae:
            r6.a(r0)
            return r0
        Lb2:
            java.util.Calendar r7 = com.google.android.material.datepicker.o.b()
            long r7 = r7.getTimeInMillis()
            long r1 = r6.longValue()
            int r6 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r6 != 0) goto Lc7
            com.google.android.material.datepicker.c r6 = r5.d
            com.google.android.material.datepicker.b r6 = r6.f1454c
            goto Lae
        Lc7:
            com.google.android.material.datepicker.c r6 = r5.d
            com.google.android.material.datepicker.b r6 = r6.f1452a
            goto Lae
        Lcc:
            r0.setEnabled(r1)
            com.google.android.material.datepicker.c r6 = r5.d
            com.google.android.material.datepicker.b r6 = r6.g
            goto Lae
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.j.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }
}
