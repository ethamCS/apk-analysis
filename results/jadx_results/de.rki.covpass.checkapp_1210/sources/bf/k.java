package bf;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\"B\u0011\b\u0001\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bB\u0011\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001dB\u001f\b\u0016\u0012\u0006\u0010\u001c\u001a\u00020\u000e\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b\u001a\u0010!J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0086\u0004J\u001a\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0007J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0007J\u0010\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0003J\u0016\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000eJ\"\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00030\u0011J\u001e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00152\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u0007J\b\u0010\u0017\u001a\u00020\u000eH\u0016¨\u0006#"}, d2 = {"Lbf/k;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", BuildConfig.FLAVOR, "input", BuildConfig.FLAVOR, "h", BuildConfig.FLAVOR, "startIndex", "Lbf/i;", "b", "Laf/h;", "e", "g", BuildConfig.FLAVOR, "replacement", "j", "Lkotlin/Function1;", "transform", "i", "limit", BuildConfig.FLAVOR, "k", "toString", "Ljava/util/regex/Pattern;", "nativePattern", "<init>", "(Ljava/util/regex/Pattern;)V", "pattern", "(Ljava/lang/String;)V", BuildConfig.FLAVOR, "Lbf/m;", "options", "(Ljava/lang/String;Ljava/util/Set;)V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes3.dex */
public final class k implements Serializable {
    public static final a Companion = new a(null);

    /* renamed from: c */
    private final Pattern f6011c;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¨\u0006\u0007"}, d2 = {"Lbf/k$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "flags", "b", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int b(int i10) {
            return (i10 & 2) != 0 ? i10 | 64 : i10;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lbf/i;", "b", "()Lbf/i;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes3.dex */
    public static final class b extends hc.v implements gc.a<i> {

        /* renamed from: d */
        final /* synthetic */ CharSequence f6013d;

        /* renamed from: q */
        final /* synthetic */ int f6014q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(CharSequence charSequence, int i10) {
            super(0);
            k.this = r1;
            this.f6013d = charSequence;
            this.f6014q = i10;
        }

        /* renamed from: b */
        public final i invoke() {
            return k.this.b(this.f6013d, this.f6014q);
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class c extends hc.q implements gc.l<i, i> {
        public static final c Y3 = new c();

        c() {
            super(1, i.class, "next", "next()Lkotlin/text/MatchResult;", 0);
        }

        /* renamed from: i0 */
        public final i invoke(i iVar) {
            hc.t.e(iVar, "p0");
            return iVar.next();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(java.lang.String r2) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            hc.t.e(r2, r0)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.lang.String r0 = "compile(pattern)"
            hc.t.d(r2, r0)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.k.<init>(java.lang.String):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public k(java.lang.String r2, java.util.Set<? extends bf.m> r3) {
        /*
            r1 = this;
            java.lang.String r0 = "pattern"
            hc.t.e(r2, r0)
            java.lang.String r0 = "options"
            hc.t.e(r3, r0)
            bf.k$a r0 = bf.k.Companion
            int r3 = bf.l.e(r3)
            int r3 = bf.k.a.a(r0, r3)
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2, r3)
            java.lang.String r3 = "compile(pattern, ensureU…odeCase(options.toInt()))"
            hc.t.d(r2, r3)
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bf.k.<init>(java.lang.String, java.util.Set):void");
    }

    public k(Pattern pattern) {
        hc.t.e(pattern, "nativePattern");
        this.f6011c = pattern;
    }

    public static /* synthetic */ i c(k kVar, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return kVar.b(charSequence, i10);
    }

    public static /* synthetic */ af.h f(k kVar, CharSequence charSequence, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 0;
        }
        return kVar.e(charSequence, i10);
    }

    public final i b(CharSequence charSequence, int i10) {
        i f10;
        hc.t.e(charSequence, "input");
        Matcher matcher = this.f6011c.matcher(charSequence);
        hc.t.d(matcher, "nativePattern.matcher(input)");
        f10 = l.f(matcher, i10, charSequence);
        return f10;
    }

    public final af.h<i> e(CharSequence charSequence, int i10) {
        af.h<i> j10;
        hc.t.e(charSequence, "input");
        if (i10 >= 0 && i10 <= charSequence.length()) {
            j10 = af.n.j(new b(charSequence, i10), c.Y3);
            return j10;
        }
        throw new IndexOutOfBoundsException("Start index out of bounds: " + i10 + ", input length: " + charSequence.length());
    }

    public final i g(CharSequence charSequence) {
        i g10;
        hc.t.e(charSequence, "input");
        Matcher matcher = this.f6011c.matcher(charSequence);
        hc.t.d(matcher, "nativePattern.matcher(input)");
        g10 = l.g(matcher, charSequence);
        return g10;
    }

    public final boolean h(CharSequence charSequence) {
        hc.t.e(charSequence, "input");
        return this.f6011c.matcher(charSequence).matches();
    }

    public final String i(CharSequence charSequence, gc.l<? super i, ? extends CharSequence> lVar) {
        hc.t.e(charSequence, "input");
        hc.t.e(lVar, "transform");
        int i10 = 0;
        i c10 = c(this, charSequence, 0, 2, null);
        if (c10 == null) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        StringBuilder sb2 = new StringBuilder(length);
        do {
            sb2.append(charSequence, i10, c10.d().l().intValue());
            sb2.append(lVar.invoke(c10));
            i10 = c10.d().k().intValue() + 1;
            c10 = c10.next();
            if (i10 >= length) {
                break;
            }
        } while (c10 != null);
        if (i10 < length) {
            sb2.append(charSequence, i10, length);
        }
        String sb3 = sb2.toString();
        hc.t.d(sb3, "sb.toString()");
        return sb3;
    }

    public final String j(CharSequence charSequence, String str) {
        hc.t.e(charSequence, "input");
        hc.t.e(str, "replacement");
        String replaceAll = this.f6011c.matcher(charSequence).replaceAll(str);
        hc.t.d(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    public final List<String> k(CharSequence charSequence, int i10) {
        List<String> d10;
        hc.t.e(charSequence, "input");
        y.t0(i10);
        Matcher matcher = this.f6011c.matcher(charSequence);
        if (i10 == 1 || !matcher.find()) {
            d10 = ub.t.d(charSequence.toString());
            return d10;
        }
        int i11 = 10;
        if (i10 > 0) {
            i11 = nc.m.d(i10, 10);
        }
        ArrayList arrayList = new ArrayList(i11);
        int i12 = 0;
        int i13 = i10 - 1;
        do {
            arrayList.add(charSequence.subSequence(i12, matcher.start()).toString());
            i12 = matcher.end();
            if (i13 >= 0 && arrayList.size() == i13) {
                break;
            }
        } while (matcher.find());
        arrayList.add(charSequence.subSequence(i12, charSequence.length()).toString());
        return arrayList;
    }

    public String toString() {
        String pattern = this.f6011c.toString();
        hc.t.d(pattern, "nativePattern.toString()");
        return pattern;
    }
}
