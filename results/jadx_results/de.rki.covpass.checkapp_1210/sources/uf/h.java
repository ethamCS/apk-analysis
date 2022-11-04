package uf;

import hc.t;
import kotlin.Metadata;
import of.c0;
import of.w;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B!\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, d2 = {"Luf/h;", "Lof/c0;", BuildConfig.FLAVOR, "b", "Lof/w;", "e", "Leg/e;", "f", BuildConfig.FLAVOR, "contentTypeString", "contentLength", "source", "<init>", "(Ljava/lang/String;JLeg/e;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class h extends c0 {

    /* renamed from: c */
    private final String f23621c;

    /* renamed from: d */
    private final long f23622d;

    /* renamed from: q */
    private final eg.e f23623q;

    public h(String str, long j10, eg.e eVar) {
        t.e(eVar, "source");
        this.f23621c = str;
        this.f23622d = j10;
        this.f23623q = eVar;
    }

    @Override // of.c0
    public long b() {
        return this.f23622d;
    }

    @Override // of.c0
    public w e() {
        String str = this.f23621c;
        if (str == null) {
            return null;
        }
        return w.Companion.b(str);
    }

    @Override // of.c0
    public eg.e f() {
        return this.f23623q;
    }
}
