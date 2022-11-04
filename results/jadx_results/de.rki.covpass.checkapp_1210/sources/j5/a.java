package j5;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
/* loaded from: classes.dex */
public class a implements View.OnTouchListener {

    /* renamed from: c */
    private final Dialog f14012c;

    /* renamed from: d */
    private final int f14013d;

    /* renamed from: q */
    private final int f14014q;

    /* renamed from: x */
    private final int f14015x;

    public a(Dialog dialog, Rect rect) {
        this.f14012c = dialog;
        this.f14013d = rect.left;
        this.f14014q = rect.top;
        this.f14015x = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f14013d + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.f14014q + findViewById.getTop();
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i10 = this.f14015x;
            obtain.setLocation((-i10) - 1, (-i10) - 1);
        }
        view.performClick();
        return this.f14012c.onTouchEvent(obtain);
    }
}
