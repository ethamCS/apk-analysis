package b.e.b;

import b.e.b.b;
import java.util.Arrays;
/* loaded from: classes.dex */
public class a implements b.a {
    private static float l = 0.001f;

    /* renamed from: b */
    private final b f2174b;

    /* renamed from: c */
    protected final c f2175c;

    /* renamed from: a */
    int f2173a = 0;

    /* renamed from: d */
    private int f2176d = 8;

    /* renamed from: e */
    private i f2177e = null;

    /* renamed from: f */
    private int[] f2178f = new int[8];

    /* renamed from: g */
    private int[] f2179g = new int[8];

    /* renamed from: h */
    private float[] f2180h = new float[8];
    private int i = -1;
    private int j = -1;
    private boolean k = false;

    public a(b bVar, c cVar) {
        this.f2174b = bVar;
        this.f2175c = cVar;
    }

    @Override // b.e.b.b.a
    public float a(int i) {
        int i2 = this.i;
        for (int i3 = 0; i2 != -1 && i3 < this.f2173a; i3++) {
            if (i3 == i) {
                return this.f2180h[i2];
            }
            i2 = this.f2179g[i2];
        }
        return 0.0f;
    }

    @Override // b.e.b.b.a
    public float b(b bVar, boolean z) {
        float g2 = g(bVar.f2181a);
        d(bVar.f2181a, z);
        b.a aVar = bVar.f2185e;
        int k = aVar.k();
        for (int i = 0; i < k; i++) {
            i f2 = aVar.f(i);
            e(f2, aVar.g(f2) * g2, z);
        }
        return g2;
    }

    @Override // b.e.b.b.a
    public final void c(i iVar, float f2) {
        if (f2 == 0.0f) {
            d(iVar, true);
            return;
        }
        int i = this.i;
        if (i == -1) {
            this.i = 0;
            this.f2180h[0] = f2;
            this.f2178f[0] = iVar.f2215c;
            this.f2179g[0] = -1;
            iVar.m++;
            iVar.a(this.f2174b);
            this.f2173a++;
            if (this.k) {
                return;
            }
            int i2 = this.j + 1;
            this.j = i2;
            int[] iArr = this.f2178f;
            if (i2 < iArr.length) {
                return;
            }
            this.k = true;
            this.j = iArr.length - 1;
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f2173a; i4++) {
            int[] iArr2 = this.f2178f;
            int i5 = iArr2[i];
            int i6 = iVar.f2215c;
            if (i5 == i6) {
                this.f2180h[i] = f2;
                return;
            }
            if (iArr2[i] < i6) {
                i3 = i;
            }
            i = this.f2179g[i];
        }
        int i7 = this.j;
        int i8 = i7 + 1;
        if (this.k) {
            int[] iArr3 = this.f2178f;
            if (iArr3[i7] != -1) {
                i7 = iArr3.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr4 = this.f2178f;
        if (i7 >= iArr4.length && this.f2173a < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.f2178f;
                if (i9 >= iArr5.length) {
                    break;
                } else if (iArr5[i9] == -1) {
                    i7 = i9;
                    break;
                } else {
                    i9++;
                }
            }
        }
        int[] iArr6 = this.f2178f;
        if (i7 >= iArr6.length) {
            i7 = iArr6.length;
            int i10 = this.f2176d * 2;
            this.f2176d = i10;
            this.k = false;
            this.j = i7 - 1;
            this.f2180h = Arrays.copyOf(this.f2180h, i10);
            this.f2178f = Arrays.copyOf(this.f2178f, this.f2176d);
            this.f2179g = Arrays.copyOf(this.f2179g, this.f2176d);
        }
        this.f2178f[i7] = iVar.f2215c;
        this.f2180h[i7] = f2;
        int[] iArr7 = this.f2179g;
        if (i3 != -1) {
            iArr7[i7] = iArr7[i3];
            iArr7[i3] = i7;
        } else {
            iArr7[i7] = this.i;
            this.i = i7;
        }
        iVar.m++;
        iVar.a(this.f2174b);
        int i11 = this.f2173a + 1;
        this.f2173a = i11;
        if (!this.k) {
            this.j++;
        }
        int[] iArr8 = this.f2178f;
        if (i11 >= iArr8.length) {
            this.k = true;
        }
        if (this.j < iArr8.length) {
            return;
        }
        this.k = true;
        this.j = iArr8.length - 1;
    }

    @Override // b.e.b.b.a
    public final void clear() {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.f2173a; i2++) {
            i iVar = this.f2175c.f2190d[this.f2178f[i]];
            if (iVar != null) {
                iVar.c(this.f2174b);
            }
            i = this.f2179g[i];
        }
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.f2173a = 0;
    }

    @Override // b.e.b.b.a
    public final float d(i iVar, boolean z) {
        if (this.f2177e == iVar) {
            this.f2177e = null;
        }
        int i = this.i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f2173a) {
            if (this.f2178f[i] == iVar.f2215c) {
                if (i == this.i) {
                    this.i = this.f2179g[i];
                } else {
                    int[] iArr = this.f2179g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    iVar.c(this.f2174b);
                }
                iVar.m--;
                this.f2173a--;
                this.f2178f[i] = -1;
                if (this.k) {
                    this.j = i;
                }
                return this.f2180h[i];
            }
            i2++;
            i3 = i;
            i = this.f2179g[i];
        }
        return 0.0f;
    }

    @Override // b.e.b.b.a
    public void e(i iVar, float f2, boolean z) {
        float f3 = l;
        if (f2 <= (-f3) || f2 >= f3) {
            int i = this.i;
            if (i == -1) {
                this.i = 0;
                this.f2180h[0] = f2;
                this.f2178f[0] = iVar.f2215c;
                this.f2179g[0] = -1;
                iVar.m++;
                iVar.a(this.f2174b);
                this.f2173a++;
                if (this.k) {
                    return;
                }
                int i2 = this.j + 1;
                this.j = i2;
                int[] iArr = this.f2178f;
                if (i2 < iArr.length) {
                    return;
                }
                this.k = true;
                this.j = iArr.length - 1;
                return;
            }
            int i3 = -1;
            for (int i4 = 0; i != -1 && i4 < this.f2173a; i4++) {
                int[] iArr2 = this.f2178f;
                int i5 = iArr2[i];
                int i6 = iVar.f2215c;
                if (i5 == i6) {
                    float[] fArr = this.f2180h;
                    float f4 = fArr[i] + f2;
                    float f5 = l;
                    if (f4 > (-f5) && f4 < f5) {
                        f4 = 0.0f;
                    }
                    fArr[i] = f4;
                    if (f4 != 0.0f) {
                        return;
                    }
                    if (i == this.i) {
                        this.i = this.f2179g[i];
                    } else {
                        int[] iArr3 = this.f2179g;
                        iArr3[i3] = iArr3[i];
                    }
                    if (z) {
                        iVar.c(this.f2174b);
                    }
                    if (this.k) {
                        this.j = i;
                    }
                    iVar.m--;
                    this.f2173a--;
                    return;
                }
                if (iArr2[i] < i6) {
                    i3 = i;
                }
                i = this.f2179g[i];
            }
            int i7 = this.j;
            int i8 = i7 + 1;
            if (this.k) {
                int[] iArr4 = this.f2178f;
                if (iArr4[i7] != -1) {
                    i7 = iArr4.length;
                }
            } else {
                i7 = i8;
            }
            int[] iArr5 = this.f2178f;
            if (i7 >= iArr5.length && this.f2173a < iArr5.length) {
                int i9 = 0;
                while (true) {
                    int[] iArr6 = this.f2178f;
                    if (i9 >= iArr6.length) {
                        break;
                    } else if (iArr6[i9] == -1) {
                        i7 = i9;
                        break;
                    } else {
                        i9++;
                    }
                }
            }
            int[] iArr7 = this.f2178f;
            if (i7 >= iArr7.length) {
                i7 = iArr7.length;
                int i10 = this.f2176d * 2;
                this.f2176d = i10;
                this.k = false;
                this.j = i7 - 1;
                this.f2180h = Arrays.copyOf(this.f2180h, i10);
                this.f2178f = Arrays.copyOf(this.f2178f, this.f2176d);
                this.f2179g = Arrays.copyOf(this.f2179g, this.f2176d);
            }
            this.f2178f[i7] = iVar.f2215c;
            this.f2180h[i7] = f2;
            int[] iArr8 = this.f2179g;
            if (i3 != -1) {
                iArr8[i7] = iArr8[i3];
                iArr8[i3] = i7;
            } else {
                iArr8[i7] = this.i;
                this.i = i7;
            }
            iVar.m++;
            iVar.a(this.f2174b);
            this.f2173a++;
            if (!this.k) {
                this.j++;
            }
            int i11 = this.j;
            int[] iArr9 = this.f2178f;
            if (i11 < iArr9.length) {
                return;
            }
            this.k = true;
            this.j = iArr9.length - 1;
        }
    }

    @Override // b.e.b.b.a
    public i f(int i) {
        int i2 = this.i;
        for (int i3 = 0; i2 != -1 && i3 < this.f2173a; i3++) {
            if (i3 == i) {
                return this.f2175c.f2190d[this.f2178f[i2]];
            }
            i2 = this.f2179g[i2];
        }
        return null;
    }

    @Override // b.e.b.b.a
    public final float g(i iVar) {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.f2173a; i2++) {
            if (this.f2178f[i] == iVar.f2215c) {
                return this.f2180h[i];
            }
            i = this.f2179g[i];
        }
        return 0.0f;
    }

    @Override // b.e.b.b.a
    public boolean h(i iVar) {
        int i = this.i;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f2173a; i2++) {
            if (this.f2178f[i] == iVar.f2215c) {
                return true;
            }
            i = this.f2179g[i];
        }
        return false;
    }

    @Override // b.e.b.b.a
    public void i(float f2) {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.f2173a; i2++) {
            float[] fArr = this.f2180h;
            fArr[i] = fArr[i] / f2;
            i = this.f2179g[i];
        }
    }

    @Override // b.e.b.b.a
    public void j() {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.f2173a; i2++) {
            float[] fArr = this.f2180h;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.f2179g[i];
        }
    }

    @Override // b.e.b.b.a
    public int k() {
        return this.f2173a;
    }

    public String toString() {
        int i = this.i;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f2173a; i2++) {
            str = ((str + " -> ") + this.f2180h[i] + " : ") + this.f2175c.f2190d[this.f2178f[i]];
            i = this.f2179g[i];
        }
        return str;
    }
}
