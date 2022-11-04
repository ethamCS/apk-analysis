package dd;

import dd.h;
import dd.v;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import xc.n1;
/* loaded from: classes.dex */
public abstract class t extends p implements h, v, nd.q {
    @Override // nd.s
    public boolean B() {
        return v.a.c(this);
    }

    @Override // nd.s
    public boolean I() {
        return v.a.b(this);
    }

    @Override // dd.h
    public AnnotatedElement U() {
        Member a02 = a0();
        hc.t.c(a02, "null cannot be cast to non-null type java.lang.reflect.AnnotatedElement");
        return (AnnotatedElement) a02;
    }

    /* renamed from: X */
    public e h(wd.c cVar) {
        return h.a.a(this, cVar);
    }

    /* renamed from: Y */
    public List<e> j() {
        return h.a.b(this);
    }

    /* renamed from: Z */
    public l S() {
        Class<?> declaringClass = a0().getDeclaringClass();
        hc.t.d(declaringClass, "member.declaringClass");
        return new l(declaringClass);
    }

    public abstract Member a0();

    public final List<nd.b0> b0(Type[] typeArr, Annotation[][] annotationArr, boolean z10) {
        String str;
        boolean z11;
        int E;
        Object Y;
        hc.t.e(typeArr, "parameterTypes");
        hc.t.e(annotationArr, "parameterAnnotations");
        ArrayList arrayList = new ArrayList(typeArr.length);
        List<String> b10 = c.f8482a.b(a0());
        int size = b10 != null ? b10.size() - typeArr.length : 0;
        int length = typeArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            z a10 = z.f8521a.a(typeArr[i10]);
            if (b10 != null) {
                Y = ub.c0.Y(b10, i10 + size);
                str = (String) Y;
                if (str == null) {
                    throw new IllegalStateException(("No parameter with index " + i10 + '+' + size + " (name=" + getName() + " type=" + a10 + ") in " + this).toString());
                }
            } else {
                str = null;
            }
            if (z10) {
                E = ub.m.E(typeArr);
                if (i10 == E) {
                    z11 = true;
                    arrayList.add(new b0(a10, annotationArr[i10], str, z11));
                }
            }
            z11 = false;
            arrayList.add(new b0(a10, annotationArr[i10], str, z11));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof t) && hc.t.a(a0(), ((t) obj).a0());
    }

    @Override // nd.s
    public n1 g() {
        return v.a.a(this);
    }

    @Override // nd.t
    public wd.f getName() {
        String name = a0().getName();
        wd.f j10 = name != null ? wd.f.j(name) : null;
        return j10 == null ? wd.h.f24812b : j10;
    }

    public int hashCode() {
        return a0().hashCode();
    }

    @Override // nd.s
    public boolean m() {
        return v.a.d(this);
    }

    public String toString() {
        return getClass().getName() + ": " + a0();
    }

    @Override // nd.d
    public boolean v() {
        return h.a.c(this);
    }

    @Override // dd.v
    public int y() {
        return a0().getModifiers();
    }
}
