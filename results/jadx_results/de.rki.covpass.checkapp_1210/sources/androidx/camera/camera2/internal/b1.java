package androidx.camera.camera2.internal;

import androidx.camera.camera2.internal.q1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public class b1 implements w.b2 {

    /* renamed from: a */
    private final q1 f1622a;

    /* renamed from: b */
    private final List<w.e2> f1623b;

    /* renamed from: c */
    private volatile boolean f1624c = false;

    /* renamed from: d */
    private volatile w.c2 f1625d;

    public b1(q1 q1Var, List<w.e2> list) {
        boolean z10 = false;
        z10 = q1Var.f1938l == q1.d.OPENED ? true : z10;
        androidx.core.util.h.b(z10, "CaptureSession state must be OPENED. Current state:" + q1Var.f1938l);
        this.f1622a = q1Var;
        this.f1623b = Collections.unmodifiableList(new ArrayList(list));
    }

    public void a() {
        this.f1624c = true;
    }

    public void b(w.c2 c2Var) {
        this.f1625d = c2Var;
    }
}
