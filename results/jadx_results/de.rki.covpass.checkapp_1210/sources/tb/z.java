package tb;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@fc.b
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000fB\u0014\b\u0001\u0012\u0006\u0010\r\u001a\u00020\u0005ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u0007J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\f\u0088\u0001\r\u0092\u0001\u00020\u0005ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, d2 = {"Ltb/z;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "h", "(I)Ljava/lang/String;", BuildConfig.FLAVOR, "g", "(I)I", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "d", "(ILjava/lang/Object;)Z", "data", "b", "a", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class z implements Comparable<z> {
    public static final a Companion = new a(null);

    /* renamed from: c */
    private final int f22182c;

    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0086Tø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004\u0082\u0002\b\n\u0002\b\u0019\n\u0002\b!¨\u0006\u000b"}, d2 = {"Ltb/z$a;", BuildConfig.FLAVOR, "Ltb/z;", "MAX_VALUE", "I", "MIN_VALUE", BuildConfig.FLAVOR, "SIZE_BITS", "SIZE_BYTES", "<init>", "()V", "kotlin-stdlib"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    private /* synthetic */ z(int i10) {
        this.f22182c = i10;
    }

    public static final /* synthetic */ z a(int i10) {
        return new z(i10);
    }

    public static int b(int i10) {
        return i10;
    }

    public static boolean d(int i10, Object obj) {
        return (obj instanceof z) && i10 == ((z) obj).j();
    }

    public static int g(int i10) {
        return i10;
    }

    public static String h(int i10) {
        return String.valueOf(i10 & 4294967295L);
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(z zVar) {
        return g0.a(j(), zVar.j());
    }

    public boolean equals(Object obj) {
        return d(this.f22182c, obj);
    }

    public int hashCode() {
        return g(this.f22182c);
    }

    public final /* synthetic */ int j() {
        return this.f22182c;
    }

    public String toString() {
        return h(this.f22182c);
    }
}
