package de.rki.covpass.sdk.cert.models;

import hc.t;
import java.util.ArrayList;
import java.util.List;
import kf.h1;
import kf.k1;
import kf.s;
import kf.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 T2\u00020\u0001:\u0002UTB¡\u0001\b\u0017\u0012\u0006\u0010O\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\b\b\u0001\u0010#\u001a\u00020\u001d\u0012\u0006\u0010(\u001a\u00020\u000e\u0012\u0006\u0010+\u001a\u00020\u000e\u0012\u0006\u0010.\u001a\u00020\u000e\u0012\u000e\u00104\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010/\u0012\u0006\u00107\u001a\u00020\u000e\u0012\u0006\u0010:\u001a\u00020\u000e\u0012\u0006\u0010=\u001a\u00020\u000e\u0012\u0006\u0010@\u001a\u00020\u000e\u0012\u0006\u0010B\u001a\u00020\u000e\u0012\b\u0010H\u001a\u0004\u0018\u00010C\u0012\b\u0010N\u001a\u0004\u0018\u00010I\u0012\b\u0010Q\u001a\u0004\u0018\u00010P¢\u0006\u0004\bR\u0010SJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u0016\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R \u0010\u001c\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u0019\u0010\u001aR \u0010#\u001a\u00020\u001d8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010\u0015\u001a\u0004\b \u0010!R\u0017\u0010(\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010+\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b*\u0010'R\u0017\u0010.\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b-\u0010'R\u001d\u00104\u001a\b\u0012\u0004\u0012\u00020\t0/8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u00107\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b5\u0010%\u001a\u0004\b6\u0010'R\u0017\u0010:\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b8\u0010%\u001a\u0004\b9\u0010'R\u0017\u0010=\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b;\u0010%\u001a\u0004\b<\u0010'R\u0017\u0010@\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b>\u0010%\u001a\u0004\b?\u0010'R\u0017\u0010B\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\bA\u0010%\u001a\u0004\bB\u0010'R\u0017\u0010H\u001a\u00020C8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010N\u001a\u00020I8\u0006¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M¨\u0006V"}, d2 = {"Lde/rki/covpass/sdk/cert/models/CombinedCovCertificateLocal;", BuildConfig.FLAVOR, "self", "Ljf/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ltb/e0;", "a", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "Lde/rki/covpass/sdk/cert/models/CovCertificate;", "Lde/rki/covpass/sdk/cert/models/CovCertificate;", "getCovCertificate", "()Lde/rki/covpass/sdk/cert/models/CovCertificate;", "getCovCertificate$annotations", "()V", "covCertificate", "b", "Ljava/lang/String;", "getQrContent", "()Ljava/lang/String;", "getQrContent$annotations", "qrContent", BuildConfig.FLAVOR, "c", "J", "getTimestamp", "()J", "getTimestamp$annotations", "timestamp", "d", "Z", "getHasSeenBoosterNotification", "()Z", "hasSeenBoosterNotification", "e", "getHasSeenBoosterDetailNotification", "hasSeenBoosterDetailNotification", "f", "getHasSeenExpiryNotification", "hasSeenExpiryNotification", BuildConfig.FLAVOR, "g", "Ljava/util/List;", "getBoosterNotificationRuleIds", "()Ljava/util/List;", "boosterNotificationRuleIds", "h", "getHasSeenReissueNotification", "hasSeenReissueNotification", "i", "getHasSeenExpiredReissueNotification", "hasSeenExpiredReissueNotification", "j", "getHasSeenReissueDetailNotification", "hasSeenReissueDetailNotification", "k", "getHasSeenRevokedNotification", "hasSeenRevokedNotification", "l", "isRevoked", "Lde/rki/covpass/sdk/cert/models/h;", "m", "Lde/rki/covpass/sdk/cert/models/h;", "getReissueState", "()Lde/rki/covpass/sdk/cert/models/h;", "reissueState", "Lde/rki/covpass/sdk/cert/models/i;", "n", "Lde/rki/covpass/sdk/cert/models/i;", "getReissueType", "()Lde/rki/covpass/sdk/cert/models/i;", "reissueType", "seen1", "Lkf/h1;", "serializationConstructorMarker", "<init>", "(ILde/rki/covpass/sdk/cert/models/CovCertificate;Ljava/lang/String;JZZZLjava/util/List;ZZZZZLde/rki/covpass/sdk/cert/models/h;Lde/rki/covpass/sdk/cert/models/i;Lkf/h1;)V", "Companion", "$serializer", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
@kotlinx.serialization.h
/* loaded from: classes.dex */
public final class CombinedCovCertificateLocal {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final CovCertificate f8606a;

    /* renamed from: b */
    private final String f8607b;

    /* renamed from: c */
    private final long f8608c;

    /* renamed from: d */
    private final boolean f8609d;

    /* renamed from: e */
    private final boolean f8610e;

    /* renamed from: f */
    private final boolean f8611f;

    /* renamed from: g */
    private final List<String> f8612g;

    /* renamed from: h */
    private final boolean f8613h;

    /* renamed from: i */
    private final boolean f8614i;

    /* renamed from: j */
    private final boolean f8615j;

    /* renamed from: k */
    private final boolean f8616k;

    /* renamed from: l */
    private final boolean f8617l;

    /* renamed from: m */
    private final h f8618m;

    /* renamed from: n */
    private final i f8619n;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lde/rki/covpass/sdk/cert/models/CombinedCovCertificateLocal$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lde/rki/covpass/sdk/cert/models/CombinedCovCertificateLocal;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CombinedCovCertificateLocal> serializer() {
            return CombinedCovCertificateLocal$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CombinedCovCertificateLocal(int i10, CovCertificate covCertificate, String str, long j10, boolean z10, boolean z11, boolean z12, List list, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, h hVar, i iVar, h1 h1Var) {
        if (3 != (i10 & 3)) {
            w0.a(i10, 3, CombinedCovCertificateLocal$$serializer.INSTANCE.getDescriptor());
        }
        this.f8606a = covCertificate;
        this.f8607b = str;
        this.f8608c = (i10 & 4) == 0 ? Long.MIN_VALUE : j10;
        if ((i10 & 8) == 0) {
            this.f8609d = false;
        } else {
            this.f8609d = z10;
        }
        if ((i10 & 16) == 0) {
            this.f8610e = false;
        } else {
            this.f8610e = z11;
        }
        if ((i10 & 32) == 0) {
            this.f8611f = false;
        } else {
            this.f8611f = z12;
        }
        this.f8612g = (i10 & 64) == 0 ? new ArrayList() : list;
        if ((i10 & 128) == 0) {
            this.f8613h = false;
        } else {
            this.f8613h = z13;
        }
        if ((i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.f8614i = false;
        } else {
            this.f8614i = z14;
        }
        if ((i10 & 512) == 0) {
            this.f8615j = false;
        } else {
            this.f8615j = z15;
        }
        if ((i10 & 1024) == 0) {
            this.f8616k = false;
        } else {
            this.f8616k = z16;
        }
        if ((i10 & 2048) == 0) {
            this.f8617l = false;
        } else {
            this.f8617l = z17;
        }
        this.f8618m = (i10 & 4096) == 0 ? h.None : hVar;
        this.f8619n = (i10 & 8192) == 0 ? i.None : iVar;
    }

    @fc.c
    public static final void a(CombinedCovCertificateLocal combinedCovCertificateLocal, jf.d dVar, SerialDescriptor serialDescriptor) {
        t.e(combinedCovCertificateLocal, "self");
        t.e(dVar, "output");
        t.e(serialDescriptor, "serialDesc");
        boolean z10 = false;
        dVar.t(serialDescriptor, 0, CovCertificate$$serializer.INSTANCE, combinedCovCertificateLocal.f8606a);
        dVar.E(serialDescriptor, 1, combinedCovCertificateLocal.f8607b);
        if (dVar.p(serialDescriptor, 2) || combinedCovCertificateLocal.f8608c != Long.MIN_VALUE) {
            dVar.A(serialDescriptor, 2, combinedCovCertificateLocal.f8608c);
        }
        if (dVar.p(serialDescriptor, 3) || combinedCovCertificateLocal.f8609d) {
            dVar.B(serialDescriptor, 3, combinedCovCertificateLocal.f8609d);
        }
        if (dVar.p(serialDescriptor, 4) || combinedCovCertificateLocal.f8610e) {
            dVar.B(serialDescriptor, 4, combinedCovCertificateLocal.f8610e);
        }
        if (dVar.p(serialDescriptor, 5) || combinedCovCertificateLocal.f8611f) {
            dVar.B(serialDescriptor, 5, combinedCovCertificateLocal.f8611f);
        }
        if (dVar.p(serialDescriptor, 6) || !t.a(combinedCovCertificateLocal.f8612g, new ArrayList())) {
            dVar.t(serialDescriptor, 6, new kf.f(k1.f15181a), combinedCovCertificateLocal.f8612g);
        }
        if (dVar.p(serialDescriptor, 7) || combinedCovCertificateLocal.f8613h) {
            dVar.B(serialDescriptor, 7, combinedCovCertificateLocal.f8613h);
        }
        if (dVar.p(serialDescriptor, 8) || combinedCovCertificateLocal.f8614i) {
            dVar.B(serialDescriptor, 8, combinedCovCertificateLocal.f8614i);
        }
        if (dVar.p(serialDescriptor, 9) || combinedCovCertificateLocal.f8615j) {
            dVar.B(serialDescriptor, 9, combinedCovCertificateLocal.f8615j);
        }
        if (dVar.p(serialDescriptor, 10) || combinedCovCertificateLocal.f8616k) {
            dVar.B(serialDescriptor, 10, combinedCovCertificateLocal.f8616k);
        }
        if (dVar.p(serialDescriptor, 11) || combinedCovCertificateLocal.f8617l) {
            dVar.B(serialDescriptor, 11, combinedCovCertificateLocal.f8617l);
        }
        if (dVar.p(serialDescriptor, 12) || combinedCovCertificateLocal.f8618m != h.None) {
            dVar.t(serialDescriptor, 12, new s("de.rki.covpass.sdk.cert.models.ReissueState", h.values()), combinedCovCertificateLocal.f8618m);
        }
        if (dVar.p(serialDescriptor, 13) || combinedCovCertificateLocal.f8619n != i.None) {
            z10 = true;
        }
        if (z10) {
            dVar.t(serialDescriptor, 13, new s("de.rki.covpass.sdk.cert.models.ReissueType", i.values()), combinedCovCertificateLocal.f8619n);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CombinedCovCertificateLocal)) {
            return false;
        }
        CombinedCovCertificateLocal combinedCovCertificateLocal = (CombinedCovCertificateLocal) obj;
        return t.a(this.f8606a, combinedCovCertificateLocal.f8606a) && t.a(this.f8607b, combinedCovCertificateLocal.f8607b) && this.f8608c == combinedCovCertificateLocal.f8608c && this.f8609d == combinedCovCertificateLocal.f8609d && this.f8610e == combinedCovCertificateLocal.f8610e && this.f8611f == combinedCovCertificateLocal.f8611f && t.a(this.f8612g, combinedCovCertificateLocal.f8612g) && this.f8613h == combinedCovCertificateLocal.f8613h && this.f8614i == combinedCovCertificateLocal.f8614i && this.f8615j == combinedCovCertificateLocal.f8615j && this.f8616k == combinedCovCertificateLocal.f8616k && this.f8617l == combinedCovCertificateLocal.f8617l && this.f8618m == combinedCovCertificateLocal.f8618m && this.f8619n == combinedCovCertificateLocal.f8619n;
    }

    public int hashCode() {
        int hashCode = ((((this.f8606a.hashCode() * 31) + this.f8607b.hashCode()) * 31) + d.a(this.f8608c)) * 31;
        boolean z10 = this.f8609d;
        int i10 = 1;
        if (z10) {
            z10 = true;
        }
        int i11 = z10 ? 1 : 0;
        int i12 = z10 ? 1 : 0;
        int i13 = (hashCode + i11) * 31;
        boolean z11 = this.f8610e;
        if (z11) {
            z11 = true;
        }
        int i14 = z11 ? 1 : 0;
        int i15 = z11 ? 1 : 0;
        int i16 = (i13 + i14) * 31;
        boolean z12 = this.f8611f;
        if (z12) {
            z12 = true;
        }
        int i17 = z12 ? 1 : 0;
        int i18 = z12 ? 1 : 0;
        int hashCode2 = (((i16 + i17) * 31) + this.f8612g.hashCode()) * 31;
        boolean z13 = this.f8613h;
        if (z13) {
            z13 = true;
        }
        int i19 = z13 ? 1 : 0;
        int i20 = z13 ? 1 : 0;
        int i21 = (hashCode2 + i19) * 31;
        boolean z14 = this.f8614i;
        if (z14) {
            z14 = true;
        }
        int i22 = z14 ? 1 : 0;
        int i23 = z14 ? 1 : 0;
        int i24 = (i21 + i22) * 31;
        boolean z15 = this.f8615j;
        if (z15) {
            z15 = true;
        }
        int i25 = z15 ? 1 : 0;
        int i26 = z15 ? 1 : 0;
        int i27 = (i24 + i25) * 31;
        boolean z16 = this.f8616k;
        if (z16) {
            z16 = true;
        }
        int i28 = z16 ? 1 : 0;
        int i29 = z16 ? 1 : 0;
        int i30 = (i27 + i28) * 31;
        boolean z17 = this.f8617l;
        if (!z17) {
            i10 = z17 ? 1 : 0;
        }
        return ((((i30 + i10) * 31) + this.f8618m.hashCode()) * 31) + this.f8619n.hashCode();
    }

    public String toString() {
        CovCertificate covCertificate = this.f8606a;
        String str = this.f8607b;
        long j10 = this.f8608c;
        boolean z10 = this.f8609d;
        boolean z11 = this.f8610e;
        boolean z12 = this.f8611f;
        List<String> list = this.f8612g;
        boolean z13 = this.f8613h;
        boolean z14 = this.f8614i;
        boolean z15 = this.f8615j;
        boolean z16 = this.f8616k;
        boolean z17 = this.f8617l;
        h hVar = this.f8618m;
        i iVar = this.f8619n;
        return "CombinedCovCertificateLocal(covCertificate=" + covCertificate + ", qrContent=" + str + ", timestamp=" + j10 + ", hasSeenBoosterNotification=" + z10 + ", hasSeenBoosterDetailNotification=" + z11 + ", hasSeenExpiryNotification=" + z12 + ", boosterNotificationRuleIds=" + list + ", hasSeenReissueNotification=" + z13 + ", hasSeenExpiredReissueNotification=" + z14 + ", hasSeenReissueDetailNotification=" + z15 + ", hasSeenRevokedNotification=" + z16 + ", isRevoked=" + z17 + ", reissueState=" + hVar + ", reissueType=" + iVar + ")";
    }
}
