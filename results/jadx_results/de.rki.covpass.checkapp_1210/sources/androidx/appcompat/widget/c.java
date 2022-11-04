package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.ActionMenuView;
import androidx.core.view.b;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class c extends androidx.appcompat.view.menu.a implements b.a {
    d Z3;

    /* renamed from: a4 */
    private Drawable f1229a4;

    /* renamed from: b4 */
    private boolean f1230b4;

    /* renamed from: c4 */
    private boolean f1231c4;

    /* renamed from: d4 */
    private boolean f1232d4;

    /* renamed from: e4 */
    private int f1233e4;

    /* renamed from: f4 */
    private int f1234f4;

    /* renamed from: g4 */
    private int f1235g4;

    /* renamed from: h4 */
    private boolean f1236h4;

    /* renamed from: i4 */
    private boolean f1237i4;

    /* renamed from: j4 */
    private boolean f1238j4;

    /* renamed from: k4 */
    private boolean f1239k4;

    /* renamed from: l4 */
    private int f1240l4;

    /* renamed from: n4 */
    e f1242n4;

    /* renamed from: o4 */
    a f1243o4;

    /* renamed from: p4 */
    RunnableC0017c f1244p4;

    /* renamed from: q4 */
    private b f1245q4;

    /* renamed from: s4 */
    int f1247s4;

    /* renamed from: m4 */
    private final SparseBooleanArray f1241m4 = new SparseBooleanArray();

    /* renamed from: r4 */
    final f f1246r4 = new f();

    /* loaded from: classes.dex */
    public class a extends androidx.appcompat.view.menu.i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context, androidx.appcompat.view.menu.m mVar, View view) {
            super(context, mVar, view, false, e.a.l_res_0x7f030022);
            c.this = r7;
            if (!((androidx.appcompat.view.menu.g) mVar.getItem()).l()) {
                View view2 = r7.Z3;
                f(view2 == null ? (View) ((androidx.appcompat.view.menu.a) r7).X3 : view2);
            }
            j(r7.f1246r4);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.appcompat.view.menu.i
        public void e() {
            c cVar = c.this;
            cVar.f1243o4 = null;
            cVar.f1247s4 = 0;
            super.e();
        }
    }

    /* loaded from: classes.dex */
    private class b extends ActionMenuItemView.b {
        b() {
            c.this = r1;
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public l.e a() {
            a aVar = c.this.f1243o4;
            if (aVar != null) {
                return aVar.c();
            }
            return null;
        }
    }

    /* renamed from: androidx.appcompat.widget.c$c */
    /* loaded from: classes.dex */
    public class RunnableC0017c implements Runnable {

        /* renamed from: c */
        private e f1250c;

        public RunnableC0017c(e eVar) {
            c.this = r1;
            this.f1250c = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (((androidx.appcompat.view.menu.a) c.this).f888q != null) {
                ((androidx.appcompat.view.menu.a) c.this).f888q.d();
            }
            View view = (View) ((androidx.appcompat.view.menu.a) c.this).X3;
            if (view != null && view.getWindowToken() != null && this.f1250c.m()) {
                c.this.f1242n4 = this.f1250c;
            }
            c.this.f1244p4 = null;
        }
    }

    /* loaded from: classes.dex */
    public class d extends q implements ActionMenuView.a {

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public class a extends k0 {
            final /* synthetic */ c Y3;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(View view, c cVar) {
                super(view);
                d.this = r1;
                this.Y3 = cVar;
            }

            @Override // androidx.appcompat.widget.k0
            public l.e b() {
                e eVar = c.this.f1242n4;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // androidx.appcompat.widget.k0
            public boolean c() {
                c.this.K();
                return true;
            }

            @Override // androidx.appcompat.widget.k0
            public boolean d() {
                c cVar = c.this;
                if (cVar.f1244p4 != null) {
                    return false;
                }
                cVar.B();
                return true;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Context context) {
            super(context, null, e.a.k_res_0x7f030021);
            c.this = r3;
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            d1.a(this, getContentDescription());
            setOnTouchListener(new a(this, r3));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.K();
            return true;
        }

        @Override // android.widget.ImageView
        protected boolean setFrame(int i10, int i11, int i12, int i13) {
            boolean frame = super.setFrame(i10, i11, i12, i13);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                androidx.core.graphics.drawable.a.l(background, paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* loaded from: classes.dex */
    public class e extends androidx.appcompat.view.menu.i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z10) {
            super(context, eVar, view, z10, e.a.l_res_0x7f030022);
            c.this = r7;
            h(8388613);
            j(r7.f1246r4);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.appcompat.view.menu.i
        public void e() {
            if (((androidx.appcompat.view.menu.a) c.this).f888q != null) {
                ((androidx.appcompat.view.menu.a) c.this).f888q.close();
            }
            c.this.f1242n4 = null;
            super.e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class f implements j.a {
        f() {
            c.this = r1;
        }

        @Override // androidx.appcompat.view.menu.j.a
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
            if (eVar instanceof androidx.appcompat.view.menu.m) {
                eVar.D().e(false);
            }
            j.a m10 = c.this.m();
            if (m10 != null) {
                m10.b(eVar, z10);
            }
        }

        @Override // androidx.appcompat.view.menu.j.a
        public boolean c(androidx.appcompat.view.menu.e eVar) {
            if (eVar == ((androidx.appcompat.view.menu.a) c.this).f888q) {
                return false;
            }
            c.this.f1247s4 = ((androidx.appcompat.view.menu.m) eVar).getItem().getItemId();
            j.a m10 = c.this.m();
            if (m10 == null) {
                return false;
            }
            return m10.c(eVar);
        }
    }

    public c(Context context) {
        super(context, e.g.c_res_0x7f0c0003, e.g.b_res_0x7f0c0002);
    }

    private View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.X3;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if ((childAt instanceof k.a) && ((k.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }

    public Drawable A() {
        d dVar = this.Z3;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (!this.f1230b4) {
            return null;
        }
        return this.f1229a4;
    }

    public boolean B() {
        androidx.appcompat.view.menu.k kVar;
        RunnableC0017c runnableC0017c = this.f1244p4;
        if (runnableC0017c != null && (kVar = this.X3) != null) {
            ((View) kVar).removeCallbacks(runnableC0017c);
            this.f1244p4 = null;
            return true;
        }
        e eVar = this.f1242n4;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean C() {
        a aVar = this.f1243o4;
        if (aVar != null) {
            aVar.b();
            return true;
        }
        return false;
    }

    public boolean D() {
        return this.f1244p4 != null || E();
    }

    public boolean E() {
        e eVar = this.f1242n4;
        return eVar != null && eVar.d();
    }

    public void F(Configuration configuration) {
        if (!this.f1236h4) {
            this.f1235g4 = k.a.b(this.f887d).d();
        }
        androidx.appcompat.view.menu.e eVar = this.f888q;
        if (eVar != null) {
            eVar.K(true);
        }
    }

    public void G(boolean z10) {
        this.f1239k4 = z10;
    }

    public void H(ActionMenuView actionMenuView) {
        this.X3 = actionMenuView;
        actionMenuView.b(this.f888q);
    }

    public void I(Drawable drawable) {
        d dVar = this.Z3;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
            return;
        }
        this.f1230b4 = true;
        this.f1229a4 = drawable;
    }

    public void J(boolean z10) {
        this.f1231c4 = z10;
        this.f1232d4 = true;
    }

    public boolean K() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f1231c4 || E() || (eVar = this.f888q) == null || this.X3 == null || this.f1244p4 != null || eVar.z().isEmpty()) {
            return false;
        }
        RunnableC0017c runnableC0017c = new RunnableC0017c(new e(this.f887d, this.f888q, this.Z3, true));
        this.f1244p4 = runnableC0017c;
        ((View) this.X3).post(runnableC0017c);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
        y();
        super.b(eVar, z10);
    }

    @Override // androidx.appcompat.view.menu.a
    public void c(androidx.appcompat.view.menu.g gVar, k.a aVar) {
        aVar.e(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.X3);
        if (this.f1245q4 == null) {
            this.f1245q4 = new b();
        }
        actionMenuItemView.setPopupCallback(this.f1245q4);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void d(Context context, androidx.appcompat.view.menu.e eVar) {
        super.d(context, eVar);
        Resources resources = context.getResources();
        k.a b10 = k.a.b(context);
        if (!this.f1232d4) {
            this.f1231c4 = b10.h();
        }
        if (!this.f1238j4) {
            this.f1233e4 = b10.c();
        }
        if (!this.f1236h4) {
            this.f1235g4 = b10.d();
        }
        int i10 = this.f1233e4;
        if (this.f1231c4) {
            if (this.Z3 == null) {
                d dVar = new d(this.f886c);
                this.Z3 = dVar;
                if (this.f1230b4) {
                    dVar.setImageDrawable(this.f1229a4);
                    this.f1229a4 = null;
                    this.f1230b4 = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.Z3.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i10 -= this.Z3.getMeasuredWidth();
        } else {
            this.Z3 = null;
        }
        this.f1234f4 = i10;
        this.f1240l4 = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public boolean e(androidx.appcompat.view.menu.m mVar) {
        boolean z10 = false;
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        androidx.appcompat.view.menu.m mVar2 = mVar;
        while (mVar2.e0() != this.f888q) {
            mVar2 = (androidx.appcompat.view.menu.m) mVar2.e0();
        }
        View z11 = z(mVar2.getItem());
        if (z11 == null) {
            return false;
        }
        this.f1247s4 = mVar.getItem().getItemId();
        int size = mVar.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                break;
            }
            MenuItem item = mVar.getItem(i10);
            if (item.isVisible() && item.getIcon() != null) {
                z10 = true;
                break;
            }
            i10++;
        }
        a aVar = new a(this.f887d, mVar, z11);
        this.f1243o4 = aVar;
        aVar.g(z10);
        this.f1243o4.k();
        super.e(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.j
    public void f(boolean z10) {
        super.f(z10);
        ((View) this.X3).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.f888q;
        boolean z11 = false;
        if (eVar != null) {
            ArrayList<androidx.appcompat.view.menu.g> s10 = eVar.s();
            int size = s10.size();
            for (int i10 = 0; i10 < size; i10++) {
                androidx.core.view.b b10 = s10.get(i10).b();
                if (b10 != null) {
                    b10.i(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.f888q;
        ArrayList<androidx.appcompat.view.menu.g> z12 = eVar2 != null ? eVar2.z() : null;
        if (this.f1231c4 && z12 != null) {
            int size2 = z12.size();
            if (size2 == 1) {
                z11 = !z12.get(0).isActionViewExpanded();
            } else if (size2 > 0) {
                z11 = true;
            }
        }
        d dVar = this.Z3;
        if (z11) {
            if (dVar == null) {
                this.Z3 = new d(this.f886c);
            }
            ViewGroup viewGroup = (ViewGroup) this.Z3.getParent();
            if (viewGroup != this.X3) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.Z3);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.X3;
                actionMenuView.addView(this.Z3, actionMenuView.F());
            }
        } else if (dVar != null) {
            ViewParent parent = dVar.getParent();
            androidx.appcompat.view.menu.k kVar = this.X3;
            if (parent == kVar) {
                ((ViewGroup) kVar).removeView(this.Z3);
            }
        }
        ((ActionMenuView) this.X3).setOverflowReserved(this.f1231c4);
    }

    @Override // androidx.appcompat.view.menu.j
    public boolean g() {
        int i10;
        ArrayList<androidx.appcompat.view.menu.g> arrayList;
        int i11;
        int i12;
        int i13;
        boolean z10;
        c cVar = this;
        androidx.appcompat.view.menu.e eVar = cVar.f888q;
        View view = null;
        boolean z11 = false;
        if (eVar != null) {
            arrayList = eVar.E();
            i10 = arrayList.size();
        } else {
            arrayList = null;
            i10 = 0;
        }
        int i14 = cVar.f1235g4;
        int i15 = cVar.f1234f4;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) cVar.X3;
        boolean z12 = false;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < i10; i18++) {
            androidx.appcompat.view.menu.g gVar = arrayList.get(i18);
            if (gVar.o()) {
                i16++;
            } else if (gVar.n()) {
                i17++;
            } else {
                z12 = true;
            }
            if (cVar.f1239k4 && gVar.isActionViewExpanded()) {
                i14 = 0;
            }
        }
        if (cVar.f1231c4 && (z12 || i17 + i16 > i14)) {
            i14--;
        }
        int i19 = i14 - i16;
        SparseBooleanArray sparseBooleanArray = cVar.f1241m4;
        sparseBooleanArray.clear();
        if (cVar.f1237i4) {
            int i20 = cVar.f1240l4;
            i11 = i15 / i20;
            i12 = i20 + ((i15 % i20) / i11);
        } else {
            i12 = 0;
            i11 = 0;
        }
        int i21 = 0;
        int i22 = 0;
        while (i21 < i10) {
            androidx.appcompat.view.menu.g gVar2 = arrayList.get(i21);
            if (gVar2.o()) {
                View n10 = cVar.n(gVar2, view, viewGroup);
                if (cVar.f1237i4) {
                    int i23 = z11 ? 1 : 0;
                    int i24 = z11 ? 1 : 0;
                    i11 -= ActionMenuView.L(n10, i12, i11, makeMeasureSpec, i23);
                } else {
                    n10.measure(makeMeasureSpec, makeMeasureSpec);
                }
                int measuredWidth = n10.getMeasuredWidth();
                i15 -= measuredWidth;
                if (i22 == 0) {
                    i22 = measuredWidth;
                }
                int groupId = gVar2.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                gVar2.u(true);
                z10 = z11;
                i13 = i10;
            } else if (gVar2.n()) {
                int groupId2 = gVar2.getGroupId();
                boolean z13 = sparseBooleanArray.get(groupId2);
                boolean z14 = (i19 > 0 || z13) && i15 > 0 && (!cVar.f1237i4 || i11 > 0);
                boolean z15 = z14;
                i13 = i10;
                if (z14) {
                    View n11 = cVar.n(gVar2, null, viewGroup);
                    if (cVar.f1237i4) {
                        int L = ActionMenuView.L(n11, i12, i11, makeMeasureSpec, 0);
                        i11 -= L;
                        if (L == 0) {
                            z15 = false;
                        }
                    } else {
                        n11.measure(makeMeasureSpec, makeMeasureSpec);
                    }
                    boolean z16 = z15;
                    int measuredWidth2 = n11.getMeasuredWidth();
                    i15 -= measuredWidth2;
                    if (i22 == 0) {
                        i22 = measuredWidth2;
                    }
                    z14 = z16 & (!cVar.f1237i4 ? i15 + i22 > 0 : i15 >= 0);
                }
                if (z14 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z13) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i25 = 0; i25 < i21; i25++) {
                        androidx.appcompat.view.menu.g gVar3 = arrayList.get(i25);
                        if (gVar3.getGroupId() == groupId2) {
                            if (gVar3.l()) {
                                i19++;
                            }
                            gVar3.u(false);
                        }
                    }
                }
                if (z14) {
                    i19--;
                }
                gVar2.u(z14);
                z10 = false;
            } else {
                boolean z17 = z11 ? 1 : 0;
                Object[] objArr = z11 ? 1 : 0;
                z10 = z17;
                i13 = i10;
                gVar2.u(z10);
            }
            i21++;
            z11 = z10;
            i10 = i13;
            view = null;
            cVar = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean l(ViewGroup viewGroup, int i10) {
        if (viewGroup.getChildAt(i10) == this.Z3) {
            return false;
        }
        return super.l(viewGroup, i10);
    }

    @Override // androidx.appcompat.view.menu.a
    public View n(androidx.appcompat.view.menu.g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.n(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.o(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public androidx.appcompat.view.menu.k o(ViewGroup viewGroup) {
        androidx.appcompat.view.menu.k kVar = this.X3;
        androidx.appcompat.view.menu.k o10 = super.o(viewGroup);
        if (kVar != o10) {
            ((ActionMenuView) o10).setPresenter(this);
        }
        return o10;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean q(int i10, androidx.appcompat.view.menu.g gVar) {
        return gVar.l();
    }

    public boolean y() {
        return B() | C();
    }
}
