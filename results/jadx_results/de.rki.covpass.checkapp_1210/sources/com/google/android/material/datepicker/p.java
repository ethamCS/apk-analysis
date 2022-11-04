package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;
/* loaded from: classes.dex */
abstract class p<S> extends Fragment {
    protected final LinkedHashSet<o<S>> R4 = new LinkedHashSet<>();

    public boolean n2(o<S> oVar) {
        return this.R4.add(oVar);
    }

    public void o2() {
        this.R4.clear();
    }
}
