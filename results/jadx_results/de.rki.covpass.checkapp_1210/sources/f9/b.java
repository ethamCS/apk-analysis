package f9;

import gf.e;
import hc.k0;
import hc.t;
import hc.v;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZonedDateTime;
import kotlin.Metadata;
import lf.l;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0017\u0010\u0001\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lgf/b;", "defaultCbor", "Lgf/b;", "b", "()Lgf/b;", "Llf/a;", "defaultJson", "Llf/a;", "c", "()Llf/a;", "covpass-sdk_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    private static final nf.d f9965a;

    /* renamed from: b */
    private static final gf.b f9966b = e.b(null, a.f9968c, 1, null);

    /* renamed from: c */
    private static final lf.a f9967c = l.b(null, C0150b.f9969c, 1, null);

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lgf/c;", "Ltb/e0;", "b", "(Lgf/c;)V"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class a extends v implements gc.l<gf.c, e0> {

        /* renamed from: c */
        public static final a f9968c = new a();

        a() {
            super(1);
        }

        public final void b(gf.c cVar) {
            t.e(cVar, "$this$Cbor");
            cVar.e(true);
            cVar.f(b.f9965a);
            cVar.d(true);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(gf.c cVar) {
            b(cVar);
            return e0.f22152a;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llf/c;", "Ltb/e0;", "b", "(Llf/c;)V"}, k = 3, mv = {1, 7, 1})
    /* renamed from: f9.b$b */
    /* loaded from: classes.dex */
    static final class C0150b extends v implements gc.l<lf.c, e0> {

        /* renamed from: c */
        public static final C0150b f9969c = new C0150b();

        C0150b() {
            super(1);
        }

        public final void b(lf.c cVar) {
            t.e(cVar, "$this$Json");
            cVar.e(true);
            cVar.g(b.f9965a);
            cVar.d(true);
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(lf.c cVar) {
            b(cVar);
            return e0.f22152a;
        }
    }

    static {
        nf.e eVar = new nf.e();
        eVar.e(k0.b(Instant.class), aa.a.f221a);
        eVar.e(k0.b(LocalDate.class), aa.b.f223a);
        eVar.e(k0.b(ZonedDateTime.class), aa.c.f226a);
        f9965a = eVar.f();
    }

    public static final gf.b b() {
        return f9966b;
    }

    public static final lf.a c() {
        return f9967c;
    }
}
