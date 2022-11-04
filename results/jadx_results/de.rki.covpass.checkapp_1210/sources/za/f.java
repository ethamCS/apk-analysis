package za;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lza/f;", "Ljb/d;", "Lza/d;", "Loa/b;", BuildConfig.FLAVOR, "developmentMode", "Z", "g", "()Z", "<init>", "(Z)V", "a", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class f extends jb.d<d, oa.b> {

    /* renamed from: i */
    public static final a f26572i = new a(null);

    /* renamed from: j */
    private static final jb.h f26573j = new jb.h("Receive");

    /* renamed from: k */
    private static final jb.h f26574k = new jb.h("Parse");

    /* renamed from: l */
    private static final jb.h f26575l = new jb.h("Transform");

    /* renamed from: m */
    private static final jb.h f26576m = new jb.h("State");

    /* renamed from: n */
    private static final jb.h f26577n = new jb.h("After");

    /* renamed from: h */
    private final boolean f26578h;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006¨\u0006\r"}, d2 = {"Lza/f$a;", BuildConfig.FLAVOR, "Ljb/h;", "Receive", "Ljb/h;", "b", "()Ljb/h;", "Parse", "a", "Transform", "c", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final jb.h a() {
            return f.f26574k;
        }

        public final jb.h b() {
            return f.f26573j;
        }

        public final jb.h c() {
            return f.f26575l;
        }
    }

    public f() {
        this(false, 1, null);
    }

    public f(boolean z10) {
        super(f26573j, f26574k, f26575l, f26576m, f26577n);
        this.f26578h = z10;
    }

    public /* synthetic */ f(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10);
    }

    @Override // jb.d
    public boolean g() {
        return this.f26578h;
    }
}
