package m8;

import hc.t;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b \b\u0086\b\u0018\u00002\u00020\u0001:\u00011B\u0097\u0001\u0012\b\b\u0003\u0010\n\u001a\u00020\u0004\u0012\n\b\u0001\u0010\u000e\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u0012\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u001f\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010!\u001a\u00020\u0004\u0012\b\b\u0003\u0010#\u001a\u00020\u0004\u0012\b\b\u0003\u0010%\u001a\u00020\u0004\u0012\b\b\u0002\u0010'\u001a\u00020\b\u0012\b\b\u0003\u0010+\u001a\u00020\u0004\u0012\b\b\u0002\u0010-\u001a\u00020\u0002¢\u0006\u0004\b/\u00100J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÖ\u0003R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00060\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u001c\u0010\u0011R\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u000f\u001a\u0004\b\u001e\u0010\u0011R\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u000f\u001a\u0004\b \u0010\u0011R\u0017\u0010!\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u000b\u001a\u0004\b\"\u0010\rR\u0017\u0010#\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u000b\u001a\u0004\b$\u0010\rR\u0017\u0010%\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010\u000b\u001a\u0004\b&\u0010\rR\u0017\u0010'\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010+\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u000b\u001a\u0004\b,\u0010\rR\u0017\u0010-\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u0018\u001a\u0004\b.\u0010\u001a¨\u00062"}, d2 = {"Lm8/c;", "Ljava/io/Serializable;", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "styleRes", "I", "k", "()I", "titleRes", "Ljava/lang/Integer;", "r", "()Ljava/lang/Integer;", BuildConfig.FLAVOR, "titleFormatArgs", "Ljava/util/List;", "p", "()Ljava/util/List;", "messageString", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "positiveButtonTextRes", "j", "negativeButtonTextRes", "f", "neutralButtonTextRes", "h", "positiveActionColorRes", "i", "negativeActionColorRes", "e", "neutralActionColorRes", "g", "isCancelable", "Z", "s", "()Z", "iconRes", "b", "tag", "n", "<init>", "(ILjava/lang/Integer;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;IIIZILjava/lang/String;)V", "a", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class c implements Serializable {
    private static final a Companion = new a(null);
    @Deprecated

    /* renamed from: c4 */
    private static final String f16436c4;
    private final Integer U3;
    private final Integer V3;
    private final int W3;
    private final int X3;
    private final int Y3;
    private final boolean Z3;

    /* renamed from: a4 */
    private final int f16437a4;

    /* renamed from: b4 */
    private final String f16438b4;

    /* renamed from: c */
    private final int f16439c;

    /* renamed from: d */
    private final Integer f16440d;

    /* renamed from: q */
    private final List<Object> f16441q;

    /* renamed from: x */
    private final String f16442x;

    /* renamed from: y */
    private final Integer f16443y;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lm8/c$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "serialVersionUID", "J", "<init>", "()V", "common-app_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String canonicalName = c.class.getCanonicalName();
        if (canonicalName == null) {
            canonicalName = "DialogModel";
        }
        f16436c4 = canonicalName;
    }

    public c(int i10, Integer num, List<? extends Object> list, String str, Integer num2, Integer num3, Integer num4, int i11, int i12, int i13, boolean z10, int i14, String str2) {
        t.e(list, "titleFormatArgs");
        t.e(str, "messageString");
        t.e(str2, "tag");
        this.f16439c = i10;
        this.f16440d = num;
        this.f16441q = list;
        this.f16442x = str;
        this.f16443y = num2;
        this.U3 = num3;
        this.V3 = num4;
        this.W3 = i11;
        this.X3 = i12;
        this.Y3 = i13;
        this.Z3 = z10;
        this.f16437a4 = i14;
        this.f16438b4 = str2;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ c(int r17, java.lang.Integer r18, java.util.List r19, java.lang.String r20, java.lang.Integer r21, java.lang.Integer r22, java.lang.Integer r23, int r24, int r25, int r26, boolean r27, int r28, java.lang.String r29, int r30, kotlin.jvm.internal.DefaultConstructorMarker r31) {
        /*
            r16 = this;
            r0 = r30
            r1 = r0 & 1
            if (r1 == 0) goto La
            int r1 = j8.o.f_res_0x7f11015e
            r3 = r1
            goto Lc
        La:
            r3 = r17
        Lc:
            r1 = r0 & 4
            if (r1 == 0) goto L16
            java.util.List r1 = ub.s.h()
            r5 = r1
            goto L18
        L16:
            r5 = r19
        L18:
            r1 = r0 & 8
            if (r1 == 0) goto L20
            java.lang.String r1 = ""
            r6 = r1
            goto L22
        L20:
            r6 = r20
        L22:
            r1 = r0 & 32
            r2 = 0
            if (r1 == 0) goto L29
            r8 = r2
            goto L2b
        L29:
            r8 = r22
        L2b:
            r1 = r0 & 64
            if (r1 == 0) goto L31
            r9 = r2
            goto L33
        L31:
            r9 = r23
        L33:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L3b
            int r1 = j8.h.a_res_0x7f05003d
            r10 = r1
            goto L3d
        L3b:
            r10 = r24
        L3d:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L45
            int r1 = j8.h.a_res_0x7f05003d
            r11 = r1
            goto L47
        L45:
            r11 = r25
        L47:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L4f
            int r1 = j8.h.a_res_0x7f05003d
            r12 = r1
            goto L51
        L4f:
            r12 = r26
        L51:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L58
            r1 = 1
            r13 = r1
            goto L5a
        L58:
            r13 = r27
        L5a:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L61
            r1 = 0
            r14 = r1
            goto L63
        L61:
            r14 = r28
        L63:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L6b
            java.lang.String r0 = m8.c.f16436c4
            r15 = r0
            goto L6d
        L6b:
            r15 = r29
        L6d:
            r2 = r16
            r4 = r18
            r7 = r21
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: m8.c.<init>(int, java.lang.Integer, java.util.List, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.Integer, int, int, int, boolean, int, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final int b() {
        return this.f16437a4;
    }

    public final String c() {
        return this.f16442x;
    }

    public final int e() {
        return this.X3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f16439c == cVar.f16439c && t.a(this.f16440d, cVar.f16440d) && t.a(this.f16441q, cVar.f16441q) && t.a(this.f16442x, cVar.f16442x) && t.a(this.f16443y, cVar.f16443y) && t.a(this.U3, cVar.U3) && t.a(this.V3, cVar.V3) && this.W3 == cVar.W3 && this.X3 == cVar.X3 && this.Y3 == cVar.Y3 && this.Z3 == cVar.Z3 && this.f16437a4 == cVar.f16437a4 && t.a(this.f16438b4, cVar.f16438b4);
    }

    public final Integer f() {
        return this.U3;
    }

    public final int g() {
        return this.Y3;
    }

    public final Integer h() {
        return this.V3;
    }

    public int hashCode() {
        int i10 = this.f16439c * 31;
        Integer num = this.f16440d;
        int i11 = 0;
        int hashCode = (((((i10 + (num == null ? 0 : num.hashCode())) * 31) + this.f16441q.hashCode()) * 31) + this.f16442x.hashCode()) * 31;
        Integer num2 = this.f16443y;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.U3;
        int hashCode3 = (hashCode2 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.V3;
        if (num4 != null) {
            i11 = num4.hashCode();
        }
        int i12 = (((((((hashCode3 + i11) * 31) + this.W3) * 31) + this.X3) * 31) + this.Y3) * 31;
        boolean z10 = this.Z3;
        if (z10) {
            z10 = true;
        }
        int i13 = z10 ? 1 : 0;
        int i14 = z10 ? 1 : 0;
        return ((((i12 + i13) * 31) + this.f16437a4) * 31) + this.f16438b4.hashCode();
    }

    public final int i() {
        return this.W3;
    }

    public final Integer j() {
        return this.f16443y;
    }

    public final int k() {
        return this.f16439c;
    }

    public final String n() {
        return this.f16438b4;
    }

    public final List<Object> p() {
        return this.f16441q;
    }

    public final Integer r() {
        return this.f16440d;
    }

    public final boolean s() {
        return this.Z3;
    }

    public String toString() {
        int i10 = this.f16439c;
        Integer num = this.f16440d;
        List<Object> list = this.f16441q;
        String str = this.f16442x;
        Integer num2 = this.f16443y;
        Integer num3 = this.U3;
        Integer num4 = this.V3;
        int i11 = this.W3;
        int i12 = this.X3;
        int i13 = this.Y3;
        boolean z10 = this.Z3;
        int i14 = this.f16437a4;
        String str2 = this.f16438b4;
        return "DialogModel(styleRes=" + i10 + ", titleRes=" + num + ", titleFormatArgs=" + list + ", messageString=" + str + ", positiveButtonTextRes=" + num2 + ", negativeButtonTextRes=" + num3 + ", neutralButtonTextRes=" + num4 + ", positiveActionColorRes=" + i11 + ", negativeActionColorRes=" + i12 + ", neutralActionColorRes=" + i13 + ", isCancelable=" + z10 + ", iconRes=" + i14 + ", tag=" + str2 + ")";
    }
}
