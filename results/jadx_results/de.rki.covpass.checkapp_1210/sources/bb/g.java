package bb;

import bb.b0;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ub.y0;
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\u0010&\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\u00070\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0002H\u0016J\u0013\u0010\u000e\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002R\u0014\u0010\u0011\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lbb/g;", "Lbb/b0;", BuildConfig.FLAVOR, "name", BuildConfig.FLAVOR, "b", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "a", BuildConfig.FLAVOR, "isEmpty", "toString", BuildConfig.FLAVOR, "other", "equals", "d", "()Z", "caseInsensitiveName", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class g implements b0 {

    /* renamed from: a */
    public static final g f5834a = new g();

    private g() {
    }

    @Override // fb.v
    public Set<Map.Entry<String, List<String>>> a() {
        Set<Map.Entry<String, List<String>>> b10;
        b10 = y0.b();
        return b10;
    }

    @Override // fb.v
    public List<String> b(String str) {
        hc.t.e(str, "name");
        return null;
    }

    @Override // fb.v
    public void c(gc.p<? super String, ? super List<String>, tb.e0> pVar) {
        b0.b.a(this, pVar);
    }

    @Override // fb.v
    public boolean d() {
        return true;
    }

    public boolean equals(Object obj) {
        return (obj instanceof b0) && ((b0) obj).isEmpty();
    }

    @Override // bb.b0
    public q0 f() {
        return b0.b.b(this);
    }

    @Override // fb.v
    public boolean isEmpty() {
        return true;
    }

    public String toString() {
        return hc.t.l("Parameters ", a());
    }
}
