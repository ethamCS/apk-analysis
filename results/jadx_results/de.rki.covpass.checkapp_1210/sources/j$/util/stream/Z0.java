package j$.util.stream;
/* loaded from: classes2.dex */
abstract class Z0 extends R0 implements O0 {
    public Z0(O0 o02, O0 o03) {
        super(o02, o03);
    }

    @Override // j$.util.stream.O0
    public final void g(Object obj, int i10) {
        ((O0) this.f13534a).g(obj, i10);
        ((O0) this.f13535b).g(obj, i10 + ((int) ((O0) this.f13534a).count()));
    }

    @Override // j$.util.stream.O0
    public final Object i() {
        long count = count();
        if (count < 2147483639) {
            Object e10 = e((int) count);
            g(e10, 0);
            return e10;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }

    @Override // j$.util.stream.O0
    public final void j(Object obj) {
        ((O0) this.f13534a).j(obj);
        ((O0) this.f13535b).j(obj);
    }

    @Override // j$.util.stream.P0
    public final /* synthetic */ Object[] q(j$.util.function.q qVar) {
        return D0.R(this, qVar);
    }

    public final String toString() {
        return count() < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.f13534a, this.f13535b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(count()));
    }
}
