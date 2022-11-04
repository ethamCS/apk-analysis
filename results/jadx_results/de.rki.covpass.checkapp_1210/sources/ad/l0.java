package ad;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.l1;
import xc.a1;
import xc.j1;
import xc.k1;
/* loaded from: classes.dex */
public class l0 extends m0 implements j1 {
    public static final a Companion = new a(null);
    private final int U3;
    private final boolean V3;
    private final boolean W3;
    private final boolean X3;
    private final oe.e0 Y3;
    private final j1 Z3;

    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @fc.c
        public final l0 a(xc.a aVar, j1 j1Var, int i10, yc.g gVar, wd.f fVar, oe.e0 e0Var, boolean z10, boolean z11, boolean z12, oe.e0 e0Var2, a1 a1Var, gc.a<? extends List<? extends k1>> aVar2) {
            hc.t.e(aVar, "containingDeclaration");
            hc.t.e(gVar, "annotations");
            hc.t.e(fVar, "name");
            hc.t.e(e0Var, "outType");
            hc.t.e(a1Var, "source");
            return aVar2 == null ? new l0(aVar, j1Var, i10, gVar, fVar, e0Var, z10, z11, z12, e0Var2, a1Var) : new b(aVar, j1Var, i10, gVar, fVar, e0Var, z10, z11, z12, e0Var2, a1Var, aVar2);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends l0 {

        /* renamed from: a4 */
        private final Lazy f328a4;

        /* loaded from: classes.dex */
        static final class a extends hc.v implements gc.a<List<? extends k1>> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a() {
                super(0);
                b.this = r1;
            }

            @Override // gc.a
            public final List<? extends k1> invoke() {
                return b.this.W0();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(xc.a aVar, j1 j1Var, int i10, yc.g gVar, wd.f fVar, oe.e0 e0Var, boolean z10, boolean z11, boolean z12, oe.e0 e0Var2, a1 a1Var, gc.a<? extends List<? extends k1>> aVar2) {
            super(aVar, j1Var, i10, gVar, fVar, e0Var, z10, z11, z12, e0Var2, a1Var);
            Lazy a10;
            hc.t.e(aVar, "containingDeclaration");
            hc.t.e(gVar, "annotations");
            hc.t.e(fVar, "name");
            hc.t.e(e0Var, "outType");
            hc.t.e(a1Var, "source");
            hc.t.e(aVar2, "destructuringVariables");
            a10 = tb.m.a(aVar2);
            this.f328a4 = a10;
        }

        @Override // ad.l0, xc.j1
        public j1 N0(xc.a aVar, wd.f fVar, int i10) {
            hc.t.e(aVar, "newOwner");
            hc.t.e(fVar, "newName");
            yc.g j10 = j();
            hc.t.d(j10, "annotations");
            oe.e0 type = getType();
            hc.t.d(type, "type");
            boolean k02 = k0();
            boolean C = C();
            boolean K0 = K0();
            oe.e0 R = R();
            a1 a1Var = a1.f25519a;
            hc.t.d(a1Var, "NO_SOURCE");
            return new b(aVar, null, i10, j10, fVar, type, k02, C, K0, R, a1Var, new a());
        }

        public final List<k1> W0() {
            return (List) this.f328a4.getValue();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(xc.a aVar, j1 j1Var, int i10, yc.g gVar, wd.f fVar, oe.e0 e0Var, boolean z10, boolean z11, boolean z12, oe.e0 e0Var2, a1 a1Var) {
        super(aVar, gVar, fVar, e0Var, a1Var);
        hc.t.e(aVar, "containingDeclaration");
        hc.t.e(gVar, "annotations");
        hc.t.e(fVar, "name");
        hc.t.e(e0Var, "outType");
        hc.t.e(a1Var, "source");
        this.U3 = i10;
        this.V3 = z10;
        this.W3 = z11;
        this.X3 = z12;
        this.Y3 = e0Var2;
        this.Z3 = j1Var == null ? this : j1Var;
    }

    @fc.c
    public static final l0 T0(xc.a aVar, j1 j1Var, int i10, yc.g gVar, wd.f fVar, oe.e0 e0Var, boolean z10, boolean z11, boolean z12, oe.e0 e0Var2, a1 a1Var, gc.a<? extends List<? extends k1>> aVar2) {
        return Companion.a(aVar, j1Var, i10, gVar, fVar, e0Var, z10, z11, z12, e0Var2, a1Var, aVar2);
    }

    @Override // xc.j1
    public boolean C() {
        return this.W3;
    }

    @Override // xc.k1
    public /* bridge */ /* synthetic */ ce.g J0() {
        return (ce.g) U0();
    }

    @Override // xc.j1
    public boolean K0() {
        return this.X3;
    }

    @Override // xc.j1
    public j1 N0(xc.a aVar, wd.f fVar, int i10) {
        hc.t.e(aVar, "newOwner");
        hc.t.e(fVar, "newName");
        yc.g j10 = j();
        hc.t.d(j10, "annotations");
        oe.e0 type = getType();
        hc.t.d(type, "type");
        boolean k02 = k0();
        boolean C = C();
        boolean K0 = K0();
        oe.e0 R = R();
        a1 a1Var = a1.f25519a;
        hc.t.d(a1Var, "NO_SOURCE");
        return new l0(aVar, null, i10, j10, fVar, type, k02, C, K0, R, a1Var);
    }

    @Override // xc.k1
    public boolean Q() {
        return false;
    }

    @Override // xc.j1
    public oe.e0 R() {
        return this.Y3;
    }

    public Void U0() {
        return null;
    }

    /* renamed from: V0 */
    public j1 c(l1 l1Var) {
        hc.t.e(l1Var, "substitutor");
        if (l1Var.k()) {
            return this;
        }
        throw new UnsupportedOperationException();
    }

    @Override // ad.k, ad.j, xc.m, xc.h
    /* renamed from: a */
    public j1 z0() {
        j1 j1Var = this.Z3;
        return j1Var == this ? this : j1Var.a();
    }

    @Override // ad.k, xc.m, xc.n, xc.y, xc.l
    public xc.a b() {
        xc.m b10 = super.b();
        hc.t.c(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor");
        return (xc.a) b10;
    }

    @Override // xc.a
    public Collection<j1> f() {
        int s10;
        Collection<? extends xc.a> f10 = b().f();
        hc.t.d(f10, "containingDeclaration.overriddenDescriptors");
        s10 = ub.v.s(f10, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (xc.a aVar : f10) {
            arrayList.add(aVar.o().get(l()));
        }
        return arrayList;
    }

    @Override // xc.q, xc.d0
    public xc.u g() {
        xc.u uVar = xc.t.f25582f;
        hc.t.d(uVar, "LOCAL");
        return uVar;
    }

    @Override // xc.m
    public <R, D> R g0(xc.o<R, D> oVar, D d10) {
        hc.t.e(oVar, "visitor");
        return oVar.m(this, d10);
    }

    @Override // xc.j1
    public boolean k0() {
        if (this.V3) {
            xc.a b10 = b();
            hc.t.c(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor");
            if (((xc.b) b10).h().b()) {
                return true;
            }
        }
        return false;
    }

    @Override // xc.j1
    public int l() {
        return this.U3;
    }
}
