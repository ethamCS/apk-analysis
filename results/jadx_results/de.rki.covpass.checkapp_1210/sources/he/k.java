package he;

import java.util.Collection;
/* loaded from: classes3.dex */
public interface k {

    /* loaded from: classes3.dex */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Collection a(k kVar, d dVar, gc.l lVar, int i10, Object obj) {
            if (obj == null) {
                if ((i10 & 1) != 0) {
                    dVar = d.f11845n;
                }
                gc.l<wd.f, Boolean> lVar2 = lVar;
                if ((i10 & 2) != 0) {
                    lVar2 = h.Companion.a();
                }
                return kVar.e(dVar, lVar2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getContributedDescriptors");
        }
    }

    Collection<xc.m> e(d dVar, gc.l<? super wd.f, Boolean> lVar);

    xc.h f(wd.f fVar, fd.b bVar);
}
