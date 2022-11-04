package oj;

import java.util.Objects;
/* loaded from: classes3.dex */
public final class z extends p implements ak.d {
    private final byte[] U3;

    /* renamed from: q */
    private final x f18591q;

    /* renamed from: x */
    private final int f18592x;

    /* renamed from: y */
    private final byte[] f18593y;

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        private final x f18594a;

        /* renamed from: b */
        private byte[] f18595b = null;

        /* renamed from: c */
        private byte[] f18596c = null;

        /* renamed from: d */
        private byte[] f18597d = null;

        public b(x xVar) {
            this.f18594a = xVar;
        }

        public z e() {
            return new z(this);
        }

        public b f(byte[] bArr) {
            this.f18597d = a0.c(bArr);
            return this;
        }

        public b g(byte[] bArr) {
            this.f18596c = a0.c(bArr);
            return this;
        }

        public b h(byte[] bArr) {
            this.f18595b = a0.c(bArr);
            return this;
        }
    }

    private z(b bVar) {
        super(false, bVar.f18594a.f());
        x xVar = bVar.f18594a;
        this.f18591q = xVar;
        Objects.requireNonNull(xVar, "params == null");
        int h10 = xVar.h();
        byte[] bArr = bVar.f18597d;
        if (bArr != null) {
            if (bArr.length == h10 + h10) {
                this.f18592x = 0;
                this.f18593y = a0.g(bArr, 0, h10);
                this.U3 = a0.g(bArr, h10 + 0, h10);
                return;
            } else if (bArr.length != h10 + 4 + h10) {
                throw new IllegalArgumentException("public key has wrong size");
            } else {
                this.f18592x = ak.l.a(bArr, 0);
                this.f18593y = a0.g(bArr, 4, h10);
                this.U3 = a0.g(bArr, 4 + h10, h10);
                return;
            }
        }
        if (xVar.e() != null) {
            this.f18592x = xVar.e().a();
        } else {
            this.f18592x = 0;
        }
        byte[] bArr2 = bVar.f18595b;
        if (bArr2 == null) {
            this.f18593y = new byte[h10];
        } else if (bArr2.length != h10) {
            throw new IllegalArgumentException("length of root must be equal to length of digest");
        } else {
            this.f18593y = bArr2;
        }
        byte[] bArr3 = bVar.f18596c;
        if (bArr3 == null) {
            this.U3 = new byte[h10];
        } else if (bArr3.length != h10) {
            throw new IllegalArgumentException("length of publicSeed must be equal to length of digest");
        } else {
            this.U3 = bArr3;
        }
    }

    public x c() {
        return this.f18591q;
    }

    public byte[] d() {
        return a0.c(this.U3);
    }

    public byte[] e() {
        return a0.c(this.f18593y);
    }

    public byte[] f() {
        byte[] bArr;
        int h10 = this.f18591q.h();
        int i10 = this.f18592x;
        int i11 = 0;
        if (i10 != 0) {
            bArr = new byte[h10 + 4 + h10];
            ak.l.f(i10, bArr, 0);
            i11 = 4;
        } else {
            bArr = new byte[h10 + h10];
        }
        a0.e(bArr, this.f18593y, i11);
        a0.e(bArr, this.U3, i11 + h10);
        return bArr;
    }

    @Override // ak.d
    public byte[] getEncoded() {
        return f();
    }
}
