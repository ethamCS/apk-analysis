package mi;

import java.security.spec.ECParameterSpec;
import zh.y;
/* loaded from: classes3.dex */
public class f extends ECParameterSpec {

    /* renamed from: a */
    private final byte[] f16695a;

    /* renamed from: b */
    private final y f16696b;

    public byte[] a() {
        return ak.a.h(this.f16695a);
    }

    public boolean equals(Object obj) {
        if (obj instanceof f) {
            return this.f16696b.equals(((f) obj).f16696b);
        }
        return false;
    }

    public int hashCode() {
        return this.f16696b.hashCode();
    }
}
