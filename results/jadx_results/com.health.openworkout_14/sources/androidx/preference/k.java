package androidx.preference;

import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
@Deprecated
/* loaded from: classes.dex */
public class k extends androidx.recyclerview.widget.r {

    /* renamed from: f */
    final RecyclerView f1487f;

    /* renamed from: g */
    final b.g.l.a f1488g = super.n();

    /* renamed from: h */
    final b.g.l.a f1489h = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a extends b.g.l.a {
        a() {
            k.this = r1;
        }

        @Override // b.g.l.a
        public void g(View view, b.g.l.c0.c cVar) {
            Preference I;
            k.this.f1488g.g(view, cVar);
            int g0 = k.this.f1487f.g0(view);
            RecyclerView.g adapter = k.this.f1487f.getAdapter();
            if ((adapter instanceof h) && (I = ((h) adapter).I(g0)) != null) {
                I.W(cVar);
            }
        }

        @Override // b.g.l.a
        public boolean j(View view, int i, Bundle bundle) {
            return k.this.f1488g.j(view, i, bundle);
        }
    }

    public k(RecyclerView recyclerView) {
        super(recyclerView);
        this.f1487f = recyclerView;
    }

    @Override // androidx.recyclerview.widget.r
    public b.g.l.a n() {
        return this.f1489h;
    }
}
