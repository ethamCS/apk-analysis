package d6;

import f6.i0;
import g6.g;
import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Logger;
import y5.o;
import y5.p;
import y5.q;
import y5.r;
/* loaded from: classes.dex */
class d implements q<o, o> {

    /* renamed from: a */
    private static final Logger f8374a = Logger.getLogger(d.class.getName());

    /* loaded from: classes.dex */
    public static class b implements o {

        /* renamed from: a */
        private final p<o> f8375a;

        /* renamed from: b */
        private final byte[] f8376b;

        private b(p<o> pVar) {
            this.f8376b = new byte[]{0};
            this.f8375a = pVar;
        }

        @Override // y5.o
        public void a(byte[] bArr, byte[] bArr2) {
            if (bArr.length > 5) {
                byte[] copyOf = Arrays.copyOf(bArr, 5);
                byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, bArr.length);
                for (p.b<o> bVar : this.f8375a.c(copyOf)) {
                    try {
                        if (bVar.b().equals(i0.LEGACY)) {
                            bVar.c().a(copyOfRange, g.a(bArr2, this.f8376b));
                            return;
                        } else {
                            bVar.c().a(copyOfRange, bArr2);
                            return;
                        }
                    } catch (GeneralSecurityException e10) {
                        Logger logger = d.f8374a;
                        logger.info("tag prefix matches a key, but cannot verify: " + e10);
                    }
                }
                for (p.b<o> bVar2 : this.f8375a.e()) {
                    try {
                        bVar2.c().a(bArr, bArr2);
                        return;
                    } catch (GeneralSecurityException unused) {
                    }
                }
                throw new GeneralSecurityException("invalid MAC");
            }
            throw new GeneralSecurityException("tag too short");
        }

        @Override // y5.o
        public byte[] b(byte[] bArr) {
            return this.f8375a.b().b().equals(i0.LEGACY) ? g.a(this.f8375a.b().a(), this.f8375a.b().c().b(g.a(bArr, this.f8376b))) : g.a(this.f8375a.b().a(), this.f8375a.b().c().b(bArr));
        }
    }

    d() {
    }

    public static void e() {
        r.r(new d());
    }

    @Override // y5.q
    public Class<o> a() {
        return o.class;
    }

    @Override // y5.q
    public Class<o> c() {
        return o.class;
    }

    /* renamed from: f */
    public o b(p<o> pVar) {
        return new b(pVar);
    }
}
