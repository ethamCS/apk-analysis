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
@Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u0002<;BS\u0012\b\b\u0002\u0010\u0017\u001a\u00020\t\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010(\u001a\u00020\t\u0012\b\b\u0002\u0010,\u001a\u00020\t\u0012\b\b\u0002\u00100\u001a\u00020\t¢\u0006\u0004\b5\u00106Bo\b\u0017\u0012\u0006\u00107\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001d\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010$\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010,\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u00100\u001a\u0004\u0018\u00010\t\u0012\b\u00109\u001a\u0004\u0018\u000108¢\u0006\u0004\b5\u0010:J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R \u0010\u0017\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u001d\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u0019\u0010\u001bR\"\u0010 \u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u001a\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b\u001e\u0010\u001bR\"\u0010$\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b!\u0010\u001a\u0012\u0004\b#\u0010\u0016\u001a\u0004\b\"\u0010\u001bR \u0010(\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010\u0012\u0012\u0004\b'\u0010\u0016\u001a\u0004\b&\u0010\u0014R \u0010,\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b)\u0010\u0012\u0012\u0004\b+\u0010\u0016\u001a\u0004\b*\u0010\u0014R \u00100\u001a\u00020\t8\u0016X\u0097\u0004¢\u0006\u0012\n\u0004\b-\u0010\u0012\u0012\u0004\b/\u0010\u0016\u001a\u0004\b.\u0010\u0014R\u0014\u00104\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u0006="}, d2 = {"Lde/rki/covpass/sdk/cert/models/Recovery;", "Lde/rki/covpass/sdk/cert/models/e;", "self", "Ljf/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ltb/e0;", "c", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "a", "Ljava/lang/String;", "getTargetDisease", "()Ljava/lang/String;", "getTargetDisease$annotations", "()V", "targetDisease", "j$/time/LocalDate", "b", "Lj$/time/LocalDate;", "()Lj$/time/LocalDate;", "getFirstResult$annotations", "firstResult", "getValidFrom", "getValidFrom$annotations", "validFrom", "d", "getValidUntil", "getValidUntil$annotations", "validUntil", "e", "getCountry", "getCountry$annotations", "country", "f", "getCertificateIssuer", "getCertificateIssuer$annotations", "certificateIssuer", "g", "getId", "getId$annotations", "id", "Lde/rki/covpass/sdk/cert/models/f;", "getType", "()Lde/rki/covpass/sdk/cert/models/f;", "type", "<init>", "(Ljava/lang/String;Lj$/time/LocalDate;Lj$/time/LocalDate;Lj$/time/LocalDate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkf/h1;", "serializationConstructorMarker", "(ILjava/lang/String;Lj$/time/LocalDate;Lj$/time/LocalDate;Lj$/time/LocalDate;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkf/h1;)V", "Companion", "$serializer", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
@kotlinx.serialization.h
/* loaded from: classes.dex */
public final class Recovery implements e {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f8681a;

    /* renamed from: b */
    private final LocalDate f8682b;

    /* renamed from: c */
    private final LocalDate f8683c;

    /* renamed from: d */
    private final LocalDate f8684d;

    /* renamed from: e */
    private final String f8685e;

    /* renamed from: f */
    private final String f8686f;

    /* renamed from: g */
    private final String f8687g;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lde/rki/covpass/sdk/cert/models/Recovery$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lde/rki/covpass/sdk/cert/models/Recovery;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Recovery> serializer() {
            return Recovery$$serializer.INSTANCE;
        }
    }

    public Recovery() {
        this((String) null, (LocalDate) null, (LocalDate) null, (LocalDate) null, (String) null, (String) null, (String) null, 127, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ Recovery(int i10, String str, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, String str2, String str3, String str4, h1 h1Var) {
        if ((i10 & 0) != 0) {
            w0.a(i10, 0, Recovery$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.f8681a = BuildConfig.FLAVOR;
        } else {
            this.f8681a = str;
        }
        if ((i10 & 2) == 0) {
            this.f8682b = null;
        } else {
            this.f8682b = localDate;
        }
        if ((i10 & 4) == 0) {
            this.f8683c = null;
        } else {
            this.f8683c = localDate2;
        }
        if ((i10 & 8) == 0) {
            this.f8684d = null;
        } else {
            this.f8684d = localDate3;
        }
        if ((i10 & 16) == 0) {
            this.f8685e = BuildConfig.FLAVOR;
        } else {
            this.f8685e = str2;
        }
        if ((i10 & 32) == 0) {
            this.f8686f = BuildConfig.FLAVOR;
        } else {
            this.f8686f = str3;
        }
        if ((i10 & 64) == 0) {
            this.f8687g = BuildConfig.FLAVOR;
        } else {
            this.f8687g = str4;
        }
    }

    public Recovery(String str, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, String str2, String str3, String str4) {
        t.e(str, "targetDisease");
        t.e(str2, "country");
        t.e(str3, "certificateIssuer");
        t.e(str4, "id");
        this.f8681a = str;
        this.f8682b = localDate;
        this.f8683c = localDate2;
        this.f8684d = localDate3;
        this.f8685e = str2;
        this.f8686f = str3;
        this.f8687g = str4;
    }

    public /* synthetic */ Recovery(String str, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? BuildConfig.FLAVOR : str, (i10 & 2) != 0 ? null : localDate, (i10 & 4) != 0 ? null : localDate2, (i10 & 8) == 0 ? localDate3 : null, (i10 & 16) != 0 ? BuildConfig.FLAVOR : str2, (i10 & 32) != 0 ? BuildConfig.FLAVOR : str3, (i10 & 64) != 0 ? BuildConfig.FLAVOR : str4);
    }

    @fc.c
    public static final void c(Recovery recovery, jf.d dVar, SerialDescriptor serialDescriptor) {
        t.e(recovery, "self");
        t.e(dVar, "output");
        t.e(serialDescriptor, "serialDesc");
        boolean z10 = false;
        if (dVar.p(serialDescriptor, 0) || !t.a(recovery.f8681a, BuildConfig.FLAVOR)) {
            dVar.E(serialDescriptor, 0, recovery.f8681a);
        }
        if (dVar.p(serialDescriptor, 1) || recovery.f8682b != null) {
            dVar.m(serialDescriptor, 1, new ContextualSerializer(k0.b(LocalDate.class), null, new KSerializer[0]), recovery.f8682b);
        }
        if (dVar.p(serialDescriptor, 2) || recovery.f8683c != null) {
            dVar.m(serialDescriptor, 2, new ContextualSerializer(k0.b(LocalDate.class), null, new KSerializer[0]), recovery.f8683c);
        }
        if (dVar.p(serialDescriptor, 3) || recovery.f8684d != null) {
            dVar.m(serialDescriptor, 3, new ContextualSerializer(k0.b(LocalDate.class), null, new KSerializer[0]), recovery.f8684d);
        }
        if (dVar.p(serialDescriptor, 4) || !t.a(recovery.f8685e, BuildConfig.FLAVOR)) {
            dVar.E(serialDescriptor, 4, recovery.f8685e);
        }
        if (dVar.p(serialDescriptor, 5) || !t.a(recovery.f8686f, BuildConfig.FLAVOR)) {
            dVar.E(serialDescriptor, 5, recovery.f8686f);
        }
        if (dVar.p(serialDescriptor, 6) || !t.a(recovery.getId(), BuildConfig.FLAVOR)) {
            z10 = true;
        }
        if (z10) {
            dVar.E(serialDescriptor, 6, recovery.getId());
        }
    }

    @Override // de.rki.covpass.sdk.cert.models.e
    public String a() {
        return e.a.a(this);
    }

    public final LocalDate b() {
        return this.f8682b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Recovery)) {
            return false;
        }
        Recovery recovery = (Recovery) obj;
        return t.a(this.f8681a, recovery.f8681a) && t.a(this.f8682b, recovery.f8682b) && t.a(this.f8683c, recovery.f8683c) && t.a(this.f8684d, recovery.f8684d) && t.a(this.f8685e, recovery.f8685e) && t.a(this.f8686f, recovery.f8686f) && t.a(getId(), recovery.getId());
    }

    @Override // de.rki.covpass.sdk.cert.models.e
    public String getId() {
        return this.f8687g;
    }

    @Override // de.rki.covpass.sdk.cert.models.e
    public f getType() {
        return g.RECOVERY;
    }

    public int hashCode() {
        int hashCode = this.f8681a.hashCode() * 31;
        LocalDate localDate = this.f8682b;
        int i10 = 0;
        int hashCode2 = (hashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        LocalDate localDate2 = this.f8683c;
        int hashCode3 = (hashCode2 + (localDate2 == null ? 0 : localDate2.hashCode())) * 31;
        LocalDate localDate3 = this.f8684d;
        if (localDate3 != null) {
            i10 = localDate3.hashCode();
        }
        return ((((((hashCode3 + i10) * 31) + this.f8685e.hashCode()) * 31) + this.f8686f.hashCode()) * 31) + getId().hashCode();
    }

    public String toString() {
        String str = this.f8681a;
        LocalDate localDate = this.f8682b;
        LocalDate localDate2 = this.f8683c;
        LocalDate localDate3 = this.f8684d;
        String str2 = this.f8685e;
        String str3 = this.f8686f;
        String id2 = getId();
        return "Recovery(targetDisease=" + str + ", firstResult=" + localDate + ", validFrom=" + localDate2 + ", validUntil=" + localDate3 + ", country=" + str2 + ", certificateIssuer=" + str3 + ", id=" + id2 + ")";
    }
}
