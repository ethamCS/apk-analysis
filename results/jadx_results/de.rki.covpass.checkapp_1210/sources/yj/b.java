package yj;

import java.security.spec.KeySpec;
/* loaded from: classes3.dex */
public class b implements KeySpec {

    /* renamed from: c */
    private short[][] f26311c;

    /* renamed from: d */
    private short[][] f26312d;

    /* renamed from: q */
    private short[] f26313q;

    /* renamed from: x */
    private int f26314x;

    public b(int i10, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f26314x = i10;
        this.f26311c = sArr;
        this.f26312d = sArr2;
        this.f26313q = sArr3;
    }

    public short[][] a() {
        return this.f26311c;
    }

    public short[] b() {
        return this.f26313q;
    }

    public short[][] c() {
        return this.f26312d;
    }

    public int d() {
        return this.f26314x;
    }
}
