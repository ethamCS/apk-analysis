package oj;

import java.io.Serializable;
import java.util.Objects;
import java.util.Stack;
import oj.g;
import oj.i;
import oj.j;
/* loaded from: classes3.dex */
class c implements Serializable, Cloneable {

    /* renamed from: c */
    private u f18486c;

    /* renamed from: d */
    private final int f18487d;

    /* renamed from: q */
    private int f18488q;

    /* renamed from: x */
    private int f18489x;

    /* renamed from: y */
    private boolean f18490y = false;
    private boolean U3 = false;

    public c(int i10) {
        this.f18487d = i10;
    }

    /* renamed from: c */
    public c clone() {
        c cVar = new c(this.f18487d);
        cVar.f18486c = this.f18486c;
        cVar.f18488q = this.f18488q;
        cVar.f18489x = this.f18489x;
        cVar.f18490y = this.f18490y;
        cVar.U3 = this.U3;
        return cVar;
    }

    public int e() {
        if (!this.f18490y || this.U3) {
            return Integer.MAX_VALUE;
        }
        return this.f18488q;
    }

    public int f() {
        return this.f18489x;
    }

    public u g() {
        return this.f18486c;
    }

    public void h(int i10) {
        this.f18486c = null;
        this.f18488q = this.f18487d;
        this.f18489x = i10;
        this.f18490y = true;
        this.U3 = false;
    }

    public boolean i() {
        return this.U3;
    }

    public boolean j() {
        return this.f18490y;
    }

    public void k(u uVar) {
        this.f18486c = uVar;
        int b10 = uVar.b();
        this.f18488q = b10;
        if (b10 == this.f18487d) {
            this.U3 = true;
        }
    }

    public void p(Stack<u> stack, k kVar, byte[] bArr, byte[] bArr2, j jVar) {
        Objects.requireNonNull(jVar, "otsHashAddress == null");
        if (this.U3 || !this.f18490y) {
            throw new IllegalStateException("finished or not initialized");
        }
        j jVar2 = (j) new j.b().g(jVar.b()).h(jVar.c()).p(this.f18489x).n(jVar.e()).o(jVar.f()).f(jVar.a()).l();
        g gVar = (g) new g.b().g(jVar2.b()).h(jVar2.c()).n(this.f18489x).k();
        kVar.h(kVar.g(bArr2, jVar2), bArr);
        u a10 = v.a(kVar, kVar.e(jVar2), (i) new i.b().g(jVar2.b()).h(jVar2.c()).n(this.f18489x).l());
        while (!stack.isEmpty() && stack.peek().b() == a10.b() && stack.peek().b() != this.f18487d) {
            g gVar2 = (g) new g.b().g(gVar.b()).h(gVar.c()).m(gVar.e()).n((gVar.f() - 1) / 2).f(gVar.a()).k();
            u b10 = v.b(kVar, stack.pop(), a10, gVar2);
            u uVar = new u(b10.b() + 1, b10.c());
            gVar = (g) new g.b().g(gVar2.b()).h(gVar2.c()).m(gVar2.e() + 1).n(gVar2.f()).f(gVar2.a()).k();
            a10 = uVar;
        }
        u uVar2 = this.f18486c;
        if (uVar2 == null) {
            this.f18486c = a10;
        } else if (uVar2.b() == a10.b()) {
            g gVar3 = (g) new g.b().g(gVar.b()).h(gVar.c()).m(gVar.e()).n((gVar.f() - 1) / 2).f(gVar.a()).k();
            a10 = new u(this.f18486c.b() + 1, v.b(kVar, this.f18486c, a10, gVar3).c());
            this.f18486c = a10;
            g gVar4 = (g) new g.b().g(gVar3.b()).h(gVar3.c()).m(gVar3.e() + 1).n(gVar3.f()).f(gVar3.a()).k();
        } else {
            stack.push(a10);
        }
        if (this.f18486c.b() == this.f18487d) {
            this.U3 = true;
            return;
        }
        this.f18488q = a10.b();
        this.f18489x++;
    }
}
