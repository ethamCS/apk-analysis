package u1;

import androidx.work.ListenableWorker;
import androidx.work.OverwritingInputMerger;
import u1.u;
/* loaded from: classes.dex */
public final class m extends u {

    /* loaded from: classes.dex */
    public static final class a extends u.a<a, m> {
        public a(Class<? extends ListenableWorker> cls) {
            super(cls);
            this.f22584c.f6167d = OverwritingInputMerger.class.getName();
        }

        /* renamed from: e */
        public m c() {
            if (!this.f22582a || !this.f22584c.f6173j.h()) {
                c2.p pVar = this.f22584c;
                if (pVar.f6180q && pVar.f6173j.h()) {
                    throw new IllegalArgumentException("Cannot run in foreground with an idle mode constraint");
                }
                return new m(this);
            }
            throw new IllegalArgumentException("Cannot set backoff criteria on an idle mode job");
        }

        /* renamed from: f */
        public a d() {
            return this;
        }
    }

    m(a aVar) {
        super(aVar.f22583b, aVar.f22584c, aVar.f22585d);
    }

    public static m d(Class<? extends ListenableWorker> cls) {
        return new a(cls).b();
    }
}
