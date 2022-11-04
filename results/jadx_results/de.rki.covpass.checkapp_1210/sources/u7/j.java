package u7;
/* loaded from: classes.dex */
public final class j extends ArithmeticException {

    /* renamed from: c */
    private final Object f23239c;

    /* renamed from: d */
    private final c f23240d;

    /* renamed from: q */
    private final int f23241q;

    /* renamed from: x */
    private final int f23242x;

    public j(int i10, int i11, c cVar, Object obj) {
        super(b(i10));
        if ((i10 & i11) == i11) {
            this.f23241q = i11;
            this.f23242x = i10;
            this.f23240d = cVar == null ? null : cVar.a();
            this.f23239c = obj;
            return;
        }
        throw new IllegalArgumentException("flags doesn't include flag");
    }

    private static String b(int i10) {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (int i11 = 0; i11 < 32; i11++) {
            int i12 = 1 << i11;
            if ((i10 & i12) != 0) {
                if (!z10) {
                    sb2.append(", ");
                }
                sb2.append(i12 == 32 ? "Clamped" : i12 == 128 ? "DivideByZero" : i12 == 1 ? "Inexact" : i12 == 64 ? "Invalid" : i12 == 16 ? "Overflow" : i12 == 2 ? "Rounded" : i12 == 4 ? "Subnormal" : i12 == 8 ? "Underflow" : "Trap");
                z10 = false;
            }
        }
        return sb2.toString();
    }
}
