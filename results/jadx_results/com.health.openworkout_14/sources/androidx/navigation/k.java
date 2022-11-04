package androidx.navigation;

import android.content.Intent;
import android.net.Uri;
/* loaded from: classes.dex */
public class k {

    /* renamed from: a */
    private final Uri f1345a;

    /* renamed from: b */
    private final String f1346b;

    /* renamed from: c */
    private final String f1347c;

    public k(Intent intent) {
        this(intent.getData(), intent.getAction(), intent.getType());
    }

    k(Uri uri, String str, String str2) {
        this.f1345a = uri;
        this.f1346b = str;
        this.f1347c = str2;
    }

    public String a() {
        return this.f1346b;
    }

    public String b() {
        return this.f1347c;
    }

    public Uri c() {
        return this.f1345a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NavDeepLinkRequest");
        sb.append("{");
        if (this.f1345a != null) {
            sb.append(" uri=");
            sb.append(this.f1345a.toString());
        }
        if (this.f1346b != null) {
            sb.append(" action=");
            sb.append(this.f1346b);
        }
        if (this.f1347c != null) {
            sb.append(" mimetype=");
            sb.append(this.f1347c);
        }
        sb.append(" }");
        return sb.toString();
    }
}
