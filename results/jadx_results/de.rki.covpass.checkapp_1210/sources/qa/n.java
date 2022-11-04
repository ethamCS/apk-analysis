package qa;

import fb.u;
import gc.p;
import hc.t;
import hc.v;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
import ub.c0;
import xb.g;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a2\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u001a\u0013\u0010\n\u001a\u00020\tH\u0087@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\b\u0010\r\u001a\u00020\fH\u0002\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lbb/l;", "requestHeaders", "Ldb/a;", "content", "Lkotlin/Function2;", BuildConfig.FLAVOR, "Ltb/e0;", "block", "b", "Lxb/g;", "a", "(Lxb/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "c", "ktor-client-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a */
    private static final String f19773a = "Ktor client";

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lbb/m;", "Ltb/e0;", "b", "(Lbb/m;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends v implements gc.l<bb.m, e0> {

        /* renamed from: c */
        final /* synthetic */ bb.l f19774c;

        /* renamed from: d */
        final /* synthetic */ db.a f19775d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(bb.l lVar, db.a aVar) {
            super(1);
            this.f19774c = lVar;
            this.f19775d = aVar;
        }

        public final void b(bb.m mVar) {
            t.e(mVar, "$this$buildHeaders");
            mVar.b(this.f19774c);
            mVar.b(this.f19775d.c());
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(bb.m mVar) {
            b(mVar);
            return e0.f22152a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {BuildConfig.FLAVOR, "key", BuildConfig.FLAVOR, "values", "Ltb/e0;", "b", "(Ljava/lang/String;Ljava/util/List;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b extends v implements p<String, List<? extends String>, e0> {

        /* renamed from: c */
        final /* synthetic */ p<String, String, e0> f19776c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(p<? super String, ? super String, e0> pVar) {
            super(2);
            this.f19776c = pVar;
        }

        public final void b(String str, List<String> list) {
            String e02;
            t.e(str, "key");
            t.e(list, "values");
            bb.p pVar = bb.p.f5855a;
            if (!t.a(pVar.f(), str) && !t.a(pVar.g(), str)) {
                p<String, String, e0> pVar2 = this.f19776c;
                e02 = c0.e0(list, ",", null, null, 0, null, null, 62, null);
                pVar2.u(str, e02);
            }
        }

        @Override // gc.p
        public /* bridge */ /* synthetic */ e0 u(String str, List<? extends String> list) {
            b(str, list);
            return e0.f22152a;
        }
    }

    public static final Object a(xb.d<? super xb.g> dVar) {
        g.b i10 = dVar.b().i(k.Companion);
        t.b(i10);
        return ((k) i10).a();
    }

    public static final void b(bb.l lVar, db.a aVar, p<? super String, ? super String, e0> pVar) {
        t.e(lVar, "requestHeaders");
        t.e(aVar, "content");
        t.e(pVar, "block");
        ab.f.a(new a(lVar, aVar)).c(new b(pVar));
        bb.p pVar2 = bb.p.f5855a;
        if ((lVar.e(pVar2.l()) == null && aVar.c().e(pVar2.l()) == null) && c()) {
            pVar.u(pVar2.l(), f19773a);
        }
        bb.c b10 = aVar.b();
        String str = null;
        String jVar = b10 == null ? null : b10.toString();
        if (jVar == null) {
            jVar = aVar.c().e(pVar2.g());
        }
        Long a10 = aVar.a();
        if (a10 != null) {
            str = a10.toString();
        }
        if (str == null) {
            str = aVar.c().e(pVar2.f());
        }
        if (jVar != null) {
            pVar.u(pVar2.g(), jVar);
        }
        if (str == null) {
            return;
        }
        pVar.u(pVar2.f(), str);
    }

    private static final boolean c() {
        return !u.f10140a.a();
    }
}
