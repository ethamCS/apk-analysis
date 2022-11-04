package he;

import hc.t;
import hc.v;
/* loaded from: classes3.dex */
public final class g extends he.a {

    /* renamed from: a */
    private final ne.i<h> f11868a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends v implements gc.a<h> {

        /* renamed from: c */
        final /* synthetic */ gc.a<h> f11869c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(gc.a<? extends h> aVar) {
            super(0);
            this.f11869c = aVar;
        }

        /* renamed from: b */
        public final h invoke() {
            h invoke = this.f11869c.invoke();
            return invoke instanceof he.a ? ((he.a) invoke).h() : invoke;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(gc.a<? extends h> aVar) {
        this(null, aVar, 1, null);
        t.e(aVar, "getScope");
    }

    public g(ne.n nVar, gc.a<? extends h> aVar) {
        t.e(nVar, "storageManager");
        t.e(aVar, "getScope");
        this.f11868a = nVar.d(new a(aVar));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ g(ne.n r1, gc.a r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 1
            if (r3 == 0) goto Lb
            ne.n r1 = ne.f.f16977e
            java.lang.String r3 = "NO_LOCKS"
            hc.t.d(r1, r3)
        Lb:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: he.g.<init>(ne.n, gc.a, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @Override // he.a
    protected h i() {
        return this.f11868a.invoke();
    }
}
