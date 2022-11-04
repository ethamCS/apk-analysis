package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.a1;
import androidx.core.view.y;
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements k.a, AbsListView.SelectionBoundsAdjuster {
    private TextView U3;
    private ImageView V3;
    private ImageView W3;
    private LinearLayout X3;
    private Drawable Y3;
    private int Z3;

    /* renamed from: a4 */
    private Context f875a4;

    /* renamed from: b4 */
    private boolean f876b4;

    /* renamed from: c */
    private g f877c;

    /* renamed from: c4 */
    private Drawable f878c4;

    /* renamed from: d */
    private ImageView f879d;

    /* renamed from: d4 */
    private boolean f880d4;

    /* renamed from: e4 */
    private LayoutInflater f881e4;

    /* renamed from: f4 */
    private boolean f882f4;

    /* renamed from: q */
    private RadioButton f883q;

    /* renamed from: x */
    private TextView f884x;

    /* renamed from: y */
    private CheckBox f885y;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.D_res_0x7f03027b);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet);
        a1 v10 = a1.v(getContext(), attributeSet, e.j.T1, i10, 0);
        this.Y3 = v10.g(e.j.V1);
        this.Z3 = v10.n(e.j.U1, -1);
        this.f876b4 = v10.a(e.j.W1, false);
        this.f875a4 = context;
        this.f878c4 = v10.g(e.j.X1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, e.a.A_res_0x7f030161, 0);
        this.f880d4 = obtainStyledAttributes.hasValue(0);
        v10.w();
        obtainStyledAttributes.recycle();
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i10) {
        LinearLayout linearLayout = this.X3;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        } else {
            addView(view, i10);
        }
    }

    private void c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(e.g.h_res_0x7f0c000e, (ViewGroup) this, false);
        this.f885y = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(e.g.i_res_0x7f0c000f, (ViewGroup) this, false);
        this.f879d = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(e.g.k_res_0x7f0c0011, (ViewGroup) this, false);
        this.f883q = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.f881e4 == null) {
            this.f881e4 = LayoutInflater.from(getContext());
        }
        return this.f881e4;
    }

    private void setSubMenuArrowVisible(boolean z10) {
        ImageView imageView = this.V3;
        if (imageView != null) {
            imageView.setVisibility(z10 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.W3;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.W3.getLayoutParams();
        rect.top += this.W3.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.k.a
    public void e(g gVar, int i10) {
        this.f877c = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.k.a
    public g getItemData() {
        return this.f877c;
    }

    public void h(boolean z10, char c10) {
        int i10 = (!z10 || !this.f877c.A()) ? 8 : 0;
        if (i10 == 0) {
            this.U3.setText(this.f877c.h());
        }
        if (this.U3.getVisibility() != i10) {
            this.U3.setVisibility(i10);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        y.s0(this, this.Y3);
        TextView textView = (TextView) findViewById(e.f.M);
        this.f884x = textView;
        int i10 = this.Z3;
        if (i10 != -1) {
            textView.setTextAppearance(this.f875a4, i10);
        }
        this.U3 = (TextView) findViewById(e.f.F_res_0x7f09022c);
        ImageView imageView = (ImageView) findViewById(e.f.I_res_0x7f090252);
        this.V3 = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f878c4);
        }
        this.W3 = (ImageView) findViewById(e.f.r_res_0x7f090109);
        this.X3 = (LinearLayout) findViewById(e.f.f9208l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f879d != null && this.f876b4) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f879d.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z10) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z10 && this.f883q == null && this.f885y == null) {
            return;
        }
        if (this.f877c.m()) {
            if (this.f883q == null) {
                g();
            }
            compoundButton2 = this.f883q;
            compoundButton = this.f885y;
        } else {
            if (this.f885y == null) {
                c();
            }
            compoundButton2 = this.f885y;
            compoundButton = this.f883q;
        }
        if (z10) {
            compoundButton2.setChecked(this.f877c.isChecked());
            if (compoundButton2.getVisibility() != 0) {
                compoundButton2.setVisibility(0);
            }
            if (compoundButton == null || compoundButton.getVisibility() == 8) {
                return;
            }
            compoundButton.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f885y;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f883q;
        if (radioButton == null) {
            return;
        }
        radioButton.setVisibility(8);
    }

    public void setChecked(boolean z10) {
        CompoundButton compoundButton;
        if (this.f877c.m()) {
            if (this.f883q == null) {
                g();
            }
            compoundButton = this.f883q;
        } else {
            if (this.f885y == null) {
                c();
            }
            compoundButton = this.f885y;
        }
        compoundButton.setChecked(z10);
    }

    public void setForceShowIcon(boolean z10) {
        this.f882f4 = z10;
        this.f876b4 = z10;
    }

    public void setGroupDividerEnabled(boolean z10) {
        ImageView imageView = this.W3;
        if (imageView != null) {
            imageView.setVisibility((this.f880d4 || !z10) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z10 = this.f877c.z() || this.f882f4;
        if (z10 || this.f876b4) {
            ImageView imageView = this.f879d;
            if (imageView == null && drawable == null && !this.f876b4) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f876b4) {
                this.f879d.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f879d;
            if (!z10) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f879d.getVisibility() == 0) {
                return;
            }
            this.f879d.setVisibility(0);
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i10;
        if (charSequence != null) {
            this.f884x.setText(charSequence);
            if (this.f884x.getVisibility() == 0) {
                return;
            }
            textView = this.f884x;
            i10 = 0;
        } else {
            i10 = 8;
            if (this.f884x.getVisibility() == 8) {
                return;
            }
            textView = this.f884x;
        }
        textView.setVisibility(i10);
    }
}
