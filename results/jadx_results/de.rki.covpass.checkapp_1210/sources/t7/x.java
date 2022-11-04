package t7;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
final class x {

    /* renamed from: a */
    private final Map<String, String> f22019a = new HashMap();

    public x(String str) {
        String[] c10;
        Objects.requireNonNull(str, "options");
        if (str.length() > 0) {
            for (String str2 : c(str, ";")) {
                int indexOf = str2.indexOf(61);
                if (indexOf < 0) {
                    throw new IllegalArgumentException("Invalid options String: " + str);
                }
                this.f22019a.put(v7.a.f(str2.substring(0, indexOf)), str2.substring(indexOf + 1));
            }
        }
    }

    private static String[] c(String str, String str2) {
        Objects.requireNonNull(str2, "delimiter");
        if (str2.length() != 0) {
            if (str == null || str.length() == 0) {
                return new String[]{BuildConfig.FLAVOR};
            }
            ArrayList arrayList = null;
            int length = str2.length();
            boolean z10 = true;
            int i10 = 0;
            while (true) {
                int indexOf = str.indexOf(str2, i10);
                if (indexOf < 0) {
                    break;
                }
                String substring = str.substring(i10, (indexOf - i10) + i10);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(substring);
                i10 = indexOf + length;
                z10 = false;
            }
            if (z10) {
                return new String[]{str};
            }
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(str.substring(i10));
            return (String[]) arrayList.toArray(new String[0]);
        }
        throw new IllegalArgumentException("delimiter is empty.");
    }

    public boolean a(String str, boolean z10) {
        String f10 = v7.a.f(str);
        if (this.f22019a.containsKey(f10)) {
            String f11 = v7.a.f(this.f22019a.get(f10));
            return f11.equals("1") || f11.equals("yes") || f11.equals("on") || f11.equals("true");
        }
        return z10;
    }

    public String b(String str, String str2) {
        String f10 = v7.a.f(str);
        return this.f22019a.containsKey(f10) ? v7.a.f(this.f22019a.get(f10)) : str2;
    }
}
