package androidx.recyclerview.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import b.g.l.c0.c;
/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    int[] K;
    View[] L;
    private boolean Q;
    boolean I = false;
    int J = -1;
    final SparseIntArray M = new SparseIntArray();
    final SparseIntArray N = new SparseIntArray();
    c O = new a();
    final Rect P = new Rect();

    /* loaded from: classes.dex */
    public static final class a extends c {
        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int e(int i, int i2) {
            return i % i2;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.c
        public int f(int i) {
            return 1;
        }
    }

    /* loaded from: classes.dex */
    public static class b extends RecyclerView.p {

        /* renamed from: e */
        int f1500e = -1;

        /* renamed from: f */
        int f1501f = 0;

        public b(int i, int i2) {
            super(i, i2);
        }

        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public int e() {
            return this.f1500e;
        }

        public int f() {
            return this.f1501f;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class c {

        /* renamed from: a */
        final SparseIntArray f1502a = new SparseIntArray();

        /* renamed from: b */
        final SparseIntArray f1503b = new SparseIntArray();

        /* renamed from: c */
        private boolean f1504c = false;

        /* renamed from: d */
        private boolean f1505d = false;

        static int a(SparseIntArray sparseIntArray, int i) {
            int size = sparseIntArray.size() - 1;
            int i2 = 0;
            while (i2 <= size) {
                int i3 = (i2 + size) >>> 1;
                if (sparseIntArray.keyAt(i3) < i) {
                    i2 = i3 + 1;
                } else {
                    size = i3 - 1;
                }
            }
            int i4 = i2 - 1;
            if (i4 < 0 || i4 >= sparseIntArray.size()) {
                return -1;
            }
            return sparseIntArray.keyAt(i4);
        }

        int b(int i, int i2) {
            if (!this.f1505d) {
                return d(i, i2);
            }
            int i3 = this.f1503b.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int d2 = d(i, i2);
            this.f1503b.put(i, d2);
            return d2;
        }

        int c(int i, int i2) {
            if (!this.f1504c) {
                return e(i, i2);
            }
            int i3 = this.f1502a.get(i, -1);
            if (i3 != -1) {
                return i3;
            }
            int e2 = e(i, i2);
            this.f1502a.put(i, e2);
            return e2;
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x002d  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x0043  */
        /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public int d(int r7, int r8) {
            /*
                r6 = this;
                boolean r0 = r6.f1505d
                r1 = 0
                if (r0 == 0) goto L24
                android.util.SparseIntArray r0 = r6.f1503b
                int r0 = a(r0, r7)
                r2 = -1
                if (r0 == r2) goto L24
                android.util.SparseIntArray r2 = r6.f1503b
                int r2 = r2.get(r0)
                int r3 = r0 + 1
                int r4 = r6.c(r0, r8)
                int r0 = r6.f(r0)
                int r4 = r4 + r0
                if (r4 != r8) goto L27
                int r2 = r2 + 1
                goto L26
            L24:
                r2 = 0
                r3 = 0
            L26:
                r4 = 0
            L27:
                int r0 = r6.f(r7)
            L2b:
                if (r3 >= r7) goto L40
                int r5 = r6.f(r3)
                int r4 = r4 + r5
                if (r4 != r8) goto L38
                int r2 = r2 + 1
                r4 = 0
                goto L3d
            L38:
                if (r4 <= r8) goto L3d
                int r2 = r2 + 1
                r4 = r5
            L3d:
                int r3 = r3 + 1
                goto L2b
            L40:
                int r4 = r4 + r0
                if (r4 <= r8) goto L45
                int r2 = r2 + 1
            L45:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.c.d(int, int):int");
        }

        public abstract int e(int i, int i2);

        public abstract int f(int i);

        public void g() {
            this.f1503b.clear();
        }

        public void h() {
            this.f1502a.clear();
        }
    }

    public GridLayoutManager(Context context, int i) {
        super(context);
        g3(i);
    }

    public GridLayoutManager(Context context, int i, int i2, boolean z) {
        super(context, i2, z);
        g3(i);
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        g3(RecyclerView.o.j0(context, attributeSet, i, i2).f1583b);
    }

    private void P2(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i, boolean z) {
        int i2;
        int i3;
        int i4 = 0;
        int i5 = -1;
        if (z) {
            i5 = i;
            i3 = 0;
            i2 = 1;
        } else {
            i3 = i - 1;
            i2 = -1;
        }
        while (i3 != i5) {
            View view = this.L[i3];
            b bVar = (b) view.getLayoutParams();
            int c3 = c3(vVar, a0Var, i0(view));
            bVar.f1501f = c3;
            bVar.f1500e = i4;
            i4 += c3;
            i3 += i2;
        }
    }

    private void Q2() {
        int K = K();
        for (int i = 0; i < K; i++) {
            b bVar = (b) J(i).getLayoutParams();
            int a2 = bVar.a();
            this.M.put(a2, bVar.f());
            this.N.put(a2, bVar.e());
        }
    }

    private void R2(int i) {
        this.K = S2(this.K, this.J, i);
    }

    static int[] S2(int[] iArr, int i, int i2) {
        int i3;
        if (iArr == null || iArr.length != i + 1 || iArr[iArr.length - 1] != i2) {
            iArr = new int[i + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i2 / i;
        int i6 = i2 % i;
        int i7 = 0;
        for (int i8 = 1; i8 <= i; i8++) {
            i4 += i6;
            if (i4 <= 0 || i - i4 >= i6) {
                i3 = i5;
            } else {
                i3 = i5 + 1;
                i4 -= i;
            }
            i7 += i3;
            iArr[i8] = i7;
        }
        return iArr;
    }

    private void T2() {
        this.M.clear();
        this.N.clear();
    }

    private int U2(RecyclerView.a0 a0Var) {
        if (K() != 0 && a0Var.b() != 0) {
            U1();
            boolean s2 = s2();
            View Z1 = Z1(!s2, true);
            View Y1 = Y1(!s2, true);
            if (Z1 != null && Y1 != null) {
                int b2 = this.O.b(i0(Z1), this.J);
                int b3 = this.O.b(i0(Y1), this.J);
                int min = Math.min(b2, b3);
                int max = this.x ? Math.max(0, ((this.O.b(a0Var.b() - 1, this.J) + 1) - Math.max(b2, b3)) - 1) : Math.max(0, min);
                if (!s2) {
                    return max;
                }
                return Math.round((max * (Math.abs(this.u.d(Y1) - this.u.g(Z1)) / ((this.O.b(i0(Y1), this.J) - this.O.b(i0(Z1), this.J)) + 1))) + (this.u.m() - this.u.g(Z1)));
            }
        }
        return 0;
    }

    private int V2(RecyclerView.a0 a0Var) {
        if (K() != 0 && a0Var.b() != 0) {
            U1();
            View Z1 = Z1(!s2(), true);
            View Y1 = Y1(!s2(), true);
            if (Z1 != null && Y1 != null) {
                if (!s2()) {
                    return this.O.b(a0Var.b() - 1, this.J) + 1;
                }
                int d2 = this.u.d(Y1) - this.u.g(Z1);
                int b2 = this.O.b(i0(Z1), this.J);
                return (int) ((d2 / ((this.O.b(i0(Y1), this.J) - b2) + 1)) * (this.O.b(a0Var.b() - 1, this.J) + 1));
            }
        }
        return 0;
    }

    private void W2(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.a aVar, int i) {
        boolean z = i == 1;
        int b3 = b3(vVar, a0Var, aVar.f1507b);
        if (z) {
            while (b3 > 0) {
                int i2 = aVar.f1507b;
                if (i2 <= 0) {
                    return;
                }
                int i3 = i2 - 1;
                aVar.f1507b = i3;
                b3 = b3(vVar, a0Var, i3);
            }
            return;
        }
        int b2 = a0Var.b() - 1;
        int i4 = aVar.f1507b;
        while (i4 < b2) {
            int i5 = i4 + 1;
            int b32 = b3(vVar, a0Var, i5);
            if (b32 <= b3) {
                break;
            }
            i4 = i5;
            b3 = b32;
        }
        aVar.f1507b = i4;
    }

    private void X2() {
        View[] viewArr = this.L;
        if (viewArr == null || viewArr.length != this.J) {
            this.L = new View[this.J];
        }
    }

    private int a3(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i) {
        if (!a0Var.e()) {
            return this.O.b(i, this.J);
        }
        int f2 = vVar.f(i);
        if (f2 != -1) {
            return this.O.b(f2, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + i);
        return 0;
    }

    private int b3(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i) {
        if (!a0Var.e()) {
            return this.O.c(i, this.J);
        }
        int i2 = this.N.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int f2 = vVar.f(i);
        if (f2 != -1) {
            return this.O.c(f2, this.J);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 0;
    }

    private int c3(RecyclerView.v vVar, RecyclerView.a0 a0Var, int i) {
        if (!a0Var.e()) {
            return this.O.f(i);
        }
        int i2 = this.M.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int f2 = vVar.f(i);
        if (f2 != -1) {
            return this.O.f(f2);
        }
        Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + i);
        return 1;
    }

    private void d3(float f2, int i) {
        R2(Math.max(Math.round(f2 * this.J), i));
    }

    private void e3(View view, int i, boolean z) {
        int i2;
        int i3;
        b bVar = (b) view.getLayoutParams();
        Rect rect = bVar.f1587b;
        int i4 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) bVar).topMargin + ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        int i5 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) bVar).leftMargin + ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        int Y2 = Y2(bVar.f1500e, bVar.f1501f);
        if (this.s == 1) {
            i2 = RecyclerView.o.L(Y2, i, i5, ((ViewGroup.MarginLayoutParams) bVar).width, false);
            i3 = RecyclerView.o.L(this.u.n(), Y(), i4, ((ViewGroup.MarginLayoutParams) bVar).height, true);
        } else {
            int L = RecyclerView.o.L(Y2, i, i4, ((ViewGroup.MarginLayoutParams) bVar).height, false);
            int L2 = RecyclerView.o.L(this.u.n(), q0(), i5, ((ViewGroup.MarginLayoutParams) bVar).width, true);
            i3 = L;
            i2 = L2;
        }
        f3(view, i2, i3, z);
    }

    private void f3(View view, int i, int i2, boolean z) {
        RecyclerView.p pVar = (RecyclerView.p) view.getLayoutParams();
        if (z ? I1(view, i, i2, pVar) : G1(view, i, i2, pVar)) {
            view.measure(i, i2);
        }
    }

    private void h3() {
        int i;
        int i2;
        if (q2() == 1) {
            i2 = p0() - g0();
            i = f0();
        } else {
            i2 = X() - e0();
            i = h0();
        }
        R2(i2 - i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void D1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        if (this.K == null) {
            super.D1(rect, i, i2);
        }
        int f0 = f0() + g0();
        int h0 = h0() + e0();
        if (this.s == 1) {
            i4 = RecyclerView.o.o(i2, rect.height() + h0, c0());
            int[] iArr = this.K;
            i3 = RecyclerView.o.o(i, iArr[iArr.length - 1] + f0, d0());
        } else {
            i3 = RecyclerView.o.o(i, rect.width() + f0, d0());
            int[] iArr2 = this.K;
            i4 = RecyclerView.o.o(i2, iArr2[iArr2.length - 1] + h0, c0());
        }
        C1(i3, i4);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p E() {
        return this.s == 0 ? new b(-2, -1) : new b(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p F(Context context, AttributeSet attributeSet) {
        return new b(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p G(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void G2(boolean z) {
        if (!z) {
            super.G2(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x00d6, code lost:
        if (r13 == (r2 > r15)) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00f6, code lost:
        if (r13 == r11) goto L48;
     */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0107  */
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.View K0(android.view.View r24, int r25, androidx.recyclerview.widget.RecyclerView.v r26, androidx.recyclerview.widget.RecyclerView.a0 r27) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.K0(android.view.View, int, androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0):android.view.View");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public boolean M1() {
        return this.D == null && !this.I;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int O(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.s == 1) {
            return this.J;
        }
        if (a0Var.b() >= 1) {
            return a3(vVar, a0Var, a0Var.b() - 1) + 1;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    void O1(RecyclerView.a0 a0Var, LinearLayoutManager.c cVar, RecyclerView.o.c cVar2) {
        int i = this.J;
        for (int i2 = 0; i2 < this.J && cVar.c(a0Var) && i > 0; i2++) {
            int i3 = cVar.f1518d;
            cVar2.a(i3, Math.max(0, cVar.f1521g));
            i -= this.O.f(i3);
            cVar.f1518d += cVar.f1519e;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Q0(RecyclerView.v vVar, RecyclerView.a0 a0Var, View view, b.g.l.c0.c cVar) {
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof b)) {
            super.P0(view, cVar);
            return;
        }
        b bVar = (b) layoutParams;
        int a3 = a3(vVar, a0Var, bVar.a());
        if (this.s == 0) {
            i4 = bVar.e();
            i3 = bVar.f();
            i = 1;
            z2 = false;
            z = false;
            i2 = a3;
        } else {
            i3 = 1;
            i2 = bVar.e();
            i = bVar.f();
            z2 = false;
            z = false;
            i4 = a3;
        }
        cVar.e0(c.C0053c.f(i4, i3, i2, i, z2, z));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void S0(RecyclerView recyclerView, int i, int i2) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void T0(RecyclerView recyclerView) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void U0(RecyclerView recyclerView, int i, int i2, int i3) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void V0(RecyclerView recyclerView, int i, int i2) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void X0(RecyclerView recyclerView, int i, int i2, Object obj) {
        this.O.h();
        this.O.g();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void Y0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (a0Var.e()) {
            Q2();
        }
        super.Y0(vVar, a0Var);
        T2();
    }

    int Y2(int i, int i2) {
        if (this.s != 1 || !r2()) {
            int[] iArr = this.K;
            return iArr[i2 + i] - iArr[i];
        }
        int[] iArr2 = this.K;
        int i3 = this.J;
        return iArr2[i3 - i] - iArr2[(i3 - i) - i2];
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public void Z0(RecyclerView.a0 a0Var) {
        super.Z0(a0Var);
        this.I = false;
    }

    public int Z2() {
        return this.J;
    }

    public void g3(int i) {
        if (i == this.J) {
            return;
        }
        this.I = true;
        if (i >= 1) {
            this.J = i;
            this.O.h();
            u1();
            return;
        }
        throw new IllegalArgumentException("Span count should be at least 1. Provided " + i);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
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
            if (i0 >= 0 && i0 < i3 && b3(vVar, a0Var, i0) == 0) {
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
    public int l0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.s == 0) {
            return this.J;
        }
        if (a0Var.b() >= 1) {
            return a3(vVar, a0Var, a0Var.b() - 1) + 1;
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean n(RecyclerView.p pVar) {
        return pVar instanceof b;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int s(RecyclerView.a0 a0Var) {
        return this.Q ? U2(a0Var) : super.s(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int t(RecyclerView.a0 a0Var) {
        return this.Q ? V2(a0Var) : super.t(a0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x009f, code lost:
        r21.f1512b = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a1, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v19 */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void t2(androidx.recyclerview.widget.RecyclerView.v r18, androidx.recyclerview.widget.RecyclerView.a0 r19, androidx.recyclerview.widget.LinearLayoutManager.c r20, androidx.recyclerview.widget.LinearLayoutManager.b r21) {
        /*
            Method dump skipped, instructions count: 564
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.t2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, androidx.recyclerview.widget.LinearLayoutManager$c, androidx.recyclerview.widget.LinearLayoutManager$b):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.a0 a0Var) {
        return this.Q ? U2(a0Var) : super.v(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public void v2(RecyclerView.v vVar, RecyclerView.a0 a0Var, LinearLayoutManager.a aVar, int i) {
        super.v2(vVar, a0Var, aVar, i);
        h3();
        if (a0Var.b() > 0 && !a0Var.e()) {
            W2(vVar, a0Var, aVar, i);
        }
        X2();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int w(RecyclerView.a0 a0Var) {
        return this.Q ? V2(a0Var) : super.w(a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int x1(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        h3();
        X2();
        return super.x1(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public int z1(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        h3();
        X2();
        return super.z1(i, vVar, a0Var);
    }
}
