package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
/* loaded from: classes.dex */
public abstract class a extends ViewGroup {
    protected androidx.core.view.e0 U3;
    private boolean V3;
    private boolean W3;

    /* renamed from: c */
    protected final C0016a f1193c;

    /* renamed from: d */
    protected final Context f1194d;

    /* renamed from: q */
    protected ActionMenuView f1195q;

    /* renamed from: x */
    protected c f1196x;

    /* renamed from: y */
    protected int f1197y;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: androidx.appcompat.widget.a$a */
    /* loaded from: classes.dex */
    public class C0016a implements androidx.core.view.f0 {

        /* renamed from: a */
        private boolean f1198a = false;

        /* renamed from: b */
        int f1199b;

        protected C0016a() {
            a.this = r1;
        }

        @Override // androidx.core.view.f0
        public void a(View view) {
            this.f1198a = true;
        }

        @Override // androidx.core.view.f0
        public void b(View view) {
            if (this.f1198a) {
                return;
            }
            a aVar = a.this;
            aVar.U3 = null;
            a.super.setVisibility(this.f1199b);
        }

        @Override // androidx.core.view.f0
        public void c(View view) {
            a.super.setVisibility(0);
            this.f1198a = false;
        }

        public C0016a d(androidx.core.view.e0 e0Var, int i10) {
            a.this.U3 = e0Var;
            this.f1199b = i10;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1193c = new C0016a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(e.a.a_res_0x7f030004, typedValue, true) || typedValue.resourceId == 0) {
            this.f1194d = context;
        } else {
            this.f1194d = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int d(int i10, int i11, boolean z10) {
        return z10 ? i10 - i11 : i10 + i11;
    }

    public int c(View view, int i10, int i11, int i12) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i10, Integer.MIN_VALUE), i11);
        return Math.max(0, (i10 - view.getMeasuredWidth()) - i12);
    }

    public int e(View view, int i10, int i11, int i12, boolean z10) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i13 = i11 + ((i12 - measuredHeight) / 2);
        if (z10) {
            view.layout(i10 - measuredWidth, i13, i10, measuredHeight + i13);
        } else {
            view.layout(i10, i13, i10 + measuredWidth, measuredHeight + i13);
        }
        return z10 ? -measuredWidth : measuredWidth;
    }

    public androidx.core.view.e0 f(int i10, long j10) {
        androidx.core.view.e0 b10;
        androidx.core.view.e0 e0Var = this.U3;
        if (e0Var != null) {
            e0Var.c();
        }
        if (i10 == 0) {
            if (getVisibility() != 0) {
                setAlpha(0.0f);
            }
            b10 = androidx.core.view.y.e(this).b(1.0f);
        } else {
            b10 = androidx.core.view.y.e(this).b(0.0f);
        }
        b10.f(j10);
        b10.h(this.f1193c.d(b10, i10));
        return b10;
    }

    public int getAnimatedVisibility() {
        return this.U3 != null ? this.f1193c.f1199b : getVisibility();
    }

    public int getContentHeight() {
        return this.f1197y;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, e.j.f9209a, e.a.c_res_0x7f030007, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(e.j.f9254j, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f1196x;
        if (cVar != null) {
            cVar.F(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.W3 = false;
        }
        if (!this.W3) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.W3 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.W3 = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.V3 = false;
        }
        if (!this.V3) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.V3 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.V3 = false;
        }
        return true;
    }

    public void setContentHeight(int i10) {
        this.f1197y = i10;
        requestLayout();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        if (i10 != getVisibility()) {
            androidx.core.view.e0 e0Var = this.U3;
            if (e0Var != null) {
                e0Var.c();
            }
            super.setVisibility(i10);
        }
    }
}
