package t2;

import c4.n;
/* loaded from: classes.dex */
public class b extends w3.a {

    /* renamed from: a */
    public static a f21806a;

    /* renamed from: b */
    public static AbstractC0373b f21807b;

    /* loaded from: classes.dex */
    public interface a {
        void a(z3.a aVar, n nVar, n nVar2);
    }

    /* renamed from: t2.b$b */
    /* loaded from: classes.dex */
    public interface AbstractC0373b {
        void a(z3.a aVar, n nVar, n nVar2);
    }

    static {
        w3.b.a(b.class);
    }

    public static boolean a(z3.a aVar, n nVar, n nVar2) {
        a aVar2 = f21806a;
        if (aVar2 != null) {
            try {
                aVar2.a(aVar, nVar, nVar2);
                return true;
            } catch (RuntimeException unused) {
            }
        }
        return false;
    }

    public static boolean b(z3.a aVar, n nVar, n nVar2) {
        AbstractC0373b abstractC0373b = f21807b;
        if (abstractC0373b != null) {
            try {
                abstractC0373b.a(aVar, nVar, nVar2);
                return true;
            } catch (RuntimeException unused) {
            }
        }
        return false;
    }
}
