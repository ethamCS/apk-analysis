package a.g.l;

import android.view.MotionEvent;
/* loaded from: classes.dex */
public final class h {
    public static boolean a(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
