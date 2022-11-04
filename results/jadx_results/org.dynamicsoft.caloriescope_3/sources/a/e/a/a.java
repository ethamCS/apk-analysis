package a.e.a;

import a.e.a.i;
import java.util.Arrays;
/* loaded from: classes.dex */
public class a {

    /* renamed from: b */
    private final b f100b;

    /* renamed from: c */
    private final c f101c;

    /* renamed from: a */
    int f99a = 0;
    private int d = 8;
    private i e = null;
    private int[] f = new int[8];
    private int[] g = new int[8];
    private float[] h = new float[8];
    private int i = -1;
    private int j = -1;
    private boolean k = false;

    public a(b bVar, c cVar) {
        this.f100b = bVar;
        this.f101c = cVar;
    }

    private boolean a(i iVar, e eVar) {
        return iVar.j <= 1;
    }

    public final float a(i iVar, boolean z) {
        if (this.e == iVar) {
            this.e = null;
        }
        int i = this.i;
        if (i == -1) {
            return 0.0f;
        }
        int i2 = 0;
        int i3 = -1;
        while (i != -1 && i2 < this.f99a) {
            if (this.f[i] == iVar.f117b) {
                if (i == this.i) {
                    this.i = this.g[i];
                } else {
                    int[] iArr = this.g;
                    iArr[i3] = iArr[i];
                }
                if (z) {
                    iVar.b(this.f100b);
                }
                iVar.j--;
                this.f99a--;
                this.f[i] = -1;
                if (this.k) {
                    this.j = i;
                }
                return this.h[i];
            }
            i2++;
            i3 = i;
            i = this.g[i];
        }
        return 0.0f;
    }

    public final i a(int i) {
        int i2 = this.i;
        for (int i3 = 0; i2 != -1 && i3 < this.f99a; i3++) {
            if (i3 == i) {
                return this.f101c.f107c[this.f[i2]];
            }
            i2 = this.g[i2];
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0083 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a.e.a.i a(a.e.a.e r15) {
        /*
            r14 = this;
            int r0 = r14.i
            r1 = 0
            r2 = 0
            r3 = 0
            r2 = r1
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
        Lb:
            r9 = -1
            if (r0 == r9) goto L8a
            int r9 = r14.f99a
            if (r4 >= r9) goto L8a
            float[] r9 = r14.h
            r10 = r9[r0]
            r11 = 981668463(0x3a83126f, float:0.001)
            a.e.a.c r12 = r14.f101c
            a.e.a.i[] r12 = r12.f107c
            int[] r13 = r14.f
            r13 = r13[r0]
            r12 = r12[r13]
            int r13 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r13 >= 0) goto L31
            r11 = -1165815185(0xffffffffba83126f, float:-0.001)
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 <= 0) goto L3d
            r9[r0] = r3
            goto L37
        L31:
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 >= 0) goto L3d
            r9[r0] = r3
        L37:
            a.e.a.b r9 = r14.f100b
            r12.b(r9)
            r10 = 0
        L3d:
            r9 = 1
            int r11 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r11 == 0) goto L83
            a.e.a.i$a r11 = r12.g
            a.e.a.i$a r13 = a.e.a.i.a.UNRESTRICTED
            if (r11 != r13) goto L63
            if (r2 != 0) goto L52
        L4a:
            boolean r2 = r14.a(r12, r15)
            r5 = r2
            r7 = r10
            r2 = r12
            goto L83
        L52:
            int r11 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r11 <= 0) goto L57
            goto L4a
        L57:
            if (r5 != 0) goto L83
            boolean r11 = r14.a(r12, r15)
            if (r11 == 0) goto L83
            r7 = r10
            r2 = r12
            r5 = 1
            goto L83
        L63:
            if (r2 != 0) goto L83
            int r11 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r11 >= 0) goto L83
            if (r1 != 0) goto L73
        L6b:
            boolean r1 = r14.a(r12, r15)
            r6 = r1
            r8 = r10
            r1 = r12
            goto L83
        L73:
            int r11 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r11 <= 0) goto L78
            goto L6b
        L78:
            if (r6 != 0) goto L83
            boolean r11 = r14.a(r12, r15)
            if (r11 == 0) goto L83
            r8 = r10
            r1 = r12
            r6 = 1
        L83:
            int[] r9 = r14.g
            r0 = r9[r0]
            int r4 = r4 + 1
            goto Lb
        L8a:
            if (r2 == 0) goto L8d
            return r2
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.a.a.a(a.e.a.e):a.e.a.i");
    }

    public i a(boolean[] zArr, i iVar) {
        i.a aVar;
        int i = this.i;
        i iVar2 = null;
        float f = 0.0f;
        for (int i2 = 0; i != -1 && i2 < this.f99a; i2++) {
            if (this.h[i] < 0.0f) {
                i iVar3 = this.f101c.f107c[this.f[i]];
                if ((zArr == null || !zArr[iVar3.f117b]) && iVar3 != iVar && ((aVar = iVar3.g) == i.a.SLACK || aVar == i.a.ERROR)) {
                    float f2 = this.h[i];
                    if (f2 < f) {
                        iVar2 = iVar3;
                        f = f2;
                    }
                }
            }
            i = this.g[i];
        }
        return iVar2;
    }

    public final void a() {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.f99a; i2++) {
            i iVar = this.f101c.f107c[this.f[i]];
            if (iVar != null) {
                iVar.b(this.f100b);
            }
            i = this.g[i];
        }
        this.i = -1;
        this.j = -1;
        this.k = false;
        this.f99a = 0;
    }

    public void a(float f) {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.f99a; i2++) {
            float[] fArr = this.h;
            fArr[i] = fArr[i] / f;
            i = this.g[i];
        }
    }

    public final void a(b bVar, b bVar2, boolean z) {
        int i = this.i;
        while (true) {
            for (int i2 = 0; i != -1 && i2 < this.f99a; i2++) {
                int i3 = this.f[i];
                i iVar = bVar2.f102a;
                if (i3 == iVar.f117b) {
                    float f = this.h[i];
                    a(iVar, z);
                    a aVar = bVar2.d;
                    int i4 = aVar.i;
                    for (int i5 = 0; i4 != -1 && i5 < aVar.f99a; i5++) {
                        a(this.f101c.f107c[aVar.f[i4]], aVar.h[i4] * f, z);
                        i4 = aVar.g[i4];
                    }
                    bVar.f103b += bVar2.f103b * f;
                    if (z) {
                        bVar2.f102a.b(bVar);
                    }
                    i = this.i;
                } else {
                    i = this.g[i];
                }
            }
            return;
        }
    }

    public void a(b bVar, b[] bVarArr) {
        int i = this.i;
        while (true) {
            for (int i2 = 0; i != -1 && i2 < this.f99a; i2++) {
                i iVar = this.f101c.f107c[this.f[i]];
                if (iVar.f118c != -1) {
                    float f = this.h[i];
                    a(iVar, true);
                    b bVar2 = bVarArr[iVar.f118c];
                    if (!bVar2.e) {
                        a aVar = bVar2.d;
                        int i3 = aVar.i;
                        for (int i4 = 0; i3 != -1 && i4 < aVar.f99a; i4++) {
                            a(this.f101c.f107c[aVar.f[i3]], aVar.h[i3] * f, true);
                            i3 = aVar.g[i3];
                        }
                    }
                    bVar.f103b += bVar2.f103b * f;
                    bVar2.f102a.b(bVar);
                    i = this.i;
                } else {
                    i = this.g[i];
                }
            }
            return;
        }
    }

    public final void a(i iVar, float f) {
        if (f == 0.0f) {
            a(iVar, true);
            return;
        }
        int i = this.i;
        if (i == -1) {
            this.i = 0;
            this.h[0] = f;
            this.f[0] = iVar.f117b;
            this.g[0] = -1;
            iVar.j++;
            iVar.a(this.f100b);
            this.f99a++;
            if (this.k) {
                return;
            }
            int i2 = this.j + 1;
            this.j = i2;
            int[] iArr = this.f;
            if (i2 < iArr.length) {
                return;
            }
            this.k = true;
            this.j = iArr.length - 1;
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f99a; i4++) {
            int[] iArr2 = this.f;
            int i5 = iArr2[i];
            int i6 = iVar.f117b;
            if (i5 == i6) {
                this.h[i] = f;
                return;
            }
            if (iArr2[i] < i6) {
                i3 = i;
            }
            i = this.g[i];
        }
        int i7 = this.j;
        int i8 = i7 + 1;
        if (this.k) {
            int[] iArr3 = this.f;
            if (iArr3[i7] != -1) {
                i7 = iArr3.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr4 = this.f;
        if (i7 >= iArr4.length && this.f99a < iArr4.length) {
            int i9 = 0;
            while (true) {
                int[] iArr5 = this.f;
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
        int[] iArr6 = this.f;
        if (i7 >= iArr6.length) {
            i7 = iArr6.length;
            int i10 = this.d * 2;
            this.d = i10;
            this.k = false;
            this.j = i7 - 1;
            this.h = Arrays.copyOf(this.h, i10);
            this.f = Arrays.copyOf(this.f, this.d);
            this.g = Arrays.copyOf(this.g, this.d);
        }
        this.f[i7] = iVar.f117b;
        this.h[i7] = f;
        int[] iArr7 = this.g;
        if (i3 != -1) {
            iArr7[i7] = iArr7[i3];
            iArr7[i3] = i7;
        } else {
            iArr7[i7] = this.i;
            this.i = i7;
        }
        iVar.j++;
        iVar.a(this.f100b);
        this.f99a++;
        if (!this.k) {
            this.j++;
        }
        if (this.f99a >= this.f.length) {
            this.k = true;
        }
        int i11 = this.j;
        int[] iArr8 = this.f;
        if (i11 < iArr8.length) {
            return;
        }
        this.k = true;
        this.j = iArr8.length - 1;
    }

    public final void a(i iVar, float f, boolean z) {
        if (f == 0.0f) {
            return;
        }
        int i = this.i;
        if (i == -1) {
            this.i = 0;
            this.h[0] = f;
            this.f[0] = iVar.f117b;
            this.g[0] = -1;
            iVar.j++;
            iVar.a(this.f100b);
            this.f99a++;
            if (this.k) {
                return;
            }
            int i2 = this.j + 1;
            this.j = i2;
            int[] iArr = this.f;
            if (i2 < iArr.length) {
                return;
            }
            this.k = true;
            this.j = iArr.length - 1;
            return;
        }
        int i3 = -1;
        for (int i4 = 0; i != -1 && i4 < this.f99a; i4++) {
            int[] iArr2 = this.f;
            int i5 = iArr2[i];
            int i6 = iVar.f117b;
            if (i5 == i6) {
                float[] fArr = this.h;
                fArr[i] = fArr[i] + f;
                if (fArr[i] != 0.0f) {
                    return;
                }
                if (i == this.i) {
                    this.i = this.g[i];
                } else {
                    int[] iArr3 = this.g;
                    iArr3[i3] = iArr3[i];
                }
                if (z) {
                    iVar.b(this.f100b);
                }
                if (this.k) {
                    this.j = i;
                }
                iVar.j--;
                this.f99a--;
                return;
            }
            if (iArr2[i] < i6) {
                i3 = i;
            }
            i = this.g[i];
        }
        int i7 = this.j;
        int i8 = i7 + 1;
        if (this.k) {
            int[] iArr4 = this.f;
            if (iArr4[i7] != -1) {
                i7 = iArr4.length;
            }
        } else {
            i7 = i8;
        }
        int[] iArr5 = this.f;
        if (i7 >= iArr5.length && this.f99a < iArr5.length) {
            int i9 = 0;
            while (true) {
                int[] iArr6 = this.f;
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
        int[] iArr7 = this.f;
        if (i7 >= iArr7.length) {
            i7 = iArr7.length;
            int i10 = this.d * 2;
            this.d = i10;
            this.k = false;
            this.j = i7 - 1;
            this.h = Arrays.copyOf(this.h, i10);
            this.f = Arrays.copyOf(this.f, this.d);
            this.g = Arrays.copyOf(this.g, this.d);
        }
        this.f[i7] = iVar.f117b;
        this.h[i7] = f;
        int[] iArr8 = this.g;
        if (i3 != -1) {
            iArr8[i7] = iArr8[i3];
            iArr8[i3] = i7;
        } else {
            iArr8[i7] = this.i;
            this.i = i7;
        }
        iVar.j++;
        iVar.a(this.f100b);
        this.f99a++;
        if (!this.k) {
            this.j++;
        }
        int i11 = this.j;
        int[] iArr9 = this.f;
        if (i11 < iArr9.length) {
            return;
        }
        this.k = true;
        this.j = iArr9.length - 1;
    }

    public final boolean a(i iVar) {
        int i = this.i;
        if (i == -1) {
            return false;
        }
        for (int i2 = 0; i != -1 && i2 < this.f99a; i2++) {
            if (this.f[i] == iVar.f117b) {
                return true;
            }
            i = this.g[i];
        }
        return false;
    }

    public final float b(int i) {
        int i2 = this.i;
        for (int i3 = 0; i2 != -1 && i3 < this.f99a; i3++) {
            if (i3 == i) {
                return this.h[i2];
            }
            i2 = this.g[i2];
        }
        return 0.0f;
    }

    public final float b(i iVar) {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.f99a; i2++) {
            if (this.f[i] == iVar.f117b) {
                return this.h[i];
            }
            i = this.g[i];
        }
        return 0.0f;
    }

    public void b() {
        int i = this.i;
        for (int i2 = 0; i != -1 && i2 < this.f99a; i2++) {
            float[] fArr = this.h;
            fArr[i] = fArr[i] * (-1.0f);
            i = this.g[i];
        }
    }

    public String toString() {
        int i = this.i;
        String str = "";
        for (int i2 = 0; i != -1 && i2 < this.f99a; i2++) {
            str = ((str + " -> ") + this.h[i] + " : ") + this.f101c.f107c[this.f[i]];
            i = this.g[i];
        }
        return str;
    }
}
