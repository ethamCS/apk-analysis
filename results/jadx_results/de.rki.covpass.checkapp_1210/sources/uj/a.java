package uj;

import fj.e;
import fj.f;
import gg.r1;
import java.io.IOException;
import java.security.PrivateKey;
import java.util.Arrays;
import zg.s;
/* loaded from: classes3.dex */
public class a implements PrivateKey {
    private int[] U3;

    /* renamed from: c */
    private short[][] f23805c;

    /* renamed from: d */
    private short[] f23806d;

    /* renamed from: q */
    private short[][] f23807q;

    /* renamed from: x */
    private short[] f23808x;

    /* renamed from: y */
    private kj.a[] f23809y;

    public a(yj.a aVar) {
        this(aVar.c(), aVar.a(), aVar.d(), aVar.b(), aVar.f(), aVar.e());
    }

    public a(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, kj.a[] aVarArr) {
        this.f23805c = sArr;
        this.f23806d = sArr2;
        this.f23807q = sArr3;
        this.f23808x = sArr4;
        this.U3 = iArr;
        this.f23809y = aVarArr;
    }

    public short[] b() {
        return this.f23806d;
    }

    public short[] c() {
        return this.f23808x;
    }

    public short[][] e() {
        return this.f23805c;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        boolean z10 = ((((lj.a.j(this.f23805c, aVar.e())) && lj.a.j(this.f23807q, aVar.f())) && lj.a.i(this.f23806d, aVar.b())) && lj.a.i(this.f23808x, aVar.c())) && Arrays.equals(this.U3, aVar.h());
        if (this.f23809y.length != aVar.g().length) {
            return false;
        }
        for (int length = this.f23809y.length - 1; length >= 0; length--) {
            z10 &= this.f23809y[length].equals(aVar.g()[length]);
        }
        return z10;
    }

    public short[][] f() {
        return this.f23807q;
    }

    public kj.a[] g() {
        return this.f23809y;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Rainbow";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        try {
            return new s(new hh.b(e.f10253a, r1.f10880d), new f(this.f23805c, this.f23806d, this.f23807q, this.f23808x, this.U3, this.f23809y)).getEncoded();
        } catch (IOException unused) {
            return null;
        }
    }

    @Override // java.security.Key
    public String getFormat() {
        return "PKCS#8";
    }

    public int[] h() {
        return this.U3;
    }

    public int hashCode() {
        int length = (((((((((this.f23809y.length * 37) + ak.a.M(this.f23805c)) * 37) + ak.a.L(this.f23806d)) * 37) + ak.a.M(this.f23807q)) * 37) + ak.a.L(this.f23808x)) * 37) + ak.a.I(this.U3);
        for (int length2 = this.f23809y.length - 1; length2 >= 0; length2--) {
            length = (length * 37) + this.f23809y[length2].hashCode();
        }
        return length;
    }
}
