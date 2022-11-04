package dgca.verifier.app.engine.data;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010 \n\u0002\b\u0019\n\u0002\b\u0003\u0018\u00002\u00020\u0001B]\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\b\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"B]\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020#\u0012\u0018\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\b\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020#\u0012\u0006\u0010\u0017\u001a\u00020#\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0002¢\u0006\u0004\b!\u0010$R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R)\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0004\u001a\u0004\b\u0010\u0010\u0006R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0006R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0004\u001a\u0004\b\u0016\u0010\u0006R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0004\u001a\u0004\b\u0019\u0010\u0006R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0004\u001a\u0004\b\u001c\u0010\u0006R\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0004\u001a\u0004\b\u001f\u0010\u0006¨\u0006%"}, d2 = {"Ldgca/verifier/app/engine/data/ExternalParameter;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "a", "Ljava/lang/String;", "getValidationClock", "()Ljava/lang/String;", "validationClock", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "b", "Ljava/util/Map;", "getValueSets", "()Ljava/util/Map;", "valueSets", "c", "getCountryCode", "countryCode", "d", "getExp", "exp", "e", "getIat", "iat", "f", "getIssuerCountryCode", "issuerCountryCode", "g", "getKid", "kid", "h", "getRegion", "region", "<init>", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "j$/time/ZonedDateTime", "(Lj$/time/ZonedDateTime;Ljava/util/Map;Ljava/lang/String;Lj$/time/ZonedDateTime;Lj$/time/ZonedDateTime;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "covpass-dgc-certlogic_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class ExternalParameter {

    /* renamed from: a */
    private final String f8974a;

    /* renamed from: b */
    private final Map<String, List<String>> f8975b;

    /* renamed from: c */
    private final String f8976c;

    /* renamed from: d */
    private final String f8977d;

    /* renamed from: e */
    private final String f8978e;

    /* renamed from: f */
    private final String f8979f;

    /* renamed from: g */
    private final String f8980g;

    /* renamed from: h */
    private final String f8981h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ExternalParameter(j$.time.ZonedDateTime r12, java.util.Map<java.lang.String, ? extends java.util.List<java.lang.String>> r13, java.lang.String r14, j$.time.ZonedDateTime r15, j$.time.ZonedDateTime r16, java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
            r11 = this;
            r0 = r12
            java.lang.String r1 = "validationClock"
            hc.t.e(r12, r1)
            java.lang.String r1 = "valueSets"
            r4 = r13
            hc.t.e(r13, r1)
            java.lang.String r1 = "countryCode"
            r5 = r14
            hc.t.e(r14, r1)
            java.lang.String r1 = "exp"
            r2 = r15
            hc.t.e(r15, r1)
            java.lang.String r1 = "iat"
            r3 = r16
            hc.t.e(r3, r1)
            java.lang.String r1 = "issuerCountryCode"
            r8 = r17
            hc.t.e(r8, r1)
            java.lang.String r1 = "kid"
            r9 = r18
            hc.t.e(r9, r1)
            java.lang.String r1 = "region"
            r10 = r19
            hc.t.e(r10, r1)
            j$.time.format.DateTimeFormatter r1 = j$.time.format.DateTimeFormatter.ISO_OFFSET_DATE_TIME
            java.lang.String r0 = r1.format(r12)
            java.lang.String r1 = "ISO_OFFSET_DATE_TIME.format(validationClock)"
            hc.t.d(r0, r1)
            java.lang.String r6 = r15.toString()
            java.lang.String r1 = "exp.toString()"
            hc.t.d(r6, r1)
            java.lang.String r7 = r16.toString()
            java.lang.String r1 = "iat.toString()"
            hc.t.d(r7, r1)
            r2 = r11
            r3 = r0
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dgca.verifier.app.engine.data.ExternalParameter.<init>(j$.time.ZonedDateTime, java.util.Map, java.lang.String, j$.time.ZonedDateTime, j$.time.ZonedDateTime, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ExternalParameter(String str, Map<String, ? extends List<String>> map, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.f8974a = str;
        this.f8975b = map;
        this.f8976c = str2;
        this.f8977d = str3;
        this.f8978e = str4;
        this.f8979f = str5;
        this.f8980g = str6;
        this.f8981h = str7;
    }

    public final String getCountryCode() {
        return this.f8976c;
    }

    public final String getExp() {
        return this.f8977d;
    }

    public final String getIat() {
        return this.f8978e;
    }

    public final String getIssuerCountryCode() {
        return this.f8979f;
    }

    public final String getKid() {
        return this.f8980g;
    }

    public final String getRegion() {
        return this.f8981h;
    }

    public final String getValidationClock() {
        return this.f8974a;
    }

    public final Map<String, List<String>> getValueSets() {
        return this.f8975b;
    }
}
