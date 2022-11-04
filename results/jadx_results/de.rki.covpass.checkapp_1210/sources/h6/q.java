package h6;

import java.util.EnumMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a */
    private final String f11360a;

    /* renamed from: b */
    private final byte[] f11361b;

    /* renamed from: c */
    private final int f11362c;

    /* renamed from: d */
    private s[] f11363d;

    /* renamed from: e */
    private final a f11364e;

    /* renamed from: f */
    private Map<r, Object> f11365f;

    /* renamed from: g */
    private final long f11366g;

    public q(String str, byte[] bArr, int i10, s[] sVarArr, a aVar, long j10) {
        this.f11360a = str;
        this.f11361b = bArr;
        this.f11362c = i10;
        this.f11363d = sVarArr;
        this.f11364e = aVar;
        this.f11365f = null;
        this.f11366g = j10;
    }

    public q(String str, byte[] bArr, s[] sVarArr, a aVar) {
        this(str, bArr, sVarArr, aVar, System.currentTimeMillis());
    }

    public q(String str, byte[] bArr, s[] sVarArr, a aVar, long j10) {
        this(str, bArr, bArr == null ? 0 : bArr.length * 8, sVarArr, aVar, j10);
    }

    public void a(s[] sVarArr) {
        s[] sVarArr2 = this.f11363d;
        if (sVarArr2 == null) {
            this.f11363d = sVarArr;
        } else if (sVarArr == null || sVarArr.length <= 0) {
        } else {
            s[] sVarArr3 = new s[sVarArr2.length + sVarArr.length];
            System.arraycopy(sVarArr2, 0, sVarArr3, 0, sVarArr2.length);
            System.arraycopy(sVarArr, 0, sVarArr3, sVarArr2.length, sVarArr.length);
            this.f11363d = sVarArr3;
        }
    }

    public a b() {
        return this.f11364e;
    }

    public byte[] c() {
        return this.f11361b;
    }

    public Map<r, Object> d() {
        return this.f11365f;
    }

    public s[] e() {
        return this.f11363d;
    }

    public String f() {
        return this.f11360a;
    }

    public void g(Map<r, Object> map) {
        if (map != null) {
            Map<r, Object> map2 = this.f11365f;
            if (map2 == null) {
                this.f11365f = map;
            } else {
                map2.putAll(map);
            }
        }
    }

    public void h(r rVar, Object obj) {
        if (this.f11365f == null) {
            this.f11365f = new EnumMap(r.class);
        }
        this.f11365f.put(rVar, obj);
    }

    public String toString() {
        return this.f11360a;
    }
}
