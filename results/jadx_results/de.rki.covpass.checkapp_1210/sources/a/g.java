package a;
/* loaded from: classes.dex */
public class g extends x {

    /* renamed from: k */
    private q f53k;

    /* renamed from: l */
    private x f54l;

    public g(byte[] bArr) {
        this.f140g = "CounterSignature0";
        this.f139f = bArr;
        this.f51d = new byte[0];
    }

    @Override // a.x
    public void i(t7.o oVar) {
        if (oVar.s1() == t7.q.ByteString) {
            this.f139f = oVar.j0();
            this.f51d = new byte[0];
            return;
        }
        throw new f("Invalid format for Countersignature0");
    }

    @Override // a.x
    public t7.o j() {
        if (!this.f48a.t1().isEmpty() || !this.f49b.t1().isEmpty()) {
            throw new f("CounterSign1 object cannot have protected or unprotected attributes");
        }
        return t7.o.b0(this.f139f);
    }

    public void n(q qVar) {
        this.f53k = qVar;
    }

    public void o(x xVar) {
        this.f54l = xVar;
    }
}
