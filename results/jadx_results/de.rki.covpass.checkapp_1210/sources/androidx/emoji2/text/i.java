package androidx.emoji2.text;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.Handler;
import androidx.core.provider.g;
import androidx.emoji2.text.d;
import androidx.emoji2.text.i;
import java.nio.ByteBuffer;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
/* loaded from: classes.dex */
public class i extends d.c {

    /* renamed from: j */
    private static final a f3876j = new a();

    /* loaded from: classes.dex */
    public static class a {
        public Typeface a(Context context, g.b bVar) {
            return androidx.core.provider.g.a(context, null, new g.b[]{bVar});
        }

        public g.a b(Context context, androidx.core.provider.e eVar) {
            return androidx.core.provider.g.b(context, null, eVar);
        }

        public void c(Context context, ContentObserver contentObserver) {
            context.getContentResolver().unregisterContentObserver(contentObserver);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements d.g {

        /* renamed from: a */
        private final Context f3877a;

        /* renamed from: b */
        private final androidx.core.provider.e f3878b;

        /* renamed from: c */
        private final a f3879c;

        /* renamed from: d */
        private final Object f3880d = new Object();

        /* renamed from: e */
        private Handler f3881e;

        /* renamed from: f */
        private Executor f3882f;

        /* renamed from: g */
        private ThreadPoolExecutor f3883g;

        /* renamed from: h */
        d.h f3884h;

        /* renamed from: i */
        private ContentObserver f3885i;

        /* renamed from: j */
        private Runnable f3886j;

        b(Context context, androidx.core.provider.e eVar, a aVar) {
            androidx.core.util.h.h(context, "Context cannot be null");
            androidx.core.util.h.h(eVar, "FontRequest cannot be null");
            this.f3877a = context.getApplicationContext();
            this.f3878b = eVar;
            this.f3879c = aVar;
        }

        private void b() {
            synchronized (this.f3880d) {
                this.f3884h = null;
                ContentObserver contentObserver = this.f3885i;
                if (contentObserver != null) {
                    this.f3879c.c(this.f3877a, contentObserver);
                    this.f3885i = null;
                }
                Handler handler = this.f3881e;
                if (handler != null) {
                    handler.removeCallbacks(this.f3886j);
                }
                this.f3881e = null;
                ThreadPoolExecutor threadPoolExecutor = this.f3883g;
                if (threadPoolExecutor != null) {
                    threadPoolExecutor.shutdown();
                }
                this.f3882f = null;
                this.f3883g = null;
            }
        }

        private g.b e() {
            try {
                g.a b10 = this.f3879c.b(this.f3877a, this.f3878b);
                if (b10.c() == 0) {
                    g.b[] b11 = b10.b();
                    if (b11 != null && b11.length != 0) {
                        return b11[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException("fetchFonts failed (" + b10.c() + ")");
            } catch (PackageManager.NameNotFoundException e10) {
                throw new RuntimeException("provider not found", e10);
            }
        }

        @Override // androidx.emoji2.text.d.g
        public void a(d.h hVar) {
            androidx.core.util.h.h(hVar, "LoaderCallback cannot be null");
            synchronized (this.f3880d) {
                this.f3884h = hVar;
            }
            d();
        }

        public void c() {
            synchronized (this.f3880d) {
                if (this.f3884h == null) {
                    return;
                }
                try {
                    g.b e10 = e();
                    int b10 = e10.b();
                    if (b10 == 2) {
                        synchronized (this.f3880d) {
                        }
                    }
                    if (b10 != 0) {
                        throw new RuntimeException("fetchFonts result is not OK. (" + b10 + ")");
                    }
                    androidx.core.os.i.a("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                    Typeface a10 = this.f3879c.a(this.f3877a, e10);
                    ByteBuffer f10 = androidx.core.graphics.l.f(this.f3877a, null, e10.d());
                    if (f10 == null || a10 == null) {
                        throw new RuntimeException("Unable to open file.");
                    }
                    l b11 = l.b(a10, f10);
                    androidx.core.os.i.b();
                    synchronized (this.f3880d) {
                        d.h hVar = this.f3884h;
                        if (hVar != null) {
                            hVar.b(b11);
                        }
                    }
                    b();
                } catch (Throwable th2) {
                    synchronized (this.f3880d) {
                        d.h hVar2 = this.f3884h;
                        if (hVar2 != null) {
                            hVar2.a(th2);
                        }
                        b();
                    }
                }
            }
        }

        void d() {
            synchronized (this.f3880d) {
                if (this.f3884h == null) {
                    return;
                }
                if (this.f3882f == null) {
                    ThreadPoolExecutor b10 = androidx.emoji2.text.b.b("emojiCompat");
                    this.f3883g = b10;
                    this.f3882f = b10;
                }
                this.f3882f.execute(new Runnable() { // from class: androidx.emoji2.text.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        i.b.this.c();
                    }
                });
            }
        }

        public void f(Executor executor) {
            synchronized (this.f3880d) {
                this.f3882f = executor;
            }
        }
    }

    public i(Context context, androidx.core.provider.e eVar) {
        super(new b(context, eVar, f3876j));
    }

    public i c(Executor executor) {
        ((b) a()).f(executor);
        return this;
    }
}
