package j$.time.format;

import j$.time.DateTimeException;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalQuery;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Set;
/* loaded from: classes2.dex */
public class v implements g {

    /* renamed from: c */
    private static volatile AbstractMap.SimpleImmutableEntry f13114c;

    /* renamed from: d */
    private static volatile AbstractMap.SimpleImmutableEntry f13115d;

    /* renamed from: a */
    private final TemporalQuery f13116a;

    /* renamed from: b */
    private final String f13117b;

    public v(TemporalQuery temporalQuery, String str) {
        this.f13116a = temporalQuery;
        this.f13117b = str;
    }

    private int c(x xVar, CharSequence charSequence, int i10, int i11, m mVar) {
        String upperCase = charSequence.toString().substring(i10, i11).toUpperCase();
        if (i11 >= charSequence.length() || charSequence.charAt(i11) == '0' || xVar.b(charSequence.charAt(i11), 'Z')) {
            xVar.n(ZoneId.of(upperCase));
            return i11;
        }
        x d10 = xVar.d();
        int d11 = mVar.d(d10, charSequence, i11);
        try {
            if (d11 >= 0) {
                xVar.n(ZoneId.ofOffset(upperCase, ZoneOffset.u((int) d10.j(ChronoField.OFFSET_SECONDS).longValue())));
                return d11;
            } else if (mVar == m.f13087d) {
                return ~i10;
            } else {
                xVar.n(ZoneId.of(upperCase));
                return i11;
            }
        } catch (DateTimeException unused) {
            return ~i10;
        }
    }

    public p a(x xVar) {
        Set a10 = j$.time.zone.f.a();
        int size = ((HashSet) a10).size();
        AbstractMap.SimpleImmutableEntry simpleImmutableEntry = xVar.k() ? f13114c : f13115d;
        if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
            synchronized (this) {
                try {
                    simpleImmutableEntry = xVar.k() ? f13114c : f13115d;
                    if (simpleImmutableEntry == null || ((Integer) simpleImmutableEntry.getKey()).intValue() != size) {
                        simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(Integer.valueOf(size), p.g(a10, xVar));
                        if (xVar.k()) {
                            f13114c = simpleImmutableEntry;
                        } else {
                            f13115d = simpleImmutableEntry;
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return (p) simpleImmutableEntry.getValue();
    }

    @Override // j$.time.format.g
    public boolean b(z zVar, StringBuilder sb2) {
        ZoneId zoneId = (ZoneId) zVar.f(this.f13116a);
        if (zoneId == null) {
            return false;
        }
        sb2.append(zoneId.p());
        return true;
    }

    @Override // j$.time.format.g
    public final int d(x xVar, CharSequence charSequence, int i10) {
        int i11;
        int length = charSequence.length();
        if (i10 <= length) {
            if (i10 == length) {
                return ~i10;
            }
            char charAt = charSequence.charAt(i10);
            if (charAt == '+' || charAt == '-') {
                return c(xVar, charSequence, i10, i10, m.f13087d);
            }
            int i12 = i10 + 2;
            if (length >= i12) {
                char charAt2 = charSequence.charAt(i10 + 1);
                if (xVar.b(charAt, 'U') && xVar.b(charAt2, 'T')) {
                    int i13 = i10 + 3;
                    return (length < i13 || !xVar.b(charSequence.charAt(i12), 'C')) ? c(xVar, charSequence, i10, i12, m.f13088e) : c(xVar, charSequence, i10, i13, m.f13088e);
                } else if (xVar.b(charAt, 'G') && length >= (i11 = i10 + 3) && xVar.b(charAt2, 'M') && xVar.b(charSequence.charAt(i12), 'T')) {
                    return c(xVar, charSequence, i10, i11, m.f13088e);
                }
            }
            p a10 = a(xVar);
            ParsePosition parsePosition = new ParsePosition(i10);
            String d10 = a10.d(charSequence, parsePosition);
            if (d10 != null) {
                xVar.n(ZoneId.of(d10));
                return parsePosition.getIndex();
            } else if (!xVar.b(charAt, 'Z')) {
                return ~i10;
            } else {
                xVar.n(ZoneOffset.UTC);
                return i10 + 1;
            }
        }
        throw new IndexOutOfBoundsException();
    }

    public final String toString() {
        return this.f13117b;
    }
}
