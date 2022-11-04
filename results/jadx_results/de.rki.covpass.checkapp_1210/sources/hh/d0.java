package hh;
/* loaded from: classes3.dex */
public class d0 extends gg.t {

    /* renamed from: c */
    private gg.c f11949c;

    private d0(gg.c cVar) {
        this.f11949c = cVar;
    }

    public static d0 l(Object obj) {
        if (obj instanceof d0) {
            return (d0) obj;
        }
        if (obj == null) {
            return null;
        }
        return new d0(gg.c.F(obj));
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        return this.f11949c;
    }

    public String toString() {
        StringBuilder sb2;
        int i10;
        byte[] D = this.f11949c.D();
        if (D.length == 1) {
            sb2 = new StringBuilder();
            sb2.append("KeyUsage: 0x");
            i10 = D[0] & 255;
        } else {
            sb2 = new StringBuilder();
            sb2.append("KeyUsage: 0x");
            i10 = (D[0] & 255) | ((D[1] & 255) << 8);
        }
        sb2.append(Integer.toHexString(i10));
        return sb2.toString();
    }
}
