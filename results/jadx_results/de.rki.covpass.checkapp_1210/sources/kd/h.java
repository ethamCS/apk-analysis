package kd;

import ad.z;
import hc.e0;
import hc.k0;
import hc.t;
import hc.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import nd.u;
import ne.n;
import pd.p;
import pd.q;
import pd.w;
import qd.a;
import tb.r;
import tb.x;
import ub.q0;
import xc.a1;
/* loaded from: classes.dex */
public final class h extends z {

    /* renamed from: c4 */
    static final /* synthetic */ oc.k<Object>[] f14936c4 = {k0.g(new e0(k0.b(h.class), "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;")), k0.g(new e0(k0.b(h.class), "partToFacade", "getPartToFacade()Ljava/util/HashMap;"))};
    private final u V3;
    private final jd.g W3;
    private final ne.i X3;
    private final d Y3;
    private final ne.i<List<wd.c>> Z3;

    /* renamed from: a4 */
    private final yc.g f14937a4;

    /* renamed from: b4 */
    private final ne.i f14938b4;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a extends v implements gc.a<Map<String, ? extends q>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(0);
            h.this = r1;
        }

        /* renamed from: b */
        public final Map<String, q> invoke() {
            Map<String, q> q10;
            w o10 = h.this.W3.a().o();
            String b10 = h.this.d().b();
            t.d(b10, "fqName.asString()");
            List<String> a10 = o10.a(b10);
            h hVar = h.this;
            ArrayList arrayList = new ArrayList();
            for (String str : a10) {
                wd.b m10 = wd.b.m(fe.d.d(str).e());
                t.d(m10, "topLevel(JvmClassName.by…velClassMaybeWithDollars)");
                q b11 = p.b(hVar.W3.a().j(), m10);
                r a11 = b11 != null ? x.a(str, b11) : null;
                if (a11 != null) {
                    arrayList.add(a11);
                }
            }
            q10 = q0.q(arrayList);
            return q10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends v implements gc.a<HashMap<fe.d, fe.d>> {

        /* loaded from: classes.dex */
        public /* synthetic */ class a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f14941a;

            static {
                int[] iArr = new int[a.EnumC0322a.values().length];
                iArr[a.EnumC0322a.MULTIFILE_CLASS_PART.ordinal()] = 1;
                iArr[a.EnumC0322a.FILE_FACADE.ordinal()] = 2;
                f14941a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(0);
            h.this = r1;
        }

        /* renamed from: b */
        public final HashMap<fe.d, fe.d> invoke() {
            HashMap<fe.d, fe.d> hashMap = new HashMap<>();
            for (Map.Entry<String, q> entry : h.this.V0().entrySet()) {
                fe.d d10 = fe.d.d(entry.getKey());
                t.d(d10, "byInternalName(partInternalName)");
                qd.a a10 = entry.getValue().a();
                int i10 = a.f14941a[a10.c().ordinal()];
                if (i10 == 1) {
                    String e10 = a10.e();
                    if (e10 != null) {
                        fe.d d11 = fe.d.d(e10);
                        t.d(d11, "byInternalName(header.mu…: continue@kotlinClasses)");
                        hashMap.put(d10, d11);
                    }
                } else if (i10 == 2) {
                    hashMap.put(d10, d10);
                }
            }
            return hashMap;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends v implements gc.a<List<? extends wd.c>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c() {
            super(0);
            h.this = r1;
        }

        @Override // gc.a
        public final List<? extends wd.c> invoke() {
            int s10;
            Collection<u> r10 = h.this.V3.r();
            s10 = ub.v.s(r10, 10);
            ArrayList arrayList = new ArrayList(s10);
            for (u uVar : r10) {
                arrayList.add(uVar.d());
            }
            return arrayList;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(jd.g gVar, u uVar) {
        super(gVar.d(), uVar.d());
        List h10;
        t.e(gVar, "outerContext");
        t.e(uVar, "jPackage");
        this.V3 = uVar;
        jd.g d10 = jd.a.d(gVar, this, null, 0, 6, null);
        this.W3 = d10;
        this.X3 = d10.e().d(new a());
        this.Y3 = new d(d10, uVar, this);
        n e10 = d10.e();
        c cVar = new c();
        h10 = ub.u.h();
        this.Z3 = e10.g(cVar, h10);
        this.f14937a4 = d10.a().i().b() ? yc.g.Companion.b() : jd.e.a(d10, uVar);
        this.f14938b4 = d10.e().d(new b());
    }

    public final xc.e U0(nd.g gVar) {
        t.e(gVar, "jClass");
        return this.Y3.j().O(gVar);
    }

    public final Map<String, q> V0() {
        return (Map) ne.m.a(this.X3, this, f14936c4[0]);
    }

    /* renamed from: W0 */
    public d z() {
        return this.Y3;
    }

    public final List<wd.c> X0() {
        return this.Z3.invoke();
    }

    @Override // yc.b, yc.a
    public yc.g j() {
        return this.f14937a4;
    }

    @Override // ad.z, ad.k, xc.p
    public a1 m() {
        return new pd.r(this);
    }

    @Override // ad.z, ad.j
    public String toString() {
        return "Lazy Java package fragment: " + d() + " of module " + this.W3.a().m();
    }
}
