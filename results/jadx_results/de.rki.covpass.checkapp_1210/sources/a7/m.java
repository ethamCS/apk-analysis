package a7;
/* loaded from: classes.dex */
final class m {

    /* renamed from: a */
    private int f199a = 0;

    /* renamed from: b */
    private a f200b = a.NUMERIC;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum a {
        NUMERIC,
        ALPHA,
        ISO_IEC_646
    }

    public int a() {
        return this.f199a;
    }

    public void b(int i10) {
        this.f199a += i10;
    }

    public boolean c() {
        return this.f200b == a.ALPHA;
    }

    public boolean d() {
        return this.f200b == a.ISO_IEC_646;
    }

    public void e() {
        this.f200b = a.ALPHA;
    }

    public void f() {
        this.f200b = a.ISO_IEC_646;
    }

    public void g() {
        this.f200b = a.NUMERIC;
    }

    public void h(int i10) {
        this.f199a = i10;
    }
}
