package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class a implements h.a {

    /* renamed from: a */
    private androidx.core.util.e<b> f4660a;

    /* renamed from: b */
    final ArrayList<b> f4661b;

    /* renamed from: c */
    final ArrayList<b> f4662c;

    /* renamed from: d */
    final AbstractC0056a f4663d;

    /* renamed from: e */
    Runnable f4664e;

    /* renamed from: f */
    final boolean f4665f;

    /* renamed from: g */
    final h f4666g;

    /* renamed from: h */
    private int f4667h;

    /* renamed from: androidx.recyclerview.widget.a$a */
    /* loaded from: classes.dex */
    public interface AbstractC0056a {
        void a(int i10, int i11);

        void b(b bVar);

        RecyclerView.d0 c(int i10);

        void d(int i10, int i11);

        void e(int i10, int i11);

        void f(int i10, int i11);

        void g(b bVar);

        void h(int i10, int i11, Object obj);
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        int f4668a;

        /* renamed from: b */
        int f4669b;

        /* renamed from: c */
        Object f4670c;

        /* renamed from: d */
        int f4671d;

        b(int i10, int i11, int i12, Object obj) {
            this.f4668a = i10;
            this.f4669b = i11;
            this.f4671d = i12;
            this.f4670c = obj;
        }

        String a() {
            int i10 = this.f4668a;
            return i10 != 1 ? i10 != 2 ? i10 != 4 ? i10 != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i10 = this.f4668a;
            if (i10 != bVar.f4668a) {
                return false;
            }
            if (i10 == 8 && Math.abs(this.f4671d - this.f4669b) == 1 && this.f4671d == bVar.f4669b && this.f4669b == bVar.f4671d) {
                return true;
            }
            if (this.f4671d != bVar.f4671d || this.f4669b != bVar.f4669b) {
                return false;
            }
            Object obj2 = this.f4670c;
            Object obj3 = bVar.f4670c;
            if (obj2 != null) {
                if (!obj2.equals(obj3)) {
                    return false;
                }
            } else if (obj3 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            return (((this.f4668a * 31) + this.f4669b) * 31) + this.f4671d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f4669b + "c:" + this.f4671d + ",p:" + this.f4670c + "]";
        }
    }

    public a(AbstractC0056a abstractC0056a) {
        this(abstractC0056a, false);
    }

    a(AbstractC0056a abstractC0056a, boolean z10) {
        this.f4660a = new androidx.core.util.f(30);
        this.f4661b = new ArrayList<>();
        this.f4662c = new ArrayList<>();
        this.f4667h = 0;
        this.f4663d = abstractC0056a;
        this.f4665f = z10;
        this.f4666g = new h(this);
    }

    private void c(b bVar) {
        r(bVar);
    }

    private void d(b bVar) {
        r(bVar);
    }

    private void f(b bVar) {
        char c10;
        boolean z10;
        int i10 = bVar.f4669b;
        int i11 = bVar.f4671d + i10;
        char c11 = 65535;
        int i12 = i10;
        int i13 = 0;
        while (i12 < i11) {
            if (this.f4663d.c(i12) != null || h(i12)) {
                if (c11 == 0) {
                    k(b(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 1;
            } else {
                if (c11 == 1) {
                    r(b(2, i10, i13, null));
                    z10 = true;
                } else {
                    z10 = false;
                }
                c10 = 0;
            }
            if (z10) {
                i12 -= i13;
                i11 -= i13;
                i13 = 1;
            } else {
                i13++;
            }
            i12++;
            c11 = c10;
        }
        if (i13 != bVar.f4671d) {
            a(bVar);
            bVar = b(2, i10, i13, null);
        }
        if (c11 == 0) {
            k(bVar);
        } else {
            r(bVar);
        }
    }

    private void g(b bVar) {
        int i10 = bVar.f4669b;
        int i11 = bVar.f4671d + i10;
        int i12 = 0;
        boolean z10 = true;
        int i13 = i10;
        while (i10 < i11) {
            if (this.f4663d.c(i10) != null || h(i10)) {
                if (!z10) {
                    k(b(4, i13, i12, bVar.f4670c));
                    i13 = i10;
                    i12 = 0;
                }
                z10 = true;
            } else {
                if (z10) {
                    r(b(4, i13, i12, bVar.f4670c));
                    i13 = i10;
                    i12 = 0;
                }
                z10 = false;
            }
            i12++;
            i10++;
        }
        if (i12 != bVar.f4671d) {
            Object obj = bVar.f4670c;
            a(bVar);
            bVar = b(4, i13, i12, obj);
        }
        if (!z10) {
            k(bVar);
        } else {
            r(bVar);
        }
    }

    private boolean h(int i10) {
        int size = this.f4662c.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f4662c.get(i11);
            int i12 = bVar.f4668a;
            if (i12 == 8) {
                if (n(bVar.f4671d, i11 + 1) == i10) {
                    return true;
                }
            } else if (i12 == 1) {
                int i13 = bVar.f4669b;
                int i14 = bVar.f4671d + i13;
                while (i13 < i14) {
                    if (n(i13, i11 + 1) == i10) {
                        return true;
                    }
                    i13++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i10;
        int i11 = bVar.f4668a;
        if (i11 == 1 || i11 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int v10 = v(bVar.f4669b, i11);
        int i12 = bVar.f4669b;
        int i13 = bVar.f4668a;
        if (i13 == 2) {
            i10 = 0;
        } else if (i13 != 4) {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        } else {
            i10 = 1;
        }
        int i14 = 1;
        for (int i15 = 1; i15 < bVar.f4671d; i15++) {
            int v11 = v(bVar.f4669b + (i10 * i15), bVar.f4668a);
            int i16 = bVar.f4668a;
            if (i16 == 2 ? v11 == v10 : i16 == 4 && v11 == v10 + 1) {
                i14++;
            } else {
                b b10 = b(i16, v10, i14, bVar.f4670c);
                l(b10, i12);
                a(b10);
                if (bVar.f4668a == 4) {
                    i12 += i14;
                }
                i14 = 1;
                v10 = v11;
            }
        }
        Object obj = bVar.f4670c;
        a(bVar);
        if (i14 <= 0) {
            return;
        }
        b b11 = b(bVar.f4668a, v10, i14, obj);
        l(b11, i12);
        a(b11);
    }

    private void r(b bVar) {
        this.f4662c.add(bVar);
        int i10 = bVar.f4668a;
        if (i10 == 1) {
            this.f4663d.e(bVar.f4669b, bVar.f4671d);
        } else if (i10 == 2) {
            this.f4663d.d(bVar.f4669b, bVar.f4671d);
        } else if (i10 == 4) {
            this.f4663d.h(bVar.f4669b, bVar.f4671d, bVar.f4670c);
        } else if (i10 == 8) {
            this.f4663d.a(bVar.f4669b, bVar.f4671d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int v(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        for (int size = this.f4662c.size() - 1; size >= 0; size--) {
            b bVar = this.f4662c.get(size);
            int i18 = bVar.f4668a;
            if (i18 == 8) {
                int i19 = bVar.f4669b;
                int i20 = bVar.f4671d;
                if (i19 < i20) {
                    i14 = i19;
                    i13 = i20;
                } else {
                    i13 = i19;
                    i14 = i20;
                }
                if (i10 < i14 || i10 > i13) {
                    if (i10 < i19) {
                        if (i11 == 1) {
                            bVar.f4669b = i19 + 1;
                            i15 = i20 + 1;
                        } else if (i11 == 2) {
                            bVar.f4669b = i19 - 1;
                            i15 = i20 - 1;
                        }
                        bVar.f4671d = i15;
                    }
                } else if (i14 == i19) {
                    if (i11 == 1) {
                        i17 = i20 + 1;
                    } else {
                        if (i11 == 2) {
                            i17 = i20 - 1;
                        }
                        i10++;
                    }
                    bVar.f4671d = i17;
                    i10++;
                } else {
                    if (i11 == 1) {
                        i16 = i19 + 1;
                    } else {
                        if (i11 == 2) {
                            i16 = i19 - 1;
                        }
                        i10--;
                    }
                    bVar.f4669b = i16;
                    i10--;
                }
            } else {
                int i21 = bVar.f4669b;
                if (i21 > i10) {
                    if (i11 == 1) {
                        i12 = i21 + 1;
                    } else if (i11 == 2) {
                        i12 = i21 - 1;
                    }
                    bVar.f4669b = i12;
                } else if (i18 == 1) {
                    i10 -= bVar.f4671d;
                } else if (i18 == 2) {
                    i10 += bVar.f4671d;
                }
            }
        }
        for (int size2 = this.f4662c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f4662c.get(size2);
            if (bVar2.f4668a == 8) {
                int i22 = bVar2.f4671d;
                if (i22 != bVar2.f4669b && i22 >= 0) {
                }
                this.f4662c.remove(size2);
                a(bVar2);
            } else {
                if (bVar2.f4671d > 0) {
                }
                this.f4662c.remove(size2);
                a(bVar2);
            }
        }
        return i10;
    }

    @Override // androidx.recyclerview.widget.h.a
    public void a(b bVar) {
        if (!this.f4665f) {
            bVar.f4670c = null;
            this.f4660a.a(bVar);
        }
    }

    @Override // androidx.recyclerview.widget.h.a
    public b b(int i10, int i11, int i12, Object obj) {
        b b10 = this.f4660a.b();
        if (b10 == null) {
            return new b(i10, i11, i12, obj);
        }
        b10.f4668a = i10;
        b10.f4669b = i11;
        b10.f4671d = i12;
        b10.f4670c = obj;
        return b10;
    }

    public int e(int i10) {
        int size = this.f4661b.size();
        for (int i11 = 0; i11 < size; i11++) {
            b bVar = this.f4661b.get(i11);
            int i12 = bVar.f4668a;
            if (i12 != 1) {
                if (i12 == 2) {
                    int i13 = bVar.f4669b;
                    if (i13 <= i10) {
                        int i14 = bVar.f4671d;
                        if (i13 + i14 > i10) {
                            return -1;
                        }
                        i10 -= i14;
                    } else {
                        continue;
                    }
                } else if (i12 == 8) {
                    int i15 = bVar.f4669b;
                    if (i15 == i10) {
                        i10 = bVar.f4671d;
                    } else {
                        if (i15 < i10) {
                            i10--;
                        }
                        if (bVar.f4671d <= i10) {
                            i10++;
                        }
                    }
                }
            } else if (bVar.f4669b <= i10) {
                i10 += bVar.f4671d;
            }
        }
        return i10;
    }

    public void i() {
        int size = this.f4662c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f4663d.b(this.f4662c.get(i10));
        }
        t(this.f4662c);
        this.f4667h = 0;
    }

    public void j() {
        i();
        int size = this.f4661b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f4661b.get(i10);
            int i11 = bVar.f4668a;
            if (i11 == 1) {
                this.f4663d.b(bVar);
                this.f4663d.e(bVar.f4669b, bVar.f4671d);
            } else if (i11 == 2) {
                this.f4663d.b(bVar);
                this.f4663d.f(bVar.f4669b, bVar.f4671d);
            } else if (i11 == 4) {
                this.f4663d.b(bVar);
                this.f4663d.h(bVar.f4669b, bVar.f4671d, bVar.f4670c);
            } else if (i11 == 8) {
                this.f4663d.b(bVar);
                this.f4663d.a(bVar.f4669b, bVar.f4671d);
            }
            Runnable runnable = this.f4664e;
            if (runnable != null) {
                runnable.run();
            }
        }
        t(this.f4661b);
        this.f4667h = 0;
    }

    void l(b bVar, int i10) {
        this.f4663d.g(bVar);
        int i11 = bVar.f4668a;
        if (i11 == 2) {
            this.f4663d.f(i10, bVar.f4671d);
        } else if (i11 != 4) {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        } else {
            this.f4663d.h(i10, bVar.f4671d, bVar.f4670c);
        }
    }

    public int m(int i10) {
        return n(i10, 0);
    }

    int n(int i10, int i11) {
        int size = this.f4662c.size();
        while (i11 < size) {
            b bVar = this.f4662c.get(i11);
            int i12 = bVar.f4668a;
            if (i12 == 8) {
                int i13 = bVar.f4669b;
                if (i13 == i10) {
                    i10 = bVar.f4671d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (bVar.f4671d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = bVar.f4669b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = bVar.f4671d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += bVar.f4671d;
                }
            }
            i11++;
        }
        return i10;
    }

    public boolean o(int i10) {
        return (i10 & this.f4667h) != 0;
    }

    public boolean p() {
        return this.f4661b.size() > 0;
    }

    public boolean q() {
        return !this.f4662c.isEmpty() && !this.f4661b.isEmpty();
    }

    public void s() {
        this.f4666g.b(this.f4661b);
        int size = this.f4661b.size();
        for (int i10 = 0; i10 < size; i10++) {
            b bVar = this.f4661b.get(i10);
            int i11 = bVar.f4668a;
            if (i11 == 1) {
                c(bVar);
            } else if (i11 == 2) {
                f(bVar);
            } else if (i11 == 4) {
                g(bVar);
            } else if (i11 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f4664e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f4661b.clear();
    }

    void t(List<b> list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a(list.get(i10));
        }
        list.clear();
    }

    public void u() {
        t(this.f4661b);
        t(this.f4662c);
        this.f4667h = 0;
    }
}
