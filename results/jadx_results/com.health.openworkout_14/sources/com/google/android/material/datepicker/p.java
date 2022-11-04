package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;
/* loaded from: classes.dex */
public abstract class p<S> extends Fragment {
    protected final LinkedHashSet<o<S>> X = new LinkedHashSet<>();

    public void A1() {
        this.X.clear();
    }

    public boolean z1(o<S> oVar) {
        return this.X.add(oVar);
    }
}
