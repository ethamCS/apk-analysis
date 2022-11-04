package g;

import e.c0;
import e.h0;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public abstract class p<T> {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends p<Iterable<T>> {
        a() {
            p.this = r1;
        }

        /* renamed from: d */
        public void a(r rVar, @Nullable Iterable<T> iterable) {
            if (iterable == null) {
                return;
            }
            for (T t : iterable) {
                p.this.a(rVar, t);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b extends p<Object> {
        b() {
            p.this = r1;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // g.p
        public void a(r rVar, @Nullable Object obj) {
            if (obj == null) {
                return;
            }
            int length = Array.getLength(obj);
            for (int i = 0; i < length; i++) {
                p.this.a(rVar, Array.get(obj, i));
            }
        }
    }

    /* loaded from: classes.dex */
    static final class c<T> extends p<T> {

        /* renamed from: a */
        private final Method f4551a;

        /* renamed from: b */
        private final int f4552b;

        /* renamed from: c */
        private final g.h<T, h0> f4553c;

        public c(Method method, int i, g.h<T, h0> hVar) {
            this.f4551a = method;
            this.f4552b = i;
            this.f4553c = hVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // g.p
        public void a(r rVar, @Nullable T t) {
            if (t != null) {
                try {
                    rVar.l(this.f4553c.a(t));
                    return;
                } catch (IOException e2) {
                    Method method = this.f4551a;
                    int i = this.f4552b;
                    throw y.p(method, e2, i, "Unable to convert " + t + " to RequestBody", new Object[0]);
                }
            }
            throw y.o(this.f4551a, this.f4552b, "Body parameter value must not be null.", new Object[0]);
        }
    }

    /* loaded from: classes.dex */
    static final class d<T> extends p<T> {

        /* renamed from: a */
        private final String f4554a;

        /* renamed from: b */
        private final g.h<T, String> f4555b;

        /* renamed from: c */
        private final boolean f4556c;

        public d(String str, g.h<T, String> hVar, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.f4554a = str;
            this.f4555b = hVar;
            this.f4556c = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // g.p
        public void a(r rVar, @Nullable T t) {
            String a2;
            if (t == null || (a2 = this.f4555b.a(t)) == null) {
                return;
            }
            rVar.a(this.f4554a, a2, this.f4556c);
        }
    }

    /* loaded from: classes.dex */
    static final class e<T> extends p<Map<String, T>> {

        /* renamed from: a */
        private final Method f4557a;

        /* renamed from: b */
        private final int f4558b;

        /* renamed from: c */
        private final g.h<T, String> f4559c;

        /* renamed from: d */
        private final boolean f4560d;

        public e(Method method, int i, g.h<T, String> hVar, boolean z) {
            this.f4557a = method;
            this.f4558b = i;
            this.f4559c = hVar;
            this.f4560d = z;
        }

        /* renamed from: d */
        public void a(r rVar, @Nullable Map<String, T> map) {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key == null) {
                        throw y.o(this.f4557a, this.f4558b, "Field map contained null key.", new Object[0]);
                    }
                    T value = entry.getValue();
                    if (value == null) {
                        Method method = this.f4557a;
                        int i = this.f4558b;
                        throw y.o(method, i, "Field map contained null value for key '" + key + "'.", new Object[0]);
                    }
                    String a2 = this.f4559c.a(value);
                    if (a2 == null) {
                        Method method2 = this.f4557a;
                        int i2 = this.f4558b;
                        throw y.o(method2, i2, "Field map value '" + value + "' converted to null by " + this.f4559c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                    }
                    rVar.a(key, a2, this.f4560d);
                }
                return;
            }
            throw y.o(this.f4557a, this.f4558b, "Field map was null.", new Object[0]);
        }
    }

    /* loaded from: classes.dex */
    static final class f<T> extends p<T> {

        /* renamed from: a */
        private final String f4561a;

        /* renamed from: b */
        private final g.h<T, String> f4562b;

        public f(String str, g.h<T, String> hVar) {
            Objects.requireNonNull(str, "name == null");
            this.f4561a = str;
            this.f4562b = hVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // g.p
        public void a(r rVar, @Nullable T t) {
            String a2;
            if (t == null || (a2 = this.f4562b.a(t)) == null) {
                return;
            }
            rVar.b(this.f4561a, a2);
        }
    }

    /* loaded from: classes.dex */
    static final class g<T> extends p<Map<String, T>> {

        /* renamed from: a */
        private final Method f4563a;

        /* renamed from: b */
        private final int f4564b;

        /* renamed from: c */
        private final g.h<T, String> f4565c;

        public g(Method method, int i, g.h<T, String> hVar) {
            this.f4563a = method;
            this.f4564b = i;
            this.f4565c = hVar;
        }

        /* renamed from: d */
        public void a(r rVar, @Nullable Map<String, T> map) {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key == null) {
                        throw y.o(this.f4563a, this.f4564b, "Header map contained null key.", new Object[0]);
                    }
                    T value = entry.getValue();
                    if (value == null) {
                        Method method = this.f4563a;
                        int i = this.f4564b;
                        throw y.o(method, i, "Header map contained null value for key '" + key + "'.", new Object[0]);
                    }
                    rVar.b(key, this.f4565c.a(value));
                }
                return;
            }
            throw y.o(this.f4563a, this.f4564b, "Header map was null.", new Object[0]);
        }
    }

    /* loaded from: classes.dex */
    static final class h extends p<e.y> {

        /* renamed from: a */
        private final Method f4566a;

        /* renamed from: b */
        private final int f4567b;

        public h(Method method, int i) {
            this.f4566a = method;
            this.f4567b = i;
        }

        /* renamed from: d */
        public void a(r rVar, @Nullable e.y yVar) {
            if (yVar != null) {
                rVar.c(yVar);
                return;
            }
            throw y.o(this.f4566a, this.f4567b, "Headers parameter must not be null.", new Object[0]);
        }
    }

    /* loaded from: classes.dex */
    static final class i<T> extends p<T> {

        /* renamed from: a */
        private final Method f4568a;

        /* renamed from: b */
        private final int f4569b;

        /* renamed from: c */
        private final e.y f4570c;

        /* renamed from: d */
        private final g.h<T, h0> f4571d;

        public i(Method method, int i, e.y yVar, g.h<T, h0> hVar) {
            this.f4568a = method;
            this.f4569b = i;
            this.f4570c = yVar;
            this.f4571d = hVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // g.p
        public void a(r rVar, @Nullable T t) {
            if (t == null) {
                return;
            }
            try {
                rVar.d(this.f4570c, this.f4571d.a(t));
            } catch (IOException e2) {
                Method method = this.f4568a;
                int i = this.f4569b;
                throw y.o(method, i, "Unable to convert " + t + " to RequestBody", e2);
            }
        }
    }

    /* loaded from: classes.dex */
    static final class j<T> extends p<Map<String, T>> {

        /* renamed from: a */
        private final Method f4572a;

        /* renamed from: b */
        private final int f4573b;

        /* renamed from: c */
        private final g.h<T, h0> f4574c;

        /* renamed from: d */
        private final String f4575d;

        public j(Method method, int i, g.h<T, h0> hVar, String str) {
            this.f4572a = method;
            this.f4573b = i;
            this.f4574c = hVar;
            this.f4575d = str;
        }

        /* renamed from: d */
        public void a(r rVar, @Nullable Map<String, T> map) {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key == null) {
                        throw y.o(this.f4572a, this.f4573b, "Part map contained null key.", new Object[0]);
                    }
                    T value = entry.getValue();
                    if (value == null) {
                        Method method = this.f4572a;
                        int i = this.f4573b;
                        throw y.o(method, i, "Part map contained null value for key '" + key + "'.", new Object[0]);
                    }
                    rVar.d(e.y.g("Content-Disposition", "form-data; name=\"" + key + "\"", "Content-Transfer-Encoding", this.f4575d), this.f4574c.a(value));
                }
                return;
            }
            throw y.o(this.f4572a, this.f4573b, "Part map was null.", new Object[0]);
        }
    }

    /* loaded from: classes.dex */
    static final class k<T> extends p<T> {

        /* renamed from: a */
        private final Method f4576a;

        /* renamed from: b */
        private final int f4577b;

        /* renamed from: c */
        private final String f4578c;

        /* renamed from: d */
        private final g.h<T, String> f4579d;

        /* renamed from: e */
        private final boolean f4580e;

        public k(Method method, int i, String str, g.h<T, String> hVar, boolean z) {
            this.f4576a = method;
            this.f4577b = i;
            Objects.requireNonNull(str, "name == null");
            this.f4578c = str;
            this.f4579d = hVar;
            this.f4580e = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // g.p
        public void a(r rVar, @Nullable T t) {
            if (t != null) {
                rVar.f(this.f4578c, this.f4579d.a(t), this.f4580e);
                return;
            }
            Method method = this.f4576a;
            int i = this.f4577b;
            throw y.o(method, i, "Path parameter \"" + this.f4578c + "\" value must not be null.", new Object[0]);
        }
    }

    /* loaded from: classes.dex */
    static final class l<T> extends p<T> {

        /* renamed from: a */
        private final String f4581a;

        /* renamed from: b */
        private final g.h<T, String> f4582b;

        /* renamed from: c */
        private final boolean f4583c;

        public l(String str, g.h<T, String> hVar, boolean z) {
            Objects.requireNonNull(str, "name == null");
            this.f4581a = str;
            this.f4582b = hVar;
            this.f4583c = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // g.p
        public void a(r rVar, @Nullable T t) {
            String a2;
            if (t == null || (a2 = this.f4582b.a(t)) == null) {
                return;
            }
            rVar.g(this.f4581a, a2, this.f4583c);
        }
    }

    /* loaded from: classes.dex */
    static final class m<T> extends p<Map<String, T>> {

        /* renamed from: a */
        private final Method f4584a;

        /* renamed from: b */
        private final int f4585b;

        /* renamed from: c */
        private final g.h<T, String> f4586c;

        /* renamed from: d */
        private final boolean f4587d;

        public m(Method method, int i, g.h<T, String> hVar, boolean z) {
            this.f4584a = method;
            this.f4585b = i;
            this.f4586c = hVar;
            this.f4587d = z;
        }

        /* renamed from: d */
        public void a(r rVar, @Nullable Map<String, T> map) {
            if (map != null) {
                for (Map.Entry<String, T> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (key == null) {
                        throw y.o(this.f4584a, this.f4585b, "Query map contained null key.", new Object[0]);
                    }
                    T value = entry.getValue();
                    if (value == null) {
                        Method method = this.f4584a;
                        int i = this.f4585b;
                        throw y.o(method, i, "Query map contained null value for key '" + key + "'.", new Object[0]);
                    }
                    String a2 = this.f4586c.a(value);
                    if (a2 == null) {
                        Method method2 = this.f4584a;
                        int i2 = this.f4585b;
                        throw y.o(method2, i2, "Query map value '" + value + "' converted to null by " + this.f4586c.getClass().getName() + " for key '" + key + "'.", new Object[0]);
                    }
                    rVar.g(key, a2, this.f4587d);
                }
                return;
            }
            throw y.o(this.f4584a, this.f4585b, "Query map was null", new Object[0]);
        }
    }

    /* loaded from: classes.dex */
    static final class n<T> extends p<T> {

        /* renamed from: a */
        private final g.h<T, String> f4588a;

        /* renamed from: b */
        private final boolean f4589b;

        public n(g.h<T, String> hVar, boolean z) {
            this.f4588a = hVar;
            this.f4589b = z;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // g.p
        public void a(r rVar, @Nullable T t) {
            if (t == null) {
                return;
            }
            rVar.g(this.f4588a.a(t), null, this.f4589b);
        }
    }

    /* loaded from: classes.dex */
    static final class o extends p<c0.b> {

        /* renamed from: a */
        static final o f4590a = new o();

        private o() {
        }

        /* renamed from: d */
        public void a(r rVar, @Nullable c0.b bVar) {
            if (bVar != null) {
                rVar.e(bVar);
            }
        }
    }

    /* renamed from: g.p$p */
    /* loaded from: classes.dex */
    static final class C0120p extends p<Object> {

        /* renamed from: a */
        private final Method f4591a;

        /* renamed from: b */
        private final int f4592b;

        public C0120p(Method method, int i) {
            this.f4591a = method;
            this.f4592b = i;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // g.p
        public void a(r rVar, @Nullable Object obj) {
            if (obj != null) {
                rVar.m(obj);
                return;
            }
            throw y.o(this.f4591a, this.f4592b, "@Url parameter is null.", new Object[0]);
        }
    }

    /* loaded from: classes.dex */
    static final class q<T> extends p<T> {

        /* renamed from: a */
        final Class<T> f4593a;

        public q(Class<T> cls) {
            this.f4593a = cls;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // g.p
        public void a(r rVar, @Nullable T t) {
            rVar.h(this.f4593a, t);
        }
    }

    p() {
    }

    public abstract void a(r rVar, @Nullable T t);

    public final p<Object> b() {
        return new b();
    }

    public final p<Iterable<T>> c() {
        return new a();
    }
}
