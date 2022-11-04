package oe;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import xc.d1;
/* loaded from: classes3.dex */
public class l extends b {

    /* renamed from: d */
    private final xc.e f18009d;

    /* renamed from: e */
    private final List<xc.f1> f18010e;

    /* renamed from: f */
    private final Collection<e0> f18011f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(xc.e eVar, List<? extends xc.f1> list, Collection<e0> collection, ne.n nVar) {
        super(nVar);
        if (eVar == null) {
            s(0);
        }
        if (list == null) {
            s(1);
        }
        if (collection == null) {
            s(2);
        }
        if (nVar == null) {
            s(3);
        }
        this.f18009d = eVar;
        this.f18010e = Collections.unmodifiableList(new ArrayList(list));
        this.f18011f = Collections.unmodifiableCollection(collection);
    }

    private static /* synthetic */ void s(int i10) {
        String str = (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "parameters";
                break;
            case 2:
                objArr[0] = "supertypes";
                break;
            case 3:
                objArr[0] = "storageManager";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
                break;
            default:
                objArr[0] = "classDescriptor";
                break;
        }
        if (i10 == 4) {
            objArr[1] = "getParameters";
        } else if (i10 == 5) {
            objArr[1] = "getDeclarationDescriptor";
        } else if (i10 == 6) {
            objArr[1] = "computeSupertypes";
        } else if (i10 != 7) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/ClassTypeConstructorImpl";
        } else {
            objArr[1] = "getSupertypeLoopChecker";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) {
            throw new IllegalStateException(format);
        }
    }

    @Override // oe.e1
    public List<xc.f1> getParameters() {
        List<xc.f1> list = this.f18010e;
        if (list == null) {
            s(4);
        }
        return list;
    }

    @Override // oe.g
    protected Collection<e0> i() {
        Collection<e0> collection = this.f18011f;
        if (collection == null) {
            s(6);
        }
        return collection;
    }

    @Override // oe.g
    protected xc.d1 n() {
        d1.a aVar = d1.a.f25530a;
        if (aVar == null) {
            s(7);
        }
        return aVar;
    }

    @Override // oe.b
    /* renamed from: t */
    public xc.e z() {
        xc.e eVar = this.f18009d;
        if (eVar == null) {
            s(5);
        }
        return eVar;
    }

    public String toString() {
        return ae.d.m(this.f18009d).b();
    }

    @Override // oe.e1
    public boolean y() {
        return true;
    }
}
