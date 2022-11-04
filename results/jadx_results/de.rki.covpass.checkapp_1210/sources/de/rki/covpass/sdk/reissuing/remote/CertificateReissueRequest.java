package de.rki.covpass.sdk.reissuing.remote;

import fc.c;
import hc.t;
import java.util.List;
import jf.d;
import kf.f;
import kf.h1;
import kf.k1;
import kf.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.h;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u001fB5\b\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0014\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006!"}, d2 = {"Lde/rki/covpass/sdk/reissuing/remote/CertificateReissueRequest;", BuildConfig.FLAVOR, "self", "Ljf/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ltb/e0;", "a", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "Ljava/lang/String;", "getAction", "()Ljava/lang/String;", "action", BuildConfig.FLAVOR, "b", "Ljava/util/List;", "getCertificates", "()Ljava/util/List;", "certificates", "seen1", "Lkf/h1;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/util/List;Lkf/h1;)V", "Companion", "$serializer", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
@h
/* loaded from: classes.dex */
public final class CertificateReissueRequest {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f8740a;

    /* renamed from: b */
    private final List<String> f8741b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lde/rki/covpass/sdk/reissuing/remote/CertificateReissueRequest$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lde/rki/covpass/sdk/reissuing/remote/CertificateReissueRequest;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CertificateReissueRequest> serializer() {
            return CertificateReissueRequest$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CertificateReissueRequest(int i10, String str, List list, h1 h1Var) {
        if (3 != (i10 & 3)) {
            w0.a(i10, 3, CertificateReissueRequest$$serializer.INSTANCE.getDescriptor());
        }
        this.f8740a = str;
        this.f8741b = list;
    }

    @c
    public static final void a(CertificateReissueRequest certificateReissueRequest, d dVar, SerialDescriptor serialDescriptor) {
        t.e(certificateReissueRequest, "self");
        t.e(dVar, "output");
        t.e(serialDescriptor, "serialDesc");
        dVar.E(serialDescriptor, 0, certificateReissueRequest.f8740a);
        dVar.t(serialDescriptor, 1, new f(k1.f15181a), certificateReissueRequest.f8741b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CertificateReissueRequest)) {
            return false;
        }
        CertificateReissueRequest certificateReissueRequest = (CertificateReissueRequest) obj;
        return t.a(this.f8740a, certificateReissueRequest.f8740a) && t.a(this.f8741b, certificateReissueRequest.f8741b);
    }

    public int hashCode() {
        return (this.f8740a.hashCode() * 31) + this.f8741b.hashCode();
    }

    public String toString() {
        String str = this.f8740a;
        List<String> list = this.f8741b;
        return "CertificateReissueRequest(action=" + str + ", certificates=" + list + ")";
    }
}
