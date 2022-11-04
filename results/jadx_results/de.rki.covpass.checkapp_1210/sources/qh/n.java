package qh;
/* loaded from: classes3.dex */
public class n extends v {
    private static boolean c(byte b10, int i10) {
        return (b10 & (1 << i10)) != 0;
    }

    private static byte[] d(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        for (int i10 = 0; i10 != 8; i10++) {
            int i11 = 0;
            int i12 = 0;
            for (int i13 = 0; i13 != 8; i13++) {
                int l10 = ak.l.l(bArr, i13 * 4);
                if (c(bArr2[i10], i13)) {
                    i11 += l10;
                } else {
                    i12 += l10;
                }
            }
            byte[] bArr4 = new byte[8];
            ak.l.i(i11, bArr4, 0);
            ak.l.i(i12, bArr4, 4);
            vh.m mVar = new vh.m(new u());
            mVar.init(true, new zh.f1(new zh.h1(new zh.b1(bArr), bArr3), bArr4));
            mVar.a(bArr, 0, bArr, 0);
            mVar.a(bArr, 8, bArr, 8);
            mVar.a(bArr, 16, bArr, 16);
            mVar.a(bArr, 24, bArr, 24);
        }
        return bArr;
    }

    @Override // qh.v, org.bouncycastle.crypto.i0
    public void init(boolean z10, org.bouncycastle.crypto.i iVar) {
        byte[] bArr;
        zh.b1 b1Var;
        if (iVar instanceof zh.g1) {
            iVar = ((zh.g1) iVar).a();
        }
        zh.i1 i1Var = (zh.i1) iVar;
        if (i1Var.a() instanceof zh.h1) {
            b1Var = (zh.b1) ((zh.h1) i1Var.a()).a();
            bArr = ((zh.h1) i1Var.a()).b();
        } else {
            zh.b1 b1Var2 = (zh.b1) i1Var.a();
            bArr = null;
            b1Var = null;
        }
        zh.b1 b1Var3 = new zh.b1(d(b1Var.a(), i1Var.b(), bArr));
        super.init(z10, bArr != null ? new zh.i1(new zh.h1(b1Var3, bArr), i1Var.b()) : new zh.i1(b1Var3, i1Var.b()));
    }
}
