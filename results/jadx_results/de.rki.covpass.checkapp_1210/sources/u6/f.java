package u6;
/* loaded from: classes.dex */
public final class f implements g {
    private static void b(char c10, StringBuilder sb2) {
        if (c10 >= ' ' && c10 <= '?') {
            sb2.append(c10);
        } else if (c10 < '@' || c10 > '^') {
            j.e(c10);
        } else {
            sb2.append((char) (c10 - '@'));
        }
    }

    private static String c(CharSequence charSequence) {
        int length = charSequence.length();
        if (length != 0) {
            char c10 = 0;
            char charAt = charSequence.charAt(0);
            char charAt2 = length >= 2 ? charSequence.charAt(1) : (char) 0;
            char charAt3 = length >= 3 ? charSequence.charAt(2) : (char) 0;
            if (length >= 4) {
                c10 = charSequence.charAt(3);
            }
            int i10 = (charAt << 18) + (charAt2 << '\f') + (charAt3 << 6) + c10;
            char c11 = (char) ((i10 >> 8) & 255);
            char c12 = (char) (i10 & 255);
            StringBuilder sb2 = new StringBuilder(3);
            sb2.append((char) ((i10 >> 16) & 255));
            if (length >= 2) {
                sb2.append(c11);
            }
            if (length >= 3) {
                sb2.append(c12);
            }
            return sb2.toString();
        }
        throw new IllegalStateException("StringBuilder must not be empty");
    }

    private static void e(h hVar, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                return;
            }
            boolean z10 = true;
            if (length == 1) {
                hVar.p();
                int a10 = hVar.g().a() - hVar.a();
                int f10 = hVar.f();
                if (f10 > a10) {
                    hVar.q(hVar.a() + 1);
                    a10 = hVar.g().a() - hVar.a();
                }
                if (f10 <= a10 && a10 <= 2) {
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i10 = length - 1;
            String c10 = c(charSequence);
            if (!(!hVar.i()) || i10 > 2) {
                z10 = false;
            }
            if (i10 <= 2) {
                hVar.q(hVar.a() + i10);
                if (hVar.g().a() - hVar.a() >= 3) {
                    hVar.q(hVar.a() + c10.length());
                    z10 = false;
                }
            }
            if (z10) {
                hVar.k();
                hVar.f23141f -= i10;
            } else {
                hVar.s(c10);
            }
        } finally {
            hVar.o(0);
        }
    }

    @Override // u6.g
    public void a(h hVar) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!hVar.i()) {
                break;
            }
            b(hVar.c(), sb2);
            hVar.f23141f++;
            if (sb2.length() >= 4) {
                hVar.s(c(sb2));
                sb2.delete(0, 4);
                if (j.n(hVar.d(), hVar.f23141f, d()) != d()) {
                    hVar.o(0);
                    break;
                }
            }
        }
        sb2.append((char) 31);
        e(hVar, sb2);
    }

    public int d() {
        return 4;
    }
}
