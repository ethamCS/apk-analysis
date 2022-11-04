package c7;

import java.util.Formatter;
/* loaded from: classes.dex */
final class f {

    /* renamed from: a */
    private final a f6342a;

    /* renamed from: b */
    private final g[] f6343b;

    /* renamed from: c */
    private c f6344c;

    /* renamed from: d */
    private final int f6345d;

    public f(a aVar, c cVar) {
        this.f6342a = aVar;
        int a10 = aVar.a();
        this.f6345d = a10;
        this.f6344c = cVar;
        this.f6343b = new g[a10 + 2];
    }

    private void a(g gVar) {
        if (gVar != null) {
            ((h) gVar).g(this.f6342a);
        }
    }

    private static boolean b(d dVar, d dVar2) {
        if (dVar2 != null && dVar2.g() && dVar2.a() == dVar.a()) {
            dVar.i(dVar2.c());
            return true;
        }
        return false;
    }

    private static int c(int i10, int i11, d dVar) {
        if (dVar != null && !dVar.g()) {
            if (!dVar.h(i10)) {
                return i11 + 1;
            }
            dVar.i(i10);
            return 0;
        }
        return i11;
    }

    private int d() {
        int f10 = f();
        if (f10 == 0) {
            return 0;
        }
        for (int i10 = 1; i10 < this.f6345d + 1; i10++) {
            d[] d10 = this.f6343b[i10].d();
            for (int i11 = 0; i11 < d10.length; i11++) {
                if (d10[i11] != null && !d10[i11].g()) {
                    e(i10, i11, d10);
                }
            }
        }
        return f10;
    }

    private void e(int i10, int i11, d[] dVarArr) {
        d dVar = dVarArr[i11];
        d[] d10 = this.f6343b[i10 - 1].d();
        g[] gVarArr = this.f6343b;
        int i12 = i10 + 1;
        d[] d11 = gVarArr[i12] != null ? gVarArr[i12].d() : d10;
        d[] dVarArr2 = new d[14];
        dVarArr2[2] = d10[i11];
        dVarArr2[3] = d11[i11];
        if (i11 > 0) {
            int i13 = i11 - 1;
            dVarArr2[0] = dVarArr[i13];
            dVarArr2[4] = d10[i13];
            dVarArr2[5] = d11[i13];
        }
        if (i11 > 1) {
            int i14 = i11 - 2;
            dVarArr2[8] = dVarArr[i14];
            dVarArr2[10] = d10[i14];
            dVarArr2[11] = d11[i14];
        }
        if (i11 < dVarArr.length - 1) {
            int i15 = i11 + 1;
            dVarArr2[1] = dVarArr[i15];
            dVarArr2[6] = d10[i15];
            dVarArr2[7] = d11[i15];
        }
        if (i11 < dVarArr.length - 2) {
            int i16 = i11 + 2;
            dVarArr2[9] = dVarArr[i16];
            dVarArr2[12] = d10[i16];
            dVarArr2[13] = d11[i16];
        }
        for (int i17 = 0; i17 < 14 && !b(dVar, dVarArr2[i17]); i17++) {
        }
    }

    private int f() {
        g();
        return h() + i();
    }

    private void g() {
        g[] gVarArr = this.f6343b;
        if (gVarArr[0] == null || gVarArr[this.f6345d + 1] == null) {
            return;
        }
        d[] d10 = gVarArr[0].d();
        d[] d11 = this.f6343b[this.f6345d + 1].d();
        for (int i10 = 0; i10 < d10.length; i10++) {
            if (d10[i10] != null && d11[i10] != null && d10[i10].c() == d11[i10].c()) {
                for (int i11 = 1; i11 <= this.f6345d; i11++) {
                    d dVar = this.f6343b[i11].d()[i10];
                    if (dVar != null) {
                        dVar.i(d10[i10].c());
                        if (!dVar.g()) {
                            this.f6343b[i11].d()[i10] = null;
                        }
                    }
                }
            }
        }
    }

    private int h() {
        g[] gVarArr = this.f6343b;
        if (gVarArr[0] == null) {
            return 0;
        }
        d[] d10 = gVarArr[0].d();
        int i10 = 0;
        for (int i11 = 0; i11 < d10.length; i11++) {
            if (d10[i11] != null) {
                int c10 = d10[i11].c();
                int i12 = 0;
                for (int i13 = 1; i13 < this.f6345d + 1 && i12 < 2; i13++) {
                    d dVar = this.f6343b[i13].d()[i11];
                    if (dVar != null) {
                        i12 = c(c10, i12, dVar);
                        if (!dVar.g()) {
                            i10++;
                        }
                    }
                }
            }
        }
        return i10;
    }

    private int i() {
        g[] gVarArr = this.f6343b;
        int i10 = this.f6345d;
        if (gVarArr[i10 + 1] == null) {
            return 0;
        }
        d[] d10 = gVarArr[i10 + 1].d();
        int i11 = 0;
        for (int i12 = 0; i12 < d10.length; i12++) {
            if (d10[i12] != null) {
                int c10 = d10[i12].c();
                int i13 = 0;
                for (int i14 = this.f6345d + 1; i14 > 0 && i13 < 2; i14--) {
                    d dVar = this.f6343b[i14].d()[i12];
                    if (dVar != null) {
                        i13 = c(c10, i13, dVar);
                        if (!dVar.g()) {
                            i11++;
                        }
                    }
                }
            }
        }
        return i11;
    }

    public int j() {
        return this.f6345d;
    }

    public int k() {
        return this.f6342a.b();
    }

    public int l() {
        return this.f6342a.c();
    }

    public c m() {
        return this.f6344c;
    }

    public g n(int i10) {
        return this.f6343b[i10];
    }

    public g[] o() {
        a(this.f6343b[0]);
        a(this.f6343b[this.f6345d + 1]);
        int i10 = 928;
        while (true) {
            int d10 = d();
            if (d10 <= 0 || d10 >= i10) {
                break;
            }
            i10 = d10;
        }
        return this.f6343b;
    }

    public void p(c cVar) {
        this.f6344c = cVar;
    }

    public void q(int i10, g gVar) {
        this.f6343b[i10] = gVar;
    }

    public String toString() {
        g[] gVarArr = this.f6343b;
        g gVar = gVarArr[0];
        if (gVar == null) {
            gVar = gVarArr[this.f6345d + 1];
        }
        Formatter formatter = new Formatter();
        for (int i10 = 0; i10 < gVar.d().length; i10++) {
            try {
                formatter.format("CW %3d:", Integer.valueOf(i10));
                for (int i11 = 0; i11 < this.f6345d + 2; i11++) {
                    g[] gVarArr2 = this.f6343b;
                    if (gVarArr2[i11] == null) {
                        formatter.format("    |   ", new Object[0]);
                    } else {
                        d dVar = gVarArr2[i11].d()[i10];
                        if (dVar == null) {
                            formatter.format("    |   ", new Object[0]);
                        } else {
                            formatter.format(" %3d|%3d", Integer.valueOf(dVar.c()), Integer.valueOf(dVar.e()));
                        }
                    }
                }
                formatter.format("%n", new Object[0]);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        formatter.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
        }
        String formatter2 = formatter.toString();
        formatter.close();
        return formatter2;
    }
}
