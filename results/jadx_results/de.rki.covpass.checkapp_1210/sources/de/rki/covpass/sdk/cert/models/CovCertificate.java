package de.rki.covpass.sdk.cert.models;

import android.util.Base64;
import bf.x;
import bf.y;
import hc.t;
import hc.v;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.Year;
import j$.time.YearMonth;
import j$.time.format.DateTimeParseException;
import java.util.List;
import kf.h1;
import kf.w0;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
import tb.m;
import ub.c0;
import ub.u;
@Metadata(bv = {}, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b5\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 g2\u00020\u0001:\u0002hgB\u0091\u0001\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\t\u0012\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011\u0012\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0018\u001a\u00020\t\u0012\b\b\u0002\u0010\u0019\u001a\u00020\t\u0012\b\b\u0002\u0010\u001a\u001a\u00020\t¢\u0006\u0004\ba\u0010bBÝ\u0001\b\u0017\u0012\u0006\u0010c\u001a\u00020\u001d\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0001\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0001\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0010\b\u0001\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0011\u0012\u0010\b\u0001\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0011\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\t\u0012\b\u0010A\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010C\u001a\u00020\u001d\u0012\u0006\u0010D\u001a\u00020\u001d\u0012\u0006\u0010E\u001a\u00020\u001d\u0012\u0006\u0010G\u001a\u00020\u001d\u0012\u0006\u0010U\u001a\u00020 \u0012\b\u0010e\u001a\u0004\u0018\u00010d¢\u0006\u0004\ba\u0010fJ!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005HÇ\u0001J\u0093\u0001\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\t2\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00112\u0010\b\u0002\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00112\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\t2\b\b\u0002\u0010\u001a\u001a\u00020\tHÆ\u0001J\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001dHÖ\u0001J\u0013\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\"\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b+\u0010&\u0012\u0004\b-\u0010*\u001a\u0004\b,\u0010(R \u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b.\u0010/\u0012\u0004\b2\u0010*\u001a\u0004\b0\u00101R \u0010\u0010\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b3\u0010\"\u0012\u0004\b5\u0010*\u001a\u0004\b4\u0010$R\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0002X\u0083\u0004¢\u0006\f\n\u0004\b6\u00107\u0012\u0004\b8\u0010*R\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00118\u0002X\u0083\u0004¢\u0006\f\n\u0004\b9\u00107\u0012\u0004\b:\u0010*R\"\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00118\u0002X\u0083\u0004¢\u0006\f\n\u0004\b#\u00107\u0012\u0004\b;\u0010*R \u0010\u0018\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b<\u0010\"\u0012\u0004\b>\u0010*\u001a\u0004\b=\u0010$R\u0017\u0010\u0019\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b0\u0010\"\u001a\u0004\b<\u0010$R\u0017\u0010\u001a\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b?\u0010\"\u001a\u0004\b?\u0010$R\u0014\u0010A\u001a\u00020\t8\u0002X\u0082D¢\u0006\u0006\n\u0004\b@\u0010\"R\u0014\u0010C\u001a\u00020\u001d8\u0002X\u0082D¢\u0006\u0006\n\u0004\b'\u0010BR\u0014\u0010D\u001a\u00020\u001d8\u0002X\u0082D¢\u0006\u0006\n\u0004\b,\u0010BR\u0014\u0010E\u001a\u00020\u001d8\u0002X\u0082D¢\u0006\u0006\n\u0004\b=\u0010BR\u0014\u0010G\u001a\u00020\u001d8\u0002X\u0082D¢\u0006\u0006\n\u0004\bF\u0010BR\u001b\u0010J\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\b3\u0010$R\u001b\u0010L\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010I\u001a\u0004\bK\u0010$R\u001b\u0010N\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bM\u0010I\u001a\u0004\b6\u0010$R\u001b\u0010Q\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bO\u0010I\u001a\u0004\bP\u0010$R\u0017\u0010U\u001a\u00020 8\u0006¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bF\u0010TR\u001b\u0010Y\u001a\u00020V8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bW\u0010I\u001a\u0004\b9\u0010XR\u0011\u0010\\\u001a\u00020Z8F¢\u0006\u0006\u001a\u0004\b.\u0010[R\u0013\u0010^\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b@\u0010]R\u0011\u0010_\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b+\u0010$R\u0011\u0010`\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\bH\u0010T¨\u0006i"}, d2 = {"Lde/rki/covpass/sdk/cert/models/CovCertificate;", BuildConfig.FLAVOR, "self", "Ljf/d;", "output", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialDesc", "Ltb/e0;", "r", BuildConfig.FLAVOR, "issuer", "j$/time/Instant", "validFrom", "validUntil", "Lde/rki/covpass/sdk/cert/models/Name;", "name", "birthDate", BuildConfig.FLAVOR, "Lde/rki/covpass/sdk/cert/models/Vaccination;", "vaccinations", "Lde/rki/covpass/sdk/cert/models/TestCert;", "tests", "Lde/rki/covpass/sdk/cert/models/Recovery;", "recoveries", "version", "kid", "rValue", "a", "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "Ljava/lang/String;", "h", "()Ljava/lang/String;", "b", "Lj$/time/Instant;", "m", "()Lj$/time/Instant;", "getValidFrom$annotations", "()V", "c", "n", "getValidUntil$annotations", "d", "Lde/rki/covpass/sdk/cert/models/Name;", "j", "()Lde/rki/covpass/sdk/cert/models/Name;", "getName$annotations", "e", "getBirthDate", "getBirthDate$annotations", "f", "Ljava/util/List;", "getVaccinations$annotations", "g", "getTests$annotations", "getRecoveries$annotations", "i", "o", "getVersion$annotations", "k", "l", "dateTimeSeparator", "I", "empty", "yearCount", "yearMonthCount", "p", "yearMonthDayCount", "q", "Lkotlin/Lazy;", "fullName", "getFullNameReverse", "fullNameReverse", "s", "fullTransliteratedName", "t", "getFullTransliteratedNameReverse", "fullTransliteratedNameReverse", "u", "Z", "()Z", "isGermanCertificate", BuildConfig.FLAVOR, "v", "()[B", "getRValueByteArray", "Lde/rki/covpass/sdk/cert/models/e;", "()Lde/rki/covpass/sdk/cert/models/e;", "dgcEntry", "()Lde/rki/covpass/sdk/cert/models/Recovery;", "recovery", "birthDateFormatted", "isRecoveryOlder90Days", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lde/rki/covpass/sdk/cert/models/Name;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen1", "Lkf/h1;", "serializationConstructorMarker", "(ILjava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lde/rki/covpass/sdk/cert/models/Name;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIIIZLkf/h1;)V", "Companion", "$serializer", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
@kotlinx.serialization.h
/* loaded from: classes.dex */
public final class CovCertificate {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private final String f8620a;

    /* renamed from: b */
    private final Instant f8621b;

    /* renamed from: c */
    private final Instant f8622c;

    /* renamed from: d */
    private final Name f8623d;

    /* renamed from: e */
    private final String f8624e;

    /* renamed from: f */
    private final List<Vaccination> f8625f;

    /* renamed from: g */
    private final List<TestCert> f8626g;

    /* renamed from: h */
    private final List<Recovery> f8627h;

    /* renamed from: i */
    private final String f8628i;

    /* renamed from: j */
    private final String f8629j;

    /* renamed from: k */
    private final String f8630k;

    /* renamed from: l */
    private final String f8631l;

    /* renamed from: m */
    private final int f8632m;

    /* renamed from: n */
    private final int f8633n;

    /* renamed from: o */
    private final int f8634o;

    /* renamed from: p */
    private final int f8635p;

    /* renamed from: q */
    private final Lazy f8636q;

    /* renamed from: r */
    private final Lazy f8637r;

    /* renamed from: s */
    private final Lazy f8638s;

    /* renamed from: t */
    private final Lazy f8639t;

    /* renamed from: u */
    private final boolean f8640u;

    /* renamed from: v */
    private final Lazy f8641v;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lde/rki/covpass/sdk/cert/models/CovCertificate$Companion;", BuildConfig.FLAVOR, "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lde/rki/covpass/sdk/cert/models/CovCertificate;", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<CovCertificate> serializer() {
            return CovCertificate$$serializer.INSTANCE;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class a extends v implements gc.a<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(0);
            CovCertificate.this = r1;
        }

        /* renamed from: b */
        public final String invoke() {
            List m10;
            String e02;
            String[] strArr = new String[2];
            String e10 = CovCertificate.this.j().g().e();
            if (e10 == null) {
                e10 = CovCertificate.this.j().g().f();
            }
            strArr[0] = e10;
            String b10 = CovCertificate.this.j().g().b();
            if (b10 == null) {
                b10 = CovCertificate.this.j().g().c();
            }
            strArr[1] = b10;
            m10 = u.m(strArr);
            e02 = c0.e0(m10, " ", null, null, 0, null, null, 62, null);
            return e02;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class b extends v implements gc.a<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(0);
            CovCertificate.this = r1;
        }

        /* renamed from: b */
        public final String invoke() {
            List m10;
            String e02;
            String[] strArr = new String[2];
            String b10 = CovCertificate.this.j().g().b();
            if (b10 == null) {
                b10 = CovCertificate.this.j().g().c();
            }
            strArr[0] = b10;
            String e10 = CovCertificate.this.j().g().e();
            if (e10 == null) {
                e10 = CovCertificate.this.j().g().f();
            }
            strArr[1] = e10;
            m10 = u.m(strArr);
            e02 = c0.e0(m10, ", ", null, null, 0, null, null, 62, null);
            return e02;
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class c extends v implements gc.a<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c() {
            super(0);
            CovCertificate.this = r1;
        }

        /* renamed from: b */
        public final String invoke() {
            List m10;
            String e02;
            String f10 = CovCertificate.this.j().g().f();
            if (!(f10 == null || f10.length() == 0)) {
                m10 = u.m(CovCertificate.this.j().g().f(), CovCertificate.this.j().g().c());
                e02 = c0.e0(m10, " ", null, null, 0, null, null, 62, null);
                return e02;
            }
            return CovCertificate.this.j().g().c();
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class d extends v implements gc.a<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d() {
            super(0);
            CovCertificate.this = r1;
        }

        /* renamed from: b */
        public final String invoke() {
            List m10;
            String e02;
            String f10 = CovCertificate.this.j().g().f();
            if (!(f10 == null || f10.length() == 0)) {
                m10 = u.m(CovCertificate.this.j().g().c(), CovCertificate.this.j().g().f());
                e02 = c0.e0(m10, ", ", null, null, 0, null, null, 62, null);
                return e02;
            }
            return CovCertificate.this.j().g().c();
        }
    }

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public static final class e extends v implements gc.a<byte[]> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e() {
            super(0);
            CovCertificate.this = r1;
        }

        /* renamed from: b */
        public final byte[] invoke() {
            return Base64.decode(CovCertificate.this.k(), 0);
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class f extends v implements gc.a<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f() {
            super(0);
            CovCertificate.this = r1;
        }

        /* renamed from: b */
        public final String invoke() {
            List m10;
            String e02;
            String[] strArr = new String[2];
            String e10 = CovCertificate.this.j().g().e();
            if (e10 == null) {
                e10 = CovCertificate.this.j().g().f();
            }
            strArr[0] = e10;
            String b10 = CovCertificate.this.j().g().b();
            if (b10 == null) {
                b10 = CovCertificate.this.j().g().c();
            }
            strArr[1] = b10;
            m10 = u.m(strArr);
            e02 = c0.e0(m10, " ", null, null, 0, null, null, 62, null);
            return e02;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class g extends v implements gc.a<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g() {
            super(0);
            CovCertificate.this = r1;
        }

        /* renamed from: b */
        public final String invoke() {
            List m10;
            String e02;
            String[] strArr = new String[2];
            String b10 = CovCertificate.this.j().g().b();
            if (b10 == null) {
                b10 = CovCertificate.this.j().g().c();
            }
            strArr[0] = b10;
            String e10 = CovCertificate.this.j().g().e();
            if (e10 == null) {
                e10 = CovCertificate.this.j().g().f();
            }
            strArr[1] = e10;
            m10 = u.m(strArr);
            e02 = c0.e0(m10, ", ", null, null, 0, null, null, 62, null);
            return e02;
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class h extends v implements gc.a<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h() {
            super(0);
            CovCertificate.this = r1;
        }

        /* renamed from: b */
        public final String invoke() {
            List m10;
            String e02;
            String f10 = CovCertificate.this.j().g().f();
            if (!(f10 == null || f10.length() == 0)) {
                m10 = u.m(CovCertificate.this.j().g().f(), CovCertificate.this.j().g().c());
                e02 = c0.e0(m10, " ", null, null, 0, null, null, 62, null);
                return e02;
            }
            return CovCertificate.this.j().g().c();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {BuildConfig.FLAVOR, "b", "()Ljava/lang/String;"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class i extends v implements gc.a<String> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i() {
            super(0);
            CovCertificate.this = r1;
        }

        /* renamed from: b */
        public final String invoke() {
            List m10;
            String e02;
            String f10 = CovCertificate.this.j().g().f();
            if (!(f10 == null || f10.length() == 0)) {
                m10 = u.m(CovCertificate.this.j().g().c(), CovCertificate.this.j().g().f());
                e02 = c0.e0(m10, ", ", null, null, 0, null, null, 62, null);
                return e02;
            }
            return CovCertificate.this.j().g().c();
        }
    }

    @Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u0012\n\u0002\b\u0003\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {BuildConfig.FLAVOR, "kotlin.jvm.PlatformType", "b", "()[B"}, k = 3, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class j extends v implements gc.a<byte[]> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j() {
            super(0);
            CovCertificate.this = r1;
        }

        /* renamed from: b */
        public final byte[] invoke() {
            return Base64.decode(CovCertificate.this.k(), 0);
        }
    }

    public CovCertificate() {
        this(null, null, null, null, null, null, null, null, null, null, null, 2047, null);
    }

    public /* synthetic */ CovCertificate(int i10, String str, Instant instant, Instant instant2, Name name, String str2, List list, List list2, List list3, String str3, String str4, String str5, String str6, int i11, int i12, int i13, int i14, boolean z10, h1 h1Var) {
        Lazy a10;
        Lazy a11;
        Lazy a12;
        Lazy a13;
        Lazy a14;
        if ((i10 & 0) != 0) {
            w0.a(i10, 0, CovCertificate$$serializer.INSTANCE.getDescriptor());
        }
        if ((i10 & 1) == 0) {
            this.f8620a = BuildConfig.FLAVOR;
        } else {
            this.f8620a = str;
        }
        if ((i10 & 2) == 0) {
            this.f8621b = null;
        } else {
            this.f8621b = instant;
        }
        if ((i10 & 4) == 0) {
            this.f8622c = null;
        } else {
            this.f8622c = instant2;
        }
        this.f8623d = (i10 & 8) == 0 ? new Name((String) null, (String) null, (String) null, (String) null, 15, (DefaultConstructorMarker) null) : name;
        if ((i10 & 16) == 0) {
            this.f8624e = BuildConfig.FLAVOR;
        } else {
            this.f8624e = str2;
        }
        this.f8625f = (i10 & 32) == 0 ? u.h() : list;
        this.f8626g = (i10 & 64) == 0 ? u.h() : list2;
        this.f8627h = (i10 & 128) == 0 ? u.h() : list3;
        if ((i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) == 0) {
            this.f8628i = BuildConfig.FLAVOR;
        } else {
            this.f8628i = str3;
        }
        if ((i10 & 512) == 0) {
            this.f8629j = BuildConfig.FLAVOR;
        } else {
            this.f8629j = str4;
        }
        if ((i10 & 1024) == 0) {
            this.f8630k = BuildConfig.FLAVOR;
        } else {
            this.f8630k = str5;
        }
        d();
        this.f8631l = (i10 & 2048) == 0 ? "T" : str6;
        if ((i10 & 4096) == 0) {
            this.f8632m = 0;
        } else {
            this.f8632m = i11;
        }
        this.f8633n = (i10 & 8192) == 0 ? 4 : i12;
        this.f8634o = (i10 & 16384) == 0 ? 7 : i13;
        this.f8635p = (32768 & i10) == 0 ? 10 : i14;
        a10 = m.a(new a());
        this.f8636q = a10;
        a11 = m.a(new b());
        this.f8637r = a11;
        a12 = m.a(new c());
        this.f8638s = a12;
        a13 = m.a(new d());
        this.f8639t = a13;
        this.f8640u = (i10 & 65536) == 0 ? x.v(this.f8620a, "DE", true) : z10;
        a14 = m.a(new e());
        this.f8641v = a14;
    }

    public CovCertificate(String str, Instant instant, Instant instant2, Name name, String str2, List<Vaccination> list, List<TestCert> list2, List<Recovery> list3, String str3, String str4, String str5) {
        Lazy a10;
        Lazy a11;
        Lazy a12;
        Lazy a13;
        boolean v10;
        Lazy a14;
        t.e(str, "issuer");
        t.e(name, "name");
        t.e(str2, "birthDate");
        t.e(str3, "version");
        t.e(str4, "kid");
        t.e(str5, "rValue");
        this.f8620a = str;
        this.f8621b = instant;
        this.f8622c = instant2;
        this.f8623d = name;
        this.f8624e = str2;
        this.f8625f = list;
        this.f8626g = list2;
        this.f8627h = list3;
        this.f8628i = str3;
        this.f8629j = str4;
        this.f8630k = str5;
        d();
        this.f8631l = "T";
        this.f8633n = 4;
        this.f8634o = 7;
        this.f8635p = 10;
        a10 = m.a(new f());
        this.f8636q = a10;
        a11 = m.a(new g());
        this.f8637r = a11;
        a12 = m.a(new h());
        this.f8638s = a12;
        a13 = m.a(new i());
        this.f8639t = a13;
        v10 = x.v(str, "DE", true);
        this.f8640u = v10;
        a14 = m.a(new j());
        this.f8641v = a14;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ CovCertificate(java.lang.String r14, j$.time.Instant r15, j$.time.Instant r16, de.rki.covpass.sdk.cert.models.Name r17, java.lang.String r18, java.util.List r19, java.util.List r20, java.util.List r21, java.lang.String r22, java.lang.String r23, java.lang.String r24, int r25, kotlin.jvm.internal.DefaultConstructorMarker r26) {
        /*
            r13 = this;
            r0 = r25
            r1 = r0 & 1
            java.lang.String r2 = ""
            if (r1 == 0) goto La
            r1 = r2
            goto Lb
        La:
            r1 = r14
        Lb:
            r3 = r0 & 2
            r4 = 0
            if (r3 == 0) goto L12
            r3 = r4
            goto L13
        L12:
            r3 = r15
        L13:
            r5 = r0 & 4
            if (r5 == 0) goto L18
            goto L1a
        L18:
            r4 = r16
        L1a:
            r5 = r0 & 8
            if (r5 == 0) goto L2c
            de.rki.covpass.sdk.cert.models.Name r5 = new de.rki.covpass.sdk.cert.models.Name
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 15
            r12 = 0
            r6 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12)
            goto L2e
        L2c:
            r5 = r17
        L2e:
            r6 = r0 & 16
            if (r6 == 0) goto L34
            r6 = r2
            goto L36
        L34:
            r6 = r18
        L36:
            r7 = r0 & 32
            if (r7 == 0) goto L3f
            java.util.List r7 = ub.s.h()
            goto L41
        L3f:
            r7 = r19
        L41:
            r8 = r0 & 64
            if (r8 == 0) goto L4a
            java.util.List r8 = ub.s.h()
            goto L4c
        L4a:
            r8 = r20
        L4c:
            r9 = r0 & 128(0x80, float:1.794E-43)
            if (r9 == 0) goto L55
            java.util.List r9 = ub.s.h()
            goto L57
        L55:
            r9 = r21
        L57:
            r10 = r0 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L5d
            r10 = r2
            goto L5f
        L5d:
            r10 = r22
        L5f:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L65
            r11 = r2
            goto L67
        L65:
            r11 = r23
        L67:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L6c
            goto L6e
        L6c:
            r2 = r24
        L6e:
            r14 = r13
            r15 = r1
            r16 = r3
            r17 = r4
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r8
            r22 = r9
            r23 = r10
            r24 = r11
            r25 = r2
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: de.rki.covpass.sdk.cert.models.CovCertificate.<init>(java.lang.String, j$.time.Instant, j$.time.Instant, de.rki.covpass.sdk.cert.models.Name, java.lang.String, java.util.List, java.util.List, java.util.List, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CovCertificate b(CovCertificate covCertificate, String str, Instant instant, Instant instant2, Name name, String str2, List list, List list2, List list3, String str3, String str4, String str5, int i10, Object obj) {
        return covCertificate.a((i10 & 1) != 0 ? covCertificate.f8620a : str, (i10 & 2) != 0 ? covCertificate.f8621b : instant, (i10 & 4) != 0 ? covCertificate.f8622c : instant2, (i10 & 8) != 0 ? covCertificate.f8623d : name, (i10 & 16) != 0 ? covCertificate.f8624e : str2, (i10 & 32) != 0 ? covCertificate.f8625f : list, (i10 & 64) != 0 ? covCertificate.f8626g : list2, (i10 & 128) != 0 ? covCertificate.f8627h : list3, (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? covCertificate.f8628i : str3, (i10 & 512) != 0 ? covCertificate.f8629j : str4, (i10 & 1024) != 0 ? covCertificate.f8630k : str5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:135:0x0202, code lost:
        if (r2 != r4) goto L133;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x018d  */
    @fc.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void r(de.rki.covpass.sdk.cert.models.CovCertificate r13, jf.d r14, kotlinx.serialization.descriptors.SerialDescriptor r15) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: de.rki.covpass.sdk.cert.models.CovCertificate.r(de.rki.covpass.sdk.cert.models.CovCertificate, jf.d, kotlinx.serialization.descriptors.SerialDescriptor):void");
    }

    public final CovCertificate a(String str, Instant instant, Instant instant2, Name name, String str2, List<Vaccination> list, List<TestCert> list2, List<Recovery> list3, String str3, String str4, String str5) {
        t.e(str, "issuer");
        t.e(name, "name");
        t.e(str2, "birthDate");
        t.e(str3, "version");
        t.e(str4, "kid");
        t.e(str5, "rValue");
        return new CovCertificate(str, instant, instant2, name, str2, list, list2, list3, str3, str4, str5);
    }

    public final String c() {
        String P0;
        StringBuilder sb2;
        String str;
        try {
            int length = this.f8624e.length();
            if (length == this.f8632m) {
                return "XXXX-XX-XX";
            }
            if (length == this.f8633n) {
                Year parse = Year.parse(this.f8624e);
                sb2 = new StringBuilder();
                sb2.append(parse);
                str = "-XX-XX";
            } else if (length != this.f8634o) {
                if (length == this.f8635p) {
                    return String.valueOf(LocalDate.parse(this.f8624e));
                }
                P0 = y.P0(this.f8624e, this.f8631l, null, 2, null);
                return P0;
            } else {
                YearMonth parse2 = YearMonth.parse(this.f8624e);
                sb2 = new StringBuilder();
                sb2.append(parse2);
                str = "-XX";
            }
            sb2.append(str);
            return sb2.toString();
        } catch (DateTimeParseException unused) {
            return this.f8624e;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000a, code lost:
        if (r0 != null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final de.rki.covpass.sdk.cert.models.e d() {
        /*
            r2 = this;
            java.util.List<de.rki.covpass.sdk.cert.models.Vaccination> r0 = r2.f8625f
            if (r0 == 0) goto Ld
            java.lang.Object r0 = ub.s.X(r0)
            de.rki.covpass.sdk.cert.models.Vaccination r0 = (de.rki.covpass.sdk.cert.models.Vaccination) r0
            if (r0 == 0) goto Ld
            goto L2b
        Ld:
            java.util.List<de.rki.covpass.sdk.cert.models.TestCert> r0 = r2.f8626g
            r1 = 0
            if (r0 == 0) goto L19
            java.lang.Object r0 = ub.s.X(r0)
            de.rki.covpass.sdk.cert.models.TestCert r0 = (de.rki.covpass.sdk.cert.models.TestCert) r0
            goto L1a
        L19:
            r0 = r1
        L1a:
            if (r0 == 0) goto L1d
            goto L2b
        L1d:
            java.util.List<de.rki.covpass.sdk.cert.models.Recovery> r0 = r2.f8627h
            if (r0 == 0) goto L28
            java.lang.Object r0 = ub.s.X(r0)
            de.rki.covpass.sdk.cert.models.Recovery r0 = (de.rki.covpass.sdk.cert.models.Recovery) r0
            goto L29
        L28:
            r0 = r1
        L29:
            if (r0 == 0) goto L2c
        L2b:
            return r0
        L2c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "CovCertificates without any DGCEntries are not allowed."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: de.rki.covpass.sdk.cert.models.CovCertificate.d():de.rki.covpass.sdk.cert.models.e");
    }

    public final String e() {
        return (String) this.f8636q.getValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CovCertificate)) {
            return false;
        }
        CovCertificate covCertificate = (CovCertificate) obj;
        return t.a(this.f8620a, covCertificate.f8620a) && t.a(this.f8621b, covCertificate.f8621b) && t.a(this.f8622c, covCertificate.f8622c) && t.a(this.f8623d, covCertificate.f8623d) && t.a(this.f8624e, covCertificate.f8624e) && t.a(this.f8625f, covCertificate.f8625f) && t.a(this.f8626g, covCertificate.f8626g) && t.a(this.f8627h, covCertificate.f8627h) && t.a(this.f8628i, covCertificate.f8628i) && t.a(this.f8629j, covCertificate.f8629j) && t.a(this.f8630k, covCertificate.f8630k);
    }

    public final String f() {
        return (String) this.f8638s.getValue();
    }

    public final byte[] g() {
        Object value = this.f8641v.getValue();
        t.d(value, "<get-getRValueByteArray>(...)");
        return (byte[]) value;
    }

    public final String h() {
        return this.f8620a;
    }

    public int hashCode() {
        int hashCode = this.f8620a.hashCode() * 31;
        Instant instant = this.f8621b;
        int i10 = 0;
        int hashCode2 = (hashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.f8622c;
        int hashCode3 = (((((hashCode2 + (instant2 == null ? 0 : instant2.hashCode())) * 31) + this.f8623d.hashCode()) * 31) + this.f8624e.hashCode()) * 31;
        List<Vaccination> list = this.f8625f;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<TestCert> list2 = this.f8626g;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<Recovery> list3 = this.f8627h;
        if (list3 != null) {
            i10 = list3.hashCode();
        }
        return ((((((hashCode5 + i10) * 31) + this.f8628i.hashCode()) * 31) + this.f8629j.hashCode()) * 31) + this.f8630k.hashCode();
    }

    public final String i() {
        return this.f8629j;
    }

    public final Name j() {
        return this.f8623d;
    }

    public final String k() {
        return this.f8630k;
    }

    public final Recovery l() {
        Object X;
        List<Recovery> list = this.f8627h;
        if (list != null) {
            X = c0.X(list);
            return (Recovery) X;
        }
        return null;
    }

    public final Instant m() {
        return this.f8621b;
    }

    public final Instant n() {
        return this.f8622c;
    }

    public final String o() {
        return this.f8628i;
    }

    public final boolean p() {
        return this.f8640u;
    }

    public final boolean q() {
        LocalDate b10;
        if (d().getType() == de.rki.covpass.sdk.cert.models.g.RECOVERY) {
            Recovery l10 = l();
            if ((l10 == null || (b10 = l10.b()) == null || !z9.m.b(b10, 90L)) ? false : true) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        String str = this.f8620a;
        Instant instant = this.f8621b;
        Instant instant2 = this.f8622c;
        Name name = this.f8623d;
        String str2 = this.f8624e;
        List<Vaccination> list = this.f8625f;
        List<TestCert> list2 = this.f8626g;
        List<Recovery> list3 = this.f8627h;
        String str3 = this.f8628i;
        String str4 = this.f8629j;
        String str5 = this.f8630k;
        return "CovCertificate(issuer=" + str + ", validFrom=" + instant + ", validUntil=" + instant2 + ", name=" + name + ", birthDate=" + str2 + ", vaccinations=" + list + ", tests=" + list2 + ", recoveries=" + list3 + ", version=" + str3 + ", kid=" + str4 + ", rValue=" + str5 + ")";
    }
}
