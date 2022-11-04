package c.b.a.a;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
/* loaded from: classes.dex */
public final class e {

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: e */
        private static boolean f380e;

        /* renamed from: a */
        private final String f381a;

        /* renamed from: b */
        private final a f382b;

        /* renamed from: c */
        private a f383c;

        /* renamed from: d */
        private boolean f384d;

        /* loaded from: classes.dex */
        public static final class a {

            /* renamed from: a */
            String f385a;

            /* renamed from: b */
            Object f386b;

            /* renamed from: c */
            a f387c;

            private a() {
            }
        }

        private b(String str) {
            a aVar = new a();
            this.f382b = aVar;
            this.f383c = aVar;
            this.f384d = false;
            d();
            i.h(str);
            this.f381a = str;
        }

        private a a() {
            a aVar = new a();
            this.f383c.f387c = aVar;
            this.f383c = aVar;
            return aVar;
        }

        private b b(Object obj) {
            a().f386b = obj;
            return this;
        }

        private static void d() {
            if (f380e) {
                return;
            }
            synchronized (b.class) {
                if (f380e) {
                    return;
                }
                f380e = true;
                try {
                    c.b();
                } catch (Throwable th) {
                    Logger.getLogger(b.class.getName()).log(Level.WARNING, "Java 7 compatibility warning: See https://github.com/google/guava/issues/5269", (Throwable) new Exception("Guava will drop support for Java 7 in 2021. Please let us know if this will cause you problems: https://github.com/google/guava/issues/5269", th));
                }
            }
        }

        public b c(Object obj) {
            b(obj);
            return this;
        }

        public String toString() {
            boolean z = this.f384d;
            StringBuilder sb = new StringBuilder(32);
            sb.append(this.f381a);
            sb.append('{');
            String str = "";
            for (a aVar = this.f382b.f387c; aVar != null; aVar = aVar.f387c) {
                Object obj = aVar.f386b;
                if (!z || obj != null) {
                    sb.append(str);
                    String str2 = aVar.f385a;
                    if (str2 != null) {
                        sb.append(str2);
                        sb.append('=');
                    }
                    if (obj == null || !obj.getClass().isArray()) {
                        sb.append(obj);
                    } else {
                        String deepToString = Arrays.deepToString(new Object[]{obj});
                        sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                    }
                    str = ", ";
                }
            }
            sb.append('}');
            return sb.toString();
        }
    }

    public static b a(Object obj) {
        return new b(obj.getClass().getSimpleName());
    }
}
