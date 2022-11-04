package j$.util;

import j$.util.Map;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
/* renamed from: j$.util.e */
/* loaded from: classes2.dex */
public final class C0497e implements java.util.Map, Serializable, Map {

    /* renamed from: a */
    private final java.util.Map f13348a;

    /* renamed from: b */
    final Object f13349b = this;

    /* renamed from: c */
    private transient Set f13350c;

    /* renamed from: d */
    private transient Set f13351d;

    /* renamed from: e */
    private transient Collection f13352e;

    public C0497e(java.util.Map map) {
        Objects.requireNonNull(map);
        this.f13348a = map;
    }

    private Set a(Set set, Object obj) {
        Constructor constructor;
        Constructor constructor2;
        constructor = DesugarCollections.f13235f;
        if (constructor == null) {
            return Collections.synchronizedSet(set);
        }
        try {
            constructor2 = DesugarCollections.f13235f;
            return (Set) constructor2.newInstance(set, obj);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e10) {
            throw new Error("Unable to instantiate a synchronized list.", e10);
        }
    }

    @Override // java.util.Map, j$.util.Map
    public final void clear() {
        synchronized (this.f13349b) {
            this.f13348a.clear();
        }
    }

    @Override // j$.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        Object obj2;
        Object apply;
        synchronized (this.f13349b) {
            java.util.Map map = this.f13348a;
            if (map instanceof Map) {
                obj2 = ((Map) map).compute(obj, biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                Objects.requireNonNull(biFunction);
                loop0: while (true) {
                    Object obj3 = concurrentMap.get(obj);
                    while (true) {
                        apply = biFunction.apply(obj, obj3);
                        if (apply != null) {
                            if (obj3 == null) {
                                obj3 = concurrentMap.putIfAbsent(obj, apply);
                                if (obj3 == null) {
                                    break loop0;
                                }
                            } else if (concurrentMap.replace(obj, obj3, apply)) {
                                break;
                            }
                        } else {
                            apply = null;
                            if ((obj3 == null && !concurrentMap.containsKey(obj)) || concurrentMap.remove(obj, obj3)) {
                                break;
                            }
                        }
                    }
                }
                obj2 = apply;
            } else {
                obj2 = Map.CC.$default$compute(map, obj, biFunction);
            }
        }
        return obj2;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return compute(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // j$.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        Object obj2;
        Object apply;
        synchronized (this.f13349b) {
            java.util.Map map = this.f13348a;
            if (map instanceof Map) {
                obj2 = ((Map) map).computeIfAbsent(obj, function);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                Objects.requireNonNull(function);
                Object obj3 = concurrentMap.get(obj);
                obj2 = (obj3 == null && (apply = function.apply(obj)) != null && (obj3 = concurrentMap.putIfAbsent(obj, apply)) == null) ? apply : obj3;
            } else {
                obj2 = Map.CC.$default$computeIfAbsent(map, obj, function);
            }
        }
        return obj2;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return computeIfAbsent(obj, Function.VivifiedWrapper.convert(function));
    }

    @Override // j$.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        Object obj2;
        synchronized (this.f13349b) {
            java.util.Map map = this.f13348a;
            if (map instanceof Map) {
                obj2 = ((Map) map).computeIfPresent(obj, biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                Objects.requireNonNull(biFunction);
                while (true) {
                    Object obj3 = concurrentMap.get(obj);
                    if (obj3 == null) {
                        obj2 = obj3;
                        break;
                    }
                    Object apply = biFunction.apply(obj, obj3);
                    if (apply != null) {
                        if (concurrentMap.replace(obj, obj3, apply)) {
                            obj2 = apply;
                            break;
                        }
                    } else if (concurrentMap.remove(obj, obj3)) {
                        obj2 = null;
                        break;
                    }
                }
            } else {
                obj2 = Map.CC.$default$computeIfPresent(map, obj, biFunction);
            }
        }
        return obj2;
    }

    @Override // java.util.Map
    public final /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return computeIfPresent(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean containsKey(Object obj) {
        boolean containsKey;
        synchronized (this.f13349b) {
            containsKey = this.f13348a.containsKey(obj);
        }
        return containsKey;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean containsValue(Object obj) {
        boolean containsValue;
        synchronized (this.f13349b) {
            containsValue = this.f13348a.containsValue(obj);
        }
        return containsValue;
    }

    @Override // java.util.Map, j$.util.Map
    public final Set entrySet() {
        Set set;
        synchronized (this.f13349b) {
            if (this.f13351d == null) {
                this.f13351d = a(this.f13348a.entrySet(), this.f13349b);
            }
            set = this.f13351d;
        }
        return set;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f13349b) {
            equals = this.f13348a.equals(obj);
        }
        return equals;
    }

    @Override // j$.util.Map
    public final void forEach(BiConsumer biConsumer) {
        synchronized (this.f13349b) {
            java.util.Map map = this.f13348a;
            if (map instanceof Map) {
                ((Map) map).forEach(biConsumer);
            } else if (map instanceof ConcurrentMap) {
                j$.time.temporal.k.a((ConcurrentMap) map, biConsumer);
            } else {
                Map.CC.$default$forEach(map, biConsumer);
            }
        }
    }

    @Override // java.util.Map
    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    @Override // java.util.Map, j$.util.Map
    public final Object get(Object obj) {
        Object obj2;
        synchronized (this.f13349b) {
            obj2 = this.f13348a.get(obj);
        }
        return obj2;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3;
        synchronized (this.f13349b) {
            java.util.Map map = this.f13348a;
            if (map instanceof Map) {
                obj3 = ((Map) map).getOrDefault(obj, obj2);
            } else if (map instanceof ConcurrentMap) {
                Object obj4 = ((ConcurrentMap) map).get(obj);
                if (obj4 != null) {
                    obj2 = obj4;
                }
                obj3 = obj2;
            } else {
                obj3 = map.get(obj);
            }
        }
        return obj3;
    }

    @Override // java.util.Map, j$.util.Map
    public final int hashCode() {
        int hashCode;
        synchronized (this.f13349b) {
            hashCode = this.f13348a.hashCode();
        }
        return hashCode;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean isEmpty() {
        boolean isEmpty;
        synchronized (this.f13349b) {
            isEmpty = this.f13348a.isEmpty();
        }
        return isEmpty;
    }

    @Override // java.util.Map, j$.util.Map
    public final Set keySet() {
        Set set;
        synchronized (this.f13349b) {
            if (this.f13350c == null) {
                this.f13350c = a(this.f13348a.keySet(), this.f13349b);
            }
            set = this.f13350c;
        }
        return set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0022, code lost:
        r3 = r7.apply(r2, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0026, code lost:
        if (r3 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r1.replace(r5, r2, r3) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002e, code lost:
        r6 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
        if (r1.remove(r5, r2) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0036, code lost:
        r6 = null;
     */
    @Override // j$.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object merge(java.lang.Object r5, java.lang.Object r6, j$.util.function.BiFunction r7) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f13349b
            monitor-enter(r0)
            java.util.Map r1 = r4.f13348a     // Catch: java.lang.Throwable -> L46
            boolean r2 = r1 instanceof j$.util.Map     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L10
            j$.util.Map r1 = (j$.util.Map) r1     // Catch: java.lang.Throwable -> L46
            java.lang.Object r5 = r1.merge(r5, r6, r7)     // Catch: java.lang.Throwable -> L46
            goto L44
        L10:
            boolean r2 = r1 instanceof java.util.concurrent.ConcurrentMap     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L40
            java.util.concurrent.ConcurrentMap r1 = (java.util.concurrent.ConcurrentMap) r1     // Catch: java.lang.Throwable -> L46
            java.util.Objects.requireNonNull(r7)     // Catch: java.lang.Throwable -> L46
            java.util.Objects.requireNonNull(r6)     // Catch: java.lang.Throwable -> L46
        L1c:
            java.lang.Object r2 = r1.get(r5)     // Catch: java.lang.Throwable -> L46
        L20:
            if (r2 == 0) goto L38
            java.lang.Object r3 = r7.apply(r2, r6)     // Catch: java.lang.Throwable -> L46
            if (r3 == 0) goto L30
            boolean r2 = r1.replace(r5, r2, r3)     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L1c
            r6 = r3
            goto L3e
        L30:
            boolean r2 = r1.remove(r5, r2)     // Catch: java.lang.Throwable -> L46
            if (r2 == 0) goto L1c
            r6 = 0
            goto L3e
        L38:
            java.lang.Object r2 = r1.putIfAbsent(r5, r6)     // Catch: java.lang.Throwable -> L46
            if (r2 != 0) goto L20
        L3e:
            r5 = r6
            goto L44
        L40:
            java.lang.Object r5 = j$.util.Map.CC.$default$merge(r1, r5, r6, r7)     // Catch: java.lang.Throwable -> L46
        L44:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            return r5
        L46:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L46
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.C0497e.merge(java.lang.Object, java.lang.Object, j$.util.function.BiFunction):java.lang.Object");
    }

    @Override // java.util.Map
    public final /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge(obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, j$.util.Map
    public final Object put(Object obj, Object obj2) {
        Object put;
        synchronized (this.f13349b) {
            put = this.f13348a.put(obj, obj2);
        }
        return put;
    }

    @Override // java.util.Map, j$.util.Map
    public final void putAll(java.util.Map map) {
        synchronized (this.f13349b) {
            this.f13348a.putAll(map);
        }
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final Object putIfAbsent(Object obj, Object obj2) {
        Object q10;
        synchronized (this.f13349b) {
            q10 = AbstractC0516o.q(this.f13348a, obj, obj2);
        }
        return q10;
    }

    @Override // java.util.Map, j$.util.Map
    public final Object remove(Object obj) {
        Object remove;
        synchronized (this.f13349b) {
            remove = this.f13348a.remove(obj);
        }
        return remove;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean remove(Object obj, Object obj2) {
        boolean z10;
        synchronized (this.f13349b) {
            java.util.Map map = this.f13348a;
            if (map instanceof Map) {
                z10 = ((Map) map).remove(obj, obj2);
            } else {
                Object obj3 = map.get(obj);
                if (AbstractC0516o.p(obj3, obj2) && (obj3 != null || map.containsKey(obj))) {
                    map.remove(obj);
                    z10 = true;
                }
                z10 = false;
            }
        }
        return z10;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final Object replace(Object obj, Object obj2) {
        Object obj3;
        synchronized (this.f13349b) {
            java.util.Map map = this.f13348a;
            if (map instanceof Map) {
                obj3 = ((Map) map).replace(obj, obj2);
            } else {
                Object obj4 = map.get(obj);
                if (obj4 == null && !map.containsKey(obj)) {
                    obj3 = obj4;
                }
                obj3 = map.put(obj, obj2);
            }
        }
        return obj3;
    }

    @Override // j$.util.Map
    public final void replaceAll(BiFunction biFunction) {
        synchronized (this.f13349b) {
            java.util.Map map = this.f13348a;
            if (map instanceof Map) {
                ((Map) map).replaceAll(biFunction);
            } else if (map instanceof ConcurrentMap) {
                ConcurrentMap concurrentMap = (ConcurrentMap) map;
                Objects.requireNonNull(biFunction);
                j$.util.concurrent.u uVar = new j$.util.concurrent.u(concurrentMap, biFunction);
                if (concurrentMap instanceof j$.util.concurrent.v) {
                    ((j$.util.concurrent.v) concurrentMap).forEach(uVar);
                } else {
                    j$.time.temporal.k.a(concurrentMap, uVar);
                }
            } else {
                Map.CC.$default$replaceAll(map, biFunction);
            }
        }
    }

    @Override // java.util.Map
    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Override // java.util.Map, j$.util.Map
    public final int size() {
        int size;
        synchronized (this.f13349b) {
            size = this.f13348a.size();
        }
        return size;
    }

    public final String toString() {
        String obj;
        synchronized (this.f13349b) {
            obj = this.f13348a.toString();
        }
        return obj;
    }

    @Override // java.util.Map, j$.util.Map
    public final Collection values() {
        Collection collection;
        Constructor constructor;
        Throwable e10;
        Constructor constructor2;
        Collection collection2;
        synchronized (this.f13349b) {
            if (this.f13352e == null) {
                Collection values = this.f13348a.values();
                Object obj = this.f13349b;
                constructor = DesugarCollections.f13234e;
                if (constructor == null) {
                    collection2 = Collections.synchronizedCollection(values);
                } else {
                    try {
                        constructor2 = DesugarCollections.f13234e;
                        collection2 = (Collection) constructor2.newInstance(values, obj);
                    } catch (IllegalAccessException e11) {
                        e10 = e11;
                        throw new Error("Unable to instantiate a synchronized list.", e10);
                    } catch (InstantiationException e12) {
                        e10 = e12;
                        throw new Error("Unable to instantiate a synchronized list.", e10);
                    } catch (InvocationTargetException e13) {
                        e10 = e13;
                        throw new Error("Unable to instantiate a synchronized list.", e10);
                    }
                }
                this.f13352e = collection2;
            }
            collection = this.f13352e;
        }
        return collection;
    }

    @Override // java.util.Map, j$.util.Map, java.util.concurrent.ConcurrentMap
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        boolean z10;
        synchronized (this.f13349b) {
            java.util.Map map = this.f13348a;
            if (map instanceof Map) {
                z10 = ((Map) map).replace(obj, obj2, obj3);
            } else {
                Object obj4 = map.get(obj);
                if (AbstractC0516o.p(obj4, obj2) && (obj4 != null || map.containsKey(obj))) {
                    map.put(obj, obj3);
                    z10 = true;
                }
                z10 = false;
            }
        }
        return z10;
    }
}
