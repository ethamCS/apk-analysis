package ef;

import hc.t;
import hc.v;
import kotlin.Metadata;
import kotlinx.coroutines.e2;
import org.conscrypt.BuildConfig;
import tb.e0;
import tb.s;
import xb.g;
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u00032\u00020\u0004B\u001d\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010$\u001a\u00020\f¢\u0006\u0004\b%\u0010&J'\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\f2\u0006\u0010\b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0002J\n\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016J\"\u0010\u0018\u001a\u00020\t2\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0016H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0006H\u0016J\u001b\u0010\u001b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lef/m;", "T", "Lkotlinx/coroutines/flow/e;", "Lzb/d;", "Lzb/e;", "Lxb/d;", "Ltb/e0;", "uCont", "value", BuildConfig.FLAVOR, "e0", "(Lxb/d;Ljava/lang/Object;)Ljava/lang/Object;", "Lxb/g;", "currentContext", "previousContext", "d0", "(Lxb/g;Lxb/g;Ljava/lang/Object;)V", "Lef/h;", "exception", "f0", "Ljava/lang/StackTraceElement;", "z", "Ltb/s;", "result", "B", "(Ljava/lang/Object;)Ljava/lang/Object;", "G", "c", "(Ljava/lang/Object;Lxb/d;)Ljava/lang/Object;", "x", "()Lzb/e;", "callerFrame", "b", "()Lxb/g;", "context", "collector", "collectContext", "<init>", "(Lkotlinx/coroutines/flow/e;Lxb/g;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class m<T> extends zb.d implements kotlinx.coroutines.flow.e<T> {
    public final int U3;
    private xb.g V3;
    private xb.d<? super e0> W3;

    /* renamed from: x */
    public final kotlinx.coroutines.flow.e<T> f9574x;

    /* renamed from: y */
    public final xb.g f9575y;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", BuildConfig.FLAVOR, "count", "Lxb/g$b;", "<anonymous parameter 1>", "b", "(ILxb/g$b;)Ljava/lang/Integer;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes3.dex */
    public static final class a extends v implements gc.p<Integer, g.b, Integer> {

        /* renamed from: c */
        public static final a f9576c = new a();

        a() {
            super(2);
        }

        public final Integer b(int i10, g.b bVar) {
            return Integer.valueOf(i10 + 1);
        }

        @Override // gc.p
        public /* bridge */ /* synthetic */ Integer u(Integer num, g.b bVar) {
            return b(num.intValue(), bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m(kotlinx.coroutines.flow.e<? super T> eVar, xb.g gVar) {
        super(j.f9568c, xb.h.f25516c);
        this.f9574x = eVar;
        this.f9575y = gVar;
        this.U3 = ((Number) gVar.f(0, a.f9576c)).intValue();
    }

    private final void d0(xb.g gVar, xb.g gVar2, T t10) {
        if (gVar2 instanceof h) {
            f0((h) gVar2, t10);
        }
        o.a(this, gVar);
    }

    private final Object e0(xb.d<? super e0> dVar, T t10) {
        gc.q qVar;
        Object c10;
        xb.g b10 = dVar.b();
        e2.h(b10);
        xb.g gVar = this.V3;
        if (gVar != b10) {
            d0(b10, gVar, t10);
            this.V3 = b10;
        }
        this.W3 = dVar;
        qVar = n.f9577a;
        Object s10 = qVar.s(this.f9574x, t10, this);
        c10 = yb.d.c();
        if (!t.a(s10, c10)) {
            this.W3 = null;
        }
        return s10;
    }

    private final void f0(h hVar, Object obj) {
        String f10;
        f10 = bf.q.f("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + hVar.f9566c + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ");
        throw new IllegalStateException(f10.toString());
    }

    @Override // zb.a
    public Object B(Object obj) {
        Object c10;
        Throwable g10 = s.g(obj);
        if (g10 != null) {
            this.V3 = new h(g10, b());
        }
        xb.d<? super e0> dVar = this.W3;
        if (dVar != null) {
            dVar.y(obj);
        }
        c10 = yb.d.c();
        return c10;
    }

    @Override // zb.d, zb.a
    public void G() {
        super.G();
    }

    @Override // zb.d, xb.d
    public xb.g b() {
        xb.g gVar = this.V3;
        return gVar == null ? xb.h.f25516c : gVar;
    }

    @Override // kotlinx.coroutines.flow.e
    public Object c(T t10, xb.d<? super e0> dVar) {
        Object c10;
        Object c11;
        try {
            Object e02 = e0(dVar, t10);
            c10 = yb.d.c();
            if (e02 == c10) {
                zb.h.c(dVar);
            }
            c11 = yb.d.c();
            return e02 == c11 ? e02 : e0.f22152a;
        } catch (Throwable th2) {
            this.V3 = new h(th2, dVar.b());
            throw th2;
        }
    }

    @Override // zb.a, zb.e
    public zb.e x() {
        xb.d<? super e0> dVar = this.W3;
        if (dVar instanceof zb.e) {
            return (zb.e) dVar;
        }
        return null;
    }

    @Override // zb.a
    public StackTraceElement z() {
        return null;
    }
}
