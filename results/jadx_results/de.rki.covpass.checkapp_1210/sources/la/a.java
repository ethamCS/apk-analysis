package la;

import e3.d;
import java.io.Serializable;
import java.text.DecimalFormat;
import ok.b;
/* loaded from: classes.dex */
public class a implements Serializable {

    /* renamed from: c */
    public b<ka.b> f15915c;

    public a() {
        this.f15915c = new b<>(d.f9364a);
    }

    public a(int i10) {
        b<ka.b> bVar = new b<>(i10, d.f9364a);
        this.f15915c = bVar;
        bVar.p(i10);
        this.f15915c.f18623d = i10;
    }

    public ka.b b(int i10) {
        return this.f15915c.f18622c[i10];
    }

    public void c(int i10, double d10, double d11) {
        this.f15915c.f18622c[i10].i(d10, d11);
    }

    public void e(a aVar) {
        this.f15915c.s(aVar.f());
        for (int i10 = 0; i10 < aVar.f(); i10++) {
            this.f15915c.f18622c[i10].k(aVar.f15915c.f18622c[i10]);
        }
    }

    public int f() {
        return this.f15915c.g();
    }

    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("#");
        String str = getClass().getSimpleName() + "{ order=" + this.f15915c.f18623d + ", [ ";
        int i10 = 0;
        while (true) {
            b<ka.b> bVar = this.f15915c;
            if (i10 >= bVar.f18623d) {
                return str + "] }";
            }
            ka.b c10 = bVar.c(i10);
            str = str + "(" + pk.d.m(c10.f10622c, decimalFormat, false, 11, 4) + ", " + pk.d.m(c10.f10623d, decimalFormat, false, 11, 4) + ") ";
            i10++;
        }
    }
}
