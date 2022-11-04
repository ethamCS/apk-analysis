package com.google.crypto.tink.shaded.protobuf;

import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public final class u1 {

    /* renamed from: a */
    static final int f8010a = c(1, 3);

    /* renamed from: b */
    static final int f8011b = c(1, 4);

    /* renamed from: c */
    static final int f8012c = c(2, 0);

    /* renamed from: d */
    static final int f8013d = c(3, 2);

    /* loaded from: classes.dex */
    public static class b extends Enum<b> {
        public static final b U3;
        public static final b V3;
        public static final b W3;
        public static final b X3;
        public static final b Y3;
        public static final b Z3;

        /* renamed from: a4 */
        public static final b f8014a4;

        /* renamed from: b4 */
        public static final b f8015b4;

        /* renamed from: c4 */
        public static final b f8016c4;

        /* renamed from: d4 */
        public static final b f8017d4;

        /* renamed from: e4 */
        public static final b f8018e4;

        /* renamed from: f4 */
        public static final b f8019f4;

        /* renamed from: g4 */
        public static final b f8020g4;

        /* renamed from: h4 */
        public static final b f8021h4;

        /* renamed from: i4 */
        public static final b f8022i4;

        /* renamed from: j4 */
        private static final /* synthetic */ b[] f8023j4;

        /* renamed from: q */
        public static final b f8024q;

        /* renamed from: x */
        public static final b f8025x;

        /* renamed from: y */
        public static final b f8026y;

        /* renamed from: c */
        private final c f8027c;

        /* renamed from: d */
        private final int f8028d;

        /* loaded from: classes.dex */
        final class a extends b {
            a(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* renamed from: com.google.crypto.tink.shaded.protobuf.u1$b$b */
        /* loaded from: classes.dex */
        final class C0115b extends b {
            C0115b(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* loaded from: classes.dex */
        final class c extends b {
            c(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        /* loaded from: classes.dex */
        final class d extends b {
            d(String str, int i10, c cVar, int i11) {
                super(str, i10, cVar, i11);
            }
        }

        static {
            b bVar = new b("DOUBLE", 0, c.DOUBLE, 1);
            f8024q = bVar;
            b bVar2 = new b("FLOAT", 1, c.FLOAT, 5);
            f8025x = bVar2;
            c cVar = c.LONG;
            b bVar3 = new b("INT64", 2, cVar, 0);
            f8026y = bVar3;
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
            C0115b c0115b = new C0115b("GROUP", 9, cVar3, 3);
            f8014a4 = c0115b;
            c cVar4 = new c("MESSAGE", 10, cVar3, 2);
            f8015b4 = cVar4;
            d dVar = new d("BYTES", 11, c.BYTE_STRING, 2);
            f8016c4 = dVar;
            b bVar9 = new b("UINT32", 12, cVar2, 0);
            f8017d4 = bVar9;
            b bVar10 = new b("ENUM", 13, c.ENUM, 0);
            f8018e4 = bVar10;
            b bVar11 = new b("SFIXED32", 14, cVar2, 5);
            f8019f4 = bVar11;
            b bVar12 = new b("SFIXED64", 15, cVar, 1);
            f8020g4 = bVar12;
            b bVar13 = new b("SINT32", 16, cVar2, 0);
            f8021h4 = bVar13;
            b bVar14 = new b("SINT64", 17, cVar, 0);
            f8022i4 = bVar14;
            f8023j4 = new b[]{bVar, bVar2, bVar3, bVar4, bVar5, bVar6, bVar7, bVar8, aVar, c0115b, cVar4, dVar, bVar9, bVar10, bVar11, bVar12, bVar13, bVar14};
        }

        private b(String str, int i10, c cVar, int i11) {
            super(str, i10);
            this.f8027c = cVar;
            this.f8028d = i11;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f8023j4.clone();
        }

        public c b() {
            return this.f8027c;
        }
    }

    /* loaded from: classes.dex */
    public enum c {
        INT(0),
        LONG(0L),
        FLOAT(Float.valueOf(0.0f)),
        DOUBLE(Double.valueOf(0.0d)),
        BOOLEAN(Boolean.FALSE),
        STRING(BuildConfig.FLAVOR),
        BYTE_STRING(i.f7878d),
        ENUM(null),
        MESSAGE(null);
        

        /* renamed from: c */
        private final Object f8033c;

        c(Object obj) {
            this.f8033c = obj;
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
