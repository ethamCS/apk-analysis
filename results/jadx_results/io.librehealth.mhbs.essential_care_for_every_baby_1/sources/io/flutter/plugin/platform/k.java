package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewTreeObserver;
import io.flutter.plugin.platform.SingleViewPresentation;
import io.flutter.view.e;
@TargetApi(20)
/* loaded from: classes.dex */
public class k {

    /* renamed from: a */
    private final Context f1205a;

    /* renamed from: b */
    private final c f1206b;

    /* renamed from: c */
    private final int f1207c;

    /* renamed from: d */
    private final e.a f1208d;

    /* renamed from: e */
    private final View.OnFocusChangeListener f1209e;
    private VirtualDisplay f;
    SingleViewPresentation g;
    private Surface h;

    /* loaded from: classes.dex */
    public class a implements View.OnAttachStateChangeListener {

        /* renamed from: a */
        final /* synthetic */ View f1210a;

        /* renamed from: b */
        final /* synthetic */ Runnable f1211b;

        /* renamed from: io.flutter.plugin.platform.k$a$a */
        /* loaded from: classes.dex */
        class RunnableC0059a implements Runnable {
            RunnableC0059a() {
                a.this = r1;
            }

            @Override // java.lang.Runnable
            public void run() {
                a aVar = a.this;
                aVar.f1210a.postDelayed(aVar.f1211b, 128L);
            }
        }

        a(k kVar, View view, Runnable runnable) {
            this.f1210a = view;
            this.f1211b = runnable;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b.a(this.f1210a, new RunnableC0059a());
            this.f1210a.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(16)
    /* loaded from: classes.dex */
    public static class b implements ViewTreeObserver.OnDrawListener {

        /* renamed from: a */
        final View f1213a;

        /* renamed from: b */
        Runnable f1214b;

        /* loaded from: classes.dex */
        class a implements Runnable {
            a() {
                b.this = r1;
            }

            @Override // java.lang.Runnable
            public void run() {
                b.this.f1213a.getViewTreeObserver().removeOnDrawListener(b.this);
            }
        }

        b(View view, Runnable runnable) {
            this.f1213a = view;
            this.f1214b = runnable;
        }

        static void a(View view, Runnable runnable) {
            view.getViewTreeObserver().addOnDrawListener(new b(view, runnable));
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.f1214b;
            if (runnable == null) {
                return;
            }
            runnable.run();
            this.f1214b = null;
            this.f1213a.post(new a());
        }
    }

    private k(Context context, c cVar, VirtualDisplay virtualDisplay, f fVar, Surface surface, e.a aVar, View.OnFocusChangeListener onFocusChangeListener, int i, Object obj) {
        this.f1205a = context;
        this.f1206b = cVar;
        this.f1208d = aVar;
        this.f1209e = onFocusChangeListener;
        this.h = surface;
        this.f = virtualDisplay;
        this.f1207c = context.getResources().getDisplayMetrics().densityDpi;
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(context, this.f.getDisplay(), fVar, cVar, i, obj, onFocusChangeListener);
        this.g = singleViewPresentation;
        singleViewPresentation.show();
    }

    public static k a(Context context, c cVar, f fVar, e.a aVar, int i, int i2, int i3, Object obj, View.OnFocusChangeListener onFocusChangeListener) {
        aVar.c().setDefaultBufferSize(i, i2);
        Surface surface = new Surface(aVar.c());
        VirtualDisplay createVirtualDisplay = ((DisplayManager) context.getSystemService("display")).createVirtualDisplay("flutter-vd", i, i2, context.getResources().getDisplayMetrics().densityDpi, surface, 0);
        if (createVirtualDisplay == null) {
            return null;
        }
        return new k(context, cVar, createVirtualDisplay, fVar, surface, aVar, onFocusChangeListener, i3, obj);
    }

    public void b(MotionEvent motionEvent) {
        SingleViewPresentation singleViewPresentation = this.g;
        if (singleViewPresentation == null) {
            return;
        }
        singleViewPresentation.dispatchTouchEvent(motionEvent);
    }

    public void c() {
        e view = this.g.getView();
        this.g.cancel();
        this.g.detachState();
        view.c();
        this.f.release();
        this.f1208d.a();
    }

    public View d() {
        SingleViewPresentation singleViewPresentation = this.g;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().f();
    }

    public void e(View view) {
        SingleViewPresentation singleViewPresentation = this.g;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.g.getView().d(view);
    }

    public void f() {
        SingleViewPresentation singleViewPresentation = this.g;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.g.getView().e();
    }

    public void g() {
        SingleViewPresentation singleViewPresentation = this.g;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.g.getView().b();
    }

    public void h() {
        SingleViewPresentation singleViewPresentation = this.g;
        if (singleViewPresentation == null || singleViewPresentation.getView() == null) {
            return;
        }
        this.g.getView().a();
    }

    public void i(int i, int i2, Runnable runnable) {
        boolean isFocused = d().isFocused();
        SingleViewPresentation.e detachState = this.g.detachState();
        this.f.setSurface(null);
        this.f.release();
        this.f1208d.c().setDefaultBufferSize(i, i2);
        this.f = ((DisplayManager) this.f1205a.getSystemService("display")).createVirtualDisplay("flutter-vd", i, i2, this.f1207c, this.h, 0);
        View d2 = d();
        d2.addOnAttachStateChangeListener(new a(this, d2, runnable));
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(this.f1205a, this.f.getDisplay(), this.f1206b, detachState, this.f1209e, isFocused);
        singleViewPresentation.show();
        this.g.cancel();
        this.g = singleViewPresentation;
    }
}
