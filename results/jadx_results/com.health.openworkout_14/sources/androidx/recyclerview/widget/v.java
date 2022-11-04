package androidx.recyclerview.widget;

import android.view.View;
/* loaded from: classes.dex */
class v {

    /* renamed from: a */
    final b f1816a;

    /* renamed from: b */
    a f1817b = new a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a */
        int f1818a = 0;

        /* renamed from: b */
        int f1819b;

        /* renamed from: c */
        int f1820c;

        /* renamed from: d */
        int f1821d;

        /* renamed from: e */
        int f1822e;

        a() {
        }

        void a(int i) {
            this.f1818a = i | this.f1818a;
        }

        boolean b() {
            int i = this.f1818a;
            if ((i & 7) == 0 || (i & (c(this.f1821d, this.f1819b) << 0)) != 0) {
                int i2 = this.f1818a;
                if ((i2 & 112) != 0 && (i2 & (c(this.f1821d, this.f1820c) << 4)) == 0) {
                    return false;
                }
                int i3 = this.f1818a;
                if ((i3 & 1792) != 0 && (i3 & (c(this.f1822e, this.f1819b) << 8)) == 0) {
                    return false;
                }
                int i4 = this.f1818a;
                return (i4 & 28672) == 0 || (i4 & (c(this.f1822e, this.f1820c) << 12)) != 0;
            }
            return false;
        }

        int c(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        void d() {
            this.f1818a = 0;
        }

        void e(int i, int i2, int i3, int i4) {
            this.f1819b = i;
            this.f1820c = i2;
            this.f1821d = i3;
            this.f1822e = i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface b {
        View a(int i);

        int b();

        int c();

        int d(View view);

        int e(View view);
    }

    public v(b bVar) {
        this.f1816a = bVar;
    }

    public View a(int i, int i2, int i3, int i4) {
        int c2 = this.f1816a.c();
        int b2 = this.f1816a.b();
        int i5 = i2 > i ? 1 : -1;
        View view = null;
        while (i != i2) {
            View a2 = this.f1816a.a(i);
            this.f1817b.e(c2, b2, this.f1816a.e(a2), this.f1816a.d(a2));
            if (i3 != 0) {
                this.f1817b.d();
                this.f1817b.a(i3);
                if (this.f1817b.b()) {
                    return a2;
                }
            }
            if (i4 != 0) {
                this.f1817b.d();
                this.f1817b.a(i4);
                if (this.f1817b.b()) {
                    view = a2;
                }
            }
            i += i5;
        }
        return view;
    }

    public boolean b(View view, int i) {
        this.f1817b.e(this.f1816a.c(), this.f1816a.b(), this.f1816a.e(view), this.f1816a.d(view));
        if (i != 0) {
            this.f1817b.d();
            this.f1817b.a(i);
            return this.f1817b.b();
        }
        return false;
    }
}
