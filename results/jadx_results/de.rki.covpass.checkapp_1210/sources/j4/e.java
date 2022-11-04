package j4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes.dex */
public class e {

    /* renamed from: c */
    public static final e f14002c = new e("COMPOSITION");

    /* renamed from: a */
    private final List<String> f14003a;

    /* renamed from: b */
    private f f14004b;

    private e(e eVar) {
        this.f14003a = new ArrayList(eVar.f14003a);
        this.f14004b = eVar.f14004b;
    }

    public e(String... strArr) {
        this.f14003a = Arrays.asList(strArr);
    }

    private boolean b() {
        List<String> list = this.f14003a;
        return list.get(list.size() - 1).equals("**");
    }

    private boolean f(String str) {
        return "__container".equals(str);
    }

    public e a(String str) {
        e eVar = new e(this);
        eVar.f14003a.add(str);
        return eVar;
    }

    public boolean c(String str, int i10) {
        if (i10 >= this.f14003a.size()) {
            return false;
        }
        boolean z10 = i10 == this.f14003a.size() - 1;
        String str2 = this.f14003a.get(i10);
        if (!str2.equals("**")) {
            return (z10 || (i10 == this.f14003a.size() + (-2) && b())) && (str2.equals(str) || str2.equals("*"));
        }
        if (!z10 && this.f14003a.get(i10 + 1).equals(str)) {
            return i10 == this.f14003a.size() + (-2) || (i10 == this.f14003a.size() + (-3) && b());
        } else if (z10) {
            return true;
        } else {
            int i11 = i10 + 1;
            if (i11 >= this.f14003a.size() - 1) {
                return this.f14003a.get(i11).equals(str);
            }
            return false;
        }
    }

    public f d() {
        return this.f14004b;
    }

    public int e(String str, int i10) {
        if (f(str)) {
            return 0;
        }
        if (!this.f14003a.get(i10).equals("**")) {
            return 1;
        }
        return (i10 != this.f14003a.size() - 1 && this.f14003a.get(i10 + 1).equals(str)) ? 2 : 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        if (!this.f14003a.equals(eVar.f14003a)) {
            return false;
        }
        f fVar = this.f14004b;
        f fVar2 = eVar.f14004b;
        return fVar != null ? fVar.equals(fVar2) : fVar2 == null;
    }

    public boolean g(String str, int i10) {
        if (f(str)) {
            return true;
        }
        if (i10 >= this.f14003a.size()) {
            return false;
        }
        return this.f14003a.get(i10).equals(str) || this.f14003a.get(i10).equals("**") || this.f14003a.get(i10).equals("*");
    }

    public boolean h(String str, int i10) {
        return "__container".equals(str) || i10 < this.f14003a.size() - 1 || this.f14003a.get(i10).equals("**");
    }

    public int hashCode() {
        int hashCode = this.f14003a.hashCode() * 31;
        f fVar = this.f14004b;
        return hashCode + (fVar != null ? fVar.hashCode() : 0);
    }

    public e i(f fVar) {
        e eVar = new e(this);
        eVar.f14004b = fVar;
        return eVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("KeyPath{keys=");
        sb2.append(this.f14003a);
        sb2.append(",resolved=");
        sb2.append(this.f14004b != null);
        sb2.append('}');
        return sb2.toString();
    }
}
