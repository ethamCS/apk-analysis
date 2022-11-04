package oj;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: e */
    private static final Map<Integer, r> f18543e;

    /* renamed from: a */
    private final w f18544a;

    /* renamed from: b */
    private final x f18545b;

    /* renamed from: c */
    private final int f18546c;

    /* renamed from: d */
    private final int f18547d;

    static {
        HashMap hashMap = new HashMap();
        Integer e10 = ak.g.e(1);
        gg.v vVar = ug.b.f23635c;
        hashMap.put(e10, new r(20, 2, vVar));
        hashMap.put(ak.g.e(2), new r(20, 4, vVar));
        hashMap.put(ak.g.e(3), new r(40, 2, vVar));
        hashMap.put(ak.g.e(4), new r(40, 4, vVar));
        hashMap.put(ak.g.e(5), new r(40, 8, vVar));
        hashMap.put(ak.g.e(6), new r(60, 3, vVar));
        hashMap.put(ak.g.e(7), new r(60, 6, vVar));
        hashMap.put(ak.g.e(8), new r(60, 12, vVar));
        Integer e11 = ak.g.e(9);
        gg.v vVar2 = ug.b.f23639e;
        hashMap.put(e11, new r(20, 2, vVar2));
        hashMap.put(ak.g.e(10), new r(20, 4, vVar2));
        hashMap.put(ak.g.e(11), new r(40, 2, vVar2));
        hashMap.put(ak.g.e(12), new r(40, 4, vVar2));
        hashMap.put(ak.g.e(13), new r(40, 8, vVar2));
        hashMap.put(ak.g.e(14), new r(60, 3, vVar2));
        hashMap.put(ak.g.e(15), new r(60, 6, vVar2));
        hashMap.put(ak.g.e(16), new r(60, 12, vVar2));
        Integer e12 = ak.g.e(17);
        gg.v vVar3 = ug.b.f23655m;
        hashMap.put(e12, new r(20, 2, vVar3));
        hashMap.put(ak.g.e(18), new r(20, 4, vVar3));
        hashMap.put(ak.g.e(19), new r(40, 2, vVar3));
        hashMap.put(ak.g.e(20), new r(40, 4, vVar3));
        hashMap.put(ak.g.e(21), new r(40, 8, vVar3));
        hashMap.put(ak.g.e(22), new r(60, 3, vVar3));
        hashMap.put(ak.g.e(23), new r(60, 6, vVar3));
        hashMap.put(ak.g.e(24), new r(60, 12, vVar3));
        Integer e13 = ak.g.e(25);
        gg.v vVar4 = ug.b.f23657n;
        hashMap.put(e13, new r(20, 2, vVar4));
        hashMap.put(ak.g.e(26), new r(20, 4, vVar4));
        hashMap.put(ak.g.e(27), new r(40, 2, vVar4));
        hashMap.put(ak.g.e(28), new r(40, 4, vVar4));
        hashMap.put(ak.g.e(29), new r(40, 8, vVar4));
        hashMap.put(ak.g.e(30), new r(60, 3, vVar4));
        hashMap.put(ak.g.e(31), new r(60, 6, vVar4));
        hashMap.put(ak.g.e(32), new r(60, 12, vVar4));
        f18543e = Collections.unmodifiableMap(hashMap);
    }

    public r(int i10, int i11, gg.v vVar) {
        this.f18546c = i10;
        this.f18547d = i11;
        this.f18545b = new x(j(i10, i11), vVar);
        this.f18544a = d.c(e(), f(), g(), c(), a(), i11);
    }

    public r(int i10, int i11, org.bouncycastle.crypto.r rVar) {
        this(i10, i11, f.c(rVar.getAlgorithmName()));
    }

    public static r i(int i10) {
        return f18543e.get(ak.g.e(i10));
    }

    private static int j(int i10, int i11) {
        if (i10 >= 2) {
            if (i10 % i11 != 0) {
                throw new IllegalArgumentException("layers must divide totalHeight without remainder");
            }
            int i12 = i10 / i11;
            if (i12 == 1) {
                throw new IllegalArgumentException("height / layers must be greater than 1");
            }
            return i12;
        }
        throw new IllegalArgumentException("totalHeight must be > 1");
    }

    public int a() {
        return this.f18546c;
    }

    public int b() {
        return this.f18547d;
    }

    protected int c() {
        return this.f18545b.d();
    }

    public w d() {
        return this.f18544a;
    }

    public String e() {
        return this.f18545b.f();
    }

    public int f() {
        return this.f18545b.h();
    }

    int g() {
        return this.f18545b.j();
    }

    public x h() {
        return this.f18545b;
    }
}
