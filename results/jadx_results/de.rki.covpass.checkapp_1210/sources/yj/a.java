package yj;

import java.security.spec.KeySpec;
/* loaded from: classes3.dex */
public class a implements KeySpec {
    private kj.a[] U3;

    /* renamed from: c */
    private short[][] f26306c;

    /* renamed from: d */
    private short[] f26307d;

    /* renamed from: q */
    private short[][] f26308q;

    /* renamed from: x */
    private short[] f26309x;

    /* renamed from: y */
    private int[] f26310y;

    public a(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, kj.a[] aVarArr) {
        this.f26306c = sArr;
        this.f26307d = sArr2;
        this.f26308q = sArr3;
        this.f26309x = sArr4;
        this.f26310y = iArr;
        this.U3 = aVarArr;
    }

    public short[] a() {
        return this.f26307d;
    }

    public short[] b() {
        return this.f26309x;
    }

    public short[][] c() {
        return this.f26306c;
    }

    public short[][] d() {
        return this.f26308q;
    }

    public kj.a[] e() {
        return this.U3;
    }

    public int[] f() {
        return this.f26310y;
    }
}
