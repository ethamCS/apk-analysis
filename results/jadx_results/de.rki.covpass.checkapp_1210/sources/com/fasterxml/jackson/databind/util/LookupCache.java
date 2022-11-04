package com.fasterxml.jackson.databind.util;
/* loaded from: classes.dex */
public interface LookupCache<K, V> {
    V get(Object obj);

    V putIfAbsent(K k10, V v10);
}
