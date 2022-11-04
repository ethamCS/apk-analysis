package p8;

import hc.t;
import j$.time.Duration;
import j$.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.p;
import kotlinx.coroutines.flow.y;
import org.conscrypt.BuildConfig;
import p8.b;
import q7.e;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0003\u001a\u00020\u0002R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lp8/a;", BuildConfig.FLAVOR, "Ltb/e0;", "b", "Lkotlinx/coroutines/flow/p;", "Lp8/b;", "state", "Lkotlinx/coroutines/flow/p;", "a", "()Lkotlinx/coroutines/flow/p;", "Lq7/e;", "kronosClock", "<init>", "(Lq7/e;)V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {
    private static final C0295a Companion = new C0295a(null);

    /* renamed from: a */
    private final e f18997a;

    /* renamed from: b */
    private final p<b> f18998b = y.a(b.C0296b.f19000a);

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lp8/a$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "MAX_TIME_OFFSET_MINUTES", "I", "<init>", "()V", "common-app_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: p8.a$a */
    /* loaded from: classes.dex */
    private static final class C0295a {
        private C0295a() {
        }

        public /* synthetic */ C0295a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public a(e eVar) {
        t.e(eVar, "kronosClock");
        this.f18997a = eVar;
    }

    public final p<b> a() {
        return this.f18998b;
    }

    public final void b() {
        Instant ofEpochMilli = Instant.ofEpochMilli(this.f18997a.b());
        if (Math.abs(Duration.between(ofEpochMilli, Instant.now()).toMinutes()) <= 120) {
            this.f18998b.setValue(b.C0296b.f19000a);
            return;
        }
        p<b> pVar = this.f18998b;
        t.d(ofEpochMilli, "kronosTime");
        pVar.setValue(new b.a(ofEpochMilli));
    }
}
