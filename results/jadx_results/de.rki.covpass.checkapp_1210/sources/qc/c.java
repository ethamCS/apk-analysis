package qc;

import cd.f;
import hc.t;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import oc.g;
import oc.h;
import oc.k;
import oc.m;
import oc.n;
import org.conscrypt.BuildConfig;
import qd.a;
import rc.f;
import rc.j0;
import rc.p;
import rc.w;
import rc.y;
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\u001a\u000e\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0002\"\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u0004*\u0006\u0012\u0002\b\u00030\u00038F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\"\u001b\u0010\u000b\u001a\u0004\u0018\u00010\b*\u0006\u0012\u0002\b\u00030\u00038F¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u001b\u0010\u000f\u001a\u0004\u0018\u00010\b*\u0006\u0012\u0002\b\u00030\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u001b\u0010\u0013\u001a\u0004\u0018\u00010\b*\u0006\u0012\u0002\b\u00030\u00108F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"/\u0010\u001a\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0015\"\u0004\b\u0000\u0010\u0014*\b\u0012\u0004\u0012\u00028\u00000\u00108F¢\u0006\f\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017\"\u0015\u0010\u001f\u001a\u00020\u001c*\u00020\u001b8F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e\"\u001b\u0010\"\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0003*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b \u0010!\"\u001b\u0010%\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0010*\u00020\b8F¢\u0006\u0006\u001a\u0004\b#\u0010$\"-\u0010%\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0010\"\b\b\u0000\u0010\u0014*\u00020&*\b\u0012\u0004\u0012\u00028\u00000\u00158F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006)"}, d2 = {"Ljava/lang/reflect/Member;", "Loc/f;", "g", "Loc/k;", "Ljava/lang/reflect/Field;", "b", "(Loc/k;)Ljava/lang/reflect/Field;", "javaField", "Ljava/lang/reflect/Method;", "c", "(Loc/k;)Ljava/lang/reflect/Method;", "javaGetter", "Loc/h;", "e", "(Loc/h;)Ljava/lang/reflect/Method;", "javaSetter", "Loc/g;", "d", "(Loc/g;)Ljava/lang/reflect/Method;", "javaMethod", "T", "Ljava/lang/reflect/Constructor;", "a", "(Loc/g;)Ljava/lang/reflect/Constructor;", "getJavaConstructor$annotations", "(Loc/g;)V", "javaConstructor", "Loc/n;", "Ljava/lang/reflect/Type;", "f", "(Loc/n;)Ljava/lang/reflect/Type;", "javaType", "j", "(Ljava/lang/reflect/Field;)Loc/k;", "kotlinProperty", "i", "(Ljava/lang/reflect/Method;)Loc/g;", "kotlinFunction", BuildConfig.FLAVOR, "h", "(Ljava/lang/reflect/Constructor;)Loc/g;", "kotlin-reflection"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class c {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19777a;

        static {
            int[] iArr = new int[a.EnumC0322a.values().length];
            iArr[a.EnumC0322a.FILE_FACADE.ordinal()] = 1;
            iArr[a.EnumC0322a.MULTIFILE_CLASS.ordinal()] = 2;
            iArr[a.EnumC0322a.MULTIFILE_CLASS_PART.ordinal()] = 3;
            f19777a = iArr;
        }
    }

    public static final <T> Constructor<T> a(g<? extends T> gVar) {
        sc.d<?> w9;
        t.e(gVar, "<this>");
        f<?> b10 = j0.b(gVar);
        Object member = (b10 == null || (w9 = b10.w()) == null) ? null : w9.getMember();
        if (member instanceof Constructor) {
            return (Constructor) member;
        }
        return null;
    }

    public static final Field b(k<?> kVar) {
        t.e(kVar, "<this>");
        w<?> d10 = j0.d(kVar);
        if (d10 != null) {
            return d10.Q();
        }
        return null;
    }

    public static final Method c(k<?> kVar) {
        t.e(kVar, "<this>");
        return d(kVar.i());
    }

    public static final Method d(g<?> gVar) {
        sc.d<?> w9;
        t.e(gVar, "<this>");
        f<?> b10 = j0.b(gVar);
        Object member = (b10 == null || (w9 = b10.w()) == null) ? null : w9.getMember();
        if (member instanceof Method) {
            return (Method) member;
        }
        return null;
    }

    public static final Method e(h<?> hVar) {
        t.e(hVar, "<this>");
        return d(hVar.n());
    }

    public static final Type f(n nVar) {
        t.e(nVar, "<this>");
        Type W = ((y) nVar).W();
        return W == null ? oc.t.f(nVar) : W;
    }

    private static final oc.f g(Member member) {
        qd.a a10;
        f.a aVar = cd.f.f6434c;
        Class<?> declaringClass = member.getDeclaringClass();
        t.d(declaringClass, "declaringClass");
        cd.f a11 = aVar.a(declaringClass);
        a.EnumC0322a c10 = (a11 == null || (a10 = a11.a()) == null) ? null : a10.c();
        int i10 = c10 == null ? -1 : a.f19777a[c10.ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            Class<?> declaringClass2 = member.getDeclaringClass();
            t.d(declaringClass2, "declaringClass");
            return new p(declaringClass2, null, 2, null);
        }
        return null;
    }

    public static final <T> g<T> h(Constructor<T> constructor) {
        T t10;
        t.e(constructor, "<this>");
        Class<T> declaringClass = constructor.getDeclaringClass();
        t.d(declaringClass, "declaringClass");
        Iterator<T> it = fc.a.e(declaringClass).k().iterator();
        while (true) {
            if (!it.hasNext()) {
                t10 = null;
                break;
            }
            t10 = it.next();
            if (t.a(a((g) t10), constructor)) {
                break;
            }
        }
        return (g) t10;
    }

    public static final g<?> i(Method method) {
        Object obj;
        boolean z10;
        t.e(method, "<this>");
        Object obj2 = null;
        if (Modifier.isStatic(method.getModifiers())) {
            oc.f g10 = g(method);
            if (g10 != null) {
                Collection<oc.c<?>> x10 = g10.x();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : x10) {
                    if (obj3 instanceof g) {
                        arrayList.add(obj3);
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (t.a(d((g) next), method)) {
                        obj2 = next;
                        break;
                    }
                }
                return (g) obj2;
            }
            Class<?> declaringClass = method.getDeclaringClass();
            t.d(declaringClass, "declaringClass");
            oc.d<?> a10 = pc.d.a(fc.a.e(declaringClass));
            if (a10 != null) {
                Iterator<T> it2 = pc.d.d(a10).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    Method d10 = d((g) obj);
                    if (d10 == null || !t.a(d10.getName(), method.getName()) || !Arrays.equals(d10.getParameterTypes(), method.getParameterTypes()) || !t.a(d10.getReturnType(), method.getReturnType())) {
                        z10 = false;
                        continue;
                    } else {
                        z10 = true;
                        continue;
                    }
                    if (z10) {
                        break;
                    }
                }
                g<?> gVar = (g) obj;
                if (gVar != null) {
                    return gVar;
                }
            }
        }
        Class<?> declaringClass2 = method.getDeclaringClass();
        t.d(declaringClass2, "declaringClass");
        Iterator<T> it3 = pc.d.d(fc.a.e(declaringClass2)).iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next2 = it3.next();
            if (t.a(d((g) next2), method)) {
                obj2 = next2;
                break;
            }
        }
        return (g) obj2;
    }

    public static final k<?> j(Field field) {
        t.e(field, "<this>");
        Object obj = null;
        if (field.isSynthetic()) {
            return null;
        }
        oc.f g10 = g(field);
        if (g10 == null) {
            Class<?> declaringClass = field.getDeclaringClass();
            t.d(declaringClass, "declaringClass");
            Iterator it = pc.d.e(fc.a.e(declaringClass)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (t.a(b((m) next), field)) {
                    obj = next;
                    break;
                }
            }
            return (k) obj;
        }
        Collection<oc.c<?>> x10 = g10.x();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : x10) {
            if (obj2 instanceof k) {
                arrayList.add(obj2);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (t.a(b((k) next2), field)) {
                obj = next2;
                break;
            }
        }
        return (k) obj;
    }
}
