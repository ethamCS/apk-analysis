package y5;

import com.google.crypto.tink.shaded.protobuf.s0;
import f6.a0;
import f6.c0;
import f6.y;
import f6.z;
import j$.util.concurrent.ConcurrentHashMap;
import java.security.GeneralSecurityException;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.logging.Logger;
import y5.p;
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a */
    private static final Logger f25835a = Logger.getLogger(r.class.getName());

    /* renamed from: b */
    private static final ConcurrentMap<String, d> f25836b = new ConcurrentHashMap();

    /* renamed from: c */
    private static final ConcurrentMap<String, c> f25837c = new ConcurrentHashMap();

    /* renamed from: d */
    private static final ConcurrentMap<String, Boolean> f25838d = new ConcurrentHashMap();

    /* renamed from: e */
    private static final ConcurrentMap<String, Object> f25839e = new ConcurrentHashMap();

    /* renamed from: f */
    private static final ConcurrentMap<Class<?>, q<?, ?>> f25840f = new ConcurrentHashMap();

    /* loaded from: classes.dex */
    public class a implements d {

        /* renamed from: a */
        final /* synthetic */ h f25841a;

        a(h hVar) {
            this.f25841a = hVar;
        }

        @Override // y5.r.d
        public <Q> e<Q> a(Class<Q> cls) {
            try {
                return new f(this.f25841a, cls);
            } catch (IllegalArgumentException e10) {
                throw new GeneralSecurityException("Primitive type not supported", e10);
            }
        }

        @Override // y5.r.d
        public e<?> b() {
            h hVar = this.f25841a;
            return new f(hVar, hVar.a());
        }

        @Override // y5.r.d
        public Class<?> c() {
            return this.f25841a.getClass();
        }

        @Override // y5.r.d
        public Set<Class<?>> d() {
            return this.f25841a.h();
        }
    }

    /* loaded from: classes.dex */
    public class b implements c {

        /* renamed from: a */
        final /* synthetic */ h f25842a;

        b(h hVar) {
            this.f25842a = hVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface c {
    }

    /* loaded from: classes.dex */
    public interface d {
        <P> e<P> a(Class<P> cls);

        e<?> b();

        Class<?> c();

        Set<Class<?>> d();
    }

    private r() {
    }

    private static <T> T a(T t10) {
        Objects.requireNonNull(t10);
        return t10;
    }

    private static <KeyProtoT extends s0> d b(h<KeyProtoT> hVar) {
        return new a(hVar);
    }

    private static <KeyProtoT extends s0> c c(h<KeyProtoT> hVar) {
        return new b(hVar);
    }

    private static synchronized void d(String str, Class<?> cls, boolean z10) {
        synchronized (r.class) {
            ConcurrentMap<String, d> concurrentMap = f25836b;
            if (!concurrentMap.containsKey(str)) {
                return;
            }
            d dVar = concurrentMap.get(str);
            if (!dVar.c().equals(cls)) {
                Logger logger = f25835a;
                logger.warning("Attempted overwrite of a registered key manager for key type " + str);
                throw new GeneralSecurityException(String.format("typeUrl (%s) is already registered with %s, cannot be re-registered with %s", str, dVar.c().getName(), cls.getName()));
            }
            if (z10 && !f25838d.get(str).booleanValue()) {
                throw new GeneralSecurityException("New keys are already disallowed for key type " + str);
            }
        }
    }

    public static Class<?> e(Class<?> cls) {
        q<?, ?> qVar = f25840f.get(cls);
        if (qVar == null) {
            return null;
        }
        return qVar.a();
    }

    private static synchronized d f(String str) {
        d dVar;
        synchronized (r.class) {
            ConcurrentMap<String, d> concurrentMap = f25836b;
            if (!concurrentMap.containsKey(str)) {
                throw new GeneralSecurityException("No key manager found for key type " + str);
            }
            dVar = concurrentMap.get(str);
        }
        return dVar;
    }

    private static <P> e<P> g(String str, Class<P> cls) {
        d f10 = f(str);
        if (cls == null) {
            return (e<P>) f10.b();
        }
        if (f10.d().contains(cls)) {
            return f10.a(cls);
        }
        throw new GeneralSecurityException("Primitive type " + cls.getName() + " not supported by key manager of type " + f10.c() + ", supported primitives: " + s(f10.d()));
    }

    public static <P> P h(String str, com.google.crypto.tink.shaded.protobuf.i iVar, Class<P> cls) {
        return (P) j(str, iVar, (Class) a(cls));
    }

    public static <P> P i(String str, byte[] bArr, Class<P> cls) {
        return (P) h(str, com.google.crypto.tink.shaded.protobuf.i.i(bArr), cls);
    }

    private static <P> P j(String str, com.google.crypto.tink.shaded.protobuf.i iVar, Class<P> cls) {
        return (P) g(str, cls).b(iVar);
    }

    public static <P> p<P> k(i iVar, Class<P> cls) {
        return l(iVar, null, cls);
    }

    public static <P> p<P> l(i iVar, e<P> eVar, Class<P> cls) {
        return m(iVar, eVar, (Class) a(cls));
    }

    private static <P> p<P> m(i iVar, e<P> eVar, Class<P> cls) {
        s.d(iVar.f());
        p<P> f10 = p.f(cls);
        for (c0.c cVar : iVar.f().U()) {
            if (cVar.V() == z.ENABLED) {
                p.b<P> a10 = f10.a((eVar == null || !eVar.a(cVar.S().T())) ? (P) j(cVar.S().T(), cVar.S().U(), cls) : eVar.b(cVar.S().U()), cVar);
                if (cVar.T() == iVar.f().V()) {
                    f10.g(a10);
                }
            }
        }
        return f10;
    }

    public static e<?> n(String str) {
        return f(str).b();
    }

    public static synchronized s0 o(a0 a0Var) {
        s0 c10;
        synchronized (r.class) {
            e<?> n10 = n(a0Var.T());
            if (!f25838d.get(a0Var.T()).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + a0Var.T());
            }
            c10 = n10.c(a0Var.U());
        }
        return c10;
    }

    public static synchronized y p(a0 a0Var) {
        y d10;
        synchronized (r.class) {
            e<?> n10 = n(a0Var.T());
            if (!f25838d.get(a0Var.T()).booleanValue()) {
                throw new GeneralSecurityException("newKey-operation not permitted for key type " + a0Var.T());
            }
            d10 = n10.d(a0Var.U());
        }
        return d10;
    }

    public static synchronized <KeyProtoT extends s0> void q(h<KeyProtoT> hVar, boolean z10) {
        synchronized (r.class) {
            if (hVar == null) {
                throw new IllegalArgumentException("key manager must be non-null.");
            }
            String c10 = hVar.c();
            d(c10, hVar.getClass(), z10);
            ConcurrentMap<String, d> concurrentMap = f25836b;
            if (!concurrentMap.containsKey(c10)) {
                concurrentMap.put(c10, b(hVar));
                f25837c.put(c10, c(hVar));
            }
            f25838d.put(c10, Boolean.valueOf(z10));
        }
    }

    public static synchronized <B, P> void r(q<B, P> qVar) {
        synchronized (r.class) {
            if (qVar == null) {
                throw new IllegalArgumentException("wrapper must be non-null");
            }
            Class<P> c10 = qVar.c();
            ConcurrentMap<Class<?>, q<?, ?>> concurrentMap = f25840f;
            if (concurrentMap.containsKey(c10)) {
                q<?, ?> qVar2 = concurrentMap.get(c10);
                if (!qVar.getClass().equals(qVar2.getClass())) {
                    Logger logger = f25835a;
                    logger.warning("Attempted overwrite of a registered SetWrapper for type " + c10);
                    throw new GeneralSecurityException(String.format("SetWrapper for primitive (%s) is already registered to be %s, cannot be re-registered with %s", c10.getName(), qVar2.getClass().getName(), qVar.getClass().getName()));
                }
            }
            concurrentMap.put(c10, qVar);
        }
    }

    private static String s(Set<Class<?>> set) {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (Class<?> cls : set) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(cls.getCanonicalName());
            z10 = false;
        }
        return sb2.toString();
    }

    public static <B, P> P t(p<B> pVar, Class<P> cls) {
        q<?, ?> qVar = f25840f.get(cls);
        if (qVar == null) {
            throw new GeneralSecurityException("No wrapper found for " + pVar.d().getName());
        } else if (qVar.a().equals(pVar.d())) {
            return (P) qVar.b(pVar);
        } else {
            throw new GeneralSecurityException("Wrong input primitive class, expected " + qVar.a() + ", got " + pVar.d());
        }
    }
}
