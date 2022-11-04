package l6;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b extends g {

    /* renamed from: c */
    private final short f15834c;

    /* renamed from: d */
    private final short f15835d;

    public b(g gVar, int i10, int i11) {
        super(gVar);
        this.f15834c = (short) i10;
        this.f15835d = (short) i11;
    }

    @Override // l6.g
    public void c(o6.a aVar, byte[] bArr) {
        int i10;
        int i11 = 0;
        while (true) {
            short s10 = this.f15835d;
            if (i11 < s10) {
                if (i11 == 0 || (i11 == 31 && s10 <= 62)) {
                    int i12 = 5;
                    aVar.d(31, 5);
                    short s11 = this.f15835d;
                    if (s11 > 62) {
                        i10 = s11 - 31;
                        i12 = 16;
                    } else if (i11 == 0) {
                        aVar.d(Math.min((int) s11, 31), 5);
                    } else {
                        i10 = s11 - 31;
                    }
                    aVar.d(i10, i12);
                }
                aVar.d(bArr[this.f15834c + i11], 8);
                i11++;
            } else {
                return;
            }
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append((int) this.f15834c);
        sb2.append("::");
        sb2.append((this.f15834c + this.f15835d) - 1);
        sb2.append('>');
        return sb2.toString();
    }
}
