package de.rki.covpass.sdk.cert.models;

import de.rki.covpass.sdk.cert.models.e;
import hc.k0;
import hc.t;
import j$.time.LocalDate;
import kf.h1;
import kf.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 O2\u00020\u0001:\u0002POBm\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u001b\u001a\u00020\t\u0012\b\b\u0002\u0010\u001f\u001a\u00020\t\u0012\b\b\u0002\u0010#\u001a\u00020\t\u0012\b\b\u0002\u0010)\u001a\u00020\u000b\u0012\b\b\u0002\u0010-\u001a\u00020\u000b\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010.\u0012\b\b\u0002\u00107\u001a\u00020\t\u0012\b\b\u0002\u0010;\u001a\u00020\t\u0012\b\b\u0002\u0010>\u001a\u00020\t¢\u0006\u0004\bI\u0010JB\u008f\u0001\b\u0017\u0012\u0006\u0010K\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010)\u001a\u00020\u000b\u0012\b\b\u0001\u0010-\u001a\u00020\u000b\u0012\n\b\u0001\u00103\u001a\u0004\u0018\u00010.\u0012\n\b\u0001\u00107\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010;\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010>\u001a\u0004\u0018\u00010\t\u0012\b\u0010M\u001a\u0004\u0018\u00010L¢\u0006\u0004\bI\u0010NJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R \u0010\u0017\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R \u0010\u001b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u0012\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0019\u0010\u0014R \u0010\u001f\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0012\u0012\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001d\u0010\u0014R \u0010#\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u0012\u0012\u0004\b\"\u0010\u0016\u001a\u0004\b!\u0010\u0014R \u0010)\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010\u0016\u001a\u0004\b&\u0010'R \u0010-\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b*\u0010%\u0012\u0004\b,\u0010\u0016\u001a\u0004\b+\u0010'R\"\u00103\u001a\u0004\u0018\u00010.8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b2\u0010\u0016\u001a\u0004\b \u00101R \u00107\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b4\u0010\u0012\u0012\u0004\b6\u0010\u0016\u001a\u0004\b5\u0010\u0014R \u0010;\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b8\u0010\u0012\u0012\u0004\b:\u0010\u0016\u001a\u0004\b9\u0010\u0014R \u0010>\u001a\u00020\t8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0012\u0012\u0004\b=\u0010\u0016\u001a\u0004\b<\u0010\u0014R\u0011\u0010@\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b/\u0010?R\u0011\u0010A\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b4\u0010?R\u0011\u0010B\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b*\u0010?R\u0011\u0010C\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010?R\u0011\u0010D\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010?R\u0011\u0010E\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b8\u0010?R\u0014\u0010H\u001a\u00020F8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010G¨\u0006Q"}, d2 = {"Lde/rki/covpass/sdk/cert/models/Vaccination;", "Lde/rki/covpass/sdk/cert/models/e;", "self", "Ljf/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ltb/e0;", "j", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "a", "Ljava/lang/String;", "getTargetDisease", "()Ljava/lang/String;", "getTargetDisease$annotations", "()V", "targetDisease", "b", "getVaccineCode", "getVaccineCode$annotations", "vaccineCode", "c", "getProduct", "getProduct$annotations", "product", "d", "getManufacturer", "getManufacturer$annotations", "manufacturer", "e", "I", "getDoseNumber", "()I", "getDoseNumber$annotations", "doseNumber", "f", "getTotalSerialDoses", "getTotalSerialDoses$annotations", "totalSerialDoses", "j$/time/LocalDate", "g", "Lj$/time/LocalDate;", "()Lj$/time/LocalDate;", "getOccurrence$annotations", "occurrence", "h", "getCountry", "getCountry$annotations", "country", "i", "getCertificateIssuer", "getCertificateIssuer$annotations", "certificateIssuer", "getId", "getId$annotations", "id", "()Z", "isComplete", "isCompleteSingleDose", "isBooster", "hasFullProtectionAfterRecovery", "hasFullProtection", "isJanssen", "Lde/rki/covpass/sdk/cert/models/k;", "()Lde/rki/covpass/sdk/cert/models/k;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILj$/time/LocalDate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkf/h1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILj$/time/LocalDate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkf/h1;)V", "Companion", "$serializer", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
@kotlinx.serialization.h
/* loaded from: classes.dex */
public final class Vaccination implements e {
    private static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f8698a;

    /* renamed from: b */
    private final String f8699b;

    /* renamed from: c */
    private final String f8700c;

    /* renamed from: d */
    private final String f8701d;

    /* renamed from: e */
    private final int f8702e;

    /* renamed from: f */
    private final int f8703f;

    /* renamed from: g */
    private final LocalDate f8704g;

    /* renamed from: h */
    private final String f8705h;

    /* renamed from: i */
    private final String f8706i;

    /* renamed from: j */
    private final String f8707j;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lde/rki/covpass/sdk/cert/models/Vaccination$Companion;", BuildConfig.FLAVOR, "()V", "ASTRAZENECA", BuildConfig.FLAVOR, "BIONTECH", "JANSSEN", "MODERNA", "serializer", "Lkotlinx/serialization/KSerializer;", "Lde/rki/covpass/sdk/cert/models/Vaccination;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Vaccination> serializer() {
            return Vaccination$$serializer.INSTANCE;
        }
    }

    public Vaccination() {
        this((String) null, (String) null, (String) null, (String) null, 0, 0, (LocalDate) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ Vaccination(int i10, String str, String str2, String str3, String str4, int i11, int i12, LocalDate localDate, String str5, String str6, String str7, h1 h1Var) {
        if ((i10 & 0) != 0) {
            w0.a(i10, 0, Vaccination$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.f8698a = BuildConfig.FLAVOR;
        } else {
            this.f8698a = str;
        }
        if ((i10 & 2) == 0) {
            this.f8699b = BuildConfig.FLAVOR;
        } else {
            this.f8699b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f8700c = BuildConfig.FLAVOR;
        } else {
            this.f8700c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f8701d = BuildConfig.FLAVOR;
        } else {
            this.f8701d = str4;
        }
        if ((i10 & 16) == 0) {
            this.f8702e = 0;
        } else {
            this.f8702e = i11;
        }
        if ((i10 & 32) == 0) {
            this.f8703f = 0;
        } else {
            this.f8703f = i12;
        }
        if ((i10 & 64) == 0) {
            this.f8704g = null;
        } else {
            this.f8704g = localDate;
        }
        if ((i10 & 128) == 0) {
            this.f8705h = BuildConfig.FLAVOR;
        } else {
            this.f8705h = str5;
        }
        if ((i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.f8706i = BuildConfig.FLAVOR;
        } else {
            this.f8706i = str6;
        }
        if ((i10 & 512) == 0) {
            this.f8707j = BuildConfig.FLAVOR;
        } else {
            this.f8707j = str7;
        }
    }

    public Vaccination(String str, String str2, String str3, String str4, int i10, int i11, LocalDate localDate, String str5, String str6, String str7) {
        t.e(str, "targetDisease");
        t.e(str2, "vaccineCode");
        t.e(str3, "product");
        t.e(str4, "manufacturer");
        t.e(str5, "country");
        t.e(str6, "certificateIssuer");
        t.e(str7, "id");
        this.f8698a = str;
        this.f8699b = str2;
        this.f8700c = str3;
        this.f8701d = str4;
        this.f8702e = i10;
        this.f8703f = i11;
        this.f8704g = localDate;
        this.f8705h = str5;
        this.f8706i = str6;
        this.f8707j = str7;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ Vaccination(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, int r16, int r17, j$.time.LocalDate r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
        /*
            r11 = this;
            r0 = r22
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto La
            r1 = r2
            goto Lb
        La:
            r1 = r12
        Lb:
            r3 = r0 & 2
            if (r3 == 0) goto L11
            r3 = r2
            goto L12
        L11:
            r3 = r13
        L12:
            r4 = r0 & 4
            if (r4 == 0) goto L18
            r4 = r2
            goto L19
        L18:
            r4 = r14
        L19:
            r5 = r0 & 8
            if (r5 == 0) goto L1f
            r5 = r2
            goto L20
        L1f:
            r5 = r15
        L20:
            r6 = r0 & 16
            r7 = 0
            if (r6 == 0) goto L27
            r6 = r7
            goto L29
        L27:
            r6 = r16
        L29:
            r8 = r0 & 32
            if (r8 == 0) goto L2e
            goto L30
        L2e:
            r7 = r17
        L30:
            r8 = r0 & 64
            if (r8 == 0) goto L36
            r8 = 0
            goto L38
        L36:
            r8 = r18
        L38:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L3e
            r9 = r2
            goto L40
        L3e:
            r9 = r19
        L40:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L46
            r10 = r2
            goto L48
        L46:
            r10 = r20
        L48:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L4d
            goto L4f
        L4d:
            r2 = r21
        L4f:
            r12 = r11
            r13 = r1
            r14 = r3
            r15 = r4
            r16 = r5
            r17 = r6
            r18 = r7
            r19 = r8
            r20 = r9
            r21 = r10
            r22 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.rki.covpass.sdk.cert.models.Vaccination.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, int, j$.time.LocalDate, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @fc.c
    public static final void j(Vaccination vaccination, jf.d dVar, SerialDescriptor serialDescriptor) {
        t.e(vaccination, "self");
        t.e(dVar, "output");
        t.e(serialDescriptor, "serialDesc");
        boolean z10 = false;
        if (dVar.p(serialDescriptor, 0) || !t.a(vaccination.f8698a, BuildConfig.FLAVOR)) {
            dVar.E(serialDescriptor, 0, vaccination.f8698a);
        }
        if (dVar.p(serialDescriptor, 1) || !t.a(vaccination.f8699b, BuildConfig.FLAVOR)) {
            dVar.E(serialDescriptor, 1, vaccination.f8699b);
        }
        if (dVar.p(serialDescriptor, 2) || !t.a(vaccination.f8700c, BuildConfig.FLAVOR)) {
            dVar.E(serialDescriptor, 2, vaccination.f8700c);
        }
        if (dVar.p(serialDescriptor, 3) || !t.a(vaccination.f8701d, BuildConfig.FLAVOR)) {
            dVar.E(serialDescriptor, 3, vaccination.f8701d);
        }
        if (dVar.p(serialDescriptor, 4) || vaccination.f8702e != 0) {
            dVar.z(serialDescriptor, 4, vaccination.f8702e);
        }
        if (dVar.p(serialDescriptor, 5) || vaccination.f8703f != 0) {
            dVar.z(serialDescriptor, 5, vaccination.f8703f);
        }
        if (dVar.p(serialDescriptor, 6) || vaccination.f8704g != null) {
            dVar.m(serialDescriptor, 6, new ContextualSerializer(k0.b(LocalDate.class), null, new KSerializer[0]), vaccination.f8704g);
        }
        if (dVar.p(serialDescriptor, 7) || !t.a(vaccination.f8705h, BuildConfig.FLAVOR)) {
            dVar.E(serialDescriptor, 7, vaccination.f8705h);
        }
        if (dVar.p(serialDescriptor, 8) || !t.a(vaccination.f8706i, BuildConfig.FLAVOR)) {
            dVar.E(serialDescriptor, 8, vaccination.f8706i);
        }
        if (dVar.p(serialDescriptor, 9) || !t.a(vaccination.getId(), BuildConfig.FLAVOR)) {
            z10 = true;
        }
        if (z10) {
            dVar.E(serialDescriptor, 9, vaccination.getId());
        }
    }

    @Override // de.rki.covpass.sdk.cert.models.e
    public String a() {
        return e.a.a(this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0017, code lost:
        if ((r0 != null && z9.m.b(r0, 14)) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b() {
        /*
            r5 = this;
            boolean r0 = r5.g()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L19
            j$.time.LocalDate r0 = r5.f8704g
            if (r0 == 0) goto L16
            r3 = 14
            boolean r0 = z9.m.b(r0, r3)
            if (r0 != r2) goto L16
            r0 = r2
            goto L17
        L16:
            r0 = r1
        L17:
            if (r0 != 0) goto L25
        L19:
            boolean r0 = r5.f()
            if (r0 != 0) goto L25
            boolean r0 = r5.c()
            if (r0 == 0) goto L26
        L25:
            r1 = r2
        L26:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: de.rki.covpass.sdk.cert.models.Vaccination.b():boolean");
    }

    public final boolean c() {
        return h() && (!i() || t.a(this.f8700c, "EU/1/20/1528") || t.a(this.f8700c, "EU/1/20/1507") || t.a(this.f8700c, "EU/1/21/1529"));
    }

    public final LocalDate d() {
        return this.f8704g;
    }

    /* renamed from: e */
    public k getType() {
        return b() ? k.VACCINATION_FULL_PROTECTION : g() ? k.VACCINATION_COMPLETE : k.VACCINATION_INCOMPLETE;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Vaccination)) {
            return false;
        }
        Vaccination vaccination = (Vaccination) obj;
        return t.a(this.f8698a, vaccination.f8698a) && t.a(this.f8699b, vaccination.f8699b) && t.a(this.f8700c, vaccination.f8700c) && t.a(this.f8701d, vaccination.f8701d) && this.f8702e == vaccination.f8702e && this.f8703f == vaccination.f8703f && t.a(this.f8704g, vaccination.f8704g) && t.a(this.f8705h, vaccination.f8705h) && t.a(this.f8706i, vaccination.f8706i) && t.a(getId(), vaccination.getId());
    }

    public final boolean f() {
        return (g() && this.f8702e > 2) || (g() && t.a(this.f8700c, "EU/1/20/1525") && this.f8702e == 2) || this.f8702e > this.f8703f;
    }

    public final boolean g() {
        return this.f8702e >= this.f8703f && (!h() || !i());
    }

    @Override // de.rki.covpass.sdk.cert.models.e
    public String getId() {
        return this.f8707j;
    }

    public final boolean h() {
        return this.f8702e == 1 && this.f8703f == 1;
    }

    public int hashCode() {
        int hashCode = ((((((((((this.f8698a.hashCode() * 31) + this.f8699b.hashCode()) * 31) + this.f8700c.hashCode()) * 31) + this.f8701d.hashCode()) * 31) + this.f8702e) * 31) + this.f8703f) * 31;
        LocalDate localDate = this.f8704g;
        return ((((((hashCode + (localDate == null ? 0 : localDate.hashCode())) * 31) + this.f8705h.hashCode()) * 31) + this.f8706i.hashCode()) * 31) + getId().hashCode();
    }

    public final boolean i() {
        return t.a(this.f8700c, "EU/1/20/1525");
    }

    public String toString() {
        String str = this.f8698a;
        String str2 = this.f8699b;
        String str3 = this.f8700c;
        String str4 = this.f8701d;
        int i10 = this.f8702e;
        int i11 = this.f8703f;
        LocalDate localDate = this.f8704g;
        String str5 = this.f8705h;
        String str6 = this.f8706i;
        String id2 = getId();
        return "Vaccination(targetDisease=" + str + ", vaccineCode=" + str2 + ", product=" + str3 + ", manufacturer=" + str4 + ", doseNumber=" + i10 + ", totalSerialDoses=" + i11 + ", occurrence=" + localDate + ", country=" + str5 + ", certificateIssuer=" + str6 + ", id=" + id2 + ")";
    }
}
