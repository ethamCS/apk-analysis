package androidx.activity;

import androidx.lifecycle.e;
import androidx.lifecycle.f;
import androidx.lifecycle.h;
import java.util.ArrayDeque;
import java.util.Iterator;
/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* renamed from: a */
    private final Runnable f440a;

    /* renamed from: b */
    final ArrayDeque<b> f441b = new ArrayDeque<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class LifecycleOnBackPressedCancellable implements f, androidx.activity.a {

        /* renamed from: a */
        private final e f442a;

        /* renamed from: b */
        private final b f443b;

        /* renamed from: c */
        private androidx.activity.a f444c;

        LifecycleOnBackPressedCancellable(e eVar, b bVar) {
            OnBackPressedDispatcher.this = r1;
            this.f442a = eVar;
            this.f443b = bVar;
            eVar.a(this);
        }

        @Override // androidx.lifecycle.f
        public void a(h hVar, e.a aVar) {
            if (aVar == e.a.ON_START) {
                this.f444c = OnBackPressedDispatcher.this.a(this.f443b);
            } else if (aVar != e.a.ON_STOP) {
                if (aVar != e.a.ON_DESTROY) {
                    return;
                }
                cancel();
            } else {
                androidx.activity.a aVar2 = this.f444c;
                if (aVar2 == null) {
                    return;
                }
                aVar2.cancel();
            }
        }

        @Override // androidx.activity.a
        public void cancel() {
            this.f442a.b(this);
            this.f443b.b(this);
            androidx.activity.a aVar = this.f444c;
            if (aVar != null) {
                aVar.cancel();
                this.f444c = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public class a implements androidx.activity.a {

        /* renamed from: a */
        private final b f445a;

        a(b bVar) {
            OnBackPressedDispatcher.this = r1;
            this.f445a = bVar;
        }

        @Override // androidx.activity.a
        public void cancel() {
            OnBackPressedDispatcher.this.f441b.remove(this.f445a);
            this.f445a.b(this);
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.f440a = runnable;
    }

    androidx.activity.a a(b bVar) {
        this.f441b.add(bVar);
        a aVar = new a(bVar);
        bVar.a(aVar);
        return aVar;
    }

    public void a() {
        Iterator<b> descendingIterator = this.f441b.descendingIterator();
        while (descendingIterator.hasNext()) {
            b next = descendingIterator.next();
            if (next.b()) {
                next.a();
                return;
            }
        }
        Runnable runnable = this.f440a;
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a(h hVar, b bVar) {
        e a2 = hVar.a();
        if (a2.a() == e.b.DESTROYED) {
            return;
        }
        bVar.a(new LifecycleOnBackPressedCancellable(a2, bVar));
    }
}
