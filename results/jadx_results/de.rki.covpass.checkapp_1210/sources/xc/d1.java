package xc;

import java.util.Collection;
/* loaded from: classes.dex */
public interface d1 {

    /* loaded from: classes.dex */
    public static final class a implements d1 {

        /* renamed from: a */
        public static final a f25530a = new a();

        private a() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // xc.d1
        public Collection<oe.e0> a(oe.e1 e1Var, Collection<? extends oe.e0> collection, gc.l<? super oe.e1, ? extends Iterable<? extends oe.e0>> lVar, gc.l<? super oe.e0, tb.e0> lVar2) {
            hc.t.e(e1Var, "currentTypeConstructor");
            hc.t.e(collection, "superTypes");
            hc.t.e(lVar, "neighbors");
            hc.t.e(lVar2, "reportLoop");
            return collection;
        }
    }

    Collection<oe.e0> a(oe.e1 e1Var, Collection<? extends oe.e0> collection, gc.l<? super oe.e1, ? extends Iterable<? extends oe.e0>> lVar, gc.l<? super oe.e0, tb.e0> lVar2);
}
