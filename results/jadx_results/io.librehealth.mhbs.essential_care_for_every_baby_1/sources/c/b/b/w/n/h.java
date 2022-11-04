package c.b.b.w.n;

import c.b.b.t;
import c.b.b.u;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class h extends t<Object> {

    /* renamed from: b */
    public static final u f537b = new a();

    /* renamed from: a */
    private final c.b.b.e f538a;

    /* loaded from: classes.dex */
    static class a implements u {
        a() {
        }

        @Override // c.b.b.u
        public <T> t<T> a(c.b.b.e eVar, c.b.b.x.a<T> aVar) {
            if (aVar.c() == Object.class) {
                return new h(eVar);
            }
            return null;
        }
    }

    /* loaded from: classes.dex */
    static /* synthetic */ class b {

        /* renamed from: a */
        static final /* synthetic */ int[] f539a;

        static {
            int[] iArr = new int[c.b.b.y.b.values().length];
            f539a = iArr;
            try {
                iArr[c.b.b.y.b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f539a[c.b.b.y.b.BEGIN_OBJECT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f539a[c.b.b.y.b.STRING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f539a[c.b.b.y.b.NUMBER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f539a[c.b.b.y.b.BOOLEAN.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f539a[c.b.b.y.b.NULL.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    h(c.b.b.e eVar) {
        this.f538a = eVar;
    }

    @Override // c.b.b.t
    public Object b(c.b.b.y.a aVar) {
        switch (b.f539a[aVar.x().ordinal()]) {
            case 1:
                ArrayList arrayList = new ArrayList();
                aVar.a();
                while (aVar.j()) {
                    arrayList.add(b(aVar));
                }
                aVar.f();
                return arrayList;
            case 2:
                c.b.b.w.h hVar = new c.b.b.w.h();
                aVar.b();
                while (aVar.j()) {
                    hVar.put(aVar.r(), b(aVar));
                }
                aVar.g();
                return hVar;
            case 3:
                return aVar.v();
            case 4:
                return Double.valueOf(aVar.o());
            case 5:
                return Boolean.valueOf(aVar.n());
            case 6:
                aVar.t();
                return null;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // c.b.b.t
    public void d(c.b.b.y.c cVar, Object obj) {
        if (obj == null) {
            cVar.m();
            return;
        }
        t k = this.f538a.k(obj.getClass());
        if (!(k instanceof h)) {
            k.d(cVar, obj);
            return;
        }
        cVar.d();
        cVar.g();
    }
}
