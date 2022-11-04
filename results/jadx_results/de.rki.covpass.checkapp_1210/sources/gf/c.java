package gf;

import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0017"}, d2 = {"Lgf/c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "encodeDefaults", "Z", "a", "()Z", "d", "(Z)V", "ignoreUnknownKeys", "b", "e", "Lnf/d;", "serializersModule", "Lnf/d;", "c", "()Lnf/d;", "f", "(Lnf/d;)V", "Lgf/b;", "cbor", "<init>", "(Lgf/b;)V", "kotlinx-serialization-cbor"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a */
    private boolean f10779a;

    /* renamed from: b */
    private boolean f10780b;

    /* renamed from: c */
    private nf.d f10781c;

    public c(b bVar) {
        t.e(bVar, "cbor");
        this.f10779a = bVar.f();
        this.f10780b = bVar.g();
        this.f10781c = bVar.a();
    }

    public final boolean a() {
        return this.f10779a;
    }

    public final boolean b() {
        return this.f10780b;
    }

    public final nf.d c() {
        return this.f10781c;
    }

    public final void d(boolean z10) {
        this.f10779a = z10;
    }

    public final void e(boolean z10) {
        this.f10780b = z10;
    }

    public final void f(nf.d dVar) {
        t.e(dVar, "<set-?>");
        this.f10781c = dVar;
    }
}
