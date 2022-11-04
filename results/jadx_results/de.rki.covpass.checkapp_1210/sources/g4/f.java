package g4;

import android.graphics.Path;
import android.graphics.PointF;
import h4.a;
import java.util.List;
import l4.s;
/* loaded from: classes.dex */
public class f implements m, a.b, k {

    /* renamed from: b */
    private final String f10414b;

    /* renamed from: c */
    private final com.airbnb.lottie.n f10415c;

    /* renamed from: d */
    private final h4.a<?, PointF> f10416d;

    /* renamed from: e */
    private final h4.a<?, PointF> f10417e;

    /* renamed from: f */
    private final l4.b f10418f;

    /* renamed from: h */
    private boolean f10420h;

    /* renamed from: a */
    private final Path f10413a = new Path();

    /* renamed from: g */
    private final b f10419g = new b();

    public f(com.airbnb.lottie.n nVar, m4.b bVar, l4.b bVar2) {
        this.f10414b = bVar2.b();
        this.f10415c = nVar;
        h4.a<PointF, PointF> n10 = bVar2.d().n();
        this.f10416d = n10;
        h4.a<PointF, PointF> n11 = bVar2.c().n();
        this.f10417e = n11;
        this.f10418f = bVar2;
        bVar.i(n10);
        bVar.i(n11);
        n10.a(this);
        n11.a(this);
    }

    private void d() {
        this.f10420h = false;
        this.f10415c.invalidateSelf();
    }

    @Override // h4.a.b
    public void b() {
        d();
    }

    @Override // g4.c
    public void c(List<c> list, List<c> list2) {
        for (int i10 = 0; i10 < list.size(); i10++) {
            c cVar = list.get(i10);
            if (cVar instanceof u) {
                u uVar = (u) cVar;
                if (uVar.j() == s.a.SIMULTANEOUSLY) {
                    this.f10419g.a(uVar);
                    uVar.d(this);
                }
            }
        }
    }

    @Override // j4.f
    public <T> void e(T t10, r4.c<T> cVar) {
        h4.a<?, PointF> aVar;
        if (t10 == e4.u.f9444k) {
            aVar = this.f10416d;
        } else if (t10 != e4.u.f9447n) {
            return;
        } else {
            aVar = this.f10417e;
        }
        aVar.n(cVar);
    }

    @Override // g4.c
    public String getName() {
        return this.f10414b;
    }

    @Override // j4.f
    public void h(j4.e eVar, int i10, List<j4.e> list, j4.e eVar2) {
        q4.g.k(eVar, i10, list, eVar2, this);
    }

    @Override // g4.m
    public Path l() {
        if (this.f10420h) {
            return this.f10413a;
        }
        this.f10413a.reset();
        if (!this.f10418f.e()) {
            PointF h10 = this.f10416d.h();
            float f10 = h10.x / 2.0f;
            float f11 = h10.y / 2.0f;
            float f12 = f10 * 0.55228f;
            float f13 = 0.55228f * f11;
            this.f10413a.reset();
            if (this.f10418f.f()) {
                float f14 = -f11;
                this.f10413a.moveTo(0.0f, f14);
                float f15 = 0.0f - f12;
                float f16 = -f10;
                float f17 = 0.0f - f13;
                this.f10413a.cubicTo(f15, f14, f16, f17, f16, 0.0f);
                float f18 = f13 + 0.0f;
                this.f10413a.cubicTo(f16, f18, f15, f11, 0.0f, f11);
                float f19 = f12 + 0.0f;
                this.f10413a.cubicTo(f19, f11, f10, f18, f10, 0.0f);
                this.f10413a.cubicTo(f10, f17, f19, f14, 0.0f, f14);
            } else {
                float f20 = -f11;
                this.f10413a.moveTo(0.0f, f20);
                float f21 = f12 + 0.0f;
                float f22 = 0.0f - f13;
                this.f10413a.cubicTo(f21, f20, f10, f22, f10, 0.0f);
                float f23 = f13 + 0.0f;
                this.f10413a.cubicTo(f10, f23, f21, f11, 0.0f, f11);
                float f24 = 0.0f - f12;
                float f25 = -f10;
                this.f10413a.cubicTo(f24, f11, f25, f23, f25, 0.0f);
                this.f10413a.cubicTo(f25, f22, f24, f20, 0.0f, f20);
            }
            PointF h11 = this.f10417e.h();
            this.f10413a.offset(h11.x, h11.y);
            this.f10413a.close();
            this.f10419g.b(this.f10413a);
        }
        this.f10420h = true;
        return this.f10413a;
    }
}
