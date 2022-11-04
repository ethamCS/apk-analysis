package n3;

import c4.i;
import c4.q;
import c4.t;
import m3.j;
import m3.k;
import m3.l;
import y3.h;
/* loaded from: classes.dex */
public class g {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f16863a;

        /* renamed from: b */
        static final /* synthetic */ int[] f16864b;

        static {
            int[] iArr = new int[y3.b.values().length];
            f16864b = iArr;
            try {
                iArr[y3.b.SKIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16864b[y3.b.NORMALIZED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16864b[y3.b.REFLECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f16864b[y3.b.EXTENDED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f16864b[y3.b.WRAP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f16864b[y3.b.ZERO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            int[] iArr2 = new int[t.b.values().length];
            f16863a = iArr2;
            try {
                iArr2[t.b.GRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f16863a[t.b.PLANAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f16863a[t.b.INTERLEAVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public static <T extends q<T>, Border extends h<T>> Border a(y3.b bVar, Class<T> cls) {
        y3.c cVar;
        switch (a.f16864b[bVar.ordinal()]) {
            case 1:
                throw new IllegalArgumentException("Skip border can't be implemented here and has to be done externally. Instead pass in EXTENDED and manually skip over the in a pixel by pixel basis.");
            case 2:
                throw new IllegalArgumentException("Normalized can't be supported by this border interface");
            case 3:
                cVar = e.f16861a;
                break;
            case 4:
                cVar = d.f16860a;
                break;
            case 5:
                cVar = f.f16862a;
                break;
            case 6:
                return (Border) b(0.0d, cls);
            default:
                throw new IllegalArgumentException("Border type not supported: " + bVar);
        }
        if (cls == c4.a.class) {
            return new y3.d(cVar);
        }
        if (cls == c4.b.class) {
            return new y3.e(cVar);
        }
        if (c4.f.class.isAssignableFrom(cls)) {
            return new y3.f(cVar);
        }
        if (cls == i.class) {
            return new y3.g(cVar);
        }
        String simpleName = cls.getSimpleName();
        throw new IllegalArgumentException("Unknown image type: " + simpleName);
    }

    public static <T extends q<T>> h<T> b(double d10, Class<T> cls) {
        if (cls == c4.a.class) {
            return new j((float) d10);
        }
        if (cls == c4.b.class) {
            return new k(d10);
        }
        if (c4.f.class.isAssignableFrom(cls)) {
            return new l((int) d10);
        }
        String simpleName = cls.getSimpleName();
        throw new IllegalArgumentException("Unknown image type: " + simpleName);
    }
}
