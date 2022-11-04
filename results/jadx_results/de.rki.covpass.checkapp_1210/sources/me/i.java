package me;

import hc.t;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import ub.c0;
import ub.y0;
import ub.z;
import xc.l0;
/* loaded from: classes3.dex */
public class i extends h {

    /* renamed from: f */
    private final l0 f16564f;

    /* renamed from: g */
    private final String f16565g;

    /* renamed from: h */
    private final wd.c f16566h;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i(xc.l0 r17, rd.l r18, td.c r19, td.a r20, me.f r21, ke.k r22, java.lang.String r23, gc.a<? extends java.util.Collection<wd.f>> r24) {
        /*
            r16 = this;
            r6 = r16
            r14 = r17
            r15 = r23
            java.lang.String r0 = "packageDescriptor"
            hc.t.e(r14, r0)
            java.lang.String r0 = "proto"
            r1 = r18
            hc.t.e(r1, r0)
            java.lang.String r0 = "nameResolver"
            r2 = r19
            hc.t.e(r2, r0)
            java.lang.String r0 = "metadataVersion"
            r3 = r20
            hc.t.e(r3, r0)
            java.lang.String r0 = "components"
            r4 = r22
            hc.t.e(r4, r0)
            java.lang.String r0 = "debugName"
            hc.t.e(r15, r0)
            java.lang.String r0 = "classNames"
            r5 = r24
            hc.t.e(r5, r0)
            td.g r10 = new td.g
            rd.t r0 = r18.x0()
            java.lang.String r7 = "proto.typeTable"
            hc.t.d(r0, r7)
            r10.<init>(r0)
            td.h$a r0 = td.h.Companion
            rd.w r7 = r18.y0()
            java.lang.String r8 = "proto.versionRequirementTable"
            hc.t.d(r7, r8)
            td.h r11 = r0.a(r7)
            r7 = r22
            r8 = r17
            r9 = r19
            r12 = r20
            r13 = r21
            ke.m r2 = r7.a(r8, r9, r10, r11, r12, r13)
            java.util.List r3 = r18.q0()
            java.lang.String r0 = "proto.functionList"
            hc.t.d(r3, r0)
            java.util.List r4 = r18.t0()
            java.lang.String r0 = "proto.propertyList"
            hc.t.d(r4, r0)
            java.util.List r7 = r18.w0()
            java.lang.String r0 = "proto.typeAliasList"
            hc.t.d(r7, r0)
            r0 = r16
            r1 = r2
            r2 = r3
            r3 = r4
            r4 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r6.f16564f = r14
            r6.f16565g = r15
            wd.c r0 = r17.d()
            r6.f16566h = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: me.i.<init>(xc.l0, rd.l, td.c, td.a, me.f, ke.k, java.lang.String, gc.a):void");
    }

    @Override // me.h, he.i, he.k
    public xc.h f(wd.f fVar, fd.b bVar) {
        t.e(fVar, "name");
        t.e(bVar, "location");
        z(fVar, bVar);
        return super.f(fVar, bVar);
    }

    @Override // me.h
    protected void i(Collection<xc.m> collection, gc.l<? super wd.f, Boolean> lVar) {
        t.e(collection, "result");
        t.e(lVar, "nameFilter");
    }

    @Override // me.h
    protected wd.b m(wd.f fVar) {
        t.e(fVar, "name");
        return new wd.b(this.f16566h, fVar);
    }

    @Override // me.h
    protected Set<wd.f> s() {
        Set<wd.f> b10;
        b10 = y0.b();
        return b10;
    }

    @Override // me.h
    protected Set<wd.f> t() {
        Set<wd.f> b10;
        b10 = y0.b();
        return b10;
    }

    public String toString() {
        return this.f16565g;
    }

    @Override // me.h
    protected Set<wd.f> u() {
        Set<wd.f> b10;
        b10 = y0.b();
        return b10;
    }

    @Override // me.h
    public boolean w(wd.f fVar) {
        boolean z10;
        t.e(fVar, "name");
        if (!super.w(fVar)) {
            Iterable<zc.b> k10 = p().c().k();
            if (!(k10 instanceof Collection) || !((Collection) k10).isEmpty()) {
                for (zc.b bVar : k10) {
                    if (bVar.c(this.f16566h, fVar)) {
                        z10 = true;
                        break;
                    }
                }
            }
            z10 = false;
            return z10;
        }
        return true;
    }

    /* renamed from: y */
    public List<xc.m> e(he.d dVar, gc.l<? super wd.f, Boolean> lVar) {
        List<xc.m> o02;
        t.e(dVar, "kindFilter");
        t.e(lVar, "nameFilter");
        Collection<xc.m> j10 = j(dVar, lVar, fd.d.WHEN_GET_ALL_DESCRIPTORS);
        Iterable<zc.b> k10 = p().c().k();
        ArrayList arrayList = new ArrayList();
        for (zc.b bVar : k10) {
            z.x(arrayList, bVar.b(this.f16566h));
        }
        o02 = c0.o0(j10, arrayList);
        return o02;
    }

    public void z(wd.f fVar, fd.b bVar) {
        t.e(fVar, "name");
        t.e(bVar, "location");
        ed.a.b(p().c().o(), bVar, this.f16564f, fVar);
    }
}
