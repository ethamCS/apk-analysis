package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
/* loaded from: classes.dex */
public abstract class b extends View {
    protected String U3;
    protected String V3;
    private View[] W3;
    protected HashMap<Integer, String> X3;

    /* renamed from: c */
    protected int[] f2926c;

    /* renamed from: d */
    protected int f2927d;

    /* renamed from: q */
    protected Context f2928q;

    /* renamed from: x */
    protected m0.h f2929x;

    /* renamed from: y */
    protected boolean f2930y;

    public b(Context context) {
        super(context);
        this.f2926c = new int[32];
        this.f2930y = false;
        this.W3 = null;
        this.X3 = new HashMap<>();
        this.f2928q = context;
        m(null);
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2926c = new int[32];
        this.f2930y = false;
        this.W3 = null;
        this.X3 = new HashMap<>();
        this.f2928q = context;
        m(attributeSet);
    }

    private void d(String str) {
        if (str == null || str.length() == 0 || this.f2928q == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        }
        int k10 = k(trim);
        if (k10 != 0) {
            this.X3.put(Integer.valueOf(k10), trim);
            e(k10);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    private void e(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f2927d + 1;
        int[] iArr = this.f2926c;
        if (i11 > iArr.length) {
            this.f2926c = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f2926c;
        int i12 = this.f2927d;
        iArr2[i12] = i10;
        this.f2927d = i12 + 1;
    }

    private void f(String str) {
        if (str == null || str.length() == 0 || this.f2928q == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = null;
        if (getParent() instanceof ConstraintLayout) {
            constraintLayout = (ConstraintLayout) getParent();
        }
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && trim.equals(((ConstraintLayout.b) layoutParams).f2858c0)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    e(childAt.getId());
                }
            }
        }
    }

    private int j(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f2928q.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            if (childAt.getId() != -1) {
                String str2 = null;
                try {
                    str2 = resources.getResourceEntryName(childAt.getId());
                } catch (Resources.NotFoundException unused) {
                }
                if (str.equals(str2)) {
                    return childAt.getId();
                }
            }
        }
        return 0;
    }

    private int k(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i10 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object h10 = constraintLayout.h(0, str);
            if (h10 instanceof Integer) {
                i10 = ((Integer) h10).intValue();
            }
        }
        if (i10 == 0 && constraintLayout != null) {
            i10 = j(constraintLayout, str);
        }
        if (i10 == 0) {
            try {
                i10 = h.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i10 == 0 ? this.f2928q.getResources().getIdentifier(str, "id", this.f2928q.getPackageName()) : i10;
    }

    public void g() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        h((ConstraintLayout) parent);
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f2926c, this.f2927d);
    }

    public void h(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f2927d; i10++) {
            View l10 = constraintLayout.l(this.f2926c[i10]);
            if (l10 != null) {
                l10.setVisibility(visibility);
                if (elevation > 0.0f) {
                    l10.setTranslationZ(l10.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void i(ConstraintLayout constraintLayout) {
    }

    public View[] l(ConstraintLayout constraintLayout) {
        View[] viewArr = this.W3;
        if (viewArr == null || viewArr.length != this.f2927d) {
            this.W3 = new View[this.f2927d];
        }
        for (int i10 = 0; i10 < this.f2927d; i10++) {
            this.W3[i10] = constraintLayout.l(this.f2926c[i10]);
        }
        return this.W3;
    }

    public void m(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f3180n1);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == i.f3288z1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.U3 = string;
                    setIds(string);
                } else if (index == i.A1) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.V3 = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void n(m0.e eVar, boolean z10) {
    }

    public void o(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.U3;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.V3;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f2930y) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void p(ConstraintLayout constraintLayout) {
    }

    public void q(ConstraintLayout constraintLayout) {
    }

    public void r(ConstraintLayout constraintLayout) {
        String str;
        int j10;
        if (isInEditMode()) {
            setIds(this.U3);
        }
        m0.h hVar = this.f2929x;
        if (hVar == null) {
            return;
        }
        hVar.c();
        for (int i10 = 0; i10 < this.f2927d; i10++) {
            int i11 = this.f2926c[i10];
            View l10 = constraintLayout.l(i11);
            if (l10 == null && (j10 = j(constraintLayout, (str = this.X3.get(Integer.valueOf(i11))))) != 0) {
                this.f2926c[i10] = j10;
                this.X3.put(Integer.valueOf(j10), str);
                l10 = constraintLayout.l(j10);
            }
            if (l10 != null) {
                this.f2929x.a(constraintLayout.p(l10));
            }
        }
        this.f2929x.b(constraintLayout.f2849q);
    }

    public void s() {
        if (this.f2929x == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!(layoutParams instanceof ConstraintLayout.b)) {
            return;
        }
        ((ConstraintLayout.b) layoutParams).f2896v0 = (m0.e) this.f2929x;
    }

    protected void setIds(String str) {
        this.U3 = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f2927d = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                d(str.substring(i10));
                return;
            } else {
                d(str.substring(i10, indexOf));
                i10 = indexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.V3 = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f2927d = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                f(str.substring(i10));
                return;
            } else {
                f(str.substring(i10, indexOf));
                i10 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.U3 = null;
        this.f2927d = 0;
        for (int i10 : iArr) {
            e(i10);
        }
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.U3 == null) {
            e(i10);
        }
    }
}
