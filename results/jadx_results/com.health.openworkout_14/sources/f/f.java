package f;

import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
/* loaded from: classes.dex */
public class f implements Serializable, Comparable<f> {

    /* renamed from: e */
    static final char[] f4439e = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: f */
    public static final f f4440f = m(new byte[0]);

    /* renamed from: b */
    final byte[] f4441b;

    /* renamed from: c */
    transient int f4442c;

    /* renamed from: d */
    transient String f4443d;

    public f(byte[] bArr) {
        this.f4441b = bArr;
    }

    static int e(String str, int i) {
        int length = str.length();
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            if (i3 == i) {
                return i2;
            }
            int codePointAt = str.codePointAt(i2);
            if ((Character.isISOControl(codePointAt) && codePointAt != 10 && codePointAt != 13) || codePointAt == 65533) {
                return -1;
            }
            i3++;
            i2 += Character.charCount(codePointAt);
        }
        return str.length();
    }

    public static f g(String str) {
        if (str != null) {
            if (str.length() % 2 != 0) {
                throw new IllegalArgumentException("Unexpected hex string: " + str);
            }
            int length = str.length() / 2;
            byte[] bArr = new byte[length];
            for (int i = 0; i < length; i++) {
                int i2 = i * 2;
                bArr[i] = (byte) ((h(str.charAt(i2)) << 4) + h(str.charAt(i2 + 1)));
            }
            return m(bArr);
        }
        throw new IllegalArgumentException("hex == null");
    }

    private static int h(char c2) {
        if (c2 < '0' || c2 > '9') {
            char c3 = 'a';
            if (c2 < 'a' || c2 > 'f') {
                c3 = 'A';
                if (c2 < 'A' || c2 > 'F') {
                    throw new IllegalArgumentException("Unexpected hex digit: " + c2);
                }
            }
            return (c2 - c3) + 10;
        }
        return c2 - '0';
    }

    private f i(String str) {
        try {
            return m(MessageDigest.getInstance(str).digest(this.f4441b));
        } catch (NoSuchAlgorithmException e2) {
            throw new AssertionError(e2);
        }
    }

    public static f j(String str) {
        if (str != null) {
            f fVar = new f(str.getBytes(v.f4485a));
            fVar.f4443d = str;
            return fVar;
        }
        throw new IllegalArgumentException("s == null");
    }

    public static f m(byte... bArr) {
        if (bArr != null) {
            return new f((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public String a() {
        return b.a(this.f4441b);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            int r = fVar.r();
            byte[] bArr = this.f4441b;
            if (r == bArr.length && fVar.o(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public int compareTo(f fVar) {
        int r = r();
        int r2 = fVar.r();
        int min = Math.min(r, r2);
        for (int i = 0; i < min; i++) {
            int k = k(i) & 255;
            int k2 = fVar.k(i) & 255;
            if (k != k2) {
                return k < k2 ? -1 : 1;
            }
        }
        if (r == r2) {
            return 0;
        }
        return r < r2 ? -1 : 1;
    }

    public int hashCode() {
        int i = this.f4442c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f4441b);
        this.f4442c = hashCode;
        return hashCode;
    }

    public byte k(int i) {
        return this.f4441b[i];
    }

    public String l() {
        byte[] bArr = this.f4441b;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b2 : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f4439e;
            cArr[i] = cArr2[(b2 >> 4) & 15];
            i = i2 + 1;
            cArr[i2] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public boolean n(int i, f fVar, int i2, int i3) {
        return fVar.o(i2, this.f4441b, i, i3);
    }

    public boolean o(int i, byte[] bArr, int i2, int i3) {
        if (i >= 0) {
            byte[] bArr2 = this.f4441b;
            if (i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && v.a(bArr2, i, bArr, i2, i3)) {
                return true;
            }
        }
        return false;
    }

    public f p() {
        return i("SHA-1");
    }

    public f q() {
        return i("SHA-256");
    }

    public int r() {
        return this.f4441b.length;
    }

    public final boolean s(f fVar) {
        return n(0, fVar, 0, fVar.r());
    }

    public f t(int i, int i2) {
        if (i >= 0) {
            byte[] bArr = this.f4441b;
            if (i2 > bArr.length) {
                throw new IllegalArgumentException("endIndex > length(" + this.f4441b.length + ")");
            }
            int i3 = i2 - i;
            if (i3 < 0) {
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            if (i == 0 && i2 == bArr.length) {
                return this;
            }
            byte[] bArr2 = new byte[i3];
            System.arraycopy(bArr, i, bArr2, 0, i3);
            return new f(bArr2);
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public String toString() {
        StringBuilder sb;
        StringBuilder sb2;
        if (this.f4441b.length == 0) {
            return "[size=0]";
        }
        String w = w();
        int e2 = e(w, 64);
        if (e2 == -1) {
            if (this.f4441b.length <= 64) {
                sb2 = new StringBuilder();
                sb2.append("[hex=");
                sb2.append(l());
                sb2.append("]");
            } else {
                sb2 = new StringBuilder();
                sb2.append("[size=");
                sb2.append(this.f4441b.length);
                sb2.append(" hex=");
                sb2.append(t(0, 64).l());
                sb2.append("…]");
            }
            return sb2.toString();
        }
        String replace = w.substring(0, e2).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (e2 < w.length()) {
            sb = new StringBuilder();
            sb.append("[size=");
            sb.append(this.f4441b.length);
            sb.append(" text=");
            sb.append(replace);
            sb.append("…]");
        } else {
            sb = new StringBuilder();
            sb.append("[text=");
            sb.append(replace);
            sb.append("]");
        }
        return sb.toString();
    }

    public f u() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f4441b;
            if (i < bArr.length) {
                byte b2 = bArr[i];
                if (b2 >= 65 && b2 <= 90) {
                    byte[] bArr2 = (byte[]) bArr.clone();
                    bArr2[i] = (byte) (b2 + 32);
                    for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                        byte b3 = bArr2[i2];
                        if (b3 >= 65 && b3 <= 90) {
                            bArr2[i2] = (byte) (b3 + 32);
                        }
                    }
                    return new f(bArr2);
                }
                i++;
            } else {
                return this;
            }
        }
    }

    public byte[] v() {
        return (byte[]) this.f4441b.clone();
    }

    public String w() {
        String str = this.f4443d;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f4441b, v.f4485a);
        this.f4443d = str2;
        return str2;
    }

    public void x(c cVar) {
        byte[] bArr = this.f4441b;
        cVar.B0(bArr, 0, bArr.length);
    }
}
