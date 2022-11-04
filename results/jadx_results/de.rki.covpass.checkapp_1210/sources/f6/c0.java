package f6;

import com.google.crypto.tink.shaded.protobuf.a1;
import com.google.crypto.tink.shaded.protobuf.b0;
import com.google.crypto.tink.shaded.protobuf.t0;
import com.google.crypto.tink.shaded.protobuf.z;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class c0 extends com.google.crypto.tink.shaded.protobuf.z<c0, b> implements t0 {
    private static final c0 DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 2;
    private static volatile a1<c0> PARSER = null;
    public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
    private b0.i<c> key_ = com.google.crypto.tink.shaded.protobuf.z.x();
    private int primaryKeyId_;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f9809a;

        static {
            int[] iArr = new int[z.f.values().length];
            f9809a = iArr;
            try {
                iArr[z.f.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9809a[z.f.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9809a[z.f.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9809a[z.f.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9809a[z.f.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9809a[z.f.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9809a[z.f.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends z.a<c0, b> implements t0 {
        private b() {
            super(c0.DEFAULT_INSTANCE);
        }

        /* synthetic */ b(a aVar) {
            this();
        }

        public b B(c cVar) {
            t();
            ((c0) this.f8109d).Q(cVar);
            return this;
        }

        public c C(int i10) {
            return ((c0) this.f8109d).S(i10);
        }

        public int D() {
            return ((c0) this.f8109d).T();
        }

        public List<c> E() {
            return Collections.unmodifiableList(((c0) this.f8109d).U());
        }

        public b F(int i10) {
            t();
            ((c0) this.f8109d).Y(i10);
            return this;
        }
    }

    /* loaded from: classes.dex */
    public static final class c extends com.google.crypto.tink.shaded.protobuf.z<c, a> implements t0 {
        private static final c DEFAULT_INSTANCE;
        public static final int KEY_DATA_FIELD_NUMBER = 1;
        public static final int KEY_ID_FIELD_NUMBER = 3;
        public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
        private static volatile a1<c> PARSER = null;
        public static final int STATUS_FIELD_NUMBER = 2;
        private y keyData_;
        private int keyId_;
        private int outputPrefixType_;
        private int status_;

        /* loaded from: classes.dex */
        public static final class a extends z.a<c, a> implements t0 {
            private a() {
                super(c.DEFAULT_INSTANCE);
            }

            /* synthetic */ a(a aVar) {
                this();
            }

            public a B(y yVar) {
                t();
                ((c) this.f8109d).Y(yVar);
                return this;
            }

            public a C(int i10) {
                t();
                ((c) this.f8109d).Z(i10);
                return this;
            }

            public a D(i0 i0Var) {
                t();
                ((c) this.f8109d).a0(i0Var);
                return this;
            }

            public a E(z zVar) {
                t();
                ((c) this.f8109d).b0(zVar);
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

        public static a X() {
            return DEFAULT_INSTANCE.s();
        }

        public void Y(y yVar) {
            yVar.getClass();
            this.keyData_ = yVar;
        }

        public void Z(int i10) {
            this.keyId_ = i10;
        }

        public void a0(i0 i0Var) {
            this.outputPrefixType_ = i0Var.c();
        }

        public void b0(z zVar) {
            this.status_ = zVar.c();
        }

        public y S() {
            y yVar = this.keyData_;
            return yVar == null ? y.R() : yVar;
        }

        public int T() {
            return this.keyId_;
        }

        public i0 U() {
            i0 b10 = i0.b(this.outputPrefixType_);
            return b10 == null ? i0.UNRECOGNIZED : b10;
        }

        public z V() {
            z b10 = z.b(this.status_);
            return b10 == null ? z.UNRECOGNIZED : b10;
        }

        public boolean W() {
            return this.keyData_ != null;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.z
        protected final Object w(z.f fVar, Object obj, Object obj2) {
            switch (a.f9809a[fVar.ordinal()]) {
                case 1:
                    return new c();
                case 2:
                    return new a(null);
                case 3:
                    return com.google.crypto.tink.shaded.protobuf.z.F(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", new Object[]{"keyData_", "status_", "keyId_", "outputPrefixType_"});
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
        c0 c0Var = new c0();
        DEFAULT_INSTANCE = c0Var;
        com.google.crypto.tink.shaded.protobuf.z.L(c0.class, c0Var);
    }

    private c0() {
    }

    public void Q(c cVar) {
        cVar.getClass();
        R();
        this.key_.add(cVar);
    }

    private void R() {
        if (!this.key_.I()) {
            this.key_ = com.google.crypto.tink.shaded.protobuf.z.D(this.key_);
        }
    }

    public static b W() {
        return DEFAULT_INSTANCE.s();
    }

    public static c0 X(byte[] bArr, com.google.crypto.tink.shaded.protobuf.q qVar) {
        return (c0) com.google.crypto.tink.shaded.protobuf.z.H(DEFAULT_INSTANCE, bArr, qVar);
    }

    public void Y(int i10) {
        this.primaryKeyId_ = i10;
    }

    public c S(int i10) {
        return this.key_.get(i10);
    }

    public int T() {
        return this.key_.size();
    }

    public List<c> U() {
        return this.key_;
    }

    public int V() {
        return this.primaryKeyId_;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.z
    protected final Object w(z.f fVar, Object obj, Object obj2) {
        switch (a.f9809a[fVar.ordinal()]) {
            case 1:
                return new c0();
            case 2:
                return new b(null);
            case 3:
                return com.google.crypto.tink.shaded.protobuf.z.F(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"primaryKeyId_", "key_", c.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                a1<c0> a1Var = PARSER;
                if (a1Var == null) {
                    synchronized (c0.class) {
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
