package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import b.g.l.c0.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.List;
/* loaded from: classes.dex */
public class StaggeredGridLayoutManager extends RecyclerView.o implements RecyclerView.z.b {
    private BitSet B;
    private boolean G;
    private boolean H;
    private e I;
    private int J;
    private int[] O;
    f[] t;
    q u;
    q v;
    private int w;
    private int x;
    private int s = -1;
    boolean z = false;
    boolean A = false;
    int C = -1;
    int D = Integer.MIN_VALUE;
    d E = new d();
    private int F = 2;
    private final Rect K = new Rect();
    private final b L = new b();
    private boolean M = false;
    private boolean N = true;
    private final Runnable P = new a();
    private final l y = new l();

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
            StaggeredGridLayoutManager.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.T1();
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a */
        int f1622a;

        /* renamed from: b */
        int f1623b;

        /* renamed from: c */
        boolean f1624c;

        /* renamed from: d */
        boolean f1625d;

        /* renamed from: e */
        boolean f1626e;

        /* renamed from: f */
        int[] f1627f;

        b() {
            StaggeredGridLayoutManager.this = r1;
            c();
        }

        void a() {
            this.f1623b = this.f1624c ? StaggeredGridLayoutManager.this.u.i() : StaggeredGridLayoutManager.this.u.m();
        }

        void b(int i) {
            this.f1623b = this.f1624c ? StaggeredGridLayoutManager.this.u.i() - i : StaggeredGridLayoutManager.this.u.m() + i;
        }

        void c() {
            this.f1622a = -1;
            this.f1623b = Integer.MIN_VALUE;
            this.f1624c = false;
            this.f1625d = false;
            this.f1626e = false;
            int[] iArr = this.f1627f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f1627f;
            if (iArr == null || iArr.length < length) {
                this.f1627f = new int[StaggeredGridLayoutManager.this.t.length];
            }
            for (int i = 0; i < length; i++) {
                this.f1627f[i] = fVarArr[i].p(Integer.MIN_VALUE);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends RecyclerView.p {

        /* renamed from: e */
        f f1629e;

        /* renamed from: f */
        boolean f1630f;

        public c(int i, int i2) {
            super(i, i2);
        }

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public final int e() {
            f fVar = this.f1629e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f1648e;
        }

        public boolean f() {
            return this.f1630f;
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        int[] f1631a;

        /* renamed from: b */
        List<a> f1632b;

        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0026a();

            /* renamed from: b */
            int f1633b;

            /* renamed from: c */
            int f1634c;

            /* renamed from: d */
            int[] f1635d;

            /* renamed from: e */
            boolean f1636e;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a */
            /* loaded from: classes.dex */
            static class C0026a implements Parcelable.Creator<a> {
                C0026a() {
                }

                /* renamed from: a */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                /* renamed from: b */
                public a[] newArray(int i) {
                    return new a[i];
                }
            }

            a() {
            }

            a(Parcel parcel) {
                this.f1633b = parcel.readInt();
                this.f1634c = parcel.readInt();
                this.f1636e = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f1635d = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            int a(int i) {
                int[] iArr = this.f1635d;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f1633b + ", mGapDir=" + this.f1634c + ", mHasUnwantedGapAfter=" + this.f1636e + ", mGapPerSpan=" + Arrays.toString(this.f1635d) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f1633b);
                parcel.writeInt(this.f1634c);
                parcel.writeInt(this.f1636e ? 1 : 0);
                int[] iArr = this.f1635d;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f1635d);
            }
        }

        d() {
        }

        private int i(int i) {
            if (this.f1632b == null) {
                return -1;
            }
            a f2 = f(i);
            if (f2 != null) {
                this.f1632b.remove(f2);
            }
            int size = this.f1632b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.f1632b.get(i2).f1633b >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.f1632b.remove(i2);
            return this.f1632b.get(i2).f1633b;
        }

        private void l(int i, int i2) {
            List<a> list = this.f1632b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f1632b.get(size);
                int i3 = aVar.f1633b;
                if (i3 >= i) {
                    aVar.f1633b = i3 + i2;
                }
            }
        }

        private void m(int i, int i2) {
            List<a> list = this.f1632b;
            if (list == null) {
                return;
            }
            int i3 = i + i2;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f1632b.get(size);
                int i4 = aVar.f1633b;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.f1632b.remove(size);
                    } else {
                        aVar.f1633b = i4 - i2;
                    }
                }
            }
        }

        public void a(a aVar) {
            if (this.f1632b == null) {
                this.f1632b = new ArrayList();
            }
            int size = this.f1632b.size();
            for (int i = 0; i < size; i++) {
                a aVar2 = this.f1632b.get(i);
                if (aVar2.f1633b == aVar.f1633b) {
                    this.f1632b.remove(i);
                }
                if (aVar2.f1633b >= aVar.f1633b) {
                    this.f1632b.add(i, aVar);
                    return;
                }
            }
            this.f1632b.add(aVar);
        }

        void b() {
            int[] iArr = this.f1631a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f1632b = null;
        }

        void c(int i) {
            int[] iArr = this.f1631a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.f1631a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i < iArr.length) {
            } else {
                int[] iArr3 = new int[o(i)];
                this.f1631a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f1631a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int d(int i) {
            List<a> list = this.f1632b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f1632b.get(size).f1633b >= i) {
                        this.f1632b.remove(size);
                    }
                }
            }
            return h(i);
        }

        public a e(int i, int i2, int i3, boolean z) {
            List<a> list = this.f1632b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                a aVar = this.f1632b.get(i4);
                int i5 = aVar.f1633b;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || aVar.f1634c == i3 || (z && aVar.f1636e))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i) {
            List<a> list = this.f1632b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f1632b.get(size);
                if (aVar.f1633b == i) {
                    return aVar;
                }
            }
            return null;
        }

        int g(int i) {
            int[] iArr = this.f1631a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        int h(int i) {
            int[] iArr = this.f1631a;
            if (iArr != null && i < iArr.length) {
                int i2 = i(i);
                if (i2 == -1) {
                    int[] iArr2 = this.f1631a;
                    Arrays.fill(iArr2, i, iArr2.length, -1);
                    return this.f1631a.length;
                }
                int i3 = i2 + 1;
                Arrays.fill(this.f1631a, i, i3, -1);
                return i3;
            }
            return -1;
        }

        void j(int i, int i2) {
            int[] iArr = this.f1631a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            c(i3);
            int[] iArr2 = this.f1631a;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.f1631a, i, i3, -1);
            l(i, i2);
        }

        void k(int i, int i2) {
            int[] iArr = this.f1631a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            c(i3);
            int[] iArr2 = this.f1631a;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.f1631a;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            m(i, i2);
        }

        void n(int i, f fVar) {
            c(i);
            this.f1631a[i] = fVar.f1648e;
        }

        int o(int i) {
            int length = this.f1631a.length;
            while (length <= i) {
                length *= 2;
            }
            return length;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* renamed from: b */
        int f1637b;

        /* renamed from: c */
        int f1638c;

        /* renamed from: d */
        int f1639d;

        /* renamed from: e */
        int[] f1640e;

        /* renamed from: f */
        int f1641f;

        /* renamed from: g */
        int[] f1642g;

        /* renamed from: h */
        List<d.a> f1643h;
        boolean i;
        boolean j;
        boolean k;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<e> {
            a() {
            }

            /* renamed from: a */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            /* renamed from: b */
            public e[] newArray(int i) {
                return new e[i];
            }
        }

        public e() {
        }

        e(Parcel parcel) {
            this.f1637b = parcel.readInt();
            this.f1638c = parcel.readInt();
            int readInt = parcel.readInt();
            this.f1639d = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f1640e = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f1641f = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.f1642g = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.i = parcel.readInt() == 1;
            this.j = parcel.readInt() == 1;
            this.k = parcel.readInt() == 1 ? true : z;
            this.f1643h = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f1639d = eVar.f1639d;
            this.f1637b = eVar.f1637b;
            this.f1638c = eVar.f1638c;
            this.f1640e = eVar.f1640e;
            this.f1641f = eVar.f1641f;
            this.f1642g = eVar.f1642g;
            this.i = eVar.i;
            this.j = eVar.j;
            this.k = eVar.k;
            this.f1643h = eVar.f1643h;
        }

        void a() {
            this.f1640e = null;
            this.f1639d = 0;
            this.f1637b = -1;
            this.f1638c = -1;
        }

        void c() {
            this.f1640e = null;
            this.f1639d = 0;
            this.f1641f = 0;
            this.f1642g = null;
            this.f1643h = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1637b);
            parcel.writeInt(this.f1638c);
            parcel.writeInt(this.f1639d);
            if (this.f1639d > 0) {
                parcel.writeIntArray(this.f1640e);
            }
            parcel.writeInt(this.f1641f);
            if (this.f1641f > 0) {
                parcel.writeIntArray(this.f1642g);
            }
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeInt(this.k ? 1 : 0);
            parcel.writeList(this.f1643h);
        }
    }

    /* loaded from: classes.dex */
    public class f {

        /* renamed from: a */
        ArrayList<View> f1644a = new ArrayList<>();

        /* renamed from: b */
        int f1645b = Integer.MIN_VALUE;

        /* renamed from: c */
        int f1646c = Integer.MIN_VALUE;

        /* renamed from: d */
        int f1647d = 0;

        /* renamed from: e */
        final int f1648e;

        f(int i) {
            StaggeredGridLayoutManager.this = r1;
            this.f1648e = i;
        }

        void a(View view) {
            c n = n(view);
            n.f1629e = this;
            this.f1644a.add(view);
            this.f1646c = Integer.MIN_VALUE;
            if (this.f1644a.size() == 1) {
                this.f1645b = Integer.MIN_VALUE;
            }
            if (n.c() || n.b()) {
                this.f1647d += StaggeredGridLayoutManager.this.u.e(view);
            }
        }

        void b(boolean z, int i) {
            int l = z ? l(Integer.MIN_VALUE) : p(Integer.MIN_VALUE);
            e();
            if (l == Integer.MIN_VALUE) {
                return;
            }
            if (z && l < StaggeredGridLayoutManager.this.u.i()) {
                return;
            }
            if (!z && l > StaggeredGridLayoutManager.this.u.m()) {
                return;
            }
            if (i != Integer.MIN_VALUE) {
                l += i;
            }
            this.f1646c = l;
            this.f1645b = l;
        }

        void c() {
            d.a f2;
            ArrayList<View> arrayList = this.f1644a;
            View view = arrayList.get(arrayList.size() - 1);
            c n = n(view);
            this.f1646c = StaggeredGridLayoutManager.this.u.d(view);
            if (!n.f1630f || (f2 = StaggeredGridLayoutManager.this.E.f(n.a())) == null || f2.f1634c != 1) {
                return;
            }
            this.f1646c += f2.a(this.f1648e);
        }

        void d() {
            d.a f2;
            View view = this.f1644a.get(0);
            c n = n(view);
            this.f1645b = StaggeredGridLayoutManager.this.u.g(view);
            if (!n.f1630f || (f2 = StaggeredGridLayoutManager.this.E.f(n.a())) == null || f2.f1634c != -1) {
                return;
            }
            this.f1645b -= f2.a(this.f1648e);
        }

        void e() {
            this.f1644a.clear();
            q();
            this.f1647d = 0;
        }

        public int f() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.z) {
                i2 = this.f1644a.size() - 1;
                i = -1;
            } else {
                i2 = 0;
                i = this.f1644a.size();
            }
            return i(i2, i, true);
        }

        public int g() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.z) {
                i2 = 0;
                i = this.f1644a.size();
            } else {
                i2 = this.f1644a.size() - 1;
                i = -1;
            }
            return i(i2, i, true);
        }

        int h(int i, int i2, boolean z, boolean z2, boolean z3) {
            int m = StaggeredGridLayoutManager.this.u.m();
            int i3 = StaggeredGridLayoutManager.this.u.i();
            int i4 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f1644a.get(i);
                int g2 = StaggeredGridLayoutManager.this.u.g(view);
                int d2 = StaggeredGridLayoutManager.this.u.d(view);
                boolean z4 = false;
                boolean z5 = !z3 ? g2 < i3 : g2 <= i3;
                if (!z3 ? d2 > m : d2 >= m) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (!z2 && g2 >= m && d2 <= i3) {
                        }
                        return StaggeredGridLayoutManager.this.i0(view);
                    } else if (g2 >= m && d2 <= i3) {
                        return StaggeredGridLayoutManager.this.i0(view);
                    }
                }
                i += i4;
            }
            return -1;
        }

        int i(int i, int i2, boolean z) {
            return h(i, i2, false, false, z);
        }

        public int j() {
            return this.f1647d;
        }

        int k() {
            int i = this.f1646c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            c();
            return this.f1646c;
        }

        int l(int i) {
            int i2 = this.f1646c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f1644a.size() == 0) {
                return i;
            }
            c();
            return this.f1646c;
        }

        public View m(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f1644a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f1644a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.z && staggeredGridLayoutManager.i0(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.z && staggeredGridLayoutManager2.i0(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f1644a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f1644a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.z && staggeredGridLayoutManager3.i0(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.z && staggeredGridLayoutManager4.i0(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        c n(View view) {
            return (c) view.getLayoutParams();
        }

        int o() {
            int i = this.f1645b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            d();
            return this.f1645b;
        }

        int p(int i) {
            int i2 = this.f1645b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f1644a.size() == 0) {
                return i;
            }
            d();
            return this.f1645b;
        }

        void q() {
            this.f1645b = Integer.MIN_VALUE;
            this.f1646c = Integer.MIN_VALUE;
        }

        void r(int i) {
            int i2 = this.f1645b;
            if (i2 != Integer.MIN_VALUE) {
                this.f1645b = i2 + i;
            }
            int i3 = this.f1646c;
            if (i3 != Integer.MIN_VALUE) {
                this.f1646c = i3 + i;
            }
        }

        void s() {
            int size = this.f1644a.size();
            View remove = this.f1644a.remove(size - 1);
            c n = n(remove);
            n.f1629e = null;
            if (n.c() || n.b()) {
                this.f1647d -= StaggeredGridLayoutManager.this.u.e(remove);
            }
            if (size == 1) {
                this.f1645b = Integer.MIN_VALUE;
            }
            this.f1646c = Integer.MIN_VALUE;
        }

        void t() {
            View remove = this.f1644a.remove(0);
            c n = n(remove);
            n.f1629e = null;
            if (this.f1644a.size() == 0) {
                this.f1646c = Integer.MIN_VALUE;
            }
            if (n.c() || n.b()) {
                this.f1647d -= StaggeredGridLayoutManager.this.u.e(remove);
            }
            this.f1645b = Integer.MIN_VALUE;
        }

        void u(View view) {
            c n = n(view);
            n.f1629e = this;
            this.f1644a.add(0, view);
            this.f1645b = Integer.MIN_VALUE;
            if (this.f1644a.size() == 1) {
                this.f1646c = Integer.MIN_VALUE;
            }
            if (n.c() || n.b()) {
                this.f1647d += StaggeredGridLayoutManager.this.u.e(view);
            }
        }

        void v(int i) {
            this.f1645b = i;
            this.f1646c = i;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.o.d j0 = RecyclerView.o.j0(context, attributeSet, i, i2);
        I2(j0.f1582a);
        K2(j0.f1583b);
        J2(j0.f1584c);
        b2();
    }

    private void A2(View view) {
        for (int i = this.s - 1; i >= 0; i--) {
            this.t[i].u(view);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0010, code lost:
        if (r4.f1796e == (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void B2(androidx.recyclerview.widget.RecyclerView.v r3, androidx.recyclerview.widget.l r4) {
        /*
            r2 = this;
            boolean r0 = r4.f1792a
            if (r0 == 0) goto L4d
            boolean r0 = r4.i
            if (r0 == 0) goto L9
            goto L4d
        L9:
            int r0 = r4.f1793b
            r1 = -1
            if (r0 != 0) goto L1e
            int r0 = r4.f1796e
            if (r0 != r1) goto L18
        L12:
            int r4 = r4.f1798g
        L14:
            r2.C2(r3, r4)
            goto L4d
        L18:
            int r4 = r4.f1797f
        L1a:
            r2.D2(r3, r4)
            goto L4d
        L1e:
            int r0 = r4.f1796e
            if (r0 != r1) goto L37
            int r0 = r4.f1797f
            int r1 = r2.n2(r0)
            int r0 = r0 - r1
            if (r0 >= 0) goto L2c
            goto L12
        L2c:
            int r1 = r4.f1798g
            int r4 = r4.f1793b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
            goto L14
        L37:
            int r0 = r4.f1798g
            int r0 = r2.o2(r0)
            int r1 = r4.f1798g
            int r0 = r0 - r1
            if (r0 >= 0) goto L43
            goto L18
        L43:
            int r1 = r4.f1797f
            int r4 = r4.f1793b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
            goto L1a
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.B2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.l):void");
    }

    private void C2(RecyclerView.v vVar, int i) {
        for (int K = K() - 1; K >= 0; K--) {
            View J = J(K);
            if (this.u.g(J) < i || this.u.q(J) < i) {
                return;
            }
            c cVar = (c) J.getLayoutParams();
            if (cVar.f1630f) {
                for (int i2 = 0; i2 < this.s; i2++) {
                    if (this.t[i2].f1644a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.s; i3++) {
                    this.t[i3].s();
                }
            } else if (cVar.f1629e.f1644a.size() == 1) {
                return;
            } else {
                cVar.f1629e.s();
            }
            n1(J, vVar);
        }
    }

    private void D2(RecyclerView.v vVar, int i) {
        while (K() > 0) {
            View J = J(0);
            if (this.u.d(J) > i || this.u.p(J) > i) {
                return;
            }
            c cVar = (c) J.getLayoutParams();
            if (cVar.f1630f) {
                for (int i2 = 0; i2 < this.s; i2++) {
                    if (this.t[i2].f1644a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.s; i3++) {
                    this.t[i3].t();
                }
            } else if (cVar.f1629e.f1644a.size() == 1) {
                return;
            } else {
                cVar.f1629e.t();
            }
            n1(J, vVar);
        }
    }

    private void E2() {
        if (this.v.k() == 1073741824) {
            return;
        }
        float f2 = 0.0f;
        int K = K();
        for (int i = 0; i < K; i++) {
            View J = J(i);
            float e2 = this.v.e(J);
            if (e2 >= f2) {
                if (((c) J.getLayoutParams()).f()) {
                    e2 = (e2 * 1.0f) / this.s;
                }
                f2 = Math.max(f2, e2);
            }
        }
        int i2 = this.x;
        int round = Math.round(f2 * this.s);
        if (this.v.k() == Integer.MIN_VALUE) {
            round = Math.min(round, this.v.n());
        }
        Q2(round);
        if (this.x == i2) {
            return;
        }
        for (int i3 = 0; i3 < K; i3++) {
            View J2 = J(i3);
            c cVar = (c) J2.getLayoutParams();
            if (!cVar.f1630f) {
                if (!u2() || this.w != 1) {
                    int i4 = cVar.f1629e.f1648e;
                    int i5 = this.w;
                    int i6 = (this.x * i4) - (i4 * i2);
                    if (i5 == 1) {
                        J2.offsetLeftAndRight(i6);
                    } else {
                        J2.offsetTopAndBottom(i6);
                    }
                } else {
                    int i7 = this.s;
                    int i8 = cVar.f1629e.f1648e;
                    J2.offsetLeftAndRight(((-((i7 - 1) - i8)) * this.x) - ((-((i7 - 1) - i8)) * i2));
                }
            }
        }
    }

    private void F2() {
        this.A = (this.w == 1 || !u2()) ? this.z : !this.z;
    }

    private void H2(int i) {
        l lVar = this.y;
        lVar.f1796e = i;
        int i2 = 1;
        if (this.A != (i == -1)) {
            i2 = -1;
        }
        lVar.f1795d = i2;
    }

    private void L2(int i, int i2) {
        for (int i3 = 0; i3 < this.s; i3++) {
            if (!this.t[i3].f1644a.isEmpty()) {
                R2(this.t[i3], i, i2);
            }
        }
    }

    private boolean M2(RecyclerView.a0 a0Var, b bVar) {
        boolean z = this.G;
        int b2 = a0Var.b();
        bVar.f1622a = z ? h2(b2) : d2(b2);
        bVar.f1623b = Integer.MIN_VALUE;
        return true;
    }

    private void N1(View view) {
        for (int i = this.s - 1; i >= 0; i--) {
            this.t[i].a(view);
        }
    }

    private void O1(b bVar) {
        boolean z;
        e eVar = this.I;
        int i = eVar.f1639d;
        if (i > 0) {
            if (i == this.s) {
                for (int i2 = 0; i2 < this.s; i2++) {
                    this.t[i2].e();
                    e eVar2 = this.I;
                    int i3 = eVar2.f1640e[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        i3 += eVar2.j ? this.u.i() : this.u.m();
                    }
                    this.t[i2].v(i3);
                }
            } else {
                eVar.c();
                e eVar3 = this.I;
                eVar3.f1637b = eVar3.f1638c;
            }
        }
        e eVar4 = this.I;
        this.H = eVar4.k;
        J2(eVar4.i);
        F2();
        e eVar5 = this.I;
        int i4 = eVar5.f1637b;
        if (i4 != -1) {
            this.C = i4;
            z = eVar5.j;
        } else {
            z = this.A;
        }
        bVar.f1624c = z;
        if (eVar5.f1641f > 1) {
            d dVar = this.E;
            dVar.f1631a = eVar5.f1642g;
            dVar.f1632b = eVar5.f1643h;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void P2(int r5, androidx.recyclerview.widget.RecyclerView.a0 r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.l r0 = r4.y
            r1 = 0
            r0.f1793b = r1
            r0.f1794c = r5
            boolean r0 = r4.y0()
            r2 = 1
            if (r0 == 0) goto L2e
            int r6 = r6.c()
            r0 = -1
            if (r6 == r0) goto L2e
            boolean r0 = r4.A
            if (r6 >= r5) goto L1b
            r5 = 1
            goto L1c
        L1b:
            r5 = 0
        L1c:
            if (r0 != r5) goto L25
            androidx.recyclerview.widget.q r5 = r4.u
            int r5 = r5.n()
            goto L2f
        L25:
            androidx.recyclerview.widget.q r5 = r4.u
            int r5 = r5.n()
            r6 = r5
            r5 = 0
            goto L30
        L2e:
            r5 = 0
        L2f:
            r6 = 0
        L30:
            boolean r0 = r4.N()
            if (r0 == 0) goto L4d
            androidx.recyclerview.widget.l r0 = r4.y
            androidx.recyclerview.widget.q r3 = r4.u
            int r3 = r3.m()
            int r3 = r3 - r6
            r0.f1797f = r3
            androidx.recyclerview.widget.l r6 = r4.y
            androidx.recyclerview.widget.q r0 = r4.u
            int r0 = r0.i()
            int r0 = r0 + r5
            r6.f1798g = r0
            goto L5d
        L4d:
            androidx.recyclerview.widget.l r0 = r4.y
            androidx.recyclerview.widget.q r3 = r4.u
            int r3 = r3.h()
            int r3 = r3 + r5
            r0.f1798g = r3
            androidx.recyclerview.widget.l r5 = r4.y
            int r6 = -r6
            r5.f1797f = r6
        L5d:
            androidx.recyclerview.widget.l r5 = r4.y
            r5.f1799h = r1
            r5.f1792a = r2
            androidx.recyclerview.widget.q r6 = r4.u
            int r6 = r6.k()
            if (r6 != 0) goto L74
            androidx.recyclerview.widget.q r6 = r4.u
            int r6 = r6.h()
            if (r6 != 0) goto L74
            r1 = 1
        L74:
            r5.i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.P2(int, androidx.recyclerview.widget.RecyclerView$a0):void");
    }

    private void R1(View view, c cVar, l lVar) {
        if (lVar.f1796e == 1) {
            if (cVar.f1630f) {
                N1(view);
            } else {
                cVar.f1629e.a(view);
            }
        } else if (cVar.f1630f) {
            A2(view);
        } else {
            cVar.f1629e.u(view);
        }
    }

    private void R2(f fVar, int i, int i2) {
        int j = fVar.j();
        if (i == -1) {
            if (fVar.o() + j > i2) {
                return;
            }
        } else if (fVar.k() - j < i2) {
            return;
        }
        this.B.set(fVar.f1648e, false);
    }

    private int S1(int i) {
        if (K() == 0) {
            return this.A ? 1 : -1;
        }
        return (i < k2()) != this.A ? -1 : 1;
    }

    private int S2(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    private boolean U1(f fVar) {
        if (this.A) {
            if (fVar.k() < this.u.i()) {
                ArrayList<View> arrayList = fVar.f1644a;
                return !fVar.n(arrayList.get(arrayList.size() - 1)).f1630f;
            }
        } else if (fVar.o() > this.u.m()) {
            return !fVar.n(fVar.f1644a.get(0)).f1630f;
        }
        return false;
    }

    private int V1(RecyclerView.a0 a0Var) {
        if (K() == 0) {
            return 0;
        }
        return s.a(a0Var, this.u, f2(!this.N), e2(!this.N), this, this.N);
    }

    private int W1(RecyclerView.a0 a0Var) {
        if (K() == 0) {
            return 0;
        }
        return s.b(a0Var, this.u, f2(!this.N), e2(!this.N), this, this.N, this.A);
    }

    private int X1(RecyclerView.a0 a0Var) {
        if (K() == 0) {
            return 0;
        }
        return s.c(a0Var, this.u, f2(!this.N), e2(!this.N), this, this.N);
    }

    private int Y1(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.w == 1) ? 1 : Integer.MIN_VALUE : this.w == 0 ? 1 : Integer.MIN_VALUE : this.w == 1 ? -1 : Integer.MIN_VALUE : this.w == 0 ? -1 : Integer.MIN_VALUE : (this.w != 1 && u2()) ? -1 : 1 : (this.w != 1 && u2()) ? 1 : -1;
    }

    private d.a Z1(int i) {
        d.a aVar = new d.a();
        aVar.f1635d = new int[this.s];
        for (int i2 = 0; i2 < this.s; i2++) {
            aVar.f1635d[i2] = i - this.t[i2].l(i);
        }
        return aVar;
    }

    private d.a a2(int i) {
        d.a aVar = new d.a();
        aVar.f1635d = new int[this.s];
        for (int i2 = 0; i2 < this.s; i2++) {
            aVar.f1635d[i2] = this.t[i2].p(i) - i;
        }
        return aVar;
    }

    private void b2() {
        this.u = q.b(this, this.w);
        this.v = q.b(this, 1 - this.w);
    }

    private int c2(RecyclerView.v vVar, l lVar, RecyclerView.a0 a0Var) {
        int i;
        f fVar;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        View view;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        boolean z = false;
        this.B.set(0, this.s, true);
        if (this.y.i) {
            i = lVar.f1796e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
        } else {
            i = lVar.f1796e == 1 ? lVar.f1798g + lVar.f1793b : lVar.f1797f - lVar.f1793b;
        }
        L2(lVar.f1796e, i);
        int i8 = this.A ? this.u.i() : this.u.m();
        boolean z2 = false;
        while (lVar.a(a0Var) && (this.y.i || !this.B.isEmpty())) {
            View b2 = lVar.b(vVar);
            c cVar = (c) b2.getLayoutParams();
            int a2 = cVar.a();
            int g2 = this.E.g(a2);
            boolean z3 = g2 == -1;
            if (z3) {
                if (cVar.f1630f) {
                    f[] fVarArr = this.t;
                    char c2 = z ? 1 : 0;
                    char c3 = z ? 1 : 0;
                    fVar = fVarArr[c2];
                } else {
                    fVar = q2(lVar);
                }
                this.E.n(a2, fVar);
            } else {
                fVar = this.t[g2];
            }
            f fVar2 = fVar;
            cVar.f1629e = fVar2;
            if (lVar.f1796e == 1) {
                e(b2);
            } else {
                int i9 = z ? 1 : 0;
                int i10 = z ? 1 : 0;
                f(b2, i9);
            }
            w2(b2, cVar, z);
            if (lVar.f1796e == 1) {
                int m2 = cVar.f1630f ? m2(i8) : fVar2.l(i8);
                int e2 = this.u.e(b2) + m2;
                if (z3 && cVar.f1630f) {
                    d.a Z1 = Z1(m2);
                    Z1.f1634c = -1;
                    Z1.f1633b = a2;
                    this.E.a(Z1);
                }
                i2 = e2;
                i3 = m2;
            } else {
                int p2 = cVar.f1630f ? p2(i8) : fVar2.p(i8);
                i3 = p2 - this.u.e(b2);
                if (z3 && cVar.f1630f) {
                    d.a a22 = a2(p2);
                    a22.f1634c = 1;
                    a22.f1633b = a2;
                    this.E.a(a22);
                }
                i2 = p2;
            }
            if (cVar.f1630f && lVar.f1795d == -1) {
                if (!z3) {
                    if (!(lVar.f1796e == 1 ? P1() : Q1())) {
                        d.a f2 = this.E.f(a2);
                        if (f2 != null) {
                            f2.f1636e = true;
                        }
                    }
                }
                this.M = true;
            }
            R1(b2, cVar, lVar);
            if (!u2() || this.w != 1) {
                int m = cVar.f1630f ? this.v.m() : (fVar2.f1648e * this.x) + this.v.m();
                i5 = m;
                i4 = this.v.e(b2) + m;
            } else {
                int i11 = cVar.f1630f ? this.v.i() : this.v.i() - (((this.s - 1) - fVar2.f1648e) * this.x);
                i4 = i11;
                i5 = i11 - this.v.e(b2);
            }
            if (this.w == 1) {
                staggeredGridLayoutManager = this;
                view = b2;
                i7 = i5;
                i5 = i3;
                i6 = i4;
            } else {
                staggeredGridLayoutManager = this;
                view = b2;
                i7 = i3;
                i6 = i2;
                i2 = i4;
            }
            staggeredGridLayoutManager.A0(view, i7, i5, i6, i2);
            if (cVar.f1630f) {
                L2(this.y.f1796e, i);
            } else {
                R2(fVar2, this.y.f1796e, i);
            }
            B2(vVar, this.y);
            if (this.y.f1799h && b2.hasFocusable()) {
                if (cVar.f1630f) {
                    this.B.clear();
                } else {
                    this.B.set(fVar2.f1648e, false);
                    z2 = true;
                    z = false;
                }
            }
            z2 = true;
            z = false;
        }
        if (!z2) {
            B2(vVar, this.y);
        }
        int m3 = this.y.f1796e == -1 ? this.u.m() - p2(this.u.m()) : m2(this.u.i()) - this.u.i();
        if (m3 > 0) {
            return Math.min(lVar.f1793b, m3);
        }
        return 0;
    }

    private int d2(int i) {
        int K = K();
        for (int i2 = 0; i2 < K; i2++) {
            int i0 = i0(J(i2));
            if (i0 >= 0 && i0 < i) {
                return i0;
            }
        }
        return 0;
    }

    private int h2(int i) {
        for (int K = K() - 1; K >= 0; K--) {
            int i0 = i0(J(K));
            if (i0 >= 0 && i0 < i) {
                return i0;
            }
        }
        return 0;
    }

    private void i2(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int i;
        int m2 = m2(Integer.MIN_VALUE);
        if (m2 != Integer.MIN_VALUE && (i = this.u.i() - m2) > 0) {
            int i2 = i - (-G2(-i, vVar, a0Var));
            if (!z || i2 <= 0) {
                return;
            }
            this.u.r(i2);
        }
    }

    private void j2(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int m;
        int p2 = p2(Integer.MAX_VALUE);
        if (p2 != Integer.MAX_VALUE && (m = p2 - this.u.m()) > 0) {
            int G2 = m - G2(m, vVar, a0Var);
            if (!z || G2 <= 0) {
                return;
            }
            this.u.r(-G2);
        }
    }

    private int m2(int i) {
        int l = this.t[0].l(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int l2 = this.t[i2].l(i);
            if (l2 > l) {
                l = l2;
            }
        }
        return l;
    }

    private int n2(int i) {
        int p = this.t[0].p(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int p2 = this.t[i2].p(i);
            if (p2 > p) {
                p = p2;
            }
        }
        return p;
    }

    private int o2(int i) {
        int l = this.t[0].l(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int l2 = this.t[i2].l(i);
            if (l2 < l) {
                l = l2;
            }
        }
        return l;
    }

    private int p2(int i) {
        int p = this.t[0].p(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int p2 = this.t[i2].p(i);
            if (p2 < p) {
                p = p2;
            }
        }
        return p;
    }

    private f q2(l lVar) {
        int i;
        int i2;
        int i3 = -1;
        if (y2(lVar.f1796e)) {
            i2 = this.s - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.s;
            i = 1;
        }
        f fVar = null;
        if (lVar.f1796e == 1) {
            int i4 = Integer.MAX_VALUE;
            int m = this.u.m();
            while (i2 != i3) {
                f fVar2 = this.t[i2];
                int l = fVar2.l(m);
                if (l < i4) {
                    fVar = fVar2;
                    i4 = l;
                }
                i2 += i;
            }
            return fVar;
        }
        int i5 = Integer.MIN_VALUE;
        int i6 = this.u.i();
        while (i2 != i3) {
            f fVar3 = this.t[i2];
            int p = fVar3.p(i6);
            if (p > i5) {
                fVar = fVar3;
                i5 = p;
            }
            i2 += i;
        }
        return fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void r2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.A
            if (r0 == 0) goto L9
            int r0 = r6.l2()
            goto Ld
        L9:
            int r0 = r6.k2()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r4 = r6.E
            r4.h(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.k(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.E
            r7.j(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.k(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.j(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.A
            if (r7 == 0) goto L4d
            int r7 = r6.k2()
            goto L51
        L4d:
            int r7 = r6.l2()
        L51:
            if (r3 > r7) goto L56
            r6.u1()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.r2(int, int, int):void");
    }

    private void v2(View view, int i, int i2, boolean z) {
        k(view, this.K);
        c cVar = (c) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.K;
        int S2 = S2(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.K;
        int S22 = S2(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z ? I1(view, S2, S22, cVar) : G1(view, S2, S22, cVar)) {
            view.measure(S2, S22);
        }
    }

    private void w2(View view, c cVar, boolean z) {
        int i;
        int i2;
        if (cVar.f1630f) {
            if (this.w != 1) {
                v2(view, RecyclerView.o.L(p0(), q0(), f0() + g0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.J, z);
                return;
            }
            i2 = this.J;
        } else if (this.w != 1) {
            i2 = RecyclerView.o.L(p0(), q0(), f0() + g0(), ((ViewGroup.MarginLayoutParams) cVar).width, true);
            i = RecyclerView.o.L(this.x, Y(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false);
            v2(view, i2, i, z);
        } else {
            i2 = RecyclerView.o.L(this.x, q0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false);
        }
        i = RecyclerView.o.L(X(), Y(), h0() + e0(), ((ViewGroup.MarginLayoutParams) cVar).height, true);
        v2(view, i2, i, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x014b, code lost:
        if (T1() != false) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void x2(androidx.recyclerview.widget.RecyclerView.v r9, androidx.recyclerview.widget.RecyclerView.a0 r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.x2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, boolean):void");
    }

    private boolean y2(int i) {
        if (this.w == 0) {
            return (i == -1) != this.A;
        }
        return ((i == -1) == this.A) == u2();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void D0(int i) {
        super.D0(i);
        for (int i2 = 0; i2 < this.s; i2++) {
            this.t[i2].r(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void D1(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int f0 = f0() + g0();
        int h0 = h0() + e0();
        if (this.w == 1) {
            i4 = RecyclerView.o.o(i2, rect.height() + h0, c0());
            i3 = RecyclerView.o.o(i, (this.x * this.s) + f0, d0());
        } else {
            i3 = RecyclerView.o.o(i, rect.width() + f0, d0());
            i4 = RecyclerView.o.o(i2, (this.x * this.s) + h0, c0());
        }
        C1(i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p E() {
        return this.w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void E0(int i) {
        super.E0(i);
        for (int i2 = 0; i2 < this.s; i2++) {
            this.t[i2].r(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p F(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p G(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    int G2(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (K() == 0 || i == 0) {
            return 0;
        }
        z2(i, a0Var);
        int c2 = c2(vVar, this.y, a0Var);
        if (this.y.f1793b >= c2) {
            i = i < 0 ? -c2 : c2;
        }
        this.u.r(-i);
        this.G = this.A;
        l lVar = this.y;
        lVar.f1793b = 0;
        B2(vVar, lVar);
        return i;
    }

    public void I2(int i) {
        if (i == 0 || i == 1) {
            h(null);
            if (i == this.w) {
                return;
            }
            this.w = i;
            q qVar = this.u;
            this.u = this.v;
            this.v = qVar;
            u1();
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void J0(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.J0(recyclerView, vVar);
        p1(this.P);
        for (int i = 0; i < this.s; i++) {
            this.t[i].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void J1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
        m mVar = new m(recyclerView.getContext());
        mVar.p(i);
        K1(mVar);
    }

    public void J2(boolean z) {
        h(null);
        e eVar = this.I;
        if (eVar != null && eVar.i != z) {
            eVar.i = z;
        }
        this.z = z;
        u1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View K0(View view, int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        View C;
        View m;
        if (K() == 0 || (C = C(view)) == null) {
            return null;
        }
        F2();
        int Y1 = Y1(i);
        if (Y1 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) C.getLayoutParams();
        boolean z = cVar.f1630f;
        f fVar = cVar.f1629e;
        int l2 = Y1 == 1 ? l2() : k2();
        P2(l2, a0Var);
        H2(Y1);
        l lVar = this.y;
        lVar.f1794c = lVar.f1795d + l2;
        lVar.f1793b = (int) (this.u.n() * 0.33333334f);
        l lVar2 = this.y;
        lVar2.f1799h = true;
        lVar2.f1792a = false;
        c2(vVar, lVar2, a0Var);
        this.G = this.A;
        if (!z && (m = fVar.m(l2, Y1)) != null && m != C) {
            return m;
        }
        if (y2(Y1)) {
            for (int i2 = this.s - 1; i2 >= 0; i2--) {
                View m2 = this.t[i2].m(l2, Y1);
                if (m2 != null && m2 != C) {
                    return m2;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.s; i3++) {
                View m3 = this.t[i3].m(l2, Y1);
                if (m3 != null && m3 != C) {
                    return m3;
                }
            }
        }
        boolean z2 = (this.z ^ true) == (Y1 == -1);
        if (!z) {
            View D = D(z2 ? fVar.f() : fVar.g());
            if (D != null && D != C) {
                return D;
            }
        }
        if (y2(Y1)) {
            for (int i4 = this.s - 1; i4 >= 0; i4--) {
                if (i4 != fVar.f1648e) {
                    f[] fVarArr = this.t;
                    View D2 = D(z2 ? fVarArr[i4].f() : fVarArr[i4].g());
                    if (D2 != null && D2 != C) {
                        return D2;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.s; i5++) {
                f[] fVarArr2 = this.t;
                View D3 = D(z2 ? fVarArr2[i5].f() : fVarArr2[i5].g());
                if (D3 != null && D3 != C) {
                    return D3;
                }
            }
        }
        return null;
    }

    public void K2(int i) {
        h(null);
        if (i != this.s) {
            t2();
            this.s = i;
            this.B = new BitSet(this.s);
            this.t = new f[this.s];
            for (int i2 = 0; i2 < this.s; i2++) {
                this.t[i2] = new f(i2);
            }
            u1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void L0(AccessibilityEvent accessibilityEvent) {
        super.L0(accessibilityEvent);
        if (K() > 0) {
            View f2 = f2(false);
            View e2 = e2(false);
            if (f2 == null || e2 == null) {
                return;
            }
            int i0 = i0(f2);
            int i02 = i0(e2);
            if (i0 < i02) {
                accessibilityEvent.setFromIndex(i0);
                accessibilityEvent.setToIndex(i02);
                return;
            }
            accessibilityEvent.setFromIndex(i02);
            accessibilityEvent.setToIndex(i0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean M1() {
        return this.I == null;
    }

    boolean N2(RecyclerView.a0 a0Var, b bVar) {
        int i;
        int i2;
        int i3;
        boolean z = false;
        if (!a0Var.e() && (i = this.C) != -1) {
            if (i >= 0 && i < a0Var.b()) {
                e eVar = this.I;
                if (eVar == null || eVar.f1637b == -1 || eVar.f1639d < 1) {
                    View D = D(this.C);
                    if (D != null) {
                        bVar.f1622a = this.A ? l2() : k2();
                        if (this.D != Integer.MIN_VALUE) {
                            if (bVar.f1624c) {
                                i3 = this.u.i() - this.D;
                                i2 = this.u.d(D);
                            } else {
                                i3 = this.u.m() + this.D;
                                i2 = this.u.g(D);
                            }
                            bVar.f1623b = i3 - i2;
                            return true;
                        } else if (this.u.e(D) > this.u.n()) {
                            bVar.f1623b = bVar.f1624c ? this.u.i() : this.u.m();
                            return true;
                        } else {
                            int g2 = this.u.g(D) - this.u.m();
                            if (g2 < 0) {
                                bVar.f1623b = -g2;
                                return true;
                            }
                            int i4 = this.u.i() - this.u.d(D);
                            if (i4 < 0) {
                                bVar.f1623b = i4;
                                return true;
                            }
                            bVar.f1623b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i5 = this.C;
                        bVar.f1622a = i5;
                        int i6 = this.D;
                        if (i6 == Integer.MIN_VALUE) {
                            if (S1(i5) == 1) {
                                z = true;
                            }
                            bVar.f1624c = z;
                            bVar.a();
                        } else {
                            bVar.b(i6);
                        }
                        bVar.f1625d = true;
                    }
                } else {
                    bVar.f1623b = Integer.MIN_VALUE;
                    bVar.f1622a = this.C;
                }
                return true;
            }
            this.C = -1;
            this.D = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int O(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return this.w == 1 ? this.s : super.O(vVar, a0Var);
    }

    void O2(RecyclerView.a0 a0Var, b bVar) {
        if (!N2(a0Var, bVar) && !M2(a0Var, bVar)) {
            bVar.a();
            bVar.f1622a = 0;
        }
    }

    boolean P1() {
        int l = this.t[0].l(Integer.MIN_VALUE);
        for (int i = 1; i < this.s; i++) {
            if (this.t[i].l(Integer.MIN_VALUE) != l) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Q0(RecyclerView.v vVar, RecyclerView.a0 a0Var, View view, b.g.l.c0.c cVar) {
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.P0(view, cVar);
            return;
        }
        c cVar2 = (c) layoutParams;
        if (this.w == 0) {
            i4 = cVar2.e();
            i3 = cVar2.f1630f ? this.s : 1;
            i2 = -1;
            i = -1;
        } else {
            i4 = -1;
            i3 = -1;
            i2 = cVar2.e();
            i = cVar2.f1630f ? this.s : 1;
        }
        cVar.e0(c.C0053c.f(i4, i3, i2, i, false, false));
    }

    boolean Q1() {
        int p = this.t[0].p(Integer.MIN_VALUE);
        for (int i = 1; i < this.s; i++) {
            if (this.t[i].p(Integer.MIN_VALUE) != p) {
                return false;
            }
        }
        return true;
    }

    void Q2(int i) {
        this.x = i / this.s;
        this.J = View.MeasureSpec.makeMeasureSpec(i, this.v.k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void S0(RecyclerView recyclerView, int i, int i2) {
        r2(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void T0(RecyclerView recyclerView) {
        this.E.b();
        u1();
    }

    boolean T1() {
        int i;
        int i2;
        if (K() == 0 || this.F == 0 || !s0()) {
            return false;
        }
        if (this.A) {
            i2 = l2();
            i = k2();
        } else {
            i2 = k2();
            i = l2();
        }
        if (i2 == 0 && s2() != null) {
            this.E.b();
        } else if (!this.M) {
            return false;
        } else {
            int i3 = this.A ? -1 : 1;
            int i4 = i + 1;
            d.a e2 = this.E.e(i2, i4, i3, true);
            if (e2 == null) {
                this.M = false;
                this.E.d(i4);
                return false;
            }
            d.a e3 = this.E.e(i2, e2.f1633b, i3 * (-1), true);
            if (e3 == null) {
                this.E.d(e2.f1633b);
            } else {
                this.E.d(e3.f1633b + 1);
            }
        }
        v1();
        u1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void U0(RecyclerView recyclerView, int i, int i2, int i3) {
        r2(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void V0(RecyclerView recyclerView, int i, int i2) {
        r2(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void X0(RecyclerView recyclerView, int i, int i2, Object obj) {
        r2(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Y0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        x2(vVar, a0Var, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Z0(RecyclerView.a0 a0Var) {
        super.Z0(a0Var);
        this.C = -1;
        this.D = Integer.MIN_VALUE;
        this.I = null;
        this.L.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF a(int i) {
        int S1 = S1(i);
        PointF pointF = new PointF();
        if (S1 == 0) {
            return null;
        }
        if (this.w == 0) {
            pointF.x = S1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = S1;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void d1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.I = (e) parcelable;
            u1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable e1() {
        int i;
        int i2;
        int[] iArr;
        if (this.I != null) {
            return new e(this.I);
        }
        e eVar = new e();
        eVar.i = this.z;
        eVar.j = this.G;
        eVar.k = this.H;
        d dVar = this.E;
        if (dVar == null || (iArr = dVar.f1631a) == null) {
            eVar.f1641f = 0;
        } else {
            eVar.f1642g = iArr;
            eVar.f1641f = iArr.length;
            eVar.f1643h = dVar.f1632b;
        }
        if (K() > 0) {
            eVar.f1637b = this.G ? l2() : k2();
            eVar.f1638c = g2();
            int i3 = this.s;
            eVar.f1639d = i3;
            eVar.f1640e = new int[i3];
            for (int i4 = 0; i4 < this.s; i4++) {
                if (this.G) {
                    i = this.t[i4].l(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.u.i();
                        i -= i2;
                        eVar.f1640e[i4] = i;
                    } else {
                        eVar.f1640e[i4] = i;
                    }
                } else {
                    i = this.t[i4].p(Integer.MIN_VALUE);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.u.m();
                        i -= i2;
                        eVar.f1640e[i4] = i;
                    } else {
                        eVar.f1640e[i4] = i;
                    }
                }
            }
        } else {
            eVar.f1637b = -1;
            eVar.f1638c = -1;
            eVar.f1639d = 0;
        }
        return eVar;
    }

    View e2(boolean z) {
        int m = this.u.m();
        int i = this.u.i();
        View view = null;
        for (int K = K() - 1; K >= 0; K--) {
            View J = J(K);
            int g2 = this.u.g(J);
            int d2 = this.u.d(J);
            if (d2 > m && g2 < i) {
                if (d2 <= i || !z) {
                    return J;
                }
                if (view == null) {
                    view = J;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void f1(int i) {
        if (i == 0) {
            T1();
        }
    }

    View f2(boolean z) {
        int m = this.u.m();
        int i = this.u.i();
        int K = K();
        View view = null;
        for (int i2 = 0; i2 < K; i2++) {
            View J = J(i2);
            int g2 = this.u.g(J);
            if (this.u.d(J) > m && g2 < i) {
                if (g2 >= m || !z) {
                    return J;
                }
                if (view == null) {
                    view = J;
                }
            }
        }
        return view;
    }

    int g2() {
        View e2 = this.A ? e2(true) : f2(true);
        if (e2 == null) {
            return -1;
        }
        return i0(e2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void h(String str) {
        if (this.I == null) {
            super.h(str);
        }
    }

    int k2() {
        if (K() == 0) {
            return 0;
        }
        return i0(J(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean l() {
        return this.w == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int l0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return this.w == 0 ? this.s : super.l0(vVar, a0Var);
    }

    int l2() {
        int K = K();
        if (K == 0) {
            return 0;
        }
        return i0(J(K - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean m() {
        return this.w == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean n(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void p(int i, int i2, RecyclerView.a0 a0Var, RecyclerView.o.c cVar) {
        int i3;
        int i4;
        if (this.w != 0) {
            i = i2;
        }
        if (K() == 0 || i == 0) {
            return;
        }
        z2(i, a0Var);
        int[] iArr = this.O;
        if (iArr == null || iArr.length < this.s) {
            this.O = new int[this.s];
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.s; i6++) {
            l lVar = this.y;
            if (lVar.f1795d == -1) {
                i4 = lVar.f1797f;
                i3 = this.t[i6].p(i4);
            } else {
                i4 = this.t[i6].l(lVar.f1798g);
                i3 = this.y.f1798g;
            }
            int i7 = i4 - i3;
            if (i7 >= 0) {
                this.O[i5] = i7;
                i5++;
            }
        }
        Arrays.sort(this.O, 0, i5);
        for (int i8 = 0; i8 < i5 && this.y.a(a0Var); i8++) {
            cVar.a(this.y.f1794c, this.O[i8]);
            l lVar2 = this.y;
            lVar2.f1794c += lVar2.f1795d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int r(RecyclerView.a0 a0Var) {
        return V1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int s(RecyclerView.a0 a0Var) {
        return W1(a0Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
        if (r10 == r11) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0086, code lost:
        if (r10 == r11) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0088, code lost:
        r10 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008a, code lost:
        r10 = false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    android.view.View s2() {
        /*
            r12 = this;
            int r0 = r12.K()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.s
            r2.<init>(r3)
            int r3 = r12.s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.w
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.u2()
            if (r3 == 0) goto L20
            r3 = 1
            goto L21
        L20:
            r3 = -1
        L21:
            boolean r6 = r12.A
            if (r6 == 0) goto L27
            r6 = -1
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = 0
        L2b:
            if (r0 >= r6) goto L2e
            r5 = 1
        L2e:
            if (r0 == r6) goto Lab
            android.view.View r7 = r12.J(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f1629e
            int r9 = r9.f1648e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f1629e
            boolean r9 = r12.U1(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f1629e
            int r9 = r9.f1648e
            r2.clear(r9)
        L54:
            boolean r9 = r8.f1630f
            if (r9 == 0) goto L59
            goto La9
        L59:
            int r9 = r0 + r5
            if (r9 == r6) goto La9
            android.view.View r9 = r12.J(r9)
            boolean r10 = r12.A
            if (r10 == 0) goto L77
            androidx.recyclerview.widget.q r10 = r12.u
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.q r11 = r12.u
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L74
            return r7
        L74:
            if (r10 != r11) goto L8a
            goto L88
        L77:
            androidx.recyclerview.widget.q r10 = r12.u
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.q r11 = r12.u
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L86
            return r7
        L86:
            if (r10 != r11) goto L8a
        L88:
            r10 = 1
            goto L8b
        L8a:
            r10 = 0
        L8b:
            if (r10 == 0) goto La9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f1629e
            int r8 = r8.f1648e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f1629e
            int r9 = r9.f1648e
            int r8 = r8 - r9
            if (r8 >= 0) goto La0
            r8 = 1
            goto La1
        La0:
            r8 = 0
        La1:
            if (r3 >= 0) goto La5
            r9 = 1
            goto La6
        La5:
            r9 = 0
        La6:
            if (r8 == r9) goto La9
            return r7
        La9:
            int r0 = r0 + r5
            goto L2e
        Lab:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.s2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int t(RecyclerView.a0 a0Var) {
        return X1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean t0() {
        return this.F != 0;
    }

    public void t2() {
        this.E.b();
        u1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int u(RecyclerView.a0 a0Var) {
        return V1(a0Var);
    }

    boolean u2() {
        return a0() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.a0 a0Var) {
        return W1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int w(RecyclerView.a0 a0Var) {
        return X1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int x1(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return G2(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void y1(int i) {
        e eVar = this.I;
        if (eVar != null && eVar.f1637b != i) {
            eVar.a();
        }
        this.C = i;
        this.D = Integer.MIN_VALUE;
        u1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int z1(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return G2(i, vVar, a0Var);
    }

    void z2(int i, RecyclerView.a0 a0Var) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = l2();
            i2 = 1;
        } else {
            i3 = k2();
            i2 = -1;
        }
        this.y.f1792a = true;
        P2(i3, a0Var);
        H2(i2);
        l lVar = this.y;
        lVar.f1794c = i3 + lVar.f1795d;
        lVar.f1793b = Math.abs(i);
    }
}
