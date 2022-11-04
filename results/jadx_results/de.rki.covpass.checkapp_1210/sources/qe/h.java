package qe;

import hc.p0;
import hc.t;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import oe.a1;
import oe.e1;
import oe.g1;
import oe.m0;
import ub.u;
/* loaded from: classes3.dex */
public final class h extends m0 {
    private final boolean U3;
    private final String[] V3;
    private final String W3;

    /* renamed from: d */
    private final e1 f19832d;

    /* renamed from: q */
    private final he.h f19833q;

    /* renamed from: x */
    private final j f19834x;

    /* renamed from: y */
    private final List<g1> f19835y;

    /* JADX WARN: Multi-variable type inference failed */
    public h(e1 e1Var, he.h hVar, j jVar, List<? extends g1> list, boolean z10, String... strArr) {
        t.e(e1Var, "constructor");
        t.e(hVar, "memberScope");
        t.e(jVar, "kind");
        t.e(list, "arguments");
        t.e(strArr, "formatParams");
        this.f19832d = e1Var;
        this.f19833q = hVar;
        this.f19834x = jVar;
        this.f19835y = list;
        this.U3 = z10;
        this.V3 = strArr;
        p0 p0Var = p0.f11777a;
        String g10 = jVar.g();
        Object[] copyOf = Arrays.copyOf(strArr, strArr.length);
        String format = String.format(g10, Arrays.copyOf(copyOf, copyOf.length));
        t.d(format, "format(format, *args)");
        this.W3 = format;
    }

    public /* synthetic */ h(e1 e1Var, he.h hVar, j jVar, List list, boolean z10, String[] strArr, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(e1Var, hVar, jVar, (i10 & 8) != 0 ? u.h() : list, (i10 & 16) != 0 ? false : z10, strArr);
    }

    @Override // oe.e0
    public List<g1> U0() {
        return this.f19835y;
    }

    @Override // oe.e0
    public a1 V0() {
        return a1.Companion.h();
    }

    @Override // oe.e0
    public e1 W0() {
        return this.f19832d;
    }

    @Override // oe.e0
    public boolean X0() {
        return this.U3;
    }

    @Override // oe.m0
    /* renamed from: d1 */
    public m0 a1(boolean z10) {
        e1 W0 = W0();
        he.h z11 = z();
        j jVar = this.f19834x;
        List<g1> U0 = U0();
        String[] strArr = this.V3;
        return new h(W0, z11, jVar, U0, z10, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    @Override // oe.m0
    /* renamed from: e1 */
    public m0 c1(a1 a1Var) {
        t.e(a1Var, "newAttributes");
        return this;
    }

    public final String f1() {
        return this.W3;
    }

    public final j g1() {
        return this.f19834x;
    }

    /* renamed from: h1 */
    public h b1(pe.g gVar) {
        t.e(gVar, "kotlinTypeRefiner");
        return this;
    }

    @Override // oe.e0
    public he.h z() {
        return this.f19833q;
    }
}
