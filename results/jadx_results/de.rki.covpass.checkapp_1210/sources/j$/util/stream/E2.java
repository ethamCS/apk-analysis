package j$.util.stream;

import java.util.Comparator;
/* loaded from: classes2.dex */
abstract class E2 extends AbstractC0583m2 {

    /* renamed from: b */
    protected final Comparator f13444b;

    /* renamed from: c */
    protected boolean f13445c;

    public E2(AbstractC0603q2 abstractC0603q2, Comparator comparator) {
        super(abstractC0603q2);
        this.f13444b = comparator;
    }

    @Override // j$.util.stream.AbstractC0583m2, j$.util.stream.AbstractC0603q2
    public final boolean x() {
        this.f13445c = true;
        return false;
    }
}
