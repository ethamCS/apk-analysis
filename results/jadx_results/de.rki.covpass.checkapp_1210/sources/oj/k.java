package oj;

import java.util.Objects;
import oj.j;
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a */
    private final m f18518a;

    /* renamed from: b */
    private final h f18519b;

    /* renamed from: c */
    private byte[] f18520c;

    /* renamed from: d */
    private byte[] f18521d;

    public k(m mVar) {
        Objects.requireNonNull(mVar, "params == null");
        this.f18518a = mVar;
        int c10 = mVar.c();
        this.f18519b = new h(mVar.b(), c10);
        this.f18520c = new byte[c10];
        this.f18521d = new byte[c10];
    }

    private byte[] a(byte[] bArr, int i10, int i11, j jVar) {
        int c10 = this.f18518a.c();
        Objects.requireNonNull(bArr, "startHash == null");
        if (bArr.length != c10) {
            throw new IllegalArgumentException("startHash needs to be " + c10 + "bytes");
        }
        Objects.requireNonNull(jVar, "otsHashAddress == null");
        Objects.requireNonNull(jVar.d(), "otsHashAddress byte array == null");
        int i12 = i10 + i11;
        if (i12 > this.f18518a.d() - 1) {
            throw new IllegalArgumentException("max chain length must not be greater than w");
        }
        if (i11 == 0) {
            return bArr;
        }
        byte[] a10 = a(bArr, i10, i11 - 1, jVar);
        j jVar2 = (j) new j.b().g(jVar.b()).h(jVar.c()).p(jVar.g()).n(jVar.e()).o(i12 - 1).f(0).l();
        byte[] c11 = this.f18519b.c(this.f18521d, jVar2.d());
        byte[] c12 = this.f18519b.c(this.f18521d, ((j) new j.b().g(jVar2.b()).h(jVar2.c()).p(jVar2.g()).n(jVar2.e()).o(jVar2.f()).f(1).l()).d());
        byte[] bArr2 = new byte[c10];
        for (int i13 = 0; i13 < c10; i13++) {
            bArr2[i13] = (byte) (a10[i13] ^ c12[i13]);
        }
        return this.f18519b.a(c11, bArr2);
    }

    private byte[] b(int i10) {
        if (i10 < 0 || i10 >= this.f18518a.a()) {
            throw new IllegalArgumentException("index out of bounds");
        }
        return this.f18519b.c(this.f18520c, a0.q(i10, 32));
    }

    public h c() {
        return this.f18519b;
    }

    public m d() {
        return this.f18518a;
    }

    public n e(j jVar) {
        Objects.requireNonNull(jVar, "otsHashAddress == null");
        byte[][] bArr = new byte[this.f18518a.a()];
        for (int i10 = 0; i10 < this.f18518a.a(); i10++) {
            jVar = (j) new j.b().g(jVar.b()).h(jVar.c()).p(jVar.g()).n(i10).o(jVar.f()).f(jVar.a()).l();
            bArr[i10] = a(b(i10), 0, this.f18518a.d() - 1, jVar);
        }
        return new n(this.f18518a, bArr);
    }

    public byte[] f() {
        return ak.a.h(this.f18521d);
    }

    public byte[] g(byte[] bArr, j jVar) {
        return this.f18519b.c(bArr, ((j) new j.b().g(jVar.b()).h(jVar.c()).p(jVar.g()).l()).d());
    }

    public void h(byte[] bArr, byte[] bArr2) {
        Objects.requireNonNull(bArr, "secretKeySeed == null");
        if (bArr.length == this.f18518a.c()) {
            Objects.requireNonNull(bArr2, "publicSeed == null");
            if (bArr2.length != this.f18518a.c()) {
                throw new IllegalArgumentException("size of publicSeed needs to be equal to size of digest");
            }
            this.f18520c = bArr;
            this.f18521d = bArr2;
            return;
        }
        throw new IllegalArgumentException("size of secretKeySeed needs to be equal to size of digest");
    }
}
