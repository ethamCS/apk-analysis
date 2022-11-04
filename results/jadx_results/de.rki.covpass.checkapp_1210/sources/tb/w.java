package tb;

import java.io.Serializable;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u0001*\u0006\b\u0001\u0010\u0002 \u0001*\u0006\b\u0002\u0010\u0003 \u00012\u00060\u0004j\u0002`\u0005B\u001f\u0012\u0006\u0010\u0012\u001a\u00028\u0000\u0012\u0006\u0010\u0015\u001a\u00028\u0001\u0012\u0006\u0010\u0017\u001a\u00028\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00028\u0000HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00028\u0001HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00028\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003R\u0017\u0010\u0012\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\tR\u0017\u0010\u0015\u001a\u00028\u00018\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\tR\u0017\u0010\u0017\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0018\u0010\t¨\u0006\u001b"}, d2 = {"Ltb/w;", "A", "B", "C", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", BuildConfig.FLAVOR, "toString", "b", "()Ljava/lang/Object;", "c", "e", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "first", "Ljava/lang/Object;", "f", "second", "g", "third", "h", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class w<A, B, C> implements Serializable {

    /* renamed from: c */
    private final A f22178c;

    /* renamed from: d */
    private final B f22179d;

    /* renamed from: q */
    private final C f22180q;

    public w(A a10, B b10, C c10) {
        this.f22178c = a10;
        this.f22179d = b10;
        this.f22180q = c10;
    }

    public final A b() {
        return this.f22178c;
    }

    public final B c() {
        return this.f22179d;
    }

    public final C e() {
        return this.f22180q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        return hc.t.a(this.f22178c, wVar.f22178c) && hc.t.a(this.f22179d, wVar.f22179d) && hc.t.a(this.f22180q, wVar.f22180q);
    }

    public final A f() {
        return this.f22178c;
    }

    public final B g() {
        return this.f22179d;
    }

    public final C h() {
        return this.f22180q;
    }

    public int hashCode() {
        A a10 = this.f22178c;
        int i10 = 0;
        int hashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f22179d;
        int hashCode2 = (hashCode + (b10 == null ? 0 : b10.hashCode())) * 31;
        C c10 = this.f22180q;
        if (c10 != null) {
            i10 = c10.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        return '(' + this.f22178c + ", " + this.f22179d + ", " + this.f22180q + ')';
    }
}
