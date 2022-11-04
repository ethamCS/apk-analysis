package kb;

import hc.t;
import java.lang.reflect.Type;
import kotlin.Metadata;
import oc.d;
import oc.n;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n\u0012\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u001e\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001e\u0010\u0011\u001a\u00060\u000fj\u0002`\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lkb/b;", "Lkb/a;", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "Loc/d;", "type", "Loc/d;", "getType", "()Loc/d;", "Ljava/lang/reflect/Type;", "Lio/ktor/util/reflect/Type;", "reifiedType", "Ljava/lang/reflect/Type;", "a", "()Ljava/lang/reflect/Type;", "Loc/n;", "kotlinType", "Loc/n;", "b", "()Loc/n;", "<init>", "(Loc/d;Ljava/lang/reflect/Type;Loc/n;)V", "ktor-utils"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class b implements a {

    /* renamed from: a */
    private final d<?> f14867a;

    /* renamed from: b */
    private final Type f14868b;

    /* renamed from: c */
    private final n f14869c;

    public b(d<?> dVar, Type type, n nVar) {
        t.e(dVar, "type");
        t.e(type, "reifiedType");
        this.f14867a = dVar;
        this.f14868b = type;
        this.f14869c = nVar;
    }

    @Override // kb.a
    public Type a() {
        return this.f14868b;
    }

    @Override // kb.a
    public n b() {
        return this.f14869c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return t.a(getType(), bVar.getType()) && t.a(a(), bVar.a()) && t.a(b(), bVar.b());
    }

    @Override // kb.a
    public d<?> getType() {
        return this.f14867a;
    }

    public int hashCode() {
        return (((getType().hashCode() * 31) + a().hashCode()) * 31) + (b() == null ? 0 : b().hashCode());
    }

    public String toString() {
        return "TypeInfoImpl(type=" + getType() + ", reifiedType=" + a() + ", kotlinType=" + b() + ')';
    }
}
