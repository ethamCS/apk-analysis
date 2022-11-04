package sa;

import hc.t;
import java.io.IOException;
import kotlin.Metadata;
import kotlinx.coroutines.p;
import of.b0;
import tb.s;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\b0\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016¨\u0006\u0011"}, d2 = {"Lsa/b;", "Lof/f;", "Lof/e;", "call", "Ljava/io/IOException;", "e", "Ltb/e0;", "b", "Lof/b0;", "response", "a", "Lya/d;", "requestData", "Lkotlinx/coroutines/p;", "continuation", "<init>", "(Lya/d;Lkotlinx/coroutines/p;)V", "ktor-client-okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class b implements of.f {

    /* renamed from: a */
    private final ya.d f21565a;

    /* renamed from: b */
    private final p<b0> f21566b;

    /* JADX WARN: Multi-variable type inference failed */
    public b(ya.d dVar, p<? super b0> pVar) {
        t.e(dVar, "requestData");
        t.e(pVar, "continuation");
        this.f21565a = dVar;
        this.f21566b = pVar;
    }

    @Override // of.f
    public void a(of.e eVar, b0 b0Var) {
        t.e(eVar, "call");
        t.e(b0Var, "response");
        if (!eVar.G()) {
            p<b0> pVar = this.f21566b;
            s.a aVar = s.Companion;
            pVar.y(s.c(b0Var));
        }
    }

    @Override // of.f
    public void b(of.e eVar, IOException iOException) {
        Throwable f10;
        t.e(eVar, "call");
        t.e(iOException, "e");
        if (this.f21566b.isCancelled()) {
            return;
        }
        p<b0> pVar = this.f21566b;
        s.a aVar = s.Companion;
        f10 = h.f(this.f21565a, iOException);
        pVar.y(s.c(tb.t.a(f10)));
    }
}
