package androidx.lifecycle;

import android.annotation.SuppressLint;
import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.Metadata;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.m2;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0003J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007J\b\u0010\b\u001a\u00020\u0004H\u0007J\b\u0010\t\u001a\u00020\u0004H\u0007J\b\u0010\u000b\u001a\u00020\nH\u0007J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0016\u0010\u0011\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, d2 = {"Landroidx/lifecycle/h;", BuildConfig.FLAVOR, "Ljava/lang/Runnable;", "runnable", "Ltb/e0;", "f", "h", "i", "g", "e", BuildConfig.FLAVOR, "b", "Lxb/g;", "context", "c", "a", "Z", "paused", "finished", "isDraining", "Ljava/util/Queue;", "d", "Ljava/util/Queue;", "queue", "<init>", "()V", "lifecycle-runtime-ktx_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class h {

    /* renamed from: b */
    private boolean f4316b;

    /* renamed from: c */
    private boolean f4317c;

    /* renamed from: a */
    private boolean f4315a = true;

    /* renamed from: d */
    private final Queue<Runnable> f4318d = new ArrayDeque();

    public static final void d(h hVar, Runnable runnable) {
        hc.t.e(hVar, "this$0");
        hc.t.e(runnable, "$runnable");
        hVar.f(runnable);
    }

    private final void f(Runnable runnable) {
        if (this.f4318d.offer(runnable)) {
            e();
            return;
        }
        throw new IllegalStateException("cannot enqueue any more runnables".toString());
    }

    public final boolean b() {
        return this.f4316b || !this.f4315a;
    }

    @SuppressLint({"WrongThread"})
    public final void c(xb.g gVar, final Runnable runnable) {
        hc.t.e(gVar, "context");
        hc.t.e(runnable, "runnable");
        m2 h12 = g1.c().h1();
        if (h12.R0(gVar) || b()) {
            h12.u0(gVar, new Runnable() { // from class: androidx.lifecycle.g
                @Override // java.lang.Runnable
                public final void run() {
                    h.d(h.this, runnable);
                }
            });
        } else {
            f(runnable);
        }
    }

    public final void e() {
        if (this.f4317c) {
            return;
        }
        try {
            this.f4317c = true;
            while ((!this.f4318d.isEmpty()) && b()) {
                Runnable poll = this.f4318d.poll();
                if (poll != null) {
                    poll.run();
                }
            }
        } finally {
            this.f4317c = false;
        }
    }

    public final void g() {
        this.f4316b = true;
        e();
    }

    public final void h() {
        this.f4315a = true;
    }

    public final void i() {
        if (!this.f4315a) {
            return;
        }
        if (!(!this.f4316b)) {
            throw new IllegalStateException("Cannot resume a finished dispatcher".toString());
        }
        this.f4315a = false;
        e();
    }
}
