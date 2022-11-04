package androidx.appcompat.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class ViewStubCompat extends View {

    /* renamed from: c */
    private int f1188c;

    /* renamed from: d */
    private int f1189d;

    /* renamed from: q */
    private WeakReference<View> f1190q;

    /* renamed from: x */
    private LayoutInflater f1191x;

    /* renamed from: y */
    private a f1192y;

    /* loaded from: classes.dex */
    public interface a {
        void a(ViewStubCompat viewStubCompat, View view);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ViewStubCompat(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1188c = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, e.j.O3, i10, 0);
        this.f1189d = obtainStyledAttributes.getResourceId(e.j.R3, -1);
        this.f1188c = obtainStyledAttributes.getResourceId(e.j.Q3, 0);
        setId(obtainStyledAttributes.getResourceId(e.j.P3, -1));
        obtainStyledAttributes.recycle();
        setVisibility(8);
        setWillNotDraw(true);
    }

    public View a() {
        ViewParent parent = getParent();
        if (parent instanceof ViewGroup) {
            if (this.f1188c == 0) {
                throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            LayoutInflater layoutInflater = this.f1191x;
            if (layoutInflater == null) {
                layoutInflater = LayoutInflater.from(getContext());
            }
            View inflate = layoutInflater.inflate(this.f1188c, viewGroup, false);
            int i10 = this.f1189d;
            if (i10 != -1) {
                inflate.setId(i10);
            }
            int indexOfChild = viewGroup.indexOfChild(this);
            viewGroup.removeViewInLayout(this);
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                viewGroup.addView(inflate, indexOfChild, layoutParams);
            } else {
                viewGroup.addView(inflate, indexOfChild);
            }
            this.f1190q = new WeakReference<>(inflate);
            a aVar = this.f1192y;
            if (aVar != null) {
                aVar.a(this, inflate);
            }
            return inflate;
        }
        throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
    }

    @Override // android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.View
    @SuppressLint({"MissingSuperCall"})
    public void draw(Canvas canvas) {
    }

    public int getInflatedId() {
        return this.f1189d;
    }

    public LayoutInflater getLayoutInflater() {
        return this.f1191x;
    }

    public int getLayoutResource() {
        return this.f1188c;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        setMeasuredDimension(0, 0);
    }

    public void setInflatedId(int i10) {
        this.f1189d = i10;
    }

    public void setLayoutInflater(LayoutInflater layoutInflater) {
        this.f1191x = layoutInflater;
    }

    public void setLayoutResource(int i10) {
        this.f1188c = i10;
    }

    public void setOnInflateListener(a aVar) {
        this.f1192y = aVar;
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        WeakReference<View> weakReference = this.f1190q;
        if (weakReference != null) {
            View view = weakReference.get();
            if (view == null) {
                throw new IllegalStateException("setVisibility called on un-referenced view");
            }
            view.setVisibility(i10);
            return;
        }
        super.setVisibility(i10);
        if (i10 != 0 && i10 != 4) {
            return;
        }
        a();
    }
}
