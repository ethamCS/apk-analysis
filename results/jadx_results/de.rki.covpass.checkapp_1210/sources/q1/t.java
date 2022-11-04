package q1;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class t {

    /* renamed from: b */
    public View f19469b;

    /* renamed from: a */
    public final Map<String, Object> f19468a = new HashMap();

    /* renamed from: c */
    final ArrayList<n> f19470c = new ArrayList<>();

    @Deprecated
    public t() {
    }

    public t(View view) {
        this.f19469b = view;
    }

    public boolean equals(Object obj) {
        if (obj instanceof t) {
            t tVar = (t) obj;
            return this.f19469b == tVar.f19469b && this.f19468a.equals(tVar.f19468a);
        }
        return false;
    }

    public int hashCode() {
        return (this.f19469b.hashCode() * 31) + this.f19468a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f19469b + "\n") + "    values:";
        for (String str2 : this.f19468a.keySet()) {
            str = str + "    " + str2 + ": " + this.f19468a.get(str2) + "\n";
        }
        return str;
    }
}
