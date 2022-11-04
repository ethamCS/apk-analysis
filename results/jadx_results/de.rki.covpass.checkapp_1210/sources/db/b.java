package db;

import bb.c;
import bb.e;
import bb.w;
import bf.a0;
import bf.d;
import db.a;
import hc.t;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u000f\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, d2 = {"Ldb/b;", "Ldb/a$a;", BuildConfig.FLAVOR, "d", BuildConfig.FLAVOR, "toString", "Lbb/c;", "contentType", "Lbb/c;", "b", "()Lbb/c;", BuildConfig.FLAVOR, "a", "()Ljava/lang/Long;", "contentLength", "text", "Lbb/w;", "status", "<init>", "(Ljava/lang/String;Lbb/c;Lbb/w;)V", "ktor-http"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class b extends a.AbstractC0130a {

    /* renamed from: a */
    private final String f8463a;

    /* renamed from: b */
    private final c f8464b;

    /* renamed from: c */
    private final w f8465c;

    /* renamed from: d */
    private final byte[] f8466d;

    public b(String str, c cVar, w wVar) {
        t.e(str, "text");
        t.e(cVar, "contentType");
        this.f8463a = str;
        this.f8464b = cVar;
        this.f8465c = wVar;
        Charset a10 = e.a(b());
        CharsetEncoder newEncoder = (a10 == null ? d.f5986b : a10).newEncoder();
        t.d(newEncoder, "charset.newEncoder()");
        this.f8466d = mb.a.g(newEncoder, str, 0, str.length());
    }

    public /* synthetic */ b(String str, c cVar, w wVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, cVar, (i10 & 4) != 0 ? null : wVar);
    }

    @Override // db.a
    public Long a() {
        return Long.valueOf(this.f8466d.length);
    }

    @Override // db.a
    public c b() {
        return this.f8464b;
    }

    @Override // db.a.AbstractC0130a
    public byte[] d() {
        return this.f8466d;
    }

    public String toString() {
        String Y0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("TextContent[");
        sb2.append(b());
        sb2.append("] \"");
        Y0 = a0.Y0(this.f8463a, 30);
        sb2.append(Y0);
        sb2.append('\"');
        return sb2.toString();
    }
}
