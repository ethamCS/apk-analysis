package ef;

import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u0004B\u001d\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0014J \u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0016ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0011\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, d2 = {"Lef/q;", "T", "Lxb/d;", "Lzb/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Ltb/s;", "result", "Ltb/e0;", "y", "(Ljava/lang/Object;)V", "Lxb/g;", "context", "Lxb/g;", "b", "()Lxb/g;", "x", "()Lzb/e;", "callerFrame", "uCont", "<init>", "(Lxb/d;Lxb/g;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
final class q<T> implements xb.d<T>, zb.e {

    /* renamed from: c */
    private final xb.d<T> f9580c;

    /* renamed from: d */
    private final xb.g f9581d;

    /* JADX WARN: Multi-variable type inference failed */
    public q(xb.d<? super T> dVar, xb.g gVar) {
        this.f9580c = dVar;
        this.f9581d = gVar;
    }

    @Override // xb.d
    public xb.g b() {
        return this.f9581d;
    }

    @Override // zb.e
    public zb.e x() {
        xb.d<T> dVar = this.f9580c;
        if (dVar instanceof zb.e) {
            return (zb.e) dVar;
        }
        return null;
    }

    @Override // xb.d
    public void y(Object obj) {
        this.f9580c.y(obj);
    }
}
