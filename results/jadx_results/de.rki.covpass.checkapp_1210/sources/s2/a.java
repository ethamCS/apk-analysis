package s2;

import c4.n;
/* loaded from: classes.dex */
public class a extends w3.a {

    /* renamed from: a */
    public static b f21350a;

    /* renamed from: b */
    public static AbstractC0349a f21351b;

    /* renamed from: s2.a$a */
    /* loaded from: classes.dex */
    public interface AbstractC0349a<T extends n<T>> {
        void a(T t10, T t11, double d10, int i10, double d11, int i11, T t12);
    }

    /* loaded from: classes.dex */
    public interface b<T extends n<T>> {
        void a(T t10, T t11, int i10, int i11, T t12);
    }

    static {
        w3.b.a(a.class);
    }

    public static <T extends n<T>> boolean a(T t10, T t11, double d10, int i10, double d11, int i11, T t12) {
        AbstractC0349a abstractC0349a = f21351b;
        if (abstractC0349a != null) {
            try {
                abstractC0349a.a(t10, t11, d10, i10, d11, i11, t12);
                return true;
            } catch (RuntimeException unused) {
            }
        }
        return false;
    }

    public static <T extends n<T>> boolean b(T t10, T t11, int i10, int i11, T t12) {
        b bVar = f21350a;
        if (bVar != null) {
            try {
                bVar.a(t10, t11, i10, i11, t12);
                return true;
            } catch (RuntimeException unused) {
            }
        }
        return false;
    }
}
