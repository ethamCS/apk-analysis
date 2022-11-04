package c5;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
/* loaded from: classes.dex */
public class i {

    /* renamed from: a */
    private long f6282a;

    /* renamed from: b */
    private long f6283b;

    /* renamed from: c */
    private TimeInterpolator f6284c;

    /* renamed from: d */
    private int f6285d;

    /* renamed from: e */
    private int f6286e;

    public i(long j10, long j11) {
        this.f6284c = null;
        this.f6285d = 0;
        this.f6286e = 1;
        this.f6282a = j10;
        this.f6283b = j11;
    }

    public i(long j10, long j11, TimeInterpolator timeInterpolator) {
        this.f6285d = 0;
        this.f6286e = 1;
        this.f6282a = j10;
        this.f6283b = j11;
        this.f6284c = timeInterpolator;
    }

    public static i b(ValueAnimator valueAnimator) {
        i iVar = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), f(valueAnimator));
        iVar.f6285d = valueAnimator.getRepeatCount();
        iVar.f6286e = valueAnimator.getRepeatMode();
        return iVar;
    }

    private static TimeInterpolator f(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? a.f6268b : interpolator instanceof AccelerateInterpolator ? a.f6269c : interpolator instanceof DecelerateInterpolator ? a.f6270d : interpolator;
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
        return this.f6282a;
    }

    public long d() {
        return this.f6283b;
    }

    public TimeInterpolator e() {
        TimeInterpolator timeInterpolator = this.f6284c;
        return timeInterpolator != null ? timeInterpolator : a.f6268b;
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
        return this.f6285d;
    }

    public int h() {
        return this.f6286e;
    }

    public int hashCode() {
        return (((((((((int) (c() ^ (c() >>> 32))) * 31) + ((int) (d() ^ (d() >>> 32)))) * 31) + e().getClass().hashCode()) * 31) + g()) * 31) + h();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + c() + " duration: " + d() + " interpolator: " + e().getClass() + " repeatCount: " + g() + " repeatMode: " + h() + "}\n";
    }
}
