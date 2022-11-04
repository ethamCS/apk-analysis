package ef;

import hc.v;
import kotlin.Metadata;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.internal.z;
import org.conscrypt.BuildConfig;
import xb.g;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0018\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0001\u001a\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0080\u0010¨\u0006\b"}, d2 = {"Lef/m;", "Lxb/g;", "currentContext", "Ltb/e0;", "a", "Lkotlinx/coroutines/a2;", "collectJob", "b", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class o {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {BuildConfig.FLAVOR, "count", "Lxb/g$b;", "element", "b", "(ILxb/g$b;)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a extends v implements gc.p<Integer, g.b, Integer> {

        /* renamed from: c */
        final /* synthetic */ m<?> f9578c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m<?> mVar) {
            super(2);
            this.f9578c = mVar;
        }

        public final Integer b(int i10, g.b bVar) {
            g.c<?> key = bVar.getKey();
            g.b i11 = this.f9578c.f9575y.i(key);
            if (key != a2.W0) {
                return Integer.valueOf(bVar != i11 ? Integer.MIN_VALUE : i10 + 1);
            }
            a2 a2Var = (a2) i11;
            a2 b10 = o.b((a2) bVar, a2Var);
            if (b10 == a2Var) {
                if (a2Var != null) {
                    i10++;
                }
                return Integer.valueOf(i10);
            }
            throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + b10 + ", expected child of " + a2Var + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
        }

        @Override // gc.p
        public /* bridge */ /* synthetic */ Integer u(Integer num, g.b bVar) {
            return b(num.intValue(), bVar);
        }
    }

    public static final void a(m<?> mVar, xb.g gVar) {
        if (((Number) gVar.f(0, new a(mVar))).intValue() == mVar.U3) {
            return;
        }
        throw new IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + mVar.f9575y + ",\n\t\tbut emission happened in " + gVar + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
    }

    public static final a2 b(a2 a2Var, a2 a2Var2) {
        while (a2Var != null) {
            if (a2Var == a2Var2 || !(a2Var instanceof z)) {
                return a2Var;
            }
            a2Var = ((z) a2Var).l1();
        }
        return null;
    }
}
