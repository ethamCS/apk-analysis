package g;

import e.i0;
import e.j;
import e.j0;
import g.y;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import javax.annotation.Nullable;
import kotlin.coroutines.Continuation;
/* loaded from: classes.dex */
public abstract class k<ResponseT, ReturnT> extends v<ReturnT> {

    /* renamed from: a */
    private final s f4512a;

    /* renamed from: b */
    private final j.a f4513b;

    /* renamed from: c */
    private final h<j0, ResponseT> f4514c;

    /* loaded from: classes.dex */
    public static final class a<ResponseT, ReturnT> extends k<ResponseT, ReturnT> {

        /* renamed from: d */
        private final e<ResponseT, ReturnT> f4515d;

        a(s sVar, j.a aVar, h<j0, ResponseT> hVar, e<ResponseT, ReturnT> eVar) {
            super(sVar, aVar, hVar);
            this.f4515d = eVar;
        }

        @Override // g.k
        protected ReturnT c(d<ResponseT> dVar, Object[] objArr) {
            return this.f4515d.b(dVar);
        }
    }

    /* loaded from: classes.dex */
    public static final class b<ResponseT> extends k<ResponseT, Object> {

        /* renamed from: d */
        private final e<ResponseT, d<ResponseT>> f4516d;

        /* renamed from: e */
        private final boolean f4517e;

        b(s sVar, j.a aVar, h<j0, ResponseT> hVar, e<ResponseT, d<ResponseT>> eVar, boolean z) {
            super(sVar, aVar, hVar);
            this.f4516d = eVar;
            this.f4517e = z;
        }

        @Override // g.k
        protected Object c(d<ResponseT> dVar, Object[] objArr) {
            d<ResponseT> b2 = this.f4516d.b(dVar);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                return this.f4517e ? m.b(b2, continuation) : m.a(b2, continuation);
            } catch (Exception e2) {
                return m.d(e2, continuation);
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class c<ResponseT> extends k<ResponseT, Object> {

        /* renamed from: d */
        private final e<ResponseT, d<ResponseT>> f4518d;

        c(s sVar, j.a aVar, h<j0, ResponseT> hVar, e<ResponseT, d<ResponseT>> eVar) {
            super(sVar, aVar, hVar);
            this.f4518d = eVar;
        }

        @Override // g.k
        protected Object c(d<ResponseT> dVar, Object[] objArr) {
            d<ResponseT> b2 = this.f4518d.b(dVar);
            Continuation continuation = (Continuation) objArr[objArr.length - 1];
            try {
                return m.c(b2, continuation);
            } catch (Exception e2) {
                return m.d(e2, continuation);
            }
        }
    }

    k(s sVar, j.a aVar, h<j0, ResponseT> hVar) {
        this.f4512a = sVar;
        this.f4513b = aVar;
        this.f4514c = hVar;
    }

    private static <ResponseT, ReturnT> e<ResponseT, ReturnT> d(u uVar, Method method, Type type, Annotation[] annotationArr) {
        try {
            return (e<ResponseT, ReturnT>) uVar.a(type, annotationArr);
        } catch (RuntimeException e2) {
            throw y.n(method, e2, "Unable to create call adapter for %s", type);
        }
    }

    private static <ResponseT> h<j0, ResponseT> e(u uVar, Method method, Type type) {
        try {
            return uVar.h(type, method.getAnnotations());
        } catch (RuntimeException e2) {
            throw y.n(method, e2, "Unable to create converter for %s", type);
        }
    }

    public static <ResponseT, ReturnT> k<ResponseT, ReturnT> f(u uVar, Method method, s sVar) {
        Type type;
        boolean z;
        boolean z2 = sVar.k;
        Annotation[] annotations = method.getAnnotations();
        if (z2) {
            Type[] genericParameterTypes = method.getGenericParameterTypes();
            Type f2 = y.f(0, (ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]);
            if (y.h(f2) != t.class || !(f2 instanceof ParameterizedType)) {
                z = false;
            } else {
                f2 = y.g(0, (ParameterizedType) f2);
                z = true;
            }
            type = new y.b(null, d.class, f2);
            annotations = x.a(annotations);
        } else {
            type = method.getGenericReturnType();
            z = false;
        }
        e d2 = d(uVar, method, type, annotations);
        Type a2 = d2.a();
        if (a2 == i0.class) {
            throw y.m(method, "'" + y.h(a2).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
        } else if (a2 == t.class) {
            throw y.m(method, "Response must include generic type (e.g., Response<String>)", new Object[0]);
        } else {
            if (sVar.f4610c.equals("HEAD") && !Void.class.equals(a2)) {
                throw y.m(method, "HEAD method must use Void as response type.", new Object[0]);
            }
            h e2 = e(uVar, method, a2);
            j.a aVar = uVar.f4627b;
            return !z2 ? new a(sVar, aVar, e2, d2) : z ? new c(sVar, aVar, e2, d2) : new b(sVar, aVar, e2, d2, false);
        }
    }

    @Override // g.v
    @Nullable
    public final ReturnT a(Object[] objArr) {
        return c(new n(this.f4512a, objArr, this.f4513b, this.f4514c), objArr);
    }

    @Nullable
    protected abstract ReturnT c(d<ResponseT> dVar, Object[] objArr);
}
