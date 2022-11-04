package j8;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import hc.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import m7.v;
import m7.w;
import m7.x;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u000bB\u0011\u0012\b\b\u0003\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016J\u0010\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001d"}, d2 = {"Lj8/b;", "Lk7/e;", "Lm7/x;", "Lm8/b;", "Landroid/os/Bundle;", "savedInstanceState", "Ltb/e0;", "onCreate", "onBackPressed", BuildConfig.FLAVOR, "error", "a", BuildConfig.FLAVOR, "isLoading", "G", BuildConfig.FLAVOR, "tag", "Lm8/a;", "action", "h", "Lm7/v;", "navigator", "Lm7/v;", "N", "()Lm7/v;", BuildConfig.FLAVOR, "contentLayoutId", "<init>", "(I)V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class b extends k7.e implements x, m8.b {
    public static final a Companion = new a(null);

    /* renamed from: o4 */
    private final v f14057o4;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lj8/b$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "UPDATE_AVAILABLE_TAG", "Ljava/lang/String;", "<init>", "()V", "common-app_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public b() {
        this(0, 1, null);
    }

    public b(int i10) {
        super(i10);
        this.f14057o4 = w.b(this, 0, 1, null);
    }

    public /* synthetic */ b(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0 : i10);
    }

    @Override // k7.o
    public void G(boolean z10) {
    }

    @Override // m7.x
    public v N() {
        return this.f14057o4;
    }

    @Override // s4.v
    public void a(Throwable th2) {
        t.e(th2, "error");
        n8.a c10 = l8.b.b(this).c();
        androidx.fragment.app.w m02 = m0();
        t.d(m02, "supportFragmentManager");
        c10.e(th2, m02);
    }

    @Override // m7.x
    public void e(Fragment fragment) {
        x.a.a(this, fragment);
    }

    @Override // m8.b
    public void h(String str, m8.a aVar) {
        t.e(str, "tag");
        t.e(aVar, "action");
        if (!t.a(str, "update_available_tag") || aVar != m8.a.POSITIVE) {
            return;
        }
        try {
            String packageName = getPackageName();
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + packageName)));
        } catch (ActivityNotFoundException unused) {
            String packageName2 = getPackageName();
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=" + packageName2)));
        }
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (t.a(N().o(), l7.c.f15853a)) {
            super.onBackPressed();
        }
    }

    @Override // k7.e, androidx.fragment.app.j, androidx.activity.ComponentActivity, androidx.core.app.f, android.app.Activity
    public void onCreate(Bundle bundle) {
        if (!k7.c.e(this)) {
            getWindow().setFlags(8192, 8192);
        }
        super.onCreate(bundle);
        androidx.fragment.app.w m02 = m0();
        t.d(m02, "supportFragmentManager");
        k7.l.b(m02);
    }

    @Override // m7.x
    public void p(Fragment fragment) {
        x.a.b(this, fragment);
    }
}
