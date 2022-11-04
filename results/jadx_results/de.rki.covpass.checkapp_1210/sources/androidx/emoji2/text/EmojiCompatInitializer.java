package androidx.emoji2.text;

import android.content.Context;
import androidx.emoji2.text.EmojiCompatInitializer;
import androidx.emoji2.text.d;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.v;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements o1.a<Boolean> {

    /* loaded from: classes.dex */
    public static class a extends d.c {
        protected a(Context context) {
            super(new b(context));
            b(1);
        }
    }

    /* loaded from: classes.dex */
    public static class b implements d.g {

        /* renamed from: a */
        private final Context f3811a;

        /* loaded from: classes.dex */
        public class a extends d.h {

            /* renamed from: a */
            final /* synthetic */ d.h f3812a;

            /* renamed from: b */
            final /* synthetic */ ThreadPoolExecutor f3813b;

            a(d.h hVar, ThreadPoolExecutor threadPoolExecutor) {
                b.this = r1;
                this.f3812a = hVar;
                this.f3813b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.d.h
            public void a(Throwable th2) {
                try {
                    this.f3812a.a(th2);
                } finally {
                    this.f3813b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.d.h
            public void b(l lVar) {
                try {
                    this.f3812a.b(lVar);
                } finally {
                    this.f3813b.shutdown();
                }
            }
        }

        b(Context context) {
            this.f3811a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.d.g
        public void a(final d.h hVar) {
            final ThreadPoolExecutor b10 = androidx.emoji2.text.b.b("EmojiCompatInitializer");
            b10.execute(new Runnable() { // from class: androidx.emoji2.text.e
                @Override // java.lang.Runnable
                public final void run() {
                    EmojiCompatInitializer.b.this.d(hVar, b10);
                }
            });
        }

        /* renamed from: c */
        public void d(d.h hVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                i a10 = androidx.emoji2.text.c.a(this.f3811a);
                if (a10 == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                a10.c(threadPoolExecutor);
                a10.a().a(new a(hVar, threadPoolExecutor));
            } catch (Throwable th2) {
                hVar.a(th2);
                threadPoolExecutor.shutdown();
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                androidx.core.os.i.a("EmojiCompat.EmojiCompatInitializer.run");
                if (d.h()) {
                    d.b().k();
                }
            } finally {
                androidx.core.os.i.b();
            }
        }
    }

    @Override // o1.a
    public List<Class<? extends o1.a<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    /* renamed from: c */
    public Boolean b(Context context) {
        d.g(new a(context));
        d(context);
        return Boolean.TRUE;
    }

    void d(Context context) {
        final androidx.lifecycle.m c10 = ((v) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).c();
        c10.a(new androidx.lifecycle.f() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            @Override // androidx.lifecycle.j
            public /* synthetic */ void c(v vVar) {
                androidx.lifecycle.e.a(this, vVar);
            }

            @Override // androidx.lifecycle.j
            public /* synthetic */ void onDestroy(v vVar) {
                androidx.lifecycle.e.b(this, vVar);
            }

            @Override // androidx.lifecycle.j
            public /* synthetic */ void onPause(v vVar) {
                androidx.lifecycle.e.c(this, vVar);
            }

            @Override // androidx.lifecycle.j
            public void onResume(v vVar) {
                EmojiCompatInitializer.this.e();
                c10.c(this);
            }

            @Override // androidx.lifecycle.j
            public /* synthetic */ void onStart(v vVar) {
                androidx.lifecycle.e.e(this, vVar);
            }

            @Override // androidx.lifecycle.j
            public /* synthetic */ void onStop(v vVar) {
                androidx.lifecycle.e.f(this, vVar);
            }
        });
    }

    void e() {
        androidx.emoji2.text.b.d().postDelayed(new c(), 500L);
    }
}
