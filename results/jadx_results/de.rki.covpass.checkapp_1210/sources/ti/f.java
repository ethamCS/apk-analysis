package ti;

import java.math.BigInteger;
import java.util.Random;
/* loaded from: classes3.dex */
public abstract class f implements ti.d {

    /* loaded from: classes3.dex */
    public static abstract class a extends f {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [ti.f] */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r4v3, types: [ti.f] */
        public f u() {
            int f10 = f();
            if ((f10 & 1) != 0) {
                int i10 = (f10 + 1) >>> 1;
                int a10 = 31 - ak.g.a(i10);
                f fVar = this;
                int i11 = 1;
                while (a10 > 0) {
                    fVar = fVar.q(i11 << 1).a(fVar);
                    a10--;
                    i11 = i10 >>> a10;
                    if ((i11 & 1) != 0) {
                        fVar = fVar.q(2).a(this);
                    }
                }
                return fVar;
            }
            throw new IllegalStateException("Half-trace only defined for odd m");
        }

        public boolean v() {
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v1, types: [ti.f] */
        /* JADX WARN: Type inference failed for: r3v3 */
        /* JADX WARN: Type inference failed for: r4v2, types: [ti.f] */
        public int w() {
            int f10 = f();
            int a10 = 31 - ak.g.a(f10);
            f fVar = this;
            int i10 = 1;
            while (a10 > 0) {
                fVar = fVar.q(i10).a(fVar);
                a10--;
                i10 = f10 >>> a10;
                if ((i10 & 1) != 0) {
                    fVar = fVar.o().a(this);
                }
            }
            if (fVar.i()) {
                return 0;
            }
            if (!fVar.h()) {
                throw new IllegalStateException("Internal error in trace calculation");
            }
            return 1;
        }
    }

    /* loaded from: classes3.dex */
    public static abstract class b extends f {
    }

    /* loaded from: classes3.dex */
    public static class c extends a {

        /* renamed from: g */
        private int f22395g;

        /* renamed from: h */
        private int f22396h;

        /* renamed from: i */
        private int[] f22397i;

        /* renamed from: j */
        o f22398j;

        public c(int i10, int i11, int i12, int i13, BigInteger bigInteger) {
            if (bigInteger == null || bigInteger.signum() < 0 || bigInteger.bitLength() > i10) {
                throw new IllegalArgumentException("x value invalid in F2m field element");
            }
            if (i12 == 0 && i13 == 0) {
                this.f22395g = 2;
                this.f22397i = new int[]{i11};
            } else if (i12 >= i13) {
                throw new IllegalArgumentException("k2 must be smaller than k3");
            } else {
                if (i12 <= 0) {
                    throw new IllegalArgumentException("k2 must be larger than 0");
                }
                this.f22395g = 3;
                this.f22397i = new int[]{i11, i12, i13};
            }
            this.f22396h = i10;
            this.f22398j = new o(bigInteger);
        }

        public c(int i10, int[] iArr, o oVar) {
            this.f22396h = i10;
            this.f22395g = iArr.length == 1 ? 2 : 3;
            this.f22397i = iArr;
            this.f22398j = oVar;
        }

        @Override // ti.f
        public f a(f fVar) {
            o oVar = (o) this.f22398j.clone();
            oVar.g(((c) fVar).f22398j, 0);
            return new c(this.f22396h, this.f22397i, oVar);
        }

        @Override // ti.f
        public f b() {
            return new c(this.f22396h, this.f22397i, this.f22398j.e());
        }

        @Override // ti.f
        public int c() {
            return this.f22398j.l();
        }

        @Override // ti.f
        public f d(f fVar) {
            return j(fVar.g());
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f22396h == cVar.f22396h && this.f22395g == cVar.f22395g && ak.a.e(this.f22397i, cVar.f22397i) && this.f22398j.equals(cVar.f22398j);
        }

        @Override // ti.f
        public int f() {
            return this.f22396h;
        }

        @Override // ti.f
        public f g() {
            int i10 = this.f22396h;
            int[] iArr = this.f22397i;
            return new c(i10, iArr, this.f22398j.A(i10, iArr));
        }

        @Override // ti.f
        public boolean h() {
            return this.f22398j.x();
        }

        public int hashCode() {
            return (this.f22398j.hashCode() ^ this.f22396h) ^ ak.a.I(this.f22397i);
        }

        @Override // ti.f
        public boolean i() {
            return this.f22398j.y();
        }

        @Override // ti.f
        public f j(f fVar) {
            int i10 = this.f22396h;
            int[] iArr = this.f22397i;
            return new c(i10, iArr, this.f22398j.B(((c) fVar).f22398j, i10, iArr));
        }

        @Override // ti.f
        public f k(f fVar, f fVar2, f fVar3) {
            return l(fVar, fVar2, fVar3);
        }

        @Override // ti.f
        public f l(f fVar, f fVar2, f fVar3) {
            o oVar = this.f22398j;
            o oVar2 = ((c) fVar).f22398j;
            o oVar3 = ((c) fVar2).f22398j;
            o oVar4 = ((c) fVar3).f22398j;
            o E = oVar.E(oVar2, this.f22396h, this.f22397i);
            o E2 = oVar3.E(oVar4, this.f22396h, this.f22397i);
            if (E == oVar || E == oVar2) {
                E = (o) E.clone();
            }
            E.g(E2, 0);
            E.H(this.f22396h, this.f22397i);
            return new c(this.f22396h, this.f22397i, E);
        }

        @Override // ti.f
        public f m() {
            return this;
        }

        @Override // ti.f
        public f n() {
            return (this.f22398j.y() || this.f22398j.x()) ? this : q(this.f22396h - 1);
        }

        @Override // ti.f
        public f o() {
            int i10 = this.f22396h;
            int[] iArr = this.f22397i;
            return new c(i10, iArr, this.f22398j.C(i10, iArr));
        }

        @Override // ti.f
        public f p(f fVar, f fVar2) {
            o oVar = this.f22398j;
            o oVar2 = ((c) fVar).f22398j;
            o oVar3 = ((c) fVar2).f22398j;
            o R = oVar.R(this.f22396h, this.f22397i);
            o E = oVar2.E(oVar3, this.f22396h, this.f22397i);
            if (R == oVar) {
                R = (o) R.clone();
            }
            R.g(E, 0);
            R.H(this.f22396h, this.f22397i);
            return new c(this.f22396h, this.f22397i, R);
        }

        @Override // ti.f
        public f q(int i10) {
            if (i10 < 1) {
                return this;
            }
            int i11 = this.f22396h;
            int[] iArr = this.f22397i;
            return new c(i11, iArr, this.f22398j.D(i10, i11, iArr));
        }

        @Override // ti.f
        public f r(f fVar) {
            return a(fVar);
        }

        @Override // ti.f
        public boolean s() {
            return this.f22398j.U();
        }

        @Override // ti.f
        public BigInteger t() {
            return this.f22398j.V();
        }
    }

    /* loaded from: classes3.dex */
    public static class d extends b {

        /* renamed from: g */
        BigInteger f22399g;

        /* renamed from: h */
        BigInteger f22400h;

        /* renamed from: i */
        BigInteger f22401i;

        public d(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            if (bigInteger3 == null || bigInteger3.signum() < 0 || bigInteger3.compareTo(bigInteger) >= 0) {
                throw new IllegalArgumentException("x value invalid in Fp field element");
            }
            this.f22399g = bigInteger;
            this.f22400h = bigInteger2;
            this.f22401i = bigInteger3;
        }

        public static BigInteger u(BigInteger bigInteger) {
            int bitLength = bigInteger.bitLength();
            if (bitLength < 96 || bigInteger.shiftRight(bitLength - 64).longValue() != -1) {
                return null;
            }
            return ti.d.f22360b.shiftLeft(bitLength).subtract(bigInteger);
        }

        private f v(f fVar) {
            if (fVar.o().equals(this)) {
                return fVar;
            }
            return null;
        }

        private BigInteger[] w(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3) {
            int bitLength = bigInteger3.bitLength();
            int lowestSetBit = bigInteger3.getLowestSetBit();
            BigInteger bigInteger4 = ti.d.f22360b;
            BigInteger bigInteger5 = bigInteger;
            BigInteger bigInteger6 = bigInteger4;
            BigInteger bigInteger7 = ti.d.f22361c;
            BigInteger bigInteger8 = bigInteger6;
            for (int i10 = bitLength - 1; i10 >= lowestSetBit + 1; i10--) {
                bigInteger4 = B(bigInteger4, bigInteger8);
                if (bigInteger3.testBit(i10)) {
                    bigInteger8 = B(bigInteger4, bigInteger2);
                    bigInteger6 = B(bigInteger6, bigInteger5);
                    bigInteger7 = C(bigInteger5.multiply(bigInteger7).subtract(bigInteger.multiply(bigInteger4)));
                    bigInteger5 = C(bigInteger5.multiply(bigInteger5).subtract(bigInteger8.shiftLeft(1)));
                } else {
                    BigInteger C = C(bigInteger6.multiply(bigInteger7).subtract(bigInteger4));
                    BigInteger C2 = C(bigInteger5.multiply(bigInteger7).subtract(bigInteger.multiply(bigInteger4)));
                    bigInteger7 = C(bigInteger7.multiply(bigInteger7).subtract(bigInteger4.shiftLeft(1)));
                    bigInteger5 = C2;
                    bigInteger6 = C;
                    bigInteger8 = bigInteger4;
                }
            }
            BigInteger B = B(bigInteger4, bigInteger8);
            BigInteger B2 = B(B, bigInteger2);
            BigInteger C3 = C(bigInteger6.multiply(bigInteger7).subtract(B));
            BigInteger C4 = C(bigInteger5.multiply(bigInteger7).subtract(bigInteger.multiply(B)));
            BigInteger B3 = B(B, B2);
            for (int i11 = 1; i11 <= lowestSetBit; i11++) {
                C3 = B(C3, C4);
                C4 = C(C4.multiply(C4).subtract(B3.shiftLeft(1)));
                B3 = B(B3, B3);
            }
            return new BigInteger[]{C3, C4};
        }

        protected BigInteger A(BigInteger bigInteger) {
            return ak.b.j(this.f22399g, bigInteger);
        }

        protected BigInteger B(BigInteger bigInteger, BigInteger bigInteger2) {
            return C(bigInteger.multiply(bigInteger2));
        }

        protected BigInteger C(BigInteger bigInteger) {
            if (this.f22400h != null) {
                boolean z10 = bigInteger.signum() < 0;
                if (z10) {
                    bigInteger = bigInteger.abs();
                }
                int bitLength = this.f22399g.bitLength();
                boolean equals = this.f22400h.equals(ti.d.f22360b);
                while (bigInteger.bitLength() > bitLength + 1) {
                    BigInteger shiftRight = bigInteger.shiftRight(bitLength);
                    BigInteger subtract = bigInteger.subtract(shiftRight.shiftLeft(bitLength));
                    if (!equals) {
                        shiftRight = shiftRight.multiply(this.f22400h);
                    }
                    bigInteger = shiftRight.add(subtract);
                }
                while (bigInteger.compareTo(this.f22399g) >= 0) {
                    bigInteger = bigInteger.subtract(this.f22399g);
                }
                return (!z10 || bigInteger.signum() == 0) ? bigInteger : this.f22399g.subtract(bigInteger);
            }
            return bigInteger.mod(this.f22399g);
        }

        protected BigInteger D(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger subtract = bigInteger.subtract(bigInteger2);
            return subtract.signum() < 0 ? subtract.add(this.f22399g) : subtract;
        }

        @Override // ti.f
        public f a(f fVar) {
            return new d(this.f22399g, this.f22400h, x(this.f22401i, fVar.t()));
        }

        @Override // ti.f
        public f b() {
            BigInteger add = this.f22401i.add(ti.d.f22360b);
            if (add.compareTo(this.f22399g) == 0) {
                add = ti.d.f22359a;
            }
            return new d(this.f22399g, this.f22400h, add);
        }

        @Override // ti.f
        public f d(f fVar) {
            return new d(this.f22399g, this.f22400h, B(this.f22401i, A(fVar.t())));
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f22399g.equals(dVar.f22399g) && this.f22401i.equals(dVar.f22401i);
        }

        @Override // ti.f
        public int f() {
            return this.f22399g.bitLength();
        }

        @Override // ti.f
        public f g() {
            return new d(this.f22399g, this.f22400h, A(this.f22401i));
        }

        public int hashCode() {
            return this.f22399g.hashCode() ^ this.f22401i.hashCode();
        }

        @Override // ti.f
        public f j(f fVar) {
            return new d(this.f22399g, this.f22400h, B(this.f22401i, fVar.t()));
        }

        @Override // ti.f
        public f k(f fVar, f fVar2, f fVar3) {
            BigInteger bigInteger = this.f22401i;
            BigInteger t10 = fVar.t();
            BigInteger t11 = fVar2.t();
            BigInteger t12 = fVar3.t();
            return new d(this.f22399g, this.f22400h, C(bigInteger.multiply(t10).subtract(t11.multiply(t12))));
        }

        @Override // ti.f
        public f l(f fVar, f fVar2, f fVar3) {
            BigInteger bigInteger = this.f22401i;
            BigInteger t10 = fVar.t();
            BigInteger t11 = fVar2.t();
            BigInteger t12 = fVar3.t();
            return new d(this.f22399g, this.f22400h, C(bigInteger.multiply(t10).add(t11.multiply(t12))));
        }

        @Override // ti.f
        public f m() {
            if (this.f22401i.signum() == 0) {
                return this;
            }
            BigInteger bigInteger = this.f22399g;
            return new d(bigInteger, this.f22400h, bigInteger.subtract(this.f22401i));
        }

        @Override // ti.f
        public f n() {
            if (i() || h()) {
                return this;
            }
            if (!this.f22399g.testBit(0)) {
                throw new RuntimeException("not done yet");
            }
            if (this.f22399g.testBit(1)) {
                BigInteger add = this.f22399g.shiftRight(2).add(ti.d.f22360b);
                BigInteger bigInteger = this.f22399g;
                return v(new d(bigInteger, this.f22400h, this.f22401i.modPow(add, bigInteger)));
            } else if (this.f22399g.testBit(2)) {
                BigInteger modPow = this.f22401i.modPow(this.f22399g.shiftRight(3), this.f22399g);
                BigInteger B = B(modPow, this.f22401i);
                if (B(B, modPow).equals(ti.d.f22360b)) {
                    return v(new d(this.f22399g, this.f22400h, B));
                }
                return v(new d(this.f22399g, this.f22400h, B(B, ti.d.f22361c.modPow(this.f22399g.shiftRight(2), this.f22399g))));
            } else {
                BigInteger shiftRight = this.f22399g.shiftRight(1);
                BigInteger modPow2 = this.f22401i.modPow(shiftRight, this.f22399g);
                BigInteger bigInteger2 = ti.d.f22360b;
                if (!modPow2.equals(bigInteger2)) {
                    return null;
                }
                BigInteger bigInteger3 = this.f22401i;
                BigInteger y10 = y(y(bigInteger3));
                BigInteger add2 = shiftRight.add(bigInteger2);
                BigInteger subtract = this.f22399g.subtract(bigInteger2);
                Random random = new Random();
                while (true) {
                    BigInteger bigInteger4 = new BigInteger(this.f22399g.bitLength(), random);
                    if (bigInteger4.compareTo(this.f22399g) < 0 && C(bigInteger4.multiply(bigInteger4).subtract(y10)).modPow(shiftRight, this.f22399g).equals(subtract)) {
                        BigInteger[] w9 = w(bigInteger4, bigInteger3, add2);
                        BigInteger bigInteger5 = w9[0];
                        BigInteger bigInteger6 = w9[1];
                        if (B(bigInteger6, bigInteger6).equals(y10)) {
                            return new d(this.f22399g, this.f22400h, z(bigInteger6));
                        }
                        if (!bigInteger5.equals(ti.d.f22360b) && !bigInteger5.equals(subtract)) {
                            return null;
                        }
                    }
                }
            }
        }

        @Override // ti.f
        public f o() {
            BigInteger bigInteger = this.f22399g;
            BigInteger bigInteger2 = this.f22400h;
            BigInteger bigInteger3 = this.f22401i;
            return new d(bigInteger, bigInteger2, B(bigInteger3, bigInteger3));
        }

        @Override // ti.f
        public f p(f fVar, f fVar2) {
            BigInteger bigInteger = this.f22401i;
            BigInteger t10 = fVar.t();
            BigInteger t11 = fVar2.t();
            return new d(this.f22399g, this.f22400h, C(bigInteger.multiply(bigInteger).add(t10.multiply(t11))));
        }

        @Override // ti.f
        public f r(f fVar) {
            return new d(this.f22399g, this.f22400h, D(this.f22401i, fVar.t()));
        }

        @Override // ti.f
        public BigInteger t() {
            return this.f22401i;
        }

        protected BigInteger x(BigInteger bigInteger, BigInteger bigInteger2) {
            BigInteger add = bigInteger.add(bigInteger2);
            return add.compareTo(this.f22399g) >= 0 ? add.subtract(this.f22399g) : add;
        }

        protected BigInteger y(BigInteger bigInteger) {
            BigInteger shiftLeft = bigInteger.shiftLeft(1);
            return shiftLeft.compareTo(this.f22399g) >= 0 ? shiftLeft.subtract(this.f22399g) : shiftLeft;
        }

        protected BigInteger z(BigInteger bigInteger) {
            if (bigInteger.testBit(0)) {
                bigInteger = this.f22399g.subtract(bigInteger);
            }
            return bigInteger.shiftRight(1);
        }
    }

    public abstract f a(f fVar);

    public abstract f b();

    public int c() {
        return t().bitLength();
    }

    public abstract f d(f fVar);

    public byte[] e() {
        return ak.b.b((f() + 7) / 8, t());
    }

    public abstract int f();

    public abstract f g();

    public boolean h() {
        return c() == 1;
    }

    public boolean i() {
        return t().signum() == 0;
    }

    public abstract f j(f fVar);

    public f k(f fVar, f fVar2, f fVar3) {
        return j(fVar).r(fVar2.j(fVar3));
    }

    public f l(f fVar, f fVar2, f fVar3) {
        return j(fVar).a(fVar2.j(fVar3));
    }

    public abstract f m();

    public abstract f n();

    public abstract f o();

    public f p(f fVar, f fVar2) {
        return o().a(fVar.j(fVar2));
    }

    public f q(int i10) {
        f fVar = this;
        for (int i11 = 0; i11 < i10; i11++) {
            fVar = fVar.o();
        }
        return fVar;
    }

    public abstract f r(f fVar);

    public boolean s() {
        return t().testBit(0);
    }

    public abstract BigInteger t();

    public String toString() {
        return t().toString(16);
    }
}
