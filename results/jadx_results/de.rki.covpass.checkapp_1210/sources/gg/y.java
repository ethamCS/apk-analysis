package gg;

import java.io.IOException;
import java.io.OutputStream;
/* loaded from: classes3.dex */
public class y {

    /* renamed from: a */
    private OutputStream f10919a;

    public y(OutputStream outputStream) {
        this.f10919a = outputStream;
    }

    public static y a(OutputStream outputStream) {
        return new y(outputStream);
    }

    public static y b(OutputStream outputStream, String str) {
        return str.equals("DER") ? new v1(outputStream) : str.equals("DL") ? new k2(outputStream) : new y(outputStream);
    }

    public static int f(int i10) {
        if (i10 < 128) {
            return 1;
        }
        int i11 = 2;
        while (true) {
            i10 >>>= 8;
            if (i10 == 0) {
                return i11;
            }
            i11++;
        }
    }

    public static int g(boolean z10, int i10) {
        return (z10 ? 1 : 0) + f(i10) + i10;
    }

    public static int h(int i10) {
        if (i10 < 31) {
            return 1;
        }
        int i11 = 2;
        while (true) {
            i10 >>>= 7;
            if (i10 == 0) {
                return i11;
            }
            i11++;
        }
    }

    public void c() {
    }

    public v1 d() {
        return new v1(this.f10919a);
    }

    public k2 e() {
        return new k2(this.f10919a);
    }

    public final void i(int i10) {
        this.f10919a.write(i10);
    }

    public final void j(byte[] bArr, int i10, int i11) {
        this.f10919a.write(bArr, i10, i11);
    }

    public final void k(int i10) {
        if (i10 < 128) {
            i(i10);
            return;
        }
        int i11 = 5;
        byte[] bArr = new byte[5];
        do {
            i11--;
            bArr[i11] = (byte) i10;
            i10 >>>= 8;
        } while (i10 != 0);
        int i12 = 5 - i11;
        int i13 = i11 - 1;
        bArr[i13] = (byte) (i12 | 128);
        j(bArr, i13, i12 + 1);
    }

    void l(g[] gVarArr) {
        for (g gVar : gVarArr) {
            gVar.b().m(this, true);
        }
    }

    public final void m(boolean z10, int i10, byte b10) {
        s(z10, i10);
        k(1);
        i(b10);
    }

    public final void n(boolean z10, int i10, byte b10, byte[] bArr, int i11, int i12) {
        s(z10, i10);
        k(i12 + 1);
        i(b10);
        j(bArr, i11, i12);
    }

    public final void o(boolean z10, int i10, byte[] bArr) {
        s(z10, i10);
        k(bArr.length);
        j(bArr, 0, bArr.length);
    }

    public final void p(boolean z10, int i10, byte[] bArr, int i11, int i12) {
        s(z10, i10);
        k(i12);
        j(bArr, i11, i12);
    }

    public final void q(boolean z10, int i10, byte[] bArr, int i11, int i12, byte b10) {
        s(z10, i10);
        k(i12 + 1);
        j(bArr, i11, i12);
        i(b10);
    }

    public final void r(boolean z10, int i10, g[] gVarArr) {
        s(z10, i10);
        i(128);
        l(gVarArr);
        i(0);
        i(0);
    }

    public final void s(boolean z10, int i10) {
        if (z10) {
            i(i10);
        }
    }

    public final void t(boolean z10, int i10, int i11) {
        if (!z10) {
            return;
        }
        if (i11 < 31) {
            i(i10 | i11);
            return;
        }
        byte[] bArr = new byte[6];
        int i12 = 5;
        bArr[5] = (byte) (i11 & 127);
        while (i11 > 127) {
            i11 >>>= 7;
            i12--;
            bArr[i12] = (byte) ((i11 & 127) | 128);
        }
        int i13 = i12 - 1;
        bArr[i13] = (byte) (31 | i10);
        j(bArr, i13, 6 - i13);
    }

    public final void u(g gVar) {
        if (gVar != null) {
            w(gVar.b(), true);
            c();
            return;
        }
        throw new IOException("null object detected");
    }

    public final void v(a0 a0Var) {
        if (a0Var != null) {
            w(a0Var, true);
            c();
            return;
        }
        throw new IOException("null object detected");
    }

    public void w(a0 a0Var, boolean z10) {
        a0Var.m(this, z10);
    }

    public void x(a0[] a0VarArr) {
        for (a0 a0Var : a0VarArr) {
            a0Var.m(this, true);
        }
    }
}
