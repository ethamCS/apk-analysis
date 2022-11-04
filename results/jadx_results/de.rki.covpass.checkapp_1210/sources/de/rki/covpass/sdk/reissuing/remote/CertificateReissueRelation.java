package de.rki.covpass.sdk.reissuing.remote;

import fc.c;
import hc.t;
import jf.d;
import kf.h1;
import kf.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.h;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001eB-\b\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0013\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006 "}, d2 = {"Lde/rki/covpass/sdk/reissuing/remote/CertificateReissueRelation;", BuildConfig.FLAVOR, "self", "Ljf/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ltb/e0;", "a", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "I", "getIndex", "()I", "index", "b", "Ljava/lang/String;", "getAction", "()Ljava/lang/String;", "action", "seen1", "Lkf/h1;", "serializationConstructorMarker", "<init>", "(IILjava/lang/String;Lkf/h1;)V", "Companion", "$serializer", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
@h
/* loaded from: classes.dex */
public final class CertificateReissueRelation {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final int f8738a;

    /* renamed from: b */
    private final String f8739b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lde/rki/covpass/sdk/reissuing/remote/CertificateReissueRelation$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lde/rki/covpass/sdk/reissuing/remote/CertificateReissueRelation;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CertificateReissueRelation> serializer() {
            return CertificateReissueRelation$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CertificateReissueRelation(int i10, int i11, String str, h1 h1Var) {
        if (3 != (i10 & 3)) {
            w0.a(i10, 3, CertificateReissueRelation$$serializer.INSTANCE.getDescriptor());
        }
        this.f8738a = i11;
        this.f8739b = str;
    }

    @c
    public static final void a(CertificateReissueRelation certificateReissueRelation, d dVar, SerialDescriptor serialDescriptor) {
        t.e(certificateReissueRelation, "self");
        t.e(dVar, "output");
        t.e(serialDescriptor, "serialDesc");
        dVar.z(serialDescriptor, 0, certificateReissueRelation.f8738a);
        dVar.E(serialDescriptor, 1, certificateReissueRelation.f8739b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CertificateReissueRelation)) {
            return false;
        }
        CertificateReissueRelation certificateReissueRelation = (CertificateReissueRelation) obj;
        return this.f8738a == certificateReissueRelation.f8738a && t.a(this.f8739b, certificateReissueRelation.f8739b);
    }

    public int hashCode() {
        return (this.f8738a * 31) + this.f8739b.hashCode();
    }

    public String toString() {
        int i10 = this.f8738a;
        String str = this.f8739b;
        return "CertificateReissueRelation(index=" + i10 + ", action=" + str + ")";
    }
}
