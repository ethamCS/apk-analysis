package ie;

import oe.e0;
/* loaded from: classes3.dex */
public abstract class a implements f {

    /* renamed from: a */
    protected final e0 f12504a;

    /* renamed from: b */
    private final f f12505b;

    public a(e0 e0Var, f fVar) {
        if (e0Var == null) {
            b(0);
        }
        this.f12504a = e0Var;
        this.f12505b = fVar == null ? this : fVar;
    }

    private static /* synthetic */ void b(int i10) {
        String str = (i10 == 1 || i10 == 2) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2) ? 2 : 3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[0] = "receiverType";
        }
        if (i10 == 1) {
            objArr[1] = "getType";
        } else if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/AbstractReceiverValue";
        } else {
            objArr[1] = "getOriginal";
        }
        if (i10 != 1 && i10 != 2) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 == 1 || i10 == 2) {
            throw new IllegalStateException(format);
        }
    }

    @Override // ie.f
    public e0 getType() {
        e0 e0Var = this.f12504a;
        if (e0Var == null) {
            b(1);
        }
        return e0Var;
    }
}
