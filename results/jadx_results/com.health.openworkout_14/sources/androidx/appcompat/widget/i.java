package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.widget.CompoundButton;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a */
    private final CompoundButton f522a;

    /* renamed from: b */
    private ColorStateList f523b = null;

    /* renamed from: c */
    private PorterDuff.Mode f524c = null;

    /* renamed from: d */
    private boolean f525d = false;

    /* renamed from: e */
    private boolean f526e = false;

    /* renamed from: f */
    private boolean f527f;

    public i(CompoundButton compoundButton) {
        this.f522a = compoundButton;
    }

    void a() {
        Drawable a2 = androidx.core.widget.c.a(this.f522a);
        if (a2 != null) {
            if (!this.f525d && !this.f526e) {
                return;
            }
            Drawable mutate = androidx.core.graphics.drawable.a.r(a2).mutate();
            if (this.f525d) {
                androidx.core.graphics.drawable.a.o(mutate, this.f523b);
            }
            if (this.f526e) {
                androidx.core.graphics.drawable.a.p(mutate, this.f524c);
            }
            if (mutate.isStateful()) {
                mutate.setState(this.f522a.getDrawableState());
            }
            this.f522a.setButtonDrawable(mutate);
        }
    }

    public int b(int i) {
        Drawable a2;
        return (Build.VERSION.SDK_INT >= 17 || (a2 = androidx.core.widget.c.a(this.f522a)) == null) ? i : i + a2.getIntrinsicWidth();
    }

    public ColorStateList c() {
        return this.f523b;
    }

    public PorterDuff.Mode d() {
        return this.f524c;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d A[Catch: all -> 0x0084, TRY_ENTER, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0060 A[Catch: all -> 0x0084, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[Catch: all -> 0x0084, TRY_LEAVE, TryCatch #1 {all -> 0x0084, blocks: (B:3:0x001d, B:5:0x0025, B:7:0x002b, B:11:0x003d, B:13:0x0045, B:15:0x004b, B:16:0x0058, B:18:0x0060, B:19:0x0069, B:21:0x0071), top: B:30:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void e(android.util.AttributeSet r10, int r11) {
        /*
            r9 = this;
            android.widget.CompoundButton r0 = r9.f522a
            android.content.Context r0 = r0.getContext()
            int[] r3 = b.a.j.L0
            r8 = 0
            androidx.appcompat.widget.w0 r0 = androidx.appcompat.widget.w0.v(r0, r10, r3, r11, r8)
            android.widget.CompoundButton r1 = r9.f522a
            android.content.Context r2 = r1.getContext()
            android.content.res.TypedArray r5 = r0.r()
            r7 = 0
            r4 = r10
            r6 = r11
            b.g.l.t.g0(r1, r2, r3, r4, r5, r6, r7)
            int r10 = b.a.j.N0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.s(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L3a
            int r10 = r0.n(r10, r8)     // Catch: java.lang.Throwable -> L84
            if (r10 == 0) goto L3a
            android.widget.CompoundButton r11 = r9.f522a     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            android.content.Context r1 = r11.getContext()     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            android.graphics.drawable.Drawable r10 = b.a.k.a.a.d(r1, r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            r11.setButtonDrawable(r10)     // Catch: android.content.res.Resources.NotFoundException -> L3a java.lang.Throwable -> L84
            r10 = 1
            goto L3b
        L3a:
            r10 = 0
        L3b:
            if (r10 != 0) goto L58
            int r10 = b.a.j.M0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.s(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L58
            int r10 = r0.n(r10, r8)     // Catch: java.lang.Throwable -> L84
            if (r10 == 0) goto L58
            android.widget.CompoundButton r11 = r9.f522a     // Catch: java.lang.Throwable -> L84
            android.content.Context r1 = r11.getContext()     // Catch: java.lang.Throwable -> L84
            android.graphics.drawable.Drawable r10 = b.a.k.a.a.d(r1, r10)     // Catch: java.lang.Throwable -> L84
            r11.setButtonDrawable(r10)     // Catch: java.lang.Throwable -> L84
        L58:
            int r10 = b.a.j.O0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.s(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L69
            android.widget.CompoundButton r11 = r9.f522a     // Catch: java.lang.Throwable -> L84
            android.content.res.ColorStateList r10 = r0.c(r10)     // Catch: java.lang.Throwable -> L84
            androidx.core.widget.c.c(r11, r10)     // Catch: java.lang.Throwable -> L84
        L69:
            int r10 = b.a.j.P0     // Catch: java.lang.Throwable -> L84
            boolean r11 = r0.s(r10)     // Catch: java.lang.Throwable -> L84
            if (r11 == 0) goto L80
            android.widget.CompoundButton r11 = r9.f522a     // Catch: java.lang.Throwable -> L84
            r1 = -1
            int r10 = r0.k(r10, r1)     // Catch: java.lang.Throwable -> L84
            r1 = 0
            android.graphics.PorterDuff$Mode r10 = androidx.appcompat.widget.e0.e(r10, r1)     // Catch: java.lang.Throwable -> L84
            androidx.core.widget.c.d(r11, r10)     // Catch: java.lang.Throwable -> L84
        L80:
            r0.w()
            return
        L84:
            r10 = move-exception
            r0.w()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.i.e(android.util.AttributeSet, int):void");
    }

    public void f() {
        if (this.f527f) {
            this.f527f = false;
            return;
        }
        this.f527f = true;
        a();
    }

    public void g(ColorStateList colorStateList) {
        this.f523b = colorStateList;
        this.f525d = true;
        a();
    }

    public void h(PorterDuff.Mode mode) {
        this.f524c = mode;
        this.f526e = true;
        a();
    }
}
