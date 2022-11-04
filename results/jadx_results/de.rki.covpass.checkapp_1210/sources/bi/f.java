package bi;

import java.security.SecureRandom;
/* loaded from: classes3.dex */
public class f extends SecureRandom {

    /* renamed from: c */
    private final b f6090c;

    /* renamed from: d */
    private final boolean f6091d;

    /* renamed from: q */
    private final SecureRandom f6092q;

    /* renamed from: x */
    private final c f6093x;

    /* renamed from: y */
    private ci.c f6094y;

    public f(SecureRandom secureRandom, c cVar, b bVar, boolean z10) {
        this.f6092q = secureRandom;
        this.f6093x = cVar;
        this.f6090c = bVar;
        this.f6091d = z10;
    }

    public void b(byte[] bArr) {
        synchronized (this) {
            if (this.f6094y == null) {
                this.f6094y = this.f6090c.a(this.f6093x);
            }
            this.f6094y.a(bArr);
        }
    }

    @Override // java.security.SecureRandom
    public byte[] generateSeed(int i10) {
        return e.a(this.f6093x, i10);
    }

    @Override // java.security.SecureRandom
    public String getAlgorithm() {
        return this.f6090c.getAlgorithm();
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void nextBytes(byte[] bArr) {
        synchronized (this) {
            if (this.f6094y == null) {
                this.f6094y = this.f6090c.a(this.f6093x);
            }
            if (this.f6094y.b(bArr, null, this.f6091d) < 0) {
                this.f6094y.a(null);
                this.f6094y.b(bArr, null, this.f6091d);
            }
        }
    }

    @Override // java.security.SecureRandom, java.util.Random
    public void setSeed(long j10) {
        synchronized (this) {
            SecureRandom secureRandom = this.f6092q;
            if (secureRandom != null) {
                secureRandom.setSeed(j10);
            }
        }
    }

    @Override // java.security.SecureRandom
    public void setSeed(byte[] bArr) {
        synchronized (this) {
            SecureRandom secureRandom = this.f6092q;
            if (secureRandom != null) {
                secureRandom.setSeed(bArr);
            }
        }
    }
}
