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
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001f2\u00020\u0001:\u0002 \u001fB9\b\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0018\u0010\u0012¨\u0006!"}, d2 = {"Lde/rki/covpass/sdk/rules/booster/remote/BoosterRuleIdentifierRemote;", BuildConfig.FLAVOR, "self", "Ljf/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ltb/e0;", "a", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "identifier", "b", "getVersion", "version", "c", "getHash", "hash", "seen1", "Lkf/h1;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkf/h1;)V", "Companion", "$serializer", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
@h
/* loaded from: classes.dex */
public final class BoosterRuleIdentifierRemote {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f8756a;

    /* renamed from: b */
    private final String f8757b;

    /* renamed from: c */
    private final String f8758c;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lde/rki/covpass/sdk/rules/booster/remote/BoosterRuleIdentifierRemote$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lde/rki/covpass/sdk/rules/booster/remote/BoosterRuleIdentifierRemote;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<BoosterRuleIdentifierRemote> serializer() {
            return BoosterRuleIdentifierRemote$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BoosterRuleIdentifierRemote(int i10, String str, String str2, String str3, h1 h1Var) {
        if (7 != (i10 & 7)) {
            w0.a(i10, 7, BoosterRuleIdentifierRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f8756a = str;
        this.f8757b = str2;
        this.f8758c = str3;
    }

    @c
    public static final void a(BoosterRuleIdentifierRemote boosterRuleIdentifierRemote, d dVar, SerialDescriptor serialDescriptor) {
        t.e(boosterRuleIdentifierRemote, "self");
        t.e(dVar, "output");
        t.e(serialDescriptor, "serialDesc");
        dVar.E(serialDescriptor, 0, boosterRuleIdentifierRemote.f8756a);
        dVar.E(serialDescriptor, 1, boosterRuleIdentifierRemote.f8757b);
        dVar.E(serialDescriptor, 2, boosterRuleIdentifierRemote.f8758c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BoosterRuleIdentifierRemote)) {
            return false;
        }
        BoosterRuleIdentifierRemote boosterRuleIdentifierRemote = (BoosterRuleIdentifierRemote) obj;
        return t.a(this.f8756a, boosterRuleIdentifierRemote.f8756a) && t.a(this.f8757b, boosterRuleIdentifierRemote.f8757b) && t.a(this.f8758c, boosterRuleIdentifierRemote.f8758c);
    }

    public int hashCode() {
        return (((this.f8756a.hashCode() * 31) + this.f8757b.hashCode()) * 31) + this.f8758c.hashCode();
    }

    public String toString() {
        String str = this.f8756a;
        String str2 = this.f8757b;
        String str3 = this.f8758c;
        return "BoosterRuleIdentifierRemote(identifier=" + str + ", version=" + str2 + ", hash=" + str3 + ")";
    }
}
