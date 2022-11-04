package zh;
/* loaded from: classes3.dex */
public class z extends c0 {

    /* renamed from: n */
    private final gg.v f27038n;

    /* renamed from: o */
    private final gg.v f27039o;

    /* renamed from: p */
    private final gg.v f27040p;

    public z(y yVar, gg.v vVar, gg.v vVar2, gg.v vVar3) {
        super(vVar, yVar);
        if (!(yVar instanceof c0) || vVar.s(((c0) yVar).j())) {
            this.f27038n = vVar;
            this.f27039o = vVar2;
            this.f27040p = vVar3;
            return;
        }
        throw new IllegalArgumentException("named parameters do not match publicKeyParamSet value");
    }

    public gg.v k() {
        return this.f27039o;
    }

    public gg.v l() {
        return this.f27040p;
    }

    public gg.v m() {
        return this.f27038n;
    }
}
