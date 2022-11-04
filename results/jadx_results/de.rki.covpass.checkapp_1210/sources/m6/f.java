package m6;

import android.content.Intent;
import java.util.Arrays;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    private static final Pattern f16350a = Pattern.compile(",");

    /* renamed from: b */
    static final Set<h6.a> f16351b;

    /* renamed from: c */
    static final Set<h6.a> f16352c;

    /* renamed from: d */
    private static final Set<h6.a> f16353d;

    /* renamed from: e */
    static final Set<h6.a> f16354e;

    /* renamed from: f */
    static final Set<h6.a> f16355f;

    /* renamed from: g */
    static final Set<h6.a> f16356g;

    /* renamed from: h */
    static final Set<h6.a> f16357h;

    /* renamed from: i */
    private static final Map<String, Set<h6.a>> f16358i;

    static {
        EnumSet of2 = EnumSet.of(h6.a.QR_CODE);
        f16354e = of2;
        EnumSet of3 = EnumSet.of(h6.a.DATA_MATRIX);
        f16355f = of3;
        EnumSet of4 = EnumSet.of(h6.a.AZTEC);
        f16356g = of4;
        EnumSet of5 = EnumSet.of(h6.a.PDF_417);
        f16357h = of5;
        EnumSet of6 = EnumSet.of(h6.a.UPC_A, h6.a.UPC_E, h6.a.EAN_13, h6.a.EAN_8, h6.a.RSS_14, h6.a.RSS_EXPANDED);
        f16351b = of6;
        EnumSet of7 = EnumSet.of(h6.a.CODE_39, h6.a.CODE_93, h6.a.CODE_128, h6.a.ITF, h6.a.CODABAR);
        f16352c = of7;
        EnumSet copyOf = EnumSet.copyOf((Collection) of6);
        f16353d = copyOf;
        copyOf.addAll(of7);
        HashMap hashMap = new HashMap();
        f16358i = hashMap;
        hashMap.put("ONE_D_MODE", copyOf);
        hashMap.put("PRODUCT_MODE", of6);
        hashMap.put("QR_CODE_MODE", of2);
        hashMap.put("DATA_MATRIX_MODE", of3);
        hashMap.put("AZTEC_MODE", of4);
        hashMap.put("PDF417_MODE", of5);
    }

    public static Set<h6.a> a(Intent intent) {
        String stringExtra = intent.getStringExtra("SCAN_FORMATS");
        return b(stringExtra != null ? Arrays.asList(f16350a.split(stringExtra)) : null, intent.getStringExtra("SCAN_MODE"));
    }

    private static Set<h6.a> b(Iterable<String> iterable, String str) {
        if (iterable != null) {
            EnumSet noneOf = EnumSet.noneOf(h6.a.class);
            try {
                for (String str2 : iterable) {
                    noneOf.add(h6.a.valueOf(str2));
                }
                return noneOf;
            } catch (IllegalArgumentException unused) {
            }
        }
        if (str != null) {
            return f16358i.get(str);
        }
        return null;
    }
}
