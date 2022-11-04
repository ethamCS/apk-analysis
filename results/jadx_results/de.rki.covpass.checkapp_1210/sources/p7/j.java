package p7;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.view.SurfaceHolder;
/* loaded from: classes.dex */
public class j {

    /* renamed from: a */
    private SurfaceHolder f18981a;

    /* renamed from: b */
    private SurfaceTexture f18982b;

    public j(SurfaceTexture surfaceTexture) {
        if (surfaceTexture != null) {
            this.f18982b = surfaceTexture;
            return;
        }
        throw new IllegalArgumentException("surfaceTexture may not be null");
    }

    public j(SurfaceHolder surfaceHolder) {
        if (surfaceHolder != null) {
            this.f18981a = surfaceHolder;
            return;
        }
        throw new IllegalArgumentException("surfaceHolder may not be null");
    }

    public void a(Camera camera) {
        SurfaceHolder surfaceHolder = this.f18981a;
        if (surfaceHolder != null) {
            camera.setPreviewDisplay(surfaceHolder);
        } else {
            camera.setPreviewTexture(this.f18982b);
        }
    }
}
