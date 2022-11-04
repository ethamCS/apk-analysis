package o2;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    public e f17340a;

    /* renamed from: b */
    public e f17341b;

    /* renamed from: c */
    public int f17342c;

    /* renamed from: d */
    public int f17343d;

    /* renamed from: e */
    public double f17344e;

    public <T extends e> T a(e eVar) {
        T t10 = (T) this.f17340a;
        if (t10 == eVar) {
            return (T) this.f17341b;
        }
        if (this.f17341b != eVar) {
            throw new IllegalArgumentException("BUG! src is not a or b");
        }
        return t10;
    }

    public boolean b(e eVar) {
        return this.f17340a == eVar || this.f17341b == eVar;
    }

    public void c() {
        this.f17341b = null;
        this.f17340a = null;
        this.f17343d = -1;
        this.f17342c = -1;
        this.f17344e = -1.0d;
    }
}
