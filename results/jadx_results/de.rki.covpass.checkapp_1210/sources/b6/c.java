package b6;

import g6.g;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import y5.d;
import y5.p;
import y5.q;
import y5.r;
/* loaded from: classes.dex */
public class c implements q<d, d> {

    /* renamed from: a */
    private static final Logger f5743a = Logger.getLogger(c.class.getName());

    /* loaded from: classes.dex */
    public static class a implements d {

        /* renamed from: a */
        private p<d> f5744a;

        public a(p<d> pVar) {
            this.f5744a = pVar;
        }

        @Override // y5.d
        public byte[] a(byte[] bArr, byte[] bArr2) {
            return g.a(this.f5744a.b().a(), this.f5744a.b().c().a(bArr, bArr2));
        }

        @Override // y5.d
        public byte[] b(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (p.b<d> bVar : this.f5744a.c(copyOfRange)) {
                    try {
                        return bVar.c().b(copyOfRange2, bArr2);
                    } catch (GeneralSecurityException e10) {
                        Logger logger = c.f5743a;
                        logger.info("ciphertext prefix matches a key, but cannot decrypt: " + e10.toString());
                    }
                }
            }
            for (p.b<d> bVar2 : this.f5744a.e()) {
                try {
                    return bVar2.c().b(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }
    }

    c() {
    }

    public static void e() {
        r.r(new c());
    }

    @Override // y5.q
    public Class<d> a() {
        return d.class;
    }

    @Override // y5.q
    public Class<d> c() {
        return d.class;
    }

    /* renamed from: f */
    public d b(p<d> pVar) {
        return new a(pVar);
    }
}
