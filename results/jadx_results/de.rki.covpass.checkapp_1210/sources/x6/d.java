package x6;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
/* loaded from: classes.dex */
public final class d extends s {

    /* loaded from: classes.dex */
    public enum a {
        UNCODABLE,
        ONE_DIGIT,
        TWO_DIGITS,
        FNC_1
    }

    private static int h(CharSequence charSequence, int i10, int i11) {
        a i12;
        a i13;
        char charAt;
        a i14 = i(charSequence, i10);
        a aVar = a.ONE_DIGIT;
        if (i14 == aVar) {
            return i11 == 101 ? 101 : 100;
        }
        a aVar2 = a.UNCODABLE;
        if (i14 == aVar2) {
            return (i10 >= charSequence.length() || ((charAt = charSequence.charAt(i10)) >= ' ' && (i11 != 101 || (charAt >= '`' && (charAt < 241 || charAt > 244))))) ? 100 : 101;
        } else if (i11 == 101 && i14 == a.FNC_1) {
            return 101;
        } else {
            if (i11 == 99) {
                return 99;
            }
            if (i11 != 100) {
                if (i14 == a.FNC_1) {
                    i14 = i(charSequence, i10 + 1);
                }
                return i14 == a.TWO_DIGITS ? 99 : 100;
            }
            a aVar3 = a.FNC_1;
            if (i14 == aVar3 || (i12 = i(charSequence, i10 + 2)) == aVar2 || i12 == aVar) {
                return 100;
            }
            if (i12 == aVar3) {
                return i(charSequence, i10 + 3) == a.TWO_DIGITS ? 99 : 100;
            }
            int i15 = i10 + 4;
            while (true) {
                i13 = i(charSequence, i15);
                if (i13 != a.TWO_DIGITS) {
                    break;
                }
                i15 += 2;
            }
            return i13 == a.ONE_DIGIT ? 100 : 99;
        }
    }

    private static a i(CharSequence charSequence, int i10) {
        int length = charSequence.length();
        if (i10 >= length) {
            return a.UNCODABLE;
        }
        char charAt = charSequence.charAt(i10);
        if (charAt == 241) {
            return a.FNC_1;
        }
        if (charAt < '0' || charAt > '9') {
            return a.UNCODABLE;
        }
        int i11 = i10 + 1;
        if (i11 >= length) {
            return a.ONE_DIGIT;
        }
        char charAt2 = charSequence.charAt(i11);
        return (charAt2 < '0' || charAt2 > '9') ? a.ONE_DIGIT : a.TWO_DIGITS;
    }

    @Override // x6.s
    public boolean[] d(String str) {
        int length = str.length();
        if (length <= 0 || length > 80) {
            throw new IllegalArgumentException("Contents length should be between 1 and 80 characters, but got ".concat(String.valueOf(length)));
        }
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            switch (charAt) {
                case 241:
                case 242:
                case 243:
                case 244:
                    break;
                default:
                    if (charAt > 127) {
                        throw new IllegalArgumentException("Bad character in input: ".concat(String.valueOf(charAt)));
                    }
                    break;
            }
        }
        ArrayList<int[]> arrayList = new ArrayList();
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 1;
        while (true) {
            int i16 = 103;
            if (i12 >= length) {
                int[][] iArr = c.f25402a;
                arrayList.add(iArr[i13 % 103]);
                arrayList.add(iArr[106]);
                int i17 = 0;
                for (int[] iArr2 : arrayList) {
                    for (int i18 : iArr2) {
                        i17 += i18;
                    }
                }
                boolean[] zArr = new boolean[i17];
                for (int[] iArr3 : arrayList) {
                    i10 += s.b(zArr, i10, iArr3, true);
                }
                return zArr;
            }
            int h10 = h(str, i12, i14);
            int i19 = 100;
            if (h10 == i14) {
                switch (str.charAt(i12)) {
                    case 241:
                        i19 = 102;
                        break;
                    case 242:
                        i19 = 97;
                        break;
                    case 243:
                        i19 = 96;
                        break;
                    case 244:
                        if (i14 == 101) {
                            i19 = 101;
                            break;
                        }
                        break;
                    default:
                        if (i14 != 100) {
                            if (i14 != 101) {
                                i19 = Integer.parseInt(str.substring(i12, i12 + 2));
                                i12++;
                                break;
                            } else {
                                i19 = str.charAt(i12) - ' ';
                                if (i19 < 0) {
                                    i19 += 96;
                                    break;
                                }
                            }
                        } else {
                            i19 = str.charAt(i12) - ' ';
                            break;
                        }
                        break;
                }
                i12++;
            } else {
                if (i14 != 0) {
                    i16 = h10;
                } else if (h10 == 100) {
                    i16 = 104;
                } else if (h10 != 101) {
                    i16 = 105;
                }
                i19 = i16;
                i14 = h10;
            }
            arrayList.add(c.f25402a[i19]);
            i13 += i19 * i15;
            if (i12 != 0) {
                i15++;
            }
        }
    }

    @Override // x6.s
    protected Collection<h6.a> f() {
        return Collections.singleton(h6.a.CODE_128);
    }
}
