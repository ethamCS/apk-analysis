package com.google.android.material.datepicker;

import a.g.l.u;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.g;
/* loaded from: classes.dex */
public class k extends RecyclerView.g<b> {

    /* renamed from: c */
    private final com.google.android.material.datepicker.a f1477c;
    private final d<?> d;
    private final g.l e;
    private final int f;

    /* loaded from: classes.dex */
    public class a implements AdapterView.OnItemClickListener {

        /* renamed from: b */
        final /* synthetic */ MaterialCalendarGridView f1478b;

        a(MaterialCalendarGridView materialCalendarGridView) {
            k.this = r1;
            this.f1478b = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (this.f1478b.getAdapter2().e(i)) {
                k.this.e.a(this.f1478b.getAdapter2().getItem(i).longValue());
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.d0 {
        final TextView t;
        final MaterialCalendarGridView u;

        b(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(b.a.a.a.f.month_title);
            this.t = textView;
            u.a((View) textView, true);
            this.u = (MaterialCalendarGridView) linearLayout.findViewById(b.a.a.a.f.month_grid);
            if (!z) {
                this.t.setVisibility(8);
            }
        }
    }

    public k(Context context, d<?> dVar, com.google.android.material.datepicker.a aVar, g.l lVar) {
        i h = aVar.h();
        i e = aVar.e();
        i g = aVar.g();
        if (h.compareTo(g) <= 0) {
            if (g.compareTo(e) > 0) {
                throw new IllegalArgumentException("currentPage cannot be after lastPage");
            }
            this.f = (j.f * g.b(context)) + (h.b(context) ? g.b(context) : 0);
            this.f1477c = aVar;
            this.d = dVar;
            this.e = lVar;
            a(true);
            return;
        }
        throw new IllegalArgumentException("firstPage cannot be after currentPage");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int a() {
        return this.f1477c.f();
    }

    public int a(i iVar) {
        return this.f1477c.h().b(iVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public long a(int i) {
        return this.f1477c.h().b(i).f();
    }

    /* renamed from: a */
    public void b(b bVar, int i) {
        i b2 = this.f1477c.h().b(i);
        bVar.t.setText(b2.e());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.u.findViewById(b.a.a.a.f.month_grid);
        if (materialCalendarGridView.getAdapter2() == null || !b2.equals(materialCalendarGridView.getAdapter2().f1475b)) {
            j jVar = new j(b2, this.d, this.f1477c);
            materialCalendarGridView.setNumColumns(b2.f);
            materialCalendarGridView.setAdapter((ListAdapter) jVar);
        } else {
            materialCalendarGridView.getAdapter2().notifyDataSetChanged();
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public b b(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(b.a.a.a.h.mtrl_calendar_month_labeled, viewGroup, false);
        if (h.b(viewGroup.getContext())) {
            linearLayout.setLayoutParams(new RecyclerView.p(-1, this.f));
            return new b(linearLayout, true);
        }
        return new b(linearLayout, false);
    }

    public i c(int i) {
        return this.f1477c.h().b(i);
    }

    public CharSequence d(int i) {
        return c(i).e();
    }
}
