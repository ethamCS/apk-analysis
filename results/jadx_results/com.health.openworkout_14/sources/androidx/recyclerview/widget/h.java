package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class h implements Runnable {

    /* renamed from: f */
    static final ThreadLocal<h> f1746f = new ThreadLocal<>();

    /* renamed from: g */
    static Comparator<c> f1747g = new a();

    /* renamed from: c */
    long f1749c;

    /* renamed from: d */
    long f1750d;

    /* renamed from: b */
    ArrayList<RecyclerView> f1748b = new ArrayList<>();

    /* renamed from: e */
    private ArrayList<c> f1751e = new ArrayList<>();

    /* loaded from: classes.dex */
    static class a implements Comparator<c> {
        a() {
        }

        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f1759d;
            if ((recyclerView == null) != (cVar2.f1759d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z = cVar.f1756a;
            if (z != cVar2.f1756a) {
                return z ? -1 : 1;
            }
            int i = cVar2.f1757b - cVar.f1757b;
            if (i != 0) {
                return i;
            }
            int i2 = cVar.f1758c - cVar2.f1758c;
            if (i2 == 0) {
                return 0;
            }
            return i2;
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* loaded from: classes.dex */
    public static class b implements RecyclerView.o.c {

        /* renamed from: a */
        int f1752a;

        /* renamed from: b */
        int f1753b;

        /* renamed from: c */
        int[] f1754c;

        /* renamed from: d */
        int f1755d;

        @Override // androidx.recyclerview.widget.RecyclerView.o.c
        public void a(int i, int i2) {
            if (i >= 0) {
                if (i2 < 0) {
                    throw new IllegalArgumentException("Pixel distance must be non-negative");
                }
                int i3 = this.f1755d * 2;
                int[] iArr = this.f1754c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f1754c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i3 >= iArr.length) {
                    int[] iArr3 = new int[i3 * 2];
                    this.f1754c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f1754c;
                iArr4[i3] = i;
                iArr4[i3 + 1] = i2;
                this.f1755d++;
                return;
            }
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }

        public void b() {
            int[] iArr = this.f1754c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f1755d = 0;
        }

        void c(RecyclerView recyclerView, boolean z) {
            this.f1755d = 0;
            int[] iArr = this.f1754c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.n;
            if (recyclerView.m == null || oVar == null || !oVar.v0()) {
                return;
            }
            if (z) {
                if (!recyclerView.f1529e.p()) {
                    oVar.q(recyclerView.m.f(), this);
                }
            } else if (!recyclerView.p0()) {
                oVar.p(this.f1752a, this.f1753b, recyclerView.i0, this);
            }
            int i = this.f1755d;
            if (i <= oVar.m) {
                return;
            }
            oVar.m = i;
            oVar.n = z;
            recyclerView.f1527c.K();
        }

        public boolean d(int i) {
            if (this.f1754c != null) {
                int i2 = this.f1755d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f1754c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int i, int i2) {
            this.f1752a = i;
            this.f1753b = i2;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public boolean f1756a;

        /* renamed from: b */
        public int f1757b;

        /* renamed from: c */
        public int f1758c;

        /* renamed from: d */
        public RecyclerView f1759d;

        /* renamed from: e */
        public int f1760e;

        c() {
        }

        public void a() {
            this.f1756a = false;
            this.f1757b = 0;
            this.f1758c = 0;
            this.f1759d = null;
            this.f1760e = 0;
        }
    }

    private void b() {
        c cVar;
        int size = this.f1748b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = this.f1748b.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.h0.c(recyclerView, false);
                i += recyclerView.h0.f1755d;
            }
        }
        this.f1751e.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = this.f1748b.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.h0;
                int abs = Math.abs(bVar.f1752a) + Math.abs(bVar.f1753b);
                for (int i5 = 0; i5 < bVar.f1755d * 2; i5 += 2) {
                    if (i3 >= this.f1751e.size()) {
                        cVar = new c();
                        this.f1751e.add(cVar);
                    } else {
                        cVar = this.f1751e.get(i3);
                    }
                    int[] iArr = bVar.f1754c;
                    int i6 = iArr[i5 + 1];
                    cVar.f1756a = i6 <= abs;
                    cVar.f1757b = abs;
                    cVar.f1758c = i6;
                    cVar.f1759d = recyclerView2;
                    cVar.f1760e = iArr[i5];
                    i3++;
                }
            }
        }
        Collections.sort(this.f1751e, f1747g);
    }

    private void c(c cVar, long j) {
        RecyclerView.d0 i = i(cVar.f1759d, cVar.f1760e, cVar.f1756a ? Long.MAX_VALUE : j);
        if (i == null || i.f1552b == null || !i.s() || i.t()) {
            return;
        }
        h(i.f1552b.get(), j);
    }

    private void d(long j) {
        for (int i = 0; i < this.f1751e.size(); i++) {
            c cVar = this.f1751e.get(i);
            if (cVar.f1759d == null) {
                return;
            }
            c(cVar, j);
            cVar.a();
        }
    }

    static boolean e(RecyclerView recyclerView, int i) {
        int j = recyclerView.f1530f.j();
        for (int i2 = 0; i2 < j; i2++) {
            RecyclerView.d0 j0 = RecyclerView.j0(recyclerView.f1530f.i(i2));
            if (j0.f1553c == i && !j0.t()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.E && recyclerView.f1530f.j() != 0) {
            recyclerView.Y0();
        }
        b bVar = recyclerView.h0;
        bVar.c(recyclerView, true);
        if (bVar.f1755d == 0) {
            return;
        }
        try {
            b.g.h.b.a("RV Nested Prefetch");
            recyclerView.i0.f(recyclerView.m);
            for (int i = 0; i < bVar.f1755d * 2; i += 2) {
                i(recyclerView, bVar.f1754c[i], j);
            }
        } finally {
            b.g.h.b.b();
        }
    }

    private RecyclerView.d0 i(RecyclerView recyclerView, int i, long j) {
        if (e(recyclerView, i)) {
            return null;
        }
        RecyclerView.v vVar = recyclerView.f1527c;
        try {
            recyclerView.K0();
            RecyclerView.d0 I = vVar.I(i, false, j);
            if (I != null) {
                if (!I.s() || I.t()) {
                    vVar.a(I, false);
                } else {
                    vVar.B(I.f1551a);
                }
            }
            return I;
        } finally {
            recyclerView.M0(false);
        }
    }

    public void a(RecyclerView recyclerView) {
        this.f1748b.add(recyclerView);
    }

    public void f(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f1749c == 0) {
            this.f1749c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.h0.e(i, i2);
    }

    void g(long j) {
        b();
        d(j);
    }

    public void j(RecyclerView recyclerView) {
        this.f1748b.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            b.g.h.b.a("RV Prefetch");
            if (!this.f1748b.isEmpty()) {
                int size = this.f1748b.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = this.f1748b.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j) + this.f1750d);
                }
            }
        } finally {
            this.f1749c = 0L;
            b.g.h.b.b();
        }
    }
}
