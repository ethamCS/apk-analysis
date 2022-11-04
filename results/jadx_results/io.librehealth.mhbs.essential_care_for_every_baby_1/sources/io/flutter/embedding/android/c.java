package io.flutter.embedding.android;

import android.animation.Animator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
/* loaded from: classes.dex */
public final class c implements o {

    /* renamed from: a */
    private final Drawable f861a;

    /* renamed from: b */
    private final ImageView.ScaleType f862b;

    /* renamed from: c */
    private final long f863c;

    /* renamed from: d */
    private b f864d;

    /* loaded from: classes.dex */
    class a implements Animator.AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ Runnable f865a;

        a(c cVar, Runnable runnable) {
            this.f865a = runnable;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f865a.run();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f865a.run();
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* loaded from: classes.dex */
    public static class b extends ImageView {
        public b(Context context) {
            this(context, null, 0);
        }

        public b(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
        }

        public void a(Drawable drawable, ImageView.ScaleType scaleType) {
            setScaleType(scaleType);
            setImageDrawable(drawable);
        }

        public void setSplashDrawable(Drawable drawable) {
            a(drawable, ImageView.ScaleType.FIT_XY);
        }
    }

    public c(Drawable drawable) {
        this(drawable, ImageView.ScaleType.FIT_XY, 500L);
    }

    public c(Drawable drawable, ImageView.ScaleType scaleType, long j) {
        this.f861a = drawable;
        this.f862b = scaleType;
        this.f863c = j;
    }

    @Override // io.flutter.embedding.android.o
    public void a(Runnable runnable) {
        b bVar = this.f864d;
        if (bVar == null) {
            runnable.run();
        } else {
            bVar.animate().alpha(0.0f).setDuration(this.f863c).setListener(new a(this, runnable));
        }
    }

    @Override // io.flutter.embedding.android.o
    public /* synthetic */ boolean b() {
        return n.a(this);
    }

    @Override // io.flutter.embedding.android.o
    public View c(Context context, Bundle bundle) {
        b bVar = new b(context);
        this.f864d = bVar;
        bVar.a(this.f861a, this.f862b);
        return this.f864d;
    }

    @Override // io.flutter.embedding.android.o
    public /* synthetic */ Bundle d() {
        return n.b(this);
    }
}
