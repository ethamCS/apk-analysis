package com.google.android.material.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.widget.w0;
import b.g.l.b0;
import com.google.android.material.internal.g;
import com.google.android.material.internal.h;
import com.google.android.material.internal.k;
import d.a.a.a.j;
/* loaded from: classes.dex */
public class NavigationView extends k {
    private static final int[] n = {16842912};
    private static final int[] o = {-16842910};
    private static final int p = j.f3629f;

    /* renamed from: g */
    private final g f3240g;

    /* renamed from: h */
    private final h f3241h;
    c i;
    private final int j;
    private final int[] k;
    private MenuInflater l;
    private ViewTreeObserver.OnGlobalLayoutListener m;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements g.a {
        a() {
            NavigationView.this = r1;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            c cVar = NavigationView.this.i;
            return cVar != null && cVar.a(menuItem);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
        }
    }

    /* loaded from: classes.dex */
    public class b implements ViewTreeObserver.OnGlobalLayoutListener {
        b() {
            NavigationView.this = r1;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.k);
            boolean z = true;
            boolean z2 = NavigationView.this.k[1] == 0;
            NavigationView.this.f3241h.y(z2);
            NavigationView.this.setDrawTopInsetForeground(z2);
            Activity a2 = com.google.android.material.internal.b.a(NavigationView.this.getContext());
            if (a2 == null || Build.VERSION.SDK_INT < 21) {
                return;
            }
            boolean z3 = a2.findViewById(16908290).getHeight() == NavigationView.this.getHeight();
            boolean z4 = Color.alpha(a2.getWindow().getNavigationBarColor()) != 0;
            NavigationView navigationView2 = NavigationView.this;
            if (!z3 || !z4) {
                z = false;
            }
            navigationView2.setDrawBottomInsetForeground(z);
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        boolean a(MenuItem menuItem);
    }

    /* loaded from: classes.dex */
    public static class d extends b.i.a.a {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: d */
        public Bundle f3244d;

        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator<d> {
            a() {
            }

            /* renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel, null);
            }

            /* renamed from: b */
            public d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            /* renamed from: c */
            public d[] newArray(int i) {
                return new d[i];
            }
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f3244d = parcel.readBundle(classLoader);
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // b.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.f3244d);
        }
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, d.a.a.a.b.u);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public NavigationView(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.navigation.NavigationView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    private ColorStateList d(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList c2 = b.a.k.a.a.c(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(b.a.a.x, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = c2.getDefaultColor();
        int[] iArr = o;
        return new ColorStateList(new int[][]{iArr, n, FrameLayout.EMPTY_STATE_SET}, new int[]{c2.getColorForState(iArr, defaultColor), i2, defaultColor});
    }

    private final Drawable e(w0 w0Var) {
        d.a.a.a.a0.g gVar = new d.a.a.a.a0.g(d.a.a.a.a0.k.b(getContext(), w0Var.n(d.a.a.a.k.q2, 0), w0Var.n(d.a.a.a.k.r2, 0)).m());
        gVar.V(d.a.a.a.x.c.b(getContext(), w0Var, d.a.a.a.k.s2));
        return new InsetDrawable((Drawable) gVar, w0Var.f(d.a.a.a.k.v2, 0), w0Var.f(d.a.a.a.k.w2, 0), w0Var.f(d.a.a.a.k.u2, 0), w0Var.f(d.a.a.a.k.t2, 0));
    }

    private boolean f(w0 w0Var) {
        return w0Var.s(d.a.a.a.k.q2) || w0Var.s(d.a.a.a.k.r2);
    }

    private MenuInflater getMenuInflater() {
        if (this.l == null) {
            this.l = new b.a.o.g(getContext());
        }
        return this.l;
    }

    private void i() {
        this.m = new b();
        getViewTreeObserver().addOnGlobalLayoutListener(this.m);
    }

    @Override // com.google.android.material.internal.k
    protected void a(b0 b0Var) {
        this.f3241h.l(b0Var);
    }

    public View g(int i) {
        return this.f3241h.x(i);
    }

    public MenuItem getCheckedItem() {
        return this.f3241h.o();
    }

    public int getHeaderCount() {
        return this.f3241h.p();
    }

    public Drawable getItemBackground() {
        return this.f3241h.q();
    }

    public int getItemHorizontalPadding() {
        return this.f3241h.r();
    }

    public int getItemIconPadding() {
        return this.f3241h.s();
    }

    public ColorStateList getItemIconTintList() {
        return this.f3241h.v();
    }

    public int getItemMaxLines() {
        return this.f3241h.t();
    }

    public ColorStateList getItemTextColor() {
        return this.f3241h.u();
    }

    public Menu getMenu() {
        return this.f3240g;
    }

    public void h(int i) {
        this.f3241h.K(true);
        getMenuInflater().inflate(i, this.f3240g);
        this.f3241h.K(false);
        this.f3241h.n(false);
    }

    @Override // com.google.android.material.internal.k, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        d.a.a.a.a0.h.e(this);
    }

    @Override // com.google.android.material.internal.k, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT < 16) {
            getViewTreeObserver().removeGlobalOnLayoutListener(this.m);
        } else {
            getViewTreeObserver().removeOnGlobalLayoutListener(this.m);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                i3 = this.j;
            }
            super.onMeasure(i, i2);
        }
        i3 = Math.min(View.MeasureSpec.getSize(i), this.j);
        i = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof d)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        d dVar = (d) parcelable;
        super.onRestoreInstanceState(dVar.a());
        this.f3240g.S(dVar.f3244d);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        dVar.f3244d = bundle;
        this.f3240g.U(bundle);
        return dVar;
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.f3240g.findItem(i);
        if (findItem != null) {
            this.f3241h.z((i) findItem);
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.f3240g.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.f3241h.z((i) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.setElevation(f2);
        }
        d.a.a.a.a0.h.d(this, f2);
    }

    public void setItemBackground(Drawable drawable) {
        this.f3241h.B(drawable);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(b.g.d.a.d(getContext(), i));
    }

    public void setItemHorizontalPadding(int i) {
        this.f3241h.C(i);
    }

    public void setItemHorizontalPaddingResource(int i) {
        this.f3241h.C(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(int i) {
        this.f3241h.D(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.f3241h.D(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconSize(int i) {
        this.f3241h.E(i);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f3241h.F(colorStateList);
    }

    public void setItemMaxLines(int i) {
        this.f3241h.G(i);
    }

    public void setItemTextAppearance(int i) {
        this.f3241h.H(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f3241h.I(colorStateList);
    }

    public void setNavigationItemSelectedListener(c cVar) {
        this.i = cVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        h hVar = this.f3241h;
        if (hVar != null) {
            hVar.J(i);
        }
    }
}
