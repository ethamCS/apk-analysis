package e.m0.i;

import e.a0;
import e.g0;
import e.i0;
import java.util.List;
import javax.annotation.Nullable;
/* loaded from: classes.dex */
public final class g implements a0.a {

    /* renamed from: a */
    private final List<a0> f4155a;

    /* renamed from: b */
    private final e.m0.h.k f4156b;
    @Nullable

    /* renamed from: c */
    private final e.m0.h.d f4157c;

    /* renamed from: d */
    private final int f4158d;

    /* renamed from: e */
    private final g0 f4159e;

    /* renamed from: f */
    private final e.j f4160f;

    /* renamed from: g */
    private final int f4161g;

    /* renamed from: h */
    private final int f4162h;
    private final int i;
    private int j;

    public g(List<a0> list, e.m0.h.k kVar, @Nullable e.m0.h.d dVar, int i, g0 g0Var, e.j jVar, int i2, int i3, int i4) {
        this.f4155a = list;
        this.f4156b = kVar;
        this.f4157c = dVar;
        this.f4158d = i;
        this.f4159e = g0Var;
        this.f4160f = jVar;
        this.f4161g = i2;
        this.f4162h = i3;
        this.i = i4;
    }

    @Override // e.a0.a
    public g0 a() {
        return this.f4159e;
    }

    @Override // e.a0.a
    public int b() {
        return this.i;
    }

    @Override // e.a0.a
    public i0 c(g0 g0Var) {
        return g(g0Var, this.f4156b, this.f4157c);
    }

    @Override // e.a0.a
    public int d() {
        return this.f4161g;
    }

    @Override // e.a0.a
    public int e() {
        return this.f4162h;
    }

    public e.m0.h.d f() {
        e.m0.h.d dVar = this.f4157c;
        if (dVar != null) {
            return dVar;
        }
        throw new IllegalStateException();
    }

    public i0 g(g0 g0Var, e.m0.h.k kVar, @Nullable e.m0.h.d dVar) {
        if (this.f4158d < this.f4155a.size()) {
            this.j++;
            e.m0.h.d dVar2 = this.f4157c;
            if (dVar2 != null && !dVar2.c().u(g0Var.i())) {
                throw new IllegalStateException("network interceptor " + this.f4155a.get(this.f4158d - 1) + " must retain the same host and port");
            } else if (this.f4157c != null && this.j > 1) {
                throw new IllegalStateException("network interceptor " + this.f4155a.get(this.f4158d - 1) + " must call proceed() exactly once");
            } else {
                List<a0> list = this.f4155a;
                int i = this.f4158d;
                g gVar = new g(list, kVar, dVar, i + 1, g0Var, this.f4160f, this.f4161g, this.f4162h, this.i);
                a0 a0Var = list.get(i);
                i0 a2 = a0Var.a(gVar);
                if (dVar != null && this.f4158d + 1 < this.f4155a.size() && gVar.j != 1) {
                    throw new IllegalStateException("network interceptor " + a0Var + " must call proceed() exactly once");
                } else if (a2 == null) {
                    throw new NullPointerException("interceptor " + a0Var + " returned null");
                } else if (a2.a() != null) {
                    return a2;
                } else {
                    throw new IllegalStateException("interceptor " + a0Var + " returned a response with no body");
                }
            }
        }
        throw new AssertionError();
    }

    public e.m0.h.k h() {
        return this.f4156b;
    }
}
