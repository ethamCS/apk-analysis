package com.google.android.material.internal;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.util.StateSet;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a */
    private final ArrayList<b> f1532a = new ArrayList<>();

    /* renamed from: b */
    private b f1533b = null;

    /* renamed from: c */
    ValueAnimator f1534c = null;
    private final Animator.AnimatorListener d = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends AnimatorListenerAdapter {
        a() {
            j.this = r1;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            j jVar = j.this;
            if (jVar.f1534c == animator) {
                jVar.f1534c = null;
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        final int[] f1536a;

        /* renamed from: b */
        final ValueAnimator f1537b;

        b(int[] iArr, ValueAnimator valueAnimator) {
            this.f1536a = iArr;
            this.f1537b = valueAnimator;
        }
    }

    private void a(b bVar) {
        ValueAnimator valueAnimator = bVar.f1537b;
        this.f1534c = valueAnimator;
        valueAnimator.start();
    }

    private void b() {
        ValueAnimator valueAnimator = this.f1534c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f1534c = null;
        }
    }

    public void a() {
        ValueAnimator valueAnimator = this.f1534c;
        if (valueAnimator != null) {
            valueAnimator.end();
            this.f1534c = null;
        }
    }

    public void a(int[] iArr) {
        b bVar;
        int size = this.f1532a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                bVar = null;
                break;
            }
            bVar = this.f1532a.get(i);
            if (StateSet.stateSetMatches(bVar.f1536a, iArr)) {
                break;
            }
            i++;
        }
        b bVar2 = this.f1533b;
        if (bVar == bVar2) {
            return;
        }
        if (bVar2 != null) {
            b();
        }
        this.f1533b = bVar;
        if (bVar == null) {
            return;
        }
        a(bVar);
    }

    public void a(int[] iArr, ValueAnimator valueAnimator) {
        b bVar = new b(iArr, valueAnimator);
        valueAnimator.addListener(this.d);
        this.f1532a.add(bVar);
    }
}
