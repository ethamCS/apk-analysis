package ya;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lya/f;", "Ljb/d;", BuildConfig.FLAVOR, "Lya/c;", BuildConfig.FLAVOR, "developmentMode", "Z", "g", "()Z", "<init>", "(Z)V", "a", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class f extends jb.d<Object, c> {

    /* renamed from: i */
    public static final a f25994i = new a(null);

    /* renamed from: j */
    private static final jb.h f25995j = new jb.h("Before");

    /* renamed from: k */
    private static final jb.h f25996k = new jb.h("State");

    /* renamed from: l */
    private static final jb.h f25997l = new jb.h("Transform");

    /* renamed from: m */
    private static final jb.h f25998m = new jb.h("Render");

    /* renamed from: n */
    private static final jb.h f25999n = new jb.h("Send");

    /* renamed from: h */
    private final boolean f26000h;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0004\u001a\u0004\b\f\u0010\u0006R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0004\u001a\u0004\b\u000e\u0010\u0006¨\u0006\u0011"}, d2 = {"Lya/f$a;", BuildConfig.FLAVOR, "Ljb/h;", "Before", "Ljb/h;", "a", "()Ljb/h;", "State", "d", "Transform", "e", "Render", "b", "Send", "c", "<init>", "()V", "ktor-client-core"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final jb.h a() {
            return f.f25995j;
        }

        public final jb.h b() {
            return f.f25998m;
        }

        public final jb.h c() {
            return f.f25999n;
        }

        public final jb.h d() {
            return f.f25996k;
        }

        public final jb.h e() {
            return f.f25997l;
        }
    }

    public f() {
        this(false, 1, null);
    }

    public f(boolean z10) {
        super(f25995j, f25996k, f25997l, f25998m, f25999n);
        this.f26000h = z10;
    }

    public /* synthetic */ f(boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10);
    }

    @Override // jb.d
    public boolean g() {
        return this.f26000h;
    }
}
