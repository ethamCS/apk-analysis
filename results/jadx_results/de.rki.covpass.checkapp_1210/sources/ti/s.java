package ti;

import java.math.BigInteger;
/* loaded from: classes3.dex */
class s {

    /* renamed from: a */
    private final BigInteger f22424a;

    /* renamed from: b */
    private final int f22425b;

    public s(BigInteger bigInteger, int i10) {
        if (i10 >= 0) {
            this.f22424a = bigInteger;
            this.f22425b = i10;
            return;
        }
        throw new IllegalArgumentException("scale may not be negative");
    }

    private void c(s sVar) {
        if (this.f22425b == sVar.f22425b) {
            return;
        }
        throw new IllegalArgumentException("Only SimpleBigDecimal of same scale allowed in arithmetic operations");
    }

    public s a(s sVar) {
        c(sVar);
        return new s(this.f22424a.add(sVar.f22424a), this.f22425b);
    }

    public s b(int i10) {
        if (i10 >= 0) {
            int i11 = this.f22425b;
            return i10 == i11 ? this : new s(this.f22424a.shiftLeft(i10 - i11), i10);
        }
        throw new IllegalArgumentException("scale may not be negative");
    }

    public int d(BigInteger bigInteger) {
        return this.f22424a.compareTo(bigInteger.shiftLeft(this.f22425b));
    }

    public BigInteger e() {
        return this.f22424a.shiftRight(this.f22425b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f22424a.equals(sVar.f22424a) && this.f22425b == sVar.f22425b;
    }

    public int f() {
        return this.f22425b;
    }

    public s g() {
        return new s(this.f22424a.negate(), this.f22425b);
    }

    public BigInteger h() {
        return a(new s(d.f22360b, 1).b(this.f22425b)).e();
    }

    public int hashCode() {
        return this.f22424a.hashCode() ^ this.f22425b;
    }

    public s i(BigInteger bigInteger) {
        return new s(this.f22424a.subtract(bigInteger.shiftLeft(this.f22425b)), this.f22425b);
    }

    public s j(s sVar) {
        return a(sVar.g());
    }

    public String toString() {
        if (this.f22425b == 0) {
            return this.f22424a.toString();
        }
        BigInteger e10 = e();
        BigInteger subtract = this.f22424a.subtract(e10.shiftLeft(this.f22425b));
        if (this.f22424a.signum() == -1) {
            subtract = d.f22360b.shiftLeft(this.f22425b).subtract(subtract);
        }
        if (e10.signum() == -1 && !subtract.equals(d.f22359a)) {
            e10 = e10.add(d.f22360b);
        }
        String bigInteger = e10.toString();
        char[] cArr = new char[this.f22425b];
        String bigInteger2 = subtract.toString(2);
        int length = bigInteger2.length();
        int i10 = this.f22425b - length;
        for (int i11 = 0; i11 < i10; i11++) {
            cArr[i11] = '0';
        }
        for (int i12 = 0; i12 < length; i12++) {
            cArr[i10 + i12] = bigInteger2.charAt(i12);
        }
        String str = new String(cArr);
        StringBuffer stringBuffer = new StringBuffer(bigInteger);
        stringBuffer.append(".");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}
