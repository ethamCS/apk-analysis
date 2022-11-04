package a.e.a;

import a.e.a.i;
import a.e.a.j.e;
import java.util.Arrays;
import java.util.HashMap;
/* loaded from: classes.dex */
public class e {
    private static int p = 1000;
    public static f q;

    /* renamed from: c */
    private a f110c;
    b[] f;
    final c l;
    private final a o;

    /* renamed from: a */
    int f108a = 0;

    /* renamed from: b */
    private HashMap<String, i> f109b = null;
    private int d = 32;
    private int e = 32;
    public boolean g = false;
    private boolean[] h = new boolean[32];
    int i = 1;
    int j = 0;
    private int k = 32;
    private i[] m = new i[p];
    private int n = 0;

    /* loaded from: classes.dex */
    public interface a {
        i a(e eVar, boolean[] zArr);

        void a(a aVar);

        void a(i iVar);

        void clear();

        i getKey();
    }

    public e() {
        this.f = null;
        this.f = new b[32];
        j();
        c cVar = new c();
        this.l = cVar;
        this.f110c = new d(cVar);
        this.o = new b(this.l);
    }

    private final int a(a aVar, boolean z) {
        f fVar = q;
        if (fVar != null) {
            fVar.h++;
        }
        for (int i = 0; i < this.i; i++) {
            this.h[i] = false;
        }
        boolean z2 = false;
        int i2 = 0;
        while (!z2) {
            f fVar2 = q;
            if (fVar2 != null) {
                fVar2.i++;
            }
            i2++;
            if (i2 >= this.i * 2) {
                return i2;
            }
            if (aVar.getKey() != null) {
                this.h[aVar.getKey().f117b] = true;
            }
            i a2 = aVar.a(this, this.h);
            if (a2 != null) {
                boolean[] zArr = this.h;
                int i3 = a2.f117b;
                if (zArr[i3]) {
                    return i2;
                }
                zArr[i3] = true;
            }
            if (a2 != null) {
                float f = Float.MAX_VALUE;
                int i4 = -1;
                for (int i5 = 0; i5 < this.j; i5++) {
                    b bVar = this.f[i5];
                    if (bVar.f102a.g != i.a.UNRESTRICTED && !bVar.e && bVar.b(a2)) {
                        float b2 = bVar.d.b(a2);
                        if (b2 < 0.0f) {
                            float f2 = (-bVar.f103b) / b2;
                            if (f2 < f) {
                                i4 = i5;
                                f = f2;
                            }
                        }
                    }
                }
                if (i4 > -1) {
                    b bVar2 = this.f[i4];
                    bVar2.f102a.f118c = -1;
                    f fVar3 = q;
                    if (fVar3 != null) {
                        fVar3.j++;
                    }
                    bVar2.d(a2);
                    i iVar = bVar2.f102a;
                    iVar.f118c = i4;
                    iVar.c(bVar2);
                }
            }
            z2 = true;
        }
        return i2;
    }

    public static b a(e eVar, i iVar, i iVar2, i iVar3, float f, boolean z) {
        b b2 = eVar.b();
        if (z) {
            eVar.b(b2);
        }
        b2.a(iVar, iVar2, iVar3, f);
        return b2;
    }

    private i a(i.a aVar, String str) {
        i a2 = this.l.f106b.a();
        if (a2 == null) {
            a2 = new i(aVar, str);
        } else {
            a2.a();
        }
        a2.a(aVar, str);
        int i = this.n;
        int i2 = p;
        if (i >= i2) {
            int i3 = i2 * 2;
            p = i3;
            this.m = (i[]) Arrays.copyOf(this.m, i3);
        }
        i[] iVarArr = this.m;
        int i4 = this.n;
        this.n = i4 + 1;
        iVarArr[i4] = a2;
        return a2;
    }

    private int b(a aVar) {
        float f;
        boolean z;
        int i = 0;
        while (true) {
            f = 0.0f;
            if (i >= this.j) {
                z = false;
                break;
            }
            b[] bVarArr = this.f;
            if (bVarArr[i].f102a.g != i.a.UNRESTRICTED && bVarArr[i].f103b < 0.0f) {
                z = true;
                break;
            }
            i++;
        }
        if (z) {
            boolean z2 = false;
            int i2 = 0;
            while (!z2) {
                f fVar = q;
                if (fVar != null) {
                    fVar.k++;
                }
                i2++;
                float f2 = Float.MAX_VALUE;
                int i3 = 0;
                int i4 = -1;
                int i5 = -1;
                int i6 = 0;
                while (i3 < this.j) {
                    b bVar = this.f[i3];
                    if (bVar.f102a.g != i.a.UNRESTRICTED && !bVar.e && bVar.f103b < f) {
                        int i7 = 1;
                        while (i7 < this.i) {
                            i iVar = this.l.f107c[i7];
                            float b2 = bVar.d.b(iVar);
                            if (b2 > f) {
                                for (int i8 = 0; i8 < 7; i8++) {
                                    float f3 = iVar.f[i8] / b2;
                                    if ((f3 < f2 && i8 == i6) || i8 > i6) {
                                        i5 = i7;
                                        i6 = i8;
                                        f2 = f3;
                                        i4 = i3;
                                    }
                                }
                            }
                            i7++;
                            f = 0.0f;
                        }
                    }
                    i3++;
                    f = 0.0f;
                }
                if (i4 != -1) {
                    b bVar2 = this.f[i4];
                    bVar2.f102a.f118c = -1;
                    f fVar2 = q;
                    if (fVar2 != null) {
                        fVar2.j++;
                    }
                    bVar2.d(this.l.f107c[i5]);
                    i iVar2 = bVar2.f102a;
                    iVar2.f118c = i4;
                    iVar2.c(bVar2);
                } else {
                    z2 = true;
                }
                if (i2 > this.i / 2) {
                    z2 = true;
                }
                f = 0.0f;
            }
            return i2;
        }
        return 0;
    }

    private void b(b bVar) {
        bVar.a(this, 0);
    }

    private final void c(b bVar) {
        b[] bVarArr = this.f;
        int i = this.j;
        if (bVarArr[i] != null) {
            this.l.f105a.a(bVarArr[i]);
        }
        b[] bVarArr2 = this.f;
        int i2 = this.j;
        bVarArr2[i2] = bVar;
        i iVar = bVar.f102a;
        iVar.f118c = i2;
        this.j = i2 + 1;
        iVar.c(bVar);
    }

    private final void d(b bVar) {
        if (this.j > 0) {
            bVar.d.a(bVar, this.f);
            if (bVar.d.f99a != 0) {
                return;
            }
            bVar.e = true;
        }
    }

    private void g() {
        for (int i = 0; i < this.j; i++) {
            b bVar = this.f[i];
            bVar.f102a.e = bVar.f103b;
        }
    }

    public static f h() {
        return q;
    }

    private void i() {
        int i = this.d * 2;
        this.d = i;
        this.f = (b[]) Arrays.copyOf(this.f, i);
        c cVar = this.l;
        cVar.f107c = (i[]) Arrays.copyOf(cVar.f107c, this.d);
        int i2 = this.d;
        this.h = new boolean[i2];
        this.e = i2;
        this.k = i2;
        f fVar = q;
        if (fVar != null) {
            fVar.d++;
            fVar.o = Math.max(fVar.o, i2);
            f fVar2 = q;
            fVar2.A = fVar2.o;
        }
    }

    private void j() {
        int i = 0;
        while (true) {
            b[] bVarArr = this.f;
            if (i < bVarArr.length) {
                b bVar = bVarArr[i];
                if (bVar != null) {
                    this.l.f105a.a(bVar);
                }
                this.f[i] = null;
                i++;
            } else {
                return;
            }
        }
    }

    public b a(i iVar, i iVar2, int i, int i2) {
        b b2 = b();
        b2.a(iVar, iVar2, i);
        if (i2 != 6) {
            b2.a(this, i2);
        }
        a(b2);
        return b2;
    }

    public i a() {
        f fVar = q;
        if (fVar != null) {
            fVar.n++;
        }
        if (this.i + 1 >= this.e) {
            i();
        }
        i a2 = a(i.a.SLACK, (String) null);
        int i = this.f108a + 1;
        this.f108a = i;
        this.i++;
        a2.f117b = i;
        this.l.f107c[i] = a2;
        return a2;
    }

    public i a(int i, String str) {
        f fVar = q;
        if (fVar != null) {
            fVar.l++;
        }
        if (this.i + 1 >= this.e) {
            i();
        }
        i a2 = a(i.a.ERROR, str);
        int i2 = this.f108a + 1;
        this.f108a = i2;
        this.i++;
        a2.f117b = i2;
        a2.d = i;
        this.l.f107c[i2] = a2;
        this.f110c.a(a2);
        return a2;
    }

    public i a(Object obj) {
        i iVar = null;
        if (obj == null) {
            return null;
        }
        if (this.i + 1 >= this.e) {
            i();
        }
        if (obj instanceof a.e.a.j.e) {
            a.e.a.j.e eVar = (a.e.a.j.e) obj;
            iVar = eVar.e();
            if (iVar == null) {
                eVar.a(this.l);
                iVar = eVar.e();
            }
            int i = iVar.f117b;
            if (i == -1 || i > this.f108a || this.l.f107c[i] == null) {
                if (iVar.f117b != -1) {
                    iVar.a();
                }
                int i2 = this.f108a + 1;
                this.f108a = i2;
                this.i++;
                iVar.f117b = i2;
                iVar.g = i.a.UNRESTRICTED;
                this.l.f107c[i2] = iVar;
            }
        }
        return iVar;
    }

    public void a(b bVar) {
        i c2;
        if (bVar == null) {
            return;
        }
        f fVar = q;
        if (fVar != null) {
            fVar.f++;
            if (bVar.e) {
                fVar.g++;
            }
        }
        boolean z = true;
        if (this.j + 1 >= this.k || this.i + 1 >= this.e) {
            i();
        }
        boolean z2 = false;
        if (!bVar.e) {
            d(bVar);
            if (bVar.c()) {
                return;
            }
            bVar.a();
            if (bVar.a(this)) {
                i a2 = a();
                bVar.f102a = a2;
                c(bVar);
                this.o.a(bVar);
                a(this.o, true);
                if (a2.f118c == -1) {
                    if (bVar.f102a == a2 && (c2 = bVar.c(a2)) != null) {
                        f fVar2 = q;
                        if (fVar2 != null) {
                            fVar2.j++;
                        }
                        bVar.d(c2);
                    }
                    if (!bVar.e) {
                        bVar.f102a.c(bVar);
                    }
                    this.j--;
                }
            } else {
                z = false;
            }
            if (!bVar.b()) {
                return;
            }
            z2 = z;
        }
        if (z2) {
            return;
        }
        c(bVar);
    }

    void a(b bVar, int i, int i2) {
        bVar.a(a(i2, (String) null), i);
    }

    void a(a aVar) {
        f fVar = q;
        if (fVar != null) {
            fVar.s++;
            fVar.t = Math.max(fVar.t, this.i);
            f fVar2 = q;
            fVar2.u = Math.max(fVar2.u, this.j);
        }
        d((b) aVar);
        b(aVar);
        a(aVar, false);
        g();
    }

    public void a(i iVar, int i) {
        b bVar;
        int i2 = iVar.f118c;
        if (i2 != -1) {
            b bVar2 = this.f[i2];
            if (!bVar2.e) {
                if (bVar2.d.f99a == 0) {
                    bVar2.e = true;
                } else {
                    bVar = b();
                    bVar.c(iVar, i);
                }
            }
            bVar2.f103b = i;
            return;
        }
        bVar = b();
        bVar.b(iVar, i);
        a(bVar);
    }

    public void a(i iVar, i iVar2, int i, float f, i iVar3, i iVar4, int i2, int i3) {
        b b2 = b();
        b2.a(iVar, iVar2, i, f, iVar3, iVar4, i2);
        if (i3 != 6) {
            b2.a(this, i3);
        }
        a(b2);
    }

    public void a(i iVar, i iVar2, i iVar3, i iVar4, float f, int i) {
        b b2 = b();
        b2.a(iVar, iVar2, iVar3, iVar4, f);
        if (i != 6) {
            b2.a(this, i);
        }
        a(b2);
    }

    public void a(i iVar, i iVar2, boolean z) {
        b b2 = b();
        i c2 = c();
        c2.d = 0;
        b2.a(iVar, iVar2, c2, 0);
        if (z) {
            a(b2, (int) (b2.d.b(c2) * (-1.0f)), 1);
        }
        a(b2);
    }

    public void a(a.e.a.j.f fVar, a.e.a.j.f fVar2, float f, int i) {
        i a2 = a(fVar.a(e.d.LEFT));
        i a3 = a(fVar.a(e.d.TOP));
        i a4 = a(fVar.a(e.d.RIGHT));
        i a5 = a(fVar.a(e.d.BOTTOM));
        i a6 = a(fVar2.a(e.d.LEFT));
        i a7 = a(fVar2.a(e.d.TOP));
        i a8 = a(fVar2.a(e.d.RIGHT));
        i a9 = a(fVar2.a(e.d.BOTTOM));
        b b2 = b();
        double d = f;
        double sin = Math.sin(d);
        double d2 = i;
        Double.isNaN(d2);
        b2.b(a3, a5, a7, a9, (float) (sin * d2));
        a(b2);
        b b3 = b();
        double cos = Math.cos(d);
        Double.isNaN(d2);
        b3.b(a2, a4, a6, a8, (float) (cos * d2));
        a(b3);
    }

    public int b(Object obj) {
        i e = ((a.e.a.j.e) obj).e();
        if (e != null) {
            return (int) (e.e + 0.5f);
        }
        return 0;
    }

    public b b() {
        b a2 = this.l.f105a.a();
        if (a2 == null) {
            a2 = new b(this.l);
        } else {
            a2.d();
        }
        i.b();
        return a2;
    }

    public void b(i iVar, i iVar2, int i, int i2) {
        b b2 = b();
        i c2 = c();
        c2.d = 0;
        b2.a(iVar, iVar2, c2, i);
        if (i2 != 6) {
            a(b2, (int) (b2.d.b(c2) * (-1.0f)), i2);
        }
        a(b2);
    }

    public void b(i iVar, i iVar2, boolean z) {
        b b2 = b();
        i c2 = c();
        c2.d = 0;
        b2.b(iVar, iVar2, c2, 0);
        if (z) {
            a(b2, (int) (b2.d.b(c2) * (-1.0f)), 1);
        }
        a(b2);
    }

    public i c() {
        f fVar = q;
        if (fVar != null) {
            fVar.m++;
        }
        if (this.i + 1 >= this.e) {
            i();
        }
        i a2 = a(i.a.SLACK, (String) null);
        int i = this.f108a + 1;
        this.f108a = i;
        this.i++;
        a2.f117b = i;
        this.l.f107c[i] = a2;
        return a2;
    }

    public void c(i iVar, i iVar2, int i, int i2) {
        b b2 = b();
        i c2 = c();
        c2.d = 0;
        b2.b(iVar, iVar2, c2, i);
        if (i2 != 6) {
            a(b2, (int) (b2.d.b(c2) * (-1.0f)), i2);
        }
        a(b2);
    }

    public c d() {
        return this.l;
    }

    public void e() {
        f fVar = q;
        if (fVar != null) {
            fVar.e++;
        }
        if (this.g) {
            f fVar2 = q;
            if (fVar2 != null) {
                fVar2.q++;
            }
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= this.j) {
                    z = true;
                    break;
                } else if (!this.f[i].e) {
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                f fVar3 = q;
                if (fVar3 != null) {
                    fVar3.p++;
                }
                g();
                return;
            }
        }
        a(this.f110c);
    }

    public void f() {
        c cVar;
        int i = 0;
        while (true) {
            cVar = this.l;
            i[] iVarArr = cVar.f107c;
            if (i >= iVarArr.length) {
                break;
            }
            i iVar = iVarArr[i];
            if (iVar != null) {
                iVar.a();
            }
            i++;
        }
        cVar.f106b.a(this.m, this.n);
        this.n = 0;
        Arrays.fill(this.l.f107c, (Object) null);
        HashMap<String, i> hashMap = this.f109b;
        if (hashMap != null) {
            hashMap.clear();
        }
        this.f108a = 0;
        this.f110c.clear();
        this.i = 1;
        for (int i2 = 0; i2 < this.j; i2++) {
            this.f[i2].f104c = false;
        }
        j();
        this.j = 0;
    }
}
