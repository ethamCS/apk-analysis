package ve;
/* loaded from: classes3.dex */
public abstract class e<K, T> extends a<K, T> {

    /* renamed from: c */
    private c<T> f24026c;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public e() {
        /*
            r2 = this;
            ve.i r0 = ve.i.f24039c
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>"
            hc.t.c(r0, r1)
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ve.e.<init>():void");
    }

    protected e(c<T> cVar) {
        hc.t.e(cVar, "arrayMap");
        this.f24026c = cVar;
    }

    @Override // ve.a
    public final c<T> a() {
        return this.f24026c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void d(oc.d<? extends K> dVar, T t10) {
        hc.t.e(dVar, "tClass");
        hc.t.e(t10, "value");
        int d10 = b().d(dVar);
        int a10 = this.f24026c.a();
        if (a10 == 0) {
            this.f24026c = new o(t10, d10);
            return;
        }
        if (a10 == 1) {
            c<T> cVar = this.f24026c;
            hc.t.c(cVar, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
            o oVar = (o) cVar;
            if (oVar.d() == d10) {
                this.f24026c = new o(t10, d10);
                return;
            }
            d dVar2 = new d();
            this.f24026c = dVar2;
            dVar2.b(oVar.d(), oVar.e());
        }
        this.f24026c.b(d10, t10);
    }
}
