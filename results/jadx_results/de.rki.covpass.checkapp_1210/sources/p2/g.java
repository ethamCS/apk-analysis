package p2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public class g implements Cloneable {

    /* renamed from: k4 */
    public static final f[] f18746k4;

    /* renamed from: l4 */
    public static final List<ka.c>[] f18747l4 = new ArrayList[41];
    public double U3;
    public double V3;
    public int W3;
    public c X3;
    public t Y3;

    /* renamed from: c4 */
    public byte[] f18751c4;

    /* renamed from: d4 */
    public byte[] f18753d4;

    /* renamed from: i4 */
    public int f18758i4;

    /* renamed from: j4 */
    public boolean f18759j4;

    /* renamed from: x */
    public double f18761x;

    /* renamed from: y */
    public double f18762y;

    /* renamed from: c */
    public la.a f18750c = new la.a(4);

    /* renamed from: d */
    public la.a f18752d = new la.a(4);

    /* renamed from: q */
    public la.a f18760q = new la.a(4);
    public ok.b<a> Z3 = new ok.b<>(p2.f.f18745a);

    /* renamed from: a4 */
    public e f18748a4 = e.UNKNOWN;

    /* renamed from: b4 */
    public String f18749b4 = BuildConfig.FLAVOR;

    /* renamed from: e4 */
    public String f18754e4 = BuildConfig.FLAVOR;

    /* renamed from: f4 */
    public d f18755f4 = d.NONE;

    /* renamed from: g4 */
    public la.a f18756g4 = new la.a(4);

    /* renamed from: h4 */
    public ia.b f18757h4 = new ia.b();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: b */
        public int f18764b;

        /* renamed from: c */
        public int f18765c;

        /* renamed from: a */
        public ka.b f18763a = new ka.b();

        /* renamed from: d */
        ka.b f18766d = new ka.b();

        public void a(a aVar) {
            this.f18763a.k(aVar.f18763a);
            this.f18764b = aVar.f18764b;
            this.f18765c = aVar.f18765c;
            this.f18766d.k(aVar.f18766d);
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public final int f18767a;

        /* renamed from: b */
        public final int f18768b;

        /* renamed from: c */
        public final int f18769c;

        public b(int i10, int i11, int i12) {
            this.f18767a = i10;
            this.f18768b = i11;
            this.f18769c = i12;
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        L(1),
        M(0),
        Q(3),
        H(2);
        

        /* renamed from: c */
        final int f18774c;

        c(int i10) {
            this.f18774c = i10;
        }

        public static c g(int i10) {
            if (i10 != 0) {
                if (i10 == 1) {
                    return L;
                }
                if (i10 == 2) {
                    return H;
                }
                if (i10 != 3) {
                    throw new IllegalArgumentException("Unknown");
                }
                return Q;
            }
            return M;
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        NONE,
        FORMAT,
        VERSION,
        ALIGNMENT,
        READING_BITS,
        ERROR_CORRECTION,
        UNKNOWN_MODE,
        READING_PADDING,
        MESSAGE_OVERFLOW,
        DECODING_MESSAGE,
        KANJI_UNAVAILABLE,
        STRING_ENCODING_UNAVAILABLE
    }

    /* loaded from: classes.dex */
    public enum e {
        NUMERIC(1),
        ALPHANUMERIC(2),
        BYTE(4),
        KANJI(8),
        ECI(7),
        STRUCTURE_APPENDED(3),
        FNC1_FIRST(5),
        FNC1_SECOND(9),
        UNKNOWN(-1),
        MIXED(-2);
        

        /* renamed from: c */
        final int f18787c;

        e(int i10) {
            this.f18787c = i10;
        }

        public static e g(int i10) {
            e eVar = NUMERIC;
            if (eVar.f18787c == i10) {
                return eVar;
            }
            e eVar2 = ALPHANUMERIC;
            if (eVar2.f18787c == i10) {
                return eVar2;
            }
            e eVar3 = BYTE;
            if (eVar3.f18787c == i10) {
                return eVar3;
            }
            e eVar4 = KANJI;
            if (eVar4.f18787c == i10) {
                return eVar4;
            }
            e eVar5 = ECI;
            if (eVar5.f18787c == i10) {
                return eVar5;
            }
            e eVar6 = STRUCTURE_APPENDED;
            if (eVar6.f18787c == i10) {
                return eVar6;
            }
            e eVar7 = FNC1_FIRST;
            if (eVar7.f18787c == i10) {
                return eVar7;
            }
            e eVar8 = FNC1_SECOND;
            return eVar8.f18787c == i10 ? eVar8 : UNKNOWN;
        }
    }

    /* loaded from: classes.dex */
    public static class f {

        /* renamed from: a */
        public final int f18788a;

        /* renamed from: b */
        public final int[] f18789b;

        /* renamed from: c */
        public final Map<c, b> f18790c = new HashMap();

        public f(int i10, int[] iArr) {
            this.f18788a = i10;
            this.f18789b = iArr;
        }

        public void a(c cVar, int i10, int i11, int i12) {
            this.f18790c.put(cVar, new b(i10, i11, i12));
        }
    }

    static {
        f[] fVarArr = new f[41];
        f18746k4 = fVarArr;
        fVarArr[1] = new f(26, new int[0]);
        f fVar = fVarArr[1];
        c cVar = c.L;
        fVar.a(cVar, 26, 19, 1);
        f fVar2 = fVarArr[1];
        c cVar2 = c.M;
        fVar2.a(cVar2, 26, 16, 1);
        f fVar3 = fVarArr[1];
        c cVar3 = c.Q;
        fVar3.a(cVar3, 26, 13, 1);
        f fVar4 = fVarArr[1];
        c cVar4 = c.H;
        fVar4.a(cVar4, 26, 9, 1);
        fVarArr[2] = new f(44, new int[]{6, 18});
        fVarArr[2].a(cVar, 44, 34, 1);
        fVarArr[2].a(cVar2, 44, 28, 1);
        fVarArr[2].a(cVar3, 44, 22, 1);
        fVarArr[2].a(cVar4, 44, 16, 1);
        fVarArr[3] = new f(70, new int[]{6, 22});
        fVarArr[3].a(cVar, 70, 55, 1);
        fVarArr[3].a(cVar2, 70, 44, 1);
        fVarArr[3].a(cVar3, 35, 17, 2);
        fVarArr[3].a(cVar4, 35, 13, 2);
        fVarArr[4] = new f(100, new int[]{6, 26});
        fVarArr[4].a(cVar, 100, 80, 1);
        fVarArr[4].a(cVar2, 50, 32, 2);
        fVarArr[4].a(cVar3, 50, 24, 2);
        fVarArr[4].a(cVar4, 25, 9, 4);
        fVarArr[5] = new f(134, new int[]{6, 30});
        fVarArr[5].a(cVar, 134, 108, 1);
        fVarArr[5].a(cVar2, 67, 43, 2);
        fVarArr[5].a(cVar3, 33, 15, 2);
        fVarArr[5].a(cVar4, 33, 11, 2);
        fVarArr[6] = new f(172, new int[]{6, 34});
        fVarArr[6].a(cVar, 86, 68, 2);
        fVarArr[6].a(cVar2, 43, 27, 4);
        fVarArr[6].a(cVar3, 43, 19, 4);
        fVarArr[6].a(cVar4, 43, 15, 4);
        fVarArr[7] = new f(196, new int[]{6, 22, 38});
        fVarArr[7].a(cVar, 98, 78, 2);
        fVarArr[7].a(cVar2, 49, 31, 4);
        fVarArr[7].a(cVar3, 32, 14, 2);
        fVarArr[7].a(cVar4, 39, 13, 4);
        fVarArr[8] = new f(242, new int[]{6, 24, 42});
        fVarArr[8].a(cVar, 121, 97, 2);
        fVarArr[8].a(cVar2, 60, 38, 2);
        fVarArr[8].a(cVar3, 40, 18, 4);
        fVarArr[8].a(cVar4, 40, 14, 4);
        fVarArr[9] = new f(292, new int[]{6, 26, 46});
        fVarArr[9].a(cVar, 146, 116, 2);
        fVarArr[9].a(cVar2, 58, 36, 3);
        fVarArr[9].a(cVar3, 36, 16, 4);
        fVarArr[9].a(cVar4, 36, 12, 4);
        fVarArr[10] = new f(346, new int[]{6, 28, 50});
        fVarArr[10].a(cVar, 86, 68, 2);
        fVarArr[10].a(cVar2, 69, 43, 4);
        fVarArr[10].a(cVar3, 43, 19, 6);
        fVarArr[10].a(cVar4, 43, 15, 6);
        fVarArr[11] = new f(404, new int[]{6, 30, 54});
        fVarArr[11].a(cVar, 101, 81, 4);
        fVarArr[11].a(cVar2, 80, 50, 1);
        fVarArr[11].a(cVar3, 50, 22, 4);
        fVarArr[11].a(cVar4, 36, 12, 3);
        fVarArr[12] = new f(466, new int[]{6, 32, 58});
        fVarArr[12].a(cVar, 116, 92, 2);
        fVarArr[12].a(cVar2, 58, 36, 6);
        fVarArr[12].a(cVar3, 46, 20, 4);
        fVarArr[12].a(cVar4, 42, 14, 7);
        fVarArr[13] = new f(532, new int[]{6, 34, 62});
        fVarArr[13].a(cVar, 133, 107, 4);
        fVarArr[13].a(cVar2, 59, 37, 8);
        fVarArr[13].a(cVar3, 44, 20, 8);
        fVarArr[13].a(cVar4, 33, 11, 12);
        fVarArr[14] = new f(581, new int[]{6, 26, 46, 66});
        fVarArr[14].a(cVar, 145, 115, 3);
        fVarArr[14].a(cVar2, 64, 40, 4);
        fVarArr[14].a(cVar3, 36, 16, 11);
        fVarArr[14].a(cVar4, 36, 12, 11);
        fVarArr[15] = new f(655, new int[]{6, 26, 48, 70});
        fVarArr[15].a(cVar, 109, 87, 5);
        fVarArr[15].a(cVar2, 65, 41, 5);
        fVarArr[15].a(cVar3, 54, 24, 5);
        fVarArr[15].a(cVar4, 36, 12, 11);
        fVarArr[16] = new f(733, new int[]{6, 26, 50, 74});
        fVarArr[16].a(cVar, 122, 98, 5);
        fVarArr[16].a(cVar2, 73, 45, 7);
        fVarArr[16].a(cVar3, 43, 19, 15);
        fVarArr[16].a(cVar4, 45, 15, 3);
        fVarArr[17] = new f(815, new int[]{6, 30, 54, 78});
        fVarArr[17].a(cVar, 135, 107, 1);
        fVarArr[17].a(cVar2, 74, 46, 10);
        fVarArr[17].a(cVar3, 50, 22, 1);
        fVarArr[17].a(cVar4, 42, 14, 2);
        fVarArr[18] = new f(901, new int[]{6, 30, 56, 82});
        fVarArr[18].a(cVar, 150, 120, 5);
        fVarArr[18].a(cVar2, 69, 43, 9);
        fVarArr[18].a(cVar3, 50, 22, 17);
        fVarArr[18].a(cVar4, 42, 14, 2);
        fVarArr[19] = new f(991, new int[]{6, 30, 58, 86});
        fVarArr[19].a(cVar, 141, 113, 3);
        fVarArr[19].a(cVar2, 70, 44, 3);
        fVarArr[19].a(cVar3, 47, 21, 17);
        fVarArr[19].a(cVar4, 39, 13, 9);
        fVarArr[20] = new f(1085, new int[]{6, 34, 62, 90});
        fVarArr[20].a(cVar, 135, 107, 3);
        fVarArr[20].a(cVar2, 67, 41, 3);
        fVarArr[20].a(cVar3, 54, 24, 15);
        fVarArr[20].a(cVar4, 43, 15, 15);
        fVarArr[21] = new f(1156, new int[]{6, 28, 50, 72, 94});
        fVarArr[21].a(cVar, 144, 116, 4);
        fVarArr[21].a(cVar2, 68, 42, 17);
        fVarArr[21].a(cVar3, 50, 22, 17);
        fVarArr[21].a(cVar4, 46, 16, 19);
        fVarArr[22] = new f(1258, new int[]{6, 26, 50, 74, 98});
        fVarArr[22].a(cVar, 139, 111, 2);
        fVarArr[22].a(cVar2, 74, 46, 17);
        fVarArr[22].a(cVar3, 54, 24, 7);
        fVarArr[22].a(cVar4, 37, 13, 34);
        fVarArr[23] = new f(1364, new int[]{6, 30, 54, 78, 102});
        fVarArr[23].a(cVar, 151, 121, 4);
        fVarArr[23].a(cVar2, 75, 47, 4);
        fVarArr[23].a(cVar3, 54, 24, 11);
        fVarArr[23].a(cVar4, 45, 15, 16);
        fVarArr[24] = new f(1474, new int[]{6, 28, 54, 80, 106});
        fVarArr[24].a(cVar, 147, 117, 6);
        fVarArr[24].a(cVar2, 73, 45, 6);
        fVarArr[24].a(cVar3, 54, 24, 11);
        fVarArr[24].a(cVar4, 46, 16, 30);
        fVarArr[25] = new f(1588, new int[]{6, 32, 58, 84, androidx.constraintlayout.widget.i.E2});
        fVarArr[25].a(cVar, 132, 106, 8);
        fVarArr[25].a(cVar2, 75, 47, 8);
        fVarArr[25].a(cVar3, 54, 24, 7);
        fVarArr[25].a(cVar4, 45, 15, 22);
        fVarArr[26] = new f(1706, new int[]{6, 30, 58, 86, 114});
        fVarArr[26].a(cVar, 142, 114, 10);
        fVarArr[26].a(cVar2, 74, 46, 19);
        fVarArr[26].a(cVar3, 50, 22, 28);
        fVarArr[26].a(cVar4, 46, 16, 33);
        fVarArr[27] = new f(1828, new int[]{6, 34, 62, 90, 118});
        fVarArr[27].a(cVar, 152, 122, 8);
        fVarArr[27].a(cVar2, 73, 45, 22);
        fVarArr[27].a(cVar3, 53, 23, 8);
        fVarArr[27].a(cVar4, 45, 15, 12);
        fVarArr[28] = new f(1921, new int[]{6, 26, 50, 74, 98, 122});
        fVarArr[28].a(cVar, 147, 117, 3);
        fVarArr[28].a(cVar2, 73, 45, 3);
        fVarArr[28].a(cVar3, 54, 24, 4);
        fVarArr[28].a(cVar4, 45, 15, 11);
        fVarArr[29] = new f(2051, new int[]{6, 30, 54, 78, 102, e.j.M0});
        fVarArr[29].a(cVar, 146, 116, 7);
        fVarArr[29].a(cVar2, 73, 45, 21);
        fVarArr[29].a(cVar3, 53, 23, 1);
        fVarArr[29].a(cVar4, 45, 15, 19);
        fVarArr[30] = new f(2185, new int[]{6, 26, 52, 78, 104, 130});
        fVarArr[30].a(cVar, 145, 115, 5);
        fVarArr[30].a(cVar2, 75, 47, 19);
        fVarArr[30].a(cVar3, 54, 24, 15);
        fVarArr[30].a(cVar4, 45, 15, 23);
        fVarArr[31] = new f(2323, new int[]{6, 30, 56, 82, 108, 134});
        fVarArr[31].a(cVar, 145, 115, 13);
        fVarArr[31].a(cVar2, 74, 46, 2);
        fVarArr[31].a(cVar3, 54, 24, 42);
        fVarArr[31].a(cVar4, 45, 15, 23);
        fVarArr[32] = new f(2465, new int[]{6, 34, 60, 86, 112, 138});
        fVarArr[32].a(cVar, 145, 115, 17);
        fVarArr[32].a(cVar2, 74, 46, 10);
        fVarArr[32].a(cVar3, 54, 24, 10);
        fVarArr[32].a(cVar4, 45, 15, 19);
        fVarArr[33] = new f(2611, new int[]{6, 30, 58, 86, 114, 142});
        fVarArr[33].a(cVar, 145, 115, 17);
        fVarArr[33].a(cVar2, 74, 46, 14);
        fVarArr[33].a(cVar3, 54, 24, 29);
        fVarArr[33].a(cVar4, 45, 15, 11);
        fVarArr[34] = new f(2761, new int[]{6, 34, 62, 90, 118, 146});
        fVarArr[34].a(cVar, 145, 115, 13);
        fVarArr[34].a(cVar2, 74, 46, 14);
        fVarArr[34].a(cVar3, 54, 24, 44);
        fVarArr[34].a(cVar4, 46, 16, 59);
        fVarArr[35] = new f(2876, new int[]{6, 30, 54, 78, 102, e.j.M0, 150});
        fVarArr[35].a(cVar, 151, 121, 12);
        fVarArr[35].a(cVar2, 75, 47, 12);
        fVarArr[35].a(cVar3, 54, 24, 39);
        fVarArr[35].a(cVar4, 45, 15, 22);
        fVarArr[36] = new f(3034, new int[]{6, 24, 50, 76, 102, 128, 154});
        fVarArr[36].a(cVar, 151, 121, 6);
        fVarArr[36].a(cVar2, 75, 47, 6);
        fVarArr[36].a(cVar3, 54, 24, 46);
        fVarArr[36].a(cVar4, 45, 15, 2);
        fVarArr[37] = new f(3196, new int[]{6, 28, 54, 80, 106, 132, 158});
        fVarArr[37].a(cVar, 152, 122, 17);
        fVarArr[37].a(cVar2, 74, 46, 29);
        fVarArr[37].a(cVar3, 54, 24, 49);
        fVarArr[37].a(cVar4, 45, 15, 24);
        fVarArr[38] = new f(3362, new int[]{6, 32, 58, 84, androidx.constraintlayout.widget.i.E2, 136, 162});
        fVarArr[38].a(cVar, 152, 122, 4);
        fVarArr[38].a(cVar2, 74, 46, 13);
        fVarArr[38].a(cVar3, 54, 24, 48);
        fVarArr[38].a(cVar4, 45, 15, 42);
        fVarArr[39] = new f(3532, new int[]{6, 26, 54, 82, androidx.constraintlayout.widget.i.E2, 138, 166});
        fVarArr[39].a(cVar, 147, 117, 20);
        fVarArr[39].a(cVar2, 75, 47, 40);
        fVarArr[39].a(cVar3, 54, 24, 43);
        fVarArr[39].a(cVar4, 45, 15, 10);
        fVarArr[40] = new f(3706, new int[]{6, 30, 58, 86, 114, 142, 170});
        fVarArr[40].a(cVar, 148, 118, 19);
        fVarArr[40].a(cVar2, 75, 47, 18);
        fVarArr[40].a(cVar3, 54, 24, 34);
        fVarArr[40].a(cVar4, 45, 15, 20);
        for (int i10 = 1; i10 <= 40; i10++) {
            f18747l4[i10] = m.p(i10).f18819x;
        }
    }

    public g() {
        d();
    }

    public static int f(int i10) {
        return (i10 * 4) + 17;
    }

    /* renamed from: a */
    public g clone() {
        return new g().e(this);
    }

    public int c() {
        return f(this.W3);
    }

    public void d() {
        for (int i10 = 0; i10 < 4; i10++) {
            this.f18752d.b(i10).i(0.0d, 0.0d);
            this.f18760q.b(i10).i(0.0d, 0.0d);
            this.f18750c.b(i10).i(0.0d, 0.0d);
        }
        this.f18762y = 0.0d;
        this.U3 = 0.0d;
        this.f18761x = 0.0d;
        this.W3 = -1;
        this.X3 = c.L;
        this.Y3 = t.f18855i;
        this.Z3.r();
        this.f18748a4 = e.UNKNOWN;
        this.f18755f4 = d.NONE;
        this.f18749b4 = BuildConfig.FLAVOR;
        this.f18751c4 = null;
        this.f18753d4 = null;
        this.f18754e4 = null;
        this.f18759j4 = false;
        this.f18758i4 = 0;
    }

    public g e(g gVar) {
        this.W3 = gVar.W3;
        this.X3 = gVar.X3;
        this.Y3 = gVar.Y3;
        this.f18748a4 = gVar.f18748a4;
        byte[] bArr = gVar.f18751c4;
        byte[] bArr2 = null;
        this.f18751c4 = bArr == null ? null : (byte[]) bArr.clone();
        byte[] bArr3 = gVar.f18753d4;
        if (bArr3 != null) {
            bArr2 = (byte[]) bArr3.clone();
        }
        this.f18753d4 = bArr2;
        this.f18754e4 = gVar.f18754e4;
        this.f18762y = gVar.f18762y;
        this.U3 = gVar.U3;
        this.f18761x = gVar.f18761x;
        this.f18752d.e(gVar.f18752d);
        this.f18760q.e(gVar.f18760q);
        this.f18750c.e(gVar.f18750c);
        this.f18755f4 = gVar.f18755f4;
        this.f18756g4.e(gVar.f18756g4);
        this.Z3.r();
        for (int i10 = 0; i10 < gVar.Z3.f18623d; i10++) {
            this.Z3.i().a(gVar.Z3.c(i10));
        }
        this.f18757h4.h(gVar.f18757h4);
        this.f18759j4 = gVar.f18759j4;
        this.f18758i4 = gVar.f18758i4;
        return this;
    }
}
