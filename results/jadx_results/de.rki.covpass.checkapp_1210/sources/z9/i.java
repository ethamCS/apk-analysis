package z9;

import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u0003\u001a\u00020\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\r"}, d2 = {"Lz9/i;", BuildConfig.FLAVOR, "Ltb/e0;", "a", "(Lxb/d;)Ljava/lang/Object;", "Ld9/o;", "dscListService", "Lv9/b;", "dscRepository", "Ld9/f;", "certValidator", "<init>", "(Ld9/o;Lv9/b;Ld9/f;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    private final d9.o f26552a;

    /* renamed from: b */
    private final v9.b f26553b;

    /* renamed from: c */
    private final d9.f f26554c;

    @zb.f(c = "de.rki.covpass.sdk.utils.DscListUpdater", f = "DscListUpdater.kt", l = {20, 22}, m = "update")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a extends zb.d {
        int V3;

        /* renamed from: x */
        Object f26555x;

        /* renamed from: y */
        /* synthetic */ Object f26556y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(xb.d<? super a> dVar) {
            super(dVar);
            i.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.f26556y = obj;
            this.V3 |= Integer.MIN_VALUE;
            return i.this.a(this);
        }
    }

    public i(d9.o oVar, v9.b bVar, d9.f fVar) {
        t.e(oVar, "dscListService");
        t.e(bVar, "dscRepository");
        t.e(fVar, "certValidator");
        this.f26552a = oVar;
        this.f26553b = bVar;
        this.f26554c = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0071 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(xb.d<? super tb.e0> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof z9.i.a
            if (r0 == 0) goto L13
            r0 = r7
            z9.i$a r0 = (z9.i.a) r0
            int r1 = r0.V3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.V3 = r1
            goto L18
        L13:
            z9.i$a r0 = new z9.i$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f26556y
            java.lang.Object r1 = yb.b.c()
            int r2 = r0.V3
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            tb.t.b(r7)
            goto L72
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.f26555x
            z9.i r2 = (z9.i) r2
            tb.t.b(r7)
            goto L59
        L3c:
            tb.t.b(r7)
            d9.o r7 = r6.f26552a
            v9.b r2 = r6.f26553b
            s4.v0 r2 = r2.b()
            java.lang.Object r2 = r2.getValue()
            de.rki.covpass.sdk.cert.models.DscList r2 = (de.rki.covpass.sdk.cert.models.DscList) r2
            r0.f26555x = r6
            r0.V3 = r4
            java.lang.Object r7 = r7.a(r2, r0)
            if (r7 != r1) goto L58
            return r1
        L58:
            r2 = r6
        L59:
            de.rki.covpass.sdk.cert.models.DscList r7 = (de.rki.covpass.sdk.cert.models.DscList) r7
            d9.f r4 = r2.f26554c
            java.util.List r5 = d9.p.a(r7)
            r4.g(r5)
            v9.b r2 = r2.f26553b
            r4 = 0
            r0.f26555x = r4
            r0.V3 = r3
            java.lang.Object r7 = r2.d(r7, r0)
            if (r7 != r1) goto L72
            return r1
        L72:
            tb.e0 r7 = tb.e0.f22152a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z9.i.a(xb.d):java.lang.Object");
    }
}
