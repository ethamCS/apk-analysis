package j$.util.stream;

import j$.util.function.Consumer;
/* renamed from: j$.util.stream.k3 */
/* loaded from: classes2.dex */
final class C0574k3 extends AbstractC0579l3 implements Consumer {

    /* renamed from: b */
    final Object[] f13717b = new Object[128];

    @Override // j$.util.function.Consumer
    public final void h(Object obj) {
        Object[] objArr = this.f13717b;
        int i10 = this.f13734a;
        this.f13734a = i10 + 1;
        objArr[i10] = obj;
    }
}
