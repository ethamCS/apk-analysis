package gj;

import org.bouncycastle.crypto.r;
/* loaded from: classes3.dex */
class m {
    public static void a(byte[] bArr, r rVar) {
        rVar.update(bArr, 0, bArr.length);
    }

    public static void b(short s10, r rVar) {
        rVar.update((byte) (s10 >>> 8));
        rVar.update((byte) s10);
    }

    public static void c(int i10, r rVar) {
        rVar.update((byte) (i10 >>> 24));
        rVar.update((byte) (i10 >>> 16));
        rVar.update((byte) (i10 >>> 8));
        rVar.update((byte) i10);
    }
}
