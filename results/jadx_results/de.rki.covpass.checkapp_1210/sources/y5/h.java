package y5;

import com.google.crypto.tink.shaded.protobuf.s0;
import f6.y;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class h<KeyProtoT extends s0> {

    /* renamed from: a */
    private final Class<KeyProtoT> f25818a;

    /* renamed from: b */
    private final Map<Class<?>, b<?, KeyProtoT>> f25819b;

    /* renamed from: c */
    private final Class<?> f25820c;

    /* loaded from: classes.dex */
    public static abstract class a<KeyFormatProtoT extends s0, KeyT> {

        /* renamed from: a */
        private final Class<KeyFormatProtoT> f25821a;

        public a(Class<KeyFormatProtoT> cls) {
            this.f25821a = cls;
        }

        public abstract KeyT a(KeyFormatProtoT keyformatprotot);

        public final Class<KeyFormatProtoT> b() {
            return this.f25821a;
        }

        public abstract KeyFormatProtoT c(com.google.crypto.tink.shaded.protobuf.i iVar);

        public abstract void d(KeyFormatProtoT keyformatprotot);
    }

    /* loaded from: classes.dex */
    public static abstract class b<PrimitiveT, KeyT> {

        /* renamed from: a */
        private final Class<PrimitiveT> f25822a;

        public b(Class<PrimitiveT> cls) {
            this.f25822a = cls;
        }

        public abstract PrimitiveT a(KeyT keyt);

        final Class<PrimitiveT> b() {
            return this.f25822a;
        }
    }

    @SafeVarargs
    public h(Class<KeyProtoT> cls, b<?, KeyProtoT>... bVarArr) {
        this.f25818a = cls;
        HashMap hashMap = new HashMap();
        for (b<?, KeyProtoT> bVar : bVarArr) {
            if (hashMap.containsKey(bVar.b())) {
                throw new IllegalArgumentException("KeyTypeManager constructed with duplicate factories for primitive " + bVar.b().getCanonicalName());
            }
            hashMap.put(bVar.b(), bVar);
        }
        this.f25820c = bVarArr.length > 0 ? bVarArr[0].b() : Void.class;
        this.f25819b = Collections.unmodifiableMap(hashMap);
    }

    public final Class<?> a() {
        return this.f25820c;
    }

    public final Class<KeyProtoT> b() {
        return this.f25818a;
    }

    public abstract String c();

    public final <P> P d(KeyProtoT keyprotot, Class<P> cls) {
        b<?, KeyProtoT> bVar = this.f25819b.get(cls);
        if (bVar != null) {
            return (P) bVar.a(keyprotot);
        }
        throw new IllegalArgumentException("Requested primitive class " + cls.getCanonicalName() + " not supported.");
    }

    public abstract a<?, KeyProtoT> e();

    public abstract y.c f();

    public abstract KeyProtoT g(com.google.crypto.tink.shaded.protobuf.i iVar);

    public final Set<Class<?>> h() {
        return this.f25819b.keySet();
    }

    public abstract void i(KeyProtoT keyprotot);
}
