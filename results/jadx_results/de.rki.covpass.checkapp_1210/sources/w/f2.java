package w;

import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class f2 implements g1 {

    /* renamed from: a */
    private final int f24457a;

    /* renamed from: b */
    private final androidx.camera.core.n1 f24458b;

    public f2(androidx.camera.core.n1 n1Var, String str) {
        androidx.camera.core.k1 I = n1Var.I();
        if (I != null) {
            Integer num = (Integer) I.a().c(str);
            if (num == null) {
                throw new IllegalArgumentException("ImageProxy has no associated tag");
            }
            this.f24457a = num.intValue();
            this.f24458b = n1Var;
            return;
        }
        throw new IllegalArgumentException("ImageProxy has no associated ImageInfo");
    }

    @Override // w.g1
    public x5.a<androidx.camera.core.n1> a(int i10) {
        return i10 != this.f24457a ? y.f.f(new IllegalArgumentException("Capture id does not exist in the bundle")) : y.f.h(this.f24458b);
    }

    @Override // w.g1
    public List<Integer> b() {
        return Collections.singletonList(Integer.valueOf(this.f24457a));
    }

    public void c() {
        this.f24458b.close();
    }
}
