package j$.util.concurrent;

import java.util.Map;
/* loaded from: classes2.dex */
public class m implements Map.Entry {

    /* renamed from: a */
    final int f13314a;

    /* renamed from: b */
    final Object f13315b;

    /* renamed from: c */
    volatile Object f13316c;

    /* renamed from: d */
    volatile m f13317d;

    public m(int i10, Object obj, Object obj2, m mVar) {
        this.f13314a = i10;
        this.f13315b = obj;
        this.f13316c = obj2;
        this.f13317d = mVar;
    }

    public m a(int i10, Object obj) {
        Object obj2;
        if (obj != null) {
            m mVar = this;
            do {
                if (mVar.f13314a == i10 && ((obj2 = mVar.f13315b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return mVar;
                }
                mVar = mVar.f13317d;
            } while (mVar != null);
            return null;
        }
        return null;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        Map.Entry entry;
        Object key;
        Object value;
        Object obj2;
        Object obj3;
        return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f13315b) || key.equals(obj2)) && (value == (obj3 = this.f13316c) || value.equals(obj3));
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f13315b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f13316c;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f13315b.hashCode() ^ this.f13316c.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        return this.f13315b + "=" + this.f13316c;
    }
}
