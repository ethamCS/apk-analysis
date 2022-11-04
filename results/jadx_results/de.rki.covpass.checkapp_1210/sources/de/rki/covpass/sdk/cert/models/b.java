package de.rki.covpass.sdk.cert.models;

import hc.t;
import j$.time.Instant;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import t7.n;
import t7.o;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\tB-\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0014\u001a\u00020\r\u0012\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u000e\u0010\u0018¨\u0006\u001c"}, d2 = {"Lde/rki/covpass/sdk/cert/models/b;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "hashCode", "other", BuildConfig.FLAVOR, "equals", "a", "Ljava/lang/String;", "()Ljava/lang/String;", "issuer", "j$/time/Instant", "b", "Lj$/time/Instant;", "c", "()Lj$/time/Instant;", "validFrom", "d", "validUntil", "Lt7/o;", "rawCbor", "Lt7/o;", "()Lt7/o;", "<init>", "(Ljava/lang/String;Lj$/time/Instant;Lj$/time/Instant;Lt7/o;)V", "Companion", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final String f8711a;

    /* renamed from: b */
    private final Instant f8712b;

    /* renamed from: c */
    private final Instant f8713c;

    /* renamed from: d */
    private final o f8714d;

    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¨\u0006\b"}, d2 = {"Lde/rki/covpass/sdk/cert/models/b$a;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "data", "Lde/rki/covpass/sdk/cert/models/b;", "a", "<init>", "()V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
    /* loaded from: classes.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(byte[] bArr) {
            n r10;
            t.e(bArr, "data");
            o F = o.F(bArr);
            String s10 = F.j1(1).s();
            t.d(s10, "cbor[1].AsString()");
            o j12 = F.j1(6);
            Instant ofEpochSecond = (j12 == null || (r10 = j12.r()) == null) ? null : Instant.ofEpochSecond(r10.G());
            Instant ofEpochSecond2 = Instant.ofEpochSecond(F.j1(4).r().G());
            t.d(ofEpochSecond2, "ofEpochSecond(cbor[4].AsNumber().ToInt64Checked())");
            t.d(F, "cbor");
            return new b(s10, ofEpochSecond, ofEpochSecond2, F);
        }
    }

    public b(String str, Instant instant, Instant instant2, o oVar) {
        t.e(str, "issuer");
        t.e(instant2, "validUntil");
        t.e(oVar, "rawCbor");
        this.f8711a = str;
        this.f8712b = instant;
        this.f8713c = instant2;
        this.f8714d = oVar;
    }

    public final String a() {
        return this.f8711a;
    }

    public final o b() {
        return this.f8714d;
    }

    public final Instant c() {
        return this.f8712b;
    }

    public final Instant d() {
        return this.f8713c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return t.a(this.f8711a, bVar.f8711a) && t.a(this.f8712b, bVar.f8712b) && t.a(this.f8713c, bVar.f8713c) && t.a(this.f8714d, bVar.f8714d);
    }

    public int hashCode() {
        int hashCode = this.f8711a.hashCode() * 31;
        Instant instant = this.f8712b;
        return ((((hashCode + (instant == null ? 0 : instant.hashCode())) * 31) + this.f8713c.hashCode()) * 31) + this.f8714d.hashCode();
    }

    public String toString() {
        String str = this.f8711a;
        Instant instant = this.f8712b;
        Instant instant2 = this.f8713c;
        o oVar = this.f8714d;
        return "CBORWebToken(issuer=" + str + ", validFrom=" + instant + ", validUntil=" + instant2 + ", rawCbor=" + oVar + ")";
    }
}
