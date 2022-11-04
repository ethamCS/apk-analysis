package k7;

import android.app.Application;
import android.content.Context;
import kotlin.Lazy;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0012\u0010\u0003\u001a\u00020\u0002*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000\"!\u0010\u000b\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b\"\u0015\u0010\u000b\u001a\u00020\u0004*\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"!\u0010\u0013\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0006\u0012\u0004\b\u0012\u0010\n\u001a\u0004\b\u0010\u0010\u0011\"\u0015\u0010\u0013\u001a\u00020\u0002*\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {BuildConfig.FLAVOR, "flags", BuildConfig.FLAVOR, "c", BuildConfig.FLAVOR, "appVersion$delegate", "Lkotlin/Lazy;", "a", "()Ljava/lang/String;", "getAppVersion$annotations", "()V", "appVersion", "Landroid/app/Application;", "b", "(Landroid/app/Application;)Ljava/lang/String;", "isDebuggable$delegate", "d", "()Z", "isDebuggable$annotations", "isDebuggable", "Landroid/content/Context;", "e", "(Landroid/content/Context;)Z", "android-utils_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a */
    private static final Lazy f14640a;

    /* renamed from: b */
    private static final Lazy f14641b;

    /* renamed from: c */
    private static final Lazy f14642c;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class a extends hc.v implements gc.a<String> {

        /* renamed from: c */
        public static final a f14643c = new a();

        a() {
            super(0);
        }

        /* renamed from: b */
        public final String invoke() {
            return c.b(k7.b.a().b());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class b extends hc.v implements gc.a<Boolean> {

        /* renamed from: c */
        public static final b f14644c = new b();

        b() {
            super(0);
        }

        /* renamed from: b */
        public final Boolean invoke() {
            return Boolean.valueOf(c.e(k7.b.a().b()));
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {BuildConfig.FLAVOR, "kotlin.jvm.PlatformType", "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: k7.c$c */
    /* loaded from: classes.dex */
    static final class C0214c extends hc.v implements gc.a<String> {

        /* renamed from: c */
        public static final C0214c f14645c = new C0214c();

        C0214c() {
            super(0);
        }

        /* renamed from: b */
        public final String invoke() {
            return k7.b.a().b().getPackageName();
        }
    }

    static {
        Lazy a10;
        Lazy a11;
        Lazy a12;
        a10 = tb.m.a(C0214c.f14645c);
        f14640a = a10;
        a11 = tb.m.a(a.f14643c);
        f14641b = a11;
        a12 = tb.m.a(b.f14644c);
        f14642c = a12;
    }

    public static final String a() {
        return (String) f14641b.getValue();
    }

    public static final String b(Application application) {
        hc.t.e(application, "<this>");
        String str = application.getPackageManager().getPackageInfo(application.getPackageName(), 0).versionName;
        hc.t.d(str, "packageManager.getPackag…ckageName, 0).versionName");
        return str;
    }

    public static final boolean c(int i10, int i11) {
        return (i10 & i11) == i11;
    }

    public static final boolean d() {
        return ((Boolean) f14642c.getValue()).booleanValue();
    }

    public static final boolean e(Context context) {
        hc.t.e(context, "<this>");
        return c(context.getApplicationInfo().flags, 2);
    }
}
