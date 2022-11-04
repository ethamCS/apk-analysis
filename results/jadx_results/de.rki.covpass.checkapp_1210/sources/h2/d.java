package h2;

import c4.l;
import h2.e;
import java.util.Objects;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a */
    e.a f11172a;

    /* renamed from: b */
    l f11173b;

    /* renamed from: c */
    l f11174c = new l(1, 1);

    public d(e eVar, boolean z10) {
        if (z10 || !(eVar instanceof e.a)) {
            return;
        }
        this.f11172a = (e.a) eVar;
        this.f11173b = new l();
        this.f11172a.c(false);
        this.f11172a.k(1, 1);
    }

    public l a() {
        return this.f11174c;
    }

    public void b(int i10, int i11) {
        if (this.f11172a == null) {
            this.f11174c.U(i10, i11);
            return;
        }
        this.f11174c.U(i10 + 2, i11 + 2);
        l lVar = this.f11173b;
        Objects.requireNonNull(lVar);
        this.f11174c.b0(1, 1, i10 + 1, i11 + 1, lVar);
    }

    public l c() {
        if (this.f11172a == null) {
            return this.f11174c;
        }
        l lVar = this.f11173b;
        Objects.requireNonNull(lVar);
        return lVar;
    }
}
