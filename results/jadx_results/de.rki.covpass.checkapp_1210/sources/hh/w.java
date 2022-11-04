package hh;

import gg.a2;
import gg.q1;
import gg.t1;
import java.io.IOException;
import java.util.StringTokenizer;
/* loaded from: classes3.dex */
public class w extends gg.t implements gg.f {

    /* renamed from: c */
    private gg.g f12080c;

    /* renamed from: d */
    private int f12081d;

    public w(int i10, gg.g gVar) {
        this.f12080c = gVar;
        this.f12081d = i10;
    }

    public w(int i10, String str) {
        gg.g gVar;
        this.f12081d = i10;
        if (i10 == 1 || i10 == 2 || i10 == 6) {
            gVar = new q1(str);
        } else if (i10 == 8) {
            gVar = new gg.v(str);
        } else if (i10 != 4) {
            if (i10 != 7) {
                throw new IllegalArgumentException("can't process String for tag: " + i10);
            }
            byte[] z10 = z(str);
            if (z10 == null) {
                throw new IllegalArgumentException("IP Address is invalid");
            }
            this.f12080c = new t1(z10);
            return;
        } else {
            gVar = new fh.c(str);
        }
        this.f12080c = gVar;
    }

    public w(fh.c cVar) {
        this.f12080c = cVar;
        this.f12081d = 4;
    }

    private void l(int[] iArr, byte[] bArr, int i10) {
        for (int i11 = 0; i11 != iArr.length; i11++) {
            int i12 = i11 * 2;
            bArr[i12 + i10] = (byte) (iArr[i11] >> 8);
            bArr[i12 + 1 + i10] = (byte) iArr[i11];
        }
    }

    public static w m(gg.j0 j0Var, boolean z10) {
        return n(gg.j0.M(j0Var, true));
    }

    public static w n(Object obj) {
        if (obj == null || (obj instanceof w)) {
            return (w) obj;
        }
        if (!(obj instanceof gg.j0)) {
            if (obj instanceof byte[]) {
                try {
                    return n(gg.a0.u((byte[]) obj));
                } catch (IOException unused) {
                    throw new IllegalArgumentException("unable to parse encoded general name");
                }
            }
            throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
        }
        gg.j0 j0Var = (gg.j0) obj;
        int Q = j0Var.Q();
        switch (Q) {
            case 0:
            case 3:
            case 5:
                return new w(Q, gg.d0.E(j0Var, false));
            case 1:
            case 2:
            case 6:
                return new w(Q, gg.o.D(j0Var, false));
            case 4:
                return new w(Q, fh.c.m(j0Var, true));
            case 7:
                return new w(Q, gg.w.D(j0Var, false));
            case 8:
                return new w(Q, gg.v.J(j0Var, false));
            default:
                throw new IllegalArgumentException("unknown tag: " + Q);
        }
    }

    private void r(String str, byte[] bArr, int i10) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, "./");
        int i11 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            bArr[i11 + i10] = (byte) Integer.parseInt(stringTokenizer.nextToken());
            i11++;
        }
    }

    private void s(String str, byte[] bArr, int i10) {
        int parseInt = Integer.parseInt(str);
        for (int i11 = 0; i11 != parseInt; i11++) {
            int i12 = (i11 / 8) + i10;
            bArr[i12] = (byte) (bArr[i12] | (1 << (7 - (i11 % 8))));
        }
    }

    private int[] u(String str) {
        StringTokenizer stringTokenizer = new StringTokenizer(str, ":", true);
        int[] iArr = new int[8];
        if (str.charAt(0) == ':' && str.charAt(1) == ':') {
            stringTokenizer.nextToken();
        }
        int i10 = -1;
        int i11 = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String nextToken = stringTokenizer.nextToken();
            if (nextToken.equals(":")) {
                iArr[i11] = 0;
                int i12 = i11;
                i11++;
                i10 = i12;
            } else if (nextToken.indexOf(46) < 0) {
                int i13 = i11 + 1;
                iArr[i11] = Integer.parseInt(nextToken, 16);
                if (stringTokenizer.hasMoreTokens()) {
                    stringTokenizer.nextToken();
                }
                i11 = i13;
            } else {
                StringTokenizer stringTokenizer2 = new StringTokenizer(nextToken, ".");
                int i14 = i11 + 1;
                iArr[i11] = (Integer.parseInt(stringTokenizer2.nextToken()) << 8) | Integer.parseInt(stringTokenizer2.nextToken());
                i11 = i14 + 1;
                iArr[i14] = Integer.parseInt(stringTokenizer2.nextToken()) | (Integer.parseInt(stringTokenizer2.nextToken()) << 8);
            }
        }
        if (i11 != 8) {
            int i15 = i11 - i10;
            int i16 = 8 - i15;
            System.arraycopy(iArr, i10, iArr, i16, i15);
            while (i10 != i16) {
                iArr[i10] = 0;
                i10++;
            }
        }
        return iArr;
    }

    private int[] w(String str) {
        int[] iArr = new int[8];
        int parseInt = Integer.parseInt(str);
        for (int i10 = 0; i10 != parseInt; i10++) {
            int i11 = i10 / 16;
            iArr[i11] = iArr[i11] | (1 << (15 - (i10 % 16)));
        }
        return iArr;
    }

    private byte[] z(String str) {
        if (ak.f.e(str) || ak.f.d(str)) {
            int indexOf = str.indexOf(47);
            if (indexOf < 0) {
                byte[] bArr = new byte[16];
                l(u(str), bArr, 0);
                return bArr;
            }
            byte[] bArr2 = new byte[32];
            l(u(str.substring(0, indexOf)), bArr2, 0);
            String substring = str.substring(indexOf + 1);
            l(substring.indexOf(58) > 0 ? u(substring) : w(substring), bArr2, 16);
            return bArr2;
        } else if (!ak.f.c(str) && !ak.f.b(str)) {
            return null;
        } else {
            int indexOf2 = str.indexOf(47);
            if (indexOf2 < 0) {
                byte[] bArr3 = new byte[4];
                r(str, bArr3, 0);
                return bArr3;
            }
            byte[] bArr4 = new byte[8];
            r(str.substring(0, indexOf2), bArr4, 0);
            String substring2 = str.substring(indexOf2 + 1);
            if (substring2.indexOf(46) > 0) {
                r(substring2, bArr4, 4);
            } else {
                s(substring2, bArr4, 4);
            }
            return bArr4;
        }
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        int i10 = this.f12081d;
        return new a2(i10 == 4, i10, this.f12080c);
    }

    public gg.g o() {
        return this.f12080c;
    }

    public int q() {
        return this.f12081d;
    }

    public String toString() {
        String str;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(this.f12081d);
        stringBuffer.append(": ");
        int i10 = this.f12081d;
        if (i10 != 1 && i10 != 2) {
            if (i10 == 4) {
                str = fh.c.n(this.f12080c).toString();
            } else if (i10 != 6) {
                str = this.f12080c.toString();
            }
            stringBuffer.append(str);
            return stringBuffer.toString();
        }
        str = gg.o.E(this.f12080c).c();
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
