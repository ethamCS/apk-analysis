package u7;
/* loaded from: classes.dex */
final class s<T> implements n<T> {

    /* renamed from: a */
    private final n<T> f23284a;

    public s(n<T> nVar) {
        this.f23284a = nVar;
    }

    private T j(T t10, c cVar) {
        return m(t10, t10, cVar);
    }

    private T k(T t10, T t11, c cVar) {
        return m(t10, t11, cVar);
    }

    private static c l(c cVar) {
        return cVar == null ? cVar : cVar.k();
    }

    private T m(T t10, T t11, c cVar) {
        int e10 = h().e(t10);
        int e11 = h().e(t11);
        if ((e10 & 8) != 0) {
            return u(t10, cVar);
        }
        if ((e11 & 8) != 0) {
            return u(t11, cVar);
        }
        if ((e10 & 4) != 0) {
            return s(t10, cVar);
        }
        if ((e11 & 4) == 0) {
            return null;
        }
        return s(t11, cVar);
    }

    private T n(T t10, c cVar, c cVar2) {
        return q(t10, cVar, cVar2, false, false);
    }

    private T o(T t10, c cVar, c cVar2) {
        return q(t10, cVar, cVar2, true, false);
    }

    private T p(T t10, c cVar, c cVar2) {
        return q(t10, cVar, cVar2, false, true);
    }

    private T q(T t10, c cVar, c cVar2, boolean z10, boolean z11) {
        int e10 = h().e(t10);
        if (cVar != null && cVar2 != null && cVar.y()) {
            if (!cVar2.t()) {
                cVar2.G(cVar2.w() & (-33));
            }
            cVar.G(cVar.w() | cVar2.w());
            if ((cVar2.w() & 4) != 0) {
                cVar.G(cVar.w() | 15);
            }
        }
        if ((e10 & 14) != 0) {
            return cVar.w() == 0 ? t(cVar) : t10;
        }
        f a10 = h().b(t10).a();
        if (a10.H1()) {
            return z11 ? h().d(a10, h().j(t10), 0) : this.f23284a.b(h().c(0), cVar);
        } else if (z11) {
            return t10;
        } else {
            f j10 = h().j(t10);
            if (j10.I1() <= 0) {
                if (!z10 || j10.I1() >= 0) {
                    return t10;
                }
                l q10 = l.q(j10);
                return h().d(q.v(a10, q10, h().h(), null, null, new l(0)), q10.F(), e10);
            }
            l q11 = l.q(j10);
            if (cVar != null && cVar.A()) {
                if (!cVar.b(j10)) {
                    return t10;
                }
                l q12 = l.q(cVar.B());
                q12.B(h().o(a10));
                if (q12.L() <= 0 || q12.compareTo(q11) < 0) {
                    if (!z10) {
                        return t10;
                    }
                    return h().d(q.v(a10, q11, h().h(), null, null, null), q11.F(), e10);
                }
            }
            return h().d(h().a(a10, q11), f.Y(0), e10);
        }
    }

    private T r(T t10, c cVar) {
        return (T) q.u(t10, cVar, this.f23284a);
    }

    private T s(T t10, c cVar) {
        boolean z10;
        int e10;
        f a10 = h().b(t10).a();
        if (!a10.H1() && cVar != null && cVar.A()) {
            f a11 = h().a(f.Y(1), l.q(cVar.B()));
            if (a10.compareTo(a11) >= 0) {
                a10 = a10.T0(a11);
                z10 = true;
                e10 = h().e(t10);
                if (z10 && (e10 & 4) != 0) {
                    return t10;
                }
                return h().d(a10, f.Y(0), (e10 & 1) | 4);
            }
        }
        z10 = false;
        e10 = h().e(t10);
        if (z10) {
        }
        return h().d(a10, f.Y(0), (e10 & 1) | 4);
    }

    private T t(c cVar) {
        if (h().f() != 0) {
            if (cVar != null && cVar.y()) {
                cVar.G(cVar.w() | 64);
            }
            return h().d(f.Y(0), f.Y(0), 4);
        }
        throw new ArithmeticException("Invalid operation");
    }

    private T u(T t10, c cVar) {
        if (cVar != null && cVar.y()) {
            cVar.G(cVar.w() | 64);
        }
        return s(t10, cVar);
    }

    @Override // u7.n
    public T a(T t10, c cVar) {
        T j10 = j(t10, cVar);
        if (j10 != null) {
            return j10;
        }
        c l10 = l(cVar);
        return n(this.f23284a.a(r(t10, l10), l10), cVar, l10);
    }

    @Override // u7.n
    public T b(T t10, c cVar) {
        T j10 = j(t10, cVar);
        if (j10 != null) {
            return j10;
        }
        c l10 = l(cVar);
        return n(this.f23284a.b(r(t10, l10), l10), cVar, l10);
    }

    @Override // u7.n
    public T c(T t10, T t11, c cVar) {
        T k10 = k(t10, t11, cVar);
        if (k10 != null) {
            return k10;
        }
        c l10 = l(cVar);
        return o(this.f23284a.c(r(t10, l10), r(t11, l10), l10), cVar, l10);
    }

    @Override // u7.n
    public T d(T t10, T t11, c cVar) {
        T t12;
        T k10 = k(t10, t11, cVar);
        if (k10 != null) {
            return k10;
        }
        c l10 = l(cVar);
        T r10 = r(t10, l10);
        T r11 = r(t11, l10);
        boolean z10 = h().n(r10) == 0;
        boolean z11 = h().n(r11) == 0;
        if (z10) {
            if (z11) {
                r11 = this.f23284a.b(h().c(0), l10);
            }
            t12 = b(r11, l10);
        } else {
            t12 = !z11 ? this.f23284a.i(r10, r11, l10, true) : b(r10, l10);
        }
        return n(t12, cVar, l10);
    }

    @Override // u7.n
    public int e(T t10, T t11) {
        return this.f23284a.e(t10, t11);
    }

    @Override // u7.n
    public T f(T t10, c cVar) {
        T j10 = j(t10, cVar);
        if (j10 != null) {
            return j10;
        }
        c l10 = l(cVar);
        return n(this.f23284a.f(r(t10, l10), l10), cVar, l10);
    }

    @Override // u7.n
    public T g(c cVar, boolean z10) {
        return p(this.f23284a.g(cVar, z10), cVar, l(cVar));
    }

    @Override // u7.n
    public o<T> h() {
        return this.f23284a.h();
    }

    @Override // u7.n
    public T i(T t10, T t11, c cVar, boolean z10) {
        return d(t10, t11, cVar);
    }
}
