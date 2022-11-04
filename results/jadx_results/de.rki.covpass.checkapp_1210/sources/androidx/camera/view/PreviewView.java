package androidx.camera.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.FrameLayout;
import androidx.camera.core.b3;
import androidx.camera.core.c2;
import androidx.camera.core.i3;
import androidx.camera.core.s1;
import androidx.camera.core.x1;
import androidx.camera.view.PreviewView;
import androidx.camera.view.k;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.d0;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import w.b0;
/* loaded from: classes.dex */
public final class PreviewView extends FrameLayout {

    /* renamed from: c4 */
    private static final d f2612c4 = d.PERFORMANCE;
    final AtomicReference<androidx.camera.view.e> U3;
    l V3;
    private final ScaleGestureDetector W3;
    b0 X3;
    private MotionEvent Y3;
    private final c Z3;

    /* renamed from: a4 */
    private final View.OnLayoutChangeListener f2613a4;

    /* renamed from: b4 */
    final c2.d f2614b4;

    /* renamed from: c */
    d f2615c;

    /* renamed from: d */
    k f2616d;

    /* renamed from: q */
    final androidx.camera.view.f f2617q;

    /* renamed from: x */
    boolean f2618x;

    /* renamed from: y */
    final d0<g> f2619y;

    /* loaded from: classes.dex */
    public class a implements c2.d {
        a() {
            PreviewView.this = r1;
        }

        public /* synthetic */ void e(b3 b3Var) {
            PreviewView.this.f2614b4.a(b3Var);
        }

        public /* synthetic */ void f(w.d0 d0Var, b3 b3Var, b3.g gVar) {
            PreviewView previewView;
            k kVar;
            s1.a("PreviewView", "Preview transformation info updated. " + gVar);
            PreviewView.this.f2617q.p(gVar, b3Var.l(), d0Var.i().a().intValue() == 0);
            if (gVar.c() == -1 || ((kVar = (previewView = PreviewView.this).f2616d) != null && (kVar instanceof q))) {
                PreviewView.this.f2618x = true;
            } else {
                previewView.f2618x = false;
            }
            PreviewView.this.i();
            PreviewView.this.e();
        }

        public /* synthetic */ void g(androidx.camera.view.e eVar, w.d0 d0Var) {
            if (PreviewView.this.U3.compareAndSet(eVar, null)) {
                eVar.m(g.IDLE);
            }
            eVar.g();
            d0Var.l().b(eVar);
        }

        @Override // androidx.camera.core.c2.d
        public void a(final b3 b3Var) {
            k kVar;
            if (!androidx.camera.core.impl.utils.l.b()) {
                androidx.core.content.a.g(PreviewView.this.getContext()).execute(new Runnable() { // from class: androidx.camera.view.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        PreviewView.a.this.e(b3Var);
                    }
                });
                return;
            }
            s1.a("PreviewView", "Surface requested by Preview.");
            final w.d0 j10 = b3Var.j();
            PreviewView.this.X3 = j10.i();
            b3Var.w(androidx.core.content.a.g(PreviewView.this.getContext()), new b3.h() { // from class: androidx.camera.view.h
                @Override // androidx.camera.core.b3.h
                public final void a(b3.g gVar) {
                    PreviewView.a.this.f(j10, b3Var, gVar);
                }
            });
            PreviewView previewView = PreviewView.this;
            if (PreviewView.f(b3Var, previewView.f2615c)) {
                PreviewView previewView2 = PreviewView.this;
                kVar = new x(previewView2, previewView2.f2617q);
            } else {
                PreviewView previewView3 = PreviewView.this;
                kVar = new q(previewView3, previewView3.f2617q);
            }
            previewView.f2616d = kVar;
            b0 i10 = j10.i();
            PreviewView previewView4 = PreviewView.this;
            final androidx.camera.view.e eVar = new androidx.camera.view.e(i10, previewView4.f2619y, previewView4.f2616d);
            PreviewView.this.U3.set(eVar);
            j10.l().a(androidx.core.content.a.g(PreviewView.this.getContext()), eVar);
            PreviewView.this.f2616d.g(b3Var, new k.a() { // from class: androidx.camera.view.i
                @Override // androidx.camera.view.k.a
                public final void a() {
                    PreviewView.a.this.g(eVar, j10);
                }
            });
        }
    }

    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f2621a;

        /* renamed from: b */
        static final /* synthetic */ int[] f2622b;

        static {
            int[] iArr = new int[d.values().length];
            f2622b = iArr;
            try {
                iArr[d.COMPATIBLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2622b[d.PERFORMANCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[f.values().length];
            f2621a = iArr2;
            try {
                iArr2[f.FILL_END.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2621a[f.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2621a[f.FILL_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2621a[f.FIT_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f2621a[f.FIT_CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f2621a[f.FIT_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    /* loaded from: classes.dex */
    public class c implements DisplayManager.DisplayListener {
        c() {
            PreviewView.this = r1;
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            Display display = PreviewView.this.getDisplay();
            if (display == null || display.getDisplayId() != i10) {
                return;
            }
            PreviewView.this.i();
            PreviewView.this.e();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }
    }

    /* loaded from: classes.dex */
    public enum d {
        PERFORMANCE(0),
        COMPATIBLE(1);
        

        /* renamed from: c */
        private final int f2627c;

        d(int i10) {
            this.f2627c = i10;
        }

        static d b(int i10) {
            d[] values;
            for (d dVar : values()) {
                if (dVar.f2627c == i10) {
                    return dVar;
                }
            }
            throw new IllegalArgumentException("Unknown implementation mode id " + i10);
        }

        int g() {
            return this.f2627c;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class e extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        e() {
            PreviewView.this = r1;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            Objects.requireNonNull(PreviewView.this);
            return true;
        }
    }

    /* loaded from: classes.dex */
    public enum f {
        FILL_START(0),
        FILL_CENTER(1),
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);
        

        /* renamed from: c */
        private final int f2633c;

        f(int i10) {
            this.f2633c = i10;
        }

        static f b(int i10) {
            f[] values;
            for (f fVar : values()) {
                if (fVar.f2633c == i10) {
                    return fVar;
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + i10);
        }

        int g() {
            return this.f2633c;
        }
    }

    /* loaded from: classes.dex */
    public enum g {
        IDLE,
        STREAMING
    }

    public PreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public PreviewView(Context context, AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        d dVar = f2612c4;
        this.f2615c = dVar;
        androidx.camera.view.f fVar = new androidx.camera.view.f();
        this.f2617q = fVar;
        this.f2618x = true;
        this.f2619y = new d0<>(g.IDLE);
        this.U3 = new AtomicReference<>();
        this.V3 = new l(fVar);
        this.Z3 = new c();
        this.f2613a4 = new View.OnLayoutChangeListener() { // from class: androidx.camera.view.g
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                PreviewView.this.d(view, i12, i13, i14, i15, i16, i17, i18, i19);
            }
        };
        this.f2614b4 = new a();
        androidx.camera.core.impl.utils.l.a();
        Resources.Theme theme = context.getTheme();
        int[] iArr = m.f2678a;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, i10, i11);
        androidx.core.view.y.m0(this, context, iArr, attributeSet, obtainStyledAttributes, i10, i11);
        try {
            setScaleType(f.b(obtainStyledAttributes.getInteger(m.f2680c, fVar.f().g())));
            setImplementationMode(d.b(obtainStyledAttributes.getInteger(m.f2679b, dVar.g())));
            obtainStyledAttributes.recycle();
            this.W3 = new ScaleGestureDetector(context, new e());
            if (getBackground() != null) {
                return;
            }
            setBackgroundColor(androidx.core.content.a.b(getContext(), 17170444));
        } catch (Throwable th2) {
            obtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private void b(boolean z10) {
        androidx.camera.core.impl.utils.l.a();
        getDisplay();
        getViewPort();
    }

    public /* synthetic */ void d(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        if ((i12 - i10 == i16 - i14 && i13 - i11 == i17 - i15) ? false : true) {
            e();
            b(true);
        }
    }

    static boolean f(b3 b3Var, d dVar) {
        int i10;
        boolean equals = b3Var.j().i().d().equals("androidx.camera.camera2.legacy");
        boolean z10 = (e0.a.a(e0.d.class) == null && e0.a.a(e0.c.class) == null) ? false : true;
        if (b3Var.m() || Build.VERSION.SDK_INT <= 24 || equals || z10 || (i10 = b.f2622b[dVar.ordinal()]) == 1) {
            return true;
        }
        if (i10 == 2) {
            return false;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + dVar);
    }

    private void g() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.registerDisplayListener(this.Z3, new Handler(Looper.getMainLooper()));
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getApplicationContext().getSystemService("display");
    }

    private int getViewPortScaleType() {
        switch (b.f2621a[getScaleType().ordinal()]) {
            case 1:
                return 2;
            case 2:
                return 1;
            case 3:
                return 0;
            case 4:
            case 5:
            case 6:
                return 3;
            default:
                throw new IllegalStateException("Unexpected scale type: " + getScaleType());
        }
    }

    private void h() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.Z3);
    }

    @SuppressLint({"WrongConstant"})
    public i3 c(int i10) {
        androidx.camera.core.impl.utils.l.a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return new i3.a(new Rational(getWidth(), getHeight()), i10).c(getViewPortScaleType()).b(getLayoutDirection()).a();
    }

    void e() {
        androidx.camera.core.impl.utils.l.a();
        k kVar = this.f2616d;
        if (kVar != null) {
            kVar.h();
        }
        this.V3.e(new Size(getWidth(), getHeight()), getLayoutDirection());
    }

    public Bitmap getBitmap() {
        androidx.camera.core.impl.utils.l.a();
        k kVar = this.f2616d;
        if (kVar == null) {
            return null;
        }
        return kVar.a();
    }

    public androidx.camera.view.a getController() {
        androidx.camera.core.impl.utils.l.a();
        return null;
    }

    public d getImplementationMode() {
        androidx.camera.core.impl.utils.l.a();
        return this.f2615c;
    }

    public x1 getMeteringPointFactory() {
        androidx.camera.core.impl.utils.l.a();
        return this.V3;
    }

    public f0.a getOutputTransform() {
        Matrix matrix;
        androidx.camera.core.impl.utils.l.a();
        try {
            matrix = this.f2617q.h(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrix = null;
        }
        Rect g10 = this.f2617q.g();
        if (matrix == null || g10 == null) {
            s1.a("PreviewView", "Transform info is not ready");
            return null;
        }
        matrix.preConcat(y.a(g10));
        if (this.f2616d instanceof x) {
            matrix.postConcat(getMatrix());
        } else {
            s1.k("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
        }
        return new f0.a(matrix, new Size(g10.width(), g10.height()));
    }

    public LiveData<g> getPreviewStreamState() {
        return this.f2619y;
    }

    public f getScaleType() {
        androidx.camera.core.impl.utils.l.a();
        return this.f2617q.f();
    }

    public c2.d getSurfaceProvider() {
        androidx.camera.core.impl.utils.l.a();
        return this.f2614b4;
    }

    public i3 getViewPort() {
        androidx.camera.core.impl.utils.l.a();
        if (getDisplay() == null) {
            return null;
        }
        return c(getDisplay().getRotation());
    }

    void i() {
        Display display;
        b0 b0Var;
        if (!this.f2618x || (display = getDisplay()) == null || (b0Var = this.X3) == null) {
            return;
        }
        this.f2617q.m(b0Var.e(display.getRotation()), display.getRotation());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        i();
        g();
        addOnLayoutChangeListener(this.f2613a4);
        k kVar = this.f2616d;
        if (kVar != null) {
            kVar.d();
        }
        b(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f2613a4);
        k kVar = this.f2616d;
        if (kVar != null) {
            kVar.e();
        }
        h();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean performClick() {
        this.Y3 = null;
        return super.performClick();
    }

    public void setController(androidx.camera.view.a aVar) {
        androidx.camera.core.impl.utils.l.a();
        b(false);
    }

    public void setImplementationMode(d dVar) {
        androidx.camera.core.impl.utils.l.a();
        this.f2615c = dVar;
    }

    public void setScaleType(f fVar) {
        androidx.camera.core.impl.utils.l.a();
        this.f2617q.o(fVar);
        e();
        b(false);
    }
}
