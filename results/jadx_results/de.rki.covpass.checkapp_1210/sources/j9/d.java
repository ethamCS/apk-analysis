package j9;

import dgca.verifier.app.engine.data.RuleCertificateType;
import dgca.verifier.app.engine.data.Type;
import hc.t;
import j$.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001f\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010)\u001a\u00020$\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020+\u0012\u0006\u00100\u001a\u00020\u0002\u0012\u0006\u00102\u001a\u00020\u0002\u0012\b\u00104\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u00106\u001a\u00020\u0002¢\u0006\u0004\b8\u00109J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010)\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u00100\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\n\u001a\u0004\b1\u0010\fR\u0017\u00102\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\n\u001a\u0004\b3\u0010\fR\u0019\u00104\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010\n\u001a\u0004\b5\u0010\fR\u0017\u00106\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010\n\u001a\u0004\b7\u0010\f¨\u0006:"}, d2 = {"Lj9/d;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "identifier", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "Ldgca/verifier/app/engine/data/Type;", "type", "Ldgca/verifier/app/engine/data/Type;", "l", "()Ldgca/verifier/app/engine/data/Type;", "version", "o", "schemaVersion", "k", "engine", "d", "engineVersion", "e", "Ldgca/verifier/app/engine/data/RuleCertificateType;", "ruleCertificateType", "Ldgca/verifier/app/engine/data/RuleCertificateType;", "j", "()Ldgca/verifier/app/engine/data/RuleCertificateType;", BuildConfig.FLAVOR, "descriptions", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "j$/time/ZonedDateTime", "validFrom", "Lj$/time/ZonedDateTime;", "m", "()Lj$/time/ZonedDateTime;", "validTo", "n", BuildConfig.FLAVOR, "affectedString", "Ljava/util/List;", "a", "()Ljava/util/List;", "logic", "h", "countryCode", "b", "region", "i", "hash", "f", "<init>", "(Ljava/lang/String;Ldgca/verifier/app/engine/data/Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldgca/verifier/app/engine/data/RuleCertificateType;Ljava/util/Map;Lj$/time/ZonedDateTime;Lj$/time/ZonedDateTime;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a */
    private final String f14204a;

    /* renamed from: b */
    private final Type f14205b;

    /* renamed from: c */
    private final String f14206c;

    /* renamed from: d */
    private final String f14207d;

    /* renamed from: e */
    private final String f14208e;

    /* renamed from: f */
    private final String f14209f;

    /* renamed from: g */
    private final RuleCertificateType f14210g;

    /* renamed from: h */
    private final Map<String, String> f14211h;

    /* renamed from: i */
    private final ZonedDateTime f14212i;

    /* renamed from: j */
    private final ZonedDateTime f14213j;

    /* renamed from: k */
    private final List<String> f14214k;

    /* renamed from: l */
    private final String f14215l;

    /* renamed from: m */
    private final String f14216m;

    /* renamed from: n */
    private final String f14217n;

    /* renamed from: o */
    private final String f14218o;

    public d(String str, Type type, String str2, String str3, String str4, String str5, RuleCertificateType ruleCertificateType, Map<String, String> map, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, List<String> list, String str6, String str7, String str8, String str9) {
        t.e(str, "identifier");
        t.e(type, "type");
        t.e(str2, "version");
        t.e(str3, "schemaVersion");
        t.e(str4, "engine");
        t.e(str5, "engineVersion");
        t.e(ruleCertificateType, "ruleCertificateType");
        t.e(map, "descriptions");
        t.e(zonedDateTime, "validFrom");
        t.e(zonedDateTime2, "validTo");
        t.e(list, "affectedString");
        t.e(str6, "logic");
        t.e(str7, "countryCode");
        t.e(str9, "hash");
        this.f14204a = str;
        this.f14205b = type;
        this.f14206c = str2;
        this.f14207d = str3;
        this.f14208e = str4;
        this.f14209f = str5;
        this.f14210g = ruleCertificateType;
        this.f14211h = map;
        this.f14212i = zonedDateTime;
        this.f14213j = zonedDateTime2;
        this.f14214k = list;
        this.f14215l = str6;
        this.f14216m = str7;
        this.f14217n = str8;
        this.f14218o = str9;
    }

    public final List<String> a() {
        return this.f14214k;
    }

    public final String b() {
        return this.f14216m;
    }

    public final Map<String, String> c() {
        return this.f14211h;
    }

    public final String d() {
        return this.f14208e;
    }

    public final String e() {
        return this.f14209f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return t.a(this.f14204a, dVar.f14204a) && this.f14205b == dVar.f14205b && t.a(this.f14206c, dVar.f14206c) && t.a(this.f14207d, dVar.f14207d) && t.a(this.f14208e, dVar.f14208e) && t.a(this.f14209f, dVar.f14209f) && this.f14210g == dVar.f14210g && t.a(this.f14211h, dVar.f14211h) && t.a(this.f14212i, dVar.f14212i) && t.a(this.f14213j, dVar.f14213j) && t.a(this.f14214k, dVar.f14214k) && t.a(this.f14215l, dVar.f14215l) && t.a(this.f14216m, dVar.f14216m) && t.a(this.f14217n, dVar.f14217n) && t.a(this.f14218o, dVar.f14218o);
    }

    public final String f() {
        return this.f14218o;
    }

    public final String g() {
        return this.f14204a;
    }

    public final String h() {
        return this.f14215l;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((this.f14204a.hashCode() * 31) + this.f14205b.hashCode()) * 31) + this.f14206c.hashCode()) * 31) + this.f14207d.hashCode()) * 31) + this.f14208e.hashCode()) * 31) + this.f14209f.hashCode()) * 31) + this.f14210g.hashCode()) * 31) + this.f14211h.hashCode()) * 31) + this.f14212i.hashCode()) * 31) + this.f14213j.hashCode()) * 31) + this.f14214k.hashCode()) * 31) + this.f14215l.hashCode()) * 31) + this.f14216m.hashCode()) * 31;
        String str = this.f14217n;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f14218o.hashCode();
    }

    public final String i() {
        return this.f14217n;
    }

    public final RuleCertificateType j() {
        return this.f14210g;
    }

    public final String k() {
        return this.f14207d;
    }

    public final Type l() {
        return this.f14205b;
    }

    public final ZonedDateTime m() {
        return this.f14212i;
    }

    public final ZonedDateTime n() {
        return this.f14213j;
    }

    public final String o() {
        return this.f14206c;
    }

    public String toString() {
        String str = this.f14204a;
        Type type = this.f14205b;
        String str2 = this.f14206c;
        String str3 = this.f14207d;
        String str4 = this.f14208e;
        String str5 = this.f14209f;
        RuleCertificateType ruleCertificateType = this.f14210g;
        Map<String, String> map = this.f14211h;
        ZonedDateTime zonedDateTime = this.f14212i;
        ZonedDateTime zonedDateTime2 = this.f14213j;
        List<String> list = this.f14214k;
        String str6 = this.f14215l;
        String str7 = this.f14216m;
        String str8 = this.f14217n;
        String str9 = this.f14218o;
        return "CovPassRule(identifier=" + str + ", type=" + type + ", version=" + str2 + ", schemaVersion=" + str3 + ", engine=" + str4 + ", engineVersion=" + str5 + ", ruleCertificateType=" + ruleCertificateType + ", descriptions=" + map + ", validFrom=" + zonedDateTime + ", validTo=" + zonedDateTime2 + ", affectedString=" + list + ", logic=" + str6 + ", countryCode=" + str7 + ", region=" + str8 + ", hash=" + str9 + ")";
    }
}
