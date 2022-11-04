package g4;

import android.graphics.Path;
import h4.a;
import java.util.ArrayList;
import java.util.List;
import l4.s;
/* loaded from: classes.dex */
public class r implements m, a.b {

    /* renamed from: b */
    private final String f10513b;

    /* renamed from: c */
    private final boolean f10514c;

    /* renamed from: d */
    private final com.airbnb.lottie.n f10515d;

    /* renamed from: e */
    private final h4.m f10516e;

    /* renamed from: f */
    private boolean f10517f;

    /* renamed from: a */
    private final Path f10512a = new Path();

    /* renamed from: g */
    private final b f10518g = new b();

    public r(com.airbnb.lottie.n nVar, m4.b bVar, l4.q qVar) {
        this.f10513b = qVar.b();
        this.f10514c = qVar.d();
        this.f10515d = nVar;
        h4.m n10 = qVar.c().n();
        this.f10516e = n10;
        bVar.i(n10);
        n10.a(this);
    }

    private void d() {
        this.f10517f = false;
        this.f10515d.invalidateSelf();
    }

    @Override // h4.a.b
    public void b() {
        d();
    }

    @Override // g4.c
    public void c(List<c> list, List<c> list2) {
        ArrayList arrayList = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = list.get(i10);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.j() == s.a.SIMULTANEOUSLY) {
                    this.f10518g.a(uVar);
                    uVar.d(this);
                }
            }
            if (cVar instanceof s) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((s) cVar);
            }
        }
        this.f10516e.q(arrayList);
    }

    @Override // g4.m
    public Path l() {
        if (this.f10517f) {
            return this.f10512a;
        }
        this.f10512a.reset();
        if (!this.f10514c) {
            Path h10 = this.f10516e.h();
            if (h10 == null) {
                return this.f10512a;
            }
            this.f10512a.set(h10);
            this.f10512a.setFillType(Path.FillType.EVEN_ODD);
            this.f10518g.b(this.f10512a);
        }
        this.f10517f = true;
        return this.f10512a;
    }
}
