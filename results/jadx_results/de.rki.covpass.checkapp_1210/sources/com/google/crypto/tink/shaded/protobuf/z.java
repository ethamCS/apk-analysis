package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.a;
import com.google.crypto.tink.shaded.protobuf.b0;
import com.google.crypto.tink.shaded.protobuf.e;
import com.google.crypto.tink.shaded.protobuf.s0;
import com.google.crypto.tink.shaded.protobuf.u1;
import com.google.crypto.tink.shaded.protobuf.v;
import com.google.crypto.tink.shaded.protobuf.z;
import com.google.crypto.tink.shaded.protobuf.z.a;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class z<MessageType extends z<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends com.google.crypto.tink.shaded.protobuf.a<MessageType, BuilderType> {
    private static Map<Object, z<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected p1 unknownFields = p1.e();
    protected int memoizedSerializedSize = -1;

    /* loaded from: classes.dex */
    public static abstract class a<MessageType extends z<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends a.AbstractC0113a<MessageType, BuilderType> {

        /* renamed from: c */
        private final MessageType f8108c;

        /* renamed from: d */
        protected MessageType f8109d;

        /* renamed from: q */
        protected boolean f8110q = false;

        public a(MessageType messagetype) {
            this.f8108c = messagetype;
            this.f8109d = (MessageType) messagetype.t(f.NEW_MUTABLE_INSTANCE);
        }

        private void A(MessageType messagetype, MessageType messagetype2) {
            d1.a().e(messagetype).b(messagetype, messagetype2);
        }

        /* renamed from: o */
        public final MessageType b() {
            MessageType u10 = u();
            if (u10.c()) {
                return u10;
            }
            throw a.AbstractC0113a.m(u10);
        }

        /* renamed from: p */
        public MessageType u() {
            if (this.f8110q) {
                return this.f8109d;
            }
            this.f8109d.C();
            this.f8110q = true;
            return this.f8109d;
        }

        /* renamed from: q */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) f().h();
            buildertype.y(u());
            return buildertype;
        }

        public final void t() {
            if (this.f8110q) {
                v();
                this.f8110q = false;
            }
        }

        protected void v() {
            MessageType messagetype = (MessageType) this.f8109d.t(f.NEW_MUTABLE_INSTANCE);
            A(messagetype, this.f8109d);
            this.f8109d = messagetype;
        }

        /* renamed from: w */
        public MessageType f() {
            return this.f8108c;
        }

        /* renamed from: x */
        public BuilderType a(MessageType messagetype) {
            return y(messagetype);
        }

        public BuilderType y(MessageType messagetype) {
            t();
            A(this.f8109d, messagetype);
            return this;
        }
    }

    /* loaded from: classes.dex */
    protected static class b<T extends z<T, ?>> extends com.google.crypto.tink.shaded.protobuf.b<T> {

        /* renamed from: b */
        private final T f8111b;

        public b(T t10) {
            this.f8111b = t10;
        }

        /* renamed from: g */
        public T b(j jVar, q qVar) {
            return (T) z.J(this.f8111b, jVar, qVar);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends z<MessageType, BuilderType> implements t0 {
        protected v<d> extensions = v.h();

        public v<d> N() {
            if (this.extensions.n()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d implements v.b<d> {

        /* renamed from: c */
        final b0.d<?> f8112c;

        /* renamed from: d */
        final int f8113d;

        /* renamed from: q */
        final u1.b f8114q;

        /* renamed from: x */
        final boolean f8115x;

        /* renamed from: y */
        final boolean f8116y;

        /* renamed from: a */
        public int compareTo(d dVar) {
            return this.f8113d - dVar.f8113d;
        }

        public b0.d<?> b() {
            return this.f8112c;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.v.b
        public int c() {
            return this.f8113d;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.v.b
        public boolean e() {
            return this.f8115x;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.v.b
        public u1.b f() {
            return this.f8114q;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.v.b
        public u1.c i() {
            return this.f8114q.b();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.v.b
        public boolean k() {
            return this.f8116y;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.v.b
        public s0.a u(s0.a aVar, s0 s0Var) {
            return ((a) aVar).y((z) s0Var);
        }
    }

    /* loaded from: classes.dex */
    public static class e<ContainingType extends s0, Type> extends o<ContainingType, Type> {

        /* renamed from: a */
        final s0 f8117a;

        /* renamed from: b */
        final d f8118b;

        public u1.b a() {
            return this.f8118b.f();
        }

        public s0 b() {
            return this.f8117a;
        }

        public int c() {
            return this.f8118b.c();
        }

        public boolean d() {
            return this.f8118b.f8115x;
        }
    }

    /* loaded from: classes.dex */
    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    public static Object A(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (!(cause instanceof Error)) {
                throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
            }
            throw ((Error) cause);
        }
    }

    protected static final <T extends z<T, ?>> boolean B(T t10, boolean z10) {
        byte byteValue = ((Byte) t10.t(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean g10 = d1.a().e(t10).g(t10);
        if (z10) {
            t10.v(f.SET_MEMOIZED_IS_INITIALIZED, g10 ? t10 : null);
        }
        return g10;
    }

    public static <E> b0.i<E> D(b0.i<E> iVar) {
        int size = iVar.size();
        return iVar.t(size == 0 ? 10 : size * 2);
    }

    public static Object F(s0 s0Var, String str, Object[] objArr) {
        return new f1(s0Var, str, objArr);
    }

    public static <T extends z<T, ?>> T G(T t10, i iVar, q qVar) {
        return (T) r(I(t10, iVar, qVar));
    }

    public static <T extends z<T, ?>> T H(T t10, byte[] bArr, q qVar) {
        return (T) r(K(t10, bArr, 0, bArr.length, qVar));
    }

    private static <T extends z<T, ?>> T I(T t10, i iVar, q qVar) {
        try {
            j M = iVar.M();
            T t11 = (T) J(t10, M, qVar);
            try {
                M.a(0);
                return t11;
            } catch (c0 e10) {
                throw e10.k(t11);
            }
        } catch (c0 e11) {
            throw e11;
        }
    }

    static <T extends z<T, ?>> T J(T t10, j jVar, q qVar) {
        T t11 = (T) t10.t(f.NEW_MUTABLE_INSTANCE);
        try {
            h1 e10 = d1.a().e(t11);
            e10.e(t11, k.Q(jVar), qVar);
            e10.f(t11);
            return t11;
        } catch (IOException e11) {
            if (!(e11.getCause() instanceof c0)) {
                throw new c0(e11.getMessage()).k(t11);
            }
            throw ((c0) e11.getCause());
        } catch (RuntimeException e12) {
            if (!(e12.getCause() instanceof c0)) {
                throw e12;
            }
            throw ((c0) e12.getCause());
        }
    }

    static <T extends z<T, ?>> T K(T t10, byte[] bArr, int i10, int i11, q qVar) {
        T t11 = (T) t10.t(f.NEW_MUTABLE_INSTANCE);
        try {
            h1 e10 = d1.a().e(t11);
            e10.c(t11, bArr, i10, i10 + i11, new e.b(qVar));
            e10.f(t11);
            if (t11.memoizedHashCode == 0) {
                return t11;
            }
            throw new RuntimeException();
        } catch (IOException e11) {
            if (!(e11.getCause() instanceof c0)) {
                throw new c0(e11.getMessage()).k(t11);
            }
            throw ((c0) e11.getCause());
        } catch (IndexOutOfBoundsException unused) {
            throw c0.n().k(t11);
        }
    }

    public static <T extends z<?, ?>> void L(Class<T> cls, T t10) {
        defaultInstanceMap.put(cls, t10);
    }

    private static <T extends z<T, ?>> T r(T t10) {
        if (t10 == null || t10.c()) {
            return t10;
        }
        throw t10.o().b().k(t10);
    }

    public static <E> b0.i<E> x() {
        return e1.c();
    }

    public static <T extends z<?, ?>> T y(Class<T> cls) {
        z<?, ?> zVar = defaultInstanceMap.get(cls);
        if (zVar == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                zVar = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (zVar == null) {
            zVar = (T) ((z) s1.i(cls)).f();
            if (zVar == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, zVar);
        }
        return (T) zVar;
    }

    protected void C() {
        d1.a().e(this).f(this);
    }

    /* renamed from: E */
    public final BuilderType h() {
        return (BuilderType) t(f.NEW_BUILDER);
    }

    /* renamed from: M */
    public final BuilderType g() {
        BuilderType buildertype = (BuilderType) t(f.NEW_BUILDER);
        buildertype.y(this);
        return buildertype;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    int a() {
        return this.memoizedSerializedSize;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.t0
    public final boolean c() {
        return B(this, true);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public int e() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = d1.a().e(this).i(this);
        }
        return this.memoizedSerializedSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (f().getClass().isInstance(obj)) {
            return d1.a().e(this).h(this, (z) obj);
        }
        return false;
    }

    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int j10 = d1.a().e(this).j(this);
        this.memoizedHashCode = j10;
        return j10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public final a1<MessageType> i() {
        return (a1) t(f.GET_PARSER);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.s0
    public void k(l lVar) {
        d1.a().e(this).d(this, m.P(lVar));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.a
    void p(int i10) {
        this.memoizedSerializedSize = i10;
    }

    public Object q() {
        return t(f.BUILD_MESSAGE_INFO);
    }

    public final <MessageType extends z<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType s() {
        return (BuilderType) t(f.NEW_BUILDER);
    }

    public Object t(f fVar) {
        return w(fVar, null, null);
    }

    public String toString() {
        return u0.e(this, super.toString());
    }

    protected Object v(f fVar, Object obj) {
        return w(fVar, obj, null);
    }

    protected abstract Object w(f fVar, Object obj, Object obj2);

    /* renamed from: z */
    public final MessageType f() {
        return (MessageType) t(f.GET_DEFAULT_INSTANCE);
    }
}
