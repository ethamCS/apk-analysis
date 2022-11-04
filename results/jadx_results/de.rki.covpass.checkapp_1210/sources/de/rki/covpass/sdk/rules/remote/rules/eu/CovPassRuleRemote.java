package de.rki.covpass.sdk.rules.remote.rules.eu;

import fc.c;
import hc.k0;
import hc.t;
import j$.time.ZonedDateTime;
import java.util.List;
import jf.d;
import kf.f;
import kf.h1;
import kf.k1;
import kf.w0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.ContextualSerializer;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.h;
import kotlinx.serialization.json.JsonElement;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 L2\u00020\u0001:\u0002MLBÏ\u0001\b\u0017\u0012\u0006\u0010G\u001a\u00020\u000b\u0012\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010%\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010(\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u00101\u001a\n\u0012\u0004\u0012\u00020,\u0018\u00010+\u0012\n\b\u0001\u00108\u001a\u0004\u0018\u000102\u0012\n\b\u0001\u0010;\u001a\u0004\u0018\u000102\u0012\u0010\b\u0001\u0010=\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010+\u0012\n\b\u0001\u0010B\u001a\u0004\u0018\u00010>\u0012\n\b\u0001\u0010D\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010F\u001a\u0004\u0018\u00010\t\u0012\b\u0010I\u001a\u0004\u0018\u00010H¢\u0006\u0004\bJ\u0010KJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\t\u0010\n\u001a\u00020\tHÖ\u0001J\t\u0010\f\u001a\u00020\u000bHÖ\u0001J\u0013\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003R \u0010\u0016\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R \u0010\u001a\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0011\u0012\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0018\u0010\u0013R \u0010\u001e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001b\u0010\u0011\u0012\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001c\u0010\u0013R \u0010\"\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u0011\u0012\u0004\b!\u0010\u0015\u001a\u0004\b \u0010\u0013R \u0010%\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b#\u0010\u0011\u0012\u0004\b$\u0010\u0015\u001a\u0004\b#\u0010\u0013R \u0010(\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b&\u0010\u0011\u0012\u0004\b'\u0010\u0015\u001a\u0004\b&\u0010\u0013R \u0010*\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0011\u0012\u0004\b)\u0010\u0015\u001a\u0004\b\u0017\u0010\u0013R&\u00101\u001a\b\u0012\u0004\u0012\u00020,0+8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b-\u0010.\u0012\u0004\b0\u0010\u0015\u001a\u0004\b\u001f\u0010/R \u00108\u001a\u0002028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u00104\u0012\u0004\b7\u0010\u0015\u001a\u0004\b5\u00106R \u0010;\u001a\u0002028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b \u00104\u0012\u0004\b:\u0010\u0015\u001a\u0004\b9\u00106R&\u0010=\u001a\b\u0012\u0004\u0012\u00020\t0+8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010.\u0012\u0004\b<\u0010\u0015\u001a\u0004\b\u0010\u0010/R \u0010B\u001a\u00020>8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b5\u0010?\u0012\u0004\bA\u0010\u0015\u001a\u0004\b-\u0010@R \u0010D\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b9\u0010\u0011\u0012\u0004\bC\u0010\u0015\u001a\u0004\b\u001b\u0010\u0013R\"\u0010F\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001c\u0010\u0011\u0012\u0004\bE\u0010\u0015\u001a\u0004\b3\u0010\u0013¨\u0006N"}, d2 = {"Lde/rki/covpass/sdk/rules/remote/rules/eu/CovPassRuleRemote;", BuildConfig.FLAVOR, "self", "Ljf/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ltb/e0;", "o", BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "getIdentifier$annotations", "()V", "identifier", "b", "k", "getType$annotations", "type", "c", "n", "getVersion$annotations", "version", "d", "j", "getSchemaVersion$annotations", "schemaVersion", "e", "getEngine$annotations", "engine", "f", "getEngineVersion$annotations", "engineVersion", "getCertificateType$annotations", "certificateType", BuildConfig.FLAVOR, "Lde/rki/covpass/sdk/rules/remote/rules/eu/CovPassDescriptionRemote;", "h", "Ljava/util/List;", "()Ljava/util/List;", "getDescriptions$annotations", "descriptions", "j$/time/ZonedDateTime", "i", "Lj$/time/ZonedDateTime;", "l", "()Lj$/time/ZonedDateTime;", "getValidFrom$annotations", "validFrom", "m", "getValidTo$annotations", "validTo", "getAffectedString$annotations", "affectedString", "Lkotlinx/serialization/json/JsonElement;", "Lkotlinx/serialization/json/JsonElement;", "()Lkotlinx/serialization/json/JsonElement;", "getLogic$annotations", "logic", "getCountryCode$annotations", "countryCode", "getRegion$annotations", "region", "seen1", "Lkf/h1;", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lj$/time/ZonedDateTime;Lj$/time/ZonedDateTime;Ljava/util/List;Lkotlinx/serialization/json/JsonElement;Ljava/lang/String;Ljava/lang/String;Lkf/h1;)V", "Companion", "$serializer", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
@h
/* loaded from: classes.dex */
public final class CovPassRuleRemote {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f8792a;

    /* renamed from: b */
    private final String f8793b;

    /* renamed from: c */
    private final String f8794c;

    /* renamed from: d */
    private final String f8795d;

    /* renamed from: e */
    private final String f8796e;

    /* renamed from: f */
    private final String f8797f;

    /* renamed from: g */
    private final String f8798g;

    /* renamed from: h */
    private final List<CovPassDescriptionRemote> f8799h;

    /* renamed from: i */
    private final ZonedDateTime f8800i;

    /* renamed from: j */
    private final ZonedDateTime f8801j;

    /* renamed from: k */
    private final List<String> f8802k;

    /* renamed from: l */
    private final JsonElement f8803l;

    /* renamed from: m */
    private final String f8804m;

    /* renamed from: n */
    private final String f8805n;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lde/rki/covpass/sdk/rules/remote/rules/eu/CovPassRuleRemote$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lde/rki/covpass/sdk/rules/remote/rules/eu/CovPassRuleRemote;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CovPassRuleRemote> serializer() {
            return CovPassRuleRemote$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ CovPassRuleRemote(int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, List list2, JsonElement jsonElement, String str8, String str9, h1 h1Var) {
        if (8191 != (i10 & 8191)) {
            w0.a(i10, 8191, CovPassRuleRemote$$serializer.INSTANCE.getDescriptor());
        }
        this.f8792a = str;
        this.f8793b = str2;
        this.f8794c = str3;
        this.f8795d = str4;
        this.f8796e = str5;
        this.f8797f = str6;
        this.f8798g = str7;
        this.f8799h = list;
        this.f8800i = zonedDateTime;
        this.f8801j = zonedDateTime2;
        this.f8802k = list2;
        this.f8803l = jsonElement;
        this.f8804m = str8;
        this.f8805n = (i10 & 8192) == 0 ? null : str9;
    }

    @c
    public static final void o(CovPassRuleRemote covPassRuleRemote, d dVar, SerialDescriptor serialDescriptor) {
        t.e(covPassRuleRemote, "self");
        t.e(dVar, "output");
        t.e(serialDescriptor, "serialDesc");
        boolean z10 = false;
        dVar.E(serialDescriptor, 0, covPassRuleRemote.f8792a);
        dVar.E(serialDescriptor, 1, covPassRuleRemote.f8793b);
        dVar.E(serialDescriptor, 2, covPassRuleRemote.f8794c);
        dVar.E(serialDescriptor, 3, covPassRuleRemote.f8795d);
        dVar.E(serialDescriptor, 4, covPassRuleRemote.f8796e);
        dVar.E(serialDescriptor, 5, covPassRuleRemote.f8797f);
        dVar.E(serialDescriptor, 6, covPassRuleRemote.f8798g);
        dVar.t(serialDescriptor, 7, new f(CovPassDescriptionRemote$$serializer.INSTANCE), covPassRuleRemote.f8799h);
        dVar.t(serialDescriptor, 8, new ContextualSerializer(k0.b(ZonedDateTime.class), null, new KSerializer[0]), covPassRuleRemote.f8800i);
        dVar.t(serialDescriptor, 9, new ContextualSerializer(k0.b(ZonedDateTime.class), null, new KSerializer[0]), covPassRuleRemote.f8801j);
        k1 k1Var = k1.f15181a;
        dVar.t(serialDescriptor, 10, new f(k1Var), covPassRuleRemote.f8802k);
        dVar.t(serialDescriptor, 11, lf.h.f15995a, covPassRuleRemote.f8803l);
        dVar.E(serialDescriptor, 12, covPassRuleRemote.f8804m);
        if (dVar.p(serialDescriptor, 13) || covPassRuleRemote.f8805n != null) {
            z10 = true;
        }
        if (z10) {
            dVar.m(serialDescriptor, 13, k1Var, covPassRuleRemote.f8805n);
        }
    }

    public final List<String> a() {
        return this.f8802k;
    }

    public final String b() {
        return this.f8798g;
    }

    public final String c() {
        return this.f8804m;
    }

    public final List<CovPassDescriptionRemote> d() {
        return this.f8799h;
    }

    public final String e() {
        return this.f8796e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CovPassRuleRemote)) {
            return false;
        }
        CovPassRuleRemote covPassRuleRemote = (CovPassRuleRemote) obj;
        return t.a(this.f8792a, covPassRuleRemote.f8792a) && t.a(this.f8793b, covPassRuleRemote.f8793b) && t.a(this.f8794c, covPassRuleRemote.f8794c) && t.a(this.f8795d, covPassRuleRemote.f8795d) && t.a(this.f8796e, covPassRuleRemote.f8796e) && t.a(this.f8797f, covPassRuleRemote.f8797f) && t.a(this.f8798g, covPassRuleRemote.f8798g) && t.a(this.f8799h, covPassRuleRemote.f8799h) && t.a(this.f8800i, covPassRuleRemote.f8800i) && t.a(this.f8801j, covPassRuleRemote.f8801j) && t.a(this.f8802k, covPassRuleRemote.f8802k) && t.a(this.f8803l, covPassRuleRemote.f8803l) && t.a(this.f8804m, covPassRuleRemote.f8804m) && t.a(this.f8805n, covPassRuleRemote.f8805n);
    }

    public final String f() {
        return this.f8797f;
    }

    public final String g() {
        return this.f8792a;
    }

    public final JsonElement h() {
        return this.f8803l;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((this.f8792a.hashCode() * 31) + this.f8793b.hashCode()) * 31) + this.f8794c.hashCode()) * 31) + this.f8795d.hashCode()) * 31) + this.f8796e.hashCode()) * 31) + this.f8797f.hashCode()) * 31) + this.f8798g.hashCode()) * 31) + this.f8799h.hashCode()) * 31) + this.f8800i.hashCode()) * 31) + this.f8801j.hashCode()) * 31) + this.f8802k.hashCode()) * 31) + this.f8803l.hashCode()) * 31) + this.f8804m.hashCode()) * 31;
        String str = this.f8805n;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String i() {
        return this.f8805n;
    }

    public final String j() {
        return this.f8795d;
    }

    public final String k() {
        return this.f8793b;
    }

    public final ZonedDateTime l() {
        return this.f8800i;
    }

    public final ZonedDateTime m() {
        return this.f8801j;
    }

    public final String n() {
        return this.f8794c;
    }

    public String toString() {
        String str = this.f8792a;
        String str2 = this.f8793b;
        String str3 = this.f8794c;
        String str4 = this.f8795d;
        String str5 = this.f8796e;
        String str6 = this.f8797f;
        String str7 = this.f8798g;
        List<CovPassDescriptionRemote> list = this.f8799h;
        ZonedDateTime zonedDateTime = this.f8800i;
        ZonedDateTime zonedDateTime2 = this.f8801j;
        List<String> list2 = this.f8802k;
        JsonElement jsonElement = this.f8803l;
        String str8 = this.f8804m;
        String str9 = this.f8805n;
        return "CovPassRuleRemote(identifier=" + str + ", type=" + str2 + ", version=" + str3 + ", schemaVersion=" + str4 + ", engine=" + str5 + ", engineVersion=" + str6 + ", certificateType=" + str7 + ", descriptions=" + list + ", validFrom=" + zonedDateTime + ", validTo=" + zonedDateTime2 + ", affectedString=" + list2 + ", logic=" + jsonElement + ", countryCode=" + str8 + ", region=" + str9 + ")";
    }
}
