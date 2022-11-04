package yd;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import yd.a;
import yd.h;
import yd.j;
import yd.q;
import yd.z;
/* loaded from: classes3.dex */
public abstract class i extends yd.a implements Serializable {

    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f26131a;

        static {
            int[] iArr = new int[z.c.values().length];
            f26131a = iArr;
            try {
                iArr[z.c.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26131a[z.c.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class b<MessageType extends i, BuilderType extends b> extends a.AbstractC0456a<BuilderType> {

        /* renamed from: c */
        private yd.d f26132c = yd.d.f26096c;

        /* renamed from: k */
        public BuilderType clone() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        public final yd.d l() {
            return this.f26132c;
        }

        public abstract BuilderType m(MessageType messagetype);

        public final BuilderType o(yd.d dVar) {
            this.f26132c = dVar;
            return this;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class c<MessageType extends d<MessageType>, BuilderType extends c<MessageType, BuilderType>> extends b<MessageType, BuilderType> implements r {

        /* renamed from: d */
        private h<e> f26133d = h.g();

        /* renamed from: q */
        private boolean f26134q;

        public h<e> q() {
            this.f26133d.q();
            this.f26134q = false;
            return this.f26133d;
        }

        private void t() {
            if (!this.f26134q) {
                this.f26133d = this.f26133d.clone();
                this.f26134q = true;
            }
        }

        public final void v(MessageType messagetype) {
            t();
            this.f26133d.r(((d) messagetype).f26135d);
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class d<MessageType extends d<MessageType>> extends i implements r {

        /* renamed from: d */
        private final h<e> f26135d;

        /* loaded from: classes3.dex */
        public class a {

            /* renamed from: a */
            private final Iterator<Map.Entry<e, Object>> f26136a;

            /* renamed from: b */
            private Map.Entry<e, Object> f26137b;

            /* renamed from: c */
            private final boolean f26138c;

            private a(boolean z10) {
                d.this = r2;
                Iterator<Map.Entry<e, Object>> p10 = r2.f26135d.p();
                this.f26136a = p10;
                if (p10.hasNext()) {
                    this.f26137b = p10.next();
                }
                this.f26138c = z10;
            }

            /* synthetic */ a(d dVar, boolean z10, a aVar) {
                this(z10);
            }

            public void a(int i10, yd.f fVar) {
                while (true) {
                    Map.Entry<e, Object> entry = this.f26137b;
                    if (entry == null || entry.getKey().c() >= i10) {
                        return;
                    }
                    e key = this.f26137b.getKey();
                    if (!this.f26138c || key.i() != z.c.MESSAGE || key.e()) {
                        h.z(key, this.f26137b.getValue(), fVar);
                    } else {
                        fVar.f0(key.c(), (q) this.f26137b.getValue());
                    }
                    this.f26137b = this.f26136a.hasNext() ? this.f26136a.next() : null;
                }
            }
        }

        public d() {
            this.f26135d = h.t();
        }

        public d(c<MessageType, ?> cVar) {
            this.f26135d = cVar.q();
        }

        private void b0(f<MessageType, ?> fVar) {
            if (fVar.b() == f()) {
                return;
            }
            throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
        }

        public boolean B() {
            return this.f26135d.n();
        }

        public int G() {
            return this.f26135d.k();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> Type I(f<MessageType, Type> fVar) {
            b0(fVar);
            Object h10 = this.f26135d.h(fVar.f26148d);
            return h10 == null ? fVar.f26146b : (Type) fVar.a(h10);
        }

        public final <Type> Type M(f<MessageType, List<Type>> fVar, int i10) {
            b0(fVar);
            return (Type) fVar.e(this.f26135d.i(fVar.f26148d, i10));
        }

        public final <Type> int N(f<MessageType, List<Type>> fVar) {
            b0(fVar);
            return this.f26135d.j(fVar.f26148d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> boolean V(f<MessageType, Type> fVar) {
            b0(fVar);
            return this.f26135d.m(fVar.f26148d);
        }

        public d<MessageType>.a W() {
            return new a(this, false, null);
        }

        @Override // yd.i
        public void u() {
            this.f26135d.q();
        }

        @Override // yd.i
        public boolean y(yd.e eVar, yd.f fVar, g gVar, int i10) {
            return i.z(this.f26135d, f(), eVar, fVar, gVar, i10);
        }
    }

    /* loaded from: classes3.dex */
    public static final class e implements h.b<e> {

        /* renamed from: c */
        final j.b<?> f26140c;

        /* renamed from: d */
        final int f26141d;

        /* renamed from: q */
        final z.b f26142q;

        /* renamed from: x */
        final boolean f26143x;

        /* renamed from: y */
        final boolean f26144y;

        e(j.b<?> bVar, int i10, z.b bVar2, boolean z10, boolean z11) {
            this.f26140c = bVar;
            this.f26141d = i10;
            this.f26142q = bVar2;
            this.f26143x = z10;
            this.f26144y = z11;
        }

        /* renamed from: a */
        public int compareTo(e eVar) {
            return this.f26141d - eVar.f26141d;
        }

        public j.b<?> b() {
            return this.f26140c;
        }

        @Override // yd.h.b
        public int c() {
            return this.f26141d;
        }

        @Override // yd.h.b
        public boolean e() {
            return this.f26143x;
        }

        @Override // yd.h.b
        public z.b f() {
            return this.f26142q;
        }

        @Override // yd.h.b
        public z.c i() {
            return this.f26142q.b();
        }

        @Override // yd.h.b
        public boolean k() {
            return this.f26144y;
        }

        @Override // yd.h.b
        public q.a n(q.a aVar, q qVar) {
            return ((b) aVar).m((i) qVar);
        }
    }

    /* loaded from: classes3.dex */
    public static class f<ContainingType extends q, Type> {

        /* renamed from: a */
        final ContainingType f26145a;

        /* renamed from: b */
        final Type f26146b;

        /* renamed from: c */
        final q f26147c;

        /* renamed from: d */
        final e f26148d;

        /* renamed from: e */
        final Class f26149e;

        /* renamed from: f */
        final Method f26150f;

        f(ContainingType containingtype, Type type, q qVar, e eVar, Class cls) {
            if (containingtype != null) {
                if (eVar.f() == z.b.f26211b4 && qVar == null) {
                    throw new IllegalArgumentException("Null messageDefaultInstance");
                }
                this.f26145a = containingtype;
                this.f26146b = type;
                this.f26147c = qVar;
                this.f26148d = eVar;
                this.f26149e = cls;
                this.f26150f = j.a.class.isAssignableFrom(cls) ? i.r(cls, "valueOf", Integer.TYPE) : null;
                return;
            }
            throw new IllegalArgumentException("Null containingTypeDefaultInstance");
        }

        Object a(Object obj) {
            if (this.f26148d.e()) {
                if (this.f26148d.i() != z.c.ENUM) {
                    return obj;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    arrayList.add(e(obj2));
                }
                return arrayList;
            }
            return e(obj);
        }

        public ContainingType b() {
            return this.f26145a;
        }

        public q c() {
            return this.f26147c;
        }

        public int d() {
            return this.f26148d.c();
        }

        Object e(Object obj) {
            return this.f26148d.i() == z.c.ENUM ? i.t(this.f26150f, null, (Integer) obj) : obj;
        }

        Object f(Object obj) {
            return this.f26148d.i() == z.c.ENUM ? Integer.valueOf(((j.a) obj).c()) : obj;
        }
    }

    public i() {
    }

    public i(b bVar) {
    }

    static Method r(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            String name = cls.getName();
            String valueOf = String.valueOf(str);
            StringBuilder sb2 = new StringBuilder(name.length() + 45 + valueOf.length());
            sb2.append("Generated message class \"");
            sb2.append(name);
            sb2.append("\" missing method \"");
            sb2.append(valueOf);
            sb2.append("\".");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    static Object t(Method method, Object obj, Object... objArr) {
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

    public static <ContainingType extends q, Type> f<ContainingType, Type> v(ContainingType containingtype, q qVar, j.b<?> bVar, int i10, z.b bVar2, boolean z10, Class cls) {
        return new f<>(containingtype, Collections.emptyList(), qVar, new e(bVar, i10, bVar2, true, z10), cls);
    }

    public static <ContainingType extends q, Type> f<ContainingType, Type> x(ContainingType containingtype, Type type, q qVar, j.b<?> bVar, int i10, z.b bVar2, Class cls) {
        return new f<>(containingtype, type, qVar, new e(bVar, i10, bVar2, false, false), cls);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static <MessageType extends yd.q> boolean z(yd.h<yd.i.e> r5, MessageType r6, yd.e r7, yd.f r8, yd.g r9, int r10) {
        /*
            Method dump skipped, instructions count: 290
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yd.i.z(yd.h, yd.q, yd.e, yd.f, yd.g, int):boolean");
    }

    @Override // yd.q
    public s<? extends q> i() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    public void u() {
    }

    public boolean y(yd.e eVar, yd.f fVar, g gVar, int i10) {
        return eVar.P(i10, fVar);
    }
}
