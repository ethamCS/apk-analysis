package gg;

import ak.a;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
/* loaded from: classes3.dex */
public abstract class d0 extends a0 implements Iterable {

    /* renamed from: d */
    static final o0 f10794d = new a(d0.class, 16);

    /* renamed from: c */
    g[] f10795c;

    /* loaded from: classes3.dex */
    static class a extends o0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // gg.o0
        public a0 c(d0 d0Var) {
            return d0Var;
        }
    }

    /* loaded from: classes3.dex */
    public class b implements Enumeration {

        /* renamed from: a */
        private int f10796a = 0;

        b() {
            d0.this = r1;
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f10796a < d0.this.f10795c.length;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            int i10 = this.f10796a;
            g[] gVarArr = d0.this.f10795c;
            if (i10 < gVarArr.length) {
                this.f10796a = i10 + 1;
                return gVarArr[i10];
            }
            throw new NoSuchElementException();
        }
    }

    public d0() {
        this.f10795c = h.f10819d;
    }

    public d0(g gVar) {
        Objects.requireNonNull(gVar, "'element' cannot be null");
        this.f10795c = new g[]{gVar};
    }

    public d0(h hVar) {
        Objects.requireNonNull(hVar, "'elementVector' cannot be null");
        this.f10795c = hVar.g();
    }

    public d0(g[] gVarArr) {
        if (!ak.a.O(gVarArr)) {
            this.f10795c = h.b(gVarArr);
            return;
        }
        throw new NullPointerException("'elements' cannot be null, or contain null");
    }

    public d0(g[] gVarArr, boolean z10) {
        this.f10795c = z10 ? h.b(gVarArr) : gVarArr;
    }

    public static d0 E(j0 j0Var, boolean z10) {
        return (d0) f10794d.e(j0Var, z10);
    }

    public static d0 F(Object obj) {
        if (obj == null || (obj instanceof d0)) {
            return (d0) obj;
        }
        if (obj instanceof g) {
            a0 b10 = ((g) obj).b();
            if (b10 instanceof d0) {
                return (d0) b10;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (d0) f10794d.b((byte[]) obj);
            } catch (IOException e10) {
                throw new IllegalArgumentException("failed to construct sequence from byte[]: " + e10.getMessage());
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    public c[] C() {
        int size = size();
        c[] cVarArr = new c[size];
        for (int i10 = 0; i10 < size; i10++) {
            cVarArr[i10] = c.F(this.f10795c[i10]);
        }
        return cVarArr;
    }

    public w[] D() {
        int size = size();
        w[] wVarArr = new w[size];
        for (int i10 = 0; i10 < size; i10++) {
            wVarArr[i10] = w.E(this.f10795c[i10]);
        }
        return wVarArr;
    }

    public g G(int i10) {
        return this.f10795c[i10];
    }

    public Enumeration H() {
        return new b();
    }

    public abstract c J();

    public abstract k K();

    public abstract w L();

    public abstract e0 M();

    public g[] N() {
        return this.f10795c;
    }

    @Override // gg.a0, gg.t
    public int hashCode() {
        int length = this.f10795c.length;
        int i10 = length + 1;
        while (true) {
            length--;
            if (length >= 0) {
                i10 = (i10 * 257) ^ this.f10795c[length].b().hashCode();
            } else {
                return i10;
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator<g> iterator() {
        return new a.C0009a(this.f10795c);
    }

    @Override // gg.a0
    public boolean l(a0 a0Var) {
        if (!(a0Var instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) a0Var;
        int size = size();
        if (d0Var.size() != size) {
            return false;
        }
        for (int i10 = 0; i10 < size; i10++) {
            a0 b10 = this.f10795c[i10].b();
            a0 b11 = d0Var.f10795c[i10].b();
            if (b10 != b11 && !b10.l(b11)) {
                return false;
            }
        }
        return true;
    }

    @Override // gg.a0
    public boolean n() {
        return true;
    }

    public int size() {
        return this.f10795c.length;
    }

    public String toString() {
        int size = size();
        if (size == 0) {
            return "[]";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('[');
        int i10 = 0;
        while (true) {
            stringBuffer.append(this.f10795c[i10]);
            i10++;
            if (i10 >= size) {
                stringBuffer.append(']');
                return stringBuffer.toString();
            }
            stringBuffer.append(", ");
        }
    }

    @Override // gg.a0
    public a0 w() {
        return new x1(this.f10795c, false);
    }

    @Override // gg.a0
    public a0 z() {
        return new l2(this.f10795c, false);
    }
}
