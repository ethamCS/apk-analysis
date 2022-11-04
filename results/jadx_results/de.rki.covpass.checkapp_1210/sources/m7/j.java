package m7;

import androidx.fragment.app.Fragment;
import kotlin.Metadata;
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lm7/j;", "Lm7/i;", "Landroidx/fragment/app/Fragment;", "b", "Loc/d;", "cls", "<init>", "(Loc/d;)V", "navigation_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public abstract class j implements i {

    /* renamed from: c */
    private final oc.d<? extends Fragment> f16404c;

    public j(oc.d<? extends Fragment> dVar) {
        hc.t.e(dVar, "cls");
        this.f16404c = dVar;
    }

    @Override // m7.i
    public Fragment b() {
        Fragment c10 = k.c((Fragment) fc.a.b(this.f16404c).newInstance(), this);
        hc.t.d(c10, "cls.java.newInstance().withArgs(this)");
        return c10;
    }
}
