package t;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.util.Size;
import androidx.camera.core.s1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import w.x1;
/* loaded from: classes.dex */
public class e implements x1 {

    /* renamed from: a */
    private final List<Size> f21771a;

    public e(r.z zVar) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) zVar.a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (streamConfigurationMap == null) {
            s1.c("CamcorderProfileResolutionQuirk", "StreamConfigurationMap is null");
        }
        Size[] outputSizes = streamConfigurationMap != null ? streamConfigurationMap.getOutputSizes(34) : null;
        List<Size> asList = outputSizes != null ? Arrays.asList((Size[]) outputSizes.clone()) : Collections.emptyList();
        this.f21771a = asList;
        s1.a("CamcorderProfileResolutionQuirk", "mSupportedResolutions = " + asList);
    }

    public static boolean b(r.z zVar) {
        Integer num = (Integer) zVar.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        return num != null && num.intValue() == 2;
    }

    public List<Size> a() {
        return new ArrayList(this.f21771a);
    }
}
