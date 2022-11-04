package t5;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
/* loaded from: classes.dex */
public class k {

    /* renamed from: m */
    public static final t5.c f21858m = new i(0.5f);

    /* renamed from: a */
    d f21859a;

    /* renamed from: b */
    d f21860b;

    /* renamed from: c */
    d f21861c;

    /* renamed from: d */
    d f21862d;

    /* renamed from: e */
    t5.c f21863e;

    /* renamed from: f */
    t5.c f21864f;

    /* renamed from: g */
    t5.c f21865g;

    /* renamed from: h */
    t5.c f21866h;

    /* renamed from: i */
    f f21867i;

    /* renamed from: j */
    f f21868j;

    /* renamed from: k */
    f f21869k;

    /* renamed from: l */
    f f21870l;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private d f21871a;

        /* renamed from: b */
        private d f21872b;

        /* renamed from: c */
        private d f21873c;

        /* renamed from: d */
        private d f21874d;

        /* renamed from: e */
        private t5.c f21875e;

        /* renamed from: f */
        private t5.c f21876f;

        /* renamed from: g */
        private t5.c f21877g;

        /* renamed from: h */
        private t5.c f21878h;

        /* renamed from: i */
        private f f21879i;

        /* renamed from: j */
        private f f21880j;

        /* renamed from: k */
        private f f21881k;

        /* renamed from: l */
        private f f21882l;

        public b() {
            this.f21871a = h.b();
            this.f21872b = h.b();
            this.f21873c = h.b();
            this.f21874d = h.b();
            this.f21875e = new t5.a(0.0f);
            this.f21876f = new t5.a(0.0f);
            this.f21877g = new t5.a(0.0f);
            this.f21878h = new t5.a(0.0f);
            this.f21879i = h.c();
            this.f21880j = h.c();
            this.f21881k = h.c();
            this.f21882l = h.c();
        }

        public b(k kVar) {
            this.f21871a = h.b();
            this.f21872b = h.b();
            this.f21873c = h.b();
            this.f21874d = h.b();
            this.f21875e = new t5.a(0.0f);
            this.f21876f = new t5.a(0.0f);
            this.f21877g = new t5.a(0.0f);
            this.f21878h = new t5.a(0.0f);
            this.f21879i = h.c();
            this.f21880j = h.c();
            this.f21881k = h.c();
            this.f21882l = h.c();
            this.f21871a = kVar.f21859a;
            this.f21872b = kVar.f21860b;
            this.f21873c = kVar.f21861c;
            this.f21874d = kVar.f21862d;
            this.f21875e = kVar.f21863e;
            this.f21876f = kVar.f21864f;
            this.f21877g = kVar.f21865g;
            this.f21878h = kVar.f21866h;
            this.f21879i = kVar.f21867i;
            this.f21880j = kVar.f21868j;
            this.f21881k = kVar.f21869k;
            this.f21882l = kVar.f21870l;
        }

        private static float n(d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).f21857a;
            }
            if (!(dVar instanceof e)) {
                return -1.0f;
            }
            return ((e) dVar).f21811a;
        }

        public b A(float f10) {
            this.f21875e = new t5.a(f10);
            return this;
        }

        public b B(t5.c cVar) {
            this.f21875e = cVar;
            return this;
        }

        public b C(int i10, t5.c cVar) {
            return D(h.a(i10)).F(cVar);
        }

        public b D(d dVar) {
            this.f21872b = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                E(n10);
            }
            return this;
        }

        public b E(float f10) {
            this.f21876f = new t5.a(f10);
            return this;
        }

        public b F(t5.c cVar) {
            this.f21876f = cVar;
            return this;
        }

        public k m() {
            return new k(this);
        }

        public b o(float f10) {
            return A(f10).E(f10).w(f10).s(f10);
        }

        public b p(t5.c cVar) {
            return B(cVar).F(cVar).x(cVar).t(cVar);
        }

        public b q(int i10, t5.c cVar) {
            return r(h.a(i10)).t(cVar);
        }

        public b r(d dVar) {
            this.f21874d = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                s(n10);
            }
            return this;
        }

        public b s(float f10) {
            this.f21878h = new t5.a(f10);
            return this;
        }

        public b t(t5.c cVar) {
            this.f21878h = cVar;
            return this;
        }

        public b u(int i10, t5.c cVar) {
            return v(h.a(i10)).x(cVar);
        }

        public b v(d dVar) {
            this.f21873c = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                w(n10);
            }
            return this;
        }

        public b w(float f10) {
            this.f21877g = new t5.a(f10);
            return this;
        }

        public b x(t5.c cVar) {
            this.f21877g = cVar;
            return this;
        }

        public b y(int i10, t5.c cVar) {
            return z(h.a(i10)).B(cVar);
        }

        public b z(d dVar) {
            this.f21871a = dVar;
            float n10 = n(dVar);
            if (n10 != -1.0f) {
                A(n10);
            }
            return this;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        t5.c a(t5.c cVar);
    }

    public k() {
        this.f21859a = h.b();
        this.f21860b = h.b();
        this.f21861c = h.b();
        this.f21862d = h.b();
        this.f21863e = new t5.a(0.0f);
        this.f21864f = new t5.a(0.0f);
        this.f21865g = new t5.a(0.0f);
        this.f21866h = new t5.a(0.0f);
        this.f21867i = h.c();
        this.f21868j = h.c();
        this.f21869k = h.c();
        this.f21870l = h.c();
    }

    private k(b bVar) {
        this.f21859a = bVar.f21871a;
        this.f21860b = bVar.f21872b;
        this.f21861c = bVar.f21873c;
        this.f21862d = bVar.f21874d;
        this.f21863e = bVar.f21875e;
        this.f21864f = bVar.f21876f;
        this.f21865g = bVar.f21877g;
        this.f21866h = bVar.f21878h;
        this.f21867i = bVar.f21879i;
        this.f21868j = bVar.f21880j;
        this.f21869k = bVar.f21881k;
        this.f21870l = bVar.f21882l;
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i10, int i11) {
        return c(context, i10, i11, 0);
    }

    private static b c(Context context, int i10, int i11, int i12) {
        return d(context, i10, i11, new t5.a(i12));
    }

    private static b d(Context context, int i10, int i11, t5.c cVar) {
        if (i11 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
            i10 = i11;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, b5.l.f5711w4);
        try {
            int i12 = obtainStyledAttributes.getInt(b5.l.f5720x4, 0);
            int i13 = obtainStyledAttributes.getInt(b5.l.A4, i12);
            int i14 = obtainStyledAttributes.getInt(b5.l.B4, i12);
            int i15 = obtainStyledAttributes.getInt(b5.l.f5736z4, i12);
            int i16 = obtainStyledAttributes.getInt(b5.l.f5728y4, i12);
            t5.c m10 = m(obtainStyledAttributes, b5.l.C4, cVar);
            t5.c m11 = m(obtainStyledAttributes, b5.l.F4, m10);
            t5.c m12 = m(obtainStyledAttributes, b5.l.G4, m10);
            t5.c m13 = m(obtainStyledAttributes, b5.l.E4, m10);
            return new b().y(i13, m11).C(i14, m12).u(i15, m13).q(i16, m(obtainStyledAttributes, b5.l.D4, m10));
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i10, int i11) {
        return f(context, attributeSet, i10, i11, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i10, int i11, int i12) {
        return g(context, attributeSet, i10, i11, new t5.a(i12));
    }

    public static b g(Context context, AttributeSet attributeSet, int i10, int i11, t5.c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b5.l.D3, i10, i11);
        int resourceId = obtainStyledAttributes.getResourceId(b5.l.E3, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(b5.l.F3, 0);
        obtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, cVar);
    }

    private static t5.c m(TypedArray typedArray, int i10, t5.c cVar) {
        TypedValue peekValue = typedArray.peekValue(i10);
        if (peekValue == null) {
            return cVar;
        }
        int i11 = peekValue.type;
        return i11 == 5 ? new t5.a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i11 == 6 ? new i(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public f h() {
        return this.f21869k;
    }

    public d i() {
        return this.f21862d;
    }

    public t5.c j() {
        return this.f21866h;
    }

    public d k() {
        return this.f21861c;
    }

    public t5.c l() {
        return this.f21865g;
    }

    public f n() {
        return this.f21870l;
    }

    public f o() {
        return this.f21868j;
    }

    public f p() {
        return this.f21867i;
    }

    public d q() {
        return this.f21859a;
    }

    public t5.c r() {
        return this.f21863e;
    }

    public d s() {
        return this.f21860b;
    }

    public t5.c t() {
        return this.f21864f;
    }

    public boolean u(RectF rectF) {
        boolean z10 = this.f21870l.getClass().equals(f.class) && this.f21868j.getClass().equals(f.class) && this.f21867i.getClass().equals(f.class) && this.f21869k.getClass().equals(f.class);
        float a10 = this.f21863e.a(rectF);
        return z10 && ((this.f21864f.a(rectF) > a10 ? 1 : (this.f21864f.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f21866h.a(rectF) > a10 ? 1 : (this.f21866h.a(rectF) == a10 ? 0 : -1)) == 0 && (this.f21865g.a(rectF) > a10 ? 1 : (this.f21865g.a(rectF) == a10 ? 0 : -1)) == 0) && ((this.f21860b instanceof j) && (this.f21859a instanceof j) && (this.f21861c instanceof j) && (this.f21862d instanceof j));
    }

    public b v() {
        return new b(this);
    }

    public k w(float f10) {
        return v().o(f10).m();
    }

    public k x(t5.c cVar) {
        return v().p(cVar).m();
    }

    public k y(c cVar) {
        return v().B(cVar.a(r())).F(cVar.a(t())).t(cVar.a(j())).x(cVar.a(l())).m();
    }
}
