package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.e;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private final b f1970a;

    /* renamed from: b */
    private final SavedStateRegistry f1971b = new SavedStateRegistry();

    private a(b bVar) {
        this.f1970a = bVar;
    }

    public static a a(b bVar) {
        return new a(bVar);
    }

    public SavedStateRegistry b() {
        return this.f1971b;
    }

    public void c(Bundle bundle) {
        e a2 = this.f1970a.a();
        if (a2.b() == e.b.INITIALIZED) {
            a2.a(new Recreator(this.f1970a));
            this.f1971b.b(a2, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public void d(Bundle bundle) {
        this.f1971b.c(bundle);
    }
}
