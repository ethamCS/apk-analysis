package l4;
/* loaded from: classes.dex */
public class q implements c {

    /* renamed from: a */
    private final String f15790a;

    /* renamed from: b */
    private final int f15791b;

    /* renamed from: c */
    private final k4.h f15792c;

    /* renamed from: d */
    private final boolean f15793d;

    public q(String str, int i10, k4.h hVar, boolean z10) {
        this.f15790a = str;
        this.f15791b = i10;
        this.f15792c = hVar;
        this.f15793d = z10;
    }

    @Override // l4.c
    public g4.c a(com.airbnb.lottie.n nVar, m4.b bVar) {
        return new g4.r(nVar, bVar, this);
    }

    public String b() {
        return this.f15790a;
    }

    public k4.h c() {
        return this.f15792c;
    }

    public boolean d() {
        return this.f15793d;
    }

    public String toString() {
        return "ShapePath{name=" + this.f15790a + ", index=" + this.f15791b + '}';
    }
}
