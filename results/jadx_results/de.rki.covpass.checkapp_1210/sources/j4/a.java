package j4;

import android.annotation.SuppressLint;
import android.graphics.PointF;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a */
    private final PointF f13973a;

    /* renamed from: b */
    private final PointF f13974b;

    /* renamed from: c */
    private final PointF f13975c;

    public a() {
        this.f13973a = new PointF();
        this.f13974b = new PointF();
        this.f13975c = new PointF();
    }

    public a(PointF pointF, PointF pointF2, PointF pointF3) {
        this.f13973a = pointF;
        this.f13974b = pointF2;
        this.f13975c = pointF3;
    }

    public PointF a() {
        return this.f13973a;
    }

    public PointF b() {
        return this.f13974b;
    }

    public PointF c() {
        return this.f13975c;
    }

    public void d(float f10, float f11) {
        this.f13973a.set(f10, f11);
    }

    public void e(float f10, float f11) {
        this.f13974b.set(f10, f11);
    }

    public void f(float f10, float f11) {
        this.f13975c.set(f10, f11);
    }

    @SuppressLint({"DefaultLocale"})
    public String toString() {
        return String.format("v=%.2f,%.2f cp1=%.2f,%.2f cp2=%.2f,%.2f", Float.valueOf(this.f13975c.x), Float.valueOf(this.f13975c.y), Float.valueOf(this.f13973a.x), Float.valueOf(this.f13973a.y), Float.valueOf(this.f13974b.x), Float.valueOf(this.f13974b.y));
    }
}
