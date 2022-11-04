package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.y;
import b5.h;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class TimePickerView extends ConstraintLayout {

    /* renamed from: n4 */
    private final Chip f7762n4;

    /* renamed from: o4 */
    private final Chip f7763o4;

    /* renamed from: p4 */
    private final ClockHandView f7764p4;

    /* renamed from: q4 */
    private final ClockFaceView f7765q4;

    /* renamed from: r4 */
    private final MaterialButtonToggleGroup f7766r4;

    /* renamed from: s4 */
    private final View.OnClickListener f7767s4;

    /* renamed from: t4 */
    private f f7768t4;

    /* renamed from: u4 */
    private g f7769u4;

    /* renamed from: v4 */
    private e f7770v4;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements View.OnClickListener {
        a() {
            TimePickerView.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TimePickerView.this.f7769u4 != null) {
                TimePickerView.this.f7769u4.a(((Integer) view.getTag(b5.f.I_res_0x7f090221)).intValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements MaterialButtonToggleGroup.d {
        b() {
            TimePickerView.this = r1;
        }

        @Override // com.google.android.material.button.MaterialButtonToggleGroup.d
        public void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i10, boolean z10) {
            int i11 = i10 == b5.f.j_res_0x7f090166 ? 1 : 0;
            if (TimePickerView.this.f7768t4 == null || !z10) {
                return;
            }
            TimePickerView.this.f7768t4.a(i11);
        }
    }

    /* loaded from: classes.dex */
    public class c extends GestureDetector.SimpleOnGestureListener {
        c() {
            TimePickerView.this = r1;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent motionEvent) {
            e eVar = TimePickerView.this.f7770v4;
            if (eVar != null) {
                eVar.a();
                return true;
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    public class d implements View.OnTouchListener {

        /* renamed from: c */
        final /* synthetic */ GestureDetector f7774c;

        d(GestureDetector gestureDetector) {
            TimePickerView.this = r1;
            this.f7774c = gestureDetector;
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            if (((Checkable) view).isChecked()) {
                return this.f7774c.onTouchEvent(motionEvent);
            }
            return false;
        }
    }

    /* loaded from: classes.dex */
    interface e {
        void a();
    }

    /* loaded from: classes.dex */
    interface f {
        void a(int i10);
    }

    /* loaded from: classes.dex */
    interface g {
        void a(int i10);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f7767s4 = new a();
        LayoutInflater.from(context).inflate(h.k_res_0x7f0c004f, this);
        this.f7765q4 = (ClockFaceView) findViewById(b5.f.h_res_0x7f090163);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(b5.f.k_res_0x7f090167);
        this.f7766r4 = materialButtonToggleGroup;
        materialButtonToggleGroup.b(new b());
        this.f7762n4 = (Chip) findViewById(b5.f.n_res_0x7f09016c);
        this.f7763o4 = (Chip) findViewById(b5.f.l_res_0x7f090169);
        this.f7764p4 = (ClockHandView) findViewById(b5.f.i_res_0x7f090164);
        F();
        E();
    }

    private void E() {
        Chip chip = this.f7762n4;
        int i10 = b5.f.I_res_0x7f090221;
        chip.setTag(i10, 12);
        this.f7763o4.setTag(i10, 10);
        this.f7762n4.setOnClickListener(this.f7767s4);
        this.f7763o4.setOnClickListener(this.f7767s4);
        this.f7762n4.setAccessibilityClassName("android.view.View");
        this.f7763o4.setAccessibilityClassName("android.view.View");
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void F() {
        d dVar = new d(new GestureDetector(getContext(), new c()));
        this.f7762n4.setOnTouchListener(dVar);
        this.f7763o4.setOnTouchListener(dVar);
    }

    private void G() {
        if (this.f7766r4.getVisibility() == 0) {
            androidx.constraintlayout.widget.d dVar = new androidx.constraintlayout.widget.d();
            dVar.g(this);
            int i10 = 1;
            if (y.B(this) == 0) {
                i10 = 2;
            }
            dVar.e(b5.f.g_res_0x7f090162, i10);
            dVar.c(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        G();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            G();
        }
    }
}
