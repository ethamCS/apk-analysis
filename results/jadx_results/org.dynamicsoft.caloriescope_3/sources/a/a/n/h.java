package a.a.n;

import a.g.l.a0;
import a.g.l.y;
import a.g.l.z;
import android.view.View;
import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class h {

    /* renamed from: c */
    private Interpolator f45c;
    z d;
    private boolean e;

    /* renamed from: b */
    private long f44b = -1;
    private final a0 f = new a();

    /* renamed from: a */
    final ArrayList<y> f43a = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends a0 {

        /* renamed from: a */
        private boolean f46a = false;

        /* renamed from: b */
        private int f47b = 0;

        a() {
            h.this = r1;
        }

        void a() {
            this.f47b = 0;
            this.f46a = false;
            h.this.b();
        }

        @Override // a.g.l.z
        public void a(View view) {
            int i = this.f47b + 1;
            this.f47b = i;
            if (i == h.this.f43a.size()) {
                z zVar = h.this.d;
                if (zVar != null) {
                    zVar.a(null);
                }
                a();
            }
        }

        @Override // a.g.l.a0, a.g.l.z
        public void b(View view) {
            if (this.f46a) {
                return;
            }
            this.f46a = true;
            z zVar = h.this.d;
            if (zVar == null) {
                return;
            }
            zVar.b(null);
        }
    }

    public h a(long j) {
        if (!this.e) {
            this.f44b = j;
        }
        return this;
    }

    public h a(y yVar) {
        if (!this.e) {
            this.f43a.add(yVar);
        }
        return this;
    }

    public h a(y yVar, y yVar2) {
        this.f43a.add(yVar);
        yVar2.b(yVar.b());
        this.f43a.add(yVar2);
        return this;
    }

    public h a(z zVar) {
        if (!this.e) {
            this.d = zVar;
        }
        return this;
    }

    public h a(Interpolator interpolator) {
        if (!this.e) {
            this.f45c = interpolator;
        }
        return this;
    }

    public void a() {
        if (!this.e) {
            return;
        }
        Iterator<y> it = this.f43a.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
        this.e = false;
    }

    void b() {
        this.e = false;
    }

    public void c() {
        if (this.e) {
            return;
        }
        Iterator<y> it = this.f43a.iterator();
        while (it.hasNext()) {
            y next = it.next();
            long j = this.f44b;
            if (j >= 0) {
                next.a(j);
            }
            Interpolator interpolator = this.f45c;
            if (interpolator != null) {
                next.a(interpolator);
            }
            if (this.d != null) {
                next.a(this.f);
            }
            next.c();
        }
        this.e = true;
    }
}
