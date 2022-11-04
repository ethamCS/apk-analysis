package f8;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.k0;
import androidx.lifecycle.l0;
import androidx.lifecycle.s0;
import androidx.lifecycle.v0;
import androidx.lifecycle.y0;
import androidx.lifecycle.z0;
import bf.y;
import de.rki.covpass.sdk.cert.models.CovCertificate;
import de.rki.covpass.sdk.cert.models.ExpertModeData;
import h8.c0;
import h8.w;
import hc.t;
import hc.v;
import j$.time.ZonedDateTime;
import java.util.Locale;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import tb.p;
import z9.o;
import z9.q;
@Metadata(bv = {}, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u000b\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006:\u0001RB\u0007¢\u0006\u0004\bP\u0010QJ\u000e\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\u0007H\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\u001a\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0014J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u0015H\u0016J\u0010\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0007H\u0016J\u001a\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010!\u001a\u00020\nH\u0016J\b\u0010\"\u001a\u00020\nH\u0016J\u0012\u0010%\u001a\u00020\n2\b\u0010$\u001a\u0004\u0018\u00010#H\u0016J\u001c\u0010(\u001a\u00020\n2\b\u0010&\u001a\u0004\u0018\u00010#2\b\u0010'\u001a\u0004\u0018\u00010#H\u0016J\u0010\u0010*\u001a\u00020\n2\u0006\u0010)\u001a\u00020#H\u0016J\u0010\u0010+\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0007H\u0016J\u001a\u0010,\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010-\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00072\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020\u001eH\u0016J\u001a\u00100\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00072\u0006\u0010.\u001a\u00020\u001eH\u0016J\b\u00101\u001a\u00020\nH\u0016J\u0010\u00103\u001a\u00020\n2\u0006\u00102\u001a\u00020\u001eH\u0014J\b\u00105\u001a\u000204H\u0016R\u001b\u0010:\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001b\u0010=\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u00107\u001a\u0004\b<\u00109R\u001b\u0010B\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u00107\u001a\u0004\b@\u0010AR\u001b\u0010G\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u00107\u001a\u0004\bE\u0010FR\u001a\u0010I\u001a\u00020H8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001a\u0010M\u001a\u00020\u001e8\u0016X\u0096D¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u00109¨\u0006S"}, d2 = {"Lf8/f;", "Lu8/j;", "Lm8/b;", "Lf8/e;", "Lh8/w;", "Lh8/e;", "Lf8/c;", "Lde/rki/covpass/sdk/cert/models/CovCertificate;", "Lde/rki/covpass/sdk/cert/models/ExpertModeData;", "m3", "Ltb/e0;", "q3", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "o1", BuildConfig.FLAVOR, "qrCode", "V2", "tag", "Lm8/a;", "action", "h", "certificate", "q", "j$/time/ZonedDateTime", "sampleCollection", "o", "t", BuildConfig.FLAVOR, "isTechnical", "n", "l", "d", "Lf8/j;", "firstCertificateData", "u", "firstCertData", "secondCertData", "O", "boosterCertData", "w", "B", "J", "i", "is2gOn", "R", "K", "P", "isLoading", "f3", "Ll7/b;", "m", "isTwoGPlusOn$delegate", "Lkotlin/Lazy;", "p3", "()Z", "isTwoGPlusOn", "isTwoGPlusBOn$delegate", "o3", "isTwoGPlusBOn", "Lf8/h;", "viewModel$delegate", "n3", "()Lf8/h;", "viewModel", "Lf8/d;", "dataViewModel$delegate", "l3", "()Lf8/d;", "dataViewModel", BuildConfig.FLAVOR, "announcementAccessibilityRes", "I", "n2", "()Ljava/lang/Integer;", "isCovpass", "Z", "T2", "<init>", "()V", "a", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class f extends u8.j implements m8.b, f8.e, w, h8.e, f8.c {
    private static final a Companion = new a(null);

    /* renamed from: g5 */
    private final Lazy f9907g5;

    /* renamed from: h5 */
    private final Lazy f9908h5;

    /* renamed from: i5 */
    private final Lazy f9909i5;

    /* renamed from: j5 */
    private final Lazy f9910j5;

    /* renamed from: k5 */
    private MediaPlayer f9911k5;

    /* renamed from: l5 */
    private final int f9912l5 = x7.e.f25481c;

    /* renamed from: m5 */
    private final boolean f9913m5;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lf8/f$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "TAG_ERROR_2G_UNEXPECTED_TYPE", "Ljava/lang/String;", "<init>", "()V", "common-app-covpass-check_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    private static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f9914a;

        static {
            int[] iArr = new int[z9.f.values().length];
            iArr[z9.f.Equal.ordinal()] = 1;
            iArr[z9.f.HasNullData.ordinal()] = 2;
            iArr[z9.f.HasInvalidData.ordinal()] = 3;
            iArr[z9.f.NameDifferent.ordinal()] = 4;
            iArr[z9.f.DateOfBirthDifferent.ordinal()] = 5;
            f9914a = iArr;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class c extends v implements gc.a<Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c() {
            super(0);
            f.this = r1;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            return Boolean.valueOf(z7.b.b(f.this).c().b());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "b", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    static final class d extends v implements gc.a<Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d() {
            super(0);
            f.this = r1;
        }

        /* renamed from: b */
        public final Boolean invoke() {
            return Boolean.valueOf(z7.b.b(f.this).c().c() || z7.b.b(f.this).c().b());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/s0;", "T", "Landroidx/lifecycle/v0$b;", "b", "()Landroidx/lifecycle/v0$b;", "com/ensody/reactivestate/android/g"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class e extends v implements gc.a<v0.b> {

        /* renamed from: c */
        final /* synthetic */ Fragment f9917c;

        @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J7\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f¸\u0006\r"}, d2 = {"com/ensody/reactivestate/android/ViewModelExtKt$stateFlowViewModel$2$1", "Landroidx/lifecycle/a;", "Landroidx/lifecycle/s0;", "T", BuildConfig.FLAVOR, "key", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/l0;", "handle", "e", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/l0;)Landroidx/lifecycle/s0;", "reactivestate_release", "com/ensody/reactivestate/android/g$a"}, k = 1, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class a extends androidx.lifecycle.a {
            public a(Fragment fragment) {
                super(fragment, null);
            }

            @Override // androidx.lifecycle.a
            protected <T extends s0> T e(String str, Class<T> cls, l0 l0Var) {
                t.e(str, "key");
                t.e(cls, "modelClass");
                t.e(l0Var, "handle");
                return new com.ensody.reactivestate.android.l(new com.ensody.reactivestate.android.h(l0Var));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Fragment fragment) {
            super(0);
            this.f9917c = fragment;
        }

        /* renamed from: b */
        public final v0.b invoke() {
            return new a(this.f9917c);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "T", "Lcom/ensody/reactivestate/android/b;", "b", "(Lcom/ensody/reactivestate/android/b;)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1})
    /* renamed from: f8.f$f */
    /* loaded from: classes.dex */
    public static final class C0147f extends v implements gc.l<com.ensody.reactivestate.android.b, f8.d> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0147f() {
            super(1);
            f.this = r1;
        }

        /* renamed from: b */
        public final f8.d invoke(com.ensody.reactivestate.android.b bVar) {
            t.e(bVar, "$this$buildOnViewModel");
            return new f8.d(bVar.a(), f.this.p3(), f.this.o3());
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/s0;", "VM", "Landroidx/fragment/app/Fragment;", "com/ensody/reactivestate/android/j", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class g extends v implements gc.a<Fragment> {

        /* renamed from: c */
        final /* synthetic */ Fragment f9919c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Fragment fragment) {
            super(0);
            this.f9919c = fragment;
        }

        /* renamed from: b */
        public final Fragment invoke() {
            return this.f9919c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/s0;", "VM", "Landroidx/lifecycle/y0;", "com/ensody/reactivestate/android/k", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class h extends v implements gc.a<y0> {

        /* renamed from: c */
        final /* synthetic */ gc.a f9920c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(gc.a aVar) {
            super(0);
            this.f9920c = aVar;
        }

        /* renamed from: b */
        public final y0 invoke() {
            y0 I = ((z0) this.f9920c.invoke()).I();
            t.d(I, "ownerProducer().viewModelStore");
            return I;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class i extends v implements gc.l<Object, f8.h> {

        /* renamed from: c */
        public static final i f9921c = new i();

        public i() {
            super(1);
        }

        @Override // gc.l
        public final f8.h invoke(Object obj) {
            if (!(obj instanceof f8.h)) {
                obj = null;
            }
            return (f8.h) obj;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00028\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "T", "Lcom/ensody/reactivestate/android/b;", "b", "(Lcom/ensody/reactivestate/android/b;)Ljava/lang/Object;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class j extends v implements gc.l<com.ensody.reactivestate.android.b, f8.h> {
        public j() {
            super(1);
        }

        /* renamed from: b */
        public final f8.h invoke(com.ensody.reactivestate.android.b bVar) {
            t.e(bVar, "$this$buildOnViewModel");
            return new f8.h(bVar.a(), null, null, null, null, null, 62, null);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/s0;", "T", "Landroidx/lifecycle/v0$b;", "b", "()Landroidx/lifecycle/v0$b;", "com/ensody/reactivestate/android/g"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class k extends v implements gc.a<v0.b> {

        /* renamed from: c */
        final /* synthetic */ Fragment f9922c;

        @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J7\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f¸\u0006\r"}, d2 = {"com/ensody/reactivestate/android/ViewModelExtKt$stateFlowViewModel$2$1", "Landroidx/lifecycle/a;", "Landroidx/lifecycle/s0;", "T", BuildConfig.FLAVOR, "key", "Ljava/lang/Class;", "modelClass", "Landroidx/lifecycle/l0;", "handle", "e", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/l0;)Landroidx/lifecycle/s0;", "reactivestate_release", "com/ensody/reactivestate/android/g$a"}, k = 1, mv = {1, 7, 1})
        /* loaded from: classes.dex */
        public static final class a extends androidx.lifecycle.a {
            public a(Fragment fragment) {
                super(fragment, null);
            }

            @Override // androidx.lifecycle.a
            protected <T extends s0> T e(String str, Class<T> cls, l0 l0Var) {
                t.e(str, "key");
                t.e(cls, "modelClass");
                t.e(l0Var, "handle");
                return new com.ensody.reactivestate.android.l(new com.ensody.reactivestate.android.h(l0Var));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(Fragment fragment) {
            super(0);
            this.f9922c = fragment;
        }

        /* renamed from: b */
        public final v0.b invoke() {
            return new a(this.f9922c);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/s0;", "VM", "Landroidx/fragment/app/Fragment;", "com/ensody/reactivestate/android/j", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class l extends v implements gc.a<Fragment> {

        /* renamed from: c */
        final /* synthetic */ Fragment f9923c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(Fragment fragment) {
            super(0);
            this.f9923c = fragment;
        }

        /* renamed from: b */
        public final Fragment invoke() {
            return this.f9923c;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/s0;", "VM", "Landroidx/lifecycle/y0;", "com/ensody/reactivestate/android/k", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class m extends v implements gc.a<y0> {

        /* renamed from: c */
        final /* synthetic */ gc.a f9924c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(gc.a aVar) {
            super(0);
            this.f9924c = aVar;
        }

        /* renamed from: b */
        public final y0 invoke() {
            y0 I = ((z0) this.f9924c.invoke()).I();
            t.d(I, "ownerProducer().viewModelStore");
            return I;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0000\n\u0002\b\u0005\u0010\u0005\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {BuildConfig.FLAVOR, "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class n extends v implements gc.l<Object, f8.d> {

        /* renamed from: c */
        public static final n f9925c = new n();

        public n() {
            super(1);
        }

        @Override // gc.l
        public final f8.d invoke(Object obj) {
            if (!(obj instanceof f8.d)) {
                obj = null;
            }
            return (f8.d) obj;
        }
    }

    public f() {
        Lazy a10;
        Lazy a11;
        a10 = tb.m.a(new d());
        this.f9907g5 = a10;
        a11 = tb.m.a(new c());
        this.f9908h5 = a11;
        Lazy b10 = com.ensody.reactivestate.android.f.b(k0.a(this, hc.k0.b(com.ensody.reactivestate.android.l.class), new h(new g(this)), new e(this)), hc.k0.b(f8.h.class), i.f9921c, new j());
        com.ensody.reactivestate.android.f.a(b10, this, this);
        this.f9909i5 = b10;
        Lazy b11 = com.ensody.reactivestate.android.f.b(k0.a(this, hc.k0.b(com.ensody.reactivestate.android.l.class), new m(new l(this)), new k(this)), hc.k0.b(f8.d.class), n.f9925c, new C0147f());
        com.ensody.reactivestate.android.f.a(b11, this, this);
        this.f9910j5 = b11;
    }

    private final f8.d l3() {
        return (f8.d) this.f9910j5.getValue();
    }

    private final ExpertModeData m3(CovCertificate covCertificate) {
        CharSequence S0;
        boolean z10 = true;
        if (covCertificate.i().length() > 0) {
            if (covCertificate.k().length() <= 0) {
                z10 = false;
            }
            if (z10) {
                S0 = y.S0(z9.k.c(z9.h.a(covCertificate.i() + z9.k.c(covCertificate.g()) + (System.currentTimeMillis() / 1000))));
                String obj = S0.toString();
                String i10 = covCertificate.i();
                String c10 = z9.k.c(covCertificate.g());
                String upperCase = covCertificate.h().toUpperCase(Locale.ROOT);
                t.d(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                return new ExpertModeData(obj, i10, c10, upperCase, q.f(covCertificate.m()), q.f(covCertificate.n()));
            }
        }
        return null;
    }

    private final f8.h n3() {
        return (f8.h) this.f9909i5.getValue();
    }

    public final boolean o3() {
        return ((Boolean) this.f9908h5.getValue()).booleanValue();
    }

    public final boolean p3() {
        return ((Boolean) this.f9907g5.getValue()).booleanValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x004c, code lost:
        if ((r1 != null && r1.m()) != false) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void q3() {
        /*
            r4 = this;
            f8.h r0 = r4.n3()
            s4.l0 r0 = r0.m()
            boolean r1 = r4.p3()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L4f
            f8.d r1 = r4.l3()
            f8.j r1 = r1.l()
            if (r1 != 0) goto L4f
            f8.d r1 = r4.l3()
            f8.j r1 = r1.k()
            if (r1 == 0) goto L50
            f8.d r1 = r4.l3()
            f8.j r1 = r1.k()
            if (r1 == 0) goto L36
            boolean r1 = r1.y()
            if (r1 != r2) goto L36
            r1 = r2
            goto L37
        L36:
            r1 = r3
        L37:
            if (r1 != 0) goto L50
            f8.d r1 = r4.l3()
            f8.j r1 = r1.k()
            if (r1 == 0) goto L4b
            boolean r1 = r1.m()
            if (r1 != r2) goto L4b
            r1 = r2
            goto L4c
        L4b:
            r1 = r3
        L4c:
            if (r1 == 0) goto L4f
            goto L50
        L4f:
            r2 = r3
        L50:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r2)
            r0.setValue(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f8.f.q3():void");
    }

    @Override // f8.c
    public void B(CovCertificate covCertificate) {
        t.e(covCertificate, "certificate");
        m7.v.w(m7.g.b(this, 0, 1, null), new h8.y(covCertificate.e(), covCertificate.f(), o.a(covCertificate.c()), m3(covCertificate), covCertificate.p()), false, 2, null);
    }

    @Override // f8.c
    public void J(CovCertificate covCertificate, ZonedDateTime zonedDateTime) {
        t.e(covCertificate, "certificate");
        m7.v.w(m7.g.b(this, 0, 1, null), new h8.c(covCertificate.e(), covCertificate.f(), o.a(covCertificate.c()), zonedDateTime, m3(covCertificate), covCertificate.p()), false, 2, null);
    }

    @Override // f8.c
    public void K(CovCertificate covCertificate, boolean z10) {
        boolean z11 = true;
        m7.v b10 = m7.g.b(this, 0, 1, null);
        ExpertModeData m32 = covCertificate != null ? m3(covCertificate) : null;
        if (covCertificate == null || !covCertificate.p()) {
            z11 = false;
        }
        m7.v.w(b10, new h8.t(z10, m32, z11), false, 2, null);
    }

    @Override // f8.c
    public void O(f8.j jVar, f8.j jVar2) {
        m7.i iVar;
        if (jVar == null) {
            return;
        }
        if (jVar2 == null) {
            m7.v.w(m7.g.b(this, 0, 1, null), new h8.n(jVar, jVar2), false, 2, null);
            return;
        }
        m7.v b10 = m7.g.b(this, 0, 1, null);
        int i10 = b.f9914a[l3().j(jVar, jVar2).ordinal()];
        if (i10 == 1 || i10 == 2 || i10 == 3) {
            iVar = new h8.n(jVar, jVar2);
        } else if (i10 == 4) {
            iVar = new h8.i(jVar, jVar2, false);
        } else if (i10 != 5) {
            throw new p();
        } else {
            iVar = new h8.i(jVar, jVar2, true);
        }
        m7.v.w(b10, iVar, false, 2, null);
    }

    @Override // f8.c
    public void P() {
        Integer valueOf = Integer.valueOf(x7.e.t_res_0x7f100100);
        String u02 = u0(x7.e.s_res_0x7f1000fc);
        m8.c cVar = new m8.c(0, valueOf, null, u02 + " (Error 201)", Integer.valueOf(x7.e.f25496u), null, null, 0, 0, 0, false, 0, "tag_error_2g_unexpected_type", 4069, null);
        androidx.fragment.app.w S = S();
        t.d(S, "childFragmentManager");
        m8.d.b(cVar, S);
    }

    @Override // f8.c
    public void R(boolean z10) {
        m7.v.w(m7.g.b(this, 0, 1, null), new c0(z10), false, 2, null);
    }

    @Override // u8.j
    public boolean T2() {
        return this.f9913m5;
    }

    @Override // u8.j
    protected void V2(String str) {
        t.e(str, "qrCode");
        if (l8.b.b(this).a().a().getValue().booleanValue()) {
            MediaPlayer mediaPlayer = this.f9911k5;
            if (mediaPlayer == null) {
                t.s("mp");
                mediaPlayer = null;
            }
            mediaPlayer.start();
        }
        n3().q(str);
    }

    @Override // h8.e
    public void d() {
        O2().setValue(Boolean.TRUE);
        p2(n2().intValue());
        l3().v(null);
        l3().w(null);
        q3();
    }

    @Override // u8.j
    public void f3(boolean z10) {
        super.f3(z10);
        if (!z10) {
            M2();
        }
    }

    @Override // m8.b
    public void h(String str, m8.a aVar) {
        t.e(str, "tag");
        t.e(aVar, "action");
        if (!t.a(str, "tag_error_2g_unexpected_type") || (l3().k() == null && l3().l() == null)) {
            O2().setValue(Boolean.TRUE);
            return;
        }
        f8.j k10 = l3().k();
        if (k10 == null) {
            return;
        }
        m7.v.w(m7.g.b(this, 0, 1, null), new h8.n(k10, l3().l()), false, 2, null);
    }

    @Override // f8.c
    public void i(CovCertificate covCertificate, ZonedDateTime zonedDateTime) {
        t.e(covCertificate, "certificate");
        m7.v.w(m7.g.b(this, 0, 1, null), new h8.a(covCertificate.e(), covCertificate.f(), o.a(covCertificate.c()), zonedDateTime, m3(covCertificate), covCertificate.p()), false, 2, null);
    }

    @Override // h8.w
    public void l() {
        O2().setValue(Boolean.TRUE);
        p2(n2().intValue());
    }

    @Override // j8.f, m7.z
    public l7.b m() {
        if (l3().k() == null && l3().l() == null) {
            return super.m();
        }
        O2().setValue(Boolean.FALSE);
        f8.j k10 = l3().k();
        if (k10 != null) {
            m7.v.w(m7.g.b(this, 0, 1, null), new h8.n(k10, l3().l()), false, 2, null);
        }
        return l7.a.f15852a;
    }

    @Override // f8.e
    public void n(boolean z10, CovCertificate covCertificate) {
        O2().setValue(Boolean.FALSE);
        l3().t(z10, covCertificate);
    }

    @Override // u8.j, k7.g
    public Integer n2() {
        return Integer.valueOf(this.f9912l5);
    }

    @Override // f8.e
    public void o(CovCertificate covCertificate, ZonedDateTime zonedDateTime) {
        t.e(covCertificate, "certificate");
        O2().setValue(Boolean.FALSE);
        l3().s(covCertificate, zonedDateTime);
    }

    @Override // u8.j, androidx.fragment.app.Fragment
    public void o1(View view, Bundle bundle) {
        t.e(view, "view");
        super.o1(view, bundle);
        q3();
        MediaPlayer create = MediaPlayer.create(S1(), x7.d.a_res_0x7f0f0001);
        t.d(create, "create(requireContext(),…heck_certificate_scanned)");
        this.f9911k5 = create;
    }

    @Override // f8.e
    public void q(CovCertificate covCertificate) {
        t.e(covCertificate, "certificate");
        O2().setValue(Boolean.FALSE);
        l3().q(covCertificate);
    }

    @Override // f8.e
    public void t(CovCertificate covCertificate, ZonedDateTime zonedDateTime) {
        t.e(covCertificate, "certificate");
        O2().setValue(Boolean.FALSE);
        l3().r(covCertificate, zonedDateTime);
    }

    @Override // h8.e
    public void u(f8.j jVar) {
        O2().setValue(Boolean.TRUE);
        p2(n2().intValue());
        l3().v(jVar);
        l3().w(null);
        q3();
    }

    @Override // f8.c
    public void w(f8.j jVar) {
        t.e(jVar, "boosterCertData");
        m7.v.w(m7.g.b(this, 0, 1, null), new h8.p(jVar), false, 2, null);
    }
}
