package z5;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import y5.p;
import y5.q;
import y5.r;
/* loaded from: classes.dex */
public class b implements q<y5.a, y5.a> {

    /* renamed from: a */
    private static final Logger f26475a = Logger.getLogger(b.class.getName());

    /* renamed from: z5.b$b */
    /* loaded from: classes.dex */
    public static class C0466b implements y5.a {

        /* renamed from: a */
        private final p<y5.a> f26476a;

        private C0466b(p<y5.a> pVar) {
            this.f26476a = pVar;
        }

        @Override // y5.a
        public byte[] a(byte[] bArr, byte[] bArr2) {
            return g6.g.a(this.f26476a.b().a(), this.f26476a.b().c().a(bArr, bArr2));
        }

        @Override // y5.a
        public byte[] b(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 0, 5);
                byte[] copyOfRange2 = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (p.b<y5.a> bVar : this.f26476a.c(copyOfRange)) {
                    try {
                        return bVar.c().b(copyOfRange2, bArr2);
                    } catch (GeneralSecurityException e10) {
                        Logger logger = b.f26475a;
                        logger.info("ciphertext prefix matches a key, but cannot decrypt: " + e10.toString());
                    }
                }
            }
            for (p.b<y5.a> bVar2 : this.f26476a.e()) {
                try {
                    return bVar2.c().b(bArr, bArr2);
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("decryption failed");
        }
    }

    b() {
    }

    public static void e() {
        r.r(new b());
    }

    @Override // y5.q
    public Class<y5.a> a() {
        return y5.a.class;
    }

    @Override // y5.q
    public Class<y5.a> c() {
        return y5.a.class;
    }

    /* renamed from: f */
    public y5.a b(p<y5.a> pVar) {
        return new C0466b(pVar);
    }
}
