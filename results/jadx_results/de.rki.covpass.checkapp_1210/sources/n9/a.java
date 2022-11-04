package n9;

import bf.y;
import dgca.verifier.app.engine.data.CertificateType;
import dgca.verifier.app.engine.data.Type;
import gc.l;
import hc.t;
import hc.v;
import j$.time.ZonedDateTime;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ub.c0;
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJE\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ\f\u0010\u0010\u001a\u00020\u000f*\u00020\u000eH\u0002JE\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u000f2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017JK\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001f"}, d2 = {"Ln9/a;", "Ln9/c;", BuildConfig.FLAVOR, "acceptanceCountryIsoCode", "issuanceCountryIsoCode", "Ldgca/verifier/app/engine/data/CertificateType;", "certificateType", "j$/time/ZonedDateTime", "validationClock", "region", BuildConfig.FLAVOR, "Lj9/d;", "d", "(Ljava/lang/String;Ljava/lang/String;Ldgca/verifier/app/engine/data/CertificateType;Lj$/time/ZonedDateTime;Ljava/lang/String;Lxb/d;)Ljava/lang/Object;", "Ln9/d;", "Ldgca/verifier/app/engine/data/Type;", "f", "countryIsoCode", "type", "e", "(Ljava/lang/String;Ldgca/verifier/app/engine/data/CertificateType;Lj$/time/ZonedDateTime;Ldgca/verifier/app/engine/data/Type;Ljava/lang/String;Lxb/d;)Ljava/lang/Object;", BuildConfig.FLAVOR, "g", "(Ljava/lang/String;)Ljava/lang/Integer;", "validationType", "a", "(Ljava/lang/String;Ljava/lang/String;Ldgca/verifier/app/engine/data/CertificateType;Lj$/time/ZonedDateTime;Ln9/d;Ljava/lang/String;Lxb/d;)Ljava/lang/Object;", "Lj9/e;", "covPassRulesRepository", "<init>", "(Lj9/e;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a implements n9.c {

    /* renamed from: a */
    private final j9.e f16876a;

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* renamed from: n9.a$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C0259a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f16877a;

        static {
            int[] iArr = new int[n9.d.values().length];
            iArr[n9.d.GG.ordinal()] = 1;
            iArr[n9.d.GGPLUS.ordinal()] = 2;
            iArr[n9.d.GGG.ordinal()] = 3;
            iArr[n9.d.GGGPLUS.ordinal()] = 4;
            iArr[n9.d.MASK.ordinal()] = 5;
            f16877a = iArr;
        }
    }

    @zb.f(c = "de.rki.covpass.sdk.rules.domain.rules.CovPassDomesticGetRulesUseCase", f = "CovPassDomesticGetRulesUseCase.kt", l = {68, 91}, m = "getAcceptanceAndInvalidationRules")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b extends zb.d {
        Object U3;
        Object V3;
        Object W3;
        Object X3;
        Object Y3;
        Object Z3;

        /* renamed from: a4 */
        /* synthetic */ Object f16878a4;

        /* renamed from: c4 */
        int f16880c4;

        /* renamed from: x */
        Object f16881x;

        /* renamed from: y */
        Object f16882y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(xb.d<? super b> dVar) {
            super(dVar);
            a.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.f16878a4 = obj;
            this.f16880c4 |= Integer.MIN_VALUE;
            return a.this.d(null, null, null, null, null, this);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldgca/verifier/app/engine/data/Type;", "value", BuildConfig.FLAVOR, "b", "(Ldgca/verifier/app/engine/data/Type;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class c extends v implements l<Type, Boolean> {

        /* renamed from: c */
        public static final c f16883c = new c();

        c() {
            super(1);
        }

        /* renamed from: b */
        public final Boolean invoke(Type type) {
            t.e(type, "value");
            return Boolean.valueOf(type == Type.TWOG);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldgca/verifier/app/engine/data/Type;", "value", BuildConfig.FLAVOR, "b", "(Ldgca/verifier/app/engine/data/Type;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class d extends v implements l<Type, Boolean> {

        /* renamed from: c */
        public static final d f16884c = new d();

        d() {
            super(1);
        }

        /* renamed from: b */
        public final Boolean invoke(Type type) {
            t.e(type, "value");
            return Boolean.valueOf(type == Type.TWOGPLUS);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldgca/verifier/app/engine/data/Type;", "value", BuildConfig.FLAVOR, "b", "(Ldgca/verifier/app/engine/data/Type;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class e extends v implements l<Type, Boolean> {

        /* renamed from: c */
        public static final e f16885c = new e();

        e() {
            super(1);
        }

        /* renamed from: b */
        public final Boolean invoke(Type type) {
            t.e(type, "value");
            return Boolean.valueOf(type == Type.THREEG);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldgca/verifier/app/engine/data/Type;", "value", BuildConfig.FLAVOR, "b", "(Ldgca/verifier/app/engine/data/Type;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class f extends v implements l<Type, Boolean> {

        /* renamed from: c */
        public static final f f16886c = new f();

        f() {
            super(1);
        }

        /* renamed from: b */
        public final Boolean invoke(Type type) {
            t.e(type, "value");
            return Boolean.valueOf(type == Type.THREEGPLUS);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldgca/verifier/app/engine/data/Type;", "value", BuildConfig.FLAVOR, "b", "(Ldgca/verifier/app/engine/data/Type;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class g extends v implements l<Type, Boolean> {

        /* renamed from: c */
        public static final g f16887c = new g();

        g() {
            super(1);
        }

        /* renamed from: b */
        public final Boolean invoke(Type type) {
            t.e(type, "value");
            return Boolean.valueOf(type == Type.MASK);
        }
    }

    @zb.f(c = "de.rki.covpass.sdk.rules.domain.rules.CovPassDomesticGetRulesUseCase", f = "CovPassDomesticGetRulesUseCase.kt", l = {132}, m = "getGStatusAndMaskRules")
    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class h extends zb.d {
        Object U3;
        /* synthetic */ Object V3;
        int X3;

        /* renamed from: x */
        Object f16888x;

        /* renamed from: y */
        Object f16889y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(xb.d<? super h> dVar) {
            super(dVar);
            a.this = r1;
        }

        @Override // zb.a
        public final Object B(Object obj) {
            this.V3 = obj;
            this.X3 |= Integer.MIN_VALUE;
            return a.this.e(null, null, null, null, null, this);
        }
    }

    public a(j9.e eVar) {
        t.e(eVar, "covPassRulesRepository");
        this.f16876a = eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0166, code lost:
        if (r7 == null) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00de A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0237  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(java.lang.String r20, java.lang.String r21, dgca.verifier.app.engine.data.CertificateType r22, j$.time.ZonedDateTime r23, java.lang.String r24, xb.d<? super java.util.List<j9.d>> r25) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.a.d(java.lang.String, java.lang.String, dgca.verifier.app.engine.data.CertificateType, j$.time.ZonedDateTime, java.lang.String, xb.d):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        if (r14 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0092, code lost:
        if (r15 == null) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.lang.String r10, dgca.verifier.app.engine.data.CertificateType r11, j$.time.ZonedDateTime r12, dgca.verifier.app.engine.data.Type r13, java.lang.String r14, xb.d<? super java.util.List<j9.d>> r15) {
        /*
            r9 = this;
            boolean r0 = r15 instanceof n9.a.h
            if (r0 == 0) goto L13
            r0 = r15
            n9.a$h r0 = (n9.a.h) r0
            int r1 = r0.X3
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.X3 = r1
            goto L18
        L13:
            n9.a$h r0 = new n9.a$h
            r0.<init>(r15)
        L18:
            r6 = r0
            java.lang.Object r15 = r6.V3
            java.lang.Object r0 = yb.b.c()
            int r1 = r6.X3
            java.lang.String r7 = ""
            r8 = 1
            if (r1 == 0) goto L40
            if (r1 != r8) goto L38
            java.lang.Object r10 = r6.U3
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r11 = r6.f16889y
            java.util.Map r11 = (java.util.Map) r11
            java.lang.Object r12 = r6.f16888x
            n9.a r12 = (n9.a) r12
            tb.t.b(r15)
            goto L72
        L38:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L40:
            tb.t.b(r15)
            java.util.LinkedHashMap r15 = new java.util.LinkedHashMap
            r15.<init>()
            if (r14 == 0) goto L55
            java.lang.CharSequence r14 = bf.o.S0(r14)
            java.lang.String r14 = r14.toString()
            if (r14 == 0) goto L55
            goto L56
        L55:
            r14 = r7
        L56:
            j9.e r1 = r9.f16876a
            dgca.verifier.app.engine.data.RuleCertificateType r5 = r11.g()
            r6.f16888x = r9
            r6.f16889y = r15
            r6.U3 = r14
            r6.X3 = r8
            r2 = r10
            r3 = r12
            r4 = r13
            java.lang.Object r10 = r1.a(r2, r3, r4, r5, r6)
            if (r10 != r0) goto L6e
            return r0
        L6e:
            r12 = r9
            r11 = r15
            r15 = r10
            r10 = r14
        L72:
            java.util.List r15 = (java.util.List) r15
            java.util.Iterator r13 = r15.iterator()
        L78:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto Ld3
            java.lang.Object r14 = r13.next()
            j9.d r14 = (j9.d) r14
            java.lang.String r15 = r14.i()
            if (r15 == 0) goto L94
            java.lang.CharSequence r15 = bf.o.S0(r15)
            java.lang.String r15 = r15.toString()
            if (r15 != 0) goto L95
        L94:
            r15 = r7
        L95:
            boolean r15 = bf.o.v(r10, r15, r8)
            if (r15 == 0) goto L78
            java.lang.String r15 = r14.g()
            java.lang.Object r15 = r11.get(r15)
            j9.d r15 = (j9.d) r15
            if (r15 == 0) goto Lb8
            java.lang.String r15 = r15.o()
            if (r15 == 0) goto Lb8
            java.lang.Integer r15 = r12.g(r15)
            if (r15 == 0) goto Lb8
            int r15 = r15.intValue()
            goto Lb9
        Lb8:
            r15 = -1
        Lb9:
            java.lang.String r0 = r14.o()
            java.lang.Integer r0 = r12.g(r0)
            if (r0 == 0) goto Lc8
            int r0 = r0.intValue()
            goto Lc9
        Lc8:
            r0 = 0
        Lc9:
            if (r15 >= r0) goto L78
            java.lang.String r15 = r14.g()
            r11.put(r15, r14)
            goto L78
        Ld3:
            java.util.Collection r10 = r11.values()
            java.util.List r10 = ub.s.F0(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: n9.a.e(java.lang.String, dgca.verifier.app.engine.data.CertificateType, j$.time.ZonedDateTime, dgca.verifier.app.engine.data.Type, java.lang.String, xb.d):java.lang.Object");
    }

    private final Type f(n9.d dVar) {
        int i10 = C0259a.f16877a[dVar.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return Type.TWOGPLUS;
            }
            if (i10 == 3) {
                return Type.THREEG;
            }
            if (i10 == 4) {
                return Type.THREEGPLUS;
            }
            if (i10 == 5) {
                return Type.MASK;
            }
            String name = dVar.name();
            throw new IllegalStateException("Validation type already handled: " + name);
        }
        return Type.TWOG;
    }

    private final Integer g(String str) {
        List x02;
        List<String> q02;
        int i10 = 1;
        try {
            int i11 = 0;
            x02 = y.x0(str, new char[]{'.'}, false, 0, 6, null);
            q02 = c0.q0(x02);
            for (String str2 : q02) {
                i11 += Integer.parseInt(str2) * i10;
                i10 *= 100;
            }
            return Integer.valueOf(i11);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // n9.c
    public Object a(String str, String str2, CertificateType certificateType, ZonedDateTime zonedDateTime, n9.d dVar, String str3, xb.d<? super List<j9.d>> dVar2) {
        return dVar == n9.d.RULES ? d(str, str2, certificateType, zonedDateTime, str3, dVar2) : e(str, certificateType, zonedDateTime, f(dVar), str3, dVar2);
    }
}
