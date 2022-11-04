package b9;

import hc.t;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ub.c0;
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000¨\u0006\u0004"}, d2 = {"Ljava/security/cert/X509Certificate;", BuildConfig.FLAVOR, BuildConfig.FLAVOR, "a", "covpass-http_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b {
    public static final Set<String> a(X509Certificate x509Certificate) {
        Set<String> J0;
        t.e(x509Certificate, "<this>");
        Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
        t.d(subjectAlternativeNames, "subjectAlternativeNames");
        ArrayList<List> arrayList = new ArrayList();
        Iterator<T> it = subjectAlternativeNames.iterator();
        while (true) {
            boolean z10 = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            List list = (List) next;
            if (list.size() < 2 || !t.a(list.get(0), 2) || !(list.get(1) instanceof String)) {
                z10 = false;
            }
            if (z10) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (List list2 : arrayList) {
            Object obj = list2.get(1);
            t.c(obj, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj;
            if (str != null) {
                arrayList2.add(str);
            }
        }
        J0 = c0.J0(arrayList2);
        return J0;
    }
}
