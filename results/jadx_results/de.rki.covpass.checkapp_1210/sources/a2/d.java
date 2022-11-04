package a2;

import android.content.Context;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import u1.k;
/* loaded from: classes.dex */
public abstract class d<T> {

    /* renamed from: f */
    private static final String f159f = k.f("ConstraintTracker");

    /* renamed from: a */
    protected final e2.a f160a;

    /* renamed from: b */
    protected final Context f161b;

    /* renamed from: c */
    private final Object f162c = new Object();

    /* renamed from: d */
    private final Set<y1.a<T>> f163d = new LinkedHashSet();

    /* renamed from: e */
    T f164e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ List f165c;

        a(List list) {
            d.this = r1;
            this.f165c = list;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (y1.a aVar : this.f165c) {
                aVar.a(d.this.f164e);
            }
        }
    }

    public d(Context context, e2.a aVar) {
        this.f161b = context.getApplicationContext();
        this.f160a = aVar;
    }

    public void a(y1.a<T> aVar) {
        synchronized (this.f162c) {
            if (this.f163d.add(aVar)) {
                if (this.f163d.size() == 1) {
                    this.f164e = b();
                    k.c().a(f159f, String.format("%s: initial state = %s", getClass().getSimpleName(), this.f164e), new Throwable[0]);
                    e();
                }
                aVar.a(this.f164e);
            }
        }
    }

    public abstract T b();

    public void c(y1.a<T> aVar) {
        synchronized (this.f162c) {
            if (this.f163d.remove(aVar) && this.f163d.isEmpty()) {
                f();
            }
        }
    }

    public void d(T t10) {
        synchronized (this.f162c) {
            T t11 = this.f164e;
            if (t11 != t10 && (t11 == null || !t11.equals(t10))) {
                this.f164e = t10;
                this.f160a.a().execute(new a(new ArrayList(this.f163d)));
            }
        }
    }

    public abstract void e();

    public abstract void f();
}
