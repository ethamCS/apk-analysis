package ke;

import java.util.ArrayList;
import java.util.Collection;
import xc.a1;
import xc.h0;
/* loaded from: classes3.dex */
public abstract class q extends p {
    private final td.a W3;
    private final me.f X3;
    private final td.d Y3;
    private final y Z3;

    /* renamed from: a4 */
    private rd.m f15094a4;

    /* renamed from: b4 */
    private he.h f15095b4;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a extends hc.v implements gc.l<wd.b, a1> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a() {
            super(1);
            q.this = r1;
        }

        /* renamed from: b */
        public final a1 invoke(wd.b bVar) {
            hc.t.e(bVar, "it");
            me.f fVar = q.this.X3;
            if (fVar != null) {
                return fVar;
            }
            a1 a1Var = a1.f25519a;
            hc.t.d(a1Var, "NO_SOURCE");
            return a1Var;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class b extends hc.v implements gc.a<Collection<? extends wd.f>> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b() {
            super(0);
            q.this = r1;
        }

        /* renamed from: b */
        public final Collection<wd.f> invoke() {
            int s10;
            Collection<wd.b> b10 = q.this.M0().b();
            ArrayList<wd.b> arrayList = new ArrayList();
            for (Object obj : b10) {
                wd.b bVar = (wd.b) obj;
                if (!bVar.l() && !i.Companion.a().contains(bVar)) {
                    arrayList.add(obj);
                }
            }
            s10 = ub.v.s(arrayList, 10);
            ArrayList arrayList2 = new ArrayList(s10);
            for (wd.b bVar2 : arrayList) {
                arrayList2.add(bVar2.j());
            }
            return arrayList2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(wd.c cVar, ne.n nVar, h0 h0Var, rd.m mVar, td.a aVar, me.f fVar) {
        super(cVar, nVar, h0Var);
        hc.t.e(cVar, "fqName");
        hc.t.e(nVar, "storageManager");
        hc.t.e(h0Var, "module");
        hc.t.e(mVar, "proto");
        hc.t.e(aVar, "metadataVersion");
        this.W3 = aVar;
        this.X3 = fVar;
        rd.p q02 = mVar.q0();
        hc.t.d(q02, "proto.strings");
        rd.o p02 = mVar.p0();
        hc.t.d(p02, "proto.qualifiedNames");
        td.d dVar = new td.d(q02, p02);
        this.Y3 = dVar;
        this.Z3 = new y(mVar, dVar, aVar, new a());
        this.f15094a4 = mVar;
    }

    @Override // ke.p
    public void U0(k kVar) {
        hc.t.e(kVar, "components");
        rd.m mVar = this.f15094a4;
        if (mVar != null) {
            this.f15094a4 = null;
            rd.l o02 = mVar.o0();
            hc.t.d(o02, "proto.`package`");
            td.d dVar = this.Y3;
            td.a aVar = this.W3;
            me.f fVar = this.X3;
            this.f15095b4 = new me.i(this, o02, dVar, aVar, fVar, kVar, "scope of " + this, new b());
            return;
        }
        throw new IllegalStateException("Repeated call to DeserializedPackageFragmentImpl::initialize".toString());
    }

    /* renamed from: W0 */
    public y M0() {
        return this.Z3;
    }

    @Override // xc.l0
    public he.h z() {
        he.h hVar = this.f15095b4;
        if (hVar == null) {
            hc.t.s("_memberScope");
            return null;
        }
        return hVar;
    }
}
