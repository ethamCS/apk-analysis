package uf;

import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u000e\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\f"}, d2 = {"Luf/f;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "method", BuildConfig.FLAVOR, "e", "b", "a", "d", "c", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a */
    public static final f f23611a = new f();

    private f() {
    }

    @fc.c
    public static final boolean b(String str) {
        t.e(str, "method");
        return !t.a(str, "GET") && !t.a(str, "HEAD");
    }

    @fc.c
    public static final boolean e(String str) {
        t.e(str, "method");
        return t.a(str, "POST") || t.a(str, "PUT") || t.a(str, "PATCH") || t.a(str, "PROPPATCH") || t.a(str, "REPORT");
    }

    public final boolean a(String str) {
        t.e(str, "method");
        return t.a(str, "POST") || t.a(str, "PATCH") || t.a(str, "PUT") || t.a(str, "DELETE") || t.a(str, "MOVE");
    }

    public final boolean c(String str) {
        t.e(str, "method");
        return !t.a(str, "PROPFIND");
    }

    public final boolean d(String str) {
        t.e(str, "method");
        return t.a(str, "PROPFIND");
    }
}
