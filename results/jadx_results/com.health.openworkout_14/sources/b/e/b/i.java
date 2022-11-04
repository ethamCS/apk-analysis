package b.e.b;

import java.util.Arrays;
/* loaded from: classes.dex */
public class i {
    private static int q = 1;

    /* renamed from: a */
    public boolean f2213a;

    /* renamed from: b */
    private String f2214b;

    /* renamed from: f */
    public float f2218f;
    a j;

    /* renamed from: c */
    public int f2215c = -1;

    /* renamed from: d */
    int f2216d = -1;

    /* renamed from: e */
    public int f2217e = 0;

    /* renamed from: g */
    public boolean f2219g = false;

    /* renamed from: h */
    float[] f2220h = new float[9];
    float[] i = new float[9];
    b[] k = new b[16];
    int l = 0;
    public int m = 0;
    boolean n = false;
    int o = -1;
    float p = 0.0f;

    /* loaded from: classes.dex */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.j = aVar;
    }

    public static void b() {
        q++;
    }

    public final void a(b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.l;
            if (i >= i2) {
                b[] bVarArr = this.k;
                if (i2 >= bVarArr.length) {
                    this.k = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.k;
                int i3 = this.l;
                bVarArr2[i3] = bVar;
                this.l = i3 + 1;
                return;
            } else if (this.k[i] == bVar) {
                return;
            } else {
                i++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r1 >= (r0 - 1)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
        r5 = r4.k;
        r2 = r1 + 1;
        r5[r1] = r5[r2];
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
        r4.l--;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(b.e.b.b r5) {
        /*
            r4 = this;
            int r0 = r4.l
            r1 = 0
        L3:
            if (r1 >= r0) goto L23
            b.e.b.b[] r2 = r4.k
            r2 = r2[r1]
            if (r2 != r5) goto L20
        Lb:
            int r5 = r0 + (-1)
            if (r1 >= r5) goto L19
            b.e.b.b[] r5 = r4.k
            int r2 = r1 + 1
            r3 = r5[r2]
            r5[r1] = r3
            r1 = r2
            goto Lb
        L19:
            int r5 = r4.l
            int r5 = r5 + (-1)
            r4.l = r5
            return
        L20:
            int r1 = r1 + 1
            goto L3
        L23:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: b.e.b.i.c(b.e.b.b):void");
    }

    public void d() {
        this.f2214b = null;
        this.j = a.UNKNOWN;
        this.f2217e = 0;
        this.f2215c = -1;
        this.f2216d = -1;
        this.f2218f = 0.0f;
        this.f2219g = false;
        this.n = false;
        this.o = -1;
        this.p = 0.0f;
        int i = this.l;
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2] = null;
        }
        this.l = 0;
        this.m = 0;
        this.f2213a = false;
        Arrays.fill(this.i, 0.0f);
    }

    public void e(d dVar, float f2) {
        this.f2218f = f2;
        this.f2219g = true;
        this.n = false;
        this.o = -1;
        this.p = 0.0f;
        int i = this.l;
        this.f2216d = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2].A(dVar, this, false);
        }
        this.l = 0;
    }

    public void f(a aVar, String str) {
        this.j = aVar;
    }

    public final void g(d dVar, b bVar) {
        int i = this.l;
        for (int i2 = 0; i2 < i; i2++) {
            this.k[i2].B(dVar, bVar, false);
        }
        this.l = 0;
    }

    public String toString() {
        StringBuilder sb;
        if (this.f2214b != null) {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f2214b);
        } else {
            sb = new StringBuilder();
            sb.append("");
            sb.append(this.f2215c);
        }
        return sb.toString();
    }
}
