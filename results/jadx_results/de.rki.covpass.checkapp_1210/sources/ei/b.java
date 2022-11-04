package ei;

import ak.q;
import gg.d0;
import gg.j0;
import gg.x1;
import java.math.BigInteger;
import org.bouncycastle.crypto.l;
import org.conscrypt.BuildConfig;
import zg.v;
import zh.c0;
import zh.g0;
import zh.h0;
import zh.o1;
import zh.r;
import zh.s;
/* loaded from: classes3.dex */
public class b {

    /* renamed from: a */
    static final byte[] f9665a = q.f("openssh-key-v1\u0000");

    private static boolean a(d0 d0Var) {
        for (int i10 = 0; i10 < d0Var.size(); i10++) {
            if (!(d0Var.G(i10) instanceof gg.q)) {
                return false;
            }
        }
        return true;
    }

    public static byte[] b(zh.b bVar) {
        if (bVar != null) {
            if (!(bVar instanceof o1) && !(bVar instanceof zh.d0)) {
                if (bVar instanceof s) {
                    s sVar = (s) bVar;
                    r b10 = sVar.b();
                    gg.h hVar = new gg.h();
                    hVar.a(new gg.q(0L));
                    hVar.a(new gg.q(b10.b()));
                    hVar.a(new gg.q(b10.c()));
                    hVar.a(new gg.q(b10.a()));
                    hVar.a(new gg.q(b10.a().modPow(sVar.c(), b10.b())));
                    hVar.a(new gg.q(sVar.c()));
                    try {
                        return new x1(hVar).getEncoded();
                    } catch (Exception e10) {
                        throw new IllegalStateException("unable to encode DSAPrivateKeyParameters " + e10.getMessage());
                    }
                } else if (!(bVar instanceof g0)) {
                    throw new IllegalArgumentException("unable to convert " + bVar.getClass().getName() + " to openssh private key");
                } else {
                    g0 g0Var = (g0) bVar;
                    h0 b11 = g0Var.b();
                    h hVar2 = new h();
                    hVar2.g(f9665a);
                    hVar2.h("none");
                    hVar2.h("none");
                    hVar2.h(BuildConfig.FLAVOR);
                    hVar2.d(1);
                    hVar2.f(c.a(b11));
                    h hVar3 = new h();
                    int nextInt = l.b().nextInt();
                    hVar3.d(nextInt);
                    hVar3.d(nextInt);
                    hVar3.h("ssh-ed25519");
                    byte[] encoded = b11.getEncoded();
                    hVar3.f(encoded);
                    hVar3.f(ak.a.p(g0Var.getEncoded(), encoded));
                    hVar3.h(BuildConfig.FLAVOR);
                    hVar2.f(hVar3.b());
                    return hVar2.a();
                }
            }
            return f.a(bVar).u().b().getEncoded();
        }
        throw new IllegalArgumentException("param is null");
    }

    public static zh.b c(byte[] bArr) {
        zh.b bVar = null;
        if (bArr[0] == 48) {
            d0 F = d0.F(bArr);
            if (F.size() == 6) {
                if (a(F) && ((gg.q) F.G(0)).F().equals(ak.b.f550a)) {
                    bVar = new s(((gg.q) F.G(5)).F(), new r(((gg.q) F.G(1)).F(), ((gg.q) F.G(2)).F(), ((gg.q) F.G(3)).F()));
                }
            } else if (F.size() == 9) {
                if (a(F) && ((gg.q) F.G(0)).F().equals(ak.b.f550a)) {
                    v o10 = v.o(F);
                    bVar = new o1(o10.q(), o10.w(), o10.u(), o10.r(), o10.s(), o10.m(), o10.n(), o10.l());
                }
            } else if (F.size() == 4 && (F.G(3) instanceof j0) && (F.G(2) instanceof j0)) {
                bh.a l10 = bh.a.l(F);
                gg.v K = gg.v.K(l10.o());
                bVar = new zh.d0(l10.m(), new c0(K, ih.d.c(K)));
            }
        } else {
            g gVar = new g(f9665a, bArr);
            if (!"none".equals(gVar.f())) {
                throw new IllegalStateException("encrypted keys not supported");
            }
            gVar.h();
            gVar.h();
            if (gVar.g() != 1) {
                throw new IllegalStateException("multiple keys not supported");
            }
            c.c(gVar.c());
            byte[] d10 = gVar.d();
            if (gVar.a()) {
                throw new IllegalArgumentException("decoded key has trailing data");
            }
            g gVar2 = new g(d10);
            if (gVar2.g() != gVar2.g()) {
                throw new IllegalStateException("private key check values are not the same");
            }
            String f10 = gVar2.f();
            if ("ssh-ed25519".equals(f10)) {
                gVar2.c();
                byte[] c10 = gVar2.c();
                if (c10.length != 64) {
                    throw new IllegalStateException("private key value of wrong length");
                }
                bVar = new g0(c10, 0);
            } else if (f10.startsWith("ecdsa")) {
                gg.v b10 = i.b(q.b(gVar2.c()));
                if (b10 == null) {
                    throw new IllegalStateException("OID not found for: " + f10);
                }
                ih.i c11 = ug.a.c(b10);
                if (c11 == null) {
                    throw new IllegalStateException("Curve not found for: " + b10);
                }
                gVar2.c();
                bVar = new zh.d0(new BigInteger(1, gVar2.c()), new c0(b10, c11));
            }
            gVar2.h();
            if (gVar2.a()) {
                throw new IllegalArgumentException("private key block has trailing data");
            }
        }
        if (bVar != null) {
            return bVar;
        }
        throw new IllegalArgumentException("unable to parse key");
    }
}
