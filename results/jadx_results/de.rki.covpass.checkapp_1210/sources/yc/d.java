package yc;

import java.util.Map;
import oe.e0;
import xc.a1;
import yc.c;
/* loaded from: classes.dex */
public class d implements c {

    /* renamed from: a */
    private final e0 f26025a;

    /* renamed from: b */
    private final Map<wd.f, ce.g<?>> f26026b;

    /* renamed from: c */
    private final a1 f26027c;

    public d(e0 e0Var, Map<wd.f, ce.g<?>> map, a1 a1Var) {
        if (e0Var == null) {
            c(0);
        }
        if (map == null) {
            c(1);
        }
        if (a1Var == null) {
            c(2);
        }
        this.f26025a = e0Var;
        this.f26026b = map;
        this.f26027c = a1Var;
    }

    private static /* synthetic */ void c(int i10) {
        String str = (i10 == 3 || i10 == 4 || i10 == 5) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 3 || i10 == 4 || i10 == 5) ? 2 : 3];
        if (i10 == 1) {
            objArr[0] = "valueArguments";
        } else if (i10 == 2) {
            objArr[0] = "source";
        } else if (i10 == 3 || i10 == 4 || i10 == 5) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[0] = "annotationType";
        }
        if (i10 == 3) {
            objArr[1] = "getType";
        } else if (i10 == 4) {
            objArr[1] = "getAllValueArguments";
        } else if (i10 != 5) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/annotations/AnnotationDescriptorImpl";
        } else {
            objArr[1] = "getSource";
        }
        if (i10 != 3 && i10 != 4 && i10 != 5) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 == 3 || i10 == 4 || i10 == 5) {
            throw new IllegalStateException(format);
        }
    }

    @Override // yc.c
    public Map<wd.f, ce.g<?>> b() {
        Map<wd.f, ce.g<?>> map = this.f26026b;
        if (map == null) {
            c(4);
        }
        return map;
    }

    @Override // yc.c
    public wd.c d() {
        return c.a.a(this);
    }

    @Override // yc.c
    public e0 getType() {
        e0 e0Var = this.f26025a;
        if (e0Var == null) {
            c(3);
        }
        return e0Var;
    }

    @Override // yc.c
    public a1 m() {
        a1 a1Var = this.f26027c;
        if (a1Var == null) {
            c(5);
        }
        return a1Var;
    }

    public String toString() {
        return zd.c.f26620f.r(this, null);
    }
}
