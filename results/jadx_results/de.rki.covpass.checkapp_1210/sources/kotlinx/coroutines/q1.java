package kotlinx.coroutines;

import java.io.Closeable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import xb.g;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u0000 \u00052\u00020\u00012\u00020\u0002:\u0001\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/q1;", "Lkotlinx/coroutines/l0;", "Ljava/io/Closeable;", "<init>", "()V", "q", "a", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public abstract class q1 extends l0 implements Closeable {

    /* renamed from: q */
    public static final a f15501q = new a(null);

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/q1$a;", "Lxb/b;", "Lkotlinx/coroutines/l0;", "Lkotlinx/coroutines/q1;", "<init>", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a extends xb.b<l0, q1> {

        /* JADX INFO: Access modifiers changed from: package-private */
        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lxb/g$b;", "it", "Lkotlinx/coroutines/q1;", "b", "(Lxb/g$b;)Lkotlinx/coroutines/q1;"}, k = 3, mv = {1, 6, 0})
        /* renamed from: kotlinx.coroutines.q1$a$a */
        /* loaded from: classes3.dex */
        public static final class C0231a extends hc.v implements gc.l<g.b, q1> {

            /* renamed from: c */
            public static final C0231a f15502c = new C0231a();

            C0231a() {
                super(1);
            }

            /* renamed from: b */
            public final q1 invoke(g.b bVar) {
                if (bVar instanceof q1) {
                    return (q1) bVar;
                }
                return null;
            }
        }

        private a() {
            super(l0.f15483d, C0231a.f15502c);
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }
}
