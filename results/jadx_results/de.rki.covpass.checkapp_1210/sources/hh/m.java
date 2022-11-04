package hh;

import java.math.BigInteger;
import java.util.Hashtable;
/* loaded from: classes3.dex */
public class m extends gg.t {

    /* renamed from: d */
    private static final String[] f11992d = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};

    /* renamed from: q */
    private static final Hashtable f11993q = new Hashtable();

    /* renamed from: c */
    private gg.i f11994c;

    private m(int i10) {
        if (i10 >= 0) {
            this.f11994c = new gg.i(i10);
            return;
        }
        throw new IllegalArgumentException("Invalid CRL reason : not in (0..MAX)");
    }

    public static m l(Object obj) {
        if (obj instanceof m) {
            return (m) obj;
        }
        if (obj == null) {
            return null;
        }
        return n(gg.i.E(obj).G());
    }

    public static m n(int i10) {
        Integer e10 = ak.g.e(i10);
        Hashtable hashtable = f11993q;
        if (!hashtable.containsKey(e10)) {
            hashtable.put(e10, new m(i10));
        }
        return (m) hashtable.get(e10);
    }

    @Override // gg.t, gg.g
    public gg.a0 b() {
        return this.f11994c;
    }

    public BigInteger m() {
        return this.f11994c.F();
    }

    public String toString() {
        int intValue = m().intValue();
        String str = (intValue < 0 || intValue > 10) ? "invalid" : f11992d[intValue];
        return "CRLReason: " + str;
    }
}
