package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class d {

    /* renamed from: a */
    final b f1668a;

    /* renamed from: b */
    final a f1669b = new a();

    /* renamed from: c */
    final List<View> f1670c = new ArrayList();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        long f1671a = 0;

        /* renamed from: b */
        a f1672b;

        a() {
        }

        private void c() {
            if (this.f1672b == null) {
                this.f1672b = new a();
            }
        }

        void a(int i) {
            if (i < 64) {
                this.f1671a &= ~(1 << i);
                return;
            }
            a aVar = this.f1672b;
            if (aVar == null) {
                return;
            }
            aVar.a(i - 64);
        }

        int b(int i) {
            a aVar = this.f1672b;
            return aVar == null ? i >= 64 ? Long.bitCount(this.f1671a) : Long.bitCount(this.f1671a & ((1 << i) - 1)) : i < 64 ? Long.bitCount(this.f1671a & ((1 << i) - 1)) : aVar.b(i - 64) + Long.bitCount(this.f1671a);
        }

        boolean d(int i) {
            if (i < 64) {
                return (this.f1671a & (1 << i)) != 0;
            }
            c();
            return this.f1672b.d(i - 64);
        }

        void e(int i, boolean z) {
            if (i >= 64) {
                c();
                this.f1672b.e(i - 64, z);
                return;
            }
            long j = this.f1671a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f1671a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                h(i);
            } else {
                a(i);
            }
            if (!z2 && this.f1672b == null) {
                return;
            }
            c();
            this.f1672b.e(0, z2);
        }

        boolean f(int i) {
            if (i >= 64) {
                c();
                return this.f1672b.f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f1671a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.f1671a = j3;
            long j4 = j - 1;
            this.f1671a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            a aVar = this.f1672b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f1672b.f(0);
            }
            return z;
        }

        void g() {
            this.f1671a = 0L;
            a aVar = this.f1672b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int i) {
            if (i < 64) {
                this.f1671a |= 1 << i;
                return;
            }
            c();
            this.f1672b.h(i - 64);
        }

        public String toString() {
            if (this.f1672b == null) {
                return Long.toBinaryString(this.f1671a);
            }
            return this.f1672b.toString() + "xx" + Long.toBinaryString(this.f1671a);
        }
    }

    /* loaded from: classes.dex */
    public interface b {
        View a(int i);

        void b(View view);

        void c(int i);

        void d();

        RecyclerView.d0 e(View view);

        void f(int i);

        void g(View view);

        void h(View view, int i, ViewGroup.LayoutParams layoutParams);

        void i(View view, int i);

        int j(View view);

        int k();
    }

    public d(b bVar) {
        this.f1668a = bVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r4.f1669b.d(r2) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0021, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int h(int r5) {
        /*
            r4 = this;
            r0 = -1
            if (r5 >= 0) goto L4
            return r0
        L4:
            androidx.recyclerview.widget.d$b r1 = r4.f1668a
            int r1 = r1.k()
            r2 = r5
        Lb:
            if (r2 >= r1) goto L27
            androidx.recyclerview.widget.d$a r3 = r4.f1669b
            int r3 = r3.b(r2)
            int r3 = r2 - r3
            int r3 = r5 - r3
            if (r3 != 0) goto L25
        L19:
            androidx.recyclerview.widget.d$a r5 = r4.f1669b
            boolean r5 = r5.d(r2)
            if (r5 == 0) goto L24
            int r2 = r2 + 1
            goto L19
        L24:
            return r2
        L25:
            int r2 = r2 + r3
            goto Lb
        L27:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.d.h(int):int");
    }

    private void l(View view) {
        this.f1670c.add(view);
        this.f1668a.b(view);
    }

    private boolean t(View view) {
        if (this.f1670c.remove(view)) {
            this.f1668a.g(view);
            return true;
        }
        return false;
    }

    public void a(View view, int i, boolean z) {
        int k = i < 0 ? this.f1668a.k() : h(i);
        this.f1669b.e(k, z);
        if (z) {
            l(view);
        }
        this.f1668a.i(view, k);
    }

    public void b(View view, boolean z) {
        a(view, -1, z);
    }

    public void c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int k = i < 0 ? this.f1668a.k() : h(i);
        this.f1669b.e(k, z);
        if (z) {
            l(view);
        }
        this.f1668a.h(view, k, layoutParams);
    }

    public void d(int i) {
        int h2 = h(i);
        this.f1669b.f(h2);
        this.f1668a.f(h2);
    }

    public View e(int i) {
        int size = this.f1670c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f1670c.get(i2);
            RecyclerView.d0 e2 = this.f1668a.e(view);
            if (e2.m() == i && !e2.t() && !e2.v()) {
                return view;
            }
        }
        return null;
    }

    public View f(int i) {
        return this.f1668a.a(h(i));
    }

    public int g() {
        return this.f1668a.k() - this.f1670c.size();
    }

    public View i(int i) {
        return this.f1668a.a(i);
    }

    public int j() {
        return this.f1668a.k();
    }

    public void k(View view) {
        int j = this.f1668a.j(view);
        if (j >= 0) {
            this.f1669b.h(j);
            l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public int m(View view) {
        int j = this.f1668a.j(view);
        if (j != -1 && !this.f1669b.d(j)) {
            return j - this.f1669b.b(j);
        }
        return -1;
    }

    public boolean n(View view) {
        return this.f1670c.contains(view);
    }

    public void o() {
        this.f1669b.g();
        for (int size = this.f1670c.size() - 1; size >= 0; size--) {
            this.f1668a.g(this.f1670c.get(size));
            this.f1670c.remove(size);
        }
        this.f1668a.d();
    }

    public void p(View view) {
        int j = this.f1668a.j(view);
        if (j < 0) {
            return;
        }
        if (this.f1669b.f(j)) {
            t(view);
        }
        this.f1668a.c(j);
    }

    public void q(int i) {
        int h2 = h(i);
        View a2 = this.f1668a.a(h2);
        if (a2 == null) {
            return;
        }
        if (this.f1669b.f(h2)) {
            t(a2);
        }
        this.f1668a.c(h2);
    }

    public boolean r(View view) {
        int j = this.f1668a.j(view);
        if (j == -1) {
            t(view);
            return true;
        } else if (!this.f1669b.d(j)) {
            return false;
        } else {
            this.f1669b.f(j);
            t(view);
            this.f1668a.c(j);
            return true;
        }
    }

    public void s(View view) {
        int j = this.f1668a.j(view);
        if (j < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f1669b.d(j)) {
            this.f1669b.a(j);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f1669b.toString() + ", hidden list:" + this.f1670c.size();
    }
}
