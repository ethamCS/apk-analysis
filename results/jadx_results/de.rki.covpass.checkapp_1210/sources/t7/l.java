package t7;
/* loaded from: classes.dex */
class l implements v {
    @Override // t7.v
    public boolean a(Object obj) {
        return true;
    }

    @Override // t7.v
    public u7.h b(Object obj) {
        return u7.h.p(((Long) obj).longValue());
    }

    @Override // t7.v
    public boolean c(Object obj) {
        return false;
    }

    @Override // t7.v
    public u7.d d(Object obj) {
        return u7.d.D(((Long) obj).longValue());
    }

    @Override // t7.v
    public u7.f e(Object obj) {
        return u7.f.Z(((Long) obj).longValue());
    }

    @Override // t7.v
    public boolean f(Object obj) {
        return ((Long) obj).longValue() < 0;
    }

    @Override // t7.v
    public int g(Object obj) {
        int i10 = (((Long) obj).longValue() > 0L ? 1 : (((Long) obj).longValue() == 0L ? 0 : -1));
        if (i10 == 0) {
            return 0;
        }
        return i10 < 0 ? -1 : 1;
    }

    @Override // t7.v
    public long h(Object obj) {
        return ((Long) obj).longValue();
    }

    @Override // t7.v
    public int i(Object obj, int i10, int i11) {
        long longValue = ((Long) obj).longValue();
        if (longValue < i10 || longValue > i11) {
            throw new ArithmeticException("This Object's value is out of range");
        }
        return (int) longValue;
    }

    @Override // t7.v
    public boolean j(Object obj) {
        return true;
    }

    @Override // t7.v
    public u7.e k(Object obj) {
        return u7.e.v(((Long) obj).longValue());
    }

    @Override // t7.v
    public boolean l(Object obj) {
        return false;
    }
}
