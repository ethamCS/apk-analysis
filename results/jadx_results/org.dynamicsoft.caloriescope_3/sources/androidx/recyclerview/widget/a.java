package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class a implements i.a {

    /* renamed from: a */
    private a.g.k.e<b> f1074a;

    /* renamed from: b */
    final ArrayList<b> f1075b;

    /* renamed from: c */
    final ArrayList<b> f1076c;
    final AbstractC0043a d;
    Runnable e;
    final boolean f;
    final i g;
    private int h;

    /* renamed from: androidx.recyclerview.widget.a$a */
    /* loaded from: classes.dex */
    public interface AbstractC0043a {
        RecyclerView.d0 a(int i);

        void a(int i, int i2);

        void a(int i, int i2, Object obj);

        void a(b bVar);

        void b(int i, int i2);

        void b(b bVar);

        void c(int i, int i2);

        void d(int i, int i2);
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: a */
        int f1077a;

        /* renamed from: b */
        int f1078b;

        /* renamed from: c */
        Object f1079c;
        int d;

        b(int i, int i2, int i3, Object obj) {
            this.f1077a = i;
            this.f1078b = i2;
            this.d = i3;
            this.f1079c = obj;
        }

        String a() {
            int i = this.f1077a;
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
            int i = this.f1077a;
            if (i != bVar.f1077a) {
                return false;
            }
            if (i == 8 && Math.abs(this.d - this.f1078b) == 1 && this.d == bVar.f1078b && this.f1078b == bVar.d) {
                return true;
            }
            if (this.d != bVar.d || this.f1078b != bVar.f1078b) {
                return false;
            }
            Object obj2 = this.f1079c;
            Object obj3 = bVar.f1079c;
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
            return (((this.f1077a * 31) + this.f1078b) * 31) + this.d;
        }

        public String toString() {
            return Integer.toHexString(System.identityHashCode(this)) + "[" + a() + ",s:" + this.f1078b + "c:" + this.d + ",p:" + this.f1079c + "]";
        }
    }

    public a(AbstractC0043a abstractC0043a) {
        this(abstractC0043a, false);
    }

    a(AbstractC0043a abstractC0043a, boolean z) {
        this.f1074a = new a.g.k.f(30);
        this.f1075b = new ArrayList<>();
        this.f1076c = new ArrayList<>();
        this.h = 0;
        this.d = abstractC0043a;
        this.f = z;
        this.g = new i(this);
    }

    private int b(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        for (int size = this.f1076c.size() - 1; size >= 0; size--) {
            b bVar = this.f1076c.get(size);
            int i7 = bVar.f1077a;
            if (i7 == 8) {
                int i8 = bVar.f1078b;
                int i9 = bVar.d;
                if (i8 >= i9) {
                    i9 = i8;
                    i8 = i9;
                }
                if (i < i8 || i > i9) {
                    int i10 = bVar.f1078b;
                    if (i < i10) {
                        if (i2 == 1) {
                            bVar.f1078b = i10 + 1;
                            i4 = bVar.d + 1;
                        } else if (i2 == 2) {
                            bVar.f1078b = i10 - 1;
                            i4 = bVar.d - 1;
                        }
                        bVar.d = i4;
                    }
                } else {
                    int i11 = bVar.f1078b;
                    if (i8 == i11) {
                        if (i2 == 1) {
                            i6 = bVar.d + 1;
                        } else {
                            if (i2 == 2) {
                                i6 = bVar.d - 1;
                            }
                            i++;
                        }
                        bVar.d = i6;
                        i++;
                    } else {
                        if (i2 == 1) {
                            i5 = i11 + 1;
                        } else {
                            if (i2 == 2) {
                                i5 = i11 - 1;
                            }
                            i--;
                        }
                        bVar.f1078b = i5;
                        i--;
                    }
                }
            } else {
                int i12 = bVar.f1078b;
                if (i12 > i) {
                    if (i2 == 1) {
                        i3 = i12 + 1;
                    } else if (i2 == 2) {
                        i3 = i12 - 1;
                    }
                    bVar.f1078b = i3;
                } else if (i7 == 1) {
                    i -= bVar.d;
                } else if (i7 == 2) {
                    i += bVar.d;
                }
            }
        }
        for (int size2 = this.f1076c.size() - 1; size2 >= 0; size2--) {
            b bVar2 = this.f1076c.get(size2);
            if (bVar2.f1077a == 8) {
                int i13 = bVar2.d;
                if (i13 != bVar2.f1078b && i13 >= 0) {
                }
                this.f1076c.remove(size2);
                a(bVar2);
            } else {
                if (bVar2.d > 0) {
                }
                this.f1076c.remove(size2);
                a(bVar2);
            }
        }
        return i;
    }

    private void b(b bVar) {
        g(bVar);
    }

    private void c(b bVar) {
        g(bVar);
    }

    private void d(b bVar) {
        char c2;
        boolean z;
        int i = bVar.f1078b;
        int i2 = bVar.d + i;
        char c3 = 65535;
        int i3 = i;
        int i4 = 0;
        while (i3 < i2) {
            if (this.d.a(i3) != null || d(i3)) {
                if (c3 == 0) {
                    f(a(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c2 = 1;
            } else {
                if (c3 == 1) {
                    g(a(2, i, i4, null));
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
        if (i4 != bVar.d) {
            a(bVar);
            bVar = a(2, i, i4, null);
        }
        if (c3 == 0) {
            f(bVar);
        } else {
            g(bVar);
        }
    }

    private boolean d(int i) {
        int size = this.f1076c.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f1076c.get(i2);
            int i3 = bVar.f1077a;
            if (i3 == 8) {
                if (a(bVar.d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = bVar.f1078b;
                int i5 = bVar.d + i4;
                while (i4 < i5) {
                    if (a(i4, i2 + 1) == i) {
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

    private void e(b bVar) {
        int i = bVar.f1078b;
        int i2 = bVar.d + i;
        int i3 = i;
        char c2 = 65535;
        int i4 = 0;
        while (i < i2) {
            if (this.d.a(i) != null || d(i)) {
                if (c2 == 0) {
                    f(a(4, i3, i4, bVar.f1079c));
                    i3 = i;
                    i4 = 0;
                }
                c2 = 1;
            } else {
                if (c2 == 1) {
                    g(a(4, i3, i4, bVar.f1079c));
                    i3 = i;
                    i4 = 0;
                }
                c2 = 0;
            }
            i4++;
            i++;
        }
        if (i4 != bVar.d) {
            Object obj = bVar.f1079c;
            a(bVar);
            bVar = a(4, i3, i4, obj);
        }
        if (c2 == 0) {
            f(bVar);
        } else {
            g(bVar);
        }
    }

    private void f(b bVar) {
        int i;
        int i2 = bVar.f1077a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int b2 = b(bVar.f1078b, i2);
        int i3 = bVar.f1078b;
        int i4 = bVar.f1077a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 != 4) {
            throw new IllegalArgumentException("op should be remove or update." + bVar);
        } else {
            i = 1;
        }
        int i5 = 1;
        for (int i6 = 1; i6 < bVar.d; i6++) {
            int b3 = b(bVar.f1078b + (i * i6), bVar.f1077a);
            int i7 = bVar.f1077a;
            if (i7 == 2 ? b3 == b2 : i7 == 4 && b3 == b2 + 1) {
                i5++;
            } else {
                b a2 = a(bVar.f1077a, b2, i5, bVar.f1079c);
                a(a2, i3);
                a(a2);
                if (bVar.f1077a == 4) {
                    i3 += i5;
                }
                b2 = b3;
                i5 = 1;
            }
        }
        Object obj = bVar.f1079c;
        a(bVar);
        if (i5 <= 0) {
            return;
        }
        b a3 = a(bVar.f1077a, b2, i5, obj);
        a(a3, i3);
        a(a3);
    }

    private void g(b bVar) {
        this.f1076c.add(bVar);
        int i = bVar.f1077a;
        if (i == 1) {
            this.d.b(bVar.f1078b, bVar.d);
        } else if (i == 2) {
            this.d.d(bVar.f1078b, bVar.d);
        } else if (i == 4) {
            this.d.a(bVar.f1078b, bVar.d, bVar.f1079c);
        } else if (i == 8) {
            this.d.a(bVar.f1078b, bVar.d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + bVar);
        }
    }

    public int a(int i) {
        int size = this.f1075b.size();
        for (int i2 = 0; i2 < size; i2++) {
            b bVar = this.f1075b.get(i2);
            int i3 = bVar.f1077a;
            if (i3 != 1) {
                if (i3 == 2) {
                    int i4 = bVar.f1078b;
                    if (i4 <= i) {
                        int i5 = bVar.d;
                        if (i4 + i5 > i) {
                            return -1;
                        }
                        i -= i5;
                    } else {
                        continue;
                    }
                } else if (i3 == 8) {
                    int i6 = bVar.f1078b;
                    if (i6 == i) {
                        i = bVar.d;
                    } else {
                        if (i6 < i) {
                            i--;
                        }
                        if (bVar.d <= i) {
                            i++;
                        }
                    }
                }
            } else if (bVar.f1078b <= i) {
                i += bVar.d;
            }
        }
        return i;
    }

    int a(int i, int i2) {
        int size = this.f1076c.size();
        while (i2 < size) {
            b bVar = this.f1076c.get(i2);
            int i3 = bVar.f1077a;
            if (i3 == 8) {
                int i4 = bVar.f1078b;
                if (i4 == i) {
                    i = bVar.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (bVar.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = bVar.f1078b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = bVar.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += bVar.d;
                }
            }
            i2++;
        }
        return i;
    }

    @Override // androidx.recyclerview.widget.i.a
    public b a(int i, int i2, int i3, Object obj) {
        b a2 = this.f1074a.a();
        if (a2 == null) {
            return new b(i, i2, i3, obj);
        }
        a2.f1077a = i;
        a2.f1078b = i2;
        a2.d = i3;
        a2.f1079c = obj;
        return a2;
    }

    public void a() {
        int size = this.f1076c.size();
        for (int i = 0; i < size; i++) {
            this.d.a(this.f1076c.get(i));
        }
        a(this.f1076c);
        this.h = 0;
    }

    @Override // androidx.recyclerview.widget.i.a
    public void a(b bVar) {
        if (!this.f) {
            bVar.f1079c = null;
            this.f1074a.a(bVar);
        }
    }

    void a(b bVar, int i) {
        this.d.b(bVar);
        int i2 = bVar.f1077a;
        if (i2 == 2) {
            this.d.c(i, bVar.d);
        } else if (i2 != 4) {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        } else {
            this.d.a(i, bVar.d, bVar.f1079c);
        }
    }

    void a(List<b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a(list.get(i));
        }
        list.clear();
    }

    public int b(int i) {
        return a(i, 0);
    }

    public void b() {
        a();
        int size = this.f1075b.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.f1075b.get(i);
            int i2 = bVar.f1077a;
            if (i2 == 1) {
                this.d.a(bVar);
                this.d.b(bVar.f1078b, bVar.d);
            } else if (i2 == 2) {
                this.d.a(bVar);
                this.d.c(bVar.f1078b, bVar.d);
            } else if (i2 == 4) {
                this.d.a(bVar);
                this.d.a(bVar.f1078b, bVar.d, bVar.f1079c);
            } else if (i2 == 8) {
                this.d.a(bVar);
                this.d.a(bVar.f1078b, bVar.d);
            }
            Runnable runnable = this.e;
            if (runnable != null) {
                runnable.run();
            }
        }
        a(this.f1075b);
        this.h = 0;
    }

    public boolean c() {
        return this.f1075b.size() > 0;
    }

    public boolean c(int i) {
        return (i & this.h) != 0;
    }

    public boolean d() {
        return !this.f1076c.isEmpty() && !this.f1075b.isEmpty();
    }

    public void e() {
        this.g.a(this.f1075b);
        int size = this.f1075b.size();
        for (int i = 0; i < size; i++) {
            b bVar = this.f1075b.get(i);
            int i2 = bVar.f1077a;
            if (i2 == 1) {
                b(bVar);
            } else if (i2 == 2) {
                d(bVar);
            } else if (i2 == 4) {
                e(bVar);
            } else if (i2 == 8) {
                c(bVar);
            }
            Runnable runnable = this.e;
            if (runnable != null) {
                runnable.run();
            }
        }
        this.f1075b.clear();
    }

    public void f() {
        a(this.f1075b);
        a(this.f1076c);
        this.h = 0;
    }
}
