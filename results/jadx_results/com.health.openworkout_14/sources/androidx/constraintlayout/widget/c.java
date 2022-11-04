package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Arrays;
import java.util.HashMap;
/* loaded from: classes.dex */
public abstract class c extends View {

    /* renamed from: c */
    protected int f773c;

    /* renamed from: d */
    protected Context f774d;

    /* renamed from: e */
    protected b.e.b.k.h f775e;

    /* renamed from: g */
    protected String f777g;

    /* renamed from: h */
    protected String f778h;

    /* renamed from: b */
    protected int[] f772b = new int[32];

    /* renamed from: f */
    protected boolean f776f = false;
    private HashMap<Integer, String> i = new HashMap<>();

    public c(Context context) {
        super(context);
        this.f774d = context;
        h(null);
    }

    private void a(String str) {
        if (str == null || str.length() == 0 || this.f774d == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
            ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        }
        int g2 = g(trim);
        if (g2 != 0) {
            this.i.put(Integer.valueOf(g2), trim);
            b(g2);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    private void b(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.f773c + 1;
        int[] iArr = this.f772b;
        if (i2 > iArr.length) {
            this.f772b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f772b;
        int i3 = this.f773c;
        iArr2[i3] = i;
        this.f773c = i3 + 1;
    }

    private void c(String str) {
        if (str == null || str.length() == 0 || this.f774d == null) {
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
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && trim.equals(((ConstraintLayout.b) layoutParams).U)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    b(childAt.getId());
                }
            }
        }
    }

    private int f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        if (str == null || constraintLayout == null || (resources = this.f774d.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
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

    private int g(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object f2 = constraintLayout.f(0, str);
            if (f2 instanceof Integer) {
                i = ((Integer) f2).intValue();
            }
        }
        if (i == 0 && constraintLayout != null) {
            i = f(constraintLayout, str);
        }
        if (i == 0) {
            try {
                i = i.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i == 0 ? this.f774d.getResources().getIdentifier(str, "id", this.f774d.getPackageName()) : i;
    }

    public void d() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        e((ConstraintLayout) parent);
    }

    protected void e(ConstraintLayout constraintLayout) {
        int i = Build.VERSION.SDK_INT;
        int visibility = getVisibility();
        float elevation = i >= 21 ? getElevation() : 0.0f;
        for (int i2 = 0; i2 < this.f773c; i2++) {
            View h2 = constraintLayout.h(this.f772b[i2]);
            if (h2 != null) {
                h2.setVisibility(visibility);
                if (elevation > 0.0f && i >= 21) {
                    h2.setTranslationZ(h2.getTranslationZ() + elevation);
                }
            }
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f772b, this.f773c);
    }

    public void h(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, j.J0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == j.V0) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f777g = string;
                    setIds(string);
                } else if (index == j.W0) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f778h = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void i(b.e.b.k.e eVar, boolean z) {
    }

    public void j(ConstraintLayout constraintLayout) {
    }

    public void k(ConstraintLayout constraintLayout) {
    }

    public void l(ConstraintLayout constraintLayout) {
    }

    public void m(ConstraintLayout constraintLayout) {
        String str;
        int f2;
        if (isInEditMode()) {
            setIds(this.f777g);
        }
        b.e.b.k.h hVar = this.f775e;
        if (hVar == null) {
            return;
        }
        hVar.c();
        for (int i = 0; i < this.f773c; i++) {
            int i2 = this.f772b[i];
            View h2 = constraintLayout.h(i2);
            if (h2 == null && (f2 = f(constraintLayout, (str = this.i.get(Integer.valueOf(i2))))) != 0) {
                this.f772b[i] = f2;
                this.i.put(Integer.valueOf(f2), str);
                h2 = constraintLayout.h(f2);
            }
            if (h2 != null) {
                this.f775e.a(constraintLayout.i(h2));
            }
        }
        this.f775e.b(constraintLayout.f734d);
    }

    public void n() {
        if (this.f775e == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (!(layoutParams instanceof ConstraintLayout.b)) {
            return;
        }
        ((ConstraintLayout.b) layoutParams).m0 = (b.e.b.k.e) this.f775e;
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f777g;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f778h;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.f776f) {
            super.onMeasure(i, i2);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    protected void setIds(String str) {
        this.f777g = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f773c = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                a(str.substring(i));
                return;
            } else {
                a(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    protected void setReferenceTags(String str) {
        this.f778h = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.f773c = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                c(str.substring(i));
                return;
            } else {
                c(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f777g = null;
        this.f773c = 0;
        for (int i : iArr) {
            b(i);
        }
    }

    @Override // android.view.View
    public void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f777g == null) {
            b(i);
        }
    }
}
