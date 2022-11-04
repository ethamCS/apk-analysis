package oj;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes3.dex */
public final class x {

    /* renamed from: i */
    private static final Map<Integer, x> f18570i;

    /* renamed from: a */
    private final w f18571a;

    /* renamed from: b */
    private final int f18572b;

    /* renamed from: c */
    private final int f18573c;

    /* renamed from: d */
    private final gg.v f18574d;

    /* renamed from: e */
    private final int f18575e;

    /* renamed from: f */
    private final String f18576f;

    /* renamed from: g */
    private final int f18577g;

    /* renamed from: h */
    private final m f18578h;

    static {
        HashMap hashMap = new HashMap();
        Integer e10 = ak.g.e(1);
        gg.v vVar = ug.b.f23635c;
        hashMap.put(e10, new x(10, vVar));
        hashMap.put(ak.g.e(2), new x(16, vVar));
        hashMap.put(ak.g.e(3), new x(20, vVar));
        Integer e11 = ak.g.e(4);
        gg.v vVar2 = ug.b.f23639e;
        hashMap.put(e11, new x(10, vVar2));
        hashMap.put(ak.g.e(5), new x(16, vVar2));
        hashMap.put(ak.g.e(6), new x(20, vVar2));
        Integer e12 = ak.g.e(7);
        gg.v vVar3 = ug.b.f23655m;
        hashMap.put(e12, new x(10, vVar3));
        hashMap.put(ak.g.e(8), new x(16, vVar3));
        hashMap.put(ak.g.e(9), new x(20, vVar3));
        Integer e13 = ak.g.e(10);
        gg.v vVar4 = ug.b.f23657n;
        hashMap.put(e13, new x(10, vVar4));
        hashMap.put(ak.g.e(11), new x(16, vVar4));
        hashMap.put(ak.g.e(12), new x(20, vVar4));
        f18570i = Collections.unmodifiableMap(hashMap);
    }

    public x(int i10, gg.v vVar) {
        if (i10 >= 2) {
            Objects.requireNonNull(vVar, "digest == null");
            this.f18572b = i10;
            this.f18573c = a();
            String b10 = f.b(vVar);
            this.f18576f = b10;
            this.f18574d = vVar;
            m mVar = new m(vVar);
            this.f18578h = mVar;
            int c10 = mVar.c();
            this.f18577g = c10;
            int d10 = mVar.d();
            this.f18575e = d10;
            this.f18571a = e.c(b10, c10, d10, mVar.a(), i10);
            return;
        }
        throw new IllegalArgumentException("height must be >= 2");
    }

    public x(int i10, org.bouncycastle.crypto.r rVar) {
        this(i10, f.c(rVar.getAlgorithmName()));
    }

    private int a() {
        int i10 = 2;
        while (true) {
            int i11 = this.f18572b;
            if (i10 <= i11) {
                if ((i11 - i10) % 2 == 0) {
                    return i10;
                }
                i10++;
            } else {
                throw new IllegalStateException("should never happen...");
            }
        }
    }

    public static x k(int i10) {
        return f18570i.get(ak.g.e(i10));
    }

    public int b() {
        return this.f18572b;
    }

    public int c() {
        return this.f18573c;
    }

    public int d() {
        return this.f18578h.a();
    }

    public w e() {
        return this.f18571a;
    }

    public String f() {
        return this.f18576f;
    }

    public gg.v g() {
        return this.f18574d;
    }

    public int h() {
        return this.f18577g;
    }

    public k i() {
        return new k(this.f18578h);
    }

    public int j() {
        return this.f18575e;
    }
}
