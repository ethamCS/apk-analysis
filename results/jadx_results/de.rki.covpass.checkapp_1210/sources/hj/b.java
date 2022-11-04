package hj;

import zj.h;
import zj.i;
import zj.k;
/* loaded from: classes3.dex */
public class b extends a {
    private i U3;
    private h V3;
    private zj.a W3;
    private i[] X3;

    /* renamed from: q */
    private int f12219q;

    /* renamed from: x */
    private int f12220x;

    /* renamed from: y */
    private zj.b f12221y;

    public b(int i10, int i11, zj.b bVar, i iVar, zj.a aVar, h hVar, String str) {
        super(true, str);
        this.f12219q = i10;
        this.f12220x = i11;
        this.f12221y = bVar;
        this.U3 = iVar;
        this.W3 = aVar;
        this.V3 = hVar;
        this.X3 = new k(bVar, iVar).c();
    }

    public b(int i10, int i11, zj.b bVar, i iVar, h hVar, String str) {
        this(i10, i11, bVar, iVar, zj.c.a(bVar, iVar), hVar, str);
    }

    public zj.b c() {
        return this.f12221y;
    }

    public i d() {
        return this.U3;
    }

    public zj.a e() {
        return this.W3;
    }

    public int f() {
        return this.f12220x;
    }

    public int g() {
        return this.f12219q;
    }

    public h h() {
        return this.V3;
    }
}
