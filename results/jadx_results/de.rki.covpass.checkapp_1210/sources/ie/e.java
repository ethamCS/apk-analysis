package ie;

import hc.t;
import oe.m0;
/* loaded from: classes3.dex */
public class e implements f, h {

    /* renamed from: a */
    private final xc.e f12509a;

    /* renamed from: b */
    private final e f12510b;

    /* renamed from: c */
    private final xc.e f12511c;

    public e(xc.e eVar, e eVar2) {
        t.e(eVar, "classDescriptor");
        this.f12509a = eVar;
        this.f12510b = eVar2 == null ? this : eVar2;
        this.f12511c = eVar;
    }

    /* renamed from: b */
    public m0 getType() {
        m0 u10 = this.f12509a.u();
        t.d(u10, "classDescriptor.defaultType");
        return u10;
    }

    public boolean equals(Object obj) {
        xc.e eVar = this.f12509a;
        xc.e eVar2 = null;
        e eVar3 = obj instanceof e ? (e) obj : null;
        if (eVar3 != null) {
            eVar2 = eVar3.f12509a;
        }
        return t.a(eVar, eVar2);
    }

    public int hashCode() {
        return this.f12509a.hashCode();
    }

    @Override // ie.h
    public final xc.e q() {
        return this.f12509a;
    }

    public String toString() {
        return "Class{" + getType() + '}';
    }
}
