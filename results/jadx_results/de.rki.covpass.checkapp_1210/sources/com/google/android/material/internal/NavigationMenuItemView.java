package com.google.android.material.internal;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.CheckedTextView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.d1;
import androidx.appcompat.widget.l0;
import androidx.core.view.y;
/* loaded from: classes.dex */
public class NavigationMenuItemView extends f implements k.a {

    /* renamed from: u4 */
    private static final int[] f7317u4 = {16842912};

    /* renamed from: k4 */
    private int f7318k4;

    /* renamed from: l4 */
    private boolean f7319l4;

    /* renamed from: m4 */
    boolean f7320m4;

    /* renamed from: n4 */
    private final CheckedTextView f7321n4;

    /* renamed from: o4 */
    private FrameLayout f7322o4;

    /* renamed from: p4 */
    private androidx.appcompat.view.menu.g f7323p4;

    /* renamed from: q4 */
    private ColorStateList f7324q4;

    /* renamed from: r4 */
    private boolean f7325r4;

    /* renamed from: s4 */
    private Drawable f7326s4;

    /* renamed from: t4 */
    private final androidx.core.view.a f7327t4;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends androidx.core.view.a {
        a() {
            NavigationMenuItemView.this = r1;
        }

        @Override // androidx.core.view.a
        public void g(View view, androidx.core.view.accessibility.d dVar) {
            super.g(view, dVar);
            dVar.V(NavigationMenuItemView.this.f7320m4);
        }
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NavigationMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        a aVar = new a();
        this.f7327t4 = aVar;
        setOrientation(0);
        LayoutInflater.from(context).inflate(b5.h.c_res_0x7f0c0037, (ViewGroup) this, true);
        setIconSize(context.getResources().getDimensionPixelSize(b5.d.e_res_0x7f06007f));
        CheckedTextView checkedTextView = (CheckedTextView) findViewById(b5.f.e_res_0x7f0900c5);
        this.f7321n4 = checkedTextView;
        checkedTextView.setDuplicateParentStateEnabled(true);
        y.o0(checkedTextView, aVar);
    }

    private void B() {
        int i10;
        l0.a aVar;
        if (D()) {
            this.f7321n4.setVisibility(8);
            FrameLayout frameLayout = this.f7322o4;
            if (frameLayout == null) {
                return;
            }
            aVar = (l0.a) frameLayout.getLayoutParams();
            i10 = -1;
        } else {
            this.f7321n4.setVisibility(0);
            FrameLayout frameLayout2 = this.f7322o4;
            if (frameLayout2 == null) {
                return;
            }
            aVar = (l0.a) frameLayout2.getLayoutParams();
            i10 = -2;
        }
        ((LinearLayout.LayoutParams) aVar).width = i10;
        this.f7322o4.setLayoutParams(aVar);
    }

    private StateListDrawable C() {
        TypedValue typedValue = new TypedValue();
        if (getContext().getTheme().resolveAttribute(e.a.f9185w, typedValue, true)) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(f7317u4, new ColorDrawable(typedValue.data));
            stateListDrawable.addState(ViewGroup.EMPTY_STATE_SET, new ColorDrawable(0));
            return stateListDrawable;
        }
        return null;
    }

    private boolean D() {
        return this.f7323p4.getTitle() == null && this.f7323p4.getIcon() == null && this.f7323p4.getActionView() != null;
    }

    private void setActionView(View view) {
        if (view != null) {
            if (this.f7322o4 == null) {
                this.f7322o4 = (FrameLayout) ((ViewStub) findViewById(b5.f.d_res_0x7f0900c4)).inflate();
            }
            this.f7322o4.removeAllViews();
            this.f7322o4.addView(view);
        }
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void e(androidx.appcompat.view.menu.g gVar, int i10) {
        this.f7323p4 = gVar;
        if (gVar.getItemId() > 0) {
            setId(gVar.getItemId());
        }
        setVisibility(gVar.isVisible() ? 0 : 8);
        if (getBackground() == null) {
            y.s0(this, C());
        }
        setCheckable(gVar.isCheckable());
        setChecked(gVar.isChecked());
        setEnabled(gVar.isEnabled());
        setTitle(gVar.getTitle());
        setIcon(gVar.getIcon());
        setActionView(gVar.getActionView());
        setContentDescription(gVar.getContentDescription());
        d1.a(this, gVar.getTooltipText());
        B();
    }

    @Override // androidx.appcompat.view.menu.k.a
    public androidx.appcompat.view.menu.g getItemData() {
        return this.f7323p4;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i10) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i10 + 1);
        androidx.appcompat.view.menu.g gVar = this.f7323p4;
        if (gVar != null && gVar.isCheckable() && this.f7323p4.isChecked()) {
            ViewGroup.mergeDrawableStates(onCreateDrawableState, f7317u4);
        }
        return onCreateDrawableState;
    }

    public void setCheckable(boolean z10) {
        refreshDrawableState();
        if (this.f7320m4 != z10) {
            this.f7320m4 = z10;
            this.f7327t4.l(this.f7321n4, 2048);
        }
    }

    public void setChecked(boolean z10) {
        refreshDrawableState();
        this.f7321n4.setChecked(z10);
    }

    public void setHorizontalPadding(int i10) {
        setPadding(i10, getPaddingTop(), i10, getPaddingBottom());
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            if (this.f7325r4) {
                Drawable.ConstantState constantState = drawable.getConstantState();
                if (constantState != null) {
                    drawable = constantState.newDrawable();
                }
                drawable = androidx.core.graphics.drawable.a.r(drawable).mutate();
                androidx.core.graphics.drawable.a.o(drawable, this.f7324q4);
            }
            int i10 = this.f7318k4;
            drawable.setBounds(0, 0, i10, i10);
        } else if (this.f7319l4) {
            if (this.f7326s4 == null) {
                Drawable e10 = androidx.core.content.res.h.e(getResources(), b5.e.g_res_0x7f0700c4, getContext().getTheme());
                this.f7326s4 = e10;
                if (e10 != null) {
                    int i11 = this.f7318k4;
                    e10.setBounds(0, 0, i11, i11);
                }
            }
            drawable = this.f7326s4;
        }
        androidx.core.widget.j.j(this.f7321n4, drawable, null, null, null);
    }

    public void setIconPadding(int i10) {
        this.f7321n4.setCompoundDrawablePadding(i10);
    }

    public void setIconSize(int i10) {
        this.f7318k4 = i10;
    }

    void setIconTintList(ColorStateList colorStateList) {
        this.f7324q4 = colorStateList;
        this.f7325r4 = colorStateList != null;
        androidx.appcompat.view.menu.g gVar = this.f7323p4;
        if (gVar != null) {
            setIcon(gVar.getIcon());
        }
    }

    public void setMaxLines(int i10) {
        this.f7321n4.setMaxLines(i10);
    }

    public void setNeedsEmptyIcon(boolean z10) {
        this.f7319l4 = z10;
    }

    public void setTextAppearance(int i10) {
        androidx.core.widget.j.o(this.f7321n4, i10);
    }

    public void setTextColor(ColorStateList colorStateList) {
        this.f7321n4.setTextColor(colorStateList);
    }

    public void setTitle(CharSequence charSequence) {
        this.f7321n4.setText(charSequence);
    }
}
