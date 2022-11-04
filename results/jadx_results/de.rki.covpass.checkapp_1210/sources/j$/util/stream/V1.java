package j$.util.stream;
/* loaded from: classes2.dex */
final class V1 extends AbstractC0523a2 {

    /* renamed from: b */
    final /* synthetic */ j$.util.function.v f13568b;

    /* renamed from: c */
    final /* synthetic */ long f13569c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V1(int i10, j$.util.function.v vVar, long j10) {
        super(i10);
        this.f13568b = vVar;
        this.f13569c = j10;
    }

    @Override // j$.util.stream.AbstractC0523a2
    public final Y1 a() {
        return new W1(this.f13569c, this.f13568b);
    }
}
