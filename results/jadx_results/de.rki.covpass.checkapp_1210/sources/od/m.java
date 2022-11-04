package od;

import hc.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import tb.e0;
import tb.x;
import ub.h0;
import ub.p0;
import ub.v;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a */
    private final Map<String, k> f17894a = new LinkedHashMap();

    /* loaded from: classes.dex */
    public final class a {

        /* renamed from: a */
        private final String f17895a;

        /* renamed from: b */
        final /* synthetic */ m f17896b;

        /* renamed from: od.m$a$a */
        /* loaded from: classes.dex */
        public final class C0278a {

            /* renamed from: a */
            private final String f17897a;

            /* renamed from: b */
            private final List<tb.r<String, q>> f17898b = new ArrayList();

            /* renamed from: c */
            private tb.r<String, q> f17899c = x.a("V", null);

            /* renamed from: d */
            final /* synthetic */ a f17900d;

            public C0278a(a aVar, String str) {
                t.e(str, "functionName");
                this.f17900d = aVar;
                this.f17897a = str;
            }

            public final tb.r<String, k> a() {
                int s10;
                int s11;
                pd.x xVar = pd.x.f19141a;
                String b10 = this.f17900d.b();
                String str = this.f17897a;
                List<tb.r<String, q>> list = this.f17898b;
                s10 = v.s(list, 10);
                ArrayList arrayList = new ArrayList(s10);
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((tb.r) it.next()).e());
                }
                String k10 = xVar.k(b10, xVar.j(str, arrayList, this.f17899c.e()));
                q f10 = this.f17899c.f();
                List<tb.r<String, q>> list2 = this.f17898b;
                s11 = v.s(list2, 10);
                ArrayList arrayList2 = new ArrayList(s11);
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((q) ((tb.r) it2.next()).f());
                }
                return x.a(k10, new k(f10, arrayList2));
            }

            public final void b(String str, e... eVarArr) {
                q qVar;
                Iterable<h0> v02;
                int s10;
                int d10;
                int b10;
                t.e(str, "type");
                t.e(eVarArr, "qualifiers");
                List<tb.r<String, q>> list = this.f17898b;
                if (eVarArr.length == 0) {
                    qVar = null;
                } else {
                    v02 = ub.m.v0(eVarArr);
                    s10 = v.s(v02, 10);
                    d10 = p0.d(s10);
                    b10 = nc.m.b(d10, 16);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(b10);
                    for (h0 h0Var : v02) {
                        linkedHashMap.put(Integer.valueOf(h0Var.c()), (e) h0Var.d());
                    }
                    qVar = new q(linkedHashMap);
                }
                list.add(x.a(str, qVar));
            }

            public final void c(fe.e eVar) {
                t.e(eVar, "type");
                String j10 = eVar.j();
                t.d(j10, "type.desc");
                this.f17899c = x.a(j10, null);
            }

            public final void d(String str, e... eVarArr) {
                Iterable<h0> v02;
                int s10;
                int d10;
                int b10;
                t.e(str, "type");
                t.e(eVarArr, "qualifiers");
                v02 = ub.m.v0(eVarArr);
                s10 = v.s(v02, 10);
                d10 = p0.d(s10);
                b10 = nc.m.b(d10, 16);
                LinkedHashMap linkedHashMap = new LinkedHashMap(b10);
                for (h0 h0Var : v02) {
                    linkedHashMap.put(Integer.valueOf(h0Var.c()), (e) h0Var.d());
                }
                this.f17899c = x.a(str, new q(linkedHashMap));
            }
        }

        public a(m mVar, String str) {
            t.e(str, "className");
            this.f17896b = mVar;
            this.f17895a = str;
        }

        public final void a(String str, gc.l<? super C0278a, e0> lVar) {
            t.e(str, "name");
            t.e(lVar, "block");
            Map map = this.f17896b.f17894a;
            C0278a c0278a = new C0278a(this, str);
            lVar.invoke(c0278a);
            tb.r<String, k> a10 = c0278a.a();
            map.put(a10.e(), a10.f());
        }

        public final String b() {
            return this.f17895a;
        }
    }

    public final Map<String, k> b() {
        return this.f17894a;
    }
}
