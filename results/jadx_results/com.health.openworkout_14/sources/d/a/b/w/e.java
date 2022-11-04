package d.a.b.w;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a */
    private static final int f3781a = a();

    private static int a() {
        return d(System.getProperty("java.version"));
    }

    private static int b(String str) {
        try {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                char charAt = str.charAt(i);
                if (!Character.isDigit(charAt)) {
                    break;
                }
                sb.append(charAt);
            }
            return Integer.parseInt(sb.toString());
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public static int c() {
        return f3781a;
    }

    static int d(String str) {
        int f2 = f(str);
        if (f2 == -1) {
            f2 = b(str);
        }
        if (f2 == -1) {
            return 6;
        }
        return f2;
    }

    public static boolean e() {
        return f3781a >= 9;
    }

    private static int f(String str) {
        try {
            String[] split = str.split("[._]");
            int parseInt = Integer.parseInt(split[0]);
            return (parseInt != 1 || split.length <= 1) ? parseInt : Integer.parseInt(split[1]);
        } catch (NumberFormatException unused) {
            return -1;
        }
    }
}
