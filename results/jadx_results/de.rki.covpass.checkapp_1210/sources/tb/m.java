package tb;

import kotlin.Lazy;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a(\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0006\u001a\u00020\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\b"}, d2 = {"T", "Lkotlin/Function0;", "initializer", "Lkotlin/Lazy;", "a", "Ltb/o;", "mode", "b", "kotlin-stdlib"}, k = 5, mv = {1, 7, 1}, xs = "kotlin/LazyKt")
/* loaded from: classes.dex */
public class m {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f22162a;

        static {
            int[] iArr = new int[o.values().length];
            iArr[o.SYNCHRONIZED.ordinal()] = 1;
            iArr[o.PUBLICATION.ordinal()] = 2;
            iArr[o.NONE.ordinal()] = 3;
            f22162a = iArr;
        }
    }

    public static <T> Lazy<T> a(gc.a<? extends T> aVar) {
        hc.t.e(aVar, "initializer");
        return new v(aVar, null, 2, null);
    }

    public static <T> Lazy<T> b(o oVar, gc.a<? extends T> aVar) {
        hc.t.e(oVar, "mode");
        hc.t.e(aVar, "initializer");
        int i10 = a.f22162a[oVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return new u(aVar);
            }
            if (i10 != 3) {
                throw new p();
            }
            return new f0(aVar);
        }
        return new v(aVar, null, 2, null);
    }
}
