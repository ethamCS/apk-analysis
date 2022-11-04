package of;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0015B/\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\b\u001a\u00020\u0005H\u0016J\u0013\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0016"}, d2 = {"Lof/w;", BuildConfig.FLAVOR, "Ljava/nio/charset/Charset;", "defaultValue", "c", BuildConfig.FLAVOR, "name", "d", "toString", "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "hashCode", "mediaType", "type", "subtype", BuildConfig.FLAVOR, "parameterNamesAndValues", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "a", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class w {
    public static final a Companion = new a(null);

    /* renamed from: e */
    private static final Pattern f18318e = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* renamed from: f */
    private static final Pattern f18319f = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* renamed from: a */
    private final String f18320a;

    /* renamed from: b */
    private final String f18321b;

    /* renamed from: c */
    private final String f18322c;

    /* renamed from: d */
    private final String[] f18323d;

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0005R\u001c\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\fR\u001c\u0010\u000e\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\n¨\u0006\u0011"}, d2 = {"Lof/w$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lof/w;", "a", "(Ljava/lang/String;)Lof/w;", "b", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "PARAMETER", "Ljava/util/regex/Pattern;", "QUOTED", "Ljava/lang/String;", "TOKEN", "TYPE_SUBTYPE", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @fc.c
        public final w a(String str) {
            boolean I;
            boolean u10;
            hc.t.e(str, "<this>");
            Matcher matcher = w.f18318e.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + str + '\"').toString());
            }
            String group = matcher.group(1);
            hc.t.d(group, "typeSubtype.group(1)");
            Locale locale = Locale.US;
            hc.t.d(locale, "US");
            String lowerCase = group.toLowerCase(locale);
            hc.t.d(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            String group2 = matcher.group(2);
            hc.t.d(group2, "typeSubtype.group(2)");
            hc.t.d(locale, "US");
            String lowerCase2 = group2.toLowerCase(locale);
            hc.t.d(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = w.f18319f.matcher(str);
            for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
                matcher2.region(end, str.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Parameter is not formatted correctly: \"");
                    String substring = str.substring(end);
                    hc.t.d(substring, "this as java.lang.String).substring(startIndex)");
                    sb2.append(substring);
                    sb2.append("\" for: \"");
                    sb2.append(str);
                    sb2.append('\"');
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
                String group3 = matcher2.group(1);
                if (group3 != null) {
                    String group4 = matcher2.group(2);
                    if (group4 == null) {
                        group4 = matcher2.group(3);
                    } else {
                        I = bf.x.I(group4, "'", false, 2, null);
                        if (I) {
                            u10 = bf.x.u(group4, "'", false, 2, null);
                            if (u10 && group4.length() > 2) {
                                group4 = group4.substring(1, group4.length() - 1);
                                hc.t.d(group4, "this as java.lang.String…ing(startIndex, endIndex)");
                            }
                        }
                    }
                    arrayList.add(group3);
                    arrayList.add(group4);
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            return new w(str, lowerCase, lowerCase2, (String[]) array, null);
        }

        @fc.c
        public final w b(String str) {
            hc.t.e(str, "<this>");
            try {
                return a(str);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    private w(String str, String str2, String str3, String[] strArr) {
        this.f18320a = str;
        this.f18321b = str2;
        this.f18322c = str3;
        this.f18323d = strArr;
    }

    public /* synthetic */ w(String str, String str2, String str3, String[] strArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, strArr);
    }

    public final Charset c(Charset charset) {
        String d10 = d("charset");
        if (d10 == null) {
            return charset;
        }
        try {
            return Charset.forName(d10);
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final String d(String str) {
        boolean v10;
        hc.t.e(str, "name");
        int i10 = 0;
        int c10 = ac.c.c(0, this.f18323d.length - 1, 2);
        if (c10 >= 0) {
            while (true) {
                int i11 = i10 + 2;
                v10 = bf.x.v(this.f18323d[i10], str, true);
                if (v10) {
                    return this.f18323d[i10 + 1];
                }
                if (i10 == c10) {
                    return null;
                }
                i10 = i11;
            }
        } else {
            return null;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof w) && hc.t.a(((w) obj).f18320a, this.f18320a);
    }

    public int hashCode() {
        return this.f18320a.hashCode();
    }

    public String toString() {
        return this.f18320a;
    }
}
