package androidx.core.provider;

import android.util.Base64;
import java.util.List;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    private final String f3515a;

    /* renamed from: b */
    private final String f3516b;

    /* renamed from: c */
    private final String f3517c;

    /* renamed from: d */
    private final List<List<byte[]>> f3518d;

    /* renamed from: e */
    private final int f3519e = 0;

    /* renamed from: f */
    private final String f3520f;

    public e(String str, String str2, String str3, List<List<byte[]>> list) {
        this.f3515a = (String) androidx.core.util.h.g(str);
        this.f3516b = (String) androidx.core.util.h.g(str2);
        this.f3517c = (String) androidx.core.util.h.g(str3);
        this.f3518d = (List) androidx.core.util.h.g(list);
        this.f3520f = a(str, str2, str3);
    }

    private String a(String str, String str2, String str3) {
        return str + "-" + str2 + "-" + str3;
    }

    public List<List<byte[]>> b() {
        return this.f3518d;
    }

    public int c() {
        return this.f3519e;
    }

    public String d() {
        return this.f3520f;
    }

    public String e() {
        return this.f3515a;
    }

    public String f() {
        return this.f3516b;
    }

    public String g() {
        return this.f3517c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("FontRequest {mProviderAuthority: " + this.f3515a + ", mProviderPackage: " + this.f3516b + ", mQuery: " + this.f3517c + ", mCertificates:");
        for (int i10 = 0; i10 < this.f3518d.size(); i10++) {
            sb2.append(" [");
            List<byte[]> list = this.f3518d.get(i10);
            for (int i11 = 0; i11 < list.size(); i11++) {
                sb2.append(" \"");
                sb2.append(Base64.encodeToString(list.get(i11), 0));
                sb2.append("\"");
            }
            sb2.append(" ]");
        }
        sb2.append("}");
        sb2.append("mCertificatesArray: " + this.f3519e);
        return sb2.toString();
    }
}
