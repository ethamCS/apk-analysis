package d9;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
import ua.c;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Ld9/d;", BuildConfig.FLAVOR, "Lna/a;", "httpClient", BuildConfig.FLAVOR, "host", "<init>", "(Lna/a;Ljava/lang/String;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    private final na.a f8396a;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lna/b;", "Ltb/e0;", "b", "(Lna/b;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.l<na.b<?>, e0> {

        /* renamed from: c */
        final /* synthetic */ String f8397c;

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lya/c;", "Ltb/e0;", "b", "(Lya/c;)V"}, k = 3, mv = {1, 7, 1})
        /* renamed from: d9.d$a$a */
        /* loaded from: classes.dex */
        public static final class C0124a extends hc.v implements gc.l<ya.c, e0> {

            /* renamed from: c */
            final /* synthetic */ String f8398c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0124a(String str) {
                super(1);
                this.f8398c = str;
            }

            public final void b(ya.c cVar) {
                hc.t.e(cVar, "$this$defaultRequest");
                ya.i.c(cVar, this.f8398c);
            }

            @Override // gc.l
            public /* bridge */ /* synthetic */ e0 invoke(ya.c cVar) {
                b(cVar);
                return e0.f22152a;
            }
        }

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lua/c$a;", "Ltb/e0;", "b", "(Lua/c$a;)V"}, k = 3, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class b extends hc.v implements gc.l<c.a, e0> {

            /* renamed from: c */
            public static final b f8399c = new b();

            b() {
                super(1);
            }

            public final void b(c.a aVar) {
                hc.t.e(aVar, "$this$install");
                aVar.d(new va.a(f9.b.c()));
            }

            @Override // gc.l
            public /* bridge */ /* synthetic */ e0 invoke(c.a aVar) {
                b(aVar);
                return e0.f22152a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str) {
            super(1);
            this.f8397c = str;
        }

        public final void b(na.b<?> bVar) {
            hc.t.e(bVar, "$this$config");
            ta.e.a(bVar, new C0124a(this.f8397c));
            bVar.j(ua.c.f23330d, b.f8399c);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(na.b<?> bVar) {
            b(bVar);
            return e0.f22152a;
        }
    }

    public d(na.a aVar, String str) {
        hc.t.e(aVar, "httpClient");
        hc.t.e(str, "host");
        this.f8396a = aVar.f(new a(str));
    }
}
