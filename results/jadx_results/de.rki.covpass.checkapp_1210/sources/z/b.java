package z;

import android.graphics.Matrix;
import androidx.camera.core.impl.utils.g;
import androidx.camera.core.k1;
import w.j2;
import w.q;
/* loaded from: classes.dex */
public final class b implements k1 {

    /* renamed from: a */
    private final q f26341a;

    public b(q qVar) {
        this.f26341a = qVar;
    }

    @Override // androidx.camera.core.k1
    public j2 a() {
        return this.f26341a.a();
    }

    @Override // androidx.camera.core.k1
    public void b(g.b bVar) {
        this.f26341a.b(bVar);
    }

    @Override // androidx.camera.core.k1
    public long c() {
        return this.f26341a.c();
    }

    @Override // androidx.camera.core.k1
    public int d() {
        return 0;
    }

    @Override // androidx.camera.core.k1
    public Matrix e() {
        return new Matrix();
    }

    public q f() {
        return this.f26341a;
    }
}
