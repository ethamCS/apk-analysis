package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.u;
@u.b("navigation")
/* loaded from: classes.dex */
public class o extends u<n> {

    /* renamed from: a */
    private final v f1363a;

    public o(v vVar) {
        this.f1363a = vVar;
    }

    @Override // androidx.navigation.u
    public boolean e() {
        return true;
    }

    /* renamed from: f */
    public n a() {
        return new n(this);
    }

    /* renamed from: g */
    public l b(n nVar, Bundle bundle, r rVar, u.a aVar) {
        int x = nVar.x();
        if (x == 0) {
            throw new IllegalStateException("no start destination defined via app:startDestination for " + nVar.g());
        }
        l v = nVar.v(x, false);
        if (v != null) {
            return this.f1363a.d(v.k()).b(v, v.c(bundle), rVar, aVar);
        }
        String w = nVar.w();
        throw new IllegalArgumentException("navigation destination " + w + " is not a direct child of this NavGraph");
    }
}
