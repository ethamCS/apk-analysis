package e8;

import bf.a0;
import bf.x;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.conscrypt.BuildConfig;
import ub.c0;
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\b\u001a$\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002\u001a\u0014\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0001H\u0002\u001a\f\u0010\b\u001a\u00020\u0000*\u00020\u0000H\u0002¨\u0006\t"}, d2 = {BuildConfig.FLAVOR, BuildConfig.FLAVOR, "nrOfCharacters", "yStart", "lineSpacing", "d", "y", "e", "c", "common-app-covpass-check_release"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class b {
    public static final String c(String str) {
        String E;
        String E2;
        String E3;
        String E4;
        String E5;
        E = x.E(str, "&", "&amp;", false, 4, null);
        E2 = x.E(E, "<", "&lt;", false, 4, null);
        E3 = x.E(E2, ">", "&gt;", false, 4, null);
        E4 = x.E(E3, "\"", "&quot;", false, 4, null);
        E5 = x.E(E4, "'", "&apos;", false, 4, null);
        return E5;
    }

    public static final String d(String str, int i10, int i11, int i12) {
        List<String> T0;
        String e02;
        ArrayList arrayList = new ArrayList();
        T0 = a0.T0(str, i10);
        for (String str2 : T0) {
            arrayList.add(e(str2, i11));
            i11 += i12;
        }
        e02 = c0.e0(arrayList, null, null, null, 0, null, null, 63, null);
        return e02;
    }

    private static final String e(String str, int i10) {
        return "<tspan x=\"0\" y=\"" + i10 + "\">" + str + "</tspan>";
    }
}
