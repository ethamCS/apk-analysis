package ta;

import kotlin.Metadata;
import org.conscrypt.BuildConfig;
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a;\u0010\u0006\u001a\u0004\u0018\u00018\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a<\u0010\b\u001a\u00028\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004H\u0086\u0002¢\u0006\u0004\b\b\u0010\u0007\"&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, d2 = {BuildConfig.FLAVOR, "B", "F", "Lna/a;", "Lta/k;", "feature", "a", "(Lna/a;Lta/k;)Ljava/lang/Object;", "b", "Lfb/a;", "Lfb/b;", "FEATURE_INSTALLED_LIST", "Lfb/a;", "c", "()Lfb/a;", "getFEATURE_INSTALLED_LIST$annotations", "()V", "ktor-client-core"}, k = 2, mv = {1, 6, 0})
/* loaded from: classes.dex */
public final class l {

    /* renamed from: a */
    private static final fb.a<fb.b> f22079a = new fb.a<>("ApplicationFeatureRegistry");

    public static final <B, F> F a(na.a aVar, k<? extends B, F> kVar) {
        hc.t.e(aVar, "<this>");
        hc.t.e(kVar, "feature");
        fb.b bVar = (fb.b) aVar.c1().e(f22079a);
        if (bVar == null) {
            return null;
        }
        return (F) bVar.e(kVar.getKey());
    }

    public static final <B, F> F b(na.a aVar, k<? extends B, F> kVar) {
        hc.t.e(aVar, "<this>");
        hc.t.e(kVar, "feature");
        F f10 = (F) a(aVar, kVar);
        if (f10 != null) {
            return f10;
        }
        throw new IllegalStateException(("Feature " + kVar + " is not installed. Consider using `install(" + kVar.getKey() + ")` in client config first.").toString());
    }

    public static final fb.a<fb.b> c() {
        return f22079a;
    }
}
