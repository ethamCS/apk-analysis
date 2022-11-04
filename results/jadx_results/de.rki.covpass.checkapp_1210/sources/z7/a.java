package z7;

import f9.d;
import hc.v;
import kotlin.Lazy;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.m;
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001b\u0010\u000b\u001a\u00020\u00068FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000e"}, d2 = {"Lz7/a;", BuildConfig.FLAVOR, "Lgf/b;", "b", "()Lgf/b;", "cbor", "Lg8/a;", "checkAppRepository$delegate", "Lkotlin/Lazy;", "c", "()Lg8/a;", "checkAppRepository", "<init>", "()V", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private final Lazy f26505a;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lg8/a;", "b", "()Lg8/a;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: z7.a$a */
    /* loaded from: classes.dex */
    public static final class C0467a extends v implements gc.a<g8.a> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0467a() {
            super(0);
            a.this = r1;
        }

        /* renamed from: b */
        public final g8.a invoke() {
            return new g8.a(new v9.a("check_app_prefs", a.this.b()));
        }
    }

    public a() {
        Lazy a10;
        a10 = m.a(new C0467a());
        this.f26505a = a10;
    }

    public final gf.b b() {
        return d.a().X();
    }

    public final g8.a c() {
        return (g8.a) this.f26505a.getValue();
    }
}
