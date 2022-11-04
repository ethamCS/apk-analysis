package wd;
/* loaded from: classes.dex */
public final class f implements Comparable<f> {

    /* renamed from: c */
    private final String f24807c;

    /* renamed from: d */
    private final boolean f24808d;

    private f(String str, boolean z10) {
        if (str == null) {
            a(0);
        }
        this.f24807c = str;
        this.f24808d = z10;
    }

    private static /* synthetic */ void a(int i10) {
        String str = (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) ? 2 : 3];
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/name/Name";
        } else {
            objArr[0] = "name";
        }
        if (i10 == 1) {
            objArr[1] = "asString";
        } else if (i10 == 2) {
            objArr[1] = "getIdentifier";
        } else if (i10 == 3 || i10 == 4) {
            objArr[1] = "asStringStripSpecialMarkers";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/name/Name";
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
                break;
            case 5:
                objArr[2] = "identifier";
                break;
            case 6:
                objArr[2] = "isValidIdentifier";
                break;
            case 7:
                objArr[2] = "special";
                break;
            case 8:
                objArr[2] = "guessByFirstCharacter";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4) {
            throw new IllegalStateException(format);
        }
    }

    public static f h(String str) {
        if (str == null) {
            a(8);
        }
        return str.startsWith("<") ? o(str) : j(str);
    }

    public static f j(String str) {
        if (str == null) {
            a(5);
        }
        return new f(str, false);
    }

    public static boolean m(String str) {
        if (str == null) {
            a(6);
        }
        if (str.isEmpty() || str.startsWith("<")) {
            return false;
        }
        for (int i10 = 0; i10 < str.length(); i10++) {
            char charAt = str.charAt(i10);
            if (charAt == '.' || charAt == '/' || charAt == '\\') {
                return false;
            }
        }
        return true;
    }

    public static f o(String str) {
        if (str == null) {
            a(7);
        }
        if (str.startsWith("<")) {
            return new f(str, true);
        }
        throw new IllegalArgumentException("special name must start with '<': " + str);
    }

    public String b() {
        String str = this.f24807c;
        if (str == null) {
            a(1);
        }
        return str;
    }

    /* renamed from: d */
    public int compareTo(f fVar) {
        return this.f24807c.compareTo(fVar.f24807c);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f24808d == fVar.f24808d && this.f24807c.equals(fVar.f24807c);
    }

    public String g() {
        if (!this.f24808d) {
            String b10 = b();
            if (b10 == null) {
                a(2);
            }
            return b10;
        }
        throw new IllegalStateException("not identifier: " + this);
    }

    public int hashCode() {
        return (this.f24807c.hashCode() * 31) + (this.f24808d ? 1 : 0);
    }

    public boolean l() {
        return this.f24808d;
    }

    public String toString() {
        return this.f24807c;
    }
}
