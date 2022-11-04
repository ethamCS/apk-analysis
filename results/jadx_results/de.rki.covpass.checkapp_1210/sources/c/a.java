package c;

import android.content.Context;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private final Set<b> f6122a = new CopyOnWriteArraySet();

    /* renamed from: b */
    private volatile Context f6123b;

    public void a(b bVar) {
        if (this.f6123b != null) {
            bVar.a(this.f6123b);
        }
        this.f6122a.add(bVar);
    }

    public void b() {
        this.f6123b = null;
    }

    public void c(Context context) {
        this.f6123b = context;
        for (b bVar : this.f6122a) {
            bVar.a(context);
        }
    }
}
