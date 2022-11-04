package g4;

import h4.a;
import java.util.ArrayList;
import java.util.List;
import l4.s;
/* loaded from: classes.dex */
public class u implements c, a.b {

    /* renamed from: a */
    private final String f10524a;

    /* renamed from: b */
    private final boolean f10525b;

    /* renamed from: c */
    private final List<a.b> f10526c = new ArrayList();

    /* renamed from: d */
    private final s.a f10527d;

    /* renamed from: e */
    private final h4.a<?, Float> f10528e;

    /* renamed from: f */
    private final h4.a<?, Float> f10529f;

    /* renamed from: g */
    private final h4.a<?, Float> f10530g;

    public u(m4.b bVar, l4.s sVar) {
        this.f10524a = sVar.c();
        this.f10525b = sVar.g();
        this.f10527d = sVar.f();
        h4.a<Float, Float> n10 = sVar.e().n();
        this.f10528e = n10;
        h4.a<Float, Float> n11 = sVar.b().n();
        this.f10529f = n11;
        h4.a<Float, Float> n12 = sVar.d().n();
        this.f10530g = n12;
        bVar.i(n10);
        bVar.i(n11);
        bVar.i(n12);
        n10.a(this);
        n11.a(this);
        n12.a(this);
    }

    @Override // h4.a.b
    public void b() {
        for (int i10 = 0; i10 < this.f10526c.size(); i10++) {
            this.f10526c.get(i10).b();
        }
    }

    @Override // g4.c
    public void c(List<c> list, List<c> list2) {
    }

    public void d(a.b bVar) {
        this.f10526c.add(bVar);
    }

    public h4.a<?, Float> e() {
        return this.f10529f;
    }

    public h4.a<?, Float> h() {
        return this.f10530g;
    }

    public h4.a<?, Float> i() {
        return this.f10528e;
    }

    public s.a j() {
        return this.f10527d;
    }

    public boolean k() {
        return this.f10525b;
    }
}
