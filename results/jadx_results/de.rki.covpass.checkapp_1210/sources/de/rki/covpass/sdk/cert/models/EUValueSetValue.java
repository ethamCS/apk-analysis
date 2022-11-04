package de.rki.covpass.sdk.cert.models;

import hc.t;
import kf.h1;
import kf.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 '2\u00020\u0001:\u0002('BK\b\u0017\u0012\u0006\u0010\"\u001a\u00020\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u001b\u001a\u00020\u000e\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\b\u0010!\u001a\u0004\u0018\u00010\t\u0012\b\u0010$\u001a\u0004\u0018\u00010#¢\u0006\u0004\b%\u0010&J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0013\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\b\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0010\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u001b\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0010\u001a\u0004\b\u001d\u0010\u0012R\u0017\u0010!\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0010\u001a\u0004\b \u0010\u0012¨\u0006)"}, d2 = {"Lde/rki/covpass/sdk/cert/models/EUValueSetValue;", BuildConfig.FLAVOR, "self", "Ljf/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ltb/e0;", "a", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "Ljava/lang/String;", "getDisplay", "()Ljava/lang/String;", "display", "b", "getLang", "lang", "c", "Z", "getActive", "()Z", "active", "d", "getSystem", "system", "e", "getVersion", "version", "seen1", "Lkf/h1;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Lkf/h1;)V", "Companion", "$serializer", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
@kotlinx.serialization.h
/* loaded from: classes.dex */
public final class EUValueSetValue {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f8665a;

    /* renamed from: b */
    private final String f8666b;

    /* renamed from: c */
    private final boolean f8667c;

    /* renamed from: d */
    private final String f8668d;

    /* renamed from: e */
    private final String f8669e;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lde/rki/covpass/sdk/cert/models/EUValueSetValue$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lde/rki/covpass/sdk/cert/models/EUValueSetValue;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<EUValueSetValue> serializer() {
            return EUValueSetValue$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ EUValueSetValue(int i10, String str, String str2, boolean z10, String str3, String str4, h1 h1Var) {
        if (31 != (i10 & 31)) {
            w0.a(i10, 31, EUValueSetValue$$serializer.INSTANCE.getDescriptor());
        }
        this.f8665a = str;
        this.f8666b = str2;
        this.f8667c = z10;
        this.f8668d = str3;
        this.f8669e = str4;
    }

    @fc.c
    public static final void a(EUValueSetValue eUValueSetValue, jf.d dVar, SerialDescriptor serialDescriptor) {
        t.e(eUValueSetValue, "self");
        t.e(dVar, "output");
        t.e(serialDescriptor, "serialDesc");
        dVar.E(serialDescriptor, 0, eUValueSetValue.f8665a);
        dVar.E(serialDescriptor, 1, eUValueSetValue.f8666b);
        dVar.B(serialDescriptor, 2, eUValueSetValue.f8667c);
        dVar.E(serialDescriptor, 3, eUValueSetValue.f8668d);
        dVar.E(serialDescriptor, 4, eUValueSetValue.f8669e);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EUValueSetValue)) {
            return false;
        }
        EUValueSetValue eUValueSetValue = (EUValueSetValue) obj;
        return t.a(this.f8665a, eUValueSetValue.f8665a) && t.a(this.f8666b, eUValueSetValue.f8666b) && this.f8667c == eUValueSetValue.f8667c && t.a(this.f8668d, eUValueSetValue.f8668d) && t.a(this.f8669e, eUValueSetValue.f8669e);
    }

    public int hashCode() {
        int hashCode = ((this.f8665a.hashCode() * 31) + this.f8666b.hashCode()) * 31;
        boolean z10 = this.f8667c;
        if (z10) {
            z10 = true;
        }
        int i10 = z10 ? 1 : 0;
        int i11 = z10 ? 1 : 0;
        return ((((hashCode + i10) * 31) + this.f8668d.hashCode()) * 31) + this.f8669e.hashCode();
    }

    public String toString() {
        String str = this.f8665a;
        String str2 = this.f8666b;
        boolean z10 = this.f8667c;
        String str3 = this.f8668d;
        String str4 = this.f8669e;
        return "EUValueSetValue(display=" + str + ", lang=" + str2 + ", active=" + z10 + ", system=" + str3 + ", version=" + str4 + ")";
    }
}
