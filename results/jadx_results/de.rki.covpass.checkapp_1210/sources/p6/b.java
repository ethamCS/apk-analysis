package p6;

import h6.m;
import h6.s;
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    private final o6.b f18905a;

    /* renamed from: b */
    private final int f18906b;

    /* renamed from: c */
    private final int f18907c;

    /* renamed from: d */
    private final int f18908d;

    /* renamed from: e */
    private final int f18909e;

    /* renamed from: f */
    private final int f18910f;

    /* renamed from: g */
    private final int f18911g;

    public b(o6.b bVar) {
        this(bVar, 10, bVar.l() / 2, bVar.i() / 2);
    }

    public b(o6.b bVar, int i10, int i11, int i12) {
        this.f18905a = bVar;
        int i13 = bVar.i();
        this.f18906b = i13;
        int l10 = bVar.l();
        this.f18907c = l10;
        int i14 = i10 / 2;
        int i15 = i11 - i14;
        this.f18908d = i15;
        int i16 = i11 + i14;
        this.f18909e = i16;
        int i17 = i12 - i14;
        this.f18911g = i17;
        int i18 = i12 + i14;
        this.f18910f = i18;
        if (i17 < 0 || i15 < 0 || i18 >= i13 || i16 >= l10) {
            throw m.b();
        }
    }

    private s[] a(s sVar, s sVar2, s sVar3, s sVar4) {
        float c10 = sVar.c();
        float d10 = sVar.d();
        float c11 = sVar2.c();
        float d11 = sVar2.d();
        float c12 = sVar3.c();
        float d12 = sVar3.d();
        float c13 = sVar4.c();
        float d13 = sVar4.d();
        return c10 < ((float) this.f18907c) / 2.0f ? new s[]{new s(c13 - 1.0f, d13 + 1.0f), new s(c11 + 1.0f, d11 + 1.0f), new s(c12 - 1.0f, d12 - 1.0f), new s(c10 + 1.0f, d10 - 1.0f)} : new s[]{new s(c13 + 1.0f, d13 + 1.0f), new s(c11 + 1.0f, d11 - 1.0f), new s(c12 - 1.0f, d12 + 1.0f), new s(c10 - 1.0f, d10 - 1.0f)};
    }

    private boolean b(int i10, int i11, int i12, boolean z10) {
        if (z10) {
            while (i10 <= i11) {
                if (this.f18905a.f(i10, i12)) {
                    return true;
                }
                i10++;
            }
            return false;
        }
        while (i10 <= i11) {
            if (this.f18905a.f(i12, i10)) {
                return true;
            }
            i10++;
        }
        return false;
    }

    private s d(float f10, float f11, float f12, float f13) {
        int c10 = a.c(a.a(f10, f11, f12, f13));
        float f14 = c10;
        float f15 = (f12 - f10) / f14;
        float f16 = (f13 - f11) / f14;
        for (int i10 = 0; i10 < c10; i10++) {
            float f17 = i10;
            int c11 = a.c((f17 * f15) + f10);
            int c12 = a.c((f17 * f16) + f11);
            if (this.f18905a.f(c11, c12)) {
                return new s(c11, c12);
            }
        }
        return null;
    }

    public s[] c() {
        int i10 = this.f18908d;
        int i11 = this.f18909e;
        int i12 = this.f18911g;
        int i13 = this.f18910f;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = true;
        while (z15) {
            boolean z16 = false;
            boolean z17 = true;
            while (true) {
                if ((z17 || !z11) && i11 < this.f18907c) {
                    z17 = b(i12, i13, i11, false);
                    if (z17) {
                        i11++;
                        z11 = true;
                        z16 = true;
                    } else if (!z11) {
                        i11++;
                    }
                }
            }
            if (i11 < this.f18907c) {
                boolean z18 = true;
                while (true) {
                    if ((z18 || !z12) && i13 < this.f18906b) {
                        z18 = b(i10, i11, i13, true);
                        if (z18) {
                            i13++;
                            z12 = true;
                            z16 = true;
                        } else if (!z12) {
                            i13++;
                        }
                    }
                }
                if (i13 < this.f18906b) {
                    boolean z19 = true;
                    while (true) {
                        if ((z19 || !z13) && i10 >= 0) {
                            z19 = b(i12, i13, i10, false);
                            if (z19) {
                                i10--;
                                z13 = true;
                                z16 = true;
                            } else if (!z13) {
                                i10--;
                            }
                        }
                    }
                    if (i10 >= 0) {
                        z15 = z16;
                        boolean z20 = true;
                        while (true) {
                            if ((z20 || !z14) && i12 >= 0) {
                                z20 = b(i10, i11, i12, true);
                                if (z20) {
                                    i12--;
                                    z15 = true;
                                    z14 = true;
                                } else if (!z14) {
                                    i12--;
                                }
                            }
                        }
                        if (i12 < 0) {
                        }
                    }
                }
            }
            z10 = true;
            break;
        }
        if (!z10) {
            int i14 = i11 - i10;
            s sVar = null;
            s sVar2 = null;
            for (int i15 = 1; sVar2 == null && i15 < i14; i15++) {
                sVar2 = d(i10, i13 - i15, i10 + i15, i13);
            }
            if (sVar2 == null) {
                throw m.b();
            }
            s sVar3 = null;
            for (int i16 = 1; sVar3 == null && i16 < i14; i16++) {
                sVar3 = d(i10, i12 + i16, i10 + i16, i12);
            }
            if (sVar3 == null) {
                throw m.b();
            }
            s sVar4 = null;
            for (int i17 = 1; sVar4 == null && i17 < i14; i17++) {
                sVar4 = d(i11, i12 + i17, i11 - i17, i12);
            }
            if (sVar4 == null) {
                throw m.b();
            }
            for (int i18 = 1; sVar == null && i18 < i14; i18++) {
                sVar = d(i11, i13 - i18, i11 - i18, i13);
            }
            if (sVar == null) {
                throw m.b();
            }
            return a(sVar, sVar2, sVar4, sVar3);
        }
        throw m.b();
    }
}
