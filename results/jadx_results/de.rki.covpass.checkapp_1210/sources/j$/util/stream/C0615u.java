package j$.util.stream;

import j$.util.function.BiConsumer;
/* renamed from: j$.util.stream.u */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0615u implements j$.util.function.I, BiConsumer, j$.util.function.q {

    /* renamed from: a */
    public static final /* synthetic */ C0615u f13799a = new C0615u();

    /* renamed from: b */
    public static final /* synthetic */ C0615u f13800b = new C0615u();

    /* renamed from: c */
    public static final /* synthetic */ C0615u f13801c = new C0615u();

    @Override // j$.util.function.I
    public Object get() {
        int i10 = G.f13452t;
        return new double[3];
    }

    @Override // j$.util.function.q
    public Object o(int i10) {
        int i11 = AbstractC0608s0.f13780t;
        return new Long[i10];
    }

    @Override // j$.util.function.BiConsumer
    public void w(Object obj, Object obj2) {
        double[] dArr = (double[]) obj;
        double[] dArr2 = (double[]) obj2;
        int i10 = G.f13452t;
        Collectors.b(dArr, dArr2[0]);
        Collectors.b(dArr, dArr2[1]);
        dArr[2] = dArr[2] + dArr2[2];
    }
}
