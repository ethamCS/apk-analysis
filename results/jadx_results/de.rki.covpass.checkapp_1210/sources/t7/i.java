package t7;
/* loaded from: classes.dex */
class i implements v {
    @Override // t7.v
    public boolean a(Object obj) {
        return j(obj) && n(obj);
    }

    @Override // t7.v
    public u7.h b(Object obj) {
        return u7.h.l((u7.d) obj);
    }

    @Override // t7.v
    public boolean c(Object obj) {
        return ((u7.d) obj).J();
    }

    @Override // t7.v
    public u7.d d(Object obj) {
        return (u7.d) obj;
    }

    @Override // t7.v
    public u7.f e(Object obj) {
        return ((u7.d) obj).V();
    }

    @Override // t7.v
    public boolean f(Object obj) {
        return ((u7.d) obj).i0();
    }

    @Override // t7.v
    public int g(Object obj) {
        u7.d dVar = (u7.d) obj;
        if (dVar.J()) {
            return 2;
        }
        return dVar.k0();
    }

    @Override // t7.v
    public long h(Object obj) {
        u7.d dVar = (u7.d) obj;
        if (n(obj)) {
            return dVar.V().u1();
        }
        throw new ArithmeticException("This Object's value is out of range");
    }

    @Override // t7.v
    public int i(Object obj, int i10, int i11) {
        int s12;
        u7.d dVar = (u7.d) obj;
        if (!m(obj) || (s12 = dVar.V().s1()) < i10 || s12 > i11) {
            throw new ArithmeticException("This Object's value is out of range");
        }
        return s12;
    }

    @Override // t7.v
    public boolean j(Object obj) {
        u7.d dVar = (u7.d) obj;
        return dVar.h0() && (dVar.e0().I1() >= 0 || dVar.compareTo(u7.d.B(dVar.V())) == 0);
    }

    @Override // t7.v
    public u7.e k(Object obj) {
        return ((u7.d) obj).T();
    }

    @Override // t7.v
    public boolean l(Object obj) {
        return ((u7.d) obj).I();
    }

    public boolean m(Object obj) {
        u7.d dVar = (u7.d) obj;
        if (!dVar.h0()) {
            return false;
        }
        if (dVar.j0()) {
            return true;
        }
        if (dVar.e0().compareTo(u7.f.Z(11L)) < 0) {
            return dVar.V().B();
        }
        return false;
    }

    public boolean n(Object obj) {
        u7.d dVar = (u7.d) obj;
        if (!dVar.h0()) {
            return false;
        }
        if (dVar.j0()) {
            return true;
        }
        if (dVar.e0().compareTo(u7.f.Z(21L)) < 0) {
            return dVar.V().C();
        }
        return false;
    }
}
