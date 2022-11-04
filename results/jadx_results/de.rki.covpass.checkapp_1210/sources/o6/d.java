package o6;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public enum d {
    Cp437(new int[]{0, 2}, new String[0]),
    ISO8859_1(new int[]{1, 3}, "ISO-8859-1"),
    ISO8859_2(4, "ISO-8859-2"),
    ISO8859_3(5, "ISO-8859-3"),
    ISO8859_4(6, "ISO-8859-4"),
    ISO8859_5(7, "ISO-8859-5"),
    ISO8859_6(8, "ISO-8859-6"),
    ISO8859_7(9, "ISO-8859-7"),
    ISO8859_8(10, "ISO-8859-8"),
    ISO8859_9(11, "ISO-8859-9"),
    ISO8859_10(12, "ISO-8859-10"),
    ISO8859_11(13, "ISO-8859-11"),
    ISO8859_13(15, "ISO-8859-13"),
    ISO8859_14(16, "ISO-8859-14"),
    ISO8859_15(17, "ISO-8859-15"),
    ISO8859_16(18, "ISO-8859-16"),
    SJIS(20, "Shift_JIS"),
    Cp1250(21, "windows-1250"),
    Cp1251(22, "windows-1251"),
    Cp1252(23, "windows-1252"),
    Cp1256(24, "windows-1256"),
    UnicodeBigUnmarked(25, "UTF-16BE", "UnicodeBig"),
    UTF8(26, "UTF-8"),
    ASCII(new int[]{27, 170}, "US-ASCII"),
    Big5(28),
    GB18030(29, "GB2312", "EUC_CN", "GBK"),
    EUC_KR(30, "EUC-KR");
    

    /* renamed from: s4 */
    private static final Map<Integer, d> f17574s4 = new HashMap();

    /* renamed from: t4 */
    private static final Map<String, d> f17575t4 = new HashMap();

    /* renamed from: c */
    private final int[] f17579c;

    /* renamed from: d */
    private final String[] f17580d;

    static {
        d[] values;
        for (d dVar : values()) {
            for (int i10 : dVar.f17579c) {
                f17574s4.put(Integer.valueOf(i10), dVar);
            }
            f17575t4.put(dVar.name(), dVar);
            for (String str : dVar.f17580d) {
                f17575t4.put(str, dVar);
            }
        }
    }

    d(int i10) {
        this(new int[]{i10}, new String[0]);
    }

    d(int i10, String... strArr) {
        this.f17579c = new int[]{i10};
        this.f17580d = strArr;
    }

    d(int[] iArr, String... strArr) {
        this.f17579c = iArr;
        this.f17580d = strArr;
    }

    public static d b(String str) {
        return f17575t4.get(str);
    }

    public static d g(int i10) {
        if (i10 < 0 || i10 >= 900) {
            throw h6.h.b();
        }
        return f17574s4.get(Integer.valueOf(i10));
    }

    public int h() {
        return this.f17579c[0];
    }
}
