package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a */
    private final ArrayList<b> f3209a = new ArrayList<>();

    /* renamed from: b */
    private b f3210b = null;

    /* renamed from: c */
    ValueAnimator f3211c = null;

    /* renamed from: d */
    private final Animator.AnimatorListener f3212d = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
            l.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            l lVar = l.this;
            if (lVar.f3211c == animator) {
                lVar.f3211c = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        final int[] f3214a;

        /* renamed from: b */
        final ValueAnimator f3215b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.f3214a = iArr;
            this.f3215b = valueAnimator;
        }
    }

    private void b() {
        ValueAnimator valueAnimator = this.f3211c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f3211c = null;
        }
    }

    private void e(b bVar) {
        ValueAnimator valueAnimator = bVar.f3215b;
        this.f3211c = valueAnimator;
        valueAnimator.start();
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.f3212d);
        this.f3209a.add(bVar);
    }

    public void c() {
        ValueAnimator valueAnimator = this.f3211c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f3211c = null;
        }
    }

    public void d(int[] iArr) {
        b bVar;
        int size = this.f3209a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bVar = null;
                break;
            }
            bVar = this.f3209a.get(i);
            if (StateSet.stateSetMatches(bVar.f3214a, iArr)) {
                break;
            }
            i++;
        }
        b bVar2 = this.f3210b;
        if (bVar == bVar2) {
            return;
        }
        if (bVar2 != null) {
            b();
        }
        this.f3210b = bVar;
        if (bVar == null) {
            return;
        }
        e(bVar);
    }
}
