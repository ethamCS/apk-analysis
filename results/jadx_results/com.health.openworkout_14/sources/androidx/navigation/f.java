package androidx.navigation;

import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.e;
import androidx.savedstate.SavedStateRegistry;
import java.util.UUID;
/* loaded from: classes.dex */
public final class f implements androidx.lifecycle.i, androidx.lifecycle.w, androidx.savedstate.b {

    /* renamed from: b */
    private final l f1297b;

    /* renamed from: c */
    private Bundle f1298c;

    /* renamed from: d */
    private final androidx.lifecycle.j f1299d;

    /* renamed from: e */
    private final androidx.savedstate.a f1300e;

    /* renamed from: f */
    final UUID f1301f;

    /* renamed from: g */
    private e.b f1302g;

    /* renamed from: h */
    private e.b f1303h;
    private h i;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f1304a;

        static {
            int[] iArr = new int[e.a.values().length];
            f1304a = iArr;
            try {
                iArr[e.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1304a[e.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1304a[e.a.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1304a[e.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1304a[e.a.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1304a[e.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1304a[e.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public f(Context context, l lVar, Bundle bundle, androidx.lifecycle.i iVar, h hVar) {
        this(context, lVar, bundle, iVar, hVar, UUID.randomUUID(), null);
    }

    public f(Context context, l lVar, Bundle bundle, androidx.lifecycle.i iVar, h hVar, UUID uuid, Bundle bundle2) {
        this.f1299d = new androidx.lifecycle.j(this);
        androidx.savedstate.a a2 = androidx.savedstate.a.a(this);
        this.f1300e = a2;
        this.f1302g = e.b.CREATED;
        this.f1303h = e.b.RESUMED;
        this.f1301f = uuid;
        this.f1297b = lVar;
        this.f1298c = bundle;
        this.i = hVar;
        a2.c(bundle2);
        if (iVar != null) {
            this.f1302g = iVar.a().b();
        }
    }

    private static e.b g(e.a aVar) {
        switch (a.f1304a[aVar.ordinal()]) {
            case 1:
            case 2:
                return e.b.CREATED;
            case 3:
            case 4:
                return e.b.STARTED;
            case 5:
                return e.b.RESUMED;
            case 6:
                return e.b.DESTROYED;
            default:
                throw new IllegalArgumentException("Unexpected event value " + aVar);
        }
    }

    @Override // androidx.lifecycle.i
    public androidx.lifecycle.e a() {
        return this.f1299d;
    }

    public Bundle b() {
        return this.f1298c;
    }

    @Override // androidx.savedstate.b
    public SavedStateRegistry d() {
        return this.f1300e.b();
    }

    public l e() {
        return this.f1297b;
    }

    public e.b f() {
        return this.f1303h;
    }

    @Override // androidx.lifecycle.w
    public androidx.lifecycle.v h() {
        h hVar = this.i;
        if (hVar != null) {
            return hVar.g(this.f1301f);
        }
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    public void i(e.a aVar) {
        this.f1302g = g(aVar);
        m();
    }

    public void j(Bundle bundle) {
        this.f1298c = bundle;
    }

    public void k(Bundle bundle) {
        this.f1300e.d(bundle);
    }

    public void l(e.b bVar) {
        this.f1303h = bVar;
        m();
    }

    public void m() {
        e.b bVar;
        androidx.lifecycle.j jVar;
        if (this.f1302g.ordinal() < this.f1303h.ordinal()) {
            jVar = this.f1299d;
            bVar = this.f1302g;
        } else {
            jVar = this.f1299d;
            bVar = this.f1303h;
        }
        jVar.p(bVar);
    }
}
