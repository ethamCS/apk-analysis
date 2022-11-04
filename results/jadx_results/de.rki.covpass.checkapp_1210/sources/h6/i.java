package h6;
/* loaded from: classes.dex */
public final class i extends j {

    /* renamed from: c */
    private final j f11345c;

    public i(j jVar) {
        super(jVar.d(), jVar.a());
        this.f11345c = jVar;
    }

    @Override // h6.j
    public byte[] b() {
        byte[] b10 = this.f11345c.b();
        int d10 = d() * a();
        byte[] bArr = new byte[d10];
        for (int i10 = 0; i10 < d10; i10++) {
            bArr[i10] = (byte) (255 - (b10[i10] & 255));
        }
        return bArr;
    }

    @Override // h6.j
    public byte[] c(int i10, byte[] bArr) {
        byte[] c10 = this.f11345c.c(i10, bArr);
        int d10 = d();
        for (int i11 = 0; i11 < d10; i11++) {
            c10[i11] = (byte) (255 - (c10[i11] & 255));
        }
        return c10;
    }

    @Override // h6.j
    public j e() {
        return this.f11345c;
    }

    @Override // h6.j
    public boolean f() {
        return this.f11345c.f();
    }

    @Override // h6.j
    public j g() {
        return new i(this.f11345c.g());
    }
}
