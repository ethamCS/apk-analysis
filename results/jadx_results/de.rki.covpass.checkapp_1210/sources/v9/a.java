package v9;

import hc.t;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\rB\u0019\b\u0016\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\u0011"}, d2 = {"Lv9/a;", BuildConfig.FLAVOR, "Lv9/f;", "prefs", "Lv9/f;", "b", "()Lv9/f;", "Lgf/b;", "cbor", "Lgf/b;", "a", "()Lgf/b;", "<init>", "(Lv9/f;Lgf/b;)V", BuildConfig.FLAVOR, "preferencesName", "(Ljava/lang/String;Lgf/b;)V", "covpass-sdk_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a */
    private final f f23925a;

    /* renamed from: b */
    private final gf.b f23926b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(String str, gf.b bVar) {
        this(new f(c.b(str)), bVar);
        t.e(str, "preferencesName");
        t.e(bVar, "cbor");
    }

    public a(f fVar, gf.b bVar) {
        t.e(fVar, "prefs");
        t.e(bVar, "cbor");
        this.f23925a = fVar;
        this.f23926b = bVar;
    }

    public final gf.b a() {
        return this.f23926b;
    }

    public final f b() {
        return this.f23925a;
    }
}
