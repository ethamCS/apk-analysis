package mi;

import javax.crypto.spec.IvParameterSpec;
/* loaded from: classes3.dex */
public class a extends IvParameterSpec {

    /* renamed from: a */
    private final byte[] f16683a;

    /* renamed from: b */
    private final int f16684b;

    public a(byte[] bArr, int i10) {
        this(bArr, i10, null);
    }

    public a(byte[] bArr, int i10, byte[] bArr2) {
        super(bArr);
        this.f16684b = i10;
        this.f16683a = ak.a.h(bArr2);
    }

    public byte[] a() {
        return ak.a.h(this.f16683a);
    }

    public int b() {
        return this.f16684b;
    }

    public byte[] c() {
        return getIV();
    }
}
