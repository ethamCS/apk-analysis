package f6;

import com.google.crypto.tink.shaded.protobuf.a1;
import com.google.crypto.tink.shaded.protobuf.b0;
import com.google.crypto.tink.shaded.protobuf.t0;
import com.google.crypto.tink.shaded.protobuf.z;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public final class y extends com.google.crypto.tink.shaded.protobuf.z<y, b> implements t0 {
    private static final y DEFAULT_INSTANCE;
    public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
    private static volatile a1<y> PARSER = null;
    public static final int TYPE_URL_FIELD_NUMBER = 1;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int keyMaterialType_;
    private String typeUrl_ = BuildConfig.FLAVOR;
    private com.google.crypto.tink.shaded.protobuf.i value_ = com.google.crypto.tink.shaded.protobuf.i.f7878d;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9848a;

        static {
            int[] iArr = new int[z.f.values().length];
            f9848a = iArr;
            try {
                iArr[z.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9848a[z.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9848a[z.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9848a[z.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9848a[z.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9848a[z.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9848a[z.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends z.a<y, b> implements t0 {
        private b() {
            super(y.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b B(c cVar) {
            t();
            ((y) this.f8109d).W(cVar);
            return this;
        }

        public b C(String str) {
            t();
            ((y) this.f8109d).X(str);
            return this;
        }

        public b D(com.google.crypto.tink.shaded.protobuf.i iVar) {
            t();
            ((y) this.f8109d).Y(iVar);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public enum c implements b0.c {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        
        private static final b0.d<c> W3 = new a();

        /* renamed from: c */
        private final int f9853c;

        /* loaded from: classes.dex */
        class a implements b0.d<c> {
            a() {
            }

            /* renamed from: b */
            public c a(int i10) {
                return c.b(i10);
            }
        }

        c(int i10) {
            this.f9853c = i10;
        }

        public static c b(int i10) {
            if (i10 != 0) {
                if (i10 == 1) {
                    return SYMMETRIC;
                }
                if (i10 == 2) {
                    return ASYMMETRIC_PRIVATE;
                }
                if (i10 == 3) {
                    return ASYMMETRIC_PUBLIC;
                }
                if (i10 == 4) {
                    return REMOTE;
                }
                return null;
            }
            return UNKNOWN_KEYMATERIAL;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.b0.c
        public final int c() {
            if (this != UNRECOGNIZED) {
                return this.f9853c;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
    }

    static {
        y yVar = new y();
        DEFAULT_INSTANCE = yVar;
        com.google.crypto.tink.shaded.protobuf.z.L(y.class, yVar);
    }

    private y() {
    }

    public static y R() {
        return DEFAULT_INSTANCE;
    }

    public static b V() {
        return DEFAULT_INSTANCE.s();
    }

    public void W(c cVar) {
        this.keyMaterialType_ = cVar.c();
    }

    public void X(String str) {
        str.getClass();
        this.typeUrl_ = str;
    }

    public void Y(com.google.crypto.tink.shaded.protobuf.i iVar) {
        iVar.getClass();
        this.value_ = iVar;
    }

    public c S() {
        c b10 = c.b(this.keyMaterialType_);
        return b10 == null ? c.UNRECOGNIZED : b10;
    }

    public String T() {
        return this.typeUrl_;
    }

    public com.google.crypto.tink.shaded.protobuf.i U() {
        return this.value_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.z
    protected final Object w(z.f fVar, Object obj, Object obj2) {
        switch (a.f9848a[fVar.ordinal()]) {
            case 1:
                return new y();
            case 2:
                return new b(null);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.z.F(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"typeUrl_", "value_", "keyMaterialType_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a1<y> a1Var = PARSER;
                if (a1Var == null) {
                    synchronized (y.class) {
                        a1Var = PARSER;
                        if (a1Var == null) {
                            a1Var = new z.b<>(DEFAULT_INSTANCE);
                            PARSER = a1Var;
                        }
                    }
                }
                return a1Var;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
