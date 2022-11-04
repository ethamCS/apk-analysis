package e.a.a.g;
/* loaded from: classes.dex */
public class h {
    public static Integer a(Object obj) {
        int ordinal;
        int i = 0;
        if (obj != null) {
            if (obj instanceof Number) {
                ordinal = ((Number) obj).intValue();
            } else if (!(obj instanceof Enum)) {
                if (!(obj instanceof String)) {
                    return i;
                }
                try {
                    return Integer.valueOf((String) obj);
                } catch (Exception e2) {
                    e2.printStackTrace();
                    return i;
                }
            } else {
                ordinal = ((Enum) obj).ordinal();
            }
            return Integer.valueOf(ordinal);
        }
        return i;
    }

    public static Integer b(Object obj) {
        return c(obj, 0);
    }

    public static Integer c(Object obj, Object obj2) {
        return obj == null ? a(obj2) : a(obj);
    }

    public static Boolean d(Integer num, Integer num2, Integer num3) {
        return Boolean.valueOf(num.intValue() >= num2.intValue() && num.intValue() <= num3.intValue());
    }
}
