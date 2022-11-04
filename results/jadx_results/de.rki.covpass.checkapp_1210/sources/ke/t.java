package ke;
/* loaded from: classes3.dex */
public final class t<T> {

    /* renamed from: a */
    private final T f15100a;

    /* renamed from: b */
    private final T f15101b;

    /* renamed from: c */
    private final String f15102c;

    /* renamed from: d */
    private final wd.b f15103d;

    public t(T t10, T t11, String str, wd.b bVar) {
        hc.t.e(str, "filePath");
        hc.t.e(bVar, "classId");
        this.f15100a = t10;
        this.f15101b = t11;
        this.f15102c = str;
        this.f15103d = bVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return hc.t.a(this.f15100a, tVar.f15100a) && hc.t.a(this.f15101b, tVar.f15101b) && hc.t.a(this.f15102c, tVar.f15102c) && hc.t.a(this.f15103d, tVar.f15103d);
    }

    public int hashCode() {
        T t10 = this.f15100a;
        int i10 = 0;
        int hashCode = (t10 == null ? 0 : t10.hashCode()) * 31;
        T t11 = this.f15101b;
        if (t11 != null) {
            i10 = t11.hashCode();
        }
        return ((((hashCode + i10) * 31) + this.f15102c.hashCode()) * 31) + this.f15103d.hashCode();
    }

    public String toString() {
        return "IncompatibleVersionErrorData(actualVersion=" + this.f15100a + ", expectedVersion=" + this.f15101b + ", filePath=" + this.f15102c + ", classId=" + this.f15103d + ')';
    }
}
