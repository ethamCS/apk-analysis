package com.google.android.material.datepicker;

import android.content.Context;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;
/* loaded from: classes.dex */
public class m extends BaseAdapter {
    static final int U3 = s.k().getMaximum(4);

    /* renamed from: c */
    final l f7195c;

    /* renamed from: d */
    final d<?> f7196d;

    /* renamed from: q */
    private Collection<Long> f7197q;

    /* renamed from: x */
    c f7198x;

    /* renamed from: y */
    final a f7199y;

    public m(l lVar, d<?> dVar, a aVar) {
        this.f7195c = lVar;
        this.f7196d = dVar;
        this.f7199y = aVar;
        this.f7197q = dVar.s();
    }

    private void e(Context context) {
        if (this.f7198x == null) {
            this.f7198x = new c(context);
        }
    }

    private boolean h(long j10) {
        Iterator<Long> it = this.f7196d.s().iterator();
        while (it.hasNext()) {
            if (s.a(j10) == s.a(it.next().longValue())) {
                return true;
            }
        }
        return false;
    }

    private void k(TextView textView, long j10) {
        b bVar;
        if (textView == null) {
            return;
        }
        if (this.f7199y.i().p(j10)) {
            textView.setEnabled(true);
            bVar = h(j10) ? this.f7198x.f7125b : s.i().getTimeInMillis() == j10 ? this.f7198x.f7126c : this.f7198x.f7124a;
        } else {
            textView.setEnabled(false);
            bVar = this.f7198x.f7130g;
        }
        bVar.d(textView);
    }

    private void l(MaterialCalendarGridView materialCalendarGridView, long j10) {
        if (l.l(j10).equals(this.f7195c)) {
            k((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter2().a(this.f7195c.w(j10)) - materialCalendarGridView.getFirstVisiblePosition()), j10);
        }
    }

    public int a(int i10) {
        return b() + (i10 - 1);
    }

    public int b() {
        return this.f7195c.o();
    }

    /* renamed from: c */
    public Long getItem(int i10) {
        if (i10 < this.f7195c.o() || i10 > i()) {
            return null;
        }
        return Long.valueOf(this.f7195c.q(j(i10)));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0080 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
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
            int r0 = b5.h.m_res_0x7f0c0059
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L1e:
            int r7 = r5.b()
            int r7 = r6 - r7
            if (r7 < 0) goto L72
            com.google.android.material.datepicker.l r8 = r5.f7195c
            int r2 = r8.f7194y
            if (r7 < r2) goto L2d
            goto L72
        L2d:
            r2 = 1
            int r7 = r7 + r2
            r0.setTag(r8)
            android.content.res.Resources r8 = r0.getResources()
            android.content.res.Configuration r8 = r8.getConfiguration()
            java.util.Locale r8 = r8.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r7)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r8 = java.lang.String.format(r8, r4, r3)
            r0.setText(r8)
            com.google.android.material.datepicker.l r8 = r5.f7195c
            long r7 = r8.q(r7)
            com.google.android.material.datepicker.l r3 = r5.f7195c
            int r3 = r3.f7192q
            com.google.android.material.datepicker.l r4 = com.google.android.material.datepicker.l.m()
            int r4 = r4.f7192q
            if (r3 != r4) goto L64
            java.lang.String r7 = com.google.android.material.datepicker.e.a(r7)
            goto L68
        L64:
            java.lang.String r7 = com.google.android.material.datepicker.e.d(r7)
        L68:
            r0.setContentDescription(r7)
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L7a
        L72:
            r7 = 8
            r0.setVisibility(r7)
            r0.setEnabled(r1)
        L7a:
            java.lang.Long r6 = r5.getItem(r6)
            if (r6 != 0) goto L81
            return r0
        L81:
            long r6 = r6.longValue()
            r5.k(r0, r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.m.getView(int, android.view.View, android.view.ViewGroup):android.widget.TextView");
    }

    public boolean f(int i10) {
        return i10 % this.f7195c.f7193x == 0;
    }

    public boolean g(int i10) {
        return (i10 + 1) % this.f7195c.f7193x == 0;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f7195c.f7194y + b();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10 / this.f7195c.f7193x;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    public int i() {
        return (this.f7195c.o() + this.f7195c.f7194y) - 1;
    }

    int j(int i10) {
        return (i10 - this.f7195c.o()) + 1;
    }

    public void m(MaterialCalendarGridView materialCalendarGridView) {
        for (Long l10 : this.f7197q) {
            l(materialCalendarGridView, l10.longValue());
        }
        d<?> dVar = this.f7196d;
        if (dVar != null) {
            for (Long l11 : dVar.s()) {
                l(materialCalendarGridView, l11.longValue());
            }
            this.f7197q = this.f7196d.s();
        }
    }

    public boolean n(int i10) {
        return i10 >= b() && i10 <= i();
    }
}
