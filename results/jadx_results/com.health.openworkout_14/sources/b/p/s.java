package b.p;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class s {

    /* renamed from: b */
    public View f2781b;

    /* renamed from: a */
    public final Map<String, Object> f2780a = new HashMap();

    /* renamed from: c */
    final ArrayList<m> f2782c = new ArrayList<>();

    @Deprecated
    public s() {
    }

    public s(View view) {
        this.f2781b = view;
    }

    public boolean equals(Object obj) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            return this.f2781b == sVar.f2781b && this.f2780a.equals(sVar.f2780a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f2781b.hashCode() * 31) + this.f2780a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f2781b + "\n") + "    values:";
        for (String str2 : this.f2780a.keySet()) {
            str = str + "    " + str2 + ": " + this.f2780a.get(str2) + "\n";
        }
        return str;
    }
}