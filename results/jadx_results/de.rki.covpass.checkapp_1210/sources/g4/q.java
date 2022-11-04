package g4;

import android.graphics.PointF;
import h4.a;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class q implements s, a.b {

    /* renamed from: a */
    private final com.airbnb.lottie.n f10508a;

    /* renamed from: b */
    private final String f10509b;

    /* renamed from: c */
    private final h4.a<Float, Float> f10510c;

    /* renamed from: d */
    private l4.n f10511d;

    public q(com.airbnb.lottie.n nVar, m4.b bVar, l4.m mVar) {
        this.f10508a = nVar;
        this.f10509b = mVar.c();
        h4.a<Float, Float> n10 = mVar.b().n();
        this.f10510c = n10;
        bVar.i(n10);
        n10.a(this);
    }

    private static int d(int i10, int i11) {
        int i12 = i10 / i11;
        return ((i10 ^ i11) >= 0 || i11 * i12 == i10) ? i12 : i12 - 1;
    }

    private static int e(int i10, int i11) {
        return i10 - (d(i10, i11) * i11);
    }

    private l4.n i(l4.n nVar) {
        List<j4.a> a10 = nVar.a();
        boolean d10 = nVar.d();
        int size = a10.size() - 1;
        int i10 = 0;
        while (size >= 0) {
            j4.a aVar = a10.get(size);
            j4.a aVar2 = a10.get(e(size - 1, a10.size()));
            PointF c10 = (size != 0 || d10) ? aVar2.c() : nVar.b();
            i10 = (!((size != 0 || d10) ? aVar2.b() : c10).equals(c10) || !aVar.a().equals(c10) || (!nVar.d() && size == 0 && size == a10.size() - 1)) ? i10 + 1 : i10 + 2;
            size--;
        }
        l4.n nVar2 = this.f10511d;
        if (nVar2 == null || nVar2.a().size() != i10) {
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(new j4.a());
            }
            this.f10511d = new l4.n(new PointF(0.0f, 0.0f), false, arrayList);
        }
        this.f10511d.e(d10);
        return this.f10511d;
    }

    @Override // h4.a.b
    public void b() {
        this.f10508a.invalidateSelf();
    }

    @Override // g4.c
    public void c(List<c> list, List<c> list2) {
    }

    @Override // g4.s
    public l4.n f(l4.n nVar) {
        List<j4.a> list;
        List<j4.a> a10 = nVar.a();
        if (a10.size() <= 2) {
            return nVar;
        }
        float floatValue = this.f10510c.h().floatValue();
        if (floatValue == 0.0f) {
            return nVar;
        }
        l4.n i10 = i(nVar);
        i10.f(nVar.b().x, nVar.b().y);
        List<j4.a> a11 = i10.a();
        boolean d10 = nVar.d();
        int i11 = 0;
        int i12 = 0;
        while (i11 < a10.size()) {
            j4.a aVar = a10.get(i11);
            j4.a aVar2 = a10.get(e(i11 - 1, a10.size()));
            j4.a aVar3 = a10.get(e(i11 - 2, a10.size()));
            PointF c10 = (i11 != 0 || d10) ? aVar2.c() : nVar.b();
            PointF b10 = (i11 != 0 || d10) ? aVar2.b() : c10;
            PointF a12 = aVar.a();
            PointF c11 = aVar3.c();
            PointF c12 = aVar.c();
            boolean z10 = !nVar.d() && i11 == 0 && i11 == a10.size() + (-1);
            if (!b10.equals(c10) || !a12.equals(c10) || z10) {
                list = a10;
                j4.a aVar4 = a11.get(e(i12 - 1, a11.size()));
                aVar4.e(aVar2.c().x, aVar2.c().y);
                aVar4.f(aVar2.c().x, aVar2.c().y);
                a11.get(i12).d(aVar.c().x, aVar.c().y);
            } else {
                float f10 = c10.x;
                float f11 = f10 - c11.x;
                float f12 = c10.y;
                float f13 = c12.x - f10;
                list = a10;
                float min = Math.min(floatValue / ((float) Math.hypot(f11, f12 - c11.y)), 0.5f);
                float min2 = Math.min(floatValue / ((float) Math.hypot(f13, c12.y - f12)), 0.5f);
                float f14 = c10.x;
                float f15 = ((c11.x - f14) * min) + f14;
                float f16 = c10.y;
                float f17 = ((c11.y - f16) * min) + f16;
                float f18 = ((c12.x - f14) * min2) + f14;
                float f19 = ((c12.y - f16) * min2) + f16;
                float f20 = f15 - ((f15 - f14) * 0.5519f);
                float f21 = f17 - ((f17 - f16) * 0.5519f);
                float f22 = f18 - ((f18 - f14) * 0.5519f);
                float f23 = f19 - ((f19 - f16) * 0.5519f);
                j4.a aVar5 = a11.get(e(i12 - 1, a11.size()));
                j4.a aVar6 = a11.get(i12);
                aVar5.e(f15, f17);
                aVar5.f(f15, f17);
                if (i11 == 0) {
                    i10.f(f15, f17);
                }
                aVar6.d(f20, f21);
                i12++;
                aVar6.e(f22, f23);
                aVar6.f(f18, f19);
                a11.get(i12).d(f18, f19);
            }
            i12++;
            i11++;
            a10 = list;
        }
        return i10;
    }

    public h4.a<Float, Float> h() {
        return this.f10510c;
    }
}
