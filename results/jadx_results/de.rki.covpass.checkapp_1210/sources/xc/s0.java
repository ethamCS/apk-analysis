package xc;

import java.util.List;
/* loaded from: classes.dex */
public final class s0 {

    /* renamed from: a */
    private final i f25574a;

    /* renamed from: b */
    private final List<oe.g1> f25575b;

    /* renamed from: c */
    private final s0 f25576c;

    /* JADX WARN: Multi-variable type inference failed */
    public s0(i iVar, List<? extends oe.g1> list, s0 s0Var) {
        hc.t.e(iVar, "classifierDescriptor");
        hc.t.e(list, "arguments");
        this.f25574a = iVar;
        this.f25575b = list;
        this.f25576c = s0Var;
    }

    public final List<oe.g1> a() {
        return this.f25575b;
    }

    public final i b() {
        return this.f25574a;
    }

    public final s0 c() {
        return this.f25576c;
    }
}
