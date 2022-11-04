package j0;

import java.util.Arrays;
import java.util.HashSet;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public class i implements Comparable<i> {

    /* renamed from: g4 */
    private static int f13909g4 = 1;
    public float U3;
    a Y3;

    /* renamed from: c */
    public boolean f13912c;

    /* renamed from: d */
    private String f13914d;

    /* renamed from: q */
    public int f13918q = -1;

    /* renamed from: x */
    int f13919x = -1;

    /* renamed from: y */
    public int f13920y = 0;
    public boolean V3 = false;
    float[] W3 = new float[9];
    float[] X3 = new float[9];
    b[] Z3 = new b[16];

    /* renamed from: a4 */
    int f13910a4 = 0;

    /* renamed from: b4 */
    public int f13911b4 = 0;

    /* renamed from: c4 */
    boolean f13913c4 = false;

    /* renamed from: d4 */
    int f13915d4 = -1;

    /* renamed from: e4 */
    float f13916e4 = 0.0f;

    /* renamed from: f4 */
    HashSet<b> f13917f4 = null;

    /* loaded from: classes.dex */
    public enum a {
        UNRESTRICTED,
        CONSTANT,
        SLACK,
        ERROR,
        UNKNOWN
    }

    public i(a aVar, String str) {
        this.Y3 = aVar;
    }

    public static void d() {
        f13909g4++;
    }

    public final void a(b bVar) {
        int i10 = 0;
        while (true) {
            int i11 = this.f13910a4;
            if (i10 >= i11) {
                b[] bVarArr = this.Z3;
                if (i11 >= bVarArr.length) {
                    this.Z3 = (b[]) Arrays.copyOf(bVarArr, bVarArr.length * 2);
                }
                b[] bVarArr2 = this.Z3;
                int i12 = this.f13910a4;
                bVarArr2[i12] = bVar;
                this.f13910a4 = i12 + 1;
                return;
            } else if (this.Z3[i10] == bVar) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* renamed from: b */
    public int compareTo(i iVar) {
        return this.f13918q - iVar.f13918q;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x000d, code lost:
        if (r1 >= (r0 - 1)) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x000f, code lost:
        r5 = r4.Z3;
        r2 = r1 + 1;
        r5[r1] = r5[r2];
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
        r4.f13910a4--;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(j0.b r5) {
        /*
            r4 = this;
            int r0 = r4.f13910a4
            r1 = 0
        L3:
            if (r1 >= r0) goto L23
            j0.b[] r2 = r4.Z3
            r2 = r2[r1]
            if (r2 != r5) goto L20
        Lb:
            int r5 = r0 + (-1)
            if (r1 >= r5) goto L19
            j0.b[] r5 = r4.Z3
            int r2 = r1 + 1
            r3 = r5[r2]
            r5[r1] = r3
            r1 = r2
            goto Lb
        L19:
            int r5 = r4.f13910a4
            int r5 = r5 + (-1)
            r4.f13910a4 = r5
            return
        L20:
            int r1 = r1 + 1
            goto L3
        L23:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j0.i.g(j0.b):void");
    }

    public void h() {
        this.f13914d = null;
        this.Y3 = a.UNKNOWN;
        this.f13920y = 0;
        this.f13918q = -1;
        this.f13919x = -1;
        this.U3 = 0.0f;
        this.V3 = false;
        this.f13913c4 = false;
        this.f13915d4 = -1;
        this.f13916e4 = 0.0f;
        int i10 = this.f13910a4;
        for (int i11 = 0; i11 < i10; i11++) {
            this.Z3[i11] = null;
        }
        this.f13910a4 = 0;
        this.f13911b4 = 0;
        this.f13912c = false;
        Arrays.fill(this.X3, 0.0f);
    }

    public void j(d dVar, float f10) {
        this.U3 = f10;
        this.V3 = true;
        this.f13913c4 = false;
        this.f13915d4 = -1;
        this.f13916e4 = 0.0f;
        int i10 = this.f13910a4;
        this.f13919x = -1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.Z3[i11].A(dVar, this, false);
        }
        this.f13910a4 = 0;
    }

    public void l(a aVar, String str) {
        this.Y3 = aVar;
    }

    public final void m(d dVar, b bVar) {
        int i10 = this.f13910a4;
        for (int i11 = 0; i11 < i10; i11++) {
            this.Z3[i11].B(dVar, bVar, false);
        }
        this.f13910a4 = 0;
    }

    public String toString() {
        StringBuilder sb2;
        if (this.f13914d != null) {
            sb2 = new StringBuilder();
            sb2.append(BuildConfig.FLAVOR);
            sb2.append(this.f13914d);
        } else {
            sb2 = new StringBuilder();
            sb2.append(BuildConfig.FLAVOR);
            sb2.append(this.f13918q);
        }
        return sb2.toString();
    }
}
