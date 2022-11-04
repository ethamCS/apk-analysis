package androidx.constraintlayout.motion.widget;

import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import o0.b;
import o0.c;
import o0.d;
/* loaded from: classes.dex */
public class g {

    /* renamed from: a */
    boolean f2757a;

    /* renamed from: b */
    private k f2758b;

    /* renamed from: c */
    private k f2759c;

    /* renamed from: d */
    private f f2760d;

    /* renamed from: e */
    private f f2761e;

    /* renamed from: f */
    private k0.a[] f2762f;

    /* renamed from: g */
    private k0.a f2763g;

    /* renamed from: h */
    float f2764h;

    /* renamed from: i */
    float f2765i;

    /* renamed from: j */
    private int[] f2766j;

    /* renamed from: k */
    private double[] f2767k;

    /* renamed from: l */
    private double[] f2768l;

    /* renamed from: m */
    private String[] f2769m;

    /* renamed from: n */
    private float[] f2770n;

    /* renamed from: o */
    private ArrayList<k> f2771o;

    /* renamed from: p */
    private HashMap<String, o0.d> f2772p;

    /* renamed from: q */
    private HashMap<String, o0.c> f2773q;

    /* renamed from: r */
    private HashMap<String, o0.b> f2774r;

    /* renamed from: s */
    private e[] f2775s;

    /* renamed from: t */
    private int f2776t;

    /* renamed from: u */
    private View f2777u;

    /* renamed from: v */
    private int f2778v;

    /* renamed from: w */
    private float f2779w;

    /* renamed from: x */
    private Interpolator f2780x;

    /* renamed from: y */
    private boolean f2781y;

    private float a(float f10, float[] fArr) {
        float f11 = 0.0f;
        float f12 = 1.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f13 = this.f2765i;
            if (f13 != 1.0d) {
                float f14 = this.f2764h;
                if (f10 < f14) {
                    f10 = 0.0f;
                }
                if (f10 > f14 && f10 < 1.0d) {
                    f10 = Math.min((f10 - f14) * f13, 1.0f);
                }
            }
        }
        k0.b bVar = this.f2758b.f2823c;
        float f15 = Float.NaN;
        Iterator<k> it = this.f2771o.iterator();
        while (it.hasNext()) {
            k next = it.next();
            k0.b bVar2 = next.f2823c;
            if (bVar2 != null) {
                float f16 = next.f2830q;
                if (f16 < f10) {
                    bVar = bVar2;
                    f11 = f16;
                } else if (Float.isNaN(f15)) {
                    f15 = next.f2830q;
                }
            }
        }
        if (bVar != null) {
            if (!Float.isNaN(f15)) {
                f12 = f15;
            }
            float f17 = f12 - f11;
            double d10 = (f10 - f11) / f17;
            f10 = (((float) bVar.a(d10)) * f17) + f11;
            if (fArr != null) {
                fArr[0] = (float) bVar.b(d10);
            }
        }
        return f10;
    }

    public void b(double d10, float[] fArr, float[] fArr2) {
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.f2762f[0].b(d10, dArr);
        this.f2762f[0].d(d10, dArr2);
        Arrays.fill(fArr2, 0.0f);
        this.f2758b.b(d10, this.f2766j, dArr, fArr, dArr2, fArr2);
    }

    public boolean c(View view, float f10, long j10, k0.c cVar) {
        boolean z10;
        d.a aVar;
        int i10;
        double d10;
        View view2;
        float a10 = a(f10, null);
        int i11 = this.f2778v;
        if (i11 != d.f2754a) {
            float f11 = 1.0f / i11;
            float floor = ((float) Math.floor(a10 / f11)) * f11;
            float f12 = (a10 % f11) / f11;
            if (!Float.isNaN(this.f2779w)) {
                f12 = (f12 + this.f2779w) % 1.0f;
            }
            Interpolator interpolator = this.f2780x;
            a10 = ((interpolator != null ? interpolator.getInterpolation(f12) : ((double) f12) > 0.5d ? 1.0f : 0.0f) * f11) + floor;
        }
        float f13 = a10;
        HashMap<String, o0.c> hashMap = this.f2773q;
        if (hashMap != null) {
            for (o0.c cVar2 : hashMap.values()) {
                cVar2.b(view, f13);
            }
        }
        HashMap<String, o0.d> hashMap2 = this.f2772p;
        if (hashMap2 != null) {
            d.a aVar2 = null;
            boolean z11 = false;
            for (o0.d dVar : hashMap2.values()) {
                if (dVar instanceof d.a) {
                    aVar2 = (d.a) dVar;
                } else {
                    z11 |= dVar.b(view, f13, j10, cVar);
                }
            }
            z10 = z11;
            aVar = aVar2;
        } else {
            aVar = null;
            z10 = false;
        }
        k0.a[] aVarArr = this.f2762f;
        if (aVarArr != null) {
            double d11 = f13;
            aVarArr[0].b(d11, this.f2767k);
            this.f2762f[0].d(d11, this.f2768l);
            k0.a aVar3 = this.f2763g;
            if (aVar3 != null) {
                double[] dArr = this.f2767k;
                if (dArr.length > 0) {
                    aVar3.b(d11, dArr);
                    this.f2763g.d(d11, this.f2768l);
                }
            }
            if (!this.f2781y) {
                d10 = d11;
                this.f2758b.d(f13, view, this.f2766j, this.f2767k, this.f2768l, null, this.f2757a);
                this.f2757a = false;
            } else {
                d10 = d11;
            }
            if (this.f2776t != d.f2754a) {
                if (this.f2777u == null) {
                    this.f2777u = ((View) view.getParent()).findViewById(this.f2776t);
                }
                if (this.f2777u != null) {
                    float top = (view2.getTop() + this.f2777u.getBottom()) / 2.0f;
                    float left = (this.f2777u.getLeft() + this.f2777u.getRight()) / 2.0f;
                    if (view.getRight() - view.getLeft() > 0 && view.getBottom() - view.getTop() > 0) {
                        view.setPivotX(left - view.getLeft());
                        view.setPivotY(top - view.getTop());
                    }
                }
            }
            HashMap<String, o0.c> hashMap3 = this.f2773q;
            if (hashMap3 != null) {
                for (o0.c cVar3 : hashMap3.values()) {
                    if (cVar3 instanceof c.a) {
                        double[] dArr2 = this.f2768l;
                        if (dArr2.length > 1) {
                            ((c.a) cVar3).c(view, f13, dArr2[0], dArr2[1]);
                        }
                    }
                }
            }
            if (aVar != null) {
                double[] dArr3 = this.f2768l;
                i10 = 1;
                z10 |= aVar.c(view, cVar, f13, j10, dArr3[0], dArr3[1]);
            } else {
                i10 = 1;
            }
            int i12 = i10;
            while (true) {
                k0.a[] aVarArr2 = this.f2762f;
                if (i12 >= aVarArr2.length) {
                    break;
                }
                aVarArr2[i12].c(d10, this.f2770n);
                o0.a.b(this.f2758b.f2826d4.get(this.f2769m[i12 - 1]), view, this.f2770n);
                i12++;
            }
            f fVar = this.f2760d;
            if (fVar.f2755c == 0) {
                if (f13 > 0.0f) {
                    if (f13 >= 1.0f) {
                        fVar = this.f2761e;
                    } else if (this.f2761e.f2756d != fVar.f2756d) {
                        view.setVisibility(0);
                    }
                }
                view.setVisibility(fVar.f2756d);
            }
            if (this.f2775s != null) {
                int i13 = 0;
                while (true) {
                    e[] eVarArr = this.f2775s;
                    if (i13 >= eVarArr.length) {
                        break;
                    }
                    eVarArr[i13].a(f13, view);
                    i13++;
                }
            }
        } else {
            i10 = 1;
            k kVar = this.f2758b;
            float f14 = kVar.f2832y;
            k kVar2 = this.f2759c;
            float f15 = f14 + ((kVar2.f2832y - f14) * f13);
            float f16 = kVar.U3;
            float f17 = f16 + ((kVar2.U3 - f16) * f13);
            float f18 = kVar.V3;
            float f19 = kVar2.V3;
            float f20 = kVar.W3;
            float f21 = kVar2.W3;
            float f22 = f15 + 0.5f;
            int i14 = (int) f22;
            float f23 = f17 + 0.5f;
            int i15 = (int) f23;
            int i16 = (int) (f22 + ((f19 - f18) * f13) + f18);
            int i17 = (int) (f23 + ((f21 - f20) * f13) + f20);
            int i18 = i16 - i14;
            int i19 = i17 - i15;
            if (f19 != f18 || f21 != f20 || this.f2757a) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
                this.f2757a = false;
            }
            view.layout(i14, i15, i16, i17);
        }
        HashMap<String, o0.b> hashMap4 = this.f2774r;
        if (hashMap4 != null) {
            for (o0.b bVar : hashMap4.values()) {
                if (bVar instanceof b.a) {
                    double[] dArr4 = this.f2768l;
                    ((b.a) bVar).c(view, f13, dArr4[0], dArr4[i10]);
                } else {
                    bVar.b(view, f13);
                }
            }
        }
        return z10;
    }

    public String toString() {
        return " start: x: " + this.f2758b.f2832y + " y: " + this.f2758b.U3 + " end: x: " + this.f2759c.f2832y + " y: " + this.f2759c.U3;
    }
}
