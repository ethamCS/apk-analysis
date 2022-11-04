package fh;

import gg.g;
import gg.v;
import java.util.Vector;
/* loaded from: classes3.dex */
public class d {

    /* renamed from: a */
    private e f10208a;

    /* renamed from: b */
    private Vector f10209b = new Vector();

    public d(e eVar) {
        this.f10208a = eVar;
    }

    public d a(a[] aVarArr) {
        this.f10209b.addElement(new b(aVarArr));
        return this;
    }

    public d b(v[] vVarArr, g[] gVarArr) {
        a[] aVarArr = new a[vVarArr.length];
        for (int i10 = 0; i10 != vVarArr.length; i10++) {
            aVarArr[i10] = new a(vVarArr[i10], gVarArr[i10]);
        }
        return a(aVarArr);
    }

    public d c(v[] vVarArr, String[] strArr) {
        int length = strArr.length;
        g[] gVarArr = new g[length];
        for (int i10 = 0; i10 != length; i10++) {
            gVarArr[i10] = this.f10208a.a(vVarArr[i10], strArr[i10]);
        }
        return b(vVarArr, gVarArr);
    }

    public d d(v vVar, g gVar) {
        this.f10209b.addElement(new b(vVar, gVar));
        return this;
    }

    public d e(v vVar, String str) {
        d(vVar, this.f10208a.a(vVar, str));
        return this;
    }

    public c f() {
        int size = this.f10209b.size();
        b[] bVarArr = new b[size];
        for (int i10 = 0; i10 != size; i10++) {
            bVarArr[i10] = (b) this.f10209b.elementAt(i10);
        }
        return new c(this.f10208a, bVarArr);
    }
}
