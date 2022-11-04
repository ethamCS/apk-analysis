package nc;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import ub.l0;
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\r\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B!\b\u0000\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u0010"}, d2 = {"Lnc/h;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lub/l0;", "d", "first", "J", "a", "()J", "last", "b", "start", "endInclusive", "step", "<init>", "(JJJ)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public class h implements Iterable<Long>, ic.a {
    public static final a Companion = new a(null);

    /* renamed from: c */
    private final long f16961c;

    /* renamed from: d */
    private final long f16962d;

    /* renamed from: q */
    private final long f16963q;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnc/h$a;", BuildConfig.FLAVOR, "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public h(long j10, long j11, long j12) {
        if (j12 != 0) {
            if (j12 == Long.MIN_VALUE) {
                throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
            }
            this.f16961c = j10;
            this.f16962d = ac.c.d(j10, j11, j12);
            this.f16963q = j12;
            return;
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public final long a() {
        return this.f16961c;
    }

    public final long b() {
        return this.f16962d;
    }

    /* renamed from: d */
    public l0 iterator() {
        return new i(this.f16961c, this.f16962d, this.f16963q);
    }
}
