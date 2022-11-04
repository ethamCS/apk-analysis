package za;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lza/b;", "Ljb/d;", "Lza/c;", "Loa/b;", BuildConfig.FLAVOR, "developmentMode", "Z", "g", "()Z", "<init>", "(Z)V", "a", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class b extends jb.d<c, oa.b> {

    /* renamed from: i */
    public static final a f26565i = new a(null);

    /* renamed from: j */
    private static final jb.h f26566j = new jb.h("Before");

    /* renamed from: k */
    private static final jb.h f26567k = new jb.h("State");

    /* renamed from: l */
    private static final jb.h f26568l = new jb.h("After");

    /* renamed from: h */
    private final boolean f26569h;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lza/b$a;", BuildConfig.FLAVOR, "Ljb/h;", "After", "Ljb/h;", "a", "()Ljb/h;", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final jb.h a() {
            return b.f26568l;
        }
    }

    public b() {
        this(false, 1, null);
    }

    public b(boolean z10) {
        super(f26566j, f26567k, f26568l);
        this.f26569h = z10;
    }

    public /* synthetic */ b(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10);
    }

    @Override // jb.d
    public boolean g() {
        return this.f26569h;
    }
}
