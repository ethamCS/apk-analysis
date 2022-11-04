package com.google.android.material.bottomnavigation;

import a.g.k.e;
import a.g.l.u;
import a.m.o;
import a.m.q;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.n;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.internal.l;
import java.util.HashSet;
/* loaded from: classes.dex */
public class c extends ViewGroup implements n {
    private static final int[] A = {16842912};
    private static final int[] B = {-16842910};

    /* renamed from: b */
    private final q f1420b;

    /* renamed from: c */
    private final int f1421c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final View.OnClickListener h;
    private final e<com.google.android.material.bottomnavigation.a> i;
    private boolean j;
    private int k;
    private com.google.android.material.bottomnavigation.a[] l;
    private int m;
    private int n;
    private ColorStateList o;
    private int p;
    private ColorStateList q;
    private final ColorStateList r;
    private int s;
    private int t;
    private Drawable u;
    private int v;
    private int[] w;
    private SparseArray<b.a.a.a.n.a> x;
    private d y;
    private g z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        a() {
            c.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i itemData = ((com.google.android.material.bottomnavigation.a) view).getItemData();
            if (!c.this.z.a(itemData, c.this.y, 0)) {
                itemData.setChecked(true);
            }
        }
    }

    public c(Context context) {
        this(context, null);
    }

    public c(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.i = new a.g.k.g(5);
        this.m = 0;
        this.n = 0;
        this.x = new SparseArray<>(5);
        Resources resources = getResources();
        this.f1421c = resources.getDimensionPixelSize(b.a.a.a.d.design_bottom_navigation_item_max_width);
        this.d = resources.getDimensionPixelSize(b.a.a.a.d.design_bottom_navigation_item_min_width);
        this.e = resources.getDimensionPixelSize(b.a.a.a.d.design_bottom_navigation_active_item_max_width);
        this.f = resources.getDimensionPixelSize(b.a.a.a.d.design_bottom_navigation_active_item_min_width);
        this.g = resources.getDimensionPixelSize(b.a.a.a.d.design_bottom_navigation_height);
        this.r = a(16842808);
        a.m.b bVar = new a.m.b();
        this.f1420b = bVar;
        bVar.b(0);
        this.f1420b.a(115L);
        this.f1420b.a((TimeInterpolator) new a.j.a.a.b());
        this.f1420b.a(new l());
        this.h = new a();
        this.w = new int[5];
    }

    private boolean a(int i, int i2) {
        if (i == -1) {
            if (i2 > 3) {
                return true;
            }
        } else if (i == 0) {
            return true;
        }
        return false;
    }

    private boolean c(int i) {
        return i != -1;
    }

    private void d() {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.z.size(); i++) {
            hashSet.add(Integer.valueOf(this.z.getItem(i).getItemId()));
        }
        for (int i2 = 0; i2 < this.x.size(); i2++) {
            int keyAt = this.x.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(keyAt))) {
                this.x.delete(keyAt);
            }
        }
    }

    private com.google.android.material.bottomnavigation.a getNewItem() {
        com.google.android.material.bottomnavigation.a a2 = this.i.a();
        return a2 == null ? new com.google.android.material.bottomnavigation.a(getContext()) : a2;
    }

    private void setBadgeIfNeeded(com.google.android.material.bottomnavigation.a aVar) {
        b.a.a.a.n.a aVar2;
        int id = aVar.getId();
        if (c(id) && (aVar2 = this.x.get(id)) != null) {
            aVar.setBadge(aVar2);
        }
    }

    public ColorStateList a(int i) {
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
        return new ColorStateList(new int[][]{B, A, ViewGroup.EMPTY_STATE_SET}, new int[]{b2.getColorForState(B, defaultColor), i2, defaultColor});
    }

    public void a() {
        removeAllViews();
        com.google.android.material.bottomnavigation.a[] aVarArr = this.l;
        if (aVarArr != null) {
            for (com.google.android.material.bottomnavigation.a aVar : aVarArr) {
                if (aVar != null) {
                    this.i.a(aVar);
                    aVar.a();
                }
            }
        }
        if (this.z.size() == 0) {
            this.m = 0;
            this.n = 0;
            this.l = null;
            return;
        }
        d();
        this.l = new com.google.android.material.bottomnavigation.a[this.z.size()];
        boolean a2 = a(this.k, this.z.n().size());
        for (int i = 0; i < this.z.size(); i++) {
            this.y.b(true);
            this.z.getItem(i).setCheckable(true);
            this.y.b(false);
            com.google.android.material.bottomnavigation.a newItem = getNewItem();
            this.l[i] = newItem;
            newItem.setIconTintList(this.o);
            newItem.setIconSize(this.p);
            newItem.setTextColor(this.r);
            newItem.setTextAppearanceInactive(this.s);
            newItem.setTextAppearanceActive(this.t);
            newItem.setTextColor(this.q);
            Drawable drawable = this.u;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.v);
            }
            newItem.setShifting(a2);
            newItem.setLabelVisibilityMode(this.k);
            newItem.a((i) this.z.getItem(i), 0);
            newItem.setItemPosition(i);
            newItem.setOnClickListener(this.h);
            if (this.m != 0 && this.z.getItem(i).getItemId() == this.m) {
                this.n = i;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int min = Math.min(this.z.size() - 1, this.n);
        this.n = min;
        this.z.getItem(min).setChecked(true);
    }

    @Override // androidx.appcompat.view.menu.n
    public void a(g gVar) {
        this.z = gVar;
    }

    public void b(int i) {
        int size = this.z.size();
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.z.getItem(i2);
            if (i == item.getItemId()) {
                this.m = i;
                this.n = i2;
                item.setChecked(true);
                return;
            }
        }
    }

    public boolean b() {
        return this.j;
    }

    public void c() {
        g gVar = this.z;
        if (gVar == null || this.l == null) {
            return;
        }
        int size = gVar.size();
        if (size != this.l.length) {
            a();
            return;
        }
        int i = this.m;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = this.z.getItem(i2);
            if (item.isChecked()) {
                this.m = item.getItemId();
                this.n = i2;
            }
        }
        if (i != this.m) {
            o.a(this, this.f1420b);
        }
        boolean a2 = a(this.k, this.z.n().size());
        for (int i3 = 0; i3 < size; i3++) {
            this.y.b(true);
            this.l[i3].setLabelVisibilityMode(this.k);
            this.l[i3].setShifting(a2);
            this.l[i3].a((i) this.z.getItem(i3), 0);
            this.y.b(false);
        }
    }

    public SparseArray<b.a.a.a.n.a> getBadgeDrawables() {
        return this.x;
    }

    public ColorStateList getIconTintList() {
        return this.o;
    }

    public Drawable getItemBackground() {
        com.google.android.material.bottomnavigation.a[] aVarArr = this.l;
        return (aVarArr == null || aVarArr.length <= 0) ? this.u : aVarArr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.v;
    }

    public int getItemIconSize() {
        return this.p;
    }

    public int getItemTextAppearanceActive() {
        return this.t;
    }

    public int getItemTextAppearanceInactive() {
        return this.s;
    }

    public ColorStateList getItemTextColor() {
        return this.q;
    }

    public int getLabelVisibilityMode() {
        return this.k;
    }

    public int getSelectedItemId() {
        return this.m;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = i4 - i2;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                if (u.o(this) == 1) {
                    int i9 = i5 - i7;
                    childAt.layout(i9 - childAt.getMeasuredWidth(), 0, i9, i6);
                } else {
                    childAt.layout(i7, 0, childAt.getMeasuredWidth() + i7, i6);
                }
                i7 += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.z.n().size();
        int childCount = getChildCount();
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.g, 1073741824);
        if (!a(this.k, size2) || !this.j) {
            int min = Math.min(size / (size2 == 0 ? 1 : size2), this.e);
            int i3 = size - (size2 * min);
            for (int i4 = 0; i4 < childCount; i4++) {
                if (getChildAt(i4).getVisibility() != 8) {
                    int[] iArr = this.w;
                    iArr[i4] = min;
                    if (i3 > 0) {
                        iArr[i4] = iArr[i4] + 1;
                        i3--;
                    }
                } else {
                    this.w[i4] = 0;
                }
            }
        } else {
            View childAt = getChildAt(this.n);
            int i5 = this.f;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.e, RecyclerView.UNDEFINED_DURATION), makeMeasureSpec);
                i5 = Math.max(i5, childAt.getMeasuredWidth());
            }
            int i6 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int min2 = Math.min(size - (this.d * i6), Math.min(i5, this.e));
            int i7 = size - min2;
            int min3 = Math.min(i7 / (i6 == 0 ? 1 : i6), this.f1421c);
            int i8 = i7 - (i6 * min3);
            int i9 = 0;
            while (i9 < childCount) {
                if (getChildAt(i9).getVisibility() != 8) {
                    this.w[i9] = i9 == this.n ? min2 : min3;
                    if (i8 > 0) {
                        int[] iArr2 = this.w;
                        iArr2[i9] = iArr2[i9] + 1;
                        i8--;
                    }
                } else {
                    this.w[i9] = 0;
                }
                i9++;
            }
        }
        int i10 = 0;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.w[i11], 1073741824), makeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                i10 += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(i10, View.MeasureSpec.makeMeasureSpec(i10, 1073741824), 0), View.resolveSizeAndState(this.g, makeMeasureSpec, 0));
    }

    public void setBadgeDrawables(SparseArray<b.a.a.a.n.a> sparseArray) {
        this.x = sparseArray;
        com.google.android.material.bottomnavigation.a[] aVarArr = this.l;
        if (aVarArr != null) {
            for (com.google.android.material.bottomnavigation.a aVar : aVarArr) {
                aVar.setBadge(sparseArray.get(aVar.getId()));
            }
        }
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.o = colorStateList;
        com.google.android.material.bottomnavigation.a[] aVarArr = this.l;
        if (aVarArr != null) {
            for (com.google.android.material.bottomnavigation.a aVar : aVarArr) {
                aVar.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.u = drawable;
        com.google.android.material.bottomnavigation.a[] aVarArr = this.l;
        if (aVarArr != null) {
            for (com.google.android.material.bottomnavigation.a aVar : aVarArr) {
                aVar.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.v = i;
        com.google.android.material.bottomnavigation.a[] aVarArr = this.l;
        if (aVarArr != null) {
            for (com.google.android.material.bottomnavigation.a aVar : aVarArr) {
                aVar.setItemBackground(i);
            }
        }
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        this.j = z;
    }

    public void setItemIconSize(int i) {
        this.p = i;
        com.google.android.material.bottomnavigation.a[] aVarArr = this.l;
        if (aVarArr != null) {
            for (com.google.android.material.bottomnavigation.a aVar : aVarArr) {
                aVar.setIconSize(i);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.t = i;
        com.google.android.material.bottomnavigation.a[] aVarArr = this.l;
        if (aVarArr != null) {
            for (com.google.android.material.bottomnavigation.a aVar : aVarArr) {
                aVar.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.q;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.s = i;
        com.google.android.material.bottomnavigation.a[] aVarArr = this.l;
        if (aVarArr != null) {
            for (com.google.android.material.bottomnavigation.a aVar : aVarArr) {
                aVar.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.q;
                if (colorStateList != null) {
                    aVar.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.q = colorStateList;
        com.google.android.material.bottomnavigation.a[] aVarArr = this.l;
        if (aVarArr != null) {
            for (com.google.android.material.bottomnavigation.a aVar : aVarArr) {
                aVar.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.k = i;
    }

    public void setPresenter(d dVar) {
        this.y = dVar;
    }
}
