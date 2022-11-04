package u7;

import org.conscrypt.BuildConfig;
/* loaded from: classes.dex */
public final class m implements Comparable<m> {
    private static final m[] U3 = o(-24, 128);

    /* renamed from: x */
    public static final m f23252x;

    /* renamed from: y */
    public static final m f23253y;

    /* renamed from: c */
    private final int f23254c;

    /* renamed from: d */
    private final f f23255d;

    /* renamed from: q */
    private final b f23256q;

    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f23257a;

        static {
            int[] iArr = new int[b.values().length];
            f23257a = iArr;
            try {
                iArr[b.SmallValue.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f23257a[b.LargeValue.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* loaded from: classes.dex */
    public enum b {
        SmallValue(0),
        LargeValue(2);
        

        /* renamed from: c */
        private int f23261c;

        b(int i10) {
            this.f23261c = i10;
        }
    }

    static {
        b bVar = b.SmallValue;
        f23252x = new m(bVar, 0, null);
        f23253y = new m(bVar, 1, null);
    }

    private m(b bVar, int i10, f fVar) {
        this.f23256q = bVar;
        this.f23254c = i10;
        this.f23255d = fVar;
    }

    public static m A(m mVar, m mVar2) {
        b bVar = mVar.f23256q;
        b bVar2 = b.SmallValue;
        if (bVar == bVar2 && mVar2.f23256q == bVar2) {
            int i10 = mVar2.f23254c;
            if (i10 == 0) {
                return mVar;
            }
            if ((i10 < 0 && Integer.MAX_VALUE + i10 >= mVar.f23254c) || (i10 > 0 && Integer.MIN_VALUE + i10 <= mVar.f23254c)) {
                return r(mVar.f23254c - i10);
            }
        }
        return p(mVar.B().n1(mVar2.B()));
    }

    public static m g(m mVar, m mVar2) {
        b bVar = mVar.f23256q;
        b bVar2 = b.SmallValue;
        if (bVar == bVar2 && mVar2.f23256q == bVar2) {
            int i10 = mVar.f23254c;
            if (i10 == 0) {
                return mVar2;
            }
            int i11 = mVar2.f23254c;
            if (i11 == 0) {
                return mVar;
            }
            if (((i10 | i11) >> 30) == 0) {
                return r(i10 + i11);
            }
            if ((i10 < 0 && i11 >= Integer.MIN_VALUE - i10) || (i10 > 0 && i11 <= Integer.MAX_VALUE - i10)) {
                return r(i10 + i11);
            }
        }
        return p(mVar.B().d(mVar2.B()));
    }

    private static m[] o(int i10, int i11) {
        m[] mVarArr = new m[(i11 - i10) + 1];
        for (int i12 = i10; i12 <= i11; i12++) {
            int i13 = i12 - i10;
            if (i12 == 0) {
                mVarArr[i13] = f23252x;
            } else if (i12 == 1) {
                mVarArr[i13] = f23253y;
            } else {
                mVarArr[i13] = new m(b.SmallValue, i12, null);
            }
        }
        return mVarArr;
    }

    public static m p(f fVar) {
        return fVar.B() ? r(fVar.t1()) : new m(b.LargeValue, 0, fVar);
    }

    public static m q(l lVar) {
        return lVar.j() ? r(lVar.G()) : p(lVar.F());
    }

    public static m r(int i10) {
        return (i10 < -24 || i10 > 128) ? new m(b.SmallValue, i10, null) : U3[i10 - (-24)];
    }

    public static m s(long j10) {
        return (j10 < -2147483648L || j10 > 2147483647L) ? new m(b.LargeValue, 0, f.Z(j10)) : r((int) j10);
    }

    public f B() {
        int i10 = a.f23257a[this.f23256q.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException();
            }
            return this.f23255d;
        }
        return f.Y(this.f23254c);
    }

    public l C() {
        return this.f23256q == b.SmallValue ? new l(this.f23254c) : l.q(this.f23255d);
    }

    public int D() {
        return this.f23256q == b.SmallValue ? this.f23254c : this.f23255d.t1();
    }

    public long E() {
        int i10 = a.f23257a[this.f23256q.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException();
            }
            return this.f23255d.v1();
        }
        return this.f23254c;
    }

    public int F(f fVar) {
        int i10 = a.f23257a[this.f23256q.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException();
            }
            return this.f23255d.compareTo(fVar);
        }
        return -fVar.C1(this.f23254c);
    }

    public int G(l lVar) {
        int l10;
        int i10 = a.f23257a[this.f23256q.ordinal()];
        if (i10 == 1) {
            l10 = lVar.l(this.f23254c);
        } else if (i10 != 2) {
            throw new IllegalStateException();
        } else {
            l10 = lVar.H(this.f23255d);
        }
        return -l10;
    }

    /* renamed from: H */
    public int compareTo(m mVar) {
        int[] iArr = a.f23257a;
        int i10 = iArr[this.f23256q.ordinal()];
        if (i10 == 1) {
            int i11 = iArr[mVar.f23256q.ordinal()];
            if (i11 == 1) {
                int i12 = mVar.f23254c;
                int i13 = this.f23254c;
                if (i13 == i12) {
                    return 0;
                }
                return i13 < i12 ? -1 : 1;
            } else if (i11 == 2) {
                return -mVar.f23255d.C1(this.f23254c);
            }
        } else if (i10 == 2) {
            return this.f23255d.compareTo(mVar.B());
        }
        throw new IllegalStateException();
    }

    public final boolean I() {
        int i10 = a.f23257a[this.f23256q.ordinal()];
        if (i10 == 1) {
            return (this.f23254c & 1) == 0;
        } else if (i10 != 2) {
            throw new IllegalStateException();
        } else {
            return this.f23255d.F1();
        }
    }

    public final boolean J() {
        int i10 = a.f23257a[this.f23256q.ordinal()];
        if (i10 == 1) {
            return this.f23254c == 0;
        } else if (i10 == 2) {
            return this.f23255d.H1();
        } else {
            return false;
        }
    }

    public final int K() {
        int i10 = a.f23257a[this.f23256q.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return this.f23255d.I1();
            }
            return 0;
        }
        int i11 = this.f23254c;
        if (i11 == 0) {
            return 0;
        }
        return i11 < 0 ? -1 : 1;
    }

    public m a() {
        int i10 = a.f23257a[this.f23256q.ordinal()];
        if (i10 == 1) {
            int i11 = this.f23254c;
            return i11 == Integer.MIN_VALUE ? r(Integer.MAX_VALUE).t() : i11 < 0 ? r(-i11) : this;
        } else if (i10 != 2) {
            throw new IllegalStateException();
        } else {
            return this.f23255d.I1() < 0 ? new m(b.LargeValue, 0, this.f23255d.a()) : this;
        }
    }

    public m b(int i10) {
        if (this.f23256q == b.SmallValue) {
            if (i10 == 0) {
                return this;
            }
            int i11 = this.f23254c;
            if (i11 == 0) {
                return r(i10);
            }
            if (((i11 | i10) >> 30) == 0) {
                return r(i11 + i10);
            }
            if ((i11 < 0 && i10 >= Integer.MIN_VALUE - i11) || (i11 > 0 && i10 <= Integer.MAX_VALUE - i11)) {
                return r(i11 + i10);
            }
        }
        return p(B().b(i10));
    }

    public m d(m mVar) {
        return g(this, mVar);
    }

    public boolean equals(Object obj) {
        b bVar;
        m mVar = obj instanceof m ? (m) obj : null;
        if (mVar != null && (bVar = this.f23256q) == mVar.f23256q) {
            int i10 = a.f23257a[bVar.ordinal()];
            if (i10 == 1) {
                return this.f23254c == mVar.f23254c;
            } else if (i10 == 2) {
                return this.f23255d.equals(mVar.f23255d);
            } else {
                return true;
            }
        }
        return false;
    }

    public boolean h() {
        return this.f23256q == b.SmallValue || this.f23255d.B();
    }

    public int hashCode() {
        int i10;
        int i11;
        int hashCode = this.f23256q.hashCode();
        int i12 = a.f23257a[this.f23256q.ordinal()];
        if (i12 == 1) {
            i11 = hashCode * 31;
            i10 = this.f23254c;
        } else if (i12 != 2) {
            return hashCode;
        } else {
            i11 = hashCode * 31;
            i10 = this.f23255d.hashCode();
        }
        return i11 + i10;
    }

    public boolean j() {
        int i10 = a.f23257a[this.f23256q.ordinal()];
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException();
            }
            return this.f23255d.C();
        }
        return true;
    }

    public int l(int i10) {
        int i11 = a.f23257a[this.f23256q.ordinal()];
        if (i11 != 1) {
            if (i11 == 2) {
                return this.f23255d.compareTo(f.Y(i10));
            }
            return 0;
        }
        int i12 = this.f23254c;
        if (i10 == i12) {
            return 0;
        }
        return i12 < i10 ? -1 : 1;
    }

    public int m(long j10) {
        int i10 = a.f23257a[this.f23256q.ordinal()];
        if (i10 != 1) {
            if (i10 == 2) {
                return this.f23255d.D1(j10);
            }
            return 0;
        }
        int i11 = this.f23254c;
        if (j10 == i11) {
            return 0;
        }
        return ((long) i11) < j10 ? -1 : 1;
    }

    public m t() {
        int i10;
        return (this.f23256q != b.SmallValue || (i10 = this.f23254c) == Integer.MAX_VALUE) ? g(this, f23253y) : r(i10 + 1);
    }

    public String toString() {
        int i10 = a.f23257a[this.f23256q.ordinal()];
        return i10 != 1 ? i10 != 2 ? BuildConfig.FLAVOR : this.f23255d.toString() : l.v(this.f23254c);
    }

    public int v(int i10) {
        int i11;
        if (i10 >= 0) {
            return (this.f23256q != b.SmallValue || (i11 = this.f23254c) < 0) ? B().T0(f.Y(i10)).s1() : i11 % i10;
        }
        throw new UnsupportedOperationException();
    }

    public m w() {
        int i10 = a.f23257a[this.f23256q.ordinal()];
        if (i10 == 1) {
            int i11 = this.f23254c;
            return i11 == Integer.MIN_VALUE ? r(Integer.MAX_VALUE).t() : r(-i11);
        } else if (i10 != 2) {
            throw new IllegalStateException();
        } else {
            return new m(b.LargeValue, 0, this.f23255d.L0());
        }
    }

    public m x(int i10) {
        return i10 == 0 ? this : (this.f23256q != b.SmallValue || ((i10 >= 0 || Integer.MAX_VALUE + i10 < this.f23254c) && (i10 <= 0 || Integer.MIN_VALUE + i10 > this.f23254c))) ? p(B().l1(i10)) : r(this.f23254c - i10);
    }

    public m y(f fVar) {
        return (this.f23256q != b.SmallValue || !fVar.B()) ? p(B().n1(fVar)) : x(fVar.t1());
    }

    public m z(m mVar) {
        return A(this, mVar);
    }
}
