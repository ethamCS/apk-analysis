package ti;

import java.math.BigInteger;
/* loaded from: classes3.dex */
public abstract class b implements h {
    @Override // ti.h
    public i a(i iVar, BigInteger bigInteger) {
        int signum = bigInteger.signum();
        if (signum == 0 || iVar.u()) {
            return iVar.i().u();
        }
        i c10 = c(iVar, bigInteger.abs());
        if (signum <= 0) {
            c10 = c10.z();
        }
        return b(c10);
    }

    protected i b(i iVar) {
        return c.b(iVar);
    }

    protected abstract i c(i iVar, BigInteger bigInteger);
}
