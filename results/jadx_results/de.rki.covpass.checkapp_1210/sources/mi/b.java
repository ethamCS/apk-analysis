package mi;

import java.math.BigInteger;
import javax.crypto.spec.DHParameterSpec;
/* loaded from: classes3.dex */
public class b extends DHParameterSpec {

    /* renamed from: a */
    private final BigInteger f16685a;

    /* renamed from: b */
    private final BigInteger f16686b;

    /* renamed from: c */
    private final int f16687c;

    /* renamed from: d */
    private zh.n f16688d;

    public b(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i10) {
        this(bigInteger, bigInteger2, bigInteger3, bigInteger4, 0, i10);
    }

    public b(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4, int i10, int i11) {
        super(bigInteger, bigInteger3, i11);
        this.f16685a = bigInteger2;
        this.f16686b = bigInteger4;
        this.f16687c = i10;
    }

    public b(zh.i iVar) {
        this(iVar.f(), iVar.g(), iVar.b(), iVar.c(), iVar.e(), iVar.d());
        this.f16688d = iVar.h();
    }

    public zh.i a() {
        return new zh.i(getP(), getG(), this.f16685a, this.f16687c, getL(), this.f16686b, this.f16688d);
    }

    public BigInteger b() {
        return this.f16685a;
    }
}
