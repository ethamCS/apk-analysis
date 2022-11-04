package qc;

import hc.k0;
import hc.p;
import hc.t;
import ke.w;
import kotlin.Metadata;
import oc.f;
import oc.g;
import rc.j0;
import rc.k;
import rd.i;
import tb.r;
import vd.e;
import xc.z0;
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0003\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¨\u0006\u0004"}, d2 = {"R", "Ltb/g;", "Loc/g;", "a", "kotlin-reflection"}, k = 2, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class d {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    /* loaded from: classes.dex */
    public /* synthetic */ class a extends p implements gc.p<w, i, z0> {
        public static final a Y3 = new a();

        a() {
            super(2);
        }

        @Override // hc.h
        public final f e0() {
            return k0.b(w.class);
        }

        @Override // hc.h
        public final String g0() {
            return "loadFunction(Lorg/jetbrains/kotlin/metadata/ProtoBuf$Function;)Lorg/jetbrains/kotlin/descriptors/SimpleFunctionDescriptor;";
        }

        @Override // hc.h, oc.c
        public final String getName() {
            return "loadFunction";
        }

        /* renamed from: i0 */
        public final z0 u(w wVar, i iVar) {
            t.e(wVar, "p0");
            t.e(iVar, "p1");
            return wVar.j(iVar);
        }
    }

    public static final <R> g<R> a(tb.g<? extends R> gVar) {
        t.e(gVar, "<this>");
        Metadata metadata = (Metadata) gVar.getClass().getAnnotation(Metadata.class);
        if (metadata == null) {
            return null;
        }
        String[] d12 = metadata.d1();
        boolean z10 = true;
        if (d12.length == 0) {
            d12 = null;
        }
        if (d12 == null) {
            return null;
        }
        r<vd.f, i> j10 = vd.i.j(d12, metadata.d2());
        vd.f b10 = j10.b();
        i c10 = j10.c();
        int[] mv = metadata.mv();
        if ((metadata.xi() & 8) == 0) {
            z10 = false;
        }
        e eVar = new e(mv, z10);
        Class<?> cls = gVar.getClass();
        rd.t O0 = c10.O0();
        t.d(O0, "proto.typeTable");
        return new k(rc.b.f20586q, (z0) j0.h(cls, c10, b10, new td.g(O0), eVar, a.Y3));
    }
}
