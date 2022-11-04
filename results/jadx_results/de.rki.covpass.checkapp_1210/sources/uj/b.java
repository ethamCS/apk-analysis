package uj;

import fj.e;
import fj.g;
import gg.r1;
import java.security.PublicKey;
/* loaded from: classes3.dex */
public class b implements PublicKey {

    /* renamed from: c */
    private short[][] f23810c;

    /* renamed from: d */
    private short[][] f23811d;

    /* renamed from: q */
    private short[] f23812q;

    /* renamed from: x */
    private int f23813x;

    public b(int i10, short[][] sArr, short[][] sArr2, short[] sArr3) {
        this.f23813x = i10;
        this.f23810c = sArr;
        this.f23811d = sArr2;
        this.f23812q = sArr3;
    }

    public b(yj.b bVar) {
        this(bVar.d(), bVar.a(), bVar.c(), bVar.b());
    }

    public short[][] b() {
        return this.f23810c;
    }

    public short[] c() {
        return ak.a.n(this.f23812q);
    }

    public short[][] e() {
        short[][] sArr = new short[this.f23811d.length];
        int i10 = 0;
        while (true) {
            short[][] sArr2 = this.f23811d;
            if (i10 != sArr2.length) {
                sArr[i10] = ak.a.n(sArr2[i10]);
                i10++;
            } else {
                return sArr;
            }
        }
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f23813x == bVar.f() && lj.a.j(this.f23810c, bVar.b()) && lj.a.j(this.f23811d, bVar.e()) && lj.a.i(this.f23812q, bVar.c());
    }

    public int f() {
        return this.f23813x;
    }

    @Override // java.security.Key
    public final String getAlgorithm() {
        return "Rainbow";
    }

    @Override // java.security.Key
    public byte[] getEncoded() {
        return wj.a.a(new hh.b(e.f10253a, r1.f10880d), new g(this.f23813x, this.f23810c, this.f23811d, this.f23812q));
    }

    @Override // java.security.Key
    public String getFormat() {
        return "X.509";
    }

    public int hashCode() {
        return (((((this.f23813x * 37) + ak.a.M(this.f23810c)) * 37) + ak.a.M(this.f23811d)) * 37) + ak.a.L(this.f23812q);
    }
}
