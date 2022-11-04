package o8;

import j$.time.Instant;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.q0;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import s4.b1;
import s4.l0;
import s4.m;
import s4.r0;
@Metadata(bv = {}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001Bq\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u001d\u0012\b\b\u0002\u0010 \u001a\u00020\u001f\u0012\b\b\u0002\u0010\"\u001a\u00020!\u0012\b\b\u0002\u0010$\u001a\u00020#\u0012\b\b\u0002\u0010&\u001a\u00020%\u0012\b\b\u0002\u0010(\u001a\u00020'\u0012\b\b\u0002\u0010*\u001a\u00020)\u0012\b\b\u0002\u0010,\u001a\u00020+\u0012\b\b\u0002\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0005H\u0002J\u0006\u0010\u000b\u001a\u00020\nJ\u0006\u0010\f\u001a\u00020\nJ\u0006\u0010\r\u001a\u00020\nR#\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00030\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u00061"}, d2 = {"Lo8/f0;", "Ls4/i;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "revocationListUpdateIsOn", "j$/time/Instant", "lastRevocationUpdateFinish", "y", "lastUpdate", "z", "Ltb/e0;", "A", "v", "u", "Ls4/l0;", BuildConfig.FLAVOR, "Lo8/w;", "settingItems", "Ls4/l0;", "x", "()Ls4/l0;", "Lkotlinx/coroutines/flow/w;", "allUpToDate", "Lkotlinx/coroutines/flow/w;", "w", "()Lkotlinx/coroutines/flow/w;", "Lkotlinx/coroutines/q0;", "scope", "isCovPassCheck", "Lz9/i;", "dscListUpdater", "Lj9/c;", "euRulesRepository", "Lj9/b;", "domesticRulesRepository", "Lj9/g;", "valueSetsRepository", "Lj9/a;", "countriesRepository", "Lv9/b;", "dscRepository", "Lv9/e;", "rulesUpdateRepository", "Lh9/e;", "revocationLocalListRepository", "Ly8/c;", "settingUpdateListBuilder", "<init>", "(Lkotlinx/coroutines/q0;ZLz9/i;Lj9/c;Lj9/b;Lj9/g;Lj9/a;Lv9/b;Lv9/e;Lh9/e;Ly8/c;)V", "common-app_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class f0 extends s4.i<Object> {

    /* renamed from: d */
    private final boolean f17674d;

    /* renamed from: e */
    private final z9.i f17675e;

    /* renamed from: f */
    private final j9.c f17676f;

    /* renamed from: g */
    private final j9.b f17677g;

    /* renamed from: h */
    private final j9.g f17678h;

    /* renamed from: i */
    private final j9.a f17679i;

    /* renamed from: j */
    private final v9.b f17680j;

    /* renamed from: k */
    private final v9.e f17681k;

    /* renamed from: l */
    private final h9.e f17682l;

    /* renamed from: m */
    private final y8.c f17683m;

    /* renamed from: n */
    private final l0<List<w>> f17684n;

    /* renamed from: o */
    private final kotlinx.coroutines.flow.w<Boolean> f17685o;

    /* renamed from: p */
    private final l0<Boolean> f17686p;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ls4/r0;", BuildConfig.FLAVOR, "b", "(Ls4/r0;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.l<r0, Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(1);
            f0.this = r1;
        }

        /* renamed from: b */
        public final Boolean invoke(r0 r0Var) {
            boolean z10;
            hc.t.e(r0Var, "$this$derived");
            f0 f0Var = f0.this;
            if (f0Var.z((Instant) s4.d.a(r0Var, f0Var.f17681k.c()))) {
                f0 f0Var2 = f0.this;
                if (f0Var2.z((Instant) s4.d.a(r0Var, f0Var2.f17681k.b()))) {
                    f0 f0Var3 = f0.this;
                    if (f0Var3.z((Instant) s4.d.a(r0Var, f0Var3.f17681k.d()))) {
                        f0 f0Var4 = f0.this;
                        if (f0Var4.z((Instant) s4.d.a(r0Var, f0Var4.f17680j.c()))) {
                            f0 f0Var5 = f0.this;
                            if (f0Var5.z((Instant) s4.d.a(r0Var, f0Var5.f17681k.a()))) {
                                f0 f0Var6 = f0.this;
                                if (f0Var6.y(((Boolean) s4.d.a(r0Var, f0Var6.f17682l.x())).booleanValue(), (Instant) s4.d.a(r0Var, f0.this.f17682l.v()))) {
                                    z10 = true;
                                    return Boolean.valueOf(z10);
                                }
                            }
                        }
                    }
                }
            }
            z10 = false;
            return Boolean.valueOf(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.commonapp.information.SettingsUpdateViewModel$deleteRevocationLocalList$1", f = "SettingsUpdateViewModel.kt", l = {87}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class b extends zb.l implements gc.p<q0, xb.d<? super tb.e0>, Object> {

        /* renamed from: y */
        int f17688y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(xb.d<? super b> dVar) {
            super(2, dVar);
            f0.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            Object c10;
            c10 = yb.d.c();
            int i10 = this.f17688y;
            if (i10 == 0) {
                tb.t.b(obj);
                h9.e eVar = f0.this.f17682l;
                this.f17688y = 1;
                if (eVar.o(this) == c10) {
                    return c10;
                }
            } else if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                tb.t.b(obj);
            }
            return tb.e0.f22152a;
        }

        /* renamed from: d0 */
        public final Object u(q0 q0Var, xb.d<? super tb.e0> dVar) {
            return ((b) j(q0Var, dVar)).B(tb.e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<tb.e0> j(Object obj, xb.d<?> dVar) {
            return new b(dVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/q0;", "Ltb/e0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    @zb.f(c = "de.rki.covpass.commonapp.information.SettingsUpdateViewModel$update$1", f = "SettingsUpdateViewModel.kt", l = {61, 63, 66, 69, 72, 75}, m = "invokeSuspend")
    /* loaded from: classes.dex */
    public static final class c extends zb.l implements gc.p<q0, xb.d<? super tb.e0>, Object> {

        /* renamed from: y */
        int f17689y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(xb.d<? super c> dVar) {
            super(2, dVar);
            f0.this = r1;
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x0095  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00cf  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00f0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0103  */
        @Override // zb.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object B(java.lang.Object r3) {
            /*
                Method dump skipped, instructions count: 336
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: o8.f0.c.B(java.lang.Object):java.lang.Object");
        }

        /* renamed from: d0 */
        public final Object u(q0 q0Var, xb.d<? super tb.e0> dVar) {
            return ((c) j(q0Var, dVar)).B(tb.e0.f22152a);
        }

        @Override // zb.a
        public final xb.d<tb.e0> j(Object obj, xb.d<?> dVar) {
            return new c(dVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(q0 q0Var, boolean z10, z9.i iVar, j9.c cVar, j9.b bVar, j9.g gVar, j9.a aVar, v9.b bVar2, v9.e eVar, h9.e eVar2, y8.c cVar2) {
        super(q0Var);
        hc.t.e(q0Var, "scope");
        hc.t.e(iVar, "dscListUpdater");
        hc.t.e(cVar, "euRulesRepository");
        hc.t.e(bVar, "domesticRulesRepository");
        hc.t.e(gVar, "valueSetsRepository");
        hc.t.e(aVar, "countriesRepository");
        hc.t.e(bVar2, "dscRepository");
        hc.t.e(eVar, "rulesUpdateRepository");
        hc.t.e(eVar2, "revocationLocalListRepository");
        hc.t.e(cVar2, "settingUpdateListBuilder");
        this.f17674d = z10;
        this.f17675e = iVar;
        this.f17676f = cVar;
        this.f17677g = bVar;
        this.f17678h = gVar;
        this.f17679i = aVar;
        this.f17680j = bVar2;
        this.f17681k = eVar;
        this.f17682l = eVar2;
        this.f17683m = cVar2;
        this.f17684n = b1.b(cVar2.a(z10), null, 2, null);
        this.f17685o = s4.o.c(this, new a());
        this.f17686p = b1.b(Boolean.FALSE, null, 2, null);
    }

    public /* synthetic */ f0(q0 q0Var, boolean z10, z9.i iVar, j9.c cVar, j9.b bVar, j9.g gVar, j9.a aVar, v9.b bVar2, v9.e eVar, h9.e eVar2, y8.c cVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(q0Var, z10, (i10 & 4) != 0 ? f9.d.a().F0() : iVar, (i10 & 8) != 0 ? f9.d.a().r0() : cVar, (i10 & 16) != 0 ? f9.d.a().l0() : bVar, (i10 & 32) != 0 ? f9.d.a().x0() : gVar, (i10 & 64) != 0 ? f9.d.a().e0() : aVar, (i10 & 128) != 0 ? f9.d.a().G0() : bVar2, (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? f9.d.a().Y0() : eVar, (i10 & 512) != 0 ? f9.d.a().V0() : eVar2, (i10 & 1024) != 0 ? l8.b.a().g() : cVar2);
    }

    public final boolean y(boolean z10, Instant instant) {
        if (!this.f17674d || !z10) {
            return true;
        }
        return z(instant);
    }

    public final boolean z(Instant instant) {
        return instant.isAfter(Instant.now().minusSeconds(86400L));
    }

    public final void A() {
        m.a.b(this, null, null, null, null, new c(null), 15, null);
    }

    public final void u() {
        l0<Boolean> l0Var = this.f17686p;
        Boolean bool = Boolean.TRUE;
        l0Var.setValue(bool);
        this.f17682l.w().setValue(bool);
    }

    public final void v() {
        m.a.b(this, null, null, null, null, new b(null), 15, null);
    }

    public final kotlinx.coroutines.flow.w<Boolean> w() {
        return this.f17685o;
    }

    public final l0<List<w>> x() {
        return this.f17684n;
    }
}
