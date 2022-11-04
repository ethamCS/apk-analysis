package cf;

import android.os.Handler;
import android.os.Looper;
import gc.l;
import hc.t;
import hc.v;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.e2;
import kotlinx.coroutines.g1;
import kotlinx.coroutines.p;
import nc.m;
import org.conscrypt.BuildConfig;
import tb.e0;
import xb.g;
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010 \u001a\u00020\n¢\u0006\u0004\b!\u0010\"B\u001d\b\u0016\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b!\u0010#J\u001c\u0010\t\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\u001c\u0010\f\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u00032\n\u0010\u0007\u001a\u00060\u0005j\u0002`\u0006H\u0016J\u001e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u000fH\u0016J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0013\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0017H\u0016R\u001a\u0010\u0019\u001a\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006$"}, d2 = {"Lcf/c;", "Lcf/d;", "Lkotlinx/coroutines/z0;", "Lxb/g;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Ltb/e0;", "k1", BuildConfig.FLAVOR, "R0", "u0", BuildConfig.FLAVOR, "timeMillis", "Lkotlinx/coroutines/p;", "continuation", "b", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "other", "equals", BuildConfig.FLAVOR, "hashCode", "immediate", "Lcf/c;", "l1", "()Lcf/c;", "Landroid/os/Handler;", "handler", "name", "invokeImmediately", "<init>", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "(Landroid/os/Handler;Ljava/lang/String;)V", "kotlinx-coroutines-android"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class c extends d {
    private final c U3;
    private volatile c _immediate;

    /* renamed from: q */
    private final Handler f6472q;

    /* renamed from: x */
    private final String f6473x;

    /* renamed from: y */
    private final boolean f6474y;

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ltb/e0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ p f6475c;

        /* renamed from: d */
        final /* synthetic */ c f6476d;

        public a(p pVar, c cVar) {
            this.f6475c = pVar;
            this.f6476d = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f6475c.v(this.f6476d, e0.f22152a);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "it", "Ltb/e0;", "b", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    static final class b extends v implements l<Throwable, e0> {

        /* renamed from: d */
        final /* synthetic */ Runnable f6478d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Runnable runnable) {
            super(1);
            c.this = r1;
            this.f6478d = runnable;
        }

        public final void b(Throwable th2) {
            c.this.f6472q.removeCallbacks(this.f6478d);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(Throwable th2) {
            b(th2);
            return e0.f22152a;
        }
    }

    public c(Handler handler, String str) {
        this(handler, str, false);
    }

    public /* synthetic */ c(Handler handler, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private c(Handler handler, String str, boolean z10) {
        super(null);
        c cVar = null;
        this.f6472q = handler;
        this.f6473x = str;
        this.f6474y = z10;
        this._immediate = z10 ? this : cVar;
        c cVar2 = this._immediate;
        if (cVar2 == null) {
            cVar2 = new c(handler, str, true);
            this._immediate = cVar2;
        }
        this.U3 = cVar2;
    }

    private final void k1(g gVar, Runnable runnable) {
        e2.d(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        g1.b().u0(gVar, runnable);
    }

    @Override // kotlinx.coroutines.l0
    public boolean R0(g gVar) {
        return !this.f6474y || !t.a(Looper.myLooper(), this.f6472q.getLooper());
    }

    @Override // kotlinx.coroutines.z0
    public void b(long j10, p<? super e0> pVar) {
        long e10;
        a aVar = new a(pVar, this);
        Handler handler = this.f6472q;
        e10 = m.e(j10, 4611686018427387903L);
        if (handler.postDelayed(aVar, e10)) {
            pVar.N(new b(aVar));
        } else {
            k1(pVar.b(), aVar);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f6472q == this.f6472q;
    }

    public int hashCode() {
        return System.identityHashCode(this.f6472q);
    }

    /* renamed from: l1 */
    public c h1() {
        return this.U3;
    }

    @Override // kotlinx.coroutines.m2, kotlinx.coroutines.l0
    public String toString() {
        String i12 = i1();
        if (i12 == null) {
            String str = this.f6473x;
            if (str == null) {
                str = this.f6472q.toString();
            }
            if (!this.f6474y) {
                return str;
            }
            return str + ".immediate";
        }
        return i12;
    }

    @Override // kotlinx.coroutines.l0
    public void u0(g gVar, Runnable runnable) {
        if (!this.f6472q.post(runnable)) {
            k1(gVar, runnable);
        }
    }
}
