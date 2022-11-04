package h.a;

import android.os.Build;
import android.util.Log;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private static final c[] f4658a;

    /* renamed from: c */
    static volatile c[] f4660c;

    /* renamed from: b */
    private static final List<c> f4659b = new ArrayList();

    /* renamed from: d */
    private static final c f4661d = new C0122a();

    /* renamed from: h.a.a$a */
    /* loaded from: classes.dex */
    static class C0122a extends c {
        C0122a() {
        }

        @Override // h.a.a.c
        public void a(String str, Object... objArr) {
            for (c cVar : a.f4660c) {
                cVar.a(str, objArr);
            }
        }

        @Override // h.a.a.c
        public void b(String str, Object... objArr) {
            for (c cVar : a.f4660c) {
                cVar.b(str, objArr);
            }
        }

        @Override // h.a.a.c
        public void c(Throwable th) {
            for (c cVar : a.f4660c) {
                cVar.c(th);
            }
        }

        @Override // h.a.a.c
        public void d(Throwable th, String str, Object... objArr) {
            for (c cVar : a.f4660c) {
                cVar.d(th, str, objArr);
            }
        }

        @Override // h.a.a.c
        protected void j(int i, String str, String str2, Throwable th) {
            throw new AssertionError("Missing override for log method.");
        }
    }

    /* loaded from: classes.dex */
    public static class b extends c {

        /* renamed from: b */
        private static final Pattern f4662b = Pattern.compile("(\\$\\d+)+$");

        @Override // h.a.a.c
        final String g() {
            String g2 = super.g();
            if (g2 != null) {
                return g2;
            }
            StackTraceElement[] stackTrace = new Throwable().getStackTrace();
            if (stackTrace.length <= 5) {
                throw new IllegalStateException("Synthetic stacktrace didn't have enough elements: are you using proguard?");
            }
            return l(stackTrace[5]);
        }

        @Override // h.a.a.c
        protected void j(int i, String str, String str2, Throwable th) {
            int min;
            if (str2.length() < 4000) {
                if (i == 7) {
                    Log.wtf(str, str2);
                    return;
                } else {
                    Log.println(i, str, str2);
                    return;
                }
            }
            int i2 = 0;
            int length = str2.length();
            while (i2 < length) {
                int indexOf = str2.indexOf(10, i2);
                if (indexOf == -1) {
                    indexOf = length;
                }
                while (true) {
                    min = Math.min(indexOf, i2 + 4000);
                    String substring = str2.substring(i2, min);
                    if (i == 7) {
                        Log.wtf(str, substring);
                    } else {
                        Log.println(i, str, substring);
                    }
                    if (min >= indexOf) {
                        break;
                    }
                    i2 = min;
                }
                i2 = min + 1;
            }
        }

        protected String l(StackTraceElement stackTraceElement) {
            String className = stackTraceElement.getClassName();
            Matcher matcher = f4662b.matcher(className);
            if (matcher.find()) {
                className = matcher.replaceAll("");
            }
            String substring = className.substring(className.lastIndexOf(46) + 1);
            return (substring.length() <= 23 || Build.VERSION.SDK_INT >= 24) ? substring : substring.substring(0, 23);
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a */
        final ThreadLocal<String> f4663a = new ThreadLocal<>();

        private String f(Throwable th) {
            StringWriter stringWriter = new StringWriter(256);
            PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
            th.printStackTrace(printWriter);
            printWriter.flush();
            return stringWriter.toString();
        }

        private void k(int i, Throwable th, String str, Object... objArr) {
            String g2 = g();
            if (!i(g2, i)) {
                return;
            }
            if (str != null && str.length() == 0) {
                str = null;
            }
            if (str != null) {
                if (objArr != null && objArr.length > 0) {
                    str = e(str, objArr);
                }
                if (th != null) {
                    str = str + "\n" + f(th);
                }
            } else if (th == null) {
                return;
            } else {
                str = f(th);
            }
            j(i, g2, str, th);
        }

        public void a(String str, Object... objArr) {
            k(3, null, str, objArr);
        }

        public void b(String str, Object... objArr) {
            k(6, null, str, objArr);
        }

        public void c(Throwable th) {
            k(6, th, null, new Object[0]);
        }

        public void d(Throwable th, String str, Object... objArr) {
            k(6, th, str, objArr);
        }

        protected String e(String str, Object[] objArr) {
            return String.format(str, objArr);
        }

        String g() {
            String str = this.f4663a.get();
            if (str != null) {
                this.f4663a.remove();
            }
            return str;
        }

        @Deprecated
        protected boolean h(int i) {
            return true;
        }

        public boolean i(String str, int i) {
            return h(i);
        }

        protected abstract void j(int i, String str, String str2, Throwable th);
    }

    static {
        c[] cVarArr = new c[0];
        f4658a = cVarArr;
        f4660c = cVarArr;
    }

    public static void a(String str, Object... objArr) {
        f4661d.a(str, objArr);
    }

    public static void b(String str, Object... objArr) {
        f4661d.b(str, objArr);
    }

    public static void c(Throwable th) {
        f4661d.c(th);
    }

    public static void d(Throwable th, String str, Object... objArr) {
        f4661d.d(th, str, objArr);
    }

    public static List<c> e() {
        List<c> unmodifiableList;
        List<c> list = f4659b;
        synchronized (list) {
            unmodifiableList = Collections.unmodifiableList(new ArrayList(list));
        }
        return unmodifiableList;
    }

    public static void f(c cVar) {
        Objects.requireNonNull(cVar, "tree == null");
        if (cVar != f4661d) {
            List<c> list = f4659b;
            synchronized (list) {
                list.add(cVar);
                f4660c = (c[]) list.toArray(new c[list.size()]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot plant Timber into itself.");
    }

    public static void g(c cVar) {
        List<c> list = f4659b;
        synchronized (list) {
            if (!list.remove(cVar)) {
                throw new IllegalArgumentException("Cannot uproot tree which is not planted: " + cVar);
            }
            f4660c = (c[]) list.toArray(new c[list.size()]);
        }
    }
}
