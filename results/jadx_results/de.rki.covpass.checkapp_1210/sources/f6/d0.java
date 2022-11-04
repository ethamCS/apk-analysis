package f6;

import com.google.crypto.tink.shaded.protobuf.a1;
import com.google.crypto.tink.shaded.protobuf.b0;
import com.google.crypto.tink.shaded.protobuf.t0;
import com.google.crypto.tink.shaded.protobuf.z;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public final class d0 extends com.google.crypto.tink.shaded.protobuf.z<d0, b> implements t0 {
    private static final d0 DEFAULT_INSTANCE;
    public static final int KEY_INFO_FIELD_NUMBER = 2;
    private static volatile a1<d0> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private b0.i<c> keyInfo_ = com.google.crypto.tink.shaded.protobuf.z.x();
    private int primaryKeyId_;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9811a;

        static {
            int[] iArr = new int[z.f.values().length];
            f9811a = iArr;
            try {
                iArr[z.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9811a[z.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9811a[z.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9811a[z.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9811a[z.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9811a[z.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9811a[z.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends z.a<d0, b> implements t0 {
        private b() {
            super(d0.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b B(c cVar) {
            t();
            ((d0) this.f8109d).Q(cVar);
            return this;
        }

        public b C(int i10) {
            t();
            ((d0) this.f8109d).U(i10);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.google.crypto.tink.shaded.protobuf.z<c, a> implements t0 {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile a1<c> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int TYPE_URL_FIELD_NUMBER = 1;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;
        private String typeUrl_ = BuildConfig.FLAVOR;

        /* loaded from: classes.dex */
        public static final class a extends z.a<c, a> implements t0 {
            private a() {
                super(c.DEFAULT_INSTANCE);
            }

            /* synthetic */ a(a aVar) {
                this();
            }

            public a B(int i10) {
                t();
                ((c) this.f8109d).U(i10);
                return this;
            }

            public a C(i0 i0Var) {
                t();
                ((c) this.f8109d).V(i0Var);
                return this;
            }

            public a D(z zVar) {
                t();
                ((c) this.f8109d).W(zVar);
                return this;
            }

            public a E(String str) {
                t();
                ((c) this.f8109d).X(str);
                return this;
            }
        }

        static {
            c cVar = new c();
            DEFAULT_INSTANCE = cVar;
            com.google.crypto.tink.shaded.protobuf.z.L(c.class, cVar);
        }

        private c() {
        }

        public static a T() {
            return DEFAULT_INSTANCE.s();
        }

        public void U(int i10) {
            this.keyId_ = i10;
        }

        public void V(i0 i0Var) {
            this.outputPrefixType_ = i0Var.c();
        }

        public void W(z zVar) {
            this.status_ = zVar.c();
        }

        public void X(String str) {
            str.getClass();
            this.typeUrl_ = str;
        }

        public int S() {
            return this.keyId_;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.z
        protected final Object w(z.f fVar, Object obj, Object obj2) {
            switch (a.f9811a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(null);
                case 3:
                    return com.google.crypto.tink.shaded.protobuf.z.F(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", new Object[]{"typeUrl_", "status_", "keyId_", "outputPrefixType_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    a1<c> a1Var = PARSER;
                    if (a1Var == null) {
                        synchronized (c.class) {
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

    static {
        d0 d0Var = new d0();
        DEFAULT_INSTANCE = d0Var;
        com.google.crypto.tink.shaded.protobuf.z.L(d0.class, d0Var);
    }

    private d0() {
    }

    public void Q(c cVar) {
        cVar.getClass();
        R();
        this.keyInfo_.add(cVar);
    }

    private void R() {
        if (!this.keyInfo_.I()) {
            this.keyInfo_ = com.google.crypto.tink.shaded.protobuf.z.D(this.keyInfo_);
        }
    }

    public static b T() {
        return DEFAULT_INSTANCE.s();
    }

    public void U(int i10) {
        this.primaryKeyId_ = i10;
    }

    public c S(int i10) {
        return this.keyInfo_.get(i10);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.z
    protected final Object w(z.f fVar, Object obj, Object obj2) {
        switch (a.f9811a[fVar.ordinal()]) {
            case 1:
                return new d0();
            case 2:
                return new b(null);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.z.F(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "keyInfo_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a1<d0> a1Var = PARSER;
                if (a1Var == null) {
                    synchronized (d0.class) {
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
