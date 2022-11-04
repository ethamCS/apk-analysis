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
import android.view.animation.Interpolator;
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
import androidx.appcompat.widget.l0;
/* loaded from: classes.dex */
public class s0 extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {
    private static final Interpolator Y3 = new DecelerateInterpolator();
    int U3;
    int V3;
    private int W3;
    private int X3;

    /* renamed from: c */
    Runnable f1476c;

    /* renamed from: d */
    private c f1477d;

    /* renamed from: q */
    l0 f1478q;

    /* renamed from: x */
    private Spinner f1479x;

    /* renamed from: y */
    private boolean f1480y;

    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: c */
        final /* synthetic */ View f1481c;

        a(View view) {
            s0.this = r1;
            this.f1481c = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            s0.this.smoothScrollTo(this.f1481c.getLeft() - ((s0.this.getWidth() - this.f1481c.getWidth()) / 2), 0);
            s0.this.f1476c = null;
        }
    }

    /* loaded from: classes.dex */
    public class b extends BaseAdapter {
        b() {
            s0.this = r1;
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return s0.this.f1478q.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i10) {
            return ((d) s0.this.f1478q.getChildAt(i10)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        @Override // android.widget.Adapter
        public View getView(int i10, View view, ViewGroup viewGroup) {
            if (view == null) {
                return s0.this.c((a.c) getItem(i10), true);
            }
            ((d) view).a((a.c) getItem(i10));
            return view;
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        c() {
            s0.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = s0.this.f1478q.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = s0.this.f1478q.getChildAt(i10);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* loaded from: classes.dex */
    public class d extends LinearLayout {

        /* renamed from: c */
        private final int[] f1485c;

        /* renamed from: d */
        private a.c f1486d;

        /* renamed from: q */
        private TextView f1487q;

        /* renamed from: x */
        private ImageView f1488x;

        /* renamed from: y */
        private View f1489y;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public d(android.content.Context r6, androidx.appcompat.app.a.c r7, boolean r8) {
            /*
                r4 = this;
                androidx.appcompat.widget.s0.this = r5
                int r5 = e.a.d_res_0x7f030009
                r0 = 0
                r4.<init>(r6, r0, r5)
                r1 = 1
                int[] r1 = new int[r1]
                r2 = 16842964(0x10100d4, float:2.3694152E-38)
                r3 = 0
                r1[r3] = r2
                r4.f1485c = r1
                r4.f1486d = r7
                androidx.appcompat.widget.a1 r5 = androidx.appcompat.widget.a1.v(r6, r0, r1, r5, r3)
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
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.s0.d.<init>(androidx.appcompat.widget.s0, android.content.Context, androidx.appcompat.app.a$c, boolean):void");
        }

        public void a(a.c cVar) {
            this.f1486d = cVar;
            c();
        }

        public a.c b() {
            return this.f1486d;
        }

        public void c() {
            a.c cVar = this.f1486d;
            View b10 = cVar.b();
            CharSequence charSequence = null;
            if (b10 != null) {
                ViewParent parent = b10.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(b10);
                    }
                    addView(b10);
                }
                this.f1489y = b10;
                TextView textView = this.f1487q;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f1488x;
                if (imageView == null) {
                    return;
                }
                imageView.setVisibility(8);
                this.f1488x.setImageDrawable(null);
                return;
            }
            View view = this.f1489y;
            if (view != null) {
                removeView(view);
                this.f1489y = null;
            }
            Drawable c10 = cVar.c();
            CharSequence d10 = cVar.d();
            if (c10 != null) {
                if (this.f1488x == null) {
                    q qVar = new q(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    qVar.setLayoutParams(layoutParams);
                    addView(qVar, 0);
                    this.f1488x = qVar;
                }
                this.f1488x.setImageDrawable(c10);
                this.f1488x.setVisibility(0);
            } else {
                ImageView imageView2 = this.f1488x;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f1488x.setImageDrawable(null);
                }
            }
            boolean z10 = !TextUtils.isEmpty(d10);
            if (z10) {
                if (this.f1487q == null) {
                    c0 c0Var = new c0(getContext(), null, e.a.f9178e);
                    c0Var.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    c0Var.setLayoutParams(layoutParams2);
                    addView(c0Var);
                    this.f1487q = c0Var;
                }
                this.f1487q.setText(d10);
                this.f1487q.setVisibility(0);
            } else {
                TextView textView2 = this.f1487q;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f1487q.setText((CharSequence) null);
                }
            }
            ImageView imageView3 = this.f1488x;
            if (imageView3 != null) {
                imageView3.setContentDescription(cVar.a());
            }
            if (!z10) {
                charSequence = cVar.a();
            }
            d1.a(this, charSequence);
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
        public void onMeasure(int i10, int i11) {
            super.onMeasure(i10, i11);
            if (s0.this.U3 > 0) {
                int measuredWidth = getMeasuredWidth();
                int i12 = s0.this.U3;
                if (measuredWidth <= i12) {
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(i12, 1073741824), i11);
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z10) {
            boolean z11 = isSelected() != z10;
            super.setSelected(z10);
            if (!z11 || !z10) {
                return;
            }
            sendAccessibilityEvent(4);
        }
    }

    private Spinner b() {
        z zVar = new z(getContext(), null, e.a.f9179h);
        zVar.setLayoutParams(new l0.a(-2, -1));
        zVar.setOnItemSelectedListener(this);
        return zVar;
    }

    private boolean d() {
        Spinner spinner = this.f1479x;
        return spinner != null && spinner.getParent() == this;
    }

    private void e() {
        if (d()) {
            return;
        }
        if (this.f1479x == null) {
            this.f1479x = b();
        }
        removeView(this.f1478q);
        addView(this.f1479x, new ViewGroup.LayoutParams(-2, -1));
        if (this.f1479x.getAdapter() == null) {
            this.f1479x.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f1476c;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f1476c = null;
        }
        this.f1479x.setSelection(this.X3);
    }

    private boolean f() {
        if (!d()) {
            return false;
        }
        removeView(this.f1479x);
        addView(this.f1478q, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f1479x.getSelectedItemPosition());
        return false;
    }

    public void a(int i10) {
        View childAt = this.f1478q.getChildAt(i10);
        Runnable runnable = this.f1476c;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f1476c = aVar;
        post(aVar);
    }

    d c(a.c cVar, boolean z10) {
        d dVar = new d(getContext(), cVar, z10);
        if (z10) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.W3));
        } else {
            dVar.setFocusable(true);
            if (this.f1477d == null) {
                this.f1477d = new c();
            }
            dVar.setOnClickListener(this.f1477d);
        }
        return dVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f1476c;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        k.a b10 = k.a.b(getContext());
        setContentHeight(b10.f());
        this.V3 = b10.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f1476c;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
        ((d) view).b().e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int i12;
        int mode = View.MeasureSpec.getMode(i10);
        boolean z10 = true;
        boolean z11 = mode == 1073741824;
        setFillViewport(z11);
        int childCount = this.f1478q.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            i12 = -1;
        } else {
            if (childCount > 2) {
                this.U3 = (int) (View.MeasureSpec.getSize(i10) * 0.4f);
            } else {
                this.U3 = View.MeasureSpec.getSize(i10) / 2;
            }
            i12 = Math.min(this.U3, this.V3);
        }
        this.U3 = i12;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.W3, 1073741824);
        if (z11 || !this.f1480y) {
            z10 = false;
        }
        if (z10) {
            this.f1478q.measure(0, makeMeasureSpec);
            if (this.f1478q.getMeasuredWidth() > View.MeasureSpec.getSize(i10)) {
                e();
                int measuredWidth = getMeasuredWidth();
                super.onMeasure(i10, makeMeasureSpec);
                int measuredWidth2 = getMeasuredWidth();
                if (z11 || measuredWidth == measuredWidth2) {
                }
                setTabSelected(this.X3);
                return;
            }
        }
        f();
        int measuredWidth3 = getMeasuredWidth();
        super.onMeasure(i10, makeMeasureSpec);
        int measuredWidth22 = getMeasuredWidth();
        if (z11) {
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView<?> adapterView) {
    }

    public void setAllowCollapse(boolean z10) {
        this.f1480y = z10;
    }

    public void setContentHeight(int i10) {
        this.W3 = i10;
        requestLayout();
    }

    public void setTabSelected(int i10) {
        this.X3 = i10;
        int childCount = this.f1478q.getChildCount();
        int i11 = 0;
        while (i11 < childCount) {
            View childAt = this.f1478q.getChildAt(i11);
            boolean z10 = i11 == i10;
            childAt.setSelected(z10);
            if (z10) {
                a(i10);
            }
            i11++;
        }
        Spinner spinner = this.f1479x;
        if (spinner == null || i10 < 0) {
            return;
        }
        spinner.setSelection(i10);
    }
}
