package q2;

import c4.a0;
import java.util.Arrays;
import org.conscrypt.PSKKeyManager;
import q2.g;
/* loaded from: classes.dex */
public class j implements g.a<c4.l, a0> {

    /* renamed from: a */
    int[] f19532a = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

    /* renamed from: b */
    a f19533b;

    /* renamed from: c */
    protected int f19534c;

    /* renamed from: d */
    protected int f19535d;

    /* renamed from: e */
    protected boolean f19536e;

    public j(boolean z10, double d10, double d11, boolean z11) {
        this.f19533b = new a(z10, d10, z11, d11);
    }

    @Override // q2.g.a
    public g.a<c4.l, a0> a() {
        return new j(this.f19533b.f(), this.f19533b.e(), this.f19533b.d(), this.f19533b.f19491e);
    }

    @Override // q2.g.a
    public void b(int i10, int i11, boolean z10) {
        this.f19534c = i10;
        this.f19535d = i11;
        this.f19536e = z10;
    }

    /* renamed from: f */
    public void c(int i10, int i11, int i12, int i13, int i14, c4.l lVar, a0 a0Var) {
        Arrays.fill(a0Var.W3, i14, i14 + PSKKeyManager.MAX_KEY_LENGTH_BYTES, 0);
        for (int i15 = 0; i15 < i13; i15++) {
            int i16 = lVar.f6218c + ((i11 + i15) * lVar.f6219d) + i10;
            int i17 = i16 + i12;
            while (i16 < i17) {
                int[] iArr = a0Var.W3;
                int i18 = i16 + 1;
                int i19 = (lVar.V3[i16] & 255) + i14;
                iArr[i19] = iArr[i19] + 1;
                i16 = i18;
            }
        }
    }

    /* renamed from: g */
    public a0 e() {
        return new a0(1, 1, PSKKeyManager.MAX_KEY_LENGTH_BYTES);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: h */
    public void d(int i10, int i11, c4.l lVar, a0 a0Var, c4.l lVar2) {
        int i12;
        int i13;
        int[] iArr;
        j jVar = this;
        int i14 = i10;
        int i15 = i11;
        int i16 = jVar.f19534c;
        int i17 = i14 * i16;
        int i18 = jVar.f19535d;
        int i19 = i15 * i18;
        int i20 = a0Var.f6220q;
        int i21 = i14 == i20 + (-1) ? lVar.f6220q : i16 * (i14 + 1);
        int i22 = i15 == a0Var.f6221x + (-1) ? lVar.f6221x : i18 * (i15 + 1);
        int i23 = 0;
        if (jVar.f19536e) {
            i13 = Math.min(i20 - 1, i14 + 1);
            i12 = Math.min(a0Var.f6221x - 1, i15 + 1);
            i14 = Math.max(0, i14 - 1);
            i15 = Math.max(0, i15 - 1);
        } else {
            i13 = i14;
            i12 = i15;
        }
        int[] iArr2 = jVar.f19532a;
        Arrays.fill(iArr2, 0, iArr2.length, 0);
        while (i15 <= i12) {
            int i24 = i14;
            while (i24 <= i13) {
                int M = a0Var.M(i24, i15, i23);
                int i25 = i23;
                while (i25 < 256) {
                    int[] iArr3 = jVar.f19532a;
                    iArr3[i25] = iArr3[i25] + a0Var.W3[M + i25];
                    i25++;
                    i14 = i14;
                }
                i24++;
                i23 = 0;
            }
            i15++;
            i23 = 0;
        }
        int i26 = 0;
        int i27 = 0;
        while (true) {
            iArr = jVar.f19532a;
            if (i27 >= iArr.length) {
                break;
            }
            i26 += iArr[i27];
            i27++;
        }
        jVar.f19533b.a(iArr, iArr.length, i26);
        boolean z10 = jVar.f19533b.f19491e;
        int i28 = !z10;
        byte b10 = z10;
        while (i19 < i22) {
            int i29 = lVar.f6218c + (lVar.f6219d * i19) + i17;
            int i30 = lVar2.f6218c + (lVar2.f6219d * i19) + i17;
            int i31 = (i21 - i17) + i30;
            byte b11 = b10;
            while (i30 < i31) {
                byte b12 = b11;
                lVar2.V3[i30] = ((double) (lVar.V3[i29] & 255)) <= jVar.f19533b.f19488b ? b12 : i28 == 1 ? 1 : 0;
                i30++;
                i29++;
                jVar = this;
                b11 = b12;
            }
            boolean z11 = b11 == 1 ? 1 : 0;
            i19++;
            jVar = this;
            b10 = b11;
        }
    }
}
