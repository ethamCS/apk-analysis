package wc;

import ad.x;
import hc.e0;
import hc.k0;
import hc.t;
import hc.v;
import java.util.List;
import ne.m;
import ne.n;
import oc.k;
import ub.c0;
import xc.h0;
/* loaded from: classes.dex */
public final class f extends uc.h {

    /* renamed from: k */
    static final /* synthetic */ k<Object>[] f24738k = {k0.g(new e0(k0.b(f.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};

    /* renamed from: h */
    private final a f24739h;

    /* renamed from: i */
    private gc.a<b> f24740i;

    /* renamed from: j */
    private final ne.i f24741j;

    /* loaded from: classes.dex */
    public enum a {
        FROM_DEPENDENCIES,
        FROM_CLASS_LOADER,
        FALLBACK
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final h0 f24746a;

        /* renamed from: b */
        private final boolean f24747b;

        public b(h0 h0Var, boolean z10) {
            t.e(h0Var, "ownerModuleDescriptor");
            this.f24746a = h0Var;
            this.f24747b = z10;
        }

        public final h0 a() {
            return this.f24746a;
        }

        public final boolean b() {
            return this.f24747b;
        }
    }

    /* loaded from: classes.dex */
    public /* synthetic */ class c {

        /* renamed from: a */
        public static final /* synthetic */ int[] f24748a;

        static {
            int[] iArr = new int[a.values().length];
            iArr[a.FROM_DEPENDENCIES.ordinal()] = 1;
            iArr[a.FROM_CLASS_LOADER.ordinal()] = 2;
            iArr[a.FALLBACK.ordinal()] = 3;
            f24748a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends v implements gc.a<g> {

        /* renamed from: d */
        final /* synthetic */ n f24750d;

        /* loaded from: classes.dex */
        public static final class a extends v implements gc.a<b> {

            /* renamed from: c */
            final /* synthetic */ f f24751c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar) {
                super(0);
                this.f24751c = fVar;
            }

            /* renamed from: b */
            public final b invoke() {
                gc.a aVar = this.f24751c.f24740i;
                if (aVar != null) {
                    b bVar = (b) aVar.invoke();
                    this.f24751c.f24740i = null;
                    return bVar;
                }
                throw new AssertionError("JvmBuiltins instance has not been initialized properly");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(n nVar) {
            super(0);
            f.this = r1;
            this.f24750d = nVar;
        }

        /* renamed from: b */
        public final g invoke() {
            x r10 = f.this.r();
            t.d(r10, "builtInsModule");
            return new g(r10, this.f24750d, new a(f.this));
        }
    }

    /* loaded from: classes.dex */
    public static final class e extends v implements gc.a<b> {

        /* renamed from: c */
        final /* synthetic */ h0 f24752c;

        /* renamed from: d */
        final /* synthetic */ boolean f24753d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(h0 h0Var, boolean z10) {
            super(0);
            this.f24752c = h0Var;
            this.f24753d = z10;
        }

        /* renamed from: b */
        public final b invoke() {
            return new b(this.f24752c, this.f24753d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(n nVar, a aVar) {
        super(nVar);
        boolean z10;
        t.e(nVar, "storageManager");
        t.e(aVar, "kind");
        this.f24739h = aVar;
        this.f24741j = nVar.d(new d(nVar));
        int i10 = c.f24748a[aVar.ordinal()];
        if (i10 == 2) {
            z10 = false;
        } else if (i10 != 3) {
            return;
        } else {
            z10 = true;
        }
        f(z10);
    }

    /* renamed from: G0 */
    public List<zc.b> v() {
        List<zc.b> n02;
        Iterable<zc.b> v10 = super.v();
        t.d(v10, "super.getClassDescriptorFactories()");
        n U = U();
        t.d(U, "storageManager");
        x r10 = r();
        t.d(r10, "builtInsModule");
        n02 = c0.n0(v10, new wc.e(U, r10, null, 4, null));
        return n02;
    }

    public final g H0() {
        return (g) m.a(this.f24741j, this, f24738k[0]);
    }

    public final void I0(h0 h0Var, boolean z10) {
        t.e(h0Var, "moduleDescriptor");
        J0(new e(h0Var, z10));
    }

    public final void J0(gc.a<b> aVar) {
        t.e(aVar, "computation");
        this.f24740i = aVar;
    }

    @Override // uc.h
    protected zc.c M() {
        return H0();
    }

    @Override // uc.h
    protected zc.a g() {
        return H0();
    }
}
