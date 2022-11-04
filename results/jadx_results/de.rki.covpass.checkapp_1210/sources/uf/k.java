package uf;

import bf.x;
import hc.t;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of.y;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001\u000bB\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\f"}, d2 = {"Luf/k;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", "Lof/y;", "protocol", BuildConfig.FLAVOR, "code", "message", "<init>", "(Lof/y;ILjava/lang/String;)V", "a", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class k {
    public static final a Companion = new a(null);

    /* renamed from: a */
    public final y f23626a;

    /* renamed from: b */
    public final int f23627b;

    /* renamed from: c */
    public final String f23628c;

    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\b¨\u0006\u000e"}, d2 = {"Luf/k$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "statusLine", "Luf/k;", "a", BuildConfig.FLAVOR, "HTTP_CONTINUE", "I", "HTTP_MISDIRECTED_REQUEST", "HTTP_PERM_REDIRECT", "HTTP_TEMP_REDIRECT", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k a(String str) {
            boolean I;
            y yVar;
            String str2;
            boolean I2;
            t.e(str, "statusLine");
            I = x.I(str, "HTTP/1.", false, 2, null);
            int i10 = 9;
            if (!I) {
                I2 = x.I(str, "ICY ", false, 2, null);
                if (!I2) {
                    throw new ProtocolException(t.l("Unexpected status line: ", str));
                }
                yVar = y.HTTP_1_0;
                i10 = 4;
            } else if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException(t.l("Unexpected status line: ", str));
            } else {
                int charAt = str.charAt(7) - '0';
                if (charAt == 0) {
                    yVar = y.HTTP_1_0;
                } else if (charAt != 1) {
                    throw new ProtocolException(t.l("Unexpected status line: ", str));
                } else {
                    yVar = y.HTTP_1_1;
                }
            }
            int i11 = i10 + 3;
            if (str.length() >= i11) {
                try {
                    String substring = str.substring(i10, i11);
                    t.d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                    int parseInt = Integer.parseInt(substring);
                    if (str.length() <= i11) {
                        str2 = BuildConfig.FLAVOR;
                    } else if (str.charAt(i11) != ' ') {
                        throw new ProtocolException(t.l("Unexpected status line: ", str));
                    } else {
                        str2 = str.substring(i10 + 4);
                        t.d(str2, "this as java.lang.String).substring(startIndex)");
                    }
                    return new k(yVar, parseInt, str2);
                } catch (NumberFormatException unused) {
                    throw new ProtocolException(t.l("Unexpected status line: ", str));
                }
            }
            throw new ProtocolException(t.l("Unexpected status line: ", str));
        }
    }

    public k(y yVar, int i10, String str) {
        t.e(yVar, "protocol");
        t.e(str, "message");
        this.f23626a = yVar;
        this.f23627b = i10;
        this.f23628c = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f23626a == y.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb2.append(' ');
        sb2.append(this.f23627b);
        sb2.append(' ');
        sb2.append(this.f23628c);
        String sb3 = sb2.toString();
        t.d(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }
}
