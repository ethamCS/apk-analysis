package rk;

import org.conscrypt.BuildConfig;
/* loaded from: classes3.dex */
public class e {

    /* renamed from: a */
    public float f21270a;

    /* renamed from: b */
    public float f21271b;

    protected boolean a(Object obj) {
        return obj instanceof e;
    }

    public float b() {
        return this.f21271b;
    }

    public float c() {
        return this.f21270a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return eVar.a(this) && Float.compare(c(), eVar.c()) == 0 && Float.compare(b(), eVar.b()) == 0;
    }

    public int hashCode() {
        return ((Float.floatToIntBits(c()) + 59) * 59) + Float.floatToIntBits(b());
    }

    public String toString() {
        StringBuilder sb2;
        if (this.f21271b == 0.0f) {
            sb2 = new StringBuilder();
            sb2.append(BuildConfig.FLAVOR);
            sb2.append(this.f21270a);
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f21270a);
            sb2.append(" ");
            sb2.append(this.f21271b);
            sb2.append("i");
        }
        return sb2.toString();
    }
}
