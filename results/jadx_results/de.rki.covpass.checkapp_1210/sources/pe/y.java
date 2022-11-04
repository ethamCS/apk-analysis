package pe;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.List;
import oe.e0;
import oe.e1;
import oe.f1;
import oe.g1;
import oe.n1;
import oe.r1;
/* loaded from: classes3.dex */
public final class y {
    private static final e0 a(e0 e0Var) {
        return ue.b.a(e0Var).d();
    }

    private static final String b(e1 e1Var) {
        StringBuilder sb2 = new StringBuilder();
        c("type: " + e1Var, sb2);
        c("hashCode: " + e1Var.hashCode(), sb2);
        c("javaClass: " + e1Var.getClass().getCanonicalName(), sb2);
        for (xc.m z10 = e1Var.z(); z10 != null; z10 = z10.b()) {
            c("fqName: " + zd.c.f26620f.q(z10), sb2);
            c("javaClass: " + z10.getClass().getCanonicalName(), sb2);
        }
        String sb3 = sb2.toString();
        hc.t.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    private static final StringBuilder c(String str, StringBuilder sb2) {
        hc.t.e(str, "<this>");
        sb2.append(str);
        hc.t.d(sb2, "append(value)");
        sb2.append('\n');
        hc.t.d(sb2, "append('\\n')");
        return sb2;
    }

    public static final e0 d(e0 e0Var, e0 e0Var2, v vVar) {
        e1 W0;
        boolean z10;
        boolean z11;
        hc.t.e(e0Var, "subtype");
        hc.t.e(e0Var2, "supertype");
        hc.t.e(vVar, "typeCheckingProcedureCallbacks");
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(new s(e0Var, null));
        e1 W02 = e0Var2.W0();
        while (!arrayDeque.isEmpty()) {
            s sVar = (s) arrayDeque.poll();
            e0 b10 = sVar.b();
            e1 W03 = b10.W0();
            if (vVar.a(W03, W02)) {
                boolean X0 = b10.X0();
                while (true) {
                    sVar = sVar.a();
                    if (sVar == null) {
                        break;
                    }
                    e0 b11 = sVar.b();
                    List<g1> U0 = b11.U0();
                    if (!(U0 instanceof Collection) || !U0.isEmpty()) {
                        for (g1 g1Var : U0) {
                            if (g1Var.b() != r1.INVARIANT) {
                                z11 = true;
                                continue;
                            } else {
                                z11 = false;
                                continue;
                            }
                            if (z11) {
                                z10 = true;
                                break;
                            }
                        }
                    }
                    z10 = false;
                    if (z10) {
                        e0 n10 = be.d.f(f1.Companion.a(b11), false, 1, null).c().n(b10, r1.INVARIANT);
                        hc.t.d(n10, "TypeConstructorSubstitut…uted, Variance.INVARIANT)");
                        b10 = a(n10);
                    } else {
                        b10 = f1.Companion.a(b11).c().n(b10, r1.INVARIANT);
                        hc.t.d(b10, "{\n                    Ty…ARIANT)\n                }");
                    }
                    X0 = X0 || b11.X0();
                }
                if (vVar.a(b10.W0(), W02)) {
                    return n1.p(b10, X0);
                }
                throw new AssertionError("Type constructors should be equals!\nsubstitutedSuperType: " + b(W0) + ", \n\nsupertype: " + b(W02) + " \n" + vVar.a(W0, W02));
            }
            for (e0 e0Var3 : W03.l()) {
                hc.t.d(e0Var3, "immediateSupertype");
                arrayDeque.add(new s(e0Var3, sVar));
            }
        }
        return null;
    }
}
