package de.rki.covpass.sdk.cert.models;

import hc.t;
import kf.h1;
import kf.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 (2\u00020\u0001:\u0002)(Ba\b\u0017\u0012\u0006\u0010#\u001a\u00020\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\b\u0010\"\u001a\u0004\u0018\u00010\t\u0012\b\u0010%\u001a\u0004\u0018\u00010$¢\u0006\u0004\b&\u0010'J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u0017\u0010\u0018\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0017\u0010\u0013R\u0017\u0010\u001c\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0011\u001a\u0004\b\u001b\u0010\u0013R\u0017\u0010\u001f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0011\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\"\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010\u0011\u001a\u0004\b!\u0010\u0013¨\u0006*"}, d2 = {"Lde/rki/covpass/sdk/cert/models/DscListEntry;", BuildConfig.FLAVOR, "self", "Ljf/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ltb/e0;", "d", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "a", "Ljava/lang/String;", "getCertificateType", "()Ljava/lang/String;", "certificateType", "b", "country", "c", "kid", "rawData", "e", "getSignature", "signature", "f", "getThumbprint", "thumbprint", "g", "getTimestamp", "timestamp", "seen1", "Lkf/h1;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkf/h1;)V", "Companion", "$serializer", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
@kotlinx.serialization.h
/* loaded from: classes.dex */
public final class DscListEntry {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f8658a;

    /* renamed from: b */
    private final String f8659b;

    /* renamed from: c */
    private final String f8660c;

    /* renamed from: d */
    private final String f8661d;

    /* renamed from: e */
    private final String f8662e;

    /* renamed from: f */
    private final String f8663f;

    /* renamed from: g */
    private final String f8664g;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lde/rki/covpass/sdk/cert/models/DscListEntry$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lde/rki/covpass/sdk/cert/models/DscListEntry;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<DscListEntry> serializer() {
            return DscListEntry$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ DscListEntry(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, h1 h1Var) {
        if (127 != (i10 & 127)) {
            w0.a(i10, 127, DscListEntry$$serializer.INSTANCE.getDescriptor());
        }
        this.f8658a = str;
        this.f8659b = str2;
        this.f8660c = str3;
        this.f8661d = str4;
        this.f8662e = str5;
        this.f8663f = str6;
        this.f8664g = str7;
    }

    @fc.c
    public static final void d(DscListEntry dscListEntry, jf.d dVar, SerialDescriptor serialDescriptor) {
        t.e(dscListEntry, "self");
        t.e(dVar, "output");
        t.e(serialDescriptor, "serialDesc");
        dVar.E(serialDescriptor, 0, dscListEntry.f8658a);
        dVar.E(serialDescriptor, 1, dscListEntry.f8659b);
        dVar.E(serialDescriptor, 2, dscListEntry.f8660c);
        dVar.E(serialDescriptor, 3, dscListEntry.f8661d);
        dVar.E(serialDescriptor, 4, dscListEntry.f8662e);
        dVar.E(serialDescriptor, 5, dscListEntry.f8663f);
        dVar.E(serialDescriptor, 6, dscListEntry.f8664g);
    }

    public final String a() {
        return this.f8659b;
    }

    public final String b() {
        return this.f8660c;
    }

    public final String c() {
        return this.f8661d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DscListEntry)) {
            return false;
        }
        DscListEntry dscListEntry = (DscListEntry) obj;
        return t.a(this.f8658a, dscListEntry.f8658a) && t.a(this.f8659b, dscListEntry.f8659b) && t.a(this.f8660c, dscListEntry.f8660c) && t.a(this.f8661d, dscListEntry.f8661d) && t.a(this.f8662e, dscListEntry.f8662e) && t.a(this.f8663f, dscListEntry.f8663f) && t.a(this.f8664g, dscListEntry.f8664g);
    }

    public int hashCode() {
        return (((((((((((this.f8658a.hashCode() * 31) + this.f8659b.hashCode()) * 31) + this.f8660c.hashCode()) * 31) + this.f8661d.hashCode()) * 31) + this.f8662e.hashCode()) * 31) + this.f8663f.hashCode()) * 31) + this.f8664g.hashCode();
    }

    public String toString() {
        String str = this.f8658a;
        String str2 = this.f8659b;
        String str3 = this.f8660c;
        String str4 = this.f8661d;
        String str5 = this.f8662e;
        String str6 = this.f8663f;
        String str7 = this.f8664g;
        return "DscListEntry(certificateType=" + str + ", country=" + str2 + ", kid=" + str3 + ", rawData=" + str4 + ", signature=" + str5 + ", thumbprint=" + str6 + ", timestamp=" + str7 + ")";
    }
}
