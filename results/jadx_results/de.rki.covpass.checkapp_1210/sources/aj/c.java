package aj;
/* loaded from: classes3.dex */
public class c implements e {

    /* renamed from: a */
    protected final int[] f544a;

    public c(int[] iArr) {
        this.f544a = ak.a.k(iArr);
    }

    @Override // aj.e
    public int[] a() {
        return ak.a.k(this.f544a);
    }

    @Override // aj.e
    public int b() {
        int[] iArr = this.f544a;
        return iArr[iArr.length - 1];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c) {
            return ak.a.e(this.f544a, ((c) obj).f544a);
        }
        return false;
    }

    public int hashCode() {
        return ak.a.I(this.f544a);
    }
}
