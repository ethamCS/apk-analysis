package w;

import java.util.Objects;
import w.o0;
/* loaded from: classes.dex */
public final class b<T> extends o0.a<T> {

    /* renamed from: a */
    private final String f24406a;

    /* renamed from: b */
    private final Class<T> f24407b;

    /* renamed from: c */
    private final Object f24408c;

    public b(String str, Class<T> cls, Object obj) {
        Objects.requireNonNull(str, "Null id");
        this.f24406a = str;
        Objects.requireNonNull(cls, "Null valueClass");
        this.f24407b = cls;
        this.f24408c = obj;
    }

    @Override // w.o0.a
    public String c() {
        return this.f24406a;
    }

    @Override // w.o0.a
    public Object d() {
        return this.f24408c;
    }

    @Override // w.o0.a
    public Class<T> e() {
        return this.f24407b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof o0.a)) {
            return false;
        }
        o0.a aVar = (o0.a) obj;
        if (this.f24406a.equals(aVar.c()) && this.f24407b.equals(aVar.e())) {
            Object obj2 = this.f24408c;
            Object d10 = aVar.d();
            if (obj2 == null) {
                if (d10 == null) {
                    return true;
                }
            } else if (obj2.equals(d10)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.f24406a.hashCode() ^ 1000003) * 1000003) ^ this.f24407b.hashCode()) * 1000003;
        Object obj = this.f24408c;
        return hashCode ^ (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "Option{id=" + this.f24406a + ", valueClass=" + this.f24407b + ", token=" + this.f24408c + "}";
    }
}
