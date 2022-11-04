package c2;
/* loaded from: classes.dex */
public class g {

    /* renamed from: a */
    public final String f6141a;

    /* renamed from: b */
    public final int f6142b;

    public g(String str, int i10) {
        this.f6141a = str;
        this.f6142b = i10;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f6142b == gVar.f6142b) {
            return this.f6141a.equals(gVar.f6141a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f6141a.hashCode() * 31) + this.f6142b;
    }
}
