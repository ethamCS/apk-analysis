package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import androidx.core.view.accessibility.d;
import androidx.core.view.y;
import b5.f;
import b5.h;
import b5.k;
import b5.l;
import com.google.android.material.timepicker.ClockHandView;
import java.util.Arrays;
import org.conscrypt.BuildConfig;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ClockFaceView extends com.google.android.material.timepicker.b implements ClockHandView.d {
    private final int A4;
    private String[] B4;
    private float C4;
    private final ColorStateList D4;

    /* renamed from: q4 */
    private final ClockHandView f7737q4;

    /* renamed from: r4 */
    private final Rect f7738r4;

    /* renamed from: s4 */
    private final RectF f7739s4;

    /* renamed from: t4 */
    private final SparseArray<TextView> f7740t4;

    /* renamed from: u4 */
    private final androidx.core.view.a f7741u4;

    /* renamed from: v4 */
    private final int[] f7742v4;

    /* renamed from: w4 */
    private final float[] f7743w4;

    /* renamed from: x4 */
    private final int f7744x4;

    /* renamed from: y4 */
    private final int f7745y4;

    /* renamed from: z4 */
    private final int f7746z4;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements ViewTreeObserver.OnPreDrawListener {
        a() {
            ClockFaceView.this = r1;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            if (!ClockFaceView.this.isShown()) {
                return true;
            }
            ClockFaceView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            ClockFaceView.this.D(((ClockFaceView.this.getHeight() / 2) - ClockFaceView.this.f7737q4.g()) - ClockFaceView.this.f7744x4);
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends androidx.core.view.a {
        b() {
            ClockFaceView.this = r1;
        }

        @Override // androidx.core.view.a
        public void g(View view, d dVar) {
            super.g(view, dVar);
            int intValue = ((Integer) view.getTag(f.o_res_0x7f090174)).intValue();
            if (intValue > 0) {
                dVar.v0((View) ClockFaceView.this.f7740t4.get(intValue - 1));
            }
            dVar.a0(d.c.a(0, 1, intValue, 1, false, view.isSelected()));
            dVar.Y(true);
            dVar.b(d.a.f3618i);
        }

        @Override // androidx.core.view.a
        public boolean j(View view, int i10, Bundle bundle) {
            if (i10 == 16) {
                long uptimeMillis = SystemClock.uptimeMillis();
                float x10 = view.getX() + (view.getWidth() / 2.0f);
                float height = (view.getHeight() / 2.0f) + view.getY();
                ClockFaceView.this.f7737q4.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 0, x10, height, 0));
                ClockFaceView.this.f7737q4.onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 1, x10, height, 0));
                return true;
            }
            return super.j(view, i10, bundle);
        }
    }

    public ClockFaceView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, b5.b.x_res_0x7f0302bb);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public ClockFaceView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f7738r4 = new Rect();
        this.f7739s4 = new RectF();
        this.f7740t4 = new SparseArray<>();
        this.f7743w4 = new float[]{0.0f, 0.9f, 1.0f};
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, l.f5582i1, i10, k.f5506y);
        Resources resources = getResources();
        ColorStateList a10 = q5.c.a(context, obtainStyledAttributes, l.f5600k1);
        this.D4 = a10;
        LayoutInflater.from(context).inflate(h.g_res_0x7f0c004a, (ViewGroup) this, true);
        ClockHandView clockHandView = (ClockHandView) findViewById(f.i_res_0x7f090164);
        this.f7737q4 = clockHandView;
        this.f7744x4 = resources.getDimensionPixelSize(b5.d.l_res_0x7f06016b);
        int colorForState = a10.getColorForState(new int[]{16842913}, a10.getDefaultColor());
        this.f7742v4 = new int[]{colorForState, colorForState, a10.getDefaultColor()};
        clockHandView.b(this);
        int defaultColor = g.a.a(context, b5.c.b_res_0x7f050254).getDefaultColor();
        ColorStateList a11 = q5.c.a(context, obtainStyledAttributes, l.f5591j1);
        setBackgroundColor(a11 != null ? a11.getDefaultColor() : defaultColor);
        getViewTreeObserver().addOnPreDrawListener(new a());
        setFocusable(true);
        obtainStyledAttributes.recycle();
        this.f7741u4 = new b();
        String[] strArr = new String[12];
        Arrays.fill(strArr, BuildConfig.FLAVOR);
        N(strArr, 0);
        this.f7745y4 = resources.getDimensionPixelSize(b5.d.f5480y);
        this.f7746z4 = resources.getDimensionPixelSize(b5.d.f5481z);
        this.A4 = resources.getDimensionPixelSize(b5.d.n_res_0x7f060172);
    }

    private void K() {
        RectF d10 = this.f7737q4.d();
        for (int i10 = 0; i10 < this.f7740t4.size(); i10++) {
            TextView textView = this.f7740t4.get(i10);
            if (textView != null) {
                textView.getDrawingRect(this.f7738r4);
                offsetDescendantRectToMyCoords(textView, this.f7738r4);
                textView.setSelected(d10.contains(this.f7738r4.centerX(), this.f7738r4.centerY()));
                textView.getPaint().setShader(L(d10, this.f7738r4, textView));
                textView.invalidate();
            }
        }
    }

    private RadialGradient L(RectF rectF, Rect rect, TextView textView) {
        this.f7739s4.set(rect);
        this.f7739s4.offset(textView.getPaddingLeft(), textView.getPaddingTop());
        if (!RectF.intersects(rectF, this.f7739s4)) {
            return null;
        }
        return new RadialGradient(rectF.centerX() - this.f7739s4.left, rectF.centerY() - this.f7739s4.top, rectF.width() * 0.5f, this.f7742v4, this.f7743w4, Shader.TileMode.CLAMP);
    }

    private static float M(float f10, float f11, float f12) {
        return Math.max(Math.max(f10, f11), f12);
    }

    private void O(int i10) {
        LayoutInflater from = LayoutInflater.from(getContext());
        int size = this.f7740t4.size();
        for (int i11 = 0; i11 < Math.max(this.B4.length, size); i11++) {
            TextView textView = this.f7740t4.get(i11);
            if (i11 >= this.B4.length) {
                removeView(textView);
                this.f7740t4.remove(i11);
            } else {
                if (textView == null) {
                    textView = (TextView) from.inflate(h.f_res_0x7f0c0049, (ViewGroup) this, false);
                    this.f7740t4.put(i11, textView);
                    addView(textView);
                }
                textView.setVisibility(0);
                textView.setText(this.B4[i11]);
                textView.setTag(f.o_res_0x7f090174, Integer.valueOf(i11));
                y.o0(textView, this.f7741u4);
                textView.setTextColor(this.D4);
                if (i10 != 0) {
                    textView.setContentDescription(getResources().getString(i10, this.B4[i11]));
                }
            }
        }
    }

    @Override // com.google.android.material.timepicker.b
    public void D(int i10) {
        if (i10 != C()) {
            super.D(i10);
            this.f7737q4.j(C());
        }
    }

    public void N(String[] strArr, int i10) {
        this.B4 = strArr;
        O(i10);
    }

    @Override // com.google.android.material.timepicker.ClockHandView.d
    public void a(float f10, boolean z10) {
        if (Math.abs(this.C4 - f10) > 0.001f) {
            this.C4 = f10;
            K();
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        d.y0(accessibilityNodeInfo).Z(d.b.a(1, this.B4.length, false, 1));
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        K();
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        DisplayMetrics displayMetrics = getResources().getDisplayMetrics();
        int M = (int) (this.A4 / M(this.f7745y4 / displayMetrics.heightPixels, this.f7746z4 / displayMetrics.widthPixels, 1.0f));
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(M, 1073741824);
        setMeasuredDimension(M, M);
        super.onMeasure(makeMeasureSpec, makeMeasureSpec);
    }
}
