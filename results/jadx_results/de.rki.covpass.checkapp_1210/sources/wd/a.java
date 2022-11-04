package wd;

import bf.x;
import hc.t;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* loaded from: classes.dex */
public final class a {
    private static final C0441a Companion = new C0441a(null);
    @Deprecated

    /* renamed from: e */
    private static final f f24787e;
    @Deprecated

    /* renamed from: f */
    private static final c f24788f;

    /* renamed from: a */
    private final c f24789a;

    /* renamed from: b */
    private final c f24790b;

    /* renamed from: c */
    private final f f24791c;

    /* renamed from: d */
    private final c f24792d;

    /* renamed from: wd.a$a */
    /* loaded from: classes.dex */
    private static final class C0441a {
        private C0441a() {
        }

        public /* synthetic */ C0441a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        f fVar = h.f24822l;
        f24787e = fVar;
        c k10 = c.k(fVar);
        t.d(k10, "topLevel(LOCAL_NAME)");
        f24788f = k10;
    }

    public a(c cVar, c cVar2, f fVar, c cVar3) {
        t.e(cVar, "packageName");
        t.e(fVar, "callableName");
        this.f24789a = cVar;
        this.f24790b = cVar2;
        this.f24791c = fVar;
        this.f24792d = cVar3;
    }

    public /* synthetic */ a(c cVar, c cVar2, f fVar, c cVar3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, cVar2, fVar, (i10 & 8) != 0 ? null : cVar3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(c cVar, f fVar) {
        this(cVar, null, fVar, null, 8, null);
        t.e(cVar, "packageName");
        t.e(fVar, "callableName");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return t.a(this.f24789a, aVar.f24789a) && t.a(this.f24790b, aVar.f24790b) && t.a(this.f24791c, aVar.f24791c) && t.a(this.f24792d, aVar.f24792d);
    }

    public int hashCode() {
        int hashCode = this.f24789a.hashCode() * 31;
        c cVar = this.f24790b;
        int i10 = 0;
        int hashCode2 = (((hashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + this.f24791c.hashCode()) * 31;
        c cVar2 = this.f24792d;
        if (cVar2 != null) {
            i10 = cVar2.hashCode();
        }
        return hashCode2 + i10;
    }

    public String toString() {
        String D;
        StringBuilder sb2 = new StringBuilder();
        String b10 = this.f24789a.b();
        t.d(b10, "packageName.asString()");
        D = x.D(b10, '.', '/', false, 4, null);
        sb2.append(D);
        sb2.append("/");
        c cVar = this.f24790b;
        if (cVar != null) {
            sb2.append(cVar);
            sb2.append(".");
        }
        sb2.append(this.f24791c);
        String sb3 = sb2.toString();
        t.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
