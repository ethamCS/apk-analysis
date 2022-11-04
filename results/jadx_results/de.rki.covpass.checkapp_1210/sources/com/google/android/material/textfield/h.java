package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import androidx.appcompat.widget.m0;
import b5.l;
import com.google.android.material.internal.m;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public class h extends androidx.appcompat.widget.d {
    private final AccessibilityManager U3;
    private final Rect V3;
    private final int W3;

    /* renamed from: y */
    private final m0 f7715y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements AdapterView.OnItemClickListener {
        a() {
            h.this = r1;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i10, long j10) {
            h hVar = h.this;
            h.this.f(i10 < 0 ? hVar.f7715y.v() : hVar.getAdapter().getItem(i10));
            AdapterView.OnItemClickListener onItemClickListener = h.this.getOnItemClickListener();
            if (onItemClickListener != null) {
                if (view == null || i10 < 0) {
                    view = h.this.f7715y.y();
                    i10 = h.this.f7715y.x();
                    j10 = h.this.f7715y.w();
                }
                onItemClickListener.onItemClick(h.this.f7715y.h(), view, i10, j10);
            }
            h.this.f7715y.dismiss();
        }
    }

    public h(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b5.b.f5457b);
    }

    public h(Context context, AttributeSet attributeSet, int i10) {
        super(v5.a.c(context, attributeSet, i10, 0), attributeSet, i10);
        this.V3 = new Rect();
        Context context2 = getContext();
        TypedArray h10 = m.h(context2, attributeSet, l.f5637o2, i10, b5.k.f_res_0x7f1102ff, new int[0]);
        int i11 = l.f5646p2;
        if (h10.hasValue(i11) && h10.getInt(i11, 0) == 0) {
            setKeyListener(null);
        }
        this.W3 = h10.getResourceId(l.f5655q2, b5.h.l_res_0x7f0c0058);
        this.U3 = (AccessibilityManager) context2.getSystemService("accessibility");
        m0 m0Var = new m0(context2);
        this.f7715y = m0Var;
        m0Var.J(true);
        m0Var.D(this);
        m0Var.I(2);
        m0Var.p(getAdapter());
        m0Var.L(new a());
        int i12 = l.f5664r2;
        if (h10.hasValue(i12)) {
            setSimpleItems(h10.getResourceId(i12, 0));
        }
        h10.recycle();
    }

    private TextInputLayout d() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    private int e() {
        ListAdapter adapter = getAdapter();
        TextInputLayout d10 = d();
        int i10 = 0;
        if (adapter == null || d10 == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int min = Math.min(adapter.getCount(), Math.max(0, this.f7715y.x()) + 15);
        View view = null;
        int i11 = 0;
        for (int max = Math.max(0, min - 15); max < min; max++) {
            int itemViewType = adapter.getItemViewType(max);
            if (itemViewType != i10) {
                view = null;
                i10 = itemViewType;
            }
            view = adapter.getView(max, view, d10);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i11 = Math.max(i11, view.getMeasuredWidth());
        }
        Drawable g10 = this.f7715y.g();
        if (g10 != null) {
            g10.getPadding(this.V3);
            Rect rect = this.V3;
            i11 += rect.left + rect.right;
        }
        return i11 + d10.getEndIconView().getMeasuredWidth();
    }

    public <T extends ListAdapter & Filterable> void f(Object obj) {
        setText(convertSelectionToString(obj), false);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout d10 = d();
        return (d10 == null || !d10.O()) ? super.getHint() : d10.getHint();
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout d10 = d();
        if (d10 == null || !d10.O() || super.getHint() != null || !com.google.android.material.internal.g.a()) {
            return;
        }
        setHint(BuildConfig.FLAVOR);
    }

    @Override // android.widget.TextView, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (View.MeasureSpec.getMode(i10) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), e()), View.MeasureSpec.getSize(i10)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t10) {
        super.setAdapter(t10);
        this.f7715y.p(getAdapter());
    }

    public void setSimpleItems(int i10) {
        setSimpleItems(getResources().getStringArray(i10));
    }

    public void setSimpleItems(String[] strArr) {
        setAdapter(new ArrayAdapter(getContext(), this.W3, strArr));
    }

    @Override // android.widget.AutoCompleteTextView
    public void showDropDown() {
        AccessibilityManager accessibilityManager = this.U3;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.f7715y.a();
        }
    }
}
