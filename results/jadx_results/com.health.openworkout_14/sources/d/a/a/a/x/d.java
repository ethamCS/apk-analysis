package d.a.a.a.x;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import b.g.d.c.f;
import d.a.a.a.k;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a */
    public final float f3695a;

    /* renamed from: b */
    public final ColorStateList f3696b;

    /* renamed from: c */
    public final int f3697c;

    /* renamed from: d */
    public final int f3698d;

    /* renamed from: e */
    public final String f3699e;

    /* renamed from: f */
    public final ColorStateList f3700f;

    /* renamed from: g */
    public final float f3701g;

    /* renamed from: h */
    public final float f3702h;
    public final float i;
    private final int j;
    private boolean k = false;
    private Typeface l;

    /* loaded from: classes.dex */
    public class a extends f.a {

        /* renamed from: a */
        final /* synthetic */ f f3703a;

        a(f fVar) {
            d.this = r1;
            this.f3703a = fVar;
        }

        @Override // b.g.d.c.f.a
        public void c(int i) {
            d.this.k = true;
            this.f3703a.a(i);
        }

        @Override // b.g.d.c.f.a
        public void d(Typeface typeface) {
            d dVar = d.this;
            dVar.l = Typeface.create(typeface, dVar.f3697c);
            d.this.k = true;
            this.f3703a.b(d.this.l, false);
        }
    }

    /* loaded from: classes.dex */
    public class b extends f {

        /* renamed from: a */
        final /* synthetic */ TextPaint f3705a;

        /* renamed from: b */
        final /* synthetic */ f f3706b;

        b(TextPaint textPaint, f fVar) {
            d.this = r1;
            this.f3705a = textPaint;
            this.f3706b = fVar;
        }

        @Override // d.a.a.a.x.f
        public void a(int i) {
            this.f3706b.a(i);
        }

        @Override // d.a.a.a.x.f
        public void b(Typeface typeface, boolean z) {
            d.this.k(this.f3705a, typeface);
            this.f3706b.b(typeface, z);
        }
    }

    public d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, k.Y2);
        this.f3695a = obtainStyledAttributes.getDimension(k.Z2, 0.0f);
        this.f3696b = c.a(context, obtainStyledAttributes, k.c3);
        c.a(context, obtainStyledAttributes, k.d3);
        c.a(context, obtainStyledAttributes, k.e3);
        this.f3697c = obtainStyledAttributes.getInt(k.b3, 0);
        this.f3698d = obtainStyledAttributes.getInt(k.a3, 1);
        int e2 = c.e(obtainStyledAttributes, k.k3, k.j3);
        this.j = obtainStyledAttributes.getResourceId(e2, 0);
        this.f3699e = obtainStyledAttributes.getString(e2);
        obtainStyledAttributes.getBoolean(k.l3, false);
        this.f3700f = c.a(context, obtainStyledAttributes, k.f3);
        this.f3701g = obtainStyledAttributes.getFloat(k.g3, 0.0f);
        this.f3702h = obtainStyledAttributes.getFloat(k.h3, 0.0f);
        this.i = obtainStyledAttributes.getFloat(k.i3, 0.0f);
        obtainStyledAttributes.recycle();
    }

    private void d() {
        String str;
        if (this.l == null && (str = this.f3699e) != null) {
            this.l = Typeface.create(str, this.f3697c);
        }
        if (this.l == null) {
            int i = this.f3698d;
            this.l = i != 1 ? i != 2 ? i != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.l = Typeface.create(this.l, this.f3697c);
        }
    }

    public Typeface e() {
        d();
        return this.l;
    }

    public Typeface f(Context context) {
        if (this.k) {
            return this.l;
        }
        if (!context.isRestricted()) {
            try {
                Typeface b2 = b.g.d.c.f.b(context, this.j);
                this.l = b2;
                if (b2 != null) {
                    this.l = Typeface.create(b2, this.f3697c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e2) {
                Log.d("TextAppearance", "Error loading font " + this.f3699e, e2);
            }
        }
        d();
        this.k = true;
        return this.l;
    }

    public void g(Context context, TextPaint textPaint, f fVar) {
        k(textPaint, e());
        h(context, new b(textPaint, fVar));
    }

    public void h(Context context, f fVar) {
        if (e.a()) {
            f(context);
        } else {
            d();
        }
        int i = this.j;
        if (i == 0) {
            this.k = true;
        }
        if (this.k) {
            fVar.b(this.l, true);
            return;
        }
        try {
            b.g.d.c.f.d(context, i, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.k = true;
            fVar.a(1);
        } catch (Exception e2) {
            Log.d("TextAppearance", "Error loading font " + this.f3699e, e2);
            this.k = true;
            fVar.a(-3);
        }
    }

    public void i(Context context, TextPaint textPaint, f fVar) {
        j(context, textPaint, fVar);
        ColorStateList colorStateList = this.f3696b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f2 = this.i;
        float f3 = this.f3701g;
        float f4 = this.f3702h;
        ColorStateList colorStateList2 = this.f3700f;
        textPaint.setShadowLayer(f2, f3, f4, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void j(Context context, TextPaint textPaint, f fVar) {
        if (e.a()) {
            k(textPaint, f(context));
        } else {
            g(context, textPaint, fVar);
        }
    }

    public void k(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int i = (~typeface.getStyle()) & this.f3697c;
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f3695a);
    }
}
