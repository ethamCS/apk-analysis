package nc;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import ub.q;
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0007B!\b\u0000\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u0011"}, d2 = {"Lnc/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lub/q;", "d", "first", "C", "a", "()C", "last", "b", "start", "endInclusive", BuildConfig.FLAVOR, "step", "<init>", "(CCI)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public class a implements Iterable<Character>, ic.a {
    public static final C0262a Companion = new C0262a(null);

    /* renamed from: c */
    private final char f16945c;

    /* renamed from: d */
    private final char f16946d;

    /* renamed from: q */
    private final int f16947q;

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lnc/a$a;", BuildConfig.FLAVOR, "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* renamed from: nc.a$a */
    /* loaded from: classes.dex */
    public static final class C0262a {
        private C0262a() {
        }

        public /* synthetic */ C0262a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a(char c10, char c11, int i10) {
        if (i10 != 0) {
            if (i10 == Integer.MIN_VALUE) {
                throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            }
            this.f16945c = c10;
            this.f16946d = (char) ac.c.c(c10, c11, i10);
            this.f16947q = i10;
            return;
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public final char a() {
        return this.f16945c;
    }

    public final char b() {
        return this.f16946d;
    }

    /* renamed from: d */
    public q iterator() {
        return new b(this.f16945c, this.f16946d, this.f16947q);
    }
}
