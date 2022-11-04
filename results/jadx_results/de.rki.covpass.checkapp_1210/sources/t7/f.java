package t7;
/* loaded from: classes.dex */
class f implements v {
    @Override // t7.v
    public boolean a(Object obj) {
        return ((u7.f) obj).C();
    }

    @Override // t7.v
    public u7.h b(Object obj) {
        return u7.h.o((u7.f) obj);
    }

    @Override // t7.v
    public boolean c(Object obj) {
        return false;
    }

    @Override // t7.v
    public u7.d d(Object obj) {
        return u7.d.B((u7.f) obj);
    }

    @Override // t7.v
    public u7.f e(Object obj) {
        return (u7.f) obj;
    }

    @Override // t7.v
    public boolean f(Object obj) {
        return ((u7.f) obj).I1() < 0;
    }

    @Override // t7.v
    public int g(Object obj) {
        return ((u7.f) obj).I1();
    }

    @Override // t7.v
    public long h(Object obj) {
        u7.f fVar = (u7.f) obj;
        if (fVar.C()) {
            return fVar.u1();
        }
        throw new ArithmeticException("This Object's value is out of range");
    }

    @Override // t7.v
    public int i(Object obj, int i10, int i11) {
        int s12;
        u7.f fVar = (u7.f) obj;
        if (!fVar.B() || (s12 = fVar.s1()) < i10 || s12 > i11) {
            throw new ArithmeticException("This Object's value is out of range");
        }
        return s12;
    }

    @Override // t7.v
    public boolean j(Object obj) {
        return true;
    }

    @Override // t7.v
    public u7.e k(Object obj) {
        return u7.e.s((u7.f) obj);
    }

    @Override // t7.v
    public boolean l(Object obj) {
        return false;
    }
}
