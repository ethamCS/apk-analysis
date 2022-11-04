package l6;

import java.util.LinkedList;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: e */
    static final f f15845e = new f(g.f15850b, 0, 0, 0);

    /* renamed from: a */
    private final int f15846a;

    /* renamed from: b */
    private final g f15847b;

    /* renamed from: c */
    private final int f15848c;

    /* renamed from: d */
    private final int f15849d;

    private f(g gVar, int i10, int i11, int i12) {
        this.f15847b = gVar;
        this.f15846a = i10;
        this.f15848c = i11;
        this.f15849d = i12;
    }

    private static int b(f fVar) {
        int i10 = fVar.f15848c;
        if (i10 > 62) {
            return 21;
        }
        if (i10 > 31) {
            return 20;
        }
        return i10 > 0 ? 10 : 0;
    }

    public f a(int i10) {
        g gVar = this.f15847b;
        int i11 = this.f15846a;
        int i12 = this.f15849d;
        if (i11 == 4 || i11 == 2) {
            int i13 = d.f15838c[i11][0];
            int i14 = 65535 & i13;
            int i15 = i13 >> 16;
            gVar = gVar.a(i14, i15);
            i12 += i15;
            i11 = 0;
        }
        int i16 = this.f15848c;
        f fVar = new f(gVar, i11, i16 + 1, i12 + ((i16 == 0 || i16 == 31) ? 18 : i16 == 62 ? 9 : 8));
        return fVar.f15848c == 2078 ? fVar.c(i10 + 1) : fVar;
    }

    public f c(int i10) {
        int i11 = this.f15848c;
        return i11 == 0 ? this : new f(this.f15847b.b(i10 - i11, i11), this.f15846a, 0, this.f15849d);
    }

    public int d() {
        return this.f15848c;
    }

    public int e() {
        return this.f15849d;
    }

    public int f() {
        return this.f15846a;
    }

    public boolean g(f fVar) {
        int i10 = this.f15849d + (d.f15838c[this.f15846a][fVar.f15846a] >> 16);
        int i11 = this.f15848c;
        int i12 = fVar.f15848c;
        if (i11 < i12) {
            i10 += b(fVar) - b(this);
        } else if (i11 > i12 && i12 > 0) {
            i10 += 10;
        }
        return i10 <= fVar.f15849d;
    }

    public f h(int i10, int i11) {
        int i12 = this.f15849d;
        g gVar = this.f15847b;
        int i13 = this.f15846a;
        if (i10 != i13) {
            int i14 = d.f15838c[i13][i10];
            int i15 = 65535 & i14;
            int i16 = i14 >> 16;
            gVar = gVar.a(i15, i16);
            i12 += i16;
        }
        int i17 = i10 == 2 ? 4 : 5;
        return new f(gVar.a(i11, i17), i10, 0, i12 + i17);
    }

    public f i(int i10, int i11) {
        g gVar = this.f15847b;
        int i12 = this.f15846a;
        int i13 = i12 == 2 ? 4 : 5;
        return new f(gVar.a(d.f15840e[i12][i10], i13).a(i11, 5), this.f15846a, 0, this.f15849d + i13 + 5);
    }

    public o6.a j(byte[] bArr) {
        LinkedList<g> linkedList = new LinkedList();
        for (g gVar = c(bArr.length).f15847b; gVar != null; gVar = gVar.d()) {
            linkedList.addFirst(gVar);
        }
        o6.a aVar = new o6.a();
        for (g gVar2 : linkedList) {
            gVar2.c(aVar, bArr);
        }
        return aVar;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", d.f15837b[this.f15846a], Integer.valueOf(this.f15849d), Integer.valueOf(this.f15848c));
    }
}
