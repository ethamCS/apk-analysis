package d.a.b;

import java.lang.reflect.Field;
import java.util.Locale;
/* loaded from: classes.dex */
public abstract class c extends Enum<c> implements d.a.b.d {

    /* renamed from: b */
    public static final c f3723b;

    /* renamed from: c */
    public static final c f3724c;

    /* renamed from: d */
    public static final c f3725d;

    /* renamed from: e */
    public static final c f3726e;

    /* renamed from: f */
    public static final c f3727f;

    /* renamed from: g */
    public static final c f3728g;

    /* renamed from: h */
    private static final /* synthetic */ c[] f3729h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends c {
        a(String str, int i) {
            super(str, i, null);
        }

        @Override // d.a.b.d
        public String a(Field field) {
            return field.getName();
        }
    }

    static {
        a aVar = new a("IDENTITY", 0);
        f3723b = aVar;
        c cVar = new c("UPPER_CAMEL_CASE", 1) { // from class: d.a.b.c.b
            @Override // d.a.b.d
            public String a(Field field) {
                return c.g(field.getName());
            }
        };
        f3724c = cVar;
        c cVar2 = new c("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: d.a.b.c.c
            @Override // d.a.b.d
            public String a(Field field) {
                return c.g(c.f(field.getName(), " "));
            }
        };
        f3725d = cVar2;
        c cVar3 = new c("LOWER_CASE_WITH_UNDERSCORES", 3) { // from class: d.a.b.c.d
            @Override // d.a.b.d
            public String a(Field field) {
                return c.f(field.getName(), "_").toLowerCase(Locale.ENGLISH);
            }
        };
        f3726e = cVar3;
        c cVar4 = new c("LOWER_CASE_WITH_DASHES", 4) { // from class: d.a.b.c.e
            @Override // d.a.b.d
            public String a(Field field) {
                return c.f(field.getName(), "-").toLowerCase(Locale.ENGLISH);
            }
        };
        f3727f = cVar4;
        c cVar5 = new c("LOWER_CASE_WITH_DOTS", 5) { // from class: d.a.b.c.f
            @Override // d.a.b.d
            public String a(Field field) {
                return c.f(field.getName(), ".").toLowerCase(Locale.ENGLISH);
            }
        };
        f3728g = cVar5;
        f3729h = new c[]{aVar, cVar, cVar2, cVar3, cVar4, cVar5};
    }

    private c(String str, int i) {
        super(str, i);
    }

    /* synthetic */ c(String str, int i, a aVar) {
        this(str, i);
    }

    private static String e(char c2, String str, int i) {
        if (i < str.length()) {
            return c2 + str.substring(i);
        }
        return String.valueOf(c2);
    }

    static String f(String str, String str2) {
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

    static String g(String str) {
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
            sb.append(e(Character.toUpperCase(charAt), str, i + 1));
            return sb.toString();
        }
        return str;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f3729h.clone();
    }
}
