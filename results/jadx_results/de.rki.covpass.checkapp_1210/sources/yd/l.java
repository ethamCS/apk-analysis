package yd;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.Map;
/* loaded from: classes3.dex */
public class l extends m {

    /* renamed from: e */
    private final q f26154e;

    /* loaded from: classes3.dex */
    public static class b<K> implements Map.Entry<K, Object> {

        /* renamed from: c */
        private Map.Entry<K, l> f26155c;

        private b(Map.Entry<K, l> entry) {
            this.f26155c = entry;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f26155c.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            l value = this.f26155c.getValue();
            if (value == null) {
                return null;
            }
            return value.e();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof q) {
                return this.f26155c.getValue().d((q) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
    }

    /* loaded from: classes3.dex */
    static class c<K> implements Iterator<Map.Entry<K, Object>>, j$.util.Iterator {

        /* renamed from: c */
        private Iterator<Map.Entry<K, Object>> f26156c;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f26156c = it;
        }

        /* renamed from: b */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f26156c.next();
            return next.getValue() instanceof l ? new b(next) : next;
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
            return this.f26156c.hasNext();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            this.f26156c.remove();
        }
    }

    public q e() {
        return c(this.f26154e);
    }

    public boolean equals(Object obj) {
        return e().equals(obj);
    }

    public int hashCode() {
        return e().hashCode();
    }

    public String toString() {
        return e().toString();
    }
}
