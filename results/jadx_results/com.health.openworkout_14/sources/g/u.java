package g;

import e.d0;
import e.h0;
import e.j;
import e.j0;
import e.z;
import g.c;
import g.e;
import g.h;
import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a */
    private final Map<Method, v<?>> f4626a = new ConcurrentHashMap();

    /* renamed from: b */
    final j.a f4627b;

    /* renamed from: c */
    final z f4628c;

    /* renamed from: d */
    final List<h.a> f4629d;

    /* renamed from: e */
    final List<e.a> f4630e;

    /* renamed from: f */
    final boolean f4631f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements InvocationHandler {

        /* renamed from: a */
        private final q f4632a = q.f();

        /* renamed from: b */
        private final Object[] f4633b = new Object[0];

        /* renamed from: c */
        final /* synthetic */ Class f4634c;

        a(Class cls) {
            u.this = r1;
            this.f4634c = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        @Nullable
        public Object invoke(Object obj, Method method, @Nullable Object[] objArr) {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (this.f4632a.h(method)) {
                return this.f4632a.g(method, this.f4634c, obj, objArr);
            }
            v<?> c2 = u.this.c(method);
            if (objArr == null) {
                objArr = this.f4633b;
            }
            return c2.a(objArr);
        }
    }

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a */
        private final q f4636a;
        @Nullable

        /* renamed from: b */
        private j.a f4637b;
        @Nullable

        /* renamed from: c */
        private z f4638c;

        /* renamed from: d */
        private final List<h.a> f4639d;

        /* renamed from: e */
        private final List<e.a> f4640e;
        @Nullable

        /* renamed from: f */
        private Executor f4641f;

        /* renamed from: g */
        private boolean f4642g;

        public b() {
            this(q.f());
        }

        b(q qVar) {
            this.f4639d = new ArrayList();
            this.f4640e = new ArrayList();
            this.f4636a = qVar;
        }

        public b a(h.a aVar) {
            List<h.a> list = this.f4639d;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b b(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            c(z.l(str));
            return this;
        }

        public b c(z zVar) {
            Objects.requireNonNull(zVar, "baseUrl == null");
            List<String> r = zVar.r();
            if ("".equals(r.get(r.size() - 1))) {
                this.f4638c = zVar;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + zVar);
        }

        public u d() {
            if (this.f4638c != null) {
                j.a aVar = this.f4637b;
                if (aVar == null) {
                    aVar = new d0();
                }
                j.a aVar2 = aVar;
                Executor executor = this.f4641f;
                if (executor == null) {
                    executor = this.f4636a.b();
                }
                Executor executor2 = executor;
                ArrayList arrayList = new ArrayList(this.f4640e);
                arrayList.addAll(this.f4636a.a(executor2));
                ArrayList arrayList2 = new ArrayList(this.f4639d.size() + 1 + this.f4636a.d());
                arrayList2.add(new c());
                arrayList2.addAll(this.f4639d);
                arrayList2.addAll(this.f4636a.c());
                return new u(aVar2, this.f4638c, Collections.unmodifiableList(arrayList2), Collections.unmodifiableList(arrayList), executor2, this.f4642g);
            }
            throw new IllegalStateException("Base URL required.");
        }
    }

    u(j.a aVar, z zVar, List<h.a> list, List<e.a> list2, @Nullable Executor executor, boolean z) {
        this.f4627b = aVar;
        this.f4628c = zVar;
        this.f4629d = list;
        this.f4630e = list2;
        this.f4631f = z;
    }

    private void j(Class<?> cls) {
        Method[] declaredMethods;
        if (cls.isInterface()) {
            ArrayDeque arrayDeque = new ArrayDeque(1);
            arrayDeque.add(cls);
            while (!arrayDeque.isEmpty()) {
                Class<?> cls2 = (Class) arrayDeque.removeFirst();
                if (cls2.getTypeParameters().length != 0) {
                    StringBuilder sb = new StringBuilder("Type parameters are unsupported on ");
                    sb.append(cls2.getName());
                    if (cls2 != cls) {
                        sb.append(" which is an interface of ");
                        sb.append(cls.getName());
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
                Collections.addAll(arrayDeque, cls2.getInterfaces());
            }
            if (!this.f4631f) {
                return;
            }
            q f2 = q.f();
            for (Method method : cls.getDeclaredMethods()) {
                if (!f2.h(method) && !Modifier.isStatic(method.getModifiers())) {
                    c(method);
                }
            }
            return;
        }
        throw new IllegalArgumentException("API declarations must be interfaces.");
    }

    public e<?, ?> a(Type type, Annotation[] annotationArr) {
        return d(null, type, annotationArr);
    }

    public <T> T b(Class<T> cls) {
        j(cls);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    v<?> c(Method method) {
        v<?> vVar;
        v<?> vVar2 = this.f4626a.get(method);
        if (vVar2 != null) {
            return vVar2;
        }
        synchronized (this.f4626a) {
            vVar = this.f4626a.get(method);
            if (vVar == null) {
                vVar = v.b(this, method);
                this.f4626a.put(method, vVar);
            }
        }
        return vVar;
    }

    public e<?, ?> d(@Nullable e.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f4630e.indexOf(aVar) + 1;
        int size = this.f4630e.size();
        for (int i = indexOf; i < size; i++) {
            e<?, ?> a2 = this.f4630e.get(i).a(type, annotationArr, this);
            if (a2 != null) {
                return a2;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate call adapter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f4630e.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f4630e.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f4630e.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> h<T, h0> e(@Nullable h.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int indexOf = this.f4629d.indexOf(aVar) + 1;
        int size = this.f4629d.size();
        for (int i = indexOf; i < size; i++) {
            h<T, h0> hVar = (h<T, h0>) this.f4629d.get(i).c(type, annotationArr, annotationArr2, this);
            if (hVar != null) {
                return hVar;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate RequestBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f4629d.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f4629d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f4629d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> h<j0, T> f(@Nullable h.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int indexOf = this.f4629d.indexOf(aVar) + 1;
        int size = this.f4629d.size();
        for (int i = indexOf; i < size; i++) {
            h<j0, T> hVar = (h<j0, T>) this.f4629d.get(i).d(type, annotationArr, this);
            if (hVar != null) {
                return hVar;
            }
        }
        StringBuilder sb = new StringBuilder("Could not locate ResponseBody converter for ");
        sb.append(type);
        sb.append(".\n");
        if (aVar != null) {
            sb.append("  Skipped:");
            for (int i2 = 0; i2 < indexOf; i2++) {
                sb.append("\n   * ");
                sb.append(this.f4629d.get(i2).getClass().getName());
            }
            sb.append('\n');
        }
        sb.append("  Tried:");
        int size2 = this.f4629d.size();
        while (indexOf < size2) {
            sb.append("\n   * ");
            sb.append(this.f4629d.get(indexOf).getClass().getName());
            indexOf++;
        }
        throw new IllegalArgumentException(sb.toString());
    }

    public <T> h<T, h0> g(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return e(null, type, annotationArr, annotationArr2);
    }

    public <T> h<j0, T> h(Type type, Annotation[] annotationArr) {
        return f(null, type, annotationArr);
    }

    public <T> h<T, String> i(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f4629d.size();
        for (int i = 0; i < size; i++) {
            h<T, String> hVar = (h<T, String>) this.f4629d.get(i).e(type, annotationArr, this);
            if (hVar != null) {
                return hVar;
            }
        }
        return c.d.f4496a;
    }
}
