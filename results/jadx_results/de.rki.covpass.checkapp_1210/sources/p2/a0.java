package p2;
/* loaded from: classes.dex */
public class a0 {

    /* renamed from: a */
    c f18726a;

    /* renamed from: b */
    ok.i f18727b = new ok.i();

    /* renamed from: c */
    ok.i f18728c = new ok.i();

    /* renamed from: d */
    ok.i f18729d = new ok.i();

    /* renamed from: e */
    ok.g f18730e = new ok.g();

    /* renamed from: f */
    ok.i f18731f = new ok.i();

    /* renamed from: g */
    ok.i f18732g = new ok.i();

    /* renamed from: h */
    ok.i f18733h = new ok.i();

    /* renamed from: i */
    ok.i f18734i = new ok.i();

    /* renamed from: j */
    ok.i f18735j = new ok.i();

    public a0(int i10, int i11) {
        this.f18726a = new c(i10, i11);
    }

    private void j(ok.i iVar) {
        int i10 = 0;
        while (i10 < iVar.f18614b && iVar.f18613a[i10] == 0) {
            i10++;
        }
        int i11 = i10;
        while (true) {
            int i12 = iVar.f18614b;
            if (i11 >= i12) {
                iVar.f18614b = i12 - i10;
                return;
            }
            byte[] bArr = iVar.f18613a;
            bArr[i11 - i10] = bArr[i11];
            i11++;
        }
    }

    private int k() {
        return this.f18727b.f18614b - 1;
    }

    void a(ok.i iVar, ok.i iVar2, ok.i iVar3) {
        iVar3.f(k());
        for (int i10 = 0; i10 < iVar3.f18614b; i10++) {
            int j10 = this.f18726a.j(2, i10);
            iVar3.f18613a[i10] = (byte) this.f18726a.e(iVar, j10);
            byte[] bArr = iVar3.f18613a;
            bArr[i10] = (byte) this.f18726a.f(bArr[i10] & 255, iVar2, j10);
        }
    }

    public boolean b(ok.i iVar, ok.i iVar2) {
        a(iVar, iVar2, this.f18732g);
        f(this.f18732g, this.f18731f);
        if (!e(this.f18731f, iVar.f18614b + iVar2.f18614b, this.f18730e)) {
            return false;
        }
        c(iVar, iVar.f18614b + iVar2.f18614b, this.f18732g, this.f18731f, this.f18730e);
        return true;
    }

    void c(ok.i iVar, int i10, ok.i iVar2, ok.i iVar3, ok.g gVar) {
        d(iVar2, iVar3, this.f18733h);
        this.f18734i.e(gVar.f18610b, (byte) 0);
        for (int i11 = 0; i11 < gVar.f18610b; i11++) {
            this.f18734i.f18613a[i11] = (byte) this.f18726a.j(2, (i10 - gVar.f18609a[i11]) - 1);
        }
        this.f18735j.f(this.f18734i.f18614b);
        int i12 = 0;
        while (true) {
            ok.i iVar4 = this.f18734i;
            if (i12 < iVar4.f18614b) {
                int i13 = iVar4.f18613a[i12] & 255;
                int b10 = this.f18726a.b(i13);
                this.f18735j.f18614b = 0;
                int i14 = 0;
                while (true) {
                    ok.i iVar5 = this.f18734i;
                    if (i14 >= iVar5.f18614b) {
                        break;
                    }
                    if (i12 != i14) {
                        ok.i iVar6 = this.f18735j;
                        byte[] bArr = iVar6.f18613a;
                        int i15 = iVar6.f18614b;
                        iVar6.f18614b = i15 + 1;
                        bArr[i15] = (byte) b.b(1, this.f18726a.c(b10, iVar5.f18613a[i14] & 255));
                    }
                    i14++;
                }
                int i16 = 0;
                int i17 = 1;
                while (true) {
                    ok.i iVar7 = this.f18735j;
                    if (i16 >= iVar7.f18614b) {
                        break;
                    }
                    i17 = this.f18726a.c(i17, iVar7.f18613a[i16] & 255);
                    i16++;
                }
                int g10 = this.f18726a.g(this.f18733h, b10);
                c cVar = this.f18726a;
                int a10 = this.f18726a.a(cVar.c(cVar.j(i13, 1), g10), i17);
                int d10 = gVar.d(i12);
                if (d10 < iVar.f18614b) {
                    byte[] bArr2 = iVar.f18613a;
                    bArr2[d10] = (byte) (a10 ^ (bArr2[d10] & 255));
                }
                i12++;
            } else {
                return;
            }
        }
    }

    void d(ok.i iVar, ok.i iVar2, ok.i iVar3) {
        this.f18726a.i(iVar, iVar2, iVar3);
        int i10 = iVar2.f18614b - 1;
        int i11 = iVar3.f18614b - i10;
        int i12 = 0;
        for (int i13 = 0; i13 < i10; i13++) {
            byte[] bArr = iVar3.f18613a;
            bArr[i13] = bArr[i13 + i11];
        }
        iVar3.f18613a[i10] = 0;
        iVar3.f18614b = iVar2.f18614b;
        while (true) {
            int i14 = iVar3.f18614b;
            if (i12 < i14 / 2) {
                int i15 = (i14 - i12) - 1;
                byte[] bArr2 = iVar3.f18613a;
                byte b10 = bArr2[i12];
                bArr2[i12] = bArr2[i15];
                bArr2[i15] = b10;
                i12++;
            } else {
                return;
            }
        }
    }

    public boolean e(ok.i iVar, int i10, ok.g gVar) {
        gVar.i(0);
        for (int i11 = 0; i11 < i10; i11++) {
            c cVar = this.f18726a;
            if (cVar.g(iVar, cVar.j(2, i11)) == 0) {
                gVar.a((i10 - i11) - 1);
            }
        }
        return gVar.f18610b == iVar.f18614b - 1;
    }

    void f(ok.i iVar, ok.i iVar2) {
        ok.i iVar3 = this.f18733h;
        i(iVar2, iVar.f18614b + 1);
        i(iVar3, iVar.f18614b + 1);
        ok.i iVar4 = this.f18734i;
        iVar4.f(iVar.f18614b);
        int i10 = 1;
        for (int i11 = 0; i11 < iVar.f18614b; i11++) {
            int i12 = iVar.f18613a[i11] & 255;
            int i13 = 1;
            while (true) {
                int i14 = iVar2.f18614b;
                if (i13 >= i14) {
                    break;
                }
                i12 ^= this.f18726a.c(iVar2.f18613a[(i14 - i13) - 1] & 255, iVar.f18613a[i11 - i13] & 255);
                i13++;
            }
            byte[] bArr = iVar3.f18613a;
            int i15 = iVar3.f18614b;
            iVar3.f18614b = i15 + 1;
            bArr[i15] = 0;
            if (i12 != 0) {
                c cVar = this.f18726a;
                this.f18726a.d(iVar2, iVar3, cVar.c(i12, cVar.b(i10)), iVar4);
                if (iVar3.f18614b > iVar2.f18614b) {
                    iVar3.h(iVar2);
                    i10 = i12;
                }
                iVar2.h(iVar4);
            }
        }
        j(iVar2);
    }

    public void g(int i10) {
        i(this.f18727b, i10 + 1);
        this.f18729d.f(2);
        this.f18729d.f18613a[0] = 1;
        for (int i11 = 0; i11 < i10; i11++) {
            this.f18729d.f18613a[1] = (byte) this.f18726a.j(2, i11);
            this.f18726a.h(this.f18727b, this.f18729d, this.f18728c);
            this.f18727b.h(this.f18728c);
        }
    }

    public int h() {
        return this.f18730e.f18610b;
    }

    void i(ok.i iVar, int i10) {
        iVar.d();
        iVar.c(i10);
        iVar.f18614b = 1;
        iVar.f18613a[0] = 1;
    }
}
