package androidx.recyclerview.widget;

import a.g.l.d0.c;
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
    j u;
    j v;
    private int w;
    private int x;
    private int s = -1;
    boolean z = false;
    boolean A = false;
    int C = -1;
    int D = RecyclerView.UNDEFINED_DURATION;
    d E = new d();
    private int F = 2;
    private final Rect K = new Rect();
    private final b L = new b();
    private boolean M = false;
    private boolean N = true;
    private final Runnable P = new a();
    private final androidx.recyclerview.widget.f y = new androidx.recyclerview.widget.f();

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
            StaggeredGridLayoutManager.this = r1;
        }

        @Override // java.lang.Runnable
        public void run() {
            StaggeredGridLayoutManager.this.G();
        }
    }

    /* loaded from: classes.dex */
    public class b {

        /* renamed from: a */
        int f1062a;

        /* renamed from: b */
        int f1063b;

        /* renamed from: c */
        boolean f1064c;
        boolean d;
        boolean e;
        int[] f;

        b() {
            StaggeredGridLayoutManager.this = r1;
            b();
        }

        void a() {
            this.f1063b = this.f1064c ? StaggeredGridLayoutManager.this.u.b() : StaggeredGridLayoutManager.this.u.f();
        }

        void a(int i) {
            this.f1063b = this.f1064c ? StaggeredGridLayoutManager.this.u.b() - i : StaggeredGridLayoutManager.this.u.f() + i;
        }

        void a(f[] fVarArr) {
            int length = fVarArr.length;
            int[] iArr = this.f;
            if (iArr == null || iArr.length < length) {
                this.f = new int[StaggeredGridLayoutManager.this.t.length];
            }
            for (int i = 0; i < length; i++) {
                this.f[i] = fVarArr[i].b(RecyclerView.UNDEFINED_DURATION);
            }
        }

        void b() {
            this.f1062a = -1;
            this.f1063b = RecyclerView.UNDEFINED_DURATION;
            this.f1064c = false;
            this.d = false;
            this.e = false;
            int[] iArr = this.f;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class c extends RecyclerView.p {
        f e;
        boolean f;

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
            f fVar = this.e;
            if (fVar == null) {
                return -1;
            }
            return fVar.e;
        }

        public boolean f() {
            return this.f;
        }
    }

    /* loaded from: classes.dex */
    public static class d {

        /* renamed from: a */
        int[] f1065a;

        /* renamed from: b */
        List<a> f1066b;

        @SuppressLint({"BanParcelableUsage"})
        /* loaded from: classes.dex */
        public static class a implements Parcelable {
            public static final Parcelable.Creator<a> CREATOR = new C0042a();

            /* renamed from: b */
            int f1067b;

            /* renamed from: c */
            int f1068c;
            int[] d;
            boolean e;

            /* renamed from: androidx.recyclerview.widget.StaggeredGridLayoutManager$d$a$a */
            /* loaded from: classes.dex */
            static class C0042a implements Parcelable.Creator<a> {
                C0042a() {
                }

                @Override // android.os.Parcelable.Creator
                public a createFromParcel(Parcel parcel) {
                    return new a(parcel);
                }

                @Override // android.os.Parcelable.Creator
                public a[] newArray(int i) {
                    return new a[i];
                }
            }

            a() {
            }

            a(Parcel parcel) {
                this.f1067b = parcel.readInt();
                this.f1068c = parcel.readInt();
                this.e = parcel.readInt() != 1 ? false : true;
                int readInt = parcel.readInt();
                if (readInt > 0) {
                    int[] iArr = new int[readInt];
                    this.d = iArr;
                    parcel.readIntArray(iArr);
                }
            }

            int a(int i) {
                int[] iArr = this.d;
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
                return "FullSpanItem{mPosition=" + this.f1067b + ", mGapDir=" + this.f1068c + ", mHasUnwantedGapAfter=" + this.e + ", mGapPerSpan=" + Arrays.toString(this.d) + '}';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(Parcel parcel, int i) {
                parcel.writeInt(this.f1067b);
                parcel.writeInt(this.f1068c);
                parcel.writeInt(this.e ? 1 : 0);
                int[] iArr = this.d;
                if (iArr == null || iArr.length <= 0) {
                    parcel.writeInt(0);
                    return;
                }
                parcel.writeInt(iArr.length);
                parcel.writeIntArray(this.d);
            }
        }

        d() {
        }

        private void c(int i, int i2) {
            List<a> list = this.f1066b;
            if (list == null) {
                return;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f1066b.get(size);
                int i3 = aVar.f1067b;
                if (i3 >= i) {
                    aVar.f1067b = i3 + i2;
                }
            }
        }

        private void d(int i, int i2) {
            List<a> list = this.f1066b;
            if (list == null) {
                return;
            }
            int i3 = i + i2;
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f1066b.get(size);
                int i4 = aVar.f1067b;
                if (i4 >= i) {
                    if (i4 < i3) {
                        this.f1066b.remove(size);
                    } else {
                        aVar.f1067b = i4 - i2;
                    }
                }
            }
        }

        private int g(int i) {
            if (this.f1066b == null) {
                return -1;
            }
            a c2 = c(i);
            if (c2 != null) {
                this.f1066b.remove(c2);
            }
            int size = this.f1066b.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    i2 = -1;
                    break;
                } else if (this.f1066b.get(i2).f1067b >= i) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 == -1) {
                return -1;
            }
            this.f1066b.remove(i2);
            return this.f1066b.get(i2).f1067b;
        }

        public a a(int i, int i2, int i3, boolean z) {
            List<a> list = this.f1066b;
            if (list == null) {
                return null;
            }
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                a aVar = this.f1066b.get(i4);
                int i5 = aVar.f1067b;
                if (i5 >= i2) {
                    return null;
                }
                if (i5 >= i && (i3 == 0 || aVar.f1068c == i3 || (z && aVar.e))) {
                    return aVar;
                }
            }
            return null;
        }

        void a() {
            int[] iArr = this.f1065a;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f1066b = null;
        }

        void a(int i) {
            int[] iArr = this.f1065a;
            if (iArr == null) {
                int[] iArr2 = new int[Math.max(i, 10) + 1];
                this.f1065a = iArr2;
                Arrays.fill(iArr2, -1);
            } else if (i < iArr.length) {
            } else {
                int[] iArr3 = new int[f(i)];
                this.f1065a = iArr3;
                System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                int[] iArr4 = this.f1065a;
                Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
            }
        }

        void a(int i, int i2) {
            int[] iArr = this.f1065a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            a(i3);
            int[] iArr2 = this.f1065a;
            System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
            Arrays.fill(this.f1065a, i, i3, -1);
            c(i, i2);
        }

        void a(int i, f fVar) {
            a(i);
            this.f1065a[i] = fVar.e;
        }

        public void a(a aVar) {
            if (this.f1066b == null) {
                this.f1066b = new ArrayList();
            }
            int size = this.f1066b.size();
            for (int i = 0; i < size; i++) {
                a aVar2 = this.f1066b.get(i);
                if (aVar2.f1067b == aVar.f1067b) {
                    this.f1066b.remove(i);
                }
                if (aVar2.f1067b >= aVar.f1067b) {
                    this.f1066b.add(i, aVar);
                    return;
                }
            }
            this.f1066b.add(aVar);
        }

        int b(int i) {
            List<a> list = this.f1066b;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    if (this.f1066b.get(size).f1067b >= i) {
                        this.f1066b.remove(size);
                    }
                }
            }
            return e(i);
        }

        void b(int i, int i2) {
            int[] iArr = this.f1065a;
            if (iArr == null || i >= iArr.length) {
                return;
            }
            int i3 = i + i2;
            a(i3);
            int[] iArr2 = this.f1065a;
            System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
            int[] iArr3 = this.f1065a;
            Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
            d(i, i2);
        }

        public a c(int i) {
            List<a> list = this.f1066b;
            if (list == null) {
                return null;
            }
            for (int size = list.size() - 1; size >= 0; size--) {
                a aVar = this.f1066b.get(size);
                if (aVar.f1067b == i) {
                    return aVar;
                }
            }
            return null;
        }

        int d(int i) {
            int[] iArr = this.f1065a;
            if (iArr == null || i >= iArr.length) {
                return -1;
            }
            return iArr[i];
        }

        int e(int i) {
            int[] iArr = this.f1065a;
            if (iArr != null && i < iArr.length) {
                int g = g(i);
                if (g == -1) {
                    int[] iArr2 = this.f1065a;
                    Arrays.fill(iArr2, i, iArr2.length, -1);
                    return this.f1065a.length;
                }
                int i2 = g + 1;
                Arrays.fill(this.f1065a, i, i2, -1);
                return i2;
            }
            return -1;
        }

        int f(int i) {
            int length = this.f1065a.length;
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
        int f1069b;

        /* renamed from: c */
        int f1070c;
        int d;
        int[] e;
        int f;
        int[] g;
        List<d.a> h;
        boolean i;
        boolean j;
        boolean k;

        /* loaded from: classes.dex */
        static class a implements Parcelable.Creator<e> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public e[] newArray(int i) {
                return new e[i];
            }
        }

        public e() {
        }

        e(Parcel parcel) {
            this.f1069b = parcel.readInt();
            this.f1070c = parcel.readInt();
            int readInt = parcel.readInt();
            this.d = readInt;
            if (readInt > 0) {
                int[] iArr = new int[readInt];
                this.e = iArr;
                parcel.readIntArray(iArr);
            }
            int readInt2 = parcel.readInt();
            this.f = readInt2;
            if (readInt2 > 0) {
                int[] iArr2 = new int[readInt2];
                this.g = iArr2;
                parcel.readIntArray(iArr2);
            }
            boolean z = false;
            this.i = parcel.readInt() == 1;
            this.j = parcel.readInt() == 1;
            this.k = parcel.readInt() == 1 ? true : z;
            this.h = parcel.readArrayList(d.a.class.getClassLoader());
        }

        public e(e eVar) {
            this.d = eVar.d;
            this.f1069b = eVar.f1069b;
            this.f1070c = eVar.f1070c;
            this.e = eVar.e;
            this.f = eVar.f;
            this.g = eVar.g;
            this.i = eVar.i;
            this.j = eVar.j;
            this.k = eVar.k;
            this.h = eVar.h;
        }

        void d() {
            this.e = null;
            this.d = 0;
            this.f1069b = -1;
            this.f1070c = -1;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        void e() {
            this.e = null;
            this.d = 0;
            this.f = 0;
            this.g = null;
            this.h = null;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.f1069b);
            parcel.writeInt(this.f1070c);
            parcel.writeInt(this.d);
            if (this.d > 0) {
                parcel.writeIntArray(this.e);
            }
            parcel.writeInt(this.f);
            if (this.f > 0) {
                parcel.writeIntArray(this.g);
            }
            parcel.writeInt(this.i ? 1 : 0);
            parcel.writeInt(this.j ? 1 : 0);
            parcel.writeInt(this.k ? 1 : 0);
            parcel.writeList(this.h);
        }
    }

    /* loaded from: classes.dex */
    public class f {

        /* renamed from: a */
        ArrayList<View> f1071a = new ArrayList<>();

        /* renamed from: b */
        int f1072b = RecyclerView.UNDEFINED_DURATION;

        /* renamed from: c */
        int f1073c = RecyclerView.UNDEFINED_DURATION;
        int d = 0;
        final int e;

        f(int i) {
            StaggeredGridLayoutManager.this = r1;
            this.e = i;
        }

        int a(int i) {
            int i2 = this.f1073c;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f1071a.size() == 0) {
                return i;
            }
            a();
            return this.f1073c;
        }

        int a(int i, int i2, boolean z) {
            return a(i, i2, false, false, z);
        }

        int a(int i, int i2, boolean z, boolean z2, boolean z3) {
            int f = StaggeredGridLayoutManager.this.u.f();
            int b2 = StaggeredGridLayoutManager.this.u.b();
            int i3 = i2 > i ? 1 : -1;
            while (i != i2) {
                View view = this.f1071a.get(i);
                int d = StaggeredGridLayoutManager.this.u.d(view);
                int a2 = StaggeredGridLayoutManager.this.u.a(view);
                boolean z4 = false;
                boolean z5 = !z3 ? d < b2 : d <= b2;
                if (!z3 ? a2 > f : a2 >= f) {
                    z4 = true;
                }
                if (z5 && z4) {
                    if (!z || !z2) {
                        if (!z2 && d >= f && a2 <= b2) {
                        }
                        return StaggeredGridLayoutManager.this.l(view);
                    } else if (d >= f && a2 <= b2) {
                        return StaggeredGridLayoutManager.this.l(view);
                    }
                }
                i += i3;
            }
            return -1;
        }

        public View a(int i, int i2) {
            View view = null;
            if (i2 != -1) {
                int size = this.f1071a.size() - 1;
                while (size >= 0) {
                    View view2 = this.f1071a.get(size);
                    StaggeredGridLayoutManager staggeredGridLayoutManager = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager.z && staggeredGridLayoutManager.l(view2) >= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager2 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager2.z && staggeredGridLayoutManager2.l(view2) <= i) || !view2.hasFocusable()) {
                        break;
                    }
                    size--;
                    view = view2;
                }
            } else {
                int size2 = this.f1071a.size();
                int i3 = 0;
                while (i3 < size2) {
                    View view3 = this.f1071a.get(i3);
                    StaggeredGridLayoutManager staggeredGridLayoutManager3 = StaggeredGridLayoutManager.this;
                    if (staggeredGridLayoutManager3.z && staggeredGridLayoutManager3.l(view3) <= i) {
                        break;
                    }
                    StaggeredGridLayoutManager staggeredGridLayoutManager4 = StaggeredGridLayoutManager.this;
                    if ((!staggeredGridLayoutManager4.z && staggeredGridLayoutManager4.l(view3) >= i) || !view3.hasFocusable()) {
                        break;
                    }
                    i3++;
                    view = view3;
                }
            }
            return view;
        }

        void a() {
            d.a c2;
            ArrayList<View> arrayList = this.f1071a;
            View view = arrayList.get(arrayList.size() - 1);
            c b2 = b(view);
            this.f1073c = StaggeredGridLayoutManager.this.u.a(view);
            if (!b2.f || (c2 = StaggeredGridLayoutManager.this.E.c(b2.a())) == null || c2.f1068c != 1) {
                return;
            }
            this.f1073c += c2.a(this.e);
        }

        void a(View view) {
            c b2 = b(view);
            b2.e = this;
            this.f1071a.add(view);
            this.f1073c = RecyclerView.UNDEFINED_DURATION;
            if (this.f1071a.size() == 1) {
                this.f1072b = RecyclerView.UNDEFINED_DURATION;
            }
            if (b2.c() || b2.b()) {
                this.d += StaggeredGridLayoutManager.this.u.b(view);
            }
        }

        void a(boolean z, int i) {
            int a2 = z ? a(RecyclerView.UNDEFINED_DURATION) : b(RecyclerView.UNDEFINED_DURATION);
            c();
            if (a2 == Integer.MIN_VALUE) {
                return;
            }
            if (z && a2 < StaggeredGridLayoutManager.this.u.b()) {
                return;
            }
            if (!z && a2 > StaggeredGridLayoutManager.this.u.f()) {
                return;
            }
            if (i != Integer.MIN_VALUE) {
                a2 += i;
            }
            this.f1073c = a2;
            this.f1072b = a2;
        }

        int b(int i) {
            int i2 = this.f1072b;
            if (i2 != Integer.MIN_VALUE) {
                return i2;
            }
            if (this.f1071a.size() == 0) {
                return i;
            }
            b();
            return this.f1072b;
        }

        c b(View view) {
            return (c) view.getLayoutParams();
        }

        void b() {
            d.a c2;
            View view = this.f1071a.get(0);
            c b2 = b(view);
            this.f1072b = StaggeredGridLayoutManager.this.u.d(view);
            if (!b2.f || (c2 = StaggeredGridLayoutManager.this.E.c(b2.a())) == null || c2.f1068c != -1) {
                return;
            }
            this.f1072b -= c2.a(this.e);
        }

        void c() {
            this.f1071a.clear();
            i();
            this.d = 0;
        }

        void c(int i) {
            int i2 = this.f1072b;
            if (i2 != Integer.MIN_VALUE) {
                this.f1072b = i2 + i;
            }
            int i3 = this.f1073c;
            if (i3 != Integer.MIN_VALUE) {
                this.f1073c = i3 + i;
            }
        }

        void c(View view) {
            c b2 = b(view);
            b2.e = this;
            this.f1071a.add(0, view);
            this.f1072b = RecyclerView.UNDEFINED_DURATION;
            if (this.f1071a.size() == 1) {
                this.f1073c = RecyclerView.UNDEFINED_DURATION;
            }
            if (b2.c() || b2.b()) {
                this.d += StaggeredGridLayoutManager.this.u.b(view);
            }
        }

        public int d() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.z) {
                i2 = this.f1071a.size() - 1;
                i = -1;
            } else {
                i2 = 0;
                i = this.f1071a.size();
            }
            return a(i2, i, true);
        }

        void d(int i) {
            this.f1072b = i;
            this.f1073c = i;
        }

        public int e() {
            int i;
            int i2;
            if (StaggeredGridLayoutManager.this.z) {
                i2 = 0;
                i = this.f1071a.size();
            } else {
                i2 = this.f1071a.size() - 1;
                i = -1;
            }
            return a(i2, i, true);
        }

        public int f() {
            return this.d;
        }

        int g() {
            int i = this.f1073c;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            a();
            return this.f1073c;
        }

        int h() {
            int i = this.f1072b;
            if (i != Integer.MIN_VALUE) {
                return i;
            }
            b();
            return this.f1072b;
        }

        void i() {
            this.f1072b = RecyclerView.UNDEFINED_DURATION;
            this.f1073c = RecyclerView.UNDEFINED_DURATION;
        }

        void j() {
            int size = this.f1071a.size();
            View remove = this.f1071a.remove(size - 1);
            c b2 = b(remove);
            b2.e = null;
            if (b2.c() || b2.b()) {
                this.d -= StaggeredGridLayoutManager.this.u.b(remove);
            }
            if (size == 1) {
                this.f1072b = RecyclerView.UNDEFINED_DURATION;
            }
            this.f1073c = RecyclerView.UNDEFINED_DURATION;
        }

        void k() {
            View remove = this.f1071a.remove(0);
            c b2 = b(remove);
            b2.e = null;
            if (this.f1071a.size() == 0) {
                this.f1073c = RecyclerView.UNDEFINED_DURATION;
            }
            if (b2.c() || b2.b()) {
                this.d -= StaggeredGridLayoutManager.this.u.b(remove);
            }
            this.f1072b = RecyclerView.UNDEFINED_DURATION;
        }
    }

    public StaggeredGridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        RecyclerView.o.d a2 = RecyclerView.o.a(context, attributeSet, i, i2);
        j(a2.f1040a);
        k(a2.f1041b);
        c(a2.f1042c);
        N();
    }

    private void N() {
        this.u = j.a(this, this.w);
        this.v = j.a(this, 1 - this.w);
    }

    private void O() {
        if (this.v.d() == 1073741824) {
            return;
        }
        float f2 = 0.0f;
        int e2 = e();
        for (int i = 0; i < e2; i++) {
            View d2 = d(i);
            float b2 = this.v.b(d2);
            if (b2 >= f2) {
                if (((c) d2.getLayoutParams()).f()) {
                    b2 = (b2 * 1.0f) / this.s;
                }
                f2 = Math.max(f2, b2);
            }
        }
        int i2 = this.x;
        int round = Math.round(f2 * this.s);
        if (this.v.d() == Integer.MIN_VALUE) {
            round = Math.min(round, this.v.g());
        }
        l(round);
        if (this.x == i2) {
            return;
        }
        for (int i3 = 0; i3 < e2; i3++) {
            View d3 = d(i3);
            c cVar = (c) d3.getLayoutParams();
            if (!cVar.f) {
                if (!M() || this.w != 1) {
                    int i4 = cVar.e.e;
                    int i5 = this.w;
                    int i6 = (this.x * i4) - (i4 * i2);
                    if (i5 == 1) {
                        d3.offsetLeftAndRight(i6);
                    } else {
                        d3.offsetTopAndBottom(i6);
                    }
                } else {
                    int i7 = this.s;
                    int i8 = cVar.e.e;
                    d3.offsetLeftAndRight(((-((i7 - 1) - i8)) * this.x) - ((-((i7 - 1) - i8)) * i2));
                }
            }
        }
    }

    private void P() {
        this.A = (this.w == 1 || !M()) ? this.z : !this.z;
    }

    private int a(RecyclerView.v vVar, androidx.recyclerview.widget.f fVar, RecyclerView.a0 a0Var) {
        int i;
        f fVar2;
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
            i = fVar.e == 1 ? Integer.MAX_VALUE : RecyclerView.UNDEFINED_DURATION;
        } else {
            i = fVar.e == 1 ? fVar.g + fVar.f1129b : fVar.f - fVar.f1129b;
        }
        e(fVar.e, i);
        int b2 = this.A ? this.u.b() : this.u.f();
        boolean z2 = false;
        while (fVar.a(a0Var) && (this.y.i || !this.B.isEmpty())) {
            View a2 = fVar.a(vVar);
            c cVar = (c) a2.getLayoutParams();
            int a3 = cVar.a();
            int d2 = this.E.d(a3);
            boolean z3 = d2 == -1;
            if (z3) {
                if (cVar.f) {
                    f[] fVarArr = this.t;
                    char c2 = z ? 1 : 0;
                    char c3 = z ? 1 : 0;
                    fVar2 = fVarArr[c2];
                } else {
                    fVar2 = a(fVar);
                }
                this.E.a(a3, fVar2);
            } else {
                fVar2 = this.t[d2];
            }
            f fVar3 = fVar2;
            cVar.e = fVar3;
            if (fVar.e == 1) {
                b(a2);
            } else {
                int i8 = z ? 1 : 0;
                int i9 = z ? 1 : 0;
                b(a2, i8);
            }
            a(a2, cVar, z);
            if (fVar.e == 1) {
                int s = cVar.f ? s(b2) : fVar3.a(b2);
                int b3 = this.u.b(a2) + s;
                if (z3 && cVar.f) {
                    d.a o = o(s);
                    o.f1068c = -1;
                    o.f1067b = a3;
                    this.E.a(o);
                }
                i2 = b3;
                i3 = s;
            } else {
                int v = cVar.f ? v(b2) : fVar3.b(b2);
                i3 = v - this.u.b(a2);
                if (z3 && cVar.f) {
                    d.a p = p(v);
                    p.f1068c = 1;
                    p.f1067b = a3;
                    this.E.a(p);
                }
                i2 = v;
            }
            if (cVar.f && fVar.d == -1) {
                if (!z3) {
                    if (!(fVar.e == 1 ? E() : F())) {
                        d.a c4 = this.E.c(a3);
                        if (c4 != null) {
                            c4.e = true;
                        }
                    }
                }
                this.M = true;
            }
            a(a2, cVar, fVar);
            if (!M() || this.w != 1) {
                int f2 = cVar.f ? this.v.f() : (fVar3.e * this.x) + this.v.f();
                i5 = f2;
                i4 = this.v.b(a2) + f2;
            } else {
                int b4 = cVar.f ? this.v.b() : this.v.b() - (((this.s - 1) - fVar3.e) * this.x);
                i4 = b4;
                i5 = b4 - this.v.b(a2);
            }
            if (this.w == 1) {
                staggeredGridLayoutManager = this;
                view = a2;
                i7 = i5;
                i5 = i3;
                i6 = i4;
            } else {
                staggeredGridLayoutManager = this;
                view = a2;
                i7 = i3;
                i6 = i2;
                i2 = i4;
            }
            staggeredGridLayoutManager.a(view, i7, i5, i6, i2);
            if (cVar.f) {
                e(this.y.e, i);
            } else {
                a(fVar3, this.y.e, i);
            }
            a(vVar, this.y);
            if (this.y.h && a2.hasFocusable()) {
                if (cVar.f) {
                    this.B.clear();
                } else {
                    this.B.set(fVar3.e, false);
                    z2 = true;
                    z = false;
                }
            }
            z2 = true;
            z = false;
        }
        if (!z2) {
            a(vVar, this.y);
        }
        int f3 = this.y.e == -1 ? this.u.f() - v(this.u.f()) : s(this.u.b()) - this.u.b();
        if (f3 > 0) {
            return Math.min(fVar.f1129b, f3);
        }
        return 0;
    }

    private f a(androidx.recyclerview.widget.f fVar) {
        int i;
        int i2;
        int i3 = -1;
        if (w(fVar.e)) {
            i2 = this.s - 1;
            i = -1;
        } else {
            i2 = 0;
            i3 = this.s;
            i = 1;
        }
        f fVar2 = null;
        if (fVar.e == 1) {
            int i4 = Integer.MAX_VALUE;
            int f2 = this.u.f();
            while (i2 != i3) {
                f fVar3 = this.t[i2];
                int a2 = fVar3.a(f2);
                if (a2 < i4) {
                    fVar2 = fVar3;
                    i4 = a2;
                }
                i2 += i;
            }
            return fVar2;
        }
        int i5 = RecyclerView.UNDEFINED_DURATION;
        int b2 = this.u.b();
        while (i2 != i3) {
            f fVar4 = this.t[i2];
            int b3 = fVar4.b(b2);
            if (b3 > i5) {
                fVar2 = fVar4;
                i5 = b3;
            }
            i2 += i;
        }
        return fVar2;
    }

    private void a(View view, int i, int i2, boolean z) {
        a(view, this.K);
        c cVar = (c) view.getLayoutParams();
        int i3 = ((ViewGroup.MarginLayoutParams) cVar).leftMargin;
        Rect rect = this.K;
        int c2 = c(i, i3 + rect.left, ((ViewGroup.MarginLayoutParams) cVar).rightMargin + rect.right);
        int i4 = ((ViewGroup.MarginLayoutParams) cVar).topMargin;
        Rect rect2 = this.K;
        int c3 = c(i2, i4 + rect2.top, ((ViewGroup.MarginLayoutParams) cVar).bottomMargin + rect2.bottom);
        if (z ? b(view, c2, c3, cVar) : a(view, c2, c3, cVar)) {
            view.measure(c2, c3);
        }
    }

    private void a(View view, c cVar, androidx.recyclerview.widget.f fVar) {
        if (fVar.e == 1) {
            if (cVar.f) {
                p(view);
            } else {
                cVar.e.a(view);
            }
        } else if (cVar.f) {
            q(view);
        } else {
            cVar.e.c(view);
        }
    }

    private void a(View view, c cVar, boolean z) {
        int i;
        int i2;
        if (cVar.f) {
            if (this.w != 1) {
                a(view, RecyclerView.o.a(r(), s(), o() + p(), ((ViewGroup.MarginLayoutParams) cVar).width, true), this.J, z);
                return;
            }
            i2 = this.J;
        } else if (this.w != 1) {
            i2 = RecyclerView.o.a(r(), s(), o() + p(), ((ViewGroup.MarginLayoutParams) cVar).width, true);
            i = RecyclerView.o.a(this.x, i(), 0, ((ViewGroup.MarginLayoutParams) cVar).height, false);
            a(view, i2, i, z);
        } else {
            i2 = RecyclerView.o.a(this.x, s(), 0, ((ViewGroup.MarginLayoutParams) cVar).width, false);
        }
        i = RecyclerView.o.a(h(), i(), q() + n(), ((ViewGroup.MarginLayoutParams) cVar).height, true);
        a(view, i2, i, z);
    }

    private void a(RecyclerView.v vVar, int i) {
        for (int e2 = e() - 1; e2 >= 0; e2--) {
            View d2 = d(e2);
            if (this.u.d(d2) < i || this.u.f(d2) < i) {
                return;
            }
            c cVar = (c) d2.getLayoutParams();
            if (cVar.f) {
                for (int i2 = 0; i2 < this.s; i2++) {
                    if (this.t[i2].f1071a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.s; i3++) {
                    this.t[i3].j();
                }
            } else if (cVar.e.f1071a.size() == 1) {
                return;
            } else {
                cVar.e.j();
            }
            a(d2, vVar);
        }
    }

    private void a(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int b2;
        int s = s(RecyclerView.UNDEFINED_DURATION);
        if (s != Integer.MIN_VALUE && (b2 = this.u.b() - s) > 0) {
            int i = b2 - (-c(-b2, vVar, a0Var));
            if (!z || i <= 0) {
                return;
            }
            this.u.a(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0010, code lost:
        if (r4.e == (-1)) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(androidx.recyclerview.widget.RecyclerView.v r3, androidx.recyclerview.widget.f r4) {
        /*
            r2 = this;
            boolean r0 = r4.f1128a
            if (r0 == 0) goto L4d
            boolean r0 = r4.i
            if (r0 == 0) goto L9
            goto L4d
        L9:
            int r0 = r4.f1129b
            r1 = -1
            if (r0 != 0) goto L1e
            int r0 = r4.e
            if (r0 != r1) goto L18
        L12:
            int r4 = r4.g
        L14:
            r2.a(r3, r4)
            goto L4d
        L18:
            int r4 = r4.f
        L1a:
            r2.b(r3, r4)
            goto L4d
        L1e:
            int r0 = r4.e
            if (r0 != r1) goto L37
            int r0 = r4.f
            int r1 = r2.t(r0)
            int r0 = r0 - r1
            if (r0 >= 0) goto L2c
            goto L12
        L2c:
            int r1 = r4.g
            int r4 = r4.f1129b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r1 - r4
            goto L14
        L37:
            int r0 = r4.g
            int r0 = r2.u(r0)
            int r1 = r4.g
            int r0 = r0 - r1
            if (r0 >= 0) goto L43
            goto L18
        L43:
            int r1 = r4.f
            int r4 = r4.f1129b
            int r4 = java.lang.Math.min(r0, r4)
            int r4 = r4 + r1
            goto L1a
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.a(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.f):void");
    }

    private void a(b bVar) {
        boolean z;
        e eVar = this.I;
        int i = eVar.d;
        if (i > 0) {
            if (i == this.s) {
                for (int i2 = 0; i2 < this.s; i2++) {
                    this.t[i2].c();
                    e eVar2 = this.I;
                    int i3 = eVar2.e[i2];
                    if (i3 != Integer.MIN_VALUE) {
                        i3 += eVar2.j ? this.u.b() : this.u.f();
                    }
                    this.t[i2].d(i3);
                }
            } else {
                eVar.e();
                e eVar3 = this.I;
                eVar3.f1069b = eVar3.f1070c;
            }
        }
        e eVar4 = this.I;
        this.H = eVar4.k;
        c(eVar4.i);
        P();
        e eVar5 = this.I;
        int i4 = eVar5.f1069b;
        if (i4 != -1) {
            this.C = i4;
            z = eVar5.j;
        } else {
            z = this.A;
        }
        bVar.f1064c = z;
        e eVar6 = this.I;
        if (eVar6.f > 1) {
            d dVar = this.E;
            dVar.f1065a = eVar6.g;
            dVar.f1066b = eVar6.h;
        }
    }

    private void a(f fVar, int i, int i2) {
        int f2 = fVar.f();
        if (i == -1) {
            if (fVar.h() + f2 > i2) {
                return;
            }
        } else if (fVar.g() - f2 < i2) {
            return;
        }
        this.B.set(fVar.e, false);
    }

    private boolean a(f fVar) {
        if (this.A) {
            if (fVar.g() < this.u.b()) {
                ArrayList<View> arrayList = fVar.f1071a;
                return !fVar.b(arrayList.get(arrayList.size() - 1)).f;
            }
        } else if (fVar.h() > this.u.f()) {
            return !fVar.b(fVar.f1071a.get(0)).f;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.A
            if (r0 == 0) goto L9
            int r0 = r6.J()
            goto Ld
        L9:
            int r0 = r6.I()
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
            r4.e(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.b(r7, r4)
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r7 = r6.E
            r7.a(r8, r4)
            goto L41
        L36:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.b(r7, r8)
            goto L41
        L3c:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$d r9 = r6.E
            r9.a(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.A
            if (r7 == 0) goto L4d
            int r7 = r6.I()
            goto L51
        L4d:
            int r7 = r6.J()
        L51:
            if (r3 > r7) goto L56
            r6.z()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.b(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void b(int r5, androidx.recyclerview.widget.RecyclerView.a0 r6) {
        /*
            r4 = this;
            androidx.recyclerview.widget.f r0 = r4.y
            r1 = 0
            r0.f1129b = r1
            r0.f1130c = r5
            boolean r0 = r4.x()
            r2 = 1
            if (r0 == 0) goto L2e
            int r6 = r6.b()
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
            androidx.recyclerview.widget.j r5 = r4.u
            int r5 = r5.g()
            goto L2f
        L25:
            androidx.recyclerview.widget.j r5 = r4.u
            int r5 = r5.g()
            r6 = r5
            r5 = 0
            goto L30
        L2e:
            r5 = 0
        L2f:
            r6 = 0
        L30:
            boolean r0 = r4.f()
            if (r0 == 0) goto L4d
            androidx.recyclerview.widget.f r0 = r4.y
            androidx.recyclerview.widget.j r3 = r4.u
            int r3 = r3.f()
            int r3 = r3 - r6
            r0.f = r3
            androidx.recyclerview.widget.f r6 = r4.y
            androidx.recyclerview.widget.j r0 = r4.u
            int r0 = r0.b()
            int r0 = r0 + r5
            r6.g = r0
            goto L5d
        L4d:
            androidx.recyclerview.widget.f r0 = r4.y
            androidx.recyclerview.widget.j r3 = r4.u
            int r3 = r3.a()
            int r3 = r3 + r5
            r0.g = r3
            androidx.recyclerview.widget.f r5 = r4.y
            int r6 = -r6
            r5.f = r6
        L5d:
            androidx.recyclerview.widget.f r5 = r4.y
            r5.h = r1
            r5.f1128a = r2
            androidx.recyclerview.widget.j r6 = r4.u
            int r6 = r6.d()
            if (r6 != 0) goto L74
            androidx.recyclerview.widget.j r6 = r4.u
            int r6 = r6.a()
            if (r6 != 0) goto L74
            r1 = 1
        L74:
            r5.i = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.b(int, androidx.recyclerview.widget.RecyclerView$a0):void");
    }

    private void b(RecyclerView.v vVar, int i) {
        while (e() > 0) {
            View d2 = d(0);
            if (this.u.a(d2) > i || this.u.e(d2) > i) {
                return;
            }
            c cVar = (c) d2.getLayoutParams();
            if (cVar.f) {
                for (int i2 = 0; i2 < this.s; i2++) {
                    if (this.t[i2].f1071a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.s; i3++) {
                    this.t[i3].k();
                }
            } else if (cVar.e.f1071a.size() == 1) {
                return;
            } else {
                cVar.e.k();
            }
            a(d2, vVar);
        }
    }

    private void b(RecyclerView.v vVar, RecyclerView.a0 a0Var, boolean z) {
        int f2;
        int v = v(Integer.MAX_VALUE);
        if (v != Integer.MAX_VALUE && (f2 = v - this.u.f()) > 0) {
            int c2 = f2 - c(f2, vVar, a0Var);
            if (!z || c2 <= 0) {
                return;
            }
            this.u.a(-c2);
        }
    }

    private int c(int i, int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return i;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:85:0x014b, code lost:
        if (G() != false) goto L87;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void c(androidx.recyclerview.widget.RecyclerView.v r9, androidx.recyclerview.widget.RecyclerView.a0 r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.c(androidx.recyclerview.widget.RecyclerView$v, androidx.recyclerview.widget.RecyclerView$a0, boolean):void");
    }

    private boolean c(RecyclerView.a0 a0Var, b bVar) {
        boolean z = this.G;
        int a2 = a0Var.a();
        bVar.f1062a = z ? r(a2) : q(a2);
        bVar.f1063b = RecyclerView.UNDEFINED_DURATION;
        return true;
    }

    private void e(int i, int i2) {
        for (int i3 = 0; i3 < this.s; i3++) {
            if (!this.t[i3].f1071a.isEmpty()) {
                a(this.t[i3], i, i2);
            }
        }
    }

    private int h(RecyclerView.a0 a0Var) {
        if (e() == 0) {
            return 0;
        }
        return l.a(a0Var, this.u, b(!this.N), a(!this.N), this, this.N);
    }

    private int i(RecyclerView.a0 a0Var) {
        if (e() == 0) {
            return 0;
        }
        return l.a(a0Var, this.u, b(!this.N), a(!this.N), this, this.N, this.A);
    }

    private int j(RecyclerView.a0 a0Var) {
        if (e() == 0) {
            return 0;
        }
        return l.b(a0Var, this.u, b(!this.N), a(!this.N), this, this.N);
    }

    private int m(int i) {
        if (e() == 0) {
            return this.A ? 1 : -1;
        }
        return (i < I()) != this.A ? -1 : 1;
    }

    private int n(int i) {
        if (i == 1) {
            return (this.w != 1 && M()) ? 1 : -1;
        } else if (i == 2) {
            return (this.w != 1 && M()) ? -1 : 1;
        } else if (i == 17) {
            if (this.w != 0) {
                return RecyclerView.UNDEFINED_DURATION;
            }
            return -1;
        } else if (i == 33) {
            if (this.w != 1) {
                return RecyclerView.UNDEFINED_DURATION;
            }
            return -1;
        } else if (i == 66) {
            if (this.w != 0) {
                return RecyclerView.UNDEFINED_DURATION;
            }
            return 1;
        } else if (i != 130 || this.w != 1) {
            return RecyclerView.UNDEFINED_DURATION;
        } else {
            return 1;
        }
    }

    private d.a o(int i) {
        d.a aVar = new d.a();
        aVar.d = new int[this.s];
        for (int i2 = 0; i2 < this.s; i2++) {
            aVar.d[i2] = i - this.t[i2].a(i);
        }
        return aVar;
    }

    private d.a p(int i) {
        d.a aVar = new d.a();
        aVar.d = new int[this.s];
        for (int i2 = 0; i2 < this.s; i2++) {
            aVar.d[i2] = this.t[i2].b(i) - i;
        }
        return aVar;
    }

    private void p(View view) {
        for (int i = this.s - 1; i >= 0; i--) {
            this.t[i].a(view);
        }
    }

    private int q(int i) {
        int e2 = e();
        for (int i2 = 0; i2 < e2; i2++) {
            int l = l(d(i2));
            if (l >= 0 && l < i) {
                return l;
            }
        }
        return 0;
    }

    private void q(View view) {
        for (int i = this.s - 1; i >= 0; i--) {
            this.t[i].c(view);
        }
    }

    private int r(int i) {
        for (int e2 = e() - 1; e2 >= 0; e2--) {
            int l = l(d(e2));
            if (l >= 0 && l < i) {
                return l;
            }
        }
        return 0;
    }

    private int s(int i) {
        int a2 = this.t[0].a(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int a3 = this.t[i2].a(i);
            if (a3 > a2) {
                a2 = a3;
            }
        }
        return a2;
    }

    private int t(int i) {
        int b2 = this.t[0].b(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int b3 = this.t[i2].b(i);
            if (b3 > b2) {
                b2 = b3;
            }
        }
        return b2;
    }

    private int u(int i) {
        int a2 = this.t[0].a(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int a3 = this.t[i2].a(i);
            if (a3 < a2) {
                a2 = a3;
            }
        }
        return a2;
    }

    private int v(int i) {
        int b2 = this.t[0].b(i);
        for (int i2 = 1; i2 < this.s; i2++) {
            int b3 = this.t[i2].b(i);
            if (b3 < b2) {
                b2 = b3;
            }
        }
        return b2;
    }

    private boolean w(int i) {
        if (this.w == 0) {
            return (i == -1) != this.A;
        }
        return ((i == -1) == this.A) == M();
    }

    private void x(int i) {
        androidx.recyclerview.widget.f fVar = this.y;
        fVar.e = i;
        int i2 = 1;
        if (this.A != (i == -1)) {
            i2 = -1;
        }
        fVar.d = i2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean D() {
        return this.I == null;
    }

    boolean E() {
        int a2 = this.t[0].a(RecyclerView.UNDEFINED_DURATION);
        for (int i = 1; i < this.s; i++) {
            if (this.t[i].a(RecyclerView.UNDEFINED_DURATION) != a2) {
                return false;
            }
        }
        return true;
    }

    boolean F() {
        int b2 = this.t[0].b(RecyclerView.UNDEFINED_DURATION);
        for (int i = 1; i < this.s; i++) {
            if (this.t[i].b(RecyclerView.UNDEFINED_DURATION) != b2) {
                return false;
            }
        }
        return true;
    }

    boolean G() {
        int i;
        int i2;
        if (e() == 0 || this.F == 0 || !u()) {
            return false;
        }
        if (this.A) {
            i2 = J();
            i = I();
        } else {
            i2 = I();
            i = J();
        }
        if (i2 == 0 && K() != null) {
            this.E.a();
        } else if (!this.M) {
            return false;
        } else {
            int i3 = this.A ? -1 : 1;
            int i4 = i + 1;
            d.a a2 = this.E.a(i2, i4, i3, true);
            if (a2 == null) {
                this.M = false;
                this.E.b(i4);
                return false;
            }
            d.a a3 = this.E.a(i2, a2.f1067b, i3 * (-1), true);
            if (a3 == null) {
                this.E.b(a2.f1067b);
            } else {
                this.E.b(a3.f1067b + 1);
            }
        }
        A();
        z();
        return true;
    }

    int H() {
        View a2 = this.A ? a(true) : b(true);
        if (a2 == null) {
            return -1;
        }
        return l(a2);
    }

    int I() {
        if (e() == 0) {
            return 0;
        }
        return l(d(0));
    }

    int J() {
        int e2 = e();
        if (e2 == 0) {
            return 0;
        }
        return l(d(e2 - 1));
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
    android.view.View K() {
        /*
            r12 = this;
            int r0 = r12.e()
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
            boolean r3 = r12.M()
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
            android.view.View r7 = r12.d(r0)
            android.view.ViewGroup$LayoutParams r8 = r7.getLayoutParams()
            androidx.recyclerview.widget.StaggeredGridLayoutManager$c r8 = (androidx.recyclerview.widget.StaggeredGridLayoutManager.c) r8
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.e
            int r9 = r9.e
            boolean r9 = r2.get(r9)
            if (r9 == 0) goto L54
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.e
            boolean r9 = r12.a(r9)
            if (r9 == 0) goto L4d
            return r7
        L4d:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r8.e
            int r9 = r9.e
            r2.clear(r9)
        L54:
            boolean r9 = r8.f
            if (r9 == 0) goto L59
            goto La9
        L59:
            int r9 = r0 + r5
            if (r9 == r6) goto La9
            android.view.View r9 = r12.d(r9)
            boolean r10 = r12.A
            if (r10 == 0) goto L77
            androidx.recyclerview.widget.j r10 = r12.u
            int r10 = r10.a(r7)
            androidx.recyclerview.widget.j r11 = r12.u
            int r11 = r11.a(r9)
            if (r10 >= r11) goto L74
            return r7
        L74:
            if (r10 != r11) goto L8a
            goto L88
        L77:
            androidx.recyclerview.widget.j r10 = r12.u
            int r10 = r10.d(r7)
            androidx.recyclerview.widget.j r11 = r12.u
            int r11 = r11.d(r9)
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
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r8 = r8.e
            int r8 = r8.e
            androidx.recyclerview.widget.StaggeredGridLayoutManager$f r9 = r9.e
            int r9 = r9.e
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.StaggeredGridLayoutManager.K():android.view.View");
    }

    public void L() {
        this.E.a();
        z();
    }

    boolean M() {
        return k() == 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int a(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return c(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int a(RecyclerView.a0 a0Var) {
        return h(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int a(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return this.w == 1 ? this.s : super.a(vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.z.b
    public PointF a(int i) {
        int m = m(i);
        PointF pointF = new PointF();
        if (m == 0) {
            return null;
        }
        if (this.w == 0) {
            pointF.x = m;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = m;
        }
        return pointF;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public View a(View view, int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        View c2;
        View a2;
        if (e() == 0 || (c2 = c(view)) == null) {
            return null;
        }
        P();
        int n = n(i);
        if (n == Integer.MIN_VALUE) {
            return null;
        }
        c cVar = (c) c2.getLayoutParams();
        boolean z = cVar.f;
        f fVar = cVar.e;
        int J = n == 1 ? J() : I();
        b(J, a0Var);
        x(n);
        androidx.recyclerview.widget.f fVar2 = this.y;
        fVar2.f1130c = fVar2.d + J;
        fVar2.f1129b = (int) (this.u.g() * 0.33333334f);
        androidx.recyclerview.widget.f fVar3 = this.y;
        fVar3.h = true;
        fVar3.f1128a = false;
        a(vVar, fVar3, a0Var);
        this.G = this.A;
        if (!z && (a2 = fVar.a(J, n)) != null && a2 != c2) {
            return a2;
        }
        if (w(n)) {
            for (int i2 = this.s - 1; i2 >= 0; i2--) {
                View a3 = this.t[i2].a(J, n);
                if (a3 != null && a3 != c2) {
                    return a3;
                }
            }
        } else {
            for (int i3 = 0; i3 < this.s; i3++) {
                View a4 = this.t[i3].a(J, n);
                if (a4 != null && a4 != c2) {
                    return a4;
                }
            }
        }
        boolean z2 = (this.z ^ true) == (n == -1);
        if (!z) {
            View c3 = c(z2 ? fVar.d() : fVar.e());
            if (c3 != null && c3 != c2) {
                return c3;
            }
        }
        if (w(n)) {
            for (int i4 = this.s - 1; i4 >= 0; i4--) {
                if (i4 != fVar.e) {
                    f[] fVarArr = this.t;
                    View c4 = c(z2 ? fVarArr[i4].d() : fVarArr[i4].e());
                    if (c4 != null && c4 != c2) {
                        return c4;
                    }
                }
            }
        } else {
            for (int i5 = 0; i5 < this.s; i5++) {
                f[] fVarArr2 = this.t;
                View c5 = c(z2 ? fVarArr2[i5].d() : fVarArr2[i5].e());
                if (c5 != null && c5 != c2) {
                    return c5;
                }
            }
        }
        return null;
    }

    View a(boolean z) {
        int f2 = this.u.f();
        int b2 = this.u.b();
        View view = null;
        for (int e2 = e() - 1; e2 >= 0; e2--) {
            View d2 = d(e2);
            int d3 = this.u.d(d2);
            int a2 = this.u.a(d2);
            if (a2 > f2 && d3 < b2) {
                if (a2 <= b2 || !z) {
                    return d2;
                }
                if (view == null) {
                    view = d2;
                }
            }
        }
        return view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p a(Context context, AttributeSet attributeSet) {
        return new c(context, attributeSet);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p a(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new c((ViewGroup.MarginLayoutParams) layoutParams) : new c(layoutParams);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(int i, int i2, RecyclerView.a0 a0Var, RecyclerView.o.c cVar) {
        int i3;
        int i4;
        if (this.w != 0) {
            i = i2;
        }
        if (e() == 0 || i == 0) {
            return;
        }
        a(i, a0Var);
        int[] iArr = this.O;
        if (iArr == null || iArr.length < this.s) {
            this.O = new int[this.s];
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.s; i6++) {
            androidx.recyclerview.widget.f fVar = this.y;
            if (fVar.d == -1) {
                i4 = fVar.f;
                i3 = this.t[i6].b(i4);
            } else {
                i4 = this.t[i6].a(fVar.g);
                i3 = this.y.g;
            }
            int i7 = i4 - i3;
            if (i7 >= 0) {
                this.O[i5] = i7;
                i5++;
            }
        }
        Arrays.sort(this.O, 0, i5);
        for (int i8 = 0; i8 < i5 && this.y.a(a0Var); i8++) {
            cVar.a(this.y.f1130c, this.O[i8]);
            androidx.recyclerview.widget.f fVar2 = this.y;
            fVar2.f1130c += fVar2.d;
        }
    }

    void a(int i, RecyclerView.a0 a0Var) {
        int i2;
        int i3;
        if (i > 0) {
            i3 = J();
            i2 = 1;
        } else {
            i3 = I();
            i2 = -1;
        }
        this.y.f1128a = true;
        b(i3, a0Var);
        x(i2);
        androidx.recyclerview.widget.f fVar = this.y;
        fVar.f1130c = i3 + fVar.d;
        fVar.f1129b = Math.abs(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(Rect rect, int i, int i2) {
        int i3;
        int i4;
        int o = o() + p();
        int q = q() + n();
        if (this.w == 1) {
            i4 = RecyclerView.o.a(i2, rect.height() + q, l());
            i3 = RecyclerView.o.a(i, (this.x * this.s) + o, m());
        } else {
            i3 = RecyclerView.o.a(i, rect.width() + o, m());
            i4 = RecyclerView.o.a(i2, (this.x * this.s) + q, l());
        }
        c(i3, i4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(Parcelable parcelable) {
        if (parcelable instanceof e) {
            this.I = (e) parcelable;
            z();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(AccessibilityEvent accessibilityEvent) {
        super.a(accessibilityEvent);
        if (e() > 0) {
            View b2 = b(false);
            View a2 = a(false);
            if (b2 == null || a2 == null) {
                return;
            }
            int l = l(b2);
            int l2 = l(a2);
            if (l < l2) {
                accessibilityEvent.setFromIndex(l);
                accessibilityEvent.setToIndex(l2);
                return;
            }
            accessibilityEvent.setFromIndex(l2);
            accessibilityEvent.setToIndex(l);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(RecyclerView.v vVar, RecyclerView.a0 a0Var, View view, a.g.l.d0.c cVar) {
        int i;
        int i2;
        int i3;
        int i4;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof c)) {
            super.a(view, cVar);
            return;
        }
        c cVar2 = (c) layoutParams;
        if (this.w == 0) {
            i4 = cVar2.e();
            i3 = cVar2.f ? this.s : 1;
            i2 = -1;
            i = -1;
        } else {
            i4 = -1;
            i3 = -1;
            i2 = cVar2.e();
            i = cVar2.f ? this.s : 1;
        }
        cVar.b(c.C0016c.a(i4, i3, i2, i, false, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(RecyclerView recyclerView, int i, int i2) {
        b(i, i2, 1);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(RecyclerView recyclerView, int i, int i2, int i3) {
        b(i, i2, 8);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(RecyclerView recyclerView, int i, int i2, Object obj) {
        b(i, i2, 4);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
        g gVar = new g(recyclerView.getContext());
        gVar.c(i);
        b(gVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void a(String str) {
        if (this.I == null) {
            super.a(str);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean a() {
        return this.w == 0;
    }

    boolean a(RecyclerView.a0 a0Var, b bVar) {
        int i;
        int i2;
        int i3;
        boolean z = false;
        if (!a0Var.d() && (i = this.C) != -1) {
            if (i >= 0 && i < a0Var.a()) {
                e eVar = this.I;
                if (eVar == null || eVar.f1069b == -1 || eVar.d < 1) {
                    View c2 = c(this.C);
                    if (c2 != null) {
                        bVar.f1062a = this.A ? J() : I();
                        if (this.D != Integer.MIN_VALUE) {
                            if (bVar.f1064c) {
                                i3 = this.u.b() - this.D;
                                i2 = this.u.a(c2);
                            } else {
                                i3 = this.u.f() + this.D;
                                i2 = this.u.d(c2);
                            }
                            bVar.f1063b = i3 - i2;
                            return true;
                        } else if (this.u.b(c2) > this.u.g()) {
                            bVar.f1063b = bVar.f1064c ? this.u.b() : this.u.f();
                            return true;
                        } else {
                            int d2 = this.u.d(c2) - this.u.f();
                            if (d2 < 0) {
                                bVar.f1063b = -d2;
                                return true;
                            }
                            int b2 = this.u.b() - this.u.a(c2);
                            if (b2 < 0) {
                                bVar.f1063b = b2;
                                return true;
                            }
                            bVar.f1063b = RecyclerView.UNDEFINED_DURATION;
                        }
                    } else {
                        int i4 = this.C;
                        bVar.f1062a = i4;
                        int i5 = this.D;
                        if (i5 == Integer.MIN_VALUE) {
                            if (m(i4) == 1) {
                                z = true;
                            }
                            bVar.f1064c = z;
                            bVar.a();
                        } else {
                            bVar.a(i5);
                        }
                        bVar.d = true;
                    }
                } else {
                    bVar.f1063b = RecyclerView.UNDEFINED_DURATION;
                    bVar.f1062a = this.C;
                }
                return true;
            }
            this.C = -1;
            this.D = RecyclerView.UNDEFINED_DURATION;
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean a(RecyclerView.p pVar) {
        return pVar instanceof c;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int b(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return c(i, vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int b(RecyclerView.a0 a0Var) {
        return i(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int b(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        return this.w == 0 ? this.s : super.b(vVar, a0Var);
    }

    View b(boolean z) {
        int f2 = this.u.f();
        int b2 = this.u.b();
        int e2 = e();
        View view = null;
        for (int i = 0; i < e2; i++) {
            View d2 = d(i);
            int d3 = this.u.d(d2);
            if (this.u.a(d2) > f2 && d3 < b2) {
                if (d3 >= f2 || !z) {
                    return d2;
                }
                if (view == null) {
                    view = d2;
                }
            }
        }
        return view;
    }

    void b(RecyclerView.a0 a0Var, b bVar) {
        if (!a(a0Var, bVar) && !c(a0Var, bVar)) {
            bVar.a();
            bVar.f1062a = 0;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void b(RecyclerView recyclerView, int i, int i2) {
        b(i, i2, 2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void b(RecyclerView recyclerView, RecyclerView.v vVar) {
        super.b(recyclerView, vVar);
        a(this.P);
        for (int i = 0; i < this.s; i++) {
            this.t[i].c();
        }
        recyclerView.requestLayout();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean b() {
        return this.w == 1;
    }

    int c(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (e() == 0 || i == 0) {
            return 0;
        }
        a(i, a0Var);
        int a2 = a(vVar, this.y, a0Var);
        if (this.y.f1129b >= a2) {
            i = i < 0 ? -a2 : a2;
        }
        this.u.a(-i);
        this.G = this.A;
        androidx.recyclerview.widget.f fVar = this.y;
        fVar.f1129b = 0;
        a(vVar, fVar);
        return i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int c(RecyclerView.a0 a0Var) {
        return j(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public RecyclerView.p c() {
        return this.w == 0 ? new c(-2, -1) : new c(-1, -2);
    }

    public void c(boolean z) {
        a((String) null);
        e eVar = this.I;
        if (eVar != null && eVar.i != z) {
            eVar.i = z;
        }
        this.z = z;
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int d(RecyclerView.a0 a0Var) {
        return h(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void d(RecyclerView recyclerView) {
        this.E.a();
        z();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int e(RecyclerView.a0 a0Var) {
        return i(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void e(int i) {
        super.e(i);
        for (int i2 = 0; i2 < this.s; i2++) {
            this.t[i2].c(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void e(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        c(vVar, a0Var, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public int f(RecyclerView.a0 a0Var) {
        return j(a0Var);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void f(int i) {
        super.f(i);
        for (int i2 = 0; i2 < this.s; i2++) {
            this.t[i2].c(i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(int i) {
        if (i == 0) {
            G();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void g(RecyclerView.a0 a0Var) {
        super.g(a0Var);
        this.C = -1;
        this.D = RecyclerView.UNDEFINED_DURATION;
        this.I = null;
        this.L.b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public void i(int i) {
        e eVar = this.I;
        if (eVar != null && eVar.f1069b != i) {
            eVar.d();
        }
        this.C = i;
        this.D = RecyclerView.UNDEFINED_DURATION;
        z();
    }

    public void j(int i) {
        if (i == 0 || i == 1) {
            a((String) null);
            if (i == this.w) {
                return;
            }
            this.w = i;
            j jVar = this.u;
            this.u = this.v;
            this.v = jVar;
            z();
            return;
        }
        throw new IllegalArgumentException("invalid orientation.");
    }

    public void k(int i) {
        a((String) null);
        if (i != this.s) {
            L();
            this.s = i;
            this.B = new BitSet(this.s);
            this.t = new f[this.s];
            for (int i2 = 0; i2 < this.s; i2++) {
                this.t[i2] = new f(i2);
            }
            z();
        }
    }

    void l(int i) {
        this.x = i / this.s;
        this.J = View.MeasureSpec.makeMeasureSpec(i, this.v.d());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public boolean v() {
        return this.F != 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.o
    public Parcelable y() {
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
        if (dVar == null || (iArr = dVar.f1065a) == null) {
            eVar.f = 0;
        } else {
            eVar.g = iArr;
            eVar.f = iArr.length;
            eVar.h = dVar.f1066b;
        }
        if (e() > 0) {
            eVar.f1069b = this.G ? J() : I();
            eVar.f1070c = H();
            int i3 = this.s;
            eVar.d = i3;
            eVar.e = new int[i3];
            for (int i4 = 0; i4 < this.s; i4++) {
                if (this.G) {
                    i = this.t[i4].a(RecyclerView.UNDEFINED_DURATION);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.u.b();
                        i -= i2;
                        eVar.e[i4] = i;
                    } else {
                        eVar.e[i4] = i;
                    }
                } else {
                    i = this.t[i4].b(RecyclerView.UNDEFINED_DURATION);
                    if (i != Integer.MIN_VALUE) {
                        i2 = this.u.f();
                        i -= i2;
                        eVar.e[i4] = i;
                    } else {
                        eVar.e[i4] = i;
                    }
                }
            }
        } else {
            eVar.f1069b = -1;
            eVar.f1070c = -1;
            eVar.d = 0;
        }
        return eVar;
    }
}
