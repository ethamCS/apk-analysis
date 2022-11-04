package t7;
/* loaded from: classes.dex */
class k implements v {
    @Override // t7.v
    public boolean a(Object obj) {
        return j(obj) && m(obj);
    }

    @Override // t7.v
    public u7.h b(Object obj) {
        return (u7.h) obj;
    }

    @Override // t7.v
    public boolean c(Object obj) {
        return ((u7.h) obj).r();
    }

    @Override // t7.v
    public u7.d d(Object obj) {
        return ((u7.h) obj).z(u7.c.f23187t.r());
    }

    @Override // t7.v
    public u7.f e(Object obj) {
        return ((u7.h) obj).C();
    }

    @Override // t7.v
    public boolean f(Object obj) {
        return ((u7.h) obj).I();
    }

    @Override // t7.v
    public int g(Object obj) {
        return ((u7.h) obj).K();
    }

    @Override // t7.v
    public long h(Object obj) {
        u7.h hVar = (u7.h) obj;
        if (hVar.H()) {
            u7.f C = hVar.C();
            if (C.C()) {
                return C.u1();
            }
        }
        throw new ArithmeticException("This Object's value is out of range");
    }

    @Override // t7.v
    public int i(Object obj, int i10, int i11) {
        int s12;
        u7.h hVar = (u7.h) obj;
        if (hVar.H()) {
            u7.f C = hVar.C();
            if (C.B() && (s12 = C.s1()) >= i10 && s12 <= i11) {
                return s12;
            }
        }
        throw new ArithmeticException("This Object's value is out of range");
    }

    @Override // t7.v
    public boolean j(Object obj) {
        u7.h hVar = (u7.h) obj;
        if (!hVar.H()) {
            return false;
        }
        if (hVar.E().equals(u7.f.Y(1))) {
            return true;
        }
        return hVar.F().T0(hVar.E()).H1();
    }

    @Override // t7.v
    public u7.e k(Object obj) {
        return ((u7.h) obj).B(u7.c.f23182o.r());
    }

    @Override // t7.v
    public boolean l(Object obj) {
        return ((u7.h) obj).q();
    }

    public boolean m(Object obj) {
        u7.h hVar = (u7.h) obj;
        if (!hVar.H()) {
            return false;
        }
        return hVar.C().C();
    }
}
