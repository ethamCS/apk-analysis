package rc;

import he.h;
import java.util.Collection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import rc.d0;
import rc.j;
import xc.u0;
import yd.i;
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0016B\u001f\u0012\n\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u0013\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b&\u0010'J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\n\u001a\u00020\tH\u0016J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\tH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u001e\u0010\u0014\u001a\u0006\u0012\u0002\b\u00030\u00138\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0006\u0012\u0002\b\u00030\u00138TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0017R\u001e\u0010\u001d\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001a0\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001cR\u0014\u0010$\u001a\u00020!8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006("}, d2 = {"Lrc/p;", "Lrc/j;", "Lwd/f;", "name", BuildConfig.FLAVOR, "Lxc/u0;", "J", "Lxc/y;", "D", BuildConfig.FLAVOR, "index", "E", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "hashCode", BuildConfig.FLAVOR, "toString", "Ljava/lang/Class;", "jClass", "Ljava/lang/Class;", "a", "()Ljava/lang/Class;", "H", "methodOwner", "Loc/c;", "x", "()Ljava/util/Collection;", "members", "Lxc/l;", "C", "constructorDescriptors", "Lhe/h;", "getScope", "()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;", "scope", "usageModuleName", "<init>", "(Ljava/lang/Class;Ljava/lang/String;)V", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class p extends j {

    /* renamed from: q */
    private final Class<?> f20714q;

    /* renamed from: x */
    private final String f20715x;

    /* renamed from: y */
    private final d0.b<a> f20716y;

    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u0002B\u0007¢\u0006\u0004\b\u0018\u0010\u0019R!\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00038FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R/\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u0005\u001a\u0004\b\u000e\u0010\u000fR%\u0010\u0017\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Lrc/p$a;", "Lrc/j$b;", "Lrc/j;", "Ljava/lang/Class;", "multifileFacade$delegate", "Lrc/d0$b;", "f", "()Ljava/lang/Class;", "multifileFacade", "Ltb/w;", "Lvd/f;", "Lrd/l;", "Lvd/e;", "metadata$delegate", "e", "()Ltb/w;", "metadata", BuildConfig.FLAVOR, "Lrc/f;", "members$delegate", "Lrc/d0$a;", "d", "()Ljava/util/Collection;", "members", "<init>", "(Lrc/p;)V", "kotlin-reflection"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public final class a extends j.b {

        /* renamed from: j */
        static final /* synthetic */ oc.k<Object>[] f20717j = {hc.k0.g(new hc.e0(hc.k0.b(a.class), "kotlinClass", "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;")), hc.k0.g(new hc.e0(hc.k0.b(a.class), "scope", "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;")), hc.k0.g(new hc.e0(hc.k0.b(a.class), "multifileFacade", "getMultifileFacade()Ljava/lang/Class;")), hc.k0.g(new hc.e0(hc.k0.b(a.class), "metadata", "getMetadata()Lkotlin/Triple;")), hc.k0.g(new hc.e0(hc.k0.b(a.class), "members", "getMembers()Ljava/util/Collection;"))};

        /* renamed from: d */
        private final d0.a f20718d;

        /* renamed from: f */
        private final d0.b f20720f;

        /* renamed from: h */
        private final d0.a f20722h;

        /* renamed from: e */
        private final d0.a f20719e = d0.c(new e());

        /* renamed from: g */
        private final d0.b f20721g = d0.b(new c());

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcd/f;", "b", "()Lcd/f;"}, k = 3, mv = {1, 7, 1})
        /* renamed from: rc.p$a$a */
        /* loaded from: classes.dex */
        public static final class C0337a extends hc.v implements gc.a<cd.f> {

            /* renamed from: c */
            final /* synthetic */ p f20724c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0337a(p pVar) {
                super(0);
                this.f20724c = pVar;
            }

            /* renamed from: b */
            public final cd.f invoke() {
                return cd.f.f6434c.a(this.f20724c.a());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001 \u0002*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "Lrc/f;", "kotlin.jvm.PlatformType", "b", "()Ljava/util/Collection;"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class b extends hc.v implements gc.a<Collection<? extends f<?>>> {

            /* renamed from: c */
            final /* synthetic */ p f20725c;

            /* renamed from: d */
            final /* synthetic */ a f20726d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(p pVar, a aVar) {
                super(0);
                this.f20725c = pVar;
                this.f20726d = aVar;
            }

            /* renamed from: b */
            public final Collection<f<?>> invoke() {
                return this.f20725c.F(this.f20726d.g(), j.c.DECLARED);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltb/w;", "Lvd/f;", "Lrd/l;", "Lvd/e;", "b", "()Ltb/w;"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class c extends hc.v implements gc.a<tb.w<? extends vd.f, ? extends rd.l, ? extends vd.e>> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c() {
                super(0);
                a.this = r1;
            }

            /* renamed from: b */
            public final tb.w<vd.f, rd.l, vd.e> invoke() {
                qd.a a10;
                cd.f c10 = a.this.c();
                if (c10 == null || (a10 = c10.a()) == null) {
                    return null;
                }
                String[] a11 = a10.a();
                String[] g10 = a10.g();
                if (a11 == null || g10 == null) {
                    return null;
                }
                tb.r<vd.f, rd.l> m10 = vd.i.m(a11, g10);
                return new tb.w<>(m10.b(), m10.c(), a10.d());
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ljava/lang/Class;", "b", "()Ljava/lang/Class;"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class d extends hc.v implements gc.a<Class<?>> {

            /* renamed from: d */
            final /* synthetic */ p f20729d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(p pVar) {
                super(0);
                a.this = r1;
                this.f20729d = pVar;
            }

            /* renamed from: b */
            public final Class<?> invoke() {
                String D;
                qd.a a10;
                cd.f c10 = a.this.c();
                String e10 = (c10 == null || (a10 = c10.a()) == null) ? null : a10.e();
                if (e10 != null) {
                    if (!(e10.length() > 0)) {
                        return null;
                    }
                    ClassLoader classLoader = this.f20729d.a().getClassLoader();
                    D = bf.x.D(e10, '/', '.', false, 4, null);
                    return classLoader.loadClass(D);
                }
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lhe/h;", "kotlin.jvm.PlatformType", "b", "()Lhe/h;"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class e extends hc.v implements gc.a<he.h> {
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e() {
                super(0);
                a.this = r1;
            }

            /* renamed from: b */
            public final he.h invoke() {
                cd.f c10 = a.this.c();
                return c10 != null ? a.this.a().c().a(c10) : h.b.f11873a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super();
            p.this = r2;
            this.f20718d = d0.c(new C0337a(r2));
            this.f20720f = d0.b(new d(r2));
            this.f20722h = d0.c(new b(r2, this));
        }

        public final cd.f c() {
            return (cd.f) this.f20718d.b(this, f20717j[0]);
        }

        public final Collection<f<?>> d() {
            T b10 = this.f20722h.b(this, f20717j[4]);
            hc.t.d(b10, "<get-members>(...)");
            return (Collection) b10;
        }

        public final tb.w<vd.f, rd.l, vd.e> e() {
            return (tb.w) this.f20721g.b(this, f20717j[3]);
        }

        public final Class<?> f() {
            return (Class) this.f20720f.b(this, f20717j[2]);
        }

        public final he.h g() {
            T b10 = this.f20719e.b(this, f20717j[1]);
            hc.t.d(b10, "<get-scope>(...)");
            return (he.h) b10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u0012 \u0002*\b\u0018\u00010\u0000R\u00020\u00010\u0000R\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrc/p$a;", "Lrc/p;", "kotlin.jvm.PlatformType", "b", "()Lrc/p$a;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends hc.v implements gc.a<a> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(0);
            p.this = r1;
        }

        /* renamed from: b */
        public final a invoke() {
            return new a();
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    /* synthetic */ class c extends hc.p implements gc.p<ke.w, rd.n, u0> {
        public static final c Y3 = new c();

        c() {
            super(2);
        }

        @Override // hc.h
        public final oc.f e0() {
            return hc.k0.b(ke.w.class);
        }

        @Override // hc.h
        public final String g0() {
            return "loadProperty(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Property;)Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;";
        }

        @Override // hc.h, oc.c
        public final String getName() {
            return "loadProperty";
        }

        /* renamed from: i0 */
        public final u0 u(ke.w wVar, rd.n nVar) {
            hc.t.e(wVar, "p0");
            hc.t.e(nVar, "p1");
            return wVar.l(nVar);
        }
    }

    public p(Class<?> cls, String str) {
        hc.t.e(cls, "jClass");
        this.f20714q = cls;
        this.f20715x = str;
        d0.b<a> b10 = d0.b(new b());
        hc.t.d(b10, "lazy { Data() }");
        this.f20716y = b10;
    }

    public /* synthetic */ p(Class cls, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(cls, (i10 & 2) != 0 ? null : str);
    }

    private final he.h R() {
        return this.f20716y.invoke().g();
    }

    @Override // rc.j
    public Collection<xc.l> C() {
        List h10;
        h10 = ub.u.h();
        return h10;
    }

    @Override // rc.j
    public Collection<xc.y> D(wd.f fVar) {
        hc.t.e(fVar, "name");
        return R().b(fVar, fd.d.FROM_REFLECTION);
    }

    @Override // rc.j
    public u0 E(int i10) {
        tb.w<vd.f, rd.l, vd.e> e10 = this.f20716y.invoke().e();
        if (e10 != null) {
            vd.f b10 = e10.b();
            rd.l c10 = e10.c();
            vd.e e11 = e10.e();
            i.f<rd.l, List<rd.n>> fVar = ud.a.f23548n;
            hc.t.d(fVar, "packageLocalVariable");
            rd.n nVar = (rd.n) td.e.b(c10, fVar, i10);
            if (nVar == null) {
                return null;
            }
            Class<?> a10 = a();
            rd.t x02 = c10.x0();
            hc.t.d(x02, "packageProto.typeTable");
            return (u0) j0.h(a10, nVar, b10, new td.g(x02), e11, c.Y3);
        }
        return null;
    }

    @Override // rc.j
    protected Class<?> H() {
        Class<?> f10 = this.f20716y.invoke().f();
        return f10 == null ? a() : f10;
    }

    @Override // rc.j
    public Collection<u0> J(wd.f fVar) {
        hc.t.e(fVar, "name");
        return R().a(fVar, fd.d.FROM_REFLECTION);
    }

    @Override // hc.j
    public Class<?> a() {
        return this.f20714q;
    }

    public boolean equals(Object obj) {
        return (obj instanceof p) && hc.t.a(a(), ((p) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return "file class " + dd.d.a(a()).b();
    }

    @Override // oc.f
    public Collection<oc.c<?>> x() {
        return this.f20716y.invoke().d();
    }
}
