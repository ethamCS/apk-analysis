package zh;
/* loaded from: classes3.dex */
public class u {

    /* renamed from: a */
    private int f27006a;

    /* renamed from: b */
    private byte[] f27007b;

    /* renamed from: c */
    private int f27008c;

    public u(byte[] bArr, int i10) {
        this(bArr, i10, -1);
    }

    public u(byte[] bArr, int i10, int i11) {
        this.f27007b = ak.a.h(bArr);
        this.f27008c = i10;
        this.f27006a = i11;
    }

    public int a() {
        return this.f27008c;
    }

    public byte[] b() {
        return ak.a.h(this.f27007b);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        if (uVar.f27008c == this.f27008c) {
            return ak.a.c(this.f27007b, uVar.f27007b);
        }
        return false;
    }

    public int hashCode() {
        return this.f27008c ^ ak.a.F(this.f27007b);
    }
}
