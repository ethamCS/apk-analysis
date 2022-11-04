package androidx.room;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: e */
    final long f4830e;

    /* renamed from: f */
    final Executor f4831f;

    /* renamed from: i */
    m1.g f4834i;

    /* renamed from: a */
    private m1.h f4826a = null;

    /* renamed from: b */
    private final Handler f4827b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    Runnable f4828c = null;

    /* renamed from: d */
    final Object f4829d = new Object();

    /* renamed from: g */
    int f4832g = 0;

    /* renamed from: h */
    long f4833h = SystemClock.uptimeMillis();

    /* renamed from: j */
    private boolean f4835j = false;

    /* renamed from: k */
    private final Runnable f4836k = new RunnableC0060a();

    /* renamed from: l */
    final Runnable f4837l = new b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.room.a$a */
    /* loaded from: classes.dex */
    public class RunnableC0060a implements Runnable {
        RunnableC0060a() {
            a.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            a aVar = a.this;
            aVar.f4831f.execute(aVar.f4837l);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
            a.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (a.this.f4829d) {
                long uptimeMillis = SystemClock.uptimeMillis();
                a aVar = a.this;
                if (uptimeMillis - aVar.f4833h < aVar.f4830e) {
                    return;
                }
                if (aVar.f4832g != 0) {
                    return;
                }
                Runnable runnable = aVar.f4828c;
                if (runnable == null) {
                    throw new IllegalStateException("mOnAutoCloseCallback is null but it should have been set before use. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                runnable.run();
                m1.g gVar = a.this.f4834i;
                if (gVar != null && gVar.isOpen()) {
                    try {
                        a.this.f4834i.close();
                    } catch (IOException e10) {
                        j1.e.a(e10);
                    }
                    a.this.f4834i = null;
                }
            }
        }
    }

    public a(long j10, TimeUnit timeUnit, Executor executor) {
        this.f4830e = timeUnit.toMillis(j10);
        this.f4831f = executor;
    }

    public void a() {
        synchronized (this.f4829d) {
            this.f4835j = true;
            m1.g gVar = this.f4834i;
            if (gVar != null) {
                gVar.close();
            }
            this.f4834i = null;
        }
    }

    public void b() {
        synchronized (this.f4829d) {
            int i10 = this.f4832g;
            if (i10 > 0) {
                int i11 = i10 - 1;
                this.f4832g = i11;
                if (i11 == 0) {
                    if (this.f4834i == null) {
                        return;
                    }
                    this.f4827b.postDelayed(this.f4836k, this.f4830e);
                }
                return;
            }
            throw new IllegalStateException("ref count is 0 or lower but we're supposed to decrement");
        }
    }

    public <V> V c(o.a<m1.g, V> aVar) {
        try {
            return aVar.apply(e());
        } finally {
            b();
        }
    }

    public m1.g d() {
        m1.g gVar;
        synchronized (this.f4829d) {
            gVar = this.f4834i;
        }
        return gVar;
    }

    public m1.g e() {
        synchronized (this.f4829d) {
            this.f4827b.removeCallbacks(this.f4836k);
            this.f4832g++;
            if (!this.f4835j) {
                m1.g gVar = this.f4834i;
                if (gVar != null && gVar.isOpen()) {
                    return this.f4834i;
                }
                m1.h hVar = this.f4826a;
                if (hVar == null) {
                    throw new IllegalStateException("AutoCloser has not been initialized. Please file a bug against Room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
                }
                m1.g U0 = hVar.U0();
                this.f4834i = U0;
                return U0;
            }
            throw new IllegalStateException("Attempting to open already closed database.");
        }
    }

    public void f(m1.h hVar) {
        if (this.f4826a != null) {
            Log.e("ROOM", "AutoCloser initialized multiple times. Please file a bug against room at: https://issuetracker.google.com/issues/new?component=413107&template=1096568");
        } else {
            this.f4826a = hVar;
        }
    }

    public boolean g() {
        return !this.f4835j;
    }

    public void h(Runnable runnable) {
        this.f4828c = runnable;
    }
}
