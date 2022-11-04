package b.e.b;

import b.e.b.b;
import java.util.Arrays;
import java.util.Comparator;
/* loaded from: classes.dex */
public class h extends b.e.b.b {

    /* renamed from: g */
    private int f2209g = 128;

    /* renamed from: h */
    private i[] f2210h = new i[128];
    private i[] i = new i[128];
    private int j = 0;
    b k = new b(this);

    /* loaded from: classes.dex */
    public class a implements Comparator<i> {
        a(h hVar) {
        }

        /* renamed from: a */
        public int compare(i iVar, i iVar2) {
            return iVar.f2215c - iVar2.f2215c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Comparable {

        /* renamed from: b */
        i f2211b;

        public b(h hVar) {
            h.this = r1;
        }

        public boolean a(i iVar, float f2) {
            boolean z = true;
            if (!this.f2211b.f2213a) {
                for (int i = 0; i < 9; i++) {
                    float f3 = iVar.i[i];
                    if (f3 != 0.0f) {
                        float f4 = f3 * f2;
                        if (Math.abs(f4) < 1.0E-4f) {
                            f4 = 0.0f;
                        }
                        this.f2211b.i[i] = f4;
                    } else {
                        this.f2211b.i[i] = 0.0f;
                    }
                }
                return true;
            }
            for (int i2 = 0; i2 < 9; i2++) {
                float[] fArr = this.f2211b.i;
                fArr[i2] = fArr[i2] + (iVar.i[i2] * f2);
                if (Math.abs(fArr[i2]) < 1.0E-4f) {
                    this.f2211b.i[i2] = 0.0f;
                } else {
                    z = false;
                }
            }
            if (z) {
                h.this.G(this.f2211b);
            }
            return false;
        }

        public void b(i iVar) {
            this.f2211b = iVar;
        }

        public final boolean c() {
            for (int i = 8; i >= 0; i--) {
                float f2 = this.f2211b.i[i];
                if (f2 > 0.0f) {
                    return false;
                }
                if (f2 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f2211b.f2215c - ((i) obj).f2215c;
        }

        public final boolean d(i iVar) {
            int i = 8;
            while (true) {
                if (i < 0) {
                    break;
                }
                float f2 = iVar.i[i];
                float f3 = this.f2211b.i[i];
                if (f3 == f2) {
                    i--;
                } else if (f3 < f2) {
                    return true;
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f2211b.i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f2211b != null) {
                for (int i = 0; i < 9; i++) {
                    str = str + this.f2211b.i[i] + " ";
                }
            }
            return str + "] " + this.f2211b;
        }
    }

    public h(c cVar) {
        super(cVar);
    }

    private final void F(i iVar) {
        int i;
        int i2 = this.j + 1;
        i[] iVarArr = this.f2210h;
        if (i2 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f2210h = iVarArr2;
            this.i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f2210h;
        int i3 = this.j;
        iVarArr3[i3] = iVar;
        int i4 = i3 + 1;
        this.j = i4;
        if (i4 > 1 && iVarArr3[i4 - 1].f2215c > iVar.f2215c) {
            int i5 = 0;
            while (true) {
                i = this.j;
                if (i5 >= i) {
                    break;
                }
                this.i[i5] = this.f2210h[i5];
                i5++;
            }
            Arrays.sort(this.i, 0, i, new a(this));
            for (int i6 = 0; i6 < this.j; i6++) {
                this.f2210h[i6] = this.i[i6];
            }
        }
        iVar.f2213a = true;
        iVar.a(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        r5.j = r2 - 1;
        r6.f2213a = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
        r2 = r5.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
        if (r1 >= (r2 - 1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
        r2 = r5.f2210h;
        r3 = r1 + 1;
        r2[r1] = r2[r3];
        r1 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(b.e.b.i r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r5.j
            if (r1 >= r2) goto L26
            b.e.b.i[] r2 = r5.f2210h
            r2 = r2[r1]
            if (r2 != r6) goto L23
        Lc:
            int r2 = r5.j
            int r3 = r2 + (-1)
            if (r1 >= r3) goto L1c
            b.e.b.i[] r2 = r5.f2210h
            int r3 = r1 + 1
            r4 = r2[r3]
            r2[r1] = r4
            r1 = r3
            goto Lc
        L1c:
            int r2 = r2 + (-1)
            r5.j = r2
            r6.f2213a = r0
            return
        L23:
            int r1 = r1 + 1
            goto L2
        L26:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.e.b.h.G(b.e.b.i):void");
    }

    @Override // b.e.b.b
    public void B(d dVar, b.e.b.b bVar, boolean z) {
        i iVar = bVar.f2181a;
        if (iVar == null) {
            return;
        }
        b.a aVar = bVar.f2185e;
        int k = aVar.k();
        for (int i = 0; i < k; i++) {
            i f2 = aVar.f(i);
            float a2 = aVar.a(i);
            this.k.b(f2);
            if (this.k.a(iVar, a2)) {
                F(f2);
            }
            this.f2182b += bVar.f2182b * a2;
        }
        G(iVar);
    }

    @Override // b.e.b.b, b.e.b.d.a
    public void b(i iVar) {
        this.k.b(iVar);
        this.k.e();
        iVar.i[iVar.f2217e] = 1.0f;
        F(iVar);
    }

    @Override // b.e.b.b, b.e.b.d.a
    public i c(d dVar, boolean[] zArr) {
        int i = -1;
        for (int i2 = 0; i2 < this.j; i2++) {
            i iVar = this.f2210h[i2];
            if (!zArr[iVar.f2215c]) {
                this.k.b(iVar);
                b bVar = this.k;
                if (i == -1) {
                    if (!bVar.c()) {
                    }
                    i = i2;
                } else {
                    if (!bVar.d(this.f2210h[i])) {
                    }
                    i = i2;
                }
            }
        }
        if (i == -1) {
            return null;
        }
        return this.f2210h[i];
    }

    @Override // b.e.b.b, b.e.b.d.a
    public void clear() {
        this.j = 0;
        this.f2182b = 0.0f;
    }

    @Override // b.e.b.b, b.e.b.d.a
    public boolean isEmpty() {
        return this.j == 0;
    }

    @Override // b.e.b.b
    public String toString() {
        String str = " goal -> (" + this.f2182b + ") : ";
        for (int i = 0; i < this.j; i++) {
            this.k.b(this.f2210h[i]);
            str = str + this.k + " ";
        }
        return str;
    }
}
