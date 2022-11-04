package u6;

import org.conscrypt.PSKKeyManager;
/* loaded from: classes.dex */
public class c implements g {
    private int b(h hVar, StringBuilder sb2, StringBuilder sb3, int i10) {
        int length = sb2.length();
        sb2.delete(length - i10, length);
        hVar.f23141f--;
        int c10 = c(hVar.c(), sb3);
        hVar.k();
        return c10;
    }

    private static String d(CharSequence charSequence) {
        int charAt = (charSequence.charAt(0) * 1600) + (charSequence.charAt(1) * '(') + charSequence.charAt(2) + 1;
        return new String(new char[]{(char) (charAt / PSKKeyManager.MAX_KEY_LENGTH_BYTES), (char) (charAt % PSKKeyManager.MAX_KEY_LENGTH_BYTES)});
    }

    public static void g(h hVar, StringBuilder sb2) {
        hVar.s(d(sb2));
        sb2.delete(0, 3);
    }

    @Override // u6.g
    public void a(h hVar) {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            if (!hVar.i()) {
                break;
            }
            char c10 = hVar.c();
            hVar.f23141f++;
            int c11 = c(c10, sb2);
            int a10 = hVar.a() + ((sb2.length() / 3) << 1);
            hVar.q(a10);
            int a11 = hVar.g().a() - a10;
            if (hVar.i()) {
                if (sb2.length() % 3 == 0 && j.n(hVar.d(), hVar.f23141f, e()) != e()) {
                    hVar.o(0);
                    break;
                }
            } else {
                StringBuilder sb3 = new StringBuilder();
                if (sb2.length() % 3 == 2 && a11 != 2) {
                    c11 = b(hVar, sb2, sb3, c11);
                }
                while (sb2.length() % 3 == 1) {
                    if (c11 > 3) {
                        c11 = b(hVar, sb2, sb3, c11);
                    } else if (a11 == 1) {
                        break;
                    } else {
                        c11 = b(hVar, sb2, sb3, c11);
                    }
                }
            }
        }
        f(hVar, sb2);
    }

    int c(char c10, StringBuilder sb2) {
        int i10;
        int i11;
        char c11;
        if (c10 == ' ') {
            c11 = 3;
        } else {
            if (c10 >= '0' && c10 <= '9') {
                i11 = (c10 - '0') + 4;
            } else if (c10 < 'A' || c10 > 'Z') {
                if (c10 < ' ') {
                    sb2.append((char) 0);
                } else {
                    if (c10 <= '/') {
                        sb2.append((char) 1);
                        i10 = c10 - '!';
                    } else if (c10 <= '@') {
                        sb2.append((char) 1);
                        i10 = (c10 - ':') + 15;
                    } else if (c10 <= '_') {
                        sb2.append((char) 1);
                        i10 = (c10 - '[') + 22;
                    } else if (c10 > 127) {
                        sb2.append("\u0001\u001e");
                        return c((char) (c10 - 128), sb2) + 2;
                    } else {
                        sb2.append((char) 2);
                        i10 = c10 - '`';
                    }
                    c10 = (char) i10;
                }
                sb2.append(c10);
                return 2;
            } else {
                i11 = (c10 - 'A') + 14;
            }
            c11 = (char) i11;
        }
        sb2.append(c11);
        return 1;
    }

    public int e() {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
        if (r8.i() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
        if (r8.i() != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void f(u6.h r8, java.lang.StringBuilder r9) {
        /*
            r7 = this;
            int r0 = r9.length()
            r1 = 3
            int r0 = r0 / r1
            r2 = 1
            int r0 = r0 << r2
            int r3 = r9.length()
            int r3 = r3 % r1
            int r4 = r8.a()
            int r4 = r4 + r0
            r8.q(r4)
            u6.k r0 = r8.g()
            int r0 = r0.a()
            int r0 = r0 - r4
            r4 = 0
            r5 = 254(0xfe, float:3.56E-43)
            r6 = 2
            if (r3 != r6) goto L3b
            r9.append(r4)
        L27:
            int r0 = r9.length()
            if (r0 < r1) goto L31
            g(r8, r9)
            goto L27
        L31:
            boolean r9 = r8.i()
            if (r9 == 0) goto L6d
        L37:
            r8.r(r5)
            goto L6d
        L3b:
            if (r0 != r2) goto L58
            if (r3 != r2) goto L58
        L3f:
            int r0 = r9.length()
            if (r0 < r1) goto L49
            g(r8, r9)
            goto L3f
        L49:
            boolean r9 = r8.i()
            if (r9 == 0) goto L52
            r8.r(r5)
        L52:
            int r9 = r8.f23141f
            int r9 = r9 - r2
            r8.f23141f = r9
            goto L6d
        L58:
            if (r3 != 0) goto L71
        L5a:
            int r2 = r9.length()
            if (r2 < r1) goto L64
            g(r8, r9)
            goto L5a
        L64:
            if (r0 > 0) goto L37
            boolean r9 = r8.i()
            if (r9 == 0) goto L6d
            goto L37
        L6d:
            r8.o(r4)
            return
        L71:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Unexpected case. Please report!"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: u6.c.f(u6.h, java.lang.StringBuilder):void");
    }
}
