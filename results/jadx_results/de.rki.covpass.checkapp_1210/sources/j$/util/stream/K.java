package j$.util.stream;

import j$.util.function.BiConsumer;
/* loaded from: classes2.dex */
public final /* synthetic */ class K implements j$.util.function.I, BiConsumer, j$.util.function.q {

    /* renamed from: a */
    public static final /* synthetic */ K f13477a = new K();

    /* renamed from: b */
    public static final /* synthetic */ K f13478b = new K();

    /* renamed from: c */
    public static final /* synthetic */ K f13479c = new K();

    @Override // j$.util.function.I
    public Object get() {
        return new P();
    }

    @Override // j$.util.function.q
    public Object o(int i10) {
        return new Object[i10];
    }

    @Override // j$.util.function.BiConsumer
    public void w(Object obj, Object obj2) {
        long[] jArr = (long[]) obj;
        long[] jArr2 = (long[]) obj2;
        int i10 = AbstractC0571k0.f13713t;
        jArr[0] = jArr[0] + jArr2[0];
        jArr[1] = jArr[1] + jArr2[1];
    }
}
