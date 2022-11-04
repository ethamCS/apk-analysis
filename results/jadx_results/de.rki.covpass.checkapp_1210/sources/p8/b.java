package p8;

import hc.t;
import j$.time.Instant;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lp8/b;", BuildConfig.FLAVOR, "a", "b", "Lp8/b$a;", "Lp8/b$b;", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public interface b {

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lp8/b$a;", "Lp8/b;", "j$/time/Instant", "realTime", "Lj$/time/Instant;", "a", "()Lj$/time/Instant;", "<init>", "(Lj$/time/Instant;)V", "common-app_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a implements b {

        /* renamed from: a */
        private final Instant f18999a;

        public a(Instant instant) {
            t.e(instant, "realTime");
            this.f18999a = instant;
        }

        public final Instant a() {
            return this.f18999a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lp8/b$b;", "Lp8/b;", "<init>", "()V", "common-app_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: p8.b$b */
    /* loaded from: classes.dex */
    public static final class C0296b implements b {

        /* renamed from: a */
        public static final C0296b f19000a = new C0296b();

        private C0296b() {
        }
    }
}
