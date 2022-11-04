package d.a.a.a.r;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
/* loaded from: classes.dex */
public class a implements View.OnTouchListener {

    /* renamed from: b */
    private final Dialog f3677b;

    /* renamed from: c */
    private final int f3678c;

    /* renamed from: d */
    private final int f3679d;

    /* renamed from: e */
    private final int f3680e;

    public a(Dialog dialog, Rect rect) {
        this.f3677b = dialog;
        this.f3678c = rect.left;
        this.f3679d = rect.top;
        this.f3680e = ViewConfiguration.get(dialog.getContext()).getScaledWindowTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        View findViewById = view.findViewById(16908290);
        int left = this.f3678c + findViewById.getLeft();
        int width = findViewById.getWidth() + left;
        int top = this.f3679d + findViewById.getTop();
        if (new RectF(left, top, width, findViewById.getHeight() + top).contains(motionEvent.getX(), motionEvent.getY())) {
            return false;
        }
        MotionEvent obtain = MotionEvent.obtain(motionEvent);
        if (motionEvent.getAction() == 1) {
            obtain.setAction(4);
        }
        if (Build.VERSION.SDK_INT < 28) {
            obtain.setAction(0);
            int i = this.f3680e;
            obtain.setLocation((-i) - 1, (-i) - 1);
        }
        view.performClick();
        return this.f3677b.onTouchEvent(obtain);
    }
}
