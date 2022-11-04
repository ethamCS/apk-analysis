package de.rki.covpass.sdk.ticketing.data.accesstoken;

import bf.y;
import hc.k0;
import hc.t;
import hc.v;
import j$.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import kf.f;
import kf.h1;
import kf.k1;
import kf.w0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.h;
import org.conscrypt.BuildConfig;
import tb.m;
@Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001e\n\u0002\u0010 \n\u0002\b\b\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 W2\u00020\u0001:\u0002XWBÁ\u0001\b\u0017\u0012\u0006\u0010R\u001a\u00020\u000b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010 \u001a\u0004\u0018\u00010\t\u0012\b\u0010#\u001a\u0004\u0018\u00010\t\u0012\b\u0010&\u001a\u0004\u0018\u00010\t\u0012\b\u0010)\u001a\u0004\u0018\u00010\t\u0012\b\u0010,\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u00102\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010-\u0012\u000e\u00105\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010-\u0012\n\b\u0001\u0010<\u001a\u0004\u0018\u000106\u0012\n\b\u0001\u0010@\u001a\u0004\u0018\u000106\u0012\n\b\u0001\u0010D\u001a\u0004\u0018\u000106\u0012\b\u0010T\u001a\u0004\u0018\u00010S¢\u0006\u0004\bU\u0010VJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0017\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R \u0010\u001b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0011\u0012\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0018\u0010\u0013R \u0010\u001e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0011\u0012\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001c\u0010\u0013R \u0010 \u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\b\u0010\u0011\u0012\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u0010\u0010\u0013R\u0017\u0010#\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010\u0011\u001a\u0004\b\"\u0010\u0013R\u0017\u0010&\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010\u0011\u001a\u0004\b%\u0010\u0013R\u0017\u0010)\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b'\u0010\u0011\u001a\u0004\b(\u0010\u0013R\u0017\u0010,\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b*\u0010\u0011\u001a\u0004\b+\u0010\u0013R&\u00102\u001a\b\u0012\u0004\u0012\u00020\t0-8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010/\u0012\u0004\b1\u0010\u001a\u001a\u0004\b\u0015\u00100R\u001d\u00105\u001a\b\u0012\u0004\u0012\u00020\t0-8\u0006¢\u0006\f\n\u0004\b3\u0010/\u001a\u0004\b4\u00100R \u0010<\u001a\u0002068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b7\u00108\u0012\u0004\b;\u0010\u001a\u001a\u0004\b9\u0010:R \u0010@\u001a\u0002068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b=\u00108\u0012\u0004\b?\u0010\u001a\u001a\u0004\b>\u0010:R \u0010D\u001a\u0002068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\bA\u00108\u0012\u0004\bC\u0010\u001a\u001a\u0004\bB\u0010:R\u001b\u0010H\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010\u0013R\u001b\u0010K\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bI\u0010F\u001a\u0004\bJ\u0010\u0013R\u001b\u0010N\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bL\u0010F\u001a\u0004\bM\u0010\u0013R!\u0010Q\u001a\b\u0012\u0004\u0012\u00020\t0-8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bO\u0010F\u001a\u0004\bP\u00100¨\u0006Y"}, d2 = {"Lde/rki/covpass/sdk/ticketing/data/accesstoken/TicketingCertificateDataRemote;", BuildConfig.FLAVOR, "self", "Ljf/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ltb/e0;", "e", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "a", "Ljava/lang/String;", "getHash", "()Ljava/lang/String;", "hash", "b", "getLang", "lang", "c", "getStandardizedFamilyName$annotations", "()V", "standardizedFamilyName", "d", "getStandardizedGivenName$annotations", "standardizedGivenName", "getDateOfBirth$annotations", "dateOfBirth", "f", "getCoa", "coa", "g", "getCod", "cod", "h", "getRoa", "roa", "i", "getRod", "rod", BuildConfig.FLAVOR, "j", "Ljava/util/List;", "()Ljava/util/List;", "getGreenCertificateTypes$annotations", "greenCertificateTypes", "k", "getCategory", "category", "j$/time/ZonedDateTime", "l", "Lj$/time/ZonedDateTime;", "getValidationClock", "()Lj$/time/ZonedDateTime;", "getValidationClock$annotations", "validationClock", "m", "getValidFrom", "getValidFrom$annotations", "validFrom", "n", "getValidTo", "getValidTo$annotations", "validTo", "o", "Lkotlin/Lazy;", "getStandardizedFamilyNameTrimmed", "standardizedFamilyNameTrimmed", "p", "getStandardizedGivenNameTrimmed", "standardizedGivenNameTrimmed", "q", "getDateOfBirthTrimmed", "dateOfBirthTrimmed", "r", "getGreenCertificateTypesTrimmed", "greenCertificateTypesTrimmed", "seen1", "Lkf/h1;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lj$/time/ZonedDateTime;Lj$/time/ZonedDateTime;Lj$/time/ZonedDateTime;Lkf/h1;)V", "Companion", "$serializer", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
@h
/* loaded from: classes.dex */
public final class TicketingCertificateDataRemote {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f8835a;

    /* renamed from: b */
    private final String f8836b;

    /* renamed from: c */
    private final String f8837c;

    /* renamed from: d */
    private final String f8838d;

    /* renamed from: e */
    private final String f8839e;

    /* renamed from: f */
    private final String f8840f;

    /* renamed from: g */
    private final String f8841g;

    /* renamed from: h */
    private final String f8842h;

    /* renamed from: i */
    private final String f8843i;

    /* renamed from: j */
    private final List<String> f8844j;

    /* renamed from: k */
    private final List<String> f8845k;

    /* renamed from: l */
    private final ZonedDateTime f8846l;

    /* renamed from: m */
    private final ZonedDateTime f8847m;

    /* renamed from: n */
    private final ZonedDateTime f8848n;

    /* renamed from: o */
    private final Lazy f8849o;

    /* renamed from: p */
    private final Lazy f8850p;

    /* renamed from: q */
    private final Lazy f8851q;

    /* renamed from: r */
    private final Lazy f8852r;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lde/rki/covpass/sdk/ticketing/data/accesstoken/TicketingCertificateDataRemote$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lde/rki/covpass/sdk/ticketing/data/accesstoken/TicketingCertificateDataRemote;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TicketingCertificateDataRemote> serializer() {
            return TicketingCertificateDataRemote$$serializer.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a extends v implements gc.a<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(0);
            TicketingCertificateDataRemote.this = r1;
        }

        /* renamed from: b */
        public final String invoke() {
            CharSequence S0;
            S0 = y.S0(TicketingCertificateDataRemote.this.c());
            return S0.toString();
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b extends v implements gc.a<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(0);
            TicketingCertificateDataRemote.this = r1;
        }

        /* renamed from: b */
        public final String invoke() {
            CharSequence S0;
            S0 = y.S0(TicketingCertificateDataRemote.this.d());
            return S0.toString();
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class c extends v implements gc.a<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c() {
            super(0);
            TicketingCertificateDataRemote.this = r1;
        }

        /* renamed from: b */
        public final String invoke() {
            CharSequence S0;
            S0 = y.S0(TicketingCertificateDataRemote.this.a());
            return S0.toString();
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class d extends v implements gc.a<List<? extends String>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d() {
            super(0);
            TicketingCertificateDataRemote.this = r1;
        }

        @Override // gc.a
        public final List<? extends String> invoke() {
            int s10;
            CharSequence S0;
            List<String> b10 = TicketingCertificateDataRemote.this.b();
            s10 = ub.v.s(b10, 10);
            ArrayList arrayList = new ArrayList(s10);
            for (String str : b10) {
                S0 = y.S0(str);
                arrayList.add(S0.toString());
            }
            return arrayList;
        }
    }

    public /* synthetic */ TicketingCertificateDataRemote(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, List list, List list2, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, ZonedDateTime zonedDateTime3, h1 h1Var) {
        Lazy a10;
        Lazy a11;
        Lazy a12;
        Lazy a13;
        if (16382 != (i10 & 16382)) {
            w0.a(i10, 16382, TicketingCertificateDataRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f8835a = (i10 & 1) == 0 ? null : str;
        this.f8836b = str2;
        this.f8837c = str3;
        this.f8838d = str4;
        this.f8839e = str5;
        this.f8840f = str6;
        this.f8841g = str7;
        this.f8842h = str8;
        this.f8843i = str9;
        this.f8844j = list;
        this.f8845k = list2;
        this.f8846l = zonedDateTime;
        this.f8847m = zonedDateTime2;
        this.f8848n = zonedDateTime3;
        a10 = m.a(new a());
        this.f8849o = a10;
        a11 = m.a(new b());
        this.f8850p = a11;
        a12 = m.a(new c());
        this.f8851q = a12;
        a13 = m.a(new d());
        this.f8852r = a13;
    }

    @fc.c
    public static final void e(TicketingCertificateDataRemote ticketingCertificateDataRemote, jf.d dVar, SerialDescriptor serialDescriptor) {
        t.e(ticketingCertificateDataRemote, "self");
        t.e(dVar, "output");
        t.e(serialDescriptor, "serialDesc");
        if (dVar.p(serialDescriptor, 0) || ticketingCertificateDataRemote.f8835a != null) {
            dVar.m(serialDescriptor, 0, k1.f15181a, ticketingCertificateDataRemote.f8835a);
        }
        dVar.E(serialDescriptor, 1, ticketingCertificateDataRemote.f8836b);
        dVar.E(serialDescriptor, 2, ticketingCertificateDataRemote.f8837c);
        dVar.E(serialDescriptor, 3, ticketingCertificateDataRemote.f8838d);
        dVar.E(serialDescriptor, 4, ticketingCertificateDataRemote.f8839e);
        dVar.E(serialDescriptor, 5, ticketingCertificateDataRemote.f8840f);
        dVar.E(serialDescriptor, 6, ticketingCertificateDataRemote.f8841g);
        dVar.E(serialDescriptor, 7, ticketingCertificateDataRemote.f8842h);
        dVar.E(serialDescriptor, 8, ticketingCertificateDataRemote.f8843i);
        k1 k1Var = k1.f15181a;
        dVar.t(serialDescriptor, 9, new f(k1Var), ticketingCertificateDataRemote.f8844j);
        dVar.t(serialDescriptor, 10, new f(k1Var), ticketingCertificateDataRemote.f8845k);
        dVar.t(serialDescriptor, 11, new ContextualSerializer(k0.b(ZonedDateTime.class), null, new KSerializer[0]), ticketingCertificateDataRemote.f8846l);
        dVar.t(serialDescriptor, 12, new ContextualSerializer(k0.b(ZonedDateTime.class), null, new KSerializer[0]), ticketingCertificateDataRemote.f8847m);
        dVar.t(serialDescriptor, 13, new ContextualSerializer(k0.b(ZonedDateTime.class), null, new KSerializer[0]), ticketingCertificateDataRemote.f8848n);
    }

    public final String a() {
        return this.f8839e;
    }

    public final List<String> b() {
        return this.f8844j;
    }

    public final String c() {
        return this.f8837c;
    }

    public final String d() {
        return this.f8838d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TicketingCertificateDataRemote)) {
            return false;
        }
        TicketingCertificateDataRemote ticketingCertificateDataRemote = (TicketingCertificateDataRemote) obj;
        return t.a(this.f8835a, ticketingCertificateDataRemote.f8835a) && t.a(this.f8836b, ticketingCertificateDataRemote.f8836b) && t.a(this.f8837c, ticketingCertificateDataRemote.f8837c) && t.a(this.f8838d, ticketingCertificateDataRemote.f8838d) && t.a(this.f8839e, ticketingCertificateDataRemote.f8839e) && t.a(this.f8840f, ticketingCertificateDataRemote.f8840f) && t.a(this.f8841g, ticketingCertificateDataRemote.f8841g) && t.a(this.f8842h, ticketingCertificateDataRemote.f8842h) && t.a(this.f8843i, ticketingCertificateDataRemote.f8843i) && t.a(this.f8844j, ticketingCertificateDataRemote.f8844j) && t.a(this.f8845k, ticketingCertificateDataRemote.f8845k) && t.a(this.f8846l, ticketingCertificateDataRemote.f8846l) && t.a(this.f8847m, ticketingCertificateDataRemote.f8847m) && t.a(this.f8848n, ticketingCertificateDataRemote.f8848n);
    }

    public int hashCode() {
        String str = this.f8835a;
        return ((((((((((((((((((((((((((str == null ? 0 : str.hashCode()) * 31) + this.f8836b.hashCode()) * 31) + this.f8837c.hashCode()) * 31) + this.f8838d.hashCode()) * 31) + this.f8839e.hashCode()) * 31) + this.f8840f.hashCode()) * 31) + this.f8841g.hashCode()) * 31) + this.f8842h.hashCode()) * 31) + this.f8843i.hashCode()) * 31) + this.f8844j.hashCode()) * 31) + this.f8845k.hashCode()) * 31) + this.f8846l.hashCode()) * 31) + this.f8847m.hashCode()) * 31) + this.f8848n.hashCode();
    }

    public String toString() {
        String str = this.f8835a;
        String str2 = this.f8836b;
        String str3 = this.f8837c;
        String str4 = this.f8838d;
        String str5 = this.f8839e;
        String str6 = this.f8840f;
        String str7 = this.f8841g;
        String str8 = this.f8842h;
        String str9 = this.f8843i;
        List<String> list = this.f8844j;
        List<String> list2 = this.f8845k;
        ZonedDateTime zonedDateTime = this.f8846l;
        ZonedDateTime zonedDateTime2 = this.f8847m;
        ZonedDateTime zonedDateTime3 = this.f8848n;
        return "TicketingCertificateDataRemote(hash=" + str + ", lang=" + str2 + ", standardizedFamilyName=" + str3 + ", standardizedGivenName=" + str4 + ", dateOfBirth=" + str5 + ", coa=" + str6 + ", cod=" + str7 + ", roa=" + str8 + ", rod=" + str9 + ", greenCertificateTypes=" + list + ", category=" + list2 + ", validationClock=" + zonedDateTime + ", validFrom=" + zonedDateTime2 + ", validTo=" + zonedDateTime3 + ")";
    }
}
