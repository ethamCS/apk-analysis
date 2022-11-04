package j7;

import h7.h;
import h7.j;
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a */
    private h f14044a;

    /* renamed from: b */
    private h7.f f14045b;

    /* renamed from: c */
    private j f14046c;

    /* renamed from: d */
    private int f14047d = -1;

    /* renamed from: e */
    private b f14048e;

    public static boolean b(int i10) {
        return i10 >= 0 && i10 < 8;
    }

    public b a() {
        return this.f14048e;
    }

    public void c(h7.f fVar) {
        this.f14045b = fVar;
    }

    public void d(int i10) {
        this.f14047d = i10;
    }

    public void e(b bVar) {
        this.f14048e = bVar;
    }

    public void f(h hVar) {
        this.f14044a = hVar;
    }

    public void g(j jVar) {
        this.f14046c = jVar;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(200);
        sb2.append("<<\n");
        sb2.append(" mode: ");
        sb2.append(this.f14044a);
        sb2.append("\n ecLevel: ");
        sb2.append(this.f14045b);
        sb2.append("\n version: ");
        sb2.append(this.f14046c);
        sb2.append("\n maskPattern: ");
        sb2.append(this.f14047d);
        if (this.f14048e == null) {
            sb2.append("\n matrix: null\n");
        } else {
            sb2.append("\n matrix:\n");
            sb2.append(this.f14048e);
        }
        sb2.append(">>\n");
        return sb2.toString();
    }
}
