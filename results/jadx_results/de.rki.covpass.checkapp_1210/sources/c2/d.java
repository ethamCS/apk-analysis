package c2;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a */
    public String f6136a;

    /* renamed from: b */
    public Long f6137b;

    public d(String str, long j10) {
        this.f6136a = str;
        this.f6137b = Long.valueOf(j10);
    }

    public d(String str, boolean z10) {
        this(str, z10 ? 1L : 0L);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        if (!this.f6136a.equals(dVar.f6136a)) {
            return false;
        }
        Long l10 = this.f6137b;
        Long l11 = dVar.f6137b;
        return l10 != null ? l10.equals(l11) : l11 == null;
    }

    public int hashCode() {
        int hashCode = this.f6136a.hashCode() * 31;
        Long l10 = this.f6137b;
        return hashCode + (l10 != null ? l10.hashCode() : 0);
    }
}
