package ri;

import java.math.BigInteger;
import java.security.spec.ECField;
import java.security.spec.ECFieldF2m;
import java.security.spec.ECFieldFp;
import java.security.spec.ECParameterSpec;
import java.security.spec.ECPoint;
import java.security.spec.EllipticCurve;
import org.bouncycastle.jcajce.provider.asymmetric.util.EC5Util;
/* loaded from: classes3.dex */
public class d extends ECParameterSpec {

    /* renamed from: a */
    private String f21219a;

    public d(String str, EllipticCurve ellipticCurve, ECPoint eCPoint, BigInteger bigInteger, BigInteger bigInteger2) {
        super(ellipticCurve, eCPoint, bigInteger, bigInteger2.intValue());
        this.f21219a = str;
    }

    public d(String str, ti.e eVar, ti.i iVar, BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        super(a(eVar, bArr), EC5Util.convertPoint(iVar), bigInteger, bigInteger2.intValue());
        this.f21219a = str;
    }

    private static EllipticCurve a(ti.e eVar, byte[] bArr) {
        return new EllipticCurve(b(eVar.s()), eVar.n().t(), eVar.o().t(), bArr);
    }

    private static ECField b(aj.a aVar) {
        if (ti.c.o(aVar)) {
            return new ECFieldFp(aVar.c());
        }
        aj.e a10 = ((aj.f) aVar).a();
        int[] a11 = a10.a();
        return new ECFieldF2m(a10.b(), ak.a.S(ak.a.x(a11, 1, a11.length - 1)));
    }

    public String c() {
        return this.f21219a;
    }
}
