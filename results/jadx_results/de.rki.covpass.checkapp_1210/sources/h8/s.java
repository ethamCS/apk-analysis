package h8;

import de.rki.covpass.sdk.cert.models.ExpertModeData;
import kotlin.Lazy;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b;\u0010<R\u001b\u0010\u0007\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u0011\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u0004\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0014\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0013\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0016\u0010\fR\u001b\u0010\u0019\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0004\u001a\u0004\b\u0018\u0010\u0010R\u001b\u0010\u001c\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0004\u001a\u0004\b\u001b\u0010\u0010R\u001a\u0010\u001d\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\n\u001a\u0004\b\u001e\u0010\fR\u001b\u0010!\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0004\u001a\u0004\b \u0010\u0010R\u001b\u0010$\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0004\u001a\u0004\b#\u0010\u0010R\u001a\u0010%\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010\n\u001a\u0004\b&\u0010\fR\u001b\u0010)\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u0004\u001a\u0004\b(\u0010\u0010R\u001b\u0010,\u001a\u00020\r8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0004\u001a\u0004\b+\u0010\u0010R\u001b\u00101\u001a\u00020-8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u0004\u001a\u0004\b/\u00100R\u001d\u00106\u001a\u0004\u0018\u0001028VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u0004\u001a\u0004\b4\u00105R\u001d\u0010:\u001a\u0004\u0018\u00010\b8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b7\u0010\u0004\u001a\u0004\b8\u00109¨\u0006="}, d2 = {"Lh8/s;", "Lh8/v;", "Lh8/t;", "args$delegate", "Lkotlin/Lazy;", "a3", "()Lh8/t;", "args", BuildConfig.FLAVOR, "imageRes", "I", "M2", "()I", BuildConfig.FLAVOR, "title$delegate", "T2", "()Ljava/lang/String;", "title", "text$delegate", "O2", "text", "imageInfo1Res", "J2", "titleInfo1$delegate", "U2", "titleInfo1", "textInfo1$delegate", "Q2", "textInfo1", "imageInfo2Res", "K2", "titleInfo2$delegate", "V2", "titleInfo2", "textInfo2$delegate", "R2", "textInfo2", "imageInfo3Res", "L2", "titleInfo3$delegate", "W2", "titleInfo3", "textInfo3$delegate", "S2", "textInfo3", BuildConfig.FLAVOR, "isGermanCertificate$delegate", "X2", "()Z", "isGermanCertificate", "Lde/rki/covpass/sdk/cert/models/ExpertModeData;", "expertModeData$delegate", "H2", "()Lde/rki/covpass/sdk/cert/models/ExpertModeData;", "expertModeData", "buttonTextRes$delegate", "w2", "()Ljava/lang/Integer;", "buttonTextRes", "<init>", "()V", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public class s extends v {
    private final Lazy A5;
    private final Lazy C5;
    private final Lazy D5;
    private final Lazy E5;
    private final Lazy F5;
    private final Lazy G5;

    /* renamed from: r5 */
    private final Lazy f11522r5;

    /* renamed from: t5 */
    private final Lazy f11524t5;

    /* renamed from: u5 */
    private final Lazy f11525u5;

    /* renamed from: w5 */
    private final Lazy f11527w5;

    /* renamed from: x5 */
    private final Lazy f11528x5;

    /* renamed from: z5 */
    private final Lazy f11530z5;

    /* renamed from: s5 */
    private final int f11523s5 = x7.a.f25459k;

    /* renamed from: v5 */
    private final int f11526v5 = x7.a.f25460l;

    /* renamed from: y5 */
    private final int f11529y5 = x7.a.f25457i;
    private final int B5 = x7.a.f25458j;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh8/t;", "b", "()Lh8/t;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a extends hc.v implements gc.a<t> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(0);
            s.this = r1;
        }

        /* renamed from: b */
        public final t invoke() {
            return (t) m7.k.a(s.this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "b", "()Ljava/lang/Integer;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class b extends hc.v implements gc.a<Integer> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(0);
            s.this = r1;
        }

        /* renamed from: b */
        public final Integer invoke() {
            return Integer.valueOf(s.this.a3().c() ? x7.e.W : x7.e.y0_res_0x7f1001d7);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lde/rki/covpass/sdk/cert/models/ExpertModeData;", "b", "()Lde/rki/covpass/sdk/cert/models/ExpertModeData;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class c extends hc.v implements gc.a<ExpertModeData> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c() {
            super(0);
            s.this = r1;
        }

        /* renamed from: b */
        public final ExpertModeData invoke() {
            return s.this.a3().a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class d extends hc.v implements gc.a<Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d() {
            super(0);
            s.this = r1;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            return Boolean.valueOf(s.this.a3().d());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class e extends hc.v implements gc.a<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e() {
            super(0);
            s.this = r1;
        }

        /* renamed from: b */
        public final String invoke() {
            return s.this.u0(x7.e.B_res_0x7f10011f);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class f extends hc.v implements gc.a<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f() {
            super(0);
            s.this = r1;
        }

        /* renamed from: b */
        public final String invoke() {
            return s.this.u0(x7.e.w_res_0x7f10011a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class g extends hc.v implements gc.a<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g() {
            super(0);
            s.this = r1;
        }

        /* renamed from: b */
        public final String invoke() {
            return s.this.u0(x7.e.y_res_0x7f10011c);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class h extends hc.v implements gc.a<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h() {
            super(0);
            s.this = r1;
        }

        /* renamed from: b */
        public final String invoke() {
            return s.this.u0(x7.e.A_res_0x7f10011e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class i extends hc.v implements gc.a<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i() {
            super(0);
            s.this = r1;
        }

        /* renamed from: b */
        public final String invoke() {
            return s.this.u0(x7.e.C_res_0x7f100120);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class j extends hc.v implements gc.a<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j() {
            super(0);
            s.this = r1;
        }

        /* renamed from: b */
        public final String invoke() {
            return s.this.u0(x7.e.v_res_0x7f100119);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class k extends hc.v implements gc.a<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k() {
            super(0);
            s.this = r1;
        }

        /* renamed from: b */
        public final String invoke() {
            return s.this.u0(x7.e.x_res_0x7f10011b);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class l extends hc.v implements gc.a<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l() {
            super(0);
            s.this = r1;
        }

        /* renamed from: b */
        public final String invoke() {
            return s.this.u0(x7.e.z_res_0x7f10011d);
        }
    }

    public s() {
        Lazy a10;
        Lazy a11;
        Lazy a12;
        Lazy a13;
        Lazy a14;
        Lazy a15;
        Lazy a16;
        Lazy a17;
        Lazy a18;
        Lazy a19;
        Lazy a20;
        Lazy a21;
        a10 = tb.m.a(new a());
        this.f11522r5 = a10;
        a11 = tb.m.a(new i());
        this.f11524t5 = a11;
        a12 = tb.m.a(new e());
        this.f11525u5 = a12;
        a13 = tb.m.a(new j());
        this.f11527w5 = a13;
        a14 = tb.m.a(new f());
        this.f11528x5 = a14;
        a15 = tb.m.a(new k());
        this.f11530z5 = a15;
        a16 = tb.m.a(new g());
        this.A5 = a16;
        a17 = tb.m.a(new l());
        this.C5 = a17;
        a18 = tb.m.a(new h());
        this.D5 = a18;
        a19 = tb.m.a(new d());
        this.E5 = a19;
        a20 = tb.m.a(new c());
        this.F5 = a20;
        a21 = tb.m.a(new b());
        this.G5 = a21;
    }

    public final t a3() {
        return (t) this.f11522r5.getValue();
    }

    @Override // h8.v
    public ExpertModeData H2() {
        return (ExpertModeData) this.F5.getValue();
    }

    @Override // h8.v
    public int J2() {
        return this.f11526v5;
    }

    @Override // h8.v
    public int K2() {
        return this.f11529y5;
    }

    @Override // h8.v
    public int L2() {
        return this.B5;
    }

    @Override // h8.v
    public int M2() {
        return this.f11523s5;
    }

    @Override // h8.v
    public String O2() {
        return (String) this.f11525u5.getValue();
    }

    @Override // h8.v
    public String Q2() {
        return (String) this.f11528x5.getValue();
    }

    @Override // h8.v
    public String R2() {
        return (String) this.A5.getValue();
    }

    @Override // h8.v
    public String S2() {
        return (String) this.D5.getValue();
    }

    @Override // h8.v
    public String T2() {
        return (String) this.f11524t5.getValue();
    }

    @Override // h8.v
    public String U2() {
        return (String) this.f11527w5.getValue();
    }

    @Override // h8.v
    public String V2() {
        return (String) this.f11530z5.getValue();
    }

    @Override // h8.v
    public String W2() {
        return (String) this.C5.getValue();
    }

    @Override // h8.v
    public boolean X2() {
        return ((Boolean) this.E5.getValue()).booleanValue();
    }

    @Override // j8.e
    public Integer w2() {
        return (Integer) this.G5.getValue();
    }
}
