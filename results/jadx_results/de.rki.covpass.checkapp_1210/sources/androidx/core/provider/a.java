package androidx.core.provider;

import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.f;
import androidx.core.provider.g;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    private final g.c f3505a;

    /* renamed from: b */
    private final Handler f3506b;

    /* renamed from: androidx.core.provider.a$a */
    /* loaded from: classes.dex */
    public class RunnableC0033a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ g.c f3507c;

        /* renamed from: d */
        final /* synthetic */ Typeface f3508d;

        RunnableC0033a(g.c cVar, Typeface typeface) {
            a.this = r1;
            this.f3507c = cVar;
            this.f3508d = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3507c.b(this.f3508d);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: c */
        final /* synthetic */ g.c f3510c;

        /* renamed from: d */
        final /* synthetic */ int f3511d;

        b(g.c cVar, int i10) {
            a.this = r1;
            this.f3510c = cVar;
            this.f3511d = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f3510c.a(this.f3511d);
        }
    }

    public a(g.c cVar, Handler handler) {
        this.f3505a = cVar;
        this.f3506b = handler;
    }

    private void a(int i10) {
        this.f3506b.post(new b(this.f3505a, i10));
    }

    private void c(Typeface typeface) {
        this.f3506b.post(new RunnableC0033a(this.f3505a, typeface));
    }

    public void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f3535a);
        } else {
            a(eVar.f3536b);
        }
    }
}
