package a.m;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class s {

    /* renamed from: b */
    public View f391b;

    /* renamed from: a */
    public final Map<String, Object> f390a = new HashMap();

    /* renamed from: c */
    final ArrayList<m> f392c = new ArrayList<>();

    @Deprecated
    public s() {
    }

    public s(View view) {
        this.f391b = view;
    }

    public boolean equals(Object obj) {
        if (obj instanceof s) {
            s sVar = (s) obj;
            return this.f391b == sVar.f391b && this.f390a.equals(sVar.f390a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f391b.hashCode() * 31) + this.f390a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f391b + "\n") + "    values:";
        for (String str2 : this.f390a.keySet()) {
            str = str + "    " + str2 + ": " + this.f390a.get(str2) + "\n";
        }
        return str;
    }
}
