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
    int s;
    private c t;
    j u;
    private boolean v;
    private boolean w;
    boolean x;
    private boolean y;
    private boolean z;

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        j f1003a;

        /* renamed from: b */
        int f1004b;

        /* renamed from: c */
        int f1005c;
        boolean d;
        boolean e;

        a() {
            b();
        }

        void a() {
            this.f1005c = this.d ? this.f1003a.b() : this.f1003a.f();
        }

        public void a(View view, int i) {
            this.f1005c = this.d ? this.f1003a.a(view) + this.f1003a.h() : this.f1003a.d(view);
            this.f1004b = i;
        }

        boolean a(View view, RecyclerView.a0 a0Var) {
            RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
            return !pVar.c() && pVar.a() >= 0 && pVar.a() < a0Var.a();
        }

        void b() {
            this.f1004b = -1;
            this.f1005c = RecyclerView.UNDEFINED_DURATION;
            this.d = false;
            this.e = false;
        }

        public void b(View view, int i) {
            int h = this.f1003a.h();
            if (h >= 0) {
                a(view, i);
                return;
            }
            this.f1004b = i;
            if (this.d) {
                int b2 = (this.f1003a.b() - h) - this.f1003a.a(view);
                this.f1005c = this.f1003a.b() - b2;
                if (b2 <= 0) {
                    return;
                }
                int b3 = this.f1005c - this.f1003a.b(view);
                int f = this.f1003a.f();
                int min = b3 - (f + Math.min(this.f1003a.d(view) - f, 0));
                if (min >= 0) {
                    return;
                }
                this.f1005c += Math.min(b2, -min);
                return;
            }
            int d = this.f1003a.d(view);
            int f2 = d - this.f1003a.f();
            this.f1005c = d;
            if (f2 <= 0) {
                return;
            }
            int b4 = (this.f1003a.b() - Math.min(0, (this.f1003a.b() - h) - this.f1003a.a(view))) - (d + this.f1003a.b(view));
            if (b4 >= 0) {
                return;
            }
            this.f1005c -= Math.min(f2, -b4);
        }

        public String toString() {
            return "AnchorInfo{mPosition=" + this.f1004b + ", mCoordinate=" + this.f1005c + ", mLayoutFromEnd=" + this.d + ", mValid=" + this.e + '}';
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        public int f1006a;

        /* renamed from: b */
        public boolean f1007b;

        /* renamed from: c */
        public boolean f1008c;
        public boolean d;

        protected b() {
        }

        void a() {
            this.f1006a = 0;
            this.f1007b = false;
            this.f1008c = false;
            this.d = false;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: b */
        int f1010b;

        /* renamed from: c */
        int f1011c;
        int d;
        int e;
        int f;
        int g;
        boolean j;
        int k;
        boolean m;

        /* renamed from: a */
        boolean f1009a = true;
        int h = 0;
        int i = 0;
        List<RecyclerView.d0> l = null;

        c() {
        }

        private View b() {
            int size = this.l.size();
            for (int i = 0; i < size; i++) {
                View view = this.l.get(i).f1022a;
                RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
                if (!pVar.c() && this.d == pVar.a()) {
                    a(view);
                    return view;
                }
            }
            return null;
        }

        public View a(RecyclerView.v vVar) {
            if (this.l != null) {
                return b();
            }
            View d = vVar.d(this.d);
            this.d += this.e;
            return d;
        }

        public void a() {
            a((View) null);
        }

        public void a(View view) {
            View b2 = b(view);
            this.d = b2 == null ? -1 : ((RecyclerView.p) b2.getLayoutParams()).a();
        }

        public boolean a(RecyclerView.a0 a0Var) {
            int i = this.d;
            return i >= 0 && i < a0Var.a();
        }

        public View b(View view) {
            int a2;
            int size = this.l.size();
            View view2 = null;
            int i = Integer.MAX_VALUE;
            for (int i2 = 0; i2 < size; i2++) {
                View view3 = this.l.get(i2).f1022a;
                RecyclerView.p pVar = (RecyclerView.p) view3.getLayoutParams();
                if (view3 != view && !pVar.c() && (a2 = (pVar.a() - this.d) * this.e) >= 0 && a2 < i) {
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
        int f1012b;

        /* renamed from: c */
        int f1013c;
        boolean d;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<d> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public d createFromParcel(Parcel parcel) {
                return new d(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public d[] newArray(int i) {
                return new d[i];
            }
        }

        public d() {
        }

        d(Parcel parcel) {
            this.f1012b = parcel.readInt();
            this.f1013c = parcel.readInt();
            this.d = parcel.readInt() != 1 ? false : true;
        }

        public d(d dVar) {
            this.f1012b = dVar.f1012b;
            this.f1013c = dVar.f1013c;
            this.d = dVar.d;
        }

        boolean d() {
            return this.f1012b >= 0;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        void e() {
            this.f1012b = -1;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1012b);
            parcel.writeInt(this.f1013c);
            parcel.writeInt(this.d ? 1 : 0);
        }
    }

    public LinearLayoutManager(Context context, int i, boolean z) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = RecyclerView.UNDEFINED_DURATION;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        k(i);
        a(z);
    }

    public LinearLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        this.s = 1;
        this.w = false;
        this.x = false;
        this.y = false;
        this.z = true;
        this.A = -1;
        this.B = RecyclerView.UNDEFINED_DURATION;
        this.D = null;
        this.E = new a();
        this.F = new b();
        this.G = 2;
        this.H = new int[2];
        RecyclerView.o.d a2 = RecyclerView.o.a(context, attributeSet, i, i2);
        k(a2.f1040a);
        a(a2.f1042c);
        b(a2.d);
    }

    private View M() {
        return e(0, e());
    }

    private View N() {
        return e(e() - 1, -1);
    }

    private View O() {
        return this.x ? M() : N();
    }

    private View P() {
        return this.x ? N() : M();
    }

    private View Q() {
        return d(this.x ? 0 : e() - 1);
    }

    private View R() {
        return d(this.x ? e() - 1 : 0);
    }

    private void S() {
        this.x = (this.s == 1 || !J()) ? this.w : !this.w;
    }

    private int a(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int b2;
        int b3 = this.u.b() - i;
        if (b3 > 0) {
            int i2 = -c(-b3, vVar, a0Var);
            int i3 = i + i2;
            if (!z || (b2 = this.u.b() - i3) <= 0) {
                return i2;
            }
            this.u.a(b2);
            return b2 + i2;
        }
        return 0;
    }

    private void a(int i, int i2, boolean z, RecyclerView.a0 a0Var) {
        int i3;
        this.t.m = L();
        this.t.f = i;
        int[] iArr = this.H;
        boolean z2 = false;
        iArr[0] = 0;
        int i4 = 1;
        iArr[1] = 0;
        a(a0Var, iArr);
        int max = Math.max(0, this.H[0]);
        int max2 = Math.max(0, this.H[1]);
        if (i == 1) {
            z2 = true;
        }
        this.t.h = z2 ? max2 : max;
        c cVar = this.t;
        if (!z2) {
            max = max2;
        }
        cVar.i = max;
        if (z2) {
            this.t.h += this.u.c();
            View Q = Q();
            c cVar2 = this.t;
            if (this.x) {
                i4 = -1;
            }
            cVar2.e = i4;
            c cVar3 = this.t;
            int l = l(Q);
            c cVar4 = this.t;
            cVar3.d = l + cVar4.e;
            cVar4.f1010b = this.u.a(Q);
            i3 = this.u.a(Q) - this.u.b();
        } else {
            View R = R();
            this.t.h += this.u.f();
            c cVar5 = this.t;
            if (!this.x) {
                i4 = -1;
            }
            cVar5.e = i4;
            c cVar6 = this.t;
            int l2 = l(R);
            c cVar7 = this.t;
            cVar6.d = l2 + cVar7.e;
            cVar7.f1010b = this.u.d(R);
            i3 = (-this.u.d(R)) + this.u.f();
        }
        c cVar8 = this.t;
        cVar8.f1011c = i2;
        if (z) {
            cVar8.f1011c = i2 - i3;
        }
        this.t.g = i3;
    }

    private void a(a aVar) {
        f(aVar.f1004b, aVar.f1005c);
    }

    private void a(RecyclerView.v vVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                a(i, vVar);
                i--;
            }
            return;
        }
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            a(i3, vVar);
        }
    }

    private void a(RecyclerView.v vVar, c cVar) {
        if (!cVar.f1009a || cVar.m) {
            return;
        }
        int i = cVar.g;
        int i2 = cVar.i;
        if (cVar.f == -1) {
            b(vVar, i, i2);
        } else {
            c(vVar, i, i2);
        }
    }

    private boolean a(RecyclerView.a0 a0Var, a aVar) {
        int i;
        boolean z = false;
        if (!a0Var.d() && (i = this.A) != -1) {
            if (i >= 0 && i < a0Var.a()) {
                aVar.f1004b = this.A;
                d dVar = this.D;
                if (dVar != null && dVar.d()) {
                    boolean z2 = this.D.d;
                    aVar.d = z2;
                    aVar.f1005c = z2 ? this.u.b() - this.D.f1013c : this.u.f() + this.D.f1013c;
                    return true;
                } else if (this.B != Integer.MIN_VALUE) {
                    boolean z3 = this.x;
                    aVar.d = z3;
                    aVar.f1005c = z3 ? this.u.b() - this.B : this.u.f() + this.B;
                    return true;
                } else {
                    View c2 = c(this.A);
                    if (c2 == null) {
                        if (e() > 0) {
                            if ((this.A < l(d(0))) == this.x) {
                                z = true;
                            }
                            aVar.d = z;
                        }
                        aVar.a();
                    } else if (this.u.b(c2) > this.u.g()) {
                        aVar.a();
                        return true;
                    } else if (this.u.d(c2) - this.u.f() < 0) {
                        aVar.f1005c = this.u.f();
                        aVar.d = false;
                        return true;
                    } else if (this.u.b() - this.u.a(c2) < 0) {
                        aVar.f1005c = this.u.b();
                        aVar.d = true;
                        return true;
                    } else {
                        aVar.f1005c = aVar.d ? this.u.a(c2) + this.u.h() : this.u.d(c2);
                    }
                    return true;
                }
            }
            this.A = -1;
            this.B = RecyclerView.UNDEFINED_DURATION;
        }
        return false;
    }

    private boolean a(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar) {
        boolean z = false;
        if (e() == 0) {
            return false;
        }
        View g = g();
        if (g != null && aVar.a(g, a0Var)) {
            aVar.b(g, l(g));
            return true;
        } else if (this.v != this.y) {
            return false;
        } else {
            View h = aVar.d ? h(vVar, a0Var) : i(vVar, a0Var);
            if (h == null) {
                return false;
            }
            aVar.a(h, l(h));
            if (!a0Var.d() && D()) {
                if (this.u.d(h) >= this.u.b() || this.u.a(h) < this.u.f()) {
                    z = true;
                }
                if (z) {
                    aVar.f1005c = aVar.d ? this.u.b() : this.u.f();
                }
            }
            return true;
        }
    }

    private int b(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int f;
        int f2 = i - this.u.f();
        if (f2 > 0) {
            int i2 = -c(f2, vVar, a0Var);
            int i3 = i + i2;
            if (!z || (f = i3 - this.u.f()) <= 0) {
                return i2;
            }
            this.u.a(-f);
            return i2 - f;
        }
        return 0;
    }

    private void b(a aVar) {
        g(aVar.f1004b, aVar.f1005c);
    }

    private void b(RecyclerView.v vVar, int i, int i2) {
        int e = e();
        if (i < 0) {
            return;
        }
        int a2 = (this.u.a() - i) + i2;
        if (this.x) {
            for (int i3 = 0; i3 < e; i3++) {
                View d2 = d(i3);
                if (this.u.d(d2) < a2 || this.u.f(d2) < a2) {
                    a(vVar, 0, i3);
                    return;
                }
            }
            return;
        }
        int i4 = e - 1;
        for (int i5 = i4; i5 >= 0; i5--) {
            View d3 = d(i5);
            if (this.u.d(d3) < a2 || this.u.f(d3) < a2) {
                a(vVar, i4, i5);
                return;
            }
        }
    }

    private void b(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i, int i2) {
        if (!a0Var.e() || e() == 0 || a0Var.d() || !D()) {
            return;
        }
        List<RecyclerView.d0> f = vVar.f();
        int size = f.size();
        int l = l(d(0));
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            RecyclerView.d0 d0Var = f.get(i5);
            if (!d0Var.q()) {
                char c2 = 1;
                if ((d0Var.i() < l) != this.x) {
                    c2 = 65535;
                }
                int b2 = this.u.b(d0Var.f1022a);
                if (c2 == 65535) {
                    i3 += b2;
                } else {
                    i4 += b2;
                }
            }
        }
        this.t.l = f;
        if (i3 > 0) {
            g(l(R()), i);
            c cVar = this.t;
            cVar.h = i3;
            cVar.f1011c = 0;
            cVar.a();
            a(vVar, this.t, a0Var, false);
        }
        if (i4 > 0) {
            f(l(Q()), i2);
            c cVar2 = this.t;
            cVar2.h = i4;
            cVar2.f1011c = 0;
            cVar2.a();
            a(vVar, this.t, a0Var, false);
        }
        this.t.l = null;
    }

    private void b(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar) {
        if (!a(a0Var, aVar) && !a(vVar, a0Var, aVar)) {
            aVar.a();
            aVar.f1004b = this.y ? a0Var.a() - 1 : 0;
        }
    }

    private void c(RecyclerView.v vVar, int i, int i2) {
        if (i < 0) {
            return;
        }
        int i3 = i - i2;
        int e = e();
        if (!this.x) {
            for (int i4 = 0; i4 < e; i4++) {
                View d2 = d(i4);
                if (this.u.a(d2) > i3 || this.u.e(d2) > i3) {
                    a(vVar, 0, i4);
                    return;
                }
            }
            return;
        }
        int i5 = e - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            View d3 = d(i6);
            if (this.u.a(d3) > i3 || this.u.e(d3) > i3) {
                a(vVar, i5, i6);
                return;
            }
        }
    }

    private View f(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return a(vVar, a0Var, 0, e(), a0Var.a());
    }

    private void f(int i, int i2) {
        this.t.f1011c = this.u.b() - i2;
        this.t.e = this.x ? -1 : 1;
        c cVar = this.t;
        cVar.d = i;
        cVar.f = 1;
        cVar.f1010b = i2;
        cVar.g = RecyclerView.UNDEFINED_DURATION;
    }

    private View g(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return a(vVar, a0Var, e() - 1, -1, a0Var.a());
    }

    private void g(int i, int i2) {
        this.t.f1011c = i2 - this.u.f();
        c cVar = this.t;
        cVar.d = i;
        cVar.e = this.x ? 1 : -1;
        c cVar2 = this.t;
        cVar2.f = -1;
        cVar2.f1010b = i2;
        cVar2.g = RecyclerView.UNDEFINED_DURATION;
    }

    private View h(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return this.x ? f(vVar, a0Var) : g(vVar, a0Var);
    }

    private int i(RecyclerView.a0 a0Var) {
        if (e() == 0) {
            return 0;
        }
        F();
        return l.a(a0Var, this.u, b(!this.z, true), a(!this.z, true), this, this.z);
    }

    private View i(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return this.x ? g(vVar, a0Var) : f(vVar, a0Var);
    }

    private int j(RecyclerView.a0 a0Var) {
        if (e() == 0) {
            return 0;
        }
        F();
        return l.a(a0Var, this.u, b(!this.z, true), a(!this.z, true), this, this.z, this.x);
    }

    private int k(RecyclerView.a0 a0Var) {
        if (e() == 0) {
            return 0;
        }
        F();
        return l.b(a0Var, this.u, b(!this.z, true), a(!this.z, true), this, this.z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    boolean B() {
        return (i() == 1073741824 || s() == 1073741824 || !t()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean D() {
        return this.D == null && this.v == this.y;
    }

    c E() {
        return new c();
    }

    public void F() {
        if (this.t == null) {
            this.t = E();
        }
    }

    public int G() {
        View a2 = a(0, e(), false, true);
        if (a2 == null) {
            return -1;
        }
        return l(a2);
    }

    public int H() {
        View a2 = a(e() - 1, -1, false, true);
        if (a2 == null) {
            return -1;
        }
        return l(a2);
    }

    public int I() {
        return this.s;
    }

    public boolean J() {
        return k() == 1;
    }

    public boolean K() {
        return this.z;
    }

    boolean L() {
        return this.u.d() == 0 && this.u.a() == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int a(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.s == 1) {
            return 0;
        }
        return c(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int a(RecyclerView.a0 a0Var) {
        return i(a0Var);
    }

    int a(RecyclerView.v vVar, c cVar, RecyclerView.a0 a0Var, boolean z) {
        int i = cVar.f1011c;
        int i2 = cVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                cVar.g = i2 + i;
            }
            a(vVar, cVar);
        }
        int i3 = cVar.f1011c + cVar.h;
        b bVar = this.F;
        while (true) {
            if ((!cVar.m && i3 <= 0) || !cVar.a(a0Var)) {
                break;
            }
            bVar.a();
            a(vVar, a0Var, cVar, bVar);
            if (!bVar.f1007b) {
                cVar.f1010b += bVar.f1006a * cVar.f;
                if (!bVar.f1008c || cVar.l != null || !a0Var.d()) {
                    int i4 = cVar.f1011c;
                    int i5 = bVar.f1006a;
                    cVar.f1011c = i4 - i5;
                    i3 -= i5;
                }
                int i6 = cVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + bVar.f1006a;
                    cVar.g = i7;
                    int i8 = cVar.f1011c;
                    if (i8 < 0) {
                        cVar.g = i7 + i8;
                    }
                    a(vVar, cVar);
                }
                if (z && bVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - cVar.f1011c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF a(int i) {
        if (e() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < l(d(0))) {
            z = true;
        }
        if (z != this.x) {
            i2 = -1;
        }
        return this.s == 0 ? new PointF(i2, 0.0f) : new PointF(0.0f, i2);
    }

    View a(int i, int i2, boolean z, boolean z2) {
        F();
        int i3 = 320;
        int i4 = z ? 24579 : 320;
        if (!z2) {
            i3 = 0;
        }
        return (this.s == 0 ? this.e : this.f).a(i, i2, i4, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View a(View view, int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int j;
        S();
        if (e() == 0 || (j = j(i)) == Integer.MIN_VALUE) {
            return null;
        }
        F();
        a(j, (int) (this.u.g() * 0.33333334f), false, a0Var);
        c cVar = this.t;
        cVar.g = RecyclerView.UNDEFINED_DURATION;
        cVar.f1009a = false;
        a(vVar, cVar, a0Var, true);
        View P = j == -1 ? P() : O();
        View R = j == -1 ? R() : Q();
        if (!R.hasFocusable()) {
            return P;
        }
        if (P != null) {
            return R;
        }
        return null;
    }

    View a(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i, int i2, int i3) {
        F();
        int f = this.u.f();
        int b2 = this.u.b();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View d2 = d(i);
            int l = l(d2);
            if (l >= 0 && l < i3) {
                if (((RecyclerView.p) d2.getLayoutParams()).c()) {
                    if (view2 == null) {
                        view2 = d2;
                    }
                } else if (this.u.d(d2) < b2 && this.u.a(d2) >= f) {
                    return d2;
                } else {
                    if (view == null) {
                        view = d2;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    public View a(boolean z, boolean z2) {
        int e;
        int i;
        if (this.x) {
            e = 0;
            i = e();
        } else {
            e = e() - 1;
            i = -1;
        }
        return a(e, i, z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(int i, int i2, RecyclerView.a0 a0Var, RecyclerView.o.c cVar) {
        if (this.s != 0) {
            i = i2;
        }
        if (e() == 0 || i == 0) {
            return;
        }
        F();
        a(i > 0 ? 1 : -1, Math.abs(i), true, a0Var);
        a(a0Var, this.t, cVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(int i, RecyclerView.o.c cVar) {
        boolean z;
        int i2;
        d dVar = this.D;
        int i3 = -1;
        if (dVar == null || !dVar.d()) {
            S();
            z = this.x;
            i2 = this.A;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            d dVar2 = this.D;
            z = dVar2.d;
            i2 = dVar2.f1012b;
        }
        if (!z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.G && i2 >= 0 && i2 < i; i4++) {
            cVar.a(i2, 0);
            i2 += i3;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(Parcelable parcelable) {
        if (parcelable instanceof d) {
            this.D = (d) parcelable;
            z();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(AccessibilityEvent accessibilityEvent) {
        super.a(accessibilityEvent);
        if (e() > 0) {
            accessibilityEvent.setFromIndex(G());
            accessibilityEvent.setToIndex(H());
        }
    }

    void a(RecyclerView.a0 a0Var, c cVar, RecyclerView.o.c cVar2) {
        int i = cVar.d;
        if (i < 0 || i >= a0Var.a()) {
            return;
        }
        cVar2.a(i, Math.max(0, cVar.g));
    }

    protected void a(RecyclerView.a0 a0Var, int[] iArr) {
        int i;
        int h = h(a0Var);
        if (this.t.f == -1) {
            i = 0;
        } else {
            i = h;
            h = 0;
        }
        iArr[0] = h;
        iArr[1] = i;
    }

    public void a(RecyclerView.v vVar, RecyclerView.a0 a0Var, a aVar, int i) {
    }

    void a(RecyclerView.v vVar, RecyclerView.a0 a0Var, c cVar, b bVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        View a2 = cVar.a(vVar);
        if (a2 == null) {
            bVar.f1007b = true;
            return;
        }
        RecyclerView.p pVar = (RecyclerView.p) a2.getLayoutParams();
        if (cVar.l == null) {
            if (this.x == (cVar.f == -1)) {
                b(a2);
            } else {
                b(a2, 0);
            }
        } else {
            if (this.x == (cVar.f == -1)) {
                a(a2);
            } else {
                a(a2, 0);
            }
        }
        a(a2, 0, 0);
        bVar.f1006a = this.u.b(a2);
        if (this.s == 1) {
            if (J()) {
                i5 = r() - p();
                i4 = i5 - this.u.c(a2);
            } else {
                i4 = o();
                i5 = this.u.c(a2) + i4;
            }
            int i6 = cVar.f;
            int i7 = cVar.f1010b;
            if (i6 == -1) {
                i = i7;
                i2 = i5;
                i3 = i7 - bVar.f1006a;
            } else {
                i3 = i7;
                i2 = i5;
                i = bVar.f1006a + i7;
            }
        } else {
            int q = q();
            int c2 = this.u.c(a2) + q;
            int i8 = cVar.f;
            int i9 = cVar.f1010b;
            if (i8 == -1) {
                i2 = i9;
                i3 = q;
                i = c2;
                i4 = i9 - bVar.f1006a;
            } else {
                i3 = q;
                i2 = bVar.f1006a + i9;
                i = c2;
                i4 = i9;
            }
        }
        a(a2, i4, i3, i2, i);
        if (pVar.c() || pVar.b()) {
            bVar.f1008c = true;
        }
        bVar.d = a2.hasFocusable();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
        g gVar = new g(recyclerView.getContext());
        gVar.c(i);
        b(gVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(String str) {
        if (this.D == null) {
            super.a(str);
        }
    }

    public void a(boolean z) {
        a((String) null);
        if (z == this.w) {
            return;
        }
        this.w = z;
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean a() {
        return this.s == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int b(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.s == 0) {
            return 0;
        }
        return c(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int b(RecyclerView.a0 a0Var) {
        return j(a0Var);
    }

    public View b(boolean z, boolean z2) {
        int i;
        int e;
        if (this.x) {
            i = e() - 1;
            e = -1;
        } else {
            i = 0;
            e = e();
        }
        return a(i, e, z, z2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void b(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.b(recyclerView, vVar);
        if (this.C) {
            b(vVar);
            vVar.a();
        }
    }

    public void b(boolean z) {
        a((String) null);
        if (this.y == z) {
            return;
        }
        this.y = z;
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean b() {
        return this.s == 1;
    }

    int c(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (e() == 0 || i == 0) {
            return 0;
        }
        F();
        this.t.f1009a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        a(i2, abs, true, a0Var);
        c cVar = this.t;
        int a2 = cVar.g + a(vVar, cVar, a0Var, false);
        if (a2 < 0) {
            return 0;
        }
        if (abs > a2) {
            i = i2 * a2;
        }
        this.u.a(-i);
        this.t.k = i;
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int c(RecyclerView.a0 a0Var) {
        return k(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View c(int i) {
        int e = e();
        if (e == 0) {
            return null;
        }
        int l = i - l(d(0));
        if (l >= 0 && l < e) {
            View d2 = d(l);
            if (l(d2) == i) {
                return d2;
            }
        }
        return super.c(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p c() {
        return new RecyclerView.p(-2, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int d(RecyclerView.a0 a0Var) {
        return i(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int e(RecyclerView.a0 a0Var) {
        return j(a0Var);
    }

    View e(int i, int i2) {
        int i3;
        int i4;
        F();
        if ((i2 > i ? (char) 1 : i2 < i ? (char) 65535 : (char) 0) == 0) {
            return d(i);
        }
        if (this.u.d(d(i)) < this.u.f()) {
            i4 = 16644;
            i3 = 16388;
        } else {
            i4 = 4161;
            i3 = 4097;
        }
        return (this.s == 0 ? this.e : this.f).a(i, i2, i4, i3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void e(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        View c2;
        int i7;
        int i8;
        int i9 = -1;
        if (!(this.D == null && this.A == -1) && a0Var.a() == 0) {
            b(vVar);
            return;
        }
        d dVar = this.D;
        if (dVar != null && dVar.d()) {
            this.A = this.D.f1012b;
        }
        F();
        this.t.f1009a = false;
        S();
        View g = g();
        if (!this.E.e || this.A != -1 || this.D != null) {
            this.E.b();
            a aVar = this.E;
            aVar.d = this.x ^ this.y;
            b(vVar, a0Var, aVar);
            this.E.e = true;
        } else if (g != null && (this.u.d(g) >= this.u.b() || this.u.a(g) <= this.u.f())) {
            this.E.b(g, l(g));
        }
        c cVar = this.t;
        cVar.f = cVar.k >= 0 ? 1 : -1;
        int[] iArr = this.H;
        iArr[0] = 0;
        iArr[1] = 0;
        a(a0Var, iArr);
        int max = Math.max(0, this.H[0]) + this.u.f();
        int max2 = Math.max(0, this.H[1]) + this.u.c();
        if (a0Var.d() && (i6 = this.A) != -1 && this.B != Integer.MIN_VALUE && (c2 = c(i6)) != null) {
            if (this.x) {
                i7 = this.u.b() - this.u.a(c2);
                i8 = this.B;
            } else {
                i8 = this.u.d(c2) - this.u.f();
                i7 = this.B;
            }
            int i10 = i7 - i8;
            if (i10 > 0) {
                max += i10;
            } else {
                max2 -= i10;
            }
        }
        if (!this.E.d ? !this.x : this.x) {
            i9 = 1;
        }
        a(vVar, a0Var, this.E, i9);
        a(vVar);
        this.t.m = L();
        this.t.j = a0Var.d();
        this.t.i = 0;
        a aVar2 = this.E;
        if (aVar2.d) {
            b(aVar2);
            c cVar2 = this.t;
            cVar2.h = max;
            a(vVar, cVar2, a0Var, false);
            c cVar3 = this.t;
            i2 = cVar3.f1010b;
            int i11 = cVar3.d;
            int i12 = cVar3.f1011c;
            if (i12 > 0) {
                max2 += i12;
            }
            a(this.E);
            c cVar4 = this.t;
            cVar4.h = max2;
            cVar4.d += cVar4.e;
            a(vVar, cVar4, a0Var, false);
            c cVar5 = this.t;
            i = cVar5.f1010b;
            int i13 = cVar5.f1011c;
            if (i13 > 0) {
                g(i11, i2);
                c cVar6 = this.t;
                cVar6.h = i13;
                a(vVar, cVar6, a0Var, false);
                i2 = this.t.f1010b;
            }
        } else {
            a(aVar2);
            c cVar7 = this.t;
            cVar7.h = max2;
            a(vVar, cVar7, a0Var, false);
            c cVar8 = this.t;
            i = cVar8.f1010b;
            int i14 = cVar8.d;
            int i15 = cVar8.f1011c;
            if (i15 > 0) {
                max += i15;
            }
            b(this.E);
            c cVar9 = this.t;
            cVar9.h = max;
            cVar9.d += cVar9.e;
            a(vVar, cVar9, a0Var, false);
            c cVar10 = this.t;
            i2 = cVar10.f1010b;
            int i16 = cVar10.f1011c;
            if (i16 > 0) {
                f(i14, i);
                c cVar11 = this.t;
                cVar11.h = i16;
                a(vVar, cVar11, a0Var, false);
                i = this.t.f1010b;
            }
        }
        if (e() > 0) {
            if (this.x ^ this.y) {
                int a2 = a(i, vVar, a0Var, true);
                i4 = i2 + a2;
                i3 = i + a2;
                i5 = b(i4, vVar, a0Var, false);
            } else {
                int b2 = b(i2, vVar, a0Var, true);
                i4 = i2 + b2;
                i3 = i + b2;
                i5 = a(i3, vVar, a0Var, false);
            }
            i2 = i4 + i5;
            i = i3 + i5;
        }
        b(vVar, a0Var, i2, i);
        if (!a0Var.d()) {
            this.u.i();
        } else {
            this.E.b();
        }
        this.v = this.y;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int f(RecyclerView.a0 a0Var) {
        return k(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(RecyclerView.a0 a0Var) {
        super.g(a0Var);
        this.D = null;
        this.A = -1;
        this.B = RecyclerView.UNDEFINED_DURATION;
        this.E.b();
    }

    @Deprecated
    protected int h(RecyclerView.a0 a0Var) {
        if (a0Var.c()) {
            return this.u.g();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i(int i) {
        this.A = i;
        this.B = RecyclerView.UNDEFINED_DURATION;
        d dVar = this.D;
        if (dVar != null) {
            dVar.e();
        }
        z();
    }

    public int j(int i) {
        if (i == 1) {
            return (this.s != 1 && J()) ? 1 : -1;
        } else if (i == 2) {
            return (this.s != 1 && J()) ? -1 : 1;
        } else if (i == 17) {
            if (this.s != 0) {
                return RecyclerView.UNDEFINED_DURATION;
            }
            return -1;
        } else if (i == 33) {
            if (this.s != 1) {
                return RecyclerView.UNDEFINED_DURATION;
            }
            return -1;
        } else if (i == 66) {
            if (this.s != 0) {
                return RecyclerView.UNDEFINED_DURATION;
            }
            return 1;
        } else if (i != 130 || this.s != 1) {
            return RecyclerView.UNDEFINED_DURATION;
        } else {
            return 1;
        }
    }

    public void k(int i) {
        if (i != 0 && i != 1) {
            throw new IllegalArgumentException("invalid orientation:" + i);
        }
        a((String) null);
        if (i == this.s && this.u != null) {
            return;
        }
        j a2 = j.a(this, i);
        this.u = a2;
        this.E.f1003a = a2;
        this.s = i;
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean v() {
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable y() {
        if (this.D != null) {
            return new d(this.D);
        }
        d dVar = new d();
        if (e() > 0) {
            F();
            boolean z = this.v ^ this.x;
            dVar.d = z;
            if (z) {
                View Q = Q();
                dVar.f1013c = this.u.b() - this.u.a(Q);
                dVar.f1012b = l(Q);
            } else {
                View R = R();
                dVar.f1012b = l(R);
                dVar.f1013c = this.u.d(R) - this.u.f();
            }
        } else {
            dVar.e();
        }
        return dVar;
    }
}
