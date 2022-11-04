package hl;

import hl.b;
import il.e;
import il.f;
import il.i;
import il.j;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import rk.c0;
import rk.e0;
import rk.n;
/* loaded from: classes3.dex */
public abstract class b<T extends b<T>> implements Serializable {

    /* renamed from: c */
    protected c0 f12233c;

    /* renamed from: d */
    protected d f12234d;

    /* renamed from: q */
    protected transient hl.a f12235q = new hl.a();

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12236a;

        static {
            int[] iArr = new int[e0.values().length];
            f12236a = iArr;
            try {
                iArr[e0.DDRM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12236a[e0.FDRM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12236a[e0.ZDRM.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12236a[e0.CDRM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12236a[e0.DSCC.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f12236a[e0.FSCC.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    protected static d h(e0 e0Var) {
        switch (a.f12236a[e0Var.ordinal()]) {
            case 1:
                return new il.b();
            case 2:
                return new f();
            case 3:
                return new j();
            case 4:
                return new il.a();
            case 5:
                return new e();
            case 6:
                return new i();
            default:
                throw new RuntimeException("Unknown Matrix Type. " + e0Var);
        }
    }

    protected abstract T b(int i10, int i11, e0 e0Var);

    Method c(String str, Object... objArr) {
        boolean z10;
        Method[] methods = this.f12234d.getClass().getMethods();
        for (int i10 = 0; i10 < methods.length; i10++) {
            if (methods[i10].getName().equals(str)) {
                Class<?>[] parameterTypes = methods[i10].getParameterTypes();
                if (parameterTypes.length != objArr.length) {
                    continue;
                } else {
                    for (int i11 = 0; i11 < parameterTypes.length; i11++) {
                        if (objArr[i11] instanceof Class) {
                            if (parameterTypes[i11] != objArr[i11]) {
                                z10 = false;
                                break;
                            }
                        } else if (parameterTypes[i11] != objArr[i11].getClass()) {
                            z10 = false;
                            break;
                        }
                    }
                    z10 = true;
                    if (z10) {
                        return methods[i10];
                    }
                }
            }
        }
        return null;
    }

    public n e() {
        e0 type = this.f12233c.getType();
        e0 e0Var = e0.DDRM;
        return (n) (type == e0Var ? this.f12233c : gl.b.a(this.f12233c, e0Var));
    }

    public <InnerType extends c0> InnerType f() {
        return (InnerType) this.f12233c;
    }

    public void g(Method method, Object... objArr) {
        try {
            method.invoke(this.f12234d, objArr);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    public e0 getType() {
        return this.f12233c.getType();
    }

    public T i(T t10) {
        Method c10;
        this.f12235q.b(this, t10);
        if (this.f12233c.getType() != t10.getType() && (c10 = c("mult", this.f12233c, t10.f12233c, this.f12235q.f12232a.h())) != null) {
            T k10 = k(this.f12235q.f12232a.T(1, 1));
            g(c10, this.f12233c, t10.f12233c, k10.f12233c);
            return k10;
        }
        b a10 = this.f12235q.a(this);
        b a11 = this.f12235q.a(t10);
        T t11 = (T) a10.b(this.f12233c.Z(), a11.f().w(), a10.getType());
        a10.f12234d.H(a10.f12233c, a11.f12233c, t11.f12233c);
        return t11;
    }

    public void j(c0 c0Var) {
        this.f12233c = c0Var;
        this.f12234d = h(c0Var.getType());
    }

    public abstract T k(c0 c0Var);

    public String toString() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        gl.e.k(new PrintStream(byteArrayOutputStream), this.f12233c);
        return byteArrayOutputStream.toString();
    }
}
