package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
/* loaded from: classes.dex */
public final class ConstructorDetector implements Serializable {
    protected final boolean _allowJDKTypeCtors;
    protected final boolean _requireCtorAnnotation;
    protected final SingleArgConstructor _singleArgMode;
    public static final ConstructorDetector DEFAULT = new ConstructorDetector(SingleArgConstructor.HEURISTIC);
    public static final ConstructorDetector USE_PROPERTIES_BASED = new ConstructorDetector(SingleArgConstructor.PROPERTIES);
    public static final ConstructorDetector USE_DELEGATING = new ConstructorDetector(SingleArgConstructor.DELEGATING);
    public static final ConstructorDetector EXPLICIT_ONLY = new ConstructorDetector(SingleArgConstructor.REQUIRE_MODE);

    /* loaded from: classes.dex */
    public enum SingleArgConstructor {
        DELEGATING,
        PROPERTIES,
        HEURISTIC,
        REQUIRE_MODE
    }

    protected ConstructorDetector(SingleArgConstructor singleArgConstructor) {
        this(singleArgConstructor, false, false);
    }

    protected ConstructorDetector(SingleArgConstructor singleArgConstructor, boolean z10, boolean z11) {
        this._singleArgMode = singleArgConstructor;
        this._requireCtorAnnotation = z10;
        this._allowJDKTypeCtors = z11;
    }

    public boolean requireCtorAnnotation() {
        return this._requireCtorAnnotation;
    }

    public boolean shouldIntrospectorImplicitConstructors(Class<?> cls) {
        if (this._requireCtorAnnotation) {
            return false;
        }
        return this._allowJDKTypeCtors || !ClassUtil.isJDKClass(cls) || Throwable.class.isAssignableFrom(cls);
    }

    public boolean singleArgCreatorDefaultsToDelegating() {
        return this._singleArgMode == SingleArgConstructor.DELEGATING;
    }

    public boolean singleArgCreatorDefaultsToProperties() {
        return this._singleArgMode == SingleArgConstructor.PROPERTIES;
    }

    public SingleArgConstructor singleArgMode() {
        return this._singleArgMode;
    }
}
