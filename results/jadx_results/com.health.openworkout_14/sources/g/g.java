package g;

import g.e;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.CompletableFuture;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
@IgnoreJRERequirement
/* loaded from: classes.dex */
public final class g extends e.a {

    /* renamed from: a */
    static final e.a f4499a = new g();

    @IgnoreJRERequirement
    /* loaded from: classes.dex */
    private static final class a<R> implements e<R, CompletableFuture<R>> {

        /* renamed from: a */
        private final Type f4500a;

        /* renamed from: g.g$a$a */
        /* loaded from: classes.dex */
        public class C0119a implements f<R> {

            /* renamed from: a */
            final /* synthetic */ CompletableFuture f4501a;

            C0119a(a aVar, CompletableFuture completableFuture) {
                this.f4501a = completableFuture;
            }

            @Override // g.f
            public void a(d<R> dVar, Throwable th) {
                this.f4501a.completeExceptionally(th);
            }

            @Override // g.f
            public void b(d<R> dVar, t<R> tVar) {
                if (tVar.d()) {
                    this.f4501a.complete(tVar.a());
                } else {
                    this.f4501a.completeExceptionally(new j(tVar));
                }
            }
        }

        a(Type type) {
            this.f4500a = type;
        }

        @Override // g.e
        public Type a() {
            return this.f4500a;
        }

        /* renamed from: c */
        public CompletableFuture<R> b(d<R> dVar) {
            b bVar = new b(dVar);
            dVar.N(new C0119a(this, bVar));
            return bVar;
        }
    }

    /* loaded from: classes.dex */
    public static final class b<T> extends CompletableFuture<T> {

        /* renamed from: b */
        private final d<?> f4502b;

        b(d<?> dVar) {
            this.f4502b = dVar;
        }

        @Override // java.util.concurrent.CompletableFuture, java.util.concurrent.Future
        public boolean cancel(boolean z) {
            if (z) {
                this.f4502b.cancel();
            }
            return super.cancel(z);
        }
    }

    @IgnoreJRERequirement
    /* loaded from: classes.dex */
    private static final class c<R> implements e<R, CompletableFuture<t<R>>> {

        /* renamed from: a */
        private final Type f4503a;

        /* loaded from: classes.dex */
        public class a implements f<R> {

            /* renamed from: a */
            final /* synthetic */ CompletableFuture f4504a;

            a(c cVar, CompletableFuture completableFuture) {
                this.f4504a = completableFuture;
            }

            @Override // g.f
            public void a(d<R> dVar, Throwable th) {
                this.f4504a.completeExceptionally(th);
            }

            @Override // g.f
            public void b(d<R> dVar, t<R> tVar) {
                this.f4504a.complete(tVar);
            }
        }

        c(Type type) {
            this.f4503a = type;
        }

        @Override // g.e
        public Type a() {
            return this.f4503a;
        }

        /* renamed from: c */
        public CompletableFuture<t<R>> b(d<R> dVar) {
            b bVar = new b(dVar);
            dVar.N(new a(this, bVar));
            return bVar;
        }
    }

    g() {
    }

    @Override // g.e.a
    @Nullable
    public e<?, ?> a(Type type, Annotation[] annotationArr, u uVar) {
        if (e.a.c(type) != CompletableFuture.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        }
        Type b2 = e.a.b(0, (ParameterizedType) type);
        if (e.a.c(b2) != t.class) {
            return new a(b2);
        }
        if (!(b2 instanceof ParameterizedType)) {
            throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
        }
        return new c(e.a.b(0, (ParameterizedType) b2));
    }
}
