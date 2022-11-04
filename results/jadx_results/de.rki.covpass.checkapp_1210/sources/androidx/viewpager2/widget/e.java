package androidx.viewpager2.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import java.util.Locale;
/* loaded from: classes.dex */
public final class e extends RecyclerView.t {

    /* renamed from: a */
    private ViewPager2.i f5262a;

    /* renamed from: b */
    private final ViewPager2 f5263b;

    /* renamed from: c */
    private final RecyclerView f5264c;

    /* renamed from: d */
    private final LinearLayoutManager f5265d;

    /* renamed from: e */
    private int f5266e;

    /* renamed from: f */
    private int f5267f;

    /* renamed from: g */
    private a f5268g = new a();

    /* renamed from: h */
    private int f5269h;

    /* renamed from: i */
    private int f5270i;

    /* renamed from: j */
    private boolean f5271j;

    /* renamed from: k */
    private boolean f5272k;

    /* renamed from: l */
    private boolean f5273l;

    /* renamed from: m */
    private boolean f5274m;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a */
        int f5275a;

        /* renamed from: b */
        float f5276b;

        /* renamed from: c */
        int f5277c;

        a() {
        }

        void a() {
            this.f5275a = -1;
            this.f5276b = 0.0f;
            this.f5277c = 0;
        }
    }

    public e(ViewPager2 viewPager2) {
        this.f5263b = viewPager2;
        RecyclerView recyclerView = viewPager2.Y3;
        this.f5264c = recyclerView;
        this.f5265d = (LinearLayoutManager) recyclerView.getLayoutManager();
        n();
    }

    private void c(int i10, float f10, int i11) {
        ViewPager2.i iVar = this.f5262a;
        if (iVar != null) {
            iVar.b(i10, f10, i11);
        }
    }

    private void d(int i10) {
        ViewPager2.i iVar = this.f5262a;
        if (iVar != null) {
            iVar.c(i10);
        }
    }

    private void e(int i10) {
        if ((this.f5266e == 3 && this.f5267f == 0) || this.f5267f == i10) {
            return;
        }
        this.f5267f = i10;
        ViewPager2.i iVar = this.f5262a;
        if (iVar == null) {
            return;
        }
        iVar.a(i10);
    }

    private int f() {
        return this.f5265d.Z1();
    }

    private boolean k() {
        int i10 = this.f5266e;
        return i10 == 1 || i10 == 4;
    }

    private void n() {
        this.f5266e = 0;
        this.f5267f = 0;
        this.f5268g.a();
        this.f5269h = -1;
        this.f5270i = -1;
        this.f5271j = false;
        this.f5272k = false;
        this.f5274m = false;
        this.f5273l = false;
    }

    private void p(boolean z10) {
        this.f5274m = z10;
        this.f5266e = z10 ? 4 : 1;
        int i10 = this.f5270i;
        if (i10 != -1) {
            this.f5269h = i10;
            this.f5270i = -1;
        } else if (this.f5269h == -1) {
            this.f5269h = f();
        }
        e(1);
    }

    private void q() {
        int i10;
        a aVar = this.f5268g;
        int Z1 = this.f5265d.Z1();
        aVar.f5275a = Z1;
        if (Z1 == -1) {
            aVar.a();
            return;
        }
        View C = this.f5265d.C(Z1);
        if (C == null) {
            aVar.a();
            return;
        }
        int a02 = this.f5265d.a0(C);
        int j02 = this.f5265d.j0(C);
        int m02 = this.f5265d.m0(C);
        int H = this.f5265d.H(C);
        ViewGroup.LayoutParams layoutParams = C.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            a02 += marginLayoutParams.leftMargin;
            j02 += marginLayoutParams.rightMargin;
            m02 += marginLayoutParams.topMargin;
            H += marginLayoutParams.bottomMargin;
        }
        int height = C.getHeight() + m02 + H;
        int width = C.getWidth() + a02 + j02;
        if (this.f5265d.p2() == 0) {
            i10 = (C.getLeft() - a02) - this.f5264c.getPaddingLeft();
            if (this.f5263b.d()) {
                i10 = -i10;
            }
            height = width;
        } else {
            i10 = (C.getTop() - m02) - this.f5264c.getPaddingTop();
        }
        int i11 = -i10;
        aVar.f5277c = i11;
        if (i11 >= 0) {
            aVar.f5276b = height == 0 ? 0.0f : i11 / height;
        } else if (!new androidx.viewpager2.widget.a(this.f5265d).d()) {
            throw new IllegalStateException(String.format(Locale.US, "Page can only be offset by a positive amount, not by %d", Integer.valueOf(aVar.f5277c)));
        } else {
            throw new IllegalStateException("Page(s) contain a ViewGroup with a LayoutTransition (or animateLayoutChanges=\"true\"), which interferes with the scrolling animation. Make sure to call getLayoutTransition().setAnimateParentHierarchy(false) on all ViewGroups with a LayoutTransition before an animation is started.");
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public void a(RecyclerView recyclerView, int i10) {
        boolean z10 = true;
        if (!(this.f5266e == 1 && this.f5267f == 1) && i10 == 1) {
            p(false);
        } else if (k() && i10 == 2) {
            if (!this.f5272k) {
                return;
            }
            e(2);
            this.f5271j = true;
        } else {
            if (k() && i10 == 0) {
                q();
                if (!this.f5272k) {
                    int i11 = this.f5268g.f5275a;
                    if (i11 != -1) {
                        c(i11, 0.0f, 0);
                    }
                } else {
                    a aVar = this.f5268g;
                    if (aVar.f5277c == 0) {
                        int i12 = this.f5269h;
                        int i13 = aVar.f5275a;
                        if (i12 != i13) {
                            d(i13);
                        }
                    } else {
                        z10 = false;
                    }
                }
                if (z10) {
                    e(0);
                    n();
                }
            }
            if (this.f5266e != 2 || i10 != 0 || !this.f5273l) {
                return;
            }
            q();
            a aVar2 = this.f5268g;
            if (aVar2.f5277c != 0) {
                return;
            }
            int i14 = this.f5270i;
            int i15 = aVar2.f5275a;
            if (i14 != i15) {
                if (i15 == -1) {
                    i15 = 0;
                }
                d(i15);
            }
            e(0);
            n();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x001d, code lost:
        if ((r5 < 0) == r3.f5263b.d()) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
        if (r3.f5269h != r5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    @Override // androidx.recyclerview.widget.RecyclerView.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void b(androidx.recyclerview.widget.RecyclerView r4, int r5, int r6) {
        /*
            r3 = this;
            r4 = 1
            r3.f5272k = r4
            r3.q()
            boolean r0 = r3.f5271j
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L3a
            r3.f5271j = r2
            if (r6 > 0) goto L22
            if (r6 != 0) goto L20
            if (r5 >= 0) goto L16
            r5 = r4
            goto L17
        L16:
            r5 = r2
        L17:
            androidx.viewpager2.widget.ViewPager2 r6 = r3.f5263b
            boolean r6 = r6.d()
            if (r5 != r6) goto L20
            goto L22
        L20:
            r5 = r2
            goto L23
        L22:
            r5 = r4
        L23:
            if (r5 == 0) goto L2f
            androidx.viewpager2.widget.e$a r5 = r3.f5268g
            int r6 = r5.f5277c
            if (r6 == 0) goto L2f
            int r5 = r5.f5275a
            int r5 = r5 + r4
            goto L33
        L2f:
            androidx.viewpager2.widget.e$a r5 = r3.f5268g
            int r5 = r5.f5275a
        L33:
            r3.f5270i = r5
            int r6 = r3.f5269h
            if (r6 == r5) goto L48
            goto L45
        L3a:
            int r5 = r3.f5266e
            if (r5 != 0) goto L48
            androidx.viewpager2.widget.e$a r5 = r3.f5268g
            int r5 = r5.f5275a
            if (r5 != r1) goto L45
            r5 = r2
        L45:
            r3.d(r5)
        L48:
            androidx.viewpager2.widget.e$a r5 = r3.f5268g
            int r6 = r5.f5275a
            if (r6 != r1) goto L4f
            r6 = r2
        L4f:
            float r0 = r5.f5276b
            int r5 = r5.f5277c
            r3.c(r6, r0, r5)
            androidx.viewpager2.widget.e$a r5 = r3.f5268g
            int r6 = r5.f5275a
            int r0 = r3.f5270i
            if (r6 == r0) goto L60
            if (r0 != r1) goto L6e
        L60:
            int r5 = r5.f5277c
            if (r5 != 0) goto L6e
            int r5 = r3.f5267f
            if (r5 == r4) goto L6e
            r3.e(r2)
            r3.n()
        L6e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.viewpager2.widget.e.b(androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public double g() {
        q();
        a aVar = this.f5268g;
        return aVar.f5275a + aVar.f5276b;
    }

    public int h() {
        return this.f5267f;
    }

    public boolean i() {
        return this.f5274m;
    }

    public boolean j() {
        return this.f5267f == 0;
    }

    public void l() {
        this.f5273l = true;
    }

    public void m(int i10, boolean z10) {
        this.f5266e = z10 ? 2 : 3;
        boolean z11 = false;
        this.f5274m = false;
        if (this.f5270i != i10) {
            z11 = true;
        }
        this.f5270i = i10;
        e(2);
        if (z11) {
            d(i10);
        }
    }

    public void o(ViewPager2.i iVar) {
        this.f5262a = iVar;
    }
}
