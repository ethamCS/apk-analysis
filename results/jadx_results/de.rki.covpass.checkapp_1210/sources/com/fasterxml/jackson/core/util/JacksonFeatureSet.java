package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.util.JacksonFeature;
/* loaded from: classes.dex */
public final class JacksonFeatureSet<F extends JacksonFeature> {
    protected int _enabled;

    protected JacksonFeatureSet(int i10) {
        this._enabled = i10;
    }

    public static <F extends JacksonFeature> JacksonFeatureSet<F> fromDefaults(F[] fArr) {
        if (fArr.length <= 31) {
            int i10 = 0;
            for (F f10 : fArr) {
                if (f10.enabledByDefault()) {
                    i10 |= f10.getMask();
                }
            }
            return new JacksonFeatureSet<>(i10);
        }
        throw new IllegalArgumentException(String.format("Can not use type `%s` with JacksonFeatureSet: too many entries (%d > 31)", fArr[0].getClass().getName(), Integer.valueOf(fArr.length)));
    }

    public boolean isEnabled(F f10) {
        return (f10.getMask() & this._enabled) != 0;
    }

    public JacksonFeatureSet<F> with(F f10) {
        int mask = f10.getMask() | this._enabled;
        return mask == this._enabled ? this : new JacksonFeatureSet<>(mask);
    }
}
