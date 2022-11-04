package y6;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a */
    private final int f25850a;

    /* renamed from: b */
    private final int f25851b;

    public b(int i10, int i11) {
        this.f25850a = i10;
        this.f25851b = i11;
    }

    public final int a() {
        return this.f25851b;
    }

    public final int b() {
        return this.f25850a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f25850a == bVar.f25850a && this.f25851b == bVar.f25851b;
    }

    public final int hashCode() {
        return this.f25850a ^ this.f25851b;
    }

    public final String toString() {
        return this.f25850a + "(" + this.f25851b + ')';
    }
}
