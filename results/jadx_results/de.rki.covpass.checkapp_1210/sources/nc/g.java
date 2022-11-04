package nc;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0015B\u0017\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0013\u0010\n\u001a\u00020\u00052\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\fH\u0016R\u0014\u0010\u0010\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000f¨\u0006\u0016"}, d2 = {"Lnc/g;", "Lnc/e;", "Lnc/d;", BuildConfig.FLAVOR, "value", BuildConfig.FLAVOR, "i", "isEmpty", BuildConfig.FLAVOR, "other", "equals", "hashCode", BuildConfig.FLAVOR, "toString", "l", "()Ljava/lang/Integer;", "start", "k", "endInclusive", "<init>", "(II)V", "a", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class g extends e implements d<Integer> {
    public static final a Companion = new a(null);

    /* renamed from: x */
    private static final g f16960x = new g(1, 0);

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lnc/g$a;", BuildConfig.FLAVOR, "Lnc/g;", "EMPTY", "Lnc/g;", "a", "()Lnc/g;", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final g a() {
            return g.f16960x;
        }
    }

    public g(int i10, int i11) {
        super(i10, i11, 1);
    }

    @Override // nc.e
    public boolean equals(Object obj) {
        if (obj instanceof g) {
            if (!isEmpty() || !((g) obj).isEmpty()) {
                g gVar = (g) obj;
                if (a() != gVar.a() || b() != gVar.b()) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // nc.e
    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (a() * 31) + b();
    }

    public boolean i(int i10) {
        return a() <= i10 && i10 <= b();
    }

    @Override // nc.e
    public boolean isEmpty() {
        return a() > b();
    }

    public Integer k() {
        return Integer.valueOf(b());
    }

    public Integer l() {
        return Integer.valueOf(a());
    }

    @Override // nc.e
    public String toString() {
        return a() + ".." + b();
    }
}
