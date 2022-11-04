package tb;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@fc.b
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0005\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0011B\u0014\b\u0001\u0012\u0006\u0010\u000e\u001a\u00020\rø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\f\u0088\u0001\u000e\u0092\u0001\u00020\rø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Ltb/c0;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "h", "(S)Ljava/lang/String;", BuildConfig.FLAVOR, "g", "(S)I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "d", "(SLjava/lang/Object;)Z", BuildConfig.FLAVOR, "data", "b", "(S)S", "a", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class c0 implements Comparable<c0> {
    public static final a Companion = new a(null);

    /* renamed from: c */
    private final short f22147c;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\f"}, d2 = {"Ltb/c0$a;", BuildConfig.FLAVOR, "Ltb/c0;", "MAX_VALUE", "S", "MIN_VALUE", BuildConfig.FLAVOR, "SIZE_BITS", "I", "SIZE_BYTES", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ c0(short s10) {
        this.f22147c = s10;
    }

    public static final /* synthetic */ c0 a(short s10) {
        return new c0(s10);
    }

    public static short b(short s10) {
        return s10;
    }

    public static boolean d(short s10, Object obj) {
        return (obj instanceof c0) && s10 == ((c0) obj).j();
    }

    public static int g(short s10) {
        return s10;
    }

    public static String h(short s10) {
        return String.valueOf(s10 & 65535);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(c0 c0Var) {
        return hc.t.f(j() & 65535, c0Var.j() & 65535);
    }

    public boolean equals(Object obj) {
        return d(this.f22147c, obj);
    }

    public int hashCode() {
        return g(this.f22147c);
    }

    public final /* synthetic */ short j() {
        return this.f22147c;
    }

    public String toString() {
        return h(this.f22147c);
    }
}
