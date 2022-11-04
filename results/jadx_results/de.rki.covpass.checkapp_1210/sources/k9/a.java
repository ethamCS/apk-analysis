package k9;

import dgca.verifier.app.engine.data.RuleCertificateType;
import hc.t;
import j$.time.ZonedDateTime;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001f\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010)\u001a\u00020$\u0012\f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020+\u0012\u0006\u00100\u001a\u00020\u0002\u0012\u0006\u00102\u001a\u00020\u0002\u0012\b\u00104\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u00106\u001a\u00020\u0002¢\u0006\u0004\b8\u00109J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\n\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\n\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\n\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\n\u001a\u0004\b\u0019\u0010\fR\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010%\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010)\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020+8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u00100\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\n\u001a\u0004\b1\u0010\fR\u0017\u00102\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b2\u0010\n\u001a\u0004\b3\u0010\fR\u0019\u00104\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b4\u0010\n\u001a\u0004\b5\u0010\fR\u0017\u00106\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b6\u0010\n\u001a\u0004\b7\u0010\f¨\u0006:"}, d2 = {"Lk9/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "identifier", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "Lk9/b;", "type", "Lk9/b;", "l", "()Lk9/b;", "version", "o", "schemaVersion", "k", "engine", "d", "engineVersion", "e", "Ldgca/verifier/app/engine/data/RuleCertificateType;", "ruleCertificateType", "Ldgca/verifier/app/engine/data/RuleCertificateType;", "j", "()Ldgca/verifier/app/engine/data/RuleCertificateType;", BuildConfig.FLAVOR, "descriptions", "Ljava/util/Map;", "c", "()Ljava/util/Map;", "j$/time/ZonedDateTime", "validFrom", "Lj$/time/ZonedDateTime;", "m", "()Lj$/time/ZonedDateTime;", "validTo", "n", BuildConfig.FLAVOR, "affectedString", "Ljava/util/List;", "a", "()Ljava/util/List;", "logic", "h", "countryCode", "b", "region", "i", "hash", "f", "<init>", "(Ljava/lang/String;Lk9/b;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ldgca/verifier/app/engine/data/RuleCertificateType;Ljava/util/Map;Lj$/time/ZonedDateTime;Lj$/time/ZonedDateTime;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private final String f14845a;

    /* renamed from: b */
    private final b f14846b;

    /* renamed from: c */
    private final String f14847c;

    /* renamed from: d */
    private final String f14848d;

    /* renamed from: e */
    private final String f14849e;

    /* renamed from: f */
    private final String f14850f;

    /* renamed from: g */
    private final RuleCertificateType f14851g;

    /* renamed from: h */
    private final Map<String, String> f14852h;

    /* renamed from: i */
    private final ZonedDateTime f14853i;

    /* renamed from: j */
    private final ZonedDateTime f14854j;

    /* renamed from: k */
    private final List<String> f14855k;

    /* renamed from: l */
    private final String f14856l;

    /* renamed from: m */
    private final String f14857m;

    /* renamed from: n */
    private final String f14858n;

    /* renamed from: o */
    private final String f14859o;

    public a(String str, b bVar, String str2, String str3, String str4, String str5, RuleCertificateType ruleCertificateType, Map<String, String> map, ZonedDateTime zonedDateTime, ZonedDateTime zonedDateTime2, List<String> list, String str6, String str7, String str8, String str9) {
        t.e(str, "identifier");
        t.e(bVar, "type");
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
        this.f14845a = str;
        this.f14846b = bVar;
        this.f14847c = str2;
        this.f14848d = str3;
        this.f14849e = str4;
        this.f14850f = str5;
        this.f14851g = ruleCertificateType;
        this.f14852h = map;
        this.f14853i = zonedDateTime;
        this.f14854j = zonedDateTime2;
        this.f14855k = list;
        this.f14856l = str6;
        this.f14857m = str7;
        this.f14858n = str8;
        this.f14859o = str9;
    }

    public final List<String> a() {
        return this.f14855k;
    }

    public final String b() {
        return this.f14857m;
    }

    public final Map<String, String> c() {
        return this.f14852h;
    }

    public final String d() {
        return this.f14849e;
    }

    public final String e() {
        return this.f14850f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return t.a(this.f14845a, aVar.f14845a) && this.f14846b == aVar.f14846b && t.a(this.f14847c, aVar.f14847c) && t.a(this.f14848d, aVar.f14848d) && t.a(this.f14849e, aVar.f14849e) && t.a(this.f14850f, aVar.f14850f) && this.f14851g == aVar.f14851g && t.a(this.f14852h, aVar.f14852h) && t.a(this.f14853i, aVar.f14853i) && t.a(this.f14854j, aVar.f14854j) && t.a(this.f14855k, aVar.f14855k) && t.a(this.f14856l, aVar.f14856l) && t.a(this.f14857m, aVar.f14857m) && t.a(this.f14858n, aVar.f14858n) && t.a(this.f14859o, aVar.f14859o);
    }

    public final String f() {
        return this.f14859o;
    }

    public final String g() {
        return this.f14845a;
    }

    public final String h() {
        return this.f14856l;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((((((((((this.f14845a.hashCode() * 31) + this.f14846b.hashCode()) * 31) + this.f14847c.hashCode()) * 31) + this.f14848d.hashCode()) * 31) + this.f14849e.hashCode()) * 31) + this.f14850f.hashCode()) * 31) + this.f14851g.hashCode()) * 31) + this.f14852h.hashCode()) * 31) + this.f14853i.hashCode()) * 31) + this.f14854j.hashCode()) * 31) + this.f14855k.hashCode()) * 31) + this.f14856l.hashCode()) * 31) + this.f14857m.hashCode()) * 31;
        String str = this.f14858n;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f14859o.hashCode();
    }

    public final String i() {
        return this.f14858n;
    }

    public final RuleCertificateType j() {
        return this.f14851g;
    }

    public final String k() {
        return this.f14848d;
    }

    public final b l() {
        return this.f14846b;
    }

    public final ZonedDateTime m() {
        return this.f14853i;
    }

    public final ZonedDateTime n() {
        return this.f14854j;
    }

    public final String o() {
        return this.f14847c;
    }

    public String toString() {
        String str = this.f14845a;
        b bVar = this.f14846b;
        String str2 = this.f14847c;
        String str3 = this.f14848d;
        String str4 = this.f14849e;
        String str5 = this.f14850f;
        RuleCertificateType ruleCertificateType = this.f14851g;
        Map<String, String> map = this.f14852h;
        ZonedDateTime zonedDateTime = this.f14853i;
        ZonedDateTime zonedDateTime2 = this.f14854j;
        List<String> list = this.f14855k;
        String str6 = this.f14856l;
        String str7 = this.f14857m;
        String str8 = this.f14858n;
        String str9 = this.f14859o;
        return "BoosterRule(identifier=" + str + ", type=" + bVar + ", version=" + str2 + ", schemaVersion=" + str3 + ", engine=" + str4 + ", engineVersion=" + str5 + ", ruleCertificateType=" + ruleCertificateType + ", descriptions=" + map + ", validFrom=" + zonedDateTime + ", validTo=" + zonedDateTime2 + ", affectedString=" + list + ", logic=" + str6 + ", countryCode=" + str7 + ", region=" + str8 + ", hash=" + str9 + ")";
    }
}
