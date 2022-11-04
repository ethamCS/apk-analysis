package o4;

import android.graphics.Color;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;
import p4.c;
/* loaded from: classes.dex */
class s {

    /* renamed from: a */
    private static final c.a f17530a = c.a.a("x", "y");

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f17531a;

        static {
            int[] iArr = new int[c.b.values().length];
            f17531a = iArr;
            try {
                iArr[c.b.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17531a[c.b.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17531a[c.b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static PointF a(p4.c cVar, float f10) {
        cVar.e();
        float p10 = (float) cVar.p();
        float p11 = (float) cVar.p();
        while (cVar.B() != c.b.END_ARRAY) {
            cVar.W();
        }
        cVar.h();
        return new PointF(p10 * f10, p11 * f10);
    }

    private static PointF b(p4.c cVar, float f10) {
        float p10 = (float) cVar.p();
        float p11 = (float) cVar.p();
        while (cVar.j()) {
            cVar.W();
        }
        return new PointF(p10 * f10, p11 * f10);
    }

    private static PointF c(p4.c cVar, float f10) {
        cVar.f();
        float f11 = 0.0f;
        float f12 = 0.0f;
        while (cVar.j()) {
            int M = cVar.M(f17530a);
            if (M == 0) {
                f11 = g(cVar);
            } else if (M != 1) {
                cVar.V();
                cVar.W();
            } else {
                f12 = g(cVar);
            }
        }
        cVar.i();
        return new PointF(f11 * f10, f12 * f10);
    }

    public static int d(p4.c cVar) {
        cVar.e();
        int p10 = (int) (cVar.p() * 255.0d);
        int p11 = (int) (cVar.p() * 255.0d);
        int p12 = (int) (cVar.p() * 255.0d);
        while (cVar.j()) {
            cVar.W();
        }
        cVar.h();
        return Color.argb(255, p10, p11, p12);
    }

    public static PointF e(p4.c cVar, float f10) {
        int i10 = a.f17531a[cVar.B().ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return a(cVar, f10);
            }
            if (i10 == 3) {
                return c(cVar, f10);
            }
            throw new IllegalArgumentException("Unknown point starts with " + cVar.B());
        }
        return b(cVar, f10);
    }

    public static List<PointF> f(p4.c cVar, float f10) {
        ArrayList arrayList = new ArrayList();
        cVar.e();
        while (cVar.B() == c.b.BEGIN_ARRAY) {
            cVar.e();
            arrayList.add(e(cVar, f10));
            cVar.h();
        }
        cVar.h();
        return arrayList;
    }

    public static float g(p4.c cVar) {
        c.b B = cVar.B();
        int i10 = a.f17531a[B.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalArgumentException("Unknown value for token of type " + B);
            }
            cVar.e();
            float p10 = (float) cVar.p();
            while (cVar.j()) {
                cVar.W();
            }
            cVar.h();
            return p10;
        }
        return (float) cVar.p();
    }
}
