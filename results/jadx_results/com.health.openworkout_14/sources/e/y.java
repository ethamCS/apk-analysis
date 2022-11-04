package e;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class y {

    /* renamed from: a */
    private final String[] f4407a;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        final List<String> f4408a = new ArrayList(20);

        public a a(String str, String str2) {
            y.a(str);
            y.b(str2, str);
            d(str, str2);
            return this;
        }

        public a b(y yVar) {
            int h2 = yVar.h();
            for (int i = 0; i < h2; i++) {
                d(yVar.e(i), yVar.i(i));
            }
            return this;
        }

        public a c(String str) {
            int indexOf = str.indexOf(":", 1);
            if (indexOf != -1) {
                d(str.substring(0, indexOf), str.substring(indexOf + 1));
                return this;
            } else if (str.startsWith(":")) {
                d("", str.substring(1));
                return this;
            } else {
                d("", str);
                return this;
            }
        }

        public a d(String str, String str2) {
            this.f4408a.add(str);
            this.f4408a.add(str2.trim());
            return this;
        }

        public y e() {
            return new y(this);
        }

        public a f(String str) {
            int i = 0;
            while (i < this.f4408a.size()) {
                if (str.equalsIgnoreCase(this.f4408a.get(i))) {
                    this.f4408a.remove(i);
                    this.f4408a.remove(i);
                    i -= 2;
                }
                i += 2;
            }
            return this;
        }

        public a g(String str, String str2) {
            y.a(str);
            y.b(str2, str);
            f(str);
            d(str, str2);
            return this;
        }
    }

    y(a aVar) {
        List<String> list = aVar.f4408a;
        this.f4407a = (String[]) list.toArray(new String[list.size()]);
    }

    private y(String[] strArr) {
        this.f4407a = strArr;
    }

    static void a(String str) {
        Objects.requireNonNull(str, "name == null");
        if (!str.isEmpty()) {
            int length = str.length();
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if (charAt <= ' ' || charAt >= 127) {
                    throw new IllegalArgumentException(e.m0.e.o("Unexpected char %#04x at %d in header name: %s", Integer.valueOf(charAt), Integer.valueOf(i), str));
                }
            }
            return;
        }
        throw new IllegalArgumentException("name is empty");
    }

    static void b(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("value for name " + str2 + " == null");
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if ((charAt <= 31 && charAt != '\t') || charAt >= 127) {
                throw new IllegalArgumentException(e.m0.e.o("Unexpected char %#04x at %d in %s value: %s", Integer.valueOf(charAt), Integer.valueOf(i), str2, str));
            }
        }
    }

    @Nullable
    private static String d(String[] strArr, String str) {
        for (int length = strArr.length - 2; length >= 0; length -= 2) {
            if (str.equalsIgnoreCase(strArr[length])) {
                return strArr[length + 1];
            }
        }
        return null;
    }

    public static y g(String... strArr) {
        Objects.requireNonNull(strArr, "namesAndValues == null");
        if (strArr.length % 2 == 0) {
            String[] strArr2 = (String[]) strArr.clone();
            for (int i = 0; i < strArr2.length; i++) {
                if (strArr2[i] == null) {
                    throw new IllegalArgumentException("Headers cannot be null");
                }
                strArr2[i] = strArr2[i].trim();
            }
            for (int i2 = 0; i2 < strArr2.length; i2 += 2) {
                String str = strArr2[i2];
                String str2 = strArr2[i2 + 1];
                a(str);
                b(str2, str);
            }
            return new y(strArr2);
        }
        throw new IllegalArgumentException("Expected alternating header names and values");
    }

    @Nullable
    public String c(String str) {
        return d(this.f4407a, str);
    }

    public String e(int i) {
        return this.f4407a[i * 2];
    }

    public boolean equals(@Nullable Object obj) {
        return (obj instanceof y) && Arrays.equals(((y) obj).f4407a, this.f4407a);
    }

    public a f() {
        a aVar = new a();
        Collections.addAll(aVar.f4408a, this.f4407a);
        return aVar;
    }

    public int h() {
        return this.f4407a.length / 2;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f4407a);
    }

    public String i(int i) {
        return this.f4407a[(i * 2) + 1];
    }

    public List<String> j(String str) {
        int h2 = h();
        ArrayList arrayList = null;
        for (int i = 0; i < h2; i++) {
            if (str.equalsIgnoreCase(e(i))) {
                if (arrayList == null) {
                    arrayList = new ArrayList(2);
                }
                arrayList.add(i(i));
            }
        }
        return arrayList != null ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        int h2 = h();
        for (int i = 0; i < h2; i++) {
            sb.append(e(i));
            sb.append(": ");
            sb.append(i(i));
            sb.append("\n");
        }
        return sb.toString();
    }
}
