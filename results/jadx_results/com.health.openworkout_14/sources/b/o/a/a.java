package b.o.a;
/* loaded from: classes.dex */
public final class a implements e {

    /* renamed from: b */
    private final String f2658b;

    /* renamed from: c */
    private final Object[] f2659c;

    public a(String str) {
        this(str, null);
    }

    public a(String str, Object[] objArr) {
        this.f2658b = str;
        this.f2659c = objArr;
    }

    private static void b(d dVar, int i, Object obj) {
        long j;
        int byteValue;
        double doubleValue;
        if (obj == null) {
            dVar.J(i);
        } else if (obj instanceof byte[]) {
            dVar.H(i, (byte[]) obj);
        } else {
            if (obj instanceof Float) {
                doubleValue = ((Float) obj).floatValue();
            } else if (!(obj instanceof Double)) {
                if (obj instanceof Long) {
                    j = ((Long) obj).longValue();
                } else {
                    if (obj instanceof Integer) {
                        byteValue = ((Integer) obj).intValue();
                    } else if (obj instanceof Short) {
                        byteValue = ((Short) obj).shortValue();
                    } else if (obj instanceof Byte) {
                        byteValue = ((Byte) obj).byteValue();
                    } else if (obj instanceof String) {
                        dVar.v(i, (String) obj);
                        return;
                    } else if (!(obj instanceof Boolean)) {
                        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                    } else {
                        j = ((Boolean) obj).booleanValue() ? 1L : 0L;
                    }
                    j = byteValue;
                }
                dVar.x(i, j);
                return;
            } else {
                doubleValue = ((Double) obj).doubleValue();
            }
            dVar.L(i, doubleValue);
        }
    }

    public static void d(d dVar, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            Object obj = objArr[i];
            i++;
            b(dVar, i, obj);
        }
    }

    @Override // b.o.a.e
    public String a() {
        return this.f2658b;
    }

    @Override // b.o.a.e
    public void c(d dVar) {
        d(dVar, this.f2659c);
    }
}
