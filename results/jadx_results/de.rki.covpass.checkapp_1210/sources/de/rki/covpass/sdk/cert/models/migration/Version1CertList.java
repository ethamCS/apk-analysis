package de.rki.covpass.sdk.cert.models.migration;

import de.rki.covpass.sdk.cert.models.CombinedCovCertificateLocal;
import de.rki.covpass.sdk.cert.models.CombinedCovCertificateLocal$$serializer;
import fc.c;
import hc.t;
import java.util.ArrayList;
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
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 #2\u00020\u0001:\u0002$#B#\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u001d\u0010\u001eB5\b\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u000b\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\b\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\u001d\u0010\"J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u001c\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006%"}, d2 = {"Lde/rki/covpass/sdk/cert/models/migration/Version1CertList;", BuildConfig.FLAVOR, "self", "Ljf/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ltb/e0;", "a", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "Lde/rki/covpass/sdk/cert/models/CombinedCovCertificateLocal;", "Ljava/util/List;", "getCertificates", "()Ljava/util/List;", "certificates", "b", "Ljava/lang/String;", "getFavoriteCertId", "()Ljava/lang/String;", "setFavoriteCertId", "(Ljava/lang/String;)V", "favoriteCertId", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "seen1", "Lkf/h1;", "serializationConstructorMarker", "(ILjava/util/List;Ljava/lang/String;Lkf/h1;)V", "Companion", "$serializer", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
@h
/* loaded from: classes.dex */
public final class Version1CertList {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final List<CombinedCovCertificateLocal> f8736a;

    /* renamed from: b */
    private String f8737b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lde/rki/covpass/sdk/cert/models/migration/Version1CertList$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lde/rki/covpass/sdk/cert/models/migration/Version1CertList;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Version1CertList> serializer() {
            return Version1CertList$$serializer.INSTANCE;
        }
    }

    public Version1CertList() {
        this((List) null, (String) null, 3, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ Version1CertList(int i10, List list, String str, h1 h1Var) {
        if ((i10 & 0) != 0) {
            w0.a(i10, 0, Version1CertList$$serializer.INSTANCE.getDescriptor());
        }
        this.f8736a = (i10 & 1) == 0 ? new ArrayList() : list;
        if ((i10 & 2) == 0) {
            this.f8737b = null;
        } else {
            this.f8737b = str;
        }
    }

    public Version1CertList(List<CombinedCovCertificateLocal> list, String str) {
        t.e(list, "certificates");
        this.f8736a = list;
        this.f8737b = str;
    }

    public /* synthetic */ Version1CertList(List list, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new ArrayList() : list, (i10 & 2) != 0 ? null : str);
    }

    @c
    public static final void a(Version1CertList version1CertList, d dVar, SerialDescriptor serialDescriptor) {
        t.e(version1CertList, "self");
        t.e(dVar, "output");
        t.e(serialDescriptor, "serialDesc");
        boolean z10 = false;
        if (dVar.p(serialDescriptor, 0) || !t.a(version1CertList.f8736a, new ArrayList())) {
            dVar.t(serialDescriptor, 0, new f(CombinedCovCertificateLocal$$serializer.INSTANCE), version1CertList.f8736a);
        }
        if (dVar.p(serialDescriptor, 1) || version1CertList.f8737b != null) {
            z10 = true;
        }
        if (z10) {
            dVar.m(serialDescriptor, 1, k1.f15181a, version1CertList.f8737b);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Version1CertList)) {
            return false;
        }
        Version1CertList version1CertList = (Version1CertList) obj;
        return t.a(this.f8736a, version1CertList.f8736a) && t.a(this.f8737b, version1CertList.f8737b);
    }

    public int hashCode() {
        int hashCode = this.f8736a.hashCode() * 31;
        String str = this.f8737b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        List<CombinedCovCertificateLocal> list = this.f8736a;
        String str = this.f8737b;
        return "Version1CertList(certificates=" + list + ", favoriteCertId=" + str + ")";
    }
}
