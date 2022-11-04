package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class k<S> extends p<S> {
    private int S4;
    private d<S> T4;
    private com.google.android.material.datepicker.a U4;

    /* loaded from: classes.dex */
    class a extends o<S> {
        a() {
            k.this = r1;
        }

        @Override // com.google.android.material.datepicker.o
        public void a(S s10) {
            Iterator<o<S>> it = k.this.R4.iterator();
            while (it.hasNext()) {
                it.next().a(s10);
            }
        }
    }

    public static <T> k<T> p2(d<T> dVar, int i10, com.google.android.material.datepicker.a aVar) {
        k<T> kVar = new k<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        kVar.Y1(bundle);
        return kVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void P0(Bundle bundle) {
        super.P0(bundle);
        if (bundle == null) {
            bundle = Q();
        }
        this.S4 = bundle.getInt("THEME_RES_ID_KEY");
        this.T4 = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.U4 = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View T0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.T4.x(layoutInflater.cloneInContext(new ContextThemeWrapper(T(), this.S4)), viewGroup, bundle, this.U4, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public void l1(Bundle bundle) {
        super.l1(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.S4);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.T4);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.U4);
    }
}
