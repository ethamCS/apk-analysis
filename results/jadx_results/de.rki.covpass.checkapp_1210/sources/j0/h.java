package j0;

import j0.b;
import java.util.Arrays;
import java.util.Comparator;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public class h extends j0.b {

    /* renamed from: g */
    private int f13899g = 128;

    /* renamed from: h */
    private i[] f13900h = new i[128];

    /* renamed from: i */
    private i[] f13901i = new i[128];

    /* renamed from: j */
    private int f13902j = 0;

    /* renamed from: k */
    b f13903k = new b(this);

    /* renamed from: l */
    c f13904l;

    /* loaded from: classes.dex */
    public class a implements Comparator<i> {
        a() {
            h.this = r1;
        }

        /* renamed from: a */
        public int compare(i iVar, i iVar2) {
            return iVar.f13918q - iVar2.f13918q;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a */
        i f13906a;

        /* renamed from: b */
        h f13907b;

        public b(h hVar) {
            h.this = r1;
            this.f13907b = hVar;
        }

        public boolean a(i iVar, float f10) {
            boolean z10 = true;
            if (!this.f13906a.f13912c) {
                for (int i10 = 0; i10 < 9; i10++) {
                    float f11 = iVar.X3[i10];
                    if (f11 != 0.0f) {
                        float f12 = f11 * f10;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        this.f13906a.X3[i10] = f12;
                    } else {
                        this.f13906a.X3[i10] = 0.0f;
                    }
                }
                return true;
            }
            for (int i11 = 0; i11 < 9; i11++) {
                float[] fArr = this.f13906a.X3;
                fArr[i11] = fArr[i11] + (iVar.X3[i11] * f10);
                if (Math.abs(fArr[i11]) < 1.0E-4f) {
                    this.f13906a.X3[i11] = 0.0f;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                h.this.G(this.f13906a);
            }
            return false;
        }

        public void b(i iVar) {
            this.f13906a = iVar;
        }

        public final boolean c() {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = this.f13906a.X3[i10];
                if (f10 > 0.0f) {
                    return false;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(i iVar) {
            int i10 = 8;
            while (true) {
                if (i10 < 0) {
                    break;
                }
                float f10 = iVar.X3[i10];
                float f11 = this.f13906a.X3[i10];
                if (f11 == f10) {
                    i10--;
                } else if (f11 < f10) {
                    return true;
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f13906a.X3, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f13906a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    str = str + this.f13906a.X3[i10] + " ";
                }
            }
            return str + "] " + this.f13906a;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f13904l = cVar;
    }

    private final void F(i iVar) {
        int i10;
        int i11 = this.f13902j + 1;
        i[] iVarArr = this.f13900h;
        if (i11 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f13900h = iVarArr2;
            this.f13901i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f13900h;
        int i12 = this.f13902j;
        iVarArr3[i12] = iVar;
        int i13 = i12 + 1;
        this.f13902j = i13;
        if (i13 > 1 && iVarArr3[i13 - 1].f13918q > iVar.f13918q) {
            int i14 = 0;
            while (true) {
                i10 = this.f13902j;
                if (i14 >= i10) {
                    break;
                }
                this.f13901i[i14] = this.f13900h[i14];
                i14++;
            }
            Arrays.sort(this.f13901i, 0, i10, new a());
            for (int i15 = 0; i15 < this.f13902j; i15++) {
                this.f13900h[i15] = this.f13901i[i15];
            }
        }
        iVar.f13912c = true;
        iVar.a(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
        r5.f13902j = r2 - 1;
        r6.f13912c = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000c, code lost:
        r2 = r5.f13902j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
        if (r1 >= (r2 - 1)) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0012, code lost:
        r2 = r5.f13900h;
        r3 = r1 + 1;
        r2[r1] = r2[r3];
        r1 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(j0.i r6) {
        /*
            r5 = this;
            r0 = 0
            r1 = r0
        L2:
            int r2 = r5.f13902j
            if (r1 >= r2) goto L26
            j0.i[] r2 = r5.f13900h
            r2 = r2[r1]
            if (r2 != r6) goto L23
        Lc:
            int r2 = r5.f13902j
            int r3 = r2 + (-1)
            if (r1 >= r3) goto L1c
            j0.i[] r2 = r5.f13900h
            int r3 = r1 + 1
            r4 = r2[r3]
            r2[r1] = r4
            r1 = r3
            goto Lc
        L1c:
            int r2 = r2 + (-1)
            r5.f13902j = r2
            r6.f13912c = r0
            return
        L23:
            int r1 = r1 + 1
            goto L2
        L26:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.h.G(j0.i):void");
    }

    @Override // j0.b
    public void B(d dVar, j0.b bVar, boolean z10) {
        i iVar = bVar.f13861a;
        if (iVar == null) {
            return;
        }
        b.a aVar = bVar.f13865e;
        int e10 = aVar.e();
        for (int i10 = 0; i10 < e10; i10++) {
            i h10 = aVar.h(i10);
            float a10 = aVar.a(i10);
            this.f13903k.b(h10);
            if (this.f13903k.a(iVar, a10)) {
                F(h10);
            }
            this.f13862b += bVar.f13862b * a10;
        }
        G(iVar);
    }

    @Override // j0.b, j0.d.a
    public void a(i iVar) {
        this.f13903k.b(iVar);
        this.f13903k.e();
        iVar.X3[iVar.f13920y] = 1.0f;
        F(iVar);
    }

    @Override // j0.b, j0.d.a
    public i c(d dVar, boolean[] zArr) {
        int i10 = -1;
        for (int i11 = 0; i11 < this.f13902j; i11++) {
            i iVar = this.f13900h[i11];
            if (!zArr[iVar.f13918q]) {
                this.f13903k.b(iVar);
                b bVar = this.f13903k;
                if (i10 == -1) {
                    if (!bVar.c()) {
                    }
                    i10 = i11;
                } else {
                    if (!bVar.d(this.f13900h[i10])) {
                    }
                    i10 = i11;
                }
            }
        }
        if (i10 == -1) {
            return null;
        }
        return this.f13900h[i10];
    }

    @Override // j0.b, j0.d.a
    public void clear() {
        this.f13902j = 0;
        this.f13862b = 0.0f;
    }

    @Override // j0.b, j0.d.a
    public boolean isEmpty() {
        return this.f13902j == 0;
    }

    @Override // j0.b
    public String toString() {
        String str = BuildConfig.FLAVOR + " goal -> (" + this.f13862b + ") : ";
        for (int i10 = 0; i10 < this.f13902j; i10++) {
            this.f13903k.b(this.f13900h[i10]);
            str = str + this.f13903k + " ";
        }
        return str;
    }
}
