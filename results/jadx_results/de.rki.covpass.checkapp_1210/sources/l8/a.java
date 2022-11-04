package l8;

import android.content.Context;
import f9.d;
import hc.t;
import hc.v;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import q7.e;
import tb.m;
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0001\u0012B\u0007¢\u0006\u0004\b.\u0010/R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001b\u0010#\u001a\u00020\u001e8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001b\u0010-\u001a\u00020)8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010,¨\u00060"}, d2 = {"Ll8/a;", BuildConfig.FLAVOR, "Ln8/a;", "c", "()Ln8/a;", "errorHandler", BuildConfig.FLAVOR, "d", "()Ljava/lang/String;", "fileProviderAuthority", "Lv8/c;", "onboardingRepository", "Lv8/c;", "f", "()Lv8/c;", "Lv8/a;", "acousticFeedbackRepository", "Lv8/a;", "a", "()Lv8/a;", "Lx8/a;", "updateInfoRepository", "Lx8/a;", "i", "()Lx8/a;", "Lv8/b;", "checkContextRepository", "Lv8/b;", "b", "()Lv8/b;", "Lq7/e;", "kronosClock$delegate", "Lkotlin/Lazy;", "e", "()Lq7/e;", "kronosClock", "Lp8/a;", "timeValidationRepository", "Lp8/a;", "h", "()Lp8/a;", "Ly8/c;", "settingsUpdateListBuilder$delegate", "g", "()Ly8/c;", "settingsUpdateListBuilder", "<init>", "()V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class a {
    private static final C0239a Companion = new C0239a(null);

    /* renamed from: a */
    private final gf.b f15854a;

    /* renamed from: b */
    private final v8.c f15855b;

    /* renamed from: c */
    private final v8.a f15856c;

    /* renamed from: d */
    private final x8.a f15857d;

    /* renamed from: e */
    private final v8.b f15858e;

    /* renamed from: f */
    private final Lazy f15859f;

    /* renamed from: g */
    private final p8.a f15860g = new p8.a(e());

    /* renamed from: h */
    private final Lazy f15861h;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Ll8/a$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "DE_NTP_HOST", "Ljava/lang/String;", "<init>", "()V", "common-app_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: l8.a$a */
    /* loaded from: classes.dex */
    private static final class C0239a {
        private C0239a() {
        }

        public /* synthetic */ C0239a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lq7/e;", "b", "()Lq7/e;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends v implements gc.a<e> {

        /* renamed from: c */
        public static final b f15862c = new b();

        b() {
            super(0);
        }

        /* renamed from: b */
        public final e invoke() {
            List d10;
            e b10;
            Context applicationContext = d.a().K().getApplicationContext();
            t.d(applicationContext, "sdkDeps.application.applicationContext");
            d10 = ub.t.d("1.de.pool.ntp.org");
            b10 = q7.a.b(applicationContext, (r21 & 2) != 0 ? null : null, (r21 & 4) != 0 ? q7.d.f19700f.d() : d10, (r21 & 8) != 0 ? q7.d.f19700f.e() : 0L, (r21 & 16) != 0 ? q7.d.f19700f.c() : 0L, (r21 & 32) != 0 ? q7.d.f19700f.a() : 0L, (r21 & 64) != 0 ? q7.d.f19700f.b() : 0L);
            return b10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ly8/c;", "b", "()Ly8/c;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class c extends v implements gc.a<y8.c> {

        /* renamed from: c */
        public static final c f15863c = new c();

        c() {
            super(0);
        }

        /* renamed from: b */
        public final y8.c invoke() {
            return new y8.c(d.a().Y0(), d.a().G0(), d.a().V0());
        }
    }

    public a() {
        Lazy a10;
        Lazy a11;
        gf.b X = d.a().X();
        this.f15854a = X;
        this.f15855b = new v8.c(new v9.a("onboarding_prefs", X));
        this.f15856c = new v8.a(new v9.a("acoustic_feedback_prefs", X));
        this.f15857d = new x8.a(new v9.a("update_info_prefs", X));
        this.f15858e = new v8.b(new v9.a("covpass_check_prefs", X));
        a10 = m.a(b.f15862c);
        this.f15859f = a10;
        a11 = m.a(c.f15863c);
        this.f15861h = a11;
    }

    public final v8.a a() {
        return this.f15856c;
    }

    public final v8.b b() {
        return this.f15858e;
    }

    public abstract n8.a c();

    public final String d() {
        String packageName = k7.b.a().b().getPackageName();
        return packageName + ".covpass.provider";
    }

    public final e e() {
        return (e) this.f15859f.getValue();
    }

    public final v8.c f() {
        return this.f15855b;
    }

    public final y8.c g() {
        return (y8.c) this.f15861h.getValue();
    }

    public final p8.a h() {
        return this.f15860g;
    }

    public final x8.a i() {
        return this.f15857d;
    }
}
