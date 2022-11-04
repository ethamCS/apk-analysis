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
import androidx.recyclerview.widget.RecyclerView;
/* loaded from: classes.dex */
public abstract class a extends ViewGroup {

    /* renamed from: b */
    protected final C0033a f643b;

    /* renamed from: c */
    protected final Context f644c;
    protected ActionMenuView d;
    protected c e;
    protected int f;
    protected a.g.l.y g;
    private boolean h;
    private boolean i;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: androidx.appcompat.widget.a$a */
    /* loaded from: classes.dex */
    public class C0033a implements a.g.l.z {

        /* renamed from: a */
        private boolean f645a = false;

        /* renamed from: b */
        int f646b;

        protected C0033a() {
            a.this = r1;
        }

        public C0033a a(a.g.l.y yVar, int i) {
            a.this.g = yVar;
            this.f646b = i;
            return this;
        }

        @Override // a.g.l.z
        public void a(View view) {
            if (this.f645a) {
                return;
            }
            a aVar = a.this;
            aVar.g = null;
            a.super.setVisibility(this.f646b);
        }

        @Override // a.g.l.z
        public void b(View view) {
            a.super.setVisibility(0);
            this.f645a = false;
        }

        @Override // a.g.l.z
        public void c(View view) {
            this.f645a = true;
        }
    }

    a(Context context) {
        this(context, null);
    }

    a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f643b = new C0033a();
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(a.a.a.actionBarPopupTheme, typedValue, true) || typedValue.resourceId == 0) {
            this.f644c = context;
        } else {
            this.f644c = new ContextThemeWrapper(context, typedValue.resourceId);
        }
    }

    public static int a(int i, int i2, boolean z) {
        return z ? i - i2 : i + i2;
    }

    public int a(View view, int i, int i2, int i3) {
        view.measure(View.MeasureSpec.makeMeasureSpec(i, RecyclerView.UNDEFINED_DURATION), i2);
        return Math.max(0, (i - view.getMeasuredWidth()) - i3);
    }

    public int a(View view, int i, int i2, int i3, boolean z) {
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

    public a.g.l.y a(int i, long j) {
        a.g.l.y yVar = this.g;
        if (yVar != null) {
            yVar.a();
        }
        if (i != 0) {
            a.g.l.y a2 = a.g.l.u.a(this);
            a2.a(0.0f);
            a2.a(j);
            C0033a c0033a = this.f643b;
            c0033a.a(a2, i);
            a2.a(c0033a);
            return a2;
        }
        if (getVisibility() != 0) {
            setAlpha(0.0f);
        }
        a.g.l.y a3 = a.g.l.u.a(this);
        a3.a(1.0f);
        a3.a(j);
        C0033a c0033a2 = this.f643b;
        c0033a2.a(a3, i);
        a3.a(c0033a2);
        return a3;
    }

    public int getAnimatedVisibility() {
        return this.g != null ? this.f643b.f646b : getVisibility();
    }

    public int getContentHeight() {
        return this.f;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(null, a.a.j.ActionBar, a.a.a.actionBarStyle, 0);
        setContentHeight(obtainStyledAttributes.getLayoutDimension(a.a.j.ActionBar_height, 0));
        obtainStyledAttributes.recycle();
        c cVar = this.e;
        if (cVar != null) {
            cVar.a(configuration);
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
            this.h = false;
        }
        if (!this.h) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.h = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.h = false;
        }
        return true;
    }

    public abstract void setContentHeight(int i);

    @Override // android.view.View
    public void setVisibility(int i) {
        if (i != getVisibility()) {
            a.g.l.y yVar = this.g;
            if (yVar != null) {
                yVar.a();
            }
            super.setVisibility(i);
        }
    }
}
