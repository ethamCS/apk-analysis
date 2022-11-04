package zh;
/* loaded from: classes3.dex */
public class w0 {

    /* renamed from: a */
    private int f27016a;

    /* renamed from: b */
    private int f27017b;

    /* renamed from: c */
    private long f27018c;

    /* renamed from: d */
    private long f27019d;

    public w0(int i10, int i11) {
        this.f27016a = i10;
        this.f27017b = i11;
    }

    public w0(long j10, long j11) {
        this.f27018c = j10;
        this.f27019d = j11;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof w0)) {
            return false;
        }
        w0 w0Var = (w0) obj;
        return w0Var.f27017b == this.f27017b && w0Var.f27016a == this.f27016a && w0Var.f27019d == this.f27019d && w0Var.f27018c == this.f27018c;
    }

    public int hashCode() {
        int i10 = this.f27016a ^ this.f27017b;
        long j10 = this.f27018c;
        int i11 = (i10 ^ ((int) j10)) ^ ((int) (j10 >> 32));
        long j11 = this.f27019d;
        return (i11 ^ ((int) j11)) ^ ((int) (j11 >> 32));
    }
}
