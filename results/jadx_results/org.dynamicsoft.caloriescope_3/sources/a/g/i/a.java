package a.g.i;

import a.g.k.h;
import android.util.Base64;
import java.util.List;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private final String f185a;

    /* renamed from: b */
    private final String f186b;

    /* renamed from: c */
    private final String f187c;
    private final List<List<byte[]>> d;
    private final int e = 0;
    private final String f;

    public a(String str, String str2, String str3, List<List<byte[]>> list) {
        h.a(str);
        this.f185a = str;
        h.a(str2);
        this.f186b = str2;
        h.a(str3);
        this.f187c = str3;
        h.a(list);
        this.d = list;
        this.f = this.f185a + "-" + this.f186b + "-" + this.f187c;
    }

    public List<List<byte[]>> a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public String c() {
        return this.f;
    }

    public String d() {
        return this.f185a;
    }

    public String e() {
        return this.f186b;
    }

    public String f() {
        return this.f187c;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("FontRequest {mProviderAuthority: " + this.f185a + ", mProviderPackage: " + this.f186b + ", mQuery: " + this.f187c + ", mCertificates:");
        for (int i = 0; i < this.d.size(); i++) {
            sb.append(" [");
            List<byte[]> list = this.d.get(i);
            for (int i2 = 0; i2 < list.size(); i2++) {
                sb.append(" \"");
                sb.append(Base64.encodeToString(list.get(i2), 0));
                sb.append("\"");
            }
            sb.append(" ]");
        }
        sb.append("}");
        sb.append("mCertificatesArray: " + this.e);
        return sb.toString();
    }
}
