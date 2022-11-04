package fj;

import gg.a0;
import gg.d0;
import gg.q;
import gg.t;
import gg.t1;
import gg.v;
import gg.w;
import gg.x1;
/* loaded from: classes3.dex */
public class f extends t {
    private byte[] U3;
    private byte[] V3;
    private kj.a[] W3;

    /* renamed from: c */
    private q f10279c;

    /* renamed from: d */
    private v f10280d;

    /* renamed from: q */
    private byte[][] f10281q;

    /* renamed from: x */
    private byte[] f10282x;

    /* renamed from: y */
    private byte[][] f10283y;

    private f(d0 d0Var) {
        int i10 = 0;
        if (d0Var.G(0) instanceof q) {
            this.f10279c = q.E(d0Var.G(0));
        } else {
            this.f10280d = v.K(d0Var.G(0));
        }
        d0 d0Var2 = (d0) d0Var.G(1);
        this.f10281q = new byte[d0Var2.size()];
        for (int i11 = 0; i11 < d0Var2.size(); i11++) {
            this.f10281q[i11] = ((w) d0Var2.G(i11)).F();
        }
        this.f10282x = ((w) ((d0) d0Var.G(2)).G(0)).F();
        d0 d0Var3 = (d0) d0Var.G(3);
        this.f10283y = new byte[d0Var3.size()];
        for (int i12 = 0; i12 < d0Var3.size(); i12++) {
            this.f10283y[i12] = ((w) d0Var3.G(i12)).F();
        }
        this.U3 = ((w) ((d0) d0Var.G(4)).G(0)).F();
        this.V3 = ((w) ((d0) d0Var.G(5)).G(0)).F();
        d0 d0Var4 = (d0) d0Var.G(6);
        byte[][][][] bArr = new byte[d0Var4.size()][][];
        byte[][][][] bArr2 = new byte[d0Var4.size()][][];
        byte[][][] bArr3 = new byte[d0Var4.size()][];
        byte[][] bArr4 = new byte[d0Var4.size()];
        int i13 = 0;
        while (i13 < d0Var4.size()) {
            d0 d0Var5 = (d0) d0Var4.G(i13);
            d0 d0Var6 = (d0) d0Var5.G(i10);
            bArr[i13] = new byte[d0Var6.size()][];
            for (int i14 = i10; i14 < d0Var6.size(); i14++) {
                d0 d0Var7 = (d0) d0Var6.G(i14);
                bArr[i13][i14] = new byte[d0Var7.size()];
                for (int i15 = 0; i15 < d0Var7.size(); i15++) {
                    bArr[i13][i14][i15] = ((w) d0Var7.G(i15)).F();
                }
            }
            d0 d0Var8 = (d0) d0Var5.G(1);
            bArr2[i13] = new byte[d0Var8.size()][];
            for (int i16 = 0; i16 < d0Var8.size(); i16++) {
                d0 d0Var9 = (d0) d0Var8.G(i16);
                bArr2[i13][i16] = new byte[d0Var9.size()];
                for (int i17 = 0; i17 < d0Var9.size(); i17++) {
                    bArr2[i13][i16][i17] = ((w) d0Var9.G(i17)).F();
                }
            }
            d0 d0Var10 = (d0) d0Var5.G(2);
            bArr3[i13] = new byte[d0Var10.size()];
            for (int i18 = 0; i18 < d0Var10.size(); i18++) {
                bArr3[i13][i18] = ((w) d0Var10.G(i18)).F();
            }
            bArr4[i13] = ((w) d0Var5.G(3)).F();
            i13++;
            i10 = 0;
        }
        int length = this.V3.length - 1;
        this.W3 = new kj.a[length];
        int i19 = 0;
        while (i19 < length) {
            byte[] bArr5 = this.V3;
            int i20 = i19 + 1;
            this.W3[i19] = new kj.a(bArr5[i19], bArr5[i20], lj.a.f(bArr[i19]), lj.a.f(bArr2[i19]), lj.a.d(bArr3[i19]), lj.a.b(bArr4[i19]));
            i19 = i20;
        }
    }

    public f(short[][] sArr, short[] sArr2, short[][] sArr3, short[] sArr4, int[] iArr, kj.a[] aVarArr) {
        this.f10279c = new q(1L);
        this.f10281q = lj.a.c(sArr);
        this.f10282x = lj.a.a(sArr2);
        this.f10283y = lj.a.c(sArr3);
        this.U3 = lj.a.a(sArr4);
        this.V3 = lj.a.h(iArr);
        this.W3 = aVarArr;
    }

    public static f n(Object obj) {
        if (obj instanceof f) {
            return (f) obj;
        }
        if (obj == null) {
            return null;
        }
        return new f(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        gg.h hVar = new gg.h();
        gg.g gVar = this.f10279c;
        if (gVar == null) {
            gVar = this.f10280d;
        }
        hVar.a(gVar);
        gg.h hVar2 = new gg.h();
        for (int i10 = 0; i10 < this.f10281q.length; i10++) {
            hVar2.a(new t1(this.f10281q[i10]));
        }
        hVar.a(new x1(hVar2));
        gg.h hVar3 = new gg.h();
        hVar3.a(new t1(this.f10282x));
        hVar.a(new x1(hVar3));
        gg.h hVar4 = new gg.h();
        for (int i11 = 0; i11 < this.f10283y.length; i11++) {
            hVar4.a(new t1(this.f10283y[i11]));
        }
        hVar.a(new x1(hVar4));
        gg.h hVar5 = new gg.h();
        hVar5.a(new t1(this.U3));
        hVar.a(new x1(hVar5));
        gg.h hVar6 = new gg.h();
        hVar6.a(new t1(this.V3));
        hVar.a(new x1(hVar6));
        gg.h hVar7 = new gg.h();
        for (int i12 = 0; i12 < this.W3.length; i12++) {
            gg.h hVar8 = new gg.h();
            byte[][][] e10 = lj.a.e(this.W3[i12].a());
            gg.h hVar9 = new gg.h();
            for (int i13 = 0; i13 < e10.length; i13++) {
                gg.h hVar10 = new gg.h();
                for (int i14 = 0; i14 < e10[i13].length; i14++) {
                    hVar10.a(new t1(e10[i13][i14]));
                }
                hVar9.a(new x1(hVar10));
            }
            hVar8.a(new x1(hVar9));
            byte[][][] e11 = lj.a.e(this.W3[i12].b());
            gg.h hVar11 = new gg.h();
            for (int i15 = 0; i15 < e11.length; i15++) {
                gg.h hVar12 = new gg.h();
                for (int i16 = 0; i16 < e11[i15].length; i16++) {
                    hVar12.a(new t1(e11[i15][i16]));
                }
                hVar11.a(new x1(hVar12));
            }
            hVar8.a(new x1(hVar11));
            byte[][] c10 = lj.a.c(this.W3[i12].d());
            gg.h hVar13 = new gg.h();
            for (byte[] bArr : c10) {
                hVar13.a(new t1(bArr));
            }
            hVar8.a(new x1(hVar13));
            hVar8.a(new t1(lj.a.a(this.W3[i12].c())));
            hVar7.a(new x1(hVar8));
        }
        hVar.a(new x1(hVar7));
        return new x1(hVar);
    }

    public short[] l() {
        return lj.a.b(this.f10282x);
    }

    public short[] m() {
        return lj.a.b(this.U3);
    }

    public short[][] o() {
        return lj.a.d(this.f10281q);
    }

    public short[][] q() {
        return lj.a.d(this.f10283y);
    }

    public kj.a[] r() {
        return this.W3;
    }

    public int[] s() {
        return lj.a.g(this.V3);
    }
}
