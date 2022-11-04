package a.e.a.j;

import a.e.a.j.e;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class p {

    /* renamed from: a */
    private int f150a;

    /* renamed from: b */
    private int f151b;

    /* renamed from: c */
    private int f152c;
    private int d;
    private ArrayList<a> e = new ArrayList<>();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        private e f153a;

        /* renamed from: b */
        private e f154b;

        /* renamed from: c */
        private int f155c;
        private e.c d;
        private int e;

        public a(e eVar) {
            this.f153a = eVar;
            this.f154b = eVar.g();
            this.f155c = eVar.b();
            this.d = eVar.f();
            this.e = eVar.a();
        }

        public void a(f fVar) {
            fVar.a(this.f153a.h()).a(this.f154b, this.f155c, this.d, this.e);
        }

        public void b(f fVar) {
            int i;
            e a2 = fVar.a(this.f153a.h());
            this.f153a = a2;
            if (a2 != null) {
                this.f154b = a2.g();
                this.f155c = this.f153a.b();
                this.d = this.f153a.f();
                i = this.f153a.a();
            } else {
                this.f154b = null;
                i = 0;
                this.f155c = 0;
                this.d = e.c.STRONG;
            }
            this.e = i;
        }
    }

    public p(f fVar) {
        this.f150a = fVar.v();
        this.f151b = fVar.w();
        this.f152c = fVar.s();
        this.d = fVar.i();
        ArrayList<e> b2 = fVar.b();
        int size = b2.size();
        for (int i = 0; i < size; i++) {
            this.e.add(new a(b2.get(i)));
        }
    }

    public void a(f fVar) {
        fVar.r(this.f150a);
        fVar.s(this.f151b);
        fVar.o(this.f152c);
        fVar.g(this.d);
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            this.e.get(i).a(fVar);
        }
    }

    public void b(f fVar) {
        this.f150a = fVar.v();
        this.f151b = fVar.w();
        this.f152c = fVar.s();
        this.d = fVar.i();
        int size = this.e.size();
        for (int i = 0; i < size; i++) {
            this.e.get(i).b(fVar);
        }
    }
}
