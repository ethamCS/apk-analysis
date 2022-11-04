package com.google.android.material.bottomnavigation;

import a.g.l.s;
import a.g.l.u;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.y0;
import b.a.a.a.e;
import b.a.a.a.f;
import b.a.a.a.h;
/* loaded from: classes.dex */
public class a extends FrameLayout implements n.a {
    private static final int[] q = {16842912};

    /* renamed from: b */
    private final int f1417b;

    /* renamed from: c */
    private float f1418c;
    private float d;
    private float e;
    private int f;
    private boolean g;
    private ImageView h;
    private final TextView i;
    private final TextView j;
    private int k;
    private i l;
    private ColorStateList m;
    private Drawable n;
    private Drawable o;
    private b.a.a.a.n.a p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.bottomnavigation.a$a */
    /* loaded from: classes.dex */
    public class View$OnLayoutChangeListenerC0061a implements View.OnLayoutChangeListener {
        View$OnLayoutChangeListenerC0061a() {
            a.this = r1;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            if (a.this.h.getVisibility() == 0) {
                a aVar = a.this;
                aVar.d(aVar.h);
            }
        }
    }

    public a(Context context) {
        this(context, null);
    }

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.k = -1;
        Resources resources = getResources();
        LayoutInflater.from(context).inflate(h.design_bottom_navigation_item, (ViewGroup) this, true);
        setBackgroundResource(e.design_bottom_navigation_item_background);
        this.f1417b = resources.getDimensionPixelSize(b.a.a.a.d.design_bottom_navigation_margin);
        this.h = (ImageView) findViewById(f.icon);
        this.i = (TextView) findViewById(f.smallLabel);
        this.j = (TextView) findViewById(f.largeLabel);
        u.h(this.i, 2);
        u.h(this.j, 2);
        setFocusable(true);
        a(this.i.getTextSize(), this.j.getTextSize());
        ImageView imageView = this.h;
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new View$OnLayoutChangeListenerC0061a());
        }
        u.a(this, (a.g.l.a) null);
    }

    private FrameLayout a(View view) {
        ImageView imageView = this.h;
        if (view != imageView || !b.a.a.a.n.b.f1231a) {
            return null;
        }
        return (FrameLayout) imageView.getParent();
    }

    private void a(float f, float f2) {
        this.f1418c = f - f2;
        this.d = (f2 * 1.0f) / f;
        this.e = (f * 1.0f) / f2;
    }

    private void a(View view, float f, float f2, int i) {
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setVisibility(i);
    }

    private void a(View view, int i, int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.gravity = i2;
        view.setLayoutParams(layoutParams);
    }

    private void b(View view) {
        if (b() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            b.a.a.a.n.b.a(this.p, view, a(view));
        }
    }

    private boolean b() {
        return this.p != null;
    }

    private void c(View view) {
        if (!b()) {
            return;
        }
        if (view != null) {
            setClipChildren(true);
            setClipToPadding(true);
            b.a.a.a.n.b.b(this.p, view, a(view));
        }
        this.p = null;
    }

    public void d(View view) {
        if (!b()) {
            return;
        }
        b.a.a.a.n.b.c(this.p, view, a(view));
    }

    public void a() {
        c(this.h);
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void a(i iVar, int i) {
        this.l = iVar;
        setCheckable(iVar.isCheckable());
        setChecked(iVar.isChecked());
        setEnabled(iVar.isEnabled());
        setIcon(iVar.getIcon());
        setTitle(iVar.getTitle());
        setId(iVar.getItemId());
        if (!TextUtils.isEmpty(iVar.getContentDescription())) {
            setContentDescription(iVar.getContentDescription());
        }
        y0.a(this, !TextUtils.isEmpty(iVar.getTooltipText()) ? iVar.getTooltipText() : iVar.getTitle());
        setVisibility(iVar.isVisible() ? 0 : 8);
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean c() {
        return false;
    }

    b.a.a.a.n.a getBadge() {
        return this.p;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public i getItemData() {
        return this.l;
    }

    public int getItemPosition() {
        return this.k;
    }

    @Override // android.view.ViewGroup, android.view.View
    public int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        i iVar = this.l;
        if (iVar != null && iVar.isCheckable() && this.l.isChecked()) {
            FrameLayout.mergeDrawableStates(onCreateDrawableState, q);
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        b.a.a.a.n.a aVar = this.p;
        if (aVar == null || !aVar.isVisible()) {
            return;
        }
        CharSequence title = this.l.getTitle();
        if (!TextUtils.isEmpty(this.l.getContentDescription())) {
            title = this.l.getContentDescription();
        }
        accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.p.b()));
    }

    public void setBadge(b.a.a.a.n.a aVar) {
        this.p = aVar;
        ImageView imageView = this.h;
        if (imageView != null) {
            b(imageView);
        }
    }

    public void setCheckable(boolean z) {
        refreshDrawableState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0059, code lost:
        a(r9.h, (int) (r9.f1417b + r9.f1418c), 49);
        a(r9.j, 1.0f, 1.0f, 0);
        r0 = r9.i;
        r1 = r9.d;
        a(r0, r1, r1, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0072, code lost:
        a(r9.h, r9.f1417b, 49);
        r0 = r9.j;
        r1 = r9.e;
        a(r0, r1, r1, 4);
        a(r9.i, 1.0f, 1.0f, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x008a, code lost:
        if (r10 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x008c, code lost:
        a(r0, r1, 49);
        a(r9.j, 1.0f, 1.0f, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0095, code lost:
        a(r0, r1, 17);
        a(r9.j, 0.5f, 0.5f, 4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x009d, code lost:
        r9.i.setVisibility(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ab, code lost:
        if (r10 != false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ae, code lost:
        if (r10 != false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0057, code lost:
        if (r10 != false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setChecked(boolean r10) {
        /*
            r9 = this;
            android.widget.TextView r0 = r9.j
            int r1 = r0.getWidth()
            r2 = 2
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.setPivotX(r1)
            android.widget.TextView r0 = r9.j
            int r1 = r0.getBaseline()
            float r1 = (float) r1
            r0.setPivotY(r1)
            android.widget.TextView r0 = r9.i
            int r1 = r0.getWidth()
            int r1 = r1 / r2
            float r1 = (float) r1
            r0.setPivotX(r1)
            android.widget.TextView r0 = r9.i
            int r1 = r0.getBaseline()
            float r1 = (float) r1
            r0.setPivotY(r1)
            int r0 = r9.f
            r1 = -1
            r3 = 17
            r4 = 1056964608(0x3f000000, float:0.5)
            r5 = 0
            r6 = 49
            r7 = 4
            r8 = 1065353216(0x3f800000, float:1.0)
            if (r0 == r1) goto La3
            if (r0 == 0) goto L86
            r1 = 1
            if (r0 == r1) goto L57
            if (r0 == r2) goto L43
            goto Lb1
        L43:
            android.widget.ImageView r0 = r9.h
            int r1 = r9.f1417b
            r9.a(r0, r1, r3)
            android.widget.TextView r0 = r9.j
            r1 = 8
            r0.setVisibility(r1)
            android.widget.TextView r0 = r9.i
            r0.setVisibility(r1)
            goto Lb1
        L57:
            if (r10 == 0) goto L72
        L59:
            android.widget.ImageView r0 = r9.h
            int r1 = r9.f1417b
            float r1 = (float) r1
            float r2 = r9.f1418c
            float r1 = r1 + r2
            int r1 = (int) r1
            r9.a(r0, r1, r6)
            android.widget.TextView r0 = r9.j
            r9.a(r0, r8, r8, r5)
            android.widget.TextView r0 = r9.i
            float r1 = r9.d
            r9.a(r0, r1, r1, r7)
            goto Lb1
        L72:
            android.widget.ImageView r0 = r9.h
            int r1 = r9.f1417b
            r9.a(r0, r1, r6)
            android.widget.TextView r0 = r9.j
            float r1 = r9.e
            r9.a(r0, r1, r1, r7)
            android.widget.TextView r0 = r9.i
            r9.a(r0, r8, r8, r5)
            goto Lb1
        L86:
            android.widget.ImageView r0 = r9.h
            int r1 = r9.f1417b
            if (r10 == 0) goto L95
        L8c:
            r9.a(r0, r1, r6)
            android.widget.TextView r0 = r9.j
            r9.a(r0, r8, r8, r5)
            goto L9d
        L95:
            r9.a(r0, r1, r3)
            android.widget.TextView r0 = r9.j
            r9.a(r0, r4, r4, r7)
        L9d:
            android.widget.TextView r0 = r9.i
            r0.setVisibility(r7)
            goto Lb1
        La3:
            boolean r0 = r9.g
            if (r0 == 0) goto Lae
            android.widget.ImageView r0 = r9.h
            int r1 = r9.f1417b
            if (r10 == 0) goto L95
            goto L8c
        Lae:
            if (r10 == 0) goto L72
            goto L59
        Lb1:
            r9.refreshDrawableState()
            r9.setSelected(r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.bottomnavigation.a.setChecked(boolean):void");
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.i.setEnabled(z);
        this.j.setEnabled(z);
        this.h.setEnabled(z);
        u.a(this, z ? s.a(getContext(), 1002) : null);
    }

    public void setIcon(Drawable drawable) {
        if (drawable == this.n) {
            return;
        }
        this.n = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = androidx.core.graphics.drawable.a.i(drawable).mutate();
            this.o = drawable;
            ColorStateList colorStateList = this.m;
            if (colorStateList != null) {
                androidx.core.graphics.drawable.a.a(drawable, colorStateList);
            }
        }
        this.h.setImageDrawable(drawable);
    }

    public void setIconSize(int i) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.h.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i;
        this.h.setLayoutParams(layoutParams);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        Drawable drawable;
        this.m = colorStateList;
        if (this.l == null || (drawable = this.o) == null) {
            return;
        }
        androidx.core.graphics.drawable.a.a(drawable, colorStateList);
        this.o.invalidateSelf();
    }

    public void setItemBackground(int i) {
        setItemBackground(i == 0 ? null : a.g.d.a.c(getContext(), i));
    }

    public void setItemBackground(Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        u.a(this, drawable);
    }

    public void setItemPosition(int i) {
        this.k = i;
    }

    public void setLabelVisibilityMode(int i) {
        if (this.f != i) {
            this.f = i;
            if (!(this.l != null)) {
                return;
            }
            setChecked(this.l.isChecked());
        }
    }

    public void setShifting(boolean z) {
        if (this.g != z) {
            this.g = z;
            if (!(this.l != null)) {
                return;
            }
            setChecked(this.l.isChecked());
        }
    }

    public void setTextAppearanceActive(int i) {
        androidx.core.widget.i.d(this.j, i);
        a(this.i.getTextSize(), this.j.getTextSize());
    }

    public void setTextAppearanceInactive(int i) {
        androidx.core.widget.i.d(this.i, i);
        a(this.i.getTextSize(), this.j.getTextSize());
    }

    public void setTextColor(ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.i.setTextColor(colorStateList);
            this.j.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        this.i.setText(charSequence);
        this.j.setText(charSequence);
        i iVar = this.l;
        if (iVar == null || TextUtils.isEmpty(iVar.getContentDescription())) {
            setContentDescription(charSequence);
        }
        i iVar2 = this.l;
        if (iVar2 != null && !TextUtils.isEmpty(iVar2.getTooltipText())) {
            charSequence = this.l.getTooltipText();
        }
        y0.a(this, charSequence);
    }
}
