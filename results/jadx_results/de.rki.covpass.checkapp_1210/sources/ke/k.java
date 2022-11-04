package ke;

import java.util.List;
import oe.z0;
import xc.h0;
import xc.k0;
import xc.l0;
import xc.m0;
/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a */
    private final ne.n f15060a;

    /* renamed from: b */
    private final h0 f15061b;

    /* renamed from: c */
    private final l f15062c;

    /* renamed from: d */
    private final h f15063d;

    /* renamed from: e */
    private final c<yc.c, ce.g<?>> f15064e;

    /* renamed from: f */
    private final m0 f15065f;

    /* renamed from: g */
    private final v f15066g;

    /* renamed from: h */
    private final r f15067h;

    /* renamed from: i */
    private final fd.c f15068i;

    /* renamed from: j */
    private final s f15069j;

    /* renamed from: k */
    private final Iterable<zc.b> f15070k;

    /* renamed from: l */
    private final k0 f15071l;

    /* renamed from: m */
    private final j f15072m;

    /* renamed from: n */
    private final zc.a f15073n;

    /* renamed from: o */
    private final zc.c f15074o;

    /* renamed from: p */
    private final yd.g f15075p;

    /* renamed from: q */
    private final pe.l f15076q;

    /* renamed from: r */
    private final ge.a f15077r;

    /* renamed from: s */
    private final zc.e f15078s;

    /* renamed from: t */
    private final List<z0> f15079t;

    /* renamed from: u */
    private final i f15080u;

    /* JADX WARN: Multi-variable type inference failed */
    public k(ne.n nVar, h0 h0Var, l lVar, h hVar, c<? extends yc.c, ? extends ce.g<?>> cVar, m0 m0Var, v vVar, r rVar, fd.c cVar2, s sVar, Iterable<? extends zc.b> iterable, k0 k0Var, j jVar, zc.a aVar, zc.c cVar3, yd.g gVar, pe.l lVar2, ge.a aVar2, zc.e eVar, List<? extends z0> list) {
        hc.t.e(nVar, "storageManager");
        hc.t.e(h0Var, "moduleDescriptor");
        hc.t.e(lVar, "configuration");
        hc.t.e(hVar, "classDataFinder");
        hc.t.e(cVar, "annotationAndConstantLoader");
        hc.t.e(m0Var, "packageFragmentProvider");
        hc.t.e(vVar, "localClassifierTypeSettings");
        hc.t.e(rVar, "errorReporter");
        hc.t.e(cVar2, "lookupTracker");
        hc.t.e(sVar, "flexibleTypeDeserializer");
        hc.t.e(iterable, "fictitiousClassDescriptorFactories");
        hc.t.e(k0Var, "notFoundClasses");
        hc.t.e(jVar, "contractDeserializer");
        hc.t.e(aVar, "additionalClassPartsProvider");
        hc.t.e(cVar3, "platformDependentDeclarationFilter");
        hc.t.e(gVar, "extensionRegistryLite");
        hc.t.e(lVar2, "kotlinTypeChecker");
        hc.t.e(aVar2, "samConversionResolver");
        hc.t.e(eVar, "platformDependentTypeTransformer");
        hc.t.e(list, "typeAttributeTranslators");
        this.f15060a = nVar;
        this.f15061b = h0Var;
        this.f15062c = lVar;
        this.f15063d = hVar;
        this.f15064e = cVar;
        this.f15065f = m0Var;
        this.f15066g = vVar;
        this.f15067h = rVar;
        this.f15068i = cVar2;
        this.f15069j = sVar;
        this.f15070k = iterable;
        this.f15071l = k0Var;
        this.f15072m = jVar;
        this.f15073n = aVar;
        this.f15074o = cVar3;
        this.f15075p = gVar;
        this.f15076q = lVar2;
        this.f15077r = aVar2;
        this.f15078s = eVar;
        this.f15079t = list;
        this.f15080u = new i(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ k(ne.n r24, xc.h0 r25, ke.l r26, ke.h r27, ke.c r28, xc.m0 r29, ke.v r30, ke.r r31, fd.c r32, ke.s r33, java.lang.Iterable r34, xc.k0 r35, ke.j r36, zc.a r37, zc.c r38, yd.g r39, pe.l r40, ge.a r41, zc.e r42, java.util.List r43, int r44, kotlin.jvm.internal.DefaultConstructorMarker r45) {
        /*
            r23 = this;
            r0 = r44
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto Lb
            zc.a$a r1 = zc.a.C0474a.f26602a
            r16 = r1
            goto Ld
        Lb:
            r16 = r37
        Ld:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L16
            zc.c$a r1 = zc.c.a.f26603a
            r17 = r1
            goto L18
        L16:
            r17 = r38
        L18:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L26
            pe.l$a r1 = pe.l.Companion
            pe.m r1 = r1.a()
            r19 = r1
            goto L28
        L26:
            r19 = r40
        L28:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L32
            zc.e$a r1 = zc.e.a.f26606a
            r21 = r1
            goto L34
        L32:
            r21 = r42
        L34:
            r1 = 524288(0x80000, float:7.34684E-40)
            r0 = r0 & r1
            if (r0 == 0) goto L42
            oe.o r0 = oe.o.f18029a
            java.util.List r0 = ub.s.d(r0)
            r22 = r0
            goto L44
        L42:
            r22 = r43
        L44:
            r2 = r23
            r3 = r24
            r4 = r25
            r5 = r26
            r6 = r27
            r7 = r28
            r8 = r29
            r9 = r30
            r10 = r31
            r11 = r32
            r12 = r33
            r13 = r34
            r14 = r35
            r15 = r36
            r18 = r39
            r20 = r41
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ke.k.<init>(ne.n, xc.h0, ke.l, ke.h, ke.c, xc.m0, ke.v, ke.r, fd.c, ke.s, java.lang.Iterable, xc.k0, ke.j, zc.a, zc.c, yd.g, pe.l, ge.a, zc.e, java.util.List, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final m a(l0 l0Var, td.c cVar, td.g gVar, td.h hVar, td.a aVar, me.f fVar) {
        List h10;
        hc.t.e(l0Var, "descriptor");
        hc.t.e(cVar, "nameResolver");
        hc.t.e(gVar, "typeTable");
        hc.t.e(hVar, "versionRequirementTable");
        hc.t.e(aVar, "metadataVersion");
        h10 = ub.u.h();
        return new m(this, cVar, l0Var, gVar, hVar, aVar, fVar, null, h10);
    }

    public final xc.e b(wd.b bVar) {
        hc.t.e(bVar, "classId");
        return i.e(this.f15080u, bVar, null, 2, null);
    }

    public final zc.a c() {
        return this.f15073n;
    }

    public final c<yc.c, ce.g<?>> d() {
        return this.f15064e;
    }

    public final h e() {
        return this.f15063d;
    }

    public final i f() {
        return this.f15080u;
    }

    public final l g() {
        return this.f15062c;
    }

    public final j h() {
        return this.f15072m;
    }

    public final r i() {
        return this.f15067h;
    }

    public final yd.g j() {
        return this.f15075p;
    }

    public final Iterable<zc.b> k() {
        return this.f15070k;
    }

    public final s l() {
        return this.f15069j;
    }

    public final pe.l m() {
        return this.f15076q;
    }

    public final v n() {
        return this.f15066g;
    }

    public final fd.c o() {
        return this.f15068i;
    }

    public final h0 p() {
        return this.f15061b;
    }

    public final k0 q() {
        return this.f15071l;
    }

    public final m0 r() {
        return this.f15065f;
    }

    public final zc.c s() {
        return this.f15074o;
    }

    public final zc.e t() {
        return this.f15078s;
    }

    public final ne.n u() {
        return this.f15060a;
    }

    public final List<z0> v() {
        return this.f15079t;
    }
}
