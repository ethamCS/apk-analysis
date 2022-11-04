package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a */
    private final ArrayList<b> f7395a = new ArrayList<>();

    /* renamed from: b */
    private b f7396b = null;

    /* renamed from: c */
    ValueAnimator f7397c = null;

    /* renamed from: d */
    private final Animator.AnimatorListener f7398d = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
            i.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            i iVar = i.this;
            if (iVar.f7397c == animator) {
                iVar.f7397c = null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        final int[] f7400a;

        /* renamed from: b */
        final ValueAnimator f7401b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.f7400a = iArr;
            this.f7401b = valueAnimator;
        }
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f7398d);
        this.f7395a.add(bVar);
    }
}
