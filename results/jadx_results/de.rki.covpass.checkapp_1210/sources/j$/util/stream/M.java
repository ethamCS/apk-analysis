package j$.util.stream;

import j$.util.function.BiConsumer;
/* loaded from: classes2.dex */
public final /* synthetic */ class M implements j$.util.function.I, BiConsumer, j$.util.function.q {

    /* renamed from: a */
    public static final /* synthetic */ M f13497a = new M();

    /* renamed from: b */
    public static final /* synthetic */ M f13498b = new M();

    /* renamed from: c */
    public static final /* synthetic */ M f13499c = new M();

    @Override // j$.util.function.I
    public Object get() {
        return new S();
    }

    @Override // j$.util.function.q
    public Object o(int i10) {
        int i11 = C0626w2.f13818w;
        return new Long[i10];
    }

    @Override // j$.util.function.BiConsumer
    public void w(Object obj, Object obj2) {
        long[] jArr = (long[]) obj;
        long[] jArr2 = (long[]) obj2;
        int i10 = AbstractC0608s0.f13780t;
        jArr[0] = jArr[0] + jArr2[0];
        jArr[1] = jArr[1] + jArr2[1];
    }
}
