package w;

import android.util.Pair;
import android.util.Size;
import java.util.List;
import w.o0;
/* loaded from: classes.dex */
public interface f1 extends a2 {

    /* renamed from: h */
    public static final o0.a<Integer> f24451h;

    /* renamed from: i */
    public static final o0.a<Integer> f24452i;

    /* renamed from: g */
    public static final o0.a<Integer> f24450g = o0.a.a("camerax.core.imageOutput.targetAspectRatio", androidx.camera.core.e.class);

    /* renamed from: j */
    public static final o0.a<Size> f24453j = o0.a.a("camerax.core.imageOutput.targetResolution", Size.class);

    /* renamed from: k */
    public static final o0.a<Size> f24454k = o0.a.a("camerax.core.imageOutput.defaultResolution", Size.class);

    /* renamed from: l */
    public static final o0.a<Size> f24455l = o0.a.a("camerax.core.imageOutput.maxResolution", Size.class);

    /* renamed from: m */
    public static final o0.a<List<Pair<Integer, Size[]>>> f24456m = o0.a.a("camerax.core.imageOutput.supportedResolutions", List.class);

    static {
        Class cls = Integer.TYPE;
        f24451h = o0.a.a("camerax.core.imageOutput.targetRotation", cls);
        f24452i = o0.a.a("camerax.core.imageOutput.appTargetRotation", cls);
    }

    int A(int i10);

    int E(int i10);

    Size f(Size size);

    List<Pair<Integer, Size[]>> l(List<Pair<Integer, Size[]>> list);

    boolean m();

    int o();

    Size u(Size size);

    Size z(Size size);
}
