package t;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Range;
import w.x1;
/* loaded from: classes.dex */
public class a implements x1 {

    /* renamed from: a */
    private final Range<Integer> f21770a;

    public a(r.z zVar) {
        this.f21770a = d((Range[]) zVar.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES));
    }

    private Range<Integer> a(Range<Integer> range) {
        int intValue = range.getUpper().intValue();
        int intValue2 = range.getLower().intValue();
        if (range.getUpper().intValue() >= 1000) {
            intValue = range.getUpper().intValue() / 1000;
        }
        if (range.getLower().intValue() >= 1000) {
            intValue2 = range.getLower().intValue() / 1000;
        }
        return new Range<>(Integer.valueOf(intValue2), Integer.valueOf(intValue));
    }

    public static boolean c(r.z zVar) {
        Integer num = (Integer) zVar.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    private Range<Integer> d(Range<Integer>[] rangeArr) {
        Range<Integer> range = null;
        if (rangeArr != null && rangeArr.length != 0) {
            for (Range<Integer> range2 : rangeArr) {
                Range<Integer> a10 = a(range2);
                if (a10.getUpper().intValue() == 30 && (range == null || a10.getLower().intValue() < range.getLower().intValue())) {
                    range = a10;
                }
            }
        }
        return range;
    }

    public Range<Integer> b() {
        return this.f21770a;
    }
}
