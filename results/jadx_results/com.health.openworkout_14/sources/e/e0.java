package e;

import java.io.IOException;
/* loaded from: classes.dex */
public enum e0 {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    

    /* renamed from: b */
    private final String f3964b;

    e0(String str) {
        this.f3964b = str;
    }

    public static e0 a(String str) {
        e0 e0Var = HTTP_1_0;
        if (str.equals(e0Var.f3964b)) {
            return e0Var;
        }
        e0 e0Var2 = HTTP_1_1;
        if (str.equals(e0Var2.f3964b)) {
            return e0Var2;
        }
        e0 e0Var3 = H2_PRIOR_KNOWLEDGE;
        if (str.equals(e0Var3.f3964b)) {
            return e0Var3;
        }
        e0 e0Var4 = HTTP_2;
        if (str.equals(e0Var4.f3964b)) {
            return e0Var4;
        }
        e0 e0Var5 = SPDY_3;
        if (str.equals(e0Var5.f3964b)) {
            return e0Var5;
        }
        e0 e0Var6 = QUIC;
        if (str.equals(e0Var6.f3964b)) {
            return e0Var6;
        }
        throw new IOException("Unexpected protocol: " + str);
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f3964b;
    }
}
