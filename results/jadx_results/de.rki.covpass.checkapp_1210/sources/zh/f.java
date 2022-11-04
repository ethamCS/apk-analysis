package zh;
/* loaded from: classes3.dex */
public class f extends b {

    /* renamed from: d */
    private i f26922d;

    public f(boolean z10, i iVar) {
        super(z10);
        this.f26922d = iVar;
    }

    public i b() {
        return this.f26922d;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof f)) {
            return false;
        }
        i iVar = this.f26922d;
        i b10 = ((f) obj).b();
        return iVar == null ? b10 == null : iVar.equals(b10);
    }

    public int hashCode() {
        int i10 = !a();
        i iVar = this.f26922d;
        return iVar != null ? i10 ^ iVar.hashCode() : i10;
    }
}
