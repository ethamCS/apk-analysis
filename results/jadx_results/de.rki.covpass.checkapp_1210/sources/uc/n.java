package uc;

import hc.t;
/* JADX WARN: Init of enum U3 can be incorrect */
/* JADX WARN: Init of enum V3 can be incorrect */
/* JADX WARN: Init of enum x can be incorrect */
/* JADX WARN: Init of enum y can be incorrect */
/* loaded from: classes.dex */
public enum n {
    UBYTE(r1),
    USHORT(r1),
    UINT(r1),
    ULONG(r1);
    

    /* renamed from: c */
    private final wd.b f23525c;

    /* renamed from: d */
    private final wd.f f23526d;

    /* renamed from: q */
    private final wd.b f23527q;

    static {
        t.d(wd.b.e("kotlin/UByte"), "fromString(\"kotlin/UByte\")");
        t.d(wd.b.e("kotlin/UShort"), "fromString(\"kotlin/UShort\")");
        t.d(wd.b.e("kotlin/UInt"), "fromString(\"kotlin/UInt\")");
        t.d(wd.b.e("kotlin/ULong"), "fromString(\"kotlin/ULong\")");
    }

    n(wd.b bVar) {
        this.f23525c = bVar;
        wd.f j10 = bVar.j();
        t.d(j10, "classId.shortClassName");
        this.f23526d = j10;
        wd.c h10 = bVar.h();
        this.f23527q = new wd.b(h10, wd.f.j(j10.b() + "Array"));
    }

    public final wd.b g() {
        return this.f23527q;
    }

    public final wd.b h() {
        return this.f23525c;
    }

    public final wd.f j() {
        return this.f23526d;
    }
}
