package d.a.a.a.l;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
/* loaded from: classes.dex */
public class i {

    /* renamed from: a */
    private long f3655a;

    /* renamed from: b */
    private long f3656b;

    /* renamed from: c */
    private TimeInterpolator f3657c;

    /* renamed from: d */
    private int f3658d;

    /* renamed from: e */
    private int f3659e;

    public i(long j, long j2) {
        this.f3655a = 0L;
        this.f3656b = 300L;
        this.f3657c = null;
        this.f3658d = 0;
        this.f3659e = 1;
        this.f3655a = j;
        this.f3656b = j2;
    }

    public i(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f3655a = 0L;
        this.f3656b = 300L;
        this.f3657c = null;
        this.f3658d = 0;
        this.f3659e = 1;
        this.f3655a = j;
        this.f3656b = j2;
        this.f3657c = timeInterpolator;
    }

    public static i b(ValueAnimator valueAnimator) {
        i iVar = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        iVar.f3658d = valueAnimator.getRepeatCount();
        iVar.f3659e = valueAnimator.getRepeatMode();
        return iVar;
    }

    private static TimeInterpolator f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? a.f3641b : interpolator instanceof AccelerateInterpolator ? a.f3642c : interpolator instanceof DecelerateInterpolator ? a.f3643d : interpolator;
    }

    public void a(Animator animator) {
        animator.setStartDelay(c());
        animator.setDuration(d());
        animator.setInterpolator(e());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(g());
            valueAnimator.setRepeatMode(h());
        }
    }

    public long c() {
        return this.f3655a;
    }

    public long d() {
        return this.f3656b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f3657c;
        return timeInterpolator != null ? timeInterpolator : a.f3641b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (c() != iVar.c() || d() != iVar.d() || g() != iVar.g() || h() != iVar.h()) {
            return false;
        }
        return e().getClass().equals(iVar.e().getClass());
    }

    public int g() {
        return this.f3658d;
    }

    public int h() {
        return this.f3659e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    public String toString() {
        return '\n' + i.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }
}
