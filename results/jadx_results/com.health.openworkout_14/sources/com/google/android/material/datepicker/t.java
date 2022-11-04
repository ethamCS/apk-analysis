package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.h;
import java.util.Calendar;
import java.util.Locale;
/* loaded from: classes.dex */
public class t extends RecyclerView.g<b> {

    /* renamed from: c */
    private final h<?> f3104c;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: b */
        final /* synthetic */ int f3105b;

        a(int i) {
            t.this = r1;
            this.f3105b = i;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t.this.f3104c.S1(t.this.f3104c.K1().n(l.c(this.f3105b, t.this.f3104c.M1().f3084d)));
            t.this.f3104c.T1(h.k.DAY);
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

    public t(h<?> hVar) {
        this.f3104c = hVar;
    }

    private View.OnClickListener G(int i) {
        return new a(i);
    }

    public int H(int i) {
        return i - this.f3104c.K1().s().f3085e;
    }

    int I(int i) {
        return this.f3104c.K1().s().f3085e + i;
    }

    /* renamed from: J */
    public void u(b bVar, int i) {
        int I = I(i);
        String string = bVar.t.getContext().getString(d.a.a.a.i.j_res_0x7f1000a9);
        bVar.t.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(I)));
        bVar.t.setContentDescription(String.format(string, Integer.valueOf(I)));
        c L1 = this.f3104c.L1();
        Calendar j = s.j();
        com.google.android.material.datepicker.b bVar2 = j.get(1) == I ? L1.f3051f : L1.f3049d;
        for (Long l : this.f3104c.N1().l()) {
            j.setTimeInMillis(l.longValue());
            if (j.get(1) == I) {
                bVar2 = L1.f3050e;
            }
        }
        bVar2.d(bVar.t);
        bVar.t.setOnClickListener(G(I));
    }

    /* renamed from: K */
    public b w(ViewGroup viewGroup, int i) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(d.a.a.a.h.n_res_0x7f0c0051, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int f() {
        return this.f3104c.K1().t();
    }
}
