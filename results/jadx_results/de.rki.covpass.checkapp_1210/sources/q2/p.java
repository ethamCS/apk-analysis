package q2;

import d4.a;
import java.util.Arrays;
import org.conscrypt.PSKKeyManager;
import q2.p;
/* loaded from: classes.dex */
public class p implements h2.h<c4.l> {

    /* renamed from: b */
    private final boolean f19547b;

    /* renamed from: c */
    private final double f19548c;

    /* renamed from: d */
    private final boolean f19549d;

    /* renamed from: e */
    private final double f19550e;

    /* renamed from: f */
    x3.b f19551f;

    /* renamed from: g */
    int f19552g;

    /* renamed from: h */
    int f19553h;

    /* renamed from: a */
    c4.t<c4.l> f19546a = c4.t.n(c4.l.class);

    /* renamed from: i */
    d4.a<a> f19554i = new d4.a<>(new a.AbstractC0119a() { // from class: q2.o
        @Override // d4.a.AbstractC0119a
        public final Object a() {
            p.a h10;
            h10 = p.this.h();
            return h10;
        }
    });

    /* loaded from: classes.dex */
    public class a {

        /* renamed from: a */
        int[] f19555a = new int[PSKKeyManager.MAX_KEY_LENGTH_BYTES];

        /* renamed from: b */
        q2.a f19556b;

        a() {
            p.this = r9;
            this.f19556b = new q2.a(r9.f19547b, r9.f19548c, r9.f19549d, r9.f19550e);
        }

        public void b(int i10, int i11, int i12, int i13, c4.l lVar, c4.l lVar2) {
            a aVar = this;
            c4.l lVar3 = lVar;
            boolean z10 = aVar.f19556b.f19491e;
            boolean z11 = !z10 ? 1 : 0;
            int i14 = i11;
            while (i14 < i13) {
                int i15 = lVar3.f6218c + (lVar3.f6219d * i14) + i10;
                int i16 = lVar2.f6218c + (lVar2.f6219d * i14) + i10;
                int i17 = (i12 - i10) + i16;
                while (i16 < i17) {
                    int i18 = i16 + 1;
                    int i19 = i15 + 1;
                    lVar2.V3[i16] = ((double) (lVar3.V3[i15] & 255)) <= aVar.f19556b.f19488b ? z10 ? 1 : 0 : z11 ? 1 : 0;
                    aVar = this;
                    lVar3 = lVar;
                    i16 = i18;
                    i15 = i19;
                }
                i14++;
                aVar = this;
                lVar3 = lVar;
            }
        }

        public void c(int i10, int i11, c4.l lVar) {
            Arrays.fill(this.f19555a, 0);
            int i12 = 0;
            while (true) {
                p pVar = p.this;
                if (i12 >= pVar.f19552g) {
                    q2.a aVar = this.f19556b;
                    int[] iArr = this.f19555a;
                    aVar.a(iArr, iArr.length, pVar.f19553h);
                    return;
                }
                int i13 = lVar.f6218c + ((i11 + i12) * lVar.f6219d) + i10;
                int i14 = 0;
                while (i14 < p.this.f19552g) {
                    int[] iArr2 = this.f19555a;
                    int i15 = i13 + 1;
                    int i16 = lVar.V3[i13] & 255;
                    iArr2[i16] = iArr2[i16] + 1;
                    i14++;
                    i13 = i15;
                }
                i12++;
            }
        }

        public void d(int i10, int i11, c4.l lVar) {
            int i12;
            if (i10 <= 0) {
                return;
            }
            int i13 = ((lVar.f6218c + (i11 * lVar.f6219d)) + i10) - 1;
            int i14 = 0;
            while (true) {
                p pVar = p.this;
                int i15 = pVar.f19552g;
                if (i14 >= i15) {
                    q2.a aVar = this.f19556b;
                    int[] iArr = this.f19555a;
                    aVar.a(iArr, iArr.length, pVar.f19553h);
                    return;
                }
                int[] iArr2 = this.f19555a;
                byte[] bArr = lVar.V3;
                iArr2[bArr[i13] & 255] = iArr2[i12] - 1;
                int i16 = bArr[i15 + i13] & 255;
                iArr2[i16] = iArr2[i16] + 1;
                i13 += lVar.f6219d;
                i14++;
            }
        }

        void e(int i10, int i11, c4.l lVar) {
            if (i11 <= 0) {
                return;
            }
            int i12 = p.this.f19552g * lVar.f6219d;
            int i13 = 0;
            while (true) {
                p pVar = p.this;
                if (i13 >= pVar.f19552g) {
                    q2.a aVar = this.f19556b;
                    int[] iArr = this.f19555a;
                    aVar.a(iArr, iArr.length, pVar.f19553h);
                    return;
                }
                int i14 = lVar.f6218c + ((i11 - 1) * lVar.f6219d) + i10 + i13;
                int[] iArr2 = this.f19555a;
                byte[] bArr = lVar.V3;
                int i15 = bArr[i14] & 255;
                iArr2[i15] = iArr2[i15] - 1;
                int i16 = bArr[i14 + i12] & 255;
                iArr2[i16] = iArr2[i16] + 1;
                i13++;
            }
        }
    }

    public p(boolean z10, x3.b bVar, double d10, double d11, boolean z11) {
        this.f19551f = bVar;
        this.f19547b = z10;
        this.f19548c = d10;
        this.f19550e = d11;
        this.f19549d = z11;
    }

    public /* synthetic */ a h() {
        return new a();
    }

    public void g(c4.l lVar, c4.l lVar2, int i10, int i11, int i12, int i13, a aVar) {
        aVar.c(0, 0, lVar);
        int i14 = i12 + 1;
        int i15 = i10 + 1;
        aVar.b(0, 0, i14, i15, lVar, lVar2);
        int i16 = i14;
        while (i16 < i13) {
            aVar.d(i16 - i12, 0, lVar);
            int i17 = i16 + 1;
            aVar.b(i16, 0, i17, i10, lVar, lVar2);
            i16 = i17;
        }
        int i18 = i13 - i12;
        aVar.d(i18, 0, lVar);
        aVar.b(i13, 0, lVar.f6220q, i15, lVar, lVar2);
        int i19 = i15;
        while (i19 < i11) {
            aVar.e(i18, i19 - i10, lVar);
            int i20 = i19 + 1;
            aVar.b(i13, i19, lVar.f6220q, i20, lVar, lVar2);
            i19 = i20;
        }
        int i21 = i11 - i10;
        aVar.e(i18, i21, lVar);
        aVar.b(i13, i11, lVar.f6220q, lVar.f6221x, lVar, lVar2);
        aVar.c(0, 0, lVar);
        while (true) {
            int i22 = i15;
            if (i22 >= i11) {
                break;
            }
            aVar.e(0, i22 - i10, lVar);
            i15 = i22 + 1;
            aVar.b(0, i22, i12, i15, lVar, lVar2);
        }
        aVar.e(0, i21, lVar);
        aVar.b(0, i11, i14, lVar.f6221x, lVar, lVar2);
        int i23 = i14;
        while (i23 < i13) {
            aVar.d(i23 - i12, i21, lVar);
            int i24 = i23 + 1;
            aVar.b(i23, i11, i24, lVar.f6221x, lVar, lVar2);
            i23 = i24;
        }
    }

    @Override // h2.h
    public c4.t<c4.l> getInputType() {
        return this.f19546a;
    }

    /* renamed from: i */
    public void a(c4.l lVar, c4.l lVar2) {
        lVar2.U(lVar.f6220q, lVar.f6221x);
        int e10 = this.f19551f.e(Math.min(lVar.f6220q, lVar.f6221x));
        this.f19552g = e10;
        int i10 = lVar.f6220q;
        if (i10 < e10 || lVar.f6221x < e10) {
            this.f19552g = Math.min(i10, lVar.f6221x);
        }
        int i11 = this.f19552g;
        this.f19553h = i11 * i11;
        int i12 = i11 / 2;
        int i13 = lVar.f6221x - (i11 - i12);
        int i14 = i11 / 2;
        boolean z10 = this.f19549d;
        j(lVar, lVar2, i14, i12, lVar.f6220q - (i11 - i14), i13, z10 ? (byte) 1 : (byte) 0, !z10 ? 1 : 0 ? (byte) 1 : (byte) 0);
    }

    protected void j(c4.l lVar, c4.l lVar2, int i10, int i11, int i12, int i13, byte b10, byte b11) {
        a a10 = this.f19554i.a();
        for (int i14 = i11; i14 < i13; i14++) {
            int i15 = lVar.f6218c + (lVar.f6219d * i14) + i10;
            int i16 = lVar2.f6218c + (lVar2.f6219d * i14) + i10;
            int i17 = i14 - i11;
            a10.c(0, i17, lVar);
            int i18 = i16 + 1;
            int i19 = i15 + 1;
            lVar2.V3[i16] = ((double) (lVar.V3[i15] & 255)) <= a10.f19556b.f19488b ? b10 : b11;
            int i20 = i10 + 1;
            while (i20 < i12) {
                a10.d(i20 - i10, i17, lVar);
                int i21 = i18 + 1;
                int i22 = i19 + 1;
                lVar2.V3[i18] = ((double) (lVar.V3[i19] & 255)) <= a10.f19556b.f19488b ? b10 : b11;
                i20++;
                i18 = i21;
                i19 = i22;
            }
        }
        g(lVar, lVar2, i11, i13, i10, i12, a10);
        this.f19554i.b(a10);
    }
}
