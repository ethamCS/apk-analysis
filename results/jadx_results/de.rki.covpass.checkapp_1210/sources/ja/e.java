package ja;

import java.io.Serializable;
/* loaded from: classes.dex */
public class e implements Serializable {

    /* renamed from: c */
    public ka.b f14240c = new ka.b();

    /* renamed from: d */
    public ka.b f14241d = new ka.b();

    public double b() {
        return this.f14240c.c(this.f14241d);
    }

    public double c() {
        return this.f14241d.f10622c - this.f14240c.f10622c;
    }

    public double e() {
        return this.f14241d.f10623d - this.f14240c.f10623d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f14240c.equals(eVar.f14240c) && this.f14241d.equals(eVar.f14241d);
    }

    public int hashCode() {
        return this.f14240c.hashCode() + this.f14241d.hashCode();
    }

    public String toString() {
        return getClass().getSimpleName() + "{a=" + this.f14240c + ", b=" + this.f14241d + '}';
    }
}
