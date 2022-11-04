package b.e.b;

import b.e.b.d;
import b.e.b.i;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class b implements d.a {

    /* renamed from: c */
    boolean f2183c;

    /* renamed from: e */
    public a f2185e;

    /* renamed from: a */
    i f2181a = null;

    /* renamed from: b */
    float f2182b = 0.0f;

    /* renamed from: d */
    ArrayList<i> f2184d = new ArrayList<>();

    /* renamed from: f */
    boolean f2186f = false;

    /* loaded from: classes.dex */
    public interface a {
        float a(int i);

        float b(b bVar, boolean z);

        void c(i iVar, float f2);

        void clear();

        float d(i iVar, boolean z);

        void e(i iVar, float f2, boolean z);

        i f(int i);

        float g(i iVar);

        boolean h(i iVar);

        void i(float f2);

        void j();

        int k();
    }

    public b() {
    }

    public b(c cVar) {
        this.f2185e = new b.e.b.a(this, cVar);
    }

    private boolean u(i iVar, d dVar) {
        return iVar.m <= 1;
    }

    private i w(boolean[] zArr, i iVar) {
        i.a aVar;
        int k = this.f2185e.k();
        i iVar2 = null;
        float f2 = 0.0f;
        for (int i = 0; i < k; i++) {
            float a2 = this.f2185e.a(i);
            if (a2 < 0.0f) {
                i f3 = this.f2185e.f(i);
                if ((zArr == null || !zArr[f3.f2215c]) && f3 != iVar && (((aVar = f3.j) == i.a.SLACK || aVar == i.a.ERROR) && a2 < f2)) {
                    f2 = a2;
                    iVar2 = f3;
                }
            }
        }
        return iVar2;
    }

    public void A(d dVar, i iVar, boolean z) {
        if (!iVar.f2219g) {
            return;
        }
        this.f2182b += iVar.f2218f * this.f2185e.g(iVar);
        this.f2185e.d(iVar, z);
        if (z) {
            iVar.c(this);
        }
        if (!d.t || iVar == null || this.f2185e.k() != 0) {
            return;
        }
        this.f2186f = true;
        dVar.f2191a = true;
    }

    public void B(d dVar, b bVar, boolean z) {
        this.f2182b += bVar.f2182b * this.f2185e.b(bVar, z);
        if (z) {
            bVar.f2181a.c(this);
        }
        if (!d.t || this.f2181a == null || this.f2185e.k() != 0) {
            return;
        }
        this.f2186f = true;
        dVar.f2191a = true;
    }

    public void C(d dVar, i iVar, boolean z) {
        if (!iVar.n) {
            return;
        }
        float g2 = this.f2185e.g(iVar);
        this.f2182b += iVar.p * g2;
        this.f2185e.d(iVar, z);
        if (z) {
            iVar.c(this);
        }
        this.f2185e.e(dVar.n.f2190d[iVar.o], g2, z);
        if (!d.t || iVar == null || this.f2185e.k() != 0) {
            return;
        }
        this.f2186f = true;
        dVar.f2191a = true;
    }

    public void D(d dVar) {
        if (dVar.f2197g.length == 0) {
            return;
        }
        boolean z = false;
        while (!z) {
            int k = this.f2185e.k();
            for (int i = 0; i < k; i++) {
                i f2 = this.f2185e.f(i);
                if (f2.f2216d != -1 || f2.f2219g || f2.n) {
                    this.f2184d.add(f2);
                }
            }
            int size = this.f2184d.size();
            if (size > 0) {
                for (int i2 = 0; i2 < size; i2++) {
                    i iVar = this.f2184d.get(i2);
                    if (iVar.f2219g) {
                        A(dVar, iVar, true);
                    } else if (iVar.n) {
                        C(dVar, iVar, true);
                    } else {
                        B(dVar, dVar.f2197g[iVar.f2216d], true);
                    }
                }
                this.f2184d.clear();
            } else {
                z = true;
            }
        }
        if (!d.t || this.f2181a == null || this.f2185e.k() != 0) {
            return;
        }
        this.f2186f = true;
        dVar.f2191a = true;
    }

    @Override // b.e.b.d.a
    public void a(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f2181a = null;
            this.f2185e.clear();
            for (int i = 0; i < bVar.f2185e.k(); i++) {
                this.f2185e.e(bVar.f2185e.f(i), bVar.f2185e.a(i), true);
            }
        }
    }

    @Override // b.e.b.d.a
    public void b(i iVar) {
        int i = iVar.f2217e;
        float f2 = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f2 = 1000.0f;
            } else if (i == 3) {
                f2 = 1000000.0f;
            } else if (i == 4) {
                f2 = 1.0E9f;
            } else if (i == 5) {
                f2 = 1.0E12f;
            }
        }
        this.f2185e.c(iVar, f2);
    }

    @Override // b.e.b.d.a
    public i c(d dVar, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // b.e.b.d.a
    public void clear() {
        this.f2185e.clear();
        this.f2181a = null;
        this.f2182b = 0.0f;
    }

    public b d(d dVar, int i) {
        this.f2185e.c(dVar.o(i, "ep"), 1.0f);
        this.f2185e.c(dVar.o(i, "em"), -1.0f);
        return this;
    }

    public b e(i iVar, int i) {
        this.f2185e.c(iVar, i);
        return this;
    }

    public boolean f(d dVar) {
        boolean z;
        i g2 = g(dVar);
        if (g2 == null) {
            z = true;
        } else {
            x(g2);
            z = false;
        }
        if (this.f2185e.k() == 0) {
            this.f2186f = true;
        }
        return z;
    }

    i g(d dVar) {
        int k = this.f2185e.k();
        i iVar = null;
        i iVar2 = null;
        boolean z = false;
        boolean z2 = false;
        float f2 = 0.0f;
        float f3 = 0.0f;
        for (int i = 0; i < k; i++) {
            float a2 = this.f2185e.a(i);
            i f4 = this.f2185e.f(i);
            if (f4.j == i.a.UNRESTRICTED) {
                if (iVar == null || f2 > a2) {
                    z = u(f4, dVar);
                    f2 = a2;
                    iVar = f4;
                } else if (!z && u(f4, dVar)) {
                    f2 = a2;
                    iVar = f4;
                    z = true;
                }
            } else if (iVar == null && a2 < 0.0f) {
                if (iVar2 == null || f3 > a2) {
                    z2 = u(f4, dVar);
                    f3 = a2;
                    iVar2 = f4;
                } else if (!z2 && u(f4, dVar)) {
                    f3 = a2;
                    iVar2 = f4;
                    z2 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // b.e.b.d.a
    public i getKey() {
        return this.f2181a;
    }

    public b h(i iVar, i iVar2, int i, float f2, i iVar3, i iVar4, int i2) {
        float f3;
        int i3;
        if (iVar2 == iVar3) {
            this.f2185e.c(iVar, 1.0f);
            this.f2185e.c(iVar4, 1.0f);
            this.f2185e.c(iVar2, -2.0f);
            return this;
        }
        if (f2 == 0.5f) {
            this.f2185e.c(iVar, 1.0f);
            this.f2185e.c(iVar2, -1.0f);
            this.f2185e.c(iVar3, -1.0f);
            this.f2185e.c(iVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                i3 = (-i) + i2;
                f3 = i3;
            }
            return this;
        } else if (f2 <= 0.0f) {
            this.f2185e.c(iVar, -1.0f);
            this.f2185e.c(iVar2, 1.0f);
            f3 = i;
        } else if (f2 < 1.0f) {
            float f4 = 1.0f - f2;
            this.f2185e.c(iVar, f4 * 1.0f);
            this.f2185e.c(iVar2, f4 * (-1.0f));
            this.f2185e.c(iVar3, (-1.0f) * f2);
            this.f2185e.c(iVar4, 1.0f * f2);
            if (i > 0 || i2 > 0) {
                f3 = ((-i) * f4) + (i2 * f2);
            }
            return this;
        } else {
            this.f2185e.c(iVar4, -1.0f);
            this.f2185e.c(iVar3, 1.0f);
            i3 = -i2;
            f3 = i3;
        }
        this.f2182b = f3;
        return this;
    }

    public b i(i iVar, int i) {
        this.f2181a = iVar;
        float f2 = i;
        iVar.f2218f = f2;
        this.f2182b = f2;
        this.f2186f = true;
        return this;
    }

    @Override // b.e.b.d.a
    public boolean isEmpty() {
        return this.f2181a == null && this.f2182b == 0.0f && this.f2185e.k() == 0;
    }

    public b j(i iVar, i iVar2, float f2) {
        this.f2185e.c(iVar, -1.0f);
        this.f2185e.c(iVar2, f2);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f2) {
        this.f2185e.c(iVar, -1.0f);
        this.f2185e.c(iVar2, 1.0f);
        this.f2185e.c(iVar3, f2);
        this.f2185e.c(iVar4, -f2);
        return this;
    }

    public b l(float f2, float f3, float f4, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f2182b = 0.0f;
        if (f3 == 0.0f || f2 == f4) {
            this.f2185e.c(iVar, 1.0f);
            this.f2185e.c(iVar2, -1.0f);
            this.f2185e.c(iVar4, 1.0f);
            this.f2185e.c(iVar3, -1.0f);
        } else if (f2 == 0.0f) {
            this.f2185e.c(iVar, 1.0f);
            this.f2185e.c(iVar2, -1.0f);
        } else if (f4 == 0.0f) {
            this.f2185e.c(iVar3, 1.0f);
            this.f2185e.c(iVar4, -1.0f);
        } else {
            float f5 = (f2 / f3) / (f4 / f3);
            this.f2185e.c(iVar, 1.0f);
            this.f2185e.c(iVar2, -1.0f);
            this.f2185e.c(iVar4, f5);
            this.f2185e.c(iVar3, -f5);
        }
        return this;
    }

    public b m(i iVar, int i) {
        a aVar;
        float f2;
        if (i < 0) {
            this.f2182b = i * (-1);
            aVar = this.f2185e;
            f2 = 1.0f;
        } else {
            this.f2182b = i;
            aVar = this.f2185e;
            f2 = -1.0f;
        }
        aVar.c(iVar, f2);
        return this;
    }

    public b n(i iVar, i iVar2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f2182b = i;
        }
        if (!z) {
            this.f2185e.c(iVar, -1.0f);
            this.f2185e.c(iVar2, 1.0f);
        } else {
            this.f2185e.c(iVar, 1.0f);
            this.f2185e.c(iVar2, -1.0f);
        }
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f2182b = i;
        }
        if (!z) {
            this.f2185e.c(iVar, -1.0f);
            this.f2185e.c(iVar2, 1.0f);
            this.f2185e.c(iVar3, 1.0f);
        } else {
            this.f2185e.c(iVar, 1.0f);
            this.f2185e.c(iVar2, -1.0f);
            this.f2185e.c(iVar3, -1.0f);
        }
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f2182b = i;
        }
        if (!z) {
            this.f2185e.c(iVar, -1.0f);
            this.f2185e.c(iVar2, 1.0f);
            this.f2185e.c(iVar3, -1.0f);
        } else {
            this.f2185e.c(iVar, 1.0f);
            this.f2185e.c(iVar2, -1.0f);
            this.f2185e.c(iVar3, 1.0f);
        }
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f2) {
        this.f2185e.c(iVar3, 0.5f);
        this.f2185e.c(iVar4, 0.5f);
        this.f2185e.c(iVar, -0.5f);
        this.f2185e.c(iVar2, -0.5f);
        this.f2182b = -f2;
        return this;
    }

    public void r() {
        float f2 = this.f2182b;
        if (f2 < 0.0f) {
            this.f2182b = f2 * (-1.0f);
            this.f2185e.j();
        }
    }

    public boolean s() {
        i iVar = this.f2181a;
        return iVar != null && (iVar.j == i.a.UNRESTRICTED || this.f2182b >= 0.0f);
    }

    public boolean t(i iVar) {
        return this.f2185e.h(iVar);
    }

    public String toString() {
        return z();
    }

    public i v(i iVar) {
        return w(null, iVar);
    }

    public void x(i iVar) {
        i iVar2 = this.f2181a;
        if (iVar2 != null) {
            this.f2185e.c(iVar2, -1.0f);
            this.f2181a.f2216d = -1;
            this.f2181a = null;
        }
        float d2 = this.f2185e.d(iVar, true) * (-1.0f);
        this.f2181a = iVar;
        if (d2 == 1.0f) {
            return;
        }
        this.f2182b /= d2;
        this.f2185e.i(d2);
    }

    public void y() {
        this.f2181a = null;
        this.f2185e.clear();
        this.f2182b = 0.0f;
        this.f2186f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String z() {
        /*
            r10 = this;
            b.e.b.i r0 = r10.f2181a
            java.lang.String r1 = ""
            if (r0 != 0) goto L14
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "0"
            r0.append(r1)
            goto L21
        L14:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            b.e.b.i r1 = r10.f2181a
            r0.append(r1)
        L21:
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r10.f2182b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L52
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f2182b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L53
        L52:
            r1 = 0
        L53:
            b.e.b.b$a r5 = r10.f2185e
            int r5 = r5.k()
        L59:
            if (r2 >= r5) goto Ld2
            b.e.b.b$a r6 = r10.f2185e
            b.e.b.i r6 = r6.f(r2)
            if (r6 != 0) goto L64
            goto Lcf
        L64:
            b.e.b.b$a r7 = r10.f2185e
            float r7 = r7.a(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L6f
            goto Lcf
        L6f:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L86
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto Lab
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            goto La2
        L86:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            if (r8 <= 0) goto L9a
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto Lab
        L9a:
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
        La2:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r7 = r7 * r9
        Lab:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto Lb7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto Lc4
        Lb7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        Lc4:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = 1
        Lcf:
            int r2 = r2 + 1
            goto L59
        Ld2:
            if (r1 != 0) goto Le5
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        Le5:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: b.e.b.b.z():java.lang.String");
    }
}
