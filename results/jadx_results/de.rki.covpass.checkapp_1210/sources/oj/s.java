package oj;

import java.io.IOException;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class s extends q implements ak.d {
    private final byte[] U3;
    private final byte[] V3;
    private volatile long W3;
    private volatile oj.b X3;

    /* renamed from: q */
    private final r f18548q;

    /* renamed from: x */
    private final byte[] f18549x;

    /* renamed from: y */
    private final byte[] f18550y;

    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a */
        private final r f18551a;

        /* renamed from: b */
        private long f18552b = 0;

        /* renamed from: c */
        private long f18553c = -1;

        /* renamed from: d */
        private byte[] f18554d = null;

        /* renamed from: e */
        private byte[] f18555e = null;

        /* renamed from: f */
        private byte[] f18556f = null;

        /* renamed from: g */
        private byte[] f18557g = null;

        /* renamed from: h */
        private oj.b f18558h = null;

        /* renamed from: i */
        private byte[] f18559i = null;

        /* renamed from: j */
        private x f18560j = null;

        public b(r rVar) {
            this.f18551a = rVar;
        }

        public s k() {
            return new s(this);
        }

        public b l(oj.b bVar) {
            if (bVar.c() == 0) {
                this.f18558h = new oj.b(bVar, (1 << this.f18551a.a()) - 1);
            } else {
                this.f18558h = bVar;
            }
            return this;
        }

        public b m(long j10) {
            this.f18552b = j10;
            return this;
        }

        public b n(long j10) {
            this.f18553c = j10;
            return this;
        }

        public b o(byte[] bArr) {
            this.f18556f = a0.c(bArr);
            return this;
        }

        public b p(byte[] bArr) {
            this.f18557g = a0.c(bArr);
            return this;
        }

        public b q(byte[] bArr) {
            this.f18555e = a0.c(bArr);
            return this;
        }

        public b r(byte[] bArr) {
            this.f18554d = a0.c(bArr);
            return this;
        }
    }

    private s(b bVar) {
        super(true, bVar.f18551a.e());
        r rVar = bVar.f18551a;
        this.f18548q = rVar;
        Objects.requireNonNull(rVar, "params == null");
        int f10 = rVar.f();
        byte[] bArr = bVar.f18559i;
        if (bArr != null) {
            Objects.requireNonNull(bVar.f18560j, "xmss == null");
            int a10 = rVar.a();
            int i10 = (a10 + 7) / 8;
            this.W3 = a0.a(bArr, 0, i10);
            if (!a0.l(a10, this.W3)) {
                throw new IllegalArgumentException("index out of bounds");
            }
            int i11 = i10 + 0;
            this.f18549x = a0.g(bArr, i11, f10);
            int i12 = i11 + f10;
            this.f18550y = a0.g(bArr, i12, f10);
            int i13 = i12 + f10;
            this.U3 = a0.g(bArr, i13, f10);
            int i14 = i13 + f10;
            this.V3 = a0.g(bArr, i14, f10);
            int i15 = i14 + f10;
            try {
                this.X3 = ((oj.b) a0.f(a0.g(bArr, i15, bArr.length - i15), oj.b.class)).h(bVar.f18560j.g());
                return;
            } catch (IOException e10) {
                throw new IllegalArgumentException(e10.getMessage(), e10);
            } catch (ClassNotFoundException e11) {
                throw new IllegalArgumentException(e11.getMessage(), e11);
            }
        }
        this.W3 = bVar.f18552b;
        byte[] bArr2 = bVar.f18554d;
        if (bArr2 == null) {
            this.f18549x = new byte[f10];
        } else if (bArr2.length != f10) {
            throw new IllegalArgumentException("size of secretKeySeed needs to be equal size of digest");
        } else {
            this.f18549x = bArr2;
        }
        byte[] bArr3 = bVar.f18555e;
        if (bArr3 == null) {
            this.f18550y = new byte[f10];
        } else if (bArr3.length != f10) {
            throw new IllegalArgumentException("size of secretKeyPRF needs to be equal size of digest");
        } else {
            this.f18550y = bArr3;
        }
        byte[] bArr4 = bVar.f18556f;
        if (bArr4 == null) {
            this.U3 = new byte[f10];
        } else if (bArr4.length != f10) {
            throw new IllegalArgumentException("size of publicSeed needs to be equal size of digest");
        } else {
            this.U3 = bArr4;
        }
        byte[] bArr5 = bVar.f18557g;
        if (bArr5 == null) {
            this.V3 = new byte[f10];
        } else if (bArr5.length != f10) {
            throw new IllegalArgumentException("size of root needs to be equal size of digest");
        } else {
            this.V3 = bArr5;
        }
        oj.b bVar2 = bVar.f18558h;
        if (bVar2 == null) {
            bVar2 = (!a0.l(rVar.a(), bVar.f18552b) || bArr4 == null || bArr2 == null) ? new oj.b(bVar.f18553c + 1) : new oj.b(rVar, bVar.f18552b, bArr4, bArr2);
        }
        this.X3 = bVar2;
        if (bVar.f18553c >= 0 && bVar.f18553c != this.X3.c()) {
            throw new IllegalArgumentException("maxIndex set but not reflected in state");
        }
    }

    public r c() {
        return this.f18548q;
    }

    public byte[] d() {
        byte[] p10;
        synchronized (this) {
            int f10 = this.f18548q.f();
            int a10 = (this.f18548q.a() + 7) / 8;
            byte[] bArr = new byte[a10 + f10 + f10 + f10 + f10];
            a0.e(bArr, a0.q(this.W3, a10), 0);
            int i10 = a10 + 0;
            a0.e(bArr, this.f18549x, i10);
            int i11 = i10 + f10;
            a0.e(bArr, this.f18550y, i11);
            int i12 = i11 + f10;
            a0.e(bArr, this.U3, i12);
            a0.e(bArr, this.V3, i12 + f10);
            try {
                p10 = ak.a.p(bArr, a0.p(this.X3));
            } catch (IOException e10) {
                throw new IllegalStateException("error serializing bds state: " + e10.getMessage(), e10);
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
