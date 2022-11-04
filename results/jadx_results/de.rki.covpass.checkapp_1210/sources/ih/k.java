package ih;

import gg.a0;
import gg.t;
import gg.t1;
import gg.w;
/* loaded from: classes3.dex */
public class k extends t {

    /* renamed from: c */
    private final w f12670c;

    /* renamed from: d */
    private ti.e f12671d;

    /* renamed from: q */
    private ti.i f12672q;

    public k(ti.e eVar, w wVar) {
        this(eVar, wVar.F());
    }

    public k(ti.e eVar, byte[] bArr) {
        this.f12671d = eVar;
        this.f12670c = new t1(ak.a.h(bArr));
    }

    public k(ti.i iVar, boolean z10) {
        this.f12672q = iVar.A();
        this.f12670c = new t1(iVar.l(z10));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        return this.f12670c;
    }

    public synchronized ti.i l() {
        if (this.f12672q == null) {
            this.f12672q = this.f12671d.j(this.f12670c.F()).A();
        }
        return this.f12672q;
    }
}
