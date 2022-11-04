package ga;

import ga.b;
import java.text.DecimalFormat;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class b<T extends b> extends f<T> {

    /* renamed from: c */
    public float f10620c;

    /* renamed from: d */
    public float f10621d;

    public String b(String str) {
        DecimalFormat decimalFormat = new DecimalFormat("#");
        String l10 = pk.d.l(this.f10620c, decimalFormat, 11, 4);
        String l11 = pk.d.l(this.f10621d, decimalFormat, 11, 4);
        return str + "( " + l10 + " " + l11 + " )";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return Float.compare(this.f10620c, bVar.f10620c) == 0 && Float.compare(this.f10621d, bVar.f10621d) == 0;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.f10620c), Float.valueOf(this.f10621d));
    }
}
