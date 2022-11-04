package k1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.m;
import androidx.lifecycle.s;
import androidx.lifecycle.v;
import androidx.savedstate.Recreator;
import hc.t;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001:\u0003\u001a\u0005\nB\t\b\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0007J\u0010\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0018\u0010\u000e\u001a\u00020\b2\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000bH\u0007J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0004H\u0007¨\u0006\u001b"}, d2 = {"Lk1/c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "key", "Landroid/os/Bundle;", "b", "Lk1/c$c;", "provider", "Ltb/e0;", "h", "c", "Ljava/lang/Class;", "Lk1/c$a;", "clazz", "i", "Landroidx/lifecycle/m;", "lifecycle", "e", "(Landroidx/lifecycle/m;)V", "savedState", "f", "(Landroid/os/Bundle;)V", "outBundle", "g", "<init>", "()V", "a", "savedstate_release"}, k = 1, mv = {1, 6, 0})
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class c {
    private static final b Companion = new b(null);

    /* renamed from: b */
    private boolean f14564b;

    /* renamed from: c */
    private Bundle f14565c;

    /* renamed from: d */
    private boolean f14566d;

    /* renamed from: e */
    private Recreator.b f14567e;

    /* renamed from: a */
    private final n.b<String, AbstractC0210c> f14563a = new n.b<>();

    /* renamed from: f */
    private boolean f14568f = true;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lk1/c$a;", BuildConfig.FLAVOR, "Lk1/e;", "owner", "Ltb/e0;", "a", "savedstate_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public interface a {
        void a(e eVar);
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lk1/c$b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "SAVED_COMPONENTS_KEY", "Ljava/lang/String;", "<init>", "()V", "savedstate_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    private static final class b {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0004"}, d2 = {"Lk1/c$c;", BuildConfig.FLAVOR, "Landroid/os/Bundle;", "a", "savedstate_release"}, k = 1, mv = {1, 6, 0})
    /* renamed from: k1.c$c */
    /* loaded from: classes.dex */
    public interface AbstractC0210c {
        Bundle a();
    }

    public static final void d(c cVar, v vVar, m.b bVar) {
        boolean z10;
        t.e(cVar, "this$0");
        t.e(vVar, "<anonymous parameter 0>");
        t.e(bVar, "event");
        if (bVar == m.b.ON_START) {
            z10 = true;
        } else if (bVar != m.b.ON_STOP) {
            return;
        } else {
            z10 = false;
        }
        cVar.f14568f = z10;
    }

    public final Bundle b(String str) {
        t.e(str, "key");
        if (this.f14566d) {
            Bundle bundle = this.f14565c;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle != null ? bundle.getBundle(str) : null;
            Bundle bundle3 = this.f14565c;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = this.f14565c;
            boolean z10 = false;
            if (bundle4 != null && !bundle4.isEmpty()) {
                z10 = true;
            }
            if (!z10) {
                this.f14565c = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    public final AbstractC0210c c(String str) {
        t.e(str, "key");
        Iterator<Map.Entry<String, AbstractC0210c>> it = this.f14563a.iterator();
        while (it.hasNext()) {
            Map.Entry<String, AbstractC0210c> next = it.next();
            t.d(next, "components");
            AbstractC0210c value = next.getValue();
            if (t.a(next.getKey(), str)) {
                return value;
            }
        }
        return null;
    }

    public final void e(m mVar) {
        t.e(mVar, "lifecycle");
        if (!this.f14564b) {
            mVar.a(new s() { // from class: k1.b
                @Override // androidx.lifecycle.s
                public final void f(v vVar, m.b bVar) {
                    c.d(c.this, vVar, bVar);
                }
            });
            this.f14564b = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already attached.".toString());
    }

    public final void f(Bundle bundle) {
        if (this.f14564b) {
            if (!(!this.f14566d)) {
                throw new IllegalStateException("SavedStateRegistry was already restored.".toString());
            }
            this.f14565c = bundle != null ? bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key") : null;
            this.f14566d = true;
            return;
        }
        throw new IllegalStateException("You must call performAttach() before calling performRestore(Bundle).".toString());
    }

    public final void g(Bundle bundle) {
        t.e(bundle, "outBundle");
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f14565c;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        n.b<String, AbstractC0210c>.d d10 = this.f14563a.d();
        t.d(d10, "this.components.iteratorWithAdditions()");
        while (d10.hasNext()) {
            Map.Entry next = d10.next();
            bundle2.putBundle((String) next.getKey(), ((AbstractC0210c) next.getValue()).a());
        }
        if (!bundle2.isEmpty()) {
            bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
        }
    }

    public final void h(String str, AbstractC0210c abstractC0210c) {
        t.e(str, "key");
        t.e(abstractC0210c, "provider");
        if (this.f14563a.i(str, abstractC0210c) == null) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
    }

    public final void i(Class<? extends a> cls) {
        t.e(cls, "clazz");
        if (this.f14568f) {
            Recreator.b bVar = this.f14567e;
            if (bVar == null) {
                bVar = new Recreator.b(this);
            }
            this.f14567e = bVar;
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.b bVar2 = this.f14567e;
                if (bVar2 == null) {
                    return;
                }
                String name = cls.getName();
                t.d(name, "clazz.name");
                bVar2.b(name);
                return;
            } catch (NoSuchMethodException e10) {
                throw new IllegalArgumentException("Class " + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e10);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
    }
}
