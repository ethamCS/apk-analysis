package b.a.a.a.y;

import a.g.d.c.f;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.Log;
import b.a.a.a.l;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a */
    public final float f1248a;

    /* renamed from: b */
    public final ColorStateList f1249b;

    /* renamed from: c */
    public final int f1250c;
    public final int d;
    public final String e;
    public final ColorStateList f;
    public final float g;
    public final float h;
    public final float i;
    private final int j;
    private boolean k = false;
    private Typeface l;

    /* loaded from: classes.dex */
    public class a extends f.a {

        /* renamed from: a */
        final /* synthetic */ f f1251a;

        a(f fVar) {
            d.this = r1;
            this.f1251a = fVar;
        }

        @Override // a.g.d.c.f.a
        public void a(int i) {
            d.this.k = true;
            this.f1251a.a(i);
        }

        @Override // a.g.d.c.f.a
        public void a(Typeface typeface) {
            d dVar = d.this;
            dVar.l = Typeface.create(typeface, dVar.f1250c);
            d.this.k = true;
            this.f1251a.a(d.this.l, false);
        }
    }

    /* loaded from: classes.dex */
    public class b extends f {

        /* renamed from: a */
        final /* synthetic */ TextPaint f1253a;

        /* renamed from: b */
        final /* synthetic */ f f1254b;

        b(TextPaint textPaint, f fVar) {
            d.this = r1;
            this.f1253a = textPaint;
            this.f1254b = fVar;
        }

        @Override // b.a.a.a.y.f
        public void a(int i) {
            this.f1254b.a(i);
        }

        @Override // b.a.a.a.y.f
        public void a(Typeface typeface, boolean z) {
            d.this.a(this.f1253a, typeface);
            this.f1254b.a(typeface, z);
        }
    }

    public d(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, l.TextAppearance);
        this.f1248a = obtainStyledAttributes.getDimension(l.TextAppearance_android_textSize, 0.0f);
        this.f1249b = c.a(context, obtainStyledAttributes, l.TextAppearance_android_textColor);
        c.a(context, obtainStyledAttributes, l.TextAppearance_android_textColorHint);
        c.a(context, obtainStyledAttributes, l.TextAppearance_android_textColorLink);
        this.f1250c = obtainStyledAttributes.getInt(l.TextAppearance_android_textStyle, 0);
        this.d = obtainStyledAttributes.getInt(l.TextAppearance_android_typeface, 1);
        int a2 = c.a(obtainStyledAttributes, l.TextAppearance_fontFamily, l.TextAppearance_android_fontFamily);
        this.j = obtainStyledAttributes.getResourceId(a2, 0);
        this.e = obtainStyledAttributes.getString(a2);
        obtainStyledAttributes.getBoolean(l.TextAppearance_textAllCaps, false);
        this.f = c.a(context, obtainStyledAttributes, l.TextAppearance_android_shadowColor);
        this.g = obtainStyledAttributes.getFloat(l.TextAppearance_android_shadowDx, 0.0f);
        this.h = obtainStyledAttributes.getFloat(l.TextAppearance_android_shadowDy, 0.0f);
        this.i = obtainStyledAttributes.getFloat(l.TextAppearance_android_shadowRadius, 0.0f);
        obtainStyledAttributes.recycle();
    }

    private void b() {
        String str;
        if (this.l == null && (str = this.e) != null) {
            this.l = Typeface.create(str, this.f1250c);
        }
        if (this.l == null) {
            int i = this.d;
            this.l = i != 1 ? i != 2 ? i != 3 ? Typeface.DEFAULT : Typeface.MONOSPACE : Typeface.SERIF : Typeface.SANS_SERIF;
            this.l = Typeface.create(this.l, this.f1250c);
        }
    }

    public Typeface a() {
        b();
        return this.l;
    }

    public Typeface a(Context context) {
        if (this.k) {
            return this.l;
        }
        if (!context.isRestricted()) {
            try {
                Typeface a2 = a.g.d.c.f.a(context, this.j);
                this.l = a2;
                if (a2 != null) {
                    this.l = Typeface.create(a2, this.f1250c);
                }
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            } catch (Exception e) {
                Log.d("TextAppearance", "Error loading font " + this.e, e);
            }
        }
        b();
        this.k = true;
        return this.l;
    }

    public void a(Context context, TextPaint textPaint, f fVar) {
        a(textPaint, a());
        a(context, new b(textPaint, fVar));
    }

    public void a(Context context, f fVar) {
        if (e.a()) {
            a(context);
        } else {
            b();
        }
        if (this.j == 0) {
            this.k = true;
        }
        if (this.k) {
            fVar.a(this.l, true);
            return;
        }
        try {
            a.g.d.c.f.a(context, this.j, new a(fVar), null);
        } catch (Resources.NotFoundException unused) {
            this.k = true;
            fVar.a(1);
        } catch (Exception e) {
            Log.d("TextAppearance", "Error loading font " + this.e, e);
            this.k = true;
            fVar.a(-3);
        }
    }

    public void a(TextPaint textPaint, Typeface typeface) {
        textPaint.setTypeface(typeface);
        int style = (typeface.getStyle() ^ (-1)) & this.f1250c;
        textPaint.setFakeBoldText((style & 1) != 0);
        textPaint.setTextSkewX((style & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.f1248a);
    }

    public void b(Context context, TextPaint textPaint, f fVar) {
        c(context, textPaint, fVar);
        ColorStateList colorStateList = this.f1249b;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, colorStateList.getDefaultColor()) : -16777216);
        float f = this.i;
        float f2 = this.g;
        float f3 = this.h;
        ColorStateList colorStateList2 = this.f;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, colorStateList2.getDefaultColor()) : 0);
    }

    public void c(Context context, TextPaint textPaint, f fVar) {
        if (e.a()) {
            a(textPaint, a(context));
        } else {
            a(context, textPaint, fVar);
        }
    }
}
