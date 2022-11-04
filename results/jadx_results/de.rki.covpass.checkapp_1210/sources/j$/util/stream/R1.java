package j$.util.stream;
/* loaded from: classes2.dex */
final class R1 extends AbstractC0523a2 {

    /* renamed from: b */
    final /* synthetic */ j$.util.function.m f13537b;

    /* renamed from: c */
    final /* synthetic */ int f13538c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public R1(int i10, j$.util.function.m mVar, int i11) {
        super(i10);
        this.f13537b = mVar;
        this.f13538c = i11;
    }

    @Override // j$.util.stream.AbstractC0523a2
    public final Y1 a() {
        return new S1(this.f13538c, this.f13537b);
    }
}
