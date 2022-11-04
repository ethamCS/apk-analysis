package a.e.a.j;

import a.e.a.j.e;
/* loaded from: classes.dex */
public class m extends o {

    /* renamed from: c */
    e f146c;
    m d;
    float e;
    m f;
    float g;
    private m i;
    int h = 0;
    private n j = null;
    private int k = 1;
    private n l = null;
    private int m = 1;

    public m(e eVar) {
        this.f146c = eVar;
    }

    String a(int i) {
        return i == 1 ? "DIRECT" : i == 2 ? "CENTER" : i == 3 ? "MATCH" : i == 4 ? "CHAIN" : i == 5 ? "BARRIER" : "UNCONNECTED";
    }

    public void a(int i, m mVar, int i2) {
        this.h = i;
        this.d = mVar;
        this.e = i2;
        mVar.a(this);
    }

    public void a(a.e.a.e eVar) {
        a.e.a.i e = this.f146c.e();
        m mVar = this.f;
        if (mVar == null) {
            eVar.a(e, (int) (this.g + 0.5f));
        } else {
            eVar.a(e, eVar.a(mVar.f146c), (int) (this.g + 0.5f), 6);
        }
    }

    public void a(m mVar, float f) {
        if (this.f149b == 0 || !(this.f == mVar || this.g == f)) {
            this.f = mVar;
            this.g = f;
            if (this.f149b == 1) {
                b();
            }
            a();
        }
    }

    public void a(m mVar, int i) {
        this.d = mVar;
        this.e = i;
        mVar.a(this);
    }

    public void a(m mVar, int i, n nVar) {
        this.d = mVar;
        mVar.a(this);
        this.j = nVar;
        this.k = i;
        nVar.a(this);
    }

    public void b(int i) {
        this.h = i;
    }

    public void b(m mVar, float f) {
        this.i = mVar;
    }

    public void b(m mVar, int i, n nVar) {
        this.i = mVar;
        this.l = nVar;
        this.m = i;
    }

    @Override // a.e.a.j.o
    public void d() {
        super.d();
        this.d = null;
        this.e = 0.0f;
        this.j = null;
        this.k = 1;
        this.l = null;
        this.m = 1;
        this.f = null;
        this.g = 0.0f;
        this.i = null;
        this.h = 0;
    }

    @Override // a.e.a.j.o
    public void e() {
        m mVar;
        m mVar2;
        m mVar3;
        m mVar4;
        m mVar5;
        m mVar6;
        m mVar7;
        float f;
        e eVar;
        float f2;
        float f3;
        m mVar8;
        float f4;
        boolean z = true;
        if (this.f149b == 1 || this.h == 4) {
            return;
        }
        n nVar = this.j;
        if (nVar != null) {
            if (nVar.f149b != 1) {
                return;
            }
            this.e = this.k * nVar.f147c;
        }
        n nVar2 = this.l;
        if (nVar2 != null) {
            if (nVar2.f149b != 1) {
                return;
            }
            float f5 = nVar2.f147c;
        }
        if (this.h == 1 && ((mVar8 = this.d) == null || mVar8.f149b == 1)) {
            m mVar9 = this.d;
            if (mVar9 == null) {
                this.f = this;
                f4 = this.e;
            } else {
                this.f = mVar9.f;
                f4 = mVar9.g + this.e;
            }
            this.g = f4;
            a();
            return;
        }
        if (this.h == 2 && (mVar4 = this.d) != null && mVar4.f149b == 1 && (mVar5 = this.i) != null && (mVar6 = mVar5.d) != null && mVar6.f149b == 1) {
            if (a.e.a.e.h() != null) {
                a.e.a.e.h().v++;
            }
            this.f = this.d.f;
            m mVar10 = this.i;
            mVar10.f = mVar10.d.f;
            e.d dVar = this.f146c.f126c;
            int i = 0;
            if (dVar != e.d.RIGHT && dVar != e.d.BOTTOM) {
                z = false;
            }
            if (z) {
                f = this.d.g;
                mVar7 = this.i.d;
            } else {
                f = this.i.d.g;
                mVar7 = this.d;
            }
            float f6 = f - mVar7.g;
            e.d dVar2 = this.f146c.f126c;
            if (dVar2 == e.d.LEFT || dVar2 == e.d.RIGHT) {
                f3 = f6 - this.f146c.f125b.s();
                f2 = this.f146c.f125b.V;
            } else {
                f3 = f6 - eVar.f125b.i();
                f2 = this.f146c.f125b.W;
            }
            int b2 = this.f146c.b();
            int b3 = this.i.f146c.b();
            if (this.f146c.g() == this.i.f146c.g()) {
                f2 = 0.5f;
                b3 = 0;
            } else {
                i = b2;
            }
            float f7 = i;
            float f8 = b3;
            float f9 = (f3 - f7) - f8;
            if (z) {
                m mVar11 = this.i;
                mVar11.g = mVar11.d.g + f8 + (f9 * f2);
                this.g = (this.d.g - f7) - (f9 * (1.0f - f2));
            } else {
                this.g = this.d.g + f7 + (f9 * f2);
                m mVar12 = this.i;
                mVar12.g = (mVar12.d.g - f8) - (f9 * (1.0f - f2));
            }
        } else if (this.h != 3 || (mVar = this.d) == null || mVar.f149b != 1 || (mVar2 = this.i) == null || (mVar3 = mVar2.d) == null || mVar3.f149b != 1) {
            if (this.h != 5) {
                return;
            }
            this.f146c.f125b.G();
            return;
        } else {
            if (a.e.a.e.h() != null) {
                a.e.a.e.h().w++;
            }
            m mVar13 = this.d;
            this.f = mVar13.f;
            m mVar14 = this.i;
            m mVar15 = mVar14.d;
            mVar14.f = mVar15.f;
            this.g = mVar13.g + this.e;
            mVar14.g = mVar15.g + mVar14.e;
        }
        a();
        this.i.a();
    }

    public float f() {
        return this.g;
    }

    public void g() {
        e g = this.f146c.g();
        if (g == null) {
            return;
        }
        if (g.g() == this.f146c) {
            this.h = 4;
            g.d().h = 4;
        }
        int b2 = this.f146c.b();
        e.d dVar = this.f146c.f126c;
        if (dVar == e.d.RIGHT || dVar == e.d.BOTTOM) {
            b2 = -b2;
        }
        a(g.d(), b2);
    }

    public String toString() {
        StringBuilder sb;
        String str;
        if (this.f149b != 1) {
            sb = new StringBuilder();
            sb.append("{ ");
            sb.append(this.f146c);
            str = " UNRESOLVED} type: ";
        } else if (this.f == this) {
            sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f146c);
            sb.append(", RESOLVED: ");
            sb.append(this.g);
            str = "]  type: ";
        } else {
            sb = new StringBuilder();
            sb.append("[");
            sb.append(this.f146c);
            sb.append(", RESOLVED: ");
            sb.append(this.f);
            sb.append(":");
            sb.append(this.g);
            str = "] type: ";
        }
        sb.append(str);
        sb.append(a(this.h));
        return sb.toString();
    }
}
