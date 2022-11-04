package j$.util.stream;

import j$.util.Collection$EL;
import j$.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;
/* loaded from: classes2.dex */
final class M2 extends E2 {

    /* renamed from: d */
    private ArrayList f13504d;

    public M2(AbstractC0603q2 abstractC0603q2, Comparator comparator) {
        super(abstractC0603q2, comparator);
    }

    @Override // j$.util.function.Consumer
    public final void h(Object obj) {
        this.f13504d.add(obj);
    }

    @Override // j$.util.stream.AbstractC0583m2, j$.util.stream.AbstractC0603q2
    public final void t() {
        List.EL.sort(this.f13504d, this.f13444b);
        this.f13746a.u(this.f13504d.size());
        if (!this.f13445c) {
            ArrayList arrayList = this.f13504d;
            AbstractC0603q2 abstractC0603q2 = this.f13746a;
            Objects.requireNonNull(abstractC0603q2);
            Collection$EL.a(arrayList, new C0525b(abstractC0603q2, 3));
        } else {
            Iterator it = this.f13504d.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (this.f13746a.x()) {
                    break;
                }
                this.f13746a.h(next);
            }
        }
        this.f13746a.t();
        this.f13504d = null;
    }

    @Override // j$.util.stream.AbstractC0603q2
    public final void u(long j10) {
        if (j10 < 2147483639) {
            this.f13504d = j10 >= 0 ? new ArrayList((int) j10) : new ArrayList();
            return;
        }
        throw new IllegalArgumentException("Stream size exceeds max array size");
    }
}
