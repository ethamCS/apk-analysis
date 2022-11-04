package uc;

import hc.e0;
import hc.t;
import hc.v;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.a1;
import oe.f0;
import oe.s0;
import ub.c0;
import uc.k;
import xc.f1;
import xc.h0;
import xc.k0;
import xc.x;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a */
    private final k0 f23429a;

    /* renamed from: b */
    private final Lazy f23430b;

    /* renamed from: c */
    private final a f23431c = new a(1);

    /* renamed from: d */
    private final a f23432d = new a(1);

    /* renamed from: e */
    private final a f23433e = new a(1);

    /* renamed from: f */
    private final a f23434f = new a(2);

    /* renamed from: g */
    private final a f23435g = new a(3);

    /* renamed from: h */
    private final a f23436h = new a(1);

    /* renamed from: i */
    private final a f23437i = new a(2);

    /* renamed from: j */
    private final a f23438j = new a(3);

    /* renamed from: k */
    static final /* synthetic */ oc.k<Object>[] f23428k = {hc.k0.g(new e0(hc.k0.b(j.class), "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), hc.k0.g(new e0(hc.k0.b(j.class), "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), hc.k0.g(new e0(hc.k0.b(j.class), "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), hc.k0.g(new e0(hc.k0.b(j.class), "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), hc.k0.g(new e0(hc.k0.b(j.class), "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), hc.k0.g(new e0(hc.k0.b(j.class), "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), hc.k0.g(new e0(hc.k0.b(j.class), "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;")), hc.k0.g(new e0(hc.k0.b(j.class), "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"))};
    public static final b Companion = new b(null);

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final int f23439a;

        public a(int i10) {
            this.f23439a = i10;
        }

        public final xc.e a(j jVar, oc.k<?> kVar) {
            t.e(jVar, "types");
            t.e(kVar, "property");
            return jVar.b(we.a.a(kVar.getName()), this.f23439a);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final oe.e0 a(h0 h0Var) {
            Object s02;
            List d10;
            t.e(h0Var, "module");
            xc.e a10 = x.a(h0Var, k.a.f23502s0);
            if (a10 == null) {
                return null;
            }
            a1 h10 = a1.Companion.h();
            List<f1> parameters = a10.r().getParameters();
            t.d(parameters, "kPropertyClass.typeConstructor.parameters");
            s02 = c0.s0(parameters);
            t.d(s02, "kPropertyClass.typeConstructor.parameters.single()");
            d10 = ub.t.d(new s0((f1) s02));
            return f0.g(h10, a10, d10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends v implements gc.a<he.h> {

        /* renamed from: c */
        final /* synthetic */ h0 f23440c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(h0 h0Var) {
            super(0);
            this.f23440c = h0Var;
        }

        /* renamed from: b */
        public final he.h invoke() {
            return this.f23440c.F(k.f23455o).z();
        }
    }

    public j(h0 h0Var, k0 k0Var) {
        Lazy b10;
        t.e(h0Var, "module");
        t.e(k0Var, "notFoundClasses");
        this.f23429a = k0Var;
        b10 = tb.m.b(tb.o.PUBLICATION, new c(h0Var));
        this.f23430b = b10;
    }

    public final xc.e b(String str, int i10) {
        List<Integer> d10;
        wd.f j10 = wd.f.j(str);
        t.d(j10, "identifier(className)");
        xc.h f10 = d().f(j10, fd.d.FROM_REFLECTION);
        xc.e eVar = f10 instanceof xc.e ? (xc.e) f10 : null;
        if (eVar == null) {
            k0 k0Var = this.f23429a;
            wd.b bVar = new wd.b(k.f23455o, j10);
            d10 = ub.t.d(Integer.valueOf(i10));
            return k0Var.d(bVar, d10);
        }
        return eVar;
    }

    private final he.h d() {
        return (he.h) this.f23430b.getValue();
    }

    public final xc.e c() {
        return this.f23431c.a(this, f23428k[0]);
    }
}
