package m1;
/* loaded from: classes.dex */
public final class a implements j {

    /* renamed from: c */
    private final String f16246c;

    /* renamed from: d */
    private final Object[] f16247d;

    public a(String str) {
        this(str, null);
    }

    public a(String str, Object[] objArr) {
        this.f16246c = str;
        this.f16247d = objArr;
    }

    private static void a(i iVar, int i10, Object obj) {
        long j10;
        int byteValue;
        double doubleValue;
        if (obj == null) {
            iVar.a0(i10);
        } else if (obj instanceof byte[]) {
            iVar.L0(i10, (byte[]) obj);
        } else {
            if (obj instanceof Float) {
                doubleValue = ((Float) obj).floatValue();
            } else if (!(obj instanceof Double)) {
                if (obj instanceof Long) {
                    j10 = ((Long) obj).longValue();
                } else {
                    if (obj instanceof Integer) {
                        byteValue = ((Integer) obj).intValue();
                    } else if (obj instanceof Short) {
                        byteValue = ((Short) obj).shortValue();
                    } else if (obj instanceof Byte) {
                        byteValue = ((Byte) obj).byteValue();
                    } else if (obj instanceof String) {
                        iVar.K(i10, (String) obj);
                        return;
                    } else if (!(obj instanceof Boolean)) {
                        throw new IllegalArgumentException("Cannot bind " + obj + " at index " + i10 + " Supported types: null, byte[], float, double, long, int, short, byte, string");
                    } else {
                        j10 = ((Boolean) obj).booleanValue() ? 1L : 0L;
                    }
                    j10 = byteValue;
                }
                iVar.A0(i10, j10);
                return;
            } else {
                doubleValue = ((Double) obj).doubleValue();
            }
            iVar.d0(i10, doubleValue);
        }
    }

    public static void c(i iVar, Object[] objArr) {
        if (objArr == null) {
            return;
        }
        int length = objArr.length;
        int i10 = 0;
        while (i10 < length) {
            Object obj = objArr[i10];
            i10++;
            a(iVar, i10, obj);
        }
    }

    @Override // m1.j
    public void b(i iVar) {
        c(iVar, this.f16247d);
    }

    @Override // m1.j
    public String e() {
        return this.f16246c;
    }
}
