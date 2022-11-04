package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class k<S> extends p<S> {
    private d<S> Y;
    private com.google.android.material.datepicker.a Z;

    /* loaded from: classes.dex */
    class a extends o<S> {
        a() {
            k.this = r1;
        }

        @Override // com.google.android.material.datepicker.o
        public void a(S s) {
            Iterator<o<S>> it = k.this.X.iterator();
            while (it.hasNext()) {
                it.next().a(s);
            }
        }
    }

    public static <T> k<T> B1(d<T> dVar, com.google.android.material.datepicker.a aVar) {
        k<T> kVar = new k<>();
        Bundle bundle = new Bundle();
        bundle.putParcelable("DATE_SELECTOR_KEY", dVar);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", aVar);
        kVar.o1(bundle);
        return kVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void E0(Bundle bundle) {
        super.E0(bundle);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.Y);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.Z);
    }

    @Override // androidx.fragment.app.Fragment
    public void i0(Bundle bundle) {
        super.i0(bundle);
        if (bundle == null) {
            bundle = r();
        }
        this.Y = (d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.Z = (com.google.android.material.datepicker.a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View m0(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.Y.j(layoutInflater, viewGroup, bundle, this.Z, new a());
    }
}
