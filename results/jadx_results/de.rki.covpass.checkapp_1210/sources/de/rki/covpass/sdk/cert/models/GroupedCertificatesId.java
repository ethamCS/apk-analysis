package de.rki.covpass.sdk.cert.models;

import hc.t;
import java.io.Serializable;
import kf.h1;
import kf.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 !2\u00020\u0001:\u0002\"!B/\b\u0017\u0012\u0006\u0010\u001c\u001a\u00020\u000b\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b\u001f\u0010 J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006#"}, d2 = {"Lde/rki/covpass/sdk/cert/models/GroupedCertificatesId;", "Ljava/io/Serializable;", "self", "Ljf/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ltb/e0;", "b", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "Lde/rki/covpass/sdk/cert/models/Name;", "c", "Lde/rki/covpass/sdk/cert/models/Name;", "getName", "()Lde/rki/covpass/sdk/cert/models/Name;", "name", "d", "Ljava/lang/String;", "getBirthDate", "()Ljava/lang/String;", "birthDate", "seen1", "Lkf/h1;", "serializationConstructorMarker", "<init>", "(ILde/rki/covpass/sdk/cert/models/Name;Ljava/lang/String;Lkf/h1;)V", "Companion", "$serializer", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
@kotlinx.serialization.h
/* loaded from: classes.dex */
public final class GroupedCertificatesId implements Serializable {
    public static final Companion Companion = new Companion(null);

    /* renamed from: c */
    private final Name f8675c;

    /* renamed from: d */
    private final String f8676d;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lde/rki/covpass/sdk/cert/models/GroupedCertificatesId$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lde/rki/covpass/sdk/cert/models/GroupedCertificatesId;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<GroupedCertificatesId> serializer() {
            return GroupedCertificatesId$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ GroupedCertificatesId(int i10, Name name, String str, h1 h1Var) {
        if (3 != (i10 & 3)) {
            w0.a(i10, 3, GroupedCertificatesId$$serializer.INSTANCE.getDescriptor());
        }
        this.f8675c = name;
        this.f8676d = str;
    }

    @fc.c
    public static final void b(GroupedCertificatesId groupedCertificatesId, jf.d dVar, SerialDescriptor serialDescriptor) {
        t.e(groupedCertificatesId, "self");
        t.e(dVar, "output");
        t.e(serialDescriptor, "serialDesc");
        dVar.t(serialDescriptor, 0, Name$$serializer.INSTANCE, groupedCertificatesId.f8675c);
        dVar.E(serialDescriptor, 1, groupedCertificatesId.f8676d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupedCertificatesId)) {
            return false;
        }
        GroupedCertificatesId groupedCertificatesId = (GroupedCertificatesId) obj;
        return t.a(this.f8675c, groupedCertificatesId.f8675c) && t.a(this.f8676d, groupedCertificatesId.f8676d);
    }

    public int hashCode() {
        return (this.f8675c.hashCode() * 31) + this.f8676d.hashCode();
    }

    public String toString() {
        Name name = this.f8675c;
        String str = this.f8676d;
        return "GroupedCertificatesId(name=" + name + ", birthDate=" + str + ")";
    }
}
