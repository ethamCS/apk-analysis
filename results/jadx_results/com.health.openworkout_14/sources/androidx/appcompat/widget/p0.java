package androidx.appcompat.widget;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.widget.i0;
/* loaded from: classes.dex */
public class p0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* renamed from: b */
    Runnable f590b;

    /* renamed from: c */
    private c f591c;

    /* renamed from: d */
    i0 f592d;

    /* renamed from: e */
    private Spinner f593e;

    /* renamed from: f */
    private boolean f594f;

    /* renamed from: g */
    int f595g;

    /* renamed from: h */
    int f596h;
    private int i;
    private int j;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b */
        final /* synthetic */ View f597b;

        a(View view) {
            p0.this = r1;
            this.f597b = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            p0.this.smoothScrollTo(this.f597b.getLeft() - ((p0.this.getWidth() - this.f597b.getWidth()) / 2), 0);
            p0.this.f590b = null;
        }
    }

    /* loaded from: classes.dex */
    public class b extends BaseAdapter {
        b() {
            p0.this = r1;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return p0.this.f592d.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            return ((d) p0.this.f592d.getChildAt(i)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                return p0.this.c((a.c) getItem(i), true);
            }
            ((d) view).a((a.c) getItem(i));
            return view;
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        c() {
            p0.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = p0.this.f592d.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = p0.this.f592d.getChildAt(i);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d extends LinearLayout {

        /* renamed from: b */
        private final int[] f601b;

        /* renamed from: c */
        private a.c f602c;

        /* renamed from: d */
        private TextView f603d;

        /* renamed from: e */
        private ImageView f604e;

        /* renamed from: f */
        private View f605f;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public d(android.content.Context r6, androidx.appcompat.app.a.c r7, boolean r8) {
            /*
                r4 = this;
                androidx.appcompat.widget.p0.this = r5
                int r5 = b.a.a.d_res_0x7f040008
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r3 = 0
                r1[r3] = r2
                r4.f601b = r1
                r4.f602c = r7
                androidx.appcompat.widget.w0 r5 = androidx.appcompat.widget.w0.v(r6, r0, r1, r5, r3)
                boolean r6 = r5.s(r3)
                if (r6 == 0) goto L26
                android.graphics.drawable.Drawable r6 = r5.g(r3)
                r4.setBackgroundDrawable(r6)
            L26:
                r5.w()
                if (r8 == 0) goto L31
                r5 = 8388627(0x800013, float:1.175497E-38)
                r4.setGravity(r5)
            L31:
                r4.c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.p0.d.<init>(androidx.appcompat.widget.p0, android.content.Context, androidx.appcompat.app.a$c, boolean):void");
        }

        public void a(a.c cVar) {
            this.f602c = cVar;
            c();
        }

        public a.c b() {
            return this.f602c;
        }

        public void c() {
            a.c cVar = this.f602c;
            View b2 = cVar.b();
            CharSequence charSequence = null;
            if (b2 != null) {
                ViewParent parent = b2.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b2);
                    }
                    addView(b2);
                }
                this.f605f = b2;
                TextView textView = this.f603d;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f604e;
                if (imageView == null) {
                    return;
                }
                imageView.setVisibility(8);
                this.f604e.setImageDrawable(null);
                return;
            }
            View view = this.f605f;
            if (view != null) {
                removeView(view);
                this.f605f = null;
            }
            Drawable c2 = cVar.c();
            CharSequence d2 = cVar.d();
            if (c2 != null) {
                if (this.f604e == null) {
                    o oVar = new o(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    oVar.setLayoutParams(layoutParams);
                    addView(oVar, 0);
                    this.f604e = oVar;
                }
                this.f604e.setImageDrawable(c2);
                this.f604e.setVisibility(0);
            } else {
                ImageView imageView2 = this.f604e;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f604e.setImageDrawable(null);
                }
            }
            boolean z = !TextUtils.isEmpty(d2);
            if (z) {
                if (this.f603d == null) {
                    z zVar = new z(getContext(), null, b.a.a.e_res_0x7f040009);
                    zVar.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    zVar.setLayoutParams(layoutParams2);
                    addView(zVar);
                    this.f603d = zVar;
                }
                this.f603d.setText(d2);
                this.f603d.setVisibility(0);
            } else {
                TextView textView2 = this.f603d;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f603d.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f604e;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            if (!z) {
                charSequence = cVar.a();
            }
            y0.a(this, charSequence);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            if (p0.this.f595g > 0) {
                int measuredWidth = getMeasuredWidth();
                int i3 = p0.this.f595g;
                if (measuredWidth <= i3) {
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z) {
            boolean z2 = isSelected() != z;
            super.setSelected(z);
            if (!z2 || !z) {
                return;
            }
            sendAccessibilityEvent(4);
        }
    }

    static {
        new DecelerateInterpolator();
    }

    private Spinner b() {
        w wVar = new w(getContext(), null, b.a.a.h_res_0x7f04000d);
        wVar.setLayoutParams(new i0.a(-2, -1));
        wVar.setOnItemSelectedListener(this);
        return wVar;
    }

    private boolean d() {
        Spinner spinner = this.f593e;
        return spinner != null && spinner.getParent() == this;
    }

    private void e() {
        if (d()) {
            return;
        }
        if (this.f593e == null) {
            this.f593e = b();
        }
        removeView(this.f592d);
        addView(this.f593e, new ViewGroup.LayoutParams(-2, -1));
        if (this.f593e.getAdapter() == null) {
            this.f593e.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f590b;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f590b = null;
        }
        this.f593e.setSelection(this.j);
    }

    private boolean f() {
        if (!d()) {
            return false;
        }
        removeView(this.f593e);
        addView(this.f592d, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f593e.getSelectedItemPosition());
        return false;
    }

    public void a(int i) {
        View childAt = this.f592d.getChildAt(i);
        Runnable runnable = this.f590b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f590b = aVar;
        post(aVar);
    }

    d c(a.c cVar, boolean z) {
        d dVar = new d(getContext(), cVar, z);
        if (z) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.i));
        } else {
            dVar.setFocusable(true);
            if (this.f591c == null) {
                this.f591c = new c();
            }
            dVar.setOnClickListener(this.f591c);
        }
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f590b;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        b.a.o.a b2 = b.a.o.a.b(getContext());
        setContentHeight(b2.f());
        this.f596h = b2.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f590b;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
        ((d) view).b().e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int mode = View.MeasureSpec.getMode(i);
        boolean z = true;
        boolean z2 = mode == 1073741824;
        setFillViewport(z2);
        int childCount = this.f592d.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i3 = -1;
        } else {
            if (childCount > 2) {
                this.f595g = (int) (View.MeasureSpec.getSize(i) * 0.4f);
            } else {
                this.f595g = View.MeasureSpec.getSize(i) / 2;
            }
            i3 = Math.min(this.f595g, this.f596h);
        }
        this.f595g = i3;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.i, 1073741824);
        if (z2 || !this.f594f) {
            z = false;
        }
        if (z) {
            this.f592d.measure(0, makeMeasureSpec);
            if (this.f592d.getMeasuredWidth() > View.MeasureSpec.getSize(i)) {
                e();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z2 || measuredWidth == measuredWidth2) {
                }
                setTabSelected(this.j);
                return;
            }
        }
        f();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z2) {
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z) {
        this.f594f = z;
    }

    public void setContentHeight(int i) {
        this.i = i;
        requestLayout();
    }

    public void setTabSelected(int i) {
        this.j = i;
        int childCount = this.f592d.getChildCount();
        int i2 = 0;
        while (i2 < childCount) {
            View childAt = this.f592d.getChildAt(i2);
            boolean z = i2 == i;
            childAt.setSelected(z);
            if (z) {
                a(i);
            }
            i2++;
        }
        Spinner spinner = this.f593e;
        if (spinner == null || i < 0) {
            return;
        }
        spinner.setSelection(i);
    }
}
