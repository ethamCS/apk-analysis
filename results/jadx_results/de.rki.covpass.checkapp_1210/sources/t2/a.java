package t2;

import c4.n;
/* loaded from: classes.dex */
public class a extends w3.a {

    /* renamed from: a */
    public static AbstractC0372a f21804a;

    /* renamed from: b */
    public static b f21805b;

    /* renamed from: t2.a$a */
    /* loaded from: classes.dex */
    public interface AbstractC0372a {
        void a(n nVar, n nVar2, int i10, int i11);
    }

    /* loaded from: classes.dex */
    public interface b {
        void a(n nVar, n nVar2, int i10, int i11);
    }

    static {
        w3.b.a(a.class);
    }

    public static boolean a(n nVar, n nVar2, int i10, int i11) {
        AbstractC0372a abstractC0372a = f21804a;
        if (abstractC0372a != null) {
            try {
                abstractC0372a.a(nVar, nVar2, i10, i11);
                return true;
            } catch (RuntimeException unused) {
            }
        }
        return false;
    }

    public static boolean b(n nVar, n nVar2, int i10, int i11) {
        b bVar = f21805b;
        if (bVar != null) {
            try {
                bVar.a(nVar, nVar2, i10, i11);
                return true;
            } catch (RuntimeException unused) {
            }
        }
        return false;
    }
}
