package j$.util.stream;

import j$.util.C0512k;
/* loaded from: classes2.dex */
final class O extends T implements AbstractC0588n2 {
    @Override // j$.util.stream.T, j$.util.stream.AbstractC0603q2
    public final void c(double d10) {
        y(Double.valueOf(d10));
    }

    @Override // j$.util.function.I
    public final Object get() {
        if (this.f13552a) {
            return C0512k.d(((Double) this.f13553b).doubleValue());
        }
        return null;
    }
}
