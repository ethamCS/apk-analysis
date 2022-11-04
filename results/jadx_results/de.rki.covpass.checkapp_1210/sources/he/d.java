package he;

import hc.t;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ub.c0;
import ub.u;
/* loaded from: classes3.dex */
public final class d {
    public static final a Companion;

    /* renamed from: c */
    private static int f11834c = 1;

    /* renamed from: d */
    private static final int f11835d;

    /* renamed from: e */
    private static final int f11836e;

    /* renamed from: f */
    private static final int f11837f;

    /* renamed from: g */
    private static final int f11838g;

    /* renamed from: h */
    private static final int f11839h;

    /* renamed from: i */
    private static final int f11840i;

    /* renamed from: j */
    private static final int f11841j;

    /* renamed from: k */
    private static final int f11842k;

    /* renamed from: l */
    private static final int f11843l;

    /* renamed from: m */
    private static final int f11844m;

    /* renamed from: n */
    public static final d f11845n;

    /* renamed from: o */
    public static final d f11846o;

    /* renamed from: p */
    public static final d f11847p;

    /* renamed from: q */
    public static final d f11848q;

    /* renamed from: r */
    public static final d f11849r;

    /* renamed from: s */
    public static final d f11850s;

    /* renamed from: t */
    public static final d f11851t;

    /* renamed from: u */
    public static final d f11852u;

    /* renamed from: v */
    public static final d f11853v;

    /* renamed from: w */
    public static final d f11854w;

    /* renamed from: x */
    private static final List<a.C0179a> f11855x;

    /* renamed from: y */
    private static final List<a.C0179a> f11856y;

    /* renamed from: a */
    private final List<c> f11857a;

    /* renamed from: b */
    private final int f11858b;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: he.d$a$a */
        /* loaded from: classes3.dex */
        private static final class C0179a {

            /* renamed from: a */
            private final int f11859a;

            /* renamed from: b */
            private final String f11860b;

            public C0179a(int i10, String str) {
                t.e(str, "name");
                this.f11859a = i10;
                this.f11860b = str;
            }

            public final int a() {
                return this.f11859a;
            }

            public final String b() {
                return this.f11860b;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int j() {
            int i10 = d.f11834c;
            a aVar = d.Companion;
            d.f11834c <<= 1;
            return i10;
        }

        public final int b() {
            return d.f11841j;
        }

        public final int c() {
            return d.f11842k;
        }

        public final int d() {
            return d.f11839h;
        }

        public final int e() {
            return d.f11835d;
        }

        public final int f() {
            return d.f11838g;
        }

        public final int g() {
            return d.f11836e;
        }

        public final int h() {
            return d.f11837f;
        }

        public final int i() {
            return d.f11840i;
        }
    }

    static {
        a.C0179a c0179a;
        a.C0179a c0179a2;
        a aVar = new a(null);
        Companion = aVar;
        int j10 = aVar.j();
        f11835d = j10;
        int j11 = aVar.j();
        f11836e = j11;
        int j12 = aVar.j();
        f11837f = j12;
        int j13 = aVar.j();
        f11838g = j13;
        int j14 = aVar.j();
        f11839h = j14;
        int j15 = aVar.j();
        f11840i = j15;
        int j16 = aVar.j() - 1;
        f11841j = j16;
        int i10 = j10 | j11 | j12;
        f11842k = i10;
        int i11 = j11 | j14 | j15;
        f11843l = i11;
        int i12 = j14 | j15;
        f11844m = i12;
        f11845n = new d(j16, null, 2, null);
        f11846o = new d(i12, null, 2, null);
        f11847p = new d(j10, null, 2, null);
        f11848q = new d(j11, null, 2, null);
        f11849r = new d(j12, null, 2, null);
        f11850s = new d(i10, null, 2, null);
        f11851t = new d(j13, null, 2, null);
        f11852u = new d(j14, null, 2, null);
        f11853v = new d(j15, null, 2, null);
        f11854w = new d(i11, null, 2, null);
        Field[] fields = d.class.getFields();
        t.d(fields, "T::class.java.fields");
        ArrayList<Field> arrayList = new ArrayList();
        for (Field field : fields) {
            if (Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Field field2 : arrayList) {
            Object obj = field2.get(null);
            d dVar = obj instanceof d ? (d) obj : null;
            if (dVar != null) {
                int i13 = dVar.f11858b;
                String name = field2.getName();
                t.d(name, "field.name");
                c0179a2 = new a.C0179a(i13, name);
            } else {
                c0179a2 = null;
            }
            if (c0179a2 != null) {
                arrayList2.add(c0179a2);
            }
        }
        f11855x = arrayList2;
        Field[] fields2 = d.class.getFields();
        t.d(fields2, "T::class.java.fields");
        ArrayList arrayList3 = new ArrayList();
        for (Field field3 : fields2) {
            if (Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        ArrayList<Field> arrayList4 = new ArrayList();
        for (Object obj2 : arrayList3) {
            if (t.a(((Field) obj2).getType(), Integer.TYPE)) {
                arrayList4.add(obj2);
            }
        }
        ArrayList arrayList5 = new ArrayList();
        for (Field field4 : arrayList4) {
            Object obj3 = field4.get(null);
            t.c(obj3, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((Integer) obj3).intValue();
            if (intValue == ((-intValue) & intValue)) {
                String name2 = field4.getName();
                t.d(name2, "field.name");
                c0179a = new a.C0179a(intValue, name2);
            } else {
                c0179a = null;
            }
            if (c0179a != null) {
                arrayList5.add(c0179a);
            }
        }
        f11856y = arrayList5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(int i10, List<? extends c> list) {
        t.e(list, "excludes");
        this.f11857a = list;
        for (c cVar : list) {
            i10 &= ~cVar.a();
        }
        this.f11858b = i10;
    }

    public /* synthetic */ d(int i10, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i11 & 2) != 0 ? u.h() : list);
    }

    public final boolean a(int i10) {
        return (i10 & this.f11858b) != 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t.a(d.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        t.c(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        d dVar = (d) obj;
        return t.a(this.f11857a, dVar.f11857a) && this.f11858b == dVar.f11858b;
    }

    public int hashCode() {
        return (this.f11857a.hashCode() * 31) + this.f11858b;
    }

    public final List<c> l() {
        return this.f11857a;
    }

    public final int m() {
        return this.f11858b;
    }

    public final d n(int i10) {
        int i11 = i10 & this.f11858b;
        if (i11 == 0) {
            return null;
        }
        return new d(i11, this.f11857a);
    }

    public String toString() {
        Object obj;
        boolean z10;
        Iterator<T> it = f11855x.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((a.C0179a) obj).a() == this.f11858b) {
                z10 = true;
                continue;
            } else {
                z10 = false;
                continue;
            }
            if (z10) {
                break;
            }
        }
        a.C0179a c0179a = (a.C0179a) obj;
        String b10 = c0179a != null ? c0179a.b() : null;
        if (b10 == null) {
            List<a.C0179a> list = f11856y;
            ArrayList arrayList = new ArrayList();
            for (a.C0179a c0179a2 : list) {
                String b11 = a(c0179a2.a()) ? c0179a2.b() : null;
                if (b11 != null) {
                    arrayList.add(b11);
                }
            }
            b10 = c0.e0(arrayList, " | ", null, null, 0, null, null, 62, null);
        }
        return "DescriptorKindFilter(" + b10 + ", " + this.f11857a + ')';
    }
}
