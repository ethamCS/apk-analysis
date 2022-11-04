package com.google.android.material.bottomnavigation;

import a.g.l.c0;
import a.g.l.u;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.w0;
import b.a.a.a.b0.h;
import b.a.a.a.k;
import b.a.a.a.l;
import com.google.android.material.internal.m;
import com.google.android.material.internal.n;
/* loaded from: classes.dex */
public class BottomNavigationView extends FrameLayout {
    private static final int i = k.Widget_Design_BottomNavigationView;

    /* renamed from: b */
    private final g f1414b;

    /* renamed from: c */
    final com.google.android.material.bottomnavigation.c f1415c;
    private final com.google.android.material.bottomnavigation.d d;
    private ColorStateList e;
    private MenuInflater f;
    private d g;
    private c h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements g.a {
        a() {
            BottomNavigationView.this = r1;
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void a(g gVar) {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(g gVar, MenuItem menuItem) {
            if (BottomNavigationView.this.h == null || menuItem.getItemId() != BottomNavigationView.this.getSelectedItemId()) {
                return BottomNavigationView.this.g != null && !BottomNavigationView.this.g.a(menuItem);
            }
            BottomNavigationView.this.h.a(menuItem);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public class b implements n.c {
        b(BottomNavigationView bottomNavigationView) {
        }

        @Override // com.google.android.material.internal.n.c
        public c0 a(View view, c0 c0Var, n.d dVar) {
            dVar.d += c0Var.b();
            dVar.a(view);
            return c0Var;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a(MenuItem menuItem);
    }

    /* loaded from: classes.dex */
    public interface d {
        boolean a(MenuItem menuItem);
    }

    /* loaded from: classes.dex */
    public static class e extends a.i.a.a {
        public static final Parcelable.Creator<e> CREATOR = new a();
        Bundle d;

        /* loaded from: classes.dex */
        static class a implements Parcelable.ClassLoaderCreator<e> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public e createFromParcel(Parcel parcel) {
                return new e(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public e createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new e(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public e[] newArray(int i) {
                return new e[i];
            }
        }

        public e(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader == null ? e.class.getClassLoader() : classLoader);
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        private void a(Parcel parcel, ClassLoader classLoader) {
            this.d = parcel.readBundle(classLoader);
        }

        @Override // a.i.a.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.d);
        }
    }

    public BottomNavigationView(Context context) {
        this(context, null);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a.a.a.b.bottomNavigationStyle);
    }

    public BottomNavigationView(Context context, AttributeSet attributeSet, int i2) {
        super(m.b(context, attributeSet, i2, i), attributeSet, i2);
        com.google.android.material.bottomnavigation.c cVar;
        ColorStateList colorStateList;
        this.d = new com.google.android.material.bottomnavigation.d();
        Context context2 = getContext();
        this.f1414b = new com.google.android.material.bottomnavigation.b(context2);
        this.f1415c = new com.google.android.material.bottomnavigation.c(context2);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        this.f1415c.setLayoutParams(layoutParams);
        this.d.a(this.f1415c);
        this.d.a(1);
        this.f1415c.setPresenter(this.d);
        this.f1414b.a(this.d);
        this.d.a(getContext(), this.f1414b);
        w0 d2 = m.d(context2, attributeSet, l.BottomNavigationView, i2, k.Widget_Design_BottomNavigationView, l.BottomNavigationView_itemTextAppearanceInactive, l.BottomNavigationView_itemTextAppearanceActive);
        if (d2.g(l.BottomNavigationView_itemIconTint)) {
            cVar = this.f1415c;
            colorStateList = d2.a(l.BottomNavigationView_itemIconTint);
        } else {
            cVar = this.f1415c;
            colorStateList = cVar.a(16842808);
        }
        cVar.setIconTintList(colorStateList);
        setItemIconSize(d2.c(l.BottomNavigationView_itemIconSize, getResources().getDimensionPixelSize(b.a.a.a.d.design_bottom_navigation_icon_size)));
        if (d2.g(l.BottomNavigationView_itemTextAppearanceInactive)) {
            setItemTextAppearanceInactive(d2.g(l.BottomNavigationView_itemTextAppearanceInactive, 0));
        }
        if (d2.g(l.BottomNavigationView_itemTextAppearanceActive)) {
            setItemTextAppearanceActive(d2.g(l.BottomNavigationView_itemTextAppearanceActive, 0));
        }
        if (d2.g(l.BottomNavigationView_itemTextColor)) {
            setItemTextColor(d2.a(l.BottomNavigationView_itemTextColor));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            u.a(this, b(context2));
        }
        if (d2.g(l.BottomNavigationView_elevation)) {
            u.a(this, d2.c(l.BottomNavigationView_elevation, 0));
        }
        androidx.core.graphics.drawable.a.a(getBackground().mutate(), b.a.a.a.y.c.a(context2, d2, l.BottomNavigationView_backgroundTint));
        setLabelVisibilityMode(d2.e(l.BottomNavigationView_labelVisibilityMode, -1));
        setItemHorizontalTranslationEnabled(d2.a(l.BottomNavigationView_itemHorizontalTranslationEnabled, true));
        int g = d2.g(l.BottomNavigationView_itemBackground, 0);
        if (g != 0) {
            this.f1415c.setItemBackgroundRes(g);
        } else {
            setItemRippleColor(b.a.a.a.y.c.a(context2, d2, l.BottomNavigationView_itemRippleColor));
        }
        if (d2.g(l.BottomNavigationView_menu)) {
            a(d2.g(l.BottomNavigationView_menu, 0));
        }
        d2.a();
        addView(this.f1415c, layoutParams);
        if (Build.VERSION.SDK_INT < 21) {
            a(context2);
        }
        this.f1414b.a(new a());
        a();
    }

    private void a() {
        n.a(this, new b(this));
    }

    private void a(Context context) {
        View view = new View(context);
        view.setBackgroundColor(a.g.d.a.a(context, b.a.a.a.c.design_bottom_navigation_shadow_color));
        view.setLayoutParams(new FrameLayout.LayoutParams(-1, getResources().getDimensionPixelSize(b.a.a.a.d.design_bottom_navigation_shadow_height)));
        addView(view);
    }

    private b.a.a.a.b0.g b(Context context) {
        b.a.a.a.b0.g gVar = new b.a.a.a.b0.g();
        Drawable background = getBackground();
        if (background instanceof ColorDrawable) {
            gVar.a(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
        }
        gVar.a(context);
        return gVar;
    }

    private MenuInflater getMenuInflater() {
        if (this.f == null) {
            this.f = new a.a.n.g(getContext());
        }
        return this.f;
    }

    public void a(int i2) {
        this.d.b(true);
        getMenuInflater().inflate(i2, this.f1414b);
        this.d.b(false);
        this.d.a(true);
    }

    public Drawable getItemBackground() {
        return this.f1415c.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.f1415c.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.f1415c.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.f1415c.getIconTintList();
    }

    public ColorStateList getItemRippleColor() {
        return this.e;
    }

    public int getItemTextAppearanceActive() {
        return this.f1415c.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.f1415c.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.f1415c.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.f1415c.getLabelVisibilityMode();
    }

    public int getMaxItemCount() {
        return 5;
    }

    public Menu getMenu() {
        return this.f1414b;
    }

    public int getSelectedItemId() {
        return this.f1415c.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        h.a(this);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.d());
        this.f1414b.b(eVar.d);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        eVar.d = bundle;
        this.f1414b.d(bundle);
        return eVar;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        h.a(this, f);
    }

    public void setItemBackground(Drawable drawable) {
        this.f1415c.setItemBackground(drawable);
        this.e = null;
    }

    public void setItemBackgroundResource(int i2) {
        this.f1415c.setItemBackgroundRes(i2);
        this.e = null;
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        if (this.f1415c.b() != z) {
            this.f1415c.setItemHorizontalTranslationEnabled(z);
            this.d.a(false);
        }
    }

    public void setItemIconSize(int i2) {
        this.f1415c.setItemIconSize(i2);
    }

    public void setItemIconSizeRes(int i2) {
        setItemIconSize(getResources().getDimensionPixelSize(i2));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.f1415c.setIconTintList(colorStateList);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        if (this.e == colorStateList) {
            if (colorStateList != null || this.f1415c.getItemBackground() == null) {
                return;
            }
            this.f1415c.setItemBackground(null);
            return;
        }
        this.e = colorStateList;
        if (colorStateList == null) {
            this.f1415c.setItemBackground(null);
            return;
        }
        ColorStateList a2 = b.a.a.a.z.b.a(colorStateList);
        if (Build.VERSION.SDK_INT >= 21) {
            this.f1415c.setItemBackground(new RippleDrawable(a2, null, null));
            return;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(1.0E-5f);
        Drawable i2 = androidx.core.graphics.drawable.a.i(gradientDrawable);
        androidx.core.graphics.drawable.a.a(i2, a2);
        this.f1415c.setItemBackground(i2);
    }

    public void setItemTextAppearanceActive(int i2) {
        this.f1415c.setItemTextAppearanceActive(i2);
    }

    public void setItemTextAppearanceInactive(int i2) {
        this.f1415c.setItemTextAppearanceInactive(i2);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.f1415c.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i2) {
        if (this.f1415c.getLabelVisibilityMode() != i2) {
            this.f1415c.setLabelVisibilityMode(i2);
            this.d.a(false);
        }
    }

    public void setOnNavigationItemReselectedListener(c cVar) {
        this.h = cVar;
    }

    public void setOnNavigationItemSelectedListener(d dVar) {
        this.g = dVar;
    }

    public void setSelectedItemId(int i2) {
        MenuItem findItem = this.f1414b.findItem(i2);
        if (findItem == null || this.f1414b.a(findItem, this.d, 0)) {
            return;
        }
        findItem.setChecked(true);
    }
}
