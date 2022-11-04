package p3;

import java.io.Serializable;
import q3.d;
import q3.g;
import x3.c;
/* loaded from: classes.dex */
public class a implements Serializable {

    /* renamed from: c */
    public q3.b f18880c;

    /* renamed from: d */
    public u3.a f18881d = new u3.a();

    /* renamed from: q */
    public int f18882q = 1;

    /* renamed from: x */
    public int f18883x = 40;

    /* renamed from: y */
    public String f18884y = null;
    public String U3 = "ISO8859_1";
    public boolean V3 = true;

    public a() {
        d dVar = (d) q3.b.c(g.BLOCK_OTSU, 40);
        dVar.f19617a4 = true;
        dVar.f19614q = 1.0d;
        dVar.Y3 = true;
        dVar.Z3 = 4.0d;
        this.f18880c = dVar;
        u3.b bVar = this.f18881d.f23114c;
        bVar.f23120d = c.EIGHT;
        bVar.V3 = false;
        ((k2.b) bVar.f23121q).Z3 = x3.b.i(0.12d, 3.0d);
        u3.b bVar2 = this.f18881d.f23114c;
        k2.a aVar = bVar2.f23121q;
        ((k2.b) aVar).V3 = 0.4d;
        ((k2.b) aVar).f14577y = 2;
        bVar2.U3 = x3.b.g(40.0d);
        u3.a aVar2 = this.f18881d;
        u3.b bVar3 = aVar2.f23114c;
        bVar3.f23122x = 3.0d;
        aVar2.f23115d = 6.0d;
        bVar3.f23123y = 1.5d;
    }

    public void b() {
        this.f18880c.b();
        this.f18881d.b();
    }
}
