package r9;

import dgca.verifier.app.engine.data.RuleCertificateType;
import dgca.verifier.app.engine.data.Type;
import hc.t;
import j$.time.ZonedDateTime;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010)\u001a\u00020$\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020+\u0012\u0006\u00100\u001a\u00020\u0002\u0012\u0006\u00102\u001a\u00020\u0002\u0012\b\u00104\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u00106\u001a\u00020\u0002¢\u0006\u0004\b8\u00109J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u000f\u001a\u0004\b\u001a\u0010\u0011R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u000f\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u000f\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010)\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u00100\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u000f\u001a\u0004\b1\u0010\u0011R\u0017\u00102\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\u000f\u001a\u0004\b3\u0010\u0011R\u0019\u00104\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010\u000f\u001a\u0004\b5\u0010\u0011R\u0017\u00106\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010\u000f\u001a\u0004\b7\u0010\u0011¨\u0006:"}, d2 = {"Lr9/b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "ruleId", "J", "j", "()J", "identifier", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Ldgca/verifier/app/engine/data/Type;", "type", "Ldgca/verifier/app/engine/data/Type;", "l", "()Ldgca/verifier/app/engine/data/Type;", "version", "o", "schemaVersion", "k", "engine", "c", "engineVersion", "d", "Ldgca/verifier/app/engine/data/RuleCertificateType;", "ruleCertificateType", "Ldgca/verifier/app/engine/data/RuleCertificateType;", "i", "()Ldgca/verifier/app/engine/data/RuleCertificateType;", "j$/time/ZonedDateTime", "validFrom", "Lj$/time/ZonedDateTime;", "m", "()Lj$/time/ZonedDateTime;", "validTo", "n", BuildConfig.FLAVOR, "affectedString", "Ljava/util/List;", "a", "()Ljava/util/List;", "logic", "g", "countryCode", "b", "region", "h", "hash", "e", "<init>", "(JLjava/lang/String;Ldgca/verifier/app/engine/data/Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldgca/verifier/app/engine/data/RuleCertificateType;Lj$/time/ZonedDateTime;Lj$/time/ZonedDateTime;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a */
    private final long f20510a;

    /* renamed from: b */
    private final String f20511b;

    /* renamed from: c */
    private final Type f20512c;

    /* renamed from: d */
    private final String f20513d;

    /* renamed from: e */
    private final String f20514e;

    /* renamed from: f */
    private final String f20515f;

    /* renamed from: g */
    private final String f20516g;

    /* renamed from: h */
    private final RuleCertificateType f20517h;

    /* renamed from: i */
    private final ZonedDateTime f20518i;

    /* renamed from: j */
    private final ZonedDateTime f20519j;

    /* renamed from: k */
    private final List<String> f20520k;

    /* renamed from: l */
    private final String f20521l;

    /* renamed from: m */
    private final String f20522m;

    /* renamed from: n */
    private final String f20523n;

    /* renamed from: o */
    private final String f20524o;

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
        this.f20510a = j10;
        this.f20511b = str;
        this.f20512c = type;
        this.f20513d = str2;
        this.f20514e = str3;
        this.f20515f = str4;
        this.f20516g = str5;
        this.f20517h = ruleCertificateType;
        this.f20518i = zonedDateTime;
        this.f20519j = zonedDateTime2;
        this.f20520k = list;
        this.f20521l = str6;
        this.f20522m = str7;
        this.f20523n = str8;
        this.f20524o = str9;
    }

    public /* synthetic */ b(long j10, String str, Type type, String str2, String str3, String str4, String str5, RuleCertificateType ruleCertificateType, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, List list, String str6, String str7, String str8, String str9, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 0L : j10, str, type, str2, str3, str4, str5, ruleCertificateType, zonedDateTime, zonedDateTime2, list, str6, str7, str8, str9);
    }

    public final List<String> a() {
        return this.f20520k;
    }

    public final String b() {
        return this.f20522m;
    }

    public final String c() {
        return this.f20515f;
    }

    public final String d() {
        return this.f20516g;
    }

    public final String e() {
        return this.f20524o;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f20510a == bVar.f20510a && t.a(this.f20511b, bVar.f20511b) && this.f20512c == bVar.f20512c && t.a(this.f20513d, bVar.f20513d) && t.a(this.f20514e, bVar.f20514e) && t.a(this.f20515f, bVar.f20515f) && t.a(this.f20516g, bVar.f20516g) && this.f20517h == bVar.f20517h && t.a(this.f20518i, bVar.f20518i) && t.a(this.f20519j, bVar.f20519j) && t.a(this.f20520k, bVar.f20520k) && t.a(this.f20521l, bVar.f20521l) && t.a(this.f20522m, bVar.f20522m) && t.a(this.f20523n, bVar.f20523n) && t.a(this.f20524o, bVar.f20524o);
    }

    public final String f() {
        return this.f20511b;
    }

    public final String g() {
        return this.f20521l;
    }

    public final String h() {
        return this.f20523n;
    }

    public int hashCode() {
        int a10 = ((((((((((((((((((((((((de.rki.covpass.sdk.cert.models.d.a(this.f20510a) * 31) + this.f20511b.hashCode()) * 31) + this.f20512c.hashCode()) * 31) + this.f20513d.hashCode()) * 31) + this.f20514e.hashCode()) * 31) + this.f20515f.hashCode()) * 31) + this.f20516g.hashCode()) * 31) + this.f20517h.hashCode()) * 31) + this.f20518i.hashCode()) * 31) + this.f20519j.hashCode()) * 31) + this.f20520k.hashCode()) * 31) + this.f20521l.hashCode()) * 31) + this.f20522m.hashCode()) * 31;
        String str = this.f20523n;
        return ((a10 + (str == null ? 0 : str.hashCode())) * 31) + this.f20524o.hashCode();
    }

    public final RuleCertificateType i() {
        return this.f20517h;
    }

    public final long j() {
        return this.f20510a;
    }

    public final String k() {
        return this.f20514e;
    }

    public final Type l() {
        return this.f20512c;
    }

    public final ZonedDateTime m() {
        return this.f20518i;
    }

    public final ZonedDateTime n() {
        return this.f20519j;
    }

    public final String o() {
        return this.f20513d;
    }

    public String toString() {
        long j10 = this.f20510a;
        String str = this.f20511b;
        Type type = this.f20512c;
        String str2 = this.f20513d;
        String str3 = this.f20514e;
        String str4 = this.f20515f;
        String str5 = this.f20516g;
        RuleCertificateType ruleCertificateType = this.f20517h;
        ZonedDateTime zonedDateTime = this.f20518i;
        ZonedDateTime zonedDateTime2 = this.f20519j;
        List<String> list = this.f20520k;
        String str6 = this.f20521l;
        String str7 = this.f20522m;
        String str8 = this.f20523n;
        String str9 = this.f20524o;
        return "CovPassEuRuleLocal(ruleId=" + j10 + ", identifier=" + str + ", type=" + type + ", version=" + str2 + ", schemaVersion=" + str3 + ", engine=" + str4 + ", engineVersion=" + str5 + ", ruleCertificateType=" + ruleCertificateType + ", validFrom=" + zonedDateTime + ", validTo=" + zonedDateTime2 + ", affectedString=" + list + ", logic=" + str6 + ", countryCode=" + str7 + ", region=" + str8 + ", hash=" + str9 + ")";
    }
}
