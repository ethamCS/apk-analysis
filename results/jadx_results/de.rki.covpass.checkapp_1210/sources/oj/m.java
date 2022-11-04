package oj;

import java.util.Objects;
/* loaded from: classes3.dex */
final class m {

    /* renamed from: a */
    private final w f18525a;

    /* renamed from: b */
    private final int f18526b;

    /* renamed from: c */
    private final int f18527c = 16;

    /* renamed from: d */
    private final int f18528d;

    /* renamed from: e */
    private final int f18529e;

    /* renamed from: f */
    private final int f18530f;

    /* renamed from: g */
    private final gg.v f18531g;

    public m(gg.v vVar) {
        Objects.requireNonNull(vVar, "treeDigest == null");
        this.f18531g = vVar;
        org.bouncycastle.crypto.r a10 = f.a(vVar);
        int h10 = a0.h(a10);
        this.f18526b = h10;
        int ceil = (int) Math.ceil((h10 * 8) / a0.o(16));
        this.f18529e = ceil;
        int floor = ((int) Math.floor(a0.o((16 - 1) * ceil) / a0.o(16))) + 1;
        this.f18530f = floor;
        int i10 = ceil + floor;
        this.f18528d = i10;
        l c10 = l.c(a10.getAlgorithmName(), h10, 16, i10);
        this.f18525a = c10;
        if (c10 != null) {
            return;
        }
        throw new IllegalArgumentException("cannot find OID for digest algorithm: " + a10.getAlgorithmName());
    }

    public int a() {
        return this.f18528d;
    }

    public gg.v b() {
        return this.f18531g;
    }

    public int c() {
        return this.f18526b;
    }

    public int d() {
        return this.f18527c;
    }
}
