package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.e;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private final b f1155a;

    /* renamed from: b */
    private final SavedStateRegistry f1156b = new SavedStateRegistry();

    private a(b bVar) {
        this.f1155a = bVar;
    }

    public static a a(b bVar) {
        return new a(bVar);
    }

    public SavedStateRegistry a() {
        return this.f1156b;
    }

    public void a(Bundle bundle) {
        e a2 = this.f1155a.a();
        if (a2.a() == e.b.INITIALIZED) {
            a2.a(new Recreator(this.f1155a));
            this.f1156b.a(a2, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    public void b(Bundle bundle) {
        this.f1156b.a(bundle);
    }
}
