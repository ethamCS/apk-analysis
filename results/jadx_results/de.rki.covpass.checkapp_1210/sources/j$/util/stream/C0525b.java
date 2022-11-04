package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.List;
/* renamed from: j$.util.stream.b */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0525b implements j$.util.function.I, j$.util.function.y, Consumer {

    /* renamed from: a */
    public final /* synthetic */ int f13622a;

    /* renamed from: b */
    public final /* synthetic */ Object f13623b;

    public /* synthetic */ C0525b(Object obj, int i10) {
        this.f13622a = i10;
        this.f13623b = obj;
    }

    @Override // j$.util.function.I
    public final Object get() {
        switch (this.f13622a) {
            case 0:
                return (Spliterator) this.f13623b;
            default:
                return ((AbstractC0530c) this.f13623b).d1();
        }
    }

    @Override // j$.util.function.Consumer
    public final void h(Object obj) {
        switch (this.f13622a) {
            case 3:
                ((AbstractC0603q2) this.f13623b).h(obj);
                return;
            default:
                ((List) this.f13623b).add(obj);
                return;
        }
    }

    @Override // j$.util.function.y
    public final Object p(long j10) {
        int i10 = U0.f13559k;
        return D0.l0(j10, (j$.util.function.q) this.f13623b);
    }
}
