package v;

import android.hardware.camera2.CaptureRequest;
import androidx.camera.core.h0;
import java.util.Set;
import v.j;
import w.a2;
import w.o0;
import w.p1;
import w.q1;
import w.u1;
import w.z1;
/* loaded from: classes.dex */
public class j implements a2 {

    /* renamed from: z */
    private final o0 f23834z;

    /* loaded from: classes.dex */
    public static final class a implements h0<j> {

        /* renamed from: a */
        private final q1 f23835a = q1.L();

        public static a e(final o0 o0Var) {
            a aVar = new a();
            o0Var.v("camera2.captureRequest.option.", new o0.b() { // from class: v.i
                @Override // w.o0.b
                public final boolean a(o0.a aVar2) {
                    boolean f10;
                    f10 = j.a.f(j.a.this, o0Var, aVar2);
                    return f10;
                }
            });
            return aVar;
        }

        public static /* synthetic */ boolean f(a aVar, o0 o0Var, o0.a aVar2) {
            aVar.a().G(aVar2, o0Var.d(aVar2), o0Var.b(aVar2));
            return true;
        }

        @Override // androidx.camera.core.h0
        public p1 a() {
            return this.f23835a;
        }

        public j d() {
            return new j(u1.J(this.f23835a));
        }

        /* JADX WARN: Multi-variable type inference failed */
        public <ValueT> a g(CaptureRequest.Key<ValueT> key, ValueT valuet) {
            this.f23835a.g(q.a.H(key), valuet);
            return this;
        }
    }

    public j(o0 o0Var) {
        this.f23834z = o0Var;
    }

    @Override // w.a2, w.o0
    public /* synthetic */ Object a(o0.a aVar, Object obj) {
        return z1.g(this, aVar, obj);
    }

    @Override // w.a2, w.o0
    public /* synthetic */ Object b(o0.a aVar) {
        return z1.f(this, aVar);
    }

    @Override // w.a2, w.o0
    public /* synthetic */ Set c() {
        return z1.e(this);
    }

    @Override // w.a2, w.o0
    public /* synthetic */ o0.c d(o0.a aVar) {
        return z1.c(this, aVar);
    }

    @Override // w.a2, w.o0
    public /* synthetic */ boolean e(o0.a aVar) {
        return z1.a(this, aVar);
    }

    @Override // w.a2
    public o0 k() {
        return this.f23834z;
    }

    @Override // w.o0
    public /* synthetic */ Object t(o0.a aVar, o0.c cVar) {
        return z1.h(this, aVar, cVar);
    }

    @Override // w.o0
    public /* synthetic */ void v(String str, o0.b bVar) {
        z1.b(this, str, bVar);
    }

    @Override // w.o0
    public /* synthetic */ Set x(o0.a aVar) {
        return z1.d(this, aVar);
    }
}
