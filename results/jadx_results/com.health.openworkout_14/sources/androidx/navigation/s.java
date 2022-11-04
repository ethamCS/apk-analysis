package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
/* loaded from: classes.dex */
public abstract class s<T> {

    /* renamed from: b */
    public static final s<Integer> f1381b = new c(false);

    /* renamed from: c */
    public static final s<Integer> f1382c = new d(false);

    /* renamed from: d */
    public static final s<int[]> f1383d = new e(true);

    /* renamed from: e */
    public static final s<Long> f1384e = new f(false);

    /* renamed from: f */
    public static final s<long[]> f1385f = new g(true);

    /* renamed from: g */
    public static final s<Float> f1386g = new h(false);

    /* renamed from: h */
    public static final s<float[]> f1387h = new i(true);
    public static final s<Boolean> i = new j(false);
    public static final s<boolean[]> j = new k(true);
    public static final s<String> k = new a(true);
    public static final s<String[]> l = new b(true);

    /* renamed from: a */
    private final boolean f1388a;

    /* loaded from: classes.dex */
    class a extends s<String> {
        a(boolean z) {
            super(z);
        }

        @Override // androidx.navigation.s
        public String c() {
            return "string";
        }

        @Override // androidx.navigation.s
        public /* bridge */ /* synthetic */ String h(String str) {
            k(str);
            return str;
        }

        /* renamed from: j */
        public String b(Bundle bundle, String str) {
            return (String) bundle.get(str);
        }

        public String k(String str) {
            return str;
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, String str2) {
            bundle.putString(str, str2);
        }
    }

    /* loaded from: classes.dex */
    class b extends s<String[]> {
        b(boolean z) {
            super(z);
        }

        @Override // androidx.navigation.s
        public String c() {
            return "string[]";
        }

        @Override // androidx.navigation.s
        public /* bridge */ /* synthetic */ String[] h(String str) {
            k(str);
            throw null;
        }

        /* renamed from: j */
        public String[] b(Bundle bundle, String str) {
            return (String[]) bundle.get(str);
        }

        public String[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, String[] strArr) {
            bundle.putStringArray(str, strArr);
        }
    }

    /* loaded from: classes.dex */
    class c extends s<Integer> {
        c(boolean z) {
            super(z);
        }

        @Override // androidx.navigation.s
        public String c() {
            return "integer";
        }

        /* renamed from: j */
        public Integer b(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        /* renamed from: k */
        public Integer h(String str) {
            return Integer.valueOf(str.startsWith("0x") ? Integer.parseInt(str.substring(2), 16) : Integer.parseInt(str));
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    class d extends s<Integer> {
        d(boolean z) {
            super(z);
        }

        @Override // androidx.navigation.s
        public String c() {
            return "reference";
        }

        @Override // androidx.navigation.s
        public /* bridge */ /* synthetic */ Integer h(String str) {
            k(str);
            throw null;
        }

        /* renamed from: j */
        public Integer b(Bundle bundle, String str) {
            return (Integer) bundle.get(str);
        }

        public Integer k(String str) {
            throw new UnsupportedOperationException("References don't support parsing string values.");
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, Integer num) {
            bundle.putInt(str, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    class e extends s<int[]> {
        e(boolean z) {
            super(z);
        }

        @Override // androidx.navigation.s
        public String c() {
            return "integer[]";
        }

        @Override // androidx.navigation.s
        public /* bridge */ /* synthetic */ int[] h(String str) {
            k(str);
            throw null;
        }

        /* renamed from: j */
        public int[] b(Bundle bundle, String str) {
            return (int[]) bundle.get(str);
        }

        public int[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, int[] iArr) {
            bundle.putIntArray(str, iArr);
        }
    }

    /* loaded from: classes.dex */
    class f extends s<Long> {
        f(boolean z) {
            super(z);
        }

        @Override // androidx.navigation.s
        public String c() {
            return "long";
        }

        /* renamed from: j */
        public Long b(Bundle bundle, String str) {
            return (Long) bundle.get(str);
        }

        /* renamed from: k */
        public Long h(String str) {
            if (str.endsWith("L")) {
                str = str.substring(0, str.length() - 1);
            }
            return Long.valueOf(str.startsWith("0x") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str));
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, Long l) {
            bundle.putLong(str, l.longValue());
        }
    }

    /* loaded from: classes.dex */
    class g extends s<long[]> {
        g(boolean z) {
            super(z);
        }

        @Override // androidx.navigation.s
        public String c() {
            return "long[]";
        }

        @Override // androidx.navigation.s
        public /* bridge */ /* synthetic */ long[] h(String str) {
            k(str);
            throw null;
        }

        /* renamed from: j */
        public long[] b(Bundle bundle, String str) {
            return (long[]) bundle.get(str);
        }

        public long[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, long[] jArr) {
            bundle.putLongArray(str, jArr);
        }
    }

    /* loaded from: classes.dex */
    class h extends s<Float> {
        h(boolean z) {
            super(z);
        }

        @Override // androidx.navigation.s
        public String c() {
            return "float";
        }

        /* renamed from: j */
        public Float b(Bundle bundle, String str) {
            return (Float) bundle.get(str);
        }

        /* renamed from: k */
        public Float h(String str) {
            return Float.valueOf(Float.parseFloat(str));
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, Float f2) {
            bundle.putFloat(str, f2.floatValue());
        }
    }

    /* loaded from: classes.dex */
    class i extends s<float[]> {
        i(boolean z) {
            super(z);
        }

        @Override // androidx.navigation.s
        public String c() {
            return "float[]";
        }

        @Override // androidx.navigation.s
        public /* bridge */ /* synthetic */ float[] h(String str) {
            k(str);
            throw null;
        }

        /* renamed from: j */
        public float[] b(Bundle bundle, String str) {
            return (float[]) bundle.get(str);
        }

        public float[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, float[] fArr) {
            bundle.putFloatArray(str, fArr);
        }
    }

    /* loaded from: classes.dex */
    class j extends s<Boolean> {
        j(boolean z) {
            super(z);
        }

        @Override // androidx.navigation.s
        public String c() {
            return "boolean";
        }

        /* renamed from: j */
        public Boolean b(Bundle bundle, String str) {
            return (Boolean) bundle.get(str);
        }

        /* renamed from: k */
        public Boolean h(String str) {
            if ("true".equals(str)) {
                return Boolean.TRUE;
            }
            if (!"false".equals(str)) {
                throw new IllegalArgumentException("A boolean NavType only accepts \"true\" or \"false\" values.");
            }
            return Boolean.FALSE;
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, Boolean bool) {
            bundle.putBoolean(str, bool.booleanValue());
        }
    }

    /* loaded from: classes.dex */
    class k extends s<boolean[]> {
        k(boolean z) {
            super(z);
        }

        @Override // androidx.navigation.s
        public String c() {
            return "boolean[]";
        }

        @Override // androidx.navigation.s
        public /* bridge */ /* synthetic */ boolean[] h(String str) {
            k(str);
            throw null;
        }

        /* renamed from: j */
        public boolean[] b(Bundle bundle, String str) {
            return (boolean[]) bundle.get(str);
        }

        public boolean[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, boolean[] zArr) {
            bundle.putBooleanArray(str, zArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class l<D extends Enum> extends p<D> {
        private final Class<D> n;

        public l(Class<D> cls) {
            super(false, cls);
            if (cls.isEnum()) {
                this.n = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " is not an Enum type.");
        }

        @Override // androidx.navigation.s.p, androidx.navigation.s
        public String c() {
            return this.n.getName();
        }

        /* renamed from: m */
        public D k(String str) {
            D[] enumConstants;
            for (D d2 : this.n.getEnumConstants()) {
                if (d2.name().equals(str)) {
                    return d2;
                }
            }
            throw new IllegalArgumentException("Enum value " + str + " not found for type " + this.n.getName() + ".");
        }
    }

    /* loaded from: classes.dex */
    public static final class m<D extends Parcelable> extends s<D[]> {
        private final Class<D[]> m;

        public m(Class<D> cls) {
            super(true);
            if (!Parcelable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Parcelable.");
            }
            try {
                this.m = (Class<D[]>) Class.forName("[L" + cls.getName() + ";");
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // androidx.navigation.s
        public String c() {
            return this.m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && m.class == obj.getClass()) {
                return this.m.equals(((m) obj).m);
            }
            return false;
        }

        @Override // androidx.navigation.s
        public /* bridge */ /* synthetic */ Object h(String str) {
            k(str);
            throw null;
        }

        public int hashCode() {
            return this.m.hashCode();
        }

        /* renamed from: j */
        public D[] b(Bundle bundle, String str) {
            return (D[]) ((Parcelable[]) bundle.get(str));
        }

        public D[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, D[] dArr) {
            this.m.cast(dArr);
            bundle.putParcelableArray(str, dArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class n<D> extends s<D> {
        private final Class<D> m;

        public n(Class<D> cls) {
            super(true);
            if (Parcelable.class.isAssignableFrom(cls) || Serializable.class.isAssignableFrom(cls)) {
                this.m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Parcelable or Serializable.");
        }

        @Override // androidx.navigation.s
        public D b(Bundle bundle, String str) {
            return (D) bundle.get(str);
        }

        @Override // androidx.navigation.s
        public String c() {
            return this.m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && n.class == obj.getClass()) {
                return this.m.equals(((n) obj).m);
            }
            return false;
        }

        @Override // androidx.navigation.s
        public D h(String str) {
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        public int hashCode() {
            return this.m.hashCode();
        }

        @Override // androidx.navigation.s
        public void i(Bundle bundle, String str, D d2) {
            this.m.cast(d2);
            if (d2 == null || (d2 instanceof Parcelable)) {
                bundle.putParcelable(str, (Parcelable) d2);
            } else if (!(d2 instanceof Serializable)) {
            } else {
                bundle.putSerializable(str, (Serializable) d2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class o<D extends Serializable> extends s<D[]> {
        private final Class<D[]> m;

        public o(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            }
            try {
                this.m = (Class<D[]>) Class.forName("[L" + cls.getName() + ";");
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException(e2);
            }
        }

        @Override // androidx.navigation.s
        public String c() {
            return this.m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && o.class == obj.getClass()) {
                return this.m.equals(((o) obj).m);
            }
            return false;
        }

        @Override // androidx.navigation.s
        public /* bridge */ /* synthetic */ Object h(String str) {
            k(str);
            throw null;
        }

        public int hashCode() {
            return this.m.hashCode();
        }

        /* renamed from: j */
        public D[] b(Bundle bundle, String str) {
            return (D[]) ((Serializable[]) bundle.get(str));
        }

        public D[] k(String str) {
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: l */
        public void i(Bundle bundle, String str, D[] dArr) {
            this.m.cast(dArr);
            bundle.putSerializable(str, dArr);
        }
    }

    /* loaded from: classes.dex */
    public static class p<D extends Serializable> extends s<D> {
        private final Class<D> m;

        public p(Class<D> cls) {
            super(true);
            if (!Serializable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException(cls + " does not implement Serializable.");
            } else if (!cls.isEnum()) {
                this.m = cls;
            } else {
                throw new IllegalArgumentException(cls + " is an Enum. You should use EnumType instead.");
            }
        }

        p(boolean z, Class<D> cls) {
            super(z);
            if (Serializable.class.isAssignableFrom(cls)) {
                this.m = cls;
                return;
            }
            throw new IllegalArgumentException(cls + " does not implement Serializable.");
        }

        @Override // androidx.navigation.s
        public String c() {
            return this.m.getName();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof p) {
                return this.m.equals(((p) obj).m);
            }
            return false;
        }

        public int hashCode() {
            return this.m.hashCode();
        }

        /* renamed from: j */
        public D b(Bundle bundle, String str) {
            return (D) bundle.get(str);
        }

        /* renamed from: k */
        public D h(String str) {
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        /* renamed from: l */
        public void i(Bundle bundle, String str, D d2) {
            this.m.cast(d2);
            bundle.putSerializable(str, d2);
        }
    }

    s(boolean z) {
        this.f1388a = z;
    }

    public static s<?> a(String str, String str2) {
        String str3;
        s<Integer> sVar = f1381b;
        if (sVar.c().equals(str)) {
            return sVar;
        }
        s sVar2 = f1383d;
        if (sVar2.c().equals(str)) {
            return sVar2;
        }
        s<Long> sVar3 = f1384e;
        if (sVar3.c().equals(str)) {
            return sVar3;
        }
        s sVar4 = f1385f;
        if (sVar4.c().equals(str)) {
            return sVar4;
        }
        s<Boolean> sVar5 = i;
        if (sVar5.c().equals(str)) {
            return sVar5;
        }
        s sVar6 = j;
        if (sVar6.c().equals(str)) {
            return sVar6;
        }
        s<String> sVar7 = k;
        if (sVar7.c().equals(str)) {
            return sVar7;
        }
        s sVar8 = l;
        if (sVar8.c().equals(str)) {
            return sVar8;
        }
        s<Float> sVar9 = f1386g;
        if (sVar9.c().equals(str)) {
            return sVar9;
        }
        s sVar10 = f1387h;
        if (sVar10.c().equals(str)) {
            return sVar10;
        }
        s<Integer> sVar11 = f1382c;
        if (sVar11.c().equals(str)) {
            return sVar11;
        }
        if (str == null || str.isEmpty()) {
            return sVar7;
        }
        try {
            if (!str.startsWith(".") || str2 == null) {
                str3 = str;
            } else {
                str3 = str2 + str;
            }
            if (str.endsWith("[]")) {
                str3 = str3.substring(0, str3.length() - 2);
                Class<?> cls = Class.forName(str3);
                if (Parcelable.class.isAssignableFrom(cls)) {
                    return new m(cls);
                }
                if (Serializable.class.isAssignableFrom(cls)) {
                    return new o(cls);
                }
            } else {
                Class<?> cls2 = Class.forName(str3);
                if (Parcelable.class.isAssignableFrom(cls2)) {
                    return new n(cls2);
                }
                if (Enum.class.isAssignableFrom(cls2)) {
                    return new l(cls2);
                }
                if (Serializable.class.isAssignableFrom(cls2)) {
                    return new p(cls2);
                }
            }
            throw new IllegalArgumentException(str3 + " is not Serializable or Parcelable.");
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException(e2);
        }
    }

    public static s d(String str) {
        try {
            try {
                try {
                    try {
                        s<Integer> sVar = f1381b;
                        sVar.h(str);
                        return sVar;
                    } catch (IllegalArgumentException unused) {
                        s<Boolean> sVar2 = i;
                        sVar2.h(str);
                        return sVar2;
                    }
                } catch (IllegalArgumentException unused2) {
                    s<Float> sVar3 = f1386g;
                    sVar3.h(str);
                    return sVar3;
                }
            } catch (IllegalArgumentException unused3) {
                s<Long> sVar4 = f1384e;
                sVar4.h(str);
                return sVar4;
            }
        } catch (IllegalArgumentException unused4) {
            return k;
        }
    }

    public static s e(Object obj) {
        if (obj instanceof Integer) {
            return f1381b;
        }
        if (obj instanceof int[]) {
            return f1383d;
        }
        if (obj instanceof Long) {
            return f1384e;
        }
        if (obj instanceof long[]) {
            return f1385f;
        }
        if (obj instanceof Float) {
            return f1386g;
        }
        if (obj instanceof float[]) {
            return f1387h;
        }
        if (obj instanceof Boolean) {
            return i;
        }
        if (obj instanceof boolean[]) {
            return j;
        }
        if ((obj instanceof String) || obj == null) {
            return k;
        }
        if (obj instanceof String[]) {
            return l;
        }
        if (obj.getClass().isArray() && Parcelable.class.isAssignableFrom(obj.getClass().getComponentType())) {
            return new m(obj.getClass().getComponentType());
        }
        if (obj.getClass().isArray() && Serializable.class.isAssignableFrom(obj.getClass().getComponentType())) {
            return new o(obj.getClass().getComponentType());
        }
        if (obj instanceof Parcelable) {
            return new n(obj.getClass());
        }
        if (obj instanceof Enum) {
            return new l(obj.getClass());
        }
        if (obj instanceof Serializable) {
            return new p(obj.getClass());
        }
        throw new IllegalArgumentException("Object of type " + obj.getClass().getName() + " is not supported for navigation arguments.");
    }

    public abstract T b(Bundle bundle, String str);

    public abstract String c();

    public boolean f() {
        return this.f1388a;
    }

    public T g(Bundle bundle, String str, String str2) {
        T h2 = h(str2);
        i(bundle, str, h2);
        return h2;
    }

    public abstract T h(String str);

    public abstract void i(Bundle bundle, String str, T t);

    public String toString() {
        return c();
    }
}
