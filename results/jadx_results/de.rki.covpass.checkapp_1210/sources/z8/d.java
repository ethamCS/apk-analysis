package z8;

import gc.l;
import hc.t;
import hc.v;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H&J$\u0010\u000f\u001a\u00020\u000e2\u001a\b\u0002\u0010\r\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0004\u0012\u00020\u00040\nH&J\u0010\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0006H&¨\u0006\u0012"}, d2 = {"Lz8/d;", BuildConfig.FLAVOR, "Lz8/e;", "logLevel", "Ltb/e0;", "d", BuildConfig.FLAVOR, "pattern", "pin", "a", "Lkotlin/Function1;", "Lna/b;", "Lsa/c;", "block", "Lna/a;", "c", "userAgent", "b", "covpass-http_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public interface d {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a {

        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lna/b;", "Lsa/c;", "Ltb/e0;", "b", "(Lna/b;)V"}, k = 3, mv = {1, 7, 1})
        /* renamed from: z8.d$a$a */
        /* loaded from: classes.dex */
        public static final class C0472a extends v implements l<na.b<sa.c>, e0> {

            /* renamed from: c */
            public static final C0472a f26533c = new C0472a();

            C0472a() {
                super(1);
            }

            public final void b(na.b<sa.c> bVar) {
                t.e(bVar, "$this$null");
            }

            @Override // gc.l
            public /* bridge */ /* synthetic */ e0 invoke(na.b<sa.c> bVar) {
                b(bVar);
                return e0.f22152a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ na.a a(d dVar, l lVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    lVar = C0472a.f26533c;
                }
                return dVar.c(lVar);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: ktorClient");
        }
    }

    void a(String str, String str2);

    void b(String str);

    na.a c(l<? super na.b<sa.c>, e0> lVar);

    void d(e eVar);
}
