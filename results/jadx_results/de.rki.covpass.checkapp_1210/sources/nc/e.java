package nc;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import ub.k0;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u000fB!\b\u0000\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002J\b\u0010\n\u001a\u00020\u0002H\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0010¨\u0006\u0019"}, d2 = {"Lnc/e;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "Lub/k0;", "e", BuildConfig.FLAVOR, "isEmpty", BuildConfig.FLAVOR, "other", "equals", "hashCode", BuildConfig.FLAVOR, "toString", "first", "I", "a", "()I", "last", "b", "step", "d", "start", "endInclusive", "<init>", "(III)V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public class e implements Iterable<Integer>, ic.a {
    public static final a Companion = new a(null);

    /* renamed from: c */
    private final int f16953c;

    /* renamed from: d */
    private final int f16954d;

    /* renamed from: q */
    private final int f16955q;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lnc/e$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "rangeStart", "rangeEnd", "step", "Lnc/e;", "a", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e a(int i10, int i11, int i12) {
            return new e(i10, i11, i12);
        }
    }

    public e(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 == Integer.MIN_VALUE) {
                throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
            }
            this.f16953c = i10;
            this.f16954d = ac.c.c(i10, i11, i12);
            this.f16955q = i12;
            return;
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    public final int a() {
        return this.f16953c;
    }

    public final int b() {
        return this.f16954d;
    }

    public final int d() {
        return this.f16955q;
    }

    /* renamed from: e */
    public k0 iterator() {
        return new f(this.f16953c, this.f16954d, this.f16955q);
    }

    public boolean equals(Object obj) {
        if (obj instanceof e) {
            if (!isEmpty() || !((e) obj).isEmpty()) {
                e eVar = (e) obj;
                if (this.f16953c != eVar.f16953c || this.f16954d != eVar.f16954d || this.f16955q != eVar.f16955q) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f16953c * 31) + this.f16954d) * 31) + this.f16955q;
    }

    public boolean isEmpty() {
        if (this.f16955q > 0) {
            if (this.f16953c > this.f16954d) {
                return true;
            }
        } else if (this.f16953c < this.f16954d) {
            return true;
        }
        return false;
    }

    public String toString() {
        int i10;
        StringBuilder sb2;
        if (this.f16955q > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f16953c);
            sb2.append("..");
            sb2.append(this.f16954d);
            sb2.append(" step ");
            i10 = this.f16955q;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f16953c);
            sb2.append(" downTo ");
            sb2.append(this.f16954d);
            sb2.append(" step ");
            i10 = -this.f16955q;
        }
        sb2.append(i10);
        return sb2.toString();
    }
}
