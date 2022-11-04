package b.p;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import b.p.m;
import java.util.ArrayList;
import java.util.Iterator;
/* loaded from: classes.dex */
public class q extends m {
    int M;
    private ArrayList<m> K = new ArrayList<>();
    private boolean L = true;
    boolean N = false;
    private int O = 0;

    /* loaded from: classes.dex */
    class a extends n {

        /* renamed from: a */
        final /* synthetic */ m f2775a;

        a(q qVar, m mVar) {
            this.f2775a = mVar;
        }

        @Override // b.p.m.f
        public void e(m mVar) {
            this.f2775a.X();
            mVar.T(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends n {

        /* renamed from: a */
        q f2776a;

        b(q qVar) {
            this.f2776a = qVar;
        }

        @Override // b.p.n, b.p.m.f
        public void c(m mVar) {
            q qVar = this.f2776a;
            if (!qVar.N) {
                qVar.e0();
                this.f2776a.N = true;
            }
        }

        @Override // b.p.m.f
        public void e(m mVar) {
            q qVar = this.f2776a;
            int i = qVar.M - 1;
            qVar.M = i;
            if (i == 0) {
                qVar.N = false;
                qVar.r();
            }
            mVar.T(this);
        }
    }

    private void j0(m mVar) {
        this.K.add(mVar);
        mVar.s = this;
    }

    private void s0() {
        b bVar = new b(this);
        Iterator<m> it = this.K.iterator();
        while (it.hasNext()) {
            it.next().b(bVar);
        }
        this.M = this.K.size();
    }

    @Override // b.p.m
    public void R(View view) {
        super.R(view);
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).R(view);
        }
    }

    @Override // b.p.m
    public void V(View view) {
        super.V(view);
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).V(view);
        }
    }

    @Override // b.p.m
    public void X() {
        if (this.K.isEmpty()) {
            e0();
            r();
            return;
        }
        s0();
        if (this.L) {
            Iterator<m> it = this.K.iterator();
            while (it.hasNext()) {
                it.next().X();
            }
            return;
        }
        for (int i = 1; i < this.K.size(); i++) {
            this.K.get(i - 1).b(new a(this, this.K.get(i)));
        }
        m mVar = this.K.get(0);
        if (mVar == null) {
            return;
        }
        mVar.X();
    }

    @Override // b.p.m
    public /* bridge */ /* synthetic */ m Y(long j) {
        o0(j);
        return this;
    }

    @Override // b.p.m
    public void Z(m.e eVar) {
        super.Z(eVar);
        this.O |= 8;
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).Z(eVar);
        }
    }

    @Override // b.p.m
    public void b0(g gVar) {
        super.b0(gVar);
        this.O |= 4;
        if (this.K != null) {
            for (int i = 0; i < this.K.size(); i++) {
                this.K.get(i).b0(gVar);
            }
        }
    }

    @Override // b.p.m
    public void c0(p pVar) {
        super.c0(pVar);
        this.O |= 2;
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).c0(pVar);
        }
    }

    @Override // b.p.m
    public void cancel() {
        super.cancel();
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).cancel();
        }
    }

    @Override // b.p.m
    public String f0(String str) {
        String f0 = super.f0(str);
        for (int i = 0; i < this.K.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(f0);
            sb.append("\n");
            sb.append(this.K.get(i).f0(str + "  "));
            f0 = sb.toString();
        }
        return f0;
    }

    /* renamed from: g0 */
    public q b(m.f fVar) {
        super.b(fVar);
        return this;
    }

    @Override // b.p.m
    public void h(s sVar) {
        if (J(sVar.f2781b)) {
            Iterator<m> it = this.K.iterator();
            while (it.hasNext()) {
                m next = it.next();
                if (next.J(sVar.f2781b)) {
                    next.h(sVar);
                    sVar.f2782c.add(next);
                }
            }
        }
    }

    /* renamed from: h0 */
    public q d(View view) {
        for (int i = 0; i < this.K.size(); i++) {
            this.K.get(i).d(view);
        }
        super.d(view);
        return this;
    }

    public q i0(m mVar) {
        j0(mVar);
        long j = this.f2755d;
        if (j >= 0) {
            mVar.Y(j);
        }
        if ((this.O & 1) != 0) {
            mVar.a0(u());
        }
        if ((this.O & 2) != 0) {
            mVar.c0(y());
        }
        if ((this.O & 4) != 0) {
            mVar.b0(x());
        }
        if ((this.O & 8) != 0) {
            mVar.Z(t());
        }
        return this;
    }

    @Override // b.p.m
    public void j(s sVar) {
        super.j(sVar);
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).j(sVar);
        }
    }

    public m k0(int i) {
        if (i < 0 || i >= this.K.size()) {
            return null;
        }
        return this.K.get(i);
    }

    @Override // b.p.m
    public void l(s sVar) {
        if (J(sVar.f2781b)) {
            Iterator<m> it = this.K.iterator();
            while (it.hasNext()) {
                m next = it.next();
                if (next.J(sVar.f2781b)) {
                    next.l(sVar);
                    sVar.f2782c.add(next);
                }
            }
        }
    }

    public int l0() {
        return this.K.size();
    }

    /* renamed from: m0 */
    public q T(m.f fVar) {
        super.T(fVar);
        return this;
    }

    /* renamed from: n0 */
    public q U(View view) {
        for (int i = 0; i < this.K.size(); i++) {
            this.K.get(i).U(view);
        }
        super.U(view);
        return this;
    }

    @Override // b.p.m
    /* renamed from: o */
    public m clone() {
        q qVar = (q) super.clone();
        qVar.K = new ArrayList<>();
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            qVar.j0(this.K.get(i).clone());
        }
        return qVar;
    }

    public q o0(long j) {
        ArrayList<m> arrayList;
        super.Y(j);
        if (this.f2755d >= 0 && (arrayList = this.K) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.K.get(i).Y(j);
            }
        }
        return this;
    }

    /* renamed from: p0 */
    public q a0(TimeInterpolator timeInterpolator) {
        this.O |= 1;
        ArrayList<m> arrayList = this.K;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.K.get(i).a0(timeInterpolator);
            }
        }
        super.a0(timeInterpolator);
        return this;
    }

    @Override // b.p.m
    public void q(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        long A = A();
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            m mVar = this.K.get(i);
            if (A > 0 && (this.L || i == 0)) {
                long A2 = mVar.A();
                if (A2 > 0) {
                    mVar.d0(A2 + A);
                } else {
                    mVar.d0(A);
                }
            }
            mVar.q(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }

    public q q0(int i) {
        if (i == 0) {
            this.L = true;
        } else if (i != 1) {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        } else {
            this.L = false;
        }
        return this;
    }

    /* renamed from: r0 */
    public q d0(long j) {
        super.d0(j);
        return this;
    }
}
