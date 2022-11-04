package j0;

import j0.d;
import j0.i;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class b implements d.a {

    /* renamed from: e */
    public a f13865e;

    /* renamed from: a */
    i f13861a = null;

    /* renamed from: b */
    float f13862b = 0.0f;

    /* renamed from: c */
    boolean f13863c = false;

    /* renamed from: d */
    ArrayList<i> f13864d = new ArrayList<>();

    /* renamed from: f */
    boolean f13866f = false;

    /* loaded from: classes.dex */
    public interface a {
        float a(int i10);

        float b(b bVar, boolean z10);

        float c(i iVar, boolean z10);

        void clear();

        boolean d(i iVar);

        int e();

        void f(i iVar, float f10, boolean z10);

        float g(i iVar);

        i h(int i10);

        void i(i iVar, float f10);

        void j(float f10);

        void k();
    }

    public b() {
    }

    public b(c cVar) {
        this.f13865e = new j0.a(this, cVar);
    }

    private boolean u(i iVar, d dVar) {
        return iVar.f13911b4 <= 1;
    }

    private i w(boolean[] zArr, i iVar) {
        i.a aVar;
        int e10 = this.f13865e.e();
        i iVar2 = null;
        float f10 = 0.0f;
        for (int i10 = 0; i10 < e10; i10++) {
            float a10 = this.f13865e.a(i10);
            if (a10 < 0.0f) {
                i h10 = this.f13865e.h(i10);
                if ((zArr == null || !zArr[h10.f13918q]) && h10 != iVar && (((aVar = h10.Y3) == i.a.SLACK || aVar == i.a.ERROR) && a10 < f10)) {
                    f10 = a10;
                    iVar2 = h10;
                }
            }
        }
        return iVar2;
    }

    public void A(d dVar, i iVar, boolean z10) {
        if (iVar == null || !iVar.V3) {
            return;
        }
        this.f13862b += iVar.U3 * this.f13865e.g(iVar);
        this.f13865e.c(iVar, z10);
        if (z10) {
            iVar.g(this);
        }
        if (!d.f13873t || this.f13865e.e() != 0) {
            return;
        }
        this.f13866f = true;
        dVar.f13879a = true;
    }

    public void B(d dVar, b bVar, boolean z10) {
        this.f13862b += bVar.f13862b * this.f13865e.b(bVar, z10);
        if (z10) {
            bVar.f13861a.g(this);
        }
        if (!d.f13873t || this.f13861a == null || this.f13865e.e() != 0) {
            return;
        }
        this.f13866f = true;
        dVar.f13879a = true;
    }

    public void C(d dVar, i iVar, boolean z10) {
        if (iVar == null || !iVar.f13913c4) {
            return;
        }
        float g10 = this.f13865e.g(iVar);
        this.f13862b += iVar.f13916e4 * g10;
        this.f13865e.c(iVar, z10);
        if (z10) {
            iVar.g(this);
        }
        this.f13865e.f(dVar.f13892n.f13870d[iVar.f13915d4], g10, z10);
        if (!d.f13873t || this.f13865e.e() != 0) {
            return;
        }
        this.f13866f = true;
        dVar.f13879a = true;
    }

    public void D(d dVar) {
        if (dVar.f13885g.length == 0) {
            return;
        }
        boolean z10 = false;
        while (!z10) {
            int e10 = this.f13865e.e();
            for (int i10 = 0; i10 < e10; i10++) {
                i h10 = this.f13865e.h(i10);
                if (h10.f13919x != -1 || h10.V3 || h10.f13913c4) {
                    this.f13864d.add(h10);
                }
            }
            int size = this.f13864d.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    i iVar = this.f13864d.get(i11);
                    if (iVar.V3) {
                        A(dVar, iVar, true);
                    } else if (iVar.f13913c4) {
                        C(dVar, iVar, true);
                    } else {
                        B(dVar, dVar.f13885g[iVar.f13919x], true);
                    }
                }
                this.f13864d.clear();
            } else {
                z10 = true;
            }
        }
        if (!d.f13873t || this.f13861a == null || this.f13865e.e() != 0) {
            return;
        }
        this.f13866f = true;
        dVar.f13879a = true;
    }

    @Override // j0.d.a
    public void a(i iVar) {
        int i10 = iVar.f13920y;
        float f10 = 1.0f;
        if (i10 != 1) {
            if (i10 == 2) {
                f10 = 1000.0f;
            } else if (i10 == 3) {
                f10 = 1000000.0f;
            } else if (i10 == 4) {
                f10 = 1.0E9f;
            } else if (i10 == 5) {
                f10 = 1.0E12f;
            }
        }
        this.f13865e.i(iVar, f10);
    }

    @Override // j0.d.a
    public void b(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f13861a = null;
            this.f13865e.clear();
            for (int i10 = 0; i10 < bVar.f13865e.e(); i10++) {
                this.f13865e.f(bVar.f13865e.h(i10), bVar.f13865e.a(i10), true);
            }
        }
    }

    @Override // j0.d.a
    public i c(d dVar, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // j0.d.a
    public void clear() {
        this.f13865e.clear();
        this.f13861a = null;
        this.f13862b = 0.0f;
    }

    public b d(d dVar, int i10) {
        this.f13865e.i(dVar.o(i10, "ep"), 1.0f);
        this.f13865e.i(dVar.o(i10, "em"), -1.0f);
        return this;
    }

    public b e(i iVar, int i10) {
        this.f13865e.i(iVar, i10);
        return this;
    }

    public boolean f(d dVar) {
        boolean z10;
        i g10 = g(dVar);
        if (g10 == null) {
            z10 = true;
        } else {
            x(g10);
            z10 = false;
        }
        if (this.f13865e.e() == 0) {
            this.f13866f = true;
        }
        return z10;
    }

    i g(d dVar) {
        int e10 = this.f13865e.e();
        i iVar = null;
        boolean z10 = false;
        boolean z11 = false;
        float f10 = 0.0f;
        float f11 = 0.0f;
        i iVar2 = null;
        for (int i10 = 0; i10 < e10; i10++) {
            float a10 = this.f13865e.a(i10);
            i h10 = this.f13865e.h(i10);
            if (h10.Y3 == i.a.UNRESTRICTED) {
                if (iVar == null || f10 > a10) {
                    z10 = u(h10, dVar);
                    f10 = a10;
                    iVar = h10;
                } else if (!z10 && u(h10, dVar)) {
                    f10 = a10;
                    iVar = h10;
                    z10 = true;
                }
            } else if (iVar == null && a10 < 0.0f) {
                if (iVar2 == null || f11 > a10) {
                    z11 = u(h10, dVar);
                    f11 = a10;
                    iVar2 = h10;
                } else if (!z11 && u(h10, dVar)) {
                    f11 = a10;
                    iVar2 = h10;
                    z11 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // j0.d.a
    public i getKey() {
        return this.f13861a;
    }

    public b h(i iVar, i iVar2, int i10, float f10, i iVar3, i iVar4, int i11) {
        float f11;
        int i12;
        if (iVar2 == iVar3) {
            this.f13865e.i(iVar, 1.0f);
            this.f13865e.i(iVar4, 1.0f);
            this.f13865e.i(iVar2, -2.0f);
            return this;
        }
        if (f10 == 0.5f) {
            this.f13865e.i(iVar, 1.0f);
            this.f13865e.i(iVar2, -1.0f);
            this.f13865e.i(iVar3, -1.0f);
            this.f13865e.i(iVar4, 1.0f);
            if (i10 > 0 || i11 > 0) {
                i12 = (-i10) + i11;
                f11 = i12;
            }
            return this;
        } else if (f10 <= 0.0f) {
            this.f13865e.i(iVar, -1.0f);
            this.f13865e.i(iVar2, 1.0f);
            f11 = i10;
        } else if (f10 < 1.0f) {
            float f12 = 1.0f - f10;
            this.f13865e.i(iVar, f12 * 1.0f);
            this.f13865e.i(iVar2, f12 * (-1.0f));
            this.f13865e.i(iVar3, (-1.0f) * f10);
            this.f13865e.i(iVar4, 1.0f * f10);
            if (i10 > 0 || i11 > 0) {
                f11 = ((-i10) * f12) + (i11 * f10);
            }
            return this;
        } else {
            this.f13865e.i(iVar4, -1.0f);
            this.f13865e.i(iVar3, 1.0f);
            i12 = -i11;
            f11 = i12;
        }
        this.f13862b = f11;
        return this;
    }

    public b i(i iVar, int i10) {
        this.f13861a = iVar;
        float f10 = i10;
        iVar.U3 = f10;
        this.f13862b = f10;
        this.f13866f = true;
        return this;
    }

    @Override // j0.d.a
    public boolean isEmpty() {
        return this.f13861a == null && this.f13862b == 0.0f && this.f13865e.e() == 0;
    }

    public b j(i iVar, i iVar2, float f10) {
        this.f13865e.i(iVar, -1.0f);
        this.f13865e.i(iVar2, f10);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f13865e.i(iVar, -1.0f);
        this.f13865e.i(iVar2, 1.0f);
        this.f13865e.i(iVar3, f10);
        this.f13865e.i(iVar4, -f10);
        return this;
    }

    public b l(float f10, float f11, float f12, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f13862b = 0.0f;
        if (f11 == 0.0f || f10 == f12) {
            this.f13865e.i(iVar, 1.0f);
            this.f13865e.i(iVar2, -1.0f);
            this.f13865e.i(iVar4, 1.0f);
            this.f13865e.i(iVar3, -1.0f);
        } else if (f10 == 0.0f) {
            this.f13865e.i(iVar, 1.0f);
            this.f13865e.i(iVar2, -1.0f);
        } else if (f12 == 0.0f) {
            this.f13865e.i(iVar3, 1.0f);
            this.f13865e.i(iVar4, -1.0f);
        } else {
            float f13 = (f10 / f11) / (f12 / f11);
            this.f13865e.i(iVar, 1.0f);
            this.f13865e.i(iVar2, -1.0f);
            this.f13865e.i(iVar4, f13);
            this.f13865e.i(iVar3, -f13);
        }
        return this;
    }

    public b m(i iVar, int i10) {
        a aVar;
        float f10;
        if (i10 < 0) {
            this.f13862b = i10 * (-1);
            aVar = this.f13865e;
            f10 = 1.0f;
        } else {
            this.f13862b = i10;
            aVar = this.f13865e;
            f10 = -1.0f;
        }
        aVar.i(iVar, f10);
        return this;
    }

    public b n(i iVar, i iVar2, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f13862b = i10;
        }
        if (!z10) {
            this.f13865e.i(iVar, -1.0f);
            this.f13865e.i(iVar2, 1.0f);
        } else {
            this.f13865e.i(iVar, 1.0f);
            this.f13865e.i(iVar2, -1.0f);
        }
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f13862b = i10;
        }
        if (!z10) {
            this.f13865e.i(iVar, -1.0f);
            this.f13865e.i(iVar2, 1.0f);
            this.f13865e.i(iVar3, 1.0f);
        } else {
            this.f13865e.i(iVar, 1.0f);
            this.f13865e.i(iVar2, -1.0f);
            this.f13865e.i(iVar3, -1.0f);
        }
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i10) {
        boolean z10 = false;
        if (i10 != 0) {
            if (i10 < 0) {
                i10 *= -1;
                z10 = true;
            }
            this.f13862b = i10;
        }
        if (!z10) {
            this.f13865e.i(iVar, -1.0f);
            this.f13865e.i(iVar2, 1.0f);
            this.f13865e.i(iVar3, -1.0f);
        } else {
            this.f13865e.i(iVar, 1.0f);
            this.f13865e.i(iVar2, -1.0f);
            this.f13865e.i(iVar3, 1.0f);
        }
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f10) {
        this.f13865e.i(iVar3, 0.5f);
        this.f13865e.i(iVar4, 0.5f);
        this.f13865e.i(iVar, -0.5f);
        this.f13865e.i(iVar2, -0.5f);
        this.f13862b = -f10;
        return this;
    }

    public void r() {
        float f10 = this.f13862b;
        if (f10 < 0.0f) {
            this.f13862b = f10 * (-1.0f);
            this.f13865e.k();
        }
    }

    public boolean s() {
        i iVar = this.f13861a;
        return iVar != null && (iVar.Y3 == i.a.UNRESTRICTED || this.f13862b >= 0.0f);
    }

    public boolean t(i iVar) {
        return this.f13865e.d(iVar);
    }

    public String toString() {
        return z();
    }

    public i v(i iVar) {
        return w(null, iVar);
    }

    public void x(i iVar) {
        i iVar2 = this.f13861a;
        if (iVar2 != null) {
            this.f13865e.i(iVar2, -1.0f);
            this.f13861a.f13919x = -1;
            this.f13861a = null;
        }
        float c10 = this.f13865e.c(iVar, true) * (-1.0f);
        this.f13861a = iVar;
        if (c10 == 1.0f) {
            return;
        }
        this.f13862b /= c10;
        this.f13865e.j(c10);
    }

    public void y() {
        this.f13861a = null;
        this.f13865e.clear();
        this.f13862b = 0.0f;
        this.f13866f = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String z() {
        /*
            r10 = this;
            j0.i r0 = r10.f13861a
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
            j0.i r1 = r10.f13861a
            r0.append(r1)
        L21:
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r10.f13862b
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L52
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r10.f13862b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = r4
            goto L53
        L52:
            r1 = r3
        L53:
            j0.b$a r5 = r10.f13865e
            int r5 = r5.e()
        L59:
            if (r3 >= r5) goto Ld1
            j0.b$a r6 = r10.f13865e
            j0.i r6 = r6.h(r3)
            if (r6 != 0) goto L64
            goto Lce
        L64:
            j0.b$a r7 = r10.f13865e
            float r7 = r7.a(r3)
            int r8 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r8 != 0) goto L6f
            goto Lce
        L6f:
            java.lang.String r6 = r6.toString()
            r9 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L86
            int r1 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r1 >= 0) goto Laa
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
            goto Laa
        L9a:
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
        La2:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r7 = r7 * r9
        Laa:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto Lb6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto Lc3
        Lb6:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        Lc3:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = r4
        Lce:
            int r3 = r3 + 1
            goto L59
        Ld1:
            if (r1 != 0) goto Le4
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        Le4:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.b.z():java.lang.String");
    }
}
