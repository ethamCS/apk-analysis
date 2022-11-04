package a.e.a;

import java.util.Arrays;
/* loaded from: classes.dex */
public class i {
    private static int k = 1;

    /* renamed from: a */
    private String f116a;
    public float e;
    a g;

    /* renamed from: b */
    public int f117b = -1;

    /* renamed from: c */
    int f118c = -1;
    public int d = 0;
    float[] f = new float[7];
    b[] h = new b[8];
    int i = 0;
    public int j = 0;

    /* loaded from: classes.dex */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.g = aVar;
    }

    public static void b() {
        k++;
    }

    public void a() {
        this.f116a = null;
        this.g = a.UNKNOWN;
        this.d = 0;
        this.f117b = -1;
        this.f118c = -1;
        this.e = 0.0f;
        this.i = 0;
        this.j = 0;
    }

    public final void a(b bVar) {
        int i = 0;
        while (true) {
            int i2 = this.i;
            if (i >= i2) {
                b[] bVarArr = this.h;
                if (i2 >= bVarArr.length) {
                    this.h = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.h;
                int i3 = this.i;
                bVarArr2[i3] = bVar;
                this.i = i3 + 1;
                return;
            } else if (this.h[i] == bVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public void a(a aVar, String str) {
        this.g = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0010, code lost:
        if (r1 >= ((r0 - r2) - 1)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0012, code lost:
        r6 = r5.h;
        r3 = r2 + r1;
        r6[r3] = r6[r3 + 1];
        r1 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
        r5.i--;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(a.e.a.b r6) {
        /*
            r5 = this;
            int r0 = r5.i
            r1 = 0
            r2 = 0
        L4:
            if (r2 >= r0) goto L29
            a.e.a.b[] r3 = r5.h
            r3 = r3[r2]
            if (r3 != r6) goto L26
        Lc:
            int r6 = r0 - r2
            int r6 = r6 + (-1)
            if (r1 >= r6) goto L1f
            a.e.a.b[] r6 = r5.h
            int r3 = r2 + r1
            int r4 = r3 + 1
            r4 = r6[r4]
            r6[r3] = r4
            int r1 = r1 + 1
            goto Lc
        L1f:
            int r6 = r5.i
            int r6 = r6 + (-1)
            r5.i = r6
            return
        L26:
            int r2 = r2 + 1
            goto L4
        L29:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: a.e.a.i.b(a.e.a.b):void");
    }

    public final void c(b bVar) {
        int i = this.i;
        for (int i2 = 0; i2 < i; i2++) {
            b[] bVarArr = this.h;
            bVarArr[i2].d.a(bVarArr[i2], bVar, false);
        }
        this.i = 0;
    }

    public String toString() {
        return "" + this.f116a;
    }
}
