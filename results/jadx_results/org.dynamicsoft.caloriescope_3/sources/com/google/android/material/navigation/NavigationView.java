package com.google.android.material.navigation;

import a.g.l.c0;
import a.g.l.u;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
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
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.w0;
import b.a.a.a.b0.h;
import b.a.a.a.k;
import b.a.a.a.l;
import com.google.android.material.internal.e;
import com.google.android.material.internal.f;
import com.google.android.material.internal.i;
import com.google.android.material.internal.m;
/* loaded from: classes.dex */
public class NavigationView extends i {
    private static final int[] n = {16842912};
    private static final int[] o = {-16842910};
    private final e g;
    private final f h;
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
        public void a(g gVar) {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(g gVar, MenuItem menuItem) {
            c cVar = NavigationView.this.i;
            return cVar != null && cVar.a(menuItem);
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
            NavigationView.this.h.b(z2);
            NavigationView.this.setDrawTopInsetForeground(z2);
            Context context = NavigationView.this.getContext();
            if (!(context instanceof Activity) || Build.VERSION.SDK_INT < 21) {
                return;
            }
            Activity activity = (Activity) context;
            boolean z3 = activity.findViewById(16908290).getHeight() == NavigationView.this.getHeight();
            boolean z4 = Color.alpha(activity.getWindow().getNavigationBarColor()) != 0;
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
    public static class d extends a.i.a.a {
        public static final Parcelable.Creator<d> CREATOR = new a();
        public Bundle d;

        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public d createFromParcel(Parcel parcel) {
                return new d(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public d createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new d(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public d[] newArray(int i) {
                return new d[i];
            }
        }

        public d(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.d = parcel.readBundle(classLoader);
        }

        public d(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // a.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.d);
        }
    }

    public NavigationView(Context context) {
        this(context, null);
    }

    public NavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a.a.a.b.navigationViewStyle);
    }

    public NavigationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        boolean z;
        int i2;
        this.h = new f();
        this.k = new int[2];
        this.g = new e(context);
        w0 d2 = m.d(context, attributeSet, l.NavigationView, i, k.Widget_Design_NavigationView, new int[0]);
        if (d2.g(l.NavigationView_android_background)) {
            u.a(this, d2.b(l.NavigationView_android_background));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            Drawable background = getBackground();
            b.a.a.a.b0.g gVar = new b.a.a.a.b0.g();
            if (background instanceof ColorDrawable) {
                gVar.a(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            gVar.a(context);
            u.a(this, gVar);
        }
        if (d2.g(l.NavigationView_elevation)) {
            setElevation(d2.c(l.NavigationView_elevation, 0));
        }
        setFitsSystemWindows(d2.a(l.NavigationView_android_fitsSystemWindows, false));
        this.j = d2.c(l.NavigationView_android_maxWidth, 0);
        ColorStateList a2 = d2.g(l.NavigationView_itemIconTint) ? d2.a(l.NavigationView_itemIconTint) : d(16842808);
        if (d2.g(l.NavigationView_itemTextAppearance)) {
            i2 = d2.g(l.NavigationView_itemTextAppearance, 0);
            z = true;
        } else {
            i2 = 0;
            z = false;
        }
        if (d2.g(l.NavigationView_itemIconSize)) {
            setItemIconSize(d2.c(l.NavigationView_itemIconSize, 0));
        }
        ColorStateList a3 = d2.g(l.NavigationView_itemTextColor) ? d2.a(l.NavigationView_itemTextColor) : null;
        if (!z && a3 == null) {
            a3 = d(16842806);
        }
        Drawable b2 = d2.b(l.NavigationView_itemBackground);
        if (b2 == null && b(d2)) {
            b2 = a(d2);
        }
        if (d2.g(l.NavigationView_itemHorizontalPadding)) {
            this.h.d(d2.c(l.NavigationView_itemHorizontalPadding, 0));
        }
        int c2 = d2.c(l.NavigationView_itemIconPadding, 0);
        setItemMaxLines(d2.d(l.NavigationView_itemMaxLines, 1));
        this.g.a(new a());
        this.h.c(1);
        this.h.a(context, this.g);
        this.h.a(a2);
        this.h.i(getOverScrollMode());
        if (z) {
            this.h.h(i2);
        }
        this.h.b(a3);
        this.h.a(b2);
        this.h.e(c2);
        this.g.a(this.h);
        addView((View) this.h.a((ViewGroup) this));
        if (d2.g(l.NavigationView_menu)) {
            c(d2.g(l.NavigationView_menu, 0));
        }
        if (d2.g(l.NavigationView_headerLayout)) {
            b(d2.g(l.NavigationView_headerLayout, 0));
        }
        d2.a();
        a();
    }

    private final Drawable a(w0 w0Var) {
        b.a.a.a.b0.g gVar = new b.a.a.a.b0.g(b.a.a.a.b0.k.a(getContext(), w0Var.g(l.NavigationView_itemShapeAppearance, 0), w0Var.g(l.NavigationView_itemShapeAppearanceOverlay, 0)).a());
        gVar.a(b.a.a.a.y.c.a(getContext(), w0Var, l.NavigationView_itemShapeFillColor));
        return new InsetDrawable((Drawable) gVar, w0Var.c(l.NavigationView_itemShapeInsetStart, 0), w0Var.c(l.NavigationView_itemShapeInsetTop, 0), w0Var.c(l.NavigationView_itemShapeInsetEnd, 0), w0Var.c(l.NavigationView_itemShapeInsetBottom, 0));
    }

    private void a() {
        this.m = new b();
        getViewTreeObserver().addOnGlobalLayoutListener(this.m);
    }

    private boolean b(w0 w0Var) {
        return w0Var.g(l.NavigationView_itemShapeAppearance) || w0Var.g(l.NavigationView_itemShapeAppearanceOverlay);
    }

    private ColorStateList d(int i) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i, typedValue, true)) {
            return null;
        }
        ColorStateList b2 = a.a.k.a.a.b(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(a.a.a.colorPrimary, typedValue, true)) {
            return null;
        }
        int i2 = typedValue.data;
        int defaultColor = b2.getDefaultColor();
        return new ColorStateList(new int[][]{o, n, FrameLayout.EMPTY_STATE_SET}, new int[]{b2.getColorForState(o, defaultColor), i2, defaultColor});
    }

    private MenuInflater getMenuInflater() {
        if (this.l == null) {
            this.l = new a.a.n.g(getContext());
        }
        return this.l;
    }

    public View a(int i) {
        return this.h.a(i);
    }

    @Override // com.google.android.material.internal.i
    protected void a(c0 c0Var) {
        this.h.a(c0Var);
    }

    public View b(int i) {
        return this.h.b(i);
    }

    public void c(int i) {
        this.h.c(true);
        getMenuInflater().inflate(i, this.g);
        this.h.c(false);
        this.h.a(false);
    }

    public MenuItem getCheckedItem() {
        return this.h.a();
    }

    public int getHeaderCount() {
        return this.h.d();
    }

    public Drawable getItemBackground() {
        return this.h.e();
    }

    public int getItemHorizontalPadding() {
        return this.h.g();
    }

    public int getItemIconPadding() {
        return this.h.h();
    }

    public ColorStateList getItemIconTintList() {
        return this.h.k();
    }

    public int getItemMaxLines() {
        return this.h.i();
    }

    public ColorStateList getItemTextColor() {
        return this.h.j();
    }

    public Menu getMenu() {
        return this.g;
    }

    @Override // com.google.android.material.internal.i, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.a(this);
    }

    @Override // com.google.android.material.internal.i, android.view.ViewGroup, android.view.View
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
        super.onRestoreInstanceState(dVar.d());
        this.g.b(dVar.d);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        d dVar = new d(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        dVar.d = bundle;
        this.g.d(bundle);
        return dVar;
    }

    public void setCheckedItem(int i) {
        MenuItem findItem = this.g.findItem(i);
        if (findItem != null) {
            this.h.a((androidx.appcompat.view.menu.i) findItem);
        }
    }

    public void setCheckedItem(MenuItem menuItem) {
        MenuItem findItem = this.g.findItem(menuItem.getItemId());
        if (findItem != null) {
            this.h.a((androidx.appcompat.view.menu.i) findItem);
            return;
        }
        throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
    }

    @Override // android.view.View
    public void setElevation(float f) {
        if (Build.VERSION.SDK_INT >= 21) {
            super.setElevation(f);
        }
        h.a(this, f);
    }

    public void setItemBackground(Drawable drawable) {
        this.h.a(drawable);
    }

    public void setItemBackgroundResource(int i) {
        setItemBackground(a.g.d.a.c(getContext(), i));
    }

    public void setItemHorizontalPadding(int i) {
        this.h.d(i);
    }

    public void setItemHorizontalPaddingResource(int i) {
        this.h.d(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconPadding(int i) {
        this.h.e(i);
    }

    public void setItemIconPaddingResource(int i) {
        this.h.e(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconSize(int i) {
        this.h.f(i);
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.h.a(colorStateList);
    }

    public void setItemMaxLines(int i) {
        this.h.g(i);
    }

    public void setItemTextAppearance(int i) {
        this.h.h(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.h.b(colorStateList);
    }

    public void setNavigationItemSelectedListener(c cVar) {
        this.i = cVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i) {
        super.setOverScrollMode(i);
        f fVar = this.h;
        if (fVar != null) {
            fVar.i(i);
        }
    }
}
