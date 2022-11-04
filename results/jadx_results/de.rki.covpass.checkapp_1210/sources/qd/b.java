package qd;

import gd.a0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import pd.q;
import qd.a;
import wd.f;
import xc.a1;
/* loaded from: classes.dex */
public class b implements q.c {

    /* renamed from: j */
    private static final boolean f19792j = "true".equals(System.getProperty("kotlin.ignore.old.metadata"));

    /* renamed from: k */
    private static final Map<wd.b, a.EnumC0322a> f19793k;

    /* renamed from: a */
    private int[] f19794a = null;

    /* renamed from: b */
    private String f19795b = null;

    /* renamed from: c */
    private int f19796c = 0;

    /* renamed from: d */
    private String f19797d = null;

    /* renamed from: e */
    private String[] f19798e = null;

    /* renamed from: f */
    private String[] f19799f = null;

    /* renamed from: g */
    private String[] f19800g = null;

    /* renamed from: h */
    private a.EnumC0322a f19801h = null;

    /* renamed from: i */
    private String[] f19802i = null;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: qd.b$b */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0324b implements q.b {

        /* renamed from: a */
        private final List<String> f19803a = new ArrayList();

        private static /* synthetic */ void f(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumEntryName";
            } else if (i10 == 2) {
                objArr[0] = "classLiteralValue";
            } else if (i10 != 3) {
                objArr[0] = "enumClassId";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$CollectStringArrayAnnotationVisitor";
            if (i10 == 2) {
                objArr[2] = "visitClassLiteral";
            } else if (i10 != 3) {
                objArr[2] = "visitEnum";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // pd.q.b
        public void a() {
            g((String[]) this.f19803a.toArray(new String[0]));
        }

        @Override // pd.q.b
        public void b(wd.b bVar, f fVar) {
            if (bVar == null) {
                f(0);
            }
            if (fVar == null) {
                f(1);
            }
        }

        @Override // pd.q.b
        public void c(ce.f fVar) {
            if (fVar == null) {
                f(2);
            }
        }

        @Override // pd.q.b
        public void d(Object obj) {
            if (obj instanceof String) {
                this.f19803a.add((String) obj);
            }
        }

        @Override // pd.q.b
        public q.a e(wd.b bVar) {
            if (bVar == null) {
                f(3);
                return null;
            }
            return null;
        }

        protected abstract void g(String[] strArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c implements q.a {

        /* loaded from: classes.dex */
        public class a extends AbstractC0324b {
            a() {
                c.this = r1;
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$1", "visitEnd"));
            }

            @Override // qd.b.AbstractC0324b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f19798e = strArr;
            }
        }

        /* renamed from: qd.b$c$b */
        /* loaded from: classes.dex */
        public class C0325b extends AbstractC0324b {
            C0325b() {
                c.this = r1;
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor$2", "visitEnd"));
            }

            @Override // qd.b.AbstractC0324b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f19799f = strArr;
            }
        }

        private c() {
            b.this = r1;
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinMetadataArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private q.b h() {
            return new a();
        }

        private q.b i() {
            return new C0325b();
        }

        @Override // pd.q.a
        public void a() {
        }

        @Override // pd.q.a
        public void b(f fVar, ce.f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }

        @Override // pd.q.a
        public void c(f fVar, Object obj) {
            if (fVar == null) {
                return;
            }
            String b10 = fVar.b();
            if ("k".equals(b10)) {
                if (!(obj instanceof Integer)) {
                    return;
                }
                b.this.f19801h = a.EnumC0322a.h(((Integer) obj).intValue());
            } else if ("mv".equals(b10)) {
                if (!(obj instanceof int[])) {
                    return;
                }
                b.this.f19794a = (int[]) obj;
            } else if ("xs".equals(b10)) {
                if (!(obj instanceof String)) {
                    return;
                }
                b.this.f19795b = (String) obj;
            } else if ("xi".equals(b10)) {
                if (!(obj instanceof Integer)) {
                    return;
                }
                b.this.f19796c = ((Integer) obj).intValue();
            } else if (!"pn".equals(b10) || !(obj instanceof String)) {
            } else {
                b.this.f19797d = (String) obj;
            }
        }

        @Override // pd.q.a
        public void d(f fVar, wd.b bVar, f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // pd.q.a
        public q.a e(f fVar, wd.b bVar) {
            if (bVar == null) {
                g(3);
                return null;
            }
            return null;
        }

        @Override // pd.q.a
        public q.b f(f fVar) {
            String b10 = fVar != null ? fVar.b() : null;
            if ("d1".equals(b10)) {
                return h();
            }
            if (!"d2".equals(b10)) {
                return null;
            }
            return i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d implements q.a {

        /* loaded from: classes.dex */
        public class a extends AbstractC0324b {
            a() {
                d.this = r1;
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "result", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor$1", "visitEnd"));
            }

            @Override // qd.b.AbstractC0324b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f19802i = strArr;
            }
        }

        private d() {
            b.this = r1;
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$KotlinSerializedIrArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private q.b h() {
            return new a();
        }

        @Override // pd.q.a
        public void a() {
        }

        @Override // pd.q.a
        public void b(f fVar, ce.f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }

        @Override // pd.q.a
        public void c(f fVar, Object obj) {
        }

        @Override // pd.q.a
        public void d(f fVar, wd.b bVar, f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // pd.q.a
        public q.a e(f fVar, wd.b bVar) {
            if (bVar == null) {
                g(3);
                return null;
            }
            return null;
        }

        @Override // pd.q.a
        public q.b f(f fVar) {
            if ("b".equals(fVar != null ? fVar.b() : null)) {
                return h();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class e implements q.a {

        /* loaded from: classes.dex */
        public class a extends AbstractC0324b {
            a() {
                e.this = r1;
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$1", "visitEnd"));
            }

            @Override // qd.b.AbstractC0324b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f19798e = strArr;
            }
        }

        /* renamed from: qd.b$e$b */
        /* loaded from: classes.dex */
        public class C0326b extends AbstractC0324b {
            C0326b() {
                e.this = r1;
            }

            private static /* synthetic */ void f(int i10) {
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "data", "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor$2", "visitEnd"));
            }

            @Override // qd.b.AbstractC0324b
            protected void g(String[] strArr) {
                if (strArr == null) {
                    f(0);
                }
                b.this.f19799f = strArr;
            }
        }

        private e() {
            b.this = r1;
        }

        private static /* synthetic */ void g(int i10) {
            Object[] objArr = new Object[3];
            if (i10 == 1) {
                objArr[0] = "enumClassId";
            } else if (i10 == 2) {
                objArr[0] = "enumEntryName";
            } else if (i10 != 3) {
                objArr[0] = "classLiteralValue";
            } else {
                objArr[0] = "classId";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor$OldDeprecatedAnnotationArgumentVisitor";
            if (i10 == 1 || i10 == 2) {
                objArr[2] = "visitEnum";
            } else if (i10 != 3) {
                objArr[2] = "visitClassLiteral";
            } else {
                objArr[2] = "visitAnnotation";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        private q.b h() {
            return new a();
        }

        private q.b i() {
            return new C0326b();
        }

        @Override // pd.q.a
        public void a() {
        }

        @Override // pd.q.a
        public void b(f fVar, ce.f fVar2) {
            if (fVar2 == null) {
                g(0);
            }
        }

        @Override // pd.q.a
        public void c(f fVar, Object obj) {
            if (fVar == null) {
                return;
            }
            String b10 = fVar.b();
            if ("version".equals(b10)) {
                if (!(obj instanceof int[])) {
                    return;
                }
                b.this.f19794a = (int[]) obj;
            } else if (!"multifileClassName".equals(b10)) {
            } else {
                b.this.f19795b = obj instanceof String ? (String) obj : null;
            }
        }

        @Override // pd.q.a
        public void d(f fVar, wd.b bVar, f fVar2) {
            if (bVar == null) {
                g(1);
            }
            if (fVar2 == null) {
                g(2);
            }
        }

        @Override // pd.q.a
        public q.a e(f fVar, wd.b bVar) {
            if (bVar == null) {
                g(3);
                return null;
            }
            return null;
        }

        @Override // pd.q.a
        public q.b f(f fVar) {
            String b10 = fVar != null ? fVar.b() : null;
            if ("data".equals(b10) || "filePartClassNames".equals(b10)) {
                return h();
            }
            if (!"strings".equals(b10)) {
                return null;
            }
            return i();
        }
    }

    static {
        HashMap hashMap = new HashMap();
        f19793k = hashMap;
        hashMap.put(wd.b.m(new wd.c("kotlin.jvm.internal.KotlinClass")), a.EnumC0322a.CLASS);
        hashMap.put(wd.b.m(new wd.c("kotlin.jvm.internal.KotlinFileFacade")), a.EnumC0322a.FILE_FACADE);
        hashMap.put(wd.b.m(new wd.c("kotlin.jvm.internal.KotlinMultifileClass")), a.EnumC0322a.MULTIFILE_CLASS);
        hashMap.put(wd.b.m(new wd.c("kotlin.jvm.internal.KotlinMultifileClassPart")), a.EnumC0322a.MULTIFILE_CLASS_PART);
        hashMap.put(wd.b.m(new wd.c("kotlin.jvm.internal.KotlinSyntheticClass")), a.EnumC0322a.SYNTHETIC_CLASS);
    }

    private static /* synthetic */ void d(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            objArr[0] = "classId";
        } else {
            objArr[0] = "source";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/kotlin/header/ReadKotlinClassHeaderAnnotationVisitor";
        objArr[2] = "visitAnnotation";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    private boolean n() {
        a.EnumC0322a enumC0322a = this.f19801h;
        return enumC0322a == a.EnumC0322a.CLASS || enumC0322a == a.EnumC0322a.FILE_FACADE || enumC0322a == a.EnumC0322a.MULTIFILE_CLASS_PART;
    }

    @Override // pd.q.c
    public void a() {
    }

    @Override // pd.q.c
    public q.a c(wd.b bVar, a1 a1Var) {
        a.EnumC0322a enumC0322a;
        if (bVar == null) {
            d(0);
        }
        if (a1Var == null) {
            d(1);
        }
        wd.c b10 = bVar.b();
        if (b10.equals(a0.f10632a)) {
            return new c();
        }
        if (b10.equals(a0.f10650s)) {
            return new d();
        }
        if (f19792j || this.f19801h != null || (enumC0322a = f19793k.get(bVar)) == null) {
            return null;
        }
        this.f19801h = enumC0322a;
        return new e();
    }

    public qd.a m() {
        byte[] bArr = null;
        if (this.f19801h == null || this.f19794a == null) {
            return null;
        }
        vd.e eVar = new vd.e(this.f19794a, (this.f19796c & 8) != 0);
        if (!eVar.h()) {
            this.f19800g = this.f19798e;
            this.f19798e = null;
        } else if (n() && this.f19798e == null) {
            return null;
        }
        String[] strArr = this.f19802i;
        if (strArr != null) {
            bArr = vd.a.e(strArr);
        }
        return new qd.a(this.f19801h, eVar, this.f19798e, this.f19800g, this.f19799f, this.f19795b, this.f19796c, this.f19797d, bArr);
    }
}
