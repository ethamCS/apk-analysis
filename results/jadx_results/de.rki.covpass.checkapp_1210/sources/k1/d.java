package k1;

import android.os.Bundle;
import androidx.lifecycle.m;
import androidx.savedstate.Recreator;
import hc.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0007J\u0012\u0010\u0006\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0004H\u0007R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0013"}, d2 = {"Lk1/d;", BuildConfig.FLAVOR, "Ltb/e0;", "c", "Landroid/os/Bundle;", "savedState", "d", "outBundle", "e", "Lk1/c;", "savedStateRegistry", "Lk1/c;", "b", "()Lk1/c;", "Lk1/e;", "owner", "<init>", "(Lk1/e;)V", "a", "savedstate_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class d {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final e f14569a;

    /* renamed from: b */
    private final c f14570b;

    /* renamed from: c */
    private boolean f14571c;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, d2 = {"Lk1/d$a;", BuildConfig.FLAVOR, "Lk1/e;", "owner", "Lk1/d;", "a", "<init>", "()V", "savedstate_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @fc.c
        public final d a(e eVar) {
            t.e(eVar, "owner");
            return new d(eVar, null);
        }
    }

    private d(e eVar) {
        this.f14569a = eVar;
        this.f14570b = new c();
    }

    public /* synthetic */ d(e eVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(eVar);
    }

    @fc.c
    public static final d a(e eVar) {
        return Companion.a(eVar);
    }

    public final c b() {
        return this.f14570b;
    }

    public final void c() {
        m c10 = this.f14569a.c();
        t.d(c10, "owner.lifecycle");
        if (c10.b() == m.c.INITIALIZED) {
            c10.a(new Recreator(this.f14569a));
            this.f14570b.e(c10);
            this.f14571c = true;
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage".toString());
    }

    public final void d(Bundle bundle) {
        if (!this.f14571c) {
            c();
        }
        m c10 = this.f14569a.c();
        t.d(c10, "owner.lifecycle");
        if (!c10.b().b(m.c.STARTED)) {
            this.f14570b.f(bundle);
            return;
        }
        throw new IllegalStateException(("performRestore cannot be called when owner is " + c10.b()).toString());
    }

    public final void e(Bundle bundle) {
        t.e(bundle, "outBundle");
        this.f14570b.g(bundle);
    }
}
