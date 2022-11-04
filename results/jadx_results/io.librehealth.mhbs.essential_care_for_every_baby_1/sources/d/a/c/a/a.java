package d.a.c.a;

import d.a.c.a.b;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public final class a<T> {

    /* renamed from: a */
    private final d.a.c.a.b f682a;

    /* renamed from: b */
    private final String f683b;

    /* renamed from: c */
    private final g<T> f684c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class b implements b.a {

        /* renamed from: a */
        private final d<T> f685a;

        /* renamed from: d.a.c.a.a$b$a */
        /* loaded from: classes.dex */
        class C0038a implements e<T> {

            /* renamed from: a */
            final /* synthetic */ b.AbstractC0039b f687a;

            C0038a(b.AbstractC0039b abstractC0039b) {
                b.this = r1;
                this.f687a = abstractC0039b;
            }

            @Override // d.a.c.a.a.e
            public void a(T t) {
                this.f687a.a(a.this.f684c.b(t));
            }
        }

        private b(d<T> dVar) {
            a.this = r1;
            this.f685a = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // d.a.c.a.b.a
        public void a(ByteBuffer byteBuffer, b.AbstractC0039b abstractC0039b) {
            try {
                this.f685a.a(a.this.f684c.a(byteBuffer), new C0038a(abstractC0039b));
            } catch (RuntimeException e2) {
                d.a.b.c("BasicMessageChannel#" + a.this.f683b, "Failed to handle message", e2);
                abstractC0039b.a(null);
            }
        }
    }

    /* loaded from: classes.dex */
    public final class c implements b.AbstractC0039b {

        /* renamed from: a */
        private final e<T> f689a;

        private c(e<T> eVar) {
            a.this = r1;
            this.f689a = eVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // d.a.c.a.b.AbstractC0039b
        public void a(ByteBuffer byteBuffer) {
            try {
                this.f689a.a(a.this.f684c.a(byteBuffer));
            } catch (RuntimeException e2) {
                d.a.b.c("BasicMessageChannel#" + a.this.f683b, "Failed to handle message reply", e2);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface d<T> {
        void a(T t, e<T> eVar);
    }

    /* loaded from: classes.dex */
    public interface e<T> {
        void a(T t);
    }

    public a(d.a.c.a.b bVar, String str, g<T> gVar) {
        this.f682a = bVar;
        this.f683b = str;
        this.f684c = gVar;
    }

    public void c(T t) {
        d(t, null);
    }

    public void d(T t, e<T> eVar) {
        d.a.c.a.b bVar = this.f682a;
        String str = this.f683b;
        ByteBuffer b2 = this.f684c.b(t);
        c cVar = null;
        if (eVar != null) {
            cVar = new c(eVar);
        }
        bVar.a(str, b2, cVar);
    }

    public void e(d<T> dVar) {
        d.a.c.a.b bVar = this.f682a;
        String str = this.f683b;
        b bVar2 = null;
        if (dVar != null) {
            bVar2 = new b(dVar);
        }
        bVar.d(str, bVar2);
    }
}
