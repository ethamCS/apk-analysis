package bi;

import java.security.SecureRandom;
/* loaded from: classes3.dex */
public class a implements d {

    /* renamed from: a */
    private final SecureRandom f6086a;

    /* renamed from: b */
    private final boolean f6087b;

    /* renamed from: bi.a$a */
    /* loaded from: classes3.dex */
    class C0083a implements c {

        /* renamed from: a */
        final /* synthetic */ int f6088a;

        C0083a(int i10) {
            a.this = r1;
            this.f6088a = i10;
        }

        @Override // bi.c
        public int entropySize() {
            return this.f6088a;
        }

        @Override // bi.c
        public byte[] getEntropy() {
            if (!(a.this.f6086a instanceof f)) {
                SecureRandom unused = a.this.f6086a;
                return a.this.f6086a.generateSeed((this.f6088a + 7) / 8);
            }
            byte[] bArr = new byte[(this.f6088a + 7) / 8];
            a.this.f6086a.nextBytes(bArr);
            return bArr;
        }
    }

    public a(SecureRandom secureRandom, boolean z10) {
        this.f6086a = secureRandom;
        this.f6087b = z10;
    }

    @Override // bi.d
    public c get(int i10) {
        return new C0083a(i10);
    }
}
