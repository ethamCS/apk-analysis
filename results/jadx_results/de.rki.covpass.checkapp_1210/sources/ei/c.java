package ei;

import gg.v;
import zh.c0;
import zh.e0;
import zh.h0;
import zh.n1;
import zh.r;
import zh.t;
/* loaded from: classes3.dex */
public class c {
    public static byte[] a(zh.b bVar) {
        if (bVar != null) {
            if (bVar instanceof n1) {
                if (bVar.a()) {
                    throw new IllegalArgumentException("RSAKeyParamaters was for encryption");
                }
                n1 n1Var = (n1) bVar;
                h hVar = new h();
                hVar.h("ssh-rsa");
                hVar.e(n1Var.b());
                hVar.e(n1Var.c());
                return hVar.a();
            } else if (bVar instanceof e0) {
                h hVar2 = new h();
                e0 e0Var = (e0) bVar;
                String e10 = i.e(e0Var.b());
                if (e10 == null) {
                    throw new IllegalArgumentException("unable to derive ssh curve name for " + e0Var.b().a().getClass().getName());
                }
                hVar2.h("ecdsa-sha2-" + e10);
                hVar2.h(e10);
                hVar2.f(e0Var.c().l(false));
                return hVar2.a();
            } else if (bVar instanceof t) {
                t tVar = (t) bVar;
                r b10 = tVar.b();
                h hVar3 = new h();
                hVar3.h("ssh-dss");
                hVar3.e(b10.b());
                hVar3.e(b10.c());
                hVar3.e(b10.a());
                hVar3.e(tVar.c());
                return hVar3.a();
            } else if (bVar instanceof h0) {
                h hVar4 = new h();
                hVar4.h("ssh-ed25519");
                hVar4.f(((h0) bVar).getEncoded());
                return hVar4.a();
            } else {
                throw new IllegalArgumentException("unable to convert " + bVar.getClass().getName() + " to private key");
            }
        }
        throw new IllegalArgumentException("cipherParameters was null.");
    }

    public static zh.b b(g gVar) {
        zh.b bVar;
        zh.b e0Var;
        String f10 = gVar.f();
        if ("ssh-rsa".equals(f10)) {
            bVar = new n1(false, gVar.b(), gVar.b());
        } else {
            if ("ssh-dss".equals(f10)) {
                e0Var = new t(gVar.b(), new r(gVar.b(), gVar.b(), gVar.b()));
            } else if (f10.startsWith("ecdsa")) {
                String f11 = gVar.f();
                v b10 = i.b(f11);
                ih.i f12 = i.f(b10);
                if (f12 == null) {
                    throw new IllegalStateException("unable to find curve for " + f10 + " using curve name " + f11);
                }
                e0Var = new e0(f12.l().j(gVar.c()), new c0(b10, f12));
            } else if ("ssh-ed25519".equals(f10)) {
                byte[] c10 = gVar.c();
                if (c10.length != 32) {
                    throw new IllegalStateException("public key value of wrong length");
                }
                bVar = new h0(c10, 0);
            } else {
                bVar = null;
            }
            bVar = e0Var;
        }
        if (bVar != null) {
            if (gVar.a()) {
                throw new IllegalArgumentException("decoded key has trailing data");
            }
            return bVar;
        }
        throw new IllegalArgumentException("unable to parse key");
    }

    public static zh.b c(byte[] bArr) {
        return b(new g(bArr));
    }
}
