package ke;

import java.util.List;
import xc.h0;
/* loaded from: classes3.dex */
public final class n extends ce.b {

    /* renamed from: c */
    private final oe.e0 f15091c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends hc.v implements gc.l<h0, oe.e0> {

        /* renamed from: c */
        final /* synthetic */ oe.e0 f15092c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(oe.e0 e0Var) {
            super(1);
            this.f15092c = e0Var;
        }

        /* renamed from: b */
        public final oe.e0 invoke(h0 h0Var) {
            hc.t.e(h0Var, "it");
            return this.f15092c;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(List<? extends ce.g<?>> list, oe.e0 e0Var) {
        super(list, new a(e0Var));
        hc.t.e(list, "value");
        hc.t.e(e0Var, "type");
        this.f15091c = e0Var;
    }

    public final oe.e0 c() {
        return this.f15091c;
    }
}
