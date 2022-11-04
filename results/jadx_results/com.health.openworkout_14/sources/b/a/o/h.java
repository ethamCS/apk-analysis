package b.a.o;

import android.view.View;
import android.view.animation.Interpolator;
import b.g.l.x;
import b.g.l.y;
import b.g.l.z;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class h {

    /* renamed from: c */
    private Interpolator f2083c;

    /* renamed from: d */
    y f2084d;

    /* renamed from: e */
    private boolean f2085e;

    /* renamed from: b */
    private long f2082b = -1;

    /* renamed from: f */
    private final z f2086f = new a();

    /* renamed from: a */
    final ArrayList<x> f2081a = new ArrayList<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends z {

        /* renamed from: a */
        private boolean f2087a = false;

        /* renamed from: b */
        private int f2088b = 0;

        a() {
            h.this = r1;
        }

        @Override // b.g.l.y
        public void a(View view) {
            int i = this.f2088b + 1;
            this.f2088b = i;
            if (i == h.this.f2081a.size()) {
                y yVar = h.this.f2084d;
                if (yVar != null) {
                    yVar.a(null);
                }
                d();
            }
        }

        @Override // b.g.l.z, b.g.l.y
        public void b(View view) {
            if (this.f2087a) {
                return;
            }
            this.f2087a = true;
            y yVar = h.this.f2084d;
            if (yVar == null) {
                return;
            }
            yVar.b(null);
        }

        void d() {
            this.f2088b = 0;
            this.f2087a = false;
            h.this.b();
        }
    }

    public void a() {
        if (!this.f2085e) {
            return;
        }
        Iterator<x> it = this.f2081a.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        this.f2085e = false;
    }

    void b() {
        this.f2085e = false;
    }

    public h c(x xVar) {
        if (!this.f2085e) {
            this.f2081a.add(xVar);
        }
        return this;
    }

    public h d(x xVar, x xVar2) {
        this.f2081a.add(xVar);
        xVar2.h(xVar.c());
        this.f2081a.add(xVar2);
        return this;
    }

    public h e(long j) {
        if (!this.f2085e) {
            this.f2082b = j;
        }
        return this;
    }

    public h f(Interpolator interpolator) {
        if (!this.f2085e) {
            this.f2083c = interpolator;
        }
        return this;
    }

    public h g(y yVar) {
        if (!this.f2085e) {
            this.f2084d = yVar;
        }
        return this;
    }

    public void h() {
        if (this.f2085e) {
            return;
        }
        Iterator<x> it = this.f2081a.iterator();
        while (it.hasNext()) {
            x next = it.next();
            long j = this.f2082b;
            if (j >= 0) {
                next.d(j);
            }
            Interpolator interpolator = this.f2083c;
            if (interpolator != null) {
                next.e(interpolator);
            }
            if (this.f2084d != null) {
                next.f(this.f2086f);
            }
            next.j();
        }
        this.f2085e = true;
    }
}
