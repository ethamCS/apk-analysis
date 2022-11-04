package zg;

import gg.a0;
import gg.a1;
import gg.d0;
import gg.l2;
/* loaded from: classes3.dex */
public class b extends gg.t {

    /* renamed from: c */
    private f[] f26751c;

    /* renamed from: d */
    private boolean f26752d;

    private b(d0 d0Var) {
        this.f26752d = true;
        this.f26751c = new f[d0Var.size()];
        int i10 = 0;
        while (true) {
            f[] fVarArr = this.f26751c;
            if (i10 == fVarArr.length) {
                this.f26752d = d0Var instanceof a1;
                return;
            } else {
                fVarArr[i10] = f.n(d0Var.G(i10));
                i10++;
            }
        }
    }

    public b(f[] fVarArr) {
        this.f26752d = true;
        this.f26751c = l(fVarArr);
    }

    private f[] l(f[] fVarArr) {
        int length = fVarArr.length;
        f[] fVarArr2 = new f[length];
        System.arraycopy(fVarArr, 0, fVarArr2, 0, length);
        return fVarArr2;
    }

    public static b n(Object obj) {
        if (obj instanceof b) {
            return (b) obj;
        }
        if (obj == null) {
            return null;
        }
        return new b(d0.F(obj));
    }

    @Override // gg.t, gg.g
    public a0 b() {
        return this.f26752d ? new a1(this.f26751c) : new l2(this.f26751c);
    }

    public f[] m() {
        return l(this.f26751c);
    }
}
