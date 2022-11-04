package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.b0;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class m0<K, V> extends LinkedHashMap<K, V> {

    /* renamed from: d */
    private static final m0 f7953d;

    /* renamed from: c */
    private boolean f7954c = true;

    static {
        m0 m0Var = new m0();
        f7953d = m0Var;
        m0Var.t();
    }

    private m0() {
    }

    private m0(Map<K, V> map) {
        super(map);
    }

    static <K, V> int e(Map<K, V> map) {
        int i10 = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            i10 += f(entry.getValue()) ^ f(entry.getKey());
        }
        return i10;
    }

    private static int f(Object obj) {
        if (obj instanceof byte[]) {
            return b0.d((byte[]) obj);
        }
        if (obj instanceof b0.c) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private static void g(Map<?, ?> map) {
        for (Object obj : map.keySet()) {
            b0.a(obj);
            b0.a(map.get(obj));
        }
    }

    public static <K, V> m0<K, V> h() {
        return f7953d;
    }

    private void i() {
        if (p()) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    private static boolean j(Object obj, Object obj2) {
        return (!(obj instanceof byte[]) || !(obj2 instanceof byte[])) ? obj.equals(obj2) : Arrays.equals((byte[]) obj, (byte[]) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static <K, V> boolean k(java.util.Map<K, V> r4, java.util.Map<K, V> r5) {
        /*
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            int r1 = r4.size()
            int r2 = r5.size()
            r3 = 0
            if (r1 == r2) goto L10
            return r3
        L10:
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L18:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L42
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            boolean r2 = r5.containsKey(r2)
            if (r2 != 0) goto L2f
            return r3
        L2f:
            java.lang.Object r2 = r1.getValue()
            java.lang.Object r1 = r1.getKey()
            java.lang.Object r1 = r5.get(r1)
            boolean r1 = j(r2, r1)
            if (r1 != 0) goto L18
            return r3
        L42:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.crypto.tink.shaded.protobuf.m0.k(java.util.Map, java.util.Map):boolean");
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        i();
        super.clear();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        return (obj instanceof Map) && k(this, (Map) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        return e(this);
    }

    public boolean p() {
        return this.f7954c;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V put(K k10, V v10) {
        i();
        b0.a(k10);
        b0.a(v10);
        return (V) super.put(k10, v10);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        i();
        g(map);
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        i();
        return (V) super.remove(obj);
    }

    public void t() {
        this.f7954c = false;
    }

    public void v(m0<K, V> m0Var) {
        i();
        if (!m0Var.isEmpty()) {
            putAll(m0Var);
        }
    }

    public m0<K, V> x() {
        return isEmpty() ? new m0<>() : new m0<>(this);
    }
}
