package jb;

import gc.q;
import hc.t;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u008a\u0001\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0003\u001a\u00028\u00012:\u0010\t\u001a6\u00122\u00120\b\u0001\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00000\u00050\u00042\u0006\u0010\n\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {BuildConfig.FLAVOR, "TSubject", "TContext", "context", BuildConfig.FLAVOR, "Lkotlin/Function3;", "Ljb/e;", "Lxb/d;", "Ltb/e0;", "interceptors", "subject", "Lxb/g;", "coroutineContext", BuildConfig.FLAVOR, "debugMode", "Ljb/g;", "a", "(Ljava/lang/Object;Ljava/util/List;Ljava/lang/Object;Lxb/g;Z)Ljb/g;", "ktor-utils"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class f {
    public static final <TSubject, TContext> g<TSubject> a(TContext tcontext, List<? extends q<? super e<TSubject, TContext>, ? super TSubject, ? super xb.d<? super e0>, ? extends Object>> list, TSubject tsubject, xb.g gVar, boolean z10) {
        t.e(tcontext, "context");
        t.e(list, "interceptors");
        t.e(tsubject, "subject");
        t.e(gVar, "coroutineContext");
        return z10 ? new a(tcontext, list, tsubject, gVar) : new n(tsubject, tcontext, list);
    }
}
