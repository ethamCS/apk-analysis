package x6;

import java.util.Map;
/* loaded from: classes.dex */
public final class u implements h6.u {

    /* renamed from: a */
    private final j f25437a = new j();

    @Override // h6.u
    public o6.b a(String str, h6.a aVar, int i10, int i11, Map<h6.g, ?> map) {
        if (aVar == h6.a.UPC_A) {
            return this.f25437a.a("0".concat(String.valueOf(str)), h6.a.EAN_13, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode UPC-A, but got ".concat(String.valueOf(aVar)));
    }
}
