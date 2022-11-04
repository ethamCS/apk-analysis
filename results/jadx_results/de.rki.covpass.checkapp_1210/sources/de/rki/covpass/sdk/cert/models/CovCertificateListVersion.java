package de.rki.covpass.sdk.cert.models;

import hc.t;
import kf.h1;
import kf.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001b\u001aB\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015B#\b\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0014\u0010\u0019J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0013\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001c"}, d2 = {"Lde/rki/covpass/sdk/cert/models/CovCertificateListVersion;", BuildConfig.FLAVOR, "self", "Ljf/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ltb/e0;", "a", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "I", "getDataModelVersion", "()I", "dataModelVersion", "<init>", "(I)V", "seen1", "Lkf/h1;", "serializationConstructorMarker", "(IILkf/h1;)V", "Companion", "$serializer", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
@kotlinx.serialization.h
/* loaded from: classes.dex */
public final class CovCertificateListVersion {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final int f8655a;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lde/rki/covpass/sdk/cert/models/CovCertificateListVersion$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lde/rki/covpass/sdk/cert/models/CovCertificateListVersion;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CovCertificateListVersion> serializer() {
            return CovCertificateListVersion$$serializer.INSTANCE;
        }
    }

    public CovCertificateListVersion() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public CovCertificateListVersion(int i10) {
        this.f8655a = i10;
    }

    public /* synthetic */ CovCertificateListVersion(int i10, int i11, h1 h1Var) {
        if ((i10 & 0) != 0) {
            w0.a(i10, 0, CovCertificateListVersion$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.f8655a = 1;
        } else {
            this.f8655a = i11;
        }
    }

    public /* synthetic */ CovCertificateListVersion(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 1 : i10);
    }

    @fc.c
    public static final void a(CovCertificateListVersion covCertificateListVersion, jf.d dVar, SerialDescriptor serialDescriptor) {
        t.e(covCertificateListVersion, "self");
        t.e(dVar, "output");
        t.e(serialDescriptor, "serialDesc");
        boolean z10 = true;
        if (!dVar.p(serialDescriptor, 0) && covCertificateListVersion.f8655a == 1) {
            z10 = false;
        }
        if (z10) {
            dVar.z(serialDescriptor, 0, covCertificateListVersion.f8655a);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof CovCertificateListVersion) && this.f8655a == ((CovCertificateListVersion) obj).f8655a;
    }

    public int hashCode() {
        return this.f8655a;
    }

    public String toString() {
        int i10 = this.f8655a;
        return "CovCertificateListVersion(dataModelVersion=" + i10 + ")";
    }
}
