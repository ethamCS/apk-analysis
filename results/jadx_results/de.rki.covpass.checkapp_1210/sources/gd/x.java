package gd;

import java.util.EnumMap;
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a */
    private final EnumMap<b, q> f10761a;

    public x(EnumMap<b, q> enumMap) {
        hc.t.e(enumMap, "defaultQualifiers");
        this.f10761a = enumMap;
    }

    public final q a(b bVar) {
        return this.f10761a.get(bVar);
    }

    public final EnumMap<b, q> b() {
        return this.f10761a;
    }
}
