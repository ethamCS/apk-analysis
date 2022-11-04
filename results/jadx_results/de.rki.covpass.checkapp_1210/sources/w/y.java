package w;

import android.graphics.Rect;
import android.util.Size;
import java.util.Collections;
import java.util.List;
import w.c2;
/* loaded from: classes.dex */
public interface y extends androidx.camera.core.m {

    /* renamed from: a */
    public static final y f24614a = new a();

    /* loaded from: classes.dex */
    class a implements y {
        a() {
        }

        @Override // w.y
        public void a(Size size, c2.b bVar) {
        }

        @Override // w.y
        public void b(boolean z10) {
        }

        @Override // w.y
        public o0 c() {
            return null;
        }

        @Override // w.y
        public x5.a<List<Void>> d(List<k0> list, int i10, int i11) {
            return y.f.h(Collections.emptyList());
        }

        @Override // w.y
        public void e() {
        }

        @Override // w.y
        public void f(o0 o0Var) {
        }

        @Override // w.y
        public Rect g() {
            return new Rect();
        }

        @Override // w.y
        public void h(int i10) {
        }

        @Override // androidx.camera.core.m
        public x5.a<androidx.camera.core.j0> i(androidx.camera.core.i0 i0Var) {
            return y.f.h(androidx.camera.core.j0.b());
        }

        @Override // androidx.camera.core.m
        public x5.a<Void> j(boolean z10) {
            return y.f.h(null);
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends Exception {

        /* renamed from: c */
        private j f24615c;

        public b(j jVar) {
            this.f24615c = jVar;
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void a();

        void b(List<k0> list);
    }

    void a(Size size, c2.b bVar);

    void b(boolean z10);

    o0 c();

    x5.a<List<Void>> d(List<k0> list, int i10, int i11);

    void e();

    void f(o0 o0Var);

    Rect g();

    void h(int i10);
}
