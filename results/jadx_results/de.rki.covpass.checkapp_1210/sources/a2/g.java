package a2;

import android.content.Context;
/* loaded from: classes.dex */
public class g {

    /* renamed from: e */
    private static g f174e;

    /* renamed from: a */
    private a f175a;

    /* renamed from: b */
    private b f176b;

    /* renamed from: c */
    private e f177c;

    /* renamed from: d */
    private f f178d;

    private g(Context context, e2.a aVar) {
        Context applicationContext = context.getApplicationContext();
        this.f175a = new a(applicationContext, aVar);
        this.f176b = new b(applicationContext, aVar);
        this.f177c = new e(applicationContext, aVar);
        this.f178d = new f(applicationContext, aVar);
    }

    public static synchronized g c(Context context, e2.a aVar) {
        g gVar;
        synchronized (g.class) {
            if (f174e == null) {
                f174e = new g(context, aVar);
            }
            gVar = f174e;
        }
        return gVar;
    }

    public a a() {
        return this.f175a;
    }

    public b b() {
        return this.f176b;
    }

    public e d() {
        return this.f177c;
    }

    public f e() {
        return this.f178d;
    }
}
