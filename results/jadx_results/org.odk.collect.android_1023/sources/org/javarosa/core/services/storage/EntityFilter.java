package org.javarosa.core.services.storage;

import java.util.Hashtable;
/* loaded from: classes.dex */
public abstract class EntityFilter<E> {
    public static final int PREFILTER_EXCLUDE = -1;
    public static final int PREFILTER_FILTER = 0;
    public static final int PREFILTER_INCLUDE = 1;

    public abstract boolean matches(E e);

    public int preFilter(int i, Hashtable<String, Object> hashtable) {
        return 0;
    }
}
