package l4;

import android.graphics.PointF;
/* loaded from: classes.dex */
public class j implements c {

    /* renamed from: a */
    private final String f15751a;

    /* renamed from: b */
    private final a f15752b;

    /* renamed from: c */
    private final k4.b f15753c;

    /* renamed from: d */
    private final k4.m<PointF, PointF> f15754d;

    /* renamed from: e */
    private final k4.b f15755e;

    /* renamed from: f */
    private final k4.b f15756f;

    /* renamed from: g */
    private final k4.b f15757g;

    /* renamed from: h */
    private final k4.b f15758h;

    /* renamed from: i */
    private final k4.b f15759i;

    /* renamed from: j */
    private final boolean f15760j;

    /* renamed from: k */
    private final boolean f15761k;

    /* loaded from: classes.dex */
    public enum a {
        STAR(1),
        POLYGON(2);
        

        /* renamed from: c */
        private final int f15765c;

        a(int i10) {
            this.f15765c = i10;
        }

        public static a b(int i10) {
            a[] values;
            for (a aVar : values()) {
                if (aVar.f15765c == i10) {
                    return aVar;
                }
            }
            return null;
        }
    }

    public j(String str, a aVar, k4.b bVar, k4.m<PointF, PointF> mVar, k4.b bVar2, k4.b bVar3, k4.b bVar4, k4.b bVar5, k4.b bVar6, boolean z10, boolean z11) {
        this.f15751a = str;
        this.f15752b = aVar;
        this.f15753c = bVar;
        this.f15754d = mVar;
        this.f15755e = bVar2;
        this.f15756f = bVar3;
        this.f15757g = bVar4;
        this.f15758h = bVar5;
        this.f15759i = bVar6;
        this.f15760j = z10;
        this.f15761k = z11;
    }

    @Override // l4.c
    public g4.c a(com.airbnb.lottie.n nVar, m4.b bVar) {
        return new g4.n(nVar, bVar, this);
    }

    public k4.b b() {
        return this.f15756f;
    }

    public k4.b c() {
        return this.f15758h;
    }

    public String d() {
        return this.f15751a;
    }

    public k4.b e() {
        return this.f15757g;
    }

    public k4.b f() {
        return this.f15759i;
    }

    public k4.b g() {
        return this.f15753c;
    }

    public k4.m<PointF, PointF> h() {
        return this.f15754d;
    }

    public k4.b i() {
        return this.f15755e;
    }

    public a j() {
        return this.f15752b;
    }

    public boolean k() {
        return this.f15760j;
    }

    public boolean l() {
        return this.f15761k;
    }
}
