package xb;

import gc.p;
import hc.t;
import java.io.Serializable;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import xb.g;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\t\b\u0002¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\b\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0096\u0002¢\u0006\u0004\b\b\u0010\tJ7\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\n2\u0006\u0010\u000b\u001a\u00028\u00002\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u0001H\u0096\u0002J\u0014\u0010\u0012\u001a\u00020\u00012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016¨\u0006\u0019"}, d2 = {"Lxb/h;", "Lxb/g;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "Lxb/g$b;", "E", "Lxb/g$c;", "key", "i", "(Lxb/g$c;)Lxb/g$b;", "R", "initial", "Lkotlin/Function2;", "operation", "f", "(Ljava/lang/Object;Lgc/p;)Ljava/lang/Object;", "context", "B", "s", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class h implements g, Serializable {

    /* renamed from: c */
    public static final h f25516c = new h();

    private h() {
    }

    @Override // xb.g
    public g B(g gVar) {
        t.e(gVar, "context");
        return gVar;
    }

    @Override // xb.g
    public <R> R f(R r10, p<? super R, ? super g.b, ? extends R> pVar) {
        t.e(pVar, "operation");
        return r10;
    }

    public int hashCode() {
        return 0;
    }

    @Override // xb.g
    public <E extends g.b> E i(g.c<E> cVar) {
        t.e(cVar, "key");
        return null;
    }

    @Override // xb.g
    public g s(g.c<?> cVar) {
        t.e(cVar, "key");
        return this;
    }

    public String toString() {
        return "EmptyCoroutineContext";
    }
}
