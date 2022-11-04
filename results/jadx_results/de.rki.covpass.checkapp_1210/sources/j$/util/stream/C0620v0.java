package j$.util.stream;

import j$.util.function.Predicate;
/* renamed from: j$.util.stream.v0 */
/* loaded from: classes2.dex */
final class C0620v0 extends AbstractC0636z0 {

    /* renamed from: c */
    final /* synthetic */ A0 f13807c;

    /* renamed from: d */
    final /* synthetic */ Predicate f13808d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0620v0(A0 a02, Predicate predicate) {
        super(a02);
        this.f13807c = a02;
        this.f13808d = predicate;
    }

    @Override // j$.util.function.Consumer
    public final void h(Object obj) {
        boolean z10;
        boolean z11;
        if (!this.f13840a) {
            boolean test = this.f13808d.test(obj);
            z10 = this.f13807c.f13400a;
            if (test != z10) {
                return;
            }
            this.f13840a = true;
            z11 = this.f13807c.f13401b;
            this.f13841b = z11;
        }
    }
}
