package ad;

import xc.a1;
/* loaded from: classes.dex */
public abstract class n0 extends m0 {
    private final boolean U3;
    protected ne.j<ce.g<?>> V3;
    protected gc.a<ne.j<ce.g<?>>> W3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(xc.m mVar, yc.g gVar, wd.f fVar, oe.e0 e0Var, boolean z10, a1 a1Var) {
        super(mVar, gVar, fVar, e0Var, a1Var);
        if (mVar == null) {
            e0(0);
        }
        if (gVar == null) {
            e0(1);
        }
        if (fVar == null) {
            e0(2);
        }
        if (a1Var == null) {
            e0(3);
        }
        this.U3 = z10;
    }

    private static /* synthetic */ void e0(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1) {
            objArr[0] = "annotations";
        } else if (i10 == 2) {
            objArr[0] = "name";
        } else if (i10 == 3) {
            objArr[0] = "source";
        } else if (i10 == 4 || i10 == 5) {
            objArr[0] = "compileTimeInitializerFactory";
        } else {
            objArr[0] = "containingDeclaration";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorWithInitializerImpl";
        if (i10 == 4) {
            objArr[2] = "setCompileTimeInitializerFactory";
        } else if (i10 != 5) {
            objArr[2] = "<init>";
        } else {
            objArr[2] = "setCompileTimeInitializer";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // xc.k1
    public ce.g<?> J0() {
        ne.j<ce.g<?>> jVar = this.V3;
        if (jVar != null) {
            return jVar.invoke();
        }
        return null;
    }

    @Override // xc.k1
    public boolean Q() {
        return this.U3;
    }

    public void T0(ne.j<ce.g<?>> jVar, gc.a<ne.j<ce.g<?>>> aVar) {
        if (aVar == null) {
            e0(5);
        }
        this.W3 = aVar;
        if (jVar == null) {
            jVar = aVar.invoke();
        }
        this.V3 = jVar;
    }

    public void U0(gc.a<ne.j<ce.g<?>>> aVar) {
        if (aVar == null) {
            e0(4);
        }
        T0(null, aVar);
    }
}
