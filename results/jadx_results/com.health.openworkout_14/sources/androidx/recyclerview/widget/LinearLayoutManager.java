package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.List;
/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.o implements i.j, RecyclerView.z.b {
    int A;
    int B;
    private boolean C;
    d D;
    final a E;
    private final b F;
    private int G;
    private int[] H;
    int s;
    private c t;
    q u;
    private boolean v;
    private boolean w;
    boolean x;
    private boolean y;
    private boolean z;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        q f1506a;

        /* renamed from: b */
        int f1507b;

        /* renamed from: c */
        int f1508c;

        /* renamed from: d */
        boolean f1509d;

        /* renamed from: e */
        boolean f1510e;

        a() {
            e();
        }

        void a() {
            this.f1508c = this.f1509d ? this.f1506a.i() : this.f1506a.m();
        }

        public void b(View view, int i) {
            this.f1508c = this.f1509d ? this.f1506a.d(view) + this.f1506a.o() : this.f1506a.g(view);
            this.f1507b = i;
        }

        public void c(View view, int i) {
            int o = this.f1506a.o();
            if (o >= 0) {
                b(view, i);
                return;
            }
            this.f1507b = i;
            if (this.f1509d) {
                int i2 = (this.f1506a.i() - o) - this.f1506a.d(view);
                this.f1508c = this.f1506a.i() - i2;
                if (i2 <= 0) {
                    return;
                }
                int e2 = this.f1508c - this.f1506a.e(view);
                int m = this.f1506a.m();
                int min = e2 - (m + Math.min(this.f1506a.g(view) - m, 0));
                if (min >= 0) {
                    return;
                }
                this.f1508c += Math.min(i2, -min);
                return;
            }
            int g2 = this.f1506a.g(view);
            int m2 = g2 - this.f1506a.m();
            this.f1508c = g2;
            if (m2 <= 0) {
                return;
            }
            int i3 = (this.f1506a.i() - Math.min(0, (this.f1506a.i() - o) - this.f1506a.d(view))) - (g2 + this.f1506a.e(view));
            if (i3 >= 0) {
                return;
            }
            this.f1508c -= Math.min(m2, -i3);
        }

        boolean d(View view, RecyclerView.a0 a0Var) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return !pVar.c() && pVar.a() >= 0 && pVar.a() < a0Var.b();
        }

        void e() {
            this.f1507b = -1;
            this.f1508c = Integer.MIN_VALUE;
            this.f1509d = false;
            this.f1510e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f1507b + ", mCoordinate=" + this.f1508c + ", mLayoutFromEnd=" + this.f1509d + ", mValid=" + this.f1510e + '}';
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public int f1511a;

        /* renamed from: b */
        public boolean f1512b;

        /* renamed from: c */
        public boolean f1513c;

        /* renamed from: d */
        public boolean f1514d;

        protected b() {
        }

        void a() {
            this.f1511a = 0;
            this.f1512b = false;
            this.f1513c = false;
            this.f1514d = false;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: b */
        int f1516b;

        /* renamed from: c */
        int f1517c;

        /* renamed from: d */
        int f1518d;

        /* renamed from: e */
        int f1519e;

        /* renamed from: f */
        int f1520f;

        /* renamed from: g */
        int f1521g;
        boolean j;
        int k;
        boolean m;

        /* renamed from: a */
        boolean f1515a = true;

        /* renamed from: h */
        int f1522h = 0;
        int i = 0;
        List<RecyclerView.d0> l = null;

        c() {
        }

        private View e() {
            int size = this.l.size();
            for (int i = 0; i < size; i++) {
                View view = this.l.get(i).f1551a;
                RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
                if (!pVar.c() && this.f1518d == pVar.a()) {
                    b(view);
                    return view;
                }
            }
            return null;
        }

        public void a() {
            b(null);
        }

        public void b(View view) {
            View f2 = f(view);
            this.f1518d = f2 == null ? -1 : ((RecyclerView.p) f2.getLayoutParams()).a();
        }

        public boolean c(RecyclerView.a0 a0Var) {
            int i = this.f1518d;
            return i >= 0 && i < a0Var.b();
        }

        public View d(RecyclerView.v vVar) {
            if (this.l != null) {
                return e();
            }
            View o = vVar.o(this.f1518d);
            this.f1518d += this.f1519e;
            return o;
        }

        public View f(View view) {
            int a2;
            int size = this.l.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.l.get(i2).f1551a;
                RecyclerView.p pVar = (RecyclerView.p) view3.getLayoutParams();
                if (view3 != view && !pVar.c() && (a2 = (pVar.a() - this.f1518d) * this.f1519e) >= 0 && a2 < i) {
                    view2 = view3;
                    if (a2 == 0) {
                        break;
                    }
                    i = a2;
                }
            }
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: b */
        int f1523b;

        /* renamed from: c */
        int f1524c;

        /* renamed from: d */
        boolean f1525d;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<d> {
            a() {
            }

            /* renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            /* renamed from: b */
            public d[] newArray(int i) {
                return new d[i];
            }
        }

        public d() {
        }

        d(Parcel parcel) {
            this.f1523b = parcel.readInt();
            this.f1524c = parcel.readInt();
            this.f1525d = parcel.readInt() != 1 ? false : true;
        }

        public d(d dVar) {
            this.f1523b = dVar.f1523b;
            this.f1524c = dVar.f1524c;
            this.f1525d = dVar.f1525d;
        }

        boolean a() {
            return this.f1523b >= 0;
        }

        void c() {
            this.f1523b = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1523b);
            parcel.writeInt(this.f1524c);
            parcel.writeInt(this.f1525d ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        E2(i);
        F2(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        RecyclerView.o.d j0 = RecyclerView.o.j0(context, attributeSet, i, i2);
        E2(j0.f1582a);
        F2(j0.f1584c);
        G2(j0.f1585d);
    }

    private void B2() {
        this.x = (this.s == 1 || !r2()) ? this.w : !this.w;
    }

    private boolean H2(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar) {
        boolean z = false;
        if (K() == 0) {
            return false;
        }
        View W = W();
        if (W != null && aVar.d(W, a0Var)) {
            aVar.c(W, i0(W));
            return true;
        } else if (this.v != this.y) {
            return false;
        } else {
            View j2 = aVar.f1509d ? j2(vVar, a0Var) : k2(vVar, a0Var);
            if (j2 == null) {
                return false;
            }
            aVar.b(j2, i0(j2));
            if (!a0Var.e() && M1()) {
                if (this.u.g(j2) >= this.u.i() || this.u.d(j2) < this.u.m()) {
                    z = true;
                }
                if (z) {
                    aVar.f1508c = aVar.f1509d ? this.u.i() : this.u.m();
                }
            }
            return true;
        }
    }

    private boolean I2(RecyclerView.a0 a0Var, a aVar) {
        int i;
        boolean z = false;
        if (!a0Var.e() && (i = this.A) != -1) {
            if (i >= 0 && i < a0Var.b()) {
                aVar.f1507b = this.A;
                d dVar = this.D;
                if (dVar != null && dVar.a()) {
                    boolean z2 = this.D.f1525d;
                    aVar.f1509d = z2;
                    aVar.f1508c = z2 ? this.u.i() - this.D.f1524c : this.u.m() + this.D.f1524c;
                    return true;
                } else if (this.B != Integer.MIN_VALUE) {
                    boolean z3 = this.x;
                    aVar.f1509d = z3;
                    aVar.f1508c = z3 ? this.u.i() - this.B : this.u.m() + this.B;
                    return true;
                } else {
                    View D = D(this.A);
                    if (D == null) {
                        if (K() > 0) {
                            if ((this.A < i0(J(0))) == this.x) {
                                z = true;
                            }
                            aVar.f1509d = z;
                        }
                        aVar.a();
                    } else if (this.u.e(D) > this.u.n()) {
                        aVar.a();
                        return true;
                    } else if (this.u.g(D) - this.u.m() < 0) {
                        aVar.f1508c = this.u.m();
                        aVar.f1509d = false;
                        return true;
                    } else if (this.u.i() - this.u.d(D) < 0) {
                        aVar.f1508c = this.u.i();
                        aVar.f1509d = true;
                        return true;
                    } else {
                        aVar.f1508c = aVar.f1509d ? this.u.d(D) + this.u.o() : this.u.g(D);
                    }
                    return true;
                }
            }
            this.A = -1;
            this.B = Integer.MIN_VALUE;
        }
        return false;
    }

    private void J2(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar) {
        if (!I2(a0Var, aVar) && !H2(vVar, a0Var, aVar)) {
            aVar.a();
            aVar.f1507b = this.y ? a0Var.b() - 1 : 0;
        }
    }

    private void K2(int i, int i2, boolean z, RecyclerView.a0 a0Var) {
        int i3;
        this.t.m = A2();
        this.t.f1520f = i;
        int[] iArr = this.H;
        boolean z2 = false;
        iArr[0] = 0;
        int i4 = 1;
        iArr[1] = 0;
        N1(a0Var, iArr);
        int max = Math.max(0, this.H[0]);
        int max2 = Math.max(0, this.H[1]);
        if (i == 1) {
            z2 = true;
        }
        c cVar = this.t;
        int i5 = z2 ? max2 : max;
        cVar.f1522h = i5;
        if (!z2) {
            max = max2;
        }
        cVar.i = max;
        if (z2) {
            cVar.f1522h = i5 + this.u.j();
            View n2 = n2();
            c cVar2 = this.t;
            if (this.x) {
                i4 = -1;
            }
            cVar2.f1519e = i4;
            int i0 = i0(n2);
            c cVar3 = this.t;
            cVar2.f1518d = i0 + cVar3.f1519e;
            cVar3.f1516b = this.u.d(n2);
            i3 = this.u.d(n2) - this.u.i();
        } else {
            View o2 = o2();
            this.t.f1522h += this.u.m();
            c cVar4 = this.t;
            if (!this.x) {
                i4 = -1;
            }
            cVar4.f1519e = i4;
            int i02 = i0(o2);
            c cVar5 = this.t;
            cVar4.f1518d = i02 + cVar5.f1519e;
            cVar5.f1516b = this.u.g(o2);
            i3 = (-this.u.g(o2)) + this.u.m();
        }
        c cVar6 = this.t;
        cVar6.f1517c = i2;
        if (z) {
            cVar6.f1517c = i2 - i3;
        }
        cVar6.f1521g = i3;
    }

    private void L2(int i, int i2) {
        this.t.f1517c = this.u.i() - i2;
        c cVar = this.t;
        cVar.f1519e = this.x ? -1 : 1;
        cVar.f1518d = i;
        cVar.f1520f = 1;
        cVar.f1516b = i2;
        cVar.f1521g = Integer.MIN_VALUE;
    }

    private void M2(a aVar) {
        L2(aVar.f1507b, aVar.f1508c);
    }

    private void N2(int i, int i2) {
        this.t.f1517c = i2 - this.u.m();
        c cVar = this.t;
        cVar.f1518d = i;
        cVar.f1519e = this.x ? 1 : -1;
        cVar.f1520f = -1;
        cVar.f1516b = i2;
        cVar.f1521g = Integer.MIN_VALUE;
    }

    private void O2(a aVar) {
        N2(aVar.f1507b, aVar.f1508c);
    }

    private int P1(RecyclerView.a0 a0Var) {
        if (K() == 0) {
            return 0;
        }
        U1();
        return s.a(a0Var, this.u, Z1(!this.z, true), Y1(!this.z, true), this, this.z);
    }

    private int Q1(RecyclerView.a0 a0Var) {
        if (K() == 0) {
            return 0;
        }
        U1();
        return s.b(a0Var, this.u, Z1(!this.z, true), Y1(!this.z, true), this, this.z, this.x);
    }

    private int R1(RecyclerView.a0 a0Var) {
        if (K() == 0) {
            return 0;
        }
        U1();
        return s.c(a0Var, this.u, Z1(!this.z, true), Y1(!this.z, true), this, this.z);
    }

    private View W1() {
        return e2(0, K());
    }

    private View X1(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return i2(vVar, a0Var, 0, K(), a0Var.b());
    }

    private View b2() {
        return e2(K() - 1, -1);
    }

    private View c2(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return i2(vVar, a0Var, K() - 1, -1, a0Var.b());
    }

    private View g2() {
        return this.x ? W1() : b2();
    }

    private View h2() {
        return this.x ? b2() : W1();
    }

    private View j2(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return this.x ? X1(vVar, a0Var) : c2(vVar, a0Var);
    }

    private View k2(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return this.x ? c2(vVar, a0Var) : X1(vVar, a0Var);
    }

    private int l2(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int i2;
        int i3 = this.u.i() - i;
        if (i3 > 0) {
            int i4 = -C2(-i3, vVar, a0Var);
            int i5 = i + i4;
            if (!z || (i2 = this.u.i() - i5) <= 0) {
                return i4;
            }
            this.u.r(i2);
            return i2 + i4;
        }
        return 0;
    }

    private int m2(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int m;
        int m2 = i - this.u.m();
        if (m2 > 0) {
            int i2 = -C2(m2, vVar, a0Var);
            int i3 = i + i2;
            if (!z || (m = i3 - this.u.m()) <= 0) {
                return i2;
            }
            this.u.r(-m);
            return i2 - m;
        }
        return 0;
    }

    private View n2() {
        return J(this.x ? 0 : K() - 1);
    }

    private View o2() {
        return J(this.x ? K() - 1 : 0);
    }

    private void u2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i, int i2) {
        if (!a0Var.g() || K() == 0 || a0Var.e() || !M1()) {
            return;
        }
        List<RecyclerView.d0> k = vVar.k();
        int size = k.size();
        int i0 = i0(J(0));
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView.d0 d0Var = k.get(i5);
            if (!d0Var.v()) {
                char c2 = 1;
                if ((d0Var.m() < i0) != this.x) {
                    c2 = 65535;
                }
                int e2 = this.u.e(d0Var.f1551a);
                if (c2 == 65535) {
                    i3 += e2;
                } else {
                    i4 += e2;
                }
            }
        }
        this.t.l = k;
        if (i3 > 0) {
            N2(i0(o2()), i);
            c cVar = this.t;
            cVar.f1522h = i3;
            cVar.f1517c = 0;
            cVar.a();
            V1(vVar, this.t, a0Var, false);
        }
        if (i4 > 0) {
            L2(i0(n2()), i2);
            c cVar2 = this.t;
            cVar2.f1522h = i4;
            cVar2.f1517c = 0;
            cVar2.a();
            V1(vVar, this.t, a0Var, false);
        }
        this.t.l = null;
    }

    private void w2(RecyclerView.v vVar, c cVar) {
        if (!cVar.f1515a || cVar.m) {
            return;
        }
        int i = cVar.f1521g;
        int i2 = cVar.i;
        if (cVar.f1520f == -1) {
            y2(vVar, i, i2);
        } else {
            z2(vVar, i, i2);
        }
    }

    private void x2(RecyclerView.v vVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                o1(i, vVar);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            o1(i3, vVar);
        }
    }

    private void y2(RecyclerView.v vVar, int i, int i2) {
        int K = K();
        if (i < 0) {
            return;
        }
        int h2 = (this.u.h() - i) + i2;
        if (this.x) {
            for (int i3 = 0; i3 < K; i3++) {
                View J = J(i3);
                if (this.u.g(J) < h2 || this.u.q(J) < h2) {
                    x2(vVar, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = K - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View J2 = J(i5);
            if (this.u.g(J2) < h2 || this.u.q(J2) < h2) {
                x2(vVar, i4, i5);
                return;
            }
        }
    }

    private void z2(RecyclerView.v vVar, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int K = K();
        if (!this.x) {
            for (int i4 = 0; i4 < K; i4++) {
                View J = J(i4);
                if (this.u.d(J) > i3 || this.u.p(J) > i3) {
                    x2(vVar, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = K - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View J2 = J(i6);
            if (this.u.d(J2) > i3 || this.u.p(J2) > i3) {
                x2(vVar, i5, i6);
                return;
            }
        }
    }

    boolean A2() {
        return this.u.k() == 0 && this.u.h() == 0;
    }

    int C2(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (K() == 0 || i == 0) {
            return 0;
        }
        U1();
        this.t.f1515a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        K2(i2, abs, true, a0Var);
        c cVar = this.t;
        int V1 = cVar.f1521g + V1(vVar, cVar, a0Var, false);
        if (V1 < 0) {
            return 0;
        }
        if (abs > V1) {
            i = i2 * V1;
        }
        this.u.r(-i);
        this.t.k = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View D(int i) {
        int K = K();
        if (K == 0) {
            return null;
        }
        int i0 = i - i0(J(0));
        if (i0 >= 0 && i0 < K) {
            View J = J(i0);
            if (i0(J) == i) {
                return J;
            }
        }
        return super.D(i);
    }

    public void D2(int i, int i2) {
        this.A = i;
        this.B = i2;
        d dVar = this.D;
        if (dVar != null) {
            dVar.c();
        }
        u1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p E() {
        return new RecyclerView.p(-2, -2);
    }

    public void E2(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        h(null);
        if (i == this.s && this.u != null) {
            return;
        }
        q b2 = q.b(this, i);
        this.u = b2;
        this.E.f1506a = b2;
        this.s = i;
        u1();
    }

    public void F2(boolean z) {
        h(null);
        if (z == this.w) {
            return;
        }
        this.w = z;
        u1();
    }

    public void G2(boolean z) {
        h(null);
        if (this.y == z) {
            return;
        }
        this.y = z;
        u1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    boolean H1() {
        return (Y() == 1073741824 || q0() == 1073741824 || !r0()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void J0(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.J0(recyclerView, vVar);
        if (this.C) {
            l1(vVar);
            vVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void J1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
        m mVar = new m(recyclerView.getContext());
        mVar.p(i);
        K1(mVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View K0(View view, int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int S1;
        B2();
        if (K() == 0 || (S1 = S1(i)) == Integer.MIN_VALUE) {
            return null;
        }
        U1();
        K2(S1, (int) (this.u.n() * 0.33333334f), false, a0Var);
        c cVar = this.t;
        cVar.f1521g = Integer.MIN_VALUE;
        cVar.f1515a = false;
        V1(vVar, cVar, a0Var, true);
        View h2 = S1 == -1 ? h2() : g2();
        View o2 = S1 == -1 ? o2() : n2();
        if (!o2.hasFocusable()) {
            return h2;
        }
        if (h2 != null) {
            return o2;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void L0(AccessibilityEvent accessibilityEvent) {
        super.L0(accessibilityEvent);
        if (K() > 0) {
            accessibilityEvent.setFromIndex(a2());
            accessibilityEvent.setToIndex(d2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean M1() {
        return this.D == null && this.v == this.y;
    }

    protected void N1(RecyclerView.a0 a0Var, int[] iArr) {
        int i;
        int p2 = p2(a0Var);
        if (this.t.f1520f == -1) {
            i = 0;
        } else {
            i = p2;
            p2 = 0;
        }
        iArr[0] = p2;
        iArr[1] = i;
    }

    void O1(RecyclerView.a0 a0Var, c cVar, RecyclerView.o.c cVar2) {
        int i = cVar.f1518d;
        if (i < 0 || i >= a0Var.b()) {
            return;
        }
        cVar2.a(i, Math.max(0, cVar.f1521g));
    }

    public int S1(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.s == 1) ? 1 : Integer.MIN_VALUE : this.s == 0 ? 1 : Integer.MIN_VALUE : this.s == 1 ? -1 : Integer.MIN_VALUE : this.s == 0 ? -1 : Integer.MIN_VALUE : (this.s != 1 && r2()) ? -1 : 1 : (this.s != 1 && r2()) ? 1 : -1;
    }

    c T1() {
        return new c();
    }

    public void U1() {
        if (this.t == null) {
            this.t = T1();
        }
    }

    int V1(RecyclerView.v vVar, c cVar, RecyclerView.a0 a0Var, boolean z) {
        int i = cVar.f1517c;
        int i2 = cVar.f1521g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.f1521g = i2 + i;
            }
            w2(vVar, cVar);
        }
        int i3 = cVar.f1517c + cVar.f1522h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.m && i3 <= 0) || !cVar.c(a0Var)) {
                break;
            }
            bVar.a();
            t2(vVar, a0Var, cVar, bVar);
            if (!bVar.f1512b) {
                cVar.f1516b += bVar.f1511a * cVar.f1520f;
                if (!bVar.f1513c || cVar.l != null || !a0Var.e()) {
                    int i4 = cVar.f1517c;
                    int i5 = bVar.f1511a;
                    cVar.f1517c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.f1521g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.f1511a;
                    cVar.f1521g = i7;
                    int i8 = cVar.f1517c;
                    if (i8 < 0) {
                        cVar.f1521g = i7 + i8;
                    }
                    w2(vVar, cVar);
                }
                if (z && bVar.f1514d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f1517c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Y0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View D;
        int i7;
        int i8;
        int i9 = -1;
        if (!(this.D == null && this.A == -1) && a0Var.b() == 0) {
            l1(vVar);
            return;
        }
        d dVar = this.D;
        if (dVar != null && dVar.a()) {
            this.A = this.D.f1523b;
        }
        U1();
        this.t.f1515a = false;
        B2();
        View W = W();
        a aVar = this.E;
        if (!aVar.f1510e || this.A != -1 || this.D != null) {
            aVar.e();
            a aVar2 = this.E;
            aVar2.f1509d = this.x ^ this.y;
            J2(vVar, a0Var, aVar2);
            this.E.f1510e = true;
        } else if (W != null && (this.u.g(W) >= this.u.i() || this.u.d(W) <= this.u.m())) {
            this.E.c(W, i0(W));
        }
        c cVar = this.t;
        cVar.f1520f = cVar.k >= 0 ? 1 : -1;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        N1(a0Var, iArr);
        int max = Math.max(0, this.H[0]) + this.u.m();
        int max2 = Math.max(0, this.H[1]) + this.u.j();
        if (a0Var.e() && (i6 = this.A) != -1 && this.B != Integer.MIN_VALUE && (D = D(i6)) != null) {
            if (this.x) {
                i7 = this.u.i() - this.u.d(D);
                i8 = this.B;
            } else {
                i8 = this.u.g(D) - this.u.m();
                i7 = this.B;
            }
            int i10 = i7 - i8;
            if (i10 > 0) {
                max += i10;
            } else {
                max2 -= i10;
            }
        }
        a aVar3 = this.E;
        if (!aVar3.f1509d ? !this.x : this.x) {
            i9 = 1;
        }
        v2(vVar, a0Var, aVar3, i9);
        x(vVar);
        this.t.m = A2();
        this.t.j = a0Var.e();
        this.t.i = 0;
        a aVar4 = this.E;
        if (aVar4.f1509d) {
            O2(aVar4);
            c cVar2 = this.t;
            cVar2.f1522h = max;
            V1(vVar, cVar2, a0Var, false);
            c cVar3 = this.t;
            i2 = cVar3.f1516b;
            int i11 = cVar3.f1518d;
            int i12 = cVar3.f1517c;
            if (i12 > 0) {
                max2 += i12;
            }
            M2(this.E);
            c cVar4 = this.t;
            cVar4.f1522h = max2;
            cVar4.f1518d += cVar4.f1519e;
            V1(vVar, cVar4, a0Var, false);
            c cVar5 = this.t;
            i = cVar5.f1516b;
            int i13 = cVar5.f1517c;
            if (i13 > 0) {
                N2(i11, i2);
                c cVar6 = this.t;
                cVar6.f1522h = i13;
                V1(vVar, cVar6, a0Var, false);
                i2 = this.t.f1516b;
            }
        } else {
            M2(aVar4);
            c cVar7 = this.t;
            cVar7.f1522h = max2;
            V1(vVar, cVar7, a0Var, false);
            c cVar8 = this.t;
            i = cVar8.f1516b;
            int i14 = cVar8.f1518d;
            int i15 = cVar8.f1517c;
            if (i15 > 0) {
                max += i15;
            }
            O2(this.E);
            c cVar9 = this.t;
            cVar9.f1522h = max;
            cVar9.f1518d += cVar9.f1519e;
            V1(vVar, cVar9, a0Var, false);
            c cVar10 = this.t;
            i2 = cVar10.f1516b;
            int i16 = cVar10.f1517c;
            if (i16 > 0) {
                L2(i14, i);
                c cVar11 = this.t;
                cVar11.f1522h = i16;
                V1(vVar, cVar11, a0Var, false);
                i = this.t.f1516b;
            }
        }
        if (K() > 0) {
            if (this.x ^ this.y) {
                int l2 = l2(i, vVar, a0Var, true);
                i4 = i2 + l2;
                i3 = i + l2;
                i5 = m2(i4, vVar, a0Var, false);
            } else {
                int m2 = m2(i2, vVar, a0Var, true);
                i4 = i2 + m2;
                i3 = i + m2;
                i5 = l2(i3, vVar, a0Var, false);
            }
            i2 = i4 + i5;
            i = i3 + i5;
        }
        u2(vVar, a0Var, i2, i);
        if (!a0Var.e()) {
            this.u.s();
        } else {
            this.E.e();
        }
        this.v = this.y;
    }

    public View Y1(boolean z, boolean z2) {
        int K;
        int i;
        if (this.x) {
            K = 0;
            i = K();
        } else {
            K = K() - 1;
            i = -1;
        }
        return f2(K, i, z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Z0(RecyclerView.a0 a0Var) {
        super.Z0(a0Var);
        this.D = null;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.E.e();
    }

    public View Z1(boolean z, boolean z2) {
        int i;
        int K;
        if (this.x) {
            i = K() - 1;
            K = -1;
        } else {
            i = 0;
            K = K();
        }
        return f2(i, K, z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF a(int i) {
        if (K() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < i0(J(0))) {
            z = true;
        }
        if (z != this.x) {
            i2 = -1;
        }
        return this.s == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    public int a2() {
        View f2 = f2(0, K(), false, true);
        if (f2 == null) {
            return -1;
        }
        return i0(f2);
    }

    @Override // androidx.recyclerview.widget.i.j
    public void b(View view, View view2, int i, int i2) {
        int i3;
        h("Cannot drop a view during a scroll or layout calculation");
        U1();
        B2();
        int i0 = i0(view);
        int i02 = i0(view2);
        char c2 = i0 < i02 ? (char) 1 : (char) 65535;
        if (this.x) {
            if (c2 == 1) {
                D2(i02, this.u.i() - (this.u.g(view2) + this.u.e(view)));
                return;
            }
            i3 = this.u.i() - this.u.d(view2);
        } else if (c2 != 65535) {
            D2(i02, this.u.d(view2) - this.u.e(view));
            return;
        } else {
            i3 = this.u.g(view2);
        }
        D2(i02, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void d1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.D = (d) parcelable;
            u1();
        }
    }

    public int d2() {
        View f2 = f2(K() - 1, -1, false, true);
        if (f2 == null) {
            return -1;
        }
        return i0(f2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable e1() {
        if (this.D != null) {
            return new d(this.D);
        }
        d dVar = new d();
        if (K() > 0) {
            U1();
            boolean z = this.v ^ this.x;
            dVar.f1525d = z;
            if (z) {
                View n2 = n2();
                dVar.f1524c = this.u.i() - this.u.d(n2);
                dVar.f1523b = i0(n2);
            } else {
                View o2 = o2();
                dVar.f1523b = i0(o2);
                dVar.f1524c = this.u.g(o2) - this.u.m();
            }
        } else {
            dVar.c();
        }
        return dVar;
    }

    View e2(int i, int i2) {
        int i3;
        int i4;
        U1();
        if ((i2 > i ? (char) 1 : i2 < i ? (char) 65535 : (char) 0) == 0) {
            return J(i);
        }
        if (this.u.g(J(i)) < this.u.m()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        return (this.s == 0 ? this.f1576e : this.f1577f).a(i, i2, i4, i3);
    }

    View f2(int i, int i2, boolean z, boolean z2) {
        U1();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        return (this.s == 0 ? this.f1576e : this.f1577f).a(i, i2, i4, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void h(String str) {
        if (this.D == null) {
            super.h(str);
        }
    }

    View i2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i, int i2, int i3) {
        U1();
        int m = this.u.m();
        int i4 = this.u.i();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View J = J(i);
            int i0 = i0(J);
            if (i0 >= 0 && i0 < i3) {
                if (((RecyclerView.p) J.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = J;
                    }
                } else if (this.u.g(J) < i4 && this.u.d(J) >= m) {
                    return J;
                } else {
                    if (view == null) {
                        view = J;
                    }
                }
            }
            i += i5;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean l() {
        return this.s == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean m() {
        return this.s == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void p(int i, int i2, RecyclerView.a0 a0Var, RecyclerView.o.c cVar) {
        if (this.s != 0) {
            i = i2;
        }
        if (K() == 0 || i == 0) {
            return;
        }
        U1();
        K2(i > 0 ? 1 : -1, Math.abs(i), true, a0Var);
        O1(a0Var, this.t, cVar);
    }

    @Deprecated
    protected int p2(RecyclerView.a0 a0Var) {
        if (a0Var.d()) {
            return this.u.n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void q(int i, RecyclerView.o.c cVar) {
        boolean z;
        int i2;
        d dVar = this.D;
        int i3 = -1;
        if (dVar == null || !dVar.a()) {
            B2();
            z = this.x;
            i2 = this.A;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            d dVar2 = this.D;
            z = dVar2.f1525d;
            i2 = dVar2.f1523b;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.G && i2 >= 0 && i2 < i; i4++) {
            cVar.a(i2, 0);
            i2 += i3;
        }
    }

    public int q2() {
        return this.s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int r(RecyclerView.a0 a0Var) {
        return P1(a0Var);
    }

    public boolean r2() {
        return a0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int s(RecyclerView.a0 a0Var) {
        return Q1(a0Var);
    }

    public boolean s2() {
        return this.z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int t(RecyclerView.a0 a0Var) {
        return R1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean t0() {
        return true;
    }

    void t2(RecyclerView.v vVar, RecyclerView.a0 a0Var, c cVar, b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View d2 = cVar.d(vVar);
        if (d2 == null) {
            bVar.f1512b = true;
            return;
        }
        RecyclerView.p pVar = (RecyclerView.p) d2.getLayoutParams();
        if (cVar.l == null) {
            if (this.x == (cVar.f1520f == -1)) {
                e(d2);
            } else {
                f(d2, 0);
            }
        } else {
            if (this.x == (cVar.f1520f == -1)) {
                c(d2);
            } else {
                d(d2, 0);
            }
        }
        B0(d2, 0, 0);
        bVar.f1511a = this.u.e(d2);
        if (this.s == 1) {
            if (r2()) {
                i5 = p0() - g0();
                i4 = i5 - this.u.f(d2);
            } else {
                i4 = f0();
                i5 = this.u.f(d2) + i4;
            }
            int i6 = cVar.f1520f;
            int i7 = cVar.f1516b;
            if (i6 == -1) {
                i = i7;
                i2 = i5;
                i3 = i7 - bVar.f1511a;
            } else {
                i3 = i7;
                i2 = i5;
                i = bVar.f1511a + i7;
            }
        } else {
            int h0 = h0();
            int f2 = this.u.f(d2) + h0;
            int i8 = cVar.f1520f;
            int i9 = cVar.f1516b;
            if (i8 == -1) {
                i2 = i9;
                i3 = h0;
                i = f2;
                i4 = i9 - bVar.f1511a;
            } else {
                i3 = h0;
                i2 = bVar.f1511a + i9;
                i = f2;
                i4 = i9;
            }
        }
        A0(d2, i4, i3, i2, i);
        if (pVar.c() || pVar.b()) {
            bVar.f1513c = true;
        }
        bVar.f1514d = d2.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int u(RecyclerView.a0 a0Var) {
        return P1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.a0 a0Var) {
        return Q1(a0Var);
    }

    public void v2(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar, int i) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int w(RecyclerView.a0 a0Var) {
        return R1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int x1(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.s == 1) {
            return 0;
        }
        return C2(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void y1(int i) {
        this.A = i;
        this.B = Integer.MIN_VALUE;
        d dVar = this.D;
        if (dVar != null) {
            dVar.c();
        }
        u1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int z1(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.s == 0) {
            return 0;
        }
        return C2(i, vVar, a0Var);
    }
}
