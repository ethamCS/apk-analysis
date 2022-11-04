package d.a.b.w.n;

import d.a.b.t;
import d.a.b.u;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class h extends t<Object> {

    /* renamed from: b */
    public static final u f3828b = new a();

    /* renamed from: a */
    private final d.a.b.e f3829a;

    /* loaded from: classes.dex */
    static class a implements u {
        a() {
        }

        @Override // d.a.b.u
        public <T> t<T> b(d.a.b.e eVar, d.a.b.x.a<T> aVar) {
            if (aVar.c() == Object.class) {
                return new h(eVar);
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f3830a;

        static {
            int[] iArr = new int[d.a.b.y.b.values().length];
            f3830a = iArr;
            try {
                iArr[d.a.b.y.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3830a[d.a.b.y.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3830a[d.a.b.y.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f3830a[d.a.b.y.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3830a[d.a.b.y.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3830a[d.a.b.y.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    h(d.a.b.e eVar) {
        this.f3829a = eVar;
    }

    @Override // d.a.b.t
    public Object b(d.a.b.y.a aVar) {
        switch (b.f3830a[aVar.w0().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.i0()) {
                    arrayList.add(b(aVar));
                }
                aVar.f0();
                return arrayList;
            case 2:
                d.a.b.w.h hVar = new d.a.b.w.h();
                aVar.c();
                while (aVar.i0()) {
                    hVar.put(aVar.q0(), b(aVar));
                }
                aVar.g0();
                return hVar;
            case 3:
                return aVar.u0();
            case 4:
                return Double.valueOf(aVar.n0());
            case 5:
                return Boolean.valueOf(aVar.m0());
            case 6:
                aVar.s0();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // d.a.b.t
    public void d(d.a.b.y.c cVar, Object obj) {
        if (obj == null) {
            cVar.m0();
            return;
        }
        t l = this.f3829a.l(obj.getClass());
        if (!(l instanceof h)) {
            l.d(cVar, obj);
            return;
        }
        cVar.I();
        cVar.g0();
    }
}
