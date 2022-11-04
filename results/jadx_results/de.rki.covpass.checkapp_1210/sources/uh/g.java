package uh;

import java.util.Hashtable;
import org.bouncycastle.crypto.t;
import org.bouncycastle.crypto.y;
import zh.b1;
/* loaded from: classes3.dex */
public class g implements y {

    /* renamed from: h */
    private static Hashtable f23707h;

    /* renamed from: a */
    private org.bouncycastle.crypto.r f23708a;

    /* renamed from: b */
    private int f23709b;

    /* renamed from: c */
    private int f23710c;

    /* renamed from: d */
    private ak.i f23711d;

    /* renamed from: e */
    private ak.i f23712e;

    /* renamed from: f */
    private byte[] f23713f;

    /* renamed from: g */
    private byte[] f23714g;

    static {
        Hashtable hashtable = new Hashtable();
        f23707h = hashtable;
        hashtable.put("GOST3411", ak.g.e(32));
        f23707h.put("MD2", ak.g.e(16));
        f23707h.put("MD4", ak.g.e(64));
        f23707h.put("MD5", ak.g.e(64));
        f23707h.put("RIPEMD128", ak.g.e(64));
        f23707h.put("RIPEMD160", ak.g.e(64));
        f23707h.put("SHA-1", ak.g.e(64));
        f23707h.put("SHA-224", ak.g.e(64));
        f23707h.put("SHA-256", ak.g.e(64));
        f23707h.put("SHA-384", ak.g.e(128));
        f23707h.put("SHA-512", ak.g.e(128));
        f23707h.put("Tiger", ak.g.e(64));
        f23707h.put("Whirlpool", ak.g.e(64));
    }

    public g(org.bouncycastle.crypto.r rVar) {
        this(rVar, a(rVar));
    }

    private g(org.bouncycastle.crypto.r rVar, int i10) {
        this.f23708a = rVar;
        int digestSize = rVar.getDigestSize();
        this.f23709b = digestSize;
        this.f23710c = i10;
        this.f23713f = new byte[i10];
        this.f23714g = new byte[i10 + digestSize];
    }

    private static int a(org.bouncycastle.crypto.r rVar) {
        if (rVar instanceof t) {
            return ((t) rVar).getByteLength();
        }
        Integer num = (Integer) f23707h.get(rVar.getAlgorithmName());
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException("unknown digest passed: " + rVar.getAlgorithmName());
    }

    private static void c(byte[] bArr, int i10, byte b10) {
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = (byte) (bArr[i11] ^ b10);
        }
    }

    public org.bouncycastle.crypto.r b() {
        return this.f23708a;
    }

    @Override // org.bouncycastle.crypto.y
    public int doFinal(byte[] bArr, int i10) {
        this.f23708a.doFinal(this.f23714g, this.f23710c);
        ak.i iVar = this.f23712e;
        if (iVar != null) {
            ((ak.i) this.f23708a).b(iVar);
            org.bouncycastle.crypto.r rVar = this.f23708a;
            rVar.update(this.f23714g, this.f23710c, rVar.getDigestSize());
        } else {
            org.bouncycastle.crypto.r rVar2 = this.f23708a;
            byte[] bArr2 = this.f23714g;
            rVar2.update(bArr2, 0, bArr2.length);
        }
        int doFinal = this.f23708a.doFinal(bArr, i10);
        int i11 = this.f23710c;
        while (true) {
            byte[] bArr3 = this.f23714g;
            if (i11 >= bArr3.length) {
                break;
            }
            bArr3[i11] = 0;
            i11++;
        }
        ak.i iVar2 = this.f23711d;
        if (iVar2 != null) {
            ((ak.i) this.f23708a).b(iVar2);
        } else {
            org.bouncycastle.crypto.r rVar3 = this.f23708a;
            byte[] bArr4 = this.f23713f;
            rVar3.update(bArr4, 0, bArr4.length);
        }
        return doFinal;
    }

    @Override // org.bouncycastle.crypto.y
    public String getAlgorithmName() {
        return this.f23708a.getAlgorithmName() + "/HMAC";
    }

    @Override // org.bouncycastle.crypto.y
    public int getMacSize() {
        return this.f23709b;
    }

    @Override // org.bouncycastle.crypto.y
    public void init(org.bouncycastle.crypto.i iVar) {
        byte[] bArr;
        this.f23708a.reset();
        byte[] a10 = ((b1) iVar).a();
        int length = a10.length;
        if (length > this.f23710c) {
            this.f23708a.update(a10, 0, length);
            this.f23708a.doFinal(this.f23713f, 0);
            length = this.f23709b;
        } else {
            System.arraycopy(a10, 0, this.f23713f, 0, length);
        }
        while (true) {
            bArr = this.f23713f;
            if (length >= bArr.length) {
                break;
            }
            bArr[length] = 0;
            length++;
        }
        System.arraycopy(bArr, 0, this.f23714g, 0, this.f23710c);
        c(this.f23713f, this.f23710c, (byte) 54);
        c(this.f23714g, this.f23710c, (byte) 92);
        org.bouncycastle.crypto.r rVar = this.f23708a;
        if (rVar instanceof ak.i) {
            ak.i a11 = ((ak.i) rVar).a();
            this.f23712e = a11;
            ((org.bouncycastle.crypto.r) a11).update(this.f23714g, 0, this.f23710c);
        }
        org.bouncycastle.crypto.r rVar2 = this.f23708a;
        byte[] bArr2 = this.f23713f;
        rVar2.update(bArr2, 0, bArr2.length);
        org.bouncycastle.crypto.r rVar3 = this.f23708a;
        if (rVar3 instanceof ak.i) {
            this.f23711d = ((ak.i) rVar3).a();
        }
    }

    @Override // org.bouncycastle.crypto.y
    public void reset() {
        this.f23708a.reset();
        org.bouncycastle.crypto.r rVar = this.f23708a;
        byte[] bArr = this.f23713f;
        rVar.update(bArr, 0, bArr.length);
    }

    @Override // org.bouncycastle.crypto.y
    public void update(byte b10) {
        this.f23708a.update(b10);
    }

    @Override // org.bouncycastle.crypto.y
    public void update(byte[] bArr, int i10, int i11) {
        this.f23708a.update(bArr, i10, i11);
    }
}
