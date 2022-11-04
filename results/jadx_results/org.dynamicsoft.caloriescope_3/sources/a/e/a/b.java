package a.e.a;

import a.e.a.e;
import a.e.a.i;
/* loaded from: classes.dex */
public class b implements e.a {

    /* renamed from: c */
    boolean f104c;
    public final a d;

    /* renamed from: a */
    i f102a = null;

    /* renamed from: b */
    float f103b = 0.0f;
    boolean e = false;

    public b(c cVar) {
        this.d = new a(this, cVar);
    }

    public b a(float f, float f2, float f3, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f103b = 0.0f;
        if (f2 == 0.0f || f == f3) {
            this.d.a(iVar, 1.0f);
            this.d.a(iVar2, -1.0f);
            this.d.a(iVar4, 1.0f);
            this.d.a(iVar3, -1.0f);
        } else if (f == 0.0f) {
            this.d.a(iVar, 1.0f);
            this.d.a(iVar2, -1.0f);
        } else if (f3 == 0.0f) {
            this.d.a(iVar3, 1.0f);
            this.d.a(iVar4, -1.0f);
        } else {
            float f4 = (f / f2) / (f3 / f2);
            this.d.a(iVar, 1.0f);
            this.d.a(iVar2, -1.0f);
            this.d.a(iVar4, f4);
            this.d.a(iVar3, -f4);
        }
        return this;
    }

    public b a(e eVar, int i) {
        this.d.a(eVar.a(i, "ep"), 1.0f);
        this.d.a(eVar.a(i, "em"), -1.0f);
        return this;
    }

    public b a(i iVar, int i) {
        this.d.a(iVar, i);
        return this;
    }

    public b a(i iVar, i iVar2, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f103b = i;
        }
        if (!z) {
            this.d.a(iVar, -1.0f);
            this.d.a(iVar2, 1.0f);
        } else {
            this.d.a(iVar, 1.0f);
            this.d.a(iVar2, -1.0f);
        }
        return this;
    }

    public b a(i iVar, i iVar2, int i, float f, i iVar3, i iVar4, int i2) {
        float f2;
        if (iVar2 == iVar3) {
            this.d.a(iVar, 1.0f);
            this.d.a(iVar4, 1.0f);
            this.d.a(iVar2, -2.0f);
            return this;
        } else if (f == 0.5f) {
            this.d.a(iVar, 1.0f);
            this.d.a(iVar2, -1.0f);
            this.d.a(iVar3, -1.0f);
            this.d.a(iVar4, 1.0f);
            if (i > 0 || i2 > 0) {
                f2 = (-i) + i2;
                this.f103b = f2;
            }
            return this;
        } else {
            if (f <= 0.0f) {
                this.d.a(iVar, -1.0f);
                this.d.a(iVar2, 1.0f);
                f2 = i;
            } else if (f < 1.0f) {
                float f3 = 1.0f - f;
                this.d.a(iVar, f3 * 1.0f);
                this.d.a(iVar2, f3 * (-1.0f));
                this.d.a(iVar3, (-1.0f) * f);
                this.d.a(iVar4, 1.0f * f);
                if (i > 0 || i2 > 0) {
                    f2 = ((-i) * f3) + (i2 * f);
                }
                return this;
            } else {
                this.d.a(iVar3, -1.0f);
                this.d.a(iVar4, 1.0f);
                f2 = i2;
            }
            this.f103b = f2;
            return this;
        }
    }

    public b a(i iVar, i iVar2, i iVar3, float f) {
        this.d.a(iVar, -1.0f);
        this.d.a(iVar2, 1.0f - f);
        this.d.a(iVar3, f);
        return this;
    }

    public b a(i iVar, i iVar2, i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f103b = i;
        }
        if (!z) {
            this.d.a(iVar, -1.0f);
            this.d.a(iVar2, 1.0f);
            this.d.a(iVar3, 1.0f);
        } else {
            this.d.a(iVar, 1.0f);
            this.d.a(iVar2, -1.0f);
            this.d.a(iVar3, -1.0f);
        }
        return this;
    }

    public b a(i iVar, i iVar2, i iVar3, i iVar4, float f) {
        this.d.a(iVar, -1.0f);
        this.d.a(iVar2, 1.0f);
        this.d.a(iVar3, f);
        this.d.a(iVar4, -f);
        return this;
    }

    @Override // a.e.a.e.a
    public i a(e eVar, boolean[] zArr) {
        return this.d.a(zArr, (i) null);
    }

    public void a() {
        float f = this.f103b;
        if (f < 0.0f) {
            this.f103b = f * (-1.0f);
            this.d.b();
        }
    }

    @Override // a.e.a.e.a
    public void a(e.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f102a = null;
            this.d.a();
            int i = 0;
            while (true) {
                a aVar2 = bVar.d;
                if (i >= aVar2.f99a) {
                    return;
                }
                this.d.a(aVar2.a(i), bVar.d.b(i), true);
                i++;
            }
        }
    }

    @Override // a.e.a.e.a
    public void a(i iVar) {
        int i = iVar.d;
        float f = 1.0f;
        if (i != 1) {
            if (i == 2) {
                f = 1000.0f;
            } else if (i == 3) {
                f = 1000000.0f;
            } else if (i == 4) {
                f = 1.0E9f;
            } else if (i == 5) {
                f = 1.0E12f;
            }
        }
        this.d.a(iVar, f);
    }

    public boolean a(e eVar) {
        boolean z;
        i a2 = this.d.a(eVar);
        if (a2 == null) {
            z = true;
        } else {
            d(a2);
            z = false;
        }
        if (this.d.f99a == 0) {
            this.e = true;
        }
        return z;
    }

    public b b(i iVar, int i) {
        this.f102a = iVar;
        float f = i;
        iVar.e = f;
        this.f103b = f;
        this.e = true;
        return this;
    }

    public b b(i iVar, i iVar2, i iVar3, int i) {
        boolean z = false;
        if (i != 0) {
            if (i < 0) {
                i *= -1;
                z = true;
            }
            this.f103b = i;
        }
        if (!z) {
            this.d.a(iVar, -1.0f);
            this.d.a(iVar2, 1.0f);
            this.d.a(iVar3, -1.0f);
        } else {
            this.d.a(iVar, 1.0f);
            this.d.a(iVar2, -1.0f);
            this.d.a(iVar3, 1.0f);
        }
        return this;
    }

    public b b(i iVar, i iVar2, i iVar3, i iVar4, float f) {
        this.d.a(iVar3, 0.5f);
        this.d.a(iVar4, 0.5f);
        this.d.a(iVar, -0.5f);
        this.d.a(iVar2, -0.5f);
        this.f103b = -f;
        return this;
    }

    public boolean b() {
        i iVar = this.f102a;
        return iVar != null && (iVar.g == i.a.UNRESTRICTED || this.f103b >= 0.0f);
    }

    public boolean b(i iVar) {
        return this.d.a(iVar);
    }

    public b c(i iVar, int i) {
        a aVar;
        float f;
        if (i < 0) {
            this.f103b = i * (-1);
            aVar = this.d;
            f = 1.0f;
        } else {
            this.f103b = i;
            aVar = this.d;
            f = -1.0f;
        }
        aVar.a(iVar, f);
        return this;
    }

    public i c(i iVar) {
        return this.d.a((boolean[]) null, iVar);
    }

    public boolean c() {
        return this.f102a == null && this.f103b == 0.0f && this.d.f99a == 0;
    }

    @Override // a.e.a.e.a
    public void clear() {
        this.d.a();
        this.f102a = null;
        this.f103b = 0.0f;
    }

    public void d() {
        this.f102a = null;
        this.d.a();
        this.f103b = 0.0f;
        this.e = false;
    }

    public void d(i iVar) {
        i iVar2 = this.f102a;
        if (iVar2 != null) {
            this.d.a(iVar2, -1.0f);
            this.f102a = null;
        }
        float a2 = this.d.a(iVar, true) * (-1.0f);
        this.f102a = iVar;
        if (a2 == 1.0f) {
            return;
        }
        this.f103b /= a2;
        this.d.a(a2);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    java.lang.String e() {
        /*
            r9 = this;
            a.e.a.i r0 = r9.f102a
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
            a.e.a.i r1 = r9.f102a
            r0.append(r1)
        L21:
            java.lang.String r0 = r0.toString()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " = "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r1 = r9.f103b
            r2 = 0
            r3 = 1
            r4 = 0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L52
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            float r0 = r9.f103b
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r1 = 1
            goto L53
        L52:
            r1 = 0
        L53:
            a.e.a.a r5 = r9.d
            int r5 = r5.f99a
        L57:
            if (r2 >= r5) goto Ld4
            a.e.a.a r6 = r9.d
            a.e.a.i r6 = r6.a(r2)
            if (r6 != 0) goto L62
            goto Ld1
        L62:
            a.e.a.a r7 = r9.d
            float r7 = r7.b(r2)
            int r8 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r8 != 0) goto L6d
            goto Ld1
        L6d:
            java.lang.String r6 = r6.toString()
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r1 != 0) goto L84
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 >= 0) goto Lad
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "- "
            goto La4
        L84:
            int r1 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
            if (r1 <= 0) goto L9a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " + "
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            goto Lad
        L9a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " - "
        La4:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            float r7 = r7 * r8
        Lad:
            r1 = 1065353216(0x3f800000, float:1.0)
            int r1 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r1 != 0) goto Lb9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            goto Lc6
        Lb9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " "
        Lc6:
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            r1 = 1
        Ld1:
            int r2 = r2 + 1
            goto L57
        Ld4:
            if (r1 != 0) goto Le7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = "0.0"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
        Le7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.a.b.e():java.lang.String");
    }

    @Override // a.e.a.e.a
    public i getKey() {
        return this.f102a;
    }

    public String toString() {
        return e();
    }
}
