package x6;

import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public abstract class s implements h6.u {

    /* renamed from: a */
    private static final Pattern f25435a = Pattern.compile("[0-9]+");

    public static int b(boolean[] zArr, int i10, int[] iArr, boolean z10) {
        int i11 = 0;
        for (int i12 : iArr) {
            int i13 = 0;
            while (i13 < i12) {
                zArr[i10] = z10;
                i13++;
                i10++;
            }
            i11 += i12;
            z10 = !z10;
        }
        return i11;
    }

    public static void c(String str) {
        if (f25435a.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("Input should only contain digits 0-9");
    }

    private static o6.b g(boolean[] zArr, int i10, int i11, int i12) {
        int length = zArr.length;
        int i13 = i12 + length;
        int max = Math.max(i10, i13);
        int max2 = Math.max(1, i11);
        int i14 = max / i13;
        int i15 = (max - (length * i14)) / 2;
        o6.b bVar = new o6.b(max, max2);
        int i16 = 0;
        while (i16 < length) {
            if (zArr[i16]) {
                bVar.p(i15, 0, i14, max2);
            }
            i16++;
            i15 += i14;
        }
        return bVar;
    }

    @Override // h6.u
    public o6.b a(String str, h6.a aVar, int i10, int i11, Map<h6.g, ?> map) {
        if (!str.isEmpty()) {
            if (i10 < 0 || i11 < 0) {
                throw new IllegalArgumentException("Negative size is not allowed. Input: " + i10 + 'x' + i11);
            }
            Collection<h6.a> f10 = f();
            if (f10 != null && !f10.contains(aVar)) {
                throw new IllegalArgumentException("Can only encode " + f10 + ", but got " + aVar);
            }
            int e10 = e();
            if (map != null) {
                h6.g gVar = h6.g.MARGIN;
                if (map.containsKey(gVar)) {
                    e10 = Integer.parseInt(map.get(gVar).toString());
                }
            }
            return g(d(str), i10, i11, e10);
        }
        throw new IllegalArgumentException("Found empty contents");
    }

    public abstract boolean[] d(String str);

    public int e() {
        return 10;
    }

    protected abstract Collection<h6.a> f();
}
