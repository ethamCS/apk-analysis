package j$.util.stream;

import j$.util.C0509h;
import j$.util.function.BiConsumer;
/* loaded from: classes2.dex */
public final /* synthetic */ class L implements j$.util.function.I, BiConsumer, j$.util.function.q {

    /* renamed from: a */
    public static final /* synthetic */ L f13486a = new L();

    /* renamed from: b */
    public static final /* synthetic */ L f13487b = new L();

    /* renamed from: c */
    public static final /* synthetic */ L f13488c = new L();

    @Override // j$.util.function.I
    public Object get() {
        return new Q();
    }

    @Override // j$.util.function.q
    public Object o(int i10) {
        int i11 = C0618u2.f13802w;
        return new Integer[i10];
    }

    @Override // j$.util.function.BiConsumer
    public void w(Object obj, Object obj2) {
        ((C0509h) obj).b((C0509h) obj2);
    }
}
