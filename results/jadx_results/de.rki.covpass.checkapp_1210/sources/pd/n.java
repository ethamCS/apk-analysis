package pd;

import pd.l;
/* loaded from: classes.dex */
final class n implements m<l> {

    /* renamed from: a */
    public static final n f19129a = new n();

    /* loaded from: classes.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f19130a;

        static {
            int[] iArr = new int[uc.i.values().length];
            iArr[uc.i.BOOLEAN.ordinal()] = 1;
            iArr[uc.i.CHAR.ordinal()] = 2;
            iArr[uc.i.BYTE.ordinal()] = 3;
            iArr[uc.i.SHORT.ordinal()] = 4;
            iArr[uc.i.INT.ordinal()] = 5;
            iArr[uc.i.FLOAT.ordinal()] = 6;
            iArr[uc.i.LONG.ordinal()] = 7;
            iArr[uc.i.DOUBLE.ordinal()] = 8;
            f19130a = iArr;
        }
    }

    private n() {
    }

    /* renamed from: g */
    public l d(l lVar) {
        hc.t.e(lVar, "possiblyPrimitiveType");
        if (lVar instanceof l.d) {
            l.d dVar = (l.d) lVar;
            if (dVar.i() == null) {
                return lVar;
            }
            String f10 = fe.d.c(dVar.i().s()).f();
            hc.t.d(f10, "byFqNameWithoutInnerClas…apperFqName).internalName");
            return b(f10);
        }
        return lVar;
    }

    /* renamed from: h */
    public l a(String str) {
        fe.e eVar;
        l cVar;
        hc.t.e(str, "representation");
        str.length();
        char charAt = str.charAt(0);
        fe.e[] values = fe.e.values();
        int length = values.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                eVar = null;
                break;
            }
            eVar = values[i10];
            if (eVar.j().charAt(0) == charAt) {
                break;
            }
            i10++;
        }
        if (eVar != null) {
            return new l.d(eVar);
        }
        if (charAt == 'V') {
            return new l.d(null);
        }
        if (charAt == '[') {
            String substring = str.substring(1);
            hc.t.d(substring, "this as java.lang.String).substring(startIndex)");
            cVar = new l.a(a(substring));
        } else {
            if (charAt == 'L') {
                bf.y.Q(str, ';', false, 2, null);
            }
            String substring2 = str.substring(1, str.length() - 1);
            hc.t.d(substring2, "this as java.lang.String…ing(startIndex, endIndex)");
            cVar = new l.c(substring2);
        }
        return cVar;
    }

    /* renamed from: i */
    public l.c b(String str) {
        hc.t.e(str, "internalName");
        return new l.c(str);
    }

    /* renamed from: j */
    public l f(uc.i iVar) {
        hc.t.e(iVar, "primitiveType");
        switch (a.f19130a[iVar.ordinal()]) {
            case 1:
                return l.Companion.a();
            case 2:
                return l.Companion.c();
            case 3:
                return l.Companion.b();
            case 4:
                return l.Companion.h();
            case 5:
                return l.Companion.f();
            case 6:
                return l.Companion.e();
            case 7:
                return l.Companion.g();
            case 8:
                return l.Companion.d();
            default:
                throw new tb.p();
        }
    }

    /* renamed from: k */
    public l e() {
        return b("java/lang/Class");
    }

    /* renamed from: l */
    public String c(l lVar) {
        StringBuilder sb2;
        String j10;
        hc.t.e(lVar, "type");
        if (lVar instanceof l.a) {
            sb2 = new StringBuilder();
            sb2.append('[');
            sb2.append(c(((l.a) lVar).i()));
        } else if (lVar instanceof l.d) {
            fe.e i10 = ((l.d) lVar).i();
            return (i10 == null || (j10 = i10.j()) == null) ? "V" : j10;
        } else if (!(lVar instanceof l.c)) {
            throw new tb.p();
        } else {
            sb2 = new StringBuilder();
            sb2.append('L');
            sb2.append(((l.c) lVar).i());
            sb2.append(';');
        }
        return sb2.toString();
    }
}
