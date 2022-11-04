package of;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u00070\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0017\u0010\t\u001a\u00020\u00078\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u00078G¢\u0006\u0006\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0012\u001a\u00020\u000f8G¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0017"}, d2 = {"Lof/h;", BuildConfig.FLAVOR, "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "hashCode", BuildConfig.FLAVOR, "toString", "scheme", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "b", "realm", "Ljava/nio/charset/Charset;", "a", "()Ljava/nio/charset/Charset;", "charset", BuildConfig.FLAVOR, "authParams", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "okhttp"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a */
    private final String f18176a;

    /* renamed from: b */
    private final Map<String, String> f18177b;

    public h(String str, Map<String, String> map) {
        String str2;
        hc.t.e(str, "scheme");
        hc.t.e(map, "authParams");
        this.f18176a = str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key == null) {
                str2 = null;
            } else {
                Locale locale = Locale.US;
                hc.t.d(locale, "US");
                str2 = key.toLowerCase(locale);
                hc.t.d(str2, "this as java.lang.String).toLowerCase(locale)");
            }
            linkedHashMap.put(str2, value);
        }
        Map<String, String> unmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        hc.t.d(unmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.f18177b = unmodifiableMap;
    }

    public final Charset a() {
        String str = this.f18177b.get("charset");
        if (str != null) {
            try {
                Charset forName = Charset.forName(str);
                hc.t.d(forName, "forName(charset)");
                return forName;
            } catch (Exception unused) {
            }
        }
        Charset charset = StandardCharsets.ISO_8859_1;
        hc.t.d(charset, "ISO_8859_1");
        return charset;
    }

    public final String b() {
        return this.f18177b.get("realm");
    }

    public final String c() {
        return this.f18176a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            if (hc.t.a(hVar.f18176a, this.f18176a) && hc.t.a(hVar.f18177b, this.f18177b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((899 + this.f18176a.hashCode()) * 31) + this.f18177b.hashCode();
    }

    public String toString() {
        return this.f18176a + " authParams=" + this.f18177b;
    }
}
