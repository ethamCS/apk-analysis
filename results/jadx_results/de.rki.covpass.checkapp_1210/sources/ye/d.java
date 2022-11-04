package ye;

import gc.l;
import gc.p;
import gc.q;
import hc.v;
import tb.e0;
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a */
    private static final l<Object, Object> f26233a = f.f26244c;

    /* renamed from: b */
    private static final l<Object, Boolean> f26234b = b.f26240c;

    /* renamed from: c */
    private static final l<Object, Object> f26235c = a.f26239c;

    /* renamed from: d */
    private static final l<Object, e0> f26236d = c.f26241c;

    /* renamed from: e */
    private static final p<Object, Object, e0> f26237e = C0461d.f26242c;

    /* renamed from: f */
    private static final q<Object, Object, Object, e0> f26238f = e.f26243c;

    /* loaded from: classes3.dex */
    static final class a extends v implements l {

        /* renamed from: c */
        public static final a f26239c = new a();

        a() {
            super(1);
        }

        /* renamed from: b */
        public final Void invoke(Object obj) {
            return null;
        }
    }

    /* loaded from: classes3.dex */
    static final class b extends v implements l<Object, Boolean> {

        /* renamed from: c */
        public static final b f26240c = new b();

        b() {
            super(1);
        }

        /* renamed from: b */
        public final Boolean invoke(Object obj) {
            return Boolean.TRUE;
        }
    }

    /* loaded from: classes3.dex */
    static final class c extends v implements l<Object, e0> {

        /* renamed from: c */
        public static final c f26241c = new c();

        c() {
            super(1);
        }

        public final void b(Object obj) {
        }

        @Override // gc.l
        public /* bridge */ /* synthetic */ e0 invoke(Object obj) {
            b(obj);
            return e0.f22152a;
        }
    }

    /* renamed from: ye.d$d */
    /* loaded from: classes3.dex */
    static final class C0461d extends v implements p<Object, Object, e0> {

        /* renamed from: c */
        public static final C0461d f26242c = new C0461d();

        C0461d() {
            super(2);
        }

        public final void b(Object obj, Object obj2) {
        }

        @Override // gc.p
        public /* bridge */ /* synthetic */ e0 u(Object obj, Object obj2) {
            b(obj, obj2);
            return e0.f22152a;
        }
    }

    /* loaded from: classes3.dex */
    static final class e extends v implements q<Object, Object, Object, e0> {

        /* renamed from: c */
        public static final e f26243c = new e();

        e() {
            super(3);
        }

        public final void b(Object obj, Object obj2, Object obj3) {
        }

        @Override // gc.q
        public /* bridge */ /* synthetic */ e0 s(Object obj, Object obj2, Object obj3) {
            b(obj, obj2, obj3);
            return e0.f22152a;
        }
    }

    /* loaded from: classes3.dex */
    static final class f extends v implements l<Object, Object> {

        /* renamed from: c */
        public static final f f26244c = new f();

        f() {
            super(1);
        }

        @Override // gc.l
        public final Object invoke(Object obj) {
            return obj;
        }
    }

    public static final <T> l<T, Boolean> a() {
        return (l<T, Boolean>) f26234b;
    }

    public static final q<Object, Object, Object, e0> b() {
        return f26238f;
    }
}
