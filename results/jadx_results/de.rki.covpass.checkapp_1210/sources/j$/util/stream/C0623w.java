package j$.util.stream;

import j$.util.function.AbstractC0503e;
/* renamed from: j$.util.stream.w */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0623w implements AbstractC0503e {

    /* renamed from: a */
    public final /* synthetic */ int f13813a;

    /* renamed from: b */
    public final /* synthetic */ Object f13814b;

    public /* synthetic */ C0623w(Object obj, int i10) {
        this.f13813a = i10;
        this.f13814b = obj;
    }

    @Override // j$.util.function.AbstractC0503e
    public final void c(double d10) {
        switch (this.f13813a) {
            case 0:
                ((AbstractC0603q2) this.f13814b).c(d10);
                return;
            default:
                ((C0627x) this.f13814b).f13708a.c(d10);
                return;
        }
    }
}
