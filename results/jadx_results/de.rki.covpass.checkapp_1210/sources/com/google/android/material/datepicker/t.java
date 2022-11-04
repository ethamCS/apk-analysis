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
    private final h<?> f7213c;

    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {

        /* renamed from: c */
        final /* synthetic */ int f7214c;

        a(int i10) {
            t.this = r1;
            this.f7214c = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            t.this.f7213c.H2(t.this.f7213c.y2().f(l.d(this.f7214c, t.this.f7213c.A2().f7191d)));
            t.this.f7213c.I2(h.k.DAY);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.d0 {

        /* renamed from: t */
        final TextView f7216t;

        b(TextView textView) {
            super(textView);
            this.f7216t = textView;
        }
    }

    public t(h<?> hVar) {
        this.f7213c = hVar;
    }

    private View.OnClickListener x(int i10) {
        return new a(i10);
    }

    /* renamed from: A */
    public void l(b bVar, int i10) {
        int z10 = z(i10);
        String string = bVar.f7216t.getContext().getString(b5.j.o_res_0x7f100165);
        bVar.f7216t.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(z10)));
        bVar.f7216t.setContentDescription(String.format(string, Integer.valueOf(z10)));
        c z22 = this.f7213c.z2();
        Calendar i11 = s.i();
        com.google.android.material.datepicker.b bVar2 = i11.get(1) == z10 ? z22.f7129f : z22.f7127d;
        for (Long l10 : this.f7213c.B2().s()) {
            i11.setTimeInMillis(l10.longValue());
            if (i11.get(1) == z10) {
                bVar2 = z22.f7128e;
            }
        }
        bVar2.d(bVar.f7216t);
        bVar.f7216t.setOnClickListener(x(z10));
    }

    /* renamed from: B */
    public b n(ViewGroup viewGroup, int i10) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(b5.h.r_res_0x7f0c0062, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int e() {
        return this.f7213c.y2().o();
    }

    public int y(int i10) {
        return i10 - this.f7213c.y2().n().f7192q;
    }

    int z(int i10) {
        return this.f7213c.y2().n().f7192q + i10;
    }
}
