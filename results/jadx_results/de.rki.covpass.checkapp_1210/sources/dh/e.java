package dh;

import java.math.BigInteger;
import java.util.Random;
import ti.i;
/* loaded from: classes3.dex */
public abstract class e {
    public static i a(ti.e eVar, byte[] bArr) {
        ti.f m10 = eVar.m(BigInteger.valueOf(bArr[bArr.length - 1] & 1));
        ti.f m11 = eVar.m(new BigInteger(1, bArr));
        if (!d(m11).equals(eVar.n())) {
            m11 = m11.b();
        }
        ti.f fVar = null;
        if (m11.i()) {
            fVar = eVar.o().n();
        } else {
            ti.f c10 = c(eVar, m11.o().g().j(eVar.o()).a(eVar.n()).a(m11));
            if (c10 != null) {
                if (!d(c10).equals(m10)) {
                    c10 = c10.b();
                }
                fVar = m11.j(c10);
            }
        }
        if (fVar != null) {
            return eVar.E(m11.t(), fVar.t());
        }
        throw new IllegalArgumentException("Invalid point compression");
    }

    public static byte[] b(i iVar) {
        i A = iVar.A();
        ti.f f10 = A.f();
        byte[] e10 = f10.e();
        if (!f10.i()) {
            if (d(A.g().d(f10)).h()) {
                int length = e10.length - 1;
                e10[length] = (byte) (e10[length] | 1);
            } else {
                int length2 = e10.length - 1;
                e10[length2] = (byte) (e10[length2] & 254);
            }
        }
        return e10;
    }

    private static ti.f c(ti.e eVar, ti.f fVar) {
        ti.f fVar2;
        if (fVar.i()) {
            return fVar;
        }
        ti.f m10 = eVar.m(ti.d.f22359a);
        Random random = new Random();
        int f10 = fVar.f();
        do {
            ti.f m11 = eVar.m(new BigInteger(f10, random));
            ti.f fVar3 = fVar;
            fVar2 = m10;
            for (int i10 = 1; i10 <= f10 - 1; i10++) {
                ti.f o10 = fVar3.o();
                fVar2 = fVar2.o().a(o10.j(m11));
                fVar3 = o10.a(fVar);
            }
            if (!fVar3.i()) {
                return null;
            }
        } while (fVar2.o().a(fVar2).i());
        return fVar2;
    }

    private static ti.f d(ti.f fVar) {
        ti.f fVar2 = fVar;
        for (int i10 = 1; i10 < fVar.f(); i10++) {
            fVar2 = fVar2.o().a(fVar);
        }
        return fVar2;
    }
}
