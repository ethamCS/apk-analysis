package io.ktor.utils.io.internal;

import io.ktor.utils.io.o;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000b\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0001\u0005B\u0011\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000f"}, d2 = {"Lio/ktor/utils/io/internal/c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "a", "Ljava/lang/Throwable;", "b", "()Ljava/lang/Throwable;", "cause", "c", "sendException", "<init>", "(Ljava/lang/Throwable;)V", "Companion", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class c {
    public static final a Companion = new a(null);

    /* renamed from: b */
    private static final c f12876b = new c(null);

    /* renamed from: a */
    private final Throwable f12877a;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lio/ktor/utils/io/internal/c$a;", BuildConfig.FLAVOR, "Lio/ktor/utils/io/internal/c;", "EmptyCause", "Lio/ktor/utils/io/internal/c;", "a", "()Lio/ktor/utils/io/internal/c;", "<init>", "()V", "ktor-io"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final c a() {
            return c.f12876b;
        }
    }

    public c(Throwable th2) {
        this.f12877a = th2;
    }

    public final Throwable b() {
        return this.f12877a;
    }

    public final Throwable c() {
        Throwable th2 = this.f12877a;
        return th2 == null ? new o("The channel was closed") : th2;
    }

    public String toString() {
        return "Closed[" + c() + ']';
    }
}
