package na;

import gc.l;
import hc.t;
import hc.v;
import kotlin.Metadata;
import kotlinx.coroutines.a2;
import org.conscrypt.BuildConfig;
import qa.g;
import qa.h;
import tb.e0;
import xb.g;
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a<\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¨\u0006\n"}, d2 = {"Lqa/g;", "T", "Lqa/h;", "engineFactory", "Lkotlin/Function1;", "Lna/b;", "Ltb/e0;", "block", "Lna/a;", "a", "ktor-client-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class c {

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lqa/g;", "T", BuildConfig.FLAVOR, "it", "Ltb/e0;", "b", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends v implements l<Throwable, e0> {

        /* renamed from: c */
        final /* synthetic */ qa.b f16941c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(qa.b bVar) {
            super(1);
            this.f16941c = bVar;
        }

        public final void b(Throwable th2) {
            this.f16941c.close();
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(Throwable th2) {
            b(th2);
            return e0.f22152a;
        }
    }

    public static final <T extends g> na.a a(h<? extends T> hVar, l<? super b<T>, e0> lVar) {
        t.e(hVar, "engineFactory");
        t.e(lVar, "block");
        b bVar = new b();
        lVar.invoke(bVar);
        qa.b a10 = hVar.a(bVar.d());
        na.a aVar = new na.a(a10, bVar, true);
        g.b i10 = aVar.h().i(a2.W0);
        t.b(i10);
        ((a2) i10).D0(new a(a10));
        return aVar;
    }
}
