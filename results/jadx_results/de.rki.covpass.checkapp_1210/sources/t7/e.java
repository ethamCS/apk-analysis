package t7;
/* loaded from: classes.dex */
class e implements v {
    private static long n(long j10) {
        long j11 = Long.MAX_VALUE & j10;
        if (j11 != 0 && j11 < 9218868437227405312L) {
            long j12 = j11 >> 52;
            if (j12 >= 1075) {
                return j10;
            }
            if (j12 <= 1022) {
                return (j10 >> 63) != 0 ? Long.MIN_VALUE : 0L;
            }
            int i10 = 52 - (((int) j12) - 1023);
            return (j10 & (-4503599627370496L)) | (((j11 & 4503599627370495L) >> i10) << i10);
        }
        return j10;
    }

    @Override // t7.v
    public boolean a(Object obj) {
        return j(obj) && m(obj);
    }

    @Override // t7.v
    public u7.h b(Object obj) {
        return u7.h.j(((Long) obj).longValue());
    }

    @Override // t7.v
    public boolean c(Object obj) {
        return t.n(((Long) obj).longValue());
    }

    @Override // t7.v
    public u7.d d(Object obj) {
        return u7.d.z(((Long) obj).longValue());
    }

    @Override // t7.v
    public u7.f e(Object obj) {
        return t.t(((Long) obj).longValue());
    }

    @Override // t7.v
    public boolean f(Object obj) {
        return (((Long) obj).longValue() >> 63) != 0;
    }

    @Override // t7.v
    public int g(Object obj) {
        if (c(obj)) {
            return -2;
        }
        return (((Long) obj).longValue() >> 63) != 0 ? -1 : 1;
    }

    @Override // t7.v
    public long h(Object obj) {
        if (c(obj) || l(obj)) {
            throw new ArithmeticException("This Object's value is out of range");
        }
        long n10 = n(((Long) obj).longValue());
        boolean z10 = (n10 >> 63) != 0;
        long j10 = n10 & Long.MAX_VALUE;
        if (j10 == 0) {
            return 0L;
        }
        if (z10 && j10 == 4890909195324358656L) {
            return Long.MIN_VALUE;
        }
        long j11 = j10 >> 52;
        if (j11 >= 1086) {
            throw new ArithmeticException("This Object's value is out of range");
        }
        long j12 = (j10 & 4503599627370495L) | 4503599627370496L;
        int i10 = 52 - (((int) j11) - 1023);
        long j13 = i10 < 0 ? j12 << (-i10) : j12 >> i10;
        return z10 ? -j13 : j13;
    }

    @Override // t7.v
    public int i(Object obj, int i10, int i11) {
        if (c(obj) || l(obj)) {
            throw new ArithmeticException("This Object's value is out of range");
        }
        long n10 = n(((Long) obj).longValue());
        boolean z10 = (n10 >> 63) != 0;
        long j10 = n10 & Long.MAX_VALUE;
        if (j10 == 0) {
            return 0;
        }
        long j11 = j10 >> 52;
        if (j11 >= 1075) {
            throw new ArithmeticException("This Object's value is out of range");
        }
        long j12 = ((j10 & 4503599627370495L) | 4503599627370496L) >> (52 - (((int) j11) - 1023));
        if (z10) {
            j12 = -j12;
        }
        if (j12 >= i10 && j12 <= i11) {
            return (int) j12;
        }
        throw new ArithmeticException("This Object's value is out of range");
    }

    @Override // t7.v
    public boolean j(Object obj) {
        return t.B(((Long) obj).longValue());
    }

    @Override // t7.v
    public u7.e k(Object obj) {
        return u7.e.r(((Long) obj).longValue());
    }

    @Override // t7.v
    public boolean l(Object obj) {
        return (((Long) obj).longValue() & Long.MAX_VALUE) == 9218868437227405312L;
    }

    public boolean m(Object obj) {
        if (c(obj) || l(obj)) {
            return false;
        }
        long n10 = n(((Long) obj).longValue());
        boolean z10 = (n10 >> 63) != 0;
        long j10 = n10 & Long.MAX_VALUE;
        return (z10 && j10 == 4890909195324358656L) || (j10 >> 52) < 1086;
    }
}
