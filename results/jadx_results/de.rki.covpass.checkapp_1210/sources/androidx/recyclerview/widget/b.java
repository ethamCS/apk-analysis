package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a */
    final AbstractC0057b f4672a;

    /* renamed from: b */
    final a f4673b = new a();

    /* renamed from: c */
    final List<View> f4674c = new ArrayList();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        long f4675a = 0;

        /* renamed from: b */
        a f4676b;

        a() {
        }

        private void c() {
            if (this.f4676b == null) {
                this.f4676b = new a();
            }
        }

        void a(int i10) {
            if (i10 < 64) {
                this.f4675a &= ~(1 << i10);
                return;
            }
            a aVar = this.f4676b;
            if (aVar == null) {
                return;
            }
            aVar.a(i10 - 64);
        }

        int b(int i10) {
            a aVar = this.f4676b;
            return aVar == null ? i10 >= 64 ? Long.bitCount(this.f4675a) : Long.bitCount(this.f4675a & ((1 << i10) - 1)) : i10 < 64 ? Long.bitCount(this.f4675a & ((1 << i10) - 1)) : aVar.b(i10 - 64) + Long.bitCount(this.f4675a);
        }

        boolean d(int i10) {
            if (i10 < 64) {
                return (this.f4675a & (1 << i10)) != 0;
            }
            c();
            return this.f4676b.d(i10 - 64);
        }

        void e(int i10, boolean z10) {
            if (i10 >= 64) {
                c();
                this.f4676b.e(i10 - 64, z10);
                return;
            }
            long j10 = this.f4675a;
            boolean z11 = (Long.MIN_VALUE & j10) != 0;
            long j11 = (1 << i10) - 1;
            this.f4675a = ((j10 & (~j11)) << 1) | (j10 & j11);
            if (z10) {
                h(i10);
            } else {
                a(i10);
            }
            if (!z11 && this.f4676b == null) {
                return;
            }
            c();
            this.f4676b.e(0, z11);
        }

        boolean f(int i10) {
            if (i10 >= 64) {
                c();
                return this.f4676b.f(i10 - 64);
            }
            long j10 = 1 << i10;
            long j11 = this.f4675a;
            boolean z10 = (j11 & j10) != 0;
            long j12 = j11 & (~j10);
            this.f4675a = j12;
            long j13 = j10 - 1;
            this.f4675a = (j12 & j13) | Long.rotateRight((~j13) & j12, 1);
            a aVar = this.f4676b;
            if (aVar != null) {
                if (aVar.d(0)) {
                    h(63);
                }
                this.f4676b.f(0);
            }
            return z10;
        }

        void g() {
            this.f4675a = 0L;
            a aVar = this.f4676b;
            if (aVar != null) {
                aVar.g();
            }
        }

        void h(int i10) {
            if (i10 < 64) {
                this.f4675a |= 1 << i10;
                return;
            }
            c();
            this.f4676b.h(i10 - 64);
        }

        public String toString() {
            if (this.f4676b == null) {
                return Long.toBinaryString(this.f4675a);
            }
            return this.f4676b.toString() + "xx" + Long.toBinaryString(this.f4675a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b */
    /* loaded from: classes.dex */
    public interface AbstractC0057b {
        View a(int i10);

        void b(View view);

        RecyclerView.d0 c(View view);

        void d(int i10);

        void e(View view);

        void f(View view, int i10);

        int g();

        void h(int i10);

        void i();

        void j(View view, int i10, ViewGroup.LayoutParams layoutParams);

        int k(View view);
    }

    public b(AbstractC0057b abstractC0057b) {
        this.f4672a = abstractC0057b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r4.f4673b.d(r2) == false) goto L17;
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
            androidx.recyclerview.widget.b$b r1 = r4.f4672a
            int r1 = r1.g()
            r2 = r5
        Lb:
            if (r2 >= r1) goto L27
            androidx.recyclerview.widget.b$a r3 = r4.f4673b
            int r3 = r3.b(r2)
            int r3 = r2 - r3
            int r3 = r5 - r3
            if (r3 != 0) goto L25
        L19:
            androidx.recyclerview.widget.b$a r5 = r4.f4673b
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.b.h(int):int");
    }

    private void l(View view) {
        this.f4674c.add(view);
        this.f4672a.b(view);
    }

    private boolean t(View view) {
        if (this.f4674c.remove(view)) {
            this.f4672a.e(view);
            return true;
        }
        return false;
    }

    public void a(View view, int i10, boolean z10) {
        int g10 = i10 < 0 ? this.f4672a.g() : h(i10);
        this.f4673b.e(g10, z10);
        if (z10) {
            l(view);
        }
        this.f4672a.f(view, g10);
    }

    public void b(View view, boolean z10) {
        a(view, -1, z10);
    }

    public void c(View view, int i10, ViewGroup.LayoutParams layoutParams, boolean z10) {
        int g10 = i10 < 0 ? this.f4672a.g() : h(i10);
        this.f4673b.e(g10, z10);
        if (z10) {
            l(view);
        }
        this.f4672a.j(view, g10, layoutParams);
    }

    public void d(int i10) {
        int h10 = h(i10);
        this.f4673b.f(h10);
        this.f4672a.d(h10);
    }

    public View e(int i10) {
        int size = this.f4674c.size();
        for (int i11 = 0; i11 < size; i11++) {
            View view = this.f4674c.get(i11);
            RecyclerView.d0 c10 = this.f4672a.c(view);
            if (c10.m() == i10 && !c10.t() && !c10.v()) {
                return view;
            }
        }
        return null;
    }

    public View f(int i10) {
        return this.f4672a.a(h(i10));
    }

    public int g() {
        return this.f4672a.g() - this.f4674c.size();
    }

    public View i(int i10) {
        return this.f4672a.a(i10);
    }

    public int j() {
        return this.f4672a.g();
    }

    public void k(View view) {
        int k10 = this.f4672a.k(view);
        if (k10 >= 0) {
            this.f4673b.h(k10);
            l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public int m(View view) {
        int k10 = this.f4672a.k(view);
        if (k10 != -1 && !this.f4673b.d(k10)) {
            return k10 - this.f4673b.b(k10);
        }
        return -1;
    }

    public boolean n(View view) {
        return this.f4674c.contains(view);
    }

    public void o() {
        this.f4673b.g();
        for (int size = this.f4674c.size() - 1; size >= 0; size--) {
            this.f4672a.e(this.f4674c.get(size));
            this.f4674c.remove(size);
        }
        this.f4672a.i();
    }

    public void p(View view) {
        int k10 = this.f4672a.k(view);
        if (k10 < 0) {
            return;
        }
        if (this.f4673b.f(k10)) {
            t(view);
        }
        this.f4672a.h(k10);
    }

    public void q(int i10) {
        int h10 = h(i10);
        View a10 = this.f4672a.a(h10);
        if (a10 == null) {
            return;
        }
        if (this.f4673b.f(h10)) {
            t(a10);
        }
        this.f4672a.h(h10);
    }

    public boolean r(View view) {
        int k10 = this.f4672a.k(view);
        if (k10 == -1) {
            t(view);
            return true;
        } else if (!this.f4673b.d(k10)) {
            return false;
        } else {
            this.f4673b.f(k10);
            t(view);
            this.f4672a.h(k10);
            return true;
        }
    }

    public void s(View view) {
        int k10 = this.f4672a.k(view);
        if (k10 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f4673b.d(k10)) {
            this.f4673b.a(k10);
            t(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f4673b.toString() + ", hidden list:" + this.f4674c.size();
    }
}
