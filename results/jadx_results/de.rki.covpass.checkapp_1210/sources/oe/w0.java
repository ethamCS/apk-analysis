package oe;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
/* loaded from: classes3.dex */
public final class w0 {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final w0 f18054a;

    /* renamed from: b */
    private final xc.e1 f18055b;

    /* renamed from: c */
    private final List<g1> f18056c;

    /* renamed from: d */
    private final Map<xc.f1, g1> f18057d;

    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final w0 a(w0 w0Var, xc.e1 e1Var, List<? extends g1> list) {
            int s10;
            List M0;
            Map q10;
            hc.t.e(e1Var, "typeAliasDescriptor");
            hc.t.e(list, "arguments");
            List<xc.f1> parameters = e1Var.r().getParameters();
            hc.t.d(parameters, "typeAliasDescriptor.typeConstructor.parameters");
            s10 = ub.v.s(parameters, 10);
            ArrayList arrayList = new ArrayList(s10);
            for (xc.f1 f1Var : parameters) {
                arrayList.add(f1Var.a());
            }
            M0 = ub.c0.M0(arrayList, list);
            q10 = ub.q0.q(M0);
            return new w0(w0Var, e1Var, list, q10, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private w0(w0 w0Var, xc.e1 e1Var, List<? extends g1> list, Map<xc.f1, ? extends g1> map) {
        this.f18054a = w0Var;
        this.f18055b = e1Var;
        this.f18056c = list;
        this.f18057d = map;
    }

    public /* synthetic */ w0(w0 w0Var, xc.e1 e1Var, List list, Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(w0Var, e1Var, list, map);
    }

    public final List<g1> a() {
        return this.f18056c;
    }

    public final xc.e1 b() {
        return this.f18055b;
    }

    public final g1 c(e1 e1Var) {
        hc.t.e(e1Var, "constructor");
        xc.h z10 = e1Var.z();
        if (z10 instanceof xc.f1) {
            return this.f18057d.get(z10);
        }
        return null;
    }

    public final boolean d(xc.e1 e1Var) {
        hc.t.e(e1Var, "descriptor");
        if (!hc.t.a(this.f18055b, e1Var)) {
            w0 w0Var = this.f18054a;
            if (!(w0Var != null ? w0Var.d(e1Var) : false)) {
                return false;
            }
        }
        return true;
    }
}
