package d.a.c.a;

import d.a.c.a.b;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.ByteBuffer;
/* loaded from: classes.dex */
public class i {

    /* renamed from: a */
    private final d.a.c.a.b f697a;

    /* renamed from: b */
    private final String f698b;

    /* renamed from: c */
    private final j f699c;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public final class a implements b.a {

        /* renamed from: a */
        private final c f700a;

        /* renamed from: d.a.c.a.i$a$a */
        /* loaded from: classes.dex */
        class C0040a implements d {

            /* renamed from: a */
            final /* synthetic */ b.AbstractC0039b f702a;

            C0040a(b.AbstractC0039b abstractC0039b) {
                a.this = r1;
                this.f702a = abstractC0039b;
            }

            @Override // d.a.c.a.i.d
            public void a(String str, String str2, Object obj) {
                this.f702a.a(i.this.f699c.c(str, str2, obj));
            }

            @Override // d.a.c.a.i.d
            public void b(Object obj) {
                this.f702a.a(i.this.f699c.d(obj));
            }

            @Override // d.a.c.a.i.d
            public void c() {
                this.f702a.a(null);
            }
        }

        a(c cVar) {
            i.this = r1;
            this.f700a = cVar;
        }

        private String b(Exception exc) {
            StringWriter stringWriter = new StringWriter();
            exc.printStackTrace(new PrintWriter(stringWriter));
            return stringWriter.toString();
        }

        @Override // d.a.c.a.b.a
        public void a(ByteBuffer byteBuffer, b.AbstractC0039b abstractC0039b) {
            try {
                this.f700a.g(i.this.f699c.e(byteBuffer), new C0040a(abstractC0039b));
            } catch (RuntimeException e2) {
                d.a.b.c("MethodChannel#" + i.this.f698b, "Failed to handle method call", e2);
                abstractC0039b.a(i.this.f699c.a("error", e2.getMessage(), null, b(e2)));
            }
        }
    }

    /* loaded from: classes.dex */
    public final class b implements b.AbstractC0039b {

        /* renamed from: a */
        private final d f704a;

        b(d dVar) {
            i.this = r1;
            this.f704a = dVar;
        }

        @Override // d.a.c.a.b.AbstractC0039b
        public void a(ByteBuffer byteBuffer) {
            try {
                if (byteBuffer == null) {
                    this.f704a.c();
                } else {
                    try {
                        this.f704a.b(i.this.f699c.f(byteBuffer));
                    } catch (d.a.c.a.c e2) {
                        this.f704a.a(e2.f691a, e2.getMessage(), e2.f692b);
                    }
                }
            } catch (RuntimeException e3) {
                d.a.b.c("MethodChannel#" + i.this.f698b, "Failed to handle method call result", e3);
            }
        }
    }

    /* loaded from: classes.dex */
    public interface c {
        void g(h hVar, d dVar);
    }

    /* loaded from: classes.dex */
    public interface d {
        void a(String str, String str2, Object obj);

        void b(Object obj);

        void c();
    }

    public i(d.a.c.a.b bVar, String str) {
        this(bVar, str, p.f709b);
    }

    public i(d.a.c.a.b bVar, String str, j jVar) {
        this.f697a = bVar;
        this.f698b = str;
        this.f699c = jVar;
    }

    public void c(String str, Object obj) {
        d(str, obj, null);
    }

    public void d(String str, Object obj, d dVar) {
        this.f697a.a(this.f698b, this.f699c.b(new h(str, obj)), dVar == null ? null : new b(dVar));
    }

    public void e(c cVar) {
        this.f697a.d(this.f698b, cVar == null ? null : new a(cVar));
    }
}
