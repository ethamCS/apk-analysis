package b.e.b;

import b.e.b.b;
import java.util.Arrays;
/* loaded from: classes.dex */
public class j implements b.a {
    private static float m = 0.001f;

    /* renamed from: a */
    private int f2227a = 16;

    /* renamed from: b */
    private int f2228b = 16;

    /* renamed from: c */
    int[] f2229c = new int[16];

    /* renamed from: d */
    int[] f2230d = new int[16];

    /* renamed from: e */
    int[] f2231e = new int[16];

    /* renamed from: f */
    float[] f2232f = new float[16];

    /* renamed from: g */
    int[] f2233g = new int[16];

    /* renamed from: h */
    int[] f2234h = new int[16];
    int i = 0;
    int j = -1;
    private final b k;
    protected final c l;

    public j(b bVar, c cVar) {
        this.k = bVar;
        this.l = cVar;
        clear();
    }

    private void l(i iVar, int i) {
        int[] iArr;
        int i2 = iVar.f2215c % this.f2228b;
        int[] iArr2 = this.f2229c;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            iArr2[i2] = i;
        } else {
            while (true) {
                iArr = this.f2230d;
                if (iArr[i3] == -1) {
                    break;
                }
                i3 = iArr[i3];
            }
            iArr[i3] = i;
        }
        this.f2230d[i] = -1;
    }

    private void m(int i, i iVar, float f2) {
        this.f2231e[i] = iVar.f2215c;
        this.f2232f[i] = f2;
        this.f2233g[i] = -1;
        this.f2234h[i] = -1;
        iVar.a(this.k);
        iVar.m++;
        this.i++;
    }

    private int n() {
        for (int i = 0; i < this.f2227a; i++) {
            if (this.f2231e[i] == -1) {
                return i;
            }
        }
        return -1;
    }

    private void o() {
        int i = this.f2227a * 2;
        this.f2231e = Arrays.copyOf(this.f2231e, i);
        this.f2232f = Arrays.copyOf(this.f2232f, i);
        this.f2233g = Arrays.copyOf(this.f2233g, i);
        this.f2234h = Arrays.copyOf(this.f2234h, i);
        this.f2230d = Arrays.copyOf(this.f2230d, i);
        for (int i2 = this.f2227a; i2 < i; i2++) {
            this.f2231e[i2] = -1;
            this.f2230d[i2] = -1;
        }
        this.f2227a = i;
    }

    private void q(int i, i iVar, float f2) {
        int n = n();
        m(n, iVar, f2);
        if (i != -1) {
            this.f2233g[n] = i;
            int[] iArr = this.f2234h;
            iArr[n] = iArr[i];
            iArr[i] = n;
        } else {
            this.f2233g[n] = -1;
            if (this.i > 0) {
                this.f2234h[n] = this.j;
                this.j = n;
            } else {
                this.f2234h[n] = -1;
            }
        }
        int[] iArr2 = this.f2234h;
        if (iArr2[n] != -1) {
            this.f2233g[iArr2[n]] = n;
        }
        l(iVar, n);
    }

    private void r(i iVar) {
        int[] iArr;
        int i = iVar.f2215c;
        int i2 = i % this.f2228b;
        int[] iArr2 = this.f2229c;
        int i3 = iArr2[i2];
        if (i3 == -1) {
            return;
        }
        if (this.f2231e[i3] == i) {
            int[] iArr3 = this.f2230d;
            iArr2[i2] = iArr3[i3];
            iArr3[i3] = -1;
            return;
        }
        while (true) {
            iArr = this.f2230d;
            if (iArr[i3] == -1 || this.f2231e[iArr[i3]] == i) {
                break;
            }
            i3 = iArr[i3];
        }
        int i4 = iArr[i3];
        if (i4 == -1 || this.f2231e[i4] != i) {
            return;
        }
        iArr[i3] = iArr[i4];
        iArr[i4] = -1;
    }

    @Override // b.e.b.b.a
    public float a(int i) {
        int i2 = this.i;
        int i3 = this.j;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i) {
                return this.f2232f[i3];
            }
            i3 = this.f2234h[i3];
            if (i3 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // b.e.b.b.a
    public float b(b bVar, boolean z) {
        float g2 = g(bVar.f2181a);
        d(bVar.f2181a, z);
        j jVar = (j) bVar.f2185e;
        int k = jVar.k();
        int i = jVar.j;
        int i2 = 0;
        int i3 = 0;
        while (i2 < k) {
            int[] iArr = jVar.f2231e;
            if (iArr[i3] != -1) {
                e(this.l.f2190d[iArr[i3]], jVar.f2232f[i3] * g2, z);
                i2++;
            }
            i3++;
        }
        return g2;
    }

    @Override // b.e.b.b.a
    public void c(i iVar, float f2) {
        float f3 = m;
        if (f2 > (-f3) && f2 < f3) {
            d(iVar, true);
            return;
        }
        if (this.i == 0) {
            m(0, iVar, f2);
            l(iVar, 0);
            this.j = 0;
            return;
        }
        int p = p(iVar);
        if (p != -1) {
            this.f2232f[p] = f2;
            return;
        }
        if (this.i + 1 >= this.f2227a) {
            o();
        }
        int i = this.i;
        int i2 = this.j;
        int i3 = -1;
        for (int i4 = 0; i4 < i; i4++) {
            int[] iArr = this.f2231e;
            int i5 = iArr[i2];
            int i6 = iVar.f2215c;
            if (i5 == i6) {
                this.f2232f[i2] = f2;
                return;
            }
            if (iArr[i2] < i6) {
                i3 = i2;
            }
            i2 = this.f2234h[i2];
            if (i2 == -1) {
                break;
            }
        }
        q(i3, iVar, f2);
    }

    @Override // b.e.b.b.a
    public void clear() {
        int i = this.i;
        for (int i2 = 0; i2 < i; i2++) {
            i f2 = f(i2);
            if (f2 != null) {
                f2.c(this.k);
            }
        }
        for (int i3 = 0; i3 < this.f2227a; i3++) {
            this.f2231e[i3] = -1;
            this.f2230d[i3] = -1;
        }
        for (int i4 = 0; i4 < this.f2228b; i4++) {
            this.f2229c[i4] = -1;
        }
        this.i = 0;
        this.j = -1;
    }

    @Override // b.e.b.b.a
    public float d(i iVar, boolean z) {
        int p = p(iVar);
        if (p == -1) {
            return 0.0f;
        }
        r(iVar);
        float f2 = this.f2232f[p];
        if (this.j == p) {
            this.j = this.f2234h[p];
        }
        this.f2231e[p] = -1;
        int[] iArr = this.f2233g;
        if (iArr[p] != -1) {
            int[] iArr2 = this.f2234h;
            iArr2[iArr[p]] = iArr2[p];
        }
        int[] iArr3 = this.f2234h;
        if (iArr3[p] != -1) {
            iArr[iArr3[p]] = iArr[p];
        }
        this.i--;
        iVar.m--;
        if (z) {
            iVar.c(this.k);
        }
        return f2;
    }

    @Override // b.e.b.b.a
    public void e(i iVar, float f2, boolean z) {
        float f3 = m;
        if (f2 <= (-f3) || f2 >= f3) {
            int p = p(iVar);
            if (p == -1) {
                c(iVar, f2);
                return;
            }
            float[] fArr = this.f2232f;
            fArr[p] = fArr[p] + f2;
            float f4 = fArr[p];
            float f5 = m;
            if (f4 <= (-f5) || fArr[p] >= f5) {
                return;
            }
            fArr[p] = 0.0f;
            d(iVar, z);
        }
    }

    @Override // b.e.b.b.a
    public i f(int i) {
        int i2 = this.i;
        if (i2 == 0) {
            return null;
        }
        int i3 = this.j;
        for (int i4 = 0; i4 < i2; i4++) {
            if (i4 == i && i3 != -1) {
                return this.l.f2190d[this.f2231e[i3]];
            }
            i3 = this.f2234h[i3];
            if (i3 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // b.e.b.b.a
    public float g(i iVar) {
        int p = p(iVar);
        if (p != -1) {
            return this.f2232f[p];
        }
        return 0.0f;
    }

    @Override // b.e.b.b.a
    public boolean h(i iVar) {
        return p(iVar) != -1;
    }

    @Override // b.e.b.b.a
    public void i(float f2) {
        int i = this.i;
        int i2 = this.j;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f2232f;
            fArr[i2] = fArr[i2] / f2;
            i2 = this.f2234h[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // b.e.b.b.a
    public void j() {
        int i = this.i;
        int i2 = this.j;
        for (int i3 = 0; i3 < i; i3++) {
            float[] fArr = this.f2232f;
            fArr[i2] = fArr[i2] * (-1.0f);
            i2 = this.f2234h[i2];
            if (i2 == -1) {
                return;
            }
        }
    }

    @Override // b.e.b.b.a
    public int k() {
        return this.i;
    }

    public int p(i iVar) {
        int[] iArr;
        if (this.i != 0 && iVar != null) {
            int i = iVar.f2215c;
            int i2 = this.f2229c[i % this.f2228b];
            if (i2 == -1) {
                return -1;
            }
            if (this.f2231e[i2] == i) {
                return i2;
            }
            while (true) {
                iArr = this.f2230d;
                if (iArr[i2] == -1 || this.f2231e[iArr[i2]] == i) {
                    break;
                }
                i2 = iArr[i2];
            }
            if (iArr[i2] != -1 && this.f2231e[iArr[i2]] == i) {
                return iArr[i2];
            }
        }
        return -1;
    }

    public String toString() {
        StringBuilder sb;
        String str = hashCode() + " { ";
        int i = this.i;
        for (int i2 = 0; i2 < i; i2++) {
            i f2 = f(i2);
            if (f2 != null) {
                String str2 = str + f2 + " = " + a(i2) + " ";
                int p = p(f2);
                String str3 = str2 + "[p: ";
                if (this.f2233g[p] != -1) {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append(this.l.f2190d[this.f2231e[this.f2233g[p]]]);
                } else {
                    sb = new StringBuilder();
                    sb.append(str3);
                    sb.append("none");
                }
                String str4 = sb.toString() + ", n: ";
                str = (this.f2234h[p] != -1 ? str4 + this.l.f2190d[this.f2231e[this.f2234h[p]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
