package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a */
    final AbstractC0044b f1080a;

    /* renamed from: b */
    final a f1081b = new a();

    /* renamed from: c */
    final List<View> f1082c = new ArrayList();

    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        long f1083a = 0;

        /* renamed from: b */
        a f1084b;

        a() {
        }

        private void b() {
            if (this.f1084b == null) {
                this.f1084b = new a();
            }
        }

        void a() {
            this.f1083a = 0L;
            a aVar = this.f1084b;
            if (aVar != null) {
                aVar.a();
            }
        }

        void a(int i) {
            if (i < 64) {
                this.f1083a &= (1 << i) ^ (-1);
                return;
            }
            a aVar = this.f1084b;
            if (aVar == null) {
                return;
            }
            aVar.a(i - 64);
        }

        void a(int i, boolean z) {
            if (i >= 64) {
                b();
                this.f1084b.a(i - 64, z);
                return;
            }
            boolean z2 = (this.f1083a & Long.MIN_VALUE) != 0;
            long j = (1 << i) - 1;
            long j2 = this.f1083a;
            this.f1083a = ((j2 & (j ^ (-1))) << 1) | (j2 & j);
            if (z) {
                e(i);
            } else {
                a(i);
            }
            if (!z2 && this.f1084b == null) {
                return;
            }
            b();
            this.f1084b.a(0, z2);
        }

        int b(int i) {
            a aVar = this.f1084b;
            return aVar == null ? i >= 64 ? Long.bitCount(this.f1083a) : Long.bitCount(this.f1083a & ((1 << i) - 1)) : i < 64 ? Long.bitCount(this.f1083a & ((1 << i) - 1)) : aVar.b(i - 64) + Long.bitCount(this.f1083a);
        }

        boolean c(int i) {
            if (i < 64) {
                return (this.f1083a & (1 << i)) != 0;
            }
            b();
            return this.f1084b.c(i - 64);
        }

        boolean d(int i) {
            if (i >= 64) {
                b();
                return this.f1084b.d(i - 64);
            }
            long j = 1 << i;
            boolean z = (this.f1083a & j) != 0;
            long j2 = this.f1083a & (j ^ (-1));
            this.f1083a = j2;
            long j3 = j - 1;
            this.f1083a = (j2 & j3) | Long.rotateRight((j3 ^ (-1)) & j2, 1);
            a aVar = this.f1084b;
            if (aVar != null) {
                if (aVar.c(0)) {
                    e(63);
                }
                this.f1084b.d(0);
            }
            return z;
        }

        void e(int i) {
            if (i < 64) {
                this.f1083a |= 1 << i;
                return;
            }
            b();
            this.f1084b.e(i - 64);
        }

        public String toString() {
            if (this.f1084b == null) {
                return Long.toBinaryString(this.f1083a);
            }
            return this.f1084b.toString() + "xx" + Long.toBinaryString(this.f1083a);
        }
    }

    /* renamed from: androidx.recyclerview.widget.b$b */
    /* loaded from: classes.dex */
    public interface AbstractC0044b {
        int a();

        View a(int i);

        void a(View view);

        void a(View view, int i);

        void a(View view, int i, ViewGroup.LayoutParams layoutParams);

        void b();

        void b(int i);

        void b(View view);

        int c(View view);

        void c(int i);

        RecyclerView.d0 d(View view);
    }

    public b(AbstractC0044b abstractC0044b) {
        this.f1080a = abstractC0044b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
        if (r4.f1081b.c(r2) == false) goto L17;
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
    private int f(int r5) {
        /*
            r4 = this;
            r0 = -1
            if (r5 >= 0) goto L4
            return r0
        L4:
            androidx.recyclerview.widget.b$b r1 = r4.f1080a
            int r1 = r1.a()
            r2 = r5
        Lb:
            if (r2 >= r1) goto L27
            androidx.recyclerview.widget.b$a r3 = r4.f1081b
            int r3 = r3.b(r2)
            int r3 = r2 - r3
            int r3 = r5 - r3
            if (r3 != 0) goto L25
        L19:
            androidx.recyclerview.widget.b$a r5 = r4.f1081b
            boolean r5 = r5.c(r2)
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.b.f(int):int");
    }

    private void g(View view) {
        this.f1082c.add(view);
        this.f1080a.b(view);
    }

    private boolean h(View view) {
        if (this.f1082c.remove(view)) {
            this.f1080a.a(view);
            return true;
        }
        return false;
    }

    public int a() {
        return this.f1080a.a() - this.f1082c.size();
    }

    public void a(int i) {
        int f = f(i);
        this.f1081b.d(f);
        this.f1080a.b(f);
    }

    public void a(View view) {
        int c2 = this.f1080a.c(view);
        if (c2 >= 0) {
            this.f1081b.e(c2);
            g(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public void a(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int a2 = i < 0 ? this.f1080a.a() : f(i);
        this.f1081b.a(a2, z);
        if (z) {
            g(view);
        }
        this.f1080a.a(view, a2, layoutParams);
    }

    public void a(View view, int i, boolean z) {
        int a2 = i < 0 ? this.f1080a.a() : f(i);
        this.f1081b.a(a2, z);
        if (z) {
            g(view);
        }
        this.f1080a.a(view, a2);
    }

    public void a(View view, boolean z) {
        a(view, -1, z);
    }

    public int b() {
        return this.f1080a.a();
    }

    public int b(View view) {
        int c2 = this.f1080a.c(view);
        if (c2 != -1 && !this.f1081b.c(c2)) {
            return c2 - this.f1081b.b(c2);
        }
        return -1;
    }

    public View b(int i) {
        int size = this.f1082c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f1082c.get(i2);
            RecyclerView.d0 d = this.f1080a.d(view);
            if (d.i() == i && !d.o() && !d.q()) {
                return view;
            }
        }
        return null;
    }

    public View c(int i) {
        return this.f1080a.a(f(i));
    }

    public void c() {
        this.f1081b.a();
        for (int size = this.f1082c.size() - 1; size >= 0; size--) {
            this.f1080a.a(this.f1082c.get(size));
            this.f1082c.remove(size);
        }
        this.f1080a.b();
    }

    public boolean c(View view) {
        return this.f1082c.contains(view);
    }

    public View d(int i) {
        return this.f1080a.a(i);
    }

    public void d(View view) {
        int c2 = this.f1080a.c(view);
        if (c2 < 0) {
            return;
        }
        if (this.f1081b.d(c2)) {
            h(view);
        }
        this.f1080a.c(c2);
    }

    public void e(int i) {
        int f = f(i);
        View a2 = this.f1080a.a(f);
        if (a2 == null) {
            return;
        }
        if (this.f1081b.d(f)) {
            h(a2);
        }
        this.f1080a.c(f);
    }

    public boolean e(View view) {
        int c2 = this.f1080a.c(view);
        if (c2 == -1) {
            h(view);
            return true;
        } else if (!this.f1081b.c(c2)) {
            return false;
        } else {
            this.f1081b.d(c2);
            h(view);
            this.f1080a.c(c2);
            return true;
        }
    }

    public void f(View view) {
        int c2 = this.f1080a.c(view);
        if (c2 < 0) {
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        } else if (this.f1081b.c(c2)) {
            this.f1081b.a(c2);
            h(view);
        } else {
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
    }

    public String toString() {
        return this.f1081b.toString() + ", hidden list:" + this.f1082c.size();
    }
}
