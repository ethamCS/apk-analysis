package bf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ub.k0;
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\f\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0019\n\u0002\b\b\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u000e\u001a\n\u0010\u0001\u001a\u00020\u0000*\u00020\u0000\u001a\u0012\u0010\u0005\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u001c\u0010\t\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0004\u001a\u001c\u0010\n\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004\u001a\u001c\u0010\u000b\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0004\u001a\u001c\u0010\f\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004\u001a\u001c\u0010\r\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0004\u001a\u001c\u0010\u000e\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0004\u001a\u0012\u0010\u0010\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0000\u001a\u0012\u0010\u0012\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0000\u001a\u001a\u0010\u0013\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0000\u001a\u0012\u0010\u0014\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0000\u001a4\u0010\u001c\u001a\u00020\u001a*\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0000\u001a\u001c\u0010\u001e\u001a\u00020\u001a*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u001a\u001c\u0010\u001f\u001a\u00020\u001a*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u001a\u001c\u0010 \u001a\u00020\u001a*\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u001a\u001c\u0010!\u001a\u00020\u001a*\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u001a&\u0010%\u001a\u00020\u0015*\u00020\u00002\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u001a&\u0010&\u001a\u00020\u0015*\u00020\u00002\u0006\u0010#\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u001a=\u0010)\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00002\u0006\u0010$\u001a\u00020\u00152\u0006\u0010'\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010(\u001a\u00020\u001aH\u0002¢\u0006\u0004\b)\u0010*\u001aG\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0004\u0018\u00010-*\u00020\u00002\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00040+2\u0006\u0010$\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010(\u001a\u00020\u001aH\u0002¢\u0006\u0004\b.\u0010/\u001a&\u00100\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010$\u001a\u00020\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u001a&\u00102\u001a\u00020\u0015*\u00020\u00002\u0006\u00101\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u001a&\u00103\u001a\u00020\u0015*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010$\u001a\u00020\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u001a&\u00104\u001a\u00020\u0015*\u00020\u00002\u0006\u00101\u001a\u00020\u00042\b\b\u0002\u0010$\u001a\u00020\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001a\u001a\u001f\u00105\u001a\u00020\u001a*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0086\u0002\u001a\u001f\u00106\u001a\u00020\u001a*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u001aH\u0086\u0002\u001a?\u0010:\u001a\b\u0012\u0004\u0012\u00020\u000209*\u00020\u00002\u0006\u00107\u001a\u00020\"2\b\b\u0002\u0010$\u001a\u00020\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u00108\u001a\u00020\u0015H\u0002¢\u0006\u0004\b:\u0010;\u001aG\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000209*\u00020\u00002\u000e\u00107\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040<2\b\b\u0002\u0010$\u001a\u00020\u00152\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u00108\u001a\u00020\u0015H\u0002¢\u0006\u0004\b=\u0010>\u001a\u0010\u0010@\u001a\u00020?2\u0006\u00108\u001a\u00020\u0015H\u0000\u001a?\u0010A\u001a\b\u0012\u0004\u0012\u00020\u000409*\u00020\u00002\u0012\u00107\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040<\"\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u00108\u001a\u00020\u0015¢\u0006\u0004\bA\u0010B\u001a?\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00040C*\u00020\u00002\u0012\u00107\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040<\"\u00020\u00042\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u00108\u001a\u00020\u0015¢\u0006\u0004\bD\u0010E\u001a0\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00040C*\u00020\u00002\n\u00107\u001a\u00020\"\"\u00020\u00062\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u00108\u001a\u00020\u0015\u001a1\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00040C*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u00108\u001a\u00020\u0015H\u0002¢\u0006\u0004\bG\u0010H\u001a\u0010\u0010I\u001a\b\u0012\u0004\u0012\u00020\u000409*\u00020\u0000\u001a\u0010\u0010J\u001a\b\u0012\u0004\u0012\u00020\u00040C*\u00020\u0000\"\u0015\u0010M\u001a\u00020\u0002*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bK\u0010L\"\u0015\u0010P\u001a\u00020\u0015*\u00020\u00008F¢\u0006\u0006\u001a\u0004\bN\u0010O¨\u0006Q"}, d2 = {BuildConfig.FLAVOR, "S0", "Lnc/g;", "range", BuildConfig.FLAVOR, "F0", BuildConfig.FLAVOR, "delimiter", "missingDelimiterValue", "M0", "N0", "G0", "H0", "Q0", "K0", "prefix", "p0", "suffix", "q0", "s0", "r0", BuildConfig.FLAVOR, "thisOffset", "other", "otherOffset", "length", BuildConfig.FLAVOR, "ignoreCase", "o0", "char", "B0", "O", "C0", "P", BuildConfig.FLAVOR, "chars", "startIndex", "b0", "h0", "endIndex", "last", "X", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;IIZZ)I", BuildConfig.FLAVOR, "strings", "Ltb/r;", "S", "(Ljava/lang/CharSequence;Ljava/util/Collection;IZZ)Ltb/r;", "V", "string", "W", "d0", "e0", "L", "K", "delimiters", "limit", "Laf/h;", "k0", "(Ljava/lang/CharSequence;[CIZI)Laf/h;", BuildConfig.FLAVOR, "l0", "(Ljava/lang/CharSequence;[Ljava/lang/String;IZI)Laf/h;", "Ltb/e0;", "t0", "z0", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Laf/h;", BuildConfig.FLAVOR, "v0", "(Ljava/lang/CharSequence;[Ljava/lang/String;ZI)Ljava/util/List;", "u0", "w0", "(Ljava/lang/CharSequence;Ljava/lang/String;ZI)Ljava/util/List;", "i0", "j0", "T", "(Ljava/lang/CharSequence;)Lnc/g;", "indices", "U", "(Ljava/lang/CharSequence;)I", "lastIndex", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/text/StringsKt")
/* loaded from: classes3.dex */
public class y extends x {

    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {BuildConfig.FLAVOR, BuildConfig.FLAVOR, "currentIndex", "Ltb/r;", "b", "(Ljava/lang/CharSequence;I)Ltb/r;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class a extends hc.v implements gc.p<CharSequence, Integer, tb.r<? extends Integer, ? extends Integer>> {

        /* renamed from: c */
        final /* synthetic */ char[] f6024c;

        /* renamed from: d */
        final /* synthetic */ boolean f6025d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(char[] cArr, boolean z10) {
            super(2);
            this.f6024c = cArr;
            this.f6025d = z10;
        }

        public final tb.r<Integer, Integer> b(CharSequence charSequence, int i10) {
            hc.t.e(charSequence, "$this$$receiver");
            int b02 = y.b0(charSequence, this.f6024c, i10, this.f6025d);
            if (b02 < 0) {
                return null;
            }
            return tb.x.a(Integer.valueOf(b02), 1);
        }

        @Override // gc.p
        public /* bridge */ /* synthetic */ tb.r<? extends Integer, ? extends Integer> u(CharSequence charSequence, Integer num) {
            return b(charSequence, num.intValue());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0010\r\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {BuildConfig.FLAVOR, BuildConfig.FLAVOR, "currentIndex", "Ltb/r;", "b", "(Ljava/lang/CharSequence;I)Ltb/r;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class b extends hc.v implements gc.p<CharSequence, Integer, tb.r<? extends Integer, ? extends Integer>> {

        /* renamed from: c */
        final /* synthetic */ List<String> f6026c;

        /* renamed from: d */
        final /* synthetic */ boolean f6027d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(List<String> list, boolean z10) {
            super(2);
            this.f6026c = list;
            this.f6027d = z10;
        }

        public final tb.r<Integer, Integer> b(CharSequence charSequence, int i10) {
            hc.t.e(charSequence, "$this$$receiver");
            tb.r S = y.S(charSequence, this.f6026c, i10, this.f6027d, false);
            if (S != null) {
                return tb.x.a(S.e(), Integer.valueOf(((String) S.f()).length()));
            }
            return null;
        }

        @Override // gc.p
        public /* bridge */ /* synthetic */ tb.r<? extends Integer, ? extends Integer> u(CharSequence charSequence, Integer num) {
            return b(charSequence, num.intValue());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lnc/g;", "it", BuildConfig.FLAVOR, "b", "(Lnc/g;)Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class c extends hc.v implements gc.l<nc.g, String> {

        /* renamed from: c */
        final /* synthetic */ CharSequence f6028c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(CharSequence charSequence) {
            super(1);
            this.f6028c = charSequence;
        }

        /* renamed from: b */
        public final String invoke(nc.g gVar) {
            hc.t.e(gVar, "it");
            return y.F0(this.f6028c, gVar);
        }
    }

    public static /* synthetic */ af.h A0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return z0(charSequence, strArr, z10, i10);
    }

    public static final boolean B0(CharSequence charSequence, char c10, boolean z10) {
        hc.t.e(charSequence, "<this>");
        return charSequence.length() > 0 && bf.c.e(charSequence.charAt(0), c10, z10);
    }

    public static final boolean C0(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        boolean I;
        hc.t.e(charSequence, "<this>");
        hc.t.e(charSequence2, "prefix");
        if (z10 || !(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            return o0(charSequence, 0, charSequence2, 0, charSequence2.length(), z10);
        }
        I = x.I((String) charSequence, (String) charSequence2, false, 2, null);
        return I;
    }

    public static /* synthetic */ boolean D0(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return B0(charSequence, c10, z10);
    }

    public static /* synthetic */ boolean E0(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return C0(charSequence, charSequence2, z10);
    }

    public static final String F0(CharSequence charSequence, nc.g gVar) {
        hc.t.e(charSequence, "<this>");
        hc.t.e(gVar, "range");
        return charSequence.subSequence(gVar.l().intValue(), gVar.k().intValue() + 1).toString();
    }

    public static final String G0(String str, char c10, String str2) {
        int Z;
        hc.t.e(str, "<this>");
        hc.t.e(str2, "missingDelimiterValue");
        Z = Z(str, c10, 0, false, 6, null);
        if (Z == -1) {
            return str2;
        }
        String substring = str.substring(Z + 1, str.length());
        hc.t.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static String H0(String str, String str2, String str3) {
        int a02;
        hc.t.e(str, "<this>");
        hc.t.e(str2, "delimiter");
        hc.t.e(str3, "missingDelimiterValue");
        a02 = a0(str, str2, 0, false, 6, null);
        if (a02 == -1) {
            return str3;
        }
        String substring = str.substring(a02 + str2.length(), str.length());
        hc.t.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ String I0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return G0(str, c10, str2);
    }

    public static /* synthetic */ String J0(String str, String str2, String str3, int i10, Object obj) {
        String H0;
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        H0 = H0(str, str2, str3);
        return H0;
    }

    public static final boolean K(CharSequence charSequence, char c10, boolean z10) {
        int Z;
        hc.t.e(charSequence, "<this>");
        Z = Z(charSequence, c10, 0, z10, 2, null);
        return Z >= 0;
    }

    public static final String K0(String str, char c10, String str2) {
        int f02;
        hc.t.e(str, "<this>");
        hc.t.e(str2, "missingDelimiterValue");
        f02 = f0(str, c10, 0, false, 6, null);
        if (f02 == -1) {
            return str2;
        }
        String substring = str.substring(f02 + 1, str.length());
        hc.t.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static boolean L(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        int a02;
        hc.t.e(charSequence, "<this>");
        hc.t.e(charSequence2, "other");
        if (charSequence2 instanceof String) {
            a02 = a0(charSequence, (String) charSequence2, 0, z10, 2, null);
            if (a02 >= 0) {
                return true;
            }
        } else if (Y(charSequence, charSequence2, 0, charSequence.length(), z10, false, 16, null) >= 0) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ String L0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return K0(str, c10, str2);
    }

    public static /* synthetic */ boolean M(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return K(charSequence, c10, z10);
    }

    public static final String M0(String str, char c10, String str2) {
        int Z;
        hc.t.e(str, "<this>");
        hc.t.e(str2, "missingDelimiterValue");
        Z = Z(str, c10, 0, false, 6, null);
        if (Z == -1) {
            return str2;
        }
        String substring = str.substring(0, Z);
        hc.t.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ boolean N(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        boolean L;
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        L = L(charSequence, charSequence2, z10);
        return L;
    }

    public static final String N0(String str, String str2, String str3) {
        int a02;
        hc.t.e(str, "<this>");
        hc.t.e(str2, "delimiter");
        hc.t.e(str3, "missingDelimiterValue");
        a02 = a0(str, str2, 0, false, 6, null);
        if (a02 == -1) {
            return str3;
        }
        String substring = str.substring(0, a02);
        hc.t.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final boolean O(CharSequence charSequence, char c10, boolean z10) {
        int U;
        hc.t.e(charSequence, "<this>");
        if (charSequence.length() > 0) {
            U = U(charSequence);
            if (bf.c.e(charSequence.charAt(U), c10, z10)) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ String O0(String str, char c10, String str2, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = str;
        }
        return M0(str, c10, str2);
    }

    public static final boolean P(CharSequence charSequence, CharSequence charSequence2, boolean z10) {
        boolean u10;
        hc.t.e(charSequence, "<this>");
        hc.t.e(charSequence2, "suffix");
        if (z10 || !(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            return o0(charSequence, charSequence.length() - charSequence2.length(), charSequence2, 0, charSequence2.length(), z10);
        }
        u10 = x.u((String) charSequence, (String) charSequence2, false, 2, null);
        return u10;
    }

    public static /* synthetic */ String P0(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        return N0(str, str2, str3);
    }

    public static /* synthetic */ boolean Q(CharSequence charSequence, char c10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return O(charSequence, c10, z10);
    }

    public static String Q0(String str, String str2, String str3) {
        int g02;
        hc.t.e(str, "<this>");
        hc.t.e(str2, "delimiter");
        hc.t.e(str3, "missingDelimiterValue");
        g02 = g0(str, str2, 0, false, 6, null);
        if (g02 == -1) {
            return str3;
        }
        String substring = str.substring(0, g02);
        hc.t.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static /* synthetic */ boolean R(CharSequence charSequence, CharSequence charSequence2, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return P(charSequence, charSequence2, z10);
    }

    public static /* synthetic */ String R0(String str, String str2, String str3, int i10, Object obj) {
        String Q0;
        if ((i10 & 2) != 0) {
            str3 = str;
        }
        Q0 = Q0(str, str2, str3);
        return Q0;
    }

    public static final tb.r<Integer, String> S(CharSequence charSequence, Collection<String> collection, int i10, boolean z10, boolean z11) {
        nc.e eVar;
        int a10;
        Object obj;
        String str;
        Object obj2;
        int U;
        int d10;
        int b10;
        Object r02;
        if (!z10 && collection.size() == 1) {
            r02 = ub.c0.r0(collection);
            String str2 = (String) r02;
            int a02 = !z11 ? a0(charSequence, str2, i10, false, 4, null) : g0(charSequence, str2, i10, false, 4, null);
            if (a02 >= 0) {
                return tb.x.a(Integer.valueOf(a02), str2);
            }
            return null;
        }
        if (!z11) {
            b10 = nc.m.b(i10, 0);
            eVar = new nc.g(b10, charSequence.length());
        } else {
            U = U(charSequence);
            d10 = nc.m.d(i10, U);
            eVar = nc.m.g(d10, 0);
        }
        if (charSequence instanceof String) {
            a10 = eVar.a();
            int b11 = eVar.b();
            int d11 = eVar.d();
            if ((d11 > 0 && a10 <= b11) || (d11 < 0 && b11 <= a10)) {
                while (true) {
                    Iterator<T> it = collection.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        String str3 = (String) obj2;
                        if (x.y(str3, 0, (String) charSequence, a10, str3.length(), z10)) {
                            break;
                        }
                    }
                    str = (String) obj2;
                    if (str == null) {
                        if (a10 == b11) {
                            break;
                        }
                        a10 += d11;
                    } else {
                        break;
                    }
                }
                return tb.x.a(Integer.valueOf(a10), str);
            }
            return null;
        }
        a10 = eVar.a();
        int b12 = eVar.b();
        int d12 = eVar.d();
        if ((d12 > 0 && a10 <= b12) || (d12 < 0 && b12 <= a10)) {
            while (true) {
                Iterator<T> it2 = collection.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it2.next();
                    String str4 = (String) obj;
                    if (o0(str4, 0, charSequence, a10, str4.length(), z10)) {
                        break;
                    }
                }
                str = (String) obj;
                if (str == null) {
                    if (a10 == b12) {
                        break;
                    }
                    a10 += d12;
                } else {
                    break;
                }
            }
            return tb.x.a(Integer.valueOf(a10), str);
        }
        return null;
    }

    public static CharSequence S0(CharSequence charSequence) {
        boolean c10;
        hc.t.e(charSequence, "<this>");
        int length = charSequence.length() - 1;
        int i10 = 0;
        boolean z10 = false;
        while (i10 <= length) {
            c10 = bf.b.c(charSequence.charAt(!z10 ? i10 : length));
            if (!z10) {
                if (!c10) {
                    z10 = true;
                } else {
                    i10++;
                }
            } else if (!c10) {
                break;
            } else {
                length--;
            }
        }
        return charSequence.subSequence(i10, length + 1);
    }

    public static nc.g T(CharSequence charSequence) {
        hc.t.e(charSequence, "<this>");
        return new nc.g(0, charSequence.length() - 1);
    }

    public static int U(CharSequence charSequence) {
        hc.t.e(charSequence, "<this>");
        return charSequence.length() - 1;
    }

    public static final int V(CharSequence charSequence, char c10, int i10, boolean z10) {
        hc.t.e(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? b0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).indexOf(c10, i10);
    }

    public static final int W(CharSequence charSequence, String str, int i10, boolean z10) {
        hc.t.e(charSequence, "<this>");
        hc.t.e(str, "string");
        return (z10 || !(charSequence instanceof String)) ? Y(charSequence, str, i10, charSequence.length(), z10, false, 16, null) : ((String) charSequence).indexOf(str, i10);
    }

    private static final int X(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11) {
        nc.e eVar;
        int U;
        int d10;
        int b10;
        int b11;
        int d11;
        if (!z11) {
            b11 = nc.m.b(i10, 0);
            d11 = nc.m.d(i11, charSequence.length());
            eVar = new nc.g(b11, d11);
        } else {
            U = U(charSequence);
            d10 = nc.m.d(i10, U);
            b10 = nc.m.b(i11, 0);
            eVar = nc.m.g(d10, b10);
        }
        if (!(charSequence instanceof String) || !(charSequence2 instanceof String)) {
            int a10 = eVar.a();
            int b12 = eVar.b();
            int d12 = eVar.d();
            if ((d12 <= 0 || a10 > b12) && (d12 >= 0 || b12 > a10)) {
                return -1;
            }
            while (!o0(charSequence2, 0, charSequence, a10, charSequence2.length(), z10)) {
                if (a10 == b12) {
                    return -1;
                }
                a10 += d12;
            }
            return a10;
        }
        int a11 = eVar.a();
        int b13 = eVar.b();
        int d13 = eVar.d();
        if ((d13 <= 0 || a11 > b13) && (d13 >= 0 || b13 > a11)) {
            return -1;
        }
        while (!x.y((String) charSequence2, 0, (String) charSequence, a11, charSequence2.length(), z10)) {
            if (a11 == b13) {
                return -1;
            }
            a11 += d13;
        }
        return a11;
    }

    static /* synthetic */ int Y(CharSequence charSequence, CharSequence charSequence2, int i10, int i11, boolean z10, boolean z11, int i12, Object obj) {
        if ((i12 & 16) != 0) {
            z11 = false;
        }
        return X(charSequence, charSequence2, i10, i11, z10, z11);
    }

    public static /* synthetic */ int Z(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return V(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int a0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return W(charSequence, str, i10, z10);
    }

    public static final int b0(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        int b10;
        int U;
        boolean z11;
        char T;
        hc.t.e(charSequence, "<this>");
        hc.t.e(cArr, "chars");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            T = ub.m.T(cArr);
            return ((String) charSequence).indexOf(T, i10);
        }
        b10 = nc.m.b(i10, 0);
        U = U(charSequence);
        k0 it = new nc.g(b10, U).iterator();
        while (it.hasNext()) {
            int b11 = it.b();
            char charAt = charSequence.charAt(b11);
            int length = cArr.length;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    z11 = false;
                    continue;
                    break;
                } else if (bf.c.e(cArr[i11], charAt, z10)) {
                    z11 = true;
                    continue;
                    break;
                } else {
                    i11++;
                }
            }
            if (z11) {
                return b11;
            }
        }
        return -1;
    }

    public static /* synthetic */ int c0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return b0(charSequence, cArr, i10, z10);
    }

    public static final int d0(CharSequence charSequence, char c10, int i10, boolean z10) {
        hc.t.e(charSequence, "<this>");
        return (z10 || !(charSequence instanceof String)) ? h0(charSequence, new char[]{c10}, i10, z10) : ((String) charSequence).lastIndexOf(c10, i10);
    }

    public static final int e0(CharSequence charSequence, String str, int i10, boolean z10) {
        hc.t.e(charSequence, "<this>");
        hc.t.e(str, "string");
        return (z10 || !(charSequence instanceof String)) ? X(charSequence, str, i10, 0, z10, true) : ((String) charSequence).lastIndexOf(str, i10);
    }

    public static /* synthetic */ int f0(CharSequence charSequence, char c10, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = U(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return d0(charSequence, c10, i10, z10);
    }

    public static /* synthetic */ int g0(CharSequence charSequence, String str, int i10, boolean z10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = U(charSequence);
        }
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        return e0(charSequence, str, i10, z10);
    }

    public static final int h0(CharSequence charSequence, char[] cArr, int i10, boolean z10) {
        int U;
        int d10;
        char T;
        hc.t.e(charSequence, "<this>");
        hc.t.e(cArr, "chars");
        if (!z10 && cArr.length == 1 && (charSequence instanceof String)) {
            T = ub.m.T(cArr);
            return ((String) charSequence).lastIndexOf(T, i10);
        }
        U = U(charSequence);
        for (d10 = nc.m.d(i10, U); -1 < d10; d10--) {
            char charAt = charSequence.charAt(d10);
            int length = cArr.length;
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                if (i11 >= length) {
                    break;
                } else if (bf.c.e(cArr[i11], charAt, z10)) {
                    z11 = true;
                    break;
                } else {
                    i11++;
                }
            }
            if (z11) {
                return d10;
            }
        }
        return -1;
    }

    public static final af.h<String> i0(CharSequence charSequence) {
        hc.t.e(charSequence, "<this>");
        return A0(charSequence, new String[]{"\r\n", "\n", "\r"}, false, 0, 6, null);
    }

    public static final List<String> j0(CharSequence charSequence) {
        List<String> F;
        hc.t.e(charSequence, "<this>");
        F = af.p.F(i0(charSequence));
        return F;
    }

    private static final af.h<nc.g> k0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11) {
        t0(i11);
        return new e(charSequence, i10, i11, new a(cArr, z10));
    }

    private static final af.h<nc.g> l0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11) {
        List d10;
        t0(i11);
        d10 = ub.l.d(strArr);
        return new e(charSequence, i10, i11, new b(d10, z10));
    }

    static /* synthetic */ af.h m0(CharSequence charSequence, char[] cArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return k0(charSequence, cArr, i10, z10, i11);
    }

    static /* synthetic */ af.h n0(CharSequence charSequence, String[] strArr, int i10, boolean z10, int i11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            i10 = 0;
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        return l0(charSequence, strArr, i10, z10, i11);
    }

    public static final boolean o0(CharSequence charSequence, int i10, CharSequence charSequence2, int i11, int i12, boolean z10) {
        hc.t.e(charSequence, "<this>");
        hc.t.e(charSequence2, "other");
        if (i11 < 0 || i10 < 0 || i10 > charSequence.length() - i12 || i11 > charSequence2.length() - i12) {
            return false;
        }
        for (int i13 = 0; i13 < i12; i13++) {
            if (!bf.c.e(charSequence.charAt(i10 + i13), charSequence2.charAt(i11 + i13), z10)) {
                return false;
            }
        }
        return true;
    }

    public static String p0(String str, CharSequence charSequence) {
        hc.t.e(str, "<this>");
        hc.t.e(charSequence, "prefix");
        if (E0(str, charSequence, false, 2, null)) {
            String substring = str.substring(charSequence.length());
            hc.t.d(substring, "this as java.lang.String).substring(startIndex)");
            return substring;
        }
        return str;
    }

    public static String q0(String str, CharSequence charSequence) {
        hc.t.e(str, "<this>");
        hc.t.e(charSequence, "suffix");
        if (R(str, charSequence, false, 2, null)) {
            String substring = str.substring(0, str.length() - charSequence.length());
            hc.t.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        return str;
    }

    public static String r0(String str, CharSequence charSequence) {
        hc.t.e(str, "<this>");
        hc.t.e(charSequence, "delimiter");
        return s0(str, charSequence, charSequence);
    }

    public static final String s0(String str, CharSequence charSequence, CharSequence charSequence2) {
        hc.t.e(str, "<this>");
        hc.t.e(charSequence, "prefix");
        hc.t.e(charSequence2, "suffix");
        if (str.length() < charSequence.length() + charSequence2.length() || !E0(str, charSequence, false, 2, null) || !R(str, charSequence2, false, 2, null)) {
            return str;
        }
        String substring = str.substring(charSequence.length(), str.length() - charSequence2.length());
        hc.t.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final void t0(int i10) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalArgumentException(("Limit must be non-negative, but was " + i10).toString());
    }

    public static final List<String> u0(CharSequence charSequence, char[] cArr, boolean z10, int i10) {
        Iterable<nc.g> m10;
        int s10;
        hc.t.e(charSequence, "<this>");
        hc.t.e(cArr, "delimiters");
        if (cArr.length == 1) {
            return w0(charSequence, String.valueOf(cArr[0]), z10, i10);
        }
        m10 = af.p.m(m0(charSequence, cArr, 0, z10, i10, 2, null));
        s10 = ub.v.s(m10, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (nc.g gVar : m10) {
            arrayList.add(F0(charSequence, gVar));
        }
        return arrayList;
    }

    public static final List<String> v0(CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        Iterable<nc.g> m10;
        int s10;
        hc.t.e(charSequence, "<this>");
        hc.t.e(strArr, "delimiters");
        boolean z11 = true;
        if (strArr.length == 1) {
            String str = strArr[0];
            if (str.length() != 0) {
                z11 = false;
            }
            if (!z11) {
                return w0(charSequence, str, z10, i10);
            }
        }
        m10 = af.p.m(n0(charSequence, strArr, 0, z10, i10, 2, null));
        s10 = ub.v.s(m10, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (nc.g gVar : m10) {
            arrayList.add(F0(charSequence, gVar));
        }
        return arrayList;
    }

    private static final List<String> w0(CharSequence charSequence, String str, boolean z10, int i10) {
        List<String> d10;
        t0(i10);
        int i11 = 0;
        int W = W(charSequence, str, 0, z10);
        if (W == -1 || i10 == 1) {
            d10 = ub.t.d(charSequence.toString());
            return d10;
        }
        boolean z11 = i10 > 0;
        int i12 = 10;
        if (z11) {
            i12 = nc.m.d(i10, 10);
        }
        ArrayList arrayList = new ArrayList(i12);
        do {
            arrayList.add(charSequence.subSequence(i11, W).toString());
            i11 = str.length() + W;
            if (z11 && arrayList.size() == i10 - 1) {
                break;
            }
            W = W(charSequence, str, i11, z10);
        } while (W != -1);
        arrayList.add(charSequence.subSequence(i11, charSequence.length()).toString());
        return arrayList;
    }

    public static /* synthetic */ List x0(CharSequence charSequence, char[] cArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return u0(charSequence, cArr, z10, i10);
    }

    public static /* synthetic */ List y0(CharSequence charSequence, String[] strArr, boolean z10, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        return v0(charSequence, strArr, z10, i10);
    }

    public static final af.h<String> z0(CharSequence charSequence, String[] strArr, boolean z10, int i10) {
        af.h<String> z11;
        hc.t.e(charSequence, "<this>");
        hc.t.e(strArr, "delimiters");
        z11 = af.p.z(n0(charSequence, strArr, 0, z10, i10, 2, null), new c(charSequence));
        return z11;
    }
}
