package yc;

import hc.t;
import java.util.Iterator;
import java.util.List;
import ub.u;
/* loaded from: classes.dex */
public interface g extends Iterable<c>, ic.a {
    public static final a Companion = a.f26039a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f26039a = new a();

        /* renamed from: b */
        private static final g f26040b = new C0455a();

        /* renamed from: yc.g$a$a */
        /* loaded from: classes.dex */
        public static final class C0455a implements g {
            C0455a() {
            }

            @Override // yc.g
            public boolean B(wd.c cVar) {
                return b.b(this, cVar);
            }

            public Void a(wd.c cVar) {
                t.e(cVar, "fqName");
                return null;
            }

            @Override // yc.g
            public /* bridge */ /* synthetic */ c h(wd.c cVar) {
                return (c) a(cVar);
            }

            @Override // yc.g
            public boolean isEmpty() {
                return true;
            }

            @Override // java.lang.Iterable
            public Iterator<c> iterator() {
                List h10;
                h10 = u.h();
                return h10.iterator();
            }

            public String toString() {
                return "EMPTY";
            }
        }

        private a() {
        }

        public final g a(List<? extends c> list) {
            t.e(list, "annotations");
            return list.isEmpty() ? f26040b : new h(list);
        }

        public final g b() {
            return f26040b;
        }
    }

    /* loaded from: classes.dex */
    public static final class b {
        public static c a(g gVar, wd.c cVar) {
            c cVar2;
            t.e(cVar, "fqName");
            Iterator<c> it = gVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    cVar2 = null;
                    break;
                }
                cVar2 = it.next();
                if (t.a(cVar2.d(), cVar)) {
                    break;
                }
            }
            return cVar2;
        }

        public static boolean b(g gVar, wd.c cVar) {
            t.e(cVar, "fqName");
            return gVar.h(cVar) != null;
        }
    }

    boolean B(wd.c cVar);

    c h(wd.c cVar);

    boolean isEmpty();
}
