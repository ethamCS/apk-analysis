package j$.util;

import java.util.Objects;
/* loaded from: classes2.dex */
public abstract class U {

    /* renamed from: a */
    private static final Spliterator f13271a = new P();

    /* renamed from: b */
    private static final B f13272b = new N();

    /* renamed from: c */
    private static final D f13273c = new O();

    /* renamed from: d */
    private static final z f13274d = new M();

    private static void a(int i10, int i11, int i12) {
        if (i11 <= i12) {
            if (i11 < 0) {
                throw new ArrayIndexOutOfBoundsException(i11);
            }
            if (i12 > i10) {
                throw new ArrayIndexOutOfBoundsException(i12);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i11 + ") > fence(" + i12 + ")");
    }

    public static z b() {
        return f13274d;
    }

    public static B c() {
        return f13272b;
    }

    public static D d() {
        return f13273c;
    }

    public static Spliterator e() {
        return f13271a;
    }

    public static AbstractC0518q f(z zVar) {
        Objects.requireNonNull(zVar);
        return new J(zVar);
    }

    public static AbstractC0639t g(B b10) {
        Objects.requireNonNull(b10);
        return new H(b10);
    }

    public static AbstractC0642w h(D d10) {
        Objects.requireNonNull(d10);
        return new I(d10);
    }

    public static java.util.Iterator i(Spliterator spliterator) {
        Objects.requireNonNull(spliterator);
        return new G(spliterator);
    }

    public static z j(double[] dArr, int i10, int i11) {
        Objects.requireNonNull(dArr);
        a(dArr.length, i10, i11);
        return new L(dArr, i10, i11, 1040);
    }

    public static B k(int[] iArr, int i10, int i11) {
        Objects.requireNonNull(iArr);
        a(iArr.length, i10, i11);
        return new Q(iArr, i10, i11, 1040);
    }

    public static D l(long[] jArr, int i10, int i11) {
        Objects.requireNonNull(jArr);
        a(jArr.length, i10, i11);
        return new T(jArr, i10, i11, 1040);
    }

    public static Spliterator m(Object[] objArr, int i10, int i11) {
        Objects.requireNonNull(objArr);
        a(objArr.length, i10, i11);
        return new K(objArr, i10, i11, 1040);
    }

    public static Spliterator n(java.util.Iterator it) {
        Objects.requireNonNull(it);
        return new S(it);
    }
}
