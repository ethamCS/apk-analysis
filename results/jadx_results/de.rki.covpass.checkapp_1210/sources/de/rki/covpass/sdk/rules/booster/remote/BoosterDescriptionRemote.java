package de.rki.covpass.sdk.rules.booster.remote;

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
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001c\u001bB/\b\u0017\u0012\u0006\u0010\u0016\u001a\u00020\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0014\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013¨\u0006\u001d"}, d2 = {"Lde/rki/covpass/sdk/rules/booster/remote/BoosterDescriptionRemote;", BuildConfig.FLAVOR, "self", "Ljf/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ltb/e0;", "c", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "lang", "desc", "seen1", "Lkf/h1;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lkf/h1;)V", "Companion", "$serializer", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
@h
/* loaded from: classes.dex */
public final class BoosterDescriptionRemote {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f8754a;

    /* renamed from: b */
    private final String f8755b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lde/rki/covpass/sdk/rules/booster/remote/BoosterDescriptionRemote$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lde/rki/covpass/sdk/rules/booster/remote/BoosterDescriptionRemote;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BoosterDescriptionRemote> serializer() {
            return BoosterDescriptionRemote$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BoosterDescriptionRemote(int i10, String str, String str2, h1 h1Var) {
        if (3 != (i10 & 3)) {
            w0.a(i10, 3, BoosterDescriptionRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f8754a = str;
        this.f8755b = str2;
    }

    @c
    public static final void c(BoosterDescriptionRemote boosterDescriptionRemote, d dVar, SerialDescriptor serialDescriptor) {
        t.e(boosterDescriptionRemote, "self");
        t.e(dVar, "output");
        t.e(serialDescriptor, "serialDesc");
        dVar.E(serialDescriptor, 0, boosterDescriptionRemote.f8754a);
        dVar.E(serialDescriptor, 1, boosterDescriptionRemote.f8755b);
    }

    public final String a() {
        return this.f8755b;
    }

    public final String b() {
        return this.f8754a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoosterDescriptionRemote)) {
            return false;
        }
        BoosterDescriptionRemote boosterDescriptionRemote = (BoosterDescriptionRemote) obj;
        return t.a(this.f8754a, boosterDescriptionRemote.f8754a) && t.a(this.f8755b, boosterDescriptionRemote.f8755b);
    }

    public int hashCode() {
        return (this.f8754a.hashCode() * 31) + this.f8755b.hashCode();
    }

    public String toString() {
        String str = this.f8754a;
        String str2 = this.f8755b;
        return "BoosterDescriptionRemote(lang=" + str + ", desc=" + str2 + ")";
    }
}
