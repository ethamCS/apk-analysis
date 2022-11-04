package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.content.res.h;
import java.lang.ref.WeakReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class b0 {

    /* renamed from: a */
    private final TextView f1207a;

    /* renamed from: b */
    private y0 f1208b;

    /* renamed from: c */
    private y0 f1209c;

    /* renamed from: d */
    private y0 f1210d;

    /* renamed from: e */
    private y0 f1211e;

    /* renamed from: f */
    private y0 f1212f;

    /* renamed from: g */
    private y0 f1213g;

    /* renamed from: h */
    private y0 f1214h;

    /* renamed from: i */
    private final d0 f1215i;

    /* renamed from: j */
    private int f1216j = 0;

    /* renamed from: k */
    private int f1217k = -1;

    /* renamed from: l */
    private Typeface f1218l;

    /* renamed from: m */
    private boolean f1219m;

    /* loaded from: classes.dex */
    public class a extends h.e {

        /* renamed from: a */
        final /* synthetic */ int f1220a;

        /* renamed from: b */
        final /* synthetic */ int f1221b;

        /* renamed from: c */
        final /* synthetic */ WeakReference f1222c;

        a(int i10, int i11, WeakReference weakReference) {
            b0.this = r1;
            this.f1220a = i10;
            this.f1221b = i11;
            this.f1222c = weakReference;
        }

        @Override // androidx.core.content.res.h.e
        public void h(int i10) {
        }

        @Override // androidx.core.content.res.h.e
        public void i(Typeface typeface) {
            int i10;
            if (Build.VERSION.SDK_INT >= 28 && (i10 = this.f1220a) != -1) {
                typeface = Typeface.create(typeface, i10, (this.f1221b & 2) != 0);
            }
            b0.this.n(this.f1222c, typeface);
        }
    }

    /* loaded from: classes.dex */
    public class b implements Runnable {

        /* renamed from: c */
        final /* synthetic */ TextView f1224c;

        /* renamed from: d */
        final /* synthetic */ Typeface f1225d;

        /* renamed from: q */
        final /* synthetic */ int f1226q;

        b(TextView textView, Typeface typeface, int i10) {
            b0.this = r1;
            this.f1224c = textView;
            this.f1225d = typeface;
            this.f1226q = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f1224c.setTypeface(this.f1225d, this.f1226q);
        }
    }

    public b0(TextView textView) {
        this.f1207a = textView;
        this.f1215i = new d0(textView);
    }

    private void B(int i10, float f10) {
        this.f1215i.u(i10, f10);
    }

    private void C(Context context, a1 a1Var) {
        String o10;
        Typeface typeface;
        Typeface typeface2;
        this.f1216j = a1Var.k(e.j.V2, this.f1216j);
        int i10 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        if (i10 >= 28) {
            int k10 = a1Var.k(e.j.Y2, -1);
            this.f1217k = k10;
            if (k10 != -1) {
                this.f1216j = (this.f1216j & 2) | 0;
            }
        }
        int i11 = e.j.X2;
        if (!a1Var.s(i11) && !a1Var.s(e.j.Z2)) {
            int i12 = e.j.U2;
            if (!a1Var.s(i12)) {
                return;
            }
            this.f1219m = false;
            int k11 = a1Var.k(i12, 1);
            if (k11 == 1) {
                typeface2 = Typeface.SANS_SERIF;
            } else if (k11 == 2) {
                typeface2 = Typeface.SERIF;
            } else if (k11 != 3) {
                return;
            } else {
                typeface2 = Typeface.MONOSPACE;
            }
            this.f1218l = typeface2;
            return;
        }
        this.f1218l = null;
        int i13 = e.j.Z2;
        if (a1Var.s(i13)) {
            i11 = i13;
        }
        int i14 = this.f1217k;
        int i15 = this.f1216j;
        if (!context.isRestricted()) {
            try {
                Typeface j10 = a1Var.j(i11, this.f1216j, new a(i14, i15, new WeakReference(this.f1207a)));
                if (j10 != null) {
                    if (i10 >= 28 && this.f1217k != -1) {
                        j10 = Typeface.create(Typeface.create(j10, 0), this.f1217k, (this.f1216j & 2) != 0);
                    }
                    this.f1218l = j10;
                }
                this.f1219m = this.f1218l == null;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.f1218l != null || (o10 = a1Var.o(i11)) == null) {
            return;
        }
        if (Build.VERSION.SDK_INT < 28 || this.f1217k == -1) {
            typeface = Typeface.create(o10, this.f1216j);
        } else {
            Typeface create = Typeface.create(o10, 0);
            int i16 = this.f1217k;
            if ((this.f1216j & 2) != 0) {
                z10 = true;
            }
            typeface = Typeface.create(create, i16, z10);
        }
        this.f1218l = typeface;
    }

    private void a(Drawable drawable, y0 y0Var) {
        if (drawable == null || y0Var == null) {
            return;
        }
        j.i(drawable, y0Var, this.f1207a.getDrawableState());
    }

    private static y0 d(Context context, j jVar, int i10) {
        ColorStateList f10 = jVar.f(context, i10);
        if (f10 != null) {
            y0 y0Var = new y0();
            y0Var.f1573d = true;
            y0Var.f1570a = f10;
            return y0Var;
        }
        return null;
    }

    private void y(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, Drawable drawable5, Drawable drawable6) {
        if (drawable5 != null || drawable6 != null) {
            Drawable[] compoundDrawablesRelative = this.f1207a.getCompoundDrawablesRelative();
            TextView textView = this.f1207a;
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
            Drawable[] compoundDrawablesRelative2 = this.f1207a.getCompoundDrawablesRelative();
            if (compoundDrawablesRelative2[0] != null || compoundDrawablesRelative2[2] != null) {
                TextView textView2 = this.f1207a;
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
            Drawable[] compoundDrawables = this.f1207a.getCompoundDrawables();
            TextView textView3 = this.f1207a;
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

    private void z() {
        y0 y0Var = this.f1214h;
        this.f1208b = y0Var;
        this.f1209c = y0Var;
        this.f1210d = y0Var;
        this.f1211e = y0Var;
        this.f1212f = y0Var;
        this.f1213g = y0Var;
    }

    public void A(int i10, float f10) {
        if (androidx.core.widget.b.f3801a || l()) {
            return;
        }
        B(i10, f10);
    }

    public void b() {
        if (this.f1208b != null || this.f1209c != null || this.f1210d != null || this.f1211e != null) {
            Drawable[] compoundDrawables = this.f1207a.getCompoundDrawables();
            a(compoundDrawables[0], this.f1208b);
            a(compoundDrawables[1], this.f1209c);
            a(compoundDrawables[2], this.f1210d);
            a(compoundDrawables[3], this.f1211e);
        }
        if (this.f1212f == null && this.f1213g == null) {
            return;
        }
        Drawable[] compoundDrawablesRelative = this.f1207a.getCompoundDrawablesRelative();
        a(compoundDrawablesRelative[0], this.f1212f);
        a(compoundDrawablesRelative[2], this.f1213g);
    }

    public void c() {
        this.f1215i.a();
    }

    public int e() {
        return this.f1215i.g();
    }

    public int f() {
        return this.f1215i.h();
    }

    public int g() {
        return this.f1215i.i();
    }

    public int[] h() {
        return this.f1215i.j();
    }

    public int i() {
        return this.f1215i.k();
    }

    public ColorStateList j() {
        y0 y0Var = this.f1214h;
        if (y0Var != null) {
            return y0Var.f1570a;
        }
        return null;
    }

    public PorterDuff.Mode k() {
        y0 y0Var = this.f1214h;
        if (y0Var != null) {
            return y0Var.f1571b;
        }
        return null;
    }

    public boolean l() {
        return this.f1215i.o();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01fb  */
    @android.annotation.SuppressLint({"NewApi"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void m(android.util.AttributeSet r20, int r21) {
        /*
            Method dump skipped, instructions count: 640
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.b0.m(android.util.AttributeSet, int):void");
    }

    void n(WeakReference<TextView> weakReference, Typeface typeface) {
        if (this.f1219m) {
            this.f1218l = typeface;
            TextView textView = weakReference.get();
            if (textView == null) {
                return;
            }
            if (androidx.core.view.y.R(textView)) {
                textView.post(new b(textView, typeface, this.f1216j));
            } else {
                textView.setTypeface(typeface, this.f1216j);
            }
        }
    }

    public void o(boolean z10, int i10, int i11, int i12, int i13) {
        if (!androidx.core.widget.b.f3801a) {
            c();
        }
    }

    public void p() {
        b();
    }

    public void q(Context context, int i10) {
        String o10;
        a1 t10 = a1.t(context, i10, e.j.S2);
        int i11 = e.j.f9218b3;
        if (t10.s(i11)) {
            s(t10.a(i11, false));
        }
        int i12 = Build.VERSION.SDK_INT;
        int i13 = e.j.T2;
        if (t10.s(i13) && t10.f(i13, -1) == 0) {
            this.f1207a.setTextSize(0, 0.0f);
        }
        C(context, t10);
        if (i12 >= 26) {
            int i14 = e.j.f9213a3;
            if (t10.s(i14) && (o10 = t10.o(i14)) != null) {
                this.f1207a.setFontVariationSettings(o10);
            }
        }
        t10.w();
        Typeface typeface = this.f1218l;
        if (typeface != null) {
            this.f1207a.setTypeface(typeface, this.f1216j);
        }
    }

    public void r(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        if (Build.VERSION.SDK_INT >= 30 || inputConnection == null) {
            return;
        }
        t0.a.f(editorInfo, textView.getText());
    }

    public void s(boolean z10) {
        this.f1207a.setAllCaps(z10);
    }

    public void t(int i10, int i11, int i12, int i13) {
        this.f1215i.q(i10, i11, i12, i13);
    }

    public void u(int[] iArr, int i10) {
        this.f1215i.r(iArr, i10);
    }

    public void v(int i10) {
        this.f1215i.s(i10);
    }

    public void w(ColorStateList colorStateList) {
        if (this.f1214h == null) {
            this.f1214h = new y0();
        }
        y0 y0Var = this.f1214h;
        y0Var.f1570a = colorStateList;
        y0Var.f1573d = colorStateList != null;
        z();
    }

    public void x(PorterDuff.Mode mode) {
        if (this.f1214h == null) {
            this.f1214h = new y0();
        }
        y0 y0Var = this.f1214h;
        y0Var.f1571b = mode;
        y0Var.f1572c = mode != null;
        z();
    }
}
