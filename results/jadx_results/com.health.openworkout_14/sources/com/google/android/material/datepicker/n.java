package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.h;
/* loaded from: classes.dex */
public class n extends RecyclerView.g<b> {

    /* renamed from: c */
    private final com.google.android.material.datepicker.a f3094c;

    /* renamed from: d */
    private final d<?> f3095d;

    /* renamed from: e */
    private final h.l f3096e;

    /* renamed from: f */
    private final int f3097f;

    /* loaded from: classes.dex */
    public class a implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        final /* synthetic */ MaterialCalendarGridView f3098b;

        a(MaterialCalendarGridView materialCalendarGridView) {
            n.this = r1;
            this.f3098b = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f3098b.getAdapter2().j(i)) {
                n.this.f3096e.a(this.f3098b.getAdapter2().getItem(i).longValue());
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.d0 {
        final TextView t;
        final MaterialCalendarGridView u;

        b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(d.a.a.a.f.i_res_0x7f09010f);
            this.t = textView;
            b.g.l.t.j0(textView, true);
            this.u = (MaterialCalendarGridView) linearLayout.findViewById(d.a.a.a.f.e_res_0x7f09010a);
            if (!z) {
                textView.setVisibility(8);
            }
        }
    }

    public n(Context context, d<?> dVar, com.google.android.material.datepicker.a aVar, h.l lVar) {
        l s = aVar.s();
        l p = aVar.p();
        l r = aVar.r();
        if (s.compareTo(r) <= 0) {
            if (r.compareTo(p) > 0) {
                throw new IllegalArgumentException("currentPage cannot be after lastPage");
            }
            this.f3097f = (m.f3089f * h.O1(context)) + (i.Y1(context) ? h.O1(context) : 0);
            this.f3094c = aVar;
            this.f3095d = dVar;
            this.f3096e = lVar;
            D(true);
            return;
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    public l G(int i) {
        return this.f3094c.s().r(i);
    }

    public CharSequence H(int i) {
        return G(i).p();
    }

    public int I(l lVar) {
        return this.f3094c.s().s(lVar);
    }

    /* renamed from: J */
    public void u(b bVar, int i) {
        l r = this.f3094c.s().r(i);
        bVar.t.setText(r.p());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.u.findViewById(d.a.a.a.f.e_res_0x7f09010a);
        if (materialCalendarGridView.getAdapter2() == null || !r.equals(materialCalendarGridView.getAdapter2().f3090b)) {
            m mVar = new m(r, this.f3095d, this.f3094c);
            materialCalendarGridView.setNumColumns(r.f3086f);
            materialCalendarGridView.setAdapter((ListAdapter) mVar);
        } else {
            materialCalendarGridView.getAdapter2().notifyDataSetChanged();
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    /* renamed from: K */
    public b w(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(d.a.a.a.h.l_res_0x7f0c004d, viewGroup, false);
        if (i.Y1(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.p(-1, this.f3097f));
            return new b(linearLayout, true);
        }
        return new b(linearLayout, false);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int f() {
        return this.f3094c.q();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long g(int i) {
        return this.f3094c.s().r(i).q();
    }
}
