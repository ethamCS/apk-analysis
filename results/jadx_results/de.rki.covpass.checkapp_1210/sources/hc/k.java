package hc;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0012B\u0013\u0012\n\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f¢\u0006\u0004\b0\u00101J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0017J\u0013\u0010\n\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u001e\u0010\u0010\u001a\u0006\u0012\u0002\b\u00030\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u001e\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a0\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR \u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001e0\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001cR\u001e\u0010\"\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001cR\u0016\u0010%\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R(\u0010+\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u00010&8VX\u0097\u0004¢\u0006\f\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\u001a\u0010/\u001a\u00020\u00078VX\u0097\u0004¢\u0006\f\u0012\u0004\b.\u0010*\u001a\u0004\b,\u0010-¨\u00062"}, d2 = {"Lhc/k;", "Loc/d;", BuildConfig.FLAVOR, "Lhc/j;", BuildConfig.FLAVOR, "o", "value", BuildConfig.FLAVOR, "B", "other", "equals", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", "Ljava/lang/Class;", "jClass", "Ljava/lang/Class;", "a", "()Ljava/lang/Class;", "G", "()Ljava/lang/String;", "simpleName", "y", "qualifiedName", BuildConfig.FLAVOR, "Loc/c;", "x", "()Ljava/util/Collection;", "members", "Loc/g;", "k", "constructors", "z", "nestedClasses", "I", "()Ljava/lang/Object;", "objectInstance", BuildConfig.FLAVOR, "v", "()Ljava/util/List;", "getSealedSubclasses$annotations", "()V", "sealedSubclasses", "A", "()Z", "isCompanion$annotations", "isCompanion", "<init>", "(Ljava/lang/Class;)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class k implements oc.d<Object>, j {
    public static final a Companion = new a(null);
    private static final Map<String, String> U3;

    /* renamed from: d */
    private static final Map<Class<? extends tb.g<?>>, Integer> f11765d;

    /* renamed from: q */
    private static final HashMap<String, String> f11766q;

    /* renamed from: x */
    private static final HashMap<String, String> f11767x;

    /* renamed from: y */
    private static final HashMap<String, String> f11768y;

    /* renamed from: c */
    private final Class<?> f11769c;

    @Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0014\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002J\u001c\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002R,\u0010\r\u001a\u001a\u0012\u0010\u0012\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u000b0\u0002\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR0\u0010\u0011\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R0\u0010\u0013\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0012R0\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u000fj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004`\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u000e¨\u0006\u0018"}, d2 = {"Lhc/k$a;", BuildConfig.FLAVOR, "Ljava/lang/Class;", "jClass", BuildConfig.FLAVOR, "b", "a", "value", BuildConfig.FLAVOR, "c", BuildConfig.FLAVOR, "Ltb/g;", BuildConfig.FLAVOR, "FUNCTION_CLASSES", "Ljava/util/Map;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "classFqNames", "Ljava/util/HashMap;", "primitiveFqNames", "primitiveWrapperFqNames", "simpleNames", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(Class<?> cls) {
            String str;
            t.e(cls, "jClass");
            String str2 = null;
            if (!cls.isAnonymousClass() && !cls.isLocalClass()) {
                if (!cls.isArray()) {
                    String str3 = (String) k.f11768y.get(cls.getName());
                    return str3 == null ? cls.getCanonicalName() : str3;
                }
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) k.f11768y.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                return str2 == null ? "kotlin.Array" : str2;
            }
            return null;
        }

        public final String b(Class<?> cls) {
            String str;
            Method enclosingMethod;
            String I0;
            String J0;
            String J02;
            t.e(cls, "jClass");
            String str2 = null;
            if (!cls.isAnonymousClass()) {
                if (cls.isLocalClass()) {
                    String simpleName = cls.getSimpleName();
                    if (cls.getEnclosingMethod() != null) {
                        t.d(simpleName, "name");
                        J02 = bf.y.J0(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                        if (J02 != null) {
                            return J02;
                        }
                    }
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    t.d(simpleName, "name");
                    if (enclosingConstructor == null) {
                        I0 = bf.y.I0(simpleName, '$', null, 2, null);
                        return I0;
                    }
                    J0 = bf.y.J0(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
                    return J0;
                } else if (!cls.isArray()) {
                    String str3 = (String) k.U3.get(cls.getName());
                    return str3 == null ? cls.getSimpleName() : str3;
                } else {
                    Class<?> componentType = cls.getComponentType();
                    if (componentType.isPrimitive() && (str = (String) k.U3.get(componentType.getName())) != null) {
                        str2 = str + "Array";
                    }
                    if (str2 == null) {
                        return "Array";
                    }
                }
            }
            return str2;
        }

        public final boolean c(Object obj, Class<?> cls) {
            t.e(cls, "jClass");
            Map map = k.f11765d;
            t.c(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(cls);
            if (num != null) {
                return q0.i(obj, num.intValue());
            }
            if (cls.isPrimitive()) {
                cls = fc.a.c(fc.a.e(cls));
            }
            return cls.isInstance(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        List k10;
        int s10;
        Map<Class<? extends tb.g<?>>, Integer> q10;
        int d10;
        String L0;
        String L02;
        int i10 = 0;
        k10 = ub.u.k(gc.a.class, gc.l.class, gc.p.class, gc.q.class, gc.r.class, gc.s.class, gc.t.class, gc.u.class, gc.v.class, gc.w.class, gc.b.class, gc.c.class, gc.d.class, gc.e.class, gc.f.class, gc.g.class, gc.h.class, gc.i.class, gc.j.class, gc.k.class, gc.m.class, gc.n.class, gc.o.class);
        s10 = ub.v.s(k10, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (Object obj : k10) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                ub.u.r();
            }
            arrayList.add(tb.x.a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        q10 = ub.q0.q(arrayList);
        f11765d = q10;
        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        f11766q = hashMap;
        HashMap<String, String> hashMap2 = new HashMap<>();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        f11767x = hashMap2;
        HashMap<String, String> hashMap3 = new HashMap<>();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        t.d(values, "primitiveFqNames.values");
        for (String str : values) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            t.d(str, "kotlinName");
            L02 = bf.y.L0(str, '.', null, 2, null);
            sb2.append(L02);
            sb2.append("CompanionObject");
            tb.r a10 = tb.x.a(sb2.toString(), str + ".Companion");
            hashMap3.put(a10.e(), a10.f());
        }
        for (Map.Entry<Class<? extends tb.g<?>>, Integer> entry : f11765d.entrySet()) {
            int intValue = entry.getValue().intValue();
            hashMap3.put(entry.getKey().getName(), "kotlin.Function" + intValue);
        }
        f11768y = hashMap3;
        d10 = ub.p0.d(hashMap3.size());
        LinkedHashMap linkedHashMap = new LinkedHashMap(d10);
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            Object key = entry2.getKey();
            L0 = bf.y.L0((String) entry2.getValue(), '.', null, 2, null);
            linkedHashMap.put(key, L0);
        }
        U3 = linkedHashMap;
    }

    public k(Class<?> cls) {
        t.e(cls, "jClass");
        this.f11769c = cls;
    }

    private final Void o() {
        throw new fc.d();
    }

    @Override // oc.d
    public boolean A() {
        o();
        throw new tb.i();
    }

    @Override // oc.d
    public boolean B(Object obj) {
        return Companion.c(obj, a());
    }

    @Override // oc.d
    public String G() {
        return Companion.b(a());
    }

    @Override // oc.d
    public Object I() {
        o();
        throw new tb.i();
    }

    @Override // hc.j
    public Class<?> a() {
        return this.f11769c;
    }

    public boolean equals(Object obj) {
        return (obj instanceof k) && t.a(fc.a.c(this), fc.a.c((oc.d) obj));
    }

    public int hashCode() {
        return fc.a.c(this).hashCode();
    }

    @Override // oc.d
    public Collection<oc.g<Object>> k() {
        o();
        throw new tb.i();
    }

    public String toString() {
        return a().toString() + " (Kotlin reflection is not available)";
    }

    @Override // oc.d
    public List<oc.d<? extends Object>> v() {
        o();
        throw new tb.i();
    }

    @Override // oc.d, oc.f
    public Collection<oc.c<?>> x() {
        o();
        throw new tb.i();
    }

    @Override // oc.d
    public String y() {
        return Companion.a(a());
    }

    @Override // oc.d
    public Collection<oc.d<?>> z() {
        o();
        throw new tb.i();
    }
}
