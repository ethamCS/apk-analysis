package t7;
/* loaded from: classes.dex */
class j implements v {
    @Override // t7.v
    public boolean a(Object obj) {
        return j(obj) && n(obj);
    }

    @Override // t7.v
    public u7.h b(Object obj) {
        return u7.h.m((u7.e) obj);
    }

    @Override // t7.v
    public boolean c(Object obj) {
        return ((u7.e) obj).y();
    }

    @Override // t7.v
    public u7.d d(Object obj) {
        return ((u7.e) obj).G();
    }

    @Override // t7.v
    public u7.f e(Object obj) {
        return ((u7.e) obj).H();
    }

    @Override // t7.v
    public boolean f(Object obj) {
        return ((u7.e) obj).S();
    }

    @Override // t7.v
    public int g(Object obj) {
        u7.e eVar = (u7.e) obj;
        if (eVar.y()) {
            return 2;
        }
        return eVar.U();
    }

    @Override // t7.v
    public long h(Object obj) {
        u7.e eVar = (u7.e) obj;
        if (n(obj)) {
            return eVar.H().u1();
        }
        throw new ArithmeticException("This Object's value is out of range");
    }

    @Override // t7.v
    public int i(Object obj, int i10, int i11) {
        int s12;
        u7.e eVar = (u7.e) obj;
        if (!m(obj) || (s12 = eVar.H().s1()) < i10 || s12 > i11) {
            throw new ArithmeticException("This Object's value is out of range");
        }
        return s12;
    }

    @Override // t7.v
    public boolean j(Object obj) {
        u7.e eVar = (u7.e) obj;
        if (!eVar.R()) {
            return false;
        }
        return eVar.O().I1() >= 0 || u7.e.s(eVar.H()).compareTo(eVar) == 0;
    }

    @Override // t7.v
    public u7.e k(Object obj) {
        return (u7.e) obj;
    }

    @Override // t7.v
    public boolean l(Object obj) {
        return ((u7.e) obj).x();
    }

    public boolean m(Object obj) {
        u7.e eVar = (u7.e) obj;
        if (!eVar.R()) {
            return false;
        }
        if (eVar.T()) {
            return true;
        }
        if (eVar.O().compareTo(u7.f.Z(33L)) < 0) {
            return eVar.H().B();
        }
        return false;
    }

    public boolean n(Object obj) {
        u7.e eVar = (u7.e) obj;
        if (!eVar.R()) {
            return false;
        }
        if (eVar.T()) {
            return true;
        }
        if (eVar.O().compareTo(u7.f.Z(65L)) < 0) {
            return eVar.H().C();
        }
        return false;
    }
}
