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

    /* renamed from: b */
    protected final C0009a f448b;

    /* renamed from: c */
    protected final Context f449c;

    /* renamed from: d */
    protected ActionMenuView f450d;

    /* renamed from: e */
    protected c f451e;

    /* renamed from: f */
    protected int f452f;

    /* renamed from: g */
    protected b.g.l.x f453g;

    /* renamed from: h */
    private boolean f454h;
    private boolean i;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: androidx.appcompat.widget.a$a */
    /* loaded from: classes.dex */
    public class C0009a implements b.g.l.y {

        /* renamed from: a */
        private boolean f455a = false;

        /* renamed from: b */
        int f456b;

        protected C0009a() {
            a.this = r1;
        }

        @Override // b.g.l.y
        public void a(View view) {
            if (this.f455a) {
                return;
            }
            a aVar = a.this;
            aVar.f453g = null;
            a.super.setVisibility(this.f456b);
        }

        @Override // b.g.l.y
        public void b(View view) {
            a.super.setVisibility(0);
            this.f455a = false;
        }

        @Override // b.g.l.y
        public void c(View view) {
            this.f455a = true;
        }

        public C0009a d(b.g.l.x xVar, int i) {
            a.this.f453g = xVar;
            this.f456b = i;
            return this;
        }
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f448b = new C0009a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(b.a.a.a_res_0x7f040003, typedValue, true) || typedValue.resourceId == 0) {
            this.f449c = context;
        } else {
            this.f449c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int d(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public int c(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    public int e(View view, int i, int i2, int i3, boolean z) {
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        int i4 = i2 + ((i3 - measuredHeight) / 2);
        if (z) {
            view.layout(i - measuredWidth, i4, i, measuredHeight + i4);
        } else {
            view.layout(i, i4, i + measuredWidth, measuredHeight + i4);
        }
        return z ? -measuredWidth : measuredWidth;
    }

    public b.g.l.x f(int i, long j) {
        b.g.l.x xVar = this.f453g;
        if (xVar != null) {
            xVar.b();
        }
        if (i != 0) {
            b.g.l.x c2 = b.g.l.t.c(this);
            c2.a(0.0f);
            c2.d(j);
            C0009a c0009a = this.f448b;
            c0009a.d(c2, i);
            c2.f(c0009a);
            return c2;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        b.g.l.x c3 = b.g.l.t.c(this);
        c3.a(1.0f);
        c3.d(j);
        C0009a c0009a2 = this.f448b;
        c0009a2.d(c3, i);
        c3.f(c0009a2);
        return c3;
    }

    public int getAnimatedVisibility() {
        return this.f453g != null ? this.f448b.f456b : getVisibility();
    }

    public int getContentHeight() {
        return this.f452f;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, b.a.j.f1990a, b.a.a.c_res_0x7f040006, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(b.a.j.j, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.f451e;
        if (cVar != null) {
            cVar.I(configuration);
        }
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.i = false;
        }
        if (!this.i) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.i = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.i = false;
        }
        return true;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f454h = false;
        }
        if (!this.f454h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f454h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f454h = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            b.g.l.x xVar = this.f453g;
            if (xVar != null) {
                xVar.b();
            }
            super.setVisibility(i);
        }
    }
}
