package u6;

import org.conscrypt.PSKKeyManager;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    private static final int[] f23145a = {5, 7, 10, 11, 12, 14, 18, 20, 24, 28, 36, 42, 48, 56, 62, 68};

    /* renamed from: b */
    private static final int[][] f23146b = {new int[]{228, 48, 15, 111, 62}, new int[]{23, 68, 144, 134, 240, 92, 254}, new int[]{28, 24, 185, 166, 223, 248, 116, 255, androidx.constraintlayout.widget.i.E2, 61}, new int[]{175, 138, 205, 12, 194, 168, 39, 245, 60, 97, 120}, new int[]{41, 153, 158, 91, 61, 42, 142, 213, 97, 178, 100, 242}, new int[]{156, 97, 192, 252, 95, 9, 157, 119, 138, 45, 18, 186, 83, 185}, new int[]{83, 195, 100, 39, 188, 75, 66, 61, 241, 213, 109, 129, 94, 254, 225, 48, 90, 188}, new int[]{15, 195, 244, 9, 233, 71, 168, 2, 188, 160, 153, 145, 253, 79, 108, 82, 27, 174, 186, 172}, new int[]{52, 190, 88, 205, 109, 39, 176, 21, 155, 197, 251, 223, 155, 21, 5, 172, 254, e.j.K0, 12, 181, 184, 96, 50, 193}, new int[]{211, 231, 43, 97, 71, 96, 103, 174, 37, 151, 170, 53, 75, 34, 249, 121, 17, 138, androidx.constraintlayout.widget.i.E2, 213, 141, 136, 120, 151, 233, 168, 93, 255}, new int[]{245, 127, 242, 218, 130, 250, 162, 181, 102, 120, 84, 179, 220, 251, 80, 182, 229, 18, 2, 4, 68, 33, 101, 137, 95, 119, 115, 44, 175, 184, 59, 25, 225, 98, 81, 112}, new int[]{77, 193, 137, 31, 19, 38, 22, 153, 247, 105, 122, 2, 245, 133, 242, 8, 175, 95, 100, 9, 167, 105, 214, 111, 57, 121, 21, 1, 253, 57, 54, 101, 248, 202, 69, 50, 150, 177, 226, 5, 9, 5}, new int[]{245, 132, 172, 223, 96, 32, 117, 22, 238, 133, 238, 231, 205, 188, 237, 87, 191, 106, 16, 147, 118, 23, 37, 90, 170, 205, 131, 88, 120, 100, 66, 138, 186, 240, 82, 44, 176, 87, 187, 147, 160, 175, 69, 213, 92, 253, 225, 19}, new int[]{175, 9, 223, 238, 12, 17, 220, 208, 100, 29, 175, 170, 230, 192, 215, 235, 150, 159, 36, 223, 38, 200, 132, 54, 228, 146, 218, 234, 117, 203, 29, 232, 144, 238, 22, 150, 201, 117, 62, 207, 164, 13, 137, 245, 127, 67, 247, 28, 155, 43, 203, 107, 233, 53, 143, 46}, new int[]{242, 93, 169, 50, 144, 210, 39, 118, 202, 188, 201, 189, 143, 108, 196, 37, 185, 112, 134, 230, 245, 63, 197, 190, 250, 106, 185, 221, 175, 64, 114, 71, 161, 44, 147, 6, 27, 218, 51, 63, 87, 10, 40, 130, 188, 17, 163, 31, 176, 170, 4, 107, 232, 7, 94, 166, 224, e.j.K0, 86, 47, 11, 204}, new int[]{220, 228, 173, 89, 251, 149, 159, 56, 89, 33, 147, 244, 154, 36, 73, 127, 213, 136, 248, 180, 234, 197, 158, 177, 68, 122, 93, 213, 15, 160, 227, 236, 66, 139, 153, 185, 202, 167, 179, 25, 220, 232, 96, 210, 231, 136, 223, 239, 181, 241, 59, 52, 172, 25, 49, 232, 211, 189, 64, 54, 108, 153, 132, 63, 96, 103, 82, 186}};

    /* renamed from: c */
    private static final int[] f23147c = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* renamed from: d */
    private static final int[] f23148d = new int[255];

    static {
        int i10 = 1;
        for (int i11 = 0; i11 < 255; i11++) {
            f23148d[i11] = i10;
            f23147c[i10] = i11;
            i10 <<= 1;
            if (i10 >= 256) {
                i10 ^= 301;
            }
        }
    }

    private static String a(CharSequence charSequence, int i10) {
        int i11 = 0;
        while (true) {
            int[] iArr = f23145a;
            if (i11 >= iArr.length) {
                i11 = -1;
                break;
            } else if (iArr[i11] == i10) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            int[] iArr2 = f23146b[i11];
            char[] cArr = new char[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                cArr[i12] = 0;
            }
            for (int i13 = 0; i13 < charSequence.length(); i13++) {
                int i14 = i10 - 1;
                int charAt = cArr[i14] ^ charSequence.charAt(i13);
                while (i14 > 0) {
                    if (charAt == 0 || iArr2[i14] == 0) {
                        cArr[i14] = cArr[i14 - 1];
                    } else {
                        char c10 = cArr[i14 - 1];
                        int[] iArr3 = f23148d;
                        int[] iArr4 = f23147c;
                        cArr[i14] = (char) (c10 ^ iArr3[(iArr4[charAt] + iArr4[iArr2[i14]]) % 255]);
                    }
                    i14--;
                }
                if (charAt == 0 || iArr2[0] == 0) {
                    cArr[0] = 0;
                } else {
                    int[] iArr5 = f23148d;
                    int[] iArr6 = f23147c;
                    cArr[0] = (char) iArr5[(iArr6[charAt] + iArr6[iArr2[0]]) % 255];
                }
            }
            char[] cArr2 = new char[i10];
            for (int i15 = 0; i15 < i10; i15++) {
                cArr2[i15] = cArr[(i10 - i15) - 1];
            }
            return String.valueOf(cArr2);
        }
        throw new IllegalArgumentException("Illegal number of error correction codewords specified: ".concat(String.valueOf(i10)));
    }

    public static String b(String str, k kVar) {
        if (str.length() == kVar.a()) {
            StringBuilder sb2 = new StringBuilder(kVar.a() + kVar.c());
            sb2.append(str);
            int f10 = kVar.f();
            if (f10 == 1) {
                sb2.append(a(str, kVar.c()));
            } else {
                sb2.setLength(sb2.capacity());
                int[] iArr = new int[f10];
                int[] iArr2 = new int[f10];
                int i10 = 0;
                while (i10 < f10) {
                    int i11 = i10 + 1;
                    iArr[i10] = kVar.b(i11);
                    iArr2[i10] = kVar.d(i11);
                    i10 = i11;
                }
                for (int i12 = 0; i12 < f10; i12++) {
                    StringBuilder sb3 = new StringBuilder(iArr[i12]);
                    for (int i13 = i12; i13 < kVar.a(); i13 += f10) {
                        sb3.append(str.charAt(i13));
                    }
                    String a10 = a(sb3.toString(), iArr2[i12]);
                    int i14 = 0;
                    int i15 = i12;
                    while (i15 < iArr2[i12] * f10) {
                        sb2.setCharAt(kVar.a() + i15, a10.charAt(i14));
                        i15 += f10;
                        i14++;
                    }
                }
            }
            return sb2.toString();
        }
        throw new IllegalArgumentException("The number of codewords does not match the selected symbol");
    }
}
