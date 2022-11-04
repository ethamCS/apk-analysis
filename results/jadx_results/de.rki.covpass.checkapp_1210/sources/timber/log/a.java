package timber.log;

import android.os.Build;
import android.util.Log;
import bf.y;
import hc.t;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import tb.e0;
import ub.u;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007"}, d2 = {"Ltimber/log/a;", BuildConfig.FLAVOR, "<init>", "()V", "a", "b", "c", "timber_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a */
    public static final b f22457a = new b(null);

    /* renamed from: b */
    private static final ArrayList<c> f22458b = new ArrayList<>();

    /* renamed from: c */
    private static volatile c[] f22459c = new c[0];

    @Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\n\b\u0016\u0018\u0000 \u00162\u00020\u0001:\u0001\u0017B\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J,\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014R\"\u0010\u0010\u001a\u0010\u0012\f\u0012\n \u000f*\u0004\u0018\u00010\u00040\u00040\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00048PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0018"}, d2 = {"Ltimber/log/a$a;", "Ltimber/log/a$c;", "Ljava/lang/StackTraceElement;", "element", BuildConfig.FLAVOR, "createStackElementTag", BuildConfig.FLAVOR, "priority", "tag", "message", BuildConfig.FLAVOR, "t", "Ltb/e0;", "log", BuildConfig.FLAVOR, "kotlin.jvm.PlatformType", "fqcnIgnore", "Ljava/util/List;", "getTag$timber_release", "()Ljava/lang/String;", "<init>", "()V", "Companion", "a", "timber_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: timber.log.a$a */
    /* loaded from: classes3.dex */
    public static class C0395a extends c {
        private static final int MAX_LOG_LENGTH = 4000;
        private static final int MAX_TAG_LENGTH = 23;
        private final List<String> fqcnIgnore;
        public static final C0396a Companion = new C0396a(null);
        private static final Pattern ANONYMOUS_CLASS = Pattern.compile("(\\$\\d+)+$");

        @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Ltimber/log/a$a$a;", BuildConfig.FLAVOR, "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "ANONYMOUS_CLASS", "Ljava/util/regex/Pattern;", BuildConfig.FLAVOR, "MAX_LOG_LENGTH", "I", "MAX_TAG_LENGTH", "<init>", "()V", "timber_release"}, k = 1, mv = {1, 5, 1})
        /* renamed from: timber.log.a$a$a */
        /* loaded from: classes3.dex */
        public static final class C0396a {
            private C0396a() {
            }

            public /* synthetic */ C0396a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        public C0395a() {
            List<String> k10;
            k10 = u.k(a.class.getName(), b.class.getName(), c.class.getName(), C0395a.class.getName());
            this.fqcnIgnore = k10;
        }

        protected String createStackElementTag(StackTraceElement stackTraceElement) {
            String L0;
            t.e(stackTraceElement, "element");
            String className = stackTraceElement.getClassName();
            t.d(className, "element.className");
            L0 = y.L0(className, '.', null, 2, null);
            Matcher matcher = ANONYMOUS_CLASS.matcher(L0);
            if (matcher.find()) {
                L0 = matcher.replaceAll(BuildConfig.FLAVOR);
                t.d(L0, "m.replaceAll(\"\")");
            }
            if (L0.length() <= 23 || Build.VERSION.SDK_INT >= 26) {
                return L0;
            }
            String substring = L0.substring(0, 23);
            t.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return substring;
        }

        @Override // timber.log.a.c
        public String getTag$timber_release() {
            String tag$timber_release = super.getTag$timber_release();
            if (tag$timber_release == null) {
                StackTraceElement[] stackTrace = new Throwable().getStackTrace();
                t.d(stackTrace, "Throwable().stackTrace");
                for (StackTraceElement stackTraceElement : stackTrace) {
                    if (!this.fqcnIgnore.contains(stackTraceElement.getClassName())) {
                        return createStackElementTag(stackTraceElement);
                    }
                }
                throw new NoSuchElementException("Array contains no element matching the predicate.");
            }
            return tag$timber_release;
        }

        @Override // timber.log.a.c
        protected void log(int i10, String str, String str2, Throwable th2) {
            int Z;
            int min;
            t.e(str2, "message");
            if (str2.length() < MAX_LOG_LENGTH) {
                if (i10 == 7) {
                    Log.wtf(str, str2);
                    return;
                } else {
                    Log.println(i10, str, str2);
                    return;
                }
            }
            int i11 = 0;
            int length = str2.length();
            while (i11 < length) {
                Z = y.Z(str2, '\n', i11, false, 4, null);
                if (Z == -1) {
                    Z = length;
                }
                while (true) {
                    min = Math.min(Z, i11 + MAX_LOG_LENGTH);
                    String substring = str2.substring(i11, min);
                    t.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (i10 == 7) {
                        Log.wtf(str, substring);
                    } else {
                        Log.println(i10, str, substring);
                    }
                    if (min >= Z) {
                        break;
                    }
                    i11 = min;
                }
                i11 = min + 1;
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b$\u0010%J3\u0010\b\u001a\u00020\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\b\u0010\tJ=\u0010\b\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\b\u0010\fJ\u0012\u0010\b\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017J3\u0010\r\u001a\u00020\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\r\u0010\tJ=\u0010\r\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\r\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017J3\u0010\u000e\u001a\u00020\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u000e\u0010\tJ=\u0010\u000e\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000e\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017J3\u0010\u000f\u001a\u00020\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u000f\u0010\tJ=\u0010\u000f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u000f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017J3\u0010\u0010\u001a\u00020\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u0010\u0010\tJ=\u0010\u0010\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0010\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017J3\u0010\u0011\u001a\u00020\u00072\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u0011\u0010\tJ=\u0010\u0011\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u0011\u0010\fJ\u0012\u0010\u0011\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017J;\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u0014\u0010\u0015JE\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0016\u0010\u0006\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\u0004\"\u0004\u0018\u00010\u0005H\u0017¢\u0006\u0004\b\u0014\u0010\u0016J\u001a\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0017J,\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0017\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\u0010\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0001H\u0007J\u0010\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u0001H\u0007J\b\u0010\u001b\u001a\u00020\u0007H\u0007R\u0011\u0010\u001e\u001a\u00020\u00128G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Ltimber/log/a$b;", "Ltimber/log/a$c;", BuildConfig.FLAVOR, "message", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "args", "Ltb/e0;", "v", "(Ljava/lang/String;[Ljava/lang/Object;)V", BuildConfig.FLAVOR, "t", "(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "d", "i", "w", "e", "wtf", BuildConfig.FLAVOR, "priority", "log", "(ILjava/lang/String;[Ljava/lang/Object;)V", "(ILjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "tag", "tree", "a", "c", "f", "b", "()I", "treeCount", "treeArray", "[Ltimber/log/a$c;", "Ljava/util/ArrayList;", "trees", "Ljava/util/ArrayList;", "<init>", "()V", "timber_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static final class b extends c {
        private b() {
        }

        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @fc.c
        public final void a(c cVar) {
            t.e(cVar, "tree");
            if (cVar != this) {
                synchronized (a.f22458b) {
                    a.f22458b.add(cVar);
                    b bVar = a.f22457a;
                    Object[] array = a.f22458b.toArray(new c[0]);
                    if (array == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                    }
                    a.f22459c = (c[]) array;
                    e0 e0Var = e0.f22152a;
                }
                return;
            }
            throw new IllegalArgumentException("Cannot plant Timber into itself.".toString());
        }

        @fc.c
        public final int b() {
            return a.f22459c.length;
        }

        @fc.c
        public final void c(c cVar) {
            t.e(cVar, "tree");
            synchronized (a.f22458b) {
                if (!a.f22458b.remove(cVar)) {
                    throw new IllegalArgumentException(t.l("Cannot uproot tree which is not planted: ", cVar).toString());
                }
                b bVar = a.f22457a;
                Object[] array = a.f22458b.toArray(new c[0]);
                if (array == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
                a.f22459c = (c[]) array;
                e0 e0Var = e0.f22152a;
            }
        }

        @Override // timber.log.a.c
        @fc.c
        public void d(String str, Object... objArr) {
            t.e(objArr, "args");
            for (c cVar : a.f22459c) {
                cVar.d(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // timber.log.a.c
        @fc.c
        public void d(Throwable th2) {
            for (c cVar : a.f22459c) {
                cVar.d(th2);
            }
        }

        @Override // timber.log.a.c
        @fc.c
        public void d(Throwable th2, String str, Object... objArr) {
            t.e(objArr, "args");
            for (c cVar : a.f22459c) {
                cVar.d(th2, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // timber.log.a.c
        @fc.c
        public void e(String str, Object... objArr) {
            t.e(objArr, "args");
            for (c cVar : a.f22459c) {
                cVar.e(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // timber.log.a.c
        @fc.c
        public void e(Throwable th2) {
            for (c cVar : a.f22459c) {
                cVar.e(th2);
            }
        }

        @Override // timber.log.a.c
        @fc.c
        public void e(Throwable th2, String str, Object... objArr) {
            t.e(objArr, "args");
            for (c cVar : a.f22459c) {
                cVar.e(th2, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @fc.c
        public final void f() {
            synchronized (a.f22458b) {
                a.f22458b.clear();
                b bVar = a.f22457a;
                a.f22459c = new c[0];
                e0 e0Var = e0.f22152a;
            }
        }

        @Override // timber.log.a.c
        @fc.c
        public void i(String str, Object... objArr) {
            t.e(objArr, "args");
            for (c cVar : a.f22459c) {
                cVar.i(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // timber.log.a.c
        @fc.c
        public void i(Throwable th2) {
            for (c cVar : a.f22459c) {
                cVar.i(th2);
            }
        }

        @Override // timber.log.a.c
        @fc.c
        public void i(Throwable th2, String str, Object... objArr) {
            t.e(objArr, "args");
            for (c cVar : a.f22459c) {
                cVar.i(th2, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // timber.log.a.c
        protected void log(int i10, String str, String str2, Throwable th2) {
            t.e(str2, "message");
            throw new AssertionError();
        }

        @Override // timber.log.a.c
        @fc.c
        public void log(int i10, String str, Object... objArr) {
            t.e(objArr, "args");
            for (c cVar : a.f22459c) {
                cVar.log(i10, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // timber.log.a.c
        @fc.c
        public void log(int i10, Throwable th2) {
            for (c cVar : a.f22459c) {
                cVar.log(i10, th2);
            }
        }

        @Override // timber.log.a.c
        @fc.c
        public void log(int i10, Throwable th2, String str, Object... objArr) {
            t.e(objArr, "args");
            for (c cVar : a.f22459c) {
                cVar.log(i10, th2, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // timber.log.a.c
        @fc.c
        public void v(String str, Object... objArr) {
            t.e(objArr, "args");
            for (c cVar : a.f22459c) {
                cVar.v(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // timber.log.a.c
        @fc.c
        public void v(Throwable th2) {
            for (c cVar : a.f22459c) {
                cVar.v(th2);
            }
        }

        @Override // timber.log.a.c
        @fc.c
        public void v(Throwable th2, String str, Object... objArr) {
            t.e(objArr, "args");
            for (c cVar : a.f22459c) {
                cVar.v(th2, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // timber.log.a.c
        @fc.c
        public void w(String str, Object... objArr) {
            t.e(objArr, "args");
            for (c cVar : a.f22459c) {
                cVar.w(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // timber.log.a.c
        @fc.c
        public void w(Throwable th2) {
            for (c cVar : a.f22459c) {
                cVar.w(th2);
            }
        }

        @Override // timber.log.a.c
        @fc.c
        public void w(Throwable th2, String str, Object... objArr) {
            t.e(objArr, "args");
            for (c cVar : a.f22459c) {
                cVar.w(th2, str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // timber.log.a.c
        @fc.c
        public void wtf(String str, Object... objArr) {
            t.e(objArr, "args");
            for (c cVar : a.f22459c) {
                cVar.wtf(str, Arrays.copyOf(objArr, objArr.length));
            }
        }

        @Override // timber.log.a.c
        @fc.c
        public void wtf(Throwable th2) {
            for (c cVar : a.f22459c) {
                cVar.wtf(th2);
            }
        }

        @Override // timber.log.a.c
        @fc.c
        public void wtf(Throwable th2, String str, Object... objArr) {
            t.e(objArr, "args");
            for (c cVar : a.f22459c) {
                cVar.wtf(th2, str, Arrays.copyOf(objArr, objArr.length));
            }
        }
    }

    @Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b$\u0010%JC\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J1\u0010\u000e\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u000e\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u000e\u0010\u0010J\u0012\u0010\u000e\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J1\u0010\u0011\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u000fJ;\u0010\u0011\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u0012\u0010\u0011\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J1\u0010\u0012\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ;\u0010\u0012\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0012\u0010\u0010J\u0012\u0010\u0012\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J1\u0010\u0013\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u000fJ;\u0010\u0013\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u0012\u0010\u0013\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J1\u0010\u0014\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u000fJ;\u0010\u0014\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0014\u0010\u0010J\u0012\u0010\u0014\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J1\u0010\u0015\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u000fJ;\u0010\u0015\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0015\u0010\u0010J\u0012\u0010\u0015\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J9\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\u0017JC\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\b\"\u0004\u0018\u00010\u0001H\u0016¢\u0006\u0004\b\u0016\u0010\fJ\u001a\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0003\u001a\u00020\u0002H\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0014J)\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0010\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\bH\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ,\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u001a\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H$R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u001d8@X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00068PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Ltimber/log/a$c;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "priority", BuildConfig.FLAVOR, "t", BuildConfig.FLAVOR, "message", BuildConfig.FLAVOR, "args", "Ltb/e0;", "prepareLog", "(ILjava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "getStackTraceString", "v", "(Ljava/lang/String;[Ljava/lang/Object;)V", "(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V", "d", "i", "w", "e", "wtf", "log", "(ILjava/lang/String;[Ljava/lang/Object;)V", BuildConfig.FLAVOR, "isLoggable", "tag", "formatMessage", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "Ljava/lang/ThreadLocal;", "explicitTag", "Ljava/lang/ThreadLocal;", "getExplicitTag$timber_release", "()Ljava/lang/ThreadLocal;", "getTag$timber_release", "()Ljava/lang/String;", "<init>", "()V", "timber_release"}, k = 1, mv = {1, 5, 1})
    /* loaded from: classes3.dex */
    public static abstract class c {
        private final ThreadLocal<String> explicitTag = new ThreadLocal<>();

        private final String getStackTraceString(Throwable th2) {
            StringWriter stringWriter = new StringWriter(PSKKeyManager.MAX_KEY_LENGTH_BYTES);
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
            th2.printStackTrace(printWriter);
            printWriter.flush();
            String stringWriter2 = stringWriter.toString();
            t.d(stringWriter2, "sw.toString()");
            return stringWriter2;
        }

        private final void prepareLog(int i10, Throwable th2, String str, Object... objArr) {
            String tag$timber_release = getTag$timber_release();
            if (!isLoggable(tag$timber_release, i10)) {
                return;
            }
            boolean z10 = false;
            if (!(str == null || str.length() == 0)) {
                if (objArr.length == 0) {
                    z10 = true;
                }
                if (!z10) {
                    str = formatMessage(str, objArr);
                }
                if (th2 != null) {
                    str = ((Object) str) + '\n' + getStackTraceString(th2);
                }
            } else if (th2 == null) {
                return;
            } else {
                str = getStackTraceString(th2);
            }
            log(i10, tag$timber_release, str, th2);
        }

        public void d(String str, Object... objArr) {
            t.e(objArr, "args");
            prepareLog(3, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void d(Throwable th2) {
            prepareLog(3, th2, null, new Object[0]);
        }

        public void d(Throwable th2, String str, Object... objArr) {
            t.e(objArr, "args");
            prepareLog(3, th2, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void e(String str, Object... objArr) {
            t.e(objArr, "args");
            prepareLog(6, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void e(Throwable th2) {
            prepareLog(6, th2, null, new Object[0]);
        }

        public void e(Throwable th2, String str, Object... objArr) {
            t.e(objArr, "args");
            prepareLog(6, th2, str, Arrays.copyOf(objArr, objArr.length));
        }

        protected String formatMessage(String str, Object[] objArr) {
            t.e(str, "message");
            t.e(objArr, "args");
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            String format = String.format(str, Arrays.copyOf(copyOf, copyOf.length));
            t.d(format, "java.lang.String.format(this, *args)");
            return format;
        }

        public final /* synthetic */ ThreadLocal getExplicitTag$timber_release() {
            return this.explicitTag;
        }

        public /* synthetic */ String getTag$timber_release() {
            String str = this.explicitTag.get();
            if (str != null) {
                this.explicitTag.remove();
            }
            return str;
        }

        public void i(String str, Object... objArr) {
            t.e(objArr, "args");
            prepareLog(4, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void i(Throwable th2) {
            prepareLog(4, th2, null, new Object[0]);
        }

        public void i(Throwable th2, String str, Object... objArr) {
            t.e(objArr, "args");
            prepareLog(4, th2, str, Arrays.copyOf(objArr, objArr.length));
        }

        protected boolean isLoggable(int i10) {
            return true;
        }

        protected boolean isLoggable(String str, int i10) {
            return isLoggable(i10);
        }

        protected abstract void log(int i10, String str, String str2, Throwable th2);

        public void log(int i10, String str, Object... objArr) {
            t.e(objArr, "args");
            prepareLog(i10, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void log(int i10, Throwable th2) {
            prepareLog(i10, th2, null, new Object[0]);
        }

        public void log(int i10, Throwable th2, String str, Object... objArr) {
            t.e(objArr, "args");
            prepareLog(i10, th2, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void v(String str, Object... objArr) {
            t.e(objArr, "args");
            prepareLog(2, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void v(Throwable th2) {
            prepareLog(2, th2, null, new Object[0]);
        }

        public void v(Throwable th2, String str, Object... objArr) {
            t.e(objArr, "args");
            prepareLog(2, th2, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void w(String str, Object... objArr) {
            t.e(objArr, "args");
            prepareLog(5, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void w(Throwable th2) {
            prepareLog(5, th2, null, new Object[0]);
        }

        public void w(Throwable th2, String str, Object... objArr) {
            t.e(objArr, "args");
            prepareLog(5, th2, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void wtf(String str, Object... objArr) {
            t.e(objArr, "args");
            prepareLog(7, null, str, Arrays.copyOf(objArr, objArr.length));
        }

        public void wtf(Throwable th2) {
            prepareLog(7, th2, null, new Object[0]);
        }

        public void wtf(Throwable th2, String str, Object... objArr) {
            t.e(objArr, "args");
            prepareLog(7, th2, str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    private a() {
        throw new AssertionError();
    }
}
