package t6;

import h6.m;
import h6.s;
import o6.b;
import o6.g;
import o6.i;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private final b f21928a;

    /* renamed from: b */
    private final p6.b f21929b;

    public a(b bVar) {
        this.f21928a = bVar;
        this.f21929b = new p6.b(bVar);
    }

    private s a(s[] sVarArr) {
        s sVar = sVarArr[0];
        s sVar2 = sVarArr[1];
        s sVar3 = sVarArr[2];
        s sVar4 = sVarArr[3];
        int j10 = j(sVar, sVar4);
        s h10 = h(sVar, sVar2, (j(sVar2, sVar4) + 1) << 2);
        s h11 = h(sVar3, sVar2, (j10 + 1) << 2);
        int j11 = j(h10, sVar4);
        int j12 = j(h11, sVar4);
        float f10 = j11 + 1;
        s sVar5 = new s(sVar4.c() + ((sVar3.c() - sVar2.c()) / f10), sVar4.d() + ((sVar3.d() - sVar2.d()) / f10));
        float f11 = j12 + 1;
        s sVar6 = new s(sVar4.c() + ((sVar.c() - sVar2.c()) / f11), sVar4.d() + ((sVar.d() - sVar2.d()) / f11));
        if (e(sVar5)) {
            return (e(sVar6) && j(h10, sVar5) + j(h11, sVar5) <= j(h10, sVar6) + j(h11, sVar6)) ? sVar6 : sVar5;
        } else if (!e(sVar6)) {
            return null;
        } else {
            return sVar6;
        }
    }

    private s[] c(s[] sVarArr) {
        s sVar = sVarArr[0];
        s sVar2 = sVarArr[1];
        s sVar3 = sVarArr[3];
        s sVar4 = sVarArr[2];
        int j10 = j(sVar, sVar2);
        int j11 = j(sVar2, sVar3);
        int j12 = j(sVar3, sVar4);
        int j13 = j(sVar4, sVar);
        s[] sVarArr2 = {sVar4, sVar, sVar2, sVar3};
        if (j10 > j11) {
            sVarArr2[0] = sVar;
            sVarArr2[1] = sVar2;
            sVarArr2[2] = sVar3;
            sVarArr2[3] = sVar4;
            j10 = j11;
        }
        if (j10 > j12) {
            sVarArr2[0] = sVar2;
            sVarArr2[1] = sVar3;
            sVarArr2[2] = sVar4;
            sVarArr2[3] = sVar;
        } else {
            j12 = j10;
        }
        if (j12 > j13) {
            sVarArr2[0] = sVar3;
            sVarArr2[1] = sVar4;
            sVarArr2[2] = sVar;
            sVarArr2[3] = sVar2;
        }
        return sVarArr2;
    }

    private s[] d(s[] sVarArr) {
        s sVar = sVarArr[0];
        s sVar2 = sVarArr[1];
        s sVar3 = sVarArr[2];
        s sVar4 = sVarArr[3];
        int j10 = (j(sVar, sVar4) + 1) << 2;
        if (j(h(sVar2, sVar3, j10), sVar) < j(h(sVar3, sVar2, j10), sVar4)) {
            sVarArr[0] = sVar;
            sVarArr[1] = sVar2;
            sVarArr[2] = sVar3;
            sVarArr[3] = sVar4;
        } else {
            sVarArr[0] = sVar2;
            sVarArr[1] = sVar3;
            sVarArr[2] = sVar4;
            sVarArr[3] = sVar;
        }
        return sVarArr;
    }

    private boolean e(s sVar) {
        return sVar.c() >= 0.0f && sVar.c() < ((float) this.f21928a.l()) && sVar.d() > 0.0f && sVar.d() < ((float) this.f21928a.i());
    }

    private static s f(s sVar, float f10, float f11) {
        float c10 = sVar.c();
        float d10 = sVar.d();
        return new s(c10 < f10 ? c10 - 1.0f : c10 + 1.0f, d10 < f11 ? d10 - 1.0f : d10 + 1.0f);
    }

    private static b g(b bVar, s sVar, s sVar2, s sVar3, s sVar4, int i10, int i11) {
        float f10 = i10 - 0.5f;
        float f11 = i11 - 0.5f;
        return i.b().c(bVar, i10, i11, 0.5f, 0.5f, f10, 0.5f, f10, f11, 0.5f, f11, sVar.c(), sVar.d(), sVar4.c(), sVar4.d(), sVar3.c(), sVar3.d(), sVar2.c(), sVar2.d());
    }

    private static s h(s sVar, s sVar2, int i10) {
        float f10 = i10 + 1;
        return new s(sVar.c() + ((sVar2.c() - sVar.c()) / f10), sVar.d() + ((sVar2.d() - sVar.d()) / f10));
    }

    private s[] i(s[] sVarArr) {
        s sVar = sVarArr[0];
        s sVar2 = sVarArr[1];
        s sVar3 = sVarArr[2];
        s sVar4 = sVarArr[3];
        s h10 = h(sVar, sVar2, (j(sVar3, sVar4) + 1) << 2);
        s h11 = h(sVar3, sVar2, (j(sVar, sVar4) + 1) << 2);
        int j10 = j(h10, sVar4) + 1;
        int j11 = j(h11, sVar4) + 1;
        if ((j10 & 1) == 1) {
            j10++;
        }
        if ((j11 & 1) == 1) {
            j11++;
        }
        float c10 = (((sVar.c() + sVar2.c()) + sVar3.c()) + sVar4.c()) / 4.0f;
        float d10 = (((sVar.d() + sVar2.d()) + sVar3.d()) + sVar4.d()) / 4.0f;
        s f10 = f(sVar, c10, d10);
        s f11 = f(sVar2, c10, d10);
        s f12 = f(sVar3, c10, d10);
        s f13 = f(sVar4, c10, d10);
        int i10 = j11 << 2;
        int i11 = j10 << 2;
        return new s[]{h(h(f10, f11, i10), f13, i11), h(h(f11, f10, i10), f12, i11), h(h(f12, f13, i10), f11, i11), h(h(f13, f12, i10), f10, i11)};
    }

    private int j(s sVar, s sVar2) {
        int c10 = (int) sVar.c();
        int d10 = (int) sVar.d();
        int c11 = (int) sVar2.c();
        int d11 = (int) sVar2.d();
        int i10 = 0;
        int i11 = 1;
        boolean z10 = Math.abs(d11 - d10) > Math.abs(c11 - c10);
        if (z10) {
            d10 = c10;
            c10 = d10;
            d11 = c11;
            c11 = d11;
        }
        int abs = Math.abs(c11 - c10);
        int abs2 = Math.abs(d11 - d10);
        int i12 = (-abs) / 2;
        int i13 = d10 < d11 ? 1 : -1;
        if (c10 >= c11) {
            i11 = -1;
        }
        boolean f10 = this.f21928a.f(z10 ? d10 : c10, z10 ? c10 : d10);
        while (c10 != c11) {
            boolean f11 = this.f21928a.f(z10 ? d10 : c10, z10 ? c10 : d10);
            if (f11 != f10) {
                i10++;
                f10 = f11;
            }
            i12 += abs2;
            if (i12 > 0) {
                if (d10 == d11) {
                    break;
                }
                d10 += i13;
                i12 -= abs;
            }
            c10 += i11;
        }
        return i10;
    }

    public g b() {
        int i10;
        int i11;
        s[] d10 = d(c(this.f21929b.c()));
        d10[3] = a(d10);
        if (d10[3] != null) {
            s[] i12 = i(d10);
            s sVar = i12[0];
            s sVar2 = i12[1];
            s sVar3 = i12[2];
            s sVar4 = i12[3];
            int j10 = j(sVar, sVar4) + 1;
            int j11 = j(sVar3, sVar4) + 1;
            if ((j10 & 1) == 1) {
                j10++;
            }
            if ((j11 & 1) == 1) {
                j11++;
            }
            if (j10 * 4 >= j11 * 7 || j11 * 4 >= j10 * 7) {
                i11 = j10;
                i10 = j11;
            } else {
                i11 = Math.max(j10, j11);
                i10 = i11;
            }
            return new g(g(this.f21928a, sVar, sVar2, sVar3, sVar4, i11, i10), new s[]{sVar, sVar2, sVar3, sVar4});
        }
        throw m.b();
    }
}
