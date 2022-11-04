package bb;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0014J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004H\u0014¨\u0006\u000e"}, d2 = {"Lbb/m;", "Lfb/w;", "Lbb/l;", "q", BuildConfig.FLAVOR, "name", "Ltb/e0;", "o", "value", "p", BuildConfig.FLAVOR, "size", "<init>", "(I)V", "ktor-http"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class m extends fb.w {
    public m() {
        this(0, 1, null);
    }

    public m(int i10) {
        super(true, i10);
    }

    public /* synthetic */ m(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 8 : i10);
    }

    @Override // fb.w
    public void o(String str) {
        hc.t.e(str, "name");
        super.o(str);
        p.f5855a.a(str);
    }

    @Override // fb.w
    public void p(String str) {
        hc.t.e(str, "value");
        super.p(str);
        p.f5855a.b(str);
    }

    public l q() {
        if (!i()) {
            n(true);
            return new n(j());
        }
        throw new IllegalArgumentException("HeadersBuilder can only build a single Headers instance".toString());
    }
}
