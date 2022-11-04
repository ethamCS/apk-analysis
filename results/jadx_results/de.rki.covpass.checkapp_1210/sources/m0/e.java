package m0;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import m0.d;
import n0.n;
import n0.p;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public class e {
    public static float K0 = 0.5f;
    boolean B0;
    boolean C0;
    private boolean K;
    public d V;
    public d[] W;
    public b[] Z;

    /* renamed from: c */
    public n0.c f16173c;

    /* renamed from: d */
    public n0.c f16175d;

    /* renamed from: m0 */
    protected int f16194m0;

    /* renamed from: n0 */
    protected int f16196n0;

    /* renamed from: o */
    public String f16197o;

    /* renamed from: o0 */
    float f16198o0;

    /* renamed from: p0 */
    float f16200p0;

    /* renamed from: q0 */
    private Object f16202q0;

    /* renamed from: w0 */
    boolean f16214w0;

    /* renamed from: x0 */
    boolean f16216x0;

    /* renamed from: a */
    public boolean f16169a = false;

    /* renamed from: b */
    public p[] f16171b = new p[2];

    /* renamed from: e */
    public n0.l f16177e = null;

    /* renamed from: f */
    public n f16179f = null;

    /* renamed from: g */
    public boolean[] f16181g = {true, true};

    /* renamed from: h */
    boolean f16183h = false;

    /* renamed from: i */
    private boolean f16185i = true;

    /* renamed from: j */
    private boolean f16187j = false;

    /* renamed from: k */
    private boolean f16189k = true;

    /* renamed from: l */
    private int f16191l = -1;

    /* renamed from: m */
    private int f16193m = -1;

    /* renamed from: n */
    public l0.a f16195n = new l0.a(this);

    /* renamed from: p */
    private boolean f16199p = false;

    /* renamed from: q */
    private boolean f16201q = false;

    /* renamed from: r */
    private boolean f16203r = false;

    /* renamed from: s */
    private boolean f16205s = false;

    /* renamed from: t */
    public int f16207t = -1;

    /* renamed from: u */
    public int f16209u = -1;

    /* renamed from: v */
    private int f16211v = 0;

    /* renamed from: w */
    public int f16213w = 0;

    /* renamed from: x */
    public int f16215x = 0;

    /* renamed from: y */
    public int[] f16217y = new int[2];

    /* renamed from: z */
    public int f16219z = 0;
    public int A = 0;
    public float B = 1.0f;
    public int C = 0;
    public int D = 0;
    public float E = 1.0f;
    int F = -1;
    float G = 1.0f;
    private int[] H = {Integer.MAX_VALUE, Integer.MAX_VALUE};
    private float I = 0.0f;
    private boolean J = false;
    private boolean L = false;
    private int M = 0;
    private int N = 0;
    public d O = new d(this, d.b.LEFT);
    public d P = new d(this, d.b.TOP);
    public d Q = new d(this, d.b.RIGHT);
    public d R = new d(this, d.b.BOTTOM);
    public d S = new d(this, d.b.BASELINE);
    d T = new d(this, d.b.CENTER_X);
    d U = new d(this, d.b.CENTER_Y);
    protected ArrayList<d> X = new ArrayList<>();
    private boolean[] Y = new boolean[2];

    /* renamed from: a0 */
    public e f16170a0 = null;

    /* renamed from: b0 */
    int f16172b0 = 0;

    /* renamed from: c0 */
    int f16174c0 = 0;

    /* renamed from: d0 */
    public float f16176d0 = 0.0f;

    /* renamed from: e0 */
    protected int f16178e0 = -1;

    /* renamed from: f0 */
    protected int f16180f0 = 0;

    /* renamed from: g0 */
    protected int f16182g0 = 0;

    /* renamed from: h0 */
    int f16184h0 = 0;

    /* renamed from: i0 */
    int f16186i0 = 0;

    /* renamed from: j0 */
    protected int f16188j0 = 0;

    /* renamed from: k0 */
    protected int f16190k0 = 0;

    /* renamed from: l0 */
    int f16192l0 = 0;

    /* renamed from: r0 */
    private int f16204r0 = 0;

    /* renamed from: s0 */
    private int f16206s0 = 0;

    /* renamed from: t0 */
    private boolean f16208t0 = false;

    /* renamed from: u0 */
    private String f16210u0 = null;

    /* renamed from: v0 */
    private String f16212v0 = null;

    /* renamed from: y0 */
    boolean f16218y0 = false;

    /* renamed from: z0 */
    int f16220z0 = 0;
    int A0 = 0;
    public float[] D0 = {-1.0f, -1.0f};
    protected e[] E0 = {null, null};
    protected e[] F0 = {null, null};
    e G0 = null;
    e H0 = null;
    public int I0 = -1;
    public int J0 = -1;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16221a;

        /* renamed from: b */
        static final /* synthetic */ int[] f16222b;

        static {
            int[] iArr = new int[b.values().length];
            f16222b = iArr;
            try {
                iArr[b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16222b[b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16222b[b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16222b[b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f16221a = iArr2;
            try {
                iArr2[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16221a[d.b.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f16221a[d.b.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16221a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16221a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f16221a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f16221a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f16221a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f16221a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused13) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        FIXED,
        WRAP_CONTENT,
        MATCH_CONSTRAINT,
        MATCH_PARENT
    }

    public e() {
        d dVar = new d(this, d.b.CENTER);
        this.V = dVar;
        this.W = new d[]{this.O, this.Q, this.P, this.R, this.S, dVar};
        b bVar = b.FIXED;
        this.Z = new b[]{bVar, bVar};
        float f10 = K0;
        this.f16198o0 = f10;
        this.f16200p0 = f10;
        d();
    }

    private void N(StringBuilder sb2, String str, int i10, int i11, int i12, int i13, int i14, int i15, float f10, float f11) {
        sb2.append(str);
        sb2.append(" :  {\n");
        v0(sb2, "      size", i10, 0);
        v0(sb2, "      min", i11, 0);
        v0(sb2, "      max", i12, Integer.MAX_VALUE);
        v0(sb2, "      matchMin", i14, 0);
        v0(sb2, "      matchDef", i15, 0);
        u0(sb2, "      matchPercent", f10, 1.0f);
        sb2.append("    },\n");
    }

    private void O(StringBuilder sb2, String str, d dVar) {
        if (dVar.f16159f == null) {
            return;
        }
        sb2.append("    ");
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(dVar.f16159f);
        sb2.append("'");
        if (dVar.f16161h != Integer.MIN_VALUE || dVar.f16160g != 0) {
            sb2.append(",");
            sb2.append(dVar.f16160g);
            if (dVar.f16161h != Integer.MIN_VALUE) {
                sb2.append(",");
                sb2.append(dVar.f16161h);
                sb2.append(",");
            }
        }
        sb2.append(" ] ,\n");
    }

    private void d() {
        this.X.add(this.O);
        this.X.add(this.P);
        this.X.add(this.Q);
        this.X.add(this.R);
        this.X.add(this.T);
        this.X.add(this.U);
        this.X.add(this.V);
        this.X.add(this.S);
    }

    private boolean d0(int i10) {
        int i11 = i10 * 2;
        d[] dVarArr = this.W;
        if (dVarArr[i11].f16159f != null && dVarArr[i11].f16159f.f16159f != dVarArr[i11]) {
            int i12 = i11 + 1;
            if (dVarArr[i12].f16159f != null && dVarArr[i12].f16159f.f16159f == dVarArr[i12]) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:262:0x0488, code lost:
        if ((r4 instanceof m0.a) != false) goto L264;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:200:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0478  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x04ce  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0519  */
    /* JADX WARN: Removed duplicated region for block: B:318:0x052b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0547 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:351:0x057e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:377:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:380:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void i(j0.d r38, boolean r39, boolean r40, boolean r41, boolean r42, j0.i r43, j0.i r44, m0.e.b r45, boolean r46, m0.d r47, m0.d r48, int r49, int r50, int r51, int r52, float r53, boolean r54, boolean r55, boolean r56, boolean r57, boolean r58, int r59, int r60, int r61, int r62, float r63, boolean r64) {
        /*
            Method dump skipped, instructions count: 1465
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.e.i(j0.d, boolean, boolean, boolean, boolean, j0.i, j0.i, m0.e$b, boolean, m0.d, m0.d, int, int, int, int, float, boolean, boolean, boolean, boolean, boolean, int, int, int, int, float, boolean):void");
    }

    private void u0(StringBuilder sb2, String str, float f10, float f11) {
        if (f10 == f11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f10);
        sb2.append(",\n");
    }

    private void v0(StringBuilder sb2, String str, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i10);
        sb2.append(",\n");
    }

    private void w0(StringBuilder sb2, String str, float f10, int i10) {
        if (f10 == 0.0f) {
            return;
        }
        sb2.append(str);
        sb2.append(" :  [");
        sb2.append(f10);
        sb2.append(",");
        sb2.append(i10);
        sb2.append(BuildConfig.FLAVOR);
        sb2.append("],\n");
    }

    public int A() {
        return this.M;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0084 -> B:36:0x0085). Please submit an issue!!! */
    public void A0(String str) {
        float f10;
        int i10 = 0;
        if (str == null || str.length() == 0) {
            this.f16176d0 = 0.0f;
            return;
        }
        int i11 = -1;
        int length = str.length();
        int indexOf = str.indexOf(44);
        int i12 = 0;
        if (indexOf > 0 && indexOf < length - 1) {
            String substring = str.substring(0, indexOf);
            if (substring.equalsIgnoreCase("W")) {
                i11 = 0;
            } else if (substring.equalsIgnoreCase("H")) {
                i11 = 1;
            }
            i12 = indexOf + 1;
        }
        int indexOf2 = str.indexOf(58);
        if (indexOf2 < 0 || indexOf2 >= length - 1) {
            String substring2 = str.substring(i12);
            if (substring2.length() > 0) {
                f10 = Float.parseFloat(substring2);
            }
            f10 = i10;
        } else {
            String substring3 = str.substring(i12, indexOf2);
            String substring4 = str.substring(indexOf2 + 1);
            if (substring3.length() > 0 && substring4.length() > 0) {
                float parseFloat = Float.parseFloat(substring3);
                float parseFloat2 = Float.parseFloat(substring4);
                if (parseFloat > 0.0f && parseFloat2 > 0.0f) {
                    f10 = i11 == 1 ? Math.abs(parseFloat2 / parseFloat) : Math.abs(parseFloat / parseFloat2);
                }
            }
            f10 = i10;
        }
        i10 = (f10 > i10 ? 1 : (f10 == i10 ? 0 : -1));
        if (i10 <= 0) {
            return;
        }
        this.f16176d0 = f10;
        this.f16178e0 = i11;
    }

    public int B() {
        return this.N;
    }

    public void B0(int i10) {
        if (!this.J) {
            return;
        }
        int i11 = i10 - this.f16192l0;
        int i12 = this.f16174c0 + i11;
        this.f16182g0 = i11;
        this.P.s(i11);
        this.R.s(i12);
        this.S.s(i10);
        this.f16201q = true;
    }

    public int C(int i10) {
        if (i10 == 0) {
            return U();
        }
        if (i10 != 1) {
            return 0;
        }
        return v();
    }

    public void C0(int i10, int i11) {
        if (this.f16199p) {
            return;
        }
        this.O.s(i10);
        this.Q.s(i11);
        this.f16180f0 = i10;
        this.f16172b0 = i11 - i10;
        this.f16199p = true;
    }

    public int D() {
        return this.H[1];
    }

    public void D0(int i10) {
        this.O.s(i10);
        this.f16180f0 = i10;
    }

    public int E() {
        return this.H[0];
    }

    public void E0(int i10) {
        this.P.s(i10);
        this.f16182g0 = i10;
    }

    public int F() {
        return this.f16196n0;
    }

    public void F0(int i10, int i11) {
        if (this.f16201q) {
            return;
        }
        this.P.s(i10);
        this.R.s(i11);
        this.f16182g0 = i10;
        this.f16174c0 = i11 - i10;
        if (this.J) {
            this.S.s(i10 + this.f16192l0);
        }
        this.f16201q = true;
    }

    public int G() {
        return this.f16194m0;
    }

    public void G0(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16 = i12 - i10;
        int i17 = i13 - i11;
        this.f16180f0 = i10;
        this.f16182g0 = i11;
        if (this.f16206s0 == 8) {
            this.f16172b0 = 0;
            this.f16174c0 = 0;
            return;
        }
        b[] bVarArr = this.Z;
        b bVar = bVarArr[0];
        b bVar2 = b.FIXED;
        if (bVar == bVar2 && i16 < (i15 = this.f16172b0)) {
            i16 = i15;
        }
        if (bVarArr[1] == bVar2 && i17 < (i14 = this.f16174c0)) {
            i17 = i14;
        }
        this.f16172b0 = i16;
        this.f16174c0 = i17;
        int i18 = this.f16196n0;
        if (i17 < i18) {
            this.f16174c0 = i18;
        }
        int i19 = this.f16194m0;
        if (i16 < i19) {
            this.f16172b0 = i19;
        }
        int i20 = this.A;
        if (i20 > 0 && bVarArr[0] == b.MATCH_CONSTRAINT) {
            this.f16172b0 = Math.min(this.f16172b0, i20);
        }
        int i21 = this.D;
        if (i21 > 0 && this.Z[1] == b.MATCH_CONSTRAINT) {
            this.f16174c0 = Math.min(this.f16174c0, i21);
        }
        int i22 = this.f16172b0;
        if (i16 != i22) {
            this.f16191l = i22;
        }
        int i23 = this.f16174c0;
        if (i17 == i23) {
            return;
        }
        this.f16193m = i23;
    }

    public e H(int i10) {
        d dVar;
        d dVar2;
        if (i10 != 0) {
            if (i10 != 1 || (dVar2 = (dVar = this.R).f16159f) == null || dVar2.f16159f != dVar) {
                return null;
            }
            return dVar2.f16157d;
        }
        d dVar3 = this.Q;
        d dVar4 = dVar3.f16159f;
        if (dVar4 != null && dVar4.f16159f == dVar3) {
            return dVar4.f16157d;
        }
        return null;
    }

    public void H0(boolean z10) {
        this.J = z10;
    }

    public e I() {
        return this.f16170a0;
    }

    public void I0(int i10) {
        this.f16174c0 = i10;
        int i11 = this.f16196n0;
        if (i10 < i11) {
            this.f16174c0 = i11;
        }
    }

    public e J(int i10) {
        d dVar;
        d dVar2;
        if (i10 != 0) {
            if (i10 != 1 || (dVar2 = (dVar = this.P).f16159f) == null || dVar2.f16159f != dVar) {
                return null;
            }
            return dVar2.f16157d;
        }
        d dVar3 = this.O;
        d dVar4 = dVar3.f16159f;
        if (dVar4 != null && dVar4.f16159f == dVar3) {
            return dVar4.f16157d;
        }
        return null;
    }

    public void J0(float f10) {
        this.f16198o0 = f10;
    }

    public int K() {
        return V() + this.f16172b0;
    }

    public void K0(int i10) {
        this.f16220z0 = i10;
    }

    public p L(int i10) {
        if (i10 == 0) {
            return this.f16177e;
        }
        if (i10 != 1) {
            return null;
        }
        return this.f16179f;
    }

    public void L0(int i10, int i11) {
        this.f16180f0 = i10;
        int i12 = i11 - i10;
        this.f16172b0 = i12;
        int i13 = this.f16194m0;
        if (i12 < i13) {
            this.f16172b0 = i13;
        }
    }

    public void M(StringBuilder sb2) {
        sb2.append("  " + this.f16197o + ":{\n");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("    actualWidth:");
        sb3.append(this.f16172b0);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.f16174c0);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.f16180f0);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.f16182g0);
        sb2.append("\n");
        O(sb2, "left", this.O);
        O(sb2, "top", this.P);
        O(sb2, "right", this.Q);
        O(sb2, "bottom", this.R);
        O(sb2, "baseline", this.S);
        O(sb2, "centerX", this.T);
        O(sb2, "centerY", this.U);
        N(sb2, "    width", this.f16172b0, this.f16194m0, this.H[0], this.f16191l, this.f16219z, this.f16213w, this.B, this.D0[0]);
        N(sb2, "    height", this.f16174c0, this.f16196n0, this.H[1], this.f16193m, this.C, this.f16215x, this.E, this.D0[1]);
        w0(sb2, "    dimensionRatio", this.f16176d0, this.f16178e0);
        u0(sb2, "    horizontalBias", this.f16198o0, K0);
        u0(sb2, "    verticalBias", this.f16200p0, K0);
        v0(sb2, "    horizontalChainStyle", this.f16220z0, 0);
        v0(sb2, "    verticalChainStyle", this.A0, 0);
        sb2.append("  }");
    }

    public void M0(b bVar) {
        this.Z[0] = bVar;
    }

    public void N0(int i10, int i11, int i12, float f10) {
        this.f16213w = i10;
        this.f16219z = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.A = i12;
        this.B = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f16213w = 2;
    }

    public void O0(float f10) {
        this.D0[0] = f10;
    }

    public float P() {
        return this.f16200p0;
    }

    public void P0(int i10, boolean z10) {
        this.Y[i10] = z10;
    }

    public int Q() {
        return this.A0;
    }

    public void Q0(boolean z10) {
        this.K = z10;
    }

    public b R() {
        return this.Z[1];
    }

    public void R0(boolean z10) {
        this.L = z10;
    }

    public int S() {
        int i10 = 0;
        if (this.O != null) {
            i10 = 0 + this.P.f16160g;
        }
        return this.Q != null ? i10 + this.R.f16160g : i10;
    }

    public void S0(int i10, int i11) {
        this.M = i10;
        this.N = i11;
        V0(false);
    }

    public int T() {
        return this.f16206s0;
    }

    public void T0(int i10) {
        this.H[1] = i10;
    }

    public int U() {
        if (this.f16206s0 == 8) {
            return 0;
        }
        return this.f16172b0;
    }

    public void U0(int i10) {
        this.H[0] = i10;
    }

    public int V() {
        e eVar = this.f16170a0;
        return (eVar == null || !(eVar instanceof f)) ? this.f16180f0 : ((f) eVar).S0 + this.f16180f0;
    }

    public void V0(boolean z10) {
        this.f16185i = z10;
    }

    public int W() {
        e eVar = this.f16170a0;
        return (eVar == null || !(eVar instanceof f)) ? this.f16182g0 : ((f) eVar).T0 + this.f16182g0;
    }

    public void W0(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        this.f16196n0 = i10;
    }

    public boolean X() {
        return this.J;
    }

    public void X0(int i10) {
        if (i10 < 0) {
            i10 = 0;
        }
        this.f16194m0 = i10;
    }

    public boolean Y(int i10) {
        if (i10 == 0) {
            return (this.O.f16159f != null ? 1 : 0) + (this.Q.f16159f != null ? 1 : 0) < 2;
        }
        return ((this.P.f16159f != null ? 1 : 0) + (this.R.f16159f != null ? 1 : 0)) + (this.S.f16159f != null ? 1 : 0) < 2;
    }

    public void Y0(int i10, int i11) {
        this.f16180f0 = i10;
        this.f16182g0 = i11;
    }

    public boolean Z() {
        int size = this.X.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.X.get(i10).l()) {
                return true;
            }
        }
        return false;
    }

    public void Z0(e eVar) {
        this.f16170a0 = eVar;
    }

    public boolean a0() {
        return (this.f16191l == -1 && this.f16193m == -1) ? false : true;
    }

    public void a1(float f10) {
        this.f16200p0 = f10;
    }

    public boolean b0(int i10, int i11) {
        d dVar;
        d dVar2;
        if (i10 == 0) {
            d dVar3 = this.O.f16159f;
            return dVar3 != null && dVar3.m() && (dVar2 = this.Q.f16159f) != null && dVar2.m() && (this.Q.f16159f.d() - this.Q.e()) - (this.O.f16159f.d() + this.O.e()) >= i11;
        }
        d dVar4 = this.P.f16159f;
        return dVar4 != null && dVar4.m() && (dVar = this.R.f16159f) != null && dVar.m() && (this.R.f16159f.d() - this.R.e()) - (this.P.f16159f.d() + this.P.e()) >= i11;
        return false;
    }

    public void b1(int i10) {
        this.A0 = i10;
    }

    public void c0(d.b bVar, e eVar, d.b bVar2, int i10, int i11) {
        m(bVar).a(eVar.m(bVar2), i10, i11, true);
    }

    public void c1(int i10, int i11) {
        this.f16182g0 = i10;
        int i12 = i11 - i10;
        this.f16174c0 = i12;
        int i13 = this.f16196n0;
        if (i12 < i13) {
            this.f16174c0 = i13;
        }
    }

    public void d1(b bVar) {
        this.Z[1] = bVar;
    }

    public void e(f fVar, j0.d dVar, HashSet<e> hashSet, int i10, boolean z10) {
        if (z10) {
            if (!hashSet.contains(this)) {
                return;
            }
            j.a(fVar, dVar, this);
            hashSet.remove(this);
            g(dVar, fVar.P1(64));
        }
        if (i10 == 0) {
            HashSet<d> c10 = this.O.c();
            if (c10 != null) {
                Iterator<d> it = c10.iterator();
                while (it.hasNext()) {
                    it.next().f16157d.e(fVar, dVar, hashSet, i10, true);
                }
            }
            HashSet<d> c11 = this.Q.c();
            if (c11 == null) {
                return;
            }
            Iterator<d> it2 = c11.iterator();
            while (it2.hasNext()) {
                it2.next().f16157d.e(fVar, dVar, hashSet, i10, true);
            }
            return;
        }
        HashSet<d> c12 = this.P.c();
        if (c12 != null) {
            Iterator<d> it3 = c12.iterator();
            while (it3.hasNext()) {
                it3.next().f16157d.e(fVar, dVar, hashSet, i10, true);
            }
        }
        HashSet<d> c13 = this.R.c();
        if (c13 != null) {
            Iterator<d> it4 = c13.iterator();
            while (it4.hasNext()) {
                it4.next().f16157d.e(fVar, dVar, hashSet, i10, true);
            }
        }
        HashSet<d> c14 = this.S.c();
        if (c14 == null) {
            return;
        }
        Iterator<d> it5 = c14.iterator();
        while (it5.hasNext()) {
            it5.next().f16157d.e(fVar, dVar, hashSet, i10, true);
        }
    }

    public boolean e0() {
        return this.f16203r;
    }

    public void e1(int i10, int i11, int i12, float f10) {
        this.f16215x = i10;
        this.C = i11;
        if (i12 == Integer.MAX_VALUE) {
            i12 = 0;
        }
        this.D = i12;
        this.E = f10;
        if (f10 <= 0.0f || f10 >= 1.0f || i10 != 0) {
            return;
        }
        this.f16215x = 2;
    }

    public boolean f() {
        return (this instanceof k) || (this instanceof g);
    }

    public boolean f0(int i10) {
        return this.Y[i10];
    }

    public void f1(float f10) {
        this.D0[1] = f10;
    }

    /* JADX WARN: Removed duplicated region for block: B:125:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0395  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x039d  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03ac  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0448  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x04ac  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x04c0  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x04c2  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x055d  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0560  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05a6  */
    /* JADX WARN: Removed duplicated region for block: B:314:0x05cc  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0184  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(j0.d r54, boolean r55) {
        /*
            Method dump skipped, instructions count: 1532
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: m0.e.g(j0.d, boolean):void");
    }

    public boolean g0() {
        d dVar = this.O;
        d dVar2 = dVar.f16159f;
        if (dVar2 == null || dVar2.f16159f != dVar) {
            d dVar3 = this.Q;
            d dVar4 = dVar3.f16159f;
            return dVar4 != null && dVar4.f16159f == dVar3;
        }
        return true;
    }

    public void g1(int i10) {
        this.f16206s0 = i10;
    }

    public boolean h() {
        return this.f16206s0 != 8;
    }

    public boolean h0() {
        return this.K;
    }

    public void h1(int i10) {
        this.f16172b0 = i10;
        int i11 = this.f16194m0;
        if (i10 < i11) {
            this.f16172b0 = i11;
        }
    }

    public boolean i0() {
        d dVar = this.P;
        d dVar2 = dVar.f16159f;
        if (dVar2 == null || dVar2.f16159f != dVar) {
            d dVar3 = this.R;
            d dVar4 = dVar3.f16159f;
            return dVar4 != null && dVar4.f16159f == dVar3;
        }
        return true;
    }

    public void i1(int i10) {
        if (i10 < 0 || i10 > 3) {
            return;
        }
        this.f16211v = i10;
    }

    public void j(e eVar, float f10, int i10) {
        d.b bVar = d.b.CENTER;
        c0(bVar, eVar, bVar, i10, 0);
        this.I = f10;
    }

    public boolean j0() {
        return this.L;
    }

    public void j1(int i10) {
        this.f16180f0 = i10;
    }

    public void k(j0.d dVar) {
        dVar.q(this.O);
        dVar.q(this.P);
        dVar.q(this.Q);
        dVar.q(this.R);
        if (this.f16192l0 > 0) {
            dVar.q(this.S);
        }
    }

    public boolean k0() {
        return this.f16185i && this.f16206s0 != 8;
    }

    public void k1(int i10) {
        this.f16182g0 = i10;
    }

    public void l() {
        if (this.f16177e == null) {
            this.f16177e = new n0.l(this);
        }
        if (this.f16179f == null) {
            this.f16179f = new n(this);
        }
    }

    public boolean l0() {
        return this.f16199p || (this.O.m() && this.Q.m());
    }

    public void l1(boolean z10, boolean z11, boolean z12, boolean z13) {
        if (this.F == -1) {
            if (z12 && !z13) {
                this.F = 0;
            } else if (!z12 && z13) {
                this.F = 1;
                if (this.f16178e0 == -1) {
                    this.G = 1.0f / this.G;
                }
            }
        }
        if (this.F == 0 && (!this.P.n() || !this.R.n())) {
            this.F = 1;
        } else if (this.F == 1 && (!this.O.n() || !this.Q.n())) {
            this.F = 0;
        }
        if (this.F == -1 && (!this.P.n() || !this.R.n() || !this.O.n() || !this.Q.n())) {
            if (this.P.n() && this.R.n()) {
                this.F = 0;
            } else if (this.O.n() && this.Q.n()) {
                this.G = 1.0f / this.G;
                this.F = 1;
            }
        }
        if (this.F == -1) {
            int i10 = this.f16219z;
            if (i10 > 0 && this.C == 0) {
                this.F = 0;
            } else if (i10 != 0 || this.C <= 0) {
            } else {
                this.G = 1.0f / this.G;
                this.F = 1;
            }
        }
    }

    public d m(d.b bVar) {
        switch (a.f16221a[bVar.ordinal()]) {
            case 1:
                return this.O;
            case 2:
                return this.P;
            case 3:
                return this.Q;
            case 4:
                return this.R;
            case 5:
                return this.S;
            case 6:
                return this.V;
            case 7:
                return this.T;
            case 8:
                return this.U;
            case 9:
                return null;
            default:
                throw new AssertionError(bVar.name());
        }
    }

    public boolean m0() {
        return this.f16201q || (this.P.m() && this.R.m());
    }

    public void m1(boolean z10, boolean z11) {
        int i10;
        int i11;
        boolean k10 = z10 & this.f16177e.k();
        boolean k11 = z11 & this.f16179f.k();
        n0.l lVar = this.f16177e;
        int i12 = lVar.f16832h.f16782g;
        n nVar = this.f16179f;
        int i13 = nVar.f16832h.f16782g;
        int i14 = lVar.f16833i.f16782g;
        int i15 = nVar.f16833i.f16782g;
        int i16 = i15 - i13;
        if (i14 - i12 < 0 || i16 < 0 || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE || i14 == Integer.MIN_VALUE || i14 == Integer.MAX_VALUE || i15 == Integer.MIN_VALUE || i15 == Integer.MAX_VALUE) {
            i14 = 0;
            i12 = 0;
            i15 = 0;
            i13 = 0;
        }
        int i17 = i14 - i12;
        int i18 = i15 - i13;
        if (k10) {
            this.f16180f0 = i12;
        }
        if (k11) {
            this.f16182g0 = i13;
        }
        if (this.f16206s0 == 8) {
            this.f16172b0 = 0;
            this.f16174c0 = 0;
            return;
        }
        if (k10) {
            if (this.Z[0] == b.FIXED && i17 < (i11 = this.f16172b0)) {
                i17 = i11;
            }
            this.f16172b0 = i17;
            int i19 = this.f16194m0;
            if (i17 < i19) {
                this.f16172b0 = i19;
            }
        }
        if (!k11) {
            return;
        }
        if (this.Z[1] == b.FIXED && i18 < (i10 = this.f16174c0)) {
            i18 = i10;
        }
        this.f16174c0 = i18;
        int i20 = this.f16196n0;
        if (i18 >= i20) {
            return;
        }
        this.f16174c0 = i20;
    }

    public int n() {
        return this.f16192l0;
    }

    public boolean n0() {
        return this.f16205s;
    }

    public void n1(j0.d dVar, boolean z10) {
        n nVar;
        n0.l lVar;
        int x10 = dVar.x(this.O);
        int x11 = dVar.x(this.P);
        int x12 = dVar.x(this.Q);
        int x13 = dVar.x(this.R);
        if (z10 && (lVar = this.f16177e) != null) {
            n0.f fVar = lVar.f16832h;
            if (fVar.f16785j) {
                n0.f fVar2 = lVar.f16833i;
                if (fVar2.f16785j) {
                    x10 = fVar.f16782g;
                    x12 = fVar2.f16782g;
                }
            }
        }
        if (z10 && (nVar = this.f16179f) != null) {
            n0.f fVar3 = nVar.f16832h;
            if (fVar3.f16785j) {
                n0.f fVar4 = nVar.f16833i;
                if (fVar4.f16785j) {
                    x11 = fVar3.f16782g;
                    x13 = fVar4.f16782g;
                }
            }
        }
        int i10 = x13 - x11;
        if (x12 - x10 < 0 || i10 < 0 || x10 == Integer.MIN_VALUE || x10 == Integer.MAX_VALUE || x11 == Integer.MIN_VALUE || x11 == Integer.MAX_VALUE || x12 == Integer.MIN_VALUE || x12 == Integer.MAX_VALUE || x13 == Integer.MIN_VALUE || x13 == Integer.MAX_VALUE) {
            x13 = 0;
            x10 = 0;
            x11 = 0;
            x12 = 0;
        }
        G0(x10, x11, x12, x13);
    }

    public float o(int i10) {
        if (i10 == 0) {
            return this.f16198o0;
        }
        if (i10 != 1) {
            return -1.0f;
        }
        return this.f16200p0;
    }

    public void o0() {
        this.f16203r = true;
    }

    public int p() {
        return W() + this.f16174c0;
    }

    public void p0() {
        this.f16205s = true;
    }

    public Object q() {
        return this.f16202q0;
    }

    public boolean q0() {
        b[] bVarArr = this.Z;
        b bVar = bVarArr[0];
        b bVar2 = b.MATCH_CONSTRAINT;
        return bVar == bVar2 && bVarArr[1] == bVar2;
    }

    public String r() {
        return this.f16210u0;
    }

    public void r0() {
        this.O.p();
        this.P.p();
        this.Q.p();
        this.R.p();
        this.S.p();
        this.T.p();
        this.U.p();
        this.V.p();
        this.f16170a0 = null;
        this.I = 0.0f;
        this.f16172b0 = 0;
        this.f16174c0 = 0;
        this.f16176d0 = 0.0f;
        this.f16178e0 = -1;
        this.f16180f0 = 0;
        this.f16182g0 = 0;
        this.f16188j0 = 0;
        this.f16190k0 = 0;
        this.f16192l0 = 0;
        this.f16194m0 = 0;
        this.f16196n0 = 0;
        float f10 = K0;
        this.f16198o0 = f10;
        this.f16200p0 = f10;
        b[] bVarArr = this.Z;
        b bVar = b.FIXED;
        bVarArr[0] = bVar;
        bVarArr[1] = bVar;
        this.f16202q0 = null;
        this.f16204r0 = 0;
        this.f16206s0 = 0;
        this.f16212v0 = null;
        this.f16214w0 = false;
        this.f16216x0 = false;
        this.f16220z0 = 0;
        this.A0 = 0;
        this.B0 = false;
        this.C0 = false;
        float[] fArr = this.D0;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.f16207t = -1;
        this.f16209u = -1;
        int[] iArr = this.H;
        iArr[0] = Integer.MAX_VALUE;
        iArr[1] = Integer.MAX_VALUE;
        this.f16213w = 0;
        this.f16215x = 0;
        this.B = 1.0f;
        this.E = 1.0f;
        this.A = Integer.MAX_VALUE;
        this.D = Integer.MAX_VALUE;
        this.f16219z = 0;
        this.C = 0;
        this.f16183h = false;
        this.F = -1;
        this.G = 1.0f;
        this.f16218y0 = false;
        boolean[] zArr = this.f16181g;
        zArr[0] = true;
        zArr[1] = true;
        this.L = false;
        boolean[] zArr2 = this.Y;
        zArr2[0] = false;
        zArr2[1] = false;
        this.f16185i = true;
        int[] iArr2 = this.f16217y;
        iArr2[0] = 0;
        iArr2[1] = 0;
        this.f16191l = -1;
        this.f16193m = -1;
    }

    public b s(int i10) {
        if (i10 == 0) {
            return y();
        }
        if (i10 != 1) {
            return null;
        }
        return R();
    }

    public void s0() {
        this.f16199p = false;
        this.f16201q = false;
        this.f16203r = false;
        this.f16205s = false;
        int size = this.X.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.X.get(i10).q();
        }
    }

    public float t() {
        return this.f16176d0;
    }

    public void t0(j0.c cVar) {
        this.O.r(cVar);
        this.P.r(cVar);
        this.Q.r(cVar);
        this.R.r(cVar);
        this.S.r(cVar);
        this.V.r(cVar);
        this.T.r(cVar);
        this.U.r(cVar);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        String str2 = this.f16212v0;
        String str3 = BuildConfig.FLAVOR;
        if (str2 != null) {
            str = "type: " + this.f16212v0 + " ";
        } else {
            str = str3;
        }
        sb2.append(str);
        if (this.f16210u0 != null) {
            str3 = "id: " + this.f16210u0 + " ";
        }
        sb2.append(str3);
        sb2.append("(");
        sb2.append(this.f16180f0);
        sb2.append(", ");
        sb2.append(this.f16182g0);
        sb2.append(") - (");
        sb2.append(this.f16172b0);
        sb2.append(" x ");
        sb2.append(this.f16174c0);
        sb2.append(")");
        return sb2.toString();
    }

    public int u() {
        return this.f16178e0;
    }

    public int v() {
        if (this.f16206s0 == 8) {
            return 0;
        }
        return this.f16174c0;
    }

    public float w() {
        return this.f16198o0;
    }

    public int x() {
        return this.f16220z0;
    }

    public void x0(int i10) {
        this.f16192l0 = i10;
        this.J = i10 > 0;
    }

    public b y() {
        return this.Z[0];
    }

    public void y0(Object obj) {
        this.f16202q0 = obj;
    }

    public int z() {
        d dVar = this.O;
        int i10 = 0;
        if (dVar != null) {
            i10 = 0 + dVar.f16160g;
        }
        d dVar2 = this.Q;
        return dVar2 != null ? i10 + dVar2.f16160g : i10;
    }

    public void z0(String str) {
        this.f16210u0 = str;
    }
}
