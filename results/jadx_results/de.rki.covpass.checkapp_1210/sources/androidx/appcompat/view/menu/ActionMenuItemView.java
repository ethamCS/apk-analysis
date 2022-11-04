package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.d1;
import androidx.appcompat.widget.k0;
/* loaded from: classes.dex */
public class ActionMenuItemView extends c0 implements k.a, View.OnClickListener, ActionMenuView.a {
    g V3;
    private CharSequence W3;
    private Drawable X3;
    e.b Y3;
    private k0 Z3;

    /* renamed from: a4 */
    b f866a4;

    /* renamed from: b4 */
    private boolean f867b4;

    /* renamed from: c4 */
    private boolean f868c4;

    /* renamed from: d4 */
    private int f869d4;

    /* renamed from: e4 */
    private int f870e4;

    /* renamed from: f4 */
    private int f871f4;

    /* loaded from: classes.dex */
    private class a extends k0 {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a() {
            super(r1);
            ActionMenuItemView.this = r1;
        }

        @Override // androidx.appcompat.widget.k0
        public l.e b() {
            b bVar = ActionMenuItemView.this.f866a4;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // androidx.appcompat.widget.k0
        protected boolean c() {
            l.e b10;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.Y3;
            return bVar != null && bVar.a(actionMenuItemView.V3) && (b10 = b()) != null && b10.c();
        }
    }

    /* loaded from: classes.dex */
    public static abstract class b {
        public abstract l.e a();
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        Resources resources = context.getResources();
        this.f867b4 = g();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.f9314v, i10, 0);
        this.f869d4 = obtainStyledAttributes.getDimensionPixelSize(e.j.f9319w, 0);
        obtainStyledAttributes.recycle();
        this.f871f4 = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f870e4 = -1;
        setSaveEnabled(false);
    }

    private boolean g() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i10 = configuration.screenWidthDp;
        return i10 >= 480 || (i10 >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    private void h() {
        boolean z10 = true;
        boolean z11 = !TextUtils.isEmpty(this.W3);
        if (this.X3 != null && (!this.V3.B() || (!this.f867b4 && !this.f868c4))) {
            z10 = false;
        }
        boolean z12 = z11 & z10;
        CharSequence charSequence = null;
        setText(z12 ? this.W3 : null);
        CharSequence contentDescription = this.V3.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            contentDescription = z12 ? null : this.V3.getTitle();
        }
        setContentDescription(contentDescription);
        CharSequence tooltipText = this.V3.getTooltipText();
        if (!TextUtils.isEmpty(tooltipText)) {
            d1.a(this, tooltipText);
            return;
        }
        if (!z12) {
            charSequence = this.V3.getTitle();
        }
        d1.a(this, charSequence);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return f();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return f() && this.V3.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void e(g gVar, int i10) {
        this.V3 = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (!gVar.hasSubMenu() || this.Z3 != null) {
            return;
        }
        this.Z3 = new a();
    }

    public boolean f() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.V3;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.Y3;
        if (bVar != null) {
            bVar.a(this.V3);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f867b4 = g();
        h();
    }

    @Override // androidx.appcompat.widget.c0, android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        boolean f10 = f();
        if (f10 && (i12 = this.f870e4) >= 0) {
            super.setPadding(i12, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int measuredWidth = getMeasuredWidth();
        int min = mode == Integer.MIN_VALUE ? Math.min(size, this.f869d4) : this.f869d4;
        if (mode != 1073741824 && this.f869d4 > 0 && measuredWidth < min) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(min, 1073741824), i11);
        }
        if (f10 || this.X3 == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.X3.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        k0 k0Var;
        if (!this.V3.hasSubMenu() || (k0Var = this.Z3) == null || !k0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public void setCheckable(boolean z10) {
    }

    public void setChecked(boolean z10) {
    }

    public void setExpandedFormat(boolean z10) {
        if (this.f868c4 != z10) {
            this.f868c4 = z10;
            g gVar = this.V3;
            if (gVar == null) {
                return;
            }
            gVar.c();
        }
    }

    public void setIcon(Drawable drawable) {
        this.X3 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i10 = this.f871f4;
            if (intrinsicWidth > i10) {
                intrinsicHeight = (int) (intrinsicHeight * (i10 / intrinsicWidth));
                intrinsicWidth = i10;
            }
            if (intrinsicHeight > i10) {
                intrinsicWidth = (int) (intrinsicWidth * (i10 / intrinsicHeight));
            } else {
                i10 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i10);
        }
        setCompoundDrawables(drawable, null, null, null);
        h();
    }

    public void setItemInvoker(e.b bVar) {
        this.Y3 = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i10, int i11, int i12, int i13) {
        this.f870e4 = i10;
        super.setPadding(i10, i11, i12, i13);
    }

    public void setPopupCallback(b bVar) {
        this.f866a4 = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.W3 = charSequence;
        h();
    }
}
