package com.google.android.material.textfield;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
/* loaded from: classes.dex */
class c extends t5.g {

    /* renamed from: o4 */
    private final Paint f7649o4;

    /* renamed from: p4 */
    private final RectF f7650p4;

    c() {
        this(null);
    }

    public c(t5.k kVar) {
        super(kVar == null ? new t5.k() : kVar);
        this.f7649o4 = new Paint(1);
        q0();
        this.f7650p4 = new RectF();
    }

    private void q0() {
        this.f7649o4.setStyle(Paint.Style.FILL_AND_STROKE);
        this.f7649o4.setColor(-1);
        this.f7649o4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public boolean m0() {
        return !this.f7650p4.isEmpty();
    }

    public void n0() {
        o0(0.0f, 0.0f, 0.0f, 0.0f);
    }

    void o0(float f10, float f11, float f12, float f13) {
        RectF rectF = this.f7650p4;
        if (f10 == rectF.left && f11 == rectF.top && f12 == rectF.right && f13 == rectF.bottom) {
            return;
        }
        rectF.set(f10, f11, f12, f13);
        invalidateSelf();
    }

    public void p0(RectF rectF) {
        o0(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // t5.g
    public void r(Canvas canvas) {
        if (this.f7650p4.isEmpty()) {
            super.r(canvas);
            return;
        }
        canvas.save();
        if (Build.VERSION.SDK_INT >= 26) {
            canvas.clipOutRect(this.f7650p4);
        } else {
            canvas.clipRect(this.f7650p4, Region.Op.DIFFERENCE);
        }
        super.r(canvas);
        canvas.restore();
    }
}
