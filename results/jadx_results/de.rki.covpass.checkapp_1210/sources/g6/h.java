package g6;
/* loaded from: classes.dex */
class h extends i {
    public h(byte[] bArr, int i10) {
        super(bArr, i10);
    }

    @Override // g6.i
    int[] d(int[] iArr, int i10) {
        if (iArr.length == g() / 4) {
            int[] iArr2 = new int[16];
            i.k(iArr2, this.f10575a);
            iArr2[12] = i10;
            System.arraycopy(iArr, 0, iArr2, 13, iArr.length);
            return iArr2;
        }
        throw new IllegalArgumentException(String.format("ChaCha20 uses 96-bit nonces, but got a %d-bit nonce", Integer.valueOf(iArr.length * 32)));
    }

    @Override // g6.i
    public int g() {
        return 12;
    }
}
