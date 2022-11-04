package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import e4.r;
import e4.v;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
/* loaded from: classes.dex */
public class o<T> {

    /* renamed from: e */
    public static Executor f6728e = Executors.newCachedThreadPool();

    /* renamed from: a */
    private final Set<r<T>> f6729a;

    /* renamed from: b */
    private final Set<r<Throwable>> f6730b;

    /* renamed from: c */
    private final Handler f6731c;

    /* renamed from: d */
    private volatile v<T> f6732d;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class a extends FutureTask<v<T>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Callable<v<T>> callable) {
            super(callable);
            o.this = r1;
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            if (isCancelled()) {
                return;
            }
            try {
                o.this.k(get());
            } catch (InterruptedException | ExecutionException e10) {
                o.this.k(new v(e10));
            }
        }
    }

    public o(Callable<v<T>> callable) {
        this(callable, false);
    }

    public o(Callable<v<T>> callable, boolean z10) {
        this.f6729a = new LinkedHashSet(1);
        this.f6730b = new LinkedHashSet(1);
        this.f6731c = new Handler(Looper.getMainLooper());
        this.f6732d = null;
        if (!z10) {
            f6728e.execute(new a(callable));
            return;
        }
        try {
            k(callable.call());
        } catch (Throwable th2) {
            k(new v<>(th2));
        }
    }

    public /* synthetic */ void e() {
        v<T> vVar = this.f6732d;
        if (vVar == null) {
            return;
        }
        if (vVar.b() != null) {
            h(vVar.b());
        } else {
            f(vVar.a());
        }
    }

    private synchronized void f(Throwable th2) {
        ArrayList<r> arrayList = new ArrayList(this.f6730b);
        if (arrayList.isEmpty()) {
            q4.d.d("Lottie encountered an error but no failure listener was added:", th2);
            return;
        }
        for (r rVar : arrayList) {
            rVar.a(th2);
        }
    }

    private void g() {
        this.f6731c.post(new Runnable() { // from class: e4.w
            @Override // java.lang.Runnable
            public final void run() {
                com.airbnb.lottie.o.this.e();
            }
        });
    }

    private synchronized void h(T t10) {
        for (r rVar : new ArrayList(this.f6729a)) {
            rVar.a(t10);
        }
    }

    public void k(v<T> vVar) {
        if (this.f6732d == null) {
            this.f6732d = vVar;
            g();
            return;
        }
        throw new IllegalStateException("A task may only be set once.");
    }

    public synchronized o<T> c(r<Throwable> rVar) {
        v<T> vVar = this.f6732d;
        if (vVar != null && vVar.a() != null) {
            rVar.a(vVar.a());
        }
        this.f6730b.add(rVar);
        return this;
    }

    public synchronized o<T> d(r<T> rVar) {
        v<T> vVar = this.f6732d;
        if (vVar != null && vVar.b() != null) {
            rVar.a(vVar.b());
        }
        this.f6729a.add(rVar);
        return this;
    }

    public synchronized o<T> i(r<Throwable> rVar) {
        this.f6730b.remove(rVar);
        return this;
    }

    public synchronized o<T> j(r<T> rVar) {
        this.f6729a.remove(rVar);
        return this;
    }
}
