package w;

import androidx.camera.core.c3;
import java.util.Collection;
/* loaded from: classes.dex */
public interface d0 extends androidx.camera.core.k, c3.d {

    /* loaded from: classes.dex */
    public enum a {
        PENDING_OPEN(false),
        OPENING(true),
        OPEN(true),
        CLOSING(true),
        CLOSED(false),
        RELEASING(true),
        RELEASED(false);
        

        /* renamed from: c */
        private final boolean f24438c;

        a(boolean z10) {
            this.f24438c = z10;
        }

        public boolean b() {
            return this.f24438c;
        }
    }

    @Override // androidx.camera.core.k
    androidx.camera.core.r a();

    void b(boolean z10);

    void e(Collection<c3> collection);

    void g(Collection<c3> collection);

    void h(t tVar);

    b0 i();

    s1<a> l();

    y m();
}
