package kotlinx.coroutines;

import kotlin.Metadata;
import xb.g;
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0017\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/z2;", "S", "Lxb/g$b;", "Lxb/g;", "context", "e0", "(Lxb/g;)Ljava/lang/Object;", "oldState", "Ltb/e0;", "z0", "(Lxb/g;Ljava/lang/Object;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public interface z2<S> extends g.b {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class a {
        public static <S, R> R a(z2<S> z2Var, R r10, gc.p<? super R, ? super g.b, ? extends R> pVar) {
            return (R) g.b.a.a(z2Var, r10, pVar);
        }

        public static <S> xb.g b(z2<S> z2Var, xb.g gVar) {
            return g.b.a.d(z2Var, gVar);
        }
    }

    S e0(xb.g gVar);

    void z0(xb.g gVar, S s10);
}
