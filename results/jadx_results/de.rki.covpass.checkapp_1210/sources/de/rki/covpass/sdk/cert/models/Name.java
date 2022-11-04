package de.rki.covpass.sdk.cert.models;

import bf.y;
import hc.t;
import java.io.Serializable;
import kf.h1;
import kf.k1;
import kf.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 ,2\u00020\u0001:\u0002-,B5\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\"\u001a\u00020\t¢\u0006\u0004\b&\u0010'BK\b\u0017\u0012\u0006\u0010(\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\t\u0012\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b&\u0010+J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003R\"\u0010\u0017\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\"\u0010\u001b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0012\u0012\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0019\u0010\u0014R\"\u0010\u001f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0012\u0012\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001d\u0010\u0014R \u0010\"\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u0010\u0012\u0012\u0004\b!\u0010\u0016\u001a\u0004\b\u0011\u0010\u0014R\u0011\u0010%\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006."}, d2 = {"Lde/rki/covpass/sdk/cert/models/Name;", "Ljava/io/Serializable;", "self", "Ljf/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ltb/e0;", "h", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", "c", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "getGivenName$annotations", "()V", "givenName", "d", "b", "getFamilyName$annotations", "familyName", "q", "f", "getGivenNameTransliterated$annotations", "givenNameTransliterated", "x", "getFamilyNameTransliterated$annotations", "familyNameTransliterated", "g", "()Lde/rki/covpass/sdk/cert/models/Name;", "trimmedName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkf/h1;", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkf/h1;)V", "Companion", "$serializer", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
@kotlinx.serialization.h
/* loaded from: classes.dex */
public final class Name implements Serializable {
    public static final Companion Companion = new Companion(null);

    /* renamed from: c */
    private final String f8677c;

    /* renamed from: d */
    private final String f8678d;

    /* renamed from: q */
    private final String f8679q;

    /* renamed from: x */
    private final String f8680x;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lde/rki/covpass/sdk/cert/models/Name$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lde/rki/covpass/sdk/cert/models/Name;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<Name> serializer() {
            return Name$$serializer.INSTANCE;
        }
    }

    public Name() {
        this((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null);
    }

    public /* synthetic */ Name(int i10, String str, String str2, String str3, String str4, h1 h1Var) {
        if ((i10 & 0) != 0) {
            w0.a(i10, 0, Name$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.f8677c = null;
        } else {
            this.f8677c = str;
        }
        if ((i10 & 2) == 0) {
            this.f8678d = null;
        } else {
            this.f8678d = str2;
        }
        if ((i10 & 4) == 0) {
            this.f8679q = null;
        } else {
            this.f8679q = str3;
        }
        if ((i10 & 8) == 0) {
            this.f8680x = BuildConfig.FLAVOR;
        } else {
            this.f8680x = str4;
        }
    }

    public Name(String str, String str2, String str3, String str4) {
        t.e(str4, "familyNameTransliterated");
        this.f8677c = str;
        this.f8678d = str2;
        this.f8679q = str3;
        this.f8680x = str4;
    }

    public /* synthetic */ Name(String str, String str2, String str3, String str4, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? BuildConfig.FLAVOR : str4);
    }

    @fc.c
    public static final void h(Name name, jf.d dVar, SerialDescriptor serialDescriptor) {
        t.e(name, "self");
        t.e(dVar, "output");
        t.e(serialDescriptor, "serialDesc");
        boolean z10 = false;
        if (dVar.p(serialDescriptor, 0) || name.f8677c != null) {
            dVar.m(serialDescriptor, 0, k1.f15181a, name.f8677c);
        }
        if (dVar.p(serialDescriptor, 1) || name.f8678d != null) {
            dVar.m(serialDescriptor, 1, k1.f15181a, name.f8678d);
        }
        if (dVar.p(serialDescriptor, 2) || name.f8679q != null) {
            dVar.m(serialDescriptor, 2, k1.f15181a, name.f8679q);
        }
        if (dVar.p(serialDescriptor, 3) || !t.a(name.f8680x, BuildConfig.FLAVOR)) {
            z10 = true;
        }
        if (z10) {
            dVar.E(serialDescriptor, 3, name.f8680x);
        }
    }

    public final String b() {
        return this.f8678d;
    }

    public final String c() {
        return this.f8680x;
    }

    public final String e() {
        return this.f8677c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Name)) {
            return false;
        }
        Name name = (Name) obj;
        return t.a(this.f8677c, name.f8677c) && t.a(this.f8678d, name.f8678d) && t.a(this.f8679q, name.f8679q) && t.a(this.f8680x, name.f8680x);
    }

    public final String f() {
        return this.f8679q;
    }

    public final Name g() {
        String str;
        String str2;
        CharSequence S0;
        CharSequence S02;
        CharSequence S03;
        CharSequence S04;
        String str3 = this.f8677c;
        String str4 = null;
        if (str3 != null) {
            S04 = y.S0(str3);
            str = S04.toString();
        } else {
            str = null;
        }
        String str5 = this.f8678d;
        if (str5 != null) {
            S03 = y.S0(str5);
            str2 = S03.toString();
        } else {
            str2 = null;
        }
        String str6 = this.f8679q;
        if (str6 != null) {
            S02 = y.S0(str6);
            str4 = S02.toString();
        }
        S0 = y.S0(this.f8680x);
        return new Name(str, str2, str4, S0.toString());
    }

    public int hashCode() {
        String str = this.f8677c;
        int i10 = 0;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f8678d;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f8679q;
        if (str3 != null) {
            i10 = str3.hashCode();
        }
        return ((hashCode2 + i10) * 31) + this.f8680x.hashCode();
    }

    public String toString() {
        String str = this.f8677c;
        String str2 = this.f8678d;
        String str3 = this.f8679q;
        String str4 = this.f8680x;
        return "Name(givenName=" + str + ", familyName=" + str2 + ", givenNameTransliterated=" + str3 + ", familyNameTransliterated=" + str4 + ")";
    }
}
