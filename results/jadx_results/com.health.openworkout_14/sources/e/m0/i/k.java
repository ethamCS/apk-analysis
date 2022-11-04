package e.m0.i;

import e.e0;
import java.net.ProtocolException;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a */
    public final e0 f4167a;

    /* renamed from: b */
    public final int f4168b;

    /* renamed from: c */
    public final String f4169c;

    public k(e0 e0Var, int i, String str) {
        this.f4167a = e0Var;
        this.f4168b = i;
        this.f4169c = str;
    }

    public static k a(String str) {
        e0 e0Var;
        String str2;
        int i = 9;
        if (str.startsWith("HTTP/1.")) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                e0Var = e0.HTTP_1_0;
            } else if (charAt != 1) {
                throw new ProtocolException("Unexpected status line: " + str);
            } else {
                e0Var = e0.HTTP_1_1;
            }
        } else if (!str.startsWith("ICY ")) {
            throw new ProtocolException("Unexpected status line: " + str);
        } else {
            e0Var = e0.HTTP_1_0;
            i = 4;
        }
        int i2 = i + 3;
        if (str.length() < i2) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        try {
            int parseInt = Integer.parseInt(str.substring(i, i2));
            if (str.length() <= i2) {
                str2 = "";
            } else if (str.charAt(i2) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            } else {
                str2 = str.substring(i + 4);
            }
            return new k(e0Var, parseInt, str2);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f4167a == e0.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb.append(' ');
        sb.append(this.f4168b);
        if (this.f4169c != null) {
            sb.append(' ');
            sb.append(this.f4169c);
        }
        return sb.toString();
    }
}
