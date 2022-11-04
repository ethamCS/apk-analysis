package b.a.a.a.m;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
/* loaded from: classes.dex */
public class i {

    /* renamed from: a */
    private long f1221a;

    /* renamed from: b */
    private long f1222b;

    /* renamed from: c */
    private TimeInterpolator f1223c;
    private int d;
    private int e;

    public i(long j, long j2) {
        this.f1221a = 0L;
        this.f1222b = 300L;
        this.f1223c = null;
        this.d = 0;
        this.e = 1;
        this.f1221a = j;
        this.f1222b = j2;
    }

    public i(long j, long j2, TimeInterpolator timeInterpolator) {
        this.f1221a = 0L;
        this.f1222b = 300L;
        this.f1223c = null;
        this.d = 0;
        this.e = 1;
        this.f1221a = j;
        this.f1222b = j2;
        this.f1223c = timeInterpolator;
    }

    public static i a(ValueAnimator valueAnimator) {
        i iVar = new i(valueAnimator.getStartDelay(), valueAnimator.getDuration(), b(valueAnimator));
        iVar.d = valueAnimator.getRepeatCount();
        iVar.e = valueAnimator.getRepeatMode();
        return iVar;
    }

    private static TimeInterpolator b(ValueAnimator valueAnimator) {
        TimeInterpolator interpolator = valueAnimator.getInterpolator();
        return ((interpolator instanceof AccelerateDecelerateInterpolator) || interpolator == null) ? a.f1209b : interpolator instanceof AccelerateInterpolator ? a.f1210c : interpolator instanceof DecelerateInterpolator ? a.d : interpolator;
    }

    public long a() {
        return this.f1221a;
    }

    public void a(Animator animator) {
        animator.setStartDelay(a());
        animator.setDuration(b());
        animator.setInterpolator(c());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(d());
            valueAnimator.setRepeatMode(e());
        }
    }

    public long b() {
        return this.f1222b;
    }

    public TimeInterpolator c() {
        TimeInterpolator timeInterpolator = this.f1223c;
        return timeInterpolator != null ? timeInterpolator : a.f1209b;
    }

    public int d() {
        return this.d;
    }

    public int e() {
        return this.e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (a() != iVar.a() || b() != iVar.b() || d() != iVar.d() || e() != iVar.e()) {
            return false;
        }
        return c().getClass().equals(iVar.c().getClass());
    }

    public int hashCode() {
        return (((((((((int) (a() ^ (a() >>> 32))) * 31) + ((int) (b() ^ (b() >>> 32)))) * 31) + c().getClass().hashCode()) * 31) + d()) * 31) + e();
    }

    public String toString() {
        return '\n' + i.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " delay: " + a() + " duration: " + b() + " interpolator: " + c().getClass() + " repeatCount: " + d() + " repeatMode: " + e() + "}\n";
    }
}
