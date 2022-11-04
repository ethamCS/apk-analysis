package e.a.a.g;
/* loaded from: classes.dex */
public class c {
    public static boolean a(Boolean bool) {
        return bool != null && bool.booleanValue();
    }

    public static boolean b(Boolean bool, Boolean bool2) {
        return bool == null ? a(bool2) : a(bool);
    }
}
