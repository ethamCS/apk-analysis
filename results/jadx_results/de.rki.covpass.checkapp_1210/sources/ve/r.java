package ve;

import hc.v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.e0;
import oe.m0;
import ve.f;
import xc.y;
/* loaded from: classes3.dex */
public abstract class r implements f {

    /* renamed from: a */
    private final String f24083a;

    /* renamed from: b */
    private final gc.l<uc.h, e0> f24084b;

    /* renamed from: c */
    private final String f24085c;

    /* loaded from: classes3.dex */
    public static final class a extends r {

        /* renamed from: d */
        public static final a f24086d = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: ve.r$a$a */
        /* loaded from: classes3.dex */
        public static final class C0430a extends v implements gc.l<uc.h, e0> {

            /* renamed from: c */
            public static final C0430a f24087c = new C0430a();

            C0430a() {
                super(1);
            }

            /* renamed from: b */
            public final e0 invoke(uc.h hVar) {
                hc.t.e(hVar, "$this$null");
                m0 n10 = hVar.n();
                hc.t.d(n10, "booleanType");
                return n10;
            }
        }

        private a() {
            super("Boolean", C0430a.f24087c, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends r {

        /* renamed from: d */
        public static final b f24088d = new b();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class a extends v implements gc.l<uc.h, e0> {

            /* renamed from: c */
            public static final a f24089c = new a();

            a() {
                super(1);
            }

            /* renamed from: b */
            public final e0 invoke(uc.h hVar) {
                hc.t.e(hVar, "$this$null");
                m0 D = hVar.D();
                hc.t.d(D, "intType");
                return D;
            }
        }

        private b() {
            super("Int", a.f24089c, null);
        }
    }

    /* loaded from: classes3.dex */
    public static final class c extends r {

        /* renamed from: d */
        public static final c f24090d = new c();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes3.dex */
        public static final class a extends v implements gc.l<uc.h, e0> {

            /* renamed from: c */
            public static final a f24091c = new a();

            a() {
                super(1);
            }

            /* renamed from: b */
            public final e0 invoke(uc.h hVar) {
                hc.t.e(hVar, "$this$null");
                m0 Z = hVar.Z();
                hc.t.d(Z, "unitType");
                return Z;
            }
        }

        private c() {
            super("Unit", a.f24091c, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private r(String str, gc.l<? super uc.h, ? extends e0> lVar) {
        this.f24083a = str;
        this.f24084b = lVar;
        this.f24085c = "must return " + str;
    }

    public /* synthetic */ r(String str, gc.l lVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, lVar);
    }

    @Override // ve.f
    public String a() {
        return this.f24085c;
    }

    @Override // ve.f
    public boolean b(y yVar) {
        hc.t.e(yVar, "functionDescriptor");
        return hc.t.a(yVar.e(), this.f24084b.invoke(ee.a.f(yVar)));
    }

    @Override // ve.f
    public String c(y yVar) {
        return f.a.a(this, yVar);
    }
}
