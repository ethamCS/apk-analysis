package w;

import android.util.Range;
import androidx.camera.core.c3;
import w.c2;
import w.k0;
import w.o0;
/* loaded from: classes.dex */
public interface o2<T extends c3> extends z.i<T>, z.m, d1 {

    /* renamed from: n */
    public static final o0.a<c2> f24554n = o0.a.a("camerax.core.useCase.defaultSessionConfig", c2.class);

    /* renamed from: o */
    public static final o0.a<k0> f24555o = o0.a.a("camerax.core.useCase.defaultCaptureConfig", k0.class);

    /* renamed from: p */
    public static final o0.a<c2.d> f24556p = o0.a.a("camerax.core.useCase.sessionConfigUnpacker", c2.d.class);

    /* renamed from: q */
    public static final o0.a<k0.b> f24557q = o0.a.a("camerax.core.useCase.captureConfigUnpacker", k0.b.class);

    /* renamed from: r */
    public static final o0.a<Integer> f24558r = o0.a.a("camerax.core.useCase.surfaceOccupancyPriority", Integer.TYPE);

    /* renamed from: s */
    public static final o0.a<androidx.camera.core.s> f24559s = o0.a.a("camerax.core.useCase.cameraSelector", androidx.camera.core.s.class);

    /* renamed from: t */
    public static final o0.a<Range<Integer>> f24560t = o0.a.a("camerax.core.useCase.targetFrameRate", androidx.camera.core.s.class);

    /* loaded from: classes.dex */
    public interface a<T extends c3, C extends o2<T>, B> extends androidx.camera.core.h0<T> {
        C b();
    }

    k0 i(k0 k0Var);

    k0.b j(k0.b bVar);

    int n(int i10);

    c2.d r(c2.d dVar);

    c2 w(c2 c2Var);

    androidx.camera.core.s y(androidx.camera.core.s sVar);
}
