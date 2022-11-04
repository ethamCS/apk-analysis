package de.rki.covpass.sdk.cert.models;

import de.rki.covpass.sdk.cert.models.e;
import hc.k0;
import hc.t;
import j$.time.ZonedDateTime;
import kf.h1;
import kf.k1;
import kf.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0002GFBq\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\b\b\u0002\u0010\u001b\u001a\u00020\t\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010#\u0012\b\b\u0002\u0010,\u001a\u00020\t\u0012\b\b\u0002\u00100\u001a\u00020\t\u0012\b\b\u0002\u00104\u001a\u00020\t\u0012\b\b\u0002\u00108\u001a\u00020\t\u0012\b\b\u0002\u0010<\u001a\u00020\t¢\u0006\u0004\b@\u0010AB\u0093\u0001\b\u0017\u0012\u0006\u0010B\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010#\u0012\n\b\u0001\u0010,\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00100\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00104\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00108\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010<\u001a\u0004\u0018\u00010\t\u0012\b\u0010D\u001a\u0004\u0018\u00010C¢\u0006\u0004\b@\u0010EJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R \u0010\u0017\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R \u0010\u001b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u0012\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0019\u0010\u0014R\"\u0010\u001f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0012\u0012\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001d\u0010\u0014R\"\u0010\"\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0012\u0012\u0004\b!\u0010\u0016\u001a\u0004\b \u0010\u0014R\"\u0010(\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b'\u0010\u0016\u001a\u0004\b\u0018\u0010&R \u0010,\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010\u0012\u0012\u0004\b+\u0010\u0016\u001a\u0004\b*\u0010\u0014R \u00100\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010\u0012\u0012\u0004\b/\u0010\u0016\u001a\u0004\b.\u0010\u0014R \u00104\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b1\u0010\u0012\u0012\u0004\b3\u0010\u0016\u001a\u0004\b2\u0010\u0014R \u00108\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u0010\u0012\u0012\u0004\b7\u0010\u0016\u001a\u0004\b6\u0010\u0014R \u0010<\u001a\u00020\t8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b9\u0010\u0012\u0012\u0004\b;\u0010\u0016\u001a\u0004\b:\u0010\u0014R\u0014\u0010?\u001a\u00020=8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010>¨\u0006H"}, d2 = {"Lde/rki/covpass/sdk/cert/models/TestCert;", "Lde/rki/covpass/sdk/cert/models/e;", "self", "Ljf/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ltb/e0;", "d", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "a", "Ljava/lang/String;", "getTargetDisease", "()Ljava/lang/String;", "getTargetDisease$annotations", "()V", "targetDisease", "b", "getTestType", "getTestType$annotations", "testType", "c", "getTestName", "getTestName$annotations", "testName", "getManufacturer", "getManufacturer$annotations", "manufacturer", "j$/time/ZonedDateTime", "e", "Lj$/time/ZonedDateTime;", "()Lj$/time/ZonedDateTime;", "getSampleCollection$annotations", "sampleCollection", "f", "getTestResult", "getTestResult$annotations", "testResult", "g", "getTestingCenter", "getTestingCenter$annotations", "testingCenter", "h", "getCountry", "getCountry$annotations", "country", "i", "getCertificateIssuer", "getCertificateIssuer$annotations", "certificateIssuer", "j", "getId", "getId$annotations", "id", "Lde/rki/covpass/sdk/cert/models/j;", "()Lde/rki/covpass/sdk/cert/models/j;", "type", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/ZonedDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkf/h1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lj$/time/ZonedDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkf/h1;)V", "Companion", "$serializer", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
@kotlinx.serialization.h
/* loaded from: classes.dex */
public final class TestCert implements e {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f8688a;

    /* renamed from: b */
    private final String f8689b;

    /* renamed from: c */
    private final String f8690c;

    /* renamed from: d */
    private final String f8691d;

    /* renamed from: e */
    private final ZonedDateTime f8692e;

    /* renamed from: f */
    private final String f8693f;

    /* renamed from: g */
    private final String f8694g;

    /* renamed from: h */
    private final String f8695h;

    /* renamed from: i */
    private final String f8696i;

    /* renamed from: j */
    private final String f8697j;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lde/rki/covpass/sdk/cert/models/TestCert$Companion;", BuildConfig.FLAVOR, "()V", "ANTIGEN_TEST", BuildConfig.FLAVOR, "ANTIGEN_TEST_EXPIRY_TIME_HOURS", BuildConfig.FLAVOR, "NEGATIVE_RESULT", "PCR_TEST", "PCR_TEST_EXPIRY_TIME_HOURS", "POSITIVE_RESULT", "serializer", "Lkotlinx/serialization/KSerializer;", "Lde/rki/covpass/sdk/cert/models/TestCert;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TestCert> serializer() {
            return TestCert$$serializer.INSTANCE;
        }
    }

    public TestCert() {
        this((String) null, (String) null, (String) null, (String) null, (ZonedDateTime) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1023, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ TestCert(int i10, String str, String str2, String str3, String str4, ZonedDateTime zonedDateTime, String str5, String str6, String str7, String str8, String str9, h1 h1Var) {
        if ((i10 & 0) != 0) {
            w0.a(i10, 0, TestCert$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.f8688a = BuildConfig.FLAVOR;
        } else {
            this.f8688a = str;
        }
        if ((i10 & 2) == 0) {
            this.f8689b = BuildConfig.FLAVOR;
        } else {
            this.f8689b = str2;
        }
        if ((i10 & 4) == 0) {
            this.f8690c = BuildConfig.FLAVOR;
        } else {
            this.f8690c = str3;
        }
        if ((i10 & 8) == 0) {
            this.f8691d = BuildConfig.FLAVOR;
        } else {
            this.f8691d = str4;
        }
        if ((i10 & 16) == 0) {
            this.f8692e = null;
        } else {
            this.f8692e = zonedDateTime;
        }
        if ((i10 & 32) == 0) {
            this.f8693f = BuildConfig.FLAVOR;
        } else {
            this.f8693f = str5;
        }
        if ((i10 & 64) == 0) {
            this.f8694g = BuildConfig.FLAVOR;
        } else {
            this.f8694g = str6;
        }
        if ((i10 & 128) == 0) {
            this.f8695h = BuildConfig.FLAVOR;
        } else {
            this.f8695h = str7;
        }
        if ((i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.f8696i = BuildConfig.FLAVOR;
        } else {
            this.f8696i = str8;
        }
        if ((i10 & 512) == 0) {
            this.f8697j = BuildConfig.FLAVOR;
        } else {
            this.f8697j = str9;
        }
    }

    public TestCert(String str, String str2, String str3, String str4, ZonedDateTime zonedDateTime, String str5, String str6, String str7, String str8, String str9) {
        t.e(str, "targetDisease");
        t.e(str2, "testType");
        t.e(str5, "testResult");
        t.e(str6, "testingCenter");
        t.e(str7, "country");
        t.e(str8, "certificateIssuer");
        t.e(str9, "id");
        this.f8688a = str;
        this.f8689b = str2;
        this.f8690c = str3;
        this.f8691d = str4;
        this.f8692e = zonedDateTime;
        this.f8693f = str5;
        this.f8694g = str6;
        this.f8695h = str7;
        this.f8696i = str8;
        this.f8697j = str9;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ TestCert(java.lang.String r12, java.lang.String r13, java.lang.String r14, java.lang.String r15, j$.time.ZonedDateTime r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21, int r22, kotlin.jvm.internal.DefaultConstructorMarker r23) {
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
            if (r6 == 0) goto L26
            r6 = 0
            goto L28
        L26:
            r6 = r16
        L28:
            r7 = r0 & 32
            if (r7 == 0) goto L2e
            r7 = r2
            goto L30
        L2e:
            r7 = r17
        L30:
            r8 = r0 & 64
            if (r8 == 0) goto L36
            r8 = r2
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
        throw new UnsupportedOperationException("Method not decompiled: de.rki.covpass.sdk.cert.models.TestCert.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, j$.time.ZonedDateTime, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    @fc.c
    public static final void d(TestCert testCert, jf.d dVar, SerialDescriptor serialDescriptor) {
        t.e(testCert, "self");
        t.e(dVar, "output");
        t.e(serialDescriptor, "serialDesc");
        boolean z10 = false;
        if (dVar.p(serialDescriptor, 0) || !t.a(testCert.f8688a, BuildConfig.FLAVOR)) {
            dVar.E(serialDescriptor, 0, testCert.f8688a);
        }
        if (dVar.p(serialDescriptor, 1) || !t.a(testCert.f8689b, BuildConfig.FLAVOR)) {
            dVar.E(serialDescriptor, 1, testCert.f8689b);
        }
        if (dVar.p(serialDescriptor, 2) || !t.a(testCert.f8690c, BuildConfig.FLAVOR)) {
            dVar.m(serialDescriptor, 2, k1.f15181a, testCert.f8690c);
        }
        if (dVar.p(serialDescriptor, 3) || !t.a(testCert.f8691d, BuildConfig.FLAVOR)) {
            dVar.m(serialDescriptor, 3, k1.f15181a, testCert.f8691d);
        }
        if (dVar.p(serialDescriptor, 4) || testCert.f8692e != null) {
            dVar.m(serialDescriptor, 4, new ContextualSerializer(k0.b(ZonedDateTime.class), null, new KSerializer[0]), testCert.f8692e);
        }
        if (dVar.p(serialDescriptor, 5) || !t.a(testCert.f8693f, BuildConfig.FLAVOR)) {
            dVar.E(serialDescriptor, 5, testCert.f8693f);
        }
        if (dVar.p(serialDescriptor, 6) || !t.a(testCert.f8694g, BuildConfig.FLAVOR)) {
            dVar.E(serialDescriptor, 6, testCert.f8694g);
        }
        if (dVar.p(serialDescriptor, 7) || !t.a(testCert.f8695h, BuildConfig.FLAVOR)) {
            dVar.E(serialDescriptor, 7, testCert.f8695h);
        }
        if (dVar.p(serialDescriptor, 8) || !t.a(testCert.f8696i, BuildConfig.FLAVOR)) {
            dVar.E(serialDescriptor, 8, testCert.f8696i);
        }
        if (dVar.p(serialDescriptor, 9) || !t.a(testCert.getId(), BuildConfig.FLAVOR)) {
            z10 = true;
        }
        if (z10) {
            dVar.E(serialDescriptor, 9, testCert.getId());
        }
    }

    @Override // de.rki.covpass.sdk.cert.models.e
    public String a() {
        return e.a.a(this);
    }

    public final ZonedDateTime b() {
        return this.f8692e;
    }

    /* renamed from: c */
    public j getType() {
        String str = this.f8689b;
        if (t.a(str, "LP6464-4")) {
            String str2 = this.f8693f;
            if (!t.a(str2, "260373001") && t.a(str2, "260415000")) {
                return j.NEGATIVE_PCR_TEST;
            }
        } else if (t.a(str, "LP217198-3")) {
            String str3 = this.f8693f;
            return (!t.a(str3, "260373001") && t.a(str3, "260415000")) ? j.NEGATIVE_ANTIGEN_TEST : j.POSITIVE_ANTIGEN_TEST;
        }
        return j.POSITIVE_PCR_TEST;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TestCert)) {
            return false;
        }
        TestCert testCert = (TestCert) obj;
        return t.a(this.f8688a, testCert.f8688a) && t.a(this.f8689b, testCert.f8689b) && t.a(this.f8690c, testCert.f8690c) && t.a(this.f8691d, testCert.f8691d) && t.a(this.f8692e, testCert.f8692e) && t.a(this.f8693f, testCert.f8693f) && t.a(this.f8694g, testCert.f8694g) && t.a(this.f8695h, testCert.f8695h) && t.a(this.f8696i, testCert.f8696i) && t.a(getId(), testCert.getId());
    }

    @Override // de.rki.covpass.sdk.cert.models.e
    public String getId() {
        return this.f8697j;
    }

    public int hashCode() {
        int hashCode = ((this.f8688a.hashCode() * 31) + this.f8689b.hashCode()) * 31;
        String str = this.f8690c;
        int i10 = 0;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f8691d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ZonedDateTime zonedDateTime = this.f8692e;
        if (zonedDateTime != null) {
            i10 = zonedDateTime.hashCode();
        }
        return ((((((((((hashCode3 + i10) * 31) + this.f8693f.hashCode()) * 31) + this.f8694g.hashCode()) * 31) + this.f8695h.hashCode()) * 31) + this.f8696i.hashCode()) * 31) + getId().hashCode();
    }

    public String toString() {
        String str = this.f8688a;
        String str2 = this.f8689b;
        String str3 = this.f8690c;
        String str4 = this.f8691d;
        ZonedDateTime zonedDateTime = this.f8692e;
        String str5 = this.f8693f;
        String str6 = this.f8694g;
        String str7 = this.f8695h;
        String str8 = this.f8696i;
        String id2 = getId();
        return "TestCert(targetDisease=" + str + ", testType=" + str2 + ", testName=" + str3 + ", manufacturer=" + str4 + ", sampleCollection=" + zonedDateTime + ", testResult=" + str5 + ", testingCenter=" + str6 + ", country=" + str7 + ", certificateIssuer=" + str8 + ", id=" + id2 + ")";
    }
}
