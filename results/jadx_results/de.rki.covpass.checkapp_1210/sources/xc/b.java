package xc;

import java.util.Collection;
/* loaded from: classes.dex */
public interface b extends xc.a, d0 {

    /* loaded from: classes.dex */
    public enum a {
        DECLARATION,
        FAKE_OVERRIDE,
        DELEGATION,
        SYNTHESIZED;

        public boolean b() {
            return this != FAKE_OVERRIDE;
        }
    }

    @Override // xc.a, xc.m, xc.h
    b a();

    @Override // xc.a
    Collection<? extends b> f();

    a h();

    b n0(m mVar, e0 e0Var, u uVar, a aVar, boolean z10);

    void t0(Collection<? extends b> collection);
}
