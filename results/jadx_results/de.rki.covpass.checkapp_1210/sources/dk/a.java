package dk;
/* loaded from: classes3.dex */
public class a {

    /* renamed from: a */
    private String f9161a;

    /* renamed from: b */
    private String f9162b;

    public a(String str, String str2) {
        this.f9161a = str;
        this.f9162b = str2;
    }

    private int a(String str) {
        if (str == null) {
            return 1;
        }
        return str.hashCode();
    }

    private boolean d(String str, String str2) {
        if (str == str2) {
            return true;
        }
        if (str != null && str2 != null) {
            return str.equals(str2);
        }
        return false;
    }

    public String b() {
        return this.f9161a;
    }

    public String c() {
        return this.f9162b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return aVar == this || (d(this.f9161a, aVar.f9161a) && d(this.f9162b, aVar.f9162b));
    }

    public int hashCode() {
        return a(this.f9161a) + (a(this.f9162b) * 31);
    }
}
