package cb;

import hc.t;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nc.m;
import org.conscrypt.BuildConfig;
import ub.p0;
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\n\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\fB\u0017\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017B\u0019\b\u0016\u0012\u0006\u0010\n\u001a\u00020\u0012\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcb/a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", BuildConfig.FLAVOR, "code", "S", "a", "()S", "message", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcb/a$a;", "b", "()Lcb/a$a;", "knownReason", "<init>", "(SLjava/lang/String;)V", "(Lcb/a$a;Ljava/lang/String;)V", "ktor-http-cio"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private final short f6399a;

    /* renamed from: b */
    private final String f6400b;

    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\n\n\u0002\b\u0014\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcb/a$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "code", "S", "h", "()S", "<init>", "(Ljava/lang/String;IS)V", "a", "NORMAL", "GOING_AWAY", "PROTOCOL_ERROR", "CANNOT_ACCEPT", "CLOSED_ABNORMALLY", "NOT_CONSISTENT", "VIOLATED_POLICY", "TOO_BIG", "NO_EXTENSION", "INTERNAL_ERROR", "SERVICE_RESTART", "TRY_AGAIN_LATER", "ktor-http-cio"}, k = 1, mv = {1, 6, 0})
    /* renamed from: cb.a$a */
    /* loaded from: classes.dex */
    public enum EnumC0086a {
        NORMAL(1000),
        GOING_AWAY(1001),
        PROTOCOL_ERROR(1002),
        CANNOT_ACCEPT(1003),
        CLOSED_ABNORMALLY(1006),
        NOT_CONSISTENT(1007),
        VIOLATED_POLICY(1008),
        TOO_BIG(1009),
        NO_EXTENSION(1010),
        INTERNAL_ERROR(1011),
        SERVICE_RESTART(1012),
        TRY_AGAIN_LATER(1013);
        
        public static final C0087a Companion = new C0087a(null);

        /* renamed from: d */
        private static final Map<Short, EnumC0086a> f6404d;

        /* renamed from: q */
        public static final EnumC0086a f6407q;

        /* renamed from: c */
        private final short f6410c;

        @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\tJ\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\b\u0010\tR \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcb/a$a$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "code", "Lcb/a$a;", "a", "UNEXPECTED_CONDITION", "Lcb/a$a;", "getUNEXPECTED_CONDITION$annotations", "()V", BuildConfig.FLAVOR, "byCodeMap", "Ljava/util/Map;", "<init>", "ktor-http-cio"}, k = 1, mv = {1, 6, 0})
        /* renamed from: cb.a$a$a */
        /* loaded from: classes.dex */
        public static final class C0087a {
            private C0087a() {
            }

            public /* synthetic */ C0087a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final EnumC0086a a(short s10) {
                return (EnumC0086a) EnumC0086a.f6404d.get(Short.valueOf(s10));
            }
        }

        static {
            int d10;
            int b10;
            int i10 = 0;
            EnumC0086a[] values = values();
            d10 = p0.d(values.length);
            b10 = m.b(d10, 16);
            LinkedHashMap linkedHashMap = new LinkedHashMap(b10);
            int length = values.length;
            while (i10 < length) {
                EnumC0086a enumC0086a = values[i10];
                i10++;
                linkedHashMap.put(Short.valueOf(enumC0086a.h()), enumC0086a);
            }
            f6404d = linkedHashMap;
            f6407q = INTERNAL_ERROR;
        }

        EnumC0086a(short s10) {
            this.f6410c = s10;
        }

        public final short h() {
            return this.f6410c;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(EnumC0086a enumC0086a, String str) {
        this(enumC0086a.h(), str);
        t.e(enumC0086a, "code");
        t.e(str, "message");
    }

    public a(short s10, String str) {
        t.e(str, "message");
        this.f6399a = s10;
        this.f6400b = str;
    }

    public final short a() {
        return this.f6399a;
    }

    public final EnumC0086a b() {
        return EnumC0086a.Companion.a(this.f6399a);
    }

    public final String c() {
        return this.f6400b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f6399a == aVar.f6399a && t.a(this.f6400b, aVar.f6400b);
    }

    public int hashCode() {
        return (this.f6399a * 31) + this.f6400b.hashCode();
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CloseReason(reason=");
        Object b10 = b();
        if (b10 == null) {
            b10 = Short.valueOf(this.f6399a);
        }
        sb2.append(b10);
        sb2.append(", message=");
        sb2.append(this.f6400b);
        sb2.append(')');
        return sb2.toString();
    }
}
