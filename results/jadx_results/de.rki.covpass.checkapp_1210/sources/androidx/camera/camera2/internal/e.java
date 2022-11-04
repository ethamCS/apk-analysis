package androidx.camera.camera2.internal;

import android.graphics.Rect;
import android.hardware.camera2.CaptureResult;
import android.os.Build;
import androidx.camera.core.impl.utils.g;
/* loaded from: classes.dex */
public class e implements w.q {

    /* renamed from: a */
    private final w.j2 f1648a;

    /* renamed from: b */
    private final CaptureResult f1649b;

    public e(CaptureResult captureResult) {
        this(w.j2.a(), captureResult);
    }

    public e(w.j2 j2Var, CaptureResult captureResult) {
        this.f1648a = j2Var;
        this.f1649b = captureResult;
    }

    @Override // w.q
    public w.j2 a() {
        return this.f1648a;
    }

    @Override // w.q
    public void b(g.b bVar) {
        Integer num;
        w.p.a(this, bVar);
        Rect rect = (Rect) this.f1649b.get(CaptureResult.SCALER_CROP_REGION);
        if (rect != null) {
            bVar.j(rect.width()).i(rect.height());
        }
        Integer num2 = (Integer) this.f1649b.get(CaptureResult.JPEG_ORIENTATION);
        if (num2 != null) {
            bVar.m(num2.intValue());
        }
        Long l10 = (Long) this.f1649b.get(CaptureResult.SENSOR_EXPOSURE_TIME);
        if (l10 != null) {
            bVar.f(l10.longValue());
        }
        Float f10 = (Float) this.f1649b.get(CaptureResult.LENS_APERTURE);
        if (f10 != null) {
            bVar.l(f10.floatValue());
        }
        Integer num3 = (Integer) this.f1649b.get(CaptureResult.SENSOR_SENSITIVITY);
        if (num3 != null) {
            if (Build.VERSION.SDK_INT >= 24 && (num = (Integer) this.f1649b.get(CaptureResult.CONTROL_POST_RAW_SENSITIVITY_BOOST)) != null) {
                num3 = Integer.valueOf(num3.intValue() * ((int) (num.intValue() / 100.0f)));
            }
            bVar.k(num3.intValue());
        }
        Float f11 = (Float) this.f1649b.get(CaptureResult.LENS_FOCAL_LENGTH);
        if (f11 != null) {
            bVar.h(f11.floatValue());
        }
        Integer num4 = (Integer) this.f1649b.get(CaptureResult.CONTROL_AWB_MODE);
        if (num4 != null) {
            g.c cVar = g.c.AUTO;
            if (num4.intValue() == 0) {
                cVar = g.c.MANUAL;
            }
            bVar.n(cVar);
        }
    }

    @Override // w.q
    public long c() {
        Long l10 = (Long) this.f1649b.get(CaptureResult.SENSOR_TIMESTAMP);
        if (l10 == null) {
            return -1L;
        }
        return l10.longValue();
    }

    @Override // w.q
    public w.o d() {
        Integer num = (Integer) this.f1649b.get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return w.o.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0 || intValue == 1) {
            return w.o.NONE;
        }
        if (intValue == 2) {
            return w.o.READY;
        }
        if (intValue == 3 || intValue == 4) {
            return w.o.FIRED;
        }
        androidx.camera.core.s1.c("C2CameraCaptureResult", "Undefined flash state: " + num);
        return w.o.UNKNOWN;
    }

    @Override // w.q
    public CaptureResult e() {
        return this.f1649b;
    }

    public w.k f() {
        Integer num = (Integer) this.f1649b.get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return w.k.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return w.k.INACTIVE;
        }
        if (intValue != 1) {
            if (intValue == 2) {
                return w.k.CONVERGED;
            }
            if (intValue == 3) {
                return w.k.LOCKED;
            }
            if (intValue == 4) {
                return w.k.FLASH_REQUIRED;
            }
            if (intValue != 5) {
                androidx.camera.core.s1.c("C2CameraCaptureResult", "Undefined ae state: " + num);
                return w.k.UNKNOWN;
            }
        }
        return w.k.SEARCHING;
    }

    public w.l g() {
        Integer num = (Integer) this.f1649b.get(CaptureResult.CONTROL_AF_MODE);
        if (num == null) {
            return w.l.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue == 1 || intValue == 2) {
                return w.l.ON_MANUAL_AUTO;
            }
            if (intValue == 3 || intValue == 4) {
                return w.l.ON_CONTINUOUS_AUTO;
            }
            if (intValue != 5) {
                androidx.camera.core.s1.c("C2CameraCaptureResult", "Undefined af mode: " + num);
                return w.l.UNKNOWN;
            }
        }
        return w.l.OFF;
    }

    public w.m h() {
        Integer num = (Integer) this.f1649b.get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return w.m.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return w.m.INACTIVE;
            case 1:
            case 3:
                return w.m.SCANNING;
            case 2:
                return w.m.PASSIVE_FOCUSED;
            case 4:
                return w.m.LOCKED_FOCUSED;
            case 5:
                return w.m.LOCKED_NOT_FOCUSED;
            case 6:
                return w.m.PASSIVE_NOT_FOCUSED;
            default:
                androidx.camera.core.s1.c("C2CameraCaptureResult", "Undefined af state: " + num);
                return w.m.UNKNOWN;
        }
    }

    public w.n i() {
        Integer num = (Integer) this.f1649b.get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return w.n.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue == 0) {
            return w.n.INACTIVE;
        }
        if (intValue == 1) {
            return w.n.METERING;
        }
        if (intValue == 2) {
            return w.n.CONVERGED;
        }
        if (intValue == 3) {
            return w.n.LOCKED;
        }
        androidx.camera.core.s1.c("C2CameraCaptureResult", "Undefined awb state: " + num);
        return w.n.UNKNOWN;
    }
}
