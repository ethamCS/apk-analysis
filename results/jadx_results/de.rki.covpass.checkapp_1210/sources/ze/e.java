package ze;

import java.io.Serializable;
/* loaded from: classes3.dex */
final class e<K, V> implements Serializable {

    /* renamed from: c */
    public final K f26725c;

    /* renamed from: d */
    public final V f26726d;

    public e(K k10, V v10) {
        this.f26725c = k10;
        this.f26726d = v10;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        K k10 = this.f26725c;
        if (k10 == null) {
            if (eVar.f26725c != null) {
                return false;
            }
        } else if (!k10.equals(eVar.f26725c)) {
            return false;
        }
        V v10 = this.f26726d;
        V v11 = eVar.f26726d;
        if (v10 == null) {
            if (v11 != null) {
                return false;
            }
        } else if (!v10.equals(v11)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        K k10 = this.f26725c;
        int i10 = 0;
        int hashCode = k10 == null ? 0 : k10.hashCode();
        V v10 = this.f26726d;
        if (v10 != null) {
            i10 = v10.hashCode();
        }
        return hashCode ^ i10;
    }

    public String toString() {
        return this.f26725c + "=" + this.f26726d;
    }
}
