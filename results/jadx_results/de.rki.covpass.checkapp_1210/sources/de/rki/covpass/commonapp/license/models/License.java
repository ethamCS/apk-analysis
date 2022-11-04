package de.rki.covpass.commonapp.license.models;

import fc.c;
import hc.t;
import jf.d;
import kf.h1;
import kf.k1;
import kf.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.h;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dB1\b\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u000b\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012R\"\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0011\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0012¨\u0006\u001f"}, d2 = {"Lde/rki/covpass/commonapp/license/models/License;", BuildConfig.FLAVOR, "self", "Ljf/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ltb/e0;", "c", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "license", "b", "getLicenseUrl$annotations", "()V", "licenseUrl", "seen1", "Lkf/h1;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Lkf/h1;)V", "Companion", "$serializer", "common-app_release"}, k = 1, mv = {1, 7, 1})
@h
/* loaded from: classes.dex */
public final class License {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f8548a;

    /* renamed from: b */
    private final String f8549b;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lde/rki/covpass/commonapp/license/models/License$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lde/rki/covpass/commonapp/license/models/License;", "common-app_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<License> serializer() {
            return License$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ License(int i10, String str, String str2, h1 h1Var) {
        if (3 != (i10 & 3)) {
            w0.a(i10, 3, License$$serializer.INSTANCE.getDescriptor());
        }
        this.f8548a = str;
        this.f8549b = str2;
    }

    @c
    public static final void c(License license, d dVar, SerialDescriptor serialDescriptor) {
        t.e(license, "self");
        t.e(dVar, "output");
        t.e(serialDescriptor, "serialDesc");
        k1 k1Var = k1.f15181a;
        dVar.m(serialDescriptor, 0, k1Var, license.f8548a);
        dVar.m(serialDescriptor, 1, k1Var, license.f8549b);
    }

    public final String a() {
        return this.f8548a;
    }

    public final String b() {
        return this.f8549b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof License)) {
            return false;
        }
        License license = (License) obj;
        return t.a(this.f8548a, license.f8548a) && t.a(this.f8549b, license.f8549b);
    }

    public int hashCode() {
        String str = this.f8548a;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f8549b;
        if (str2 != null) {
            i10 = str2.hashCode();
        }
        return hashCode + i10;
    }

    public String toString() {
        String str = this.f8548a;
        String str2 = this.f8549b;
        return "License(license=" + str + ", licenseUrl=" + str2 + ")";
    }
}
