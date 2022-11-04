package kj;
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a */
    private int f15283a;

    /* renamed from: b */
    private int f15284b;

    /* renamed from: c */
    private int f15285c;

    /* renamed from: d */
    private short[][][] f15286d;

    /* renamed from: e */
    private short[][][] f15287e;

    /* renamed from: f */
    private short[][] f15288f;

    /* renamed from: g */
    private short[] f15289g;

    public a(byte b10, byte b11, short[][][] sArr, short[][][] sArr2, short[][] sArr3, short[] sArr4) {
        int i10 = b10 & 255;
        this.f15283a = i10;
        int i11 = b11 & 255;
        this.f15284b = i11;
        this.f15285c = i11 - i10;
        this.f15286d = sArr;
        this.f15287e = sArr2;
        this.f15288f = sArr3;
        this.f15289g = sArr4;
    }

    public short[][][] a() {
        return this.f15286d;
    }

    public short[][][] b() {
        return this.f15287e;
    }

    public short[] c() {
        return this.f15289g;
    }

    public short[][] d() {
        return this.f15288f;
    }

    public int e() {
        return this.f15285c;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f15283a == aVar.f() && this.f15284b == aVar.g() && this.f15285c == aVar.e() && lj.a.k(this.f15286d, aVar.a()) && lj.a.k(this.f15287e, aVar.b()) && lj.a.j(this.f15288f, aVar.d()) && lj.a.i(this.f15289g, aVar.c());
    }

    public int f() {
        return this.f15283a;
    }

    public int g() {
        return this.f15284b;
    }

    public int hashCode() {
        return (((((((((((this.f15283a * 37) + this.f15284b) * 37) + this.f15285c) * 37) + ak.a.N(this.f15286d)) * 37) + ak.a.N(this.f15287e)) * 37) + ak.a.M(this.f15288f)) * 37) + ak.a.L(this.f15289g);
    }
}
