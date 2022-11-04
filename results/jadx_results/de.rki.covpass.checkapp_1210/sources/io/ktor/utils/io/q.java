package io.ktor.utils.io;

import hc.v;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Comparator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Metadata;
import kotlinx.coroutines.j0;
import org.conscrypt.BuildConfig;
import tb.e0;
import tb.s;
@Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a+\u0010\u0004\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a*\u0010\n\u001a\u0018\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0018\u00010\bj\u0004\u0018\u0001`\t2\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0002\u001a\u0018\u0010\u000e\u001a\u00020\f*\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002\u001a\u001b\u0010\u0010\u001a\u00020\f*\u0006\u0012\u0002\b\u00030\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\fH\u0082\u0010\"\u0014\u0010\u0012\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011\"\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0014\":\u0010\u0019\u001a(\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u000b\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\bj\u0002`\t0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018*(\b\u0002\u0010\u001a\"\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\b2\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00000\b¨\u0006\u001b"}, d2 = {BuildConfig.FLAVOR, "E", "exception", "cause", "e", "(Ljava/lang/Throwable;Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Ljava/lang/reflect/Constructor;", "constructor", "Lkotlin/Function1;", "Lio/ktor/utils/io/Ctor;", "a", "Ljava/lang/Class;", BuildConfig.FLAVOR, "defaultValue", "d", "accumulator", "b", "I", "throwableFields", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "Ljava/util/concurrent/locks/ReentrantReadWriteLock;", "cacheLock", "Ljava/util/WeakHashMap;", "c", "Ljava/util/WeakHashMap;", "exceptionCtors", "Ctor", "ktor-io"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class q {

    /* renamed from: a */
    private static final int f12952a = d(Throwable.class, -1);

    /* renamed from: b */
    private static final ReentrantReadWriteLock f12953b = new ReentrantReadWriteLock();

    /* renamed from: c */
    private static final WeakHashMap<Class<? extends Throwable>, gc.l<Throwable, Throwable>> f12954c = new WeakHashMap<>();

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {BuildConfig.FLAVOR, "e", "b", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class a extends v implements gc.l<Throwable, Throwable> {

        /* renamed from: c */
        final /* synthetic */ Constructor f12955c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Constructor constructor) {
            super(1);
            this.f12955c = constructor;
        }

        /* renamed from: b */
        public final Throwable invoke(Throwable th2) {
            Object obj;
            Object newInstance;
            hc.t.e(th2, "e");
            try {
                s.a aVar = tb.s.Companion;
                newInstance = this.f12955c.newInstance(th2.getMessage(), th2);
            } catch (Throwable th3) {
                s.a aVar2 = tb.s.Companion;
                obj = tb.s.c(tb.t.a(th3));
            }
            if (newInstance != null) {
                obj = tb.s.c((Throwable) newInstance);
                if (tb.s.i(obj)) {
                    obj = null;
                }
                return (Throwable) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {BuildConfig.FLAVOR, "e", "b", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class b extends v implements gc.l<Throwable, Throwable> {

        /* renamed from: c */
        final /* synthetic */ Constructor f12956c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Constructor constructor) {
            super(1);
            this.f12956c = constructor;
        }

        /* renamed from: b */
        public final Throwable invoke(Throwable th2) {
            Object obj;
            Object newInstance;
            hc.t.e(th2, "e");
            try {
                s.a aVar = tb.s.Companion;
                newInstance = this.f12956c.newInstance(th2);
            } catch (Throwable th3) {
                s.a aVar2 = tb.s.Companion;
                obj = tb.s.c(tb.t.a(th3));
            }
            if (newInstance != null) {
                obj = tb.s.c((Throwable) newInstance);
                if (tb.s.i(obj)) {
                    obj = null;
                }
                return (Throwable) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {BuildConfig.FLAVOR, "e", "b", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class c extends v implements gc.l<Throwable, Throwable> {

        /* renamed from: c */
        final /* synthetic */ Constructor f12957c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Constructor constructor) {
            super(1);
            this.f12957c = constructor;
        }

        /* renamed from: b */
        public final Throwable invoke(Throwable th2) {
            Object obj;
            Object newInstance;
            hc.t.e(th2, "e");
            try {
                s.a aVar = tb.s.Companion;
                newInstance = this.f12957c.newInstance(th2.getMessage());
            } catch (Throwable th3) {
                s.a aVar2 = tb.s.Companion;
                obj = tb.s.c(tb.t.a(th3));
            }
            if (newInstance != null) {
                Throwable th4 = (Throwable) newInstance;
                th4.initCause(th2);
                obj = tb.s.c(th4);
                if (tb.s.i(obj)) {
                    obj = null;
                }
                return (Throwable) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {BuildConfig.FLAVOR, "e", "b", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class d extends v implements gc.l<Throwable, Throwable> {

        /* renamed from: c */
        final /* synthetic */ Constructor f12958c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Constructor constructor) {
            super(1);
            this.f12958c = constructor;
        }

        /* renamed from: b */
        public final Throwable invoke(Throwable th2) {
            Object obj;
            Object newInstance;
            hc.t.e(th2, "e");
            try {
                s.a aVar = tb.s.Companion;
                newInstance = this.f12958c.newInstance(new Object[0]);
            } catch (Throwable th3) {
                s.a aVar2 = tb.s.Companion;
                obj = tb.s.c(tb.t.a(th3));
            }
            if (newInstance != null) {
                Throwable th4 = (Throwable) newInstance;
                th4.initCause(th2);
                obj = tb.s.c(th4);
                if (tb.s.i(obj)) {
                    obj = null;
                }
                return (Throwable) obj;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Throwable");
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", BuildConfig.FLAVOR, "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class e<T> implements Comparator {
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            int a10;
            a10 = wb.b.a(Integer.valueOf(((Constructor) t11).getParameterTypes().length), Integer.valueOf(((Constructor) t10).getParameterTypes().length));
            return a10;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {BuildConfig.FLAVOR, "E", "it", BuildConfig.FLAVOR, "b", "(Ljava/lang/Throwable;)Ljava/lang/Void;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class f extends v implements gc.l {

        /* renamed from: c */
        public static final f f12959c = new f();

        f() {
            super(1);
        }

        /* renamed from: b */
        public final Void invoke(Throwable th2) {
            hc.t.e(th2, "it");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {BuildConfig.FLAVOR, "E", "it", BuildConfig.FLAVOR, "b", "(Ljava/lang/Throwable;)Ljava/lang/Void;"}, k = 3, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static final class g extends v implements gc.l {

        /* renamed from: c */
        public static final g f12960c = new g();

        g() {
            super(1);
        }

        /* renamed from: b */
        public final Void invoke(Throwable th2) {
            hc.t.e(th2, "it");
            return null;
        }
    }

    private static final gc.l<Throwable, Throwable> a(Constructor<?> constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        int length = parameterTypes.length;
        if (length != 0) {
            if (length != 1) {
                if (length != 2 || !hc.t.a(parameterTypes[0], String.class) || !hc.t.a(parameterTypes[1], Throwable.class)) {
                    return null;
                }
                return new a(constructor);
            }
            Class<?> cls = parameterTypes[0];
            if (hc.t.a(cls, Throwable.class)) {
                return new b(constructor);
            }
            if (!hc.t.a(cls, String.class)) {
                return null;
            }
            return new c(constructor);
        }
        return new d(constructor);
    }

    private static final int b(Class<?> cls, int i10) {
        do {
            Field[] declaredFields = cls.getDeclaredFields();
            hc.t.d(declaredFields, "declaredFields");
            int length = declaredFields.length;
            int i11 = 0;
            int i12 = 0;
            while (i11 < length) {
                Field field = declaredFields[i11];
                i11++;
                if (!Modifier.isStatic(field.getModifiers())) {
                    i12++;
                }
            }
            i10 += i12;
            cls = cls.getSuperclass();
        } while (cls != null);
        return i10;
    }

    static /* synthetic */ int c(Class cls, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return b(cls, i10);
    }

    private static final int d(Class<?> cls, int i10) {
        Integer num;
        fc.a.e(cls);
        try {
            s.a aVar = tb.s.Companion;
            num = tb.s.c(Integer.valueOf(c(cls, 0, 1, null)));
        } catch (Throwable th2) {
            s.a aVar2 = tb.s.Companion;
            num = tb.s.c(tb.t.a(th2));
        }
        Integer valueOf = Integer.valueOf(i10);
        if (tb.s.i(num)) {
            num = valueOf;
        }
        return ((Number) num).intValue();
    }

    public static final <E extends Throwable> E e(E e10, Throwable th2) {
        Object obj;
        List<Constructor> Y;
        int readHoldCount;
        ReentrantReadWriteLock.WriteLock writeLock;
        hc.t.e(e10, "exception");
        hc.t.e(th2, "cause");
        Object obj2 = null;
        if (e10 instanceof j0) {
            try {
                s.a aVar = tb.s.Companion;
                obj = tb.s.c(((j0) e10).b());
            } catch (Throwable th3) {
                s.a aVar2 = tb.s.Companion;
                obj = tb.s.c(tb.t.a(th3));
            }
            if (!tb.s.i(obj)) {
                obj2 = obj;
            }
            return (E) obj2;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f12953b;
        ReentrantReadWriteLock.ReadLock readLock = reentrantReadWriteLock.readLock();
        readLock.lock();
        try {
            gc.l<Throwable, Throwable> lVar = f12954c.get(e10.getClass());
            if (lVar != null) {
                return (E) lVar.invoke(e10);
            }
            int i10 = 0;
            if (f12952a != d(e10.getClass(), 0)) {
                readLock = reentrantReadWriteLock.readLock();
                readHoldCount = reentrantReadWriteLock.getWriteHoldCount() == 0 ? reentrantReadWriteLock.getReadHoldCount() : 0;
                int i11 = 0;
                while (i11 < readHoldCount) {
                    i11++;
                }
                writeLock = reentrantReadWriteLock.writeLock();
                writeLock.lock();
                try {
                    f12954c.put(e10.getClass(), f.f12959c);
                    e0 e0Var = e0.f22152a;
                    return null;
                } finally {
                    while (i10 < readHoldCount) {
                        i10++;
                        readLock.lock();
                    }
                    writeLock.unlock();
                }
            }
            Constructor<?>[] constructors = e10.getClass().getConstructors();
            hc.t.d(constructors, "exception.javaClass.constructors");
            Y = ub.m.Y(constructors, new e());
            gc.l<Throwable, Throwable> lVar2 = null;
            for (Constructor constructor : Y) {
                hc.t.d(constructor, "constructor");
                lVar2 = a(constructor);
                if (lVar2 != null) {
                    break;
                }
            }
            ReentrantReadWriteLock reentrantReadWriteLock2 = f12953b;
            readLock = reentrantReadWriteLock2.readLock();
            readHoldCount = reentrantReadWriteLock2.getWriteHoldCount() == 0 ? reentrantReadWriteLock2.getReadHoldCount() : 0;
            int i12 = 0;
            while (i12 < readHoldCount) {
                i12++;
            }
            writeLock = reentrantReadWriteLock2.writeLock();
            writeLock.lock();
            try {
                f12954c.put(e10.getClass(), lVar2 == null ? g.f12960c : lVar2);
                e0 e0Var2 = e0.f22152a;
                while (i10 < readHoldCount) {
                    i10++;
                    readLock.lock();
                }
                writeLock.unlock();
                if (lVar2 != null) {
                    return (E) lVar2.invoke(th2);
                }
                return null;
            } finally {
                while (i10 < readHoldCount) {
                    i10++;
                    readLock.lock();
                }
                writeLock.unlock();
            }
        } finally {
            readLock.unlock();
        }
    }
}
