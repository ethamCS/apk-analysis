package l9;

import dgca.verifier.app.engine.data.RuleCertificateType;
import hc.t;
import j$.time.ZonedDateTime;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010)\u001a\u00020$\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020+\u0012\u0006\u00100\u001a\u00020\u0002\u0012\u0006\u00102\u001a\u00020\u0002\u0012\b\u00104\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u00106\u001a\u00020\u0002¢\u0006\u0004\b8\u00109J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u000f\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010)\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u00100\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u000f\u001a\u0004\b1\u0010\u0011R\u0017\u00102\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\u000f\u001a\u0004\b3\u0010\u0011R\u0019\u00104\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010\u000f\u001a\u0004\b5\u0010\u0011R\u0017\u00106\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010\u000f\u001a\u0004\b7\u0010\u0011¨\u0006:"}, d2 = {"Ll9/b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "ruleId", "J", "j", "()J", "identifier", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Lk9/b;", "type", "Lk9/b;", "l", "()Lk9/b;", "version", "o", "schemaVersion", "k", "engine", "c", "engineVersion", "d", "Ldgca/verifier/app/engine/data/RuleCertificateType;", "ruleCertificateType", "Ldgca/verifier/app/engine/data/RuleCertificateType;", "i", "()Ldgca/verifier/app/engine/data/RuleCertificateType;", "j$/time/ZonedDateTime", "validFrom", "Lj$/time/ZonedDateTime;", "m", "()Lj$/time/ZonedDateTime;", "validTo", "n", BuildConfig.FLAVOR, "affectedString", "Ljava/util/List;", "a", "()Ljava/util/List;", "logic", "g", "countryCode", "b", "region", "h", "hash", "e", "<init>", "(JLjava/lang/String;Lk9/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldgca/verifier/app/engine/data/RuleCertificateType;Lj$/time/ZonedDateTime;Lj$/time/ZonedDateTime;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    private final long f15869a;

    /* renamed from: b */
    private final String f15870b;

    /* renamed from: c */
    private final k9.b f15871c;

    /* renamed from: d */
    private final String f15872d;

    /* renamed from: e */
    private final String f15873e;

    /* renamed from: f */
    private final String f15874f;

    /* renamed from: g */
    private final String f15875g;

    /* renamed from: h */
    private final RuleCertificateType f15876h;

    /* renamed from: i */
    private final ZonedDateTime f15877i;

    /* renamed from: j */
    private final ZonedDateTime f15878j;

    /* renamed from: k */
    private final List<String> f15879k;

    /* renamed from: l */
    private final String f15880l;

    /* renamed from: m */
    private final String f15881m;

    /* renamed from: n */
    private final String f15882n;

    /* renamed from: o */
    private final String f15883o;

    public b(long j10, String str, k9.b bVar, String str2, String str3, String str4, String str5, RuleCertificateType ruleCertificateType, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, List<String> list, String str6, String str7, String str8, String str9) {
        t.e(str, "identifier");
        t.e(bVar, "type");
        t.e(str2, "version");
        t.e(str3, "schemaVersion");
        t.e(str4, "engine");
        t.e(str5, "engineVersion");
        t.e(ruleCertificateType, "ruleCertificateType");
        t.e(zonedDateTime, "validFrom");
        t.e(zonedDateTime2, "validTo");
        t.e(list, "affectedString");
        t.e(str6, "logic");
        t.e(str7, "countryCode");
        t.e(str9, "hash");
        this.f15869a = j10;
        this.f15870b = str;
        this.f15871c = bVar;
        this.f15872d = str2;
        this.f15873e = str3;
        this.f15874f = str4;
        this.f15875g = str5;
        this.f15876h = ruleCertificateType;
        this.f15877i = zonedDateTime;
        this.f15878j = zonedDateTime2;
        this.f15879k = list;
        this.f15880l = str6;
        this.f15881m = str7;
        this.f15882n = str8;
        this.f15883o = str9;
    }

    public /* synthetic */ b(long j10, String str, k9.b bVar, String str2, String str3, String str4, String str5, RuleCertificateType ruleCertificateType, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, List list, String str6, String str7, String str8, String str9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, str, bVar, str2, str3, str4, str5, ruleCertificateType, zonedDateTime, zonedDateTime2, list, str6, str7, str8, str9);
    }

    public final List<String> a() {
        return this.f15879k;
    }

    public final String b() {
        return this.f15881m;
    }

    public final String c() {
        return this.f15874f;
    }

    public final String d() {
        return this.f15875g;
    }

    public final String e() {
        return this.f15883o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f15869a == bVar.f15869a && t.a(this.f15870b, bVar.f15870b) && this.f15871c == bVar.f15871c && t.a(this.f15872d, bVar.f15872d) && t.a(this.f15873e, bVar.f15873e) && t.a(this.f15874f, bVar.f15874f) && t.a(this.f15875g, bVar.f15875g) && this.f15876h == bVar.f15876h && t.a(this.f15877i, bVar.f15877i) && t.a(this.f15878j, bVar.f15878j) && t.a(this.f15879k, bVar.f15879k) && t.a(this.f15880l, bVar.f15880l) && t.a(this.f15881m, bVar.f15881m) && t.a(this.f15882n, bVar.f15882n) && t.a(this.f15883o, bVar.f15883o);
    }

    public final String f() {
        return this.f15870b;
    }

    public final String g() {
        return this.f15880l;
    }

    public final String h() {
        return this.f15882n;
    }

    public int hashCode() {
        int a10 = ((((((((((((((((((((((((de.rki.covpass.sdk.cert.models.d.a(this.f15869a) * 31) + this.f15870b.hashCode()) * 31) + this.f15871c.hashCode()) * 31) + this.f15872d.hashCode()) * 31) + this.f15873e.hashCode()) * 31) + this.f15874f.hashCode()) * 31) + this.f15875g.hashCode()) * 31) + this.f15876h.hashCode()) * 31) + this.f15877i.hashCode()) * 31) + this.f15878j.hashCode()) * 31) + this.f15879k.hashCode()) * 31) + this.f15880l.hashCode()) * 31) + this.f15881m.hashCode()) * 31;
        String str = this.f15882n;
        return ((a10 + (str == null ? 0 : str.hashCode())) * 31) + this.f15883o.hashCode();
    }

    public final RuleCertificateType i() {
        return this.f15876h;
    }

    public final long j() {
        return this.f15869a;
    }

    public final String k() {
        return this.f15873e;
    }

    public final k9.b l() {
        return this.f15871c;
    }

    public final ZonedDateTime m() {
        return this.f15877i;
    }

    public final ZonedDateTime n() {
        return this.f15878j;
    }

    public final String o() {
        return this.f15872d;
    }

    public String toString() {
        long j10 = this.f15869a;
        String str = this.f15870b;
        k9.b bVar = this.f15871c;
        String str2 = this.f15872d;
        String str3 = this.f15873e;
        String str4 = this.f15874f;
        String str5 = this.f15875g;
        RuleCertificateType ruleCertificateType = this.f15876h;
        ZonedDateTime zonedDateTime = this.f15877i;
        ZonedDateTime zonedDateTime2 = this.f15878j;
        List<String> list = this.f15879k;
        String str6 = this.f15880l;
        String str7 = this.f15881m;
        String str8 = this.f15882n;
        String str9 = this.f15883o;
        return "BoosterRuleLocal(ruleId=" + j10 + ", identifier=" + str + ", type=" + bVar + ", version=" + str2 + ", schemaVersion=" + str3 + ", engine=" + str4 + ", engineVersion=" + str5 + ", ruleCertificateType=" + ruleCertificateType + ", validFrom=" + zonedDateTime + ", validTo=" + zonedDateTime2 + ", affectedString=" + list + ", logic=" + str6 + ", countryCode=" + str7 + ", region=" + str8 + ", hash=" + str9 + ")";
    }
}
