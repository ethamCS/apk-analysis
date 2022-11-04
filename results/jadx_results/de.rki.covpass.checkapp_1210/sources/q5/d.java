package q5;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import androidx.core.content.res.h;
import b5.l;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a */
    public final ColorStateList f19649a;

    /* renamed from: b */
    public final ColorStateList f19650b;

    /* renamed from: c */
    public final ColorStateList f19651c;

    /* renamed from: d */
    public final String f19652d;

    /* renamed from: e */
    public final int f19653e;

    /* renamed from: f */
    public final int f19654f;

    /* renamed from: g */
    public final boolean f19655g;

    /* renamed from: h */
    public final float f19656h;

    /* renamed from: i */
    public final float f19657i;

    /* renamed from: j */
    public final float f19658j;

    /* renamed from: k */
    public final boolean f19659k;

    /* renamed from: l */
    public final float f19660l;

    /* renamed from: m */
    private ColorStateList f19661m;

    /* renamed from: n */
    private float f19662n;

    /* renamed from: o */
    private final int f19663o;

    /* renamed from: p */
    private boolean f19664p = false;

    /* renamed from: q */
    private Typeface f19665q;

    /* loaded from: classes.dex */
    public class a extends h.e {

        /* renamed from: a */
        final /* synthetic */ f f19666a;

        a(f fVar) {
            d.this = r1;
            this.f19666a = fVar;
        }

        @Override // androidx.core.content.res.h.e
        public void h(int i10) {
            d.this.f19664p = true;
            this.f19666a.a(i10);
        }

        @Override // androidx.core.content.res.h.e
        public void i(Typeface typeface) {
            d dVar = d.this;
            dVar.f19665q = Typeface.create(typeface, dVar.f19653e);
            d.this.f19664p = true;
            this.f19666a.b(d.this.f19665q, false);
        }
    }

    /* loaded from: classes.dex */
    public class b extends f {

        /* renamed from: a */
        final /* synthetic */ Context f19668a;

        /* renamed from: b */
        final /* synthetic */ TextPaint f19669b;

        /* renamed from: c */
        final /* synthetic */ f f19670c;

        b(Context context, TextPaint textPaint, f fVar) {
            d.this = r1;
            this.f19668a = context;
            this.f19669b = textPaint;
            this.f19670c = fVar;
        }

        @Override // q5.f
        public void a(int i10) {
            this.f19670c.a(i10);
        }

        @Override // q5.f
        public void b(Typeface typeface, boolean z10) {
            d.this.p(this.f19668a, this.f19669b, typeface);
            this.f19670c.b(typeface, z10);
        }
    }

    public d(Context context, int i10) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i10, l.G5);
        l(obtainStyledAttributes.getDimension(l.H5, 0.0f));
        k(c.a(context, obtainStyledAttributes, l.K5));
        this.f19649a = c.a(context, obtainStyledAttributes, l.L5);
        this.f19650b = c.a(context, obtainStyledAttributes, l.M5);
        this.f19653e = obtainStyledAttributes.getInt(l.J5, 0);
        this.f19654f = obtainStyledAttributes.getInt(l.I5, 1);
        int e10 = c.e(obtainStyledAttributes, l.S5, l.R5);
        this.f19663o = obtainStyledAttributes.getResourceId(e10, 0);
        this.f19652d = obtainStyledAttributes.getString(e10);
        this.f19655g = obtainStyledAttributes.getBoolean(l.T5, false);
        this.f19651c = c.a(context, obtainStyledAttributes, l.N5);
        this.f19656h = obtainStyledAttributes.getFloat(l.O5, 0.0f);
        this.f19657i = obtainStyledAttributes.getFloat(l.P5, 0.0f);
        this.f19658j = obtainStyledAttributes.getFloat(l.Q5, 0.0f);
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(i10, l.G3);
        int i11 = l.H3;
        this.f19659k = obtainStyledAttributes2.hasValue(i11);
        this.f19660l = obtainStyledAttributes2.getFloat(i11, 0.0f);
        obtainStyledAttributes2.recycle();
    }

    private void d() {
        String str;
        if (this.f19665q == null && (str = this.f19652d) != null) {
            this.f19665q = Typeface.create(str, this.f19653e);
        }
        if (this.f19665q == null) {
            int i10 = this.f19654f;
            this.f19665q = i10 != 1 ? i10 != 2 ? i10 != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.f19665q = Typeface.create(this.f19665q, this.f19653e);
        }
    }

    private boolean m(Context context) {
        if (e.a()) {
            return true;
        }
        int i10 = this.f19663o;
        return (i10 != 0 ? h.c(context, i10) : null) != null;
    }

    public Typeface e() {
        d();
        return this.f19665q;
    }

    public Typeface f(Context context) {
        if (this.f19664p) {
            return this.f19665q;
        }
        if (!context.isRestricted()) {
            try {
                Typeface g10 = h.g(context, this.f19663o);
                this.f19665q = g10;
                if (g10 != null) {
                    this.f19665q = Typeface.create(g10, this.f19653e);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e10) {
                Log.d("TextAppearance", "Error loading font " + this.f19652d, e10);
            }
        }
        d();
        this.f19664p = true;
        return this.f19665q;
    }

    public void g(Context context, TextPaint textPaint, f fVar) {
        p(context, textPaint, e());
        h(context, new b(context, textPaint, fVar));
    }

    public void h(Context context, f fVar) {
        if (m(context)) {
            f(context);
        } else {
            d();
        }
        int i10 = this.f19663o;
        if (i10 == 0) {
            this.f19664p = true;
        }
        if (this.f19664p) {
            fVar.b(this.f19665q, true);
            return;
        }
        try {
            h.i(context, i10, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.f19664p = true;
            fVar.a(1);
        } catch (Exception e10) {
            Log.d("TextAppearance", "Error loading font " + this.f19652d, e10);
            this.f19664p = true;
            fVar.a(-3);
        }
    }

    public ColorStateList i() {
        return this.f19661m;
    }

    public float j() {
        return this.f19662n;
    }

    public void k(ColorStateList colorStateList) {
        this.f19661m = colorStateList;
    }

    public void l(float f10) {
        this.f19662n = f10;
    }

    public void n(Context context, TextPaint textPaint, f fVar) {
        o(context, textPaint, fVar);
        ColorStateList colorStateList = this.f19661m;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f10 = this.f19658j;
        float f11 = this.f19656h;
        float f12 = this.f19657i;
        ColorStateList colorStateList2 = this.f19651c;
        textPaint.setShadowLayer(f10, f11, f12, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void o(Context context, TextPaint textPaint, f fVar) {
        if (m(context)) {
            p(context, textPaint, f(context));
        } else {
            g(context, textPaint, fVar);
        }
    }

    public void p(Context context, TextPaint textPaint, Typeface typeface) {
        Typeface a10 = g.a(context, typeface);
        if (a10 != null) {
            typeface = a10;
        }
        textPaint.setTypeface(typeface);
        int i10 = this.f19653e & (~typeface.getStyle());
        textPaint.setFakeBoldText((i10 & 1) != 0);
        textPaint.setTextSkewX((i10 & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f19662n);
        if (this.f19659k) {
            textPaint.setLetterSpacing(this.f19660l);
        }
    }
}
