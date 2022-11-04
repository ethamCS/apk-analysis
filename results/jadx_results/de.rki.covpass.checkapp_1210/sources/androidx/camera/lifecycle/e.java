package androidx.camera.lifecycle;

import android.content.Context;
import androidx.camera.core.c3;
import androidx.camera.core.i3;
import androidx.camera.core.impl.utils.l;
import androidx.camera.core.k;
import androidx.camera.core.q;
import androidx.camera.core.s;
import androidx.camera.core.y;
import androidx.camera.core.z;
import androidx.concurrent.futures.c;
import androidx.core.util.h;
import androidx.lifecycle.v;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import w.d0;
import w.t;
import w.x0;
import y.f;
/* loaded from: classes.dex */
public final class e {

    /* renamed from: h */
    private static final e f2601h = new e();

    /* renamed from: c */
    private x5.a<y> f2604c;

    /* renamed from: f */
    private y f2607f;

    /* renamed from: g */
    private Context f2608g;

    /* renamed from: a */
    private final Object f2602a = new Object();

    /* renamed from: b */
    private z.b f2603b = null;

    /* renamed from: d */
    private x5.a<Void> f2605d = f.h(null);

    /* renamed from: e */
    private final LifecycleCameraRepository f2606e = new LifecycleCameraRepository();

    /* loaded from: classes.dex */
    public class a implements y.c<Void> {

        /* renamed from: a */
        final /* synthetic */ c.a f2609a;

        /* renamed from: b */
        final /* synthetic */ y f2610b;

        a(c.a aVar, y yVar) {
            e.this = r1;
            this.f2609a = aVar;
            this.f2610b = yVar;
        }

        @Override // y.c
        public void a(Throwable th2) {
            this.f2609a.f(th2);
        }

        /* renamed from: c */
        public void b(Void r22) {
            this.f2609a.c(this.f2610b);
        }
    }

    private e() {
    }

    public static x5.a<e> f(final Context context) {
        h.g(context);
        return f.o(f2601h.g(context), new o.a() { // from class: androidx.camera.lifecycle.c
            @Override // o.a
            public final Object apply(Object obj) {
                e i10;
                i10 = e.i(context, (y) obj);
                return i10;
            }
        }, x.a.a());
    }

    private x5.a<y> g(Context context) {
        synchronized (this.f2602a) {
            x5.a<y> aVar = this.f2604c;
            if (aVar != null) {
                return aVar;
            }
            final y yVar = new y(context, this.f2603b);
            x5.a<y> a10 = androidx.concurrent.futures.c.a(new c.AbstractC0023c() { // from class: androidx.camera.lifecycle.b
                @Override // androidx.concurrent.futures.c.AbstractC0023c
                public final Object a(c.a aVar2) {
                    Object k10;
                    k10 = e.this.k(yVar, aVar2);
                    return k10;
                }
            });
            this.f2604c = a10;
            return a10;
        }
    }

    public static /* synthetic */ e i(Context context, y yVar) {
        e eVar = f2601h;
        eVar.l(yVar);
        eVar.m(androidx.camera.core.impl.utils.d.a(context));
        return eVar;
    }

    public /* synthetic */ Object k(final y yVar, c.a aVar) {
        synchronized (this.f2602a) {
            f.b(y.d.a(this.f2605d).f(new y.a() { // from class: androidx.camera.lifecycle.d
                @Override // y.a
                public final x5.a apply(Object obj) {
                    x5.a h10;
                    Void r22 = (Void) obj;
                    h10 = y.this.h();
                    return h10;
                }
            }, x.a.a()), new a(aVar, yVar), x.a.a());
        }
        return "ProcessCameraProvider-initializeCameraX";
    }

    private void l(y yVar) {
        this.f2607f = yVar;
    }

    private void m(Context context) {
        this.f2608g = context;
    }

    k d(v vVar, s sVar, i3 i3Var, c3... c3VarArr) {
        t tVar;
        t a10;
        l.a();
        s.a c10 = s.a.c(sVar);
        int length = c3VarArr.length;
        int i10 = 0;
        while (true) {
            tVar = null;
            if (i10 >= length) {
                break;
            }
            s y10 = c3VarArr[i10].g().y(null);
            if (y10 != null) {
                Iterator<q> it = y10.c().iterator();
                while (it.hasNext()) {
                    c10.a(it.next());
                }
            }
            i10++;
        }
        LinkedHashSet<d0> a11 = c10.b().a(this.f2607f.e().a());
        if (!a11.isEmpty()) {
            LifecycleCamera c11 = this.f2606e.c(vVar, z.e.v(a11));
            Collection<LifecycleCamera> e10 = this.f2606e.e();
            for (c3 c3Var : c3VarArr) {
                for (LifecycleCamera lifecycleCamera : e10) {
                    if (lifecycleCamera.p(c3Var) && lifecycleCamera != c11) {
                        throw new IllegalStateException(String.format("Use case %s already bound to a different lifecycle.", c3Var));
                    }
                }
            }
            if (c11 == null) {
                c11 = this.f2606e.b(vVar, new z.e(a11, this.f2607f.d(), this.f2607f.g()));
            }
            Iterator<q> it2 = sVar.c().iterator();
            while (it2.hasNext()) {
                q next = it2.next();
                if (next.a() != q.f2440a && (a10 = x0.a(next.a()).a(c11.a(), this.f2608g)) != null) {
                    if (tVar != null) {
                        throw new IllegalArgumentException("Cannot apply multiple extended camera configs at the same time.");
                    }
                    tVar = a10;
                }
            }
            c11.h(tVar);
            if (c3VarArr.length == 0) {
                return c11;
            }
            this.f2606e.a(c11, i3Var, Arrays.asList(c3VarArr));
            return c11;
        }
        throw new IllegalArgumentException("Provided camera selector unable to resolve a camera for the given use case");
    }

    public k e(v vVar, s sVar, c3... c3VarArr) {
        return d(vVar, sVar, null, c3VarArr);
    }

    public boolean h(s sVar) {
        try {
            sVar.e(this.f2607f.e().a());
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public void n() {
        l.a();
        this.f2606e.k();
    }
}
