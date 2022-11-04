package nh;

import java.io.ByteArrayOutputStream;
/* loaded from: classes3.dex */
public class q implements org.bouncycastle.crypto.r {

    /* renamed from: a */
    private b f17260a = new b();

    /* loaded from: classes3.dex */
    public static class b extends ByteArrayOutputStream {
        private b() {
        }

        void b(byte[] bArr, int i10) {
            System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArr, i10, size());
        }

        @Override // java.io.ByteArrayOutputStream
        public void reset() {
            super.reset();
            ak.a.g(((ByteArrayOutputStream) this).buf);
        }
    }

    @Override // org.bouncycastle.crypto.r
    public int doFinal(byte[] bArr, int i10) {
        int size = this.f17260a.size();
        this.f17260a.b(bArr, i10);
        reset();
        return size;
    }

    @Override // org.bouncycastle.crypto.r
    public String getAlgorithmName() {
        return "NULL";
    }

    @Override // org.bouncycastle.crypto.r
    public int getDigestSize() {
        return this.f17260a.size();
    }

    @Override // org.bouncycastle.crypto.r
    public void reset() {
        this.f17260a.reset();
    }

    @Override // org.bouncycastle.crypto.r
    public void update(byte b10) {
        this.f17260a.write(b10);
    }

    @Override // org.bouncycastle.crypto.r
    public void update(byte[] bArr, int i10, int i11) {
        this.f17260a.write(bArr, i10, i11);
    }
}
