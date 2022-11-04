package bb;

import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ub.y0;
import ub.z0;
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a,\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0003\u001a\u00020\u00012\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u001a\n\u0010\b\u001a\u00020\u0000*\u00020\u0000\u001a\u0014\u0010\t\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0001\u001a\f\u0010\n\u001a\u00020\u0000*\u00020\u0000H\u0000\u001a6\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00012\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u001a,\u0010\u0010\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\f\b\u0002\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u001a0\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002\u001a8\u0010\u0014\u001a\u00020\u0000*\u00020\u00122\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u00012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005H\u0002\u001a\f\u0010\u0016\u001a\u00020\u0000*\u00020\u0015H\u0002\u001a\u0010\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002\u001a\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u000bH\u0002\u001a \u0010 \u001a\u00020\u001e*\u00020\u001c2\u0012\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u001e0\u001dH\u0002¨\u0006!"}, d2 = {BuildConfig.FLAVOR, BuildConfig.FLAVOR, "encodeFull", "spaceToPlus", "Ljava/nio/charset/Charset;", "Lio/ktor/utils/io/charsets/Charset;", "charset", "p", "o", "l", "n", BuildConfig.FLAVOR, "start", "end", "plusIsSpace", "j", "h", "g", BuildConfig.FLAVOR, "prefixEnd", "f", BuildConfig.FLAVOR, "t", BuildConfig.FLAVOR, "c2", "e", "digit", "s", "Lob/u;", "Lkotlin/Function1;", "Ltb/e0;", "block", "r", "ktor-http"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    private static final List<Byte> f5773a;

    /* renamed from: b */
    private static final List<Character> f5774b;

    /* renamed from: c */
    private static final List<Character> f5775c;

    /* renamed from: d */
    private static final List<Byte> f5776d;

    /* renamed from: e */
    private static final List<Character> f5777e;

    /* renamed from: f */
    private static final List<Byte> f5778f;

    /* renamed from: g */
    private static final Set<Character> f5779g;

    /* renamed from: h */
    private static final Set<Character> f5780h;

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "it", "Ltb/e0;", "b", "(B)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.l<Byte, tb.e0> {

        /* renamed from: c */
        final /* synthetic */ StringBuilder f5781c;

        /* renamed from: d */
        final /* synthetic */ boolean f5782d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(StringBuilder sb2, boolean z10) {
            super(1);
            this.f5781c = sb2;
            this.f5782d = z10;
        }

        public final void b(byte b10) {
            if (b.f5773a.contains(Byte.valueOf(b10)) || b.f5778f.contains(Byte.valueOf(b10))) {
                this.f5781c.append((char) b10);
            } else if (!this.f5782d || b10 != 32) {
                this.f5781c.append(b.t(b10));
            } else {
                this.f5781c.append('+');
            }
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ tb.e0 invoke(Byte b10) {
            b(b10.byteValue());
            return tb.e0.f22152a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "it", "Ltb/e0;", "b", "(B)V"}, k = 3, mv = {1, 6, 0})
    /* renamed from: bb.b$b */
    /* loaded from: classes.dex */
    public static final class C0078b extends hc.v implements gc.l<Byte, tb.e0> {

        /* renamed from: c */
        final /* synthetic */ StringBuilder f5783c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0078b(StringBuilder sb2) {
            super(1);
            this.f5783c = sb2;
        }

        public final void b(byte b10) {
            this.f5783c.append(b.t(b10));
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ tb.e0 invoke(Byte b10) {
            b(b10.byteValue());
            return tb.e0.f22152a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "it", "Ltb/e0;", "b", "(B)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class c extends hc.v implements gc.l<Byte, tb.e0> {

        /* renamed from: c */
        final /* synthetic */ boolean f5784c;

        /* renamed from: d */
        final /* synthetic */ StringBuilder f5785d;

        /* renamed from: q */
        final /* synthetic */ boolean f5786q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(boolean z10, StringBuilder sb2, boolean z11) {
            super(1);
            this.f5784c = z10;
            this.f5785d = sb2;
            this.f5786q = z11;
        }

        public final void b(byte b10) {
            if (b10 == 32) {
                if (this.f5784c) {
                    this.f5785d.append('+');
                } else {
                    this.f5785d.append("%20");
                }
            } else if (b.f5773a.contains(Byte.valueOf(b10)) || (!this.f5786q && b.f5776d.contains(Byte.valueOf(b10)))) {
                this.f5785d.append((char) b10);
            } else {
                this.f5785d.append(b.t(b10));
            }
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ tb.e0 invoke(Byte b10) {
            b(b10.byteValue());
            return tb.e0.f22152a;
        }
    }

    static {
        List m02;
        List<Character> o02;
        int s10;
        List m03;
        List<Character> o03;
        List m04;
        List<Character> o04;
        List<Character> k10;
        int s11;
        List<Character> k11;
        List<Character> k12;
        int s12;
        Set J0;
        Set J02;
        Set h10;
        Set J03;
        Set<Character> h11;
        Set e10;
        Set<Character> h12;
        m02 = ub.c0.m0(new nc.c('a', 'z'), new nc.c('A', 'Z'));
        o02 = ub.c0.o0(m02, new nc.c('0', '9'));
        s10 = ub.v.s(o02, 10);
        ArrayList arrayList = new ArrayList(s10);
        for (Character ch2 : o02) {
            arrayList.add(Byte.valueOf((byte) ch2.charValue()));
        }
        f5773a = arrayList;
        m03 = ub.c0.m0(new nc.c('a', 'z'), new nc.c('A', 'Z'));
        o03 = ub.c0.o0(m03, new nc.c('0', '9'));
        f5774b = o03;
        m04 = ub.c0.m0(new nc.c('a', 'f'), new nc.c('A', 'F'));
        o04 = ub.c0.o0(m04, new nc.c('0', '9'));
        f5775c = o04;
        k10 = ub.u.k(':', '/', '?', '#', '[', ']', '@', '!', '$', '&', '\'', '(', ')', '*', ',', ';', '=', '-', '.', '_', '~', '+');
        s11 = ub.v.s(k10, 10);
        ArrayList arrayList2 = new ArrayList(s11);
        for (Character ch3 : k10) {
            arrayList2.add(Byte.valueOf((byte) ch3.charValue()));
        }
        f5776d = arrayList2;
        k11 = ub.u.k(':', '@', '!', '$', '&', '\'', '(', ')', '*', '+', ',', ';', '=', '-', '.', '_', '~');
        f5777e = k11;
        k12 = ub.u.k('-', '.', '_', '~');
        s12 = ub.v.s(k12, 10);
        ArrayList arrayList3 = new ArrayList(s12);
        for (Character ch4 : k12) {
            arrayList3.add(Byte.valueOf((byte) ch4.charValue()));
        }
        f5778f = arrayList3;
        J0 = ub.c0.J0(new nc.c('a', 'z'));
        J02 = ub.c0.J0(new nc.c('A', 'Z'));
        h10 = z0.h(J0, J02);
        J03 = ub.c0.J0(new nc.c('0', '9'));
        h11 = z0.h(h10, J03);
        f5779g = h11;
        e10 = y0.e('!', '#', '%', '&', '\'', '*', '+', '-', '.', '^', '_', '`', '|', '~');
        h12 = z0.h(e10, h11);
        f5780h = h12;
    }

    private static final int e(char c10) {
        boolean z10 = true;
        if ('0' <= c10 && c10 < ':') {
            return c10 - '0';
        }
        char c11 = 'A';
        if (!('A' <= c10 && c10 < 'G')) {
            c11 = 'a';
            if ('a' > c10 || c10 >= 'g') {
                z10 = false;
            }
            if (!z10) {
                return -1;
            }
        }
        return (c10 - c11) + 10;
    }

    private static final String f(CharSequence charSequence, int i10, int i11, int i12, boolean z10, Charset charset) {
        int i13;
        int i14 = i11 - i10;
        if (i14 > 255) {
            i14 /= 3;
        }
        StringBuilder sb2 = new StringBuilder(i14);
        if (i12 > i10) {
            sb2.append(charSequence, i10, i12);
        }
        byte[] bArr = null;
        while (i12 < i11) {
            char charAt = charSequence.charAt(i12);
            if (z10 && charAt == '+') {
                charAt = ' ';
            } else if (charAt == '%') {
                if (bArr == null) {
                    bArr = new byte[(i11 - i12) / 3];
                }
                int i15 = 0;
                while (i12 < i11 && charSequence.charAt(i12) == '%') {
                    int i16 = i12 + 2;
                    if (i16 >= i11) {
                        throw new i0("Incomplete trailing HEX escape: " + charSequence.subSequence(i12, charSequence.length()).toString() + ", in " + ((Object) charSequence) + " at " + i12);
                    }
                    int e10 = e(charSequence.charAt(i12 + 1));
                    int e11 = e(charSequence.charAt(i16));
                    if (e10 == -1 || e11 == -1) {
                        throw new i0("Wrong HEX escape: %" + charSequence.charAt(i13) + charSequence.charAt(i16) + ", in " + ((Object) charSequence) + ", at " + i12);
                    }
                    bArr[i15] = (byte) ((e10 * 16) + e11);
                    i12 += 3;
                    i15++;
                }
                sb2.append(new String(bArr, 0, i15, charset));
            }
            sb2.append(charAt);
            i12++;
        }
        String sb3 = sb2.toString();
        hc.t.d(sb3, "sb.toString()");
        return sb3;
    }

    private static final String g(String str, int i10, int i11, boolean z10, Charset charset) {
        int i12 = i10;
        while (i12 < i11) {
            int i13 = i12 + 1;
            char charAt = str.charAt(i12);
            if (charAt == '%' || (z10 && charAt == '+')) {
                return f(str, i10, i11, i12, z10, charset);
            }
            i12 = i13;
        }
        if (i10 == 0 && i11 == str.length()) {
            return str;
        }
        String substring = str.substring(i10, i11);
        hc.t.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        return substring;
    }

    public static final String h(String str, int i10, int i11, Charset charset) {
        hc.t.e(str, "<this>");
        hc.t.e(charset, "charset");
        return g(str, i10, i11, false, charset);
    }

    public static /* synthetic */ String i(String str, int i10, int i11, Charset charset, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            charset = bf.d.f5986b;
        }
        return h(str, i10, i11, charset);
    }

    public static final String j(String str, int i10, int i11, boolean z10, Charset charset) {
        hc.t.e(str, "<this>");
        hc.t.e(charset, "charset");
        return g(str, i10, i11, z10, charset);
    }

    public static /* synthetic */ String k(String str, int i10, int i11, boolean z10, Charset charset, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            i11 = str.length();
        }
        if ((i12 & 4) != 0) {
            z10 = false;
        }
        if ((i12 & 8) != 0) {
            charset = bf.d.f5986b;
        }
        return j(str, i10, i11, z10, charset);
    }

    public static final String l(String str, boolean z10) {
        hc.t.e(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        CharsetEncoder newEncoder = bf.d.f5986b.newEncoder();
        hc.t.d(newEncoder, "UTF_8.newEncoder()");
        r(mb.b.d(newEncoder, str, 0, 0, 6, null), new a(sb2, z10));
        String sb3 = sb2.toString();
        hc.t.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static /* synthetic */ String m(String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return l(str, z10);
    }

    public static final String n(String str) {
        hc.t.e(str, "<this>");
        return l(str, true);
    }

    public static final String o(String str) {
        boolean f10;
        int i10;
        hc.t.e(str, "<this>");
        StringBuilder sb2 = new StringBuilder();
        Charset charset = bf.d.f5986b;
        int i11 = 0;
        while (i11 < str.length()) {
            char charAt = str.charAt(i11);
            if (charAt == '/' || f5774b.contains(Character.valueOf(charAt)) || f5777e.contains(Character.valueOf(charAt))) {
                sb2.append(charAt);
                i11++;
            } else {
                if (charAt == '%' && (i10 = i11 + 2) < str.length()) {
                    List<Character> list = f5775c;
                    int i12 = i11 + 1;
                    if (list.contains(Character.valueOf(str.charAt(i12))) && list.contains(Character.valueOf(str.charAt(i10)))) {
                        sb2.append(charAt);
                        sb2.append(str.charAt(i12));
                        sb2.append(str.charAt(i10));
                        i11 += 3;
                    }
                }
                f10 = bf.c.f(charAt);
                int i13 = f10 ? 2 : 1;
                CharsetEncoder newEncoder = charset.newEncoder();
                hc.t.d(newEncoder, "charset.newEncoder()");
                int i14 = i13 + i11;
                r(mb.b.c(newEncoder, str, i11, i14), new C0078b(sb2));
                i11 = i14;
            }
        }
        String sb3 = sb2.toString();
        hc.t.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static final String p(String str, boolean z10, boolean z11, Charset charset) {
        hc.t.e(str, "<this>");
        hc.t.e(charset, "charset");
        StringBuilder sb2 = new StringBuilder();
        CharsetEncoder newEncoder = charset.newEncoder();
        hc.t.d(newEncoder, "charset.newEncoder()");
        r(mb.b.d(newEncoder, str, 0, 0, 6, null), new c(z11, sb2, z10));
        String sb3 = sb2.toString();
        hc.t.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    public static /* synthetic */ String q(String str, boolean z10, boolean z11, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        if ((i10 & 4) != 0) {
            charset = bf.d.f5986b;
        }
        return p(str, z10, z11, charset);
    }

    private static final void r(ob.u uVar, gc.l<? super Byte, tb.e0> lVar) {
        Throwable th2;
        boolean z10 = true;
        pb.a f10 = pb.h.f(uVar, 1);
        if (f10 == null) {
            return;
        }
        while (true) {
            try {
                if (f10.s() > f10.p()) {
                    lVar.invoke(Byte.valueOf(f10.readByte()));
                } else {
                    try {
                        f10 = pb.h.h(uVar, f10);
                        if (f10 == null) {
                            return;
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        z10 = false;
                        if (z10) {
                            pb.h.c(uVar, f10);
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th4) {
                th2 = th4;
            }
        }
    }

    private static final char s(int i10) {
        boolean z10 = false;
        if (i10 >= 0 && i10 < 10) {
            z10 = true;
        }
        return (char) (z10 ? i10 + 48 : ((char) (i10 + 65)) - '\n');
    }

    public static final String t(byte b10) {
        StringBuilder sb2 = new StringBuilder(3);
        int i10 = b10 & 255;
        sb2.append('%');
        sb2.append(s(i10 >> 4));
        sb2.append(s(i10 & 15));
        String sb3 = sb2.toString();
        hc.t.d(sb3, "StringBuilder(capacity).…builderAction).toString()");
        return sb3;
    }
}
