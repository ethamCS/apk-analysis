package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class a implements p.a {

    /* renamed from: a */
    private b.g.k.e<b> f1650a;

    /* renamed from: b */
    final ArrayList<b> f1651b;

    /* renamed from: c */
    final ArrayList<b> f1652c;

    /* renamed from: d */
    final AbstractC0027a f1653d;

    /* renamed from: e */
    Runnable f1654e;

    /* renamed from: f */
    final boolean f1655f;

    /* renamed from: g */
    final p f1656g;

    /* renamed from: h */
    private int f1657h;

    /* renamed from: androidx.recyclerview.widget.a$a */
    /* loaded from: classes.dex */
    public interface AbstractC0027a {
        void a(int i, int i2);

        void b(b bVar);

        RecyclerView.d0 c(int i);

        void d(int i, int i2);

        void e(int i, int i2);

        void f(b bVar);

        void g(int i, int i2);

        void h(int i, int i2, Object obj);
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        int f1658a;

        /* renamed from: b */
        int f1659b;

        /* renamed from: c */
        Object f1660c;

        /* renamed from: d */
        int f1661d;

        b(int i, int i2, int i3, Object obj) {
            this.f1658a = i;
            this.f1659b = i2;
            this.f1661d = i3;
            this.f1660c = obj;
        }

        String a() {
            int i = this.f1658a;
            return i != 1 ? i != 2 ? i != 4 ? i != 8 ? "??" : "mv" : "up" : "rm" : "add";
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || b.class != obj.getClass()) {
                return false;
            }
            b bVar = (b) obj;
            int i = this.f1658a;
            if (i != bVar.f1658a) {
                return false;
            }
            if (i == 8 && Math.abs(this.f1661d - this.f1659b) == 1 && this.f1661d == bVar.f1659b && this.f1659b == bVar.f1661d) {
                return true;
            }
            if (this.f1661d != bVar.f1661d || this.f1659b != bVar.f1659b) {
                return false;
            }
            Object obj2 = this.f1660c;
            Object obj3 = bVar.f1660c;
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
            return (((this.f1658a * 31) + this.f1659b) * 31) + this.f1661d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f1659b + "c:" + this.f1661d + ",p:" + this.f1660c + "]";
        }
    }

    public a(AbstractC0027a abstractC0027a) {
        this(abstractC0027a, false);
    }

    a(AbstractC0027a abstractC0027a, boolean z) {
        this.f1650a = new b.g.k.f(30);
        this.f1651b = new ArrayList<>();
        this.f1652c = new ArrayList<>();
        this.f1657h = 0;
        this.f1653d = abstractC0027a;
        this.f1655f = z;
        this.f1656g = new p(this);
    }

    private void c(b bVar) {
        v(bVar);
    }

    private void d(b bVar) {
        v(bVar);
    }

    private void f(b bVar) {
        char c2;
        boolean z;
        int i = bVar.f1659b;
        int i2 = bVar.f1661d + i;
        char c3 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.f1653d.c(i3) != null || h(i3)) {
                if (c3 == 0) {
                    k(b(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c2 = 1;
            } else {
                if (c3 == 1) {
                    v(b(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c2 = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c3 = c2;
        }
        if (i4 != bVar.f1661d) {
            a(bVar);
            bVar = b(2, i, i4, null);
        }
        if (c3 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private void g(b bVar) {
        int i = bVar.f1659b;
        int i2 = bVar.f1661d + i;
        int i3 = i;
        char c2 = 65535;
        int i4 = 0;
        while (i < i2) {
            if (this.f1653d.c(i) != null || h(i)) {
                if (c2 == 0) {
                    k(b(4, i3, i4, bVar.f1660c));
                    i3 = i;
                    i4 = 0;
                }
                c2 = 1;
            } else {
                if (c2 == 1) {
                    v(b(4, i3, i4, bVar.f1660c));
                    i3 = i;
                    i4 = 0;
                }
                c2 = 0;
            }
            i4++;
            i++;
        }
        if (i4 != bVar.f1661d) {
            Object obj = bVar.f1660c;
            a(bVar);
            bVar = b(4, i3, i4, obj);
        }
        if (c2 == 0) {
            k(bVar);
        } else {
            v(bVar);
        }
    }

    private boolean h(int i) {
        int size = this.f1652c.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f1652c.get(i2);
            int i3 = bVar.f1658a;
            if (i3 == 8) {
                if (n(bVar.f1661d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f1659b;
                int i5 = bVar.f1661d + i4;
                while (i4 < i5) {
                    if (n(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    private void k(b bVar) {
        int i;
        int i2 = bVar.f1658a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int z = z(bVar.f1659b, i2);
        int i3 = bVar.f1659b;
        int i4 = bVar.f1658a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 != 4) {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        } else {
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.f1661d; i6++) {
            int z2 = z(bVar.f1659b + (i * i6), bVar.f1658a);
            int i7 = bVar.f1658a;
            if (i7 == 2 ? z2 == z : i7 == 4 && z2 == z + 1) {
                i5++;
            } else {
                b b2 = b(i7, z, i5, bVar.f1660c);
                l(b2, i3);
                a(b2);
                if (bVar.f1658a == 4) {
                    i3 += i5;
                }
                z = z2;
                i5 = 1;
            }
        }
        Object obj = bVar.f1660c;
        a(bVar);
        if (i5 <= 0) {
            return;
        }
        b b3 = b(bVar.f1658a, z, i5, obj);
        l(b3, i3);
        a(b3);
    }

    private void v(b bVar) {
        this.f1652c.add(bVar);
        int i = bVar.f1658a;
        if (i == 1) {
            this.f1653d.g(bVar.f1659b, bVar.f1661d);
        } else if (i == 2) {
            this.f1653d.e(bVar.f1659b, bVar.f1661d);
        } else if (i == 4) {
            this.f1653d.h(bVar.f1659b, bVar.f1661d, bVar.f1660c);
        } else if (i == 8) {
            this.f1653d.a(bVar.f1659b, bVar.f1661d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    private int z(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        for (int size = this.f1652c.size() - 1; size >= 0; size--) {
            b bVar = this.f1652c.get(size);
            int i9 = bVar.f1658a;
            if (i9 == 8) {
                int i10 = bVar.f1659b;
                int i11 = bVar.f1661d;
                if (i10 < i11) {
                    i5 = i10;
                    i4 = i11;
                } else {
                    i4 = i10;
                    i5 = i11;
                }
                if (i < i5 || i > i4) {
                    if (i < i10) {
                        if (i2 == 1) {
                            bVar.f1659b = i10 + 1;
                            i6 = i11 + 1;
                        } else if (i2 == 2) {
                            bVar.f1659b = i10 - 1;
                            i6 = i11 - 1;
                        }
                        bVar.f1661d = i6;
                    }
                } else if (i5 == i10) {
                    if (i2 == 1) {
                        i8 = i11 + 1;
                    } else {
                        if (i2 == 2) {
                            i8 = i11 - 1;
                        }
                        i++;
                    }
                    bVar.f1661d = i8;
                    i++;
                } else {
                    if (i2 == 1) {
                        i7 = i10 + 1;
                    } else {
                        if (i2 == 2) {
                            i7 = i10 - 1;
                        }
                        i--;
                    }
                    bVar.f1659b = i7;
                    i--;
                }
            } else {
                int i12 = bVar.f1659b;
                if (i12 > i) {
                    if (i2 == 1) {
                        i3 = i12 + 1;
                    } else if (i2 == 2) {
                        i3 = i12 - 1;
                    }
                    bVar.f1659b = i3;
                } else if (i9 == 1) {
                    i -= bVar.f1661d;
                } else if (i9 == 2) {
                    i += bVar.f1661d;
                }
            }
        }
        for (int size2 = this.f1652c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f1652c.get(size2);
            if (bVar2.f1658a == 8) {
                int i13 = bVar2.f1661d;
                if (i13 != bVar2.f1659b && i13 >= 0) {
                }
                this.f1652c.remove(size2);
                a(bVar2);
            } else {
                if (bVar2.f1661d > 0) {
                }
                this.f1652c.remove(size2);
                a(bVar2);
            }
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.p.a
    public void a(b bVar) {
        if (!this.f1655f) {
            bVar.f1660c = null;
            this.f1650a.a(bVar);
        }
    }

    @Override // androidx.recyclerview.widget.p.a
    public b b(int i, int i2, int i3, Object obj) {
        b b2 = this.f1650a.b();
        if (b2 == null) {
            return new b(i, i2, i3, obj);
        }
        b2.f1658a = i;
        b2.f1659b = i2;
        b2.f1661d = i3;
        b2.f1660c = obj;
        return b2;
    }

    public int e(int i) {
        int size = this.f1651b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f1651b.get(i2);
            int i3 = bVar.f1658a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f1659b;
                    if (i4 <= i) {
                        int i5 = bVar.f1661d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f1659b;
                    if (i6 == i) {
                        i = bVar.f1661d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.f1661d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f1659b <= i) {
                i += bVar.f1661d;
            }
        }
        return i;
    }

    public void i() {
        int size = this.f1652c.size();
        for (int i = 0; i < size; i++) {
            this.f1653d.b(this.f1652c.get(i));
        }
        x(this.f1652c);
        this.f1657h = 0;
    }

    public void j() {
        i();
        int size = this.f1651b.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.f1651b.get(i);
            int i2 = bVar.f1658a;
            if (i2 == 1) {
                this.f1653d.b(bVar);
                this.f1653d.g(bVar.f1659b, bVar.f1661d);
            } else if (i2 == 2) {
                this.f1653d.b(bVar);
                this.f1653d.d(bVar.f1659b, bVar.f1661d);
            } else if (i2 == 4) {
                this.f1653d.b(bVar);
                this.f1653d.h(bVar.f1659b, bVar.f1661d, bVar.f1660c);
            } else if (i2 == 8) {
                this.f1653d.b(bVar);
                this.f1653d.a(bVar.f1659b, bVar.f1661d);
            }
            Runnable runnable = this.f1654e;
            if (runnable != null) {
                runnable.run();
            }
        }
        x(this.f1651b);
        this.f1657h = 0;
    }

    void l(b bVar, int i) {
        this.f1653d.f(bVar);
        int i2 = bVar.f1658a;
        if (i2 == 2) {
            this.f1653d.d(i, bVar.f1661d);
        } else if (i2 != 4) {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        } else {
            this.f1653d.h(i, bVar.f1661d, bVar.f1660c);
        }
    }

    public int m(int i) {
        return n(i, 0);
    }

    int n(int i, int i2) {
        int size = this.f1652c.size();
        while (i2 < size) {
            b bVar = this.f1652c.get(i2);
            int i3 = bVar.f1658a;
            if (i3 == 8) {
                int i4 = bVar.f1659b;
                if (i4 == i) {
                    i = bVar.f1661d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.f1661d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f1659b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.f1661d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.f1661d;
                }
            }
            i2++;
        }
        return i;
    }

    public boolean o(int i) {
        return (i & this.f1657h) != 0;
    }

    public boolean p() {
        return this.f1651b.size() > 0;
    }

    public boolean q() {
        return !this.f1652c.isEmpty() && !this.f1651b.isEmpty();
    }

    public boolean r(int i, int i2, Object obj) {
        if (i2 < 1) {
            return false;
        }
        this.f1651b.add(b(4, i, i2, obj));
        this.f1657h |= 4;
        return this.f1651b.size() == 1;
    }

    public boolean s(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f1651b.add(b(1, i, i2, null));
        this.f1657h |= 1;
        return this.f1651b.size() == 1;
    }

    public boolean t(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 != 1) {
            throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
        }
        this.f1651b.add(b(8, i, i2, null));
        this.f1657h |= 8;
        return this.f1651b.size() == 1;
    }

    public boolean u(int i, int i2) {
        if (i2 < 1) {
            return false;
        }
        this.f1651b.add(b(2, i, i2, null));
        this.f1657h |= 2;
        return this.f1651b.size() == 1;
    }

    public void w() {
        this.f1656g.b(this.f1651b);
        int size = this.f1651b.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.f1651b.get(i);
            int i2 = bVar.f1658a;
            if (i2 == 1) {
                c(bVar);
            } else if (i2 == 2) {
                f(bVar);
            } else if (i2 == 4) {
                g(bVar);
            } else if (i2 == 8) {
                d(bVar);
            }
            Runnable runnable = this.f1654e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f1651b.clear();
    }

    void x(List<b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a(list.get(i));
        }
        list.clear();
    }

    public void y() {
        x(this.f1651b);
        x(this.f1652c);
        this.f1657h = 0;
    }
}
