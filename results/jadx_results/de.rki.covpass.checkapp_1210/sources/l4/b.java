package l4;

import android.graphics.PointF;
/* loaded from: classes.dex */
public class b implements c {

    /* renamed from: a */
    private final String f15701a;

    /* renamed from: b */
    private final k4.m<PointF, PointF> f15702b;

    /* renamed from: c */
    private final k4.f f15703c;

    /* renamed from: d */
    private final boolean f15704d;

    /* renamed from: e */
    private final boolean f15705e;

    public b(String str, k4.m<PointF, PointF> mVar, k4.f fVar, boolean z10, boolean z11) {
        this.f15701a = str;
        this.f15702b = mVar;
        this.f15703c = fVar;
        this.f15704d = z10;
        this.f15705e = z11;
    }

    @Override // l4.c
    public g4.c a(com.airbnb.lottie.n nVar, m4.b bVar) {
        return new g4.f(nVar, bVar, this);
    }

    public String b() {
        return this.f15701a;
    }

    public k4.m<PointF, PointF> c() {
        return this.f15702b;
    }

    public k4.f d() {
        return this.f15703c;
    }

    public boolean e() {
        return this.f15705e;
    }

    public boolean f() {
        return this.f15704d;
    }
}
