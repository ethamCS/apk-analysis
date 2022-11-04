package uc;

import hc.t;
/* JADX WARN: Init of enum U3 can be incorrect */
/* JADX WARN: Init of enum q can be incorrect */
/* JADX WARN: Init of enum x can be incorrect */
/* JADX WARN: Init of enum y can be incorrect */
/* loaded from: classes.dex */
public enum m {
    UBYTEARRAY(r1),
    USHORTARRAY(r1),
    UINTARRAY(r1),
    ULONGARRAY(r1);
    

    /* renamed from: c */
    private final wd.b f23521c;

    /* renamed from: d */
    private final wd.f f23522d;

    static {
        t.d(wd.b.e("kotlin/UByteArray"), "fromString(\"kotlin/UByteArray\")");
        t.d(wd.b.e("kotlin/UShortArray"), "fromString(\"kotlin/UShortArray\")");
        t.d(wd.b.e("kotlin/UIntArray"), "fromString(\"kotlin/UIntArray\")");
        t.d(wd.b.e("kotlin/ULongArray"), "fromString(\"kotlin/ULongArray\")");
    }

    m(wd.b bVar) {
        this.f23521c = bVar;
        wd.f j10 = bVar.j();
        t.d(j10, "classId.shortClassName");
        this.f23522d = j10;
    }

    public final wd.f g() {
        return this.f23522d;
    }
}
