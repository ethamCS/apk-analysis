package i8;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import zb.d;
import zb.f;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a5\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000b"}, d2 = {"Lde/rki/covpass/sdk/cert/models/CovCertificate;", "covCertificate", "Ld9/k;", "covPassRulesValidator", "Lh9/g;", "revocationRemoteListRepository", BuildConfig.FLAVOR, "recoveryOlder90DaysValid", "Li8/a;", "a", "(Lde/rki/covpass/sdk/cert/models/CovCertificate;Ld9/k;Lh9/g;ZLxb/d;)Ljava/lang/Object;", "common-app-covpass-check_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b {

    @f(c = "de.rki.covpass.checkapp.validitycheck.CovPassCheckValidatorKt", f = "CovPassCheckValidator.kt", l = {26, 37}, m = "validate")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a extends d {
        boolean U3;
        /* synthetic */ Object V3;
        int W3;

        /* renamed from: x */
        Object f12346x;

        /* renamed from: y */
        Object f12347y;

        a(xb.d<? super a> dVar) {
            super(dVar);
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.V3 = obj;
            this.W3 |= Integer.MIN_VALUE;
            return b.a(null, null, null, false, this);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(de.rki.covpass.sdk.cert.models.CovCertificate r11, d9.k r12, h9.g r13, boolean r14, xb.d<? super i8.a> r15) {
        /*
            boolean r0 = r15 instanceof i8.b.a
            if (r0 == 0) goto L13
            r0 = r15
            i8.b$a r0 = (i8.b.a) r0
            int r1 = r0.W3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.W3 = r1
            goto L18
        L13:
            i8.b$a r0 = new i8.b$a
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.V3
            java.lang.Object r9 = yb.b.c()
            int r1 = r0.W3
            r10 = 2
            r2 = 1
            if (r1 == 0) goto L44
            if (r1 == r2) goto L35
            if (r1 != r10) goto L2d
            tb.t.b(r15)
            goto La5
        L2d:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L35:
            boolean r14 = r0.U3
            java.lang.Object r11 = r0.f12347y
            r13 = r11
            h9.g r13 = (h9.g) r13
            java.lang.Object r11 = r0.f12346x
            de.rki.covpass.sdk.cert.models.CovCertificate r11 = (de.rki.covpass.sdk.cert.models.CovCertificate) r11
            tb.t.b(r15)
            goto L5f
        L44:
            tb.t.b(r15)
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 14
            r8 = 0
            r0.f12346x = r11
            r0.f12347y = r13
            r0.U3 = r14
            r0.W3 = r2
            r1 = r12
            r2 = r11
            r6 = r0
            java.lang.Object r15 = d9.k.c(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r15 != r9) goto L5f
            return r9
        L5f:
            java.util.List r15 = (java.util.List) r15
            boolean r12 = r15.isEmpty()
            if (r12 == 0) goto L6a
            i8.a r11 = i8.a.TechnicalError
            return r11
        L6a:
            java.util.Iterator r12 = r15.iterator()
        L6e:
            boolean r15 = r12.hasNext()
            if (r15 == 0) goto L97
            java.lang.Object r15 = r12.next()
            dgca.verifier.app.engine.ValidationResult r15 = (dgca.verifier.app.engine.ValidationResult) r15
            dgca.verifier.app.engine.Result r1 = r15.getResult()
            dgca.verifier.app.engine.Result r2 = dgca.verifier.app.engine.Result.PASSED
            if (r1 == r2) goto L6e
            if (r14 == 0) goto L94
            dgca.verifier.app.engine.data.Rule r15 = r15.getRule()
            java.lang.String r15 = r15.getIdentifier()
            java.lang.String r1 = "RR-DE-0002"
            boolean r15 = hc.t.a(r15, r1)
            if (r15 != 0) goto L6e
        L94:
            i8.a r11 = i8.a.ValidationError
            return r11
        L97:
            r12 = 0
            r0.f12346x = r12
            r0.f12347y = r12
            r0.W3 = r10
            java.lang.Object r15 = h9.h.a(r11, r13, r0)
            if (r15 != r9) goto La5
            return r9
        La5:
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r11 = r15.booleanValue()
            if (r11 == 0) goto Lb0
            i8.a r11 = i8.a.TechnicalError
            return r11
        Lb0:
            i8.a r11 = i8.a.Success
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.b.a(de.rki.covpass.sdk.cert.models.CovCertificate, d9.k, h9.g, boolean, xb.d):java.lang.Object");
    }
}
