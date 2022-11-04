package yd;

import org.conscrypt.BuildConfig;
/* loaded from: classes3.dex */
public final class z {

    /* renamed from: a */
    static final int f26206a = c(1, 3);

    /* renamed from: b */
    static final int f26207b = c(1, 4);

    /* renamed from: c */
    static final int f26208c = c(2, 0);

    /* renamed from: d */
    static final int f26209d = c(3, 2);

    /* loaded from: classes3.dex */
    public static class b extends Enum<b> {
        public static final b U3;
        public static final b V3;
        public static final b W3;
        public static final b X3;
        public static final b Y3;
        public static final b Z3;

        /* renamed from: a4 */
        public static final b f26210a4;

        /* renamed from: b4 */
        public static final b f26211b4;

        /* renamed from: c4 */
        public static final b f26212c4;

        /* renamed from: d4 */
        public static final b f26213d4;

        /* renamed from: e4 */
        public static final b f26214e4;

        /* renamed from: f4 */
        public static final b f26215f4;

        /* renamed from: g4 */
        public static final b f26216g4;

        /* renamed from: h4 */
        public static final b f26217h4;

        /* renamed from: i4 */
        public static final b f26218i4;

        /* renamed from: j4 */
        private static final /* synthetic */ b[] f26219j4;

        /* renamed from: q */
        public static final b f26220q;

        /* renamed from: x */
        public static final b f26221x;

        /* renamed from: y */
        public static final b f26222y;

        /* renamed from: c */
        private final c f26223c;

        /* renamed from: d */
        private final int f26224d;

        /* loaded from: classes3.dex */
        static class a extends b {
            a(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }

            @Override // yd.z.b
            public boolean h() {
                return false;
            }
        }

        /* renamed from: yd.z$b$b */
        /* loaded from: classes3.dex */
        static class C0459b extends b {
            C0459b(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }

            @Override // yd.z.b
            public boolean h() {
                return false;
            }
        }

        /* loaded from: classes3.dex */
        static class c extends b {
            c(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }

            @Override // yd.z.b
            public boolean h() {
                return false;
            }
        }

        /* loaded from: classes3.dex */
        static class d extends b {
            d(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }

            @Override // yd.z.b
            public boolean h() {
                return false;
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f26220q = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f26221x = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f26222y = bVar3;
            b bVar4 = new b("UINT64", 3, cVar, 0);
            U3 = bVar4;
            c cVar2 = c.INT;
            b bVar5 = new b("INT32", 4, cVar2, 0);
            V3 = bVar5;
            b bVar6 = new b("FIXED64", 5, cVar, 1);
            W3 = bVar6;
            b bVar7 = new b("FIXED32", 6, cVar2, 5);
            X3 = bVar7;
            b bVar8 = new b("BOOL", 7, c.BOOLEAN, 0);
            Y3 = bVar8;
            a aVar = new a("STRING", 8, c.STRING, 2);
            Z3 = aVar;
            c cVar3 = c.MESSAGE;
            C0459b c0459b = new C0459b("GROUP", 9, cVar3, 3);
            f26210a4 = c0459b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f26211b4 = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f26212c4 = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f26213d4 = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f26214e4 = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f26215f4 = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f26216g4 = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f26217h4 = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f26218i4 = bVar14;
            f26219j4 = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0459b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        private b(String str, int i10, c cVar, int i11) {
            super(str, i10);
            this.f26223c = cVar;
            this.f26224d = i11;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f26219j4.clone();
        }

        public c b() {
            return this.f26223c;
        }

        public int g() {
            return this.f26224d;
        }

        public boolean h() {
            return true;
        }
    }

    /* loaded from: classes3.dex */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(BuildConfig.FLAVOR),
        BYTE_STRING(d.f26096c),
        ENUM(null),
        MESSAGE(null);
        

        /* renamed from: c */
        private final Object f26229c;

        c(Object obj) {
            this.f26229c = obj;
        }
    }

    public static int a(int i10) {
        return i10 >>> 3;
    }

    public static int b(int i10) {
        return i10 & 7;
    }

    public static int c(int i10, int i11) {
        return (i10 << 3) | i11;
    }
}
