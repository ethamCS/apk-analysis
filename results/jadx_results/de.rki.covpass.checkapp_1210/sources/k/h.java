package k;

import android.view.View;
import android.view.animation.Interpolator;
import androidx.core.view.e0;
import androidx.core.view.f0;
import androidx.core.view.g0;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class h {

    /* renamed from: c */
    private Interpolator f14528c;

    /* renamed from: d */
    f0 f14529d;

    /* renamed from: e */
    private boolean f14530e;

    /* renamed from: b */
    private long f14527b = -1;

    /* renamed from: f */
    private final g0 f14531f = new a();

    /* renamed from: a */
    final ArrayList<e0> f14526a = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends g0 {

        /* renamed from: a */
        private boolean f14532a = false;

        /* renamed from: b */
        private int f14533b = 0;

        a() {
            h.this = r1;
        }

        @Override // androidx.core.view.f0
        public void b(View view) {
            int i10 = this.f14533b + 1;
            this.f14533b = i10;
            if (i10 == h.this.f14526a.size()) {
                f0 f0Var = h.this.f14529d;
                if (f0Var != null) {
                    f0Var.b(null);
                }
                d();
            }
        }

        @Override // androidx.core.view.g0, androidx.core.view.f0
        public void c(View view) {
            if (this.f14532a) {
                return;
            }
            this.f14532a = true;
            f0 f0Var = h.this.f14529d;
            if (f0Var == null) {
                return;
            }
            f0Var.c(null);
        }

        void d() {
            this.f14533b = 0;
            this.f14532a = false;
            h.this.b();
        }
    }

    public void a() {
        if (!this.f14530e) {
            return;
        }
        Iterator<e0> it = this.f14526a.iterator();
        while (it.hasNext()) {
            it.next().c();
        }
        this.f14530e = false;
    }

    void b() {
        this.f14530e = false;
    }

    public h c(e0 e0Var) {
        if (!this.f14530e) {
            this.f14526a.add(e0Var);
        }
        return this;
    }

    public h d(e0 e0Var, e0 e0Var2) {
        this.f14526a.add(e0Var);
        e0Var2.j(e0Var.d());
        this.f14526a.add(e0Var2);
        return this;
    }

    public h e(long j10) {
        if (!this.f14530e) {
            this.f14527b = j10;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f14530e) {
            this.f14528c = interpolator;
        }
        return this;
    }

    public h g(f0 f0Var) {
        if (!this.f14530e) {
            this.f14529d = f0Var;
        }
        return this;
    }

    public void h() {
        if (this.f14530e) {
            return;
        }
        Iterator<e0> it = this.f14526a.iterator();
        while (it.hasNext()) {
            e0 next = it.next();
            long j10 = this.f14527b;
            if (j10 >= 0) {
                next.f(j10);
            }
            Interpolator interpolator = this.f14528c;
            if (interpolator != null) {
                next.g(interpolator);
            }
            if (this.f14529d != null) {
                next.h(this.f14531f);
            }
            next.l();
        }
        this.f14530e = true;
    }
}
