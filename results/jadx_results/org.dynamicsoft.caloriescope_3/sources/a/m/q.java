package a.m;

import a.m.m;
import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
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
        final /* synthetic */ m f385a;

        a(q qVar, m mVar) {
            this.f385a = mVar;
        }

        @Override // a.m.m.f
        public void c(m mVar) {
            this.f385a.o();
            mVar.b(this);
        }
    }

    /* loaded from: classes.dex */
    public static class b extends n {

        /* renamed from: a */
        q f386a;

        b(q qVar) {
            this.f386a = qVar;
        }

        @Override // a.m.n, a.m.m.f
        public void a(m mVar) {
            q qVar = this.f386a;
            if (!qVar.N) {
                qVar.p();
                this.f386a.N = true;
            }
        }

        @Override // a.m.m.f
        public void c(m mVar) {
            q qVar = this.f386a;
            int i = qVar.M - 1;
            qVar.M = i;
            if (i == 0) {
                qVar.N = false;
                qVar.b();
            }
            mVar.b(this);
        }
    }

    private void b(m mVar) {
        this.K.add(mVar);
        mVar.s = this;
    }

    private void r() {
        b bVar = new b(this);
        Iterator<m> it = this.K.iterator();
        while (it.hasNext()) {
            it.next().a(bVar);
        }
        this.M = this.K.size();
    }

    public m a(int i) {
        if (i < 0 || i >= this.K.size()) {
            return null;
        }
        return this.K.get(i);
    }

    @Override // a.m.m
    public q a(long j) {
        ArrayList<m> arrayList;
        super.a(j);
        if (this.d >= 0 && (arrayList = this.K) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.K.get(i).a(j);
            }
        }
        return this;
    }

    @Override // a.m.m
    public q a(m.f fVar) {
        super.a(fVar);
        return this;
    }

    public q a(m mVar) {
        b(mVar);
        long j = this.d;
        if (j >= 0) {
            mVar.a(j);
        }
        if ((this.O & 1) != 0) {
            mVar.a(e());
        }
        if ((this.O & 2) != 0) {
            mVar.a(h());
        }
        if ((this.O & 4) != 0) {
            mVar.a(g());
        }
        if ((this.O & 8) != 0) {
            mVar.a(d());
        }
        return this;
    }

    @Override // a.m.m
    public q a(TimeInterpolator timeInterpolator) {
        this.O |= 1;
        ArrayList<m> arrayList = this.K;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.K.get(i).a(timeInterpolator);
            }
        }
        super.a(timeInterpolator);
        return this;
    }

    @Override // a.m.m
    public q a(View view) {
        for (int i = 0; i < this.K.size(); i++) {
            this.K.get(i).a(view);
        }
        super.a(view);
        return this;
    }

    @Override // a.m.m
    public String a(String str) {
        String a2 = super.a(str);
        for (int i = 0; i < this.K.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(a2);
            sb.append("\n");
            sb.append(this.K.get(i).a(str + "  "));
            a2 = sb.toString();
        }
        return a2;
    }

    @Override // a.m.m
    public void a() {
        super.a();
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).a();
        }
    }

    @Override // a.m.m
    public void a(g gVar) {
        super.a(gVar);
        this.O |= 4;
        if (this.K != null) {
            for (int i = 0; i < this.K.size(); i++) {
                this.K.get(i).a(gVar);
            }
        }
    }

    @Override // a.m.m
    public void a(m.e eVar) {
        super.a(eVar);
        this.O |= 8;
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).a(eVar);
        }
    }

    @Override // a.m.m
    public void a(p pVar) {
        super.a(pVar);
        this.O |= 2;
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).a(pVar);
        }
    }

    @Override // a.m.m
    public void a(s sVar) {
        if (b(sVar.f391b)) {
            Iterator<m> it = this.K.iterator();
            while (it.hasNext()) {
                m next = it.next();
                if (next.b(sVar.f391b)) {
                    next.a(sVar);
                    sVar.f392c.add(next);
                }
            }
        }
    }

    @Override // a.m.m
    public void a(ViewGroup viewGroup, t tVar, t tVar2, ArrayList<s> arrayList, ArrayList<s> arrayList2) {
        long i = i();
        int size = this.K.size();
        for (int i2 = 0; i2 < size; i2++) {
            m mVar = this.K.get(i2);
            if (i > 0 && (this.L || i2 == 0)) {
                long i3 = mVar.i();
                if (i3 > 0) {
                    mVar.b(i3 + i);
                } else {
                    mVar.b(i);
                }
            }
            mVar.a(viewGroup, tVar, tVar2, arrayList, arrayList2);
        }
    }

    public q b(int i) {
        if (i == 0) {
            this.L = true;
        } else if (i != 1) {
            throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
        } else {
            this.L = false;
        }
        return this;
    }

    @Override // a.m.m
    public q b(long j) {
        super.b(j);
        return this;
    }

    @Override // a.m.m
    public q b(m.f fVar) {
        super.b(fVar);
        return this;
    }

    @Override // a.m.m
    public void b(s sVar) {
        super.b(sVar);
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).b(sVar);
        }
    }

    @Override // a.m.m
    public void c(s sVar) {
        if (b(sVar.f391b)) {
            Iterator<m> it = this.K.iterator();
            while (it.hasNext()) {
                m next = it.next();
                if (next.b(sVar.f391b)) {
                    next.c(sVar);
                    sVar.f392c.add(next);
                }
            }
        }
    }

    @Override // a.m.m
    public void c(View view) {
        super.c(view);
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).c(view);
        }
    }

    @Override // a.m.m
    public m clone() {
        q qVar = (q) super.clone();
        qVar.K = new ArrayList<>();
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            qVar.b(this.K.get(i).clone());
        }
        return qVar;
    }

    @Override // a.m.m
    public q d(View view) {
        for (int i = 0; i < this.K.size(); i++) {
            this.K.get(i).d(view);
        }
        super.d(view);
        return this;
    }

    @Override // a.m.m
    public void e(View view) {
        super.e(view);
        int size = this.K.size();
        for (int i = 0; i < size; i++) {
            this.K.get(i).e(view);
        }
    }

    @Override // a.m.m
    public void o() {
        if (this.K.isEmpty()) {
            p();
            b();
            return;
        }
        r();
        if (this.L) {
            Iterator<m> it = this.K.iterator();
            while (it.hasNext()) {
                it.next().o();
            }
            return;
        }
        for (int i = 1; i < this.K.size(); i++) {
            this.K.get(i - 1).a(new a(this, this.K.get(i)));
        }
        m mVar = this.K.get(0);
        if (mVar == null) {
            return;
        }
        mVar.o();
    }

    public int q() {
        return this.K.size();
    }
}
