package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.m;
import androidx.lifecycle.s;
import androidx.lifecycle.v;
import java.util.ArrayDeque;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a */
    private final Runnable f590a;

    /* renamed from: b */
    final ArrayDeque<g> f591b = new ArrayDeque<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class LifecycleOnBackPressedCancellable implements s, androidx.activity.a {

        /* renamed from: c */
        private final m f592c;

        /* renamed from: d */
        private final g f593d;

        /* renamed from: q */
        private androidx.activity.a f594q;

        LifecycleOnBackPressedCancellable(m mVar, g gVar) {
            OnBackPressedDispatcher.this = r1;
            this.f592c = mVar;
            this.f593d = gVar;
            mVar.a(this);
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f592c.c(this);
            this.f593d.e(this);
            androidx.activity.a aVar = this.f594q;
            if (aVar != null) {
                aVar.cancel();
                this.f594q = null;
            }
        }

        @Override // androidx.lifecycle.s
        public void f(v vVar, m.b bVar) {
            if (bVar == m.b.ON_START) {
                this.f594q = OnBackPressedDispatcher.this.b(this.f593d);
            } else if (bVar != m.b.ON_STOP) {
                if (bVar != m.b.ON_DESTROY) {
                    return;
                }
                cancel();
            } else {
                androidx.activity.a aVar = this.f594q;
                if (aVar == null) {
                    return;
                }
                aVar.cancel();
            }
        }
    }

    /* loaded from: classes.dex */
    public class a implements androidx.activity.a {

        /* renamed from: c */
        private final g f596c;

        a(g gVar) {
            OnBackPressedDispatcher.this = r1;
            this.f596c = gVar;
        }

        @Override // androidx.activity.a
        public void cancel() {
            OnBackPressedDispatcher.this.f591b.remove(this.f596c);
            this.f596c.e(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f590a = runnable;
    }

    @SuppressLint({"LambdaLast"})
    public void a(v vVar, g gVar) {
        m c10 = vVar.c();
        if (c10.b() == m.c.DESTROYED) {
            return;
        }
        gVar.a(new LifecycleOnBackPressedCancellable(c10, gVar));
    }

    androidx.activity.a b(g gVar) {
        this.f591b.add(gVar);
        a aVar = new a(gVar);
        gVar.a(aVar);
        return aVar;
    }

    public void c() {
        Iterator<g> descendingIterator = this.f591b.descendingIterator();
        while (descendingIterator.hasNext()) {
            g next = descendingIterator.next();
            if (next.c()) {
                next.b();
                return;
            }
        }
        Runnable runnable = this.f590a;
        if (runnable != null) {
            runnable.run();
        }
    }
}
