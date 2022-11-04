package de.rki.covpass.sdk.cert.models;

import hc.t;
import java.util.List;
import kf.h1;
import kf.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.conscrypt.BuildConfig;
import ub.u;
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 )2\u00020\u0001:\u0002*)B-\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\"\u001a\u00020\u000b¢\u0006\u0004\b#\u0010$B=\b\u0017\u0012\u0006\u0010%\u001a\u00020\u000b\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010\u0012\b\u0010\u001d\u001a\u0004\u0018\u00010\u0016\u0012\u0006\u0010\"\u001a\u00020\u000b\u0012\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b#\u0010(J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001d\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b\b\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R$\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0017\u0010\"\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006+"}, d2 = {"Lde/rki/covpass/sdk/cert/models/CovCertificateList;", BuildConfig.FLAVOR, "self", "Ljf/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ltb/e0;", "a", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "Lde/rki/covpass/sdk/cert/models/CombinedCovCertificateLocal;", "Ljava/util/List;", "getCertificates", "()Ljava/util/List;", "certificates", "Lde/rki/covpass/sdk/cert/models/GroupedCertificatesId;", "b", "Lde/rki/covpass/sdk/cert/models/GroupedCertificatesId;", "getFavoriteCertId", "()Lde/rki/covpass/sdk/cert/models/GroupedCertificatesId;", "setFavoriteCertId", "(Lde/rki/covpass/sdk/cert/models/GroupedCertificatesId;)V", "favoriteCertId", "c", "I", "getDataModelVersion", "()I", "dataModelVersion", "<init>", "(Ljava/util/List;Lde/rki/covpass/sdk/cert/models/GroupedCertificatesId;I)V", "seen1", "Lkf/h1;", "serializationConstructorMarker", "(ILjava/util/List;Lde/rki/covpass/sdk/cert/models/GroupedCertificatesId;ILkf/h1;)V", "Companion", "$serializer", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
@kotlinx.serialization.h
/* loaded from: classes.dex */
public final class CovCertificateList {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final List<CombinedCovCertificateLocal> f8652a;

    /* renamed from: b */
    private GroupedCertificatesId f8653b;

    /* renamed from: c */
    private final int f8654c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lde/rki/covpass/sdk/cert/models/CovCertificateList$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lde/rki/covpass/sdk/cert/models/CovCertificateList;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CovCertificateList> serializer() {
            return CovCertificateList$$serializer.INSTANCE;
        }
    }

    public CovCertificateList() {
        this((List) null, (GroupedCertificatesId) null, 0, 7, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ CovCertificateList(int i10, List list, GroupedCertificatesId groupedCertificatesId, int i11, h1 h1Var) {
        if ((i10 & 0) != 0) {
            w0.a(i10, 0, CovCertificateList$$serializer.INSTANCE.getDescriptor());
        }
        this.f8652a = (i10 & 1) == 0 ? u.h() : list;
        if ((i10 & 2) == 0) {
            this.f8653b = null;
        } else {
            this.f8653b = groupedCertificatesId;
        }
        if ((i10 & 4) == 0) {
            this.f8654c = 2;
        } else {
            this.f8654c = i11;
        }
    }

    public CovCertificateList(List<CombinedCovCertificateLocal> list, GroupedCertificatesId groupedCertificatesId, int i10) {
        t.e(list, "certificates");
        this.f8652a = list;
        this.f8653b = groupedCertificatesId;
        this.f8654c = i10;
    }

    public /* synthetic */ CovCertificateList(List list, GroupedCertificatesId groupedCertificatesId, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? u.h() : list, (i11 & 2) != 0 ? null : groupedCertificatesId, (i11 & 4) != 0 ? 2 : i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @fc.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(de.rki.covpass.sdk.cert.models.CovCertificateList r4, jf.d r5, kotlinx.serialization.descriptors.SerialDescriptor r6) {
        /*
            java.lang.String r0 = "self"
            hc.t.e(r4, r0)
            java.lang.String r0 = "output"
            hc.t.e(r5, r0)
            java.lang.String r0 = "serialDesc"
            hc.t.e(r6, r0)
            r0 = 0
            boolean r1 = r5.p(r6, r0)
            r2 = 1
            if (r1 == 0) goto L19
        L17:
            r1 = r2
            goto L27
        L19:
            java.util.List<de.rki.covpass.sdk.cert.models.CombinedCovCertificateLocal> r1 = r4.f8652a
            java.util.List r3 = ub.s.h()
            boolean r1 = hc.t.a(r1, r3)
            if (r1 != 0) goto L26
            goto L17
        L26:
            r1 = r0
        L27:
            if (r1 == 0) goto L35
            kf.f r1 = new kf.f
            de.rki.covpass.sdk.cert.models.CombinedCovCertificateLocal$$serializer r3 = de.rki.covpass.sdk.cert.models.CombinedCovCertificateLocal$$serializer.INSTANCE
            r1.<init>(r3)
            java.util.List<de.rki.covpass.sdk.cert.models.CombinedCovCertificateLocal> r3 = r4.f8652a
            r5.t(r6, r0, r1, r3)
        L35:
            boolean r1 = r5.p(r6, r2)
            if (r1 == 0) goto L3d
        L3b:
            r1 = r2
            goto L43
        L3d:
            de.rki.covpass.sdk.cert.models.GroupedCertificatesId r1 = r4.f8653b
            if (r1 == 0) goto L42
            goto L3b
        L42:
            r1 = r0
        L43:
            if (r1 == 0) goto L4c
            de.rki.covpass.sdk.cert.models.GroupedCertificatesId$$serializer r1 = de.rki.covpass.sdk.cert.models.GroupedCertificatesId$$serializer.INSTANCE
            de.rki.covpass.sdk.cert.models.GroupedCertificatesId r3 = r4.f8653b
            r5.m(r6, r2, r1, r3)
        L4c:
            r1 = 2
            boolean r3 = r5.p(r6, r1)
            if (r3 == 0) goto L55
        L53:
            r0 = r2
            goto L5a
        L55:
            int r3 = r4.f8654c
            if (r3 == r1) goto L5a
            goto L53
        L5a:
            if (r0 == 0) goto L61
            int r4 = r4.f8654c
            r5.z(r6, r1, r4)
        L61:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.rki.covpass.sdk.cert.models.CovCertificateList.a(de.rki.covpass.sdk.cert.models.CovCertificateList, jf.d, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CovCertificateList)) {
            return false;
        }
        CovCertificateList covCertificateList = (CovCertificateList) obj;
        return t.a(this.f8652a, covCertificateList.f8652a) && t.a(this.f8653b, covCertificateList.f8653b) && this.f8654c == covCertificateList.f8654c;
    }

    public int hashCode() {
        int hashCode = this.f8652a.hashCode() * 31;
        GroupedCertificatesId groupedCertificatesId = this.f8653b;
        return ((hashCode + (groupedCertificatesId == null ? 0 : groupedCertificatesId.hashCode())) * 31) + this.f8654c;
    }

    public String toString() {
        List<CombinedCovCertificateLocal> list = this.f8652a;
        GroupedCertificatesId groupedCertificatesId = this.f8653b;
        int i10 = this.f8654c;
        return "CovCertificateList(certificates=" + list + ", favoriteCertId=" + groupedCertificatesId + ", dataModelVersion=" + i10 + ")";
    }
}
