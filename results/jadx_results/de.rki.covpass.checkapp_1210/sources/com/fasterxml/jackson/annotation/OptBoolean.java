package com.fasterxml.jackson.annotation;
/* loaded from: classes.dex */
public enum OptBoolean {
    TRUE,
    FALSE,
    DEFAULT;

    public static boolean equals(Boolean bool, Boolean bool2) {
        return bool == null ? bool2 == null : bool.equals(bool2);
    }

    public Boolean asBoolean() {
        if (this == DEFAULT) {
            return null;
        }
        return this == TRUE ? Boolean.TRUE : Boolean.FALSE;
    }
}
