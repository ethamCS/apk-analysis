package com.google.crypto.tink.shaded.protobuf;
/* loaded from: classes.dex */
public final class f1 implements q0 {

    /* renamed from: a */
    private final s0 f7868a;

    /* renamed from: b */
    private final String f7869b;

    /* renamed from: c */
    private final Object[] f7870c;

    /* renamed from: d */
    private final int f7871d;

    public f1(s0 s0Var, String str, Object[] objArr) {
        char charAt;
        this.f7868a = s0Var;
        this.f7869b = str;
        this.f7870c = objArr;
        int charAt2 = str.charAt(0);
        if (charAt2 >= 55296) {
            int i10 = charAt2 & 8191;
            int i11 = 13;
            int i12 = 1;
            while (true) {
                int i13 = i12 + 1;
                charAt = str.charAt(i12);
                if (charAt < 55296) {
                    break;
                }
                i10 |= (charAt & 8191) << i11;
                i11 += 13;
                i12 = i13;
            }
            charAt2 = i10 | (charAt << i11);
        }
        this.f7871d = charAt2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public boolean a() {
        return (this.f7871d & 2) == 2;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public c1 b() {
        return (this.f7871d & 1) == 1 ? c1.PROTO2 : c1.PROTO3;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.q0
    public s0 c() {
        return this.f7868a;
    }

    public Object[] d() {
        return this.f7870c;
    }

    public String e() {
        return this.f7869b;
    }
}
