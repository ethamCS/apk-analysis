package g;

import e.g0;
import g.e;
import g.i;
import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class i extends e.a {
    @Nullable

    /* renamed from: a */
    private final Executor f4505a;

    /* loaded from: classes.dex */
    class a implements e<Object, d<?>> {

        /* renamed from: a */
        final /* synthetic */ Type f4506a;

        /* renamed from: b */
        final /* synthetic */ Executor f4507b;

        a(i iVar, Type type, Executor executor) {
            this.f4506a = type;
            this.f4507b = executor;
        }

        @Override // g.e
        public Type a() {
            return this.f4506a;
        }

        /* renamed from: c */
        public d<Object> b(d<Object> dVar) {
            Executor executor = this.f4507b;
            return executor == null ? dVar : new b(executor, dVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b<T> implements d<T> {

        /* renamed from: b */
        final Executor f4508b;

        /* renamed from: c */
        final d<T> f4509c;

        /* loaded from: classes.dex */
        public class a implements f<T> {

            /* renamed from: a */
            final /* synthetic */ f f4510a;

            a(f fVar) {
                b.this = r1;
                this.f4510a = fVar;
            }

            /* renamed from: c */
            public /* synthetic */ void d(f fVar, Throwable th) {
                fVar.a(b.this, th);
            }

            /* renamed from: e */
            public /* synthetic */ void f(f fVar, t tVar) {
                if (b.this.f4509c.c()) {
                    fVar.a(b.this, new IOException("Canceled"));
                } else {
                    fVar.b(b.this, tVar);
                }
            }

            @Override // g.f
            public void a(d<T> dVar, final Throwable th) {
                Executor executor = b.this.f4508b;
                final f fVar = this.f4510a;
                executor.execute(new Runnable() { // from class: g.a
                    @Override // java.lang.Runnable
                    public final void run() {
                        i.b.a.this.d(fVar, th);
                    }
                });
            }

            @Override // g.f
            public void b(d<T> dVar, final t<T> tVar) {
                Executor executor = b.this.f4508b;
                final f fVar = this.f4510a;
                executor.execute(new Runnable() { // from class: g.b
                    @Override // java.lang.Runnable
                    public final void run() {
                        i.b.a.this.f(fVar, tVar);
                    }
                });
            }
        }

        b(Executor executor, d<T> dVar) {
            this.f4508b = executor;
            this.f4509c = dVar;
        }

        @Override // g.d
        public void N(f<T> fVar) {
            Objects.requireNonNull(fVar, "callback == null");
            this.f4509c.N(new a(fVar));
        }

        @Override // g.d
        public g0 a() {
            return this.f4509c.a();
        }

        @Override // g.d
        public boolean c() {
            return this.f4509c.c();
        }

        @Override // g.d
        public void cancel() {
            this.f4509c.cancel();
        }

        @Override // g.d
        /* renamed from: k */
        public d<T> clone() {
            return new b(this.f4508b, this.f4509c.k());
        }
    }

    public i(@Nullable Executor executor) {
        this.f4505a = executor;
    }

    @Override // g.e.a
    @Nullable
    public e<?, ?> a(Type type, Annotation[] annotationArr, u uVar) {
        Executor executor = null;
        if (e.a.c(type) != d.class) {
            return null;
        }
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        }
        Type g2 = y.g(0, (ParameterizedType) type);
        if (!y.l(annotationArr, w.class)) {
            executor = this.f4505a;
        }
        return new a(this, g2, executor);
    }
}
