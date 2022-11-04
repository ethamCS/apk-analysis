package l4;

import android.graphics.PointF;
/* loaded from: classes.dex */
public class k implements c {

    /* renamed from: a */
    private final String f15766a;

    /* renamed from: b */
    private final k4.m<PointF, PointF> f15767b;

    /* renamed from: c */
    private final k4.m<PointF, PointF> f15768c;

    /* renamed from: d */
    private final k4.b f15769d;

    /* renamed from: e */
    private final boolean f15770e;

    public k(String str, k4.m<PointF, PointF> mVar, k4.m<PointF, PointF> mVar2, k4.b bVar, boolean z10) {
        this.f15766a = str;
        this.f15767b = mVar;
        this.f15768c = mVar2;
        this.f15769d = bVar;
        this.f15770e = z10;
    }

    @Override // l4.c
    public g4.c a(com.airbnb.lottie.n nVar, m4.b bVar) {
        return new g4.o(nVar, bVar, this);
    }

    public k4.b b() {
        return this.f15769d;
    }

    public String c() {
        return this.f15766a;
    }

    public k4.m<PointF, PointF> d() {
        return this.f15767b;
    }

    public k4.m<PointF, PointF> e() {
        return this.f15768c;
    }

    public boolean f() {
        return this.f15770e;
    }

    public String toString() {
        return "RectangleShape{position=" + this.f15767b + ", size=" + this.f15768c + '}';
    }
}
