package b.a.a.a.b0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
/* loaded from: classes.dex */
public class k {

    /* renamed from: a */
    d f1182a;

    /* renamed from: b */
    d f1183b;

    /* renamed from: c */
    d f1184c;
    d d;
    b.a.a.a.b0.c e;
    b.a.a.a.b0.c f;
    b.a.a.a.b0.c g;
    b.a.a.a.b0.c h;
    f i;
    f j;
    f k;
    f l;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private d f1185a;

        /* renamed from: b */
        private d f1186b;

        /* renamed from: c */
        private d f1187c;
        private d d;
        private b.a.a.a.b0.c e;
        private b.a.a.a.b0.c f;
        private b.a.a.a.b0.c g;
        private b.a.a.a.b0.c h;
        private f i;
        private f j;
        private f k;
        private f l;

        public b() {
            this.f1185a = h.a();
            this.f1186b = h.a();
            this.f1187c = h.a();
            this.d = h.a();
            this.e = new b.a.a.a.b0.a(0.0f);
            this.f = new b.a.a.a.b0.a(0.0f);
            this.g = new b.a.a.a.b0.a(0.0f);
            this.h = new b.a.a.a.b0.a(0.0f);
            this.i = h.b();
            this.j = h.b();
            this.k = h.b();
            this.l = h.b();
        }

        public b(k kVar) {
            this.f1185a = h.a();
            this.f1186b = h.a();
            this.f1187c = h.a();
            this.d = h.a();
            this.e = new b.a.a.a.b0.a(0.0f);
            this.f = new b.a.a.a.b0.a(0.0f);
            this.g = new b.a.a.a.b0.a(0.0f);
            this.h = new b.a.a.a.b0.a(0.0f);
            this.i = h.b();
            this.j = h.b();
            this.k = h.b();
            this.l = h.b();
            this.f1185a = kVar.f1182a;
            this.f1186b = kVar.f1183b;
            this.f1187c = kVar.f1184c;
            this.d = kVar.d;
            this.e = kVar.e;
            this.f = kVar.f;
            this.g = kVar.g;
            this.h = kVar.h;
            this.i = kVar.i;
            this.j = kVar.j;
            this.k = kVar.k;
            this.l = kVar.l;
        }

        private static float e(d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).f1181a;
            }
            if (!(dVar instanceof e)) {
                return -1.0f;
            }
            return ((e) dVar).f1172a;
        }

        public b a(float f) {
            d(f);
            e(f);
            c(f);
            b(f);
            return this;
        }

        public b a(int i, b.a.a.a.b0.c cVar) {
            a(h.a(i));
            a(cVar);
            return this;
        }

        public b a(b.a.a.a.b0.c cVar) {
            this.h = cVar;
            return this;
        }

        public b a(d dVar) {
            this.d = dVar;
            float e = e(dVar);
            if (e != -1.0f) {
                b(e);
            }
            return this;
        }

        public k a() {
            return new k(this);
        }

        public b b(float f) {
            this.h = new b.a.a.a.b0.a(f);
            return this;
        }

        public b b(int i, b.a.a.a.b0.c cVar) {
            b(h.a(i));
            b(cVar);
            return this;
        }

        public b b(b.a.a.a.b0.c cVar) {
            this.g = cVar;
            return this;
        }

        public b b(d dVar) {
            this.f1187c = dVar;
            float e = e(dVar);
            if (e != -1.0f) {
                c(e);
            }
            return this;
        }

        public b c(float f) {
            this.g = new b.a.a.a.b0.a(f);
            return this;
        }

        public b c(int i, b.a.a.a.b0.c cVar) {
            c(h.a(i));
            c(cVar);
            return this;
        }

        public b c(b.a.a.a.b0.c cVar) {
            this.e = cVar;
            return this;
        }

        public b c(d dVar) {
            this.f1185a = dVar;
            float e = e(dVar);
            if (e != -1.0f) {
                d(e);
            }
            return this;
        }

        public b d(float f) {
            this.e = new b.a.a.a.b0.a(f);
            return this;
        }

        public b d(int i, b.a.a.a.b0.c cVar) {
            d(h.a(i));
            d(cVar);
            return this;
        }

        public b d(b.a.a.a.b0.c cVar) {
            this.f = cVar;
            return this;
        }

        public b d(d dVar) {
            this.f1186b = dVar;
            float e = e(dVar);
            if (e != -1.0f) {
                e(e);
            }
            return this;
        }

        public b e(float f) {
            this.f = new b.a.a.a.b0.a(f);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        b.a.a.a.b0.c a(b.a.a.a.b0.c cVar);
    }

    static {
        new i(0.5f);
    }

    public k() {
        this.f1182a = h.a();
        this.f1183b = h.a();
        this.f1184c = h.a();
        this.d = h.a();
        this.e = new b.a.a.a.b0.a(0.0f);
        this.f = new b.a.a.a.b0.a(0.0f);
        this.g = new b.a.a.a.b0.a(0.0f);
        this.h = new b.a.a.a.b0.a(0.0f);
        this.i = h.b();
        this.j = h.b();
        this.k = h.b();
        this.l = h.b();
    }

    private k(b bVar) {
        this.f1182a = bVar.f1185a;
        this.f1183b = bVar.f1186b;
        this.f1184c = bVar.f1187c;
        this.d = bVar.d;
        this.e = bVar.e;
        this.f = bVar.f;
        this.g = bVar.g;
        this.h = bVar.h;
        this.i = bVar.i;
        this.j = bVar.j;
        this.k = bVar.k;
        this.l = bVar.l;
    }

    private static b.a.a.a.b0.c a(TypedArray typedArray, int i, b.a.a.a.b0.c cVar) {
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return cVar;
        }
        int i2 = peekValue.type;
        return i2 == 5 ? new b.a.a.a.b0.a(TypedValue.complexToDimensionPixelSize(peekValue.data, typedArray.getResources().getDisplayMetrics())) : i2 == 6 ? new i(peekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public static b a(Context context, int i, int i2) {
        return a(context, i, i2, 0);
    }

    private static b a(Context context, int i, int i2, int i3) {
        return a(context, i, i2, new b.a.a.a.b0.a(i3));
    }

    private static b a(Context context, int i, int i2, b.a.a.a.b0.c cVar) {
        if (i2 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i);
            i = i2;
            context = contextThemeWrapper;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, b.a.a.a.l.ShapeAppearance);
        try {
            int i3 = obtainStyledAttributes.getInt(b.a.a.a.l.ShapeAppearance_cornerFamily, 0);
            int i4 = obtainStyledAttributes.getInt(b.a.a.a.l.ShapeAppearance_cornerFamilyTopLeft, i3);
            int i5 = obtainStyledAttributes.getInt(b.a.a.a.l.ShapeAppearance_cornerFamilyTopRight, i3);
            int i6 = obtainStyledAttributes.getInt(b.a.a.a.l.ShapeAppearance_cornerFamilyBottomRight, i3);
            int i7 = obtainStyledAttributes.getInt(b.a.a.a.l.ShapeAppearance_cornerFamilyBottomLeft, i3);
            b.a.a.a.b0.c a2 = a(obtainStyledAttributes, b.a.a.a.l.ShapeAppearance_cornerSize, cVar);
            b.a.a.a.b0.c a3 = a(obtainStyledAttributes, b.a.a.a.l.ShapeAppearance_cornerSizeTopLeft, a2);
            b.a.a.a.b0.c a4 = a(obtainStyledAttributes, b.a.a.a.l.ShapeAppearance_cornerSizeTopRight, a2);
            b.a.a.a.b0.c a5 = a(obtainStyledAttributes, b.a.a.a.l.ShapeAppearance_cornerSizeBottomRight, a2);
            b.a.a.a.b0.c a6 = a(obtainStyledAttributes, b.a.a.a.l.ShapeAppearance_cornerSizeBottomLeft, a2);
            b bVar = new b();
            bVar.c(i4, a3);
            bVar.d(i5, a4);
            bVar.b(i6, a5);
            bVar.a(i7, a6);
            return bVar;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public static b a(Context context, AttributeSet attributeSet, int i, int i2) {
        return a(context, attributeSet, i, i2, 0);
    }

    public static b a(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        return a(context, attributeSet, i, i2, new b.a.a.a.b0.a(i3));
    }

    public static b a(Context context, AttributeSet attributeSet, int i, int i2, b.a.a.a.b0.c cVar) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, b.a.a.a.l.MaterialShape, i, i2);
        int resourceId = obtainStyledAttributes.getResourceId(b.a.a.a.l.MaterialShape_shapeAppearance, 0);
        int resourceId2 = obtainStyledAttributes.getResourceId(b.a.a.a.l.MaterialShape_shapeAppearanceOverlay, 0);
        obtainStyledAttributes.recycle();
        return a(context, resourceId, resourceId2, cVar);
    }

    public static b n() {
        return new b();
    }

    public f a() {
        return this.k;
    }

    public k a(float f) {
        b m = m();
        m.a(f);
        return m.a();
    }

    public k a(c cVar) {
        b m = m();
        m.c(cVar.a(j()));
        m.d(cVar.a(l()));
        m.a(cVar.a(c()));
        m.b(cVar.a(e()));
        return m.a();
    }

    public boolean a(RectF rectF) {
        boolean z = this.l.getClass().equals(f.class) && this.j.getClass().equals(f.class) && this.i.getClass().equals(f.class) && this.k.getClass().equals(f.class);
        float a2 = this.e.a(rectF);
        return z && ((this.f.a(rectF) > a2 ? 1 : (this.f.a(rectF) == a2 ? 0 : -1)) == 0 && (this.h.a(rectF) > a2 ? 1 : (this.h.a(rectF) == a2 ? 0 : -1)) == 0 && (this.g.a(rectF) > a2 ? 1 : (this.g.a(rectF) == a2 ? 0 : -1)) == 0) && ((this.f1183b instanceof j) && (this.f1182a instanceof j) && (this.f1184c instanceof j) && (this.d instanceof j));
    }

    public d b() {
        return this.d;
    }

    public b.a.a.a.b0.c c() {
        return this.h;
    }

    public d d() {
        return this.f1184c;
    }

    public b.a.a.a.b0.c e() {
        return this.g;
    }

    public f f() {
        return this.l;
    }

    public f g() {
        return this.j;
    }

    public f h() {
        return this.i;
    }

    public d i() {
        return this.f1182a;
    }

    public b.a.a.a.b0.c j() {
        return this.e;
    }

    public d k() {
        return this.f1183b;
    }

    public b.a.a.a.b0.c l() {
        return this.f;
    }

    public b m() {
        return new b(this);
    }
}
