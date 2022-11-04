package od;

import hc.t;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ub.u;
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a */
    private final q f17886a;

    /* renamed from: b */
    private final List<q> f17887b;

    public k() {
        this(null, null, 3, null);
    }

    public k(q qVar, List<q> list) {
        t.e(list, "parametersInfo");
        this.f17886a = qVar;
        this.f17887b = list;
    }

    public /* synthetic */ k(q qVar, List list, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : qVar, (i10 & 2) != 0 ? u.h() : list);
    }

    public final List<q> a() {
        return this.f17887b;
    }

    public final q b() {
        return this.f17886a;
    }
}
