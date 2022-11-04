package dd;

import dd.f;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import nd.a;
/* loaded from: classes.dex */
public final class e extends p implements nd.a {

    /* renamed from: a */
    private final Annotation f8495a;

    public e(Annotation annotation) {
        hc.t.e(annotation, "annotation");
        this.f8495a = annotation;
    }

    @Override // nd.a
    public boolean T() {
        return a.C0263a.a(this);
    }

    public final Annotation X() {
        return this.f8495a;
    }

    /* renamed from: Y */
    public l n() {
        return new l(fc.a.b(fc.a.a(this.f8495a)));
    }

    @Override // nd.a
    public boolean a() {
        return a.C0263a.b(this);
    }

    @Override // nd.a
    public Collection<nd.b> c() {
        Method[] declaredMethods = fc.a.b(fc.a.a(this.f8495a)).getDeclaredMethods();
        hc.t.d(declaredMethods, "annotation.annotationClass.java.declaredMethods");
        ArrayList arrayList = new ArrayList(declaredMethods.length);
        for (Method method : declaredMethods) {
            f.a aVar = f.f8496b;
            Object invoke = method.invoke(this.f8495a, new Object[0]);
            hc.t.d(invoke, "method.invoke(annotation)");
            arrayList.add(aVar.a(invoke, wd.f.j(method.getName())));
        }
        return arrayList;
    }

    public boolean equals(Object obj) {
        return (obj instanceof e) && this.f8495a == ((e) obj).f8495a;
    }

    public int hashCode() {
        return System.identityHashCode(this.f8495a);
    }

    @Override // nd.a
    public wd.b i() {
        return d.a(fc.a.b(fc.a.a(this.f8495a)));
    }

    public String toString() {
        return e.class.getName() + ": " + this.f8495a;
    }
}
