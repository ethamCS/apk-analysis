package oj;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes3.dex */
final class l implements w {

    /* renamed from: c */
    private static final Map<String, l> f18522c;

    /* renamed from: a */
    private final int f18523a;

    /* renamed from: b */
    private final String f18524b;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put(b("SHA-256", 32, 16, 67), new l(16777217, "WOTSP_SHA2-256_W16"));
        hashMap.put(b("SHA-512", 64, 16, 131), new l(33554434, "WOTSP_SHA2-512_W16"));
        hashMap.put(b("SHAKE128", 32, 16, 67), new l(50331651, "WOTSP_SHAKE128_W16"));
        hashMap.put(b("SHAKE256", 64, 16, 131), new l(67108868, "WOTSP_SHAKE256_W16"));
        f18522c = Collections.unmodifiableMap(hashMap);
    }

    private l(int i10, String str) {
        this.f18523a = i10;
        this.f18524b = str;
    }

    private static String b(String str, int i10, int i11, int i12) {
        Objects.requireNonNull(str, "algorithmName == null");
        return str + "-" + i10 + "-" + i11 + "-" + i12;
    }

    public static l c(String str, int i10, int i11, int i12) {
        Objects.requireNonNull(str, "algorithmName == null");
        return f18522c.get(b(str, i10, i11, i12));
    }

    @Override // oj.w
    public int a() {
        return this.f18523a;
    }

    public String toString() {
        return this.f18524b;
    }
}
