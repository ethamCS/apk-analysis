package j$.time.format;

import j$.time.AbstractC0484a;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes2.dex */
public final class t implements g {

    /* renamed from: a */
    private final TemporalField f13108a;

    /* renamed from: b */
    private final E f13109b;

    /* renamed from: c */
    private final B f13110c;

    /* renamed from: d */
    private volatile l f13111d;

    public t(TemporalField temporalField, E e10, B b10) {
        this.f13108a = temporalField;
        this.f13109b = e10;
        this.f13110c = b10;
    }

    private l a() {
        if (this.f13111d == null) {
            this.f13111d = new l(this.f13108a, 1, 19, SignStyle.NORMAL);
        }
        return this.f13111d;
    }

    @Override // j$.time.format.g
    public final boolean b(z zVar, StringBuilder sb2) {
        String str;
        j$.time.chrono.f fVar;
        Long e10 = zVar.e(this.f13108a);
        if (e10 == null) {
            return false;
        }
        j$.time.chrono.e eVar = (j$.time.chrono.e) zVar.d().k(j$.time.temporal.n.f13173a);
        if (eVar != null && eVar != (fVar = j$.time.chrono.f.f13017a)) {
            B b10 = this.f13110c;
            TemporalField temporalField = this.f13108a;
            long longValue = e10.longValue();
            E e11 = this.f13109b;
            Locale c10 = zVar.c();
            Objects.requireNonNull(b10);
            str = (eVar == fVar || !(temporalField instanceof ChronoField)) ? b10.d(temporalField, longValue, e11, c10) : null;
        } else {
            str = this.f13110c.d(this.f13108a, e10.longValue(), this.f13109b, zVar.c());
        }
        if (str == null) {
            return a().b(zVar, sb2);
        }
        sb2.append(str);
        return true;
    }

    @Override // j$.time.format.g
    public final int d(x xVar, CharSequence charSequence, int i10) {
        Iterator it;
        int length = charSequence.length();
        if (i10 < 0 || i10 > length) {
            throw new IndexOutOfBoundsException();
        }
        Iterator it2 = null;
        E e10 = xVar.l() ? this.f13109b : null;
        j$.time.chrono.e h10 = xVar.h();
        j$.time.chrono.e eVar = j$.time.chrono.f.f13017a;
        if (h10 == eVar) {
            it = this.f13110c.e(this.f13108a, e10, xVar.i());
        } else {
            B b10 = this.f13110c;
            TemporalField temporalField = this.f13108a;
            Locale i11 = xVar.i();
            Objects.requireNonNull(b10);
            if (h10 == eVar || !(temporalField instanceof ChronoField)) {
                it2 = b10.e(temporalField, e10, i11);
            }
            it = it2;
        }
        if (it != null) {
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                String str = (String) entry.getKey();
                if (xVar.s(str, 0, charSequence, i10, str.length())) {
                    return xVar.o(this.f13108a, ((Long) entry.getValue()).longValue(), i10, str.length() + i10);
                }
            }
            if (xVar.l()) {
                return ~i10;
            }
        }
        return a().d(xVar, charSequence, i10);
    }

    public final String toString() {
        Object obj;
        StringBuilder sb2;
        if (this.f13109b == E.FULL) {
            sb2 = AbstractC0484a.b("Text(");
            obj = this.f13108a;
        } else {
            sb2 = AbstractC0484a.b("Text(");
            sb2.append(this.f13108a);
            sb2.append(",");
            obj = this.f13109b;
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }
}
