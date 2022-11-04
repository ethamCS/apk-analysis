package d.a;

import io.flutter.embedding.engine.g.c;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: c */
    private static a f677c;

    /* renamed from: a */
    private c f678a;

    /* renamed from: b */
    private io.flutter.embedding.engine.f.a f679b;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private c f680a;

        /* renamed from: b */
        private io.flutter.embedding.engine.f.a f681b;

        private void b() {
            if (this.f680a == null) {
                this.f680a = new c();
            }
        }

        public a a() {
            b();
            return new a(this.f680a, this.f681b);
        }
    }

    private a(c cVar, io.flutter.embedding.engine.f.a aVar) {
        this.f678a = cVar;
        this.f679b = aVar;
    }

    public static a c() {
        if (f677c == null) {
            f677c = new b().a();
        }
        return f677c;
    }

    public io.flutter.embedding.engine.f.a a() {
        return this.f679b;
    }

    public c b() {
        return this.f678a;
    }
}
