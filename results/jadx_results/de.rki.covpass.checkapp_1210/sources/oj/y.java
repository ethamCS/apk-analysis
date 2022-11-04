package oj;

import java.io.IOException;
import java.util.Objects;
import oj.j;
/* loaded from: classes3.dex */
public final class y extends p implements ak.d {
    private final byte[] U3;
    private final byte[] V3;
    private volatile oj.a W3;

    /* renamed from: q */
    private final x f18579q;

    /* renamed from: x */
    private final byte[] f18580x;

    /* renamed from: y */
    private final byte[] f18581y;

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        private final x f18582a;

        /* renamed from: b */
        private int f18583b = 0;

        /* renamed from: c */
        private int f18584c = -1;

        /* renamed from: d */
        private byte[] f18585d = null;

        /* renamed from: e */
        private byte[] f18586e = null;

        /* renamed from: f */
        private byte[] f18587f = null;

        /* renamed from: g */
        private byte[] f18588g = null;

        /* renamed from: h */
        private oj.a f18589h = null;

        /* renamed from: i */
        private byte[] f18590i = null;

        public b(x xVar) {
            this.f18582a = xVar;
        }

        public y j() {
            return new y(this);
        }

        public b k(oj.a aVar) {
            this.f18589h = aVar;
            return this;
        }

        public b l(int i10) {
            this.f18583b = i10;
            return this;
        }

        public b m(int i10) {
            this.f18584c = i10;
            return this;
        }

        public b n(byte[] bArr) {
            this.f18587f = a0.c(bArr);
            return this;
        }

        public b o(byte[] bArr) {
            this.f18588g = a0.c(bArr);
            return this;
        }

        public b p(byte[] bArr) {
            this.f18586e = a0.c(bArr);
            return this;
        }

        public b q(byte[] bArr) {
            this.f18585d = a0.c(bArr);
            return this;
        }
    }

    private y(b bVar) {
        super(true, bVar.f18582a.f());
        x xVar = bVar.f18582a;
        this.f18579q = xVar;
        Objects.requireNonNull(xVar, "params == null");
        int h10 = xVar.h();
        byte[] bArr = bVar.f18590i;
        if (bArr != null) {
            int b10 = xVar.b();
            int a10 = ak.l.a(bArr, 0);
            if (!a0.l(b10, a10)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            this.f18580x = a0.g(bArr, 4, h10);
            int i10 = 4 + h10;
            this.f18581y = a0.g(bArr, i10, h10);
            int i11 = i10 + h10;
            this.U3 = a0.g(bArr, i11, h10);
            int i12 = i11 + h10;
            this.V3 = a0.g(bArr, i12, h10);
            int i13 = i12 + h10;
            try {
                oj.a aVar = (oj.a) a0.f(a0.g(bArr, i13, bArr.length - i13), oj.a.class);
                if (aVar.c() != a10) {
                    throw new IllegalStateException("serialized BDS has wrong index");
                }
                this.W3 = aVar.j(bVar.f18582a.g());
                return;
            } catch (IOException e10) {
                throw new IllegalArgumentException(e10.getMessage(), e10);
            } catch (ClassNotFoundException e11) {
                throw new IllegalArgumentException(e11.getMessage(), e11);
            }
        }
        byte[] bArr2 = bVar.f18585d;
        if (bArr2 == null) {
            this.f18580x = new byte[h10];
        } else if (bArr2.length != h10) {
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
        } else {
            this.f18580x = bArr2;
        }
        byte[] bArr3 = bVar.f18586e;
        if (bArr3 == null) {
            this.f18581y = new byte[h10];
        } else if (bArr3.length != h10) {
            throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
        } else {
            this.f18581y = bArr3;
        }
        byte[] bArr4 = bVar.f18587f;
        if (bArr4 == null) {
            this.U3 = new byte[h10];
        } else if (bArr4.length != h10) {
            throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
        } else {
            this.U3 = bArr4;
        }
        byte[] bArr5 = bVar.f18588g;
        if (bArr5 == null) {
            this.V3 = new byte[h10];
        } else if (bArr5.length != h10) {
            throw new IllegalArgumentException("size of root needs to be equal size of digest");
        } else {
            this.V3 = bArr5;
        }
        oj.a aVar2 = bVar.f18589h;
        this.W3 = aVar2 == null ? (bVar.f18583b >= (1 << xVar.b()) + (-2) || bArr4 == null || bArr2 == null) ? new oj.a(xVar, (1 << xVar.b()) - 1, bVar.f18583b) : new oj.a(xVar, bArr4, bArr2, (j) new j.b().l(), bVar.f18583b) : aVar2;
        if (bVar.f18584c >= 0 && bVar.f18584c != this.W3.e()) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    public x c() {
        return this.f18579q;
    }

    public byte[] d() {
        byte[] p10;
        synchronized (this) {
            int h10 = this.f18579q.h();
            byte[] bArr = new byte[h10 + 4 + h10 + h10 + h10];
            ak.l.f(this.W3.c(), bArr, 0);
            a0.e(bArr, this.f18580x, 4);
            int i10 = 4 + h10;
            a0.e(bArr, this.f18581y, i10);
            int i11 = i10 + h10;
            a0.e(bArr, this.U3, i11);
            a0.e(bArr, this.V3, i11 + h10);
            try {
                p10 = ak.a.p(bArr, a0.p(this.W3));
            } catch (IOException e10) {
                throw new RuntimeException("error serializing bds state: " + e10.getMessage());
            }
        }
        return p10;
    }

    @Override // ak.d
    public byte[] getEncoded() {
        byte[] d10;
        synchronized (this) {
            d10 = d();
        }
        return d10;
    }
}
