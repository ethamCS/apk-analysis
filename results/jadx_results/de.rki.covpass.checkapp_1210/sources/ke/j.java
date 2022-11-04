package ke;

import xc.a;
/* loaded from: classes3.dex */
public interface j {
    public static final a Companion = a.f15058a;

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a */
        static final /* synthetic */ a f15058a = new a();

        /* renamed from: b */
        private static final j f15059b = new C0224a();

        /* renamed from: ke.j$a$a */
        /* loaded from: classes3.dex */
        public static final class C0224a implements j {
            C0224a() {
            }

            @Override // ke.j
            public tb.r a(rd.i iVar, xc.y yVar, td.g gVar, d0 d0Var) {
                hc.t.e(iVar, "proto");
                hc.t.e(yVar, "ownerFunction");
                hc.t.e(gVar, "typeTable");
                hc.t.e(d0Var, "typeDeserializer");
                return null;
            }
        }

        private a() {
        }

        public final j a() {
            return f15059b;
        }
    }

    tb.r<a.AbstractC0451a<?>, Object> a(rd.i iVar, xc.y yVar, td.g gVar, d0 d0Var);
}
