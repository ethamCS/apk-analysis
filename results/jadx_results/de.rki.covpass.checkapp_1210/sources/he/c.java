package he;

import he.d;
/* loaded from: classes3.dex */
public abstract class c {

    /* loaded from: classes3.dex */
    public static final class a extends c {

        /* renamed from: a */
        public static final a f11831a = new a();

        /* renamed from: b */
        private static final int f11832b;

        static {
            d.a aVar = d.Companion;
            f11832b = (~(aVar.i() | aVar.d())) & aVar.b();
        }

        private a() {
        }

        @Override // he.c
        public int a() {
            return f11832b;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends c {

        /* renamed from: a */
        public static final b f11833a = new b();

        private b() {
        }

        @Override // he.c
        public int a() {
            return 0;
        }
    }

    public abstract int a();

    public String toString() {
        return getClass().getSimpleName();
    }
}
