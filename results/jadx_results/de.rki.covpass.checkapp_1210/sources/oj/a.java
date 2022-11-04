package oj;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Stack;
import java.util.TreeMap;
import oj.g;
import oj.i;
import oj.j;
/* loaded from: classes3.dex */
public final class a implements Serializable {
    private List<u> U3;
    private Map<Integer, LinkedList<u>> V3;
    private Stack<u> W3;
    private Map<Integer, u> X3;
    private int Y3;
    private boolean Z3;

    /* renamed from: a4 */
    private transient int f18475a4;

    /* renamed from: c */
    private transient k f18476c;

    /* renamed from: d */
    private final int f18477d;

    /* renamed from: q */
    private final List<c> f18478q;

    /* renamed from: x */
    private int f18479x;

    /* renamed from: y */
    private u f18480y;

    public a(a aVar) {
        this.f18476c = new k(aVar.f18476c.d());
        this.f18477d = aVar.f18477d;
        this.f18479x = aVar.f18479x;
        this.f18480y = aVar.f18480y;
        ArrayList arrayList = new ArrayList();
        this.U3 = arrayList;
        arrayList.addAll(aVar.U3);
        this.V3 = new TreeMap();
        for (Integer num : aVar.V3.keySet()) {
            this.V3.put(num, (LinkedList) aVar.V3.get(num).clone());
        }
        Stack<u> stack = new Stack<>();
        this.W3 = stack;
        stack.addAll(aVar.W3);
        this.f18478q = new ArrayList();
        for (c cVar : aVar.f18478q) {
            this.f18478q.add(cVar.clone());
        }
        this.X3 = new TreeMap(aVar.X3);
        this.Y3 = aVar.Y3;
        this.f18475a4 = aVar.f18475a4;
        this.Z3 = aVar.Z3;
    }

    private a(a aVar, gg.v vVar) {
        this.f18476c = new k(new m(vVar));
        this.f18477d = aVar.f18477d;
        this.f18479x = aVar.f18479x;
        this.f18480y = aVar.f18480y;
        ArrayList arrayList = new ArrayList();
        this.U3 = arrayList;
        arrayList.addAll(aVar.U3);
        this.V3 = new TreeMap();
        for (Integer num : aVar.V3.keySet()) {
            this.V3.put(num, (LinkedList) aVar.V3.get(num).clone());
        }
        Stack<u> stack = new Stack<>();
        this.W3 = stack;
        stack.addAll(aVar.W3);
        this.f18478q = new ArrayList();
        for (c cVar : aVar.f18478q) {
            this.f18478q.add(cVar.clone());
        }
        this.X3 = new TreeMap(aVar.X3);
        this.Y3 = aVar.Y3;
        this.f18475a4 = aVar.f18475a4;
        this.Z3 = aVar.Z3;
        i();
    }

    private a(a aVar, byte[] bArr, byte[] bArr2, j jVar) {
        this.f18476c = new k(aVar.f18476c.d());
        this.f18477d = aVar.f18477d;
        this.f18479x = aVar.f18479x;
        this.f18480y = aVar.f18480y;
        ArrayList arrayList = new ArrayList();
        this.U3 = arrayList;
        arrayList.addAll(aVar.U3);
        this.V3 = new TreeMap();
        for (Integer num : aVar.V3.keySet()) {
            this.V3.put(num, (LinkedList) aVar.V3.get(num).clone());
        }
        Stack<u> stack = new Stack<>();
        this.W3 = stack;
        stack.addAll(aVar.W3);
        this.f18478q = new ArrayList();
        for (c cVar : aVar.f18478q) {
            this.f18478q.add(cVar.clone());
        }
        this.X3 = new TreeMap(aVar.X3);
        this.Y3 = aVar.Y3;
        this.f18475a4 = aVar.f18475a4;
        this.Z3 = false;
        h(bArr, bArr2, jVar);
    }

    private a(k kVar, int i10, int i11, int i12) {
        this.f18476c = kVar;
        this.f18477d = i10;
        this.f18475a4 = i12;
        this.f18479x = i11;
        if (i11 <= i10 && i11 >= 2) {
            int i13 = i10 - i11;
            if (i13 % 2 == 0) {
                this.U3 = new ArrayList();
                this.V3 = new TreeMap();
                this.W3 = new Stack<>();
                this.f18478q = new ArrayList();
                for (int i14 = 0; i14 < i13; i14++) {
                    this.f18478q.add(new c(i14));
                }
                this.X3 = new TreeMap();
                this.Y3 = 0;
                this.Z3 = false;
                return;
            }
        }
        throw new IllegalArgumentException("illegal value for BDS parameter k");
    }

    public a(x xVar, int i10, int i11) {
        this(xVar.i(), xVar.b(), xVar.c(), i11);
        this.f18475a4 = i10;
        this.Y3 = i11;
        this.Z3 = true;
    }

    public a(x xVar, byte[] bArr, byte[] bArr2, j jVar) {
        this(xVar.i(), xVar.b(), xVar.c(), (1 << xVar.b()) - 1);
        g(bArr, bArr2, jVar);
    }

    public a(x xVar, byte[] bArr, byte[] bArr2, j jVar, int i10) {
        this(xVar.i(), xVar.b(), xVar.c(), (1 << xVar.b()) - 1);
        g(bArr, bArr2, jVar);
        while (this.Y3 < i10) {
            h(bArr, bArr2, jVar);
            this.Z3 = false;
        }
    }

    private c b() {
        c cVar = null;
        for (c cVar2 : this.f18478q) {
            if (!cVar2.i() && cVar2.j() && (cVar == null || cVar2.e() < cVar.e() || (cVar2.e() == cVar.e() && cVar2.f() < cVar.f()))) {
                cVar = cVar2;
            }
        }
        return cVar;
    }

    private void g(byte[] bArr, byte[] bArr2, j jVar) {
        Objects.requireNonNull(jVar, "otsHashAddress == null");
        i iVar = (i) new i.b().g(jVar.b()).h(jVar.c()).l();
        g gVar = (g) new g.b().g(jVar.b()).h(jVar.c()).k();
        for (int i10 = 0; i10 < (1 << this.f18477d); i10++) {
            jVar = (j) new j.b().g(jVar.b()).h(jVar.c()).p(i10).n(jVar.e()).o(jVar.f()).f(jVar.a()).l();
            k kVar = this.f18476c;
            kVar.h(kVar.g(bArr2, jVar), bArr);
            n e10 = this.f18476c.e(jVar);
            iVar = (i) new i.b().g(iVar.b()).h(iVar.c()).n(i10).o(iVar.f()).p(iVar.g()).f(iVar.a()).l();
            u a10 = v.a(this.f18476c, e10, iVar);
            gVar = (g) new g.b().g(gVar.b()).h(gVar.c()).n(i10).f(gVar.a()).k();
            while (!this.W3.isEmpty() && this.W3.peek().b() == a10.b()) {
                int b10 = i10 / (1 << a10.b());
                if (b10 == 1) {
                    this.U3.add(a10);
                }
                if (b10 == 3 && a10.b() < this.f18477d - this.f18479x) {
                    this.f18478q.get(a10.b()).k(a10);
                }
                if (b10 >= 3 && (b10 & 1) == 1 && a10.b() >= this.f18477d - this.f18479x && a10.b() <= this.f18477d - 2) {
                    if (this.V3.get(Integer.valueOf(a10.b())) == null) {
                        LinkedList<u> linkedList = new LinkedList<>();
                        linkedList.add(a10);
                        this.V3.put(Integer.valueOf(a10.b()), linkedList);
                    } else {
                        this.V3.get(Integer.valueOf(a10.b())).add(a10);
                    }
                }
                g gVar2 = (g) new g.b().g(gVar.b()).h(gVar.c()).m(gVar.e()).n((gVar.f() - 1) / 2).f(gVar.a()).k();
                u b11 = v.b(this.f18476c, this.W3.pop(), a10, gVar2);
                u uVar = new u(b11.b() + 1, b11.c());
                gVar = (g) new g.b().g(gVar2.b()).h(gVar2.c()).m(gVar2.e() + 1).n(gVar2.f()).f(gVar2.a()).k();
                a10 = uVar;
            }
            this.W3.push(a10);
        }
        this.f18480y = this.W3.pop();
    }

    private void h(byte[] bArr, byte[] bArr2, j jVar) {
        u uVar;
        List<u> list;
        Objects.requireNonNull(jVar, "otsHashAddress == null");
        if (!this.Z3) {
            int i10 = this.Y3;
            if (i10 > this.f18475a4 - 1) {
                throw new IllegalStateException("index out of bounds");
            }
            int b10 = a0.b(i10, this.f18477d);
            if (((this.Y3 >> (b10 + 1)) & 1) == 0 && b10 < this.f18477d - 1) {
                this.X3.put(Integer.valueOf(b10), this.U3.get(b10));
            }
            i iVar = (i) new i.b().g(jVar.b()).h(jVar.c()).l();
            g gVar = (g) new g.b().g(jVar.b()).h(jVar.c()).k();
            if (b10 == 0) {
                jVar = (j) new j.b().g(jVar.b()).h(jVar.c()).p(this.Y3).n(jVar.e()).o(jVar.f()).f(jVar.a()).l();
                k kVar = this.f18476c;
                kVar.h(kVar.g(bArr2, jVar), bArr);
                this.U3.set(0, v.a(this.f18476c, this.f18476c.e(jVar), (i) new i.b().g(iVar.b()).h(iVar.c()).n(this.Y3).o(iVar.f()).p(iVar.g()).f(iVar.a()).l()));
            } else {
                int i11 = b10 - 1;
                k kVar2 = this.f18476c;
                kVar2.h(kVar2.g(bArr2, jVar), bArr);
                u b11 = v.b(this.f18476c, this.U3.get(i11), this.X3.get(Integer.valueOf(i11)), (g) new g.b().g(gVar.b()).h(gVar.c()).m(i11).n(this.Y3 >> b10).f(gVar.a()).k());
                this.U3.set(b10, new u(b11.b() + 1, b11.c()));
                this.X3.remove(Integer.valueOf(i11));
                for (int i12 = 0; i12 < b10; i12++) {
                    if (i12 < this.f18477d - this.f18479x) {
                        list = this.U3;
                        uVar = this.f18478q.get(i12).g();
                    } else {
                        list = this.U3;
                        uVar = this.V3.get(Integer.valueOf(i12)).removeFirst();
                    }
                    list.set(i12, uVar);
                }
                int min = Math.min(b10, this.f18477d - this.f18479x);
                for (int i13 = 0; i13 < min; i13++) {
                    int i14 = this.Y3 + 1 + ((1 << i13) * 3);
                    if (i14 < (1 << this.f18477d)) {
                        this.f18478q.get(i13).h(i14);
                    }
                }
            }
            for (int i15 = 0; i15 < ((this.f18477d - this.f18479x) >> 1); i15++) {
                c b12 = b();
                if (b12 != null) {
                    b12.p(this.W3, this.f18476c, bArr, bArr2, jVar);
                }
            }
            this.Y3++;
            return;
        }
        throw new IllegalStateException("index already used");
    }

    private void i() {
        if (this.U3 != null) {
            if (this.V3 == null) {
                throw new IllegalStateException("retain == null");
            }
            if (this.W3 == null) {
                throw new IllegalStateException("stack == null");
            }
            if (this.f18478q == null) {
                throw new IllegalStateException("treeHashInstances == null");
            }
            if (this.X3 == null) {
                throw new IllegalStateException("keep == null");
            }
            if (!a0.l(this.f18477d, this.Y3)) {
                throw new IllegalStateException("index in BDS state out of bounds");
            }
            return;
        }
        throw new IllegalStateException("authenticationPath == null");
    }

    public int c() {
        return this.Y3;
    }

    public int e() {
        return this.f18475a4;
    }

    public a f(byte[] bArr, byte[] bArr2, j jVar) {
        return new a(this, bArr, bArr2, jVar);
    }

    public a j(gg.v vVar) {
        return new a(this, vVar);
    }
}
