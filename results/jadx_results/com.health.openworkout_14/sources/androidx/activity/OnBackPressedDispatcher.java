package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import androidx.lifecycle.i;
import java.util.ArrayDeque;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a */
    private final Runnable f87a;

    /* renamed from: b */
    final ArrayDeque<b> f88b = new ArrayDeque<>();

    /* loaded from: classes.dex */
    public class LifecycleOnBackPressedCancellable implements g, androidx.activity.a {

        /* renamed from: a */
        private final e f89a;

        /* renamed from: b */
        private final b f90b;

        /* renamed from: c */
        private androidx.activity.a f91c;

        LifecycleOnBackPressedCancellable(e eVar, b bVar) {
            OnBackPressedDispatcher.this = r1;
            this.f89a = eVar;
            this.f90b = bVar;
            eVar.a(this);
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f89a.c(this);
            this.f90b.e(this);
            androidx.activity.a aVar = this.f91c;
            if (aVar != null) {
                aVar.cancel();
                this.f91c = null;
            }
        }

        @Override // androidx.lifecycle.g
        public void d(i iVar, e.a aVar) {
            if (aVar == e.a.ON_START) {
                this.f91c = OnBackPressedDispatcher.this.b(this.f90b);
            } else if (aVar != e.a.ON_STOP) {
                if (aVar != e.a.ON_DESTROY) {
                    return;
                }
                cancel();
            } else {
                androidx.activity.a aVar2 = this.f91c;
                if (aVar2 == null) {
                    return;
                }
                aVar2.cancel();
            }
        }
    }

    /* loaded from: classes.dex */
    public class a implements androidx.activity.a {

        /* renamed from: a */
        private final b f93a;

        a(b bVar) {
            OnBackPressedDispatcher.this = r1;
            this.f93a = bVar;
        }

        @Override // androidx.activity.a
        public void cancel() {
            OnBackPressedDispatcher.this.f88b.remove(this.f93a);
            this.f93a.e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f87a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    public void a(i iVar, b bVar) {
        e a2 = iVar.a();
        if (a2.b() == e.b.DESTROYED) {
            return;
        }
        bVar.a(new LifecycleOnBackPressedCancellable(a2, bVar));
    }

    androidx.activity.a b(b bVar) {
        this.f88b.add(bVar);
        a aVar = new a(bVar);
        bVar.a(aVar);
        return aVar;
    }

    public void c() {
        Iterator<b> descendingIterator = this.f88b.descendingIterator();
        while (descendingIterator.hasNext()) {
            b next = descendingIterator.next();
            if (next.c()) {
                next.b();
                return;
            }
        }
        Runnable runnable = this.f87a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
