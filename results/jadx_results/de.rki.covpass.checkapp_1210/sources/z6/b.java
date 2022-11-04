package z6;

import java.util.Objects;
/* loaded from: classes.dex */
final class b {

    /* renamed from: a */
    private final y6.b f26489a;

    /* renamed from: b */
    private final y6.b f26490b;

    /* renamed from: c */
    private final y6.c f26491c;

    public b(y6.b bVar, y6.b bVar2, y6.c cVar) {
        this.f26489a = bVar;
        this.f26490b = bVar2;
        this.f26491c = cVar;
    }

    public y6.c a() {
        return this.f26491c;
    }

    public y6.b b() {
        return this.f26489a;
    }

    public y6.b c() {
        return this.f26490b;
    }

    public boolean d() {
        return this.f26490b == null;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return Objects.equals(this.f26489a, bVar.f26489a) && Objects.equals(this.f26490b, bVar.f26490b) && Objects.equals(this.f26491c, bVar.f26491c);
    }

    public int hashCode() {
        return (Objects.hashCode(this.f26489a) ^ Objects.hashCode(this.f26490b)) ^ Objects.hashCode(this.f26491c);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[ ");
        sb2.append(this.f26489a);
        sb2.append(" , ");
        sb2.append(this.f26490b);
        sb2.append(" : ");
        y6.c cVar = this.f26491c;
        sb2.append(cVar == null ? "null" : Integer.valueOf(cVar.c()));
        sb2.append(" ]");
        return sb2.toString();
    }
}
