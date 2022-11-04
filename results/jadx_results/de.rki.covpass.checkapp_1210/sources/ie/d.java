package ie;

import oe.e0;
/* loaded from: classes3.dex */
public class d extends a {

    /* renamed from: c */
    private final xc.a f12508c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(xc.a aVar, e0 e0Var, f fVar) {
        super(e0Var, fVar);
        if (aVar == null) {
            b(0);
        }
        if (e0Var == null) {
            b(1);
        }
        this.f12508c = aVar;
    }

    private static /* synthetic */ void b(int i10) {
        String str = i10 != 2 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i10 != 2 ? 3 : 2];
        if (i10 == 1) {
            objArr[0] = "receiverType";
        } else if (i10 == 2) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else if (i10 != 3) {
            objArr[0] = "callableDescriptor";
        } else {
            objArr[0] = "newType";
        }
        if (i10 != 2) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/scopes/receivers/ExtensionReceiver";
        } else {
            objArr[1] = "getDeclarationDescriptor";
        }
        if (i10 != 2) {
            if (i10 != 3) {
                objArr[2] = "<init>";
            } else {
                objArr[2] = "replaceType";
            }
        }
        String format = String.format(str, objArr);
        if (i10 != 2) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public String toString() {
        return getType() + ": Ext {" + this.f12508c + "}";
    }
}
