package pd;

import kotlin.jvm.internal.DefaultConstructorMarker;
import ud.a;
import vd.d;
/* loaded from: classes.dex */
public final class t {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f19139a;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @fc.c
        public final t a(String str, String str2) {
            hc.t.e(str, "name");
            hc.t.e(str2, "desc");
            return new t(str + '#' + str2, null);
        }

        @fc.c
        public final t b(vd.d dVar) {
            hc.t.e(dVar, "signature");
            if (dVar instanceof d.b) {
                return d(dVar.c(), dVar.b());
            }
            if (!(dVar instanceof d.a)) {
                throw new tb.p();
            }
            return a(dVar.c(), dVar.b());
        }

        @fc.c
        public final t c(td.c cVar, a.c cVar2) {
            hc.t.e(cVar, "nameResolver");
            hc.t.e(cVar2, "signature");
            return d(cVar.getString(cVar2.V()), cVar.getString(cVar2.N()));
        }

        @fc.c
        public final t d(String str, String str2) {
            hc.t.e(str, "name");
            hc.t.e(str2, "desc");
            return new t(str + str2, null);
        }

        @fc.c
        public final t e(t tVar, int i10) {
            hc.t.e(tVar, "signature");
            return new t(tVar.a() + '@' + i10, null);
        }
    }

    private t(String str) {
        this.f19139a = str;
    }

    public /* synthetic */ t(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    public final String a() {
        return this.f19139a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t) && hc.t.a(this.f19139a, ((t) obj).f19139a);
    }

    public int hashCode() {
        return this.f19139a.hashCode();
    }

    public String toString() {
        return "MemberSignature(signature=" + this.f19139a + ')';
    }
}
