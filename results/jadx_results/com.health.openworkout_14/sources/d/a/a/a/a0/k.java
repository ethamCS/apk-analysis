package d.a.a.a.a0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
/* loaded from: classes.dex */
public class k {
    public static final d.a.a.a.a0.c m = new i(0.5f);

    /* renamed from: a */
    d f3568a;

    /* renamed from: b */
    d f3569b;

    /* renamed from: c */
    d f3570c;

    /* renamed from: d */
    d f3571d;

    /* renamed from: e */
    d.a.a.a.a0.c f3572e;

    /* renamed from: f */
    d.a.a.a.a0.c f3573f;

    /* renamed from: g */
    d.a.a.a.a0.c f3574g;

    /* renamed from: h */
    d.a.a.a.a0.c f3575h;
    f i;
    f j;
    f k;
    f l;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private d f3576a;

        /* renamed from: b */
        private d f3577b;

        /* renamed from: c */
        private d f3578c;

        /* renamed from: d */
        private d f3579d;

        /* renamed from: e */
        private d.a.a.a.a0.c f3580e;

        /* renamed from: f */
        private d.a.a.a.a0.c f3581f;

        /* renamed from: g */
        private d.a.a.a.a0.c f3582g;

        /* renamed from: h */
        private d.a.a.a.a0.c f3583h;
        private f i;
        private f j;
        private f k;
        private f l;

        public b() {
            this.f3576a = h.b();
            this.f3577b = h.b();
            this.f3578c = h.b();
            this.f3579d = h.b();
            this.f3580e = new d.a.a.a.a0.a(0.0f);
            this.f3581f = new d.a.a.a.a0.a(0.0f);
            this.f3582g = new d.a.a.a.a0.a(0.0f);
            this.f3583h = new d.a.a.a.a0.a(0.0f);
            this.i = h.c();
            this.j = h.c();
            this.k = h.c();
            this.l = h.c();
        }

        public b(k kVar) {
            this.f3576a = h.b();
            this.f3577b = h.b();
            this.f3578c = h.b();
            this.f3579d = h.b();
            this.f3580e = new d.a.a.a.a0.a(0.0f);
            this.f3581f = new d.a.a.a.a0.a(0.0f);
            this.f3582g = new d.a.a.a.a0.a(0.0f);
            this.f3583h = new d.a.a.a.a0.a(0.0f);
            this.i = h.c();
            this.j = h.c();
            this.k = h.c();
            this.l = h.c();
            this.f3576a = kVar.f3568a;
            this.f3577b = kVar.f3569b;
            this.f3578c = kVar.f3570c;
            this.f3579d = kVar.f3571d;
            this.f3580e = kVar.f3572e;
            this.f3581f = kVar.f3573f;
            this.f3582g = kVar.f3574g;
            this.f3583h = kVar.f3575h;
            this.i = kVar.i;
            this.j = kVar.j;
            this.k = kVar.k;
            this.l = kVar.l;
        }

        private static float n(d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).f3567a;
            }
            if (!(dVar instanceof e)) {
                return -1.0f;
            }
            return ((e) dVar).f3548a;
        }

        public b A(d.a.a.a.a0.c cVar) {
            this.f3580e = cVar;
            return this;
        }

        public b B(int i, d.a.a.a.a0.c cVar) {
            C(h.a(i));
            E(cVar);
            return this;
        }

        public b C(d dVar) {
            this.f3577b = dVar;
            float n = n(dVar);
            if (n != -1.0f) {
                D(n);
            }
            return this;
        }

        public b D(float f2) {
            this.f3581f = new d.a.a.a.a0.a(f2);
            return this;
        }

        public b E(d.a.a.a.a0.c cVar) {
            this.f3581f = cVar;
            return this;
        }

        public k m() {
            return new k(this);
        }

        public b o(float f2) {
            z(f2);
            D(f2);
            v(f2);
            r(f2);
            return this;
        }

        public b p(int i, d.a.a.a.a0.c cVar) {
            q(h.a(i));
            s(cVar);
            return this;
        }

        public b q(d dVar) {
            this.f3579d = dVar;
            float n = n(dVar);
            if (n != -1.0f) {
                r(n);
            }
            return this;
        }

        public b r(float f2) {
            this.f3583h = new d.a.a.a.a0.a(f2);
            return this;
        }

        public b s(d.a.a.a.a0.c cVar) {
            this.f3583h = cVar;
            return this;
        }

        public b t(int i, d.a.a.a.a0.c cVar) {
            u(h.a(i));
            w(cVar);
            return this;
        }

        public b u(d dVar) {
            this.f3578c = dVar;
            float n = n(dVar);
            if (n != -1.0f) {
                v(n);
            }
            return this;
        }

        public b v(float f2) {
            this.f3582g = new d.a.a.a.a0.a(f2);
            return this;
        }

        public b w(d.a.a.a.a0.c cVar) {
            this.f3582g = cVar;
            return this;
        }

        public b x(int i, d.a.a.a.a0.c cVar) {
            y(h.a(i));
            A(cVar);
            return this;
        }

        public b y(d dVar) {
            this.f3576a = dVar;
            float n = n(dVar);
            if (n != -1.0f) {
                z(n);
            }
            return this;
        }

        public b z(float f2) {
            this.f3580e = new d.a.a.a.a0.a(f2);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        d.a.a.a.a0.c a(d.a.a.a.a0.c cVar);
    }

    public k() {
        this.f3568a = h.b();
        this.f3569b = h.b();
        this.f3570c = h.b();
        this.f3571d = h.b();
        this.f3572e = new d.a.a.a.a0.a(0.0f);
        this.f3573f = new d.a.a.a.a0.a(0.0f);
        this.f3574g = new d.a.a.a.a0.a(0.0f);
        this.f3575h = new d.a.a.a.a0.a(0.0f);
        this.i = h.c();
        this.j = h.c();
        this.k = h.c();
        this.l = h.c();
    }

    private k(b bVar) {
        this.f3568a = bVar.f3576a;
        this.f3569b = bVar.f3577b;
        this.f3570c = bVar.f3578c;
        this.f3571d = bVar.f3579d;
        this.f3572e = bVar.f3580e;
        this.f3573f = bVar.f3581f;
        this.f3574g = bVar.f3582g;
        this.f3575h = bVar.f3583h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i, int i2) {
        return c(context, i, i2, 0);
    }

    private static b c(Context context, int i, int i2, int i3) {
        return d(context, i, i2, new d.a.a.a.a0.a(i3));
    }

    private static b d(Context context, int i, int i2, d.a.a.a.a0.c cVar) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, d.a.a.a.k.E2);
        try {
            int i3 = obtainStyledAttributes.getInt(d.a.a.a.k.F2, 0);
            int i4 = obtainStyledAttributes.getInt(d.a.a.a.k.I2, i3);
            int i5 = obtainStyledAttributes.getInt(d.a.a.a.k.J2, i3);
            int i6 = obtainStyledAttributes.getInt(d.a.a.a.k.H2, i3);
            int i7 = obtainStyledAttributes.getInt(d.a.a.a.k.G2, i3);
            d.a.a.a.a0.c m2 = m(obtainStyledAttributes, d.a.a.a.k.K2, cVar);
            d.a.a.a.a0.c m3 = m(obtainStyledAttributes, d.a.a.a.k.N2, m2);
            d.a.a.a.a0.c m4 = m(obtainStyledAttributes, d.a.a.a.k.O2, m2);
            d.a.a.a.a0.c m5 = m(obtainStyledAttributes, d.a.a.a.k.M2, m2);
            d.a.a.a.a0.c m6 = m(obtainStyledAttributes, d.a.a.a.k.L2, m2);
            b bVar = new b();
            bVar.x(i4, m3);
            bVar.B(i5, m4);
            bVar.t(i6, m5);
            bVar.p(i7, m6);
            return bVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i, int i2) {
        return f(context, attributeSet, i, i2, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return g(context, attributeSet, i, i2, new d.a.a.a.a0.a(i3));
    }

    public static b g(Context context, AttributeSet attributeSet, int i, int i2, d.a.a.a.a0.c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d.a.a.a.k.U1, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(d.a.a.a.k.V1, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(d.a.a.a.k.W1, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, cVar);
    }

    private static d.a.a.a.a0.c m(TypedArray typedArray, int i, d.a.a.a.a0.c cVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return cVar;
        }
        int i2 = peekValue.type;
        return i2 == 5 ? new d.a.a.a.a0.a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new i(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public f h() {
        return this.k;
    }

    public d i() {
        return this.f3571d;
    }

    public d.a.a.a.a0.c j() {
        return this.f3575h;
    }

    public d k() {
        return this.f3570c;
    }

    public d.a.a.a.a0.c l() {
        return this.f3574g;
    }

    public f n() {
        return this.l;
    }

    public f o() {
        return this.j;
    }

    public f p() {
        return this.i;
    }

    public d q() {
        return this.f3568a;
    }

    public d.a.a.a.a0.c r() {
        return this.f3572e;
    }

    public d s() {
        return this.f3569b;
    }

    public d.a.a.a.a0.c t() {
        return this.f3573f;
    }

    public boolean u(RectF rectF) {
        boolean z = this.l.getClass().equals(f.class) && this.j.getClass().equals(f.class) && this.i.getClass().equals(f.class) && this.k.getClass().equals(f.class);
        float a2 = this.f3572e.a(rectF);
        return z && ((this.f3573f.a(rectF) > a2 ? 1 : (this.f3573f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f3575h.a(rectF) > a2 ? 1 : (this.f3575h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.f3574g.a(rectF) > a2 ? 1 : (this.f3574g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.f3569b instanceof j) && (this.f3568a instanceof j) && (this.f3570c instanceof j) && (this.f3571d instanceof j));
    }

    public b v() {
        return new b(this);
    }

    public k w(float f2) {
        b v = v();
        v.o(f2);
        return v.m();
    }

    public k x(c cVar) {
        b v = v();
        v.A(cVar.a(r()));
        v.E(cVar.a(t()));
        v.s(cVar.a(j()));
        v.w(cVar.a(l()));
        return v.m();
    }
}
