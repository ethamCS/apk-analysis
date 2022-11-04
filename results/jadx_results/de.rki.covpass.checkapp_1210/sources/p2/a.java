package p2;
/* loaded from: classes.dex */
public class a {
    public static String a(int i10) {
        if (i10 != 170) {
            switch (i10) {
                case 0:
                case 2:
                    return "Cp437";
                case 1:
                case 3:
                    return "ISO8859_1";
                case 4:
                    return "ISO8859_2";
                case 5:
                    return "ISO8859_3";
                case 6:
                    return "ISO8859_4";
                case 7:
                    return "ISO8859_5";
                case 8:
                    return "ISO8859_6";
                case 9:
                    return "ISO8859_7";
                case 10:
                    return "ISO8859_8";
                case 11:
                    return "ISO8859_9";
                case 12:
                    return "ISO8859_10";
                case 13:
                    return "ISO8859_11";
                case 14:
                    return "ISO8859_12";
                case 15:
                    return "ISO8859_13";
                case 16:
                    return "ISO8859_14";
                case 17:
                    return "ISO8859_15";
                case 18:
                    return "ISO8859_16";
                default:
                    switch (i10) {
                        case 20:
                            return "SJIS";
                        case 21:
                            return "Cp1250";
                        case 22:
                            return "Cp1251";
                        case 23:
                            return "Cp1252";
                        case 24:
                            return "Cp1256";
                        case 25:
                            return "UnicodeBigUnmarked";
                        case 26:
                            return "UTF8";
                        case 27:
                            break;
                        case 28:
                            return "Big5";
                        case 29:
                            return "GB18030";
                        case 30:
                            return "EUC_KR";
                        default:
                            throw new IllegalArgumentException("Unknown ECI designator " + i10);
                    }
            }
        }
        return "ASCII";
    }

    public static boolean b(byte[] bArr) {
        int i10;
        int i11 = 0;
        while (i11 < bArr.length) {
            int i12 = bArr[i11] & 255;
            if ((i12 >> 3) == 30) {
                i10 = 4;
            } else if ((i12 >> 4) == 14) {
                i10 = 3;
            } else if ((i12 >> 5) != 6) {
                if ((i12 >> 7) != 0) {
                    break;
                }
                i10 = 1;
            } else {
                i10 = 2;
            }
            for (int i13 = 1; i13 < i10; i13++) {
                if (((bArr[i11 + i13] & 255) >> 6) != 2) {
                    return false;
                }
            }
            i11 += i10;
            if (i11 == bArr.length) {
                return true;
            }
        }
        return false;
    }
}
