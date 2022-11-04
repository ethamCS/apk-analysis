package qe;

import hc.t;
import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import xc.m;
import xc.u0;
import xc.z0;
/* loaded from: classes3.dex */
public final class l extends f {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(g gVar, String... strArr) {
        super(gVar, (String[]) Arrays.copyOf(strArr, strArr.length));
        t.e(gVar, "kind");
        t.e(strArr, "formatParams");
    }

    @Override // qe.f, he.h
    public Set<wd.f> c() {
        throw new IllegalStateException();
    }

    @Override // qe.f, he.h
    public Set<wd.f> d() {
        throw new IllegalStateException();
    }

    @Override // qe.f, he.k
    public Collection<m> e(he.d dVar, gc.l<? super wd.f, Boolean> lVar) {
        t.e(dVar, "kindFilter");
        t.e(lVar, "nameFilter");
        throw new IllegalStateException(j());
    }

    @Override // qe.f, he.k
    public xc.h f(wd.f fVar, fd.b bVar) {
        t.e(fVar, "name");
        t.e(bVar, "location");
        throw new IllegalStateException(j() + ", required name: " + fVar);
    }

    @Override // qe.f, he.h
    public Set<wd.f> g() {
        throw new IllegalStateException();
    }

    @Override // qe.f
    /* renamed from: h */
    public Set<z0> b(wd.f fVar, fd.b bVar) {
        t.e(fVar, "name");
        t.e(bVar, "location");
        throw new IllegalStateException(j() + ", required name: " + fVar);
    }

    @Override // qe.f
    /* renamed from: i */
    public Set<u0> a(wd.f fVar, fd.b bVar) {
        t.e(fVar, "name");
        t.e(bVar, "location");
        throw new IllegalStateException(j() + ", required name: " + fVar);
    }

    @Override // qe.f
    public String toString() {
        return "ThrowingScope{" + j() + '}';
    }
}
