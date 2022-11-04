package io.flutter.embedding.android;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import io.flutter.embedding.android.k;
/* loaded from: classes.dex */
public final class FlutterSplashView extends FrameLayout {
    private static String j = "FlutterSplashView";

    /* renamed from: a */
    private o f843a;

    /* renamed from: b */
    private k f844b;

    /* renamed from: c */
    private View f845c;

    /* renamed from: d */
    private Bundle f846d;

    /* renamed from: e */
    private String f847e;
    private String f;
    private final k.d g;
    private final io.flutter.embedding.engine.renderer.b h;
    private final Runnable i;

    @Keep
    /* loaded from: classes.dex */
    public static class SavedState extends View.BaseSavedState {
        public static Parcelable.Creator<SavedState> CREATOR = new a();
        private String previousCompletedSplashIsolate;
        private Bundle splashScreenState;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.previousCompletedSplashIsolate = parcel.readString();
            this.splashScreenState = parcel.readBundle(getClass().getClassLoader());
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.previousCompletedSplashIsolate);
            parcel.writeBundle(this.splashScreenState);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements k.d {
        a() {
            FlutterSplashView.this = r1;
        }

        @Override // io.flutter.embedding.android.k.d
        public void a(io.flutter.embedding.engine.a aVar) {
            FlutterSplashView.this.f844b.t(this);
            FlutterSplashView flutterSplashView = FlutterSplashView.this;
            flutterSplashView.g(flutterSplashView.f844b, FlutterSplashView.this.f843a);
        }

        @Override // io.flutter.embedding.android.k.d
        public void b() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements io.flutter.embedding.engine.renderer.b {
        b() {
            FlutterSplashView.this = r1;
        }

        @Override // io.flutter.embedding.engine.renderer.b
        public void e() {
            if (FlutterSplashView.this.f843a != null) {
                FlutterSplashView.this.k();
            }
        }

        @Override // io.flutter.embedding.engine.renderer.b
        public void f() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {
        c() {
            FlutterSplashView.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            FlutterSplashView flutterSplashView = FlutterSplashView.this;
            flutterSplashView.removeView(flutterSplashView.f845c);
            FlutterSplashView flutterSplashView2 = FlutterSplashView.this;
            flutterSplashView2.f = flutterSplashView2.f847e;
        }
    }

    public FlutterSplashView(Context context) {
        this(context, null, 0);
    }

    public FlutterSplashView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.g = new a();
        this.h = new b();
        this.i = new c();
        setSaveEnabled(true);
    }

    private boolean h() {
        k kVar = this.f844b;
        if (kVar != null) {
            if (!kVar.s()) {
                throw new IllegalStateException("Cannot determine if splash has completed when no FlutterEngine is attached to our FlutterView. This question depends on an isolate ID to differentiate Flutter experiences.");
            }
            return this.f844b.getAttachedFlutterEngine().h().g() != null && this.f844b.getAttachedFlutterEngine().h().g().equals(this.f);
        }
        throw new IllegalStateException("Cannot determine if splash has completed when no FlutterView is set.");
    }

    private boolean i() {
        k kVar = this.f844b;
        return kVar != null && kVar.s() && !this.f844b.q() && !h();
    }

    private boolean j() {
        o oVar;
        k kVar = this.f844b;
        return kVar != null && kVar.s() && (oVar = this.f843a) != null && oVar.b() && l();
    }

    public void k() {
        this.f847e = this.f844b.getAttachedFlutterEngine().h().g();
        String str = j;
        d.a.b.e(str, "Transitioning splash screen to a Flutter UI. Isolate: " + this.f847e);
        this.f843a.a(this.i);
    }

    private boolean l() {
        k kVar = this.f844b;
        if (kVar != null) {
            if (!kVar.s()) {
                throw new IllegalStateException("Cannot determine if previous splash transition was interrupted when no FlutterEngine is attached to our FlutterView. This question depends on an isolate ID to differentiate Flutter experiences.");
            }
            return this.f844b.q() && !h();
        }
        throw new IllegalStateException("Cannot determine if previous splash transition was interrupted when no FlutterView is set.");
    }

    public void g(k kVar, o oVar) {
        k kVar2 = this.f844b;
        if (kVar2 != null) {
            kVar2.u(this.h);
            removeView(this.f844b);
        }
        View view = this.f845c;
        if (view != null) {
            removeView(view);
        }
        this.f844b = kVar;
        addView(kVar);
        this.f843a = oVar;
        if (oVar != null) {
            if (i()) {
                d.a.b.e(j, "Showing splash screen UI.");
                View c2 = oVar.c(getContext(), this.f846d);
                this.f845c = c2;
                addView(c2);
                kVar.i(this.h);
            } else if (!j()) {
                if (kVar.s()) {
                    return;
                }
                d.a.b.e(j, "FlutterView is not yet attached to a FlutterEngine. Showing nothing until a FlutterEngine is attached.");
                kVar.h(this.g);
            } else {
                d.a.b.e(j, "Showing an immediate splash transition to Flutter due to previously interrupted transition.");
                View c3 = oVar.c(getContext(), this.f846d);
                this.f845c = c3;
                addView(c3);
                k();
            }
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f = savedState.previousCompletedSplashIsolate;
        this.f846d = savedState.splashScreenState;
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.previousCompletedSplashIsolate = this.f;
        o oVar = this.f843a;
        savedState.splashScreenState = oVar != null ? oVar.d() : null;
        return savedState;
    }
}
