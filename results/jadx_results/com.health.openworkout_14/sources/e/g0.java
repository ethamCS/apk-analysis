package e;

import e.y;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a */
    final z f3974a;

    /* renamed from: b */
    final String f3975b;

    /* renamed from: c */
    final y f3976c;
    @Nullable

    /* renamed from: d */
    final h0 f3977d;

    /* renamed from: e */
    final Map<Class<?>, Object> f3978e;
    @Nullable

    /* renamed from: f */
    private volatile i f3979f;

    /* loaded from: classes.dex */
    public static class a {
        @Nullable

        /* renamed from: a */
        z f3980a;

        /* renamed from: b */
        String f3981b;

        /* renamed from: c */
        y.a f3982c;
        @Nullable

        /* renamed from: d */
        h0 f3983d;

        /* renamed from: e */
        Map<Class<?>, Object> f3984e;

        public a() {
            this.f3984e = Collections.emptyMap();
            this.f3981b = "GET";
            this.f3982c = new y.a();
        }

        a(g0 g0Var) {
            this.f3984e = Collections.emptyMap();
            this.f3980a = g0Var.f3974a;
            this.f3981b = g0Var.f3975b;
            this.f3983d = g0Var.f3977d;
            this.f3984e = g0Var.f3978e.isEmpty() ? Collections.emptyMap() : new LinkedHashMap<>(g0Var.f3978e);
            this.f3982c = g0Var.f3976c.f();
        }

        public g0 a() {
            if (this.f3980a != null) {
                return new g0(this);
            }
            throw new IllegalStateException("url == null");
        }

        public a b(String str, String str2) {
            this.f3982c.g(str, str2);
            return this;
        }

        public a c(y yVar) {
            this.f3982c = yVar.f();
            return this;
        }

        public a d(String str, @Nullable h0 h0Var) {
            Objects.requireNonNull(str, "method == null");
            if (str.length() != 0) {
                if (h0Var != null && !e.m0.i.f.b(str)) {
                    throw new IllegalArgumentException("method " + str + " must not have a request body.");
                } else if (h0Var != null || !e.m0.i.f.e(str)) {
                    this.f3981b = str;
                    this.f3983d = h0Var;
                    return this;
                } else {
                    throw new IllegalArgumentException("method " + str + " must have a request body.");
                }
            }
            throw new IllegalArgumentException("method.length() == 0");
        }

        public a e(String str) {
            this.f3982c.f(str);
            return this;
        }

        public <T> a f(Class<? super T> cls, @Nullable T t) {
            Objects.requireNonNull(cls, "type == null");
            if (t == null) {
                this.f3984e.remove(cls);
            } else {
                if (this.f3984e.isEmpty()) {
                    this.f3984e = new LinkedHashMap();
                }
                this.f3984e.put(cls, cls.cast(t));
            }
            return this;
        }

        public a g(z zVar) {
            Objects.requireNonNull(zVar, "url == null");
            this.f3980a = zVar;
            return this;
        }
    }

    g0(a aVar) {
        this.f3974a = aVar.f3980a;
        this.f3975b = aVar.f3981b;
        this.f3976c = aVar.f3982c.e();
        this.f3977d = aVar.f3983d;
        this.f3978e = e.m0.e.t(aVar.f3984e);
    }

    @Nullable
    public h0 a() {
        return this.f3977d;
    }

    public i b() {
        i iVar = this.f3979f;
        if (iVar != null) {
            return iVar;
        }
        i k = i.k(this.f3976c);
        this.f3979f = k;
        return k;
    }

    @Nullable
    public String c(String str) {
        return this.f3976c.c(str);
    }

    public y d() {
        return this.f3976c;
    }

    public boolean e() {
        return this.f3974a.n();
    }

    public String f() {
        return this.f3975b;
    }

    public a g() {
        return new a(this);
    }

    @Nullable
    public <T> T h(Class<? extends T> cls) {
        return cls.cast(this.f3978e.get(cls));
    }

    public z i() {
        return this.f3974a;
    }

    public String toString() {
        return "Request{method=" + this.f3975b + ", url=" + this.f3974a + ", tags=" + this.f3978e + '}';
    }
}
