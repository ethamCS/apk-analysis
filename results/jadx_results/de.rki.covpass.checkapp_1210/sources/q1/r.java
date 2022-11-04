package q1;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
import q1.n;
/* loaded from: classes.dex */
public class r extends n {
    int B4;

    /* renamed from: z4 */
    private ArrayList<n> f19461z4 = new ArrayList<>();
    private boolean A4 = true;
    boolean C4 = false;
    private int D4 = 0;

    /* loaded from: classes.dex */
    class a extends o {

        /* renamed from: a */
        final /* synthetic */ n f19462a;

        a(n nVar) {
            r.this = r1;
            this.f19462a = nVar;
        }

        @Override // q1.n.f
        public void a(n nVar) {
            this.f19462a.a0();
            nVar.W(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends o {

        /* renamed from: a */
        r f19464a;

        b(r rVar) {
            this.f19464a = rVar;
        }

        @Override // q1.n.f
        public void a(n nVar) {
            r rVar = this.f19464a;
            int i10 = rVar.B4 - 1;
            rVar.B4 = i10;
            if (i10 == 0) {
                rVar.C4 = false;
                rVar.q();
            }
            nVar.W(this);
        }

        @Override // q1.o, q1.n.f
        public void b(n nVar) {
            r rVar = this.f19464a;
            if (!rVar.C4) {
                rVar.h0();
                this.f19464a.C4 = true;
            }
        }
    }

    private void m0(n nVar) {
        this.f19461z4.add(nVar);
        nVar.f19427g4 = this;
    }

    private void v0() {
        b bVar = new b(this);
        Iterator<n> it = this.f19461z4.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.B4 = this.f19461z4.size();
    }

    @Override // q1.n
    public void U(View view) {
        super.U(view);
        int size = this.f19461z4.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f19461z4.get(i10).U(view);
        }
    }

    @Override // q1.n
    public void Y(View view) {
        super.Y(view);
        int size = this.f19461z4.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f19461z4.get(i10).Y(view);
        }
    }

    @Override // q1.n
    public void a0() {
        if (this.f19461z4.isEmpty()) {
            h0();
            q();
            return;
        }
        v0();
        if (this.A4) {
            Iterator<n> it = this.f19461z4.iterator();
            while (it.hasNext()) {
                it.next().a0();
            }
            return;
        }
        for (int i10 = 1; i10 < this.f19461z4.size(); i10++) {
            this.f19461z4.get(i10 - 1).a(new a(this.f19461z4.get(i10)));
        }
        n nVar = this.f19461z4.get(0);
        if (nVar == null) {
            return;
        }
        nVar.a0();
    }

    @Override // q1.n
    public void c0(n.e eVar) {
        super.c0(eVar);
        this.D4 |= 8;
        int size = this.f19461z4.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f19461z4.get(i10).c0(eVar);
        }
    }

    @Override // q1.n
    public void e0(g gVar) {
        super.e0(gVar);
        this.D4 |= 4;
        if (this.f19461z4 != null) {
            for (int i10 = 0; i10 < this.f19461z4.size(); i10++) {
                this.f19461z4.get(i10).e0(gVar);
            }
        }
    }

    @Override // q1.n
    public void f0(q qVar) {
        super.f0(qVar);
        this.D4 |= 2;
        int size = this.f19461z4.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f19461z4.get(i10).f0(qVar);
        }
    }

    @Override // q1.n
    public void g(t tVar) {
        if (N(tVar.f19469b)) {
            Iterator<n> it = this.f19461z4.iterator();
            while (it.hasNext()) {
                n next = it.next();
                if (next.N(tVar.f19469b)) {
                    next.g(tVar);
                    tVar.f19470c.add(next);
                }
            }
        }
    }

    @Override // q1.n
    public void i(t tVar) {
        super.i(tVar);
        int size = this.f19461z4.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f19461z4.get(i10).i(tVar);
        }
    }

    @Override // q1.n
    public String i0(String str) {
        String i02 = super.i0(str);
        for (int i10 = 0; i10 < this.f19461z4.size(); i10++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(i02);
            sb2.append("\n");
            sb2.append(this.f19461z4.get(i10).i0(str + "  "));
            i02 = sb2.toString();
        }
        return i02;
    }

    @Override // q1.n
    public void j(t tVar) {
        if (N(tVar.f19469b)) {
            Iterator<n> it = this.f19461z4.iterator();
            while (it.hasNext()) {
                n next = it.next();
                if (next.N(tVar.f19469b)) {
                    next.j(tVar);
                    tVar.f19470c.add(next);
                }
            }
        }
    }

    /* renamed from: j0 */
    public r a(n.f fVar) {
        return (r) super.a(fVar);
    }

    /* renamed from: k0 */
    public r c(View view) {
        for (int i10 = 0; i10 < this.f19461z4.size(); i10++) {
            this.f19461z4.get(i10).c(view);
        }
        return (r) super.c(view);
    }

    public r l0(n nVar) {
        m0(nVar);
        long j10 = this.f19437q;
        if (j10 >= 0) {
            nVar.b0(j10);
        }
        if ((this.D4 & 1) != 0) {
            nVar.d0(x());
        }
        if ((this.D4 & 2) != 0) {
            nVar.f0(C());
        }
        if ((this.D4 & 4) != 0) {
            nVar.e0(B());
        }
        if ((this.D4 & 8) != 0) {
            nVar.c0(w());
        }
        return this;
    }

    @Override // q1.n
    /* renamed from: m */
    public n clone() {
        r rVar = (r) super.clone();
        rVar.f19461z4 = new ArrayList<>();
        int size = this.f19461z4.size();
        for (int i10 = 0; i10 < size; i10++) {
            rVar.m0(this.f19461z4.get(i10).clone());
        }
        return rVar;
    }

    public n n0(int i10) {
        if (i10 < 0 || i10 >= this.f19461z4.size()) {
            return null;
        }
        return this.f19461z4.get(i10);
    }

    public int o0() {
        return this.f19461z4.size();
    }

    @Override // q1.n
    public void p(ViewGroup viewGroup, u uVar, u uVar2, ArrayList<t> arrayList, ArrayList<t> arrayList2) {
        long E = E();
        int size = this.f19461z4.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = this.f19461z4.get(i10);
            if (E > 0 && (this.A4 || i10 == 0)) {
                long E2 = nVar.E();
                if (E2 > 0) {
                    nVar.g0(E2 + E);
                } else {
                    nVar.g0(E);
                }
            }
            nVar.p(viewGroup, uVar, uVar2, arrayList, arrayList2);
        }
    }

    /* renamed from: p0 */
    public r W(n.f fVar) {
        return (r) super.W(fVar);
    }

    /* renamed from: q0 */
    public r X(View view) {
        for (int i10 = 0; i10 < this.f19461z4.size(); i10++) {
            this.f19461z4.get(i10).X(view);
        }
        return (r) super.X(view);
    }

    /* renamed from: r0 */
    public r b0(long j10) {
        ArrayList<n> arrayList;
        super.b0(j10);
        if (this.f19437q >= 0 && (arrayList = this.f19461z4) != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f19461z4.get(i10).b0(j10);
            }
        }
        return this;
    }

    /* renamed from: s0 */
    public r d0(TimeInterpolator timeInterpolator) {
        this.D4 |= 1;
        ArrayList<n> arrayList = this.f19461z4;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f19461z4.get(i10).d0(timeInterpolator);
            }
        }
        return (r) super.d0(timeInterpolator);
    }

    public r t0(int i10) {
        if (i10 == 0) {
            this.A4 = true;
        } else if (i10 != 1) {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i10);
        } else {
            this.A4 = false;
        }
        return this;
    }

    /* renamed from: u0 */
    public r g0(long j10) {
        return (r) super.g0(j10);
    }
}
