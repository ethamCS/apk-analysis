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
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.w0;
import b.g.l.t;
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements n.a, AbsListView.SelectionBoundsAdjuster {

    /* renamed from: b */
    private i f250b;

    /* renamed from: c */
    private ImageView f251c;

    /* renamed from: d */
    private RadioButton f252d;

    /* renamed from: e */
    private TextView f253e;

    /* renamed from: f */
    private CheckBox f254f;

    /* renamed from: g */
    private TextView f255g;

    /* renamed from: h */
    private ImageView f256h;
    private ImageView i;
    private LinearLayout j;
    private Drawable k;
    private int l;
    private Context m;
    private boolean n;
    private Drawable o;
    private boolean p;
    private LayoutInflater q;
    private boolean r;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b.a.a.E);
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        w0 v = w0.v(getContext(), attributeSet, b.a.j.U1, i, 0);
        this.k = v.g(b.a.j.W1);
        this.l = v.n(b.a.j.V1, -1);
        this.n = v.a(b.a.j.X1, false);
        this.m = context;
        this.o = v.g(b.a.j.Y1);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, b.a.a.B_res_0x7f040128, 0);
        this.p = obtainStyledAttributes.hasValue(0);
        v.w();
        obtainStyledAttributes.recycle();
    }

    private void a(View view) {
        b(view, -1);
    }

    private void b(View view, int i) {
        LinearLayout linearLayout = this.j;
        if (linearLayout != null) {
            linearLayout.addView(view, i);
        } else {
            addView(view, i);
        }
    }

    private void c() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(b.a.g.h_res_0x7f0c000e, (ViewGroup) this, false);
        this.f254f = checkBox;
        a(checkBox);
    }

    private void f() {
        ImageView imageView = (ImageView) getInflater().inflate(b.a.g.i_res_0x7f0c000f, (ViewGroup) this, false);
        this.f251c = imageView;
        b(imageView, 0);
    }

    private void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(b.a.g.k_res_0x7f0c0011, (ViewGroup) this, false);
        this.f252d = radioButton;
        a(radioButton);
    }

    private LayoutInflater getInflater() {
        if (this.q == null) {
            this.q = LayoutInflater.from(getContext());
        }
        return this.q;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.f256h;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.i;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.i.getLayoutParams();
        rect.top += this.i.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public boolean d() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.n.a
    public void e(i iVar, int i) {
        this.f250b = iVar;
        setVisibility(iVar.isVisible() ? 0 : 8);
        setTitle(iVar.i(this));
        setCheckable(iVar.isCheckable());
        h(iVar.A(), iVar.g());
        setIcon(iVar.getIcon());
        setEnabled(iVar.isEnabled());
        setSubMenuArrowVisible(iVar.hasSubMenu());
        setContentDescription(iVar.getContentDescription());
    }

    @Override // androidx.appcompat.view.menu.n.a
    public i getItemData() {
        return this.f250b;
    }

    public void h(boolean z, char c2) {
        int i = (!z || !this.f250b.A()) ? 8 : 0;
        if (i == 0) {
            this.f255g.setText(this.f250b.h());
        }
        if (this.f255g.getVisibility() != i) {
            this.f255g.setVisibility(i);
        }
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        t.l0(this, this.k);
        TextView textView = (TextView) findViewById(b.a.f.M);
        this.f253e = textView;
        int i = this.l;
        if (i != -1) {
            textView.setTextAppearance(this.m, i);
        }
        this.f255g = (TextView) findViewById(b.a.f.F);
        ImageView imageView = (ImageView) findViewById(b.a.f.I);
        this.f256h = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.o);
        }
        this.i = (ImageView) findViewById(b.a.f.r_res_0x7f0900d9);
        this.j = (LinearLayout) findViewById(b.a.f.l_res_0x7f09008c);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f251c != null && this.n) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f251c.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        if (!z && this.f252d == null && this.f254f == null) {
            return;
        }
        if (this.f250b.m()) {
            if (this.f252d == null) {
                g();
            }
            compoundButton2 = this.f252d;
            compoundButton = this.f254f;
        } else {
            if (this.f254f == null) {
                c();
            }
            compoundButton2 = this.f254f;
            compoundButton = this.f252d;
        }
        if (z) {
            compoundButton2.setChecked(this.f250b.isChecked());
            if (compoundButton2.getVisibility() != 0) {
                compoundButton2.setVisibility(0);
            }
            if (compoundButton == null || compoundButton.getVisibility() == 8) {
                return;
            }
            compoundButton.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f254f;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f252d;
        if (radioButton == null) {
            return;
        }
        radioButton.setVisibility(8);
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if (this.f250b.m()) {
            if (this.f252d == null) {
                g();
            }
            compoundButton = this.f252d;
        } else {
            if (this.f254f == null) {
                c();
            }
            compoundButton = this.f254f;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.r = z;
        this.n = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.i;
        if (imageView != null) {
            imageView.setVisibility((this.p || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z = this.f250b.z() || this.r;
        if (z || this.n) {
            ImageView imageView = this.f251c;
            if (imageView == null && drawable == null && !this.n) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.n) {
                this.f251c.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f251c;
            if (!z) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f251c.getVisibility() == 0) {
                return;
            }
            this.f251c.setVisibility(0);
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView;
        int i;
        if (charSequence != null) {
            this.f253e.setText(charSequence);
            if (this.f253e.getVisibility() == 0) {
                return;
            }
            textView = this.f253e;
            i = 0;
        } else {
            i = 8;
            if (this.f253e.getVisibility() == 8) {
                return;
            }
            textView = this.f253e;
        }
        textView.setVisibility(i);
    }
}
