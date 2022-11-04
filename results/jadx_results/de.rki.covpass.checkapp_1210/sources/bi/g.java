package bi;

import java.security.SecureRandom;
import org.bouncycastle.crypto.r;
import org.bouncycastle.crypto.y;
import org.conscrypt.PSKKeyManager;
/* loaded from: classes3.dex */
public class g {

    /* renamed from: a */
    private final SecureRandom f6095a;

    /* renamed from: b */
    private final d f6096b;

    /* renamed from: c */
    private byte[] f6097c;

    /* renamed from: d */
    private int f6098d;

    /* renamed from: e */
    private int f6099e;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class a implements bi.b {

        /* renamed from: a */
        private final y f6100a;

        /* renamed from: b */
        private final byte[] f6101b;

        /* renamed from: c */
        private final byte[] f6102c;

        /* renamed from: d */
        private final int f6103d;

        public a(y yVar, byte[] bArr, byte[] bArr2, int i10) {
            this.f6100a = yVar;
            this.f6101b = bArr;
            this.f6102c = bArr2;
            this.f6103d = i10;
        }

        @Override // bi.b
        public ci.c a(c cVar) {
            return new ci.a(this.f6100a, this.f6103d, cVar, this.f6102c, this.f6101b);
        }

        @Override // bi.b
        public String getAlgorithm() {
            StringBuilder sb2;
            String algorithmName;
            if (this.f6100a instanceof uh.g) {
                sb2 = new StringBuilder();
                sb2.append("HMAC-DRBG-");
                algorithmName = g.d(((uh.g) this.f6100a).b());
            } else {
                sb2 = new StringBuilder();
                sb2.append("HMAC-DRBG-");
                algorithmName = this.f6100a.getAlgorithmName();
            }
            sb2.append(algorithmName);
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b implements bi.b {

        /* renamed from: a */
        private final r f6104a;

        /* renamed from: b */
        private final byte[] f6105b;

        /* renamed from: c */
        private final byte[] f6106c;

        /* renamed from: d */
        private final int f6107d;

        public b(r rVar, byte[] bArr, byte[] bArr2, int i10) {
            this.f6104a = rVar;
            this.f6105b = bArr;
            this.f6106c = bArr2;
            this.f6107d = i10;
        }

        @Override // bi.b
        public ci.c a(c cVar) {
            return new ci.b(this.f6104a, this.f6107d, cVar, this.f6106c, this.f6105b);
        }

        @Override // bi.b
        public String getAlgorithm() {
            return "HASH-DRBG-" + g.d(this.f6104a);
        }
    }

    public g(d dVar) {
        this.f6098d = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        this.f6099e = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        this.f6095a = null;
        this.f6096b = dVar;
    }

    public g(SecureRandom secureRandom, boolean z10) {
        this.f6098d = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        this.f6099e = PSKKeyManager.MAX_KEY_LENGTH_BYTES;
        this.f6095a = secureRandom;
        this.f6096b = new bi.a(secureRandom, z10);
    }

    public static String d(r rVar) {
        String algorithmName = rVar.getAlgorithmName();
        int indexOf = algorithmName.indexOf(45);
        if (indexOf <= 0 || algorithmName.startsWith("SHA3")) {
            return algorithmName;
        }
        return algorithmName.substring(0, indexOf) + algorithmName.substring(indexOf + 1);
    }

    public f b(y yVar, byte[] bArr, boolean z10) {
        return new f(this.f6095a, this.f6096b.get(this.f6099e), new a(yVar, bArr, this.f6097c, this.f6098d), z10);
    }

    public f c(r rVar, byte[] bArr, boolean z10) {
        return new f(this.f6095a, this.f6096b.get(this.f6099e), new b(rVar, bArr, this.f6097c, this.f6098d), z10);
    }

    public g e(byte[] bArr) {
        this.f6097c = ak.a.h(bArr);
        return this;
    }
}
