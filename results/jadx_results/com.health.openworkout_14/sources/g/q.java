package g;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import g.e;
import g.h;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class q {

    /* renamed from: c */
    private static final q f4594c = e();

    /* renamed from: a */
    private final boolean f4595a;
    @Nullable

    /* renamed from: b */
    private final Constructor<MethodHandles.Lookup> f4596b;

    /* loaded from: classes.dex */
    public static final class a extends q {

        /* renamed from: g.q$a$a */
        /* loaded from: classes.dex */
        static final class ExecutorC0121a implements Executor {

            /* renamed from: a */
            private final Handler f4597a = new Handler(Looper.getMainLooper());

            ExecutorC0121a() {
            }

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.f4597a.post(runnable);
            }
        }

        a() {
            super(Build.VERSION.SDK_INT >= 24);
        }

        @Override // g.q
        public Executor b() {
            return new ExecutorC0121a();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // g.q
        @Nullable
        public Object g(Method method, Class<?> cls, Object obj, @Nullable Object... objArr) {
            if (Build.VERSION.SDK_INT >= 26) {
                return super.g(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    q(boolean z) {
        this.f4595a = z;
        Constructor<MethodHandles.Lookup> constructor = null;
        if (z) {
            try {
                constructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f4596b = constructor;
    }

    private static q e() {
        try {
            Class.forName("android.os.Build");
            if (Build.VERSION.SDK_INT != 0) {
                return new a();
            }
        } catch (ClassNotFoundException unused) {
        }
        return new q(true);
    }

    public static q f() {
        return f4594c;
    }

    public List<? extends e.a> a(@Nullable Executor executor) {
        i iVar = new i(executor);
        return this.f4595a ? Arrays.asList(g.f4499a, iVar) : Collections.singletonList(iVar);
    }

    @Nullable
    public Executor b() {
        return null;
    }

    public List<? extends h.a> c() {
        return this.f4595a ? Collections.singletonList(o.f4547a) : Collections.emptyList();
    }

    public int d() {
        return this.f4595a ? 1 : 0;
    }

    @Nullable
    public Object g(Method method, Class<?> cls, Object obj, @Nullable Object... objArr) {
        Constructor<MethodHandles.Lookup> constructor = this.f4596b;
        return (constructor != null ? constructor.newInstance(cls, -1) : MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }

    public boolean h(Method method) {
        return this.f4595a && method.isDefault();
    }
}
