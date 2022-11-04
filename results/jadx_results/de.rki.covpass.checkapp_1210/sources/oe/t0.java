package oe;

import java.util.ArrayList;
import java.util.List;
/* loaded from: classes3.dex */
public final class t0 {

    /* loaded from: classes3.dex */
    public static final class a extends f1 {

        /* renamed from: b */
        final /* synthetic */ List<e1> f18046b;

        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends e1> list) {
            this.f18046b = list;
        }

        @Override // oe.f1
        public g1 k(e1 e1Var) {
            hc.t.e(e1Var, "key");
            if (this.f18046b.contains(e1Var)) {
                xc.h z10 = e1Var.z();
                hc.t.c(z10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
                return n1.s((xc.f1) z10);
            }
            return null;
        }
    }

    private static final e0 a(List<? extends e1> list, List<? extends e0> list2, uc.h hVar) {
        Object V;
        l1 g10 = l1.g(new a(list));
        V = ub.c0.V(list2);
        e0 p10 = g10.p((e0) V, r1.OUT_VARIANCE);
        if (p10 == null) {
            p10 = hVar.y();
        }
        hc.t.d(p10, "typeParameters: List<Typ… ?: builtIns.defaultBound");
        return p10;
    }

    public static final e0 b(xc.f1 f1Var) {
        ArrayList arrayList;
        int s10;
        int s11;
        hc.t.e(f1Var, "<this>");
        xc.m b10 = f1Var.b();
        hc.t.d(b10, "this.containingDeclaration");
        if (b10 instanceof xc.i) {
            List<xc.f1> parameters = ((xc.i) b10).r().getParameters();
            hc.t.d(parameters, "descriptor.typeConstructor.parameters");
            s11 = ub.v.s(parameters, 10);
            arrayList = new ArrayList(s11);
            for (xc.f1 f1Var2 : parameters) {
                e1 r10 = f1Var2.r();
                hc.t.d(r10, "it.typeConstructor");
                arrayList.add(r10);
            }
        } else if (!(b10 instanceof xc.y)) {
            throw new IllegalArgumentException("Unsupported descriptor type to build star projection type based on type parameters of it");
        } else {
            List<xc.f1> p10 = ((xc.y) b10).p();
            hc.t.d(p10, "descriptor.typeParameters");
            s10 = ub.v.s(p10, 10);
            arrayList = new ArrayList(s10);
            for (xc.f1 f1Var3 : p10) {
                e1 r11 = f1Var3.r();
                hc.t.d(r11, "it.typeConstructor");
                arrayList.add(r11);
            }
        }
        List<e0> upperBounds = f1Var.getUpperBounds();
        hc.t.d(upperBounds, "upperBounds");
        return a(arrayList, upperBounds, ee.a.f(f1Var));
    }
}
