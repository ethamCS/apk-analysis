package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.TextView;
import b.g.d.c.f;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class y {

    /* renamed from: a */
    private final TextView f680a;

    /* renamed from: b */
    private u0 f681b;

    /* renamed from: c */
    private u0 f682c;

    /* renamed from: d */
    private u0 f683d;

    /* renamed from: e */
    private u0 f684e;

    /* renamed from: f */
    private u0 f685f;

    /* renamed from: g */
    private u0 f686g;

    /* renamed from: h */
    private u0 f687h;
    private final a0 i;
    private int j = 0;
    private int k = -1;
    private Typeface l;
    private boolean m;

    /* loaded from: classes.dex */
    public class a extends f.a {

        /* renamed from: a */
        final /* synthetic */ int f688a;

        /* renamed from: b */
        final /* synthetic */ int f689b;

        /* renamed from: c */
        final /* synthetic */ WeakReference f690c;

        a(int i, int i2, WeakReference weakReference) {
            y.this = r1;
            this.f688a = i;
            this.f689b = i2;
            this.f690c = weakReference;
        }

        @Override // b.g.d.c.f.a
        public void c(int i) {
        }

        @Override // b.g.d.c.f.a
        public void d(Typeface typeface) {
            int i;
            if (Build.VERSION.SDK_INT >= 28 && (i = this.f688a) != -1) {
                typeface = Typeface.create(typeface, i, (this.f689b & 2) != 0);
            }
            y.this.n(this.f690c, typeface);
        }
    }

    public y(TextView textView) {
        this.f680a = textView;
        this.i = new a0(textView);
    }

    private void A(int i, float f2) {
        this.i.y(i, f2);
    }

    private void B(Context context, w0 w0Var) {
        String o;
        Typeface typeface;
        Typeface typeface2;
        int i = Build.VERSION.SDK_INT;
        this.j = w0Var.k(b.a.j.V2, this.j);
        boolean z = false;
        if (i >= 28) {
            int k = w0Var.k(b.a.j.a3, -1);
            this.k = k;
            if (k != -1) {
                this.j = (this.j & 2) | 0;
            }
        }
        int i2 = b.a.j.Z2;
        if (!w0Var.s(i2) && !w0Var.s(b.a.j.b3)) {
            int i3 = b.a.j.U2;
            if (!w0Var.s(i3)) {
                return;
            }
            this.m = false;
            int k2 = w0Var.k(i3, 1);
            if (k2 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else if (k2 == 2) {
                typeface2 = Typeface.SERIF;
            } else if (k2 != 3) {
                return;
            } else {
                typeface2 = Typeface.MONOSPACE;
            }
            this.l = typeface2;
            return;
        }
        this.l = null;
        int i4 = b.a.j.b3;
        if (w0Var.s(i4)) {
            i2 = i4;
        }
        int i5 = this.k;
        int i6 = this.j;
        if (!context.isRestricted()) {
            try {
                Typeface j = w0Var.j(i2, this.j, new a(i5, i6, new WeakReference(this.f680a)));
                if (j != null) {
                    if (i >= 28 && this.k != -1) {
                        j = Typeface.create(Typeface.create(j, 0), this.k, (this.j & 2) != 0);
                    }
                    this.l = j;
                }
                this.m = this.l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.l != null || (o = w0Var.o(i2)) == null) {
            return;
        }
        if (i < 28 || this.k == -1) {
            typeface = Typeface.create(o, this.j);
        } else {
            Typeface create = Typeface.create(o, 0);
            int i7 = this.k;
            if ((this.j & 2) != 0) {
                z = true;
            }
            typeface = Typeface.create(create, i7, z);
        }
        this.l = typeface;
    }

    private void a(Drawable drawable, u0 u0Var) {
        if (drawable == null || u0Var == null) {
            return;
        }
        j.i(drawable, u0Var, this.f680a.getDrawableState());
    }

    private static u0 d(Context context, j jVar, int i) {
        ColorStateList f2 = jVar.f(context, i);
        if (f2 != null) {
            u0 u0Var = new u0();
            u0Var.f636d = true;
            u0Var.f633a = f2;
            return u0Var;
        }
        return null;
    }

    private void x(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 17 && (drawable5 != null || drawable6 != null)) {
            Drawable[] compoundDrawablesRelative = this.f680a.getCompoundDrawablesRelative();
            TextView textView = this.f680a;
            if (drawable5 == null) {
                drawable5 = compoundDrawablesRelative[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawablesRelative[1];
            }
            if (drawable6 == null) {
                drawable6 = compoundDrawablesRelative[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawablesRelative[3];
            }
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable5, drawable2, drawable6, drawable4);
        } else if (drawable == null && drawable2 == null && drawable3 == null && drawable4 == null) {
        } else {
            if (i >= 17) {
                Drawable[] compoundDrawablesRelative2 = this.f680a.getCompoundDrawablesRelative();
                if (compoundDrawablesRelative2[0] != null || compoundDrawablesRelative2[2] != null) {
                    TextView textView2 = this.f680a;
                    Drawable drawable7 = compoundDrawablesRelative2[0];
                    if (drawable2 == null) {
                        drawable2 = compoundDrawablesRelative2[1];
                    }
                    Drawable drawable8 = compoundDrawablesRelative2[2];
                    if (drawable4 == null) {
                        drawable4 = compoundDrawablesRelative2[3];
                    }
                    textView2.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable7, drawable2, drawable8, drawable4);
                    return;
                }
            }
            Drawable[] compoundDrawables = this.f680a.getCompoundDrawables();
            TextView textView3 = this.f680a;
            if (drawable == null) {
                drawable = compoundDrawables[0];
            }
            if (drawable2 == null) {
                drawable2 = compoundDrawables[1];
            }
            if (drawable3 == null) {
                drawable3 = compoundDrawables[2];
            }
            if (drawable4 == null) {
                drawable4 = compoundDrawables[3];
            }
            textView3.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        }
    }

    private void y() {
        u0 u0Var = this.f687h;
        this.f681b = u0Var;
        this.f682c = u0Var;
        this.f683d = u0Var;
        this.f684e = u0Var;
        this.f685f = u0Var;
        this.f686g = u0Var;
    }

    public void b() {
        if (this.f681b != null || this.f682c != null || this.f683d != null || this.f684e != null) {
            Drawable[] compoundDrawables = this.f680a.getCompoundDrawables();
            a(compoundDrawables[0], this.f681b);
            a(compoundDrawables[1], this.f682c);
            a(compoundDrawables[2], this.f683d);
            a(compoundDrawables[3], this.f684e);
        }
        if (Build.VERSION.SDK_INT >= 17) {
            if (this.f685f == null && this.f686g == null) {
                return;
            }
            Drawable[] compoundDrawablesRelative = this.f680a.getCompoundDrawablesRelative();
            a(compoundDrawablesRelative[0], this.f685f);
            a(compoundDrawablesRelative[2], this.f686g);
        }
    }

    public void c() {
        this.i.b();
    }

    public int e() {
        return this.i.j();
    }

    public int f() {
        return this.i.k();
    }

    public int g() {
        return this.i.l();
    }

    public int[] h() {
        return this.i.m();
    }

    public int i() {
        return this.i.n();
    }

    public ColorStateList j() {
        u0 u0Var = this.f687h;
        if (u0Var != null) {
            return u0Var.f633a;
        }
        return null;
    }

    public PorterDuff.Mode k() {
        u0 u0Var = this.f687h;
        if (u0Var != null) {
            return u0Var.f634b;
        }
        return null;
    }

    public boolean l() {
        return this.i.s();
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:163:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c5 A[ADDED_TO_REGION] */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(android.util.AttributeSet r24, int r25) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.y.m(android.util.AttributeSet, int):void");
    }

    void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.m) {
            this.l = typeface;
            TextView textView = weakReference.get();
            if (textView == null) {
                return;
            }
            textView.setTypeface(typeface, this.j);
        }
    }

    public void o(boolean z, int i, int i2, int i3, int i4) {
        if (!androidx.core.widget.b.f975a) {
            c();
        }
    }

    public void p() {
        b();
    }

    public void q(Context context, int i) {
        String o;
        ColorStateList c2;
        w0 t = w0.t(context, i, b.a.j.S2);
        int i2 = b.a.j.d3;
        if (t.s(i2)) {
            r(t.a(i2, false));
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 23) {
            int i4 = b.a.j.W2;
            if (t.s(i4) && (c2 = t.c(i4)) != null) {
                this.f680a.setTextColor(c2);
            }
        }
        int i5 = b.a.j.T2;
        if (t.s(i5) && t.f(i5, -1) == 0) {
            this.f680a.setTextSize(0, 0.0f);
        }
        B(context, t);
        if (i3 >= 26) {
            int i6 = b.a.j.c3;
            if (t.s(i6) && (o = t.o(i6)) != null) {
                this.f680a.setFontVariationSettings(o);
            }
        }
        t.w();
        Typeface typeface = this.l;
        if (typeface != null) {
            this.f680a.setTypeface(typeface, this.j);
        }
    }

    public void r(boolean z) {
        this.f680a.setAllCaps(z);
    }

    public void s(int i, int i2, int i3, int i4) {
        this.i.u(i, i2, i3, i4);
    }

    public void t(int[] iArr, int i) {
        this.i.v(iArr, i);
    }

    public void u(int i) {
        this.i.w(i);
    }

    public void v(ColorStateList colorStateList) {
        if (this.f687h == null) {
            this.f687h = new u0();
        }
        u0 u0Var = this.f687h;
        u0Var.f633a = colorStateList;
        u0Var.f636d = colorStateList != null;
        y();
    }

    public void w(PorterDuff.Mode mode) {
        if (this.f687h == null) {
            this.f687h = new u0();
        }
        u0 u0Var = this.f687h;
        u0Var.f634b = mode;
        u0Var.f635c = mode != null;
        y();
    }

    public void z(int i, float f2) {
        if (androidx.core.widget.b.f975a || l()) {
            return;
        }
        A(i, f2);
    }
}
