package q9;

import dgca.verifier.app.engine.data.RuleCertificateType;
import dgca.verifier.app.engine.data.Type;
import hc.t;
import j$.time.ZonedDateTime;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010)\u001a\u00020$\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020+\u0012\u0006\u00100\u001a\u00020\u0002\u0012\u0006\u00102\u001a\u00020\u0002\u0012\b\u00104\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u00106\u001a\u00020\u0002¢\u0006\u0004\b8\u00109J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u000f\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010)\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u00100\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u000f\u001a\u0004\b1\u0010\u0011R\u0017\u00102\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\u000f\u001a\u0004\b3\u0010\u0011R\u0019\u00104\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010\u000f\u001a\u0004\b5\u0010\u0011R\u0017\u00106\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010\u000f\u001a\u0004\b7\u0010\u0011¨\u0006:"}, d2 = {"Lq9/b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "ruleId", "J", "j", "()J", "identifier", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Ldgca/verifier/app/engine/data/Type;", "type", "Ldgca/verifier/app/engine/data/Type;", "l", "()Ldgca/verifier/app/engine/data/Type;", "version", "o", "schemaVersion", "k", "engine", "c", "engineVersion", "d", "Ldgca/verifier/app/engine/data/RuleCertificateType;", "ruleCertificateType", "Ldgca/verifier/app/engine/data/RuleCertificateType;", "i", "()Ldgca/verifier/app/engine/data/RuleCertificateType;", "j$/time/ZonedDateTime", "validFrom", "Lj$/time/ZonedDateTime;", "m", "()Lj$/time/ZonedDateTime;", "validTo", "n", BuildConfig.FLAVOR, "affectedString", "Ljava/util/List;", "a", "()Ljava/util/List;", "logic", "g", "countryCode", "b", "region", "h", "hash", "e", "<init>", "(JLjava/lang/String;Ldgca/verifier/app/engine/data/Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldgca/verifier/app/engine/data/RuleCertificateType;Lj$/time/ZonedDateTime;Lj$/time/ZonedDateTime;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    private final long f19708a;

    /* renamed from: b */
    private final String f19709b;

    /* renamed from: c */
    private final Type f19710c;

    /* renamed from: d */
    private final String f19711d;

    /* renamed from: e */
    private final String f19712e;

    /* renamed from: f */
    private final String f19713f;

    /* renamed from: g */
    private final String f19714g;

    /* renamed from: h */
    private final RuleCertificateType f19715h;

    /* renamed from: i */
    private final ZonedDateTime f19716i;

    /* renamed from: j */
    private final ZonedDateTime f19717j;

    /* renamed from: k */
    private final List<String> f19718k;

    /* renamed from: l */
    private final String f19719l;

    /* renamed from: m */
    private final String f19720m;

    /* renamed from: n */
    private final String f19721n;

    /* renamed from: o */
    private final String f19722o;

    public b(long j10, String str, Type type, String str2, String str3, String str4, String str5, RuleCertificateType ruleCertificateType, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, List<String> list, String str6, String str7, String str8, String str9) {
        t.e(str, "identifier");
        t.e(type, "type");
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
        this.f19708a = j10;
        this.f19709b = str;
        this.f19710c = type;
        this.f19711d = str2;
        this.f19712e = str3;
        this.f19713f = str4;
        this.f19714g = str5;
        this.f19715h = ruleCertificateType;
        this.f19716i = zonedDateTime;
        this.f19717j = zonedDateTime2;
        this.f19718k = list;
        this.f19719l = str6;
        this.f19720m = str7;
        this.f19721n = str8;
        this.f19722o = str9;
    }

    public /* synthetic */ b(long j10, String str, Type type, String str2, String str3, String str4, String str5, RuleCertificateType ruleCertificateType, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, List list, String str6, String str7, String str8, String str9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, str, type, str2, str3, str4, str5, ruleCertificateType, zonedDateTime, zonedDateTime2, list, str6, str7, str8, str9);
    }

    public final List<String> a() {
        return this.f19718k;
    }

    public final String b() {
        return this.f19720m;
    }

    public final String c() {
        return this.f19713f;
    }

    public final String d() {
        return this.f19714g;
    }

    public final String e() {
        return this.f19722o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f19708a == bVar.f19708a && t.a(this.f19709b, bVar.f19709b) && this.f19710c == bVar.f19710c && t.a(this.f19711d, bVar.f19711d) && t.a(this.f19712e, bVar.f19712e) && t.a(this.f19713f, bVar.f19713f) && t.a(this.f19714g, bVar.f19714g) && this.f19715h == bVar.f19715h && t.a(this.f19716i, bVar.f19716i) && t.a(this.f19717j, bVar.f19717j) && t.a(this.f19718k, bVar.f19718k) && t.a(this.f19719l, bVar.f19719l) && t.a(this.f19720m, bVar.f19720m) && t.a(this.f19721n, bVar.f19721n) && t.a(this.f19722o, bVar.f19722o);
    }

    public final String f() {
        return this.f19709b;
    }

    public final String g() {
        return this.f19719l;
    }

    public final String h() {
        return this.f19721n;
    }

    public int hashCode() {
        int a10 = ((((((((((((((((((((((((de.rki.covpass.sdk.cert.models.d.a(this.f19708a) * 31) + this.f19709b.hashCode()) * 31) + this.f19710c.hashCode()) * 31) + this.f19711d.hashCode()) * 31) + this.f19712e.hashCode()) * 31) + this.f19713f.hashCode()) * 31) + this.f19714g.hashCode()) * 31) + this.f19715h.hashCode()) * 31) + this.f19716i.hashCode()) * 31) + this.f19717j.hashCode()) * 31) + this.f19718k.hashCode()) * 31) + this.f19719l.hashCode()) * 31) + this.f19720m.hashCode()) * 31;
        String str = this.f19721n;
        return ((a10 + (str == null ? 0 : str.hashCode())) * 31) + this.f19722o.hashCode();
    }

    public final RuleCertificateType i() {
        return this.f19715h;
    }

    public final long j() {
        return this.f19708a;
    }

    public final String k() {
        return this.f19712e;
    }

    public final Type l() {
        return this.f19710c;
    }

    public final ZonedDateTime m() {
        return this.f19716i;
    }

    public final ZonedDateTime n() {
        return this.f19717j;
    }

    public final String o() {
        return this.f19711d;
    }

    public String toString() {
        long j10 = this.f19708a;
        String str = this.f19709b;
        Type type = this.f19710c;
        String str2 = this.f19711d;
        String str3 = this.f19712e;
        String str4 = this.f19713f;
        String str5 = this.f19714g;
        RuleCertificateType ruleCertificateType = this.f19715h;
        ZonedDateTime zonedDateTime = this.f19716i;
        ZonedDateTime zonedDateTime2 = this.f19717j;
        List<String> list = this.f19718k;
        String str6 = this.f19719l;
        String str7 = this.f19720m;
        String str8 = this.f19721n;
        String str9 = this.f19722o;
        return "CovPassDomesticRuleLocal(ruleId=" + j10 + ", identifier=" + str + ", type=" + type + ", version=" + str2 + ", schemaVersion=" + str3 + ", engine=" + str4 + ", engineVersion=" + str5 + ", ruleCertificateType=" + ruleCertificateType + ", validFrom=" + zonedDateTime + ", validTo=" + zonedDateTime2 + ", affectedString=" + list + ", logic=" + str6 + ", countryCode=" + str7 + ", region=" + str8 + ", hash=" + str9 + ")";
    }
}
