package k9;

import d9.d;
import hc.t;
import java.util.List;
import kotlin.Metadata;
import l9.i;
import org.conscrypt.BuildConfig;
import tb.e0;
import ub.u;
import v9.e;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u000b\u001a\u00020\bH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lk9/c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Ll9/b;", "b", "(Lxb/d;)Ljava/lang/Object;", "Lk9/a;", "rules", "Ltb/e0;", "c", "(Ljava/util/List;Lxb/d;)Ljava/lang/Object;", "a", "Ld9/d;", "remoteDataSource", "Ll9/i;", "localDataSource", "Lv9/e;", "rulesUpdateRepository", "<init>", "(Ld9/d;Ll9/i;Lv9/e;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    private final d f14862a;

    /* renamed from: b */
    private final i f14863b;

    /* renamed from: c */
    private final e f14864c;

    public c(d dVar, i iVar, e eVar) {
        t.e(dVar, "remoteDataSource");
        t.e(iVar, "localDataSource");
        t.e(eVar, "rulesUpdateRepository");
        this.f14862a = dVar;
        this.f14863b = iVar;
        this.f14864c = eVar;
    }

    public final Object a(xb.d<? super e0> dVar) {
        Object c10;
        Object b10 = this.f14863b.b(dVar);
        c10 = yb.d.c();
        return b10 == c10 ? b10 : e0.f22152a;
    }

    public final Object b(xb.d<? super List<l9.b>> dVar) {
        return this.f14863b.c(dVar);
    }

    public final Object c(List<a> list, xb.d<? super e0> dVar) {
        List h10;
        Object c10;
        i iVar = this.f14863b;
        h10 = u.h();
        Object d10 = iVar.d(h10, list, dVar);
        c10 = yb.d.c();
        return d10 == c10 ? d10 : e0.f22152a;
    }
}
