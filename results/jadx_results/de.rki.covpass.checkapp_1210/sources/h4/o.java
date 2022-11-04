package h4;

import java.util.List;
/* loaded from: classes.dex */
public class o extends g<j4.b> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends r4.c<j4.b> {

        /* renamed from: d */
        final /* synthetic */ r4.b f11292d;

        /* renamed from: e */
        final /* synthetic */ r4.c f11293e;

        /* renamed from: f */
        final /* synthetic */ j4.b f11294f;

        a(r4.b bVar, r4.c cVar, j4.b bVar2) {
            o.this = r1;
            this.f11292d = bVar;
            this.f11293e = cVar;
            this.f11294f = bVar2;
        }

        /* renamed from: d */
        public j4.b a(r4.b<j4.b> bVar) {
            this.f11292d.h(bVar.f(), bVar.a(), bVar.g().f13976a, bVar.b().f13976a, bVar.d(), bVar.c(), bVar.e());
            String str = (String) this.f11293e.a(this.f11292d);
            j4.b b10 = bVar.c() == 1.0f ? bVar.b() : bVar.g();
            this.f11294f.a(str, b10.f13977b, b10.f13978c, b10.f13979d, b10.f13980e, b10.f13981f, b10.f13982g, b10.f13983h, b10.f13984i, b10.f13985j, b10.f13986k);
            return this.f11294f;
        }
    }

    public o(List<r4.a<j4.b>> list) {
        super(list);
    }

    /* renamed from: p */
    public j4.b i(r4.a<j4.b> aVar, float f10) {
        Object obj;
        j4.b bVar;
        r4.c<A> cVar = this.f11252e;
        if (cVar != 0) {
            float f11 = aVar.f20448g;
            Float f12 = aVar.f20449h;
            float floatValue = f12 == null ? Float.MAX_VALUE : f12.floatValue();
            j4.b bVar2 = aVar.f20443b;
            j4.b bVar3 = bVar2;
            j4.b bVar4 = aVar.f20444c;
            obj = cVar.b(f11, floatValue, bVar3, bVar4 == null ? bVar2 : bVar4, f10, d(), f());
        } else if (f10 == 1.0f && (bVar = aVar.f20444c) != null) {
            return bVar;
        } else {
            obj = aVar.f20443b;
        }
        return (j4.b) obj;
    }

    public void q(r4.c<String> cVar) {
        super.n(new a(new r4.b(), cVar, new j4.b()));
    }
}
