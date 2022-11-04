package wd;

import gc.l;
import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import ub.m;
/* loaded from: classes.dex */
public final class d {

    /* renamed from: e */
    private static final f f24799e = f.o("<root>");

    /* renamed from: f */
    private static final Pattern f24800f = Pattern.compile("\\.");

    /* renamed from: g */
    private static final l<String, f> f24801g = new a();

    /* renamed from: a */
    private final String f24802a;

    /* renamed from: b */
    private transient c f24803b;

    /* renamed from: c */
    private transient d f24804c;

    /* renamed from: d */
    private transient f f24805d;

    /* loaded from: classes.dex */
    static class a implements l<String, f> {
        a() {
        }

        /* renamed from: a */
        public f invoke(String str) {
            return f.h(str);
        }
    }

    public d(String str) {
        if (str == null) {
            a(2);
        }
        this.f24802a = str;
    }

    public d(String str, c cVar) {
        if (str == null) {
            a(0);
        }
        if (cVar == null) {
            a(1);
        }
        this.f24802a = str;
        this.f24803b = cVar;
    }

    private d(String str, d dVar, f fVar) {
        if (str == null) {
            a(3);
        }
        this.f24802a = str;
        this.f24804c = dVar;
        this.f24805d = fVar;
    }

    private static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 9:
            case 15:
            case 16:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                i11 = 2;
                break;
            case 9:
            case 15:
            case 16:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        if (i10 != 1) {
            switch (i10) {
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 17:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                    break;
                case 9:
                    objArr[0] = "name";
                    break;
                case 15:
                    objArr[0] = "segment";
                    break;
                case 16:
                    objArr[0] = "shortName";
                    break;
                default:
                    objArr[0] = "fqName";
                    break;
            }
        } else {
            objArr[0] = "safe";
        }
        switch (i10) {
            case 4:
                objArr[1] = "asString";
                break;
            case 5:
            case 6:
                objArr[1] = "toSafe";
                break;
            case 7:
            case 8:
                objArr[1] = "parent";
                break;
            case 9:
            case 15:
            case 16:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/name/FqNameUnsafe";
                break;
            case 10:
            case 11:
                objArr[1] = "shortName";
                break;
            case 12:
            case 13:
                objArr[1] = "shortNameOrSpecial";
                break;
            case 14:
                objArr[1] = "pathSegments";
                break;
            case 17:
                objArr[1] = "toString";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                break;
            case 9:
                objArr[2] = "child";
                break;
            case 15:
                objArr[2] = "startsWith";
                break;
            case 16:
                objArr[2] = "topLevel";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 17:
                throw new IllegalStateException(format);
            case 9:
            case 15:
            case 16:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    private void d() {
        int lastIndexOf = this.f24802a.lastIndexOf(46);
        if (lastIndexOf >= 0) {
            this.f24805d = f.h(this.f24802a.substring(lastIndexOf + 1));
            this.f24804c = new d(this.f24802a.substring(0, lastIndexOf));
            return;
        }
        this.f24805d = f.h(this.f24802a);
        this.f24804c = c.f24796c.j();
    }

    public static d m(f fVar) {
        if (fVar == null) {
            a(16);
        }
        return new d(fVar.b(), c.f24796c.j(), fVar);
    }

    public String b() {
        String str = this.f24802a;
        if (str == null) {
            a(4);
        }
        return str;
    }

    public d c(f fVar) {
        String str;
        if (fVar == null) {
            a(9);
        }
        if (e()) {
            str = fVar.b();
        } else {
            str = this.f24802a + "." + fVar.b();
        }
        return new d(str, this, fVar);
    }

    public boolean e() {
        return this.f24802a.isEmpty();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f24802a.equals(((d) obj).f24802a);
    }

    public boolean f() {
        return this.f24803b != null || b().indexOf(60) < 0;
    }

    public d g() {
        d dVar = this.f24804c;
        if (dVar != null) {
            if (dVar == null) {
                a(7);
            }
            return dVar;
        } else if (e()) {
            throw new IllegalStateException("root");
        } else {
            d();
            d dVar2 = this.f24804c;
            if (dVar2 == null) {
                a(8);
            }
            return dVar2;
        }
    }

    public List<f> h() {
        List<f> emptyList = e() ? Collections.emptyList() : m.S(f24800f.split(this.f24802a), f24801g);
        if (emptyList == null) {
            a(14);
        }
        return emptyList;
    }

    public int hashCode() {
        return this.f24802a.hashCode();
    }

    public f i() {
        f fVar = this.f24805d;
        if (fVar != null) {
            if (fVar == null) {
                a(10);
            }
            return fVar;
        } else if (e()) {
            throw new IllegalStateException("root");
        } else {
            d();
            f fVar2 = this.f24805d;
            if (fVar2 == null) {
                a(11);
            }
            return fVar2;
        }
    }

    public f j() {
        if (e()) {
            f fVar = f24799e;
            if (fVar == null) {
                a(12);
            }
            return fVar;
        }
        f i10 = i();
        if (i10 == null) {
            a(13);
        }
        return i10;
    }

    public boolean k(f fVar) {
        if (fVar == null) {
            a(15);
        }
        if (e()) {
            return false;
        }
        int indexOf = this.f24802a.indexOf(46);
        String str = this.f24802a;
        String b10 = fVar.b();
        if (indexOf == -1) {
            indexOf = this.f24802a.length();
        }
        return str.regionMatches(0, b10, 0, indexOf);
    }

    public c l() {
        c cVar = this.f24803b;
        if (cVar != null) {
            if (cVar == null) {
                a(5);
            }
            return cVar;
        }
        c cVar2 = new c(this);
        this.f24803b = cVar2;
        return cVar2;
    }

    public String toString() {
        String b10 = e() ? f24799e.b() : this.f24802a;
        if (b10 == null) {
            a(17);
        }
        return b10;
    }
}
