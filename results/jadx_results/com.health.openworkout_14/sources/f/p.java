package f;

import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a */
    final byte[] f4470a;

    /* renamed from: b */
    int f4471b;

    /* renamed from: c */
    int f4472c;

    /* renamed from: d */
    boolean f4473d;

    /* renamed from: e */
    boolean f4474e;

    /* renamed from: f */
    p f4475f;

    /* renamed from: g */
    p f4476g;

    public p() {
        this.f4470a = new byte[8192];
        this.f4474e = true;
        this.f4473d = false;
    }

    public p(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f4470a = bArr;
        this.f4471b = i;
        this.f4472c = i2;
        this.f4473d = z;
        this.f4474e = z2;
    }

    public final void a() {
        p pVar = this.f4476g;
        if (pVar != this) {
            if (!pVar.f4474e) {
                return;
            }
            int i = this.f4472c - this.f4471b;
            if (i > (8192 - pVar.f4472c) + (pVar.f4473d ? 0 : pVar.f4471b)) {
                return;
            }
            f(pVar, i);
            b();
            q.a(this);
            return;
        }
        throw new IllegalStateException();
    }

    @Nullable
    public final p b() {
        p pVar = this.f4475f;
        p pVar2 = pVar != this ? pVar : null;
        p pVar3 = this.f4476g;
        pVar3.f4475f = pVar;
        this.f4475f.f4476g = pVar3;
        this.f4475f = null;
        this.f4476g = null;
        return pVar2;
    }

    public final p c(p pVar) {
        pVar.f4476g = this;
        pVar.f4475f = this.f4475f;
        this.f4475f.f4476g = pVar;
        this.f4475f = pVar;
        return pVar;
    }

    public final p d() {
        this.f4473d = true;
        return new p(this.f4470a, this.f4471b, this.f4472c, true, false);
    }

    public final p e(int i) {
        p pVar;
        if (i <= 0 || i > this.f4472c - this.f4471b) {
            throw new IllegalArgumentException();
        }
        if (i >= 1024) {
            pVar = d();
        } else {
            pVar = q.b();
            System.arraycopy(this.f4470a, this.f4471b, pVar.f4470a, 0, i);
        }
        pVar.f4472c = pVar.f4471b + i;
        this.f4471b += i;
        this.f4476g.c(pVar);
        return pVar;
    }

    public final void f(p pVar, int i) {
        if (pVar.f4474e) {
            int i2 = pVar.f4472c;
            if (i2 + i > 8192) {
                if (pVar.f4473d) {
                    throw new IllegalArgumentException();
                }
                int i3 = pVar.f4471b;
                if ((i2 + i) - i3 > 8192) {
                    throw new IllegalArgumentException();
                }
                byte[] bArr = pVar.f4470a;
                System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
                pVar.f4472c -= pVar.f4471b;
                pVar.f4471b = 0;
            }
            System.arraycopy(this.f4470a, this.f4471b, pVar.f4470a, pVar.f4472c, i);
            pVar.f4472c += i;
            this.f4471b += i;
            return;
        }
        throw new IllegalArgumentException();
    }
}
