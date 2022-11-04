package vh;

import org.bouncycastle.crypto.g0;
import zh.b1;
import zh.f1;
import zh.g1;
import zh.h1;
/* loaded from: classes3.dex */
public class m extends g0 {

    /* renamed from: f */
    private static final byte[] f24234f = {105, 0, 114, 34, 100, -55, 4, 35, -115, 58, -37, -106, 70, -23, 42, -60, 24, -2, -84, -108, 0, -19, 7, 18, -64, -122, -36, -62, -17, 76, -87, 43};

    /* renamed from: b */
    private final e f24235b;

    /* renamed from: c */
    private b1 f24236c;

    /* renamed from: d */
    private long f24237d = 0;

    /* renamed from: e */
    private boolean f24238e;

    public m(org.bouncycastle.crypto.e eVar) {
        super(eVar);
        this.f24235b = new e(eVar, eVar.b() * 8);
    }

    @Override // org.bouncycastle.crypto.e
    public int a(byte[] bArr, int i10, byte[] bArr2, int i11) {
        processBytes(bArr, i10, this.f24235b.b(), bArr2, i11);
        return this.f24235b.b();
    }

    @Override // org.bouncycastle.crypto.e
    public int b() {
        return this.f24235b.b();
    }

    @Override // org.bouncycastle.crypto.g0
    protected byte c(byte b10) {
        long j10 = this.f24237d;
        if (j10 > 0 && j10 % 1024 == 0) {
            org.bouncycastle.crypto.e d10 = this.f24235b.d();
            d10.init(false, this.f24236c);
            byte[] bArr = new byte[32];
            byte[] bArr2 = f24234f;
            d10.a(bArr2, 0, bArr, 0);
            d10.a(bArr2, 8, bArr, 8);
            d10.a(bArr2, 16, bArr, 16);
            d10.a(bArr2, 24, bArr, 24);
            b1 b1Var = new b1(bArr);
            this.f24236c = b1Var;
            d10.init(true, b1Var);
            byte[] g10 = this.f24235b.g();
            d10.a(g10, 0, g10, 0);
            this.f24235b.init(this.f24238e, new f1(this.f24236c, g10));
        }
        this.f24237d++;
        return this.f24235b.c(b10);
    }

    @Override // org.bouncycastle.crypto.e
    public String getAlgorithmName() {
        String algorithmName = this.f24235b.getAlgorithmName();
        return algorithmName.substring(0, algorithmName.indexOf(47)) + "/G" + algorithmName.substring(algorithmName.indexOf(47) + 1);
    }

    @Override // org.bouncycastle.crypto.e
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        this.f24237d = 0L;
        this.f24235b.init(z10, iVar);
        this.f24238e = z10;
        if (iVar instanceof f1) {
            iVar = ((f1) iVar).b();
        }
        if (iVar instanceof g1) {
            iVar = ((g1) iVar).a();
        }
        if (iVar instanceof h1) {
            iVar = ((h1) iVar).a();
        }
        this.f24236c = (b1) iVar;
    }

    @Override // org.bouncycastle.crypto.e
    public void reset() {
        this.f24237d = 0L;
        this.f24235b.reset();
    }
}
