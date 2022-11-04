package bb;

import bb.l;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ub.y0;
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0010&\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006H\u0016J \u0010\t\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00040\b0\u0006H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016R\u0014\u0010\u000e\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lbb/f;", "Lbb/l;", BuildConfig.FLAVOR, "name", BuildConfig.FLAVOR, "b", BuildConfig.FLAVOR, "names", BuildConfig.FLAVOR, "a", "toString", BuildConfig.FLAVOR, "d", "()Z", "caseInsensitiveName", "<init>", "()V", "ktor-http"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class f implements l {

    /* renamed from: a */
    public static final f f5824a = new f();

    private f() {
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
        l.b.a(this, pVar);
    }

    @Override // fb.v
    public boolean d() {
        return true;
    }

    @Override // fb.v
    public String e(String str) {
        return l.b.b(this, str);
    }

    @Override // fb.v
    public Set<String> names() {
        Set<String> b10;
        b10 = y0.b();
        return b10;
    }

    public String toString() {
        return hc.t.l("Headers ", a());
    }
}
