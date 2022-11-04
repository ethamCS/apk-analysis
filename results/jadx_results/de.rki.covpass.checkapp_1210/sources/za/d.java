package za;

import hc.t;
import kotlin.Metadata;
import oa.i;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0012B\u0019\b\u0016\u0012\u0006\u0010\u0010\u001a\u00020\u0013\u0012\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0014J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0015"}, d2 = {"Lza/d;", BuildConfig.FLAVOR, "Loa/i;", "a", "b", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "response", "Ljava/lang/Object;", "c", "()Ljava/lang/Object;", "expectedType", "<init>", "(Loa/i;Ljava/lang/Object;)V", "Lkb/a;", "(Lkb/a;Ljava/lang/Object;)V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    private final i f26570a;

    /* renamed from: b */
    private final Object f26571b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public d(kb.a aVar, Object obj) {
        this(new i(aVar.getType(), aVar.a(), aVar.b()), obj);
        t.e(aVar, "expectedType");
        t.e(obj, "response");
    }

    public d(i iVar, Object obj) {
        t.e(iVar, "expectedType");
        t.e(obj, "response");
        this.f26570a = iVar;
        this.f26571b = obj;
    }

    public final i a() {
        return this.f26570a;
    }

    public final Object b() {
        return this.f26571b;
    }

    public final Object c() {
        return this.f26571b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return t.a(this.f26570a, dVar.f26570a) && t.a(this.f26571b, dVar.f26571b);
    }

    public int hashCode() {
        return (this.f26570a.hashCode() * 31) + this.f26571b.hashCode();
    }

    public String toString() {
        return "HttpResponseContainer(expectedType=" + this.f26570a + ", response=" + this.f26571b + ')';
    }
}
