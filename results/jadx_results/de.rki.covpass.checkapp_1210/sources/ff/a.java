package ff;

import gc.l;
import gc.p;
import kotlin.Metadata;
import kotlinx.coroutines.internal.g;
import org.conscrypt.BuildConfig;
import tb.e0;
import tb.s;
import tb.t;
import xb.d;
import yb.c;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001al\u0010\u000b\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00022\u0006\u0010\u0005\u001a\u00028\u00002\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u00032\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u001e\u0010\u000e\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\t0\u00032\n\u0010\r\u001a\u0006\u0012\u0002\b\u00030\u0003H\u0000\u001a\u001c\u0010\u0010\u001a\u00020\t2\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00032\u0006\u0010\u000f\u001a\u00020\bH\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"R", "T", "Lkotlin/Function2;", "Lxb/d;", BuildConfig.FLAVOR, "receiver", "completion", "Lkotlin/Function1;", BuildConfig.FLAVOR, "Ltb/e0;", "onCancellation", "b", "(Lgc/p;Ljava/lang/Object;Lxb/d;Lgc/l;)V", "fatalCompletion", "c", "e", "a", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class a {
    private static final void a(d<?> dVar, Throwable th2) {
        s.a aVar = s.Companion;
        dVar.y(s.c(t.a(th2)));
        throw th2;
    }

    public static final <R, T> void b(p<? super R, ? super d<? super T>, ? extends Object> pVar, R r10, d<? super T> dVar, l<? super Throwable, e0> lVar) {
        d a10;
        d b10;
        try {
            a10 = c.a(pVar, r10, dVar);
            b10 = c.b(a10);
            s.a aVar = s.Companion;
            g.b(b10, s.c(e0.f22152a), lVar);
        } catch (Throwable th2) {
            a(dVar, th2);
        }
    }

    public static final void c(d<? super e0> dVar, d<?> dVar2) {
        d b10;
        try {
            b10 = c.b(dVar);
            s.a aVar = s.Companion;
            g.c(b10, s.c(e0.f22152a), null, 2, null);
        } catch (Throwable th2) {
            a(dVar2, th2);
        }
    }

    public static /* synthetic */ void d(p pVar, Object obj, d dVar, l lVar, int i10, Object obj2) {
        if ((i10 & 4) != 0) {
            lVar = null;
        }
        b(pVar, obj, dVar, lVar);
    }
}
