package ta;

import kotlin.Metadata;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0005\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0006"}, d2 = {"Lna/b;", "Lkotlin/Function1;", "Lya/c;", "Ltb/e0;", "block", "a", "ktor-client-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class e {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lya/c;", "Ltb/e0;", "b", "(Lya/c;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.l<ya.c, e0> {

        /* renamed from: c */
        final /* synthetic */ gc.l<ya.c, e0> f22045c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(gc.l<? super ya.c, e0> lVar) {
            super(1);
            this.f22045c = lVar;
        }

        public final void b(ya.c cVar) {
            hc.t.e(cVar, "$this$install");
            this.f22045c.invoke(cVar);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(ya.c cVar) {
            b(cVar);
            return e0.f22152a;
        }
    }

    public static final void a(na.b<?> bVar, gc.l<? super ya.c, e0> lVar) {
        hc.t.e(bVar, "<this>");
        hc.t.e(lVar, "block");
        bVar.j(d.f22041b, new a(lVar));
    }
}
