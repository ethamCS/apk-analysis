package androidx.lifecycle;

import android.app.Application;
import e1.a;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0004\u0006\n\u0019\u001aB#\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015B\u0019\b\u0016\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0018J(\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0097\u0002¢\u0006\u0004\b\u0006\u0010\u0007J0\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0097\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010¨\u0006\u001b"}, d2 = {"Landroidx/lifecycle/v0;", BuildConfig.FLAVOR, "Landroidx/lifecycle/s0;", "T", "Ljava/lang/Class;", "modelClass", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/s0;", BuildConfig.FLAVOR, "key", "b", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/s0;", "Landroidx/lifecycle/y0;", "Landroidx/lifecycle/y0;", "store", "Landroidx/lifecycle/v0$b;", "Landroidx/lifecycle/v0$b;", "factory", "Le1/a;", "defaultCreationExtras", "<init>", "(Landroidx/lifecycle/y0;Landroidx/lifecycle/v0$b;Le1/a;)V", "Landroidx/lifecycle/z0;", "owner", "(Landroidx/lifecycle/z0;Landroidx/lifecycle/v0$b;)V", "c", "d", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public class v0 {

    /* renamed from: a */
    private final y0 f4386a;

    /* renamed from: b */
    private final b f4387b;

    /* renamed from: c */
    private final e1.a f4388c;

    @Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u0000 \u00192\u00020\u0001:\u0001\u000eB\u001b\b\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016B\t\b\u0016¢\u0006\u0004\b\u0015\u0010\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\u0006¢\u0006\u0004\b\u0015\u0010\u0018J/\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ/\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ'\u0010\u000e\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u001a"}, d2 = {"Landroidx/lifecycle/v0$a;", "Landroidx/lifecycle/v0$c;", "Landroidx/lifecycle/s0;", "T", "Ljava/lang/Class;", "modelClass", "Landroid/app/Application;", "app", "g", "(Ljava/lang/Class;Landroid/app/Application;)Landroidx/lifecycle/s0;", "Le1/a;", "extras", "b", "(Ljava/lang/Class;Le1/a;)Landroidx/lifecycle/s0;", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/s0;", "c", "Landroid/app/Application;", "application", BuildConfig.FLAVOR, "unused", "<init>", "(Landroid/app/Application;I)V", "()V", "(Landroid/app/Application;)V", "Companion", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static class a extends c {

        /* renamed from: d */
        private static a f4389d;

        /* renamed from: c */
        private final Application f4391c;
        public static final C0051a Companion = new C0051a(null);

        /* renamed from: e */
        public static final a.b<Application> f4390e = C0051a.C0052a.f4392a;

        @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Landroidx/lifecycle/v0$a$a;", BuildConfig.FLAVOR, "Landroid/app/Application;", "application", "Landroidx/lifecycle/v0$a;", "a", "Le1/a$b;", "APPLICATION_KEY", "Le1/a$b;", BuildConfig.FLAVOR, "DEFAULT_KEY", "Ljava/lang/String;", "sInstance", "Landroidx/lifecycle/v0$a;", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
        /* renamed from: androidx.lifecycle.v0$a$a */
        /* loaded from: classes.dex */
        public static final class C0051a {

            @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/v0$a$a$a;", "Le1/a$b;", "Landroid/app/Application;", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
            /* renamed from: androidx.lifecycle.v0$a$a$a */
            /* loaded from: classes.dex */
            private static final class C0052a implements a.b<Application> {

                /* renamed from: a */
                public static final C0052a f4392a = new C0052a();

                private C0052a() {
                }
            }

            private C0051a() {
            }

            public /* synthetic */ C0051a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @fc.c
            public final a a(Application application) {
                hc.t.e(application, "application");
                if (a.f4389d == null) {
                    a.f4389d = new a(application);
                }
                a aVar = a.f4389d;
                hc.t.b(aVar);
                return aVar;
            }
        }

        public a() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public a(Application application) {
            this(application, 0);
            hc.t.e(application, "application");
        }

        private a(Application application, int i10) {
            this.f4391c = application;
        }

        private final <T extends s0> T g(Class<T> cls, Application application) {
            if (androidx.lifecycle.b.class.isAssignableFrom(cls)) {
                try {
                    T newInstance = cls.getConstructor(Application.class).newInstance(application);
                    hc.t.d(newInstance, "{\n                try {\n…          }\n            }");
                    return newInstance;
                } catch (IllegalAccessException e10) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e10);
                } catch (InstantiationException e11) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e11);
                } catch (NoSuchMethodException e12) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e12);
                } catch (InvocationTargetException e13) {
                    throw new RuntimeException("Cannot create an instance of " + cls, e13);
                }
            }
            return (T) super.a(cls);
        }

        @Override // androidx.lifecycle.v0.c, androidx.lifecycle.v0.b
        public <T extends s0> T a(Class<T> cls) {
            hc.t.e(cls, "modelClass");
            Application application = this.f4391c;
            if (application != null) {
                return (T) g(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        @Override // androidx.lifecycle.v0.c, androidx.lifecycle.v0.b
        public <T extends s0> T b(Class<T> cls, e1.a aVar) {
            hc.t.e(cls, "modelClass");
            hc.t.e(aVar, "extras");
            if (this.f4391c != null) {
                return (T) a(cls);
            }
            Application application = (Application) aVar.a(f4390e);
            if (application != null) {
                return (T) g(cls, application);
            }
            if (androidx.lifecycle.b.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.a(cls);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \f2\u00020\u0001:\u0001\u0006J'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Landroidx/lifecycle/v0$b;", BuildConfig.FLAVOR, "Landroidx/lifecycle/s0;", "T", "Ljava/lang/Class;", "modelClass", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/s0;", "Le1/a;", "extras", "b", "(Ljava/lang/Class;Le1/a;)Landroidx/lifecycle/s0;", "Companion", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public interface b {
        public static final a Companion = a.f4393a;

        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/v0$b$a;", BuildConfig.FLAVOR, "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            static final /* synthetic */ a f4393a = new a();

            private a() {
            }
        }

        <T extends s0> T a(Class<T> cls);

        <T extends s0> T b(Class<T> cls, e1.a aVar);
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \n2\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\u000b"}, d2 = {"Landroidx/lifecycle/v0$c;", "Landroidx/lifecycle/v0$b;", "Landroidx/lifecycle/s0;", "T", "Ljava/lang/Class;", "modelClass", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/s0;", "<init>", "()V", "Companion", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static class c implements b {

        /* renamed from: a */
        private static c f4394a;
        public static final a Companion = new a(null);

        /* renamed from: b */
        public static final a.b<String> f4395b = a.C0053a.f4396a;

        @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0003B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/v0$c$a;", BuildConfig.FLAVOR, "Landroidx/lifecycle/v0$c;", "a", "()Landroidx/lifecycle/v0$c;", "getInstance$annotations", "()V", "instance", "Le1/a$b;", BuildConfig.FLAVOR, "VIEW_MODEL_KEY", "Le1/a$b;", "sInstance", "Landroidx/lifecycle/v0$c;", "<init>", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
        /* loaded from: classes.dex */
        public static final class a {

            @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/v0$c$a$a;", "Le1/a$b;", BuildConfig.FLAVOR, "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
            /* renamed from: androidx.lifecycle.v0$c$a$a */
            /* loaded from: classes.dex */
            private static final class C0053a implements a.b<String> {

                /* renamed from: a */
                public static final C0053a f4396a = new C0053a();

                private C0053a() {
                }
            }

            private a() {
            }

            public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a() {
                if (c.f4394a == null) {
                    c.f4394a = new c();
                }
                c cVar = c.f4394a;
                hc.t.b(cVar);
                return cVar;
            }
        }

        @Override // androidx.lifecycle.v0.b
        public <T extends s0> T a(Class<T> cls) {
            hc.t.e(cls, "modelClass");
            try {
                T newInstance = cls.newInstance();
                hc.t.d(newInstance, "{\n                modelC…wInstance()\n            }");
                return newInstance;
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Cannot create an instance of " + cls, e10);
            } catch (InstantiationException e11) {
                throw new RuntimeException("Cannot create an instance of " + cls, e11);
            }
        }

        @Override // androidx.lifecycle.v0.b
        public /* synthetic */ s0 b(Class cls, e1.a aVar) {
            return w0.b(this, cls, aVar);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Landroidx/lifecycle/v0$d;", BuildConfig.FLAVOR, "Landroidx/lifecycle/s0;", "viewModel", "Ltb/e0;", "c", "<init>", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 6, 0})
    /* loaded from: classes.dex */
    public static class d {
        public void c(s0 s0Var) {
            hc.t.e(s0Var, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public v0(y0 y0Var, b bVar) {
        this(y0Var, bVar, null, 4, null);
        hc.t.e(y0Var, "store");
        hc.t.e(bVar, "factory");
    }

    public v0(y0 y0Var, b bVar, e1.a aVar) {
        hc.t.e(y0Var, "store");
        hc.t.e(bVar, "factory");
        hc.t.e(aVar, "defaultCreationExtras");
        this.f4386a = y0Var;
        this.f4387b = bVar;
        this.f4388c = aVar;
    }

    public /* synthetic */ v0(y0 y0Var, b bVar, e1.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(y0Var, bVar, (i10 & 4) != 0 ? a.C0136a.f9341b : aVar);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public v0(androidx.lifecycle.z0 r3, androidx.lifecycle.v0.b r4) {
        /*
            r2 = this;
            java.lang.String r0 = "owner"
            hc.t.e(r3, r0)
            java.lang.String r0 = "factory"
            hc.t.e(r4, r0)
            androidx.lifecycle.y0 r0 = r3.I()
            java.lang.String r1 = "owner.viewModelStore"
            hc.t.d(r0, r1)
            e1.a r3 = androidx.lifecycle.x0.a(r3)
            r2.<init>(r0, r4, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.v0.<init>(androidx.lifecycle.z0, androidx.lifecycle.v0$b):void");
    }

    public <T extends s0> T a(Class<T> cls) {
        hc.t.e(cls, "modelClass");
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) b("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends s0> T b(String str, Class<T> cls) {
        T t10;
        hc.t.e(str, "key");
        hc.t.e(cls, "modelClass");
        T t11 = (T) this.f4386a.b(str);
        if (!cls.isInstance(t11)) {
            e1.d dVar = new e1.d(this.f4388c);
            dVar.c(c.f4395b, str);
            try {
                t10 = (T) this.f4387b.b(cls, dVar);
            } catch (AbstractMethodError unused) {
                t10 = (T) this.f4387b.a(cls);
            }
            this.f4386a.d(str, t10);
            return t10;
        }
        b bVar = this.f4387b;
        d dVar2 = bVar instanceof d ? (d) bVar : null;
        if (dVar2 != null) {
            hc.t.d(t11, "viewModel");
            dVar2.c(t11);
        }
        Objects.requireNonNull(t11, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
        return t11;
    }
}
