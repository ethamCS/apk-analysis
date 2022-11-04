package de.rki.covpass.sdk.rules.remote.valuesets;

import fc.c;
import hc.k0;
import hc.t;
import j$.time.LocalDate;
import jf.d;
import kf.h1;
import kf.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.h;
import kotlinx.serialization.json.JsonElement;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002&%B;\b\u0017\u0012\u0006\u0010 \u001a\u00020\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R \u0010\u001a\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0016\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0010\u0010\u0017R\u0017\u0010\u001f\u001a\u00020\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006'"}, d2 = {"Lde/rki/covpass/sdk/rules/remote/valuesets/CovPassValueSetRemote;", BuildConfig.FLAVOR, "self", "Ljf/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ltb/e0;", "d", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "valueSetId", "j$/time/LocalDate", "Lj$/time/LocalDate;", "()Lj$/time/LocalDate;", "getValueSetDate$annotations", "()V", "valueSetDate", "Lkotlinx/serialization/json/JsonElement;", "c", "Lkotlinx/serialization/json/JsonElement;", "()Lkotlinx/serialization/json/JsonElement;", "valueSetValues", "seen1", "Lkf/h1;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lj$/time/LocalDate;Lkotlinx/serialization/json/JsonElement;Lkf/h1;)V", "Companion", "$serializer", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
@h
/* loaded from: classes.dex */
public final class CovPassValueSetRemote {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f8810a;

    /* renamed from: b */
    private final LocalDate f8811b;

    /* renamed from: c */
    private final JsonElement f8812c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lde/rki/covpass/sdk/rules/remote/valuesets/CovPassValueSetRemote$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lde/rki/covpass/sdk/rules/remote/valuesets/CovPassValueSetRemote;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CovPassValueSetRemote> serializer() {
            return CovPassValueSetRemote$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CovPassValueSetRemote(int i10, String str, LocalDate localDate, JsonElement jsonElement, h1 h1Var) {
        if (7 != (i10 & 7)) {
            w0.a(i10, 7, CovPassValueSetRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f8810a = str;
        this.f8811b = localDate;
        this.f8812c = jsonElement;
    }

    @c
    public static final void d(CovPassValueSetRemote covPassValueSetRemote, d dVar, SerialDescriptor serialDescriptor) {
        t.e(covPassValueSetRemote, "self");
        t.e(dVar, "output");
        t.e(serialDescriptor, "serialDesc");
        dVar.E(serialDescriptor, 0, covPassValueSetRemote.f8810a);
        dVar.t(serialDescriptor, 1, new ContextualSerializer(k0.b(LocalDate.class), null, new KSerializer[0]), covPassValueSetRemote.f8811b);
        dVar.t(serialDescriptor, 2, lf.h.f15995a, covPassValueSetRemote.f8812c);
    }

    public final LocalDate a() {
        return this.f8811b;
    }

    public final String b() {
        return this.f8810a;
    }

    public final JsonElement c() {
        return this.f8812c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CovPassValueSetRemote)) {
            return false;
        }
        CovPassValueSetRemote covPassValueSetRemote = (CovPassValueSetRemote) obj;
        return t.a(this.f8810a, covPassValueSetRemote.f8810a) && t.a(this.f8811b, covPassValueSetRemote.f8811b) && t.a(this.f8812c, covPassValueSetRemote.f8812c);
    }

    public int hashCode() {
        return (((this.f8810a.hashCode() * 31) + this.f8811b.hashCode()) * 31) + this.f8812c.hashCode();
    }

    public String toString() {
        String str = this.f8810a;
        LocalDate localDate = this.f8811b;
        JsonElement jsonElement = this.f8812c;
        return "CovPassValueSetRemote(valueSetId=" + str + ", valueSetDate=" + localDate + ", valueSetValues=" + jsonElement + ")";
    }
}
