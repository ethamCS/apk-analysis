package ri;

import java.security.spec.AlgorithmParameterSpec;
/* loaded from: classes3.dex */
public class p implements AlgorithmParameterSpec {

    /* renamed from: a */
    private byte[] f21247a;

    /* renamed from: b */
    private byte[] f21248b;

    /* renamed from: c */
    private int f21249c;

    /* renamed from: d */
    private int f21250d;

    /* renamed from: e */
    private byte[] f21251e;

    /* renamed from: f */
    private boolean f21252f;

    public p(byte[] bArr, byte[] bArr2, int i10) {
        this(bArr, bArr2, i10, -1, null, false);
    }

    public p(byte[] bArr, byte[] bArr2, int i10, int i11, byte[] bArr3) {
        this(bArr, bArr2, i10, i11, bArr3, false);
    }

    public p(byte[] bArr, byte[] bArr2, int i10, int i11, byte[] bArr3, boolean z10) {
        if (bArr != null) {
            byte[] bArr4 = new byte[bArr.length];
            this.f21247a = bArr4;
            System.arraycopy(bArr, 0, bArr4, 0, bArr.length);
        } else {
            this.f21247a = null;
        }
        if (bArr2 != null) {
            byte[] bArr5 = new byte[bArr2.length];
            this.f21248b = bArr5;
            System.arraycopy(bArr2, 0, bArr5, 0, bArr2.length);
        } else {
            this.f21248b = null;
        }
        this.f21249c = i10;
        this.f21250d = i11;
        this.f21251e = ak.a.h(bArr3);
        this.f21252f = z10;
    }

    public int a() {
        return this.f21250d;
    }

    public byte[] b() {
        return ak.a.h(this.f21247a);
    }

    public byte[] c() {
        return ak.a.h(this.f21248b);
    }

    public int d() {
        return this.f21249c;
    }

    public byte[] e() {
        return ak.a.h(this.f21251e);
    }

    public boolean f() {
        return this.f21252f;
    }
}
