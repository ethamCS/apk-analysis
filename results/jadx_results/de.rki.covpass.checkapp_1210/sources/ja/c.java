package ja;

import java.io.Serializable;
/* loaded from: classes.dex */
public class c implements Serializable {

    /* renamed from: c */
    public ka.b f14236c = new ka.b();

    /* renamed from: d */
    public ka.e f14237d = new ka.e();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f14236c.equals(cVar.f14236c) && this.f14237d.equals(cVar.f14237d);
    }

    public int hashCode() {
        return this.f14236c.hashCode() + this.f14237d.hashCode();
    }

    public String toString() {
        pk.b bVar = new pk.b();
        return getClass().getSimpleName() + " P( " + bVar.b(this.f14236c.f10622c) + " " + bVar.b(this.f14236c.f10623d) + " ) Slope( " + bVar.b(this.f14237d.f10622c) + " " + bVar.b(this.f14237d.f10623d) + " )";
    }
}
