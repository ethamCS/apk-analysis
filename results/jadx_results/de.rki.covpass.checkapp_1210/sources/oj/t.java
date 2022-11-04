package oj;

import java.util.Objects;
/* loaded from: classes3.dex */
public final class t extends q implements ak.d {
    private final byte[] U3;

    /* renamed from: q */
    private final r f18561q;

    /* renamed from: x */
    private final int f18562x;

    /* renamed from: y */
    private final byte[] f18563y;

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        private final r f18564a;

        /* renamed from: b */
        private byte[] f18565b = null;

        /* renamed from: c */
        private byte[] f18566c = null;

        /* renamed from: d */
        private byte[] f18567d = null;

        public b(r rVar) {
            this.f18564a = rVar;
        }

        public t e() {
            return new t(this);
        }

        public b f(byte[] bArr) {
            this.f18567d = a0.c(bArr);
            return this;
        }

        public b g(byte[] bArr) {
            this.f18566c = a0.c(bArr);
            return this;
        }

        public b h(byte[] bArr) {
            this.f18565b = a0.c(bArr);
            return this;
        }
    }

    private t(b bVar) {
        super(false, bVar.f18564a.e());
        r rVar = bVar.f18564a;
        this.f18561q = rVar;
        Objects.requireNonNull(rVar, "params == null");
        int f10 = rVar.f();
        byte[] bArr = bVar.f18567d;
        if (bArr != null) {
            if (bArr.length == f10 + f10) {
                this.f18562x = 0;
                this.f18563y = a0.g(bArr, 0, f10);
                this.U3 = a0.g(bArr, f10 + 0, f10);
                return;
            } else if (bArr.length != f10 + 4 + f10) {
                throw new IllegalArgumentException("public key has wrong size");
            } else {
                this.f18562x = ak.l.a(bArr, 0);
                this.f18563y = a0.g(bArr, 4, f10);
                this.U3 = a0.g(bArr, 4 + f10, f10);
                return;
            }
        }
        if (rVar.d() != null) {
            this.f18562x = rVar.d().a();
        } else {
            this.f18562x = 0;
        }
        byte[] bArr2 = bVar.f18565b;
        if (bArr2 == null) {
            this.f18563y = new byte[f10];
        } else if (bArr2.length != f10) {
            throw new IllegalArgumentException("length of root must be equal to length of digest");
        } else {
            this.f18563y = bArr2;
        }
        byte[] bArr3 = bVar.f18566c;
        if (bArr3 == null) {
            this.U3 = new byte[f10];
        } else if (bArr3.length != f10) {
            throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
        } else {
            this.U3 = bArr3;
        }
    }

    public r c() {
        return this.f18561q;
    }

    public byte[] d() {
        return a0.c(this.U3);
    }

    public byte[] e() {
        return a0.c(this.f18563y);
    }

    public byte[] f() {
        byte[] bArr;
        int f10 = this.f18561q.f();
        int i10 = this.f18562x;
        int i11 = 0;
        if (i10 != 0) {
            bArr = new byte[f10 + 4 + f10];
            ak.l.f(i10, bArr, 0);
            i11 = 4;
        } else {
            bArr = new byte[f10 + f10];
        }
        a0.e(bArr, this.f18563y, i11);
        a0.e(bArr, this.U3, i11 + f10);
        return bArr;
    }

    @Override // ak.d
    public byte[] getEncoded() {
        return f();
    }
}
