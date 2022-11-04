package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.motion.widget.l;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.q;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
/* loaded from: classes.dex */
public class j extends ConstraintLayout implements q {

    /* renamed from: g5 */
    public static boolean f2784g5;
    float A4;
    private boolean B4;
    boolean C4;
    private d D4;
    int E4;
    private boolean F4;
    private androidx.constraintlayout.motion.widget.b G4;
    boolean H4;
    float I4;
    float J4;
    long K4;
    float L4;
    private boolean M4;
    private ArrayList<h> N4;
    private ArrayList<h> O4;
    private ArrayList<h> P4;
    private CopyOnWriteArrayList<d> Q4;
    private int R4;
    private float S4;
    boolean T4;
    protected boolean U4;
    float V4;
    private boolean W4;
    private c X4;
    private Runnable Y4;
    private int[] Z4;

    /* renamed from: a5 */
    int f2785a5;

    /* renamed from: b5 */
    private int f2786b5;

    /* renamed from: c5 */
    private boolean f2787c5;

    /* renamed from: d5 */
    e f2788d5;

    /* renamed from: e5 */
    private boolean f2789e5;

    /* renamed from: f5 */
    ArrayList<Integer> f2790f5;

    /* renamed from: n4 */
    Interpolator f2791n4;

    /* renamed from: o4 */
    Interpolator f2792o4;

    /* renamed from: p4 */
    float f2793p4;

    /* renamed from: q4 */
    private int f2794q4;

    /* renamed from: r4 */
    int f2795r4;

    /* renamed from: s4 */
    private int f2796s4;

    /* renamed from: t4 */
    private boolean f2797t4;

    /* renamed from: u4 */
    HashMap<View, g> f2798u4;

    /* renamed from: v4 */
    private long f2799v4;

    /* renamed from: w4 */
    private float f2800w4;

    /* renamed from: x4 */
    float f2801x4;

    /* renamed from: y4 */
    float f2802y4;

    /* renamed from: z4 */
    private long f2803z4;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
            j.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            j.this.X4.a();
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f2805a;

        static {
            int[] iArr = new int[e.values().length];
            f2805a = iArr;
            try {
                iArr[e.UNDEFINED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2805a[e.SETUP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2805a[e.MOVING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2805a[e.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class c {

        /* renamed from: a */
        float f2806a = Float.NaN;

        /* renamed from: b */
        float f2807b = Float.NaN;

        /* renamed from: c */
        int f2808c = -1;

        /* renamed from: d */
        int f2809d = -1;

        /* renamed from: e */
        final String f2810e = "motion.progress";

        /* renamed from: f */
        final String f2811f = "motion.velocity";

        /* renamed from: g */
        final String f2812g = "motion.StartState";

        /* renamed from: h */
        final String f2813h = "motion.EndState";

        c() {
            j.this = r1;
        }

        void a() {
            int i10 = this.f2808c;
            if (i10 != -1 || this.f2809d != -1) {
                if (i10 == -1) {
                    j.this.O(this.f2809d);
                } else {
                    int i11 = this.f2809d;
                    if (i11 == -1) {
                        j.this.L(i10, -1, -1);
                    } else {
                        j.this.M(i10, i11);
                    }
                }
                j.this.setState(e.SETUP);
            }
            if (Float.isNaN(this.f2807b)) {
                if (Float.isNaN(this.f2806a)) {
                    return;
                }
                j.this.setProgress(this.f2806a);
                return;
            }
            j.this.K(this.f2806a, this.f2807b);
            this.f2806a = Float.NaN;
            this.f2807b = Float.NaN;
            this.f2808c = -1;
            this.f2809d = -1;
        }

        public Bundle b() {
            Bundle bundle = new Bundle();
            bundle.putFloat("motion.progress", this.f2806a);
            bundle.putFloat("motion.velocity", this.f2807b);
            bundle.putInt("motion.StartState", this.f2808c);
            bundle.putInt("motion.EndState", this.f2809d);
            return bundle;
        }

        public void c() {
            this.f2809d = j.this.f2796s4;
            this.f2808c = j.this.f2794q4;
            this.f2807b = j.this.getVelocity();
            this.f2806a = j.this.getProgress();
        }

        public void d(int i10) {
            this.f2809d = i10;
        }

        public void e(float f10) {
            this.f2806a = f10;
        }

        public void f(int i10) {
            this.f2808c = i10;
        }

        public void g(Bundle bundle) {
            this.f2806a = bundle.getFloat("motion.progress");
            this.f2807b = bundle.getFloat("motion.velocity");
            this.f2808c = bundle.getInt("motion.StartState");
            this.f2809d = bundle.getInt("motion.EndState");
        }

        public void h(float f10) {
            this.f2807b = f10;
        }
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(j jVar, int i10, int i11, float f10);

        void b(j jVar, int i10, int i11);

        void c(j jVar, int i10);
    }

    /* loaded from: classes.dex */
    public enum e {
        UNDEFINED,
        SETUP,
        MOVING,
        FINISHED
    }

    private void G() {
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        if ((this.D4 != null || ((copyOnWriteArrayList = this.Q4) != null && !copyOnWriteArrayList.isEmpty())) && this.S4 != this.f2801x4) {
            if (this.R4 != -1) {
                d dVar = this.D4;
                if (dVar != null) {
                    dVar.b(this, this.f2794q4, this.f2796s4);
                }
                CopyOnWriteArrayList<d> copyOnWriteArrayList2 = this.Q4;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<d> it = copyOnWriteArrayList2.iterator();
                    while (it.hasNext()) {
                        it.next().b(this, this.f2794q4, this.f2796s4);
                    }
                }
                this.T4 = true;
            }
            this.R4 = -1;
            float f10 = this.f2801x4;
            this.S4 = f10;
            d dVar2 = this.D4;
            if (dVar2 != null) {
                dVar2.a(this, this.f2794q4, this.f2796s4, f10);
            }
            CopyOnWriteArrayList<d> copyOnWriteArrayList3 = this.Q4;
            if (copyOnWriteArrayList3 != null) {
                Iterator<d> it2 = copyOnWriteArrayList3.iterator();
                while (it2.hasNext()) {
                    it2.next().a(this, this.f2794q4, this.f2796s4, this.f2801x4);
                }
            }
            this.T4 = true;
        }
    }

    private void J() {
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        if (this.D4 != null || ((copyOnWriteArrayList = this.Q4) != null && !copyOnWriteArrayList.isEmpty())) {
            this.T4 = false;
            Iterator<Integer> it = this.f2790f5.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                d dVar = this.D4;
                if (dVar != null) {
                    dVar.c(this, next.intValue());
                }
                CopyOnWriteArrayList<d> copyOnWriteArrayList2 = this.Q4;
                if (copyOnWriteArrayList2 != null) {
                    Iterator<d> it2 = copyOnWriteArrayList2.iterator();
                    while (it2.hasNext()) {
                        it2.next().c(this, next.intValue());
                    }
                }
            }
            this.f2790f5.clear();
        }
    }

    void E(float f10) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:149:0x0211, code lost:
        if (r1 != r2) goto L151;
     */
    /* JADX WARN: Code restructure failed: missing block: B:150:0x0214, code lost:
        r6 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0215, code lost:
        r21.f2795r4 = r2;
        r7 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0221, code lost:
        if (r1 != r2) goto L151;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void F(boolean r22) {
        /*
            Method dump skipped, instructions count: 568
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.j.F(boolean):void");
    }

    protected void H() {
        int i10;
        CopyOnWriteArrayList<d> copyOnWriteArrayList;
        if ((this.D4 != null || ((copyOnWriteArrayList = this.Q4) != null && !copyOnWriteArrayList.isEmpty())) && this.R4 == -1) {
            this.R4 = this.f2795r4;
            if (!this.f2790f5.isEmpty()) {
                ArrayList<Integer> arrayList = this.f2790f5;
                i10 = arrayList.get(arrayList.size() - 1).intValue();
            } else {
                i10 = -1;
            }
            int i11 = this.f2795r4;
            if (i10 != i11 && i11 != -1) {
                this.f2790f5.add(Integer.valueOf(i11));
            }
        }
        J();
        Runnable runnable = this.Y4;
        if (runnable != null) {
            runnable.run();
        }
        int[] iArr = this.Z4;
        if (iArr == null || this.f2785a5 <= 0) {
            return;
        }
        O(iArr[0]);
        int[] iArr2 = this.Z4;
        System.arraycopy(iArr2, 1, iArr2, 0, iArr2.length - 1);
        this.f2785a5--;
    }

    void I() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
        if (r4 > 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002f, code lost:
        r0 = 1.0f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
        E(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0040, code lost:
        if (r3 > 0.5f) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void K(float r3, float r4) {
        /*
            r2 = this;
            boolean r0 = r2.isAttachedToWindow()
            if (r0 != 0) goto L1c
            androidx.constraintlayout.motion.widget.j$c r0 = r2.X4
            if (r0 != 0) goto L11
            androidx.constraintlayout.motion.widget.j$c r0 = new androidx.constraintlayout.motion.widget.j$c
            r0.<init>()
            r2.X4 = r0
        L11:
            androidx.constraintlayout.motion.widget.j$c r0 = r2.X4
            r0.e(r3)
            androidx.constraintlayout.motion.widget.j$c r3 = r2.X4
            r3.h(r4)
            return
        L1c:
            r2.setProgress(r3)
            androidx.constraintlayout.motion.widget.j$e r0 = androidx.constraintlayout.motion.widget.j.e.MOVING
            r2.setState(r0)
            r2.f2793p4 = r4
            r0 = 0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r1 = 1065353216(0x3f800000, float:1.0)
            if (r4 == 0) goto L34
            if (r4 <= 0) goto L30
        L2f:
            r0 = r1
        L30:
            r2.E(r0)
            goto L43
        L34:
            int r4 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r4 == 0) goto L43
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 == 0) goto L43
            r4 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L30
            goto L2f
        L43:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.j.K(float, float):void");
    }

    public void L(int i10, int i11, int i12) {
        setState(e.SETUP);
        this.f2795r4 = i10;
        this.f2794q4 = -1;
        this.f2796s4 = -1;
        androidx.constraintlayout.widget.c cVar = this.Z3;
        if (cVar != null) {
            cVar.d(i10, i11, i12);
        }
    }

    public void M(int i10, int i11) {
        if (!isAttachedToWindow()) {
            if (this.X4 == null) {
                this.X4 = new c();
            }
            this.X4.f(i10);
            this.X4.d(i11);
        }
    }

    public void N() {
        E(1.0f);
        this.Y4 = null;
    }

    public void O(int i10) {
        if (isAttachedToWindow()) {
            P(i10, -1, -1);
            return;
        }
        if (this.X4 == null) {
            this.X4 = new c();
        }
        this.X4.d(i10);
    }

    public void P(int i10, int i11, int i12) {
        Q(i10, i11, i12, -1);
    }

    public void Q(int i10, int i11, int i12, int i13) {
        int i14 = this.f2795r4;
        if (i14 == i10) {
            return;
        }
        if (this.f2794q4 == i10) {
            E(0.0f);
            if (i13 <= 0) {
                return;
            }
            this.f2800w4 = i13 / 1000.0f;
        } else if (this.f2796s4 == i10) {
            E(1.0f);
            if (i13 <= 0) {
                return;
            }
            this.f2800w4 = i13 / 1000.0f;
        } else {
            this.f2796s4 = i10;
            if (i14 != -1) {
                M(i14, i10);
                E(1.0f);
                this.f2802y4 = 0.0f;
                N();
                if (i13 <= 0) {
                    return;
                }
                this.f2800w4 = i13 / 1000.0f;
                return;
            }
            this.F4 = false;
            this.A4 = 1.0f;
            this.f2801x4 = 0.0f;
            this.f2802y4 = 0.0f;
            this.f2803z4 = getNanoTime();
            this.f2799v4 = getNanoTime();
            this.B4 = false;
            this.f2791n4 = null;
            if (i13 == -1) {
                throw null;
            }
            this.f2794q4 = -1;
            throw null;
        }
    }

    @Override // androidx.core.view.p
    public void b(View view, View view2, int i10, int i11) {
        this.K4 = getNanoTime();
        this.L4 = 0.0f;
        this.I4 = 0.0f;
        this.J4 = 0.0f;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        ArrayList<h> arrayList = this.P4;
        if (arrayList != null) {
            Iterator<h> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().w(canvas);
            }
        }
        F(false);
        super.dispatchDraw(canvas);
    }

    public int[] getConstraintSetIds() {
        return null;
    }

    public int getCurrentState() {
        return this.f2795r4;
    }

    public ArrayList<l.a> getDefinedTransitions() {
        return null;
    }

    public androidx.constraintlayout.motion.widget.b getDesignTool() {
        if (this.G4 == null) {
            this.G4 = new androidx.constraintlayout.motion.widget.b(this);
        }
        return this.G4;
    }

    public int getEndState() {
        return this.f2796s4;
    }

    protected long getNanoTime() {
        return System.nanoTime();
    }

    public float getProgress() {
        return this.f2802y4;
    }

    public l getScene() {
        return null;
    }

    public int getStartState() {
        return this.f2794q4;
    }

    public float getTargetPosition() {
        return this.A4;
    }

    public Bundle getTransitionState() {
        if (this.X4 == null) {
            this.X4 = new c();
        }
        this.X4.c();
        return this.X4.b();
    }

    public long getTransitionTimeMs() {
        return this.f2800w4 * 1000.0f;
    }

    public float getVelocity() {
        return this.f2793p4;
    }

    @Override // androidx.core.view.p
    public void i(View view, int i10) {
    }

    @Override // android.view.View
    public boolean isAttachedToWindow() {
        return super.isAttachedToWindow();
    }

    @Override // androidx.core.view.p
    public void j(View view, int i10, int i11, int[] iArr, int i12) {
    }

    @Override // androidx.core.view.q
    public void m(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        if (this.H4 || i10 != 0 || i11 != 0) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
        }
        this.H4 = false;
    }

    @Override // androidx.core.view.p
    public void n(View view, int i10, int i11, int i12, int i13, int i14) {
    }

    @Override // androidx.core.view.p
    public boolean o(View view, View view2, int i10, int i11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Display display = getDisplay();
        if (display != null) {
            this.f2786b5 = display.getRotation();
        }
        I();
        c cVar = this.X4;
        if (cVar != null) {
            if (this.f2787c5) {
                post(new a());
            } else {
                cVar.a();
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        this.W4 = true;
        try {
            super.onLayout(z10, i10, i11, i12, i13);
        } finally {
            this.W4 = false;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        if (view instanceof h) {
            h hVar = (h) view;
            if (this.Q4 == null) {
                this.Q4 = new CopyOnWriteArrayList<>();
            }
            this.Q4.add(hVar);
            if (hVar.v()) {
                if (this.N4 == null) {
                    this.N4 = new ArrayList<>();
                }
                this.N4.add(hVar);
            }
            if (hVar.u()) {
                if (this.O4 == null) {
                    this.O4 = new ArrayList<>();
                }
                this.O4.add(hVar);
            }
            if (!hVar.t()) {
                return;
            }
            if (this.P4 == null) {
                this.P4 = new ArrayList<>();
            }
            this.P4.add(hVar);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        ArrayList<h> arrayList = this.N4;
        if (arrayList != null) {
            arrayList.remove(view);
        }
        ArrayList<h> arrayList2 = this.O4;
        if (arrayList2 != null) {
            arrayList2.remove(view);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public void requestLayout() {
        if (!this.U4) {
            int i10 = this.f2795r4;
        }
        super.requestLayout();
    }

    public void setDebugMode(int i10) {
        this.E4 = i10;
        invalidate();
    }

    public void setDelayedApplicationOfInitialState(boolean z10) {
        this.f2787c5 = z10;
    }

    public void setInteractionEnabled(boolean z10) {
        this.f2797t4 = z10;
    }

    public void setInterpolatedProgress(float f10) {
        setProgress(f10);
    }

    public void setOnHide(float f10) {
        ArrayList<h> arrayList = this.O4;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.O4.get(i10).setProgress(f10);
            }
        }
    }

    public void setOnShow(float f10) {
        ArrayList<h> arrayList = this.N4;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.N4.get(i10).setProgress(f10);
            }
        }
    }

    public void setProgress(float f10) {
        e eVar;
        int i10 = (f10 > 0.0f ? 1 : (f10 == 0.0f ? 0 : -1));
        if (i10 < 0 || f10 > 1.0f) {
            Log.w("MotionLayout", "Warning! Progress is defined for values between 0.0 and 1.0 inclusive");
        }
        if (!isAttachedToWindow()) {
            if (this.X4 == null) {
                this.X4 = new c();
            }
            this.X4.e(f10);
            return;
        }
        if (i10 <= 0) {
            if (this.f2802y4 == 1.0f && this.f2795r4 == this.f2796s4) {
                setState(e.MOVING);
            }
            this.f2795r4 = this.f2794q4;
            if (this.f2802y4 != 0.0f) {
                return;
            }
        } else if (f10 < 1.0f) {
            this.f2795r4 = -1;
            eVar = e.MOVING;
            setState(eVar);
        } else {
            if (this.f2802y4 == 0.0f && this.f2795r4 == this.f2794q4) {
                setState(e.MOVING);
            }
            this.f2795r4 = this.f2796s4;
            if (this.f2802y4 != 1.0f) {
                return;
            }
        }
        eVar = e.FINISHED;
        setState(eVar);
    }

    public void setScene(l lVar) {
        r();
        throw null;
    }

    void setStartState(int i10) {
        if (isAttachedToWindow()) {
            this.f2795r4 = i10;
            return;
        }
        if (this.X4 == null) {
            this.X4 = new c();
        }
        this.X4.f(i10);
        this.X4.d(i10);
    }

    void setState(e eVar) {
        e eVar2 = e.FINISHED;
        if (eVar == eVar2 && this.f2795r4 == -1) {
            return;
        }
        e eVar3 = this.f2788d5;
        this.f2788d5 = eVar;
        e eVar4 = e.MOVING;
        if (eVar3 == eVar4 && eVar == eVar4) {
            G();
        }
        int i10 = b.f2805a[eVar3.ordinal()];
        if (i10 == 1 || i10 == 2) {
            if (eVar == eVar4) {
                G();
            }
            if (eVar != eVar2) {
                return;
            }
        } else if (i10 != 3 || eVar != eVar2) {
            return;
        }
        H();
    }

    public void setTransition(int i10) {
    }

    protected void setTransition(l.a aVar) {
        throw null;
    }

    public void setTransitionDuration(int i10) {
        Log.e("MotionLayout", "MotionScene not defined");
    }

    public void setTransitionListener(d dVar) {
        this.D4 = dVar;
    }

    public void setTransitionState(Bundle bundle) {
        if (this.X4 == null) {
            this.X4 = new c();
        }
        this.X4.g(bundle);
        if (isAttachedToWindow()) {
            this.X4.a();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    protected void t(int i10) {
        this.Z3 = null;
    }

    @Override // android.view.View
    public String toString() {
        Context context = getContext();
        return androidx.constraintlayout.motion.widget.a.a(context, this.f2794q4) + "->" + androidx.constraintlayout.motion.widget.a.a(context, this.f2796s4) + " (pos:" + this.f2802y4 + " Dpos/Dt:" + this.f2793p4;
    }
}
