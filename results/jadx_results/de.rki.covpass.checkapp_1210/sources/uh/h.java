package uh;

import org.bouncycastle.crypto.y;
import zh.b1;
import zh.f1;
/* loaded from: classes3.dex */
public class h implements y {

    /* renamed from: a */
    private byte[] f23715a;

    /* renamed from: b */
    private byte[] f23716b;

    /* renamed from: c */
    private int f23717c;

    /* renamed from: d */
    private org.bouncycastle.crypto.e f23718d;

    /* renamed from: e */
    private yh.a f23719e;

    /* renamed from: f */
    private int f23720f;

    /* renamed from: g */
    private b1 f23721g;

    /* renamed from: h */
    private b1 f23722h;

    public h(org.bouncycastle.crypto.e eVar) {
        this(eVar, eVar.b() * 8, null);
    }

    public h(org.bouncycastle.crypto.e eVar, int i10, yh.a aVar) {
        if (i10 % 8 == 0) {
            if (!(eVar instanceof qh.o)) {
                throw new IllegalArgumentException("cipher must be instance of DESEngine");
            }
            this.f23718d = new vh.c(eVar);
            this.f23719e = aVar;
            this.f23720f = i10 / 8;
            this.f23715a = new byte[eVar.b()];
            this.f23716b = new byte[eVar.b()];
            this.f23717c = 0;
            return;
        }
        throw new IllegalArgumentException("MAC size must be multiple of 8");
    }

    public h(org.bouncycastle.crypto.e eVar, yh.a aVar) {
        this(eVar, eVar.b() * 8, aVar);
    }

    @Override // org.bouncycastle.crypto.y
    public int doFinal(byte[] bArr, int i10) {
        int b10 = this.f23718d.b();
        if (this.f23719e == null) {
            while (true) {
                int i11 = this.f23717c;
                if (i11 >= b10) {
                    break;
                }
                this.f23716b[i11] = 0;
                this.f23717c = i11 + 1;
            }
        } else {
            if (this.f23717c == b10) {
                this.f23718d.a(this.f23716b, 0, this.f23715a, 0);
                this.f23717c = 0;
            }
            this.f23719e.b(this.f23716b, this.f23717c);
        }
        this.f23718d.a(this.f23716b, 0, this.f23715a, 0);
        qh.o oVar = new qh.o();
        oVar.init(false, this.f23721g);
        byte[] bArr2 = this.f23715a;
        oVar.a(bArr2, 0, bArr2, 0);
        oVar.init(true, this.f23722h);
        byte[] bArr3 = this.f23715a;
        oVar.a(bArr3, 0, bArr3, 0);
        System.arraycopy(this.f23715a, 0, bArr, i10, this.f23720f);
        reset();
        return this.f23720f;
    }

    @Override // org.bouncycastle.crypto.y
    public String getAlgorithmName() {
        return "ISO9797Alg3";
    }

    @Override // org.bouncycastle.crypto.y
    public int getMacSize() {
        return this.f23720f;
    }

    @Override // org.bouncycastle.crypto.y
    public void init(org.bouncycastle.crypto.i iVar) {
        b1 b1Var;
        reset();
        boolean z10 = iVar instanceof b1;
        if (z10 || (iVar instanceof f1)) {
            byte[] a10 = (z10 ? (b1) iVar : (b1) ((f1) iVar).b()).a();
            if (a10.length == 16) {
                b1Var = new b1(a10, 0, 8);
                this.f23721g = new b1(a10, 8, 8);
                this.f23722h = b1Var;
            } else if (a10.length != 24) {
                throw new IllegalArgumentException("Key must be either 112 or 168 bit long");
            } else {
                b1Var = new b1(a10, 0, 8);
                this.f23721g = new b1(a10, 8, 8);
                this.f23722h = new b1(a10, 16, 8);
            }
            if (iVar instanceof f1) {
                this.f23718d.init(true, new f1(b1Var, ((f1) iVar).a()));
                return;
            } else {
                this.f23718d.init(true, b1Var);
                return;
            }
        }
        throw new IllegalArgumentException("params must be an instance of KeyParameter or ParametersWithIV");
    }

    @Override // org.bouncycastle.crypto.y
    public void reset() {
        int i10 = 0;
        while (true) {
            byte[] bArr = this.f23716b;
            if (i10 >= bArr.length) {
                this.f23717c = 0;
                this.f23718d.reset();
                return;
            }
            bArr[i10] = 0;
            i10++;
        }
    }

    @Override // org.bouncycastle.crypto.y
    public void update(byte b10) {
        int i10 = this.f23717c;
        byte[] bArr = this.f23716b;
        if (i10 == bArr.length) {
            this.f23718d.a(bArr, 0, this.f23715a, 0);
            this.f23717c = 0;
        }
        byte[] bArr2 = this.f23716b;
        int i11 = this.f23717c;
        this.f23717c = i11 + 1;
        bArr2[i11] = b10;
    }

    @Override // org.bouncycastle.crypto.y
    public void update(byte[] bArr, int i10, int i11) {
        if (i11 >= 0) {
            int b10 = this.f23718d.b();
            int i12 = this.f23717c;
            int i13 = b10 - i12;
            if (i11 > i13) {
                System.arraycopy(bArr, i10, this.f23716b, i12, i13);
                this.f23718d.a(this.f23716b, 0, this.f23715a, 0);
                this.f23717c = 0;
                i11 -= i13;
                i10 += i13;
                while (i11 > b10) {
                    this.f23718d.a(bArr, i10, this.f23715a, 0);
                    i11 -= b10;
                    i10 += b10;
                }
            }
            System.arraycopy(bArr, i10, this.f23716b, this.f23717c, i11);
            this.f23717c += i11;
            return;
        }
        throw new IllegalArgumentException("Can't have a negative input length!");
    }
}
