package io.ktor.utils.io;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlinx.coroutines.a2;
import kotlinx.coroutines.h1;
import kotlinx.coroutines.v;
import kotlinx.coroutines.x;
import org.conscrypt.BuildConfig;
import tb.e0;
import xb.g;
@Metadata(bv = {}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010/\u001a\u00020\u0003\u0012\u0006\u00105\u001a\u000200¢\u0006\u0004\b;\u0010<J\u0011\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0097\u0001J\u001b\u0010\f\u001a\u00020\u000b2\u0010\b\u0002\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\tH\u0096\u0001J8\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\r2\u0006\u0010\u000e\u001a\u00028\u00002\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00028\u00000\u000fH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0013J*\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0014*\u00020\u00102\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0096\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00060\bj\u0002`\tH\u0097\u0001J7\u0010\"\u001a\u00020!2\b\b\u0002\u0010\u001b\u001a\u00020\u001a2\b\b\u0002\u0010\u001c\u001a\u00020\u001a2\u0018\u0010 \u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u000b0\u001dj\u0002`\u001fH\u0097\u0001J#\u0010#\u001a\u00020!2\u0018\u0010 \u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0012\u0004\u0012\u00020\u000b0\u001dj\u0002`\u001fH\u0096\u0001J\u0013\u0010$\u001a\u00020\u000bH\u0096Aø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0015\u0010'\u001a\u00020&2\n\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0015H\u0096\u0001J\u0011\u0010)\u001a\u00020&2\u0006\u0010(\u001a\u00020&H\u0096\u0003J\t\u0010*\u001a\u00020\u001aH\u0096\u0001J\b\u0010,\u001a\u00020+H\u0016R\u0014\u0010/\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00105\u001a\u0002008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0014\u00108\u001a\u00020\u001a8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u00107R\u0018\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u00158\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b9\u0010:\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006="}, d2 = {"Lio/ktor/utils/io/m;", BuildConfig.FLAVOR, "Lio/ktor/utils/io/t;", "Lkotlinx/coroutines/a2;", "Lkotlinx/coroutines/x;", "child", "Lkotlinx/coroutines/v;", "e1", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "cause", "Ltb/e0;", "r", "R", "initial", "Lkotlin/Function2;", "Lxb/g$b;", "operation", "f", "(Ljava/lang/Object;Lgc/p;)Ljava/lang/Object;", "E", "Lxb/g$c;", "key", "i", "(Lxb/g$c;)Lxb/g$b;", "w0", BuildConfig.FLAVOR, "onCancelling", "invokeImmediately", "Lkotlin/Function1;", BuildConfig.FLAVOR, "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lkotlinx/coroutines/h1;", "K0", "D0", "V0", "(Lxb/d;)Ljava/lang/Object;", "Lxb/g;", "s", "context", "B", "start", BuildConfig.FLAVOR, "toString", "c", "Lkotlinx/coroutines/a2;", "delegate", "Lio/ktor/utils/io/c;", "d", "Lio/ktor/utils/io/c;", "a", "()Lio/ktor/utils/io/c;", "channel", "j", "()Z", "isActive", "getKey", "()Lxb/g$c;", "<init>", "(Lkotlinx/coroutines/a2;Lio/ktor/utils/io/c;)V", "ktor-io"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
final class m implements a2, t {

    /* renamed from: c */
    private final a2 f12946c;

    /* renamed from: d */
    private final c f12947d;

    public m(a2 a2Var, c cVar) {
        hc.t.e(a2Var, "delegate");
        hc.t.e(cVar, "channel");
        this.f12946c = a2Var;
        this.f12947d = cVar;
    }

    @Override // xb.g
    public xb.g B(xb.g gVar) {
        hc.t.e(gVar, "context");
        return this.f12946c.B(gVar);
    }

    @Override // kotlinx.coroutines.a2
    public h1 D0(gc.l<? super Throwable, e0> lVar) {
        hc.t.e(lVar, "handler");
        return this.f12946c.D0(lVar);
    }

    @Override // kotlinx.coroutines.a2
    public h1 K0(boolean z10, boolean z11, gc.l<? super Throwable, e0> lVar) {
        hc.t.e(lVar, "handler");
        return this.f12946c.K0(z10, z11, lVar);
    }

    @Override // kotlinx.coroutines.a2
    public Object V0(xb.d<? super e0> dVar) {
        return this.f12946c.V0(dVar);
    }

    /* renamed from: a */
    public c e() {
        return this.f12947d;
    }

    @Override // kotlinx.coroutines.a2
    public v e1(x xVar) {
        hc.t.e(xVar, "child");
        return this.f12946c.e1(xVar);
    }

    @Override // xb.g.b, xb.g
    public <R> R f(R r10, gc.p<? super R, ? super g.b, ? extends R> pVar) {
        hc.t.e(pVar, "operation");
        return (R) this.f12946c.f(r10, pVar);
    }

    @Override // xb.g.b
    public g.c<?> getKey() {
        return this.f12946c.getKey();
    }

    @Override // xb.g.b, xb.g
    public <E extends g.b> E i(g.c<E> cVar) {
        hc.t.e(cVar, "key");
        return (E) this.f12946c.i(cVar);
    }

    @Override // kotlinx.coroutines.a2
    public boolean j() {
        return this.f12946c.j();
    }

    @Override // kotlinx.coroutines.a2, df.a0
    public void r(CancellationException cancellationException) {
        this.f12946c.r(cancellationException);
    }

    @Override // xb.g.b, xb.g
    public xb.g s(g.c<?> cVar) {
        hc.t.e(cVar, "key");
        return this.f12946c.s(cVar);
    }

    @Override // kotlinx.coroutines.a2
    public boolean start() {
        return this.f12946c.start();
    }

    public String toString() {
        return "ChannelJob[" + this.f12946c + ']';
    }

    @Override // kotlinx.coroutines.a2
    public CancellationException w0() {
        return this.f12946c.w0();
    }
}
