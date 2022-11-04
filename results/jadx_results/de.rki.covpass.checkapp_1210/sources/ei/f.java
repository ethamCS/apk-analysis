package ei;

import gg.e0;
import gg.k1;
import gg.r1;
import gg.t1;
import gg.v;
import ih.k;
import ih.o;
import java.io.IOException;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;
import zg.q;
import zg.s;
import zh.c0;
import zh.d0;
import zh.g0;
import zh.j0;
import zh.n1;
import zh.o1;
import zh.r;
import zh.s1;
import zh.v1;
import zh.y;
import zh.z;
/* loaded from: classes3.dex */
public class f {

    /* renamed from: a */
    private static Set f9676a;

    static {
        HashSet hashSet = new HashSet(5);
        f9676a = hashSet;
        hashSet.add(lg.a.f16040x);
        f9676a.add(lg.a.f16041y);
        f9676a.add(lg.a.f16042z);
        f9676a.add(lg.a.A);
        f9676a.add(lg.a.B);
    }

    public static s a(zh.b bVar) {
        return b(bVar, null);
    }

    public static s b(zh.b bVar, e0 e0Var) {
        int i10;
        ih.g gVar;
        BigInteger e10;
        v vVar;
        if (bVar instanceof n1) {
            o1 o1Var = (o1) bVar;
            return new s(new hh.b(q.Z0, r1.f10880d), new zg.v(o1Var.c(), o1Var.h(), o1Var.b(), o1Var.g(), o1Var.i(), o1Var.e(), o1Var.f(), o1Var.j()), e0Var);
        } else if (bVar instanceof zh.s) {
            zh.s sVar = (zh.s) bVar;
            r b10 = sVar.b();
            return new s(new hh.b(o.A0, new hh.q(b10.b(), b10.c(), b10.a())), new gg.q(sVar.c()), e0Var);
        } else if (!(bVar instanceof d0)) {
            if (bVar instanceof v1) {
                v1 v1Var = (v1) bVar;
                return new s(new hh.b(mg.a.f16667c), new t1(v1Var.getEncoded()), e0Var, v1Var.b().getEncoded());
            } else if (bVar instanceof s1) {
                s1 s1Var = (s1) bVar;
                return new s(new hh.b(mg.a.f16666b), new t1(s1Var.getEncoded()), e0Var, s1Var.b().getEncoded());
            } else if (bVar instanceof j0) {
                j0 j0Var = (j0) bVar;
                return new s(new hh.b(mg.a.f16669e), new t1(j0Var.getEncoded()), e0Var, j0Var.b().getEncoded());
            } else if (!(bVar instanceof g0)) {
                throw new IOException("key parameters not recognized");
            } else {
                g0 g0Var = (g0) bVar;
                return new s(new hh.b(mg.a.f16668d), new t1(g0Var.getEncoded()), e0Var, g0Var.b().getEncoded());
            }
        } else {
            d0 d0Var = (d0) bVar;
            y b11 = d0Var.b();
            if (b11 == null) {
                gVar = new ih.g((gg.r) r1.f10880d);
                e10 = d0Var.c();
            } else if (b11 instanceof z) {
                z zVar = (z) b11;
                lg.f fVar = new lg.f(zVar.m(), zVar.k(), zVar.l());
                int i11 = 32;
                if (f9676a.contains(fVar.o())) {
                    vVar = lg.a.f16029m;
                } else {
                    boolean z10 = d0Var.c().bitLength() > 256;
                    v vVar2 = z10 ? ah.a.f527h : ah.a.f526g;
                    if (z10) {
                        i11 = 64;
                    }
                    vVar = vVar2;
                }
                byte[] bArr = new byte[i11];
                c(bArr, i11, 0, d0Var.c());
                return new s(new hh.b(vVar, fVar), new t1(bArr));
            } else if (!(b11 instanceof c0)) {
                ih.g gVar2 = new ih.g(new ih.i(b11.a(), new k(b11.b(), false), b11.e(), b11.c(), b11.f()));
                i10 = b11.e().bitLength();
                gVar = gVar2;
                return new s(new hh.b(o.Q, gVar), new bh.a(i10, d0Var.c(), new k1(new ti.k().a(b11.b(), d0Var.c()).l(false)), gVar), e0Var);
            } else {
                gVar = new ih.g(((c0) b11).j());
                e10 = b11.e();
            }
            i10 = e10.bitLength();
            return new s(new hh.b(o.Q, gVar), new bh.a(i10, d0Var.c(), new k1(new ti.k().a(b11.b(), d0Var.c()).l(false)), gVar), e0Var);
        }
    }

    private static void c(byte[] bArr, int i10, int i11, BigInteger bigInteger) {
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length < i10) {
            byte[] bArr2 = new byte[i10];
            System.arraycopy(byteArray, 0, bArr2, i10 - byteArray.length, byteArray.length);
            byteArray = bArr2;
        }
        for (int i12 = 0; i12 != i10; i12++) {
            bArr[i11 + i12] = byteArray[(byteArray.length - 1) - i12];
        }
    }
}
