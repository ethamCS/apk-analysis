package androidx.camera.camera2.internal;

import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.util.Size;
import android.view.Display;
/* loaded from: classes.dex */
public class v1 {

    /* renamed from: d */
    private static final Size f2033d = new Size(1920, 1080);

    /* renamed from: e */
    private static final Object f2034e = new Object();

    /* renamed from: f */
    private static volatile v1 f2035f;

    /* renamed from: a */
    private final DisplayManager f2036a;

    /* renamed from: b */
    private volatile Size f2037b = null;

    /* renamed from: c */
    private final u.j f2038c = new u.j();

    private v1(Context context) {
        this.f2036a = (DisplayManager) context.getSystemService("display");
    }

    private Size a() {
        Point point = new Point();
        c().getRealSize(point);
        Size size = point.x > point.y ? new Size(point.x, point.y) : new Size(point.y, point.x);
        int width = size.getWidth() * size.getHeight();
        Size size2 = f2033d;
        if (width > size2.getWidth() * size2.getHeight()) {
            size = size2;
        }
        return this.f2038c.a(size);
    }

    public static v1 b(Context context) {
        if (f2035f == null) {
            synchronized (f2034e) {
                if (f2035f == null) {
                    f2035f = new v1(context);
                }
            }
        }
        return f2035f;
    }

    public Display c() {
        Display[] displays = this.f2036a.getDisplays();
        if (displays.length == 1) {
            return displays[0];
        }
        Display display = null;
        int i10 = -1;
        for (Display display2 : displays) {
            if (display2.getState() != 1) {
                Point point = new Point();
                display2.getRealSize(point);
                int i11 = point.x;
                int i12 = point.y;
                if (i11 * i12 > i10) {
                    display = display2;
                    i10 = i11 * i12;
                }
            }
        }
        if (display == null) {
            throw new IllegalArgumentException("No display can be found from the input display manager!");
        }
        return display;
    }

    public Size d() {
        if (this.f2037b != null) {
            return this.f2037b;
        }
        this.f2037b = a();
        return this.f2037b;
    }

    public void e() {
        this.f2037b = a();
    }
}
