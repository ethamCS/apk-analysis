package fe;
/* loaded from: classes3.dex */
public class d {

    /* renamed from: a */
    private final String f10183a;

    /* renamed from: b */
    private wd.c f10184b;

    private d(String str) {
        if (str == null) {
            a(5);
        }
        this.f10183a = str;
    }

    private static /* synthetic */ void a(int i10) {
        String str = (i10 == 3 || i10 == 6 || i10 == 7 || i10 == 8) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i10 == 3 || i10 == 6 || i10 == 7 || i10 == 8) ? 2 : 3];
        switch (i10) {
            case 1:
                objArr[0] = "classId";
                break;
            case 2:
            case 4:
                objArr[0] = "fqName";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
                break;
            case 5:
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i10 == 3) {
            objArr[1] = "byFqNameWithoutInnerClasses";
        } else if (i10 == 6) {
            objArr[1] = "getFqNameForClassNameWithoutDollars";
        } else if (i10 == 7) {
            objArr[1] = "getPackageFqName";
        } else if (i10 != 8) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmClassName";
        } else {
            objArr[1] = "getInternalName";
        }
        switch (i10) {
            case 1:
                objArr[2] = "byClassId";
                break;
            case 2:
            case 4:
                objArr[2] = "byFqNameWithoutInnerClasses";
                break;
            case 3:
            case 6:
            case 7:
            case 8:
                break;
            case 5:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "byInternalName";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 == 3 || i10 == 6 || i10 == 7 || i10 == 8) {
            throw new IllegalStateException(format);
        }
    }

    public static d b(wd.b bVar) {
        if (bVar == null) {
            a(1);
        }
        wd.c h10 = bVar.h();
        String replace = bVar.i().b().replace('.', '$');
        if (h10.d()) {
            return new d(replace);
        }
        return new d(h10.b().replace('.', '/') + "/" + replace);
    }

    public static d c(wd.c cVar) {
        if (cVar == null) {
            a(2);
        }
        d dVar = new d(cVar.b().replace('.', '/'));
        dVar.f10184b = cVar;
        return dVar;
    }

    public static d d(String str) {
        if (str == null) {
            a(0);
        }
        return new d(str);
    }

    public wd.c e() {
        return new wd.c(this.f10183a.replace('/', '.'));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.f10183a.equals(((d) obj).f10183a);
        }
        return false;
    }

    public String f() {
        String str = this.f10183a;
        if (str == null) {
            a(8);
        }
        return str;
    }

    public wd.c g() {
        int lastIndexOf = this.f10183a.lastIndexOf("/");
        if (lastIndexOf == -1) {
            wd.c cVar = wd.c.f24796c;
            if (cVar == null) {
                a(7);
            }
            return cVar;
        }
        return new wd.c(this.f10183a.substring(0, lastIndexOf).replace('/', '.'));
    }

    public int hashCode() {
        return this.f10183a.hashCode();
    }

    public String toString() {
        return this.f10183a;
    }
}
