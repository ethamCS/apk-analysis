package de.rki.covpass.sdk.cert.models;

import hc.t;
import kf.h1;
import kf.s;
import kf.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'&B/\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t\u0012\b\b\u0002\u0010\u001c\u001a\u00020\t\u0012\b\b\u0002\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b \u0010!BC\b\u0017\u0012\u0006\u0010\"\u001a\u00020\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b \u0010%J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0014\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0019\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001c\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018R\u0017\u0010\u001f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u001e\u0010\u0018¨\u0006("}, d2 = {"Lde/rki/covpass/sdk/cert/models/BoosterNotification;", BuildConfig.FLAVOR, "self", "Ljf/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ltb/e0;", "a", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "Lde/rki/covpass/sdk/cert/models/a;", "Lde/rki/covpass/sdk/cert/models/a;", "getResult", "()Lde/rki/covpass/sdk/cert/models/a;", "result", "b", "Ljava/lang/String;", "getDescriptionEn", "()Ljava/lang/String;", "descriptionEn", "c", "getDescriptionDe", "descriptionDe", "d", "getRuleId", "ruleId", "<init>", "(Lde/rki/covpass/sdk/cert/models/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkf/h1;", "serializationConstructorMarker", "(ILde/rki/covpass/sdk/cert/models/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkf/h1;)V", "Companion", "$serializer", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
@kotlinx.serialization.h
/* loaded from: classes.dex */
public final class BoosterNotification {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final a f8602a;

    /* renamed from: b */
    private final String f8603b;

    /* renamed from: c */
    private final String f8604c;

    /* renamed from: d */
    private final String f8605d;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lde/rki/covpass/sdk/cert/models/BoosterNotification$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lde/rki/covpass/sdk/cert/models/BoosterNotification;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BoosterNotification> serializer() {
            return BoosterNotification$$serializer.INSTANCE;
        }
    }

    public BoosterNotification() {
        this((a) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ BoosterNotification(int i10, a aVar, String str, String str2, String str3, h1 h1Var) {
        if ((i10 & 0) != 0) {
            w0.a(i10, 0, BoosterNotification$$serializer.INSTANCE.getDescriptor());
        }
        this.f8602a = (i10 & 1) == 0 ? a.Failed : aVar;
        if ((i10 & 2) == 0) {
            this.f8603b = BuildConfig.FLAVOR;
        } else {
            this.f8603b = str;
        }
        if ((i10 & 4) == 0) {
            this.f8604c = BuildConfig.FLAVOR;
        } else {
            this.f8604c = str2;
        }
        if ((i10 & 8) == 0) {
            this.f8605d = BuildConfig.FLAVOR;
        } else {
            this.f8605d = str3;
        }
    }

    public BoosterNotification(a aVar, String str, String str2, String str3) {
        t.e(aVar, "result");
        t.e(str, "descriptionEn");
        t.e(str2, "descriptionDe");
        t.e(str3, "ruleId");
        this.f8602a = aVar;
        this.f8603b = str;
        this.f8604c = str2;
        this.f8605d = str3;
    }

    public /* synthetic */ BoosterNotification(a aVar, String str, String str2, String str3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? a.Failed : aVar, (i10 & 2) != 0 ? BuildConfig.FLAVOR : str, (i10 & 4) != 0 ? BuildConfig.FLAVOR : str2, (i10 & 8) != 0 ? BuildConfig.FLAVOR : str3);
    }

    @fc.c
    public static final void a(BoosterNotification boosterNotification, jf.d dVar, SerialDescriptor serialDescriptor) {
        t.e(boosterNotification, "self");
        t.e(dVar, "output");
        t.e(serialDescriptor, "serialDesc");
        boolean z10 = false;
        if (dVar.p(serialDescriptor, 0) || boosterNotification.f8602a != a.Failed) {
            dVar.t(serialDescriptor, 0, new s("de.rki.covpass.sdk.cert.models.BoosterResult", a.values()), boosterNotification.f8602a);
        }
        if (dVar.p(serialDescriptor, 1) || !t.a(boosterNotification.f8603b, BuildConfig.FLAVOR)) {
            dVar.E(serialDescriptor, 1, boosterNotification.f8603b);
        }
        if (dVar.p(serialDescriptor, 2) || !t.a(boosterNotification.f8604c, BuildConfig.FLAVOR)) {
            dVar.E(serialDescriptor, 2, boosterNotification.f8604c);
        }
        if (dVar.p(serialDescriptor, 3) || !t.a(boosterNotification.f8605d, BuildConfig.FLAVOR)) {
            z10 = true;
        }
        if (z10) {
            dVar.E(serialDescriptor, 3, boosterNotification.f8605d);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoosterNotification)) {
            return false;
        }
        BoosterNotification boosterNotification = (BoosterNotification) obj;
        return this.f8602a == boosterNotification.f8602a && t.a(this.f8603b, boosterNotification.f8603b) && t.a(this.f8604c, boosterNotification.f8604c) && t.a(this.f8605d, boosterNotification.f8605d);
    }

    public int hashCode() {
        return (((((this.f8602a.hashCode() * 31) + this.f8603b.hashCode()) * 31) + this.f8604c.hashCode()) * 31) + this.f8605d.hashCode();
    }

    public String toString() {
        a aVar = this.f8602a;
        String str = this.f8603b;
        String str2 = this.f8604c;
        String str3 = this.f8605d;
        return "BoosterNotification(result=" + aVar + ", descriptionEn=" + str + ", descriptionDe=" + str2 + ", ruleId=" + str3 + ")";
    }
}
