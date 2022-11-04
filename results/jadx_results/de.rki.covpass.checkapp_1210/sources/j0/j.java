package j0;

import j0.b;
import java.util.Arrays;
/* loaded from: classes.dex */
public class j implements b.a {

    /* renamed from: n */
    private static float f13926n = 0.001f;

    /* renamed from: a */
    private final int f13927a = -1;

    /* renamed from: b */
    private int f13928b = 16;

    /* renamed from: c */
    private int f13929c = 16;

    /* renamed from: d */
    int[] f13930d = new int[16];

    /* renamed from: e */
    int[] f13931e = new int[16];

    /* renamed from: f */
    int[] f13932f = new int[16];

    /* renamed from: g */
    float[] f13933g = new float[16];

    /* renamed from: h */
    int[] f13934h = new int[16];

    /* renamed from: i */
    int[] f13935i = new int[16];

    /* renamed from: j */
    int f13936j = 0;

    /* renamed from: k */
    int f13937k = -1;

    /* renamed from: l */
    private final b f13938l;

    /* renamed from: m */
    protected final c f13939m;

    public j(b bVar, c cVar) {
        this.f13938l = bVar;
        this.f13939m = cVar;
        clear();
    }

    private void l(i iVar, int i10) {
        int[] iArr;
        int i11 = iVar.f13918q % this.f13929c;
        int[] iArr2 = this.f13930d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f13931e;
                if (iArr[i12] == -1) {
                    break;
                }
                i12 = iArr[i12];
            }
            iArr[i12] = i10;
        }
        this.f13931e[i10] = -1;
    }

    private void m(int i10, i iVar, float f10) {
        this.f13932f[i10] = iVar.f13918q;
        this.f13933g[i10] = f10;
        this.f13934h[i10] = -1;
        this.f13935i[i10] = -1;
        iVar.a(this.f13938l);
        iVar.f13911b4++;
        this.f13936j++;
    }

    private int n() {
        for (int i10 = 0; i10 < this.f13928b; i10++) {
            if (this.f13932f[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    private void o() {
        int i10 = this.f13928b * 2;
        this.f13932f = Arrays.copyOf(this.f13932f, i10);
        this.f13933g = Arrays.copyOf(this.f13933g, i10);
        this.f13934h = Arrays.copyOf(this.f13934h, i10);
        this.f13935i = Arrays.copyOf(this.f13935i, i10);
        this.f13931e = Arrays.copyOf(this.f13931e, i10);
        for (int i11 = this.f13928b; i11 < i10; i11++) {
            this.f13932f[i11] = -1;
            this.f13931e[i11] = -1;
        }
        this.f13928b = i10;
    }

    private void q(int i10, i iVar, float f10) {
        int n10 = n();
        m(n10, iVar, f10);
        if (i10 != -1) {
            this.f13934h[n10] = i10;
            int[] iArr = this.f13935i;
            iArr[n10] = iArr[i10];
            iArr[i10] = n10;
        } else {
            this.f13934h[n10] = -1;
            if (this.f13936j > 0) {
                this.f13935i[n10] = this.f13937k;
                this.f13937k = n10;
            } else {
                this.f13935i[n10] = -1;
            }
        }
        int[] iArr2 = this.f13935i;
        if (iArr2[n10] != -1) {
            this.f13934h[iArr2[n10]] = n10;
        }
        l(iVar, n10);
    }

    private void r(i iVar) {
        int[] iArr;
        int i10 = iVar.f13918q;
        int i11 = i10 % this.f13929c;
        int[] iArr2 = this.f13930d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            return;
        }
        if (this.f13932f[i12] == i10) {
            int[] iArr3 = this.f13931e;
            iArr2[i11] = iArr3[i12];
            iArr3[i12] = -1;
            return;
        }
        while (true) {
            iArr = this.f13931e;
            if (iArr[i12] == -1 || this.f13932f[iArr[i12]] == i10) {
                break;
            }
            i12 = iArr[i12];
        }
        int i13 = iArr[i12];
        if (i13 == -1 || this.f13932f[i13] != i10) {
            return;
        }
        iArr[i12] = iArr[i13];
        iArr[i13] = -1;
    }

    @Override // j0.b.a
    public float a(int i10) {
        int i11 = this.f13936j;
        int i12 = this.f13937k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f13933g[i12];
            }
            i12 = this.f13935i[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // j0.b.a
    public float b(b bVar, boolean z10) {
        float g10 = g(bVar.f13861a);
        c(bVar.f13861a, z10);
        j jVar = (j) bVar.f13865e;
        int e10 = jVar.e();
        int i10 = 0;
        int i11 = 0;
        while (i10 < e10) {
            int[] iArr = jVar.f13932f;
            if (iArr[i11] != -1) {
                f(this.f13939m.f13870d[iArr[i11]], jVar.f13933g[i11] * g10, z10);
                i10++;
            }
            i11++;
        }
        return g10;
    }

    @Override // j0.b.a
    public float c(i iVar, boolean z10) {
        int p10 = p(iVar);
        if (p10 == -1) {
            return 0.0f;
        }
        r(iVar);
        float f10 = this.f13933g[p10];
        if (this.f13937k == p10) {
            this.f13937k = this.f13935i[p10];
        }
        this.f13932f[p10] = -1;
        int[] iArr = this.f13934h;
        if (iArr[p10] != -1) {
            int[] iArr2 = this.f13935i;
            iArr2[iArr[p10]] = iArr2[p10];
        }
        int[] iArr3 = this.f13935i;
        if (iArr3[p10] != -1) {
            iArr[iArr3[p10]] = iArr[p10];
        }
        this.f13936j--;
        iVar.f13911b4--;
        if (z10) {
            iVar.g(this.f13938l);
        }
        return f10;
    }

    @Override // j0.b.a
    public void clear() {
        int i10 = this.f13936j;
        for (int i11 = 0; i11 < i10; i11++) {
            i h10 = h(i11);
            if (h10 != null) {
                h10.g(this.f13938l);
            }
        }
        for (int i12 = 0; i12 < this.f13928b; i12++) {
            this.f13932f[i12] = -1;
            this.f13931e[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f13929c; i13++) {
            this.f13930d[i13] = -1;
        }
        this.f13936j = 0;
        this.f13937k = -1;
    }

    @Override // j0.b.a
    public boolean d(i iVar) {
        return p(iVar) != -1;
    }

    @Override // j0.b.a
    public int e() {
        return this.f13936j;
    }

    @Override // j0.b.a
    public void f(i iVar, float f10, boolean z10) {
        float f11 = f13926n;
        if (f10 <= (-f11) || f10 >= f11) {
            int p10 = p(iVar);
            if (p10 == -1) {
                i(iVar, f10);
                return;
            }
            float[] fArr = this.f13933g;
            fArr[p10] = fArr[p10] + f10;
            float f12 = fArr[p10];
            float f13 = f13926n;
            if (f12 <= (-f13) || fArr[p10] >= f13) {
                return;
            }
            fArr[p10] = 0.0f;
            c(iVar, z10);
        }
    }

    @Override // j0.b.a
    public float g(i iVar) {
        int p10 = p(iVar);
        if (p10 != -1) {
            return this.f13933g[p10];
        }
        return 0.0f;
    }

    @Override // j0.b.a
    public i h(int i10) {
        int i11 = this.f13936j;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f13937k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f13939m.f13870d[this.f13932f[i12]];
            }
            i12 = this.f13935i[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // j0.b.a
    public void i(i iVar, float f10) {
        float f11 = f13926n;
        if (f10 > (-f11) && f10 < f11) {
            c(iVar, true);
            return;
        }
        if (this.f13936j == 0) {
            m(0, iVar, f10);
            l(iVar, 0);
            this.f13937k = 0;
            return;
        }
        int p10 = p(iVar);
        if (p10 != -1) {
            this.f13933g[p10] = f10;
            return;
        }
        if (this.f13936j + 1 >= this.f13928b) {
            o();
        }
        int i10 = this.f13936j;
        int i11 = this.f13937k;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            int[] iArr = this.f13932f;
            int i14 = iArr[i11];
            int i15 = iVar.f13918q;
            if (i14 == i15) {
                this.f13933g[i11] = f10;
                return;
            }
            if (iArr[i11] < i15) {
                i12 = i11;
            }
            i11 = this.f13935i[i11];
            if (i11 == -1) {
                break;
            }
        }
        q(i12, iVar, f10);
    }

    @Override // j0.b.a
    public void j(float f10) {
        int i10 = this.f13936j;
        int i11 = this.f13937k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f13933g;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f13935i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // j0.b.a
    public void k() {
        int i10 = this.f13936j;
        int i11 = this.f13937k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f13933g;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f13935i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    public int p(i iVar) {
        int[] iArr;
        if (this.f13936j != 0 && iVar != null) {
            int i10 = iVar.f13918q;
            int i11 = this.f13930d[i10 % this.f13929c];
            if (i11 == -1) {
                return -1;
            }
            if (this.f13932f[i11] == i10) {
                return i11;
            }
            while (true) {
                iArr = this.f13931e;
                if (iArr[i11] == -1 || this.f13932f[iArr[i11]] == i10) {
                    break;
                }
                i11 = iArr[i11];
            }
            if (iArr[i11] != -1 && this.f13932f[iArr[i11]] == i10) {
                return iArr[i11];
            }
        }
        return -1;
    }

    public String toString() {
        StringBuilder sb2;
        String str = hashCode() + " { ";
        int i10 = this.f13936j;
        for (int i11 = 0; i11 < i10; i11++) {
            i h10 = h(i11);
            if (h10 != null) {
                String str2 = str + h10 + " = " + a(i11) + " ";
                int p10 = p(h10);
                String str3 = str2 + "[p: ";
                if (this.f13934h[p10] != -1) {
                    sb2 = new StringBuilder();
                    sb2.append(str3);
                    sb2.append(this.f13939m.f13870d[this.f13932f[this.f13934h[p10]]]);
                } else {
                    sb2 = new StringBuilder();
                    sb2.append(str3);
                    sb2.append("none");
                }
                String str4 = sb2.toString() + ", n: ";
                str = (this.f13935i[p10] != -1 ? str4 + this.f13939m.f13870d[this.f13932f[this.f13935i[p10]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
