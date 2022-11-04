package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.y;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.h;
/* loaded from: classes.dex */
public class n extends RecyclerView.g<b> {

    /* renamed from: c */
    private final com.google.android.material.datepicker.a f7200c;

    /* renamed from: d */
    private final d<?> f7201d;

    /* renamed from: e */
    private final h.l f7202e;

    /* renamed from: f */
    private final int f7203f;

    /* loaded from: classes.dex */
    public class a implements AdapterView.OnItemClickListener {

        /* renamed from: c */
        final /* synthetic */ MaterialCalendarGridView f7204c;

        a(MaterialCalendarGridView materialCalendarGridView) {
            n.this = r1;
            this.f7204c = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            if (this.f7204c.getAdapter2().n(i10)) {
                n.this.f7202e.a(this.f7204c.getAdapter2().getItem(i10).longValue());
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.d0 {

        /* renamed from: t */
        final TextView f7206t;

        /* renamed from: u */
        final MaterialCalendarGridView f7207u;

        b(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(b5.f.t_res_0x7f09017e);
            this.f7206t = textView;
            y.p0(textView, true);
            this.f7207u = (MaterialCalendarGridView) linearLayout.findViewById(b5.f.p_res_0x7f090179);
            if (!z10) {
                textView.setVisibility(8);
            }
        }
    }

    public n(Context context, d<?> dVar, com.google.android.material.datepicker.a aVar, h.l lVar) {
        l n10 = aVar.n();
        l k10 = aVar.k();
        l m10 = aVar.m();
        if (n10.compareTo(m10) <= 0) {
            if (m10.compareTo(k10) > 0) {
                throw new IllegalArgumentException("currentPage cannot be after lastPage");
            }
            this.f7203f = (m.U3 * h.C2(context)) + (i.S2(context) ? h.C2(context) : 0);
            this.f7200c = aVar;
            this.f7201d = dVar;
            this.f7202e = lVar;
            u(true);
            return;
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    /* renamed from: A */
    public void l(b bVar, int i10) {
        l A = this.f7200c.n().A(i10);
        bVar.f7206t.setText(A.y());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f7207u.findViewById(b5.f.p_res_0x7f090179);
        if (materialCalendarGridView.getAdapter2() == null || !A.equals(materialCalendarGridView.getAdapter2().f7195c)) {
            m mVar = new m(A, this.f7201d, this.f7200c);
            materialCalendarGridView.setNumColumns(A.f7193x);
            materialCalendarGridView.setAdapter((ListAdapter) mVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter2().m(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    /* renamed from: B */
    public b n(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(b5.h.p_res_0x7f0c005e, viewGroup, false);
        if (i.S2(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.p(-1, this.f7203f));
            return new b(linearLayout, true);
        }
        return new b(linearLayout, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int e() {
        return this.f7200c.l();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long f(int i10) {
        return this.f7200c.n().A(i10).z();
    }

    public l x(int i10) {
        return this.f7200c.n().A(i10);
    }

    public CharSequence y(int i10) {
        return x(i10).y();
    }

    public int z(l lVar) {
        return this.f7200c.n().B(lVar);
    }
}
