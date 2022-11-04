package l4;
/* loaded from: classes.dex */
public class m implements c {

    /* renamed from: a */
    private final String f15776a;

    /* renamed from: b */
    private final k4.m<Float, Float> f15777b;

    public m(String str, k4.m<Float, Float> mVar) {
        this.f15776a = str;
        this.f15777b = mVar;
    }

    @Override // l4.c
    public g4.c a(com.airbnb.lottie.n nVar, m4.b bVar) {
        return new g4.q(nVar, bVar, this);
    }

    public k4.m<Float, Float> b() {
        return this.f15777b;
    }

    public String c() {
        return this.f15776a;
    }
}
