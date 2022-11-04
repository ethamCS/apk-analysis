package c.b.b;

import java.lang.reflect.Field;
import java.util.Locale;
/* loaded from: classes.dex */
public abstract class c extends Enum<c> implements c.b.b.d {

    /* renamed from: a */
    public static final c f444a;

    /* renamed from: b */
    public static final c f445b;

    /* renamed from: c */
    public static final c f446c;

    /* renamed from: d */
    public static final c f447d;

    /* renamed from: e */
    public static final c f448e;
    public static final c f;
    private static final /* synthetic */ c[] g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends c {
        a(String str, int i) {
            super(str, i, null);
        }

        @Override // c.b.b.d
        public String a(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        f444a = aVar;
        c cVar = new c("UPPER_CAMEL_CASE", 1) { // from class: c.b.b.c.b
            @Override // c.b.b.d
            public String a(Field field) {
                return c.d(field.getName());
            }
        };
        f445b = cVar;
        c cVar2 = new c("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: c.b.b.c.c
            @Override // c.b.b.d
            public String a(Field field) {
                return c.d(c.c(field.getName(), " "));
            }
        };
        f446c = cVar2;
        c cVar3 = new c("LOWER_CASE_WITH_UNDERSCORES", 3) { // from class: c.b.b.c.d
            @Override // c.b.b.d
            public String a(Field field) {
                return c.c(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        };
        f447d = cVar3;
        c cVar4 = new c("LOWER_CASE_WITH_DASHES", 4) { // from class: c.b.b.c.e
            @Override // c.b.b.d
            public String a(Field field) {
                return c.c(field.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        };
        f448e = cVar4;
        c cVar5 = new c("LOWER_CASE_WITH_DOTS", 5) { // from class: c.b.b.c.f
            @Override // c.b.b.d
            public String a(Field field) {
                return c.c(field.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        };
        f = cVar5;
        g = new c[]{aVar, cVar, cVar2, cVar3, cVar4, cVar5};
    }

    private c(String str, int i) {
        super(str, i);
    }

    /* synthetic */ c(String str, int i, a aVar) {
        this(str, i);
    }

    private static String b(char c2, String str, int i) {
        if (i < str.length()) {
            return c2 + str.substring(i);
        }
        return String.valueOf(c2);
    }

    static String c(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(str2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    static String d(String str) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        char charAt = str.charAt(0);
        int length = str.length();
        while (i < length - 1 && !Character.isLetter(charAt)) {
            sb.append(charAt);
            i++;
            charAt = str.charAt(i);
        }
        if (!Character.isUpperCase(charAt)) {
            sb.append(b(Character.toUpperCase(charAt), str, i + 1));
            return sb.toString();
        }
        return str;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) g.clone();
    }
}
