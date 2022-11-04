package qe;

import hc.t;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import oe.e0;
import oe.e1;
import ub.u;
import xc.f1;
/* loaded from: classes3.dex */
public final class i implements e1 {

    /* renamed from: a */
    private final j f19836a;

    /* renamed from: b */
    private final String[] f19837b;

    /* renamed from: c */
    private final String f19838c;

    public i(j jVar, String... strArr) {
        t.e(jVar, "kind");
        t.e(strArr, "formatParams");
        this.f19836a = jVar;
        this.f19837b = strArr;
        String g10 = b.ERROR_TYPE.g();
        String g11 = jVar.g();
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        String format = String.format(g11, Arrays.copyOf(copyOf, copyOf.length));
        t.d(format, "format(this, *args)");
        String format2 = String.format(g10, Arrays.copyOf(new Object[]{format}, 1));
        t.d(format2, "format(this, *args)");
        this.f19838c = format2;
    }

    @Override // oe.e1
    public e1 a(pe.g gVar) {
        t.e(gVar, "kotlinTypeRefiner");
        return this;
    }

    public final j d() {
        return this.f19836a;
    }

    public final String e(int i10) {
        return this.f19837b[i10];
    }

    @Override // oe.e1
    public List<f1> getParameters() {
        List<f1> h10;
        h10 = u.h();
        return h10;
    }

    @Override // oe.e1
    public Collection<e0> l() {
        List h10;
        h10 = u.h();
        return h10;
    }

    public String toString() {
        return this.f19838c;
    }

    @Override // oe.e1
    public uc.h x() {
        return uc.e.Companion.a();
    }

    @Override // oe.e1
    public boolean y() {
        return false;
    }

    @Override // oe.e1
    public xc.h z() {
        return k.f19894a.h();
    }
}
