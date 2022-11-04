package ig;

import gg.a0;
import gg.a2;
import gg.d0;
import gg.j0;
import gg.t;
import java.io.IOException;
/* loaded from: classes3.dex */
public class i extends t implements gg.f {

    /* renamed from: c */
    private final int f12610c;

    /* renamed from: d */
    private final t f12611d;

    private i(gg.g gVar) {
        t tVar;
        if ((gVar instanceof d0) || (gVar instanceof j)) {
            this.f12610c = 0;
            tVar = j.l(gVar);
        } else if (!(gVar instanceof j0)) {
            throw new IllegalArgumentException("Unknown check object in integrity check.");
        } else {
            this.f12610c = 1;
            tVar = l.m(((j0) gVar).O());
        }
        this.f12611d = tVar;
    }

    public i(j jVar) {
        this((gg.g) jVar);
    }

    public i(l lVar) {
        this(new a2(0, lVar));
    }

    public static i l(Object obj) {
        if (obj instanceof i) {
            return (i) obj;
        }
        if (obj instanceof byte[]) {
            try {
                return new i(a0.u((byte[]) obj));
            } catch (IOException unused) {
                throw new IllegalArgumentException("Unable to parse integrity check details.");
            }
        } else if (obj == null) {
            return null;
        } else {
            return new i((gg.g) obj);
        }
    }

    @Override // gg.t, gg.g
    public a0 b() {
        t tVar = this.f12611d;
        return tVar instanceof l ? new a2(0, tVar) : tVar.b();
    }

    public t m() {
        return this.f12611d;
    }

    public int n() {
        return this.f12610c;
    }
}
