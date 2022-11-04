package g;

import e.b0;
import e.c0;
import e.g0;
import e.y;
import e.z;
import g.p;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.URI;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import kotlin.coroutines.Continuation;
/* loaded from: classes.dex */
public final class s {

    /* renamed from: a */
    private final Method f4608a;

    /* renamed from: b */
    private final z f4609b;

    /* renamed from: c */
    final String f4610c;
    @Nullable

    /* renamed from: d */
    private final String f4611d;
    @Nullable

    /* renamed from: e */
    private final e.y f4612e;
    @Nullable

    /* renamed from: f */
    private final b0 f4613f;

    /* renamed from: g */
    private final boolean f4614g;

    /* renamed from: h */
    private final boolean f4615h;
    private final boolean i;
    private final p<?>[] j;
    final boolean k;

    /* loaded from: classes.dex */
    public static final class a {
        private static final Pattern x = Pattern.compile("\\{([a-zA-Z][a-zA-Z0-9_-]*)\\}");
        private static final Pattern y = Pattern.compile("[a-zA-Z][a-zA-Z0-9_-]*");

        /* renamed from: a */
        final u f4616a;

        /* renamed from: b */
        final Method f4617b;

        /* renamed from: c */
        final Annotation[] f4618c;

        /* renamed from: d */
        final Annotation[][] f4619d;

        /* renamed from: e */
        final Type[] f4620e;

        /* renamed from: f */
        boolean f4621f;

        /* renamed from: g */
        boolean f4622g;

        /* renamed from: h */
        boolean f4623h;
        boolean i;
        boolean j;
        boolean k;
        boolean l;
        boolean m;
        @Nullable
        String n;
        boolean o;
        boolean p;
        boolean q;
        @Nullable
        String r;
        @Nullable
        e.y s;
        @Nullable
        b0 t;
        @Nullable
        Set<String> u;
        @Nullable
        p<?>[] v;
        boolean w;

        a(u uVar, Method method) {
            this.f4616a = uVar;
            this.f4617b = method;
            this.f4618c = method.getAnnotations();
            this.f4620e = method.getGenericParameterTypes();
            this.f4619d = method.getParameterAnnotations();
        }

        private static Class<?> a(Class<?> cls) {
            return Boolean.TYPE == cls ? Boolean.class : Byte.TYPE == cls ? Byte.class : Character.TYPE == cls ? Character.class : Double.TYPE == cls ? Double.class : Float.TYPE == cls ? Float.class : Integer.TYPE == cls ? Integer.class : Long.TYPE == cls ? Long.class : Short.TYPE == cls ? Short.class : cls;
        }

        private e.y c(String[] strArr) {
            y.a aVar = new y.a();
            for (String str : strArr) {
                int indexOf = str.indexOf(58);
                if (indexOf == -1 || indexOf == 0 || indexOf == str.length() - 1) {
                    throw y.m(this.f4617b, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str);
                }
                String substring = str.substring(0, indexOf);
                String trim = str.substring(indexOf + 1).trim();
                if ("Content-Type".equalsIgnoreCase(substring)) {
                    try {
                        this.t = b0.b(trim);
                    } catch (IllegalArgumentException e2) {
                        throw y.n(this.f4617b, e2, "Malformed content type: %s", trim);
                    }
                } else {
                    aVar.a(substring, trim);
                }
            }
            return aVar.e();
        }

        private void d(String str, String str2, boolean z) {
            String str3 = this.n;
            if (str3 == null) {
                this.n = str;
                this.o = z;
                if (str2.isEmpty()) {
                    return;
                }
                int indexOf = str2.indexOf(63);
                if (indexOf != -1 && indexOf < str2.length() - 1) {
                    String substring = str2.substring(indexOf + 1);
                    if (x.matcher(substring).find()) {
                        throw y.m(this.f4617b, "URL query string \"%s\" must not have replace block. For dynamic query parameters use @Query.", substring);
                    }
                }
                this.r = str2;
                this.u = h(str2);
                return;
            }
            throw y.m(this.f4617b, "Only one HTTP method is allowed. Found: %s and %s.", str3, str);
        }

        private void e(Annotation annotation) {
            String value;
            String str;
            String value2;
            String str2;
            if (annotation instanceof g.a0.b) {
                value = ((g.a0.b) annotation).value();
                str = "DELETE";
            } else if (annotation instanceof g.a0.f) {
                value = ((g.a0.f) annotation).value();
                str = "GET";
            } else if (!(annotation instanceof g.a0.g)) {
                if (annotation instanceof g.a0.n) {
                    value2 = ((g.a0.n) annotation).value();
                    str2 = "PATCH";
                } else if (annotation instanceof g.a0.o) {
                    value2 = ((g.a0.o) annotation).value();
                    str2 = "POST";
                } else if (annotation instanceof g.a0.p) {
                    value2 = ((g.a0.p) annotation).value();
                    str2 = "PUT";
                } else if (!(annotation instanceof g.a0.m)) {
                    if (annotation instanceof g.a0.h) {
                        g.a0.h hVar = (g.a0.h) annotation;
                        d(hVar.method(), hVar.path(), hVar.hasBody());
                        return;
                    } else if (annotation instanceof g.a0.k) {
                        String[] value3 = ((g.a0.k) annotation).value();
                        if (value3.length == 0) {
                            throw y.m(this.f4617b, "@Headers annotation is empty.", new Object[0]);
                        }
                        this.s = c(value3);
                        return;
                    } else if (annotation instanceof g.a0.l) {
                        if (this.p) {
                            throw y.m(this.f4617b, "Only one encoding annotation is allowed.", new Object[0]);
                        }
                        this.q = true;
                        return;
                    } else if (!(annotation instanceof g.a0.e)) {
                        return;
                    } else {
                        if (this.q) {
                            throw y.m(this.f4617b, "Only one encoding annotation is allowed.", new Object[0]);
                        }
                        this.p = true;
                        return;
                    }
                } else {
                    value = ((g.a0.m) annotation).value();
                    str = "OPTIONS";
                }
                d(str2, value2, true);
                return;
            } else {
                value = ((g.a0.g) annotation).value();
                str = "HEAD";
            }
            d(str, value, false);
        }

        @Nullable
        private p<?> f(int i, Type type, @Nullable Annotation[] annotationArr, boolean z) {
            p<?> pVar;
            if (annotationArr != null) {
                pVar = null;
                for (Annotation annotation : annotationArr) {
                    p<?> g2 = g(i, type, annotationArr, annotation);
                    if (g2 != null) {
                        if (pVar != null) {
                            throw y.o(this.f4617b, i, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                        }
                        pVar = g2;
                    }
                }
            } else {
                pVar = null;
            }
            if (pVar == null) {
                if (z) {
                    try {
                        if (y.h(type) == Continuation.class) {
                            this.w = true;
                            return null;
                        }
                    } catch (NoClassDefFoundError unused) {
                    }
                }
                throw y.o(this.f4617b, i, "No Retrofit annotation found.", new Object[0]);
            }
            return pVar;
        }

        @Nullable
        private p<?> g(int i, Type type, Annotation[] annotationArr, Annotation annotation) {
            if (annotation instanceof g.a0.y) {
                j(i, type);
                if (this.m) {
                    throw y.o(this.f4617b, i, "Multiple @Url method annotations found.", new Object[0]);
                }
                if (this.i) {
                    throw y.o(this.f4617b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.j) {
                    throw y.o(this.f4617b, i, "A @Url parameter must not come after a @Query.", new Object[0]);
                }
                if (this.k) {
                    throw y.o(this.f4617b, i, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.l) {
                    throw y.o(this.f4617b, i, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.r != null) {
                    throw y.o(this.f4617b, i, "@Url cannot be used with @%s URL", this.n);
                }
                this.m = true;
                if (type != z.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                    throw y.o(this.f4617b, i, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                }
                return new p.C0120p(this.f4617b, i);
            } else if (annotation instanceof g.a0.s) {
                j(i, type);
                if (this.j) {
                    throw y.o(this.f4617b, i, "A @Path parameter must not come after a @Query.", new Object[0]);
                }
                if (this.k) {
                    throw y.o(this.f4617b, i, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                }
                if (this.l) {
                    throw y.o(this.f4617b, i, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                }
                if (this.m) {
                    throw y.o(this.f4617b, i, "@Path parameters may not be used with @Url.", new Object[0]);
                }
                if (this.r == null) {
                    throw y.o(this.f4617b, i, "@Path can only be used with relative url on @%s", this.n);
                }
                this.i = true;
                g.a0.s sVar = (g.a0.s) annotation;
                String value = sVar.value();
                i(i, value);
                return new p.k(this.f4617b, i, value, this.f4616a.i(type, annotationArr), sVar.encoded());
            } else if (annotation instanceof g.a0.t) {
                j(i, type);
                g.a0.t tVar = (g.a0.t) annotation;
                String value2 = tVar.value();
                boolean encoded = tVar.encoded();
                Class<?> h2 = y.h(type);
                this.j = true;
                if (!Iterable.class.isAssignableFrom(h2)) {
                    return h2.isArray() ? new p.l(value2, this.f4616a.i(a(h2.getComponentType()), annotationArr), encoded).b() : new p.l(value2, this.f4616a.i(type, annotationArr), encoded);
                } else if (type instanceof ParameterizedType) {
                    return new p.l(value2, this.f4616a.i(y.g(0, (ParameterizedType) type), annotationArr), encoded).c();
                } else {
                    throw y.o(this.f4617b, i, h2.getSimpleName() + " must include generic type (e.g., " + h2.getSimpleName() + "<String>)", new Object[0]);
                }
            } else if (annotation instanceof g.a0.v) {
                j(i, type);
                boolean encoded2 = ((g.a0.v) annotation).encoded();
                Class<?> h3 = y.h(type);
                this.k = true;
                if (!Iterable.class.isAssignableFrom(h3)) {
                    return h3.isArray() ? new p.n(this.f4616a.i(a(h3.getComponentType()), annotationArr), encoded2).b() : new p.n(this.f4616a.i(type, annotationArr), encoded2);
                } else if (type instanceof ParameterizedType) {
                    return new p.n(this.f4616a.i(y.g(0, (ParameterizedType) type), annotationArr), encoded2).c();
                } else {
                    throw y.o(this.f4617b, i, h3.getSimpleName() + " must include generic type (e.g., " + h3.getSimpleName() + "<String>)", new Object[0]);
                }
            } else if (annotation instanceof g.a0.u) {
                j(i, type);
                Class<?> h4 = y.h(type);
                this.l = true;
                if (!Map.class.isAssignableFrom(h4)) {
                    throw y.o(this.f4617b, i, "@QueryMap parameter type must be Map.", new Object[0]);
                }
                Type i2 = y.i(type, h4, Map.class);
                if (!(i2 instanceof ParameterizedType)) {
                    throw y.o(this.f4617b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType = (ParameterizedType) i2;
                Type g2 = y.g(0, parameterizedType);
                if (String.class == g2) {
                    return new p.m(this.f4617b, i, this.f4616a.i(y.g(1, parameterizedType), annotationArr), ((g.a0.u) annotation).encoded());
                }
                throw y.o(this.f4617b, i, "@QueryMap keys must be of type String: " + g2, new Object[0]);
            } else if (annotation instanceof g.a0.i) {
                j(i, type);
                String value3 = ((g.a0.i) annotation).value();
                Class<?> h5 = y.h(type);
                if (!Iterable.class.isAssignableFrom(h5)) {
                    return h5.isArray() ? new p.f(value3, this.f4616a.i(a(h5.getComponentType()), annotationArr)).b() : new p.f(value3, this.f4616a.i(type, annotationArr));
                } else if (type instanceof ParameterizedType) {
                    return new p.f(value3, this.f4616a.i(y.g(0, (ParameterizedType) type), annotationArr)).c();
                } else {
                    throw y.o(this.f4617b, i, h5.getSimpleName() + " must include generic type (e.g., " + h5.getSimpleName() + "<String>)", new Object[0]);
                }
            } else if (annotation instanceof g.a0.j) {
                if (type == e.y.class) {
                    return new p.h(this.f4617b, i);
                }
                j(i, type);
                Class<?> h6 = y.h(type);
                if (!Map.class.isAssignableFrom(h6)) {
                    throw y.o(this.f4617b, i, "@HeaderMap parameter type must be Map.", new Object[0]);
                }
                Type i3 = y.i(type, h6, Map.class);
                if (!(i3 instanceof ParameterizedType)) {
                    throw y.o(this.f4617b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) i3;
                Type g3 = y.g(0, parameterizedType2);
                if (String.class == g3) {
                    return new p.g(this.f4617b, i, this.f4616a.i(y.g(1, parameterizedType2), annotationArr));
                }
                throw y.o(this.f4617b, i, "@HeaderMap keys must be of type String: " + g3, new Object[0]);
            } else if (annotation instanceof g.a0.c) {
                j(i, type);
                if (!this.p) {
                    throw y.o(this.f4617b, i, "@Field parameters can only be used with form encoding.", new Object[0]);
                }
                g.a0.c cVar = (g.a0.c) annotation;
                String value4 = cVar.value();
                boolean encoded3 = cVar.encoded();
                this.f4621f = true;
                Class<?> h7 = y.h(type);
                if (!Iterable.class.isAssignableFrom(h7)) {
                    return h7.isArray() ? new p.d(value4, this.f4616a.i(a(h7.getComponentType()), annotationArr), encoded3).b() : new p.d(value4, this.f4616a.i(type, annotationArr), encoded3);
                } else if (type instanceof ParameterizedType) {
                    return new p.d(value4, this.f4616a.i(y.g(0, (ParameterizedType) type), annotationArr), encoded3).c();
                } else {
                    throw y.o(this.f4617b, i, h7.getSimpleName() + " must include generic type (e.g., " + h7.getSimpleName() + "<String>)", new Object[0]);
                }
            } else if (annotation instanceof g.a0.d) {
                j(i, type);
                if (!this.p) {
                    throw y.o(this.f4617b, i, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                }
                Class<?> h8 = y.h(type);
                if (!Map.class.isAssignableFrom(h8)) {
                    throw y.o(this.f4617b, i, "@FieldMap parameter type must be Map.", new Object[0]);
                }
                Type i4 = y.i(type, h8, Map.class);
                if (!(i4 instanceof ParameterizedType)) {
                    throw y.o(this.f4617b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType3 = (ParameterizedType) i4;
                Type g4 = y.g(0, parameterizedType3);
                if (String.class == g4) {
                    h i5 = this.f4616a.i(y.g(1, parameterizedType3), annotationArr);
                    this.f4621f = true;
                    return new p.e(this.f4617b, i, i5, ((g.a0.d) annotation).encoded());
                }
                throw y.o(this.f4617b, i, "@FieldMap keys must be of type String: " + g4, new Object[0]);
            } else if (annotation instanceof g.a0.q) {
                j(i, type);
                if (!this.q) {
                    throw y.o(this.f4617b, i, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                }
                g.a0.q qVar = (g.a0.q) annotation;
                this.f4622g = true;
                String value5 = qVar.value();
                Class<?> h9 = y.h(type);
                if (value5.isEmpty()) {
                    if (Iterable.class.isAssignableFrom(h9)) {
                        if (!(type instanceof ParameterizedType)) {
                            throw y.o(this.f4617b, i, h9.getSimpleName() + " must include generic type (e.g., " + h9.getSimpleName() + "<String>)", new Object[0]);
                        } else {
                            if (!c0.b.class.isAssignableFrom(y.h(y.g(0, (ParameterizedType) type)))) {
                                throw y.o(this.f4617b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                            }
                            return p.o.f4590a.c();
                        }
                    } else if (h9.isArray()) {
                        if (!c0.b.class.isAssignableFrom(h9.getComponentType())) {
                            throw y.o(this.f4617b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                        }
                        return p.o.f4590a.b();
                    } else if (c0.b.class.isAssignableFrom(h9)) {
                        return p.o.f4590a;
                    } else {
                        throw y.o(this.f4617b, i, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                    }
                }
                e.y g5 = e.y.g("Content-Disposition", "form-data; name=\"" + value5 + "\"", "Content-Transfer-Encoding", qVar.encoding());
                if (Iterable.class.isAssignableFrom(h9)) {
                    if (!(type instanceof ParameterizedType)) {
                        throw y.o(this.f4617b, i, h9.getSimpleName() + " must include generic type (e.g., " + h9.getSimpleName() + "<String>)", new Object[0]);
                    } else {
                        Type g6 = y.g(0, (ParameterizedType) type);
                        if (c0.b.class.isAssignableFrom(y.h(g6))) {
                            throw y.o(this.f4617b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                        }
                        return new p.i(this.f4617b, i, g5, this.f4616a.g(g6, annotationArr, this.f4618c)).c();
                    }
                }
                if (!h9.isArray()) {
                    if (c0.b.class.isAssignableFrom(h9)) {
                        throw y.o(this.f4617b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                    }
                    return new p.i(this.f4617b, i, g5, this.f4616a.g(type, annotationArr, this.f4618c));
                }
                Class<?> a2 = a(h9.getComponentType());
                if (c0.b.class.isAssignableFrom(a2)) {
                    throw y.o(this.f4617b, i, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                }
                return new p.i(this.f4617b, i, g5, this.f4616a.g(a2, annotationArr, this.f4618c)).b();
            } else if (annotation instanceof g.a0.r) {
                j(i, type);
                if (!this.q) {
                    throw y.o(this.f4617b, i, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                }
                this.f4622g = true;
                Class<?> h10 = y.h(type);
                if (!Map.class.isAssignableFrom(h10)) {
                    throw y.o(this.f4617b, i, "@PartMap parameter type must be Map.", new Object[0]);
                }
                Type i6 = y.i(type, h10, Map.class);
                if (!(i6 instanceof ParameterizedType)) {
                    throw y.o(this.f4617b, i, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                }
                ParameterizedType parameterizedType4 = (ParameterizedType) i6;
                Type g7 = y.g(0, parameterizedType4);
                if (String.class == g7) {
                    Type g8 = y.g(1, parameterizedType4);
                    if (c0.b.class.isAssignableFrom(y.h(g8))) {
                        throw y.o(this.f4617b, i, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                    }
                    return new p.j(this.f4617b, i, this.f4616a.g(g8, annotationArr, this.f4618c), ((g.a0.r) annotation).encoding());
                }
                throw y.o(this.f4617b, i, "@PartMap keys must be of type String: " + g7, new Object[0]);
            } else if (!(annotation instanceof g.a0.a)) {
                if (!(annotation instanceof g.a0.x)) {
                    return null;
                } else {
                    j(i, type);
                    Class<?> h11 = y.h(type);
                    for (int i7 = i - 1; i7 >= 0; i7--) {
                        p<?> pVar = this.v[i7];
                        if ((pVar instanceof p.q) && ((p.q) pVar).f4593a.equals(h11)) {
                            throw y.o(this.f4617b, i, "@Tag type " + h11.getName() + " is duplicate of parameter #" + (i7 + 1) + " and would always overwrite its value.", new Object[0]);
                        }
                    }
                    return new p.q(h11);
                }
            } else {
                j(i, type);
                if (this.p || this.q) {
                    throw y.o(this.f4617b, i, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                }
                if (this.f4623h) {
                    throw y.o(this.f4617b, i, "Multiple @Body method annotations found.", new Object[0]);
                }
                try {
                    h g9 = this.f4616a.g(type, annotationArr, this.f4618c);
                    this.f4623h = true;
                    return new p.c(this.f4617b, i, g9);
                } catch (RuntimeException e2) {
                    throw y.p(this.f4617b, e2, i, "Unable to create @Body converter for %s", type);
                }
            }
        }

        static Set<String> h(String str) {
            Matcher matcher = x.matcher(str);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            while (matcher.find()) {
                linkedHashSet.add(matcher.group(1));
            }
            return linkedHashSet;
        }

        private void i(int i, String str) {
            if (y.matcher(str).matches()) {
                if (!this.u.contains(str)) {
                    throw y.o(this.f4617b, i, "URL \"%s\" does not contain \"{%s}\".", this.r, str);
                }
                return;
            }
            throw y.o(this.f4617b, i, "@Path parameter name must match %s. Found: %s", x.pattern(), str);
        }

        private void j(int i, Type type) {
            if (!y.j(type)) {
                return;
            }
            throw y.o(this.f4617b, i, "Parameter type must not include a type variable or wildcard: %s", type);
        }

        s b() {
            for (Annotation annotation : this.f4618c) {
                e(annotation);
            }
            if (this.n != null) {
                if (!this.o) {
                    if (this.q) {
                        throw y.m(this.f4617b, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (this.p) {
                        throw y.m(this.f4617b, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                int length = this.f4619d.length;
                this.v = new p[length];
                int i = length - 1;
                int i2 = 0;
                while (true) {
                    boolean z = true;
                    if (i2 >= length) {
                        break;
                    }
                    p<?>[] pVarArr = this.v;
                    Type type = this.f4620e[i2];
                    Annotation[] annotationArr = this.f4619d[i2];
                    if (i2 != i) {
                        z = false;
                    }
                    pVarArr[i2] = f(i2, type, annotationArr, z);
                    i2++;
                }
                if (this.r == null && !this.m) {
                    throw y.m(this.f4617b, "Missing either @%s URL or @Url parameter.", this.n);
                }
                boolean z2 = this.p;
                if (!z2 && !this.q && !this.o && this.f4623h) {
                    throw y.m(this.f4617b, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z2 && !this.f4621f) {
                    throw y.m(this.f4617b, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (this.q && !this.f4622g) {
                    throw y.m(this.f4617b, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                return new s(this);
            }
            throw y.m(this.f4617b, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
        }
    }

    s(a aVar) {
        this.f4608a = aVar.f4617b;
        this.f4609b = aVar.f4616a.f4628c;
        this.f4610c = aVar.n;
        this.f4611d = aVar.r;
        this.f4612e = aVar.s;
        this.f4613f = aVar.t;
        this.f4614g = aVar.o;
        this.f4615h = aVar.p;
        this.i = aVar.q;
        this.j = aVar.v;
        this.k = aVar.w;
    }

    public static s b(u uVar, Method method) {
        return new a(uVar, method).b();
    }

    public g0 a(Object[] objArr) {
        p<?>[] pVarArr = this.j;
        int length = objArr.length;
        if (length != pVarArr.length) {
            throw new IllegalArgumentException("Argument count (" + length + ") doesn't match expected count (" + pVarArr.length + ")");
        }
        r rVar = new r(this.f4610c, this.f4609b, this.f4611d, this.f4612e, this.f4613f, this.f4614g, this.f4615h, this.i);
        if (this.k) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            pVarArr[i].a(rVar, objArr[i]);
        }
        g0.a k = rVar.k();
        k.f(l.class, new l(this.f4608a, arrayList));
        return k.a();
    }
}
