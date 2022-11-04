package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class e implements Runnable {

    /* renamed from: d */
    long f4761d;

    /* renamed from: q */
    long f4762q;

    /* renamed from: y */
    static final ThreadLocal<e> f4759y = new ThreadLocal<>();
    static Comparator<c> U3 = new a();

    /* renamed from: c */
    ArrayList<RecyclerView> f4760c = new ArrayList<>();

    /* renamed from: x */
    private ArrayList<c> f4763x = new ArrayList<>();

    /* loaded from: classes.dex */
    static class a implements Comparator<c> {
        a() {
        }

        /* renamed from: a */
        public int compare(c cVar, c cVar2) {
            RecyclerView recyclerView = cVar.f4771d;
            if ((recyclerView == null) != (cVar2.f4771d == null)) {
                return recyclerView == null ? 1 : -1;
            }
            boolean z10 = cVar.f4768a;
            if (z10 != cVar2.f4768a) {
                return z10 ? -1 : 1;
            }
            int i10 = cVar2.f4769b - cVar.f4769b;
            if (i10 != 0) {
                return i10;
            }
            int i11 = cVar.f4770c - cVar2.f4770c;
            if (i11 == 0) {
                return 0;
            }
            return i11;
        }
    }

    @SuppressLint({"VisibleForTests"})
    /* loaded from: classes.dex */
    public static class b implements RecyclerView.o.c {

        /* renamed from: a */
        int f4764a;

        /* renamed from: b */
        int f4765b;

        /* renamed from: c */
        int[] f4766c;

        /* renamed from: d */
        int f4767d;

        @Override // androidx.recyclerview.widget.RecyclerView.o.c
        public void a(int i10, int i11) {
            if (i10 >= 0) {
                if (i11 < 0) {
                    throw new IllegalArgumentException("Pixel distance must be non-negative");
                }
                int i12 = this.f4767d * 2;
                int[] iArr = this.f4766c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f4766c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i12 >= iArr.length) {
                    int[] iArr3 = new int[i12 * 2];
                    this.f4766c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f4766c;
                iArr4[i12] = i10;
                iArr4[i12 + 1] = i11;
                this.f4767d++;
                return;
            }
            throw new IllegalArgumentException("Layout positions must be non-negative");
        }

        public void b() {
            int[] iArr = this.f4766c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            this.f4767d = 0;
        }

        void c(RecyclerView recyclerView, boolean z10) {
            this.f4767d = 0;
            int[] iArr = this.f4766c;
            if (iArr != null) {
                Arrays.fill(iArr, -1);
            }
            RecyclerView.o oVar = recyclerView.f4468b4;
            if (recyclerView.f4466a4 == null || oVar == null || !oVar.u0()) {
                return;
            }
            if (z10) {
                if (!recyclerView.f4502x.p()) {
                    oVar.p(recyclerView.f4466a4.e(), this);
                }
            } else if (!recyclerView.m0()) {
                oVar.o(this.f4764a, this.f4765b, recyclerView.T4, this);
            }
            int i10 = this.f4767d;
            if (i10 <= oVar.f4578m) {
                return;
            }
            oVar.f4578m = i10;
            oVar.f4579n = z10;
            recyclerView.f4473d.K();
        }

        public boolean d(int i10) {
            if (this.f4766c != null) {
                int i11 = this.f4767d * 2;
                for (int i12 = 0; i12 < i11; i12 += 2) {
                    if (this.f4766c[i12] == i10) {
                        return true;
                    }
                }
            }
            return false;
        }

        void e(int i10, int i11) {
            this.f4764a = i10;
            this.f4765b = i11;
        }
    }

    /* loaded from: classes.dex */
    public static class c {

        /* renamed from: a */
        public boolean f4768a;

        /* renamed from: b */
        public int f4769b;

        /* renamed from: c */
        public int f4770c;

        /* renamed from: d */
        public RecyclerView f4771d;

        /* renamed from: e */
        public int f4772e;

        c() {
        }

        public void a() {
            this.f4768a = false;
            this.f4769b = 0;
            this.f4770c = 0;
            this.f4771d = null;
            this.f4772e = 0;
        }
    }

    private void b() {
        c cVar;
        int size = this.f4760c.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            RecyclerView recyclerView = this.f4760c.get(i11);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.S4.c(recyclerView, false);
                i10 += recyclerView.S4.f4767d;
            }
        }
        this.f4763x.ensureCapacity(i10);
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            RecyclerView recyclerView2 = this.f4760c.get(i13);
            if (recyclerView2.getWindowVisibility() == 0) {
                b bVar = recyclerView2.S4;
                int abs = Math.abs(bVar.f4764a) + Math.abs(bVar.f4765b);
                for (int i14 = 0; i14 < bVar.f4767d * 2; i14 += 2) {
                    if (i12 >= this.f4763x.size()) {
                        cVar = new c();
                        this.f4763x.add(cVar);
                    } else {
                        cVar = this.f4763x.get(i12);
                    }
                    int[] iArr = bVar.f4766c;
                    int i15 = iArr[i14 + 1];
                    cVar.f4768a = i15 <= abs;
                    cVar.f4769b = abs;
                    cVar.f4770c = i15;
                    cVar.f4771d = recyclerView2;
                    cVar.f4772e = iArr[i14];
                    i12++;
                }
            }
        }
        Collections.sort(this.f4763x, U3);
    }

    private void c(c cVar, long j10) {
        RecyclerView.d0 i10 = i(cVar.f4771d, cVar.f4772e, cVar.f4768a ? Long.MAX_VALUE : j10);
        if (i10 == null || i10.f4534b == null || !i10.s() || i10.t()) {
            return;
        }
        h(i10.f4534b.get(), j10);
    }

    private void d(long j10) {
        for (int i10 = 0; i10 < this.f4763x.size(); i10++) {
            c cVar = this.f4763x.get(i10);
            if (cVar.f4771d == null) {
                return;
            }
            c(cVar, j10);
            cVar.a();
        }
    }

    static boolean e(RecyclerView recyclerView, int i10) {
        int j10 = recyclerView.f4504y.j();
        for (int i11 = 0; i11 < j10; i11++) {
            RecyclerView.d0 g02 = RecyclerView.g0(recyclerView.f4504y.i(i11));
            if (g02.f4535c == i10 && !g02.t()) {
                return true;
            }
        }
        return false;
    }

    private void h(RecyclerView recyclerView, long j10) {
        if (recyclerView == null) {
            return;
        }
        if (recyclerView.f4497s4 && recyclerView.f4504y.j() != 0) {
            recyclerView.U0();
        }
        b bVar = recyclerView.S4;
        bVar.c(recyclerView, true);
        if (bVar.f4767d == 0) {
            return;
        }
        try {
            androidx.core.os.i.a("RV Nested Prefetch");
            recyclerView.T4.f(recyclerView.f4466a4);
            for (int i10 = 0; i10 < bVar.f4767d * 2; i10 += 2) {
                i(recyclerView, bVar.f4766c[i10], j10);
            }
        } finally {
            androidx.core.os.i.b();
        }
    }

    private RecyclerView.d0 i(RecyclerView recyclerView, int i10, long j10) {
        if (e(recyclerView, i10)) {
            return null;
        }
        RecyclerView.v vVar = recyclerView.f4473d;
        try {
            recyclerView.G0();
            RecyclerView.d0 I = vVar.I(i10, false, j10);
            if (I != null) {
                if (!I.s() || I.t()) {
                    vVar.a(I, false);
                } else {
                    vVar.B(I.f4533a);
                }
            }
            return I;
        } finally {
            recyclerView.I0(false);
        }
    }

    public void a(RecyclerView recyclerView) {
        this.f4760c.add(recyclerView);
    }

    public void f(RecyclerView recyclerView, int i10, int i11) {
        if (recyclerView.isAttachedToWindow() && this.f4761d == 0) {
            this.f4761d = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.S4.e(i10, i11);
    }

    void g(long j10) {
        b();
        d(j10);
    }

    public void j(RecyclerView recyclerView) {
        this.f4760c.remove(recyclerView);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            androidx.core.os.i.a("RV Prefetch");
            if (!this.f4760c.isEmpty()) {
                int size = this.f4760c.size();
                long j10 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    RecyclerView recyclerView = this.f4760c.get(i10);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j10 = Math.max(recyclerView.getDrawingTime(), j10);
                    }
                }
                if (j10 != 0) {
                    g(TimeUnit.MILLISECONDS.toNanos(j10) + this.f4762q);
                }
            }
        } finally {
            this.f4761d = 0L;
            androidx.core.os.i.b();
        }
    }
}
