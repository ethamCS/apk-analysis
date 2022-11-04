package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.g;
import java.util.Calendar;
import java.util.Locale;
/* loaded from: classes.dex */
public class p extends RecyclerView.g<b> {

    /* renamed from: c */
    private final g<?> f1480c;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ int f1481b;

        a(int i) {
            p.this = r1;
            this.f1481b = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            p.this.f1480c.a(i.a(this.f1481b, p.this.f1480c.k0().d));
            p.this.f1480c.a(g.k.DAY);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.d0 {
        final TextView t;

        b(TextView textView) {
            super(textView);
            this.t = textView;
        }
    }

    public p(g<?> gVar) {
        this.f1480c = gVar;
    }

    private View.OnClickListener e(int i) {
        return new a(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int a() {
        return this.f1480c.i0().i();
    }

    /* renamed from: a */
    public void b(b bVar, int i) {
        int d = d(i);
        String string = bVar.t.getContext().getString(b.a.a.a.j.mtrl_picker_navigate_to_year_description);
        bVar.t.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(d)));
        bVar.t.setContentDescription(String.format(string, Integer.valueOf(d)));
        c j0 = this.f1480c.j0();
        Calendar b2 = o.b();
        com.google.android.material.datepicker.b bVar2 = b2.get(1) == d ? j0.f : j0.d;
        for (Long l : this.f1480c.l0().c()) {
            b2.setTimeInMillis(l.longValue());
            if (b2.get(1) == d) {
                bVar2 = j0.e;
            }
        }
        bVar2.a(bVar.t);
        bVar.t.setOnClickListener(e(d));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public b b(ViewGroup viewGroup, int i) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(b.a.a.a.h.mtrl_calendar_year, viewGroup, false));
    }

    public int c(int i) {
        return i - this.f1480c.i0().h().e;
    }

    int d(int i) {
        return this.f1480c.i0().h().e + i;
    }
}
