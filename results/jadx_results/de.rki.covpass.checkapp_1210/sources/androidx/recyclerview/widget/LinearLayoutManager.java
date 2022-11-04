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
import java.util.List;
/* loaded from: classes.dex */
public class LinearLayoutManager extends RecyclerView.o implements RecyclerView.z.b {
    int A;
    int B;
    private boolean C;
    d D;
    final a E;
    private final b F;
    private int G;
    private int[] H;

    /* renamed from: s */
    int f4424s;

    /* renamed from: t */
    private c f4425t;

    /* renamed from: u */
    i f4426u;

    /* renamed from: v */
    private boolean f4427v;

    /* renamed from: w */
    private boolean f4428w;

    /* renamed from: x */
    boolean f4429x;

    /* renamed from: y */
    private boolean f4430y;

    /* renamed from: z */
    private boolean f4431z;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        i f4432a;

        /* renamed from: b */
        int f4433b;

        /* renamed from: c */
        int f4434c;

        /* renamed from: d */
        boolean f4435d;

        /* renamed from: e */
        boolean f4436e;

        a() {
            e();
        }

        void a() {
            this.f4434c = this.f4435d ? this.f4432a.i() : this.f4432a.m();
        }

        public void b(View view, int i10) {
            this.f4434c = this.f4435d ? this.f4432a.d(view) + this.f4432a.o() : this.f4432a.g(view);
            this.f4433b = i10;
        }

        public void c(View view, int i10) {
            int o10 = this.f4432a.o();
            if (o10 >= 0) {
                b(view, i10);
                return;
            }
            this.f4433b = i10;
            if (this.f4435d) {
                int i11 = (this.f4432a.i() - o10) - this.f4432a.d(view);
                this.f4434c = this.f4432a.i() - i11;
                if (i11 <= 0) {
                    return;
                }
                int e10 = this.f4434c - this.f4432a.e(view);
                int m10 = this.f4432a.m();
                int min = e10 - (m10 + Math.min(this.f4432a.g(view) - m10, 0));
                if (min >= 0) {
                    return;
                }
                this.f4434c += Math.min(i11, -min);
                return;
            }
            int g10 = this.f4432a.g(view);
            int m11 = g10 - this.f4432a.m();
            this.f4434c = g10;
            if (m11 <= 0) {
                return;
            }
            int i12 = (this.f4432a.i() - Math.min(0, (this.f4432a.i() - o10) - this.f4432a.d(view))) - (g10 + this.f4432a.e(view));
            if (i12 >= 0) {
                return;
            }
            this.f4434c -= Math.min(m11, -i12);
        }

        boolean d(View view, RecyclerView.a0 a0Var) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return !pVar.c() && pVar.a() >= 0 && pVar.a() < a0Var.b();
        }

        void e() {
            this.f4433b = -1;
            this.f4434c = Integer.MIN_VALUE;
            this.f4435d = false;
            this.f4436e = false;
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f4433b + ", mCoordinate=" + this.f4434c + ", mLayoutFromEnd=" + this.f4435d + ", mValid=" + this.f4436e + '}';
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public int f4437a;

        /* renamed from: b */
        public boolean f4438b;

        /* renamed from: c */
        public boolean f4439c;

        /* renamed from: d */
        public boolean f4440d;

        protected b() {
        }

        void a() {
            this.f4437a = 0;
            this.f4438b = false;
            this.f4439c = false;
            this.f4440d = false;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: b */
        int f4442b;

        /* renamed from: c */
        int f4443c;

        /* renamed from: d */
        int f4444d;

        /* renamed from: e */
        int f4445e;

        /* renamed from: f */
        int f4446f;

        /* renamed from: g */
        int f4447g;

        /* renamed from: k */
        int f4451k;

        /* renamed from: m */
        boolean f4453m;

        /* renamed from: a */
        boolean f4441a = true;

        /* renamed from: h */
        int f4448h = 0;

        /* renamed from: i */
        int f4449i = 0;

        /* renamed from: j */
        boolean f4450j = false;

        /* renamed from: l */
        List<RecyclerView.d0> f4452l = null;

        c() {
        }

        private View e() {
            int size = this.f4452l.size();
            for (int i10 = 0; i10 < size; i10++) {
                View view = this.f4452l.get(i10).f4533a;
                RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
                if (!pVar.c() && this.f4444d == pVar.a()) {
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
            View f10 = f(view);
            this.f4444d = f10 == null ? -1 : ((RecyclerView.p) f10.getLayoutParams()).a();
        }

        public boolean c(RecyclerView.a0 a0Var) {
            int i10 = this.f4444d;
            return i10 >= 0 && i10 < a0Var.b();
        }

        public View d(RecyclerView.v vVar) {
            if (this.f4452l != null) {
                return e();
            }
            View o10 = vVar.o(this.f4444d);
            this.f4444d += this.f4445e;
            return o10;
        }

        public View f(View view) {
            int a10;
            int size = this.f4452l.size();
            View view2 = null;
            int i10 = Integer.MAX_VALUE;
            for (int i11 = 0; i11 < size; i11++) {
                View view3 = this.f4452l.get(i11).f4533a;
                RecyclerView.p pVar = (RecyclerView.p) view3.getLayoutParams();
                if (view3 != view && !pVar.c() && (a10 = (pVar.a() - this.f4444d) * this.f4445e) >= 0 && a10 < i10) {
                    view2 = view3;
                    if (a10 == 0) {
                        break;
                    }
                    i10 = a10;
                }
            }
            return view2;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class d implements Parcelable {
        public static final Parcelable.Creator<d> CREATOR = new a();

        /* renamed from: c */
        int f4454c;

        /* renamed from: d */
        int f4455d;

        /* renamed from: q */
        boolean f4456q;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<d> {
            a() {
            }

            /* renamed from: a */
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            /* renamed from: b */
            public d[] newArray(int i10) {
                return new d[i10];
            }
        }

        public d() {
        }

        d(Parcel parcel) {
            this.f4454c = parcel.readInt();
            this.f4455d = parcel.readInt();
            this.f4456q = parcel.readInt() != 1 ? false : true;
        }

        public d(d dVar) {
            this.f4454c = dVar.f4454c;
            this.f4455d = dVar.f4455d;
            this.f4456q = dVar.f4456q;
        }

        boolean a() {
            return this.f4454c >= 0;
        }

        void c() {
            this.f4454c = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f4454c);
            parcel.writeInt(this.f4455d);
            parcel.writeInt(this.f4456q ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context) {
        this(context, 1, false);
    }

    public LinearLayoutManager(Context context, int i10, boolean z10) {
        this.f4424s = 1;
        this.f4428w = false;
        this.f4429x = false;
        this.f4430y = false;
        this.f4431z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        C2(i10);
        D2(z10);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        this.f4424s = 1;
        this.f4428w = false;
        this.f4429x = false;
        this.f4430y = false;
        this.f4431z = true;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        RecyclerView.o.d i02 = RecyclerView.o.i0(context, attributeSet, i10, i11);
        C2(i02.f4586a);
        D2(i02.f4588c);
        E2(i02.f4589d);
    }

    private void A2() {
        this.f4429x = (this.f4424s == 1 || !q2()) ? this.f4428w : !this.f4428w;
    }

    private boolean F2(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar) {
        boolean z10 = false;
        if (J() == 0) {
            return false;
        }
        View V = V();
        if (V != null && aVar.d(V, a0Var)) {
            aVar.c(V, h0(V));
            return true;
        } else if (this.f4427v != this.f4430y) {
            return false;
        } else {
            View i22 = aVar.f4435d ? i2(vVar, a0Var) : j2(vVar, a0Var);
            if (i22 == null) {
                return false;
            }
            aVar.b(i22, h0(i22));
            if (!a0Var.e() && L1()) {
                if (this.f4426u.g(i22) >= this.f4426u.i() || this.f4426u.d(i22) < this.f4426u.m()) {
                    z10 = true;
                }
                if (z10) {
                    aVar.f4434c = aVar.f4435d ? this.f4426u.i() : this.f4426u.m();
                }
            }
            return true;
        }
    }

    private boolean G2(RecyclerView.a0 a0Var, a aVar) {
        int i10;
        boolean z10 = false;
        if (!a0Var.e() && (i10 = this.A) != -1) {
            if (i10 >= 0 && i10 < a0Var.b()) {
                aVar.f4433b = this.A;
                d dVar = this.D;
                if (dVar != null && dVar.a()) {
                    boolean z11 = this.D.f4456q;
                    aVar.f4435d = z11;
                    aVar.f4434c = z11 ? this.f4426u.i() - this.D.f4455d : this.f4426u.m() + this.D.f4455d;
                    return true;
                } else if (this.B != Integer.MIN_VALUE) {
                    boolean z12 = this.f4429x;
                    aVar.f4435d = z12;
                    aVar.f4434c = z12 ? this.f4426u.i() - this.B : this.f4426u.m() + this.B;
                    return true;
                } else {
                    View C = C(this.A);
                    if (C == null) {
                        if (J() > 0) {
                            if ((this.A < h0(I(0))) == this.f4429x) {
                                z10 = true;
                            }
                            aVar.f4435d = z10;
                        }
                        aVar.a();
                    } else if (this.f4426u.e(C) > this.f4426u.n()) {
                        aVar.a();
                        return true;
                    } else if (this.f4426u.g(C) - this.f4426u.m() < 0) {
                        aVar.f4434c = this.f4426u.m();
                        aVar.f4435d = false;
                        return true;
                    } else if (this.f4426u.i() - this.f4426u.d(C) < 0) {
                        aVar.f4434c = this.f4426u.i();
                        aVar.f4435d = true;
                        return true;
                    } else {
                        aVar.f4434c = aVar.f4435d ? this.f4426u.d(C) + this.f4426u.o() : this.f4426u.g(C);
                    }
                    return true;
                }
            }
            this.A = -1;
            this.B = Integer.MIN_VALUE;
        }
        return false;
    }

    private void H2(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar) {
        if (!G2(a0Var, aVar) && !F2(vVar, a0Var, aVar)) {
            aVar.a();
            aVar.f4433b = this.f4430y ? a0Var.b() - 1 : 0;
        }
    }

    private void I2(int i10, int i11, boolean z10, RecyclerView.a0 a0Var) {
        int i12;
        this.f4425t.f4453m = z2();
        this.f4425t.f4446f = i10;
        int[] iArr = this.H;
        boolean z11 = false;
        iArr[0] = 0;
        int i13 = 1;
        iArr[1] = 0;
        M1(a0Var, iArr);
        int max = Math.max(0, this.H[0]);
        int max2 = Math.max(0, this.H[1]);
        if (i10 == 1) {
            z11 = true;
        }
        c cVar = this.f4425t;
        int i14 = z11 ? max2 : max;
        cVar.f4448h = i14;
        if (!z11) {
            max = max2;
        }
        cVar.f4449i = max;
        if (z11) {
            cVar.f4448h = i14 + this.f4426u.j();
            View m22 = m2();
            c cVar2 = this.f4425t;
            if (this.f4429x) {
                i13 = -1;
            }
            cVar2.f4445e = i13;
            int h02 = h0(m22);
            c cVar3 = this.f4425t;
            cVar2.f4444d = h02 + cVar3.f4445e;
            cVar3.f4442b = this.f4426u.d(m22);
            i12 = this.f4426u.d(m22) - this.f4426u.i();
        } else {
            View n22 = n2();
            this.f4425t.f4448h += this.f4426u.m();
            c cVar4 = this.f4425t;
            if (!this.f4429x) {
                i13 = -1;
            }
            cVar4.f4445e = i13;
            int h03 = h0(n22);
            c cVar5 = this.f4425t;
            cVar4.f4444d = h03 + cVar5.f4445e;
            cVar5.f4442b = this.f4426u.g(n22);
            i12 = (-this.f4426u.g(n22)) + this.f4426u.m();
        }
        c cVar6 = this.f4425t;
        cVar6.f4443c = i11;
        if (z10) {
            cVar6.f4443c = i11 - i12;
        }
        cVar6.f4447g = i12;
    }

    private void J2(int i10, int i11) {
        this.f4425t.f4443c = this.f4426u.i() - i11;
        c cVar = this.f4425t;
        cVar.f4445e = this.f4429x ? -1 : 1;
        cVar.f4444d = i10;
        cVar.f4446f = 1;
        cVar.f4442b = i11;
        cVar.f4447g = Integer.MIN_VALUE;
    }

    private void K2(a aVar) {
        J2(aVar.f4433b, aVar.f4434c);
    }

    private void L2(int i10, int i11) {
        this.f4425t.f4443c = i11 - this.f4426u.m();
        c cVar = this.f4425t;
        cVar.f4444d = i10;
        cVar.f4445e = this.f4429x ? 1 : -1;
        cVar.f4446f = -1;
        cVar.f4442b = i11;
        cVar.f4447g = Integer.MIN_VALUE;
    }

    private void M2(a aVar) {
        L2(aVar.f4433b, aVar.f4434c);
    }

    private int O1(RecyclerView.a0 a0Var) {
        if (J() == 0) {
            return 0;
        }
        T1();
        return l.a(a0Var, this.f4426u, Y1(!this.f4431z, true), X1(!this.f4431z, true), this, this.f4431z);
    }

    private int P1(RecyclerView.a0 a0Var) {
        if (J() == 0) {
            return 0;
        }
        T1();
        return l.b(a0Var, this.f4426u, Y1(!this.f4431z, true), X1(!this.f4431z, true), this, this.f4431z, this.f4429x);
    }

    private int Q1(RecyclerView.a0 a0Var) {
        if (J() == 0) {
            return 0;
        }
        T1();
        return l.c(a0Var, this.f4426u, Y1(!this.f4431z, true), X1(!this.f4431z, true), this, this.f4431z);
    }

    private View V1() {
        return d2(0, J());
    }

    private View W1(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return h2(vVar, a0Var, 0, J(), a0Var.b());
    }

    private View a2() {
        return d2(J() - 1, -1);
    }

    private View b2(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return h2(vVar, a0Var, J() - 1, -1, a0Var.b());
    }

    private View f2() {
        return this.f4429x ? V1() : a2();
    }

    private View g2() {
        return this.f4429x ? a2() : V1();
    }

    private View i2(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return this.f4429x ? W1(vVar, a0Var) : b2(vVar, a0Var);
    }

    private View j2(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return this.f4429x ? b2(vVar, a0Var) : W1(vVar, a0Var);
    }

    private int k2(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z10) {
        int i11;
        int i12 = this.f4426u.i() - i10;
        if (i12 > 0) {
            int i13 = -B2(-i12, vVar, a0Var);
            int i14 = i10 + i13;
            if (!z10 || (i11 = this.f4426u.i() - i14) <= 0) {
                return i13;
            }
            this.f4426u.r(i11);
            return i11 + i13;
        }
        return 0;
    }

    private int l2(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z10) {
        int m10;
        int m11 = i10 - this.f4426u.m();
        if (m11 > 0) {
            int i11 = -B2(m11, vVar, a0Var);
            int i12 = i10 + i11;
            if (!z10 || (m10 = i12 - this.f4426u.m()) <= 0) {
                return i11;
            }
            this.f4426u.r(-m10);
            return i11 - m10;
        }
        return 0;
    }

    private View m2() {
        return I(this.f4429x ? 0 : J() - 1);
    }

    private View n2() {
        return I(this.f4429x ? J() - 1 : 0);
    }

    private void t2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i10, int i11) {
        if (!a0Var.g() || J() == 0 || a0Var.e() || !L1()) {
            return;
        }
        List<RecyclerView.d0> k10 = vVar.k();
        int size = k10.size();
        int h02 = h0(I(0));
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            RecyclerView.d0 d0Var = k10.get(i14);
            if (!d0Var.v()) {
                boolean z10 = true;
                if ((d0Var.m() < h02) != this.f4429x) {
                    z10 = true;
                }
                int e10 = this.f4426u.e(d0Var.f4533a);
                if (z10) {
                    i12 += e10;
                } else {
                    i13 += e10;
                }
            }
        }
        this.f4425t.f4452l = k10;
        if (i12 > 0) {
            L2(h0(n2()), i10);
            c cVar = this.f4425t;
            cVar.f4448h = i12;
            cVar.f4443c = 0;
            cVar.a();
            U1(vVar, this.f4425t, a0Var, false);
        }
        if (i13 > 0) {
            J2(h0(m2()), i11);
            c cVar2 = this.f4425t;
            cVar2.f4448h = i13;
            cVar2.f4443c = 0;
            cVar2.a();
            U1(vVar, this.f4425t, a0Var, false);
        }
        this.f4425t.f4452l = null;
    }

    private void v2(RecyclerView.v vVar, c cVar) {
        if (!cVar.f4441a || cVar.f4453m) {
            return;
        }
        int i10 = cVar.f4447g;
        int i11 = cVar.f4449i;
        if (cVar.f4446f == -1) {
            x2(vVar, i10, i11);
        } else {
            y2(vVar, i10, i11);
        }
    }

    private void w2(RecyclerView.v vVar, int i10, int i11) {
        if (i10 == i11) {
            return;
        }
        if (i11 <= i10) {
            while (i10 > i11) {
                n1(i10, vVar);
                i10--;
            }
            return;
        }
        for (int i12 = i11 - 1; i12 >= i10; i12--) {
            n1(i12, vVar);
        }
    }

    private void x2(RecyclerView.v vVar, int i10, int i11) {
        int J = J();
        if (i10 < 0) {
            return;
        }
        int h10 = (this.f4426u.h() - i10) + i11;
        if (this.f4429x) {
            for (int i12 = 0; i12 < J; i12++) {
                View I = I(i12);
                if (this.f4426u.g(I) < h10 || this.f4426u.q(I) < h10) {
                    w2(vVar, 0, i12);
                    return;
                }
            }
            return;
        }
        int i13 = J - 1;
        for (int i14 = i13; i14 >= 0; i14--) {
            View I2 = I(i14);
            if (this.f4426u.g(I2) < h10 || this.f4426u.q(I2) < h10) {
                w2(vVar, i13, i14);
                return;
            }
        }
    }

    private void y2(RecyclerView.v vVar, int i10, int i11) {
        if (i10 < 0) {
            return;
        }
        int i12 = i10 - i11;
        int J = J();
        if (!this.f4429x) {
            for (int i13 = 0; i13 < J; i13++) {
                View I = I(i13);
                if (this.f4426u.d(I) > i12 || this.f4426u.p(I) > i12) {
                    w2(vVar, 0, i13);
                    return;
                }
            }
            return;
        }
        int i14 = J - 1;
        for (int i15 = i14; i15 >= 0; i15--) {
            View I2 = I(i15);
            if (this.f4426u.d(I2) > i12 || this.f4426u.p(I2) > i12) {
                w2(vVar, i14, i15);
                return;
            }
        }
    }

    int B2(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (J() == 0 || i10 == 0) {
            return 0;
        }
        T1();
        this.f4425t.f4441a = true;
        int i11 = i10 > 0 ? 1 : -1;
        int abs = Math.abs(i10);
        I2(i11, abs, true, a0Var);
        c cVar = this.f4425t;
        int U1 = cVar.f4447g + U1(vVar, cVar, a0Var, false);
        if (U1 < 0) {
            return 0;
        }
        if (abs > U1) {
            i10 = i11 * U1;
        }
        this.f4426u.r(-i10);
        this.f4425t.f4451k = i10;
        return i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View C(int i10) {
        int J = J();
        if (J == 0) {
            return null;
        }
        int h02 = i10 - h0(I(0));
        if (h02 >= 0 && h02 < J) {
            View I = I(h02);
            if (h0(I) == i10) {
                return I;
            }
        }
        return super.C(i10);
    }

    public void C2(int i10) {
        if (i10 != 0 && i10 != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i10);
        }
        g(null);
        if (i10 == this.f4424s && this.f4426u != null) {
            return;
        }
        i b10 = i.b(this, i10);
        this.f4426u = b10;
        this.E.f4432a = b10;
        this.f4424s = i10;
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p D() {
        return new RecyclerView.p(-2, -2);
    }

    public void D2(boolean z10) {
        g(null);
        if (z10 == this.f4428w) {
            return;
        }
        this.f4428w = z10;
        t1();
    }

    public void E2(boolean z10) {
        g(null);
        if (this.f4430y == z10) {
            return;
        }
        this.f4430y = z10;
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    boolean G1() {
        return (X() == 1073741824 || p0() == 1073741824 || !q0()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void I0(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.I0(recyclerView, vVar);
        if (this.C) {
            k1(vVar);
            vVar.c();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void I1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i10) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i10);
        J1(gVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View J0(View view, int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int R1;
        A2();
        if (J() == 0 || (R1 = R1(i10)) == Integer.MIN_VALUE) {
            return null;
        }
        T1();
        I2(R1, (int) (this.f4426u.n() * 0.33333334f), false, a0Var);
        c cVar = this.f4425t;
        cVar.f4447g = Integer.MIN_VALUE;
        cVar.f4441a = false;
        U1(vVar, cVar, a0Var, true);
        View g22 = R1 == -1 ? g2() : f2();
        View n22 = R1 == -1 ? n2() : m2();
        if (!n22.hasFocusable()) {
            return g22;
        }
        if (g22 != null) {
            return n22;
        }
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void K0(AccessibilityEvent accessibilityEvent) {
        super.K0(accessibilityEvent);
        if (J() > 0) {
            accessibilityEvent.setFromIndex(Z1());
            accessibilityEvent.setToIndex(c2());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean L1() {
        return this.D == null && this.f4427v == this.f4430y;
    }

    public void M1(RecyclerView.a0 a0Var, int[] iArr) {
        int i10;
        int o22 = o2(a0Var);
        if (this.f4425t.f4446f == -1) {
            i10 = 0;
        } else {
            i10 = o22;
            o22 = 0;
        }
        iArr[0] = o22;
        iArr[1] = i10;
    }

    void N1(RecyclerView.a0 a0Var, c cVar, RecyclerView.o.c cVar2) {
        int i10 = cVar.f4444d;
        if (i10 < 0 || i10 >= a0Var.b()) {
            return;
        }
        cVar2.a(i10, Math.max(0, cVar.f4447g));
    }

    public int R1(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 17 ? i10 != 33 ? i10 != 66 ? (i10 == 130 && this.f4424s == 1) ? 1 : Integer.MIN_VALUE : this.f4424s == 0 ? 1 : Integer.MIN_VALUE : this.f4424s == 1 ? -1 : Integer.MIN_VALUE : this.f4424s == 0 ? -1 : Integer.MIN_VALUE : (this.f4424s != 1 && q2()) ? -1 : 1 : (this.f4424s != 1 && q2()) ? 1 : -1;
    }

    c S1() {
        return new c();
    }

    public void T1() {
        if (this.f4425t == null) {
            this.f4425t = S1();
        }
    }

    int U1(RecyclerView.v vVar, c cVar, RecyclerView.a0 a0Var, boolean z10) {
        int i10 = cVar.f4443c;
        int i11 = cVar.f4447g;
        if (i11 != Integer.MIN_VALUE) {
            if (i10 < 0) {
                cVar.f4447g = i11 + i10;
            }
            v2(vVar, cVar);
        }
        int i12 = cVar.f4443c + cVar.f4448h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.f4453m && i12 <= 0) || !cVar.c(a0Var)) {
                break;
            }
            bVar.a();
            s2(vVar, a0Var, cVar, bVar);
            if (!bVar.f4438b) {
                cVar.f4442b += bVar.f4437a * cVar.f4446f;
                if (!bVar.f4439c || cVar.f4452l != null || !a0Var.e()) {
                    int i13 = cVar.f4443c;
                    int i14 = bVar.f4437a;
                    cVar.f4443c = i13 - i14;
                    i12 -= i14;
                }
                int i15 = cVar.f4447g;
                if (i15 != Integer.MIN_VALUE) {
                    int i16 = i15 + bVar.f4437a;
                    cVar.f4447g = i16;
                    int i17 = cVar.f4443c;
                    if (i17 < 0) {
                        cVar.f4447g = i16 + i17;
                    }
                    v2(vVar, cVar);
                }
                if (z10 && bVar.f4440d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i10 - cVar.f4443c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void X0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        View C;
        int i16;
        int i17;
        int i18 = -1;
        if (!(this.D == null && this.A == -1) && a0Var.b() == 0) {
            k1(vVar);
            return;
        }
        d dVar = this.D;
        if (dVar != null && dVar.a()) {
            this.A = this.D.f4454c;
        }
        T1();
        this.f4425t.f4441a = false;
        A2();
        View V = V();
        a aVar = this.E;
        if (!aVar.f4436e || this.A != -1 || this.D != null) {
            aVar.e();
            a aVar2 = this.E;
            aVar2.f4435d = this.f4429x ^ this.f4430y;
            H2(vVar, a0Var, aVar2);
            this.E.f4436e = true;
        } else if (V != null && (this.f4426u.g(V) >= this.f4426u.i() || this.f4426u.d(V) <= this.f4426u.m())) {
            this.E.c(V, h0(V));
        }
        c cVar = this.f4425t;
        cVar.f4446f = cVar.f4451k >= 0 ? 1 : -1;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        M1(a0Var, iArr);
        int max = Math.max(0, this.H[0]) + this.f4426u.m();
        int max2 = Math.max(0, this.H[1]) + this.f4426u.j();
        if (a0Var.e() && (i15 = this.A) != -1 && this.B != Integer.MIN_VALUE && (C = C(i15)) != null) {
            if (this.f4429x) {
                i16 = this.f4426u.i() - this.f4426u.d(C);
                i17 = this.B;
            } else {
                i17 = this.f4426u.g(C) - this.f4426u.m();
                i16 = this.B;
            }
            int i19 = i16 - i17;
            if (i19 > 0) {
                max += i19;
            } else {
                max2 -= i19;
            }
        }
        a aVar3 = this.E;
        if (!aVar3.f4435d ? !this.f4429x : this.f4429x) {
            i18 = 1;
        }
        u2(vVar, a0Var, aVar3, i18);
        w(vVar);
        this.f4425t.f4453m = z2();
        this.f4425t.f4450j = a0Var.e();
        this.f4425t.f4449i = 0;
        a aVar4 = this.E;
        if (aVar4.f4435d) {
            M2(aVar4);
            c cVar2 = this.f4425t;
            cVar2.f4448h = max;
            U1(vVar, cVar2, a0Var, false);
            c cVar3 = this.f4425t;
            i11 = cVar3.f4442b;
            int i20 = cVar3.f4444d;
            int i21 = cVar3.f4443c;
            if (i21 > 0) {
                max2 += i21;
            }
            K2(this.E);
            c cVar4 = this.f4425t;
            cVar4.f4448h = max2;
            cVar4.f4444d += cVar4.f4445e;
            U1(vVar, cVar4, a0Var, false);
            c cVar5 = this.f4425t;
            i10 = cVar5.f4442b;
            int i22 = cVar5.f4443c;
            if (i22 > 0) {
                L2(i20, i11);
                c cVar6 = this.f4425t;
                cVar6.f4448h = i22;
                U1(vVar, cVar6, a0Var, false);
                i11 = this.f4425t.f4442b;
            }
        } else {
            K2(aVar4);
            c cVar7 = this.f4425t;
            cVar7.f4448h = max2;
            U1(vVar, cVar7, a0Var, false);
            c cVar8 = this.f4425t;
            i10 = cVar8.f4442b;
            int i23 = cVar8.f4444d;
            int i24 = cVar8.f4443c;
            if (i24 > 0) {
                max += i24;
            }
            M2(this.E);
            c cVar9 = this.f4425t;
            cVar9.f4448h = max;
            cVar9.f4444d += cVar9.f4445e;
            U1(vVar, cVar9, a0Var, false);
            c cVar10 = this.f4425t;
            i11 = cVar10.f4442b;
            int i25 = cVar10.f4443c;
            if (i25 > 0) {
                J2(i23, i10);
                c cVar11 = this.f4425t;
                cVar11.f4448h = i25;
                U1(vVar, cVar11, a0Var, false);
                i10 = this.f4425t.f4442b;
            }
        }
        if (J() > 0) {
            if (this.f4429x ^ this.f4430y) {
                int k22 = k2(i10, vVar, a0Var, true);
                i13 = i11 + k22;
                i12 = i10 + k22;
                i14 = l2(i13, vVar, a0Var, false);
            } else {
                int l22 = l2(i11, vVar, a0Var, true);
                i13 = i11 + l22;
                i12 = i10 + l22;
                i14 = k2(i12, vVar, a0Var, false);
            }
            i11 = i13 + i14;
            i10 = i12 + i14;
        }
        t2(vVar, a0Var, i11, i10);
        if (!a0Var.e()) {
            this.f4426u.s();
        } else {
            this.E.e();
        }
        this.f4427v = this.f4430y;
    }

    public View X1(boolean z10, boolean z11) {
        int J;
        int i10;
        if (this.f4429x) {
            J = 0;
            i10 = J();
        } else {
            J = J() - 1;
            i10 = -1;
        }
        return e2(J, i10, z10, z11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Y0(RecyclerView.a0 a0Var) {
        super.Y0(a0Var);
        this.D = null;
        this.A = -1;
        this.B = Integer.MIN_VALUE;
        this.E.e();
    }

    public View Y1(boolean z10, boolean z11) {
        int i10;
        int J;
        if (this.f4429x) {
            i10 = J() - 1;
            J = -1;
        } else {
            i10 = 0;
            J = J();
        }
        return e2(i10, J, z10, z11);
    }

    public int Z1() {
        View e22 = e2(0, J(), false, true);
        if (e22 == null) {
            return -1;
        }
        return h0(e22);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF a(int i10) {
        if (J() == 0) {
            return null;
        }
        boolean z10 = false;
        int i11 = 1;
        if (i10 < h0(I(0))) {
            z10 = true;
        }
        if (z10 != this.f4429x) {
            i11 = -1;
        }
        return this.f4424s == 0 ? new PointF(i11, 0.0f) : new PointF(0.0f, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void c1(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.D = (d) parcelable;
            t1();
        }
    }

    public int c2() {
        View e22 = e2(J() - 1, -1, false, true);
        if (e22 == null) {
            return -1;
        }
        return h0(e22);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable d1() {
        if (this.D != null) {
            return new d(this.D);
        }
        d dVar = new d();
        if (J() > 0) {
            T1();
            boolean z10 = this.f4427v ^ this.f4429x;
            dVar.f4456q = z10;
            if (z10) {
                View m22 = m2();
                dVar.f4455d = this.f4426u.i() - this.f4426u.d(m22);
                dVar.f4454c = h0(m22);
            } else {
                View n22 = n2();
                dVar.f4454c = h0(n22);
                dVar.f4455d = this.f4426u.g(n22) - this.f4426u.m();
            }
        } else {
            dVar.c();
        }
        return dVar;
    }

    View d2(int i10, int i11) {
        int i12;
        int i13;
        T1();
        if ((i11 > i10 ? (char) 1 : i11 < i10 ? (char) 65535 : (char) 0) == 0) {
            return I(i10);
        }
        if (this.f4426u.g(I(i10)) < this.f4426u.m()) {
            i13 = 16644;
            i12 = 16388;
        } else {
            i13 = 4161;
            i12 = 4097;
        }
        return (this.f4424s == 0 ? this.f4570e : this.f4571f).a(i10, i11, i13, i12);
    }

    View e2(int i10, int i11, boolean z10, boolean z11) {
        T1();
        int i12 = 320;
        int i13 = z10 ? 24579 : 320;
        if (!z11) {
            i12 = 0;
        }
        return (this.f4424s == 0 ? this.f4570e : this.f4571f).a(i10, i11, i13, i12);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(String str) {
        if (this.D == null) {
            super.g(str);
        }
    }

    View h2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i10, int i11, int i12) {
        T1();
        int m10 = this.f4426u.m();
        int i13 = this.f4426u.i();
        int i14 = i11 > i10 ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i10 != i11) {
            View I = I(i10);
            int h02 = h0(I);
            if (h02 >= 0 && h02 < i12) {
                if (((RecyclerView.p) I.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = I;
                    }
                } else if (this.f4426u.g(I) < i13 && this.f4426u.d(I) >= m10) {
                    return I;
                } else {
                    if (view == null) {
                        view = I;
                    }
                }
            }
            i10 += i14;
        }
        return view != null ? view : view2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean k() {
        return this.f4424s == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean l() {
        return this.f4424s == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void o(int i10, int i11, RecyclerView.a0 a0Var, RecyclerView.o.c cVar) {
        if (this.f4424s != 0) {
            i10 = i11;
        }
        if (J() == 0 || i10 == 0) {
            return;
        }
        T1();
        I2(i10 > 0 ? 1 : -1, Math.abs(i10), true, a0Var);
        N1(a0Var, this.f4425t, cVar);
    }

    @Deprecated
    protected int o2(RecyclerView.a0 a0Var) {
        if (a0Var.d()) {
            return this.f4426u.n();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void p(int i10, RecyclerView.o.c cVar) {
        boolean z10;
        int i11;
        d dVar = this.D;
        int i12 = -1;
        if (dVar == null || !dVar.a()) {
            A2();
            z10 = this.f4429x;
            i11 = this.A;
            if (i11 == -1) {
                i11 = z10 ? i10 - 1 : 0;
            }
        } else {
            d dVar2 = this.D;
            z10 = dVar2.f4456q;
            i11 = dVar2.f4454c;
        }
        if (!z10) {
            i12 = 1;
        }
        for (int i13 = 0; i13 < this.G && i11 >= 0 && i11 < i10; i13++) {
            cVar.a(i11, 0);
            i11 += i12;
        }
    }

    public int p2() {
        return this.f4424s;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int q(RecyclerView.a0 a0Var) {
        return O1(a0Var);
    }

    public boolean q2() {
        return Z() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int r(RecyclerView.a0 a0Var) {
        return P1(a0Var);
    }

    public boolean r2() {
        return this.f4431z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int s(RecyclerView.a0 a0Var) {
        return Q1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean s0() {
        return true;
    }

    void s2(RecyclerView.v vVar, RecyclerView.a0 a0Var, c cVar, b bVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        View d10 = cVar.d(vVar);
        if (d10 == null) {
            bVar.f4438b = true;
            return;
        }
        RecyclerView.p pVar = (RecyclerView.p) d10.getLayoutParams();
        if (cVar.f4452l == null) {
            if (this.f4429x == (cVar.f4446f == -1)) {
                d(d10);
            } else {
                e(d10, 0);
            }
        } else {
            if (this.f4429x == (cVar.f4446f == -1)) {
                b(d10);
            } else {
                c(d10, 0);
            }
        }
        A0(d10, 0, 0);
        bVar.f4437a = this.f4426u.e(d10);
        if (this.f4424s == 1) {
            if (q2()) {
                i14 = o0() - f0();
                i13 = i14 - this.f4426u.f(d10);
            } else {
                i13 = e0();
                i14 = this.f4426u.f(d10) + i13;
            }
            int i15 = cVar.f4446f;
            int i16 = cVar.f4442b;
            if (i15 == -1) {
                i10 = i16;
                i11 = i14;
                i12 = i16 - bVar.f4437a;
            } else {
                i12 = i16;
                i11 = i14;
                i10 = bVar.f4437a + i16;
            }
        } else {
            int g02 = g0();
            int f10 = this.f4426u.f(d10) + g02;
            int i17 = cVar.f4446f;
            int i18 = cVar.f4442b;
            if (i17 == -1) {
                i11 = i18;
                i12 = g02;
                i10 = f10;
                i13 = i18 - bVar.f4437a;
            } else {
                i12 = g02;
                i11 = bVar.f4437a + i18;
                i10 = f10;
                i13 = i18;
            }
        }
        z0(d10, i13, i12, i11, i10);
        if (pVar.c() || pVar.b()) {
            bVar.f4439c = true;
        }
        bVar.f4440d = d10.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int t(RecyclerView.a0 a0Var) {
        return O1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int u(RecyclerView.a0 a0Var) {
        return P1(a0Var);
    }

    public void u2(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar, int i10) {
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.a0 a0Var) {
        return Q1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int w1(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.f4424s == 1) {
            return 0;
        }
        return B2(i10, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void x1(int i10) {
        this.A = i10;
        this.B = Integer.MIN_VALUE;
        d dVar = this.D;
        if (dVar != null) {
            dVar.c();
        }
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int y1(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.f4424s == 0) {
            return 0;
        }
        return B2(i10, vVar, a0Var);
    }

    boolean z2() {
        return this.f4426u.k() == 0 && this.f4426u.h() == 0;
    }
}
