package rc;

import cd.l;
import ce.q;
import hc.m0;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ub.q0;
import xc.a1;
import xc.x0;
@Metadata(bv = {}, d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0012\u0010\u0002\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0001*\u00020\u0000H\u0000\u001a(\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0002\u001a.\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u0007H\u0002\u001a\u0014\u0010\u000e\u001a\u0006\u0012\u0002\b\u00030\u0001*\u0006\u0012\u0002\b\u00030\u0001H\u0000\u001a\u0012\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010*\u00020\u000fH\u0000\u001a\u0018\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010*\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002\u001a\u000e\u0010\u0015\u001a\u0004\u0018\u00010\u0011*\u00020\u0014H\u0002\u001a\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u0017*\u0006\u0012\u0002\b\u00030\u00162\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u0017*\u00020\u00192\u0006\u0010\u0004\u001a\u00020\u0003H\u0002\u001a\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001b*\u0004\u0018\u00010\u0017H\u0000\u001a\u0014\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d*\u0004\u0018\u00010\u0017H\u0000\u001a\u0014\u0010 \u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001f*\u0004\u0018\u00010\u0017H\u0000\u001a\u0012\u0010#\u001a\u0004\u0018\u00010\u00172\u0006\u0010\"\u001a\u00020!H\u0000\u001ai\u00103\u001a\u00028\u0001\"\b\b\u0000\u0010%*\u00020$\"\b\b\u0001\u0010'*\u00020&2\n\u0010(\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010)\u001a\u00028\u00002\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.2\u0018\u00102\u001a\u0014\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000100H\u0000¢\u0006\u0004\b3\u00104\u001a'\u00108\u001a\u00028\u0000\"\u0004\b\u0000\u001052\f\u00107\u001a\b\u0012\u0004\u0012\u00028\u000006H\u0080\bø\u0001\u0000¢\u0006\u0004\b8\u00109\"\u0018\u0010>\u001a\u00020;*\u00020:8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=\"\u001a\u0010B\u001a\u0004\u0018\u00010?*\u00020&8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b@\u0010A\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006C"}, d2 = {"Lxc/e;", "Ljava/lang/Class;", "p", "Ljava/lang/ClassLoader;", "classLoader", "Lwd/b;", "kotlinClassId", BuildConfig.FLAVOR, "arrayDimensions", "m", BuildConfig.FLAVOR, "packageName", "className", "l", "f", "Lyc/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "e", "r", "Lyc/c;", "o", "Lce/g;", BuildConfig.FLAVOR, "q", "Lce/b;", "a", "Lrc/k;", "c", "Lrc/w;", "d", "Lrc/f;", "b", "Ljava/lang/reflect/Type;", "type", "g", "Lyd/q;", "M", "Lxc/a;", "D", "moduleAnchor", "proto", "Ltd/c;", "nameResolver", "Ltd/g;", "typeTable", "Ltd/a;", "metadataVersion", "Lkotlin/Function2;", "Lke/w;", "createDescriptor", "deserializeToDescriptor", "(Ljava/lang/Class;Lorg/jetbrains/kotlin/protobuf/MessageLite;Lorg/jetbrains/kotlin/metadata/deserialization/NameResolver;Lorg/jetbrains/kotlin/metadata/deserialization/TypeTable;Lorg/jetbrains/kotlin/metadata/deserialization/BinaryVersion;Lgc/p;)Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;", "R", "Lkotlin/Function0;", "block", "reflectionCall", "(Lgc/a;)Ljava/lang/Object;", "Loc/n;", BuildConfig.FLAVOR, "k", "(Loc/n;)Z", "isInlineClassType", "Lxc/x0;", "getInstanceReceiverParameter", "(Lorg/jetbrains/kotlin/descriptors/CallableDescriptor;)Lorg/jetbrains/kotlin/descriptors/ReceiverParameterDescriptor;", "instanceReceiverParameter", "kotlin-reflection"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class j0 {

    /* renamed from: a */
    private static final wd.c f20698a = new wd.c("kotlin.jvm.JvmStatic");

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f20699a;

        static {
            int[] iArr = new int[uc.i.values().length];
            iArr[uc.i.BOOLEAN.ordinal()] = 1;
            iArr[uc.i.CHAR.ordinal()] = 2;
            iArr[uc.i.BYTE.ordinal()] = 3;
            iArr[uc.i.SHORT.ordinal()] = 4;
            iArr[uc.i.INT.ordinal()] = 5;
            iArr[uc.i.FLOAT.ordinal()] = 6;
            iArr[uc.i.LONG.ordinal()] = 7;
            iArr[uc.i.DOUBLE.ordinal()] = 8;
            f20699a = iArr;
        }
    }

    /* JADX WARN: Incorrect type for immutable var: ssa=boolean[], code=short[], for r7v13, types: [boolean[]] */
    /* JADX WARN: Incorrect type for immutable var: ssa=byte[], code=short[], for r7v15, types: [byte[]] */
    /* JADX WARN: Incorrect type for immutable var: ssa=char[], code=short[], for r7v14, types: [char[]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v10, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Class[]] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r7v17, types: [int[]] */
    /* JADX WARN: Type inference failed for: r7v18, types: [float[]] */
    /* JADX WARN: Type inference failed for: r7v19, types: [long[]] */
    /* JADX WARN: Type inference failed for: r7v20, types: [double[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.Object a(ce.b r6, java.lang.ClassLoader r7) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: rc.j0.a(ce.b, java.lang.ClassLoader):java.lang.Object");
    }

    public static final f<?> b(Object obj) {
        f<?> fVar = obj instanceof f ? (f) obj : null;
        if (fVar == null) {
            k c10 = c(obj);
            return c10 != null ? c10 : d(obj);
        }
        return fVar;
    }

    public static final k c(Object obj) {
        k kVar = obj instanceof k ? (k) obj : null;
        if (kVar == null) {
            hc.p pVar = obj instanceof hc.p ? (hc.p) obj : null;
            oc.c b02 = pVar != null ? pVar.b0() : null;
            if (!(b02 instanceof k)) {
                return null;
            }
            return (k) b02;
        }
        return kVar;
    }

    public static final w<?> d(Object obj) {
        w<?> wVar = obj instanceof w ? (w) obj : null;
        if (wVar == null) {
            hc.f0 f0Var = obj instanceof hc.f0 ? (hc.f0) obj : null;
            oc.c b02 = f0Var != null ? f0Var.b0() : null;
            if (!(b02 instanceof w)) {
                return null;
            }
            return (w) b02;
        }
        return wVar;
    }

    public static final List<Annotation> e(yc.a aVar) {
        hc.t.e(aVar, "<this>");
        yc.g j10 = aVar.j();
        ArrayList arrayList = new ArrayList();
        for (yc.c cVar : j10) {
            a1 m10 = cVar.m();
            Annotation annotation = null;
            if (m10 instanceof cd.b) {
                annotation = ((cd.b) m10).d();
            } else if (m10 instanceof l.a) {
                dd.p b10 = ((l.a) m10).b();
                dd.e eVar = b10 instanceof dd.e ? (dd.e) b10 : null;
                if (eVar != null) {
                    annotation = eVar.X();
                }
            } else {
                annotation = o(cVar);
            }
            if (annotation != null) {
                arrayList.add(annotation);
            }
        }
        return r(arrayList);
    }

    public static final Class<?> f(Class<?> cls) {
        hc.t.e(cls, "<this>");
        return Array.newInstance(cls, 0).getClass();
    }

    public static final Object g(Type type) {
        hc.t.e(type, "type");
        if (!(type instanceof Class) || !((Class) type).isPrimitive()) {
            return null;
        }
        if (hc.t.a(type, Boolean.TYPE)) {
            return Boolean.FALSE;
        }
        if (hc.t.a(type, Character.TYPE)) {
            return (char) 0;
        }
        if (hc.t.a(type, Byte.TYPE)) {
            return (byte) 0;
        }
        if (hc.t.a(type, Short.TYPE)) {
            return (short) 0;
        }
        if (hc.t.a(type, Integer.TYPE)) {
            return 0;
        }
        if (hc.t.a(type, Float.TYPE)) {
            return Float.valueOf(0.0f);
        }
        if (hc.t.a(type, Long.TYPE)) {
            return 0L;
        }
        if (hc.t.a(type, Double.TYPE)) {
            return Double.valueOf(0.0d);
        }
        if (hc.t.a(type, Void.TYPE)) {
            throw new IllegalStateException("Parameter with void type is illegal");
        }
        throw new UnsupportedOperationException("Unknown primitive: " + type);
    }

    public static final <M extends yd.q, D extends xc.a> D h(Class<?> cls, M m10, td.c cVar, td.g gVar, td.a aVar, gc.p<? super ke.w, ? super M, ? extends D> pVar) {
        List<rd.s> O0;
        hc.t.e(cls, "moduleAnchor");
        hc.t.e(m10, "proto");
        hc.t.e(cVar, "nameResolver");
        hc.t.e(gVar, "typeTable");
        hc.t.e(aVar, "metadataVersion");
        hc.t.e(pVar, "createDescriptor");
        cd.k a10 = c0.a(cls);
        if (m10 instanceof rd.i) {
            O0 = ((rd.i) m10).N0();
        } else if (!(m10 instanceof rd.n)) {
            throw new IllegalStateException(("Unsupported message: " + m10).toString());
        } else {
            O0 = ((rd.n) m10).O0();
        }
        List<rd.s> list = O0;
        ke.k a11 = a10.a();
        xc.h0 b10 = a10.b();
        td.h b11 = td.h.Companion.b();
        hc.t.d(list, "typeParameters");
        return pVar.u(new ke.w(new ke.m(a11, cVar, b10, gVar, b11, aVar, null, null, list)), m10);
    }

    public static final x0 i(xc.a aVar) {
        hc.t.e(aVar, "<this>");
        if (aVar.J() != null) {
            xc.m b10 = aVar.b();
            hc.t.c(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
            return ((xc.e) b10).S0();
        }
        return null;
    }

    public static final wd.c j() {
        return f20698a;
    }

    public static final boolean k(oc.n nVar) {
        oe.e0 l10;
        hc.t.e(nVar, "<this>");
        y yVar = nVar instanceof y ? (y) nVar : null;
        return (yVar == null || (l10 = yVar.l()) == null || !ae.f.c(l10)) ? false : true;
    }

    private static final Class<?> l(ClassLoader classLoader, String str, String str2, int i10) {
        String D;
        String A;
        if (hc.t.a(str, "kotlin")) {
            switch (str2.hashCode()) {
                case -901856463:
                    if (str2.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str2.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str2.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str2.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str2.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str2.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str2.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str2.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str2.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('.');
        D = bf.x.D(str2, '.', '$', false, 4, null);
        sb2.append(D);
        String sb3 = sb2.toString();
        if (i10 > 0) {
            StringBuilder sb4 = new StringBuilder();
            A = bf.x.A("[", i10);
            sb4.append(A);
            sb4.append('L');
            sb4.append(sb3);
            sb4.append(';');
            sb3 = sb4.toString();
        }
        return cd.e.a(classLoader, sb3);
    }

    private static final Class<?> m(ClassLoader classLoader, wd.b bVar, int i10) {
        wc.c cVar = wc.c.f24707a;
        wd.d j10 = bVar.b().j();
        hc.t.d(j10, "kotlinClassId.asSingleFqName().toUnsafe()");
        wd.b n10 = cVar.n(j10);
        if (n10 != null) {
            bVar = n10;
        }
        String b10 = bVar.h().b();
        hc.t.d(b10, "javaClassId.packageFqName.asString()");
        String b11 = bVar.i().b();
        hc.t.d(b11, "javaClassId.relativeClassName.asString()");
        return l(classLoader, b10, b11, i10);
    }

    static /* synthetic */ Class n(ClassLoader classLoader, wd.b bVar, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return m(classLoader, bVar, i10);
    }

    private static final Annotation o(yc.c cVar) {
        Map q10;
        xc.e e10 = ee.a.e(cVar);
        Class<?> p10 = e10 != null ? p(e10) : null;
        if (!(p10 instanceof Class)) {
            p10 = null;
        }
        if (p10 == null) {
            return null;
        }
        Set<Map.Entry<wd.f, ce.g<?>>> entrySet = cVar.b().entrySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = entrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            wd.f fVar = (wd.f) entry.getKey();
            ClassLoader classLoader = p10.getClassLoader();
            hc.t.d(classLoader, "annotationClass.classLoader");
            Object q11 = q((ce.g) entry.getValue(), classLoader);
            tb.r a10 = q11 != null ? tb.x.a(fVar.b(), q11) : null;
            if (a10 != null) {
                arrayList.add(a10);
            }
        }
        q10 = q0.q(arrayList);
        return (Annotation) sc.b.g(p10, q10, null, 4, null);
    }

    public static final Class<?> p(xc.e eVar) {
        hc.t.e(eVar, "<this>");
        a1 m10 = eVar.m();
        hc.t.d(m10, "source");
        if (m10 instanceof pd.s) {
            pd.q d10 = ((pd.s) m10).d();
            hc.t.c(d10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.components.ReflectKotlinClass");
            return ((cd.f) d10).e();
        } else if (m10 instanceof l.a) {
            dd.p b10 = ((l.a) m10).b();
            hc.t.c(b10, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.runtime.structure.ReflectJavaClass");
            return ((dd.l) b10).U();
        } else {
            wd.b g10 = ee.a.g(eVar);
            if (g10 != null) {
                return m(dd.d.f(eVar.getClass()), g10, 0);
            }
            return null;
        }
    }

    private static final Object q(ce.g<?> gVar, ClassLoader classLoader) {
        if (gVar instanceof ce.a) {
            return o(((ce.a) gVar).b());
        }
        if (gVar instanceof ce.b) {
            return a((ce.b) gVar, classLoader);
        }
        if (gVar instanceof ce.j) {
            tb.r<? extends wd.b, ? extends wd.f> b10 = ((ce.j) gVar).b();
            wd.f c10 = b10.c();
            Class n10 = n(classLoader, b10.b(), 0, 4, null);
            if (n10 == null) {
                return null;
            }
            return i0.a(n10, c10.b());
        } else if (!(gVar instanceof ce.q)) {
            if (!(gVar instanceof ce.k ? true : gVar instanceof ce.s)) {
                return gVar.b();
            }
            return null;
        } else {
            q.b b11 = ((ce.q) gVar).b();
            if (b11 instanceof q.b.C0091b) {
                q.b.C0091b c0091b = (q.b.C0091b) b11;
                return m(classLoader, c0091b.b(), c0091b.a());
            } else if (!(b11 instanceof q.b.a)) {
                throw new tb.p();
            } else {
                xc.h z10 = ((q.b.a) b11).a().W0().z();
                xc.e eVar = z10 instanceof xc.e ? (xc.e) z10 : null;
                if (eVar == null) {
                    return null;
                }
                return p(eVar);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final List<Annotation> r(List<? extends Annotation> list) {
        boolean z10;
        List list2;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (Annotation annotation : list) {
                if (hc.t.a(fc.a.b(fc.a.a(annotation)).getSimpleName(), "Container")) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        if (z10) {
            ArrayList arrayList = new ArrayList();
            for (Annotation annotation2 : list) {
                Class b10 = fc.a.b(fc.a.a(annotation2));
                if (!hc.t.a(b10.getSimpleName(), "Container") || b10.getAnnotation(m0.class) == null) {
                    list2 = ub.t.d(annotation2);
                } else {
                    Object invoke = b10.getDeclaredMethod("value", new Class[0]).invoke(annotation2, new Object[0]);
                    hc.t.c(invoke, "null cannot be cast to non-null type kotlin.Array<out kotlin.Annotation>");
                    list2 = ub.l.d((Annotation[]) invoke);
                }
                ub.z.x(arrayList, list2);
            }
            return arrayList;
        }
        return list;
    }
}
