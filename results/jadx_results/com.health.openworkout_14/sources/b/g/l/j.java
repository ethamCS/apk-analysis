package b.g.l;

import android.view.MotionEvent;
/* loaded from: classes.dex */
public final class j {
    public static boolean a(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }
}
