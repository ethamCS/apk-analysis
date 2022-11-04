package sa;

import hc.t;
import kotlin.Metadata;
import kotlinx.coroutines.j0;
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\n\u0010\u0004\u001a\u0004\u0018\u00010\u0000H\u0016¨\u0006\t"}, d2 = {"Lsa/j;", "Ljava/lang/IllegalArgumentException;", "Lkotlin/IllegalArgumentException;", "Lkotlinx/coroutines/j0;", "c", "Lcb/b;", "frame", "<init>", "(Lcb/b;)V", "ktor-client-okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class j extends IllegalArgumentException implements j0<j> {

    /* renamed from: c */
    private final cb.b f21610c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(cb.b bVar) {
        super(t.l("Unsupported frame type: ", bVar));
        t.e(bVar, "frame");
        this.f21610c = bVar;
    }

    /* renamed from: c */
    public j b() {
        j jVar = new j(this.f21610c);
        jVar.initCause(this);
        return jVar;
    }
}
