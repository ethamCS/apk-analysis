package com.google.crypto.tink.shaded.protobuf;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes.dex */
public class e0 extends f0 {

    /* renamed from: f */
    private final s0 f7850f;

    /* loaded from: classes.dex */
    public static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: c */
        private Map.Entry<K, e0> f7851c;

        private b(Map.Entry<K, e0> entry) {
            this.f7851c = entry;
        }

        public e0 a() {
            return this.f7851c.getValue();
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f7851c.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            e0 value = this.f7851c.getValue();
            if (value == null) {
                return null;
            }
            return value.f();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof s0) {
                return this.f7851c.getValue().d((s0) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c<K> implements Iterator<Map.Entry<K, Object>>, j$.util.Iterator {

        /* renamed from: c */
        private Iterator<Map.Entry<K, Object>> f7852c;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f7852c = it;
        }

        /* renamed from: b */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f7852c.next();
            return next.getValue() instanceof e0 ? new b(next) : next;
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            return this.f7852c.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            this.f7852c.remove();
        }
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public boolean equals(Object obj) {
        return f().equals(obj);
    }

    public s0 f() {
        return c(this.f7850f);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.f0
    public int hashCode() {
        return f().hashCode();
    }

    public String toString() {
        return f().toString();
    }
}
