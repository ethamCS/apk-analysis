package c.b.b;

import java.math.BigInteger;
/* loaded from: classes.dex */
public final class o extends j {

    /* renamed from: b */
    private static final Class<?>[] f460b = {Integer.TYPE, Long.TYPE, Short.TYPE, Float.TYPE, Double.TYPE, Byte.TYPE, Boolean.TYPE, Character.TYPE, Integer.class, Long.class, Short.class, Float.class, Double.class, Byte.class, Boolean.class, Character.class};

    /* renamed from: a */
    private Object f461a;

    public o(Boolean bool) {
        t(bool);
    }

    public o(Number number) {
        t(number);
    }

    public o(String str) {
        t(str);
    }

    private static boolean p(o oVar) {
        Object obj = oVar.f461a;
        if (obj instanceof Number) {
            Number number = (Number) obj;
            return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
        }
        return false;
    }

    private static boolean r(Object obj) {
        if (obj instanceof String) {
            return true;
        }
        Class<?> cls = obj.getClass();
        for (Class<?> cls2 : f460b) {
            if (cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o.class != obj.getClass()) {
            return false;
        }
        o oVar = (o) obj;
        if (this.f461a == null) {
            return oVar.f461a == null;
        } else if (p(this) && p(oVar)) {
            return m().longValue() == oVar.m().longValue();
        } else {
            Object obj2 = this.f461a;
            if (!(obj2 instanceof Number) || !(oVar.f461a instanceof Number)) {
                return obj2.equals(oVar.f461a);
            }
            double doubleValue = m().doubleValue();
            double doubleValue2 = oVar.m().doubleValue();
            if (doubleValue == doubleValue2) {
                return true;
            }
            return Double.isNaN(doubleValue) && Double.isNaN(doubleValue2);
        }
    }

    public boolean h() {
        return o() ? i().booleanValue() : Boolean.parseBoolean(n());
    }

    public int hashCode() {
        long doubleToLongBits;
        if (this.f461a == null) {
            return 31;
        }
        if (p(this)) {
            doubleToLongBits = m().longValue();
        } else {
            Object obj = this.f461a;
            if (!(obj instanceof Number)) {
                return obj.hashCode();
            }
            doubleToLongBits = Double.doubleToLongBits(m().doubleValue());
        }
        return (int) ((doubleToLongBits >>> 32) ^ doubleToLongBits);
    }

    Boolean i() {
        return (Boolean) this.f461a;
    }

    public double j() {
        return q() ? m().doubleValue() : Double.parseDouble(n());
    }

    public int k() {
        return q() ? m().intValue() : Integer.parseInt(n());
    }

    public long l() {
        return q() ? m().longValue() : Long.parseLong(n());
    }

    public Number m() {
        Object obj = this.f461a;
        return obj instanceof String ? new c.b.b.w.g((String) this.f461a) : (Number) obj;
    }

    public String n() {
        return q() ? m().toString() : o() ? i().toString() : (String) this.f461a;
    }

    public boolean o() {
        return this.f461a instanceof Boolean;
    }

    public boolean q() {
        return this.f461a instanceof Number;
    }

    public boolean s() {
        return this.f461a instanceof String;
    }

    void t(Object obj) {
        if (obj instanceof Character) {
            obj = String.valueOf(((Character) obj).charValue());
        } else {
            c.b.b.w.a.a((obj instanceof Number) || r(obj));
        }
        this.f461a = obj;
    }
}
