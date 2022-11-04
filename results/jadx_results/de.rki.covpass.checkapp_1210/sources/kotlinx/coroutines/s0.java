package kotlinx.coroutines;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u0014JY\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00042\u0006\u0010\b\u001a\u00028\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0087\u0002ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lkotlinx/coroutines/s0;", BuildConfig.FLAVOR, "R", "T", "Lkotlin/Function2;", "Lxb/d;", BuildConfig.FLAVOR, "block", "receiver", "completion", "Ltb/e0;", "g", "(Lgc/p;Ljava/lang/Object;Lxb/d;)V", BuildConfig.FLAVOR, "h", "()Z", "isLazy$annotations", "()V", "isLazy", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "LAZY", "ATOMIC", "UNDISPATCHED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public enum s0 {
    DEFAULT,
    LAZY,
    ATOMIC,
    UNDISPATCHED;

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f15511a;

        static {
            int[] iArr = new int[s0.values().length];
            iArr[s0.DEFAULT.ordinal()] = 1;
            iArr[s0.ATOMIC.ordinal()] = 2;
            iArr[s0.UNDISPATCHED.ordinal()] = 3;
            iArr[s0.LAZY.ordinal()] = 4;
            f15511a = iArr;
        }
    }

    public final <R, T> void g(gc.p<? super R, ? super xb.d<? super T>, ? extends Object> pVar, R r10, xb.d<? super T> dVar) {
        int i10 = a.f15511a[ordinal()];
        if (i10 == 1) {
            ff.a.d(pVar, r10, dVar, null, 4, null);
        } else if (i10 == 2) {
            xb.f.a(pVar, r10, dVar);
        } else if (i10 == 3) {
            ff.b.a(pVar, r10, dVar);
        } else if (i10 != 4) {
            throw new tb.p();
        }
    }

    public final boolean h() {
        return this == LAZY;
    }
}
