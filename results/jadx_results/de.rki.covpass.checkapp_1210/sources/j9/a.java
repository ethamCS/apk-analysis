package j9;

import d9.h;
import hc.t;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import tb.e0;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u0005J\u0013\u0010\u000b\u001a\u00020\u0007H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"Lj9/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, BuildConfig.FLAVOR, "b", "(Lxb/d;)Ljava/lang/Object;", "countries", "Ltb/e0;", "d", "(Ljava/util/List;Lxb/d;)Ljava/lang/Object;", "c", "a", "Ld9/h;", "remoteDataSource", "Lp9/e;", "localDataSource", "Lv9/e;", "rulesUpdateRepository", "<init>", "(Ld9/h;Lp9/e;Lv9/e;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private final h f14183a;

    /* renamed from: b */
    private final p9.e f14184b;

    /* renamed from: c */
    private final v9.e f14185c;

    @zb.f(c = "de.rki.covpass.sdk.rules.CovPassCountriesRepository", f = "CovPassCountriesRepository.kt", l = {27, 27, 28}, m = "loadCountries")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: j9.a$a */
    /* loaded from: classes.dex */
    public static final class C0203a extends zb.d {
        /* synthetic */ Object U3;
        int W3;

        /* renamed from: x */
        Object f14186x;

        /* renamed from: y */
        Object f14187y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0203a(xb.d<? super C0203a> dVar) {
            super(dVar);
            a.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.U3 = obj;
            this.W3 |= Integer.MIN_VALUE;
            return a.this.c(this);
        }
    }

    public a(h hVar, p9.e eVar, v9.e eVar2) {
        t.e(hVar, "remoteDataSource");
        t.e(eVar, "localDataSource");
        t.e(eVar2, "rulesUpdateRepository");
        this.f14183a = hVar;
        this.f14184b = eVar;
        this.f14185c = eVar2;
    }

    public final Object a(xb.d<? super e0> dVar) {
        Object c10;
        Object b10 = this.f14184b.b(dVar);
        c10 = yb.d.c();
        return b10 == c10 ? b10 : e0.f22152a;
    }

    public final Object b(xb.d<? super List<String>> dVar) {
        return this.f14184b.c(dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(xb.d<? super tb.e0> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof j9.a.C0203a
            if (r0 == 0) goto L13
            r0 = r8
            j9.a$a r0 = (j9.a.C0203a) r0
            int r1 = r0.W3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.W3 = r1
            goto L18
        L13:
            j9.a$a r0 = new j9.a$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.U3
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.W3
            r3 = 0
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L4c
            if (r2 == r6) goto L40
            if (r2 == r5) goto L38
            if (r2 != r4) goto L30
            tb.t.b(r8)
            goto L7e
        L30:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L38:
            java.lang.Object r2 = r0.f14186x
            j9.a r2 = (j9.a) r2
            tb.t.b(r8)
            goto L71
        L40:
            java.lang.Object r2 = r0.f14187y
            p9.e r2 = (p9.e) r2
            java.lang.Object r6 = r0.f14186x
            j9.a r6 = (j9.a) r6
            tb.t.b(r8)
            goto L61
        L4c:
            tb.t.b(r8)
            p9.e r2 = r7.f14184b
            d9.h r8 = r7.f14183a
            r0.f14186x = r7
            r0.f14187y = r2
            r0.W3 = r6
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L60
            return r1
        L60:
            r6 = r7
        L61:
            java.util.Collection r8 = (java.util.Collection) r8
            r0.f14186x = r6
            r0.f14187y = r3
            r0.W3 = r5
            java.lang.Object r8 = r2.d(r8, r0)
            if (r8 != r1) goto L70
            return r1
        L70:
            r2 = r6
        L71:
            v9.e r8 = r2.f14185c
            r0.f14186x = r3
            r0.W3 = r4
            java.lang.Object r8 = r8.f(r0)
            if (r8 != r1) goto L7e
            return r1
        L7e:
            tb.e0 r8 = tb.e0.f22152a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: j9.a.c(xb.d):java.lang.Object");
    }

    public final Object d(List<String> list, xb.d<? super e0> dVar) {
        Object c10;
        Object d10 = this.f14184b.d(list, dVar);
        c10 = yb.d.c();
        return d10 == c10 ? d10 : e0.f22152a;
    }
}
