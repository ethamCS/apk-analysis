package com.fasterxml.jackson.databind.util;

import j$.util.concurrent.ConcurrentHashMap;
import java.io.Serializable;
/* loaded from: classes.dex */
public class LRUMap<K, V> implements LookupCache<K, V>, Serializable {
    protected final transient ConcurrentHashMap<K, V> _map;
    protected final transient int _maxEntries;

    public LRUMap(int i10, int i11) {
        this._map = new ConcurrentHashMap<>(i10, 0.8f, 4);
        this._maxEntries = i11;
    }

    public void clear() {
        this._map.clear();
    }

    @Override // com.fasterxml.jackson.databind.util.LookupCache
    public V get(Object obj) {
        return this._map.get(obj);
    }

    public V put(K k10, V v10) {
        if (this._map.size() >= this._maxEntries) {
            synchronized (this) {
                if (this._map.size() >= this._maxEntries) {
                    clear();
                }
            }
        }
        return this._map.put(k10, v10);
    }

    @Override // com.fasterxml.jackson.databind.util.LookupCache
    public V putIfAbsent(K k10, V v10) {
        if (this._map.size() >= this._maxEntries) {
            synchronized (this) {
                if (this._map.size() >= this._maxEntries) {
                    clear();
                }
            }
        }
        return this._map.putIfAbsent(k10, v10);
    }
}
