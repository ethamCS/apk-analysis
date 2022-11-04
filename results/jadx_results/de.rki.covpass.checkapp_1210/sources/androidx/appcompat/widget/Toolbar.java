package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.a;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.ActionMenuView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class Toolbar extends ViewGroup implements androidx.core.view.i {
    private androidx.appcompat.widget.c A4;
    private d B4;
    private j.a C4;
    private e.a D4;
    private boolean E4;
    private final Runnable F4;
    private Drawable U3;
    private CharSequence V3;
    ImageButton W3;
    View X3;
    private Context Y3;
    private int Z3;

    /* renamed from: a4 */
    private int f1148a4;

    /* renamed from: b4 */
    private int f1149b4;

    /* renamed from: c */
    private ActionMenuView f1150c;

    /* renamed from: c4 */
    int f1151c4;

    /* renamed from: d */
    private TextView f1152d;

    /* renamed from: d4 */
    private int f1153d4;

    /* renamed from: e4 */
    private int f1154e4;

    /* renamed from: f4 */
    private int f1155f4;

    /* renamed from: g4 */
    private int f1156g4;

    /* renamed from: h4 */
    private int f1157h4;

    /* renamed from: i4 */
    private r0 f1158i4;

    /* renamed from: j4 */
    private int f1159j4;

    /* renamed from: k4 */
    private int f1160k4;

    /* renamed from: l4 */
    private int f1161l4;

    /* renamed from: m4 */
    private CharSequence f1162m4;

    /* renamed from: n4 */
    private CharSequence f1163n4;

    /* renamed from: o4 */
    private ColorStateList f1164o4;

    /* renamed from: p4 */
    private ColorStateList f1165p4;

    /* renamed from: q */
    private TextView f1166q;

    /* renamed from: q4 */
    private boolean f1167q4;

    /* renamed from: r4 */
    private boolean f1168r4;

    /* renamed from: s4 */
    private final ArrayList<View> f1169s4;

    /* renamed from: t4 */
    private final ArrayList<View> f1170t4;

    /* renamed from: u4 */
    private final int[] f1171u4;

    /* renamed from: v4 */
    final androidx.core.view.j f1172v4;

    /* renamed from: w4 */
    private ArrayList<MenuItem> f1173w4;

    /* renamed from: x */
    private ImageButton f1174x;

    /* renamed from: x4 */
    f f1175x4;

    /* renamed from: y */
    private ImageView f1176y;

    /* renamed from: y4 */
    private final ActionMenuView.e f1177y4;

    /* renamed from: z4 */
    private c1 f1178z4;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements ActionMenuView.e {
        a() {
            Toolbar.this = r1;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f1172v4.d(menuItem)) {
                return true;
            }
            f fVar = Toolbar.this.f1175x4;
            if (fVar == null) {
                return false;
            }
            return fVar.onMenuItemClick(menuItem);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class b implements Runnable {
        b() {
            Toolbar.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.S();
        }
    }

    /* loaded from: classes.dex */
    public class c implements View.OnClickListener {
        c() {
            Toolbar.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.e();
        }
    }

    /* loaded from: classes.dex */
    public class d implements androidx.appcompat.view.menu.j {

        /* renamed from: c */
        androidx.appcompat.view.menu.e f1182c;

        /* renamed from: d */
        androidx.appcompat.view.menu.g f1183d;

        d() {
            Toolbar.this = r1;
        }

        @Override // androidx.appcompat.view.menu.j
        public void b(androidx.appcompat.view.menu.e eVar, boolean z10) {
        }

        @Override // androidx.appcompat.view.menu.j
        public void d(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f1182c;
            if (eVar2 != null && (gVar = this.f1183d) != null) {
                eVar2.f(gVar);
            }
            this.f1182c = eVar;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean e(androidx.appcompat.view.menu.m mVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public void f(boolean z10) {
            if (this.f1183d != null) {
                androidx.appcompat.view.menu.e eVar = this.f1182c;
                boolean z11 = false;
                if (eVar != null) {
                    int size = eVar.size();
                    int i10 = 0;
                    while (true) {
                        if (i10 >= size) {
                            break;
                        } else if (this.f1182c.getItem(i10) == this.f1183d) {
                            z11 = true;
                            break;
                        } else {
                            i10++;
                        }
                    }
                }
                if (z11) {
                    return;
                }
                i(this.f1182c, this.f1183d);
            }
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean g() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean i(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            View view = Toolbar.this.X3;
            if (view instanceof k.c) {
                ((k.c) view).f();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.X3);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.W3);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.X3 = null;
            toolbar3.a();
            this.f1183d = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            return true;
        }

        @Override // androidx.appcompat.view.menu.j
        public boolean j(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.g();
            ViewParent parent = Toolbar.this.W3.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.W3);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.W3);
            }
            Toolbar.this.X3 = gVar.getActionView();
            this.f1183d = gVar;
            ViewParent parent2 = Toolbar.this.X3.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.X3);
                }
                e generateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                generateDefaultLayoutParams.f706a = 8388611 | (toolbar4.f1151c4 & 112);
                generateDefaultLayoutParams.f1185b = 2;
                toolbar4.X3.setLayoutParams(generateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.X3);
            }
            Toolbar.this.K();
            Toolbar.this.requestLayout();
            gVar.r(true);
            View view = Toolbar.this.X3;
            if (view instanceof k.c) {
                ((k.c) view).c();
            }
            return true;
        }
    }

    /* loaded from: classes.dex */
    public static class e extends a.C0013a {

        /* renamed from: b */
        int f1185b;

        public e(int i10, int i11) {
            super(i10, i11);
            this.f1185b = 0;
            this.f706a = 8388627;
        }

        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1185b = 0;
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f1185b = 0;
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f1185b = 0;
            a(marginLayoutParams);
        }

        public e(a.C0013a c0013a) {
            super(c0013a);
            this.f1185b = 0;
        }

        public e(e eVar) {
            super((a.C0013a) eVar);
            this.f1185b = 0;
            this.f1185b = eVar.f1185b;
        }

        void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }
    }

    /* loaded from: classes.dex */
    public interface f {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    /* loaded from: classes.dex */
    public static class g extends v0.a {
        public static final Parcelable.Creator<g> CREATOR = new a();

        /* renamed from: q */
        int f1186q;

        /* renamed from: x */
        boolean f1187x;

        /* loaded from: classes.dex */
        class a implements Parcelable.ClassLoaderCreator<g> {
            a() {
            }

            /* renamed from: a */
            public g createFromParcel(Parcel parcel) {
                return new g(parcel, null);
            }

            /* renamed from: b */
            public g createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new g(parcel, classLoader);
            }

            /* renamed from: c */
            public g[] newArray(int i10) {
                return new g[i10];
            }
        }

        public g(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1186q = parcel.readInt();
            this.f1187x = parcel.readInt() != 0;
        }

        public g(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // v0.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f1186q);
            parcel.writeInt(this.f1187x ? 1 : 0);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, e.a.O);
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f1161l4 = 8388627;
        this.f1169s4 = new ArrayList<>();
        this.f1170t4 = new ArrayList<>();
        this.f1171u4 = new int[2];
        this.f1172v4 = new androidx.core.view.j(new Runnable() { // from class: androidx.appcompat.widget.b1
            @Override // java.lang.Runnable
            public final void run() {
                Toolbar.this.z();
            }
        });
        this.f1173w4 = new ArrayList<>();
        this.f1177y4 = new a();
        this.F4 = new b();
        Context context2 = getContext();
        int[] iArr = e.j.f9228d3;
        a1 v10 = a1.v(context2, attributeSet, iArr, i10, 0);
        androidx.core.view.y.m0(this, context, iArr, attributeSet, v10.r(), i10, 0);
        this.f1148a4 = v10.n(e.j.F3, 0);
        this.f1149b4 = v10.n(e.j.f9323w3, 0);
        this.f1161l4 = v10.l(e.j.f9233e3, this.f1161l4);
        this.f1151c4 = v10.l(e.j.f9238f3, 48);
        int e10 = v10.e(e.j.f9338z3, 0);
        int i11 = e.j.E3;
        e10 = v10.s(i11) ? v10.e(i11, e10) : e10;
        this.f1157h4 = e10;
        this.f1156g4 = e10;
        this.f1155f4 = e10;
        this.f1154e4 = e10;
        int e11 = v10.e(e.j.C3, -1);
        if (e11 >= 0) {
            this.f1154e4 = e11;
        }
        int e12 = v10.e(e.j.B3, -1);
        if (e12 >= 0) {
            this.f1155f4 = e12;
        }
        int e13 = v10.e(e.j.D3, -1);
        if (e13 >= 0) {
            this.f1156g4 = e13;
        }
        int e14 = v10.e(e.j.A3, -1);
        if (e14 >= 0) {
            this.f1157h4 = e14;
        }
        this.f1153d4 = v10.f(e.j.f9293q3, -1);
        int e15 = v10.e(e.j.f9273m3, Integer.MIN_VALUE);
        int e16 = v10.e(e.j.f9253i3, Integer.MIN_VALUE);
        int f10 = v10.f(e.j.f9263k3, 0);
        int f11 = v10.f(e.j.f9268l3, 0);
        h();
        this.f1158i4.e(f10, f11);
        if (e15 != Integer.MIN_VALUE || e16 != Integer.MIN_VALUE) {
            this.f1158i4.g(e15, e16);
        }
        this.f1159j4 = v10.e(e.j.f9278n3, Integer.MIN_VALUE);
        this.f1160k4 = v10.e(e.j.f9258j3, Integer.MIN_VALUE);
        this.U3 = v10.g(e.j.f9248h3);
        this.V3 = v10.p(e.j.f9243g3);
        CharSequence p10 = v10.p(e.j.f9333y3);
        if (!TextUtils.isEmpty(p10)) {
            setTitle(p10);
        }
        CharSequence p11 = v10.p(e.j.f9318v3);
        if (!TextUtils.isEmpty(p11)) {
            setSubtitle(p11);
        }
        this.Y3 = getContext();
        setPopupTheme(v10.n(e.j.f9313u3, 0));
        Drawable g10 = v10.g(e.j.f9308t3);
        if (g10 != null) {
            setNavigationIcon(g10);
        }
        CharSequence p12 = v10.p(e.j.f9303s3);
        if (!TextUtils.isEmpty(p12)) {
            setNavigationContentDescription(p12);
        }
        Drawable g11 = v10.g(e.j.f9283o3);
        if (g11 != null) {
            setLogo(g11);
        }
        CharSequence p13 = v10.p(e.j.f9288p3);
        if (!TextUtils.isEmpty(p13)) {
            setLogoDescription(p13);
        }
        int i12 = e.j.G3;
        if (v10.s(i12)) {
            setTitleTextColor(v10.c(i12));
        }
        int i13 = e.j.f9328x3;
        if (v10.s(i13)) {
            setSubtitleTextColor(v10.c(i13));
        }
        int i14 = e.j.f9298r3;
        if (v10.s(i14)) {
            y(v10.n(i14, 0));
        }
        v10.w();
    }

    private boolean A(View view) {
        return view.getParent() == this || this.f1170t4.contains(view);
    }

    private int E(View view, int i10, int[] iArr, int i11) {
        e eVar = (e) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - iArr[0];
        int max = i10 + Math.max(0, i12);
        iArr[0] = Math.max(0, -i12);
        int r10 = r(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, r10, max + measuredWidth, view.getMeasuredHeight() + r10);
        return max + measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
    }

    private int F(View view, int i10, int[] iArr, int i11) {
        e eVar = (e) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - iArr[1];
        int max = i10 - Math.max(0, i12);
        iArr[1] = Math.max(0, -i12);
        int r10 = r(view, i11);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, r10, max, view.getMeasuredHeight() + r10);
        return max - (measuredWidth + ((ViewGroup.MarginLayoutParams) eVar).leftMargin);
    }

    private int G(View view, int i10, int i11, int i12, int i13, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i14 = marginLayoutParams.leftMargin - iArr[0];
        int i15 = marginLayoutParams.rightMargin - iArr[1];
        int max = Math.max(0, i14) + Math.max(0, i15);
        iArr[0] = Math.max(0, -i14);
        iArr[1] = Math.max(0, -i15);
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + max + i11, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height));
        return view.getMeasuredWidth() + max;
    }

    private void H(View view, int i10, int i11, int i12, int i13, int i14) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i12, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i14 >= 0) {
            if (mode != 0) {
                i14 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i14);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void I() {
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f1172v4.b(getMenu(), getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f1173w4 = currentMenuItems2;
    }

    private void J() {
        removeCallbacks(this.F4);
        post(this.F4);
    }

    private boolean Q() {
        if (!this.E4) {
            return false;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (R(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean R(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    private void b(List<View> list, int i10) {
        boolean z10 = androidx.core.view.y.B(this) == 1;
        int childCount = getChildCount();
        int b10 = androidx.core.view.e.b(i10, androidx.core.view.y.B(this));
        list.clear();
        if (!z10) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                e eVar = (e) childAt.getLayoutParams();
                if (eVar.f1185b == 0 && R(childAt) && q(eVar.f706a) == b10) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i12 = childCount - 1; i12 >= 0; i12--) {
            View childAt2 = getChildAt(i12);
            e eVar2 = (e) childAt2.getLayoutParams();
            if (eVar2.f1185b == 0 && R(childAt2) && q(eVar2.f706a) == b10) {
                list.add(childAt2);
            }
        }
    }

    private void c(View view, boolean z10) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        e generateDefaultLayoutParams = layoutParams == null ? generateDefaultLayoutParams() : !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (e) layoutParams;
        generateDefaultLayoutParams.f1185b = 1;
        if (!z10 || this.X3 == null) {
            addView(view, generateDefaultLayoutParams);
            return;
        }
        view.setLayoutParams(generateDefaultLayoutParams);
        this.f1170t4.add(view);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i10 = 0; i10 < menu.size(); i10++) {
            arrayList.add(menu.getItem(i10));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new k.g(getContext());
    }

    private void h() {
        if (this.f1158i4 == null) {
            this.f1158i4 = new r0();
        }
    }

    private void i() {
        if (this.f1176y == null) {
            this.f1176y = new q(getContext());
        }
    }

    private void k() {
        l();
        if (this.f1150c.N() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f1150c.getMenu();
            if (this.B4 == null) {
                this.B4 = new d();
            }
            this.f1150c.setExpandedActionViewsExclusive(true);
            eVar.c(this.B4, this.Y3);
        }
    }

    private void l() {
        if (this.f1150c == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f1150c = actionMenuView;
            actionMenuView.setPopupTheme(this.Z3);
            this.f1150c.setOnMenuItemClickListener(this.f1177y4);
            this.f1150c.O(this.C4, this.D4);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f706a = 8388613 | (this.f1151c4 & 112);
            this.f1150c.setLayoutParams(generateDefaultLayoutParams);
            c(this.f1150c, false);
        }
    }

    private void m() {
        if (this.f1174x == null) {
            this.f1174x = new o(getContext(), null, e.a.N_res_0x7f03042c);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f706a = 8388611 | (this.f1151c4 & 112);
            this.f1174x.setLayoutParams(generateDefaultLayoutParams);
        }
    }

    private int q(int i10) {
        int B = androidx.core.view.y.B(this);
        int b10 = androidx.core.view.e.b(i10, B) & 7;
        return (b10 == 1 || b10 == 3 || b10 == 5) ? b10 : B == 1 ? 5 : 3;
    }

    private int r(View view, int i10) {
        e eVar = (e) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i11 = i10 > 0 ? (measuredHeight - i10) / 2 : 0;
        int s10 = s(eVar.f706a);
        if (s10 != 48) {
            if (s10 == 80) {
                return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) eVar).bottomMargin) - i11;
            }
            int paddingTop = getPaddingTop();
            int paddingBottom = getPaddingBottom();
            int height = getHeight();
            int i12 = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
            int i13 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
            if (i12 < i13) {
                i12 = i13;
            } else {
                int i14 = (((height - paddingBottom) - measuredHeight) - i12) - paddingTop;
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
                if (i14 < i15) {
                    i12 = Math.max(0, i12 - (i15 - i14));
                }
            }
            return paddingTop + i12;
        }
        return getPaddingTop() - i11;
    }

    private int s(int i10) {
        int i11 = i10 & 112;
        return (i11 == 16 || i11 == 48 || i11 == 80) ? i11 : this.f1161l4 & 112;
    }

    private int t(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return androidx.core.view.h.b(marginLayoutParams) + androidx.core.view.h.a(marginLayoutParams);
    }

    private int u(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private int v(List<View> list, int[] iArr) {
        int i10 = iArr[0];
        int i11 = iArr[1];
        int size = list.size();
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            View view = list.get(i12);
            e eVar = (e) view.getLayoutParams();
            int i14 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin - i10;
            int i15 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin - i11;
            int max = Math.max(0, i14);
            int max2 = Math.max(0, i15);
            int max3 = Math.max(0, -i14);
            int max4 = Math.max(0, -i15);
            i13 += max + view.getMeasuredWidth() + max2;
            i12++;
            i11 = max4;
            i10 = max3;
        }
        return i13;
    }

    public boolean B() {
        ActionMenuView actionMenuView = this.f1150c;
        return actionMenuView != null && actionMenuView.I();
    }

    @Override // androidx.core.view.i
    public void C(androidx.core.view.l lVar) {
        this.f1172v4.a(lVar);
    }

    public boolean D() {
        ActionMenuView actionMenuView = this.f1150c;
        return actionMenuView != null && actionMenuView.J();
    }

    void K() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((e) childAt.getLayoutParams()).f1185b != 2 && childAt != this.f1150c) {
                removeViewAt(childCount);
                this.f1170t4.add(childAt);
            }
        }
    }

    public void L(int i10, int i11) {
        h();
        this.f1158i4.g(i10, i11);
    }

    public void M(androidx.appcompat.view.menu.e eVar, androidx.appcompat.widget.c cVar) {
        if (eVar == null && this.f1150c == null) {
            return;
        }
        l();
        androidx.appcompat.view.menu.e N = this.f1150c.N();
        if (N == eVar) {
            return;
        }
        if (N != null) {
            N.O(this.A4);
            N.O(this.B4);
        }
        if (this.B4 == null) {
            this.B4 = new d();
        }
        cVar.G(true);
        if (eVar != null) {
            eVar.c(cVar, this.Y3);
            eVar.c(this.B4, this.Y3);
        } else {
            cVar.d(this.Y3, null);
            this.B4.d(this.Y3, null);
            cVar.f(true);
            this.B4.f(true);
        }
        this.f1150c.setPopupTheme(this.Z3);
        this.f1150c.setPresenter(cVar);
        this.A4 = cVar;
    }

    public void N(j.a aVar, e.a aVar2) {
        this.C4 = aVar;
        this.D4 = aVar2;
        ActionMenuView actionMenuView = this.f1150c;
        if (actionMenuView != null) {
            actionMenuView.O(aVar, aVar2);
        }
    }

    public void O(Context context, int i10) {
        this.f1149b4 = i10;
        TextView textView = this.f1166q;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public void P(Context context, int i10) {
        this.f1148a4 = i10;
        TextView textView = this.f1152d;
        if (textView != null) {
            textView.setTextAppearance(context, i10);
        }
    }

    public boolean S() {
        ActionMenuView actionMenuView = this.f1150c;
        return actionMenuView != null && actionMenuView.P();
    }

    void a() {
        for (int size = this.f1170t4.size() - 1; size >= 0; size--) {
            addView(this.f1170t4.get(size));
        }
        this.f1170t4.clear();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof e);
    }

    public boolean d() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f1150c) != null && actionMenuView.K();
    }

    public void e() {
        d dVar = this.B4;
        androidx.appcompat.view.menu.g gVar = dVar == null ? null : dVar.f1183d;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void f() {
        ActionMenuView actionMenuView = this.f1150c;
        if (actionMenuView != null) {
            actionMenuView.B();
        }
    }

    void g() {
        if (this.W3 == null) {
            o oVar = new o(getContext(), null, e.a.N_res_0x7f03042c);
            this.W3 = oVar;
            oVar.setImageDrawable(this.U3);
            this.W3.setContentDescription(this.V3);
            e generateDefaultLayoutParams = generateDefaultLayoutParams();
            generateDefaultLayoutParams.f706a = 8388611 | (this.f1151c4 & 112);
            generateDefaultLayoutParams.f1185b = 2;
            this.W3.setLayoutParams(generateDefaultLayoutParams);
            this.W3.setOnClickListener(new c());
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.W3;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.W3;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        r0 r0Var = this.f1158i4;
        if (r0Var != null) {
            return r0Var.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i10 = this.f1160k4;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        r0 r0Var = this.f1158i4;
        if (r0Var != null) {
            return r0Var.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        r0 r0Var = this.f1158i4;
        if (r0Var != null) {
            return r0Var.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        r0 r0Var = this.f1158i4;
        if (r0Var != null) {
            return r0Var.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i10 = this.f1159j4;
        return i10 != Integer.MIN_VALUE ? i10 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e N;
        ActionMenuView actionMenuView = this.f1150c;
        return actionMenuView != null && (N = actionMenuView.N()) != null && N.hasVisibleItems() ? Math.max(getContentInsetEnd(), Math.max(this.f1160k4, 0)) : getContentInsetEnd();
    }

    public int getCurrentContentInsetLeft() {
        return androidx.core.view.y.B(this) == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return androidx.core.view.y.B(this) == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f1159j4, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f1176y;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f1176y;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        k();
        return this.f1150c.getMenu();
    }

    View getNavButtonView() {
        return this.f1174x;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f1174x;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f1174x;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    androidx.appcompat.widget.c getOuterActionMenuPresenter() {
        return this.A4;
    }

    public Drawable getOverflowIcon() {
        k();
        return this.f1150c.getOverflowIcon();
    }

    Context getPopupContext() {
        return this.Y3;
    }

    public int getPopupTheme() {
        return this.Z3;
    }

    public CharSequence getSubtitle() {
        return this.f1163n4;
    }

    final TextView getSubtitleTextView() {
        return this.f1166q;
    }

    public CharSequence getTitle() {
        return this.f1162m4;
    }

    public int getTitleMarginBottom() {
        return this.f1157h4;
    }

    public int getTitleMarginEnd() {
        return this.f1155f4;
    }

    public int getTitleMarginStart() {
        return this.f1154e4;
    }

    public int getTitleMarginTop() {
        return this.f1156g4;
    }

    final TextView getTitleTextView() {
        return this.f1152d;
    }

    public g0 getWrapper() {
        if (this.f1178z4 == null) {
            this.f1178z4 = new c1(this, true);
        }
        return this.f1178z4;
    }

    @Override // androidx.core.view.i
    public void j(androidx.core.view.l lVar) {
        this.f1172v4.f(lVar);
    }

    /* renamed from: n */
    public e generateDefaultLayoutParams() {
        return new e(-2, -2);
    }

    /* renamed from: o */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.F4);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f1168r4 = false;
        }
        if (!this.f1168r4) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !onHoverEvent) {
                this.f1168r4 = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f1168r4 = false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0295 A[LOOP:0: B:108:0x0293->B:109:0x0295, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02b7 A[LOOP:1: B:111:0x02b5->B:112:0x02b7, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02f0 A[LOOP:2: B:119:0x02ee->B:120:0x02f0, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x021d  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onLayout(boolean r20, int r21, int r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 773
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int[] iArr = this.f1171u4;
        boolean b10 = h1.b(this);
        int i19 = 0;
        int i20 = !b10 ? 1 : 0;
        if (R(this.f1174x)) {
            H(this.f1174x, i10, 0, i11, 0, this.f1153d4);
            i14 = this.f1174x.getMeasuredWidth() + t(this.f1174x);
            i13 = Math.max(0, this.f1174x.getMeasuredHeight() + u(this.f1174x));
            i12 = View.combineMeasuredStates(0, this.f1174x.getMeasuredState());
        } else {
            i14 = 0;
            i13 = 0;
            i12 = 0;
        }
        if (R(this.W3)) {
            H(this.W3, i10, 0, i11, 0, this.f1153d4);
            i14 = this.W3.getMeasuredWidth() + t(this.W3);
            i13 = Math.max(i13, this.W3.getMeasuredHeight() + u(this.W3));
            i12 = View.combineMeasuredStates(i12, this.W3.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = 0 + Math.max(currentContentInsetStart, i14);
        iArr[b10 ? 1 : 0] = Math.max(0, currentContentInsetStart - i14);
        if (R(this.f1150c)) {
            H(this.f1150c, i10, max, i11, 0, this.f1153d4);
            i15 = this.f1150c.getMeasuredWidth() + t(this.f1150c);
            i13 = Math.max(i13, this.f1150c.getMeasuredHeight() + u(this.f1150c));
            i12 = View.combineMeasuredStates(i12, this.f1150c.getMeasuredState());
        } else {
            i15 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i15);
        iArr[i20] = Math.max(0, currentContentInsetEnd - i15);
        if (R(this.X3)) {
            max2 += G(this.X3, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.X3.getMeasuredHeight() + u(this.X3));
            i12 = View.combineMeasuredStates(i12, this.X3.getMeasuredState());
        }
        if (R(this.f1176y)) {
            max2 += G(this.f1176y, i10, max2, i11, 0, iArr);
            i13 = Math.max(i13, this.f1176y.getMeasuredHeight() + u(this.f1176y));
            i12 = View.combineMeasuredStates(i12, this.f1176y.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i21 = 0; i21 < childCount; i21++) {
            View childAt = getChildAt(i21);
            if (((e) childAt.getLayoutParams()).f1185b == 0 && R(childAt)) {
                max2 += G(childAt, i10, max2, i11, 0, iArr);
                i13 = Math.max(i13, childAt.getMeasuredHeight() + u(childAt));
                i12 = View.combineMeasuredStates(i12, childAt.getMeasuredState());
            }
        }
        int i22 = this.f1156g4 + this.f1157h4;
        int i23 = this.f1154e4 + this.f1155f4;
        if (R(this.f1152d)) {
            G(this.f1152d, i10, max2 + i23, i11, i22, iArr);
            int measuredWidth = this.f1152d.getMeasuredWidth() + t(this.f1152d);
            i16 = this.f1152d.getMeasuredHeight() + u(this.f1152d);
            i18 = View.combineMeasuredStates(i12, this.f1152d.getMeasuredState());
            i17 = measuredWidth;
        } else {
            i16 = 0;
            i18 = i12;
            i17 = 0;
        }
        if (R(this.f1166q)) {
            i17 = Math.max(i17, G(this.f1166q, i10, max2 + i23, i11, i16 + i22, iArr));
            i16 += this.f1166q.getMeasuredHeight() + u(this.f1166q);
            i18 = View.combineMeasuredStates(i18, this.f1166q.getMeasuredState());
        }
        int max3 = Math.max(i13, i16);
        int paddingLeft = max2 + i17 + getPaddingLeft() + getPaddingRight();
        int paddingTop = max3 + getPaddingTop() + getPaddingBottom();
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, (-16777216) & i18);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, i18 << 16);
        if (!Q()) {
            i19 = resolveSizeAndState2;
        }
        setMeasuredDimension(resolveSizeAndState, i19);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem findItem;
        if (!(parcelable instanceof g)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        g gVar = (g) parcelable;
        super.onRestoreInstanceState(gVar.a());
        ActionMenuView actionMenuView = this.f1150c;
        androidx.appcompat.view.menu.e N = actionMenuView != null ? actionMenuView.N() : null;
        int i10 = gVar.f1186q;
        if (i10 != 0 && this.B4 != null && N != null && (findItem = N.findItem(i10)) != null) {
            findItem.expandActionView();
        }
        if (!gVar.f1187x) {
            return;
        }
        J();
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        h();
        r0 r0Var = this.f1158i4;
        boolean z10 = true;
        if (i10 != 1) {
            z10 = false;
        }
        r0Var.f(z10);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        g gVar2 = new g(super.onSaveInstanceState());
        d dVar = this.B4;
        if (dVar != null && (gVar = dVar.f1183d) != null) {
            gVar2.f1186q = gVar.getItemId();
        }
        gVar2.f1187x = D();
        return gVar2;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f1167q4 = false;
        }
        if (!this.f1167q4) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !onTouchEvent) {
                this.f1167q4 = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f1167q4 = false;
        }
        return true;
    }

    /* renamed from: p */
    public e generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e ? new e((e) layoutParams) : layoutParams instanceof a.C0013a ? new e((a.C0013a) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    public void setCollapseContentDescription(int i10) {
        setCollapseContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            g();
        }
        ImageButton imageButton = this.W3;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(int i10) {
        setCollapseIcon(g.a.b(getContext(), i10));
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            g();
            this.W3.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.W3;
        if (imageButton == null) {
            return;
        }
        imageButton.setImageDrawable(this.U3);
    }

    public void setCollapsible(boolean z10) {
        this.E4 = z10;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f1160k4) {
            this.f1160k4 = i10;
            if (getNavigationIcon() == null) {
                return;
            }
            requestLayout();
        }
    }

    public void setContentInsetStartWithNavigation(int i10) {
        if (i10 < 0) {
            i10 = Integer.MIN_VALUE;
        }
        if (i10 != this.f1159j4) {
            this.f1159j4 = i10;
            if (getNavigationIcon() == null) {
                return;
            }
            requestLayout();
        }
    }

    public void setLogo(int i10) {
        setLogo(g.a.b(getContext(), i10));
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            i();
            if (!A(this.f1176y)) {
                c(this.f1176y, true);
            }
        } else {
            ImageView imageView = this.f1176y;
            if (imageView != null && A(imageView)) {
                removeView(this.f1176y);
                this.f1170t4.remove(this.f1176y);
            }
        }
        ImageView imageView2 = this.f1176y;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(int i10) {
        setLogoDescription(getContext().getText(i10));
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            i();
        }
        ImageView imageView = this.f1176y;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(int i10) {
        setNavigationContentDescription(i10 != 0 ? getContext().getText(i10) : null);
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m();
        }
        ImageButton imageButton = this.f1174x;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            d1.a(this.f1174x, charSequence);
        }
    }

    public void setNavigationIcon(int i10) {
        setNavigationIcon(g.a.b(getContext(), i10));
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m();
            if (!A(this.f1174x)) {
                c(this.f1174x, true);
            }
        } else {
            ImageButton imageButton = this.f1174x;
            if (imageButton != null && A(imageButton)) {
                removeView(this.f1174x);
                this.f1170t4.remove(this.f1174x);
            }
        }
        ImageButton imageButton2 = this.f1174x;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m();
        this.f1174x.setOnClickListener(onClickListener);
    }

    public void setOnMenuItemClickListener(f fVar) {
        this.f1175x4 = fVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        k();
        this.f1150c.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i10) {
        if (this.Z3 != i10) {
            this.Z3 = i10;
            if (i10 == 0) {
                this.Y3 = getContext();
            } else {
                this.Y3 = new ContextThemeWrapper(getContext(), i10);
            }
        }
    }

    public void setSubtitle(int i10) {
        setSubtitle(getContext().getText(i10));
    }

    public void setSubtitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1166q == null) {
                Context context = getContext();
                c0 c0Var = new c0(context);
                this.f1166q = c0Var;
                c0Var.setSingleLine();
                this.f1166q.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1149b4;
                if (i10 != 0) {
                    this.f1166q.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f1165p4;
                if (colorStateList != null) {
                    this.f1166q.setTextColor(colorStateList);
                }
            }
            if (!A(this.f1166q)) {
                c(this.f1166q, true);
            }
        } else {
            TextView textView = this.f1166q;
            if (textView != null && A(textView)) {
                removeView(this.f1166q);
                this.f1170t4.remove(this.f1166q);
            }
        }
        TextView textView2 = this.f1166q;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1163n4 = charSequence;
    }

    public void setSubtitleTextColor(int i10) {
        setSubtitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f1165p4 = colorStateList;
        TextView textView = this.f1166q;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(int i10) {
        setTitle(getContext().getText(i10));
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            if (this.f1152d == null) {
                Context context = getContext();
                c0 c0Var = new c0(context);
                this.f1152d = c0Var;
                c0Var.setSingleLine();
                this.f1152d.setEllipsize(TextUtils.TruncateAt.END);
                int i10 = this.f1148a4;
                if (i10 != 0) {
                    this.f1152d.setTextAppearance(context, i10);
                }
                ColorStateList colorStateList = this.f1164o4;
                if (colorStateList != null) {
                    this.f1152d.setTextColor(colorStateList);
                }
            }
            if (!A(this.f1152d)) {
                c(this.f1152d, true);
            }
        } else {
            TextView textView = this.f1152d;
            if (textView != null && A(textView)) {
                removeView(this.f1152d);
                this.f1170t4.remove(this.f1152d);
            }
        }
        TextView textView2 = this.f1152d;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f1162m4 = charSequence;
    }

    public void setTitleMarginBottom(int i10) {
        this.f1157h4 = i10;
        requestLayout();
    }

    public void setTitleMarginEnd(int i10) {
        this.f1155f4 = i10;
        requestLayout();
    }

    public void setTitleMarginStart(int i10) {
        this.f1154e4 = i10;
        requestLayout();
    }

    public void setTitleMarginTop(int i10) {
        this.f1156g4 = i10;
        requestLayout();
    }

    public void setTitleTextColor(int i10) {
        setTitleTextColor(ColorStateList.valueOf(i10));
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f1164o4 = colorStateList;
        TextView textView = this.f1152d;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public boolean w() {
        d dVar = this.B4;
        return (dVar == null || dVar.f1183d == null) ? false : true;
    }

    public boolean x() {
        ActionMenuView actionMenuView = this.f1150c;
        return actionMenuView != null && actionMenuView.H();
    }

    public void y(int i10) {
        getMenuInflater().inflate(i10, getMenu());
    }

    public void z() {
        Iterator<MenuItem> it = this.f1173w4.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(it.next().getItemId());
        }
        I();
    }
}
