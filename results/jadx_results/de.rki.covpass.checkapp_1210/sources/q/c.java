package q;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import w.k0;
import w.o1;
/* loaded from: classes.dex */
public final class c extends o1<b> {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        private final List<b> f19281a = new ArrayList();

        a(List<b> list) {
            for (b bVar : list) {
                this.f19281a.add(bVar);
            }
        }

        public List<k0> a() {
            ArrayList arrayList = new ArrayList();
            for (b bVar : this.f19281a) {
                k0 a10 = bVar.a();
                if (a10 != null) {
                    arrayList.add(a10);
                }
            }
            return arrayList;
        }

        public List<k0> b() {
            ArrayList arrayList = new ArrayList();
            for (b bVar : this.f19281a) {
                k0 b10 = bVar.b();
                if (b10 != null) {
                    arrayList.add(b10);
                }
            }
            return arrayList;
        }

        public List<k0> c() {
            ArrayList arrayList = new ArrayList();
            for (b bVar : this.f19281a) {
                k0 c10 = bVar.c();
                if (c10 != null) {
                    arrayList.add(c10);
                }
            }
            return arrayList;
        }

        public List<k0> d() {
            ArrayList arrayList = new ArrayList();
            for (b bVar : this.f19281a) {
                k0 d10 = bVar.d();
                if (d10 != null) {
                    arrayList.add(d10);
                }
            }
            return arrayList;
        }
    }

    public c(b... bVarArr) {
        a(Arrays.asList(bVarArr));
    }

    public static c e() {
        return new c(new b[0]);
    }

    @Override // w.o1
    /* renamed from: b */
    public o1<b> clone() {
        c e10 = e();
        e10.a(c());
        return e10;
    }

    public a d() {
        return new a(c());
    }
}
