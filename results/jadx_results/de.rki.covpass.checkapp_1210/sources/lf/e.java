package lf;

import hc.t;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
import org.conscrypt.PSKKeyManager;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\u0018\u00002\u00020\u0001B\u0081\u0001\b\u0000\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0004\u0012\b\b\u0002\u0010\"\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%J\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\bR\u0017\u0010\u000f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0006\u001a\u0004\b\u0010\u0010\bR \u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0011\u0010\u0006\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0012\u0010\bR \u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0006\u001a\u0004\b\u001b\u0010\bR\u0017\u0010\u001c\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001d\u0010\bR\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018R\u0017\u0010 \u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u0006\u001a\u0004\b!\u0010\bR\u0017\u0010\"\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u0006\u001a\u0004\b#\u0010\b¨\u0006&"}, d2 = {"Llf/e;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "toString", BuildConfig.FLAVOR, "encodeDefaults", "Z", "e", "()Z", "ignoreUnknownKeys", "g", "isLenient", "l", "allowStructuredMapKeys", "b", "prettyPrint", "h", "explicitNulls", "f", "getExplicitNulls$annotations", "()V", "prettyPrintIndent", "Ljava/lang/String;", "i", "()Ljava/lang/String;", "getPrettyPrintIndent$annotations", "coerceInputValues", "d", "useArrayPolymorphism", "k", "classDiscriminator", "c", "allowSpecialFloatingPointValues", "a", "useAlternativeNames", "j", "<init>", "(ZZZZZZLjava/lang/String;ZZLjava/lang/String;ZZ)V", "kotlinx-serialization-json"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes3.dex */
public final class e {

    /* renamed from: a */
    private final boolean f15983a;

    /* renamed from: b */
    private final boolean f15984b;

    /* renamed from: c */
    private final boolean f15985c;

    /* renamed from: d */
    private final boolean f15986d;

    /* renamed from: e */
    private final boolean f15987e;

    /* renamed from: f */
    private final boolean f15988f;

    /* renamed from: g */
    private final String f15989g;

    /* renamed from: h */
    private final boolean f15990h;

    /* renamed from: i */
    private final boolean f15991i;

    /* renamed from: j */
    private final String f15992j;

    /* renamed from: k */
    private final boolean f15993k;

    /* renamed from: l */
    private final boolean f15994l;

    public e(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str, boolean z16, boolean z17, String str2, boolean z18, boolean z19) {
        t.e(str, "prettyPrintIndent");
        t.e(str2, "classDiscriminator");
        this.f15983a = z10;
        this.f15984b = z11;
        this.f15985c = z12;
        this.f15986d = z13;
        this.f15987e = z14;
        this.f15988f = z15;
        this.f15989g = str;
        this.f15990h = z16;
        this.f15991i = z17;
        this.f15992j = str2;
        this.f15993k = z18;
        this.f15994l = z19;
    }

    public /* synthetic */ e(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, String str, boolean z16, boolean z17, String str2, boolean z18, boolean z19, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? false : z13, (i10 & 16) != 0 ? false : z14, (i10 & 32) != 0 ? true : z15, (i10 & 64) != 0 ? "    " : str, (i10 & 128) != 0 ? false : z16, (i10 & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0 ? false : z17, (i10 & 512) != 0 ? "type" : str2, (i10 & 1024) == 0 ? z18 : false, (i10 & 2048) == 0 ? z19 : true);
    }

    public final boolean a() {
        return this.f15993k;
    }

    public final boolean b() {
        return this.f15986d;
    }

    public final String c() {
        return this.f15992j;
    }

    public final boolean d() {
        return this.f15990h;
    }

    public final boolean e() {
        return this.f15983a;
    }

    public final boolean f() {
        return this.f15988f;
    }

    public final boolean g() {
        return this.f15984b;
    }

    public final boolean h() {
        return this.f15987e;
    }

    public final String i() {
        return this.f15989g;
    }

    public final boolean j() {
        return this.f15994l;
    }

    public final boolean k() {
        return this.f15991i;
    }

    public final boolean l() {
        return this.f15985c;
    }

    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f15983a + ", ignoreUnknownKeys=" + this.f15984b + ", isLenient=" + this.f15985c + ", allowStructuredMapKeys=" + this.f15986d + ", prettyPrint=" + this.f15987e + ", explicitNulls=" + this.f15988f + ", prettyPrintIndent='" + this.f15989g + "', coerceInputValues=" + this.f15990h + ", useArrayPolymorphism=" + this.f15991i + ", classDiscriminator='" + this.f15992j + "', allowSpecialFloatingPointValues=" + this.f15993k + ')';
    }
}
