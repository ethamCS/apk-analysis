package j0;

import j0.b;
import java.util.Arrays;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public class a implements b.a {

    /* renamed from: l */
    private static float f13849l = 0.001f;

    /* renamed from: b */
    private final b f13851b;

    /* renamed from: c */
    protected final c f13852c;

    /* renamed from: a */
    int f13850a = 0;

    /* renamed from: d */
    private int f13853d = 8;

    /* renamed from: e */
    private i f13854e = null;

    /* renamed from: f */
    private int[] f13855f = new int[8];

    /* renamed from: g */
    private int[] f13856g = new int[8];

    /* renamed from: h */
    private float[] f13857h = new float[8];

    /* renamed from: i */
    private int f13858i = -1;

    /* renamed from: j */
    private int f13859j = -1;

    /* renamed from: k */
    private boolean f13860k = false;

    public a(b bVar, c cVar) {
        this.f13851b = bVar;
        this.f13852c = cVar;
    }

    @Override // j0.b.a
    public float a(int i10) {
        int i11 = this.f13858i;
        for (int i12 = 0; i11 != -1 && i12 < this.f13850a; i12++) {
            if (i12 == i10) {
                return this.f13857h[i11];
            }
            i11 = this.f13856g[i11];
        }
        return 0.0f;
    }

    @Override // j0.b.a
    public float b(b bVar, boolean z10) {
        float g10 = g(bVar.f13861a);
        c(bVar.f13861a, z10);
        b.a aVar = bVar.f13865e;
        int e10 = aVar.e();
        for (int i10 = 0; i10 < e10; i10++) {
            i h10 = aVar.h(i10);
            f(h10, aVar.g(h10) * g10, z10);
        }
        return g10;
    }

    @Override // j0.b.a
    public final float c(i iVar, boolean z10) {
        if (this.f13854e == iVar) {
            this.f13854e = null;
        }
        int i10 = this.f13858i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f13850a) {
            if (this.f13855f[i10] == iVar.f13918q) {
                if (i10 == this.f13858i) {
                    this.f13858i = this.f13856g[i10];
                } else {
                    int[] iArr = this.f13856g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    iVar.g(this.f13851b);
                }
                iVar.f13911b4--;
                this.f13850a--;
                this.f13855f[i10] = -1;
                if (this.f13860k) {
                    this.f13859j = i10;
                }
                return this.f13857h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f13856g[i10];
        }
        return 0.0f;
    }

    @Override // j0.b.a
    public final void clear() {
        int i10 = this.f13858i;
        for (int i11 = 0; i10 != -1 && i11 < this.f13850a; i11++) {
            i iVar = this.f13852c.f13870d[this.f13855f[i10]];
            if (iVar != null) {
                iVar.g(this.f13851b);
            }
            i10 = this.f13856g[i10];
        }
        this.f13858i = -1;
        this.f13859j = -1;
        this.f13860k = false;
        this.f13850a = 0;
    }

    @Override // j0.b.a
    public boolean d(i iVar) {
        int i10 = this.f13858i;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f13850a; i11++) {
            if (this.f13855f[i10] == iVar.f13918q) {
                return true;
            }
            i10 = this.f13856g[i10];
        }
        return false;
    }

    @Override // j0.b.a
    public int e() {
        return this.f13850a;
    }

    @Override // j0.b.a
    public void f(i iVar, float f10, boolean z10) {
        float f11 = f13849l;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f13858i;
            if (i10 == -1) {
                this.f13858i = 0;
                this.f13857h[0] = f10;
                this.f13855f[0] = iVar.f13918q;
                this.f13856g[0] = -1;
                iVar.f13911b4++;
                iVar.a(this.f13851b);
                this.f13850a++;
                if (this.f13860k) {
                    return;
                }
                int i11 = this.f13859j + 1;
                this.f13859j = i11;
                int[] iArr = this.f13855f;
                if (i11 < iArr.length) {
                    return;
                }
                this.f13860k = true;
                this.f13859j = iArr.length - 1;
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f13850a; i13++) {
                int[] iArr2 = this.f13855f;
                int i14 = iArr2[i10];
                int i15 = iVar.f13918q;
                if (i14 == i15) {
                    float[] fArr = this.f13857h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f13849l;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 != 0.0f) {
                        return;
                    }
                    if (i10 == this.f13858i) {
                        this.f13858i = this.f13856g[i10];
                    } else {
                        int[] iArr3 = this.f13856g;
                        iArr3[i12] = iArr3[i10];
                    }
                    if (z10) {
                        iVar.g(this.f13851b);
                    }
                    if (this.f13860k) {
                        this.f13859j = i10;
                    }
                    iVar.f13911b4--;
                    this.f13850a--;
                    return;
                }
                if (iArr2[i10] < i15) {
                    i12 = i10;
                }
                i10 = this.f13856g[i10];
            }
            int i16 = this.f13859j;
            int i17 = i16 + 1;
            if (this.f13860k) {
                int[] iArr4 = this.f13855f;
                if (iArr4[i16] != -1) {
                    i16 = iArr4.length;
                }
            } else {
                i16 = i17;
            }
            int[] iArr5 = this.f13855f;
            if (i16 >= iArr5.length && this.f13850a < iArr5.length) {
                int i18 = 0;
                while (true) {
                    int[] iArr6 = this.f13855f;
                    if (i18 >= iArr6.length) {
                        break;
                    } else if (iArr6[i18] == -1) {
                        i16 = i18;
                        break;
                    } else {
                        i18++;
                    }
                }
            }
            int[] iArr7 = this.f13855f;
            if (i16 >= iArr7.length) {
                i16 = iArr7.length;
                int i19 = this.f13853d * 2;
                this.f13853d = i19;
                this.f13860k = false;
                this.f13859j = i16 - 1;
                this.f13857h = Arrays.copyOf(this.f13857h, i19);
                this.f13855f = Arrays.copyOf(this.f13855f, this.f13853d);
                this.f13856g = Arrays.copyOf(this.f13856g, this.f13853d);
            }
            this.f13855f[i16] = iVar.f13918q;
            this.f13857h[i16] = f10;
            int[] iArr8 = this.f13856g;
            if (i12 != -1) {
                iArr8[i16] = iArr8[i12];
                iArr8[i12] = i16;
            } else {
                iArr8[i16] = this.f13858i;
                this.f13858i = i16;
            }
            iVar.f13911b4++;
            iVar.a(this.f13851b);
            this.f13850a++;
            if (!this.f13860k) {
                this.f13859j++;
            }
            int i20 = this.f13859j;
            int[] iArr9 = this.f13855f;
            if (i20 < iArr9.length) {
                return;
            }
            this.f13860k = true;
            this.f13859j = iArr9.length - 1;
        }
    }

    @Override // j0.b.a
    public final float g(i iVar) {
        int i10 = this.f13858i;
        for (int i11 = 0; i10 != -1 && i11 < this.f13850a; i11++) {
            if (this.f13855f[i10] == iVar.f13918q) {
                return this.f13857h[i10];
            }
            i10 = this.f13856g[i10];
        }
        return 0.0f;
    }

    @Override // j0.b.a
    public i h(int i10) {
        int i11 = this.f13858i;
        for (int i12 = 0; i11 != -1 && i12 < this.f13850a; i12++) {
            if (i12 == i10) {
                return this.f13852c.f13870d[this.f13855f[i11]];
            }
            i11 = this.f13856g[i11];
        }
        return null;
    }

    @Override // j0.b.a
    public final void i(i iVar, float f10) {
        if (f10 == 0.0f) {
            c(iVar, true);
            return;
        }
        int i10 = this.f13858i;
        if (i10 == -1) {
            this.f13858i = 0;
            this.f13857h[0] = f10;
            this.f13855f[0] = iVar.f13918q;
            this.f13856g[0] = -1;
            iVar.f13911b4++;
            iVar.a(this.f13851b);
            this.f13850a++;
            if (this.f13860k) {
                return;
            }
            int i11 = this.f13859j + 1;
            this.f13859j = i11;
            int[] iArr = this.f13855f;
            if (i11 < iArr.length) {
                return;
            }
            this.f13860k = true;
            this.f13859j = iArr.length - 1;
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f13850a; i13++) {
            int[] iArr2 = this.f13855f;
            int i14 = iArr2[i10];
            int i15 = iVar.f13918q;
            if (i14 == i15) {
                this.f13857h[i10] = f10;
                return;
            }
            if (iArr2[i10] < i15) {
                i12 = i10;
            }
            i10 = this.f13856g[i10];
        }
        int i16 = this.f13859j;
        int i17 = i16 + 1;
        if (this.f13860k) {
            int[] iArr3 = this.f13855f;
            if (iArr3[i16] != -1) {
                i16 = iArr3.length;
            }
        } else {
            i16 = i17;
        }
        int[] iArr4 = this.f13855f;
        if (i16 >= iArr4.length && this.f13850a < iArr4.length) {
            int i18 = 0;
            while (true) {
                int[] iArr5 = this.f13855f;
                if (i18 >= iArr5.length) {
                    break;
                } else if (iArr5[i18] == -1) {
                    i16 = i18;
                    break;
                } else {
                    i18++;
                }
            }
        }
        int[] iArr6 = this.f13855f;
        if (i16 >= iArr6.length) {
            i16 = iArr6.length;
            int i19 = this.f13853d * 2;
            this.f13853d = i19;
            this.f13860k = false;
            this.f13859j = i16 - 1;
            this.f13857h = Arrays.copyOf(this.f13857h, i19);
            this.f13855f = Arrays.copyOf(this.f13855f, this.f13853d);
            this.f13856g = Arrays.copyOf(this.f13856g, this.f13853d);
        }
        this.f13855f[i16] = iVar.f13918q;
        this.f13857h[i16] = f10;
        int[] iArr7 = this.f13856g;
        if (i12 != -1) {
            iArr7[i16] = iArr7[i12];
            iArr7[i12] = i16;
        } else {
            iArr7[i16] = this.f13858i;
            this.f13858i = i16;
        }
        iVar.f13911b4++;
        iVar.a(this.f13851b);
        int i20 = this.f13850a + 1;
        this.f13850a = i20;
        if (!this.f13860k) {
            this.f13859j++;
        }
        int[] iArr8 = this.f13855f;
        if (i20 >= iArr8.length) {
            this.f13860k = true;
        }
        if (this.f13859j < iArr8.length) {
            return;
        }
        this.f13860k = true;
        this.f13859j = iArr8.length - 1;
    }

    @Override // j0.b.a
    public void j(float f10) {
        int i10 = this.f13858i;
        for (int i11 = 0; i10 != -1 && i11 < this.f13850a; i11++) {
            float[] fArr = this.f13857h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f13856g[i10];
        }
    }

    @Override // j0.b.a
    public void k() {
        int i10 = this.f13858i;
        for (int i11 = 0; i10 != -1 && i11 < this.f13850a; i11++) {
            float[] fArr = this.f13857h;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f13856g[i10];
        }
    }

    public String toString() {
        int i10 = this.f13858i;
        String str = BuildConfig.FLAVOR;
        for (int i11 = 0; i10 != -1 && i11 < this.f13850a; i11++) {
            str = ((str + " -> ") + this.f13857h[i10] + " : ") + this.f13852c.f13870d[this.f13855f[i10]];
            i10 = this.f13856g[i10];
        }
        return str;
    }
}
