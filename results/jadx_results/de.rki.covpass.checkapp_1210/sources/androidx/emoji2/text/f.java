package androidx.emoji2.text;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
/* loaded from: classes.dex */
public class f {

    /* renamed from: d */
    private static final ThreadLocal<x0.a> f3852d = new ThreadLocal<>();

    /* renamed from: a */
    private final int f3853a;

    /* renamed from: b */
    private final l f3854b;

    /* renamed from: c */
    private volatile int f3855c = 0;

    public f(l lVar, int i10) {
        this.f3854b = lVar;
        this.f3853a = i10;
    }

    private x0.a g() {
        ThreadLocal<x0.a> threadLocal = f3852d;
        x0.a aVar = threadLocal.get();
        if (aVar == null) {
            aVar = new x0.a();
            threadLocal.set(aVar);
        }
        this.f3854b.d().j(aVar, this.f3853a);
        return aVar;
    }

    public void a(Canvas canvas, float f10, float f11, Paint paint) {
        Typeface g10 = this.f3854b.g();
        Typeface typeface = paint.getTypeface();
        paint.setTypeface(g10);
        canvas.drawText(this.f3854b.c(), this.f3853a * 2, 2, f10, f11, paint);
        paint.setTypeface(typeface);
    }

    public int b(int i10) {
        return g().h(i10);
    }

    public int c() {
        return g().i();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public int d() {
        return this.f3855c;
    }

    public short e() {
        return g().k();
    }

    public int f() {
        return g().l();
    }

    public short h() {
        return g().m();
    }

    public short i() {
        return g().n();
    }

    public boolean j() {
        return g().j();
    }

    @SuppressLint({"KotlinPropertyAccess"})
    public void k(boolean z10) {
        this.f3855c = z10 ? 2 : 1;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        sb2.append(Integer.toHexString(f()));
        sb2.append(", codepoints:");
        int c10 = c();
        for (int i10 = 0; i10 < c10; i10++) {
            sb2.append(Integer.toHexString(b(i10)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
