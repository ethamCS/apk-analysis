package zh;
/* loaded from: classes3.dex */
public class n {

    /* renamed from: a */
    private byte[] f26964a;

    /* renamed from: b */
    private int f26965b;

    public n(byte[] bArr, int i10) {
        this.f26964a = ak.a.h(bArr);
        this.f26965b = i10;
    }

    public int a() {
        return this.f26965b;
    }

    public byte[] b() {
        return ak.a.h(this.f26964a);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        if (nVar.f26965b == this.f26965b) {
            return ak.a.c(this.f26964a, nVar.f26964a);
        }
        return false;
    }

    public int hashCode() {
        return this.f26965b ^ ak.a.F(this.f26964a);
    }
}
