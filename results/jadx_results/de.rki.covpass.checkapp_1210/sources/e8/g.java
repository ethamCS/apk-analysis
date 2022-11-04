package e8;

import android.content.Context;
import android.util.Base64;
import de.rki.covpass.sdk.cert.models.ExpertModeData;
import hc.k0;
import j$.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.p;
import kotlinx.coroutines.flow.y;
import kotlinx.coroutines.q0;
import kotlinx.serialization.SerializersKt;
import org.conscrypt.BuildConfig;
import s4.m;
import tb.e0;
import tb.t;
import z9.j;
import z9.n;
import z9.q;
import zb.l;
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\u000e"}, d2 = {"Le8/g;", "Ls8/b;", BuildConfig.FLAVOR, "k", "Lde/rki/covpass/sdk/cert/models/ExpertModeData;", "data", "Ltb/e0;", "r", "Lkotlinx/coroutines/q0;", "scope", "Lz9/n;", "revocationCodeEncryptor", "<init>", "(Lkotlinx/coroutines/q0;Lz9/n;)V", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class g extends s8.b {

    /* renamed from: g */
    private final n f9532g;

    /* renamed from: h */
    private final p<String> f9533h;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.checkapp.revocation.RevocationExportViewModel$onShareClick$1", f = "RevocationExportViewModel.kt", l = {}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class a extends l implements gc.p<q0, xb.d<? super e0>, Object> {
        final /* synthetic */ ExpertModeData V3;

        /* renamed from: y */
        int f9534y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ExpertModeData expertModeData, xb.d<? super a> dVar) {
            super(2, dVar);
            g.this = r1;
            this.V3 = expertModeData;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            yb.d.c();
            if (this.f9534y == 0) {
                t.b(obj);
                n nVar = g.this.f9532g;
                lf.a c10 = f9.b.c();
                String encodeToString = Base64.encodeToString(nVar.b(c10.d(SerializersKt.serializer(c10.a(), k0.j(ExpertModeData.class)), this.V3)), 0);
                p pVar = g.this.f9533h;
                String f10 = this.V3.f();
                String c11 = this.V3.c();
                String b10 = q.b(Instant.now());
                pVar.setValue(f10 + "_" + c11 + "_" + b10);
                p<String> l10 = g.this.l();
                e8.a aVar = e8.a.f9510a;
                Context j10 = g.this.j();
                ExpertModeData expertModeData = this.V3;
                hc.t.d(encodeToString, "base64EncodedData");
                l10.setValue(aVar.a(j10, expertModeData, encodeToString, g.this.n(encodeToString)));
                return e0.f22152a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* renamed from: d0 */
        public final Object u(q0 q0Var, xb.d<? super e0> dVar) {
            return ((a) j(q0Var, dVar)).B(e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<e0> j(Object obj, xb.d<?> dVar) {
            return new a(this.V3, dVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(q0 q0Var, n nVar) {
        super(q0Var, null, null, 6, null);
        hc.t.e(q0Var, "scope");
        hc.t.e(nVar, "revocationCodeEncryptor");
        this.f9532g = nVar;
        this.f9533h = y.a(BuildConfig.FLAVOR);
    }

    public /* synthetic */ g(q0 q0Var, n nVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(q0Var, (i10 & 2) != 0 ? f9.d.a().R0() : nVar);
    }

    @Override // s8.b
    public String k() {
        String value = this.f9533h.getValue();
        return j.a(((Object) value) + ".pdf");
    }

    public final void r(ExpertModeData expertModeData) {
        hc.t.e(expertModeData, "data");
        m.a.b(this, null, null, null, null, new a(expertModeData, null), 15, null);
    }
}
