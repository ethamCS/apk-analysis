package b.g.i;

import android.util.Base64;
import b.g.k.h;
import java.util.List;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private final String f2404a;

    /* renamed from: b */
    private final String f2405b;

    /* renamed from: c */
    private final String f2406c;

    /* renamed from: d */
    private final List<List<byte[]>> f2407d;

    /* renamed from: e */
    private final int f2408e = 0;

    /* renamed from: f */
    private final String f2409f;

    public a(String str, String str2, String str3, List<List<byte[]>> list) {
        h.c(str);
        String str4 = str;
        this.f2404a = str4;
        h.c(str2);
        String str5 = str2;
        this.f2405b = str5;
        h.c(str3);
        String str6 = str3;
        this.f2406c = str6;
        h.c(list);
        this.f2407d = list;
        this.f2409f = str4 + "-" + str5 + "-" + str6;
    }

    public List<List<byte[]>> a() {
        return this.f2407d;
    }

    public int b() {
        return this.f2408e;
    }

    public String c() {
        return this.f2409f;
    }

    public String d() {
        return this.f2404a;
    }

    public String e() {
        return this.f2405b;
    }

    public String f() {
        return this.f2406c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f2404a + ", mProviderPackage: " + this.f2405b + ", mQuery: " + this.f2406c + ", mCertificates:");
        for (int i = 0; i < this.f2407d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.f2407d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.f2408e);
        return sb.toString();
    }
}
