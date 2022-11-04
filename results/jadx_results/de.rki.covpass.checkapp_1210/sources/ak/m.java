package ak;

import java.math.BigInteger;
import java.security.AccessControlException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.security.Security;
import java.util.Map;
/* loaded from: classes3.dex */
public class m {

    /* renamed from: a */
    private static final ThreadLocal f559a = new ThreadLocal();

    /* loaded from: classes3.dex */
    public static class a implements PrivilegedAction {

        /* renamed from: a */
        final /* synthetic */ String f560a;

        a(String str) {
            this.f560a = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            return Security.getProperty(this.f560a);
        }
    }

    /* loaded from: classes3.dex */
    public static class b implements PrivilegedAction {

        /* renamed from: a */
        final /* synthetic */ String f561a;

        b(String str) {
            this.f561a = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            return System.getProperty(this.f561a);
        }
    }

    public static BigInteger a(String str) {
        String b10 = b(str);
        if (b10 != null) {
            return new BigInteger(b10);
        }
        return null;
    }

    public static String b(String str) {
        String str2;
        String str3 = (String) AccessController.doPrivileged(new a(str));
        if (str3 != null) {
            return str3;
        }
        Map map = (Map) f559a.get();
        return (map == null || (str2 = (String) map.get(str)) == null) ? (String) AccessController.doPrivileged(new b(str)) : str2;
    }

    public static boolean c(String str) {
        try {
            return f(b(str));
        } catch (AccessControlException unused) {
            return false;
        }
    }

    public static boolean d(String str, boolean z10) {
        try {
            String b10 = b(str);
            return z10 ? f(b10) : e(b10);
        } catch (AccessControlException unused) {
            return false;
        }
    }

    private static boolean e(String str) {
        if (str == null || str.length() != 5) {
            return false;
        }
        if (str.charAt(0) != 'f' && str.charAt(0) != 'F') {
            return false;
        }
        if (str.charAt(1) != 'a' && str.charAt(1) != 'A') {
            return false;
        }
        if (str.charAt(2) != 'l' && str.charAt(2) != 'L') {
            return false;
        }
        if (str.charAt(3) != 's' && str.charAt(3) != 'S') {
            return false;
        }
        return str.charAt(4) == 'e' || str.charAt(4) == 'E';
    }

    private static boolean f(String str) {
        if (str == null || str.length() != 4) {
            return false;
        }
        if (str.charAt(0) != 't' && str.charAt(0) != 'T') {
            return false;
        }
        if (str.charAt(1) != 'r' && str.charAt(1) != 'R') {
            return false;
        }
        if (str.charAt(2) != 'u' && str.charAt(2) != 'U') {
            return false;
        }
        return str.charAt(3) == 'e' || str.charAt(3) == 'E';
    }
}
