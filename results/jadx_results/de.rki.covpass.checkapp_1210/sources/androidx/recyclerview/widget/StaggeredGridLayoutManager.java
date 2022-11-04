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
import androidx.core.view.accessibility.d;
import androidx.recyclerview.widget.RecyclerView;
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

    /* renamed from: t */
    f[] f4626t;

    /* renamed from: u */
    i f4627u;

    /* renamed from: v */
    i f4628v;

    /* renamed from: w */
    private int f4629w;

    /* renamed from: x */
    private int f4630x;

    /* renamed from: s */
    private int f4625s = -1;

    /* renamed from: z */
    boolean f4632z = false;
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

    /* renamed from: y */
    private final androidx.recyclerview.widget.f f4631y = new androidx.recyclerview.widget.f();

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
            StaggeredGridLayoutManager.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.S1();
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a */
        int f4634a;

        /* renamed from: b */
        int f4635b;

        /* renamed from: c */
        boolean f4636c;

        /* renamed from: d */
        boolean f4637d;

        /* renamed from: e */
        boolean f4638e;

        /* renamed from: f */
        int[] f4639f;

        b() {
            StaggeredGridLayoutManager.this = r1;
            c();
        }

        void a() {
            this.f4635b = this.f4636c ? StaggeredGridLayoutManager.this.f4627u.i() : StaggeredGridLayoutManager.this.f4627u.m();
        }

        void b(int i10) {
            this.f4635b = this.f4636c ? StaggeredGridLayoutManager.this.f4627u.i() - i10 : StaggeredGridLayoutManager.this.f4627u.m() + i10;
        }

        void c() {
            this.f4634a = -1;
            this.f4635b = Integer.MIN_VALUE;
            this.f4636c = false;
            this.f4637d = false;
            this.f4638e = false;
            int[] iArr = this.f4639f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }

        void d(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f4639f;
            if (iArr == null || iArr.length < length) {
                this.f4639f = new int[StaggeredGridLayoutManager.this.f4626t.length];
            }
            for (int i10 = 0; i10 < length; i10++) {
                this.f4639f[i10] = fVarArr[i10].p(Integer.MIN_VALUE);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends RecyclerView.p {

        /* renamed from: e */
        f f4641e;

        /* renamed from: f */
        boolean f4642f;

        public c(int i10, int i11) {
            super(i10, i11);
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
            f fVar = this.f4641e;
            if (fVar == null) {
                return -1;
            }
            return fVar.f4658e;
        }

        public boolean f() {
            return this.f4642f;
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        int[] f4643a;

        /* renamed from: b */
        List<a> f4644b;

        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0055a();

            /* renamed from: c */
            int f4645c;

            /* renamed from: d */
            int f4646d;

            /* renamed from: q */
            int[] f4647q;

            /* renamed from: x */
            boolean f4648x;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a */
            /* loaded from: classes.dex */
            static class C0055a implements Parcelable.Creator<a> {
                C0055a() {
                }

                /* renamed from: a */
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                /* renamed from: b */
                public a[] newArray(int i10) {
                    return new a[i10];
                }
            }

            a() {
            }

            a(Parcel parcel) {
                this.f4645c = parcel.readInt();
                this.f4646d = parcel.readInt();
                this.f4648x = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.f4647q = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            int a(int i10) {
                int[] iArr = this.f4647q;
                if (iArr == null) {
                    return 0;
                }
                return iArr[i10];
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public String toString() {
                return "FullSpanItem{mPosition=" + this.f4645c + ", mGapDir=" + this.f4646d + ", mHasUnwantedGapAfter=" + this.f4648x + ", mGapPerSpan=" + Arrays.toString(this.f4647q) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i10) {
                parcel.writeInt(this.f4645c);
                parcel.writeInt(this.f4646d);
                parcel.writeInt(this.f4648x ? 1 : 0);
                int[] iArr = this.f4647q;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.f4647q);
            }
        }

        d() {
        }

        private int i(int i10) {
            if (this.f4644b == null) {
                return -1;
            }
            a f10 = f(i10);
            if (f10 != null) {
                this.f4644b.remove(f10);
            }
            int size = this.f4644b.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    i11 = -1;
                    break;
                } else if (this.f4644b.get(i11).f4645c >= i10) {
                    break;
                } else {
                    i11++;
                }
            }
            if (i11 == -1) {
                return -1;
            }
            this.f4644b.remove(i11);
            return this.f4644b.get(i11).f4645c;
        }

        private void l(int i10, int i11) {
            List<a> list = this.f4644b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f4644b.get(size);
                int i12 = aVar.f4645c;
                if (i12 >= i10) {
                    aVar.f4645c = i12 + i11;
                }
            }
        }

        private void m(int i10, int i11) {
            List<a> list = this.f4644b;
            if (list == null) {
                return;
            }
            int i12 = i10 + i11;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f4644b.get(size);
                int i13 = aVar.f4645c;
                if (i13 >= i10) {
                    if (i13 < i12) {
                        this.f4644b.remove(size);
                    } else {
                        aVar.f4645c = i13 - i11;
                    }
                }
            }
        }

        public void a(a aVar) {
            if (this.f4644b == null) {
                this.f4644b = new ArrayList();
            }
            int size = this.f4644b.size();
            for (int i10 = 0; i10 < size; i10++) {
                a aVar2 = this.f4644b.get(i10);
                if (aVar2.f4645c == aVar.f4645c) {
                    this.f4644b.remove(i10);
                }
                if (aVar2.f4645c >= aVar.f4645c) {
                    this.f4644b.add(i10, aVar);
                    return;
                }
            }
            this.f4644b.add(aVar);
        }

        void b() {
            int[] iArr = this.f4643a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4644b = null;
        }

        void c(int i10) {
            int[] iArr = this.f4643a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i10, 10) + 1];
                this.f4643a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i10 < iArr.length) {
            } else {
                int[] iArr3 = new int[o(i10)];
                this.f4643a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f4643a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        int d(int i10) {
            List<a> list = this.f4644b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f4644b.get(size).f4645c >= i10) {
                        this.f4644b.remove(size);
                    }
                }
            }
            return h(i10);
        }

        public a e(int i10, int i11, int i12, boolean z10) {
            List<a> list = this.f4644b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i13 = 0; i13 < size; i13++) {
                a aVar = this.f4644b.get(i13);
                int i14 = aVar.f4645c;
                if (i14 >= i11) {
                    return null;
                }
                if (i14 >= i10 && (i12 == 0 || aVar.f4646d == i12 || (z10 && aVar.f4648x))) {
                    return aVar;
                }
            }
            return null;
        }

        public a f(int i10) {
            List<a> list = this.f4644b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f4644b.get(size);
                if (aVar.f4645c == i10) {
                    return aVar;
                }
            }
            return null;
        }

        int g(int i10) {
            int[] iArr = this.f4643a;
            if (iArr == null || i10 >= iArr.length) {
                return -1;
            }
            return iArr[i10];
        }

        int h(int i10) {
            int[] iArr = this.f4643a;
            if (iArr != null && i10 < iArr.length) {
                int i11 = i(i10);
                if (i11 == -1) {
                    int[] iArr2 = this.f4643a;
                    Arrays.fill(iArr2, i10, iArr2.length, -1);
                    return this.f4643a.length;
                }
                int i12 = i11 + 1;
                Arrays.fill(this.f4643a, i10, i12, -1);
                return i12;
            }
            return -1;
        }

        void j(int i10, int i11) {
            int[] iArr = this.f4643a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f4643a;
            System.arraycopy(iArr2, i10, iArr2, i12, (iArr2.length - i10) - i11);
            Arrays.fill(this.f4643a, i10, i12, -1);
            l(i10, i11);
        }

        void k(int i10, int i11) {
            int[] iArr = this.f4643a;
            if (iArr == null || i10 >= iArr.length) {
                return;
            }
            int i12 = i10 + i11;
            c(i12);
            int[] iArr2 = this.f4643a;
            System.arraycopy(iArr2, i12, iArr2, i10, (iArr2.length - i10) - i11);
            int[] iArr3 = this.f4643a;
            Arrays.fill(iArr3, iArr3.length - i11, iArr3.length, -1);
            m(i10, i11);
        }

        void n(int i10, f fVar) {
            c(i10);
            this.f4643a[i10] = fVar.f4658e;
        }

        int o(int i10) {
            int length = this.f4643a.length;
            while (length <= i10) {
                length *= 2;
            }
            return length;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    /* loaded from: classes.dex */
    public static class e implements Parcelable {
        public static final Parcelable.Creator<e> CREATOR = new a();
        int[] U3;
        List<d.a> V3;
        boolean W3;
        boolean X3;
        boolean Y3;

        /* renamed from: c */
        int f4649c;

        /* renamed from: d */
        int f4650d;

        /* renamed from: q */
        int f4651q;

        /* renamed from: x */
        int[] f4652x;

        /* renamed from: y */
        int f4653y;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<e> {
            a() {
            }

            /* renamed from: a */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            /* renamed from: b */
            public e[] newArray(int i10) {
                return new e[i10];
            }
        }

        public e() {
        }

        e(Parcel parcel) {
            this.f4649c = parcel.readInt();
            this.f4650d = parcel.readInt();
            int readInt = parcel.readInt();
            this.f4651q = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.f4652x = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f4653y = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.U3 = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z10 = false;
            this.W3 = parcel.readInt() == 1;
            this.X3 = parcel.readInt() == 1;
            this.Y3 = parcel.readInt() == 1 ? true : z10;
            this.V3 = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.f4651q = eVar.f4651q;
            this.f4649c = eVar.f4649c;
            this.f4650d = eVar.f4650d;
            this.f4652x = eVar.f4652x;
            this.f4653y = eVar.f4653y;
            this.U3 = eVar.U3;
            this.W3 = eVar.W3;
            this.X3 = eVar.X3;
            this.Y3 = eVar.Y3;
            this.V3 = eVar.V3;
        }

        void a() {
            this.f4652x = null;
            this.f4651q = 0;
            this.f4649c = -1;
            this.f4650d = -1;
        }

        void c() {
            this.f4652x = null;
            this.f4651q = 0;
            this.f4653y = 0;
            this.U3 = null;
            this.V3 = null;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f4649c);
            parcel.writeInt(this.f4650d);
            parcel.writeInt(this.f4651q);
            if (this.f4651q > 0) {
                parcel.writeIntArray(this.f4652x);
            }
            parcel.writeInt(this.f4653y);
            if (this.f4653y > 0) {
                parcel.writeIntArray(this.U3);
            }
            parcel.writeInt(this.W3 ? 1 : 0);
            parcel.writeInt(this.X3 ? 1 : 0);
            parcel.writeInt(this.Y3 ? 1 : 0);
            parcel.writeList(this.V3);
        }
    }

    /* loaded from: classes.dex */
    public class f {

        /* renamed from: a */
        ArrayList<View> f4654a = new ArrayList<>();

        /* renamed from: b */
        int f4655b = Integer.MIN_VALUE;

        /* renamed from: c */
        int f4656c = Integer.MIN_VALUE;

        /* renamed from: d */
        int f4657d = 0;

        /* renamed from: e */
        final int f4658e;

        f(int i10) {
            StaggeredGridLayoutManager.this = r1;
            this.f4658e = i10;
        }

        void a(View view) {
            c n10 = n(view);
            n10.f4641e = this;
            this.f4654a.add(view);
            this.f4656c = Integer.MIN_VALUE;
            if (this.f4654a.size() == 1) {
                this.f4655b = Integer.MIN_VALUE;
            }
            if (n10.c() || n10.b()) {
                this.f4657d += StaggeredGridLayoutManager.this.f4627u.e(view);
            }
        }

        void b(boolean z10, int i10) {
            int l10 = z10 ? l(Integer.MIN_VALUE) : p(Integer.MIN_VALUE);
            e();
            if (l10 == Integer.MIN_VALUE) {
                return;
            }
            if (z10 && l10 < StaggeredGridLayoutManager.this.f4627u.i()) {
                return;
            }
            if (!z10 && l10 > StaggeredGridLayoutManager.this.f4627u.m()) {
                return;
            }
            if (i10 != Integer.MIN_VALUE) {
                l10 += i10;
            }
            this.f4656c = l10;
            this.f4655b = l10;
        }

        void c() {
            d.a f10;
            ArrayList<View> arrayList = this.f4654a;
            View view = arrayList.get(arrayList.size() - 1);
            c n10 = n(view);
            this.f4656c = StaggeredGridLayoutManager.this.f4627u.d(view);
            if (!n10.f4642f || (f10 = StaggeredGridLayoutManager.this.E.f(n10.a())) == null || f10.f4646d != 1) {
                return;
            }
            this.f4656c += f10.a(this.f4658e);
        }

        void d() {
            d.a f10;
            View view = this.f4654a.get(0);
            c n10 = n(view);
            this.f4655b = StaggeredGridLayoutManager.this.f4627u.g(view);
            if (!n10.f4642f || (f10 = StaggeredGridLayoutManager.this.E.f(n10.a())) == null || f10.f4646d != -1) {
                return;
            }
            this.f4655b -= f10.a(this.f4658e);
        }

        void e() {
            this.f4654a.clear();
            q();
            this.f4657d = 0;
        }

        public int f() {
            int i10;
            int i11;
            if (StaggeredGridLayoutManager.this.f4632z) {
                i11 = this.f4654a.size() - 1;
                i10 = -1;
            } else {
                i11 = 0;
                i10 = this.f4654a.size();
            }
            return i(i11, i10, true);
        }

        public int g() {
            int i10;
            int i11;
            if (StaggeredGridLayoutManager.this.f4632z) {
                i11 = 0;
                i10 = this.f4654a.size();
            } else {
                i11 = this.f4654a.size() - 1;
                i10 = -1;
            }
            return i(i11, i10, true);
        }

        int h(int i10, int i11, boolean z10, boolean z11, boolean z12) {
            int m10 = StaggeredGridLayoutManager.this.f4627u.m();
            int i12 = StaggeredGridLayoutManager.this.f4627u.i();
            int i13 = i11 > i10 ? 1 : -1;
            while (i10 != i11) {
                View view = this.f4654a.get(i10);
                int g10 = StaggeredGridLayoutManager.this.f4627u.g(view);
                int d10 = StaggeredGridLayoutManager.this.f4627u.d(view);
                boolean z13 = false;
                boolean z14 = !z12 ? g10 < i12 : g10 <= i12;
                if (!z12 ? d10 > m10 : d10 >= m10) {
                    z13 = true;
                }
                if (z14 && z13) {
                    if (!z10 || !z11) {
                        if (!z11 && g10 >= m10 && d10 <= i12) {
                        }
                        return StaggeredGridLayoutManager.this.h0(view);
                    } else if (g10 >= m10 && d10 <= i12) {
                        return StaggeredGridLayoutManager.this.h0(view);
                    }
                }
                i10 += i13;
            }
            return -1;
        }

        int i(int i10, int i11, boolean z10) {
            return h(i10, i11, false, false, z10);
        }

        public int j() {
            return this.f4657d;
        }

        int k() {
            int i10 = this.f4656c;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            c();
            return this.f4656c;
        }

        int l(int i10) {
            int i11 = this.f4656c;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f4654a.size() == 0) {
                return i10;
            }
            c();
            return this.f4656c;
        }

        public View m(int i10, int i11) {
            View view = null;
            if (i11 != -1) {
                int size = this.f4654a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f4654a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.f4632z && staggeredGridLayoutManager.h0(view2) >= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.f4632z && staggeredGridLayoutManager2.h0(view2) <= i10) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f4654a.size();
                int i12 = 0;
                while (i12 < size2) {
                    View view3 = this.f4654a.get(i12);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.f4632z && staggeredGridLayoutManager3.h0(view3) <= i10) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.f4632z && staggeredGridLayoutManager4.h0(view3) >= i10) || !view3.hasFocusable()) {
                        break;
                    }
                    i12++;
                    view = view3;
                }
            }
            return view;
        }

        c n(View view) {
            return (c) view.getLayoutParams();
        }

        int o() {
            int i10 = this.f4655b;
            if (i10 != Integer.MIN_VALUE) {
                return i10;
            }
            d();
            return this.f4655b;
        }

        int p(int i10) {
            int i11 = this.f4655b;
            if (i11 != Integer.MIN_VALUE) {
                return i11;
            }
            if (this.f4654a.size() == 0) {
                return i10;
            }
            d();
            return this.f4655b;
        }

        void q() {
            this.f4655b = Integer.MIN_VALUE;
            this.f4656c = Integer.MIN_VALUE;
        }

        void r(int i10) {
            int i11 = this.f4655b;
            if (i11 != Integer.MIN_VALUE) {
                this.f4655b = i11 + i10;
            }
            int i12 = this.f4656c;
            if (i12 != Integer.MIN_VALUE) {
                this.f4656c = i12 + i10;
            }
        }

        void s() {
            int size = this.f4654a.size();
            View remove = this.f4654a.remove(size - 1);
            c n10 = n(remove);
            n10.f4641e = null;
            if (n10.c() || n10.b()) {
                this.f4657d -= StaggeredGridLayoutManager.this.f4627u.e(remove);
            }
            if (size == 1) {
                this.f4655b = Integer.MIN_VALUE;
            }
            this.f4656c = Integer.MIN_VALUE;
        }

        void t() {
            View remove = this.f4654a.remove(0);
            c n10 = n(remove);
            n10.f4641e = null;
            if (this.f4654a.size() == 0) {
                this.f4656c = Integer.MIN_VALUE;
            }
            if (n10.c() || n10.b()) {
                this.f4657d -= StaggeredGridLayoutManager.this.f4627u.e(remove);
            }
            this.f4655b = Integer.MIN_VALUE;
        }

        void u(View view) {
            c n10 = n(view);
            n10.f4641e = this;
            this.f4654a.add(0, view);
            this.f4655b = Integer.MIN_VALUE;
            if (this.f4654a.size() == 1) {
                this.f4656c = Integer.MIN_VALUE;
            }
            if (n10.c() || n10.b()) {
                this.f4657d += StaggeredGridLayoutManager.this.f4627u.e(view);
            }
        }

        void v(int i10) {
            this.f4655b = i10;
            this.f4656c = i10;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i10, int i11) {
        RecyclerView.o.d i02 = RecyclerView.o.i0(context, attributeSet, i10, i11);
        H2(i02.f4586a);
        J2(i02.f4587b);
        I2(i02.f4588c);
        a2();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0010, code lost:
        if (r4.f4777e == (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A2(androidx.recyclerview.widget.RecyclerView.v r3, androidx.recyclerview.widget.f r4) {
        /*
            r2 = this;
            boolean r0 = r4.f4773a
            if (r0 == 0) goto L4d
            boolean r0 = r4.f4781i
            if (r0 == 0) goto L9
            goto L4d
        L9:
            int r0 = r4.f4774b
            r1 = -1
            if (r0 != 0) goto L1e
            int r0 = r4.f4777e
            if (r0 != r1) goto L18
        L12:
            int r4 = r4.f4779g
        L14:
            r2.B2(r3, r4)
            goto L4d
        L18:
            int r4 = r4.f4778f
        L1a:
            r2.C2(r3, r4)
            goto L4d
        L1e:
            int r0 = r4.f4777e
            if (r0 != r1) goto L37
            int r0 = r4.f4778f
            int r1 = r2.m2(r0)
            int r0 = r0 - r1
            if (r0 >= 0) goto L2c
            goto L12
        L2c:
            int r1 = r4.f4779g
            int r4 = r4.f4774b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
            goto L14
        L37:
            int r0 = r4.f4779g
            int r0 = r2.n2(r0)
            int r1 = r4.f4779g
            int r0 = r0 - r1
            if (r0 >= 0) goto L43
            goto L18
        L43:
            int r1 = r4.f4778f
            int r4 = r4.f4774b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
            goto L1a
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.A2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.f):void");
    }

    private void B2(RecyclerView.v vVar, int i10) {
        for (int J = J() - 1; J >= 0; J--) {
            View I = I(J);
            if (this.f4627u.g(I) < i10 || this.f4627u.q(I) < i10) {
                return;
            }
            c cVar = (c) I.getLayoutParams();
            if (cVar.f4642f) {
                for (int i11 = 0; i11 < this.f4625s; i11++) {
                    if (this.f4626t[i11].f4654a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f4625s; i12++) {
                    this.f4626t[i12].s();
                }
            } else if (cVar.f4641e.f4654a.size() == 1) {
                return;
            } else {
                cVar.f4641e.s();
            }
            m1(I, vVar);
        }
    }

    private void C2(RecyclerView.v vVar, int i10) {
        while (J() > 0) {
            View I = I(0);
            if (this.f4627u.d(I) > i10 || this.f4627u.p(I) > i10) {
                return;
            }
            c cVar = (c) I.getLayoutParams();
            if (cVar.f4642f) {
                for (int i11 = 0; i11 < this.f4625s; i11++) {
                    if (this.f4626t[i11].f4654a.size() == 1) {
                        return;
                    }
                }
                for (int i12 = 0; i12 < this.f4625s; i12++) {
                    this.f4626t[i12].t();
                }
            } else if (cVar.f4641e.f4654a.size() == 1) {
                return;
            } else {
                cVar.f4641e.t();
            }
            m1(I, vVar);
        }
    }

    private void D2() {
        if (this.f4628v.k() == 1073741824) {
            return;
        }
        float f10 = 0.0f;
        int J = J();
        for (int i10 = 0; i10 < J; i10++) {
            View I = I(i10);
            float e10 = this.f4628v.e(I);
            if (e10 >= f10) {
                if (((c) I.getLayoutParams()).f()) {
                    e10 = (e10 * 1.0f) / this.f4625s;
                }
                f10 = Math.max(f10, e10);
            }
        }
        int i11 = this.f4630x;
        int round = Math.round(f10 * this.f4625s);
        if (this.f4628v.k() == Integer.MIN_VALUE) {
            round = Math.min(round, this.f4628v.n());
        }
        P2(round);
        if (this.f4630x == i11) {
            return;
        }
        for (int i12 = 0; i12 < J; i12++) {
            View I2 = I(i12);
            c cVar = (c) I2.getLayoutParams();
            if (!cVar.f4642f) {
                if (!t2() || this.f4629w != 1) {
                    int i13 = cVar.f4641e.f4658e;
                    int i14 = this.f4629w;
                    int i15 = (this.f4630x * i13) - (i13 * i11);
                    if (i14 == 1) {
                        I2.offsetLeftAndRight(i15);
                    } else {
                        I2.offsetTopAndBottom(i15);
                    }
                } else {
                    int i16 = this.f4625s;
                    int i17 = cVar.f4641e.f4658e;
                    I2.offsetLeftAndRight(((-((i16 - 1) - i17)) * this.f4630x) - ((-((i16 - 1) - i17)) * i11));
                }
            }
        }
    }

    private void E2() {
        this.A = (this.f4629w == 1 || !t2()) ? this.f4632z : !this.f4632z;
    }

    private void G2(int i10) {
        androidx.recyclerview.widget.f fVar = this.f4631y;
        fVar.f4777e = i10;
        int i11 = 1;
        if (this.A != (i10 == -1)) {
            i11 = -1;
        }
        fVar.f4776d = i11;
    }

    private void K2(int i10, int i11) {
        for (int i12 = 0; i12 < this.f4625s; i12++) {
            if (!this.f4626t[i12].f4654a.isEmpty()) {
                Q2(this.f4626t[i12], i10, i11);
            }
        }
    }

    private boolean L2(RecyclerView.a0 a0Var, b bVar) {
        boolean z10 = this.G;
        int b10 = a0Var.b();
        bVar.f4634a = z10 ? g2(b10) : c2(b10);
        bVar.f4635b = Integer.MIN_VALUE;
        return true;
    }

    private void M1(View view) {
        for (int i10 = this.f4625s - 1; i10 >= 0; i10--) {
            this.f4626t[i10].a(view);
        }
    }

    private void N1(b bVar) {
        boolean z10;
        e eVar = this.I;
        int i10 = eVar.f4651q;
        if (i10 > 0) {
            if (i10 == this.f4625s) {
                for (int i11 = 0; i11 < this.f4625s; i11++) {
                    this.f4626t[i11].e();
                    e eVar2 = this.I;
                    int i12 = eVar2.f4652x[i11];
                    if (i12 != Integer.MIN_VALUE) {
                        i12 += eVar2.X3 ? this.f4627u.i() : this.f4627u.m();
                    }
                    this.f4626t[i11].v(i12);
                }
            } else {
                eVar.c();
                e eVar3 = this.I;
                eVar3.f4649c = eVar3.f4650d;
            }
        }
        e eVar4 = this.I;
        this.H = eVar4.Y3;
        I2(eVar4.W3);
        E2();
        e eVar5 = this.I;
        int i13 = eVar5.f4649c;
        if (i13 != -1) {
            this.C = i13;
            z10 = eVar5.X3;
        } else {
            z10 = this.A;
        }
        bVar.f4636c = z10;
        if (eVar5.f4653y > 1) {
            d dVar = this.E;
            dVar.f4643a = eVar5.U3;
            dVar.f4644b = eVar5.V3;
        }
    }

    private void O2(int i10, RecyclerView.a0 a0Var) {
        int i11;
        int i12;
        int c10;
        androidx.recyclerview.widget.f fVar = this.f4631y;
        boolean z10 = false;
        fVar.f4774b = 0;
        fVar.f4775c = i10;
        if (!x0() || (c10 = a0Var.c()) == -1) {
            i12 = 0;
            i11 = 0;
        } else {
            if (this.A == (c10 < i10)) {
                i12 = this.f4627u.n();
                i11 = 0;
            } else {
                i11 = this.f4627u.n();
                i12 = 0;
            }
        }
        if (M()) {
            this.f4631y.f4778f = this.f4627u.m() - i11;
            this.f4631y.f4779g = this.f4627u.i() + i12;
        } else {
            this.f4631y.f4779g = this.f4627u.h() + i12;
            this.f4631y.f4778f = -i11;
        }
        androidx.recyclerview.widget.f fVar2 = this.f4631y;
        fVar2.f4780h = false;
        fVar2.f4773a = true;
        if (this.f4627u.k() == 0 && this.f4627u.h() == 0) {
            z10 = true;
        }
        fVar2.f4781i = z10;
    }

    private void Q1(View view, c cVar, androidx.recyclerview.widget.f fVar) {
        if (fVar.f4777e == 1) {
            if (cVar.f4642f) {
                M1(view);
            } else {
                cVar.f4641e.a(view);
            }
        } else if (cVar.f4642f) {
            z2(view);
        } else {
            cVar.f4641e.u(view);
        }
    }

    private void Q2(f fVar, int i10, int i11) {
        int j10 = fVar.j();
        if (i10 == -1) {
            if (fVar.o() + j10 > i11) {
                return;
            }
        } else if (fVar.k() - j10 < i11) {
            return;
        }
        this.B.set(fVar.f4658e, false);
    }

    private int R1(int i10) {
        if (J() == 0) {
            return this.A ? 1 : -1;
        }
        return (i10 < j2()) != this.A ? -1 : 1;
    }

    private int R2(int i10, int i11, int i12) {
        if (i11 == 0 && i12 == 0) {
            return i10;
        }
        int mode = View.MeasureSpec.getMode(i10);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i10) - i11) - i12), mode) : i10;
    }

    private boolean T1(f fVar) {
        if (this.A) {
            if (fVar.k() < this.f4627u.i()) {
                ArrayList<View> arrayList = fVar.f4654a;
                return !fVar.n(arrayList.get(arrayList.size() - 1)).f4642f;
            }
        } else if (fVar.o() > this.f4627u.m()) {
            return !fVar.n(fVar.f4654a.get(0)).f4642f;
        }
        return false;
    }

    private int U1(RecyclerView.a0 a0Var) {
        if (J() == 0) {
            return 0;
        }
        return l.a(a0Var, this.f4627u, e2(!this.N), d2(!this.N), this, this.N);
    }

    private int V1(RecyclerView.a0 a0Var) {
        if (J() == 0) {
            return 0;
        }
        return l.b(a0Var, this.f4627u, e2(!this.N), d2(!this.N), this, this.N, this.A);
    }

    private int W1(RecyclerView.a0 a0Var) {
        if (J() == 0) {
            return 0;
        }
        return l.c(a0Var, this.f4627u, e2(!this.N), d2(!this.N), this, this.N);
    }

    private int X1(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 17 ? i10 != 33 ? i10 != 66 ? (i10 == 130 && this.f4629w == 1) ? 1 : Integer.MIN_VALUE : this.f4629w == 0 ? 1 : Integer.MIN_VALUE : this.f4629w == 1 ? -1 : Integer.MIN_VALUE : this.f4629w == 0 ? -1 : Integer.MIN_VALUE : (this.f4629w != 1 && t2()) ? -1 : 1 : (this.f4629w != 1 && t2()) ? 1 : -1;
    }

    private d.a Y1(int i10) {
        d.a aVar = new d.a();
        aVar.f4647q = new int[this.f4625s];
        for (int i11 = 0; i11 < this.f4625s; i11++) {
            aVar.f4647q[i11] = i10 - this.f4626t[i11].l(i10);
        }
        return aVar;
    }

    private d.a Z1(int i10) {
        d.a aVar = new d.a();
        aVar.f4647q = new int[this.f4625s];
        for (int i11 = 0; i11 < this.f4625s; i11++) {
            aVar.f4647q[i11] = this.f4626t[i11].p(i10) - i10;
        }
        return aVar;
    }

    private void a2() {
        this.f4627u = i.b(this, this.f4629w);
        this.f4628v = i.b(this, 1 - this.f4629w);
    }

    private int b2(RecyclerView.v vVar, androidx.recyclerview.widget.f fVar, RecyclerView.a0 a0Var) {
        f fVar2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        View view;
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        boolean z10;
        boolean z11 = false;
        this.B.set(0, this.f4625s, true);
        int i16 = this.f4631y.f4781i ? fVar.f4777e == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE : fVar.f4777e == 1 ? fVar.f4779g + fVar.f4774b : fVar.f4778f - fVar.f4774b;
        K2(fVar.f4777e, i16);
        int i17 = this.A ? this.f4627u.i() : this.f4627u.m();
        Object[] objArr = null;
        while (fVar.a(a0Var) && (this.f4631y.f4781i || !this.B.isEmpty())) {
            View b10 = fVar.b(vVar);
            c cVar = (c) b10.getLayoutParams();
            int a10 = cVar.a();
            int g10 = this.E.g(a10);
            boolean z12 = g10 == -1 ? true : z11;
            if (z12) {
                if (cVar.f4642f) {
                    f[] fVarArr = this.f4626t;
                    char c10 = z11 ? 1 : 0;
                    char c11 = z11 ? 1 : 0;
                    fVar2 = fVarArr[c10];
                } else {
                    fVar2 = p2(fVar);
                }
                this.E.n(a10, fVar2);
            } else {
                fVar2 = this.f4626t[g10];
            }
            f fVar3 = fVar2;
            cVar.f4641e = fVar3;
            if (fVar.f4777e == 1) {
                d(b10);
            } else {
                int i18 = z11 ? 1 : 0;
                int i19 = z11 ? 1 : 0;
                e(b10, i18);
            }
            v2(b10, cVar, z11);
            if (fVar.f4777e == 1) {
                int l22 = cVar.f4642f ? l2(i17) : fVar3.l(i17);
                int e10 = this.f4627u.e(b10) + l22;
                if (z12 && cVar.f4642f) {
                    d.a Y1 = Y1(l22);
                    Y1.f4646d = -1;
                    Y1.f4645c = a10;
                    this.E.a(Y1);
                }
                i10 = e10;
                i11 = l22;
            } else {
                int o22 = cVar.f4642f ? o2(i17) : fVar3.p(i17);
                i11 = o22 - this.f4627u.e(b10);
                if (z12 && cVar.f4642f) {
                    d.a Z1 = Z1(o22);
                    Z1.f4646d = 1;
                    Z1.f4645c = a10;
                    this.E.a(Z1);
                }
                i10 = o22;
            }
            if (cVar.f4642f && fVar.f4776d == -1) {
                if (!z12) {
                    if (!(fVar.f4777e == 1 ? O1() : P1())) {
                        d.a f10 = this.E.f(a10);
                        if (f10 != null) {
                            f10.f4648x = true;
                        }
                    }
                }
                this.M = true;
            }
            Q1(b10, cVar, fVar);
            if (!t2() || this.f4629w != 1) {
                int m10 = cVar.f4642f ? this.f4628v.m() : (fVar3.f4658e * this.f4630x) + this.f4628v.m();
                i13 = m10;
                i12 = this.f4628v.e(b10) + m10;
            } else {
                int i20 = cVar.f4642f ? this.f4628v.i() : this.f4628v.i() - (((this.f4625s - 1) - fVar3.f4658e) * this.f4630x);
                i12 = i20;
                i13 = i20 - this.f4628v.e(b10);
            }
            if (this.f4629w == 1) {
                staggeredGridLayoutManager = this;
                view = b10;
                i15 = i13;
                i13 = i11;
                i14 = i12;
            } else {
                staggeredGridLayoutManager = this;
                view = b10;
                i15 = i11;
                i14 = i10;
                i10 = i12;
            }
            staggeredGridLayoutManager.z0(view, i15, i13, i14, i10);
            if (cVar.f4642f) {
                K2(this.f4631y.f4777e, i16);
            } else {
                Q2(fVar3, this.f4631y.f4777e, i16);
            }
            A2(vVar, this.f4631y);
            if (this.f4631y.f4780h && b10.hasFocusable()) {
                if (cVar.f4642f) {
                    this.B.clear();
                } else {
                    z10 = false;
                    this.B.set(fVar3.f4658e, false);
                    z11 = z10;
                    objArr = 1;
                }
            }
            z10 = false;
            z11 = z10;
            objArr = 1;
        }
        int i21 = z11 ? 1 : 0;
        Object[] objArr2 = z11 ? 1 : 0;
        int i22 = i21;
        if (objArr == null) {
            A2(vVar, this.f4631y);
        }
        int m11 = this.f4631y.f4777e == -1 ? this.f4627u.m() - o2(this.f4627u.m()) : l2(this.f4627u.i()) - this.f4627u.i();
        return m11 > 0 ? Math.min(fVar.f4774b, m11) : i22;
    }

    private int c2(int i10) {
        int J = J();
        for (int i11 = 0; i11 < J; i11++) {
            int h02 = h0(I(i11));
            if (h02 >= 0 && h02 < i10) {
                return h02;
            }
        }
        return 0;
    }

    private int g2(int i10) {
        for (int J = J() - 1; J >= 0; J--) {
            int h02 = h0(I(J));
            if (h02 >= 0 && h02 < i10) {
                return h02;
            }
        }
        return 0;
    }

    private void h2(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z10) {
        int i10;
        int l22 = l2(Integer.MIN_VALUE);
        if (l22 != Integer.MIN_VALUE && (i10 = this.f4627u.i() - l22) > 0) {
            int i11 = i10 - (-F2(-i10, vVar, a0Var));
            if (!z10 || i11 <= 0) {
                return;
            }
            this.f4627u.r(i11);
        }
    }

    private void i2(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z10) {
        int m10;
        int o22 = o2(Integer.MAX_VALUE);
        if (o22 != Integer.MAX_VALUE && (m10 = o22 - this.f4627u.m()) > 0) {
            int F2 = m10 - F2(m10, vVar, a0Var);
            if (!z10 || F2 <= 0) {
                return;
            }
            this.f4627u.r(-F2);
        }
    }

    private int l2(int i10) {
        int l10 = this.f4626t[0].l(i10);
        for (int i11 = 1; i11 < this.f4625s; i11++) {
            int l11 = this.f4626t[i11].l(i10);
            if (l11 > l10) {
                l10 = l11;
            }
        }
        return l10;
    }

    private int m2(int i10) {
        int p10 = this.f4626t[0].p(i10);
        for (int i11 = 1; i11 < this.f4625s; i11++) {
            int p11 = this.f4626t[i11].p(i10);
            if (p11 > p10) {
                p10 = p11;
            }
        }
        return p10;
    }

    private int n2(int i10) {
        int l10 = this.f4626t[0].l(i10);
        for (int i11 = 1; i11 < this.f4625s; i11++) {
            int l11 = this.f4626t[i11].l(i10);
            if (l11 < l10) {
                l10 = l11;
            }
        }
        return l10;
    }

    private int o2(int i10) {
        int p10 = this.f4626t[0].p(i10);
        for (int i11 = 1; i11 < this.f4625s; i11++) {
            int p11 = this.f4626t[i11].p(i10);
            if (p11 < p10) {
                p10 = p11;
            }
        }
        return p10;
    }

    private f p2(androidx.recyclerview.widget.f fVar) {
        int i10;
        int i11;
        int i12 = -1;
        if (x2(fVar.f4777e)) {
            i11 = this.f4625s - 1;
            i10 = -1;
        } else {
            i11 = 0;
            i12 = this.f4625s;
            i10 = 1;
        }
        f fVar2 = null;
        if (fVar.f4777e == 1) {
            int i13 = Integer.MAX_VALUE;
            int m10 = this.f4627u.m();
            while (i11 != i12) {
                f fVar3 = this.f4626t[i11];
                int l10 = fVar3.l(m10);
                if (l10 < i13) {
                    fVar2 = fVar3;
                    i13 = l10;
                }
                i11 += i10;
            }
            return fVar2;
        }
        int i14 = Integer.MIN_VALUE;
        int i15 = this.f4627u.i();
        while (i11 != i12) {
            f fVar4 = this.f4626t[i11];
            int p10 = fVar4.p(i15);
            if (p10 > i14) {
                fVar2 = fVar4;
                i14 = p10;
            }
            i11 += i10;
        }
        return fVar2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void q2(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.A
            if (r0 == 0) goto L9
            int r0 = r6.k2()
            goto Ld
        L9:
            int r0 = r6.j2()
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
            int r7 = r6.j2()
            goto L51
        L4d:
            int r7 = r6.k2()
        L51:
            if (r3 > r7) goto L56
            r6.t1()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.q2(int, int, int):void");
    }

    private void u2(View view, int i10, int i11, boolean z10) {
        j(view, this.K);
        c cVar = (c) view.getLayoutParams();
        int i12 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.K;
        int R2 = R2(i10, i12 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i13 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.K;
        int R22 = R2(i11, i13 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z10 ? H1(view, R2, R22, cVar) : F1(view, R2, R22, cVar)) {
            view.measure(R2, R22);
        }
    }

    private void v2(View view, c cVar, boolean z10) {
        int i10;
        int i11;
        if (cVar.f4642f) {
            if (this.f4629w != 1) {
                u2(view, RecyclerView.o.K(o0(), p0(), e0() + f0(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.J, z10);
                return;
            }
            i11 = this.J;
        } else if (this.f4629w != 1) {
            i11 = RecyclerView.o.K(o0(), p0(), e0() + f0(), ((ViewGroup.MarginLayoutParams) cVar).width, true);
            i10 = RecyclerView.o.K(this.f4630x, X(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false);
            u2(view, i11, i10, z10);
        } else {
            i11 = RecyclerView.o.K(this.f4630x, p0(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false);
        }
        i10 = RecyclerView.o.K(W(), X(), g0() + d0(), ((ViewGroup.MarginLayoutParams) cVar).height, true);
        u2(view, i11, i10, z10);
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x014b, code lost:
        if (S1() != false) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void w2(androidx.recyclerview.widget.RecyclerView.v r9, androidx.recyclerview.widget.RecyclerView.a0 r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.w2(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, boolean):void");
    }

    private boolean x2(int i10) {
        if (this.f4629w == 0) {
            return (i10 == -1) != this.A;
        }
        return ((i10 == -1) == this.A) == t2();
    }

    private void z2(View view) {
        for (int i10 = this.f4625s - 1; i10 >= 0; i10--) {
            this.f4626t[i10].u(view);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void C0(int i10) {
        super.C0(i10);
        for (int i11 = 0; i11 < this.f4625s; i11++) {
            this.f4626t[i11].r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void C1(Rect rect, int i10, int i11) {
        int i12;
        int i13;
        int e02 = e0() + f0();
        int g02 = g0() + d0();
        if (this.f4629w == 1) {
            i13 = RecyclerView.o.n(i11, rect.height() + g02, b0());
            i12 = RecyclerView.o.n(i10, (this.f4630x * this.f4625s) + e02, c0());
        } else {
            i12 = RecyclerView.o.n(i10, rect.width() + e02, c0());
            i13 = RecyclerView.o.n(i11, (this.f4630x * this.f4625s) + g02, b0());
        }
        B1(i12, i13);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p D() {
        return this.f4629w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void D0(int i10) {
        super.D0(i10);
        for (int i11 = 0; i11 < this.f4625s; i11++) {
            this.f4626t[i11].r(i10);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p E(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p F(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    int F2(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (J() == 0 || i10 == 0) {
            return 0;
        }
        y2(i10, a0Var);
        int b22 = b2(vVar, this.f4631y, a0Var);
        if (this.f4631y.f4774b >= b22) {
            i10 = i10 < 0 ? -b22 : b22;
        }
        this.f4627u.r(-i10);
        this.G = this.A;
        androidx.recyclerview.widget.f fVar = this.f4631y;
        fVar.f4774b = 0;
        A2(vVar, fVar);
        return i10;
    }

    public void H2(int i10) {
        if (i10 == 0 || i10 == 1) {
            g(null);
            if (i10 == this.f4629w) {
                return;
            }
            this.f4629w = i10;
            i iVar = this.f4627u;
            this.f4627u = this.f4628v;
            this.f4628v = iVar;
            t1();
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void I0(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.I0(recyclerView, vVar);
        o1(this.P);
        for (int i10 = 0; i10 < this.f4625s; i10++) {
            this.f4626t[i10].e();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void I1(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i10) {
        g gVar = new g(recyclerView.getContext());
        gVar.p(i10);
        J1(gVar);
    }

    public void I2(boolean z10) {
        g(null);
        e eVar = this.I;
        if (eVar != null && eVar.W3 != z10) {
            eVar.W3 = z10;
        }
        this.f4632z = z10;
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View J0(View view, int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        View B;
        View m10;
        if (J() == 0 || (B = B(view)) == null) {
            return null;
        }
        E2();
        int X1 = X1(i10);
        if (X1 == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) B.getLayoutParams();
        boolean z10 = cVar.f4642f;
        f fVar = cVar.f4641e;
        int k22 = X1 == 1 ? k2() : j2();
        O2(k22, a0Var);
        G2(X1);
        androidx.recyclerview.widget.f fVar2 = this.f4631y;
        fVar2.f4775c = fVar2.f4776d + k22;
        fVar2.f4774b = (int) (this.f4627u.n() * 0.33333334f);
        androidx.recyclerview.widget.f fVar3 = this.f4631y;
        fVar3.f4780h = true;
        fVar3.f4773a = false;
        b2(vVar, fVar3, a0Var);
        this.G = this.A;
        if (!z10 && (m10 = fVar.m(k22, X1)) != null && m10 != B) {
            return m10;
        }
        if (x2(X1)) {
            for (int i11 = this.f4625s - 1; i11 >= 0; i11--) {
                View m11 = this.f4626t[i11].m(k22, X1);
                if (m11 != null && m11 != B) {
                    return m11;
                }
            }
        } else {
            for (int i12 = 0; i12 < this.f4625s; i12++) {
                View m12 = this.f4626t[i12].m(k22, X1);
                if (m12 != null && m12 != B) {
                    return m12;
                }
            }
        }
        boolean z11 = (this.f4632z ^ true) == (X1 == -1);
        if (!z10) {
            View C = C(z11 ? fVar.f() : fVar.g());
            if (C != null && C != B) {
                return C;
            }
        }
        if (x2(X1)) {
            for (int i13 = this.f4625s - 1; i13 >= 0; i13--) {
                if (i13 != fVar.f4658e) {
                    f[] fVarArr = this.f4626t;
                    View C2 = C(z11 ? fVarArr[i13].f() : fVarArr[i13].g());
                    if (C2 != null && C2 != B) {
                        return C2;
                    }
                }
            }
        } else {
            for (int i14 = 0; i14 < this.f4625s; i14++) {
                f[] fVarArr2 = this.f4626t;
                View C3 = C(z11 ? fVarArr2[i14].f() : fVarArr2[i14].g());
                if (C3 != null && C3 != B) {
                    return C3;
                }
            }
        }
        return null;
    }

    public void J2(int i10) {
        g(null);
        if (i10 != this.f4625s) {
            s2();
            this.f4625s = i10;
            this.B = new BitSet(this.f4625s);
            this.f4626t = new f[this.f4625s];
            for (int i11 = 0; i11 < this.f4625s; i11++) {
                this.f4626t[i11] = new f(i11);
            }
            t1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void K0(AccessibilityEvent accessibilityEvent) {
        super.K0(accessibilityEvent);
        if (J() > 0) {
            View e22 = e2(false);
            View d22 = d2(false);
            if (e22 == null || d22 == null) {
                return;
            }
            int h02 = h0(e22);
            int h03 = h0(d22);
            if (h02 < h03) {
                accessibilityEvent.setFromIndex(h02);
                accessibilityEvent.setToIndex(h03);
                return;
            }
            accessibilityEvent.setFromIndex(h03);
            accessibilityEvent.setToIndex(h02);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean L1() {
        return this.I == null;
    }

    boolean M2(RecyclerView.a0 a0Var, b bVar) {
        int i10;
        int i11;
        int i12;
        boolean z10 = false;
        if (!a0Var.e() && (i10 = this.C) != -1) {
            if (i10 >= 0 && i10 < a0Var.b()) {
                e eVar = this.I;
                if (eVar == null || eVar.f4649c == -1 || eVar.f4651q < 1) {
                    View C = C(this.C);
                    if (C != null) {
                        bVar.f4634a = this.A ? k2() : j2();
                        if (this.D != Integer.MIN_VALUE) {
                            if (bVar.f4636c) {
                                i12 = this.f4627u.i() - this.D;
                                i11 = this.f4627u.d(C);
                            } else {
                                i12 = this.f4627u.m() + this.D;
                                i11 = this.f4627u.g(C);
                            }
                            bVar.f4635b = i12 - i11;
                            return true;
                        } else if (this.f4627u.e(C) > this.f4627u.n()) {
                            bVar.f4635b = bVar.f4636c ? this.f4627u.i() : this.f4627u.m();
                            return true;
                        } else {
                            int g10 = this.f4627u.g(C) - this.f4627u.m();
                            if (g10 < 0) {
                                bVar.f4635b = -g10;
                                return true;
                            }
                            int i13 = this.f4627u.i() - this.f4627u.d(C);
                            if (i13 < 0) {
                                bVar.f4635b = i13;
                                return true;
                            }
                            bVar.f4635b = Integer.MIN_VALUE;
                        }
                    } else {
                        int i14 = this.C;
                        bVar.f4634a = i14;
                        int i15 = this.D;
                        if (i15 == Integer.MIN_VALUE) {
                            if (R1(i14) == 1) {
                                z10 = true;
                            }
                            bVar.f4636c = z10;
                            bVar.a();
                        } else {
                            bVar.b(i15);
                        }
                        bVar.f4637d = true;
                    }
                } else {
                    bVar.f4635b = Integer.MIN_VALUE;
                    bVar.f4634a = this.C;
                }
                return true;
            }
            this.C = -1;
            this.D = Integer.MIN_VALUE;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int N(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return this.f4629w == 1 ? this.f4625s : super.N(vVar, a0Var);
    }

    void N2(RecyclerView.a0 a0Var, b bVar) {
        if (!M2(a0Var, bVar) && !L2(a0Var, bVar)) {
            bVar.a();
            bVar.f4634a = 0;
        }
    }

    boolean O1() {
        int l10 = this.f4626t[0].l(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f4625s; i10++) {
            if (this.f4626t[i10].l(Integer.MIN_VALUE) != l10) {
                return false;
            }
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void P0(RecyclerView.v vVar, RecyclerView.a0 a0Var, View view, androidx.core.view.accessibility.d dVar) {
        int i10;
        int i11;
        int i12;
        int i13;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.O0(view, dVar);
            return;
        }
        c cVar = (c) layoutParams;
        int i14 = 1;
        if (this.f4629w == 0) {
            i13 = cVar.e();
            if (cVar.f4642f) {
                i14 = this.f4625s;
            }
            i12 = i14;
            i11 = -1;
            i10 = -1;
        } else {
            i13 = -1;
            i12 = -1;
            i11 = cVar.e();
            if (cVar.f4642f) {
                i14 = this.f4625s;
            }
            i10 = i14;
        }
        dVar.a0(d.c.a(i13, i12, i11, i10, false, false));
    }

    boolean P1() {
        int p10 = this.f4626t[0].p(Integer.MIN_VALUE);
        for (int i10 = 1; i10 < this.f4625s; i10++) {
            if (this.f4626t[i10].p(Integer.MIN_VALUE) != p10) {
                return false;
            }
        }
        return true;
    }

    void P2(int i10) {
        this.f4630x = i10 / this.f4625s;
        this.J = View.MeasureSpec.makeMeasureSpec(i10, this.f4628v.k());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void R0(RecyclerView recyclerView, int i10, int i11) {
        q2(i10, i11, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void S0(RecyclerView recyclerView) {
        this.E.b();
        t1();
    }

    boolean S1() {
        int i10;
        int i11;
        if (J() == 0 || this.F == 0 || !r0()) {
            return false;
        }
        if (this.A) {
            i11 = k2();
            i10 = j2();
        } else {
            i11 = j2();
            i10 = k2();
        }
        if (i11 == 0 && r2() != null) {
            this.E.b();
        } else if (!this.M) {
            return false;
        } else {
            int i12 = this.A ? -1 : 1;
            int i13 = i10 + 1;
            d.a e10 = this.E.e(i11, i13, i12, true);
            if (e10 == null) {
                this.M = false;
                this.E.d(i13);
                return false;
            }
            d.a e11 = this.E.e(i11, e10.f4645c, i12 * (-1), true);
            if (e11 == null) {
                this.E.d(e10.f4645c);
            } else {
                this.E.d(e11.f4645c + 1);
            }
        }
        u1();
        t1();
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void T0(RecyclerView recyclerView, int i10, int i11, int i12) {
        q2(i10, i11, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void U0(RecyclerView recyclerView, int i10, int i11) {
        q2(i10, i11, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void W0(RecyclerView recyclerView, int i10, int i11, Object obj) {
        q2(i10, i11, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void X0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        w2(vVar, a0Var, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void Y0(RecyclerView.a0 a0Var) {
        super.Y0(a0Var);
        this.C = -1;
        this.D = Integer.MIN_VALUE;
        this.I = null;
        this.L.c();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF a(int i10) {
        int R1 = R1(i10);
        PointF pointF = new PointF();
        if (R1 == 0) {
            return null;
        }
        if (this.f4629w == 0) {
            pointF.x = R1;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = R1;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void c1(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.I = (e) parcelable;
            t1();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable d1() {
        int i10;
        int i11;
        int[] iArr;
        if (this.I != null) {
            return new e(this.I);
        }
        e eVar = new e();
        eVar.W3 = this.f4632z;
        eVar.X3 = this.G;
        eVar.Y3 = this.H;
        d dVar = this.E;
        if (dVar == null || (iArr = dVar.f4643a) == null) {
            eVar.f4653y = 0;
        } else {
            eVar.U3 = iArr;
            eVar.f4653y = iArr.length;
            eVar.V3 = dVar.f4644b;
        }
        if (J() > 0) {
            eVar.f4649c = this.G ? k2() : j2();
            eVar.f4650d = f2();
            int i12 = this.f4625s;
            eVar.f4651q = i12;
            eVar.f4652x = new int[i12];
            for (int i13 = 0; i13 < this.f4625s; i13++) {
                if (this.G) {
                    i10 = this.f4626t[i13].l(Integer.MIN_VALUE);
                    if (i10 != Integer.MIN_VALUE) {
                        i11 = this.f4627u.i();
                        i10 -= i11;
                        eVar.f4652x[i13] = i10;
                    } else {
                        eVar.f4652x[i13] = i10;
                    }
                } else {
                    i10 = this.f4626t[i13].p(Integer.MIN_VALUE);
                    if (i10 != Integer.MIN_VALUE) {
                        i11 = this.f4627u.m();
                        i10 -= i11;
                        eVar.f4652x[i13] = i10;
                    } else {
                        eVar.f4652x[i13] = i10;
                    }
                }
            }
        } else {
            eVar.f4649c = -1;
            eVar.f4650d = -1;
            eVar.f4651q = 0;
        }
        return eVar;
    }

    View d2(boolean z10) {
        int m10 = this.f4627u.m();
        int i10 = this.f4627u.i();
        View view = null;
        for (int J = J() - 1; J >= 0; J--) {
            View I = I(J);
            int g10 = this.f4627u.g(I);
            int d10 = this.f4627u.d(I);
            if (d10 > m10 && g10 < i10) {
                if (d10 <= i10 || !z10) {
                    return I;
                }
                if (view == null) {
                    view = I;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void e1(int i10) {
        if (i10 == 0) {
            S1();
        }
    }

    View e2(boolean z10) {
        int m10 = this.f4627u.m();
        int i10 = this.f4627u.i();
        int J = J();
        View view = null;
        for (int i11 = 0; i11 < J; i11++) {
            View I = I(i11);
            int g10 = this.f4627u.g(I);
            if (this.f4627u.d(I) > m10 && g10 < i10) {
                if (g10 >= m10 || !z10) {
                    return I;
                }
                if (view == null) {
                    view = I;
                }
            }
        }
        return view;
    }

    int f2() {
        View d22 = this.A ? d2(true) : e2(true);
        if (d22 == null) {
            return -1;
        }
        return h0(d22);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(String str) {
        if (this.I == null) {
            super.g(str);
        }
    }

    int j2() {
        if (J() == 0) {
            return 0;
        }
        return h0(I(0));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean k() {
        return this.f4629w == 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int k0(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return this.f4629w == 0 ? this.f4625s : super.k0(vVar, a0Var);
    }

    int k2() {
        int J = J();
        if (J == 0) {
            return 0;
        }
        return h0(I(J - 1));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean l() {
        return this.f4629w == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean m(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void o(int i10, int i11, RecyclerView.a0 a0Var, RecyclerView.o.c cVar) {
        int i12;
        int i13;
        if (this.f4629w != 0) {
            i10 = i11;
        }
        if (J() == 0 || i10 == 0) {
            return;
        }
        y2(i10, a0Var);
        int[] iArr = this.O;
        if (iArr == null || iArr.length < this.f4625s) {
            this.O = new int[this.f4625s];
        }
        int i14 = 0;
        for (int i15 = 0; i15 < this.f4625s; i15++) {
            androidx.recyclerview.widget.f fVar = this.f4631y;
            if (fVar.f4776d == -1) {
                i13 = fVar.f4778f;
                i12 = this.f4626t[i15].p(i13);
            } else {
                i13 = this.f4626t[i15].l(fVar.f4779g);
                i12 = this.f4631y.f4779g;
            }
            int i16 = i13 - i12;
            if (i16 >= 0) {
                this.O[i14] = i16;
                i14++;
            }
        }
        Arrays.sort(this.O, 0, i14);
        for (int i17 = 0; i17 < i14 && this.f4631y.a(a0Var); i17++) {
            cVar.a(this.f4631y.f4775c, this.O[i17]);
            androidx.recyclerview.widget.f fVar2 = this.f4631y;
            fVar2.f4775c += fVar2.f4776d;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int q(RecyclerView.a0 a0Var) {
        return U1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int r(RecyclerView.a0 a0Var) {
        return V1(a0Var);
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
    android.view.View r2() {
        /*
            r12 = this;
            int r0 = r12.J()
            r1 = 1
            int r0 = r0 - r1
            java.util.BitSet r2 = new java.util.BitSet
            int r3 = r12.f4625s
            r2.<init>(r3)
            int r3 = r12.f4625s
            r4 = 0
            r2.set(r4, r3, r1)
            int r3 = r12.f4629w
            r5 = -1
            if (r3 != r1) goto L20
            boolean r3 = r12.t2()
            if (r3 == 0) goto L20
            r3 = r1
            goto L21
        L20:
            r3 = r5
        L21:
            boolean r6 = r12.A
            if (r6 == 0) goto L27
            r6 = r5
            goto L2b
        L27:
            int r0 = r0 + 1
            r6 = r0
            r0 = r4
        L2b:
            if (r0 >= r6) goto L2e
            r5 = r1
        L2e:
            if (r0 == r6) goto Lab
            android.view.View r7 = r12.I(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f4641e
            int r9 = r9.f4658e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f4641e
            boolean r9 = r12.T1(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.f4641e
            int r9 = r9.f4658e
            r2.clear(r9)
        L54:
            boolean r9 = r8.f4642f
            if (r9 == 0) goto L59
            goto La9
        L59:
            int r9 = r0 + r5
            if (r9 == r6) goto La9
            android.view.View r9 = r12.I(r9)
            boolean r10 = r12.A
            if (r10 == 0) goto L77
            androidx.recyclerview.widget.i r10 = r12.f4627u
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.i r11 = r12.f4627u
            int r11 = r11.d(r9)
            if (r10 >= r11) goto L74
            return r7
        L74:
            if (r10 != r11) goto L8a
            goto L88
        L77:
            androidx.recyclerview.widget.i r10 = r12.f4627u
            int r10 = r10.g(r7)
            androidx.recyclerview.widget.i r11 = r12.f4627u
            int r11 = r11.g(r9)
            if (r10 <= r11) goto L86
            return r7
        L86:
            if (r10 != r11) goto L8a
        L88:
            r10 = r1
            goto L8b
        L8a:
            r10 = r4
        L8b:
            if (r10 == 0) goto La9
            android.view.ViewGroup$LayoutParams r9 = r9.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r9 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r9
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.f4641e
            int r8 = r8.f4658e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.f4641e
            int r9 = r9.f4658e
            int r8 = r8 - r9
            if (r8 >= 0) goto La0
            r8 = r1
            goto La1
        La0:
            r8 = r4
        La1:
            if (r3 >= 0) goto La5
            r9 = r1
            goto La6
        La5:
            r9 = r4
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.r2():android.view.View");
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int s(RecyclerView.a0 a0Var) {
        return W1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean s0() {
        return this.F != 0;
    }

    public void s2() {
        this.E.b();
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int t(RecyclerView.a0 a0Var) {
        return U1(a0Var);
    }

    boolean t2() {
        return Z() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int u(RecyclerView.a0 a0Var) {
        return V1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int v(RecyclerView.a0 a0Var) {
        return W1(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int w1(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return F2(i10, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void x1(int i10) {
        e eVar = this.I;
        if (eVar != null && eVar.f4649c != i10) {
            eVar.a();
        }
        this.C = i10;
        this.D = Integer.MIN_VALUE;
        t1();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int y1(int i10, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return F2(i10, vVar, a0Var);
    }

    void y2(int i10, RecyclerView.a0 a0Var) {
        int i11;
        int i12;
        if (i10 > 0) {
            i12 = k2();
            i11 = 1;
        } else {
            i11 = -1;
            i12 = j2();
        }
        this.f4631y.f4773a = true;
        O2(i12, a0Var);
        G2(i11);
        androidx.recyclerview.widget.f fVar = this.f4631y;
        fVar.f4775c = i12 + fVar.f4776d;
        fVar.f4774b = Math.abs(i10);
    }
}
