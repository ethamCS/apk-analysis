package de.rki.covpass.checkapp;

import j8.g;
import k7.c;
import kotlin.Metadata;
import l8.b;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"Lde/rki/covpass/checkapp/App;", "Lj8/g;", "Ltb/e0;", "e", "onCreate", BuildConfig.FLAVOR, "a", "<init>", "()V", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class App extends g {

    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"de/rki/covpass/checkapp/App$a", "Ll8/a;", "La8/a;", "errorHandler", "La8/a;", "j", "()La8/a;", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends l8.a {

        /* renamed from: i */
        private final a8.a f8527i = new a8.a();

        a() {
        }

        /* renamed from: j */
        public a8.a c() {
            return this.f8527i;
        }
    }

    private final void e() {
        b.a().e().c();
    }

    @Override // j8.g
    public String a() {
        String b10 = c.b(this);
        return "CovPassCheckApp/" + b10;
    }

    @Override // j8.g, android.app.Application
    public void onCreate() {
        super.onCreate();
        z7.b.c(new z7.a());
        b.c(new a());
        d();
        e();
    }
}
