package e.a.a.g;
/* loaded from: classes.dex */
public class d {
    public static Boolean a(Object obj, Object obj2) {
        Boolean bool = Boolean.TRUE;
        Boolean bool2 = Boolean.FALSE;
        return obj == obj2 ? bool : (obj == null || obj2 == null || obj.getClass() != obj2.getClass() || obj.getClass().isPrimitive() || !obj.equals(obj2)) ? bool2 : bool;
    }
}
