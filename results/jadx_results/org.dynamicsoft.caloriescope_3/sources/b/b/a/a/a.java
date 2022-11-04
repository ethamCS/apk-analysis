package b.b.a.a;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    private b.b.a.b.a f1263a;

    /* renamed from: b */
    private double f1264b = 0.0d;

    public a a() {
        if (this.f1263a == null) {
            b.b.a.b.a aVar = new b.b.a.b.a();
            this.f1263a = aVar;
            aVar.a(this.f1264b);
            this.f1263a.start();
        }
        return this;
    }

    public void a(double d) {
        this.f1264b = d;
        b.b.a.b.a aVar = this.f1263a;
        if (aVar != null) {
            aVar.a(d);
        }
    }

    public void b() {
        b.b.a.b.a aVar = this.f1263a;
        if (aVar != null) {
            aVar.a();
            this.f1263a = null;
        }
    }
}
