package gg;

import ak.a;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
/* loaded from: classes3.dex */
public abstract class e0 extends a0 implements Iterable {

    /* renamed from: q */
    static final o0 f10803q = new a(e0.class, 17);

    /* renamed from: c */
    protected final g[] f10804c;

    /* renamed from: d */
    protected final boolean f10805d;

    /* loaded from: classes3.dex */
    static class a extends o0 {
        a(Class cls, int i10) {
            super(cls, i10);
        }

        @Override // gg.o0
        public a0 c(d0 d0Var) {
            return d0Var.M();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public class b implements Enumeration {

        /* renamed from: a */
        private int f10806a = 0;

        b() {
            e0.this = r1;
        }

        @Override // java.util.Enumeration
        public boolean hasMoreElements() {
            return this.f10806a < e0.this.f10804c.length;
        }

        @Override // java.util.Enumeration
        public Object nextElement() {
            int i10 = this.f10806a;
            g[] gVarArr = e0.this.f10804c;
            if (i10 < gVarArr.length) {
                this.f10806a = i10 + 1;
                return gVarArr[i10];
            }
            throw new NoSuchElementException();
        }
    }

    public e0() {
        this.f10804c = h.f10819d;
        this.f10805d = true;
    }

    public e0(g gVar) {
        Objects.requireNonNull(gVar, "'element' cannot be null");
        this.f10804c = new g[]{gVar};
        this.f10805d = true;
    }

    public e0(h hVar, boolean z10) {
        g[] gVarArr;
        Objects.requireNonNull(hVar, "'elementVector' cannot be null");
        if (!z10 || hVar.f() < 2) {
            gVarArr = hVar.g();
        } else {
            gVarArr = hVar.c();
            J(gVarArr);
        }
        this.f10804c = gVarArr;
        this.f10805d = z10 || gVarArr.length < 2;
    }

    public e0(boolean z10, g[] gVarArr) {
        this.f10804c = gVarArr;
        this.f10805d = z10 || gVarArr.length < 2;
    }

    public e0(g[] gVarArr, boolean z10) {
        if (!ak.a.O(gVarArr)) {
            g[] b10 = h.b(gVarArr);
            if (z10 && b10.length >= 2) {
                J(b10);
            }
            this.f10804c = b10;
            this.f10805d = z10 || b10.length < 2;
            return;
        }
        throw new NullPointerException("'elements' cannot be null, or contain null");
    }

    private static byte[] C(g gVar) {
        try {
            return gVar.b().k("DER");
        } catch (IOException unused) {
            throw new IllegalArgumentException("cannot encode object added to SET");
        }
    }

    public static e0 D(j0 j0Var, boolean z10) {
        return (e0) f10803q.e(j0Var, z10);
    }

    public static e0 E(Object obj) {
        if (obj == null || (obj instanceof e0)) {
            return (e0) obj;
        }
        if (obj instanceof g) {
            a0 b10 = ((g) obj).b();
            if (b10 instanceof e0) {
                return (e0) b10;
            }
        } else if (obj instanceof byte[]) {
            try {
                return (e0) f10803q.b((byte[]) obj);
            } catch (IOException e10) {
                throw new IllegalArgumentException("failed to construct set from byte[]: " + e10.getMessage());
            }
        }
        throw new IllegalArgumentException("unknown object in getInstance: " + obj.getClass().getName());
    }

    private static boolean H(byte[] bArr, byte[] bArr2) {
        int i10 = bArr[0] & (-33);
        int i11 = bArr2[0] & (-33);
        if (i10 != i11) {
            return i10 < i11;
        }
        int min = Math.min(bArr.length, bArr2.length) - 1;
        for (int i12 = 1; i12 < min; i12++) {
            if (bArr[i12] != bArr2[i12]) {
                return (bArr[i12] & 255) < (bArr2[i12] & 255);
            }
        }
        return (bArr[min] & 255) <= (bArr2[min] & 255);
    }

    private static void J(g[] gVarArr) {
        int length = gVarArr.length;
        if (length < 2) {
            return;
        }
        g gVar = gVarArr[0];
        g gVar2 = gVarArr[1];
        byte[] C = C(gVar);
        byte[] C2 = C(gVar2);
        if (H(C2, C)) {
            gVar2 = gVar;
            gVar = gVar2;
            C2 = C;
            C = C2;
        }
        for (int i10 = 2; i10 < length; i10++) {
            g gVar3 = gVarArr[i10];
            byte[] C3 = C(gVar3);
            if (H(C2, C3)) {
                gVarArr[i10 - 2] = gVar;
                gVar = gVar2;
                C = C2;
                gVar2 = gVar3;
                C2 = C3;
            } else if (H(C, C3)) {
                gVarArr[i10 - 2] = gVar;
                gVar = gVar3;
                C = C3;
            } else {
                int i11 = i10 - 1;
                while (true) {
                    i11--;
                    if (i11 <= 0) {
                        break;
                    }
                    g gVar4 = gVarArr[i11 - 1];
                    if (H(C(gVar4), C3)) {
                        break;
                    }
                    gVarArr[i11] = gVar4;
                }
                gVarArr[i11] = gVar3;
            }
        }
        gVarArr[length - 2] = gVar;
        gVarArr[length - 1] = gVar2;
    }

    public g F(int i10) {
        return this.f10804c[i10];
    }

    public Enumeration G() {
        return new b();
    }

    public g[] K() {
        return h.b(this.f10804c);
    }

    @Override // gg.a0, gg.t
    public int hashCode() {
        int length = this.f10804c.length;
        int i10 = length + 1;
        while (true) {
            length--;
            if (length >= 0) {
                i10 += this.f10804c[length].b().hashCode();
            } else {
                return i10;
            }
        }
    }

    @Override // java.lang.Iterable
    public Iterator<g> iterator() {
        return new a.C0009a(K());
    }

    @Override // gg.a0
    public boolean l(a0 a0Var) {
        if (!(a0Var instanceof e0)) {
            return false;
        }
        e0 e0Var = (e0) a0Var;
        int size = size();
        if (e0Var.size() != size) {
            return false;
        }
        y1 y1Var = (y1) w();
        y1 y1Var2 = (y1) e0Var.w();
        for (int i10 = 0; i10 < size; i10++) {
            a0 b10 = y1Var.f10804c[i10].b();
            a0 b11 = y1Var2.f10804c[i10].b();
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
        return this.f10804c.length;
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
            stringBuffer.append(this.f10804c[i10]);
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
        g[] gVarArr;
        if (this.f10805d) {
            gVarArr = this.f10804c;
        } else {
            gVarArr = (g[]) this.f10804c.clone();
            J(gVarArr);
        }
        return new y1(true, gVarArr);
    }

    @Override // gg.a0
    public a0 z() {
        return new n2(this.f10805d, this.f10804c);
    }
}
